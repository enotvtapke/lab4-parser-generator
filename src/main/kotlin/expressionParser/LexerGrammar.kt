package expressionParser

import generator.runtime.LexerRule
import kotlin.collections.List

public object LexerGrammar {
  public val LEXER_RULES: List<LexerRule> = listOf(
    LexerRule("PLUS", "\\+".toRegex(), false), 
    LexerRule("BIT_AND", "&".toRegex(), false), 
    LexerRule("BIT_OR", "\\|".toRegex(), false), 
    LexerRule("BIT_INV", "~".toRegex(), false), 
    LexerRule("MINUS", "-".toRegex(), false), 
    LexerRule("MULT", "\\*".toRegex(), false), 
    LexerRule("LOG", "//".toRegex(), false), 
    LexerRule("DIV", "/".toRegex(), false), 
    LexerRule("NUMBER", "[0-9]+".toRegex(), false), 
    LexerRule("LBRACKET", "\\(".toRegex(), false), 
    LexerRule("RBRACKET", "\\)".toRegex(), false), 
    LexerRule("WS", "[ \\t\\r\\n]+".toRegex(), true), 
  )
}
