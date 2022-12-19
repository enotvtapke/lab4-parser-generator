package lexer

import model.LexerRule

class LexerGrammarVisitorImpl : LexerGrammarBaseVisitor<Unit>() {
    val lexerRules = mutableListOf<LexerRule>()

    override fun visitTerm(ctx: LexerGrammarParser.TermContext?) {
        lexerRules.add(
            LexerRule(
                ctx!!.LEXER_RULE_ID().text,
                Regex(ctx.PATTERN().text.trim('\'')),
                ctx.SK() != null
            )
        )
    }
}