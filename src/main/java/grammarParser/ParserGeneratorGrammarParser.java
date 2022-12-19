// Generated from java-escape by ANTLR 4.11.1
package grammarParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParserGeneratorGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		TYPE_ID=10, VAR_ID=11, STRING=12, INT=13, SK=14, CODE=15, WS=16;
	public static final int
		RULE_rules = 0, RULE_myParserRule = 1, RULE_return = 2, RULE_alternatives = 3, 
		RULE_nonterm = 4, RULE_args = 5, RULE_types = 6, RULE_type = 7, RULE_token = 8, 
		RULE_label = 9, RULE_terminal = 10, RULE_tokens = 11, RULE_myLexerRule = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"rules", "myParserRule", "return", "alternatives", "nonterm", "args", 
			"types", "type", "token", "label", "terminal", "tokens", "myLexerRule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "';'", "':'", "'returns'", "'|'", "'['", "','", "']'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "TYPE_ID", 
			"VAR_ID", "STRING", "INT", "SK", "CODE", "WS"
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

	public ParserGeneratorGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulesContext extends ParserRuleContext {
		public TerminalNode TYPE_ID() { return getToken(ParserGeneratorGrammarParser.TYPE_ID, 0); }
		public List<MyParserRuleContext> myParserRule() {
			return getRuleContexts(MyParserRuleContext.class);
		}
		public MyParserRuleContext myParserRule(int i) {
			return getRuleContext(MyParserRuleContext.class,i);
		}
		public List<MyLexerRuleContext> myLexerRule() {
			return getRuleContexts(MyLexerRuleContext.class);
		}
		public MyLexerRuleContext myLexerRule(int i) {
			return getRuleContext(MyLexerRuleContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGeneratorGrammarVisitor ) return ((ParserGeneratorGrammarVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			match(TYPE_ID);
			setState(28);
			match(T__1);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE_ID || _la==VAR_ID) {
				{
				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR_ID:
					{
					setState(29);
					myParserRule();
					}
					break;
				case TYPE_ID:
					{
					setState(30);
					myLexerRule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class MyParserRuleContext extends ParserRuleContext {
		public TerminalNode VAR_ID() { return getToken(ParserGeneratorGrammarParser.VAR_ID, 0); }
		public AlternativesContext alternatives() {
			return getRuleContext(AlternativesContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public MyParserRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myParserRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).enterMyParserRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).exitMyParserRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGeneratorGrammarVisitor ) return ((ParserGeneratorGrammarVisitor<? extends T>)visitor).visitMyParserRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyParserRuleContext myParserRule() throws RecognitionException {
		MyParserRuleContext _localctx = new MyParserRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_myParserRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(VAR_ID);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(37);
				types();
				}
			}

			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(40);
				return_();
				}
			}

			setState(43);
			match(T__2);
			setState(44);
			alternatives();
			setState(45);
			match(T__1);
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
	public static class ReturnContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGeneratorGrammarVisitor ) return ((ParserGeneratorGrammarVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__3);
			setState(48);
			types();
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
	public static class AlternativesContext extends ParserRuleContext {
		public List<TokensContext> tokens() {
			return getRuleContexts(TokensContext.class);
		}
		public TokensContext tokens(int i) {
			return getRuleContext(TokensContext.class,i);
		}
		public AlternativesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternatives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).enterAlternatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).exitAlternatives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGeneratorGrammarVisitor ) return ((ParserGeneratorGrammarVisitor<? extends T>)visitor).visitAlternatives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativesContext alternatives() throws RecognitionException {
		AlternativesContext _localctx = new AlternativesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alternatives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			tokens();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(51);
				match(T__4);
				setState(52);
				tokens();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class NontermContext extends ParserRuleContext {
		public TerminalNode VAR_ID() { return getToken(ParserGeneratorGrammarParser.VAR_ID, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public NontermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).enterNonterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).exitNonterm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGeneratorGrammarVisitor ) return ((ParserGeneratorGrammarVisitor<? extends T>)visitor).visitNonterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NontermContext nonterm() throws RecognitionException {
		NontermContext _localctx = new NontermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nonterm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(58);
				label();
				}
				break;
			}
			setState(61);
			match(VAR_ID);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(62);
				args();
				}
			}

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
	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> VAR_ID() { return getTokens(ParserGeneratorGrammarParser.VAR_ID); }
		public TerminalNode VAR_ID(int i) {
			return getToken(ParserGeneratorGrammarParser.VAR_ID, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGeneratorGrammarVisitor ) return ((ParserGeneratorGrammarVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__5);
			{
			setState(66);
			match(VAR_ID);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(67);
				match(T__6);
				{
				setState(68);
				match(VAR_ID);
				}
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(T__7);
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
	public static class TypesContext extends ParserRuleContext {
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> TYPE_ID() { return getTokens(ParserGeneratorGrammarParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(ParserGeneratorGrammarParser.TYPE_ID, i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGeneratorGrammarVisitor ) return ((ParserGeneratorGrammarVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__5);
			setState(77);
			label();
			setState(78);
			match(TYPE_ID);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(79);
				match(T__6);
				setState(80);
				label();
				setState(81);
				match(TYPE_ID);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(T__7);
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
	public static class TypeContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode TYPE_ID() { return getToken(ParserGeneratorGrammarParser.TYPE_ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGeneratorGrammarVisitor ) return ((ParserGeneratorGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__5);
			setState(91);
			label();
			setState(92);
			match(TYPE_ID);
			setState(93);
			match(T__7);
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
	public static class TokenContext extends ParserRuleContext {
		public NontermContext nonterm() {
			return getRuleContext(NontermContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public TerminalNode CODE() { return getToken(ParserGeneratorGrammarParser.CODE, 0); }
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).exitToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGeneratorGrammarVisitor ) return ((ParserGeneratorGrammarVisitor<? extends T>)visitor).visitToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_token);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				nonterm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				terminal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(CODE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode VAR_ID() { return getToken(ParserGeneratorGrammarParser.VAR_ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGeneratorGrammarVisitor ) return ((ParserGeneratorGrammarVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(VAR_ID);
			setState(101);
			match(T__8);
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
	public static class TerminalContext extends ParserRuleContext {
		public TerminalNode TYPE_ID() { return getToken(ParserGeneratorGrammarParser.TYPE_ID, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGeneratorGrammarVisitor ) return ((ParserGeneratorGrammarVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_terminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_ID) {
				{
				setState(103);
				label();
				}
			}

			setState(106);
			match(TYPE_ID);
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
	public static class TokensContext extends ParserRuleContext {
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
		}
		public TokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).enterTokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).exitTokens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGeneratorGrammarVisitor ) return ((ParserGeneratorGrammarVisitor<? extends T>)visitor).visitTokens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokensContext tokens() throws RecognitionException {
		TokensContext _localctx = new TokensContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 35840L) != 0) {
				{
				{
				setState(108);
				token();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class MyLexerRuleContext extends ParserRuleContext {
		public TerminalNode TYPE_ID() { return getToken(ParserGeneratorGrammarParser.TYPE_ID, 0); }
		public TerminalNode STRING() { return getToken(ParserGeneratorGrammarParser.STRING, 0); }
		public TerminalNode SK() { return getToken(ParserGeneratorGrammarParser.SK, 0); }
		public MyLexerRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myLexerRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).enterMyLexerRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserGeneratorGrammarListener ) ((ParserGeneratorGrammarListener)listener).exitMyLexerRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserGeneratorGrammarVisitor ) return ((ParserGeneratorGrammarVisitor<? extends T>)visitor).visitMyLexerRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyLexerRuleContext myLexerRule() throws RecognitionException {
		MyLexerRuleContext _localctx = new MyLexerRuleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_myLexerRule);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(TYPE_ID);
				setState(115);
				match(T__2);
				setState(116);
				match(STRING);
				setState(117);
				match(SK);
				setState(118);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(TYPE_ID);
				setState(120);
				match(T__2);
				setState(121);
				match(STRING);
				setState(122);
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
		"\u0004\u0001\u0010~\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000 \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\'\b\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u00036\b\u0003\n\u0003\f\u00039\t"+
		"\u0003\u0001\u0004\u0003\u0004<\b\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004@\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005F\b\u0005\n\u0005\f\u0005I\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006T\b\u0006\n\u0006\f\u0006W\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0003\bc\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0003"+
		"\ni\b\n\u0001\n\u0001\n\u0001\u000b\u0005\u000bn\b\u000b\n\u000b\f\u000b"+
		"q\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f|\b\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0000~\u0000\u001a\u0001"+
		"\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000"+
		"\u0000\u00062\u0001\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\nA\u0001"+
		"\u0000\u0000\u0000\fL\u0001\u0000\u0000\u0000\u000eZ\u0001\u0000\u0000"+
		"\u0000\u0010b\u0001\u0000\u0000\u0000\u0012d\u0001\u0000\u0000\u0000\u0014"+
		"h\u0001\u0000\u0000\u0000\u0016o\u0001\u0000\u0000\u0000\u0018{\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u001c\u0005"+
		"\n\u0000\u0000\u001c!\u0005\u0002\u0000\u0000\u001d \u0003\u0002\u0001"+
		"\u0000\u001e \u0003\u0018\f\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		"\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f"+
		"\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0001\u0001\u0000"+
		"\u0000\u0000#!\u0001\u0000\u0000\u0000$&\u0005\u000b\u0000\u0000%\'\u0003"+
		"\f\u0006\u0000&%\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'"+
		")\u0001\u0000\u0000\u0000(*\u0003\u0004\u0002\u0000)(\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0005\u0003"+
		"\u0000\u0000,-\u0003\u0006\u0003\u0000-.\u0005\u0002\u0000\u0000.\u0003"+
		"\u0001\u0000\u0000\u0000/0\u0005\u0004\u0000\u000001\u0003\f\u0006\u0000"+
		"1\u0005\u0001\u0000\u0000\u000027\u0003\u0016\u000b\u000034\u0005\u0005"+
		"\u0000\u000046\u0003\u0016\u000b\u000053\u0001\u0000\u0000\u000069\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"8\u0007\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:<\u0003\u0012"+
		"\t\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=?\u0005\u000b\u0000\u0000>@\u0003\n\u0005\u0000?>\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@\t\u0001\u0000\u0000\u0000AB\u0005"+
		"\u0006\u0000\u0000BG\u0005\u000b\u0000\u0000CD\u0005\u0007\u0000\u0000"+
		"DF\u0005\u000b\u0000\u0000EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005\b\u0000\u0000K\u000b\u0001"+
		"\u0000\u0000\u0000LM\u0005\u0006\u0000\u0000MN\u0003\u0012\t\u0000NU\u0005"+
		"\n\u0000\u0000OP\u0005\u0007\u0000\u0000PQ\u0003\u0012\t\u0000QR\u0005"+
		"\n\u0000\u0000RT\u0001\u0000\u0000\u0000SO\u0001\u0000\u0000\u0000TW\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005\b\u0000\u0000"+
		"Y\r\u0001\u0000\u0000\u0000Z[\u0005\u0006\u0000\u0000[\\\u0003\u0012\t"+
		"\u0000\\]\u0005\n\u0000\u0000]^\u0005\b\u0000\u0000^\u000f\u0001\u0000"+
		"\u0000\u0000_c\u0003\b\u0004\u0000`c\u0003\u0014\n\u0000ac\u0005\u000f"+
		"\u0000\u0000b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000c\u0011\u0001\u0000\u0000\u0000de\u0005\u000b\u0000"+
		"\u0000ef\u0005\t\u0000\u0000f\u0013\u0001\u0000\u0000\u0000gi\u0003\u0012"+
		"\t\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jk\u0005\n\u0000\u0000k\u0015\u0001\u0000\u0000\u0000ln\u0003"+
		"\u0010\b\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u0017\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000rs\u0005\n\u0000\u0000st\u0005\u0003\u0000"+
		"\u0000tu\u0005\f\u0000\u0000uv\u0005\u000e\u0000\u0000v|\u0005\u0002\u0000"+
		"\u0000wx\u0005\n\u0000\u0000xy\u0005\u0003\u0000\u0000yz\u0005\f\u0000"+
		"\u0000z|\u0005\u0002\u0000\u0000{r\u0001\u0000\u0000\u0000{w\u0001\u0000"+
		"\u0000\u0000|\u0019\u0001\u0000\u0000\u0000\r\u001f!&)7;?GUbho{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}