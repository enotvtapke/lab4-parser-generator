package generator.parser

import generator.runtime.LexerRule
import grammarParser.ParserGeneratorGrammarBaseVisitor
import grammarParser.ParserGeneratorGrammarParser

class ParserGeneratorGrammarVisitorImpl : ParserGeneratorGrammarBaseVisitor<Unit>() {
    val lexerRules = mutableListOf<LexerRule>()
    val parserRules = mutableListOf<ParserRule>()

    override fun visitMyLexerRule(ctx: ParserGeneratorGrammarParser.MyLexerRuleContext?) {
        lexerRules.add(
            LexerRule(
                ctx!!.TYPE_ID().text,
                Regex(ctx.STRING().text.trim('\'').replace("\\\\", "\\")),
                ctx.SK() != null
            )
        )
    }

    override fun visitMyParserRule(ctx: ParserGeneratorGrammarParser.MyParserRuleContext?) {
        parserRules.add(
            ParserRule(
                id = ctx!!.VAR_ID().text,
                argumentsTypes = ctx.types()?.arguments() ?: listOf(),
                returnValuesTypes = ctx.return_()?.types()?.arguments() ?: listOf(),
                alternatives = ctx.alternatives().tokens().map { tokensContext ->
                    tokensContext.token().map { token ->
                        when {
                            token.CODE() != null -> CodeToken(token.text.removePrefix("{").removeSuffix("}").trim())
                            token.terminal() != null -> TermToken(
                                token.terminal().TYPE_ID().text,
                                token.terminal()?.label()?.VAR_ID()?.text
                            )

                            token.nonterm() != null -> NonTermToken(
                                token.nonterm().VAR_ID().text,
                                token.nonterm().args().VAR_ID().map { it.text },
                                token.nonterm()?.label()?.VAR_ID()?.text
                            )

                            else -> {
                                throw IllegalStateException("Invalid token node type $token")
                            }
                        }
                    }
                }
            )
        )
    }

    private fun ParserGeneratorGrammarParser.TypesContext.arguments() =
        let { it.label().zip(it.TYPE_ID()) }.map { Argument(it.first.VAR_ID().text, it.second.text) }
}