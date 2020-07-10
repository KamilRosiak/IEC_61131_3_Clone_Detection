// Generated from IECBase.g4 by ANTLR 4.7.1
package de.tu_bs.cs.isf.familymining.ppu_iec.grammar.iecbase;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IECBaseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IECBaseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(IECBaseParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(IECBaseParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(IECBaseParser.Integer_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#real_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_literal(IECBaseParser.Real_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#time_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_literal(IECBaseParser.Time_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration(IECBaseParser.DurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#time_of_day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_of_day(IECBaseParser.Time_of_dayContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(IECBaseParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#date_and_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_and_time(IECBaseParser.Date_and_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#character_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_string(IECBaseParser.Character_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#single_byte_char_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_byte_char_string(IECBaseParser.Single_byte_char_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#double_byte_char_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_byte_char_string(IECBaseParser.Double_byte_char_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#bit_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_string(IECBaseParser.Bit_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(IECBaseParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#subrange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrange(IECBaseParser.SubrangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#elem_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem_type_name(IECBaseParser.Elem_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECBaseParser#numeric_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_type_name(IECBaseParser.Numeric_type_nameContext ctx);
}