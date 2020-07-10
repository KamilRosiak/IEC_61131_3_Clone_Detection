package de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.util;

import org.eclipse.emf.ecore.EObject;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Assignment;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Case;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.CaseBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ConditionalBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.If;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.BinaryExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.BinaryOperator;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ElementaryDataType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.FunctionCallExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Literal;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Parameter;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Subrange;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.UnaryExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.UnaryOperator;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.INameProvider;

public class STNameProvider implements INameProvider {
	@Override
	public String getName(EObject object) {
		if (object == null) {
			return null;
		}
				
		if (object instanceof Assignment) {
			return getAssignmentString((Assignment) object);			
		} else if (object instanceof If) {
			return getIfString((If) object);
		} else if (object instanceof Case) {
			return getCaseString((Case) object);
		} else if (object instanceof FunctionCallStatement) {
			return getFunctionString((FunctionCallStatement) object);
		} else if (object instanceof ConditionalBlock) {
			return getConditionalBlockString((ConditionalBlock) object);
		} else if (object instanceof CaseBlock) {
			return getCaseBlockString((CaseBlock) object);
		} else if (object instanceof StructuredText) {
			return getStructuredTextString((StructuredText) object);
		} 
		
		if (object instanceof BinaryExpression) {
			return getBinaryExpressionString((BinaryExpression) object);
		} else if (object instanceof UnaryExpression) {
			return getUnaryExpressionString((UnaryExpression) object);
		} else if (object instanceof Literal) {
			return getLiteralString((Literal) object);
		} else if (object instanceof VariableExpression) {
			return getVariableExpressionString((VariableExpression) object);
		} else if (object instanceof FunctionCallExpression) {
			return getFunctionCallExpressionString((FunctionCallExpression) object);
		} else if (object instanceof Parameter) {
			return getParameterString((Parameter) object);
		} else if (object instanceof Subrange) {
			return getSubrangeString((Subrange) object);
		}
		
		
		return object.eClass().getName()+" is not supported by "+this.getClass().getSimpleName();
		
	}
	
	/*--------------------------------------------------------------------*/ 
	/*----------------------- Statement Labels ---------------------------*/
	/*--------------------------------------------------------------------*/
	
	protected String getAssignmentString(Assignment assignment) {
		return "Assignment ("+assignment.getText().replace("\n", "").trim()+")";
	}
	
	protected String getIfString(If ifStatement) {
		return ""; // doesnt have relevant attributes
	}

	protected String getCaseString(Case caseStatement) {
		String text = caseStatement.getText();
		int caseExprStartIndex = text.indexOf("CASE")+4;
		int caseExprEndIndex = text.indexOf("OF");
		return "Case Statement ("+text.substring(caseExprStartIndex, caseExprEndIndex).trim()+")";
	}
	
	protected String getFunctionString(FunctionCallStatement functionCallStatement) {
		return "Function Call ("+functionCallStatement.getText().replace("\n", "").trim()+")";
	}

	protected String getConditionalBlockString(ConditionalBlock conditionalBlockStatement) {
		String text = conditionalBlockStatement.getText();
		String member = "";
		if (!conditionalBlockStatement.isElse()) {
			int conditionalStartIndex = text.indexOf("IF")+2;
			int conditionEndIndex = text.indexOf("THEN");
			member = text.substring(conditionalStartIndex, conditionEndIndex).trim();
			return "If/Elsif Conditional Block ("+member+")";
		} else {
			return "Else Block ()";
		}			
	}
	
	protected String getCaseBlockString(CaseBlock caseBlockStatement) {
		String text = caseBlockStatement.getText();
		return "Case Block ("+text.substring(0, text.indexOf(":")).trim()+")";
		
	}
	
	protected String getStructuredTextString(StructuredText object) {
		return "Structured Text Language Element (label="+object.getLabel()+")";
	}
	
	/*--------------------------------------------------------------------*/ 
	/*----------------------- Expression Labels --------------------------*/
	/*--------------------------------------------------------------------*/
	
	private String getBinaryExpressionString(BinaryExpression binExpr) {
		ElementaryDataType dataType = binExpr.getDataType();
		BinaryOperator op = binExpr.getOperator();
		return "Binary Expression (dataType="+dataType.getLiteral()+", operator="+op.getLiteral()+")";
	}

	private String getUnaryExpressionString(UnaryExpression unaryExpr) {
		ElementaryDataType dataType = unaryExpr.getDataType();
		UnaryOperator op = unaryExpr.getOperator();
		return "Unary Expression (dataType="+dataType.getLiteral()+", operator="+op.getLiteral()+")";
	}

	private String getLiteralString(Literal literal) {
		ElementaryDataType dataType = literal.getDataType();
		String symbol = literal.getSymbol();
		return "Literal (symbol="+symbol+", dataType="+dataType.getLiteral()+")";
	}

	private String getVariableExpressionString(VariableExpression varExpr) {
		ElementaryDataType dataType = varExpr.getDataType();
		String symbol = varExpr.getSymbol();
		boolean isArray = !varExpr.getArrayIndices().isEmpty();
		return "Variable Expression (symbol="+symbol+", dataType="+dataType.getLiteral()+", isArray= "+isArray+")";
	}

	private String getFunctionCallExpressionString(FunctionCallExpression funcCallExpr) {
		ElementaryDataType dataType = funcCallExpr.getDataType();
		String symbol = funcCallExpr.getSymbol();
		boolean hasParameters = !funcCallExpr.getParameters().isEmpty();
		return "Function Call Expression (symbol="+symbol+", dataType="+dataType.getLiteral()+", hasParameters="+hasParameters+")";
	}

	private String getParameterString(Parameter parameter) {
		String assignedValueString = getName(parameter.getInput());
		return "Parameter (value= "+assignedValueString+" )";
	}

	private String getSubrangeString(Subrange subrange) {
		String fromString = subrange.getLowerBound() != null ? subrange.getLowerBound().getSymbol() : "<empty>";
		String toString = subrange.getUpperBound() != null ? subrange.getUpperBound().getSymbol() : "<empty>";
		return "Subrange (from="+fromString+", to="+toString+")";
	}


}
