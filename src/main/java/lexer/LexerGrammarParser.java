// Generated from java-escape by ANTLR 4.11.1
package lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LexerGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, LEXER_RULE_ID=4, SK=5, PATTERN=6, WS=7;
	public static final int
		RULE_gram = 0, RULE_term = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"gram", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "LEXER_RULE_ID", "SK", "PATTERN", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LexerGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GramContext extends ParserRuleContext {
		public TerminalNode LEXER_RULE_ID() { return getToken(LexerGrammarParser.LEXER_RULE_ID, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public GramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerGrammarListener ) ((LexerGrammarListener)listener).enterGram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerGrammarListener ) ((LexerGrammarListener)listener).exitGram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerGrammarVisitor ) return ((LexerGrammarVisitor<? extends T>)visitor).visitGram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GramContext gram() throws RecognitionException {
		GramContext _localctx = new GramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(T__0);
			setState(5);
			match(LEXER_RULE_ID);
			setState(6);
			match(T__1);
			setState(8); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(7);
				term();
				}
				}
				setState(10); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LEXER_RULE_ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode LEXER_RULE_ID() { return getToken(LexerGrammarParser.LEXER_RULE_ID, 0); }
		public TerminalNode PATTERN() { return getToken(LexerGrammarParser.PATTERN, 0); }
		public TerminalNode SK() { return getToken(LexerGrammarParser.SK, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexerGrammarListener ) ((LexerGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexerGrammarListener ) ((LexerGrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexerGrammarVisitor ) return ((LexerGrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_term);
		try {
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(LEXER_RULE_ID);
				setState(13);
				match(T__2);
				setState(14);
				match(PATTERN);
				setState(15);
				match(SK);
				setState(16);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				match(LEXER_RULE_ID);
				setState(18);
				match(T__2);
				setState(19);
				match(PATTERN);
				setState(20);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0007\u0018\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\t\b\u0000"+
		"\u000b\u0000\f\u0000\n\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0016\b\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000\u0017"+
		"\u0000\u0004\u0001\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000"+
		"\u0004\u0005\u0005\u0001\u0000\u0000\u0005\u0006\u0005\u0004\u0000\u0000"+
		"\u0006\b\u0005\u0002\u0000\u0000\u0007\t\u0003\u0002\u0001\u0000\b\u0007"+
		"\u0001\u0000\u0000\u0000\t\n\u0001\u0000\u0000\u0000\n\b\u0001\u0000\u0000"+
		"\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b\u0001\u0001\u0000\u0000\u0000"+
		"\f\r\u0005\u0004\u0000\u0000\r\u000e\u0005\u0003\u0000\u0000\u000e\u000f"+
		"\u0005\u0006\u0000\u0000\u000f\u0010\u0005\u0005\u0000\u0000\u0010\u0016"+
		"\u0005\u0002\u0000\u0000\u0011\u0012\u0005\u0004\u0000\u0000\u0012\u0013"+
		"\u0005\u0003\u0000\u0000\u0013\u0014\u0005\u0006\u0000\u0000\u0014\u0016"+
		"\u0005\u0002\u0000\u0000\u0015\f\u0001\u0000\u0000\u0000\u0015\u0011\u0001"+
		"\u0000\u0000\u0000\u0016\u0003\u0001\u0000\u0000\u0000\u0002\n\u0015";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}