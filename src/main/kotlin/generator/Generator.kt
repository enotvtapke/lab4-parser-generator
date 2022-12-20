package generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.asClassName
import generator.lexer.LexerGenerator
import generator.lexer.LexerGrammarGenerator
import generator.parser.*
import generator.runtime.LexerRule
import grammarParser.ParserGeneratorGrammarLexer
import grammarParser.ParserGeneratorGrammarParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.nio.file.Path
import kotlin.reflect.KClass

class Generator(
    private val grammarFile: Path,
    private val outputDir: Path,
    private val basePackage: String,
    private val imports: List<KClass<*>> = listOf(),
    private val contextClass: KClass<*>? = null,
    private val contextName: String? = null,
) {
    fun generate() {
        val (lexerRules, parserRules) = rules(grammarFile)
        generateLexer(lexerRules)
        generateParser(parserRules)
    }

    private fun rules(grammar: Path): Pair<List<LexerRule>, List<ParserRule>> {
        val input = CharStreams.fromPath(grammar)
        val lexer = ParserGeneratorGrammarLexer(input)
        val tokens = CommonTokenStream(lexer)
        val parser = ParserGeneratorGrammarParser(tokens)
        val tree = parser.rules()
        val visitor = ParserGeneratorGrammarVisitorImpl()
        visitor.visit(tree)
        return Pair(visitor.lexerRules, visitor.parserRules)
    }

    private fun generateLexer(lexerRules: List<LexerRule>) {
        val lexerGrammar = LexerGrammarGenerator(lexerRules).generate()
        FileSpec.builder(basePackage, "LexerGrammar").addType(lexerGrammar)
            .build().writeTo(outputDir)

        val lexer = LexerGenerator().generate(
            MemberName("$basePackage.LexerGrammar", "LEXER_RULES")
        )
        FileSpec.builder(basePackage, "Lexer").addType(lexer)
            .build().writeTo(outputDir)
    }

    private fun generateParser(rules: List<ParserRule>) {
        val nonTerminalsGenerator = NonTerminalsGenerator(rules)
        val nonTerminals = nonTerminalsGenerator.generate()
        FileSpec.builder(basePackage, "NonTerminals")
            .apply { nonTerminals.forEach { addType(it) } }
            .addImports()
            .build().writeTo(outputDir)
        trimImports("NonTerminals")

        val firstFollowCalculator = FirstFollowCalculator(rules)
        val parser = ParserGenerator(
            rules, firstFollowCalculator, "lexer", contextClass, contextName
        ).generate(
            ClassName(basePackage, "Lexer"),
            basePackage
        )
        FileSpec.builder(basePackage, "Parser")
            .addType(parser)
            .addImports()
            .build().writeTo(outputDir)
        trimImports("Parser")
    }

    private fun FileSpec.Builder.addImports() = apply {
        this@Generator.imports.forEach {
            addImport(
                it.asClassName().packageName,
                it.asClassName().simpleName
            )
        }
    }

    private fun trimImports(fileName: String) {
        val file = outputDir.resolve(basePackage.replace('.', '/')).resolve("$fileName.kt").toFile()
        file.writeText(
            file.readLines().filterNot { it.startsWith("import ") && !it.contains('.') }.joinToString("\n")
        )
    }
}