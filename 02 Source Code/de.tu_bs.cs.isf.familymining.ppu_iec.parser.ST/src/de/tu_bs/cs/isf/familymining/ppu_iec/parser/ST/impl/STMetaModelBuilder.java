package de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.impl;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.ABSOLUTE_END_LINE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.ABSOLUTE_START_LINE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.CHAR_END_POSITION_IN_LINE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.CHAR_START_POSITION_IN_LINE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.RULE_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.ST.util.STStringTable.TOKEN_ATTRIBUTE;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Assignment;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Case;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.CaseBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ConditionalBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ExitStatement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ForLoop;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.If;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ReturnStatement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StatementType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.UnboundedLoop;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ElementaryDataType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.FunctionCallExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IModelBuilder;

public class STMetaModelBuilder implements IModelBuilder<StructuredText>{
	private StructuredTextFactory stFactory;
	private StructuredText stInstance;
	private IModelBuilder<FunctionCallExpression> functionCallBuilder;
	private IModelBuilder<Expression> expressionBuilder;
	private IModelBuilder<VariableExpression> variableBuilder;
	
	public STMetaModelBuilder(IModelBuilder<FunctionCallExpression> functionCallBuilder, IModelBuilder<Expression> expressionBuilder, 
			IModelBuilder<VariableExpression> variableBuilder) {
		this.stFactory = StructuredTextFactory.eINSTANCE;
		this.stInstance = null;
		this.functionCallBuilder = functionCallBuilder;
		this.expressionBuilder = expressionBuilder;
		this.variableBuilder = variableBuilder;
	}
	
	///////////////////////////
	// Entry Building Point
	///////////////////////////
	
	@Override
	public StructuredText build(ParserNode rootNode) {
		return buildStructuredText(rootNode);
	}
	
	public StructuredText buildStructuredText(ParserNode structuredTextNode) {
		// initialize
		stInstance = stFactory.createStructuredText();
		stInstance.setId(EcoreUtil.generateUUID());
		// fill Structured Text root
		// look for statements
		if (isEqual(structuredTextNode.<String>get(RULE_ATTRIBUTE), "statement_list")) {
			for (ParserNode statementNode : structuredTextNode.getChildren()) {
				switch (statementNode.<String>get(RULE_ATTRIBUTE)) {
					case "statement": {
						Statement statement = buildStatement(statementNode);
						stInstance.getStatements().add(statement);
					} break;
					default: {
						throw new IllegalArgumentException(getIllegalRuleMessage(statementNode.<String>get(RULE_ATTRIBUTE)));
					}
				}
			}
		} else {
			throw new RuntimeException("Root rule is expected to be \"statement_list\" but is \""+structuredTextNode.<String>get(RULE_ATTRIBUTE)+"\"");
		}
		structuredTextNode.executeOnAttribute(TOKEN_ATTRIBUTE, (String text) -> stInstance.setText(text));
		return stInstance;
	}
	
	///////////////////////////
	// Statement Builder
	///////////////////////////
	
	private Statement buildStatement(ParserNode statementNode) {
		ParserNode statementChildNode = statementNode.getChildren().get(0);
		switch (statementChildNode.<String>get(RULE_ATTRIBUTE)) {
			case "function_call_statement": {
				return attachStatementMetadata(buildFunctionCallStatement(statementChildNode), statementNode);
			}
			case "assignment_statement": {
				return attachStatementMetadata(buildAssignmentStatement(statementChildNode), statementNode);
			}
			case "selection_statement": {
				return attachStatementMetadata(buildSelectionStatement(statementChildNode), statementNode);				
			}
			case "iteration_statement": {
				return attachStatementMetadata(buildIterationStatement(statementChildNode), statementNode);				
			}
			case "exit_statement": {
				return attachStatementMetadata(buildExitStatement(statementChildNode), statementNode);
			}
			case "return_statement": {
				return attachStatementMetadata(buildReturnStatement(statementChildNode), statementNode);
			}
			default: {
				throw new IllegalArgumentException(getIllegalRuleMessage(statementChildNode.<String>get(RULE_ATTRIBUTE))); 
			}
		}
	}

	private FunctionCallStatement buildFunctionCallStatement(ParserNode functionCallStatementNode) {
		FunctionCallStatement functionCallStatement = stFactory.createFunctionCallStatement();
		functionCallStatement.setStatementType(StatementType.FUNCTION_CALL);
		
		ParserNode variableNode = functionCallStatementNode.getChildByAttribute(RULE_ATTRIBUTE, "variable");
		if (variableNode != null) {
			functionCallStatement.setInvokingVariable(variableBuilder.build(variableNode));
		}
		ParserNode functionCallNode = functionCallStatementNode.getChildByAttribute(RULE_ATTRIBUTE, "function_call");
		if (functionCallNode != null) {
			functionCallStatement.setFunctionCall(functionCallBuilder.build(functionCallNode));			
		} else {
			throw new NullPointerException("function call statement node must have a child named function call");
		}
		return functionCallStatement;
	}
	
	private Assignment buildAssignmentStatement(ParserNode assignmentNode) {
		Assignment assignment = stFactory.createAssignment();
		assignment.setStatementType(StatementType.ASSIGNMENT);
		for (ParserNode assignmentChildNode : assignmentNode.getChildren()) {
			switch (assignmentChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "variable": {
					assignment.setLeft(variableBuilder.build(assignmentChildNode));
				} break;
				case "expression": {
					assignment.setRight(expressionBuilder.build(assignmentChildNode));
				} break;
				default: {
					throw new IllegalArgumentException(getIllegalRuleMessage(assignmentChildNode.<String>get(RULE_ATTRIBUTE)));
				}
			}
		}
		return assignment;
	}
	
	private Statement buildSelectionStatement(ParserNode selectionNode) {
		if (selectionNode.hasChildren() && selectionNode.getChildren().size() == 1) {
			ParserNode selectionChildNode = selectionNode.getChildren().get(0);
			switch (selectionChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "if_statement_block": {
					return buildIfStatementBlock(selectionChildNode);
				}
				case "case_statement_block": {
					return buildCaseStatementBlock(selectionChildNode);
				}
				default: {
					throw new IllegalArgumentException(getIllegalRuleMessage(selectionChildNode.<String>get(RULE_ATTRIBUTE))); 
				}
			}				
		} else {
			throw new RuntimeException("selection statement node must have one child");
		}
	}

	private If buildIfStatementBlock(ParserNode ifNode) {
		If ifStatementBlock = stFactory.createIf();
		ifStatementBlock.setStatementType(StatementType.IF);
		for (ParserNode ifChildNode : ifNode.getChildren()) {
			switch (ifChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "if_statement": {
					ConditionalBlock ifBlock = attachStatementMetadata(buildConditionalBlock(ifChildNode), ifChildNode);
					ifStatementBlock.getConditionalBlocks().add(ifBlock);
				} break;
				case "elseif_statement": {
					ConditionalBlock elseIfBlock = attachStatementMetadata(buildConditionalBlock(ifChildNode), ifChildNode);
					ifStatementBlock.getConditionalBlocks().add(elseIfBlock);
				 } break;
				case "else_statement": {
					ConditionalBlock elseBlock = attachStatementMetadata(buildConditionalBlock(ifChildNode), ifChildNode);
					ifStatementBlock.getConditionalBlocks().add(elseBlock);
				} break;
				default: {
					throw new IllegalArgumentException(getIllegalRuleMessage(ifChildNode.<String>get(RULE_ATTRIBUTE))); 
				}
			}
		}
		return ifStatementBlock;
	}
	
	/**
	 * Builds an instance of type {@link ConditionalBlock} and accepts {"if_statement", "elseif_statement"}
	 * 
	 * @param conditionalBlockNode
	 * @return
	 */
	private ConditionalBlock buildConditionalBlock(ParserNode conditionalBlockNode) {
		ConditionalBlock conditionalBlock = stFactory.createConditionalBlock();
		conditionalBlock.setStatementType(StatementType.CONDITIONAL_BLOCK);
		for (ParserNode conditionalBlockChildNode : conditionalBlockNode.getChildren()) {
			 switch (conditionalBlockChildNode.<String>get(RULE_ATTRIBUTE)) {
				 case "expression": {
					 conditionalBlock.setCondition(expressionBuilder.build(conditionalBlockChildNode));
					 conditionalBlock.setElse(false);
				 } break;
				 case "statement_list": {
					 for (ParserNode statementNode : conditionalBlockChildNode.getChildren()) {
						 Statement statement = buildStatement(statementNode);
						 conditionalBlock.getSubstatements().add(statement);
					 }
				 } break;
				 default: {
						throw new IllegalArgumentException(getIllegalRuleMessage(conditionalBlockChildNode.<String>get(RULE_ATTRIBUTE))); 
				 }
			 }
		}
		return conditionalBlock;
	}
	
	private List<Statement> buildElseStatements(ParserNode elseNode) {
		List<Statement> elseStatements = new ArrayList<>();
		for (ParserNode elseChildNode : elseNode.getChildren()) {
			 switch (elseChildNode.<String>get(RULE_ATTRIBUTE)) {
				 case "statement_list": {
					 for (ParserNode statementNode : elseChildNode.getChildren()) {
						 elseStatements.add(buildStatement(statementNode));
					 }
				 } break;
				 default: {
						throw new IllegalArgumentException(getIllegalRuleMessage(elseChildNode.<String>get(RULE_ATTRIBUTE))); 
				 }
			 }
		 }	
		return elseStatements;
	}
	
	private Case buildCaseStatementBlock(ParserNode caseNode) {
		Case caseStatement = stFactory.createCase();
		caseStatement.setStatementType(StatementType.CASE);
		for (ParserNode caseChildNode : caseNode.getChildren()) {
			switch (caseChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "expression": {
					caseStatement.setSwitch(expressionBuilder.build(caseChildNode));
				} break;
				case "case_element": {
					caseStatement.getCases().add(attachStatementMetadata(buildCaseBlock(caseChildNode), caseChildNode));
				} break;
				case "else_statement": {
					caseStatement.getElseStatements().addAll(buildElseStatements(caseChildNode));
				} break;
				default: {
					throw new IllegalArgumentException(getIllegalRuleMessage(caseChildNode.<String>get(RULE_ATTRIBUTE))); 
				}
			}
		}
		return caseStatement;
	}

	private CaseBlock buildCaseBlock(ParserNode caseElementNode) {
		CaseBlock caseBlock = stFactory.createCaseBlock();
		caseBlock.setStatementType(StatementType.CASE_BLOCK);
		for (ParserNode caseElementChildNode : caseElementNode.getChildren()) {
			switch (caseElementChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "case_list_element": {
					ParserNode expressionNode = caseElementChildNode.getChildren().get(0);
					caseBlock.getCaseExpressions().add(expressionBuilder.build(expressionNode));
				} break;
				case "statement_list": {
					for (ParserNode statementNode : caseElementChildNode.getChildren()) {
						caseBlock.getSubstatements().add(buildStatement(statementNode));
					}
				} break;
				default: {
					throw new IllegalArgumentException(getIllegalRuleMessage(caseElementChildNode.<String>get(RULE_ATTRIBUTE))); 
				}
			}
		}
		return caseBlock;
	}
	
	private Statement buildIterationStatement(ParserNode iterationNode) {
		if (iterationNode.hasChildren() && iterationNode.getChildren().size() == 1) {
			ParserNode iterationChildNode = iterationNode.getChildren().get(0);
			switch (iterationChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "while_statement": {
					return buildWhileStatement(iterationChildNode);
				}
				case "for_statement": {
					return buildForStatement(iterationChildNode);
				}
				case "repeat_statement": {
					return buildRepeatStatement(iterationChildNode);
				}
				default: {
					throw new IllegalArgumentException(getIllegalRuleMessage(iterationChildNode.<String>get(RULE_ATTRIBUTE))); 
				}
			}				
		} else {
			throw new RuntimeException("iteration statement node must have one child");
		}
	}

	/**
	 * Builds an instance of type {@link UnboundedLoop} and accepts {"while_statement"}
	 * 
	 * @param whileNode
	 * @return
	 */
	private Statement buildWhileStatement(ParserNode whileNode) {
		UnboundedLoop whileLoop = stFactory.createUnboundedLoop();
		whileLoop.setStatementType(StatementType.WHILE);
		for (ParserNode whileChildNode : whileNode.getChildren()) {
			 switch (whileChildNode.<String>get(RULE_ATTRIBUTE)) {
				 case "expression": {
					 whileLoop.setCondition(expressionBuilder.build(whileChildNode));
				 } break;
				 case "statement_list": {
					 for (ParserNode statementNode : whileChildNode.getChildren()) {
						 Statement statement = buildStatement(statementNode);
						 whileLoop.getSubstatements().add(statement);
					 }
				 } break;
				 default: {
						throw new IllegalArgumentException(getIllegalRuleMessage(whileChildNode.<String>get(RULE_ATTRIBUTE))); 
				 }
			 }
		}
		return whileLoop;
	}
	
	private Statement buildForStatement(ParserNode forLoopNode) {
		ForLoop forLoop = stFactory.createForLoop();
		forLoop.setStatementType(StatementType.FOR_LOOP);
		for (ParserNode forLoopChildNode : forLoopNode.getChildren()) {
			switch (forLoopChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "for_header": {
					dispatchForHeader(forLoop, forLoopChildNode);
				} break;
				case "statement_list": {
					 for (ParserNode statementNode : forLoopChildNode.getChildren()) {
						 Statement statement = buildStatement(statementNode);
						 forLoop.getSubstatements().add(statement);
					 }
				} break;
				default: {
					throw new IllegalArgumentException(getIllegalRuleMessage(forLoopChildNode.<String>get(RULE_ATTRIBUTE))); 
				}
			}
		}
		return forLoop;
	}

	private void dispatchForHeader(ForLoop forLoop, ParserNode forHeaderNode) {
		for (ParserNode forHeaderChildNode : forHeaderNode.getChildren()) {
			switch (forHeaderChildNode.<String>get(RULE_ATTRIBUTE)) {
				case "expression": {
					Expression counterExpression = expressionBuilder.build(forHeaderChildNode);
					forLoop.setCounter(counterExpression);
				} break;
				case "initial_value": {
					 int initialValue = Integer.parseInt(forHeaderChildNode.get(TOKEN_ATTRIBUTE));
					 forLoop.setInitialValue(initialValue);
				} break;
				case "upper_bound": {
					int upperBound = Integer.parseInt(forHeaderChildNode.get(TOKEN_ATTRIBUTE));
					forLoop.setUpperBound(upperBound);
				} break;
				case "increment": {
					int increment = Integer.parseInt(forHeaderChildNode.get(TOKEN_ATTRIBUTE));
					forLoop.setIncrement(increment);
				} break;
				default: {
					throw new IllegalArgumentException(getIllegalRuleMessage(forHeaderChildNode.<String>get(RULE_ATTRIBUTE))); 
				}
			}
		}
	}

	private Statement buildRepeatStatement(ParserNode repeatNode) {
		UnboundedLoop repeatLoop = stFactory.createUnboundedLoop();
		repeatLoop.setStatementType(StatementType.REPEAT);
		for (ParserNode repeatChildNode : repeatNode.getChildren()) {
			 switch (repeatChildNode.<String>get(RULE_ATTRIBUTE)) {
				 case "expression": {
					 repeatLoop.setCondition(expressionBuilder.build(repeatChildNode));
				 } break;
				 case "statement_list": {
					 for (ParserNode statementNode : repeatChildNode.getChildren()) {
						 Statement statement = buildStatement(statementNode);
						 repeatLoop.getSubstatements().add(statement);
					 }
				 } break;
				 default: {
						throw new IllegalArgumentException(getIllegalRuleMessage(repeatChildNode.<String>get(RULE_ATTRIBUTE))); 
				 }
			 }
		}
		return repeatLoop;
	}
	
	private Statement buildExitStatement(ParserNode statementChildNode) {
		ExitStatement exitStatement = stFactory.createExitStatement();
		exitStatement.setStatementType(StatementType.EXIT);
		return exitStatement;
	}
	
	private Statement buildReturnStatement(ParserNode statementChildNode) {
		ReturnStatement returnStatement = stFactory.createReturnStatement();
		returnStatement.setStatementType(StatementType.RETURN);
		return returnStatement;
	}
	
	///////////////////////////
	// Expression Helper
	///////////////////////////

	public void propagateReturnValue(ElementaryDataType returnType) {
		if (returnType == ElementaryDataType.SINT ||
				returnType == ElementaryDataType.INT ||
				returnType == ElementaryDataType.DINT ||
				returnType == ElementaryDataType.LINT )
			
			switch (returnType) {
			case SINT:case INT:case DINT:case LINT:case UINT:case UDINT: {
				// integer
				
			} break;
			case REAL:case LREAL: {
				// real 
			} break;
			case DATE:case TIME_OF_DAY:case TOD:case DATE_AND_TIME: {
				// time
			} break;
			default: {
				// Leads to an error at the moment
				throw new IllegalAccessError("The type \""+ returnType +"\" is not supported.");
			}
			}
	}

	///////////////////////////
	// Function Builders
	///////////////////////////

	private <T extends Statement> T attachStatementMetadata(T s, ParserNode statementNode) {
		s.setId(EcoreUtil.generateUUID());
		s.setAbsStartLine(statementNode.get(ABSOLUTE_START_LINE));
		s.setAbsEndLine(statementNode.get(ABSOLUTE_END_LINE));
		s.setRelStartLine(statementNode.get(ABSOLUTE_START_LINE));
		s.setRelEndLine(statementNode.get(ABSOLUTE_END_LINE));
		s.setStartColumnPos(statementNode.get(CHAR_START_POSITION_IN_LINE));
		s.setEndColumnPos(statementNode.get(CHAR_END_POSITION_IN_LINE));
		s.setStructuredText(stInstance);
		return s;
	}	
	
	static private boolean isEqual(String s1, String s2) {
		return s1.equals(s2);
	}
	
	static private String getIllegalRuleMessage(String rule) {
		return "Rule "+rule+" is not supported. ";
	}	
}
