package parser

import model.*

fun main() {
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
    println(firstFollowCalculator.calculate(parserRules))
}

class FirstFollowCalculator {
    private val first = mutableMapOf<String, MutableSet<String>>()
    private val follow = mutableMapOf<String, MutableSet<String>>()

    fun calculate(parserRules: List<ParserRule>, startNonTermId: String = parserRules.first().id):
            Pair<MutableMap<String, MutableSet<String>>, MutableMap<String, MutableSet<String>>> {
        first(parserRules)
        follow(parserRules, startNonTermId)
        return Pair(first, follow)
    }

    private fun first(parserRules: List<ParserRule>) {
        do {
            var change = false
            for (rule in parserRules) {
                val ruleFirst = first.computeIfAbsent(rule.id) { mutableSetOf() }
                val size = ruleFirst.size
                for (alternative in rule.alternatives) {
                    ruleFirst.addAll(first(alternative))
                }
                change = change || size != ruleFirst.size
            }
        } while (change)
    }

    private fun first(tokens: List<ParserRuleToken>): Set<String> {
        return when (val token = tokens.firstOrNull() ?: TermToken(EPS.id)) {
            is CodeToken -> first(tokens.drop(1))
            is TermToken -> setOf(token.id)
            is NonTermToken -> {
                val first = first.computeIfAbsent(token.id) { mutableSetOf() }
                return if (EPS.id in first) {
                    first + first(tokens.drop(1))
                } else {
                    first
                }
            }
        }
    }

    private fun follow(parserRules: List<ParserRule>, start: String) {
        follow.computeIfAbsent(start) { mutableSetOf() }.add("END")
        do {
            var change = false
            for (rule in parserRules) {
                for (alternative in rule.alternatives) {
                    for (i in alternative.indices) {
                        if (alternative[i] is CodeToken || alternative[i] is TermToken) continue
                        val nonTermFollow =
                            follow.computeIfAbsent((alternative[i] as NonTermToken).id) { mutableSetOf() }
                        val size = nonTermFollow.size
                        val firstNext = if (i == alternative.size - 1) {
                            listOf("EPS")
                        } else {
                            first(alternative.subList(i + 1, alternative.size))
                        }.toMutableSet()

                        if ("EPS" in firstNext) {
                            firstNext -= "EPS"
                            firstNext.addAll(follow.computeIfAbsent(rule.id) { mutableSetOf() })
                        }
                        nonTermFollow.addAll(firstNext)
                        change = change || nonTermFollow.size != size
                    }
                }
            }
        } while (change)
    }
}