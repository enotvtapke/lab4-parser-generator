// Generated from java-escape by ANTLR 4.11.1
package lexer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LexerGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LexerGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LexerGrammarParser#gram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGram(LexerGrammarParser.GramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexerGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(LexerGrammarParser.TermContext ctx);
}