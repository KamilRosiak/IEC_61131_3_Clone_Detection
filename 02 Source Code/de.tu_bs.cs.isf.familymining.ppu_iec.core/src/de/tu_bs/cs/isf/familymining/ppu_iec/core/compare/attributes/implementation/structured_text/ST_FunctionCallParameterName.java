package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.structured_text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.FunctionCallExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Parameter;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.st.expression.ExpressionCompareUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class ST_FunctionCallParameterName extends AbstractSTImplAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5804049127623945449L;
	public static final String UNIT_NAME = "ST FunctionCallParamterName Attribute";
	public static final String UNIT_DESCRIPTION = "Compares the names of the parameters";
	
	public ST_FunctionCallParameterName() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<Statement> compare(Statement source, Statement target) {
		if(source instanceof FunctionCallStatement && target instanceof FunctionCallStatement) {
			FunctionCallExpression sourceFuncCall = ((FunctionCallStatement)source).getFunctionCall();
			FunctionCallExpression targetFuncCall = ((FunctionCallStatement)target).getFunctionCall();
			//Extracting all types from parameter to a Lists
			List<Parameter> sourceParameter = new ArrayList<Parameter>(sourceFuncCall.getParameters());
			List<Parameter> targetParameter = new ArrayList<Parameter>(targetFuncCall.getParameters());

			
			//Both function calls has no parameters 
			if(sourceFuncCall.getParameters().isEmpty() && targetFuncCall.getParameters().isEmpty()) {
				return new ResultElement<Statement>(source, target, 1f,this);
			//One of both function calls has now parameter so they are not similar.
			} else if(sourceFuncCall.getParameters().isEmpty() || targetFuncCall.getParameters().isEmpty()) {
				return new ResultElement<Statement>(source, target, 0f,this);
			}
			
			int maxParameters = Math.max(sourceParameter.size(), targetParameter.size());
			
			Iterator<Parameter> targetIterator = targetParameter.iterator();
			Iterator<Parameter> sourceIterator = sourceParameter.iterator();
			
			float paramSimilarity = 0f;
			
			while(sourceIterator.hasNext()) {
				Parameter currentSourceType = sourceIterator.next();
				while(targetIterator.hasNext()) {
					Parameter currentTargetType = targetIterator.next();
					if(ExpressionCompareUtil.compare(currentSourceType.getAssignedValue(), currentTargetType.getAssignedValue()) == 1f) {
						paramSimilarity +=1f;
						targetIterator.remove();
						sourceIterator.remove();
						break;
					}
				}
			}

			return new ResultElement<Statement>(source, target, paramSimilarity/maxParameters ,this);
			
		}
		return null;
	}

}
