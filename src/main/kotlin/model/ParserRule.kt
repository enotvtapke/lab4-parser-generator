package model

data class ParserRule(
    val id: String,
    val alternatives: List<List<ParserRuleToken>>,
    val argumentsTypes: List<Argument> = listOf(),
    val returnValuesTypes: List<Argument> = listOf(),
)

data class Argument(val label: String, val type: String)

sealed class ParserRuleToken

data class TermToken(val id: String, val label: String? = null): ParserRuleToken()
data class CodeToken(val block: String): ParserRuleToken()
data class NonTermToken(val id: String, val args: List<String> = listOf(), val label: String? = null): ParserRuleToken()
