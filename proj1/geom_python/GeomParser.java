// Generated from Geom.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GeomParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WS=4, MAIN=5, FUNC=6, CONS=7, LPAR=8, RPAR=9, 
		LBRA=10, RBRA=11, LA=12, RA=13, COMMA=14, SEMICOLON=15, IF=16, THEN=17, 
		ELSE=18, POINT=19, POLYHEDRON=20, NOT=21, EQUAL=22, PLUS=23, MINUS=24, 
		MUL=25, DIV=26, MOD=27, G=28, OR=29, AND=30, L=31, GE=32, LE=33, DIFF=34, 
		BOOLEAN=35, ID=36, VARID=37, DQUOTE=38, STRING=39, CHAR=40, NUMERIC=41;
	public static final int
		RULE_main = 0, RULE_consdecl = 1, RULE_interpointconsdecl = 2, RULE_intervaldecl = 3, 
		RULE_lindecl = 4, RULE_numericValue = 5, RULE_leftexpr = 6, RULE_rightexpr = 7, 
		RULE_booleq = 8, RULE_int_comp_op = 9, RULE_booldecl = 10, RULE_num_op = 11, 
		RULE_linop = 12, RULE_exprent = 13, RULE_consexpr = 14, RULE_exprcomp = 15, 
		RULE_exprbool = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "consdecl", "interpointconsdecl", "intervaldecl", "lindecl", 
			"numericValue", "leftexpr", "rightexpr", "booleq", "int_comp_op", "booldecl", 
			"num_op", "linop", "exprent", "consexpr", "exprcomp", "exprbool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'of'", "'Interval'", null, "'Main'", "'Function'", "'Constraint'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "','", "';'", "'if'", "'then'", 
			"'else'", "'Point'", "'Polyhedron'", "'!'", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'>'", "'or'", "'and'", "'<'", "'>='", "'<='", "'!='", 
			null, null, null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WS", "MAIN", "FUNC", "CONS", "LPAR", "RPAR", 
			"LBRA", "RBRA", "LA", "RA", "COMMA", "SEMICOLON", "IF", "THEN", "ELSE", 
			"POINT", "POLYHEDRON", "NOT", "EQUAL", "PLUS", "MINUS", "MUL", "DIV", 
			"MOD", "G", "OR", "AND", "L", "GE", "LE", "DIFF", "BOOLEAN", "ID", "VARID", 
			"DQUOTE", "STRING", "CHAR", "NUMERIC"
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
	public String getGrammarFileName() { return "Geom.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GeomParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(GeomParser.MAIN, 0); }
		public TerminalNode LBRA() { return getToken(GeomParser.LBRA, 0); }
		public TerminalNode RBRA() { return getToken(GeomParser.RBRA, 0); }
		public List<ConsdeclContext> consdecl() {
			return getRuleContexts(ConsdeclContext.class);
		}
		public ConsdeclContext consdecl(int i) {
			return getRuleContext(ConsdeclContext.class,i);
		}
		public List<InterpointconsdeclContext> interpointconsdecl() {
			return getRuleContexts(InterpointconsdeclContext.class);
		}
		public InterpointconsdeclContext interpointconsdecl(int i) {
			return getRuleContext(InterpointconsdeclContext.class,i);
		}
		public List<IntervaldeclContext> intervaldecl() {
			return getRuleContexts(IntervaldeclContext.class);
		}
		public IntervaldeclContext intervaldecl(int i) {
			return getRuleContext(IntervaldeclContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(MAIN);
			setState(35);
			match(LBRA);
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				consdecl();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONS );
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==ID) {
				{
				setState(43);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(41);
					interpointconsdecl();
					}
					break;
				case T__2:
					{
					setState(42);
					intervaldecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(RBRA);
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
	public static class ConsdeclContext extends ParserRuleContext {
		public TerminalNode CONS() { return getToken(GeomParser.CONS, 0); }
		public TerminalNode ID() { return getToken(GeomParser.ID, 0); }
		public TerminalNode LBRA() { return getToken(GeomParser.LBRA, 0); }
		public TerminalNode RBRA() { return getToken(GeomParser.RBRA, 0); }
		public List<LindeclContext> lindecl() {
			return getRuleContexts(LindeclContext.class);
		}
		public LindeclContext lindecl(int i) {
			return getRuleContext(LindeclContext.class,i);
		}
		public ConsdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterConsdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitConsdecl(this);
		}
	}

	public final ConsdeclContext consdecl() throws RecognitionException {
		ConsdeclContext _localctx = new ConsdeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_consdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(CONS);
			setState(51);
			match(ID);
			setState(52);
			match(T__0);
			setState(53);
			match(LBRA);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2267759509504L) != 0)) {
				{
				{
				setState(54);
				lindecl();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(RBRA);
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
	public static class InterpointconsdeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GeomParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeomParser.ID, i);
		}
		public Int_comp_opContext int_comp_op() {
			return getRuleContext(Int_comp_opContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GeomParser.SEMICOLON, 0); }
		public InterpointconsdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpointconsdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterInterpointconsdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitInterpointconsdecl(this);
		}
	}

	public final InterpointconsdeclContext interpointconsdecl() throws RecognitionException {
		InterpointconsdeclContext _localctx = new InterpointconsdeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_interpointconsdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ID);
			setState(63);
			match(T__1);
			setState(64);
			match(ID);
			setState(65);
			int_comp_op();
			setState(66);
			match(ID);
			setState(67);
			match(T__1);
			setState(68);
			match(ID);
			setState(69);
			match(SEMICOLON);
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
	public static class IntervaldeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GeomParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeomParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(GeomParser.EQUAL, 0); }
		public TerminalNode LA() { return getToken(GeomParser.LA, 0); }
		public List<NumericValueContext> numericValue() {
			return getRuleContexts(NumericValueContext.class);
		}
		public NumericValueContext numericValue(int i) {
			return getRuleContext(NumericValueContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(GeomParser.COMMA, 0); }
		public TerminalNode RA() { return getToken(GeomParser.RA, 0); }
		public TerminalNode SEMICOLON() { return getToken(GeomParser.SEMICOLON, 0); }
		public IntervaldeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervaldecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterIntervaldecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitIntervaldecl(this);
		}
	}

	public final IntervaldeclContext intervaldecl() throws RecognitionException {
		IntervaldeclContext _localctx = new IntervaldeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_intervaldecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__2);
			setState(72);
			match(ID);
			setState(73);
			match(T__1);
			setState(74);
			match(ID);
			setState(75);
			match(EQUAL);
			setState(76);
			match(LA);
			setState(77);
			numericValue();
			setState(78);
			match(COMMA);
			setState(79);
			numericValue();
			setState(80);
			match(RA);
			setState(81);
			match(SEMICOLON);
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
	public static class LindeclContext extends ParserRuleContext {
		public LeftexprContext leftexpr() {
			return getRuleContext(LeftexprContext.class,0);
		}
		public Int_comp_opContext int_comp_op() {
			return getRuleContext(Int_comp_opContext.class,0);
		}
		public List<NumericValueContext> numericValue() {
			return getRuleContexts(NumericValueContext.class);
		}
		public NumericValueContext numericValue(int i) {
			return getRuleContext(NumericValueContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(GeomParser.SEMICOLON, 0); }
		public RightexprContext rightexpr() {
			return getRuleContext(RightexprContext.class,0);
		}
		public LinopContext linop() {
			return getRuleContext(LinopContext.class,0);
		}
		public LindeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lindecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterLindecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitLindecl(this);
		}
	}

	public final LindeclContext lindecl() throws RecognitionException {
		LindeclContext _localctx = new LindeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lindecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			leftexpr();
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(84);
				rightexpr();
				}
				break;
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(87);
				linop();
				setState(88);
				numericValue();
				}
			}

			setState(92);
			int_comp_op();
			setState(93);
			numericValue();
			setState(94);
			match(SEMICOLON);
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
	public static class NumericValueContext extends ParserRuleContext {
		public List<TerminalNode> NUMERIC() { return getTokens(GeomParser.NUMERIC); }
		public TerminalNode NUMERIC(int i) {
			return getToken(GeomParser.NUMERIC, i);
		}
		public TerminalNode MINUS() { return getToken(GeomParser.MINUS, 0); }
		public TerminalNode COMMA() { return getToken(GeomParser.COMMA, 0); }
		public NumericValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterNumericValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitNumericValue(this);
		}
	}

	public final NumericValueContext numericValue() throws RecognitionException {
		NumericValueContext _localctx = new NumericValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numericValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(96);
				match(MINUS);
				}
			}

			setState(99);
			match(NUMERIC);
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(100);
				match(COMMA);
				setState(101);
				match(NUMERIC);
				}
				break;
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
	public static class LeftexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GeomParser.ID, 0); }
		public NumericValueContext numericValue() {
			return getRuleContext(NumericValueContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(GeomParser.MINUS, 0); }
		public LeftexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterLeftexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitLeftexpr(this);
		}
	}

	public final LeftexprContext leftexpr() throws RecognitionException {
		LeftexprContext _localctx = new LeftexprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_leftexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(104);
				numericValue();
				}
				break;
			case 2:
				{
				setState(105);
				match(MINUS);
				}
				break;
			}
			setState(108);
			match(ID);
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
	public static class RightexprContext extends ParserRuleContext {
		public LinopContext linop() {
			return getRuleContext(LinopContext.class,0);
		}
		public TerminalNode ID() { return getToken(GeomParser.ID, 0); }
		public NumericValueContext numericValue() {
			return getRuleContext(NumericValueContext.class,0);
		}
		public RightexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterRightexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitRightexpr(this);
		}
	}

	public final RightexprContext rightexpr() throws RecognitionException {
		RightexprContext _localctx = new RightexprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rightexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			linop();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==NUMERIC) {
				{
				setState(111);
				numericValue();
				}
			}

			setState(114);
			match(ID);
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
	public static class BooleqContext extends ParserRuleContext {
		public TerminalNode DIFF() { return getToken(GeomParser.DIFF, 0); }
		public TerminalNode EQUAL() { return getToken(GeomParser.EQUAL, 0); }
		public BooleqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterBooleq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitBooleq(this);
		}
	}

	public final BooleqContext booleq() throws RecognitionException {
		BooleqContext _localctx = new BooleqContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_booleq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==DIFF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Int_comp_opContext extends ParserRuleContext {
		public TerminalNode G() { return getToken(GeomParser.G, 0); }
		public TerminalNode GE() { return getToken(GeomParser.GE, 0); }
		public TerminalNode L() { return getToken(GeomParser.L, 0); }
		public TerminalNode LE() { return getToken(GeomParser.LE, 0); }
		public Int_comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterInt_comp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitInt_comp_op(this);
		}
	}

	public final Int_comp_opContext int_comp_op() throws RecognitionException {
		Int_comp_opContext _localctx = new Int_comp_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_int_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15300820992L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class BooldeclContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(GeomParser.BOOLEAN, 0); }
		public BooldeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booldecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterBooldecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitBooldecl(this);
		}
	}

	public final BooldeclContext booldecl() throws RecognitionException {
		BooldeclContext _localctx = new BooldeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_booldecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(BOOLEAN);
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
	public static class Num_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GeomParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GeomParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(GeomParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(GeomParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(GeomParser.MOD, 0); }
		public Num_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterNum_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitNum_op(this);
		}
	}

	public final Num_opContext num_op() throws RecognitionException {
		Num_opContext _localctx = new Num_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_num_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 260046848L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class LinopContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GeomParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GeomParser.MINUS, 0); }
		public LinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterLinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitLinop(this);
		}
	}

	public final LinopContext linop() throws RecognitionException {
		LinopContext _localctx = new LinopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_linop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class ExprentContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(GeomParser.LPAR, 0); }
		public List<ExprentContext> exprent() {
			return getRuleContexts(ExprentContext.class);
		}
		public ExprentContext exprent(int i) {
			return getRuleContext(ExprentContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(GeomParser.RPAR, 0); }
		public List<TerminalNode> MINUS() { return getTokens(GeomParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(GeomParser.MINUS, i);
		}
		public List<NumericValueContext> numericValue() {
			return getRuleContexts(NumericValueContext.class);
		}
		public NumericValueContext numericValue(int i) {
			return getRuleContext(NumericValueContext.class,i);
		}
		public Num_opContext num_op() {
			return getRuleContext(Num_opContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GeomParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GeomParser.ID, i);
		}
		public ExprentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterExprent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitExprent(this);
		}
	}

	public final ExprentContext exprent() throws RecognitionException {
		return exprent(0);
	}

	private ExprentContext exprent(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprentContext _localctx = new ExprentContext(_ctx, _parentState);
		ExprentContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exprent, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(127);
				match(LPAR);
				setState(128);
				exprent(0);
				setState(129);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(131);
				match(MINUS);
				setState(132);
				match(LPAR);
				setState(133);
				exprent(0);
				setState(134);
				match(RPAR);
				}
				break;
			case 3:
				{
				setState(136);
				numericValue();
				setState(137);
				num_op();
				setState(138);
				numericValue();
				}
				break;
			case 4:
				{
				setState(140);
				numericValue();
				setState(141);
				num_op();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(142);
					match(MINUS);
					}
				}

				setState(145);
				match(ID);
				}
				break;
			case 5:
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(147);
					match(MINUS);
					}
				}

				setState(150);
				match(ID);
				setState(151);
				num_op();
				setState(152);
				numericValue();
				}
				break;
			case 6:
				{
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(154);
					match(MINUS);
					}
				}

				setState(157);
				match(ID);
				setState(158);
				num_op();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(159);
					match(MINUS);
					}
				}

				setState(162);
				match(ID);
				}
				break;
			case 7:
				{
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(164);
					match(MINUS);
					}
				}

				setState(167);
				match(ID);
				}
				break;
			case 8:
				{
				setState(168);
				numericValue();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprentContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprent);
					setState(171);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(172);
					num_op();
					setState(173);
					exprent(4);
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConsexprContext extends ParserRuleContext {
		public ExprentContext exprent() {
			return getRuleContext(ExprentContext.class,0);
		}
		public ConsexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterConsexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitConsexpr(this);
		}
	}

	public final ConsexprContext consexpr() throws RecognitionException {
		ConsexprContext _localctx = new ConsexprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_consexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			exprent(0);
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
	public static class ExprcompContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GeomParser.ID, 0); }
		public BooldeclContext booldecl() {
			return getRuleContext(BooldeclContext.class,0);
		}
		public ExprentContext exprent() {
			return getRuleContext(ExprentContext.class,0);
		}
		public ExprcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterExprcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitExprcomp(this);
		}
	}

	public final ExprcompContext exprcomp() throws RecognitionException {
		ExprcompContext _localctx = new ExprcompContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exprcomp);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				booldecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				exprent(0);
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
	public static class ExprboolContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GeomParser.ID, 0); }
		public TerminalNode NOT() { return getToken(GeomParser.NOT, 0); }
		public List<ExprboolContext> exprbool() {
			return getRuleContexts(ExprboolContext.class);
		}
		public ExprboolContext exprbool(int i) {
			return getRuleContext(ExprboolContext.class,i);
		}
		public Int_comp_opContext int_comp_op() {
			return getRuleContext(Int_comp_opContext.class,0);
		}
		public List<ExprentContext> exprent() {
			return getRuleContexts(ExprentContext.class);
		}
		public ExprentContext exprent(int i) {
			return getRuleContext(ExprentContext.class,i);
		}
		public NumericValueContext numericValue() {
			return getRuleContext(NumericValueContext.class,0);
		}
		public BooleqContext booleq() {
			return getRuleContext(BooleqContext.class,0);
		}
		public List<ExprcompContext> exprcomp() {
			return getRuleContexts(ExprcompContext.class);
		}
		public ExprcompContext exprcomp(int i) {
			return getRuleContext(ExprcompContext.class,i);
		}
		public BooldeclContext booldecl() {
			return getRuleContext(BooldeclContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(GeomParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(GeomParser.RPAR, 0); }
		public TerminalNode AND() { return getToken(GeomParser.AND, 0); }
		public TerminalNode OR() { return getToken(GeomParser.OR, 0); }
		public ExprboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprbool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).enterExprbool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeomListener ) ((GeomListener)listener).exitExprbool(this);
		}
	}

	public final ExprboolContext exprbool() throws RecognitionException {
		return exprbool(0);
	}

	private ExprboolContext exprbool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprboolContext _localctx = new ExprboolContext(_ctx, _parentState);
		ExprboolContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_exprbool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(189);
				match(ID);
				}
				break;
			case 2:
				{
				setState(190);
				match(NOT);
				setState(191);
				exprbool(11);
				}
				break;
			case 3:
				{
				setState(192);
				match(ID);
				setState(193);
				int_comp_op();
				setState(194);
				exprent(0);
				}
				break;
			case 4:
				{
				setState(196);
				match(ID);
				setState(197);
				int_comp_op();
				setState(198);
				numericValue();
				}
				break;
			case 5:
				{
				setState(200);
				numericValue();
				setState(201);
				int_comp_op();
				setState(202);
				match(ID);
				}
				break;
			case 6:
				{
				setState(204);
				exprent(0);
				setState(205);
				int_comp_op();
				setState(206);
				match(ID);
				}
				break;
			case 7:
				{
				setState(208);
				exprent(0);
				setState(209);
				int_comp_op();
				setState(210);
				exprent(0);
				}
				break;
			case 8:
				{
				{
				setState(212);
				exprcomp();
				}
				setState(213);
				booleq();
				{
				setState(214);
				exprcomp();
				}
				}
				break;
			case 9:
				{
				setState(216);
				booldecl();
				}
				break;
			case 10:
				{
				setState(217);
				match(LPAR);
				setState(218);
				exprbool(0);
				setState(219);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(229);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprboolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprbool);
						setState(223);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(224);
						match(AND);
						setState(225);
						exprbool(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprboolContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprbool);
						setState(226);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(227);
						match(OR);
						setState(228);
						exprbool(4);
						}
						break;
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return exprent_sempred((ExprentContext)_localctx, predIndex);
		case 16:
			return exprbool_sempred((ExprboolContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprent_sempred(ExprentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exprbool_sempred(ExprboolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u00eb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000"+
		"&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0000\u0001\u0000\u0005\u0000,\b"+
		"\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00018\b\u0001\n\u0001"+
		"\f\u0001;\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0003\u0004V\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004[\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005g\b\u0005\u0001\u0006\u0001\u0006\u0003"+
		"\u0006k\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003"+
		"\u0007q\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0090\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0095\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u009c\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a1\b\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00a6\b\r\u0001\r\u0001\r\u0003\r\u00aa\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00b0\b\r\n\r\f\r\u00b3\t\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00bb\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00de\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00e6\b\u0010\n\u0010\f\u0010\u00e9\t\u0010\u0001\u0010\u0000"+
		"\u0002\u001a \u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \u0000\u0004\u0002\u0000\u0016\u0016\""+
		"\"\u0002\u0000\u001c\u001c\u001f!\u0001\u0000\u0017\u001b\u0001\u0000"+
		"\u0017\u0018\u00ff\u0000\"\u0001\u0000\u0000\u0000\u00022\u0001\u0000"+
		"\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000"+
		"\bS\u0001\u0000\u0000\u0000\na\u0001\u0000\u0000\u0000\fj\u0001\u0000"+
		"\u0000\u0000\u000en\u0001\u0000\u0000\u0000\u0010t\u0001\u0000\u0000\u0000"+
		"\u0012v\u0001\u0000\u0000\u0000\u0014x\u0001\u0000\u0000\u0000\u0016z"+
		"\u0001\u0000\u0000\u0000\u0018|\u0001\u0000\u0000\u0000\u001a\u00a9\u0001"+
		"\u0000\u0000\u0000\u001c\u00b4\u0001\u0000\u0000\u0000\u001e\u00ba\u0001"+
		"\u0000\u0000\u0000 \u00dd\u0001\u0000\u0000\u0000\"#\u0005\u0005\u0000"+
		"\u0000#%\u0005\n\u0000\u0000$&\u0003\u0002\u0001\u0000%$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(-\u0001\u0000\u0000\u0000),\u0003\u0004\u0002\u0000"+
		"*,\u0003\u0006\u0003\u0000+)\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000"+
		"\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0005"+
		"\u000b\u0000\u00001\u0001\u0001\u0000\u0000\u000023\u0005\u0007\u0000"+
		"\u000034\u0005$\u0000\u000045\u0005\u0001\u0000\u000059\u0005\n\u0000"+
		"\u000068\u0003\b\u0004\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005\u000b\u0000\u0000=\u0003"+
		"\u0001\u0000\u0000\u0000>?\u0005$\u0000\u0000?@\u0005\u0002\u0000\u0000"+
		"@A\u0005$\u0000\u0000AB\u0003\u0012\t\u0000BC\u0005$\u0000\u0000CD\u0005"+
		"\u0002\u0000\u0000DE\u0005$\u0000\u0000EF\u0005\u000f\u0000\u0000F\u0005"+
		"\u0001\u0000\u0000\u0000GH\u0005\u0003\u0000\u0000HI\u0005$\u0000\u0000"+
		"IJ\u0005\u0002\u0000\u0000JK\u0005$\u0000\u0000KL\u0005\u0016\u0000\u0000"+
		"LM\u0005\f\u0000\u0000MN\u0003\n\u0005\u0000NO\u0005\u000e\u0000\u0000"+
		"OP\u0003\n\u0005\u0000PQ\u0005\r\u0000\u0000QR\u0005\u000f\u0000\u0000"+
		"R\u0007\u0001\u0000\u0000\u0000SU\u0003\f\u0006\u0000TV\u0003\u000e\u0007"+
		"\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VZ\u0001\u0000"+
		"\u0000\u0000WX\u0003\u0018\f\u0000XY\u0003\n\u0005\u0000Y[\u0001\u0000"+
		"\u0000\u0000ZW\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0003\u0012\t\u0000]^\u0003\n\u0005\u0000^_\u0005"+
		"\u000f\u0000\u0000_\t\u0001\u0000\u0000\u0000`b\u0005\u0018\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000cf\u0005)\u0000\u0000de\u0005\u000e\u0000\u0000eg\u0005)\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u000b\u0001\u0000"+
		"\u0000\u0000hk\u0003\n\u0005\u0000ik\u0005\u0018\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0005$\u0000\u0000m\r\u0001\u0000\u0000\u0000np\u0003"+
		"\u0018\f\u0000oq\u0003\n\u0005\u0000po\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0005$\u0000\u0000s\u000f"+
		"\u0001\u0000\u0000\u0000tu\u0007\u0000\u0000\u0000u\u0011\u0001\u0000"+
		"\u0000\u0000vw\u0007\u0001\u0000\u0000w\u0013\u0001\u0000\u0000\u0000"+
		"xy\u0005#\u0000\u0000y\u0015\u0001\u0000\u0000\u0000z{\u0007\u0002\u0000"+
		"\u0000{\u0017\u0001\u0000\u0000\u0000|}\u0007\u0003\u0000\u0000}\u0019"+
		"\u0001\u0000\u0000\u0000~\u007f\u0006\r\uffff\uffff\u0000\u007f\u0080"+
		"\u0005\b\u0000\u0000\u0080\u0081\u0003\u001a\r\u0000\u0081\u0082\u0005"+
		"\t\u0000\u0000\u0082\u00aa\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0018"+
		"\u0000\u0000\u0084\u0085\u0005\b\u0000\u0000\u0085\u0086\u0003\u001a\r"+
		"\u0000\u0086\u0087\u0005\t\u0000\u0000\u0087\u00aa\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0003\n\u0005\u0000\u0089\u008a\u0003\u0016\u000b\u0000\u008a"+
		"\u008b\u0003\n\u0005\u0000\u008b\u00aa\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0003\n\u0005\u0000\u008d\u008f\u0003\u0016\u000b\u0000\u008e\u0090\u0005"+
		"\u0018\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"$\u0000\u0000\u0092\u00aa\u0001\u0000\u0000\u0000\u0093\u0095\u0005\u0018"+
		"\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0005$\u0000"+
		"\u0000\u0097\u0098\u0003\u0016\u000b\u0000\u0098\u0099\u0003\n\u0005\u0000"+
		"\u0099\u00aa\u0001\u0000\u0000\u0000\u009a\u009c\u0005\u0018\u0000\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005$\u0000\u0000\u009e"+
		"\u00a0\u0003\u0016\u000b\u0000\u009f\u00a1\u0005\u0018\u0000\u0000\u00a0"+
		"\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005$\u0000\u0000\u00a3\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a6\u0005\u0018\u0000\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00aa\u0005$\u0000\u0000\u00a8\u00aa\u0003"+
		"\n\u0005\u0000\u00a9~\u0001\u0000\u0000\u0000\u00a9\u0083\u0001\u0000"+
		"\u0000\u0000\u00a9\u0088\u0001\u0000\u0000\u0000\u00a9\u008c\u0001\u0000"+
		"\u0000\u0000\u00a9\u0094\u0001\u0000\u0000\u0000\u00a9\u009b\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00b1\u0001\u0000\u0000\u0000\u00ab\u00ac\n\u0003\u0000"+
		"\u0000\u00ac\u00ad\u0003\u0016\u000b\u0000\u00ad\u00ae\u0003\u001a\r\u0004"+
		"\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u001b\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003\u001a\r\u0000\u00b5"+
		"\u001d\u0001\u0000\u0000\u0000\u00b6\u00bb\u0005$\u0000\u0000\u00b7\u00bb"+
		"\u0001\u0000\u0000\u0000\u00b8\u00bb\u0003\u0014\n\u0000\u00b9\u00bb\u0003"+
		"\u001a\r\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bb\u001f\u0001\u0000\u0000\u0000\u00bc\u00bd\u0006\u0010"+
		"\uffff\uffff\u0000\u00bd\u00de\u0005$\u0000\u0000\u00be\u00bf\u0005\u0015"+
		"\u0000\u0000\u00bf\u00de\u0003 \u0010\u000b\u00c0\u00c1\u0005$\u0000\u0000"+
		"\u00c1\u00c2\u0003\u0012\t\u0000\u00c2\u00c3\u0003\u001a\r\u0000\u00c3"+
		"\u00de\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005$\u0000\u0000\u00c5\u00c6"+
		"\u0003\u0012\t\u0000\u00c6\u00c7\u0003\n\u0005\u0000\u00c7\u00de\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0003\n\u0005\u0000\u00c9\u00ca\u0003\u0012"+
		"\t\u0000\u00ca\u00cb\u0005$\u0000\u0000\u00cb\u00de\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0003\u001a\r\u0000\u00cd\u00ce\u0003\u0012\t\u0000"+
		"\u00ce\u00cf\u0005$\u0000\u0000\u00cf\u00de\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0003\u001a\r\u0000\u00d1\u00d2\u0003\u0012\t\u0000\u00d2\u00d3"+
		"\u0003\u001a\r\u0000\u00d3\u00de\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003"+
		"\u001e\u000f\u0000\u00d5\u00d6\u0003\u0010\b\u0000\u00d6\u00d7\u0003\u001e"+
		"\u000f\u0000\u00d7\u00de\u0001\u0000\u0000\u0000\u00d8\u00de\u0003\u0014"+
		"\n\u0000\u00d9\u00da\u0005\b\u0000\u0000\u00da\u00db\u0003 \u0010\u0000"+
		"\u00db\u00dc\u0005\t\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00dd\u00be\u0001\u0000\u0000\u0000\u00dd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00dd\u00c4\u0001\u0000\u0000\u0000\u00dd"+
		"\u00c8\u0001\u0000\u0000\u0000\u00dd\u00cc\u0001\u0000\u0000\u0000\u00dd"+
		"\u00d0\u0001\u0000\u0000\u0000\u00dd\u00d4\u0001\u0000\u0000\u0000\u00dd"+
		"\u00d8\u0001\u0000\u0000\u0000\u00dd\u00d9\u0001\u0000\u0000\u0000\u00de"+
		"\u00e7\u0001\u0000\u0000\u0000\u00df\u00e0\n\u0004\u0000\u0000\u00e0\u00e1"+
		"\u0005\u001e\u0000\u0000\u00e1\u00e6\u0003 \u0010\u0005\u00e2\u00e3\n"+
		"\u0003\u0000\u0000\u00e3\u00e4\u0005\u001d\u0000\u0000\u00e4\u00e6\u0003"+
		" \u0010\u0004\u00e5\u00df\u0001\u0000\u0000\u0000\u00e5\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8!\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u0015\'+-9UZafjp\u008f\u0094"+
		"\u009b\u00a0\u00a5\u00a9\u00b1\u00ba\u00dd\u00e5\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}