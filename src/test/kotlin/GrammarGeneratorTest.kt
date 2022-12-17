import model.LexerRule
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GrammarGeneratorTest {

    @Test
    fun `should generate`() {
        val lexerRules = listOf(
            LexerRule("TRUE", "True".toRegex(), false),
            LexerRule("INT", "[0-9]+".toRegex(), false)
        )
        val generator = GrammarGenerator(lexerRules)
        val grammar = generator.generate()
        val actual = grammar.toString()
        println(actual)
        val expected ="""
            public object Grammar {
              public val LEXER_RULES: kotlin.collections.List<model.LexerRule> = listOf(
                LexerRule("TRUE", "True".toRegex(), false), 
                LexerRule("INT", "[0-9]+".toRegex(), false), 
              )
            }
            
        """.trimIndent()
        assertThat(actual).isEqualTo(expected)
    }
}