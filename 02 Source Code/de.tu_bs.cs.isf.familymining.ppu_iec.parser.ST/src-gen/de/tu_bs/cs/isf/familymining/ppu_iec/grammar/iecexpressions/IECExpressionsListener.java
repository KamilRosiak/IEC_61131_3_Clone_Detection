// Generated from IECExpressions.g4 by ANTLR 4.7.1
package de.tu_bs.cs.isf.familymining.ppu_iec.grammar.iecexpressions;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IECExpressionsParser}.
 */
public interface IECExpressionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(IECExpressionsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(IECExpressionsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#or_operator}.
	 * @param ctx the parse tree
	 */
	void enterOr_operator(IECExpressionsParser.Or_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#or_operator}.
	 * @param ctx the parse tree
	 */
	void exitOr_operator(IECExpressionsParser.Or_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#xor_expression}.
	 * @param ctx the parse tree
	 */
	void enterXor_expression(IECExpressionsParser.Xor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#xor_expression}.
	 * @param ctx the parse tree
	 */
	void exitXor_expression(IECExpressionsParser.Xor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#xor_operator}.
	 * @param ctx the parse tree
	 */
	void enterXor_operator(IECExpressionsParser.Xor_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#xor_operator}.
	 * @param ctx the parse tree
	 */
	void exitXor_operator(IECExpressionsParser.Xor_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(IECExpressionsParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(IECExpressionsParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#and_operator}.
	 * @param ctx the parse tree
	 */
	void enterAnd_operator(IECExpressionsParser.And_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#and_operator}.
	 * @param ctx the parse tree
	 */
	void exitAnd_operator(IECExpressionsParser.And_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(IECExpressionsParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(IECExpressionsParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#equ_operator}.
	 * @param ctx the parse tree
	 */
	void enterEqu_operator(IECExpressionsParser.Equ_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#equ_operator}.
	 * @param ctx the parse tree
	 */
	void exitEqu_operator(IECExpressionsParser.Equ_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#equ_expression}.
	 * @param ctx the parse tree
	 */
	void enterEqu_expression(IECExpressionsParser.Equ_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#equ_expression}.
	 * @param ctx the parse tree
	 */
	void exitEqu_expression(IECExpressionsParser.Equ_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(IECExpressionsParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(IECExpressionsParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expression(IECExpressionsParser.Add_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expression(IECExpressionsParser.Add_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#add_operator}.
	 * @param ctx the parse tree
	 */
	void enterAdd_operator(IECExpressionsParser.Add_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#add_operator}.
	 * @param ctx the parse tree
	 */
	void exitAdd_operator(IECExpressionsParser.Add_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(IECExpressionsParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(IECExpressionsParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#multiply_operator}.
	 * @param ctx the parse tree
	 */
	void enterMultiply_operator(IECExpressionsParser.Multiply_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#multiply_operator}.
	 * @param ctx the parse tree
	 */
	void exitMultiply_operator(IECExpressionsParser.Multiply_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#power_expression}.
	 * @param ctx the parse tree
	 */
	void enterPower_expression(IECExpressionsParser.Power_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#power_expression}.
	 * @param ctx the parse tree
	 */
	void exitPower_expression(IECExpressionsParser.Power_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(IECExpressionsParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(IECExpressionsParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(IECExpressionsParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(IECExpressionsParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(IECExpressionsParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(IECExpressionsParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(IECExpressionsParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(IECExpressionsParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(IECExpressionsParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(IECExpressionsParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(IECExpressionsParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(IECExpressionsParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#param_assignment}.
	 * @param ctx the parse tree
	 */
	void enterParam_assignment(IECExpressionsParser.Param_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#param_assignment}.
	 * @param ctx the parse tree
	 */
	void exitParam_assignment(IECExpressionsParser.Param_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(IECExpressionsParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(IECExpressionsParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(IECExpressionsParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(IECExpressionsParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#direct_variable}.
	 * @param ctx the parse tree
	 */
	void enterDirect_variable(IECExpressionsParser.Direct_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#direct_variable}.
	 * @param ctx the parse tree
	 */
	void exitDirect_variable(IECExpressionsParser.Direct_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#symbolic_variable}.
	 * @param ctx the parse tree
	 */
	void enterSymbolic_variable(IECExpressionsParser.Symbolic_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#symbolic_variable}.
	 * @param ctx the parse tree
	 */
	void exitSymbolic_variable(IECExpressionsParser.Symbolic_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#symbolic_variable_helper}.
	 * @param ctx the parse tree
	 */
	void enterSymbolic_variable_helper(IECExpressionsParser.Symbolic_variable_helperContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#symbolic_variable_helper}.
	 * @param ctx the parse tree
	 */
	void exitSymbolic_variable_helper(IECExpressionsParser.Symbolic_variable_helperContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#array_variable}.
	 * @param ctx the parse tree
	 */
	void enterArray_variable(IECExpressionsParser.Array_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#array_variable}.
	 * @param ctx the parse tree
	 */
	void exitArray_variable(IECExpressionsParser.Array_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#structured_variable}.
	 * @param ctx the parse tree
	 */
	void enterStructured_variable(IECExpressionsParser.Structured_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#structured_variable}.
	 * @param ctx the parse tree
	 */
	void exitStructured_variable(IECExpressionsParser.Structured_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(IECExpressionsParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(IECExpressionsParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(IECExpressionsParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(IECExpressionsParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(IECExpressionsParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(IECExpressionsParser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#real_literal}.
	 * @param ctx the parse tree
	 */
	void enterReal_literal(IECExpressionsParser.Real_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#real_literal}.
	 * @param ctx the parse tree
	 */
	void exitReal_literal(IECExpressionsParser.Real_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#time_literal}.
	 * @param ctx the parse tree
	 */
	void enterTime_literal(IECExpressionsParser.Time_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#time_literal}.
	 * @param ctx the parse tree
	 */
	void exitTime_literal(IECExpressionsParser.Time_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(IECExpressionsParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(IECExpressionsParser.DurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#time_of_day}.
	 * @param ctx the parse tree
	 */
	void enterTime_of_day(IECExpressionsParser.Time_of_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#time_of_day}.
	 * @param ctx the parse tree
	 */
	void exitTime_of_day(IECExpressionsParser.Time_of_dayContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(IECExpressionsParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(IECExpressionsParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#date_and_time}.
	 * @param ctx the parse tree
	 */
	void enterDate_and_time(IECExpressionsParser.Date_and_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#date_and_time}.
	 * @param ctx the parse tree
	 */
	void exitDate_and_time(IECExpressionsParser.Date_and_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#character_string}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_string(IECExpressionsParser.Character_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#character_string}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_string(IECExpressionsParser.Character_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#single_byte_char_string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_byte_char_string(IECExpressionsParser.Single_byte_char_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#single_byte_char_string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_byte_char_string(IECExpressionsParser.Single_byte_char_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#double_byte_char_string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_byte_char_string(IECExpressionsParser.Double_byte_char_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#double_byte_char_string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_byte_char_string(IECExpressionsParser.Double_byte_char_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#bit_string}.
	 * @param ctx the parse tree
	 */
	void enterBit_string(IECExpressionsParser.Bit_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#bit_string}.
	 * @param ctx the parse tree
	 */
	void exitBit_string(IECExpressionsParser.Bit_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(IECExpressionsParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(IECExpressionsParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#subrange}.
	 * @param ctx the parse tree
	 */
	void enterSubrange(IECExpressionsParser.SubrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#subrange}.
	 * @param ctx the parse tree
	 */
	void exitSubrange(IECExpressionsParser.SubrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#elem_type_name}.
	 * @param ctx the parse tree
	 */
	void enterElem_type_name(IECExpressionsParser.Elem_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#elem_type_name}.
	 * @param ctx the parse tree
	 */
	void exitElem_type_name(IECExpressionsParser.Elem_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link IECExpressionsParser#numeric_type_name}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_type_name(IECExpressionsParser.Numeric_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IECExpressionsParser#numeric_type_name}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_type_name(IECExpressionsParser.Numeric_type_nameContext ctx);
}