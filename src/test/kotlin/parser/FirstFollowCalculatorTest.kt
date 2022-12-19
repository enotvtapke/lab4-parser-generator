package parser

import model.NonTermToken
import model.ParserRule
import model.TermToken
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FirstFollowCalculatorTest {

    @Test
    fun calculate() {
        val parserRules = listOf(
            ParserRule(
                "E", listOf(
                    listOf(NonTermToken("T"), NonTermToken("E_"))
                )
            ),
            ParserRule(
                "E_", listOf(
                    listOf(TermToken("PLUS"), NonTermToken("T"), NonTermToken("E_")),
                    listOf(TermToken("EPS"))
                )
            ),
            ParserRule(
                "T", listOf(
                    listOf(TermToken("NUMBER")),
                    listOf(TermToken("LBRACKET"), NonTermToken("E"), TermToken("RBRACKET"))
                )
            ),
        )

        val firstFollowCalculator = FirstFollowCalculator()
        val actual = firstFollowCalculator.calculate(parserRules)
        val expected = Pair(
            mapOf(
                "E" to listOf("NUMBER", "LBRACKET"),
                "T" to listOf("NUMBER", "LBRACKET"),
                "E_" to listOf("PLUS", "EPS"),
            ),
            mapOf(
                "E" to listOf("END", "RBRACKET"),
                "T" to listOf("PLUS", "END", "RBRACKET"),
                "E_" to listOf("END", "RBRACKET"),
            )
        )
        assertThat(actual.toString()).isEqualTo(expected.toString())
    }
}