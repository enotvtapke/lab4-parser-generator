// Generated from java-escape by ANTLR 4.11.1
package grammarParser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParserGeneratorGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		TYPE_ID=10, VAR_ID=11, STRING=12, INT=13, SK=14, CODE=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"TYPE_ID", "VAR_ID", "STRING", "INT", "SK", "CODE", "WS"
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


	public ParserGeneratorGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserGeneratorGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010\u0086\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0005\tB\b\t\n\t\f\tE\t\t\u0001\n\u0001"+
		"\n\u0005\nI\b\n\n\n\f\nL\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000bR\b\u000b\n\u000b\f\u000bU\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0003\f[\b\f\u0001\f\u0004\f^\b\f\u000b\f\f\f_"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0005\rf\b\r\n\r\f\ri\t\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0004\u000er\b\u000e"+
		"\u000b\u000e\f\u000es\u0001\u000e\u0003\u000ew\b\u000e\u0005\u000ey\b"+
		"\u000e\n\u000e\f\u000e|\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004"+
		"\u000f\u0081\b\u000f\u000b\u000f\f\u000f\u0082\u0001\u000f\u0001\u000f"+
		"\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000\b\u0001\u0000AZ\u0004"+
		"\u000009AZ__az\u0001\u0000az\u0003\u0000\n\n\r\r\'\'\u0002\u0000++--\u0001"+
		"\u000009\u0002\u0000{{}}\u0003\u0000\t\n\r\r  \u0090\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000"+
		"\u0003)\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007-"+
		"\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b7\u0001\u0000"+
		"\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f;\u0001\u0000\u0000\u0000"+
		"\u0011=\u0001\u0000\u0000\u0000\u0013?\u0001\u0000\u0000\u0000\u0015F"+
		"\u0001\u0000\u0000\u0000\u0017M\u0001\u0000\u0000\u0000\u0019Z\u0001\u0000"+
		"\u0000\u0000\u001ba\u0001\u0000\u0000\u0000\u001do\u0001\u0000\u0000\u0000"+
		"\u001f\u0080\u0001\u0000\u0000\u0000!\"\u0005g\u0000\u0000\"#\u0005r\u0000"+
		"\u0000#$\u0005a\u0000\u0000$%\u0005m\u0000\u0000%&\u0005m\u0000\u0000"+
		"&\'\u0005a\u0000\u0000\'(\u0005r\u0000\u0000(\u0002\u0001\u0000\u0000"+
		"\u0000)*\u0005;\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005:\u0000"+
		"\u0000,\u0006\u0001\u0000\u0000\u0000-.\u0005r\u0000\u0000./\u0005e\u0000"+
		"\u0000/0\u0005t\u0000\u000001\u0005u\u0000\u000012\u0005r\u0000\u0000"+
		"23\u0005n\u0000\u000034\u0005s\u0000\u00004\b\u0001\u0000\u0000\u0000"+
		"56\u0005|\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005[\u0000\u0000"+
		"8\f\u0001\u0000\u0000\u00009:\u0005,\u0000\u0000:\u000e\u0001\u0000\u0000"+
		"\u0000;<\u0005]\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=>\u0005=\u0000"+
		"\u0000>\u0012\u0001\u0000\u0000\u0000?C\u0007\u0000\u0000\u0000@B\u0007"+
		"\u0001\u0000\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0014\u0001\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000FJ\u0007\u0002\u0000\u0000GI\u0007"+
		"\u0001\u0000\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0016\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000MS\u0005\'\u0000\u0000NR\b\u0003"+
		"\u0000\u0000OP\u0005\\\u0000\u0000PR\u0005\'\u0000\u0000QN\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000VW\u0005\'\u0000\u0000W\u0018\u0001\u0000\u0000"+
		"\u0000X[\u0007\u0004\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000ZY\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\^\u0007"+
		"\u0005\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u001a\u0001\u0000"+
		"\u0000\u0000ab\u0005-\u0000\u0000bc\u0005>\u0000\u0000cg\u0001\u0000\u0000"+
		"\u0000df\u0003\u001f\u000f\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005s\u0000\u0000kl\u0005"+
		"k\u0000\u0000lm\u0005i\u0000\u0000mn\u0005p\u0000\u0000n\u001c\u0001\u0000"+
		"\u0000\u0000oz\u0005{\u0000\u0000pr\b\u0006\u0000\u0000qp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000uw\u0003\u001d\u000e\u0000"+
		"vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000"+
		"\u0000xq\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000}~\u0005}\u0000\u0000~\u001e\u0001\u0000\u0000\u0000"+
		"\u007f\u0081\u0007\u0007\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0006\u000f\u0000\u0000\u0085 \u0001\u0000\u0000\u0000\f"+
		"\u0000CJQSZ_gsvz\u0082\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}