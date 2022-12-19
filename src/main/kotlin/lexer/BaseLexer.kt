package lexer

import model.END
import model.LexerRule
import model.Terminal

open class BaseLexer constructor(private val input: CharSequence, private val rules: List<LexerRule>) {
    private var curPos = 0

    var curTerminal: Terminal = END
        private set

    fun nextToken(): Terminal {
        fun IntRange.length() = last - first + 1

        if (curPos >= input.length) return END
        rules.forEach { rule ->
            val match = rule.pattern.matchAt(input, curPos) ?: return@forEach
            curPos += match.range.length()
            return if (rule.ignored) {
                nextToken()
            } else {
                Terminal(rule.id, match.value).apply {
                    curTerminal = this
                }
            }
        }
        throw LexerException(
            "Unknown token starting from `${input.subSequence(curPos, minOf(curPos + 10, input.length))}...`", curPos
        )
    }

    fun expect(terminal: Terminal) {
        if (curTerminal != terminal) {
            throw LexerException("Invalid token. Expected `$terminal`, actual `$curTerminal`", curPos)
        }
    }
}
