// Generated from STGrammar.g4 by ANTLR 4.7.1
package de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class STGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSIF=2, THEN=3, ELSE=4, END_IF=5, CASE=6, OF=7, END_CASE=8, WHILE=9, 
		DO=10, END_WHILE=11, FOR=12, TO=13, BY=14, END_FOR=15, REPEAT=16, UNTIL=17, 
		END_REPEAT=18, EXIT=19, RETURN=20, OR_OPERATOR=21, XOR_OPERATOR=22, AND_OPERATOR=23, 
		EQUALITY_OPERATOR=24, COMPARISON_OPERATOR=25, MULTIPLY_OPERATOR=26, POWER_OPERATOR=27, 
		WHITESPACE=28, SINGLE_COMMENT=29, MULTI_COMMENT=30, TIME_OF_DAY_LITERAL=31, 
		DAYTIME_LITERAL=32, DURATION=33, INTERVAL=34, DAYS=35, HOURS=36, MINUTES=37, 
		SECONDS=38, MILLISECONDS=39, DATE_LITERAL=40, DATE_AND_TIME_LITERAL=41, 
		INTEGER_LITERAL=42, REAL_LITERAL=43, BOOLEAN_LITERAL=44, BIT_STRING_LITERAL=45, 
		DIRECT_VAR=46, SINGLE_BYTE_CHAR_STRING=47, DOUBLE_BYTE_CHAR_STRING=48, 
		SIGNED_INTEGER_TYPE_NAME=49, SINT=50, INT=51, DINT=52, LINT=53, UNSIGNED_INTEGER_TYPE_NAME=54, 
		USINT=55, UINT=56, UDINT=57, ULINT=58, REAL_TYPE_NAME=59, REAL=60, LREAL=61, 
		DATE_TYPE_NAME=62, DATE=63, TIME_OF_DAY=64, TOD=65, DATE_AND_TIME=66, 
		DT=67, BIT_STRING_TYPE_NAME=68, BOOL=69, BYTE=70, WORD=71, DWORD=72, LWORD=73, 
		WSTRING=74, STRING=75, DOT=76, COLON=77, SEMICOLON=78, COMMA=79, UNDERSCORE=80, 
		HASH=81, PLUS=82, MINUS=83, BAR=84, OR=85, XOR=86, NOT=87, LPARENT=88, 
		RPARENT=89, LSQR_BRACKET=90, RSQR_BRACKET=91, LCURLY_BRACKET=92, RCURLY_BRACKET=93, 
		LT=94, GT=95, EQUAL=96, UNEQUAL=97, ASSIGN=98, NIL=99, IDENTIFIER=100, 
		ENUMERATED_VALUE=101, INT_NUMBER=102;
	public static final int
		RULE_statement_list = 0, RULE_statement = 1, RULE_assignment_statement = 2, 
		RULE_function_call_statement = 3, RULE_selection_statement = 4, RULE_if_statement_block = 5, 
		RULE_if_statement = 6, RULE_elseif_statement = 7, RULE_else_statement = 8, 
		RULE_case_statement_block = 9, RULE_case_element = 10, RULE_case_list_element = 11, 
		RULE_iteration_statement = 12, RULE_while_statement = 13, RULE_for_statement = 14, 
		RULE_for_header = 15, RULE_initial_value = 16, RULE_upper_bound = 17, 
		RULE_increment = 18, RULE_repeat_statement = 19, RULE_exit_statement = 20, 
		RULE_return_statement = 21, RULE_expression = 22, RULE_or_operator = 23, 
		RULE_xor_expression = 24, RULE_xor_operator = 25, RULE_and_expression = 26, 
		RULE_and_operator = 27, RULE_comparison = 28, RULE_equ_operator = 29, 
		RULE_equ_expression = 30, RULE_comparison_operator = 31, RULE_add_expression = 32, 
		RULE_add_operator = 33, RULE_term = 34, RULE_multiply_operator = 35, RULE_power_expression = 36, 
		RULE_unary_expression = 37, RULE_unary_operator = 38, RULE_primary_expression = 39, 
		RULE_function_call = 40, RULE_parameter_list = 41, RULE_function_name = 42, 
		RULE_param_assignment = 43, RULE_variable = 44, RULE_variable_name = 45, 
		RULE_direct_variable = 46, RULE_symbolic_variable = 47, RULE_symbolic_variable_helper = 48, 
		RULE_array_variable = 49, RULE_structured_variable = 50, RULE_constant = 51, 
		RULE_numeric_literal = 52, RULE_integer_literal = 53, RULE_real_literal = 54, 
		RULE_time_literal = 55, RULE_duration = 56, RULE_time_of_day = 57, RULE_date = 58, 
		RULE_date_and_time = 59, RULE_character_string = 60, RULE_single_byte_char_string = 61, 
		RULE_double_byte_char_string = 62, RULE_bit_string = 63, RULE_boolean_literal = 64, 
		RULE_subrange = 65, RULE_elem_type_name = 66, RULE_numeric_type_name = 67;
	public static final String[] ruleNames = {
		"statement_list", "statement", "assignment_statement", "function_call_statement", 
		"selection_statement", "if_statement_block", "if_statement", "elseif_statement", 
		"else_statement", "case_statement_block", "case_element", "case_list_element", 
		"iteration_statement", "while_statement", "for_statement", "for_header", 
		"initial_value", "upper_bound", "increment", "repeat_statement", "exit_statement", 
		"return_statement", "expression", "or_operator", "xor_expression", "xor_operator", 
		"and_expression", "and_operator", "comparison", "equ_operator", "equ_expression", 
		"comparison_operator", "add_expression", "add_operator", "term", "multiply_operator", 
		"power_expression", "unary_expression", "unary_operator", "primary_expression", 
		"function_call", "parameter_list", "function_name", "param_assignment", 
		"variable", "variable_name", "direct_variable", "symbolic_variable", "symbolic_variable_helper", 
		"array_variable", "structured_variable", "constant", "numeric_literal", 
		"integer_literal", "real_literal", "time_literal", "duration", "time_of_day", 
		"date", "date_and_time", "character_string", "single_byte_char_string", 
		"double_byte_char_string", "bit_string", "boolean_literal", "subrange", 
		"elem_type_name", "numeric_type_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'SINT'", "'INT'", "'DINT'", "'LINT'", null, "'USINT'", "'UINT'", 
		"'UDINT'", "'ULINT'", null, "'REAL'", "'LREAL'", null, "'DATE'", "'TIME_OF_DAY'", 
		"'TOD'", "'DATE_AND_TIME'", "'DT'", null, "'BOOL'", "'BYTE'", "'WORD'", 
		"'DWORD'", "'LWORD'", "'WSTRING'", "'STRING'", "'.'", "':'", "';'", "','", 
		"'_'", "'#'", "'+'", "'-'", "'|'", "'OR'", "'XOR'", "'NOT'", "'('", "')'", 
		"'['", "']'", "'{'", "'}'", null, null, "'='", "'<>'", "':='", "'NIL'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ELSIF", "THEN", "ELSE", "END_IF", "CASE", "OF", "END_CASE", 
		"WHILE", "DO", "END_WHILE", "FOR", "TO", "BY", "END_FOR", "REPEAT", "UNTIL", 
		"END_REPEAT", "EXIT", "RETURN", "OR_OPERATOR", "XOR_OPERATOR", "AND_OPERATOR", 
		"EQUALITY_OPERATOR", "COMPARISON_OPERATOR", "MULTIPLY_OPERATOR", "POWER_OPERATOR", 
		"WHITESPACE", "SINGLE_COMMENT", "MULTI_COMMENT", "TIME_OF_DAY_LITERAL", 
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
	public String getGrammarFileName() { return "STGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public STGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitStatement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(136);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(139); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(STGrammarParser.NIL, 0); }
		public Function_call_statementContext function_call_statement() {
			return getRuleContext(Function_call_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(STGrammarParser.SEMICOLON, 0); }
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public Exit_statementContext exit_statement() {
			return getRuleContext(Exit_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(NIL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				function_call_statement();
				setState(143);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				assignment_statement();
				setState(146);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				selection_statement();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(149);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				iteration_statement();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(153);
					match(SEMICOLON);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				exit_statement();
				setState(157);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				return_statement();
				setState(160);
				match(SEMICOLON);
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(STGrammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitAssignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			variable();
			setState(165);
			match(ASSIGN);
			setState(166);
			expression();
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

	public static class Function_call_statementContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(STGrammarParser.DOT, 0); }
		public Function_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterFunction_call_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitFunction_call_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitFunction_call_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_statementContext function_call_statement() throws RecognitionException {
		Function_call_statementContext _localctx = new Function_call_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_call_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(168);
				variable();
				setState(169);
				match(DOT);
				}
				break;
			}
			setState(173);
			function_call();
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

	public static class Selection_statementContext extends ParserRuleContext {
		public If_statement_blockContext if_statement_block() {
			return getRuleContext(If_statement_blockContext.class,0);
		}
		public Case_statement_blockContext case_statement_block() {
			return getRuleContext(Case_statement_blockContext.class,0);
		}
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitSelection_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitSelection_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selection_statement);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				if_statement_block();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				case_statement_block();
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

	public static class If_statement_blockContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public TerminalNode END_IF() { return getToken(STGrammarParser.END_IF, 0); }
		public List<Elseif_statementContext> elseif_statement() {
			return getRuleContexts(Elseif_statementContext.class);
		}
		public Elseif_statementContext elseif_statement(int i) {
			return getRuleContext(Elseif_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterIf_statement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitIf_statement_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitIf_statement_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statement_blockContext if_statement_block() throws RecognitionException {
		If_statement_blockContext _localctx = new If_statement_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_statement_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			if_statement();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(180);
				elseif_statement();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(186);
				else_statement();
				}
			}

			setState(189);
			match(END_IF);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(STGrammarParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(STGrammarParser.THEN, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(IF);
			setState(192);
			expression();
			setState(193);
			match(THEN);
			setState(194);
			statement_list();
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

	public static class Elseif_statementContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(STGrammarParser.ELSIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(STGrammarParser.THEN, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Elseif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterElseif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitElseif_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitElseif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_statementContext elseif_statement() throws RecognitionException {
		Elseif_statementContext _localctx = new Elseif_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ELSIF);
			setState(197);
			expression();
			setState(198);
			match(THEN);
			setState(199);
			statement_list();
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

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(STGrammarParser.ELSE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ELSE);
			setState(202);
			statement_list();
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

	public static class Case_statement_blockContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(STGrammarParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(STGrammarParser.OF, 0); }
		public TerminalNode END_CASE() { return getToken(STGrammarParser.END_CASE, 0); }
		public List<Case_elementContext> case_element() {
			return getRuleContexts(Case_elementContext.class);
		}
		public Case_elementContext case_element(int i) {
			return getRuleContext(Case_elementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public Case_statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterCase_statement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitCase_statement_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitCase_statement_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_statement_blockContext case_statement_block() throws RecognitionException {
		Case_statement_blockContext _localctx = new Case_statement_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_case_statement_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(CASE);
			setState(205);
			expression();
			setState(206);
			match(OF);
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207);
				case_element();
				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIME_OF_DAY_LITERAL) | (1L << DURATION) | (1L << DATE_LITERAL) | (1L << DATE_AND_TIME_LITERAL) | (1L << INTEGER_LITERAL) | (1L << REAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << BIT_STRING_LITERAL) | (1L << DIRECT_VAR) | (1L << SINGLE_BYTE_CHAR_STRING) | (1L << DOUBLE_BYTE_CHAR_STRING))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (PLUS - 82)) | (1L << (MINUS - 82)) | (1L << (NOT - 82)) | (1L << (LPARENT - 82)) | (1L << (IDENTIFIER - 82)) | (1L << (ENUMERATED_VALUE - 82)))) != 0) );
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(212);
				else_statement();
				}
			}

			setState(215);
			match(END_CASE);
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

	public static class Case_elementContext extends ParserRuleContext {
		public List<Case_list_elementContext> case_list_element() {
			return getRuleContexts(Case_list_elementContext.class);
		}
		public Case_list_elementContext case_list_element(int i) {
			return getRuleContext(Case_list_elementContext.class,i);
		}
		public TerminalNode COLON() { return getToken(STGrammarParser.COLON, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(STGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(STGrammarParser.COMMA, i);
		}
		public Case_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterCase_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitCase_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitCase_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_elementContext case_element() throws RecognitionException {
		Case_elementContext _localctx = new Case_elementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_case_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			case_list_element();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(218);
				match(COMMA);
				setState(219);
				case_list_element();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(COLON);
			setState(226);
			statement_list();
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

	public static class Case_list_elementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Case_list_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_list_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterCase_list_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitCase_list_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitCase_list_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_list_elementContext case_list_element() throws RecognitionException {
		Case_list_elementContext _localctx = new Case_list_elementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_case_list_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			expression();
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

	public static class Iteration_statementContext extends ParserRuleContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Repeat_statementContext repeat_statement() {
			return getRuleContext(Repeat_statementContext.class,0);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitIteration_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitIteration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_iteration_statement);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				for_statement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				repeat_statement();
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(STGrammarParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(STGrammarParser.DO, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode END_WHILE() { return getToken(STGrammarParser.END_WHILE, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(WHILE);
			setState(236);
			expression();
			setState(237);
			match(DO);
			setState(238);
			statement_list();
			setState(239);
			match(END_WHILE);
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

	public static class For_statementContext extends ParserRuleContext {
		public For_headerContext for_header() {
			return getRuleContext(For_headerContext.class,0);
		}
		public TerminalNode DO() { return getToken(STGrammarParser.DO, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode END_FOR() { return getToken(STGrammarParser.END_FOR, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			for_header();
			setState(242);
			match(DO);
			setState(243);
			statement_list();
			setState(244);
			match(END_FOR);
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

	public static class For_headerContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(STGrammarParser.FOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(STGrammarParser.ASSIGN, 0); }
		public Initial_valueContext initial_value() {
			return getRuleContext(Initial_valueContext.class,0);
		}
		public TerminalNode TO() { return getToken(STGrammarParser.TO, 0); }
		public Upper_boundContext upper_bound() {
			return getRuleContext(Upper_boundContext.class,0);
		}
		public TerminalNode BY() { return getToken(STGrammarParser.BY, 0); }
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public For_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterFor_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitFor_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitFor_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_headerContext for_header() throws RecognitionException {
		For_headerContext _localctx = new For_headerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(FOR);
			setState(247);
			expression();
			setState(248);
			match(ASSIGN);
			setState(249);
			initial_value();
			setState(250);
			match(TO);
			setState(251);
			upper_bound();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(252);
				match(BY);
				setState(253);
				increment();
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

	public static class Initial_valueContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Initial_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterInitial_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitInitial_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitInitial_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_valueContext initial_value() throws RecognitionException {
		Initial_valueContext _localctx = new Initial_valueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_initial_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			integer_literal();
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

	public static class Upper_boundContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Upper_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upper_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterUpper_bound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitUpper_bound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitUpper_bound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Upper_boundContext upper_bound() throws RecognitionException {
		Upper_boundContext _localctx = new Upper_boundContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_upper_bound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			integer_literal();
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

	public static class IncrementContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			integer_literal();
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

	public static class Repeat_statementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(STGrammarParser.REPEAT, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(STGrammarParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END_REPEAT() { return getToken(STGrammarParser.END_REPEAT, 0); }
		public Repeat_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterRepeat_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitRepeat_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitRepeat_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_statementContext repeat_statement() throws RecognitionException {
		Repeat_statementContext _localctx = new Repeat_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_repeat_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(REPEAT);
			setState(263);
			statement_list();
			setState(264);
			match(UNTIL);
			setState(265);
			expression();
			setState(266);
			match(END_REPEAT);
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

	public static class Exit_statementContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(STGrammarParser.EXIT, 0); }
		public Exit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterExit_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitExit_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitExit_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_statementContext exit_statement() throws RecognitionException {
		Exit_statementContext _localctx = new Exit_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exit_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(EXIT);
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(STGrammarParser.RETURN, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(RETURN);
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			xor_expression();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_OPERATOR) {
				{
				{
				setState(273);
				or_operator();
				setState(274);
				xor_expression();
				}
				}
				setState(280);
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
		public TerminalNode OR_OPERATOR() { return getToken(STGrammarParser.OR_OPERATOR, 0); }
		public Or_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterOr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitOr_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitOr_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_operatorContext or_operator() throws RecognitionException {
		Or_operatorContext _localctx = new Or_operatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_or_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterXor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitXor_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitXor_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_expressionContext xor_expression() throws RecognitionException {
		Xor_expressionContext _localctx = new Xor_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_xor_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			and_expression();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR_OPERATOR) {
				{
				{
				setState(284);
				xor_operator();
				setState(285);
				and_expression();
				}
				}
				setState(291);
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
		public TerminalNode XOR_OPERATOR() { return getToken(STGrammarParser.XOR_OPERATOR, 0); }
		public Xor_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterXor_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitXor_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitXor_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_operatorContext xor_operator() throws RecognitionException {
		Xor_operatorContext _localctx = new Xor_operatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_xor_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			comparison();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OPERATOR) {
				{
				{
				setState(295);
				and_operator();
				setState(296);
				comparison();
				}
				}
				setState(302);
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
		public TerminalNode AND_OPERATOR() { return getToken(STGrammarParser.AND_OPERATOR, 0); }
		public And_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterAnd_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitAnd_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitAnd_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_operatorContext and_operator() throws RecognitionException {
		And_operatorContext _localctx = new And_operatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_and_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			equ_expression();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALITY_OPERATOR) {
				{
				{
				setState(306);
				equ_operator();
				setState(307);
				equ_expression();
				}
				}
				setState(313);
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
		public TerminalNode EQUALITY_OPERATOR() { return getToken(STGrammarParser.EQUALITY_OPERATOR, 0); }
		public Equ_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equ_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterEqu_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitEqu_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitEqu_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equ_operatorContext equ_operator() throws RecognitionException {
		Equ_operatorContext _localctx = new Equ_operatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_equ_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterEqu_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitEqu_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitEqu_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equ_expressionContext equ_expression() throws RecognitionException {
		Equ_expressionContext _localctx = new Equ_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_equ_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			add_expression();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMPARISON_OPERATOR) {
				{
				{
				setState(317);
				comparison_operator();
				setState(318);
				add_expression();
				}
				}
				setState(324);
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
		public TerminalNode COMPARISON_OPERATOR() { return getToken(STGrammarParser.COMPARISON_OPERATOR, 0); }
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitComparison_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitComparison_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comparison_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterAdd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitAdd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitAdd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_expressionContext add_expression() throws RecognitionException {
		Add_expressionContext _localctx = new Add_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_add_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			term();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(328);
				add_operator();
				setState(329);
				term();
				}
				}
				setState(335);
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
		public TerminalNode PLUS() { return getToken(STGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(STGrammarParser.MINUS, 0); }
		public Add_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterAdd_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitAdd_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitAdd_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_operatorContext add_operator() throws RecognitionException {
		Add_operatorContext _localctx = new Add_operatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_add_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			power_expression();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLY_OPERATOR) {
				{
				{
				setState(339);
				multiply_operator();
				setState(340);
				power_expression();
				}
				}
				setState(346);
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
		public TerminalNode MULTIPLY_OPERATOR() { return getToken(STGrammarParser.MULTIPLY_OPERATOR, 0); }
		public Multiply_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterMultiply_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitMultiply_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitMultiply_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiply_operatorContext multiply_operator() throws RecognitionException {
		Multiply_operatorContext _localctx = new Multiply_operatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_multiply_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
		public List<TerminalNode> POWER_OPERATOR() { return getTokens(STGrammarParser.POWER_OPERATOR); }
		public TerminalNode POWER_OPERATOR(int i) {
			return getToken(STGrammarParser.POWER_OPERATOR, i);
		}
		public Power_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterPower_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitPower_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitPower_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Power_expressionContext power_expression() throws RecognitionException {
		Power_expressionContext _localctx = new Power_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_power_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			unary_expression();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POWER_OPERATOR) {
				{
				{
				setState(350);
				match(POWER_OPERATOR);
				setState(351);
				unary_expression();
				}
				}
				setState(356);
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_unary_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (PLUS - 82)) | (1L << (MINUS - 82)) | (1L << (NOT - 82)))) != 0)) {
				{
				setState(357);
				unary_operator();
				}
			}

			setState(360);
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
		public TerminalNode MINUS() { return getToken(STGrammarParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(STGrammarParser.PLUS, 0); }
		public TerminalNode NOT() { return getToken(STGrammarParser.NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (PLUS - 82)) | (1L << (MINUS - 82)) | (1L << (NOT - 82)))) != 0)) ) {
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
		public TerminalNode ENUMERATED_VALUE() { return getToken(STGrammarParser.ENUMERATED_VALUE, 0); }
		public TerminalNode LPARENT() { return getToken(STGrammarParser.LPARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(STGrammarParser.RPARENT, 0); }
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_primary_expression);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				match(ENUMERATED_VALUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(367);
				match(LPARENT);
				setState(368);
				expression();
				setState(369);
				match(RPARENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(371);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(372);
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
		public TerminalNode LPARENT() { return getToken(STGrammarParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(STGrammarParser.RPARENT, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			function_name();
			setState(376);
			match(LPARENT);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIME_OF_DAY_LITERAL) | (1L << DURATION) | (1L << DATE_LITERAL) | (1L << DATE_AND_TIME_LITERAL) | (1L << INTEGER_LITERAL) | (1L << REAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << BIT_STRING_LITERAL) | (1L << DIRECT_VAR) | (1L << SINGLE_BYTE_CHAR_STRING) | (1L << DOUBLE_BYTE_CHAR_STRING))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (PLUS - 82)) | (1L << (MINUS - 82)) | (1L << (NOT - 82)) | (1L << (LPARENT - 82)) | (1L << (IDENTIFIER - 82)) | (1L << (ENUMERATED_VALUE - 82)))) != 0)) {
				{
				setState(377);
				parameter_list();
				}
			}

			setState(380);
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
		public List<TerminalNode> COMMA() { return getTokens(STGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(STGrammarParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			param_assignment();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(383);
				match(COMMA);
				setState(384);
				param_assignment();
				}
				}
				setState(389);
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
		public TerminalNode IDENTIFIER() { return getToken(STGrammarParser.IDENTIFIER, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
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
		public TerminalNode ASSIGN() { return getToken(STGrammarParser.ASSIGN, 0); }
		public Param_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterParam_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitParam_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitParam_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_assignmentContext param_assignment() throws RecognitionException {
		Param_assignmentContext _localctx = new Param_assignmentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_param_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(392);
				variable();
				setState(393);
				match(ASSIGN);
				}
				break;
			}
			setState(397);
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variable);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRECT_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				direct_variable();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
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
		public TerminalNode IDENTIFIER() { return getToken(STGrammarParser.IDENTIFIER, 0); }
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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
		public TerminalNode DIRECT_VAR() { return getToken(STGrammarParser.DIRECT_VAR, 0); }
		public Direct_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterDirect_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitDirect_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitDirect_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Direct_variableContext direct_variable() throws RecognitionException {
		Direct_variableContext _localctx = new Direct_variableContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_direct_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterSymbolic_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitSymbolic_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitSymbolic_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Symbolic_variableContext symbolic_variable() throws RecognitionException {
		Symbolic_variableContext _localctx = new Symbolic_variableContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_symbolic_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			variable_name();
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(408);
				symbolic_variable_helper();
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterSymbolic_variable_helper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitSymbolic_variable_helper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitSymbolic_variable_helper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Symbolic_variable_helperContext symbolic_variable_helper() throws RecognitionException {
		Symbolic_variable_helperContext _localctx = new Symbolic_variable_helperContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_symbolic_variable_helper);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSQR_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				array_variable();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
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
		public TerminalNode LSQR_BRACKET() { return getToken(STGrammarParser.LSQR_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RSQR_BRACKET() { return getToken(STGrammarParser.RSQR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(STGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(STGrammarParser.COMMA, i);
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterArray_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitArray_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitArray_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_variableContext array_variable() throws RecognitionException {
		Array_variableContext _localctx = new Array_variableContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_array_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(LSQR_BRACKET);
			setState(416);
			expression();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(417);
				match(COMMA);
				setState(418);
				expression();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
			match(RSQR_BRACKET);
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(425);
				symbolic_variable_helper();
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

	public static class Structured_variableContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(STGrammarParser.DOT, 0); }
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterStructured_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitStructured_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitStructured_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structured_variableContext structured_variable() throws RecognitionException {
		Structured_variableContext _localctx = new Structured_variableContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_structured_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(DOT);
			setState(429);
			variable_name();
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(430);
				symbolic_variable_helper();
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_constant);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				numeric_literal();
				}
				break;
			case SINGLE_BYTE_CHAR_STRING:
			case DOUBLE_BYTE_CHAR_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				character_string();
				}
				break;
			case TIME_OF_DAY_LITERAL:
			case DURATION:
			case DATE_LITERAL:
			case DATE_AND_TIME_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				time_literal();
				}
				break;
			case BIT_STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				bit_string();
				}
				break;
			case BOOLEAN_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(437);
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_numeric_literal);
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				integer_literal();
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
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
		public TerminalNode INTEGER_LITERAL() { return getToken(STGrammarParser.INTEGER_LITERAL, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitInteger_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitInteger_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_integer_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
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
		public TerminalNode REAL_LITERAL() { return getToken(STGrammarParser.REAL_LITERAL, 0); }
		public Real_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterReal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitReal_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitReal_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_literalContext real_literal() throws RecognitionException {
		Real_literalContext _localctx = new Real_literalContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_real_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterTime_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitTime_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitTime_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_literalContext time_literal() throws RecognitionException {
		Time_literalContext _localctx = new Time_literalContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_time_literal);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DURATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				duration();
				}
				break;
			case TIME_OF_DAY_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				time_of_day();
				}
				break;
			case DATE_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				date();
				}
				break;
			case DATE_AND_TIME_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(451);
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
		public TerminalNode DURATION() { return getToken(STGrammarParser.DURATION, 0); }
		public DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
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
		public TerminalNode TIME_OF_DAY_LITERAL() { return getToken(STGrammarParser.TIME_OF_DAY_LITERAL, 0); }
		public Time_of_dayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_of_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterTime_of_day(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitTime_of_day(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitTime_of_day(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_of_dayContext time_of_day() throws RecognitionException {
		Time_of_dayContext _localctx = new Time_of_dayContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_time_of_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
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
		public TerminalNode DATE_LITERAL() { return getToken(STGrammarParser.DATE_LITERAL, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
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
		public TerminalNode DATE_AND_TIME_LITERAL() { return getToken(STGrammarParser.DATE_AND_TIME_LITERAL, 0); }
		public Date_and_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_and_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterDate_and_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitDate_and_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitDate_and_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_and_timeContext date_and_time() throws RecognitionException {
		Date_and_timeContext _localctx = new Date_and_timeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_date_and_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
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
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterCharacter_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitCharacter_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitCharacter_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Character_stringContext character_string() throws RecognitionException {
		Character_stringContext _localctx = new Character_stringContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_character_string);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_BYTE_CHAR_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				single_byte_char_string();
				}
				break;
			case DOUBLE_BYTE_CHAR_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
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
		public TerminalNode SINGLE_BYTE_CHAR_STRING() { return getToken(STGrammarParser.SINGLE_BYTE_CHAR_STRING, 0); }
		public Single_byte_char_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_byte_char_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterSingle_byte_char_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitSingle_byte_char_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitSingle_byte_char_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_byte_char_stringContext single_byte_char_string() throws RecognitionException {
		Single_byte_char_stringContext _localctx = new Single_byte_char_stringContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_single_byte_char_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
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
		public TerminalNode DOUBLE_BYTE_CHAR_STRING() { return getToken(STGrammarParser.DOUBLE_BYTE_CHAR_STRING, 0); }
		public Double_byte_char_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_byte_char_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterDouble_byte_char_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitDouble_byte_char_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitDouble_byte_char_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_byte_char_stringContext double_byte_char_string() throws RecognitionException {
		Double_byte_char_stringContext _localctx = new Double_byte_char_stringContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_double_byte_char_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
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
		public TerminalNode BIT_STRING_LITERAL() { return getToken(STGrammarParser.BIT_STRING_LITERAL, 0); }
		public Bit_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterBit_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitBit_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitBit_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_stringContext bit_string() throws RecognitionException {
		Bit_stringContext _localctx = new Bit_stringContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_bit_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
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
		public TerminalNode BOOLEAN_LITERAL() { return getToken(STGrammarParser.BOOLEAN_LITERAL, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_boolean_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
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
		public List<TerminalNode> DOT() { return getTokens(STGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(STGrammarParser.DOT, i);
		}
		public SubrangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterSubrange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitSubrange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitSubrange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrangeContext subrange() throws RecognitionException {
		SubrangeContext _localctx = new SubrangeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_subrange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			constant();
			setState(475);
			match(DOT);
			setState(476);
			match(DOT);
			setState(477);
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
		public TerminalNode DATE_TYPE_NAME() { return getToken(STGrammarParser.DATE_TYPE_NAME, 0); }
		public TerminalNode BIT_STRING_TYPE_NAME() { return getToken(STGrammarParser.BIT_STRING_TYPE_NAME, 0); }
		public TerminalNode STRING() { return getToken(STGrammarParser.STRING, 0); }
		public TerminalNode WSTRING() { return getToken(STGrammarParser.WSTRING, 0); }
		public Elem_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterElem_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitElem_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitElem_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elem_type_nameContext elem_type_name() throws RecognitionException {
		Elem_type_nameContext _localctx = new Elem_type_nameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_elem_type_name);
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGNED_INTEGER_TYPE_NAME:
			case UNSIGNED_INTEGER_TYPE_NAME:
			case REAL_TYPE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				numeric_type_name();
				}
				break;
			case DATE_TYPE_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(DATE_TYPE_NAME);
				}
				break;
			case BIT_STRING_TYPE_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				match(BIT_STRING_TYPE_NAME);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				match(STRING);
				}
				break;
			case WSTRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(483);
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
		public TerminalNode SIGNED_INTEGER_TYPE_NAME() { return getToken(STGrammarParser.SIGNED_INTEGER_TYPE_NAME, 0); }
		public TerminalNode UNSIGNED_INTEGER_TYPE_NAME() { return getToken(STGrammarParser.UNSIGNED_INTEGER_TYPE_NAME, 0); }
		public TerminalNode REAL_TYPE_NAME() { return getToken(STGrammarParser.REAL_TYPE_NAME, 0); }
		public Numeric_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).enterNumeric_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STGrammarListener ) ((STGrammarListener)listener).exitNumeric_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STGrammarVisitor ) return ((STGrammarVisitor<? extends T>)visitor).visitNumeric_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_type_nameContext numeric_type_name() throws RecognitionException {
		Numeric_type_nameContext _localctx = new Numeric_type_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_numeric_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3h\u01eb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\6\2\u008c\n\2\r\2"+
		"\16\2\u008d\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0099\n\3\3\3\3\3"+
		"\5\3\u009d\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00a5\n\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\5\5\u00ae\n\5\3\5\3\5\3\6\3\6\5\6\u00b4\n\6\3\7\3\7\7\7\u00b8"+
		"\n\7\f\7\16\7\u00bb\13\7\3\7\5\7\u00be\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\6\13\u00d3\n\13\r"+
		"\13\16\13\u00d4\3\13\5\13\u00d8\n\13\3\13\3\13\3\f\3\f\3\f\7\f\u00df\n"+
		"\f\f\f\16\f\u00e2\13\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\5\16\u00ec\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u0101\n\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\7\30\u0117\n\30\f\30\16\30\u011a\13\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\7\32\u0122\n\32\f\32\16\32\u0125\13\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\7\34\u012d\n\34\f\34\16\34\u0130\13\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\7\36\u0138\n\36\f\36\16\36\u013b\13\36\3\37\3\37\3 \3 \3 \3 \7 "+
		"\u0143\n \f \16 \u0146\13 \3!\3!\3\"\3\"\3\"\3\"\7\"\u014e\n\"\f\"\16"+
		"\"\u0151\13\"\3#\3#\3$\3$\3$\3$\7$\u0159\n$\f$\16$\u015c\13$\3%\3%\3&"+
		"\3&\3&\7&\u0163\n&\f&\16&\u0166\13&\3\'\5\'\u0169\n\'\3\'\3\'\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0178\n)\3*\3*\3*\5*\u017d\n*\3*\3*\3+\3"+
		"+\3+\7+\u0184\n+\f+\16+\u0187\13+\3,\3,\3-\3-\3-\5-\u018e\n-\3-\3-\3."+
		"\3.\5.\u0194\n.\3/\3/\3\60\3\60\3\61\3\61\5\61\u019c\n\61\3\62\3\62\5"+
		"\62\u01a0\n\62\3\63\3\63\3\63\3\63\7\63\u01a6\n\63\f\63\16\63\u01a9\13"+
		"\63\3\63\3\63\5\63\u01ad\n\63\3\64\3\64\3\64\5\64\u01b2\n\64\3\65\3\65"+
		"\3\65\3\65\3\65\5\65\u01b9\n\65\3\66\3\66\5\66\u01bd\n\66\3\67\3\67\3"+
		"8\38\39\39\39\39\59\u01c7\n9\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\5>\u01d3\n"+
		">\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\5D\u01e7\nD\3"+
		"E\3E\3E\2\2F\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\2\5\3\2TU\4\2TUYY\5\2\63\6388==\2\u01dd\2\u008b\3\2\2\2\4\u00a4\3\2\2"+
		"\2\6\u00a6\3\2\2\2\b\u00ad\3\2\2\2\n\u00b3\3\2\2\2\f\u00b5\3\2\2\2\16"+
		"\u00c1\3\2\2\2\20\u00c6\3\2\2\2\22\u00cb\3\2\2\2\24\u00ce\3\2\2\2\26\u00db"+
		"\3\2\2\2\30\u00e6\3\2\2\2\32\u00eb\3\2\2\2\34\u00ed\3\2\2\2\36\u00f3\3"+
		"\2\2\2 \u00f8\3\2\2\2\"\u0102\3\2\2\2$\u0104\3\2\2\2&\u0106\3\2\2\2(\u0108"+
		"\3\2\2\2*\u010e\3\2\2\2,\u0110\3\2\2\2.\u0112\3\2\2\2\60\u011b\3\2\2\2"+
		"\62\u011d\3\2\2\2\64\u0126\3\2\2\2\66\u0128\3\2\2\28\u0131\3\2\2\2:\u0133"+
		"\3\2\2\2<\u013c\3\2\2\2>\u013e\3\2\2\2@\u0147\3\2\2\2B\u0149\3\2\2\2D"+
		"\u0152\3\2\2\2F\u0154\3\2\2\2H\u015d\3\2\2\2J\u015f\3\2\2\2L\u0168\3\2"+
		"\2\2N\u016c\3\2\2\2P\u0177\3\2\2\2R\u0179\3\2\2\2T\u0180\3\2\2\2V\u0188"+
		"\3\2\2\2X\u018d\3\2\2\2Z\u0193\3\2\2\2\\\u0195\3\2\2\2^\u0197\3\2\2\2"+
		"`\u0199\3\2\2\2b\u019f\3\2\2\2d\u01a1\3\2\2\2f\u01ae\3\2\2\2h\u01b8\3"+
		"\2\2\2j\u01bc\3\2\2\2l\u01be\3\2\2\2n\u01c0\3\2\2\2p\u01c6\3\2\2\2r\u01c8"+
		"\3\2\2\2t\u01ca\3\2\2\2v\u01cc\3\2\2\2x\u01ce\3\2\2\2z\u01d2\3\2\2\2|"+
		"\u01d4\3\2\2\2~\u01d6\3\2\2\2\u0080\u01d8\3\2\2\2\u0082\u01da\3\2\2\2"+
		"\u0084\u01dc\3\2\2\2\u0086\u01e6\3\2\2\2\u0088\u01e8\3\2\2\2\u008a\u008c"+
		"\5\4\3\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\3\3\2\2\2\u008f\u00a5\7e\2\2\u0090\u0091\5\b\5\2"+
		"\u0091\u0092\7P\2\2\u0092\u00a5\3\2\2\2\u0093\u0094\5\6\4\2\u0094\u0095"+
		"\7P\2\2\u0095\u00a5\3\2\2\2\u0096\u0098\5\n\6\2\u0097\u0099\7P\2\2\u0098"+
		"\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a5\3\2\2\2\u009a\u009c\5\32"+
		"\16\2\u009b\u009d\7P\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00a5\3\2\2\2\u009e\u009f\5*\26\2\u009f\u00a0\7P\2\2\u00a0\u00a5\3\2"+
		"\2\2\u00a1\u00a2\5,\27\2\u00a2\u00a3\7P\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u008f\3\2\2\2\u00a4\u0090\3\2\2\2\u00a4\u0093\3\2\2\2\u00a4\u0096\3\2"+
		"\2\2\u00a4\u009a\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5"+
		"\5\3\2\2\2\u00a6\u00a7\5Z.\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\5.\30\2\u00a9"+
		"\7\3\2\2\2\u00aa\u00ab\5Z.\2\u00ab\u00ac\7N\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00aa\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\5R"+
		"*\2\u00b0\t\3\2\2\2\u00b1\u00b4\5\f\7\2\u00b2\u00b4\5\24\13\2\u00b3\u00b1"+
		"\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\13\3\2\2\2\u00b5\u00b9\5\16\b\2\u00b6"+
		"\u00b8\5\20\t\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00be\5\22\n\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3"+
		"\2\2\2\u00bf\u00c0\7\7\2\2\u00c0\r\3\2\2\2\u00c1\u00c2\7\3\2\2\u00c2\u00c3"+
		"\5.\30\2\u00c3\u00c4\7\5\2\2\u00c4\u00c5\5\2\2\2\u00c5\17\3\2\2\2\u00c6"+
		"\u00c7\7\4\2\2\u00c7\u00c8\5.\30\2\u00c8\u00c9\7\5\2\2\u00c9\u00ca\5\2"+
		"\2\2\u00ca\21\3\2\2\2\u00cb\u00cc\7\6\2\2\u00cc\u00cd\5\2\2\2\u00cd\23"+
		"\3\2\2\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\5.\30\2\u00d0\u00d2\7\t\2\2\u00d1"+
		"\u00d3\5\26\f\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d8\5\22\n\2\u00d7"+
		"\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\n"+
		"\2\2\u00da\25\3\2\2\2\u00db\u00e0\5\30\r\2\u00dc\u00dd\7Q\2\2\u00dd\u00df"+
		"\5\30\r\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4"+
		"\7O\2\2\u00e4\u00e5\5\2\2\2\u00e5\27\3\2\2\2\u00e6\u00e7\5.\30\2\u00e7"+
		"\31\3\2\2\2\u00e8\u00ec\5\34\17\2\u00e9\u00ec\5\36\20\2\u00ea\u00ec\5"+
		"(\25\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\33\3\2\2\2\u00ed\u00ee\7\13\2\2\u00ee\u00ef\5.\30\2\u00ef\u00f0\7\f\2"+
		"\2\u00f0\u00f1\5\2\2\2\u00f1\u00f2\7\r\2\2\u00f2\35\3\2\2\2\u00f3\u00f4"+
		"\5 \21\2\u00f4\u00f5\7\f\2\2\u00f5\u00f6\5\2\2\2\u00f6\u00f7\7\21\2\2"+
		"\u00f7\37\3\2\2\2\u00f8\u00f9\7\16\2\2\u00f9\u00fa\5.\30\2\u00fa\u00fb"+
		"\7d\2\2\u00fb\u00fc\5\"\22\2\u00fc\u00fd\7\17\2\2\u00fd\u0100\5$\23\2"+
		"\u00fe\u00ff\7\20\2\2\u00ff\u0101\5&\24\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101!\3\2\2\2\u0102\u0103\5l\67\2\u0103#\3\2\2\2\u0104\u0105"+
		"\5l\67\2\u0105%\3\2\2\2\u0106\u0107\5l\67\2\u0107\'\3\2\2\2\u0108\u0109"+
		"\7\22\2\2\u0109\u010a\5\2\2\2\u010a\u010b\7\23\2\2\u010b\u010c\5.\30\2"+
		"\u010c\u010d\7\24\2\2\u010d)\3\2\2\2\u010e\u010f\7\25\2\2\u010f+\3\2\2"+
		"\2\u0110\u0111\7\26\2\2\u0111-\3\2\2\2\u0112\u0118\5\62\32\2\u0113\u0114"+
		"\5\60\31\2\u0114\u0115\5\62\32\2\u0115\u0117\3\2\2\2\u0116\u0113\3\2\2"+
		"\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119/"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\27\2\2\u011c\61\3\2\2\2\u011d"+
		"\u0123\5\66\34\2\u011e\u011f\5\64\33\2\u011f\u0120\5\66\34\2\u0120\u0122"+
		"\3\2\2\2\u0121\u011e\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\63\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\30\2"+
		"\2\u0127\65\3\2\2\2\u0128\u012e\5:\36\2\u0129\u012a\58\35\2\u012a\u012b"+
		"\5:\36\2\u012b\u012d\3\2\2\2\u012c\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\67\3\2\2\2\u0130\u012e\3\2\2"+
		"\2\u0131\u0132\7\31\2\2\u01329\3\2\2\2\u0133\u0139\5> \2\u0134\u0135\5"+
		"<\37\2\u0135\u0136\5> \2\u0136\u0138\3\2\2\2\u0137\u0134\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a;\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013c\u013d\7\32\2\2\u013d=\3\2\2\2\u013e\u0144\5"+
		"B\"\2\u013f\u0140\5@!\2\u0140\u0141\5B\"\2\u0141\u0143\3\2\2\2\u0142\u013f"+
		"\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"?\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\33\2\2\u0148A\3\2\2\2\u0149"+
		"\u014f\5F$\2\u014a\u014b\5D#\2\u014b\u014c\5F$\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014a\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150C\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\t\2\2\2\u0153E\3\2"+
		"\2\2\u0154\u015a\5J&\2\u0155\u0156\5H%\2\u0156\u0157\5J&\2\u0157\u0159"+
		"\3\2\2\2\u0158\u0155\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015bG\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7\34\2\2"+
		"\u015eI\3\2\2\2\u015f\u0164\5L\'\2\u0160\u0161\7\35\2\2\u0161\u0163\5"+
		"L\'\2\u0162\u0160\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165K\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\5N(\2\u0168"+
		"\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\5P"+
		")\2\u016bM\3\2\2\2\u016c\u016d\t\3\2\2\u016dO\3\2\2\2\u016e\u0178\5h\65"+
		"\2\u016f\u0178\5Z.\2\u0170\u0178\7g\2\2\u0171\u0172\7Z\2\2\u0172\u0173"+
		"\5.\30\2\u0173\u0174\7[\2\2\u0174\u0178\3\2\2\2\u0175\u0178\5R*\2\u0176"+
		"\u0178\5\u0084C\2\u0177\u016e\3\2\2\2\u0177\u016f\3\2\2\2\u0177\u0170"+
		"\3\2\2\2\u0177\u0171\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178"+
		"Q\3\2\2\2\u0179\u017a\5V,\2\u017a\u017c\7Z\2\2\u017b\u017d\5T+\2\u017c"+
		"\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\7["+
		"\2\2\u017fS\3\2\2\2\u0180\u0185\5X-\2\u0181\u0182\7Q\2\2\u0182\u0184\5"+
		"X-\2\u0183\u0181\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186U\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7f\2\2\u0189"+
		"W\3\2\2\2\u018a\u018b\5Z.\2\u018b\u018c\7d\2\2\u018c\u018e\3\2\2\2\u018d"+
		"\u018a\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\5."+
		"\30\2\u0190Y\3\2\2\2\u0191\u0194\5^\60\2\u0192\u0194\5`\61\2\u0193\u0191"+
		"\3\2\2\2\u0193\u0192\3\2\2\2\u0194[\3\2\2\2\u0195\u0196\7f\2\2\u0196]"+
		"\3\2\2\2\u0197\u0198\7\60\2\2\u0198_\3\2\2\2\u0199\u019b\5\\/\2\u019a"+
		"\u019c\5b\62\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019ca\3\2\2\2"+
		"\u019d\u01a0\5d\63\2\u019e\u01a0\5f\64\2\u019f\u019d\3\2\2\2\u019f\u019e"+
		"\3\2\2\2\u01a0c\3\2\2\2\u01a1\u01a2\7\\\2\2\u01a2\u01a7\5.\30\2\u01a3"+
		"\u01a4\7Q\2\2\u01a4\u01a6\5.\30\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01aa\u01ac\7]\2\2\u01ab\u01ad\5b\62\2\u01ac\u01ab\3\2"+
		"\2\2\u01ac\u01ad\3\2\2\2\u01ade\3\2\2\2\u01ae\u01af\7N\2\2\u01af\u01b1"+
		"\5\\/\2\u01b0\u01b2\5b\62\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"g\3\2\2\2\u01b3\u01b9\5j\66\2\u01b4\u01b9\5z>\2\u01b5\u01b9\5p9\2\u01b6"+
		"\u01b9\5\u0080A\2\u01b7\u01b9\5\u0082B\2\u01b8\u01b3\3\2\2\2\u01b8\u01b4"+
		"\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"i\3\2\2\2\u01ba\u01bd\5l\67\2\u01bb\u01bd\5n8\2\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bb\3\2\2\2\u01bdk\3\2\2\2\u01be\u01bf\7,\2\2\u01bfm\3\2\2\2\u01c0"+
		"\u01c1\7-\2\2\u01c1o\3\2\2\2\u01c2\u01c7\5r:\2\u01c3\u01c7\5t;\2\u01c4"+
		"\u01c7\5v<\2\u01c5\u01c7\5x=\2\u01c6\u01c2\3\2\2\2\u01c6\u01c3\3\2\2\2"+
		"\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7q\3\2\2\2\u01c8\u01c9\7"+
		"#\2\2\u01c9s\3\2\2\2\u01ca\u01cb\7!\2\2\u01cbu\3\2\2\2\u01cc\u01cd\7*"+
		"\2\2\u01cdw\3\2\2\2\u01ce\u01cf\7+\2\2\u01cfy\3\2\2\2\u01d0\u01d3\5|?"+
		"\2\u01d1\u01d3\5~@\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3{\3"+
		"\2\2\2\u01d4\u01d5\7\61\2\2\u01d5}\3\2\2\2\u01d6\u01d7\7\62\2\2\u01d7"+
		"\177\3\2\2\2\u01d8\u01d9\7/\2\2\u01d9\u0081\3\2\2\2\u01da\u01db\7.\2\2"+
		"\u01db\u0083\3\2\2\2\u01dc\u01dd\5h\65\2\u01dd\u01de\7N\2\2\u01de\u01df"+
		"\7N\2\2\u01df\u01e0\5h\65\2\u01e0\u0085\3\2\2\2\u01e1\u01e7\5\u0088E\2"+
		"\u01e2\u01e7\7@\2\2\u01e3\u01e7\7F\2\2\u01e4\u01e7\7M\2\2\u01e5\u01e7"+
		"\7L\2\2\u01e6\u01e1\3\2\2\2\u01e6\u01e2\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7\u0087\3\2\2\2\u01e8\u01e9\t\4"+
		"\2\2\u01e9\u0089\3\2\2\2\'\u008d\u0098\u009c\u00a4\u00ad\u00b3\u00b9\u00bd"+
		"\u00d4\u00d7\u00e0\u00eb\u0100\u0118\u0123\u012e\u0139\u0144\u014f\u015a"+
		"\u0164\u0168\u0177\u017c\u0185\u018d\u0193\u019b\u019f\u01a7\u01ac\u01b1"+
		"\u01b8\u01bc\u01c6\u01d2\u01e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}