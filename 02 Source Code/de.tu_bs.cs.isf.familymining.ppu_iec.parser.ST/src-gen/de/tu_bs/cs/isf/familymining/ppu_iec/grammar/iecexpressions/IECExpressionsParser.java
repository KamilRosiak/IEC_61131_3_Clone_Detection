// Generated from IECExpressions.g4 by ANTLR 4.7.1
package de.tu_bs.cs.isf.familymining.ppu_iec.grammar.iecexpressions;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IECExpressionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR_OPERATOR=1, XOR_OPERATOR=2, AND_OPERATOR=3, EQUALITY_OPERATOR=4, COMPARISON_OPERATOR=5, 
		MULTIPLY_OPERATOR=6, POWER_OPERATOR=7, WHITESPACE=8, SINGLE_COMMENT=9, 
		MULTI_COMMENT=10, TIME_OF_DAY_LITERAL=11, DAYTIME_LITERAL=12, DURATION=13, 
		INTERVAL=14, DAYS=15, HOURS=16, MINUTES=17, SECONDS=18, MILLISECONDS=19, 
		DATE_LITERAL=20, DATE_AND_TIME_LITERAL=21, INTEGER_LITERAL=22, REAL_LITERAL=23, 
		BOOLEAN_LITERAL=24, BIT_STRING_LITERAL=25, DIRECT_VAR=26, SINGLE_BYTE_CHAR_STRING=27, 
		DOUBLE_BYTE_CHAR_STRING=28, SIGNED_INTEGER_TYPE_NAME=29, SINT=30, INT=31, 
		DINT=32, LINT=33, UNSIGNED_INTEGER_TYPE_NAME=34, USINT=35, UINT=36, UDINT=37, 
		ULINT=38, REAL_TYPE_NAME=39, REAL=40, LREAL=41, DATE_TYPE_NAME=42, DATE=43, 
		TIME_OF_DAY=44, TOD=45, DATE_AND_TIME=46, DT=47, BIT_STRING_TYPE_NAME=48, 
		BOOL=49, BYTE=50, WORD=51, DWORD=52, LWORD=53, WSTRING=54, STRING=55, 
		DOT=56, COLON=57, SEMICOLON=58, COMMA=59, UNDERSCORE=60, HASH=61, PLUS=62, 
		MINUS=63, BAR=64, OR=65, XOR=66, NOT=67, LPARENT=68, RPARENT=69, LSQR_BRACKET=70, 
		RSQR_BRACKET=71, LCURLY_BRACKET=72, RCURLY_BRACKET=73, LT=74, GT=75, EQUAL=76, 
		UNEQUAL=77, ASSIGN=78, NIL=79, IDENTIFIER=80, ENUMERATED_VALUE=81, INT_NUMBER=82;
	public static final int
		RULE_expression = 0, RULE_or_operator = 1, RULE_xor_expression = 2, RULE_xor_operator = 3, 
		RULE_and_expression = 4, RULE_and_operator = 5, RULE_comparison = 6, RULE_equ_operator = 7, 
		RULE_equ_expression = 8, RULE_comparison_operator = 9, RULE_add_expression = 10, 
		RULE_add_operator = 11, RULE_term = 12, RULE_multiply_operator = 13, RULE_power_expression = 14, 
		RULE_unary_expression = 15, RULE_unary_operator = 16, RULE_primary_expression = 17, 
		RULE_function_call = 18, RULE_parameter_list = 19, RULE_function_name = 20, 
		RULE_param_assignment = 21, RULE_variable = 22, RULE_variable_name = 23, 
		RULE_direct_variable = 24, RULE_symbolic_variable = 25, RULE_symbolic_variable_helper = 26, 
		RULE_array_variable = 27, RULE_structured_variable = 28, RULE_constant = 29, 
		RULE_numeric_literal = 30, RULE_integer_literal = 31, RULE_real_literal = 32, 
		RULE_time_literal = 33, RULE_duration = 34, RULE_time_of_day = 35, RULE_date = 36, 
		RULE_date_and_time = 37, RULE_character_string = 38, RULE_single_byte_char_string = 39, 
		RULE_double_byte_char_string = 40, RULE_bit_string = 41, RULE_boolean_literal = 42, 
		RULE_subrange = 43, RULE_elem_type_name = 44, RULE_numeric_type_name = 45;
	public static final String[] ruleNames = {
		"expression", "or_operator", "xor_expression", "xor_operator", "and_expression", 
		"and_operator", "comparison", "equ_operator", "equ_expression", "comparison_operator", 
		"add_expression", "add_operator", "term", "multiply_operator", "power_expression", 
		"unary_expression", "unary_operator", "primary_expression", "function_call", 
		"parameter_list", "function_name", "param_assignment", "variable", "variable_name", 
		"direct_variable", "symbolic_variable", "symbolic_variable_helper", "array_variable", 
		"structured_variable", "constant", "numeric_literal", "integer_literal", 
		"real_literal", "time_literal", "duration", "time_of_day", "date", "date_and_time", 
		"character_string", "single_byte_char_string", "double_byte_char_string", 
		"bit_string", "boolean_literal", "subrange", "elem_type_name", "numeric_type_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'SINT'", "'INT'", "'DINT'", "'LINT'", 
		null, "'USINT'", "'UINT'", "'UDINT'", "'ULINT'", null, "'REAL'", "'LREAL'", 
		null, "'DATE'", "'TIME_OF_DAY'", "'TOD'", "'DATE_AND_TIME'", "'DT'", null, 
		"'BOOL'", "'BYTE'", "'WORD'", "'DWORD'", "'LWORD'", "'WSTRING'", "'STRING'", 
		"'.'", "':'", "';'", "','", "'_'", "'#'", "'+'", "'-'", "'|'", "'OR'", 
		"'XOR'", "'NOT'", "'('", "')'", "'['", "']'", "'{'", "'}'", null, null, 
		"'='", "'<>'", "':='", "'NIL'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OR_OPERATOR", "XOR_OPERATOR", "AND_OPERATOR", "EQUALITY_OPERATOR", 
		"COMPARISON_OPERATOR", "MULTIPLY_OPERATOR", "POWER_OPERATOR", "WHITESPACE", 
		"SINGLE_COMMENT", "MULTI_COMMENT", "TIME_OF_DAY_LITERAL", "DAYTIME_LITERAL", 
		"DURATION", "INTERVAL", "DAYS", "HOURS", "MINUTES", "SECONDS", "MILLISECONDS", 
		"DATE_LITERAL", "DATE_AND_TIME_LITERAL", "INTEGER_LITERAL", "REAL_LITERAL", 
		"BOOLEAN_LITERAL", "BIT_STRING_LITERAL", "DIRECT_VAR", "SINGLE_BYTE_CHAR_STRING", 
		"DOUBLE_BYTE_CHAR_STRING", "SIGNED_INTEGER_TYPE_NAME", "SINT", "INT", 
		"DINT", "LINT", "UNSIGNED_INTEGER_TYPE_NAME", "USINT", "UINT", "UDINT", 
		"ULINT", "REAL_TYPE_NAME", "REAL", "LREAL", "DATE_TYPE_NAME", "DATE", 
		"TIME_OF_DAY", "TOD", "DATE_AND_TIME", "DT", "BIT_STRING_TYPE_NAME", "BOOL", 
		"BYTE", "WORD", "DWORD", "LWORD", "WSTRING", "STRING", "DOT", "COLON", 
		"SEMICOLON", "COMMA", "UNDERSCORE", "HASH", "PLUS", "MINUS", "BAR", "OR", 
		"XOR", "NOT", "LPARENT", "RPARENT", "LSQR_BRACKET", "RSQR_BRACKET", "LCURLY_BRACKET", 
		"RCURLY_BRACKET", "LT", "GT", "EQUAL", "UNEQUAL", "ASSIGN", "NIL", "IDENTIFIER", 
		"ENUMERATED_VALUE", "INT_NUMBER"
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
	public String getGrammarFileName() { return "IECExpressions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IECExpressionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public List<Xor_expressionContext> xor_expression() {
			return getRuleContexts(Xor_expressionContext.class);
		}
		public Xor_expressionContext xor_expression(int i) {
			return getRuleContext(Xor_expressionContext.class,i);
		}
		public List<Or_operatorContext> or_operator() {
			return getRuleContexts(Or_operatorContext.class);
		}
		public Or_operatorContext or_operator(int i) {
			return getRuleContext(Or_operatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			xor_expression();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_OPERATOR) {
				{
				{
				setState(93);
				or_operator();
				setState(94);
				xor_expression();
				}
				}
				setState(100);
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

	public static class Or_operatorContext extends ParserRuleContext {
		public TerminalNode OR_OPERATOR() { return getToken(IECExpressionsParser.OR_OPERATOR, 0); }
		public Or_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterOr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitOr_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitOr_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_operatorContext or_operator() throws RecognitionException {
		Or_operatorContext _localctx = new Or_operatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_or_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(OR_OPERATOR);
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

	public static class Xor_expressionContext extends ParserRuleContext {
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<Xor_operatorContext> xor_operator() {
			return getRuleContexts(Xor_operatorContext.class);
		}
		public Xor_operatorContext xor_operator(int i) {
			return getRuleContext(Xor_operatorContext.class,i);
		}
		public Xor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterXor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitXor_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitXor_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_expressionContext xor_expression() throws RecognitionException {
		Xor_expressionContext _localctx = new Xor_expressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_xor_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			and_expression();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR_OPERATOR) {
				{
				{
				setState(104);
				xor_operator();
				setState(105);
				and_expression();
				}
				}
				setState(111);
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

	public static class Xor_operatorContext extends ParserRuleContext {
		public TerminalNode XOR_OPERATOR() { return getToken(IECExpressionsParser.XOR_OPERATOR, 0); }
		public Xor_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterXor_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitXor_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitXor_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_operatorContext xor_operator() throws RecognitionException {
		Xor_operatorContext _localctx = new Xor_operatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_xor_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(XOR_OPERATOR);
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

	public static class And_expressionContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<And_operatorContext> and_operator() {
			return getRuleContexts(And_operatorContext.class);
		}
		public And_operatorContext and_operator(int i) {
			return getRuleContext(And_operatorContext.class,i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			comparison();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OPERATOR) {
				{
				{
				setState(115);
				and_operator();
				setState(116);
				comparison();
				}
				}
				setState(122);
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

	public static class And_operatorContext extends ParserRuleContext {
		public TerminalNode AND_OPERATOR() { return getToken(IECExpressionsParser.AND_OPERATOR, 0); }
		public And_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterAnd_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitAnd_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitAnd_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_operatorContext and_operator() throws RecognitionException {
		And_operatorContext _localctx = new And_operatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_and_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(AND_OPERATOR);
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<Equ_expressionContext> equ_expression() {
			return getRuleContexts(Equ_expressionContext.class);
		}
		public Equ_expressionContext equ_expression(int i) {
			return getRuleContext(Equ_expressionContext.class,i);
		}
		public List<Equ_operatorContext> equ_operator() {
			return getRuleContexts(Equ_operatorContext.class);
		}
		public Equ_operatorContext equ_operator(int i) {
			return getRuleContext(Equ_operatorContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			equ_expression();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALITY_OPERATOR) {
				{
				{
				setState(126);
				equ_operator();
				setState(127);
				equ_expression();
				}
				}
				setState(133);
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

	public static class Equ_operatorContext extends ParserRuleContext {
		public TerminalNode EQUALITY_OPERATOR() { return getToken(IECExpressionsParser.EQUALITY_OPERATOR, 0); }
		public Equ_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equ_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterEqu_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitEqu_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitEqu_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equ_operatorContext equ_operator() throws RecognitionException {
		Equ_operatorContext _localctx = new Equ_operatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_equ_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(EQUALITY_OPERATOR);
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

	public static class Equ_expressionContext extends ParserRuleContext {
		public List<Add_expressionContext> add_expression() {
			return getRuleContexts(Add_expressionContext.class);
		}
		public Add_expressionContext add_expression(int i) {
			return getRuleContext(Add_expressionContext.class,i);
		}
		public List<Comparison_operatorContext> comparison_operator() {
			return getRuleContexts(Comparison_operatorContext.class);
		}
		public Comparison_operatorContext comparison_operator(int i) {
			return getRuleContext(Comparison_operatorContext.class,i);
		}
		public Equ_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equ_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterEqu_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitEqu_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitEqu_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equ_expressionContext equ_expression() throws RecognitionException {
		Equ_expressionContext _localctx = new Equ_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_equ_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			add_expression();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMPARISON_OPERATOR) {
				{
				{
				setState(137);
				comparison_operator();
				setState(138);
				add_expression();
				}
				}
				setState(144);
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

	public static class Comparison_operatorContext extends ParserRuleContext {
		public TerminalNode COMPARISON_OPERATOR() { return getToken(IECExpressionsParser.COMPARISON_OPERATOR, 0); }
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitComparison_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitComparison_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparison_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(COMPARISON_OPERATOR);
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

	public static class Add_expressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Add_operatorContext> add_operator() {
			return getRuleContexts(Add_operatorContext.class);
		}
		public Add_operatorContext add_operator(int i) {
			return getRuleContext(Add_operatorContext.class,i);
		}
		public Add_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterAdd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitAdd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitAdd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_expressionContext add_expression() throws RecognitionException {
		Add_expressionContext _localctx = new Add_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_add_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			term();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(148);
				add_operator();
				setState(149);
				term();
				}
				}
				setState(155);
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

	public static class Add_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(IECExpressionsParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(IECExpressionsParser.MINUS, 0); }
		public Add_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterAdd_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitAdd_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitAdd_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_operatorContext add_operator() throws RecognitionException {
		Add_operatorContext _localctx = new Add_operatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_add_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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

	public static class TermContext extends ParserRuleContext {
		public List<Power_expressionContext> power_expression() {
			return getRuleContexts(Power_expressionContext.class);
		}
		public Power_expressionContext power_expression(int i) {
			return getRuleContext(Power_expressionContext.class,i);
		}
		public List<Multiply_operatorContext> multiply_operator() {
			return getRuleContexts(Multiply_operatorContext.class);
		}
		public Multiply_operatorContext multiply_operator(int i) {
			return getRuleContext(Multiply_operatorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			power_expression();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLY_OPERATOR) {
				{
				{
				setState(159);
				multiply_operator();
				setState(160);
				power_expression();
				}
				}
				setState(166);
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

	public static class Multiply_operatorContext extends ParserRuleContext {
		public TerminalNode MULTIPLY_OPERATOR() { return getToken(IECExpressionsParser.MULTIPLY_OPERATOR, 0); }
		public Multiply_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterMultiply_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitMultiply_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitMultiply_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiply_operatorContext multiply_operator() throws RecognitionException {
		Multiply_operatorContext _localctx = new Multiply_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiply_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(MULTIPLY_OPERATOR);
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

	public static class Power_expressionContext extends ParserRuleContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public List<TerminalNode> POWER_OPERATOR() { return getTokens(IECExpressionsParser.POWER_OPERATOR); }
		public TerminalNode POWER_OPERATOR(int i) {
			return getToken(IECExpressionsParser.POWER_OPERATOR, i);
		}
		public Power_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterPower_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitPower_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitPower_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Power_expressionContext power_expression() throws RecognitionException {
		Power_expressionContext _localctx = new Power_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_power_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			unary_expression();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POWER_OPERATOR) {
				{
				{
				setState(170);
				match(POWER_OPERATOR);
				setState(171);
				unary_expression();
				}
				}
				setState(176);
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unary_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (PLUS - 62)) | (1L << (MINUS - 62)) | (1L << (NOT - 62)))) != 0)) {
				{
				setState(177);
				unary_operator();
				}
			}

			setState(180);
			primary_expression();
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(IECExpressionsParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(IECExpressionsParser.PLUS, 0); }
		public TerminalNode NOT() { return getToken(IECExpressionsParser.NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (PLUS - 62)) | (1L << (MINUS - 62)) | (1L << (NOT - 62)))) != 0)) ) {
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ENUMERATED_VALUE() { return getToken(IECExpressionsParser.ENUMERATED_VALUE, 0); }
		public TerminalNode LPARENT() { return getToken(IECExpressionsParser.LPARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(IECExpressionsParser.RPARENT, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public SubrangeContext subrange() {
			return getRuleContext(SubrangeContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primary_expression);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(ENUMERATED_VALUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(LPARENT);
				setState(188);
				expression();
				setState(189);
				match(RPARENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(192);
				subrange();
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode LPARENT() { return getToken(IECExpressionsParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(IECExpressionsParser.RPARENT, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			function_name();
			setState(196);
			match(LPARENT);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIME_OF_DAY_LITERAL) | (1L << DURATION) | (1L << DATE_LITERAL) | (1L << DATE_AND_TIME_LITERAL) | (1L << INTEGER_LITERAL) | (1L << REAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << BIT_STRING_LITERAL) | (1L << DIRECT_VAR) | (1L << SINGLE_BYTE_CHAR_STRING) | (1L << DOUBLE_BYTE_CHAR_STRING) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NOT - 67)) | (1L << (LPARENT - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (ENUMERATED_VALUE - 67)))) != 0)) {
				{
				setState(197);
				parameter_list();
				}
			}

			setState(200);
			match(RPARENT);
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

	public static class Parameter_listContext extends ParserRuleContext {
		public List<Param_assignmentContext> param_assignment() {
			return getRuleContexts(Param_assignmentContext.class);
		}
		public Param_assignmentContext param_assignment(int i) {
			return getRuleContext(Param_assignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IECExpressionsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IECExpressionsParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			param_assignment();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(203);
				match(COMMA);
				setState(204);
				param_assignment();
				}
				}
				setState(209);
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

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IECExpressionsParser.IDENTIFIER, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IDENTIFIER);
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

	public static class Param_assignmentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(IECExpressionsParser.ASSIGN, 0); }
		public Param_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterParam_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitParam_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitParam_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_assignmentContext param_assignment() throws RecognitionException {
		Param_assignmentContext _localctx = new Param_assignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_param_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(212);
				variable();
				setState(213);
				match(ASSIGN);
				}
				break;
			}
			setState(217);
			expression();
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

	public static class VariableContext extends ParserRuleContext {
		public Direct_variableContext direct_variable() {
			return getRuleContext(Direct_variableContext.class,0);
		}
		public Symbolic_variableContext symbolic_variable() {
			return getRuleContext(Symbolic_variableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variable);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRECT_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				direct_variable();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				symbolic_variable();
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

	public static class Variable_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IECExpressionsParser.IDENTIFIER, 0); }
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(IDENTIFIER);
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

	public static class Direct_variableContext extends ParserRuleContext {
		public TerminalNode DIRECT_VAR() { return getToken(IECExpressionsParser.DIRECT_VAR, 0); }
		public Direct_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterDirect_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitDirect_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitDirect_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Direct_variableContext direct_variable() throws RecognitionException {
		Direct_variableContext _localctx = new Direct_variableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_direct_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(DIRECT_VAR);
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

	public static class Symbolic_variableContext extends ParserRuleContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Symbolic_variable_helperContext symbolic_variable_helper() {
			return getRuleContext(Symbolic_variable_helperContext.class,0);
		}
		public Symbolic_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolic_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterSymbolic_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitSymbolic_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitSymbolic_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Symbolic_variableContext symbolic_variable() throws RecognitionException {
		Symbolic_variableContext _localctx = new Symbolic_variableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_symbolic_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			variable_name();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT || _la==LSQR_BRACKET) {
				{
				setState(228);
				symbolic_variable_helper();
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

	public static class Symbolic_variable_helperContext extends ParserRuleContext {
		public Array_variableContext array_variable() {
			return getRuleContext(Array_variableContext.class,0);
		}
		public Structured_variableContext structured_variable() {
			return getRuleContext(Structured_variableContext.class,0);
		}
		public Symbolic_variable_helperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolic_variable_helper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterSymbolic_variable_helper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitSymbolic_variable_helper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitSymbolic_variable_helper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Symbolic_variable_helperContext symbolic_variable_helper() throws RecognitionException {
		Symbolic_variable_helperContext _localctx = new Symbolic_variable_helperContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_symbolic_variable_helper);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSQR_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				array_variable();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				structured_variable();
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

	public static class Array_variableContext extends ParserRuleContext {
		public TerminalNode LSQR_BRACKET() { return getToken(IECExpressionsParser.LSQR_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RSQR_BRACKET() { return getToken(IECExpressionsParser.RSQR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IECExpressionsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IECExpressionsParser.COMMA, i);
		}
		public Symbolic_variable_helperContext symbolic_variable_helper() {
			return getRuleContext(Symbolic_variable_helperContext.class,0);
		}
		public Array_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterArray_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitArray_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitArray_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_variableContext array_variable() throws RecognitionException {
		Array_variableContext _localctx = new Array_variableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(LSQR_BRACKET);
			setState(236);
			expression();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(237);
				match(COMMA);
				setState(238);
				expression();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(RSQR_BRACKET);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT || _la==LSQR_BRACKET) {
				{
				setState(245);
				symbolic_variable_helper();
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

	public static class Structured_variableContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(IECExpressionsParser.DOT, 0); }
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Symbolic_variable_helperContext symbolic_variable_helper() {
			return getRuleContext(Symbolic_variable_helperContext.class,0);
		}
		public Structured_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structured_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterStructured_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitStructured_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitStructured_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structured_variableContext structured_variable() throws RecognitionException {
		Structured_variableContext _localctx = new Structured_variableContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_structured_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(DOT);
			setState(249);
			variable_name();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT || _la==LSQR_BRACKET) {
				{
				setState(250);
				symbolic_variable_helper();
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
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constant);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				numeric_literal();
				}
				break;
			case SINGLE_BYTE_CHAR_STRING:
			case DOUBLE_BYTE_CHAR_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				character_string();
				}
				break;
			case TIME_OF_DAY_LITERAL:
			case DURATION:
			case DATE_LITERAL:
			case DATE_AND_TIME_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				time_literal();
				}
				break;
			case BIT_STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				bit_string();
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
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
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_numeric_literal);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				integer_literal();
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
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
		public TerminalNode INTEGER_LITERAL() { return getToken(IECExpressionsParser.INTEGER_LITERAL, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitInteger_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitInteger_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_integer_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
		public TerminalNode REAL_LITERAL() { return getToken(IECExpressionsParser.REAL_LITERAL, 0); }
		public Real_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterReal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitReal_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitReal_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_literalContext real_literal() throws RecognitionException {
		Real_literalContext _localctx = new Real_literalContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_real_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterTime_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitTime_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitTime_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_literalContext time_literal() throws RecognitionException {
		Time_literalContext _localctx = new Time_literalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_time_literal);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DURATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				duration();
				}
				break;
			case TIME_OF_DAY_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				time_of_day();
				}
				break;
			case DATE_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				date();
				}
				break;
			case DATE_AND_TIME_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
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
		public TerminalNode DURATION() { return getToken(IECExpressionsParser.DURATION, 0); }
		public DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		public TerminalNode TIME_OF_DAY_LITERAL() { return getToken(IECExpressionsParser.TIME_OF_DAY_LITERAL, 0); }
		public Time_of_dayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_of_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterTime_of_day(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitTime_of_day(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitTime_of_day(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_of_dayContext time_of_day() throws RecognitionException {
		Time_of_dayContext _localctx = new Time_of_dayContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_time_of_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		public TerminalNode DATE_LITERAL() { return getToken(IECExpressionsParser.DATE_LITERAL, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
		public TerminalNode DATE_AND_TIME_LITERAL() { return getToken(IECExpressionsParser.DATE_AND_TIME_LITERAL, 0); }
		public Date_and_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_and_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterDate_and_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitDate_and_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitDate_and_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_and_timeContext date_and_time() throws RecognitionException {
		Date_and_timeContext _localctx = new Date_and_timeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_date_and_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterCharacter_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitCharacter_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitCharacter_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_stringContext character_string() throws RecognitionException {
		Character_stringContext _localctx = new Character_stringContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_character_string);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_BYTE_CHAR_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				single_byte_char_string();
				}
				break;
			case DOUBLE_BYTE_CHAR_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
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
		public TerminalNode SINGLE_BYTE_CHAR_STRING() { return getToken(IECExpressionsParser.SINGLE_BYTE_CHAR_STRING, 0); }
		public Single_byte_char_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_byte_char_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterSingle_byte_char_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitSingle_byte_char_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitSingle_byte_char_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_byte_char_stringContext single_byte_char_string() throws RecognitionException {
		Single_byte_char_stringContext _localctx = new Single_byte_char_stringContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_single_byte_char_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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
		public TerminalNode DOUBLE_BYTE_CHAR_STRING() { return getToken(IECExpressionsParser.DOUBLE_BYTE_CHAR_STRING, 0); }
		public Double_byte_char_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_byte_char_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterDouble_byte_char_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitDouble_byte_char_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitDouble_byte_char_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_byte_char_stringContext double_byte_char_string() throws RecognitionException {
		Double_byte_char_stringContext _localctx = new Double_byte_char_stringContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_double_byte_char_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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
		public TerminalNode BIT_STRING_LITERAL() { return getToken(IECExpressionsParser.BIT_STRING_LITERAL, 0); }
		public Bit_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterBit_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitBit_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitBit_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_stringContext bit_string() throws RecognitionException {
		Bit_stringContext _localctx = new Bit_stringContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_bit_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
		public TerminalNode BOOLEAN_LITERAL() { return getToken(IECExpressionsParser.BOOLEAN_LITERAL, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_boolean_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
		public List<TerminalNode> DOT() { return getTokens(IECExpressionsParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(IECExpressionsParser.DOT, i);
		}
		public SubrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterSubrange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitSubrange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitSubrange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrangeContext subrange() throws RecognitionException {
		SubrangeContext _localctx = new SubrangeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_subrange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			constant();
			setState(295);
			match(DOT);
			setState(296);
			match(DOT);
			setState(297);
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
		public TerminalNode DATE_TYPE_NAME() { return getToken(IECExpressionsParser.DATE_TYPE_NAME, 0); }
		public TerminalNode BIT_STRING_TYPE_NAME() { return getToken(IECExpressionsParser.BIT_STRING_TYPE_NAME, 0); }
		public TerminalNode STRING() { return getToken(IECExpressionsParser.STRING, 0); }
		public TerminalNode WSTRING() { return getToken(IECExpressionsParser.WSTRING, 0); }
		public Elem_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterElem_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitElem_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitElem_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elem_type_nameContext elem_type_name() throws RecognitionException {
		Elem_type_nameContext _localctx = new Elem_type_nameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_elem_type_name);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGNED_INTEGER_TYPE_NAME:
			case UNSIGNED_INTEGER_TYPE_NAME:
			case REAL_TYPE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				numeric_type_name();
				}
				break;
			case DATE_TYPE_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(DATE_TYPE_NAME);
				}
				break;
			case BIT_STRING_TYPE_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				match(BIT_STRING_TYPE_NAME);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				match(STRING);
				}
				break;
			case WSTRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
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
		public TerminalNode SIGNED_INTEGER_TYPE_NAME() { return getToken(IECExpressionsParser.SIGNED_INTEGER_TYPE_NAME, 0); }
		public TerminalNode UNSIGNED_INTEGER_TYPE_NAME() { return getToken(IECExpressionsParser.UNSIGNED_INTEGER_TYPE_NAME, 0); }
		public TerminalNode REAL_TYPE_NAME() { return getToken(IECExpressionsParser.REAL_TYPE_NAME, 0); }
		public Numeric_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).enterNumeric_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IECExpressionsListener ) ((IECExpressionsListener)listener).exitNumeric_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IECExpressionsVisitor ) return ((IECExpressionsVisitor<? extends T>)visitor).visitNumeric_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_type_nameContext numeric_type_name() throws RecognitionException {
		Numeric_type_nameContext _localctx = new Numeric_type_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_numeric_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u0137\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\7\2c\n\2\f\2\16\2f\13\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\7\4n\n\4\f\4\16\4q\13\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6y"+
		"\n\6\f\6\16\6|\13\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u0084\n\b\f\b\16\b\u0087"+
		"\13\b\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u008f\n\n\f\n\16\n\u0092\13\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\7\f\u009a\n\f\f\f\16\f\u009d\13\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\7\16\u00a5\n\16\f\16\16\16\u00a8\13\16\3\17\3\17\3\20\3\20"+
		"\3\20\7\20\u00af\n\20\f\20\16\20\u00b2\13\20\3\21\5\21\u00b5\n\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c4"+
		"\n\23\3\24\3\24\3\24\5\24\u00c9\n\24\3\24\3\24\3\25\3\25\3\25\7\25\u00d0"+
		"\n\25\f\25\16\25\u00d3\13\25\3\26\3\26\3\27\3\27\3\27\5\27\u00da\n\27"+
		"\3\27\3\27\3\30\3\30\5\30\u00e0\n\30\3\31\3\31\3\32\3\32\3\33\3\33\5\33"+
		"\u00e8\n\33\3\34\3\34\5\34\u00ec\n\34\3\35\3\35\3\35\3\35\7\35\u00f2\n"+
		"\35\f\35\16\35\u00f5\13\35\3\35\3\35\5\35\u00f9\n\35\3\36\3\36\3\36\5"+
		"\36\u00fe\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u0105\n\37\3 \3 \5 \u0109"+
		"\n \3!\3!\3\"\3\"\3#\3#\3#\3#\5#\u0113\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\5(\u011f\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3"+
		".\5.\u0133\n.\3/\3/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\5\3\2@A\4\2@AEE\5\2\37\37$"+
		"$))\2\u012c\2^\3\2\2\2\4g\3\2\2\2\6i\3\2\2\2\br\3\2\2\2\nt\3\2\2\2\f}"+
		"\3\2\2\2\16\177\3\2\2\2\20\u0088\3\2\2\2\22\u008a\3\2\2\2\24\u0093\3\2"+
		"\2\2\26\u0095\3\2\2\2\30\u009e\3\2\2\2\32\u00a0\3\2\2\2\34\u00a9\3\2\2"+
		"\2\36\u00ab\3\2\2\2 \u00b4\3\2\2\2\"\u00b8\3\2\2\2$\u00c3\3\2\2\2&\u00c5"+
		"\3\2\2\2(\u00cc\3\2\2\2*\u00d4\3\2\2\2,\u00d9\3\2\2\2.\u00df\3\2\2\2\60"+
		"\u00e1\3\2\2\2\62\u00e3\3\2\2\2\64\u00e5\3\2\2\2\66\u00eb\3\2\2\28\u00ed"+
		"\3\2\2\2:\u00fa\3\2\2\2<\u0104\3\2\2\2>\u0108\3\2\2\2@\u010a\3\2\2\2B"+
		"\u010c\3\2\2\2D\u0112\3\2\2\2F\u0114\3\2\2\2H\u0116\3\2\2\2J\u0118\3\2"+
		"\2\2L\u011a\3\2\2\2N\u011e\3\2\2\2P\u0120\3\2\2\2R\u0122\3\2\2\2T\u0124"+
		"\3\2\2\2V\u0126\3\2\2\2X\u0128\3\2\2\2Z\u0132\3\2\2\2\\\u0134\3\2\2\2"+
		"^d\5\6\4\2_`\5\4\3\2`a\5\6\4\2ac\3\2\2\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2e\3\3\2\2\2fd\3\2\2\2gh\7\3\2\2h\5\3\2\2\2io\5\n\6\2jk\5\b\5"+
		"\2kl\5\n\6\2ln\3\2\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\7\3\2"+
		"\2\2qo\3\2\2\2rs\7\4\2\2s\t\3\2\2\2tz\5\16\b\2uv\5\f\7\2vw\5\16\b\2wy"+
		"\3\2\2\2xu\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\13\3\2\2\2|z\3\2\2\2"+
		"}~\7\5\2\2~\r\3\2\2\2\177\u0085\5\22\n\2\u0080\u0081\5\20\t\2\u0081\u0082"+
		"\5\22\n\2\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0087\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\17\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u0089\7\6\2\2\u0089\21\3\2\2\2\u008a\u0090\5\26\f\2\u008b"+
		"\u008c\5\24\13\2\u008c\u008d\5\26\f\2\u008d\u008f\3\2\2\2\u008e\u008b"+
		"\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\23\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\7\2\2\u0094\25\3\2\2\2\u0095"+
		"\u009b\5\32\16\2\u0096\u0097\5\30\r\2\u0097\u0098\5\32\16\2\u0098\u009a"+
		"\3\2\2\2\u0099\u0096\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\27\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\t\2\2"+
		"\2\u009f\31\3\2\2\2\u00a0\u00a6\5\36\20\2\u00a1\u00a2\5\34\17\2\u00a2"+
		"\u00a3\5\36\20\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5\u00a8\3"+
		"\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\33\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00aa\7\b\2\2\u00aa\35\3\2\2\2\u00ab\u00b0\5 \21"+
		"\2\u00ac\u00ad\7\t\2\2\u00ad\u00af\5 \21\2\u00ae\u00ac\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\37\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b5\5\"\22\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\5$\23\2\u00b7!\3\2\2\2\u00b8\u00b9"+
		"\t\3\2\2\u00b9#\3\2\2\2\u00ba\u00c4\5<\37\2\u00bb\u00c4\5.\30\2\u00bc"+
		"\u00c4\7S\2\2\u00bd\u00be\7F\2\2\u00be\u00bf\5\2\2\2\u00bf\u00c0\7G\2"+
		"\2\u00c0\u00c4\3\2\2\2\u00c1\u00c4\5&\24\2\u00c2\u00c4\5X-\2\u00c3\u00ba"+
		"\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4%\3\2\2\2\u00c5\u00c6\5*\26\2"+
		"\u00c6\u00c8\7F\2\2\u00c7\u00c9\5(\25\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7G\2\2\u00cb\'\3\2\2\2\u00cc"+
		"\u00d1\5,\27\2\u00cd\u00ce\7=\2\2\u00ce\u00d0\5,\27\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		")\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7R\2\2\u00d5+\3\2\2\2\u00d6"+
		"\u00d7\5.\30\2\u00d7\u00d8\7P\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d6\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\5\2\2\2\u00dc"+
		"-\3\2\2\2\u00dd\u00e0\5\62\32\2\u00de\u00e0\5\64\33\2\u00df\u00dd\3\2"+
		"\2\2\u00df\u00de\3\2\2\2\u00e0/\3\2\2\2\u00e1\u00e2\7R\2\2\u00e2\61\3"+
		"\2\2\2\u00e3\u00e4\7\34\2\2\u00e4\63\3\2\2\2\u00e5\u00e7\5\60\31\2\u00e6"+
		"\u00e8\5\66\34\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\65\3\2"+
		"\2\2\u00e9\u00ec\58\35\2\u00ea\u00ec\5:\36\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\67\3\2\2\2\u00ed\u00ee\7H\2\2\u00ee\u00f3\5\2\2\2"+
		"\u00ef\u00f0\7=\2\2\u00f0\u00f2\5\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00f8\7I\2\2\u00f7\u00f9\5\66\34\2\u00f8\u00f7\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f99\3\2\2\2\u00fa\u00fb\7:\2\2\u00fb\u00fd"+
		"\5\60\31\2\u00fc\u00fe\5\66\34\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2"+
		"\2\u00fe;\3\2\2\2\u00ff\u0105\5> \2\u0100\u0105\5N(\2\u0101\u0105\5D#"+
		"\2\u0102\u0105\5T+\2\u0103\u0105\5V,\2\u0104\u00ff\3\2\2\2\u0104\u0100"+
		"\3\2\2\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105"+
		"=\3\2\2\2\u0106\u0109\5@!\2\u0107\u0109\5B\"\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0107\3\2\2\2\u0109?\3\2\2\2\u010a\u010b\7\30\2\2\u010bA\3\2\2\2\u010c"+
		"\u010d\7\31\2\2\u010dC\3\2\2\2\u010e\u0113\5F$\2\u010f\u0113\5H%\2\u0110"+
		"\u0113\5J&\2\u0111\u0113\5L\'\2\u0112\u010e\3\2\2\2\u0112\u010f\3\2\2"+
		"\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113E\3\2\2\2\u0114\u0115"+
		"\7\17\2\2\u0115G\3\2\2\2\u0116\u0117\7\r\2\2\u0117I\3\2\2\2\u0118\u0119"+
		"\7\26\2\2\u0119K\3\2\2\2\u011a\u011b\7\27\2\2\u011bM\3\2\2\2\u011c\u011f"+
		"\5P)\2\u011d\u011f\5R*\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f"+
		"O\3\2\2\2\u0120\u0121\7\35\2\2\u0121Q\3\2\2\2\u0122\u0123\7\36\2\2\u0123"+
		"S\3\2\2\2\u0124\u0125\7\33\2\2\u0125U\3\2\2\2\u0126\u0127\7\32\2\2\u0127"+
		"W\3\2\2\2\u0128\u0129\5<\37\2\u0129\u012a\7:\2\2\u012a\u012b\7:\2\2\u012b"+
		"\u012c\5<\37\2\u012cY\3\2\2\2\u012d\u0133\5\\/\2\u012e\u0133\7,\2\2\u012f"+
		"\u0133\7\62\2\2\u0130\u0133\79\2\2\u0131\u0133\78\2\2\u0132\u012d\3\2"+
		"\2\2\u0132\u012e\3\2\2\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0131\3\2\2\2\u0133[\3\2\2\2\u0134\u0135\t\4\2\2\u0135]\3\2\2\2\32do"+
		"z\u0085\u0090\u009b\u00a6\u00b0\u00b4\u00c3\u00c8\u00d1\u00d9\u00df\u00e7"+
		"\u00eb\u00f3\u00f8\u00fd\u0104\u0108\u0112\u011e\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}