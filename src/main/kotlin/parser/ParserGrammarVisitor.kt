package parser

import model.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.nio.file.Path

fun main() {
    val input = CharStreams.fromPath(Path.of("src/main/resources/TestParser.g4"))
    val lexer = ParserGrammarLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = ParserGrammarParser(tokens)
    val tree = parser.gram()
    val v = ParserGrammarVisitorImpl()
    v.visit(tree)
    val rules = v.parserRules
    println(rules)
}

class ParserGrammarVisitorImpl: ParserGrammarBaseVisitor<Unit>() {
    val parserRules = mutableListOf<ParserRule>()

    private fun ParserGrammarParser.TypesContext.arguments() =
        let { it.label().zip(it.TYPE_ID()) }.map { Argument(it.first.VAR_ID().text, it.second.text) }

    override fun visitMyParserRule(ctx: ParserGrammarParser.MyParserRuleContext?) {
        parserRules.add(
            ParserRule(
                id = ctx!!.VAR_ID().text,
                argumentsTypes = ctx.types()?.arguments() ?: listOf(),
                returnValuesTypes = ctx.return_()?.types()?.arguments() ?: listOf(),
                alternatives = ctx.alternatives().tokens().map { tokensContext ->
                    tokensContext.token().map { token ->
                        when {
                            token.CODE() != null -> CodeToken(token.text)
                            token.terminal() != null -> TermToken(
                                token.terminal().TYPE_ID().text,
                                token.terminal()?.label()?.VAR_ID()?.text
                            )
                            token.nonterm() != null ->
                                NonTermToken(
                                    token.nonterm().VAR_ID().text,
                                    token.nonterm().args().VAR_ID().map { it.text },
                                    token.nonterm()?.label()?.VAR_ID()?.text
                                )
                            else -> { throw IllegalStateException("Invalid token node type $token") }
                        }
                    }
                }
            )
        )
    }
}