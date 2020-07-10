// Generated from IECBase.g4 by ANTLR 4.7.1
package de.tu_bs.cs.isf.familymining.ppu_iec.grammar.iecbase;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IECBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, SINGLE_COMMENT=2, MULTI_COMMENT=3, TIME_OF_DAY_LITERAL=4, 
		DAYTIME_LITERAL=5, DURATION=6, INTERVAL=7, DAYS=8, HOURS=9, MINUTES=10, 
		SECONDS=11, MILLISECONDS=12, DATE_LITERAL=13, DATE_AND_TIME_LITERAL=14, 
		INTEGER_LITERAL=15, REAL_LITERAL=16, BOOLEAN_LITERAL=17, BIT_STRING_LITERAL=18, 
		DIRECT_VAR=19, SINGLE_BYTE_CHAR_STRING=20, DOUBLE_BYTE_CHAR_STRING=21, 
		SIGNED_INTEGER_TYPE_NAME=22, SINT=23, INT=24, DINT=25, LINT=26, UNSIGNED_INTEGER_TYPE_NAME=27, 
		USINT=28, UINT=29, UDINT=30, ULINT=31, REAL_TYPE_NAME=32, REAL=33, LREAL=34, 
		DATE_TYPE_NAME=35, DATE=36, TIME_OF_DAY=37, TOD=38, DATE_AND_TIME=39, 
		DT=40, BIT_STRING_TYPE_NAME=41, BOOL=42, BYTE=43, WORD=44, DWORD=45, LWORD=46, 
		WSTRING=47, STRING=48, DOT=49, COLON=50, SEMICOLON=51, COMMA=52, UNDERSCORE=53, 
		HASH=54, PLUS=55, MINUS=56, BAR=57, OR=58, XOR=59, NOT=60, LPARENT=61, 
		RPARENT=62, LSQR_BRACKET=63, RSQR_BRACKET=64, LCURLY_BRACKET=65, RCURLY_BRACKET=66, 
		LT=67, GT=68, EQUAL=69, UNEQUAL=70, ASSIGN=71, NIL=72, IDENTIFIER=73, 
		ENUMERATED_VALUE=74, INT_NUMBER=75;
	public static final int
		RULE_constant = 0, RULE_numeric_literal = 1, RULE_integer_literal = 2, 
		RULE_real_literal = 3, RULE_time_literal = 4, RULE_duration = 5, RULE_time_of_day = 6, 
		RULE_date = 7, RULE_date_and_time = 8, RULE_character_string = 9, RULE_single_byte_char_string = 10, 
		RULE_double_byte_char_string = 11, RULE_bit_string = 12, RULE_boolean_literal = 13, 
		RULE_subrange = 14, RULE_elem_type_name = 15, RULE_numeric_type_name = 16;
	public static final String[] ruleNames = {
		"constant", "numeric_literal", "integer_literal", "real_literal", "time_literal", 
		"duration", "time_of_day", "date", "date_and_time", "character_string", 
		"single_byte_char_string", "double_byte_char_string", "bit_string", "boolean_literal", 
		"subrange", "elem_type_name", "numeric_type_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'SINT'", 
		"'INT'", "'DINT'", "'LINT'", null, "'USINT'", "'UINT'", "'UDINT'", "'ULINT'", 
		null, "'REAL'", "'LREAL'", null, "'DATE'", "'TIME_OF_DAY'", "'TOD'", "'DATE_AND_TIME'", 
		"'DT'", null, "'BOOL'", "'BYTE'", "'WORD'", "'DWORD'", "'LWORD'", "'WSTRING'", 
		"'STRING'", "'.'", "':'", "';'", "','", "'_'", "'#'", "'+'", "'-'", "'|'", 
		"'OR'", "'XOR'", "'NOT'", "'('", "')'", "'['", "']'", "'{'", "'}'", null, 
		null, "'='", "'<>'", "':='", "'NIL'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "SINGLE_COMMENT", "MULTI_COMMENT", "TIME_OF_DAY_LITERAL", 
		"DAYTIME_LITERAL", "DURATION", "INTERVAL", "DAYS", "HOURS", "MINUTES", 
		"SECONDS", "MILLISECONDS", "DATE_LITERAL", "DATE_AND_TIME_LITERAL", "INTEGER_LITERAL", 
		"REAL_LITERAL", "BOOLEAN_LITERAL", "BIT_STRING_LITERAL", "DIRECT_VAR", 
		"SINGLE_BYTE_CHAR_STRING", "DOUBLE_BYTE_CHAR_STRING", "SIGNED_INTEGER_TYPE_NAME", 
		"SINT", "INT", "DINT", "LINT", "UNSIGNED_INTEGER_TYPE_NAME", "USINT", 
		"UINT", "UDINT", "ULINT", "REAL_TYPE_NAME", "REAL", "LREAL", "DATE_TYPE_NAME", 
		"DATE", "TIME_OF_DAY", "TOD", "DATE_AND_TIME", "DT", "BIT_STRING_TYPE_NAME", 
		"BOOL", "BYTE", "WORD", "DWORD", "LWORD", "WSTRING", "STRING", "DOT", 
		"COLON", "SEMICOLON", "COMMA", "UNDERSCORE", "HASH", "PLUS", "MINUS", 
		"BAR", "OR", "XOR", "NOT", "LPARENT", "RPARENT", "LSQR_BRACKET", "RSQR_BRACKET", 
		"LCURLY_BRACKET", "RCURLY_BRACKET", "LT", "GT", "EQUAL", "UNEQUAL", "ASSIGN", 
		"NIL", "IDENTIFIER", "ENUMERATED_VALUE", "INT_NUMBER"
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

	@Override
	public String getGrammarFileName() { return "IECBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IECBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConstantContext extends ParserRuleContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Character_stringContext character_string() {
			return getRuleContext(Character_stringContext.class,0);
		}
		public Time_literalContext time_literal() {
			return getRuleContext(Time_literalContext.class,0);
		}
		public Bit_stringContext bit_string() {
			return getRuleContext(Bit_stringContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_constant);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				numeric_literal();
				}
				break;
			case SINGLE_BYTE_CHAR_STRING:
			case DOUBLE_BYTE_CHAR_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				character_string();
				}
				break;
			case TIME_OF_DAY_LITERAL:
			case DURATION:
			case DATE_LITERAL:
			case DATE_AND_TIME_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				time_literal();
				}
				break;
			case BIT_STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				bit_string();
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				boolean_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Numeric_literalContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Real_literalContext real_literal() {
			return getRuleContext(Real_literalContext.class,0);
		}
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_numeric_literal);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				integer_literal();
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				real_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(IECBaseParser.INTEGER_LITERAL, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitInteger_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitInteger_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_integer_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(INTEGER_LITERAL);
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

	public static class Real_literalContext extends ParserRuleContext {
		public TerminalNode REAL_LITERAL() { return getToken(IECBaseParser.REAL_LITERAL, 0); }
		public Real_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterReal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitReal_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitReal_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_literalContext real_literal() throws RecognitionException {
		Real_literalContext _localctx = new Real_literalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_real_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(REAL_LITERAL);
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

	public static class Time_literalContext extends ParserRuleContext {
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public Time_of_dayContext time_of_day() {
			return getRuleContext(Time_of_dayContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public Date_and_timeContext date_and_time() {
			return getRuleContext(Date_and_timeContext.class,0);
		}
		public Time_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterTime_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitTime_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitTime_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_literalContext time_literal() throws RecognitionException {
		Time_literalContext _localctx = new Time_literalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_time_literal);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DURATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				duration();
				}
				break;
			case TIME_OF_DAY_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				time_of_day();
				}
				break;
			case DATE_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				date();
				}
				break;
			case DATE_AND_TIME_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				date_and_time();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DurationContext extends ParserRuleContext {
		public TerminalNode DURATION() { return getToken(IECBaseParser.DURATION, 0); }
		public DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(DURATION);
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

	public static class Time_of_dayContext extends ParserRuleContext {
		public TerminalNode TIME_OF_DAY_LITERAL() { return getToken(IECBaseParser.TIME_OF_DAY_LITERAL, 0); }
		public Time_of_dayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_of_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterTime_of_day(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitTime_of_day(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitTime_of_day(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_of_dayContext time_of_day() throws RecognitionException {
		Time_of_dayContext _localctx = new Time_of_dayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_time_of_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(TIME_OF_DAY_LITERAL);
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

	public static class DateContext extends ParserRuleContext {
		public TerminalNode DATE_LITERAL() { return getToken(IECBaseParser.DATE_LITERAL, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(DATE_LITERAL);
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

	public static class Date_and_timeContext extends ParserRuleContext {
		public TerminalNode DATE_AND_TIME_LITERAL() { return getToken(IECBaseParser.DATE_AND_TIME_LITERAL, 0); }
		public Date_and_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_and_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterDate_and_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitDate_and_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitDate_and_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_and_timeContext date_and_time() throws RecognitionException {
		Date_and_timeContext _localctx = new Date_and_timeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_date_and_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(DATE_AND_TIME_LITERAL);
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

	public static class Character_stringContext extends ParserRuleContext {
		public Single_byte_char_stringContext single_byte_char_string() {
			return getRuleContext(Single_byte_char_stringContext.class,0);
		}
		public Double_byte_char_stringContext double_byte_char_string() {
			return getRuleContext(Double_byte_char_stringContext.class,0);
		}
		public Character_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterCharacter_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitCharacter_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitCharacter_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_stringContext character_string() throws RecognitionException {
		Character_stringContext _localctx = new Character_stringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_character_string);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_BYTE_CHAR_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				single_byte_char_string();
				}
				break;
			case DOUBLE_BYTE_CHAR_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				double_byte_char_string();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Single_byte_char_stringContext extends ParserRuleContext {
		public TerminalNode SINGLE_BYTE_CHAR_STRING() { return getToken(IECBaseParser.SINGLE_BYTE_CHAR_STRING, 0); }
		public Single_byte_char_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_byte_char_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterSingle_byte_char_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitSingle_byte_char_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitSingle_byte_char_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_byte_char_stringContext single_byte_char_string() throws RecognitionException {
		Single_byte_char_stringContext _localctx = new Single_byte_char_stringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_single_byte_char_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(SINGLE_BYTE_CHAR_STRING);
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

	public static class Double_byte_char_stringContext extends ParserRuleContext {
		public TerminalNode DOUBLE_BYTE_CHAR_STRING() { return getToken(IECBaseParser.DOUBLE_BYTE_CHAR_STRING, 0); }
		public Double_byte_char_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_byte_char_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterDouble_byte_char_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitDouble_byte_char_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitDouble_byte_char_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_byte_char_stringContext double_byte_char_string() throws RecognitionException {
		Double_byte_char_stringContext _localctx = new Double_byte_char_stringContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_double_byte_char_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(DOUBLE_BYTE_CHAR_STRING);
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

	public static class Bit_stringContext extends ParserRuleContext {
		public TerminalNode BIT_STRING_LITERAL() { return getToken(IECBaseParser.BIT_STRING_LITERAL, 0); }
		public Bit_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterBit_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitBit_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitBit_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_stringContext bit_string() throws RecognitionException {
		Bit_stringContext _localctx = new Bit_stringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bit_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(BIT_STRING_LITERAL);
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(IECBaseParser.BOOLEAN_LITERAL, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolean_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(BOOLEAN_LITERAL);
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

	public static class SubrangeContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(IECBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(IECBaseParser.DOT, i);
		}
		public SubrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterSubrange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitSubrange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitSubrange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrangeContext subrange() throws RecognitionException {
		SubrangeContext _localctx = new SubrangeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_subrange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			constant();
			setState(76);
			match(DOT);
			setState(77);
			match(DOT);
			setState(78);
			constant();
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

	public static class Elem_type_nameContext extends ParserRuleContext {
		public Numeric_type_nameContext numeric_type_name() {
			return getRuleContext(Numeric_type_nameContext.class,0);
		}
		public TerminalNode DATE_TYPE_NAME() { return getToken(IECBaseParser.DATE_TYPE_NAME, 0); }
		public TerminalNode BIT_STRING_TYPE_NAME() { return getToken(IECBaseParser.BIT_STRING_TYPE_NAME, 0); }
		public TerminalNode STRING() { return getToken(IECBaseParser.STRING, 0); }
		public TerminalNode WSTRING() { return getToken(IECBaseParser.WSTRING, 0); }
		public Elem_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterElem_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitElem_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitElem_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elem_type_nameContext elem_type_name() throws RecognitionException {
		Elem_type_nameContext _localctx = new Elem_type_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elem_type_name);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGNED_INTEGER_TYPE_NAME:
			case UNSIGNED_INTEGER_TYPE_NAME:
			case REAL_TYPE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				numeric_type_name();
				}
				break;
			case DATE_TYPE_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(DATE_TYPE_NAME);
				}
				break;
			case BIT_STRING_TYPE_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(BIT_STRING_TYPE_NAME);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				match(STRING);
				}
				break;
			case WSTRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				match(WSTRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Numeric_type_nameContext extends ParserRuleContext {
		public TerminalNode SIGNED_INTEGER_TYPE_NAME() { return getToken(IECBaseParser.SIGNED_INTEGER_TYPE_NAME, 0); }
		public TerminalNode UNSIGNED_INTEGER_TYPE_NAME() { return getToken(IECBaseParser.UNSIGNED_INTEGER_TYPE_NAME, 0); }
		public TerminalNode REAL_TYPE_NAME() { return getToken(IECBaseParser.REAL_TYPE_NAME, 0); }
		public Numeric_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).enterNumeric_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECBaseListener ) ((IECBaseListener)listener).exitNumeric_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECBaseVisitor ) return ((IECBaseVisitor<? extends T>)visitor).visitNumeric_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_type_nameContext numeric_type_name() throws RecognitionException {
		Numeric_type_nameContext _localctx = new Numeric_type_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_numeric_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIGNED_INTEGER_TYPE_NAME) | (1L << UNSIGNED_INTEGER_TYPE_NAME) | (1L << REAL_TYPE_NAME))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3M\\\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\3"+
		"\2\3\2\3\2\3\2\5\2*\n\2\3\3\3\3\5\3.\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\5\68\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\5\13D\n\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\5\21X\n\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"\2\3\5\2\30\30\35\35\"\"\2W\2)\3\2\2\2\4-\3\2\2\2\6/\3"+
		"\2\2\2\b\61\3\2\2\2\n\67\3\2\2\2\f9\3\2\2\2\16;\3\2\2\2\20=\3\2\2\2\22"+
		"?\3\2\2\2\24C\3\2\2\2\26E\3\2\2\2\30G\3\2\2\2\32I\3\2\2\2\34K\3\2\2\2"+
		"\36M\3\2\2\2 W\3\2\2\2\"Y\3\2\2\2$*\5\4\3\2%*\5\24\13\2&*\5\n\6\2\'*\5"+
		"\32\16\2(*\5\34\17\2)$\3\2\2\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2"+
		"\2*\3\3\2\2\2+.\5\6\4\2,.\5\b\5\2-+\3\2\2\2-,\3\2\2\2.\5\3\2\2\2/\60\7"+
		"\21\2\2\60\7\3\2\2\2\61\62\7\22\2\2\62\t\3\2\2\2\638\5\f\7\2\648\5\16"+
		"\b\2\658\5\20\t\2\668\5\22\n\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2"+
		"\2\67\66\3\2\2\28\13\3\2\2\29:\7\b\2\2:\r\3\2\2\2;<\7\6\2\2<\17\3\2\2"+
		"\2=>\7\17\2\2>\21\3\2\2\2?@\7\20\2\2@\23\3\2\2\2AD\5\26\f\2BD\5\30\r\2"+
		"CA\3\2\2\2CB\3\2\2\2D\25\3\2\2\2EF\7\26\2\2F\27\3\2\2\2GH\7\27\2\2H\31"+
		"\3\2\2\2IJ\7\24\2\2J\33\3\2\2\2KL\7\23\2\2L\35\3\2\2\2MN\5\2\2\2NO\7\63"+
		"\2\2OP\7\63\2\2PQ\5\2\2\2Q\37\3\2\2\2RX\5\"\22\2SX\7%\2\2TX\7+\2\2UX\7"+
		"\62\2\2VX\7\61\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X"+
		"!\3\2\2\2YZ\t\2\2\2Z#\3\2\2\2\7)-\67CW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}