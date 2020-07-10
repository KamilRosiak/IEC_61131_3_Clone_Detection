package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarBaseVisitor;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Add_expressionContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Add_operatorContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.And_expressionContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.And_operatorContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Array_variableContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Assignment_statementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Bit_stringContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Boolean_literalContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Case_elementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Case_list_elementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Case_statement_blockContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Character_stringContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.ComparisonContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Comparison_operatorContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.ConstantContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.DateContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Date_and_timeContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Direct_variableContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Double_byte_char_stringContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.DurationContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Elem_type_nameContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Else_statementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Elseif_statementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Equ_expressionContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Equ_operatorContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Exit_statementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.ExpressionContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.For_headerContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.For_statementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Function_callContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Function_call_statementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Function_nameContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.If_statementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.If_statement_blockContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.IncrementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Initial_valueContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Integer_literalContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Iteration_statementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Multiply_operatorContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Numeric_literalContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Numeric_type_nameContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Or_operatorContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Param_assignmentContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Parameter_listContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Power_expressionContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Primary_expressionContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Real_literalContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Repeat_statementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Return_statementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Selection_statementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Single_byte_char_stringContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.StatementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Statement_listContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Structured_variableContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.SubrangeContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Symbolic_variableContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Symbolic_variable_helperContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.TermContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Time_literalContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Time_of_dayContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Unary_expressionContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Unary_operatorContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Upper_boundContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.VariableContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Variable_nameContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.While_statementContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Xor_expressionContext;
import de.tu_bs.cs.isf.familymining.ppu_iec.grammar.st.STGrammarParser.Xor_operatorContext;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.INodeCallback;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.INodeGenerator;

public class STContextDispatcher extends STGrammarBaseVisitor<Void> {
	
	protected List<INodeCallback> _callbacks = null;
	private INodeGenerator stNodeGenerator;
	
	public STContextDispatcher(INodeGenerator stNodeGenerator, List<INodeCallback> callbacks) {
		_callbacks = callbacks;
		this.stNodeGenerator = stNodeGenerator;
	}	
	
	protected boolean debugInfo(ParserRuleContext context) {
		System.out.println("Token from " + context.getStart().getStartIndex() + " to " + context.getStop().getStartIndex()
				+ " at depth " + context.depth() + ": " + context.getText() + "\n");
		return true;
	}
	
	protected void notifyCallables(ParserRuleContext context) {
		ParserNode node = stNodeGenerator.generate(context);
		_callbacks.forEach(callback -> callback.processNode(node));
	}
	
	@Override
	public Void visitStatement_list(Statement_listContext ctx) {
		notifyCallables(ctx);
		return super.visitStatement_list(ctx);
	}

	@Override
	public Void visitStatement(StatementContext ctx) {
		notifyCallables(ctx);
		return super.visitStatement(ctx);
	}

	@Override
	public Void visitAssignment_statement(Assignment_statementContext ctx) {
		notifyCallables(ctx);
		return super.visitAssignment_statement(ctx);
	}
	
	@Override
	public Void visitFunction_call_statement(Function_call_statementContext ctx) {
		notifyCallables(ctx);
		return super.visitFunction_call_statement(ctx);
	}

	@Override
	public Void visitOr_operator(Or_operatorContext ctx) {
		notifyCallables(ctx);
		return super.visitOr_operator(ctx);
	}
	
	@Override
	public Void visitExpression(ExpressionContext ctx) {
		notifyCallables(ctx);
		return super.visitExpression(ctx);
	}
	
	@Override
	public Void visitXor_operator(Xor_operatorContext ctx) {
		notifyCallables(ctx);
		return super.visitXor_operator(ctx);
	}
	
	@Override
	public Void visitXor_expression(Xor_expressionContext ctx) {
		notifyCallables(ctx);
		return super.visitXor_expression(ctx);
	}

	@Override
	public Void visitAnd_operator(And_operatorContext ctx) {
		notifyCallables(ctx);
		return super.visitAnd_operator(ctx);
	}
	
	@Override
	public Void visitAnd_expression(And_expressionContext ctx) {
		notifyCallables(ctx);
		return super.visitAnd_expression(ctx);
	}

	@Override
	public Void visitComparison(ComparisonContext ctx) {
		notifyCallables(ctx);
		return super.visitComparison(ctx);
	}

	@Override
	public Void visitEqu_operator(Equ_operatorContext ctx) {
		notifyCallables(ctx);
		return super.visitEqu_operator(ctx);
	}

	@Override
	public Void visitEqu_expression(Equ_expressionContext ctx) {
		notifyCallables(ctx);
		return super.visitEqu_expression(ctx);
	}

	@Override
	public Void visitComparison_operator(Comparison_operatorContext ctx) {
		notifyCallables(ctx);
		return super.visitComparison_operator(ctx);
	}

	@Override
	public Void visitAdd_expression(Add_expressionContext ctx) {
		notifyCallables(ctx);
		return super.visitAdd_expression(ctx);
	}

	@Override
	public Void visitAdd_operator(Add_operatorContext ctx) {
		notifyCallables(ctx);
		return super.visitAdd_operator(ctx);
	}

	@Override
	public Void visitTerm(TermContext ctx) {
		notifyCallables(ctx);
		return super.visitTerm(ctx);
	}

	@Override
	public Void visitMultiply_operator(Multiply_operatorContext ctx) {
		notifyCallables(ctx);
		return super.visitMultiply_operator(ctx);
	}

	@Override
	public Void visitPower_expression(Power_expressionContext ctx) {
		notifyCallables(ctx);
		return super.visitPower_expression(ctx);
	}

	@Override
	public Void visitUnary_expression(Unary_expressionContext ctx) {
		notifyCallables(ctx);
		return super.visitUnary_expression(ctx);
	}

	@Override
	public Void visitUnary_operator(Unary_operatorContext ctx) {
		notifyCallables(ctx);
		return super.visitUnary_operator(ctx);
	}

	@Override
	public Void visitPrimary_expression(Primary_expressionContext ctx) {
		notifyCallables(ctx);
		return super.visitPrimary_expression(ctx);
	}

	@Override
	public Void visitFunction_call(Function_callContext ctx) {
		notifyCallables(ctx);
		return super.visitFunction_call(ctx);
	}

	@Override
	public Void visitSubrange(SubrangeContext ctx) {
		notifyCallables(ctx);
		return super.visitSubrange(ctx);
	}
	
	@Override
	public Void visitParameter_list(Parameter_listContext ctx) {
		notifyCallables(ctx);
		return super.visitParameter_list(ctx);
	}

	@Override
	public Void visitFunction_name(Function_nameContext ctx) {
		notifyCallables(ctx);
		return super.visitFunction_name(ctx);
	}

	@Override
	public Void visitParam_assignment(Param_assignmentContext ctx) {
		notifyCallables(ctx);
		return super.visitParam_assignment(ctx);
	}

	@Override
	public Void visitSelection_statement(Selection_statementContext ctx) {
		notifyCallables(ctx);
		return super.visitSelection_statement(ctx);
	}

	@Override
	public Void visitIf_statement_block(If_statement_blockContext ctx) {
		notifyCallables(ctx);
		return super.visitIf_statement_block(ctx);
	}
	
	@Override
	public Void visitIf_statement(If_statementContext ctx) {
		notifyCallables(ctx);
		return super.visitIf_statement(ctx);
	}

	@Override
	public Void visitElseif_statement(Elseif_statementContext ctx) {
		notifyCallables(ctx);
		return super.visitElseif_statement(ctx);
	}

	@Override
	public Void visitElse_statement(Else_statementContext ctx) {
		notifyCallables(ctx);
		return super.visitElse_statement(ctx);
	}
	
	@Override
	public Void visitCase_statement_block(Case_statement_blockContext ctx) {
		notifyCallables(ctx);
		return super.visitCase_statement_block(ctx);
	}

	@Override
	public Void visitCase_element(Case_elementContext ctx) {
		notifyCallables(ctx);
		return super.visitCase_element(ctx);
	}

	@Override
	public Void visitCase_list_element(Case_list_elementContext ctx) {
		notifyCallables(ctx);
		return super.visitCase_list_element(ctx);
	}
	
	@Override
	public Void visitIteration_statement(Iteration_statementContext ctx) {
		notifyCallables(ctx);
		return super.visitIteration_statement(ctx);
	}

	@Override
	public Void visitWhile_statement(While_statementContext ctx) {
		notifyCallables(ctx);
		return super.visitWhile_statement(ctx);
	}
	
	@Override
	public Void visitFor_statement(For_statementContext ctx) {
		notifyCallables(ctx);
		return super.visitFor_statement(ctx);
	}

	@Override
	public Void visitFor_header(For_headerContext ctx) {
		notifyCallables(ctx);
		return super.visitFor_header(ctx);
	}

	@Override
	public Void visitInitial_value(Initial_valueContext ctx) {
		notifyCallables(ctx);
		return super.visitInitial_value(ctx);
	}

	@Override
	public Void visitUpper_bound(Upper_boundContext ctx) {
		notifyCallables(ctx);
		return super.visitUpper_bound(ctx);
	}

	@Override
	public Void visitIncrement(IncrementContext ctx) {
		notifyCallables(ctx);
		return super.visitIncrement(ctx);
	}

	@Override
	public Void visitRepeat_statement(Repeat_statementContext ctx) {
		notifyCallables(ctx);
		return super.visitRepeat_statement(ctx);
	}
	
	@Override
	public Void visitExit_statement(Exit_statementContext ctx) {
		notifyCallables(ctx);
		return super.visitExit_statement(ctx);
	}

	@Override
	public Void visitReturn_statement(Return_statementContext ctx) {
		notifyCallables(ctx);
		return super.visitReturn_statement(ctx);
	}
	
	@Override
	public Void visitVariable(VariableContext ctx) {
		notifyCallables(ctx);
		return super.visitVariable(ctx);
	}

	@Override
	public Void visitVariable_name(Variable_nameContext ctx) {
		notifyCallables(ctx);
		return super.visitVariable_name(ctx);
	}
	
	@Override
	public Void visitDirect_variable(Direct_variableContext ctx) {
		notifyCallables(ctx);
		return super.visitDirect_variable(ctx);
	}

	@Override
	public Void visitSymbolic_variable(Symbolic_variableContext ctx) {
		notifyCallables(ctx);
		return super.visitSymbolic_variable(ctx);
	}

	@Override
	public Void visitSymbolic_variable_helper(Symbolic_variable_helperContext ctx) {
		notifyCallables(ctx);
		return super.visitSymbolic_variable_helper(ctx);
	}

	@Override
	public Void visitArray_variable(Array_variableContext ctx) {
		notifyCallables(ctx);
		return super.visitArray_variable(ctx);
	}

	@Override
	public Void visitStructured_variable(Structured_variableContext ctx) {
		notifyCallables(ctx);
		return super.visitStructured_variable(ctx);
	}

	@Override
	public Void visitConstant(ConstantContext ctx) {
		notifyCallables(ctx);
		return super.visitConstant(ctx);
	}

	@Override
	public Void visitNumeric_literal(Numeric_literalContext ctx) {
		notifyCallables(ctx);
		return super.visitNumeric_literal(ctx);
	}

	@Override
	public Void visitInteger_literal(Integer_literalContext ctx) {
		notifyCallables(ctx);
		return super.visitInteger_literal(ctx);
	}

	@Override
	public Void visitReal_literal(Real_literalContext ctx) {
		notifyCallables(ctx);
		return super.visitReal_literal(ctx);
	}

	@Override
	public Void visitTime_literal(Time_literalContext ctx) {
		notifyCallables(ctx);
		return super.visitTime_literal(ctx);
	}

	@Override
	public Void visitDuration(DurationContext ctx) {
		notifyCallables(ctx);
		return super.visitDuration(ctx);
	}

	@Override
	public Void visitTime_of_day(Time_of_dayContext ctx) {
		notifyCallables(ctx);
		return super.visitTime_of_day(ctx);
	}

	@Override
	public Void visitDate(DateContext ctx) {
		notifyCallables(ctx);
		return super.visitDate(ctx);
	}

	@Override
	public Void visitDate_and_time(Date_and_timeContext ctx) {
		notifyCallables(ctx);
		return super.visitDate_and_time(ctx);
	}

	@Override
	public Void visitCharacter_string(Character_stringContext ctx) {
		notifyCallables(ctx);
		return super.visitCharacter_string(ctx);
	}

	@Override
	public Void visitSingle_byte_char_string(Single_byte_char_stringContext ctx) {
		notifyCallables(ctx);
		return super.visitSingle_byte_char_string(ctx);
	}

	@Override
	public Void visitDouble_byte_char_string(Double_byte_char_stringContext ctx) {
		notifyCallables(ctx);
		return super.visitDouble_byte_char_string(ctx);
	}

	@Override
	public Void visitBit_string(Bit_stringContext ctx) {
		notifyCallables(ctx);
		return super.visitBit_string(ctx);
	}

	@Override
	public Void visitBoolean_literal(Boolean_literalContext ctx) {
		notifyCallables(ctx);
		return super.visitBoolean_literal(ctx);
	}

	@Override
	public Void visitElem_type_name(Elem_type_nameContext ctx) {
		notifyCallables(ctx);
		return super.visitElem_type_name(ctx);
	}

	@Override
	public Void visitNumeric_type_name(Numeric_type_nameContext ctx) {
		notifyCallables(ctx);
		return super.visitNumeric_type_name(ctx);
	}
}
