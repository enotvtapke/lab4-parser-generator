import com.squareup.kotlinpoet.MemberName
import model.LexerRule
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LexerGeneratorTest {

//    @Test
//    fun `should generate`() {
//        val lexerGenerator = LexerGenerator(
//            listOf(
//                LexerRule("TRUE", "True".toRegex(), false),
//                LexerRule("INT", "[0-9]+".toRegex(), false)
//            )
//        )
//        val lexerRules = MemberName("Grammar", "LEXER_RULES")
//        val lexer = lexerGenerator.generate(lexerRules, "")
//        val expected = """
//            public class Lexer(
//              input: kotlin.CharSequence,
//            ) {
//              private val baseLexer: lexer.BaseLexer = lexer.BaseLexer(input, $lexerRules)
//
//              public fun nextToken(): model.Terminal? {
//                val token = baseLexer.nextToken() ?: return null
//                return when (token.id) {
//                  "TRUE" -> TRUE(token.text)
//                  "INT" -> INT(token.text)
//                  else -> throw lexer.LexerException(""${'"'}Unknown terminal identifier ${'$'}{token.id} of text ${'$'}{token.text}""${'"'}, baseLexer.pos)
//                }
//              }
//            }
//
//        """.trimIndent()
//        println(lexer.toString())
////        assertThat(lexer.toString()).isEqualTo(expected)
//    }
//
//    @Test
//    fun `should generate in case of no rules`() {
//        val lexerGenerator = LexerGenerator(listOf())
//        val lexerRules = MemberName("Grammar", "LEXER_RULES")
//        val lexer = lexerGenerator.generate(lexerRules, "")
//        val expected = """
//            public class Lexer(
//              input: kotlin.CharSequence,
//            ) {
//              private val baseLexer: lexer.BaseLexer = lexer.BaseLexer(input, $lexerRules)
//
//              public fun nextToken(): model.Terminal? {
//                val token = baseLexer.nextToken() ?: return null
//                return when (token.id) {
//                  else -> throw lexer.LexerException(""${'"'}Unknown terminal identifier ${'$'}{token.id} of text ${'$'}{token.text}""${'"'}, baseLexer.pos)
//                }
//              }
//            }
//
//        """.trimIndent()
//        assertThat(lexer.toString()).isEqualTo(expected)
//    }
}