// Generated from java-escape by ANTLR 4.11.1
package lexer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexerGrammarParser}.
 */
public interface LexerGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexerGrammarParser#gram}.
	 * @param ctx the parse tree
	 */
	void enterGram(LexerGrammarParser.GramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerGrammarParser#gram}.
	 * @param ctx the parse tree
	 */
	void exitGram(LexerGrammarParser.GramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LexerGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LexerGrammarParser.TermContext ctx);
}