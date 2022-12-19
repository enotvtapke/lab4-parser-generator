import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.MemberName
import generator.lexer.LexerGenerator
import generator.lexer.LexerGrammarGenerator
import generator.runtime.LexerRule
import generator.parser.*
import grammarParser.ParserGeneratorGrammarLexer
import grammarParser.ParserGeneratorGrammarParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.nio.file.Path

fun main() {
    val (lexerRules, parserRules) = rules(Path.of("src/main/resources/Expression.g4"))
    println(lexerRules)
    println(parserRules)

    generateLexer(lexerRules)
    generateParser(parserRules)
}

private fun rules(grammar: Path): Pair<List<LexerRule>, List<ParserRule>> {
    val input = CharStreams.fromPath(grammar)
    val lexer = ParserGeneratorGrammarLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = ParserGeneratorGrammarParser(tokens)
    val tree = parser.rules()
    val v = ParserGeneratorGrammarVisitorImpl()
    v.visit(tree)
    return Pair(v.lexerRules, v.parserRules)
}

private fun generateLexer(lexerRules: List<LexerRule>) {
    val lexerGrammar = LexerGrammarGenerator(lexerRules).generate()
    FileSpec.builder("gen", "LexerGrammar").addType(lexerGrammar)
        .build().writeTo(Path.of("src/main/kotlin"))
    val lexer = LexerGenerator().generate(MemberName("gen.LexerGrammar", "LEXER_RULES"))
    FileSpec.builder("gen", "Lexer").addType(lexer)
        .build().writeTo(Path.of("src/main/kotlin"))
}

fun generateParser(rules: List<ParserRule>) {
    val nonTerminalsGenerator = NonTerminalsGenerator(rules)
    val nonTerminals = nonTerminalsGenerator.generate()
    FileSpec.builder("gen", "NonTerminals")
        .apply { nonTerminals.forEach { addType(it) } }
        .build().writeTo(Path.of("src/main/kotlin"))

    val firstFollowCalculator = FirstFollowCalculator(rules)
    val parser = ParserGenerator(rules, firstFollowCalculator).generate(ClassName("gen", "Lexer"), "gen")
    FileSpec.builder("gen", "Parser")
        .addType(parser)
        .build().writeTo(Path.of("src/main/kotlin"))
}
