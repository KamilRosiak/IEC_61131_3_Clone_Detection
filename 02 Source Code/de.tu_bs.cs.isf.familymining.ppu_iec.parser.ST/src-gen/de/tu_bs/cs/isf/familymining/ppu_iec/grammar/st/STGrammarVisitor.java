// Generated from STGrammar.g4 by ANTLR 4.7.1
package de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link STGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface STGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(STGrammarParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(STGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(STGrammarParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#function_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_statement(STGrammarParser.Function_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(STGrammarParser.Selection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#if_statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement_block(STGrammarParser.If_statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(STGrammarParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#elseif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_statement(STGrammarParser.Elseif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(STGrammarParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#case_statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement_block(STGrammarParser.Case_statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#case_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_element(STGrammarParser.Case_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#case_list_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_list_element(STGrammarParser.Case_list_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement(STGrammarParser.Iteration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(STGrammarParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(STGrammarParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#for_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_header(STGrammarParser.For_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#initial_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_value(STGrammarParser.Initial_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#upper_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpper_bound(STGrammarParser.Upper_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(STGrammarParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#repeat_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_statement(STGrammarParser.Repeat_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#exit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement(STGrammarParser.Exit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(STGrammarParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(STGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#or_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_operator(STGrammarParser.Or_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#xor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expression(STGrammarParser.Xor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#xor_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_operator(STGrammarParser.Xor_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(STGrammarParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#and_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_operator(STGrammarParser.And_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(STGrammarParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#equ_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqu_operator(STGrammarParser.Equ_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#equ_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqu_expression(STGrammarParser.Equ_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(STGrammarParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#add_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expression(STGrammarParser.Add_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#add_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_operator(STGrammarParser.Add_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(STGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#multiply_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply_operator(STGrammarParser.Multiply_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#power_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower_expression(STGrammarParser.Power_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(STGrammarParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(STGrammarParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(STGrammarParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(STGrammarParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(STGrammarParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(STGrammarParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#param_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_assignment(STGrammarParser.Param_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(STGrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(STGrammarParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#direct_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_variable(STGrammarParser.Direct_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#symbolic_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolic_variable(STGrammarParser.Symbolic_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#symbolic_variable_helper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolic_variable_helper(STGrammarParser.Symbolic_variable_helperContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#array_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_variable(STGrammarParser.Array_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#structured_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructured_variable(STGrammarParser.Structured_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(STGrammarParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(STGrammarParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(STGrammarParser.Integer_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#real_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_literal(STGrammarParser.Real_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#time_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_literal(STGrammarParser.Time_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration(STGrammarParser.DurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#time_of_day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_of_day(STGrammarParser.Time_of_dayContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(STGrammarParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#date_and_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_and_time(STGrammarParser.Date_and_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#character_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_string(STGrammarParser.Character_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#single_byte_char_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_byte_char_string(STGrammarParser.Single_byte_char_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#double_byte_char_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_byte_char_string(STGrammarParser.Double_byte_char_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#bit_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_string(STGrammarParser.Bit_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(STGrammarParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#subrange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrange(STGrammarParser.SubrangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#elem_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem_type_name(STGrammarParser.Elem_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link STGrammarParser#numeric_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_type_name(STGrammarParser.Numeric_type_nameContext ctx);
}