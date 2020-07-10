// Generated from STGrammar.g4 by ANTLR 4.7.1
package de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link STGrammarParser}.
 */
public interface STGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(STGrammarParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(STGrammarParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(STGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(STGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(STGrammarParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(STGrammarParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_statement(STGrammarParser.Function_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#function_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_statement(STGrammarParser.Function_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(STGrammarParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(STGrammarParser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#if_statement_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement_block(STGrammarParser.If_statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#if_statement_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement_block(STGrammarParser.If_statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(STGrammarParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(STGrammarParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#elseif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElseif_statement(STGrammarParser.Elseif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#elseif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElseif_statement(STGrammarParser.Elseif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(STGrammarParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(STGrammarParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#case_statement_block}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_block(STGrammarParser.Case_statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#case_statement_block}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_block(STGrammarParser.Case_statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#case_element}.
	 * @param ctx the parse tree
	 */
	void enterCase_element(STGrammarParser.Case_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#case_element}.
	 * @param ctx the parse tree
	 */
	void exitCase_element(STGrammarParser.Case_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#case_list_element}.
	 * @param ctx the parse tree
	 */
	void enterCase_list_element(STGrammarParser.Case_list_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#case_list_element}.
	 * @param ctx the parse tree
	 */
	void exitCase_list_element(STGrammarParser.Case_list_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(STGrammarParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(STGrammarParser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(STGrammarParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(STGrammarParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(STGrammarParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(STGrammarParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#for_header}.
	 * @param ctx the parse tree
	 */
	void enterFor_header(STGrammarParser.For_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#for_header}.
	 * @param ctx the parse tree
	 */
	void exitFor_header(STGrammarParser.For_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#initial_value}.
	 * @param ctx the parse tree
	 */
	void enterInitial_value(STGrammarParser.Initial_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#initial_value}.
	 * @param ctx the parse tree
	 */
	void exitInitial_value(STGrammarParser.Initial_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void enterUpper_bound(STGrammarParser.Upper_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void exitUpper_bound(STGrammarParser.Upper_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(STGrammarParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(STGrammarParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_statement(STGrammarParser.Repeat_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#repeat_statement}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_statement(STGrammarParser.Repeat_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(STGrammarParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(STGrammarParser.Exit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(STGrammarParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(STGrammarParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(STGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(STGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#or_operator}.
	 * @param ctx the parse tree
	 */
	void enterOr_operator(STGrammarParser.Or_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#or_operator}.
	 * @param ctx the parse tree
	 */
	void exitOr_operator(STGrammarParser.Or_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#xor_expression}.
	 * @param ctx the parse tree
	 */
	void enterXor_expression(STGrammarParser.Xor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#xor_expression}.
	 * @param ctx the parse tree
	 */
	void exitXor_expression(STGrammarParser.Xor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#xor_operator}.
	 * @param ctx the parse tree
	 */
	void enterXor_operator(STGrammarParser.Xor_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#xor_operator}.
	 * @param ctx the parse tree
	 */
	void exitXor_operator(STGrammarParser.Xor_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(STGrammarParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(STGrammarParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#and_operator}.
	 * @param ctx the parse tree
	 */
	void enterAnd_operator(STGrammarParser.And_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#and_operator}.
	 * @param ctx the parse tree
	 */
	void exitAnd_operator(STGrammarParser.And_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(STGrammarParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(STGrammarParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#equ_operator}.
	 * @param ctx the parse tree
	 */
	void enterEqu_operator(STGrammarParser.Equ_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#equ_operator}.
	 * @param ctx the parse tree
	 */
	void exitEqu_operator(STGrammarParser.Equ_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#equ_expression}.
	 * @param ctx the parse tree
	 */
	void enterEqu_expression(STGrammarParser.Equ_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#equ_expression}.
	 * @param ctx the parse tree
	 */
	void exitEqu_expression(STGrammarParser.Equ_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(STGrammarParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(STGrammarParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expression(STGrammarParser.Add_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#add_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expression(STGrammarParser.Add_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#add_operator}.
	 * @param ctx the parse tree
	 */
	void enterAdd_operator(STGrammarParser.Add_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#add_operator}.
	 * @param ctx the parse tree
	 */
	void exitAdd_operator(STGrammarParser.Add_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(STGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(STGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#multiply_operator}.
	 * @param ctx the parse tree
	 */
	void enterMultiply_operator(STGrammarParser.Multiply_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#multiply_operator}.
	 * @param ctx the parse tree
	 */
	void exitMultiply_operator(STGrammarParser.Multiply_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#power_expression}.
	 * @param ctx the parse tree
	 */
	void enterPower_expression(STGrammarParser.Power_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#power_expression}.
	 * @param ctx the parse tree
	 */
	void exitPower_expression(STGrammarParser.Power_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(STGrammarParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(STGrammarParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(STGrammarParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(STGrammarParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(STGrammarParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(STGrammarParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(STGrammarParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(STGrammarParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(STGrammarParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(STGrammarParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(STGrammarParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(STGrammarParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#param_assignment}.
	 * @param ctx the parse tree
	 */
	void enterParam_assignment(STGrammarParser.Param_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#param_assignment}.
	 * @param ctx the parse tree
	 */
	void exitParam_assignment(STGrammarParser.Param_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(STGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(STGrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(STGrammarParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(STGrammarParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#direct_variable}.
	 * @param ctx the parse tree
	 */
	void enterDirect_variable(STGrammarParser.Direct_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#direct_variable}.
	 * @param ctx the parse tree
	 */
	void exitDirect_variable(STGrammarParser.Direct_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#symbolic_variable}.
	 * @param ctx the parse tree
	 */
	void enterSymbolic_variable(STGrammarParser.Symbolic_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#symbolic_variable}.
	 * @param ctx the parse tree
	 */
	void exitSymbolic_variable(STGrammarParser.Symbolic_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#symbolic_variable_helper}.
	 * @param ctx the parse tree
	 */
	void enterSymbolic_variable_helper(STGrammarParser.Symbolic_variable_helperContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#symbolic_variable_helper}.
	 * @param ctx the parse tree
	 */
	void exitSymbolic_variable_helper(STGrammarParser.Symbolic_variable_helperContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#array_variable}.
	 * @param ctx the parse tree
	 */
	void enterArray_variable(STGrammarParser.Array_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#array_variable}.
	 * @param ctx the parse tree
	 */
	void exitArray_variable(STGrammarParser.Array_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#structured_variable}.
	 * @param ctx the parse tree
	 */
	void enterStructured_variable(STGrammarParser.Structured_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#structured_variable}.
	 * @param ctx the parse tree
	 */
	void exitStructured_variable(STGrammarParser.Structured_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(STGrammarParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(STGrammarParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(STGrammarParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(STGrammarParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(STGrammarParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(STGrammarParser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#real_literal}.
	 * @param ctx the parse tree
	 */
	void enterReal_literal(STGrammarParser.Real_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#real_literal}.
	 * @param ctx the parse tree
	 */
	void exitReal_literal(STGrammarParser.Real_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#time_literal}.
	 * @param ctx the parse tree
	 */
	void enterTime_literal(STGrammarParser.Time_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#time_literal}.
	 * @param ctx the parse tree
	 */
	void exitTime_literal(STGrammarParser.Time_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(STGrammarParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(STGrammarParser.DurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#time_of_day}.
	 * @param ctx the parse tree
	 */
	void enterTime_of_day(STGrammarParser.Time_of_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#time_of_day}.
	 * @param ctx the parse tree
	 */
	void exitTime_of_day(STGrammarParser.Time_of_dayContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(STGrammarParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(STGrammarParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#date_and_time}.
	 * @param ctx the parse tree
	 */
	void enterDate_and_time(STGrammarParser.Date_and_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#date_and_time}.
	 * @param ctx the parse tree
	 */
	void exitDate_and_time(STGrammarParser.Date_and_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#character_string}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_string(STGrammarParser.Character_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#character_string}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_string(STGrammarParser.Character_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#single_byte_char_string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_byte_char_string(STGrammarParser.Single_byte_char_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#single_byte_char_string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_byte_char_string(STGrammarParser.Single_byte_char_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#double_byte_char_string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_byte_char_string(STGrammarParser.Double_byte_char_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#double_byte_char_string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_byte_char_string(STGrammarParser.Double_byte_char_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#bit_string}.
	 * @param ctx the parse tree
	 */
	void enterBit_string(STGrammarParser.Bit_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#bit_string}.
	 * @param ctx the parse tree
	 */
	void exitBit_string(STGrammarParser.Bit_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(STGrammarParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(STGrammarParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#subrange}.
	 * @param ctx the parse tree
	 */
	void enterSubrange(STGrammarParser.SubrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#subrange}.
	 * @param ctx the parse tree
	 */
	void exitSubrange(STGrammarParser.SubrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#elem_type_name}.
	 * @param ctx the parse tree
	 */
	void enterElem_type_name(STGrammarParser.Elem_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#elem_type_name}.
	 * @param ctx the parse tree
	 */
	void exitElem_type_name(STGrammarParser.Elem_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link STGrammarParser#numeric_type_name}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_type_name(STGrammarParser.Numeric_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link STGrammarParser#numeric_type_name}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_type_name(STGrammarParser.Numeric_type_nameContext ctx);
}