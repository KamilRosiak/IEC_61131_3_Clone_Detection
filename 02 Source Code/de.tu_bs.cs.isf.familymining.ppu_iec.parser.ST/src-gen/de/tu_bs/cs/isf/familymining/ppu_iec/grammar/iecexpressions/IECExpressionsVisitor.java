// Generated from IECExpressions.g4 by ANTLR 4.7.1
package de.tu_bs.cs.isf.familymining.ppu_iec.grammar.iecexpressions;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IECExpressionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IECExpressionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(IECExpressionsParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#or_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_operator(IECExpressionsParser.Or_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#xor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expression(IECExpressionsParser.Xor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#xor_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_operator(IECExpressionsParser.Xor_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(IECExpressionsParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#and_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_operator(IECExpressionsParser.And_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(IECExpressionsParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#equ_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqu_operator(IECExpressionsParser.Equ_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#equ_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqu_expression(IECExpressionsParser.Equ_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(IECExpressionsParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#add_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expression(IECExpressionsParser.Add_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#add_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_operator(IECExpressionsParser.Add_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(IECExpressionsParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#multiply_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply_operator(IECExpressionsParser.Multiply_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#power_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower_expression(IECExpressionsParser.Power_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(IECExpressionsParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(IECExpressionsParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(IECExpressionsParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(IECExpressionsParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(IECExpressionsParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(IECExpressionsParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#param_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_assignment(IECExpressionsParser.Param_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(IECExpressionsParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(IECExpressionsParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#direct_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_variable(IECExpressionsParser.Direct_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#symbolic_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolic_variable(IECExpressionsParser.Symbolic_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#symbolic_variable_helper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolic_variable_helper(IECExpressionsParser.Symbolic_variable_helperContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#array_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_variable(IECExpressionsParser.Array_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#structured_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructured_variable(IECExpressionsParser.Structured_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(IECExpressionsParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(IECExpressionsParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(IECExpressionsParser.Integer_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#real_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_literal(IECExpressionsParser.Real_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#time_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_literal(IECExpressionsParser.Time_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration(IECExpressionsParser.DurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#time_of_day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_of_day(IECExpressionsParser.Time_of_dayContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(IECExpressionsParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#date_and_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_and_time(IECExpressionsParser.Date_and_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#character_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_string(IECExpressionsParser.Character_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#single_byte_char_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_byte_char_string(IECExpressionsParser.Single_byte_char_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#double_byte_char_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_byte_char_string(IECExpressionsParser.Double_byte_char_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#bit_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_string(IECExpressionsParser.Bit_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(IECExpressionsParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#subrange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrange(IECExpressionsParser.SubrangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#elem_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem_type_name(IECExpressionsParser.Elem_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link IECExpressionsParser#numeric_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_type_name(IECExpressionsParser.Numeric_type_nameContext ctx);
}