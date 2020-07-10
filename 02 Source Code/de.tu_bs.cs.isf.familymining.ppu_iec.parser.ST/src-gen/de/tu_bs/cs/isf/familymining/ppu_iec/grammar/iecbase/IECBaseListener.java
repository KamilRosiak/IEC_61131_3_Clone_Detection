// Generated from IECBase.g4 by ANTLR 4.7.1
package de.tu_bs.cs.isf.familymining.ppu_iec.grammar.iecbase;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IECBaseParser}.
 */
public interface IECBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(IECBaseParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(IECBaseParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(IECBaseParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(IECBaseParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(IECBaseParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(IECBaseParser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#real_literal}.
	 * @param ctx the parse tree
	 */
	void enterReal_literal(IECBaseParser.Real_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#real_literal}.
	 * @param ctx the parse tree
	 */
	void exitReal_literal(IECBaseParser.Real_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#time_literal}.
	 * @param ctx the parse tree
	 */
	void enterTime_literal(IECBaseParser.Time_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#time_literal}.
	 * @param ctx the parse tree
	 */
	void exitTime_literal(IECBaseParser.Time_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(IECBaseParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(IECBaseParser.DurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#time_of_day}.
	 * @param ctx the parse tree
	 */
	void enterTime_of_day(IECBaseParser.Time_of_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#time_of_day}.
	 * @param ctx the parse tree
	 */
	void exitTime_of_day(IECBaseParser.Time_of_dayContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(IECBaseParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(IECBaseParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#date_and_time}.
	 * @param ctx the parse tree
	 */
	void enterDate_and_time(IECBaseParser.Date_and_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#date_and_time}.
	 * @param ctx the parse tree
	 */
	void exitDate_and_time(IECBaseParser.Date_and_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#character_string}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_string(IECBaseParser.Character_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#character_string}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_string(IECBaseParser.Character_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#single_byte_char_string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_byte_char_string(IECBaseParser.Single_byte_char_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#single_byte_char_string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_byte_char_string(IECBaseParser.Single_byte_char_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#double_byte_char_string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_byte_char_string(IECBaseParser.Double_byte_char_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#double_byte_char_string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_byte_char_string(IECBaseParser.Double_byte_char_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#bit_string}.
	 * @param ctx the parse tree
	 */
	void enterBit_string(IECBaseParser.Bit_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#bit_string}.
	 * @param ctx the parse tree
	 */
	void exitBit_string(IECBaseParser.Bit_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(IECBaseParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(IECBaseParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#subrange}.
	 * @param ctx the parse tree
	 */
	void enterSubrange(IECBaseParser.SubrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#subrange}.
	 * @param ctx the parse tree
	 */
	void exitSubrange(IECBaseParser.SubrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#elem_type_name}.
	 * @param ctx the parse tree
	 */
	void enterElem_type_name(IECBaseParser.Elem_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#elem_type_name}.
	 * @param ctx the parse tree
	 */
	void exitElem_type_name(IECBaseParser.Elem_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECBaseParser#numeric_type_name}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_type_name(IECBaseParser.Numeric_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECBaseParser#numeric_type_name}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_type_name(IECBaseParser.Numeric_type_nameContext ctx);
}