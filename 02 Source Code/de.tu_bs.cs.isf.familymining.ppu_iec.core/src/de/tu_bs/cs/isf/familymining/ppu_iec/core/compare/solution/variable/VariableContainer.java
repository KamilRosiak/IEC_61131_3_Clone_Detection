package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.variable;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

/**
 * This class represents the POUVariableContainer which will be added to data structure 
 * when the engine compares some POUS variables. The String varType save the type of the vars (INOUT,INPUT,OUTPUT or INTERNAL).
 * @author {Kamil Rosiak}
 */
public class VariableContainer extends IECAbstractContainer<Variable> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7901323210688589495L;
	private String varType ="";
	
	public VariableContainer(Variable first, Variable second, MetricContainer metric, String varTyp) {
		super(first, second,metric);
		setVarType(varType);
	}
	
	/**
	 * @return Type of vars {@link CompareEngineConsts}
	 */
	public String getVarType() {
		return varType;
	}

	/**
	 * The the var type (@link {@link CompareEngineConsts}, 	
	 * In CompareEngineConsts: 
	 * GLOBAL_VARS_DESCRIPTION  
	 * IN_OUT_VARS_DESCRIPTION  
	 * INPUT_VARS_DESCRIPTION    
	 * OUTPUT_VARS_DESCRIPTION   
	 * INTERNAL_VARS_DESCRIPTION 
	 * @param varType
	 */
	public void setVarType(String varType) {
		this.varType = varType;
	}
	public String toString() {	
		String firstID = super.getFirst() == null ? "null" : super.getFirst().getName();
		String secondID = super.getSecond() == null ? "null" : super.getSecond().getName();
		String result = "";
		
		result += "First:\t"+firstID+"\n";
		result += "Second:\t"+secondID+"\n";
		result += "-----------------------------------\n";
		result += "Similarity: "+super.getSimilarity();
		return result;
	}

	@Override
	public void updateSimilarity() {
		float pouContainerSimilarity = 0.0f;
		//adds all results weighted or not weighted.
		for(ResultElement<?> pouResult : getResults()) {
			pouContainerSimilarity += getSimilarity(pouResult.getSimilarity(), pouResult.getAttribute(), getMetric().isWeighted());
		}
		//if not weighted we have to dived the similarity with the count of the results else its normed by 100% trough the weights.
		if(!getMetric().isWeighted()) {
			if(getResults().size() > 0) {
				pouContainerSimilarity = pouContainerSimilarity / getResults().size();
			}
		}
		setSimilarity(pouContainerSimilarity);	
	}

	@Override
	public void reset() {
		getResults().clear();	
	}

	@Override
	public String getLeftLabel() {
		if(getFirst() != null) {
			return getFirst().getName();
		} else {
			return null;
		}
	}

	@Override
	public String getRightLabel() {
		if(getSecond() != null) {
			return getSecond().getName();
		} else {
			return null;
		}
	}
	
	@Override
	public Boolean checkCompared() {
		if(isCompared()) {
			return true;
		} else {
			return false;
		}	
	}
}
