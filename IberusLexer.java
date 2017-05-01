// Generated from Iberus.g4 by ANTLR 4.5.3
package com.iberus;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IberusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Comment=2, LineComment=3, SubclassOfSymbol=4, FunctionTypeSymbol=5, 
		StaticSymbol=6, CreateSymbol=7, MyClassSymbol=8, ClassSymbol=9, ReturnSymbol=10, 
		IdFirstLargeAlpha=11, ContinueSymbol=12, SwitchSymbol=13, BreakSymbol=14, 
		TrueSymbol=15, FalseSymbol=16, WhileSymbol=17, ElseIfSymbol=18, ElseSymbol=19, 
		ForSymbol=20, IfSymbol=21, DoSymbol=22, IdFirstSmallAlpha=23, UnseenCharacter=24, 
		Text=25, Character=26, Real=27, IntegerTimesTenRaisedToThePowerOf=28, 
		TimesTenRaisedToThePowerOf=29, AssignmentSymbol=30, Dot=31, Comma=32, 
		LPar=33, RPar=34, LBrace=35, RBrace=36, LSquareBracket=37, RSquareBracket=38, 
		EndStatSymbol=39, EndClassSymbol=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "Comment", "LineComment", "SubclassOfSymbol", "FunctionTypeSymbol", 
		"StaticSymbol", "CreateSymbol", "MyClassSymbol", "ClassSymbol", "ReturnSymbol", 
		"IdFirstLargeAlpha", "ContinueSymbol", "SwitchSymbol", "BreakSymbol", 
		"TrueSymbol", "FalseSymbol", "WhileSymbol", "ElseIfSymbol", "ElseSymbol", 
		"ForSymbol", "IfSymbol", "DoSymbol", "IdFirstSmallAlpha", "AlphaDigitUnderline", 
		"AlphaDigit", "Alpha", "UnseenCharacter", "Text", "Character", "Real", 
		"IntegerTimesTenRaisedToThePowerOf", "TimesTenRaisedToThePowerOf", "AssignmentSymbol", 
		"DecimalExponentSymbol", "ENotationSymbol", "SmallAlpha", "LargeAlpha", 
		"Integer", "Digit", "Underline", "EscapeSymbol", "QuotationMark", "Apostrophe", 
		"Dot", "Comma", "LPar", "RPar", "LBrace", "RBrace", "LSquareBracket", 
		"RSquareBracket", "EndStatSymbol", "EndClassSymbol"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", null, null, "'subclassOf'", "'Function'", "'static'", "'Create'", 
		"'myClass'", "'Class'", "'return'", null, "'continue'", "'switch'", "'break'", 
		"'true'", "'false'", "'while'", "'else if'", "'else'", "'for'", "'if'", 
		"'do'", null, null, null, null, null, null, null, "'<-'", "'.'", "','", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Comment", "LineComment", "SubclassOfSymbol", "FunctionTypeSymbol", 
		"StaticSymbol", "CreateSymbol", "MyClassSymbol", "ClassSymbol", "ReturnSymbol", 
		"IdFirstLargeAlpha", "ContinueSymbol", "SwitchSymbol", "BreakSymbol", 
		"TrueSymbol", "FalseSymbol", "WhileSymbol", "ElseIfSymbol", "ElseSymbol", 
		"ForSymbol", "IfSymbol", "DoSymbol", "IdFirstSmallAlpha", "UnseenCharacter", 
		"Text", "Character", "Real", "IntegerTimesTenRaisedToThePowerOf", "TimesTenRaisedToThePowerOf", 
		"AssignmentSymbol", "Dot", "Comma", "LPar", "RPar", "LBrace", "RBrace", 
		"LSquareBracket", "RSquareBracket", "EndStatSymbol", "EndClassSymbol"
	};
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


	public IberusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Iberus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u0179\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\3\3\3\7\3t\n\3\f\3\16\3w\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u0082\n\4\f\4\16\4\u0085\13"+
		"\4\3\4\5\4\u0088\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7\f\u00c7"+
		"\n\f\f\f\16\f\u00ca\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\7\30\u010c\n\30"+
		"\f\30\16\30\u010f\13\30\3\31\3\31\5\31\u0113\n\31\3\32\3\32\5\32\u0117"+
		"\n\32\3\33\3\33\5\33\u011b\n\33\3\34\6\34\u011e\n\34\r\34\16\34\u011f"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\7\35\u0129\n\35\f\35\16\35\u012c\13"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u0135\n\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\5\37\u013d\n\37\3 \3 \5 \u0141\n \3!\3!\5!\u0145\n!\3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\5\'\u0155\n\'\3\'\6\'\u0158"+
		"\n\'\r\'\16\'\u0159\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\4"+
		"u\u0083\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\2\67"+
		"\329\33;\34=\35?\36A\37C E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y![\"]#_$a%c&e"+
		"\'g(i)k*\3\2\n\5\2\13\f\17\17\"\"\3\2$$\3\2))\4\2GGgg\3\2c|\3\2C\\\4\2"+
		"--//\3\2\62;\u017c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2"+
		"\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m"+
		"\3\2\2\2\5o\3\2\2\2\7}\3\2\2\2\t\u008d\3\2\2\2\13\u0098\3\2\2\2\r\u00a1"+
		"\3\2\2\2\17\u00a8\3\2\2\2\21\u00af\3\2\2\2\23\u00b7\3\2\2\2\25\u00bd\3"+
		"\2\2\2\27\u00c4\3\2\2\2\31\u00cb\3\2\2\2\33\u00d4\3\2\2\2\35\u00db\3\2"+
		"\2\2\37\u00e1\3\2\2\2!\u00e6\3\2\2\2#\u00ec\3\2\2\2%\u00f2\3\2\2\2\'\u00fa"+
		"\3\2\2\2)\u00ff\3\2\2\2+\u0103\3\2\2\2-\u0106\3\2\2\2/\u0109\3\2\2\2\61"+
		"\u0112\3\2\2\2\63\u0116\3\2\2\2\65\u011a\3\2\2\2\67\u011d\3\2\2\29\u0123"+
		"\3\2\2\2;\u012f\3\2\2\2=\u0138\3\2\2\2?\u013e\3\2\2\2A\u0144\3\2\2\2C"+
		"\u0148\3\2\2\2E\u014b\3\2\2\2G\u014d\3\2\2\2I\u014f\3\2\2\2K\u0151\3\2"+
		"\2\2M\u0154\3\2\2\2O\u015b\3\2\2\2Q\u015d\3\2\2\2S\u015f\3\2\2\2U\u0161"+
		"\3\2\2\2W\u0163\3\2\2\2Y\u0165\3\2\2\2[\u0167\3\2\2\2]\u0169\3\2\2\2_"+
		"\u016b\3\2\2\2a\u016d\3\2\2\2c\u016f\3\2\2\2e\u0171\3\2\2\2g\u0173\3\2"+
		"\2\2i\u0175\3\2\2\2k\u0177\3\2\2\2mn\7<\2\2n\4\3\2\2\2op\7\61\2\2pq\7"+
		",\2\2qu\3\2\2\2rt\13\2\2\2sr\3\2\2\2tw\3\2\2\2uv\3\2\2\2us\3\2\2\2vx\3"+
		"\2\2\2wu\3\2\2\2xy\7,\2\2yz\7\61\2\2z{\3\2\2\2{|\b\3\2\2|\6\3\2\2\2}~"+
		"\7\61\2\2~\177\7\61\2\2\177\u0083\3\2\2\2\u0080\u0082\13\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\7\17\2\2\u0087\u0086\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\f\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\b\4\2\2\u008c\b\3\2\2\2\u008d\u008e\7u\2\2"+
		"\u008e\u008f\7w\2\2\u008f\u0090\7d\2\2\u0090\u0091\7e\2\2\u0091\u0092"+
		"\7n\2\2\u0092\u0093\7c\2\2\u0093\u0094\7u\2\2\u0094\u0095\7u\2\2\u0095"+
		"\u0096\7Q\2\2\u0096\u0097\7h\2\2\u0097\n\3\2\2\2\u0098\u0099\7H\2\2\u0099"+
		"\u009a\7w\2\2\u009a\u009b\7p\2\2\u009b\u009c\7e\2\2\u009c\u009d\7v\2\2"+
		"\u009d\u009e\7k\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7p\2\2\u00a0\f\3\2"+
		"\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5"+
		"\7v\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7e\2\2\u00a7\16\3\2\2\2\u00a8\u00a9"+
		"\7E\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7c\2\2\u00ac"+
		"\u00ad\7v\2\2\u00ad\u00ae\7g\2\2\u00ae\20\3\2\2\2\u00af\u00b0\7o\2\2\u00b0"+
		"\u00b1\7{\2\2\u00b1\u00b2\7E\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7c\2\2"+
		"\u00b4\u00b5\7u\2\2\u00b5\u00b6\7u\2\2\u00b6\22\3\2\2\2\u00b7\u00b8\7"+
		"E\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc"+
		"\7u\2\2\u00bc\24\3\2\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0"+
		"\7v\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7p\2\2\u00c3"+
		"\26\3\2\2\2\u00c4\u00c8\5K&\2\u00c5\u00c7\5\61\31\2\u00c6\u00c5\3\2\2"+
		"\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\30"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7q\2\2\u00cd"+
		"\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2"+
		"\u00d1\u00d2\7w\2\2\u00d2\u00d3\7g\2\2\u00d3\32\3\2\2\2\u00d4\u00d5\7"+
		"u\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9"+
		"\7e\2\2\u00d9\u00da\7j\2\2\u00da\34\3\2\2\2\u00db\u00dc\7d\2\2\u00dc\u00dd"+
		"\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7m\2\2\u00e0"+
		"\36\3\2\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7w\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5 \3\2\2\2\u00e6\u00e7\7h\2\2\u00e7\u00e8\7c\2\2\u00e8"+
		"\u00e9\7n\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7g\2\2\u00eb\"\3\2\2\2\u00ec"+
		"\u00ed\7y\2\2\u00ed\u00ee\7j\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7n\2\2"+
		"\u00f0\u00f1\7g\2\2\u00f1$\3\2\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7n\2"+
		"\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7\"\2\2\u00f7\u00f8"+
		"\7k\2\2\u00f8\u00f9\7h\2\2\u00f9&\3\2\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc"+
		"\7n\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7g\2\2\u00fe(\3\2\2\2\u00ff\u0100"+
		"\7h\2\2\u0100\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102*\3\2\2\2\u0103\u0104"+
		"\7k\2\2\u0104\u0105\7h\2\2\u0105,\3\2\2\2\u0106\u0107\7f\2\2\u0107\u0108"+
		"\7q\2\2\u0108.\3\2\2\2\u0109\u010d\5I%\2\u010a\u010c\5\61\31\2\u010b\u010a"+
		"\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\60\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0113\5\63\32\2\u0111\u0113\5Q)"+
		"\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\62\3\2\2\2\u0114\u0117"+
		"\5\65\33\2\u0115\u0117\5O(\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\64\3\2\2\2\u0118\u011b\5K&\2\u0119\u011b\5I%\2\u011a\u0118\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\66\3\2\2\2\u011c\u011e\t\2\2\2\u011d\u011c\3\2\2"+
		"\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u0122\b\34\2\2\u01228\3\2\2\2\u0123\u012a\5U+\2\u0124\u0125"+
		"\5S*\2\u0125\u0126\5U+\2\u0126\u0129\3\2\2\2\u0127\u0129\n\3\2\2\u0128"+
		"\u0124\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d"+
		"\u012e\5U+\2\u012e:\3\2\2\2\u012f\u0134\5W,\2\u0130\u0131\5S*\2\u0131"+
		"\u0132\5W,\2\u0132\u0135\3\2\2\2\u0133\u0135\n\4\2\2\u0134\u0130\3\2\2"+
		"\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\5W,\2\u0137<\3"+
		"\2\2\2\u0138\u0139\5M\'\2\u0139\u013a\5Y-\2\u013a\u013c\5M\'\2\u013b\u013d"+
		"\5A!\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d>\3\2\2\2\u013e\u0140"+
		"\5M\'\2\u013f\u0141\5A!\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"@\3\2\2\2\u0142\u0145\5G$\2\u0143\u0145\5E#\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\5M\'\2\u0147B\3\2\2\2\u0148"+
		"\u0149\7>\2\2\u0149\u014a\7/\2\2\u014aD\3\2\2\2\u014b\u014c\7\u23ea\2"+
		"\2\u014cF\3\2\2\2\u014d\u014e\t\5\2\2\u014eH\3\2\2\2\u014f\u0150\t\6\2"+
		"\2\u0150J\3\2\2\2\u0151\u0152\t\7\2\2\u0152L\3\2\2\2\u0153\u0155\t\b\2"+
		"\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0158"+
		"\5O(\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015aN\3\2\2\2\u015b\u015c\t\t\2\2\u015cP\3\2\2\2\u015d"+
		"\u015e\7a\2\2\u015eR\3\2\2\2\u015f\u0160\7^\2\2\u0160T\3\2\2\2\u0161\u0162"+
		"\7$\2\2\u0162V\3\2\2\2\u0163\u0164\7)\2\2\u0164X\3\2\2\2\u0165\u0166\7"+
		"\60\2\2\u0166Z\3\2\2\2\u0167\u0168\7.\2\2\u0168\\\3\2\2\2\u0169\u016a"+
		"\7*\2\2\u016a^\3\2\2\2\u016b\u016c\7+\2\2\u016c`\3\2\2\2\u016d\u016e\7"+
		"}\2\2\u016eb\3\2\2\2\u016f\u0170\7\177\2\2\u0170d\3\2\2\2\u0171\u0172"+
		"\7]\2\2\u0172f\3\2\2\2\u0173\u0174\7_\2\2\u0174h\3\2\2\2\u0175\u0176\7"+
		"=\2\2\u0176j\3\2\2\2\u0177\u0178\7\61\2\2\u0178l\3\2\2\2\24\2u\u0083\u0087"+
		"\u00c8\u010d\u0112\u0116\u011a\u011f\u0128\u012a\u0134\u013c\u0140\u0144"+
		"\u0154\u0159\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}