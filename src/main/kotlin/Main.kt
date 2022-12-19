import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.MemberName
import lexer.LexerGrammarLexer
import lexer.LexerGrammarParser
import lexer.LexerGrammarVisitorImpl
import model.LexerRule
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.nio.file.Path

fun main() {
    val input = CharStreams.fromPath(Path.of("src/main/resources/TestLexer.g4"))
    val lexer = LexerGrammarLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = LexerGrammarParser(tokens)
    val tree = parser.gram()
    val v = LexerGrammarVisitorImpl()
    v.visit(tree)
    val rules = v.lexerRules
    println(rules)

    generateLexer(rules)
}

private fun generateLexer(lexerRules: List<LexerRule>) {
    val grammar = GrammarGenerator(lexerRules).generate()
    FileSpec.builder("gen", "Grammar").addType(grammar)
        .build().writeTo(Path.of("src/main/kotlin"))
//    val terminals = TerminalsGenerator(lexerRules.map { it.id }).generate()
//    FileSpec.builder("gen", "Terminals").apply { terminals.forEach { addType(it) } }
//        .build().writeTo(Path.of("src/main/kotlin"))
    val lexer = LexerGenerator().generate(MemberName("gen.Grammar", "LEXER_RULES"))
    FileSpec.builder("gen", "Lexer").addType(lexer)
        .build().writeTo(Path.of("src/main/kotlin"))
}