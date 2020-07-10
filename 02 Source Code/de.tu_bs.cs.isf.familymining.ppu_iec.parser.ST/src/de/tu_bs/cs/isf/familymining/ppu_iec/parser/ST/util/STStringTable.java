package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util;

public abstract class STStringTable {
	/**
	 * Plugin
	 */
	public static final String PARSER_EXTENSION_ID = "STParser";
	public final static String STATEMENTS_CALLABACK_EXTENSION_ID = "STNodeCallback";
	public final static String VARIABLE_CALLBACK_EXTENSION_ID = "STVariableCallback"; 
	public final static String EXPRESSION_CALLBACK_EXTENSION_ID = "STExpressionCallback"; 

	/**
	 * Parser Node 
	 */
	public static final String RULE_ATTRIBUTE = "rule";
	public static final String IS_HIDDEN_ATTRIBUTE = "hidden";
	public static final String TOKEN_START_ATTRIBUTE = "tokenStart";
	public static final String TOKEN_END_ATTRIBUTE = "tokenEnd";
	public static final String TOKEN_ATTRIBUTE = "token";
	public static final String ABSOLUTE_START_LINE = "absStartLine";
	public static final String ABSOLUTE_END_LINE = "absEndLine";
	public static final String CHAR_START_POSITION_IN_LINE = "charStartPosition";
	public static final String CHAR_END_POSITION_IN_LINE = "charEndPosition";
	
	/**
	 * Grammar
	 */
	public static final String STARTING_RULE = "statement_list";
	
	/**
	 * Initialization Data
	 */
	public static final String INIT_RULE = "initRule";
}
