package lexer

import model.LexerRule

class BaseLexer constructor(private val input: CharSequence, private val rules: List<LexerRule>) {
    var pos = 0
        private set

    fun nextToken(): RawTerminal? {
        if (pos >= input.length) return null
        rules.forEach { rule ->
            val match = rule.pattern.matchAt(input, pos) ?: return@forEach
            pos += match.range.length()
            return if (rule.ignored) {
                nextToken()
            } else {
                RawTerminal(rule.id, match.value)
            }
        }
        throw LexerException(
            "Unknown token starting from: `${input.subSequence(pos, minOf(pos + 10, input.length))}...`", pos
        )
    }

    private fun IntRange.length() = last - first + 1

}

class RawTerminal(val id: String, val text: String)
