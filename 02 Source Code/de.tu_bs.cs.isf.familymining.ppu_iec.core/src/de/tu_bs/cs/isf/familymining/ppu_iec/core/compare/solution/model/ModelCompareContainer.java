package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

/**
 * This class represents the ModelCompareContainer which will be added to data structure 
 * when the engine compares the configuration models.
 * @author {Kamil Rosiak}
 */

public class ModelCompareContainer extends IECAbstractContainer<Configuration> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ModelImplementaionOption modelImplOption;
	private ModelVariableOption modelVarOption;
	
	public ModelCompareContainer(Configuration first, Configuration second, MetricContainer metric) {
		super(first, second, metric);
	}

	public ModelImplementaionOption getModelImplementationOption() {
		return modelImplOption;
	}

	public void setModelImplementationOption(ModelImplementaionOption modelImplOption) {
		this.modelImplOption = modelImplOption;
	}

	public ModelVariableOption getModelVariableOption() {
		return modelVarOption;
	}

	public void setModelVariableOption(ModelVariableOption modelVarOption) {
		this.modelVarOption = modelVarOption;
	}
	
	public String toString() {
		String firstID = super.getFirst() == null ? "null" : super.getFirst().getIdentifier();
		String secondID = super.getSecond() == null ? "null" : super.getSecond().getIdentifier();
		
		String result = "";
		
		result += "First:\t"+firstID+"\n";
		result += "Second:\t"+secondID+"\n";
		result += "-----------------------------------\n";
		result += "Similarity: "+super.getSimilarity()+"\n\n";
		return result;
	}

	@Override
	public void updateSimilarity() {
		float similarity = 0.0f;
		int optionCount = 0;
		
		if(modelImplOption != null) {
			modelImplOption.updateSimilarity();
			similarity += getSimilarity(modelImplOption.getSimilarity(), modelImplOption.getOptionAttr(), getMetric().isWeighted());
			optionCount++;
		}
		
		if(modelVarOption != null) {
			modelVarOption.updateSimilarity();
			similarity += getSimilarity(modelVarOption.getSimilarity(), modelVarOption.getOptionAttr(), getMetric().isWeighted());
			optionCount++;
		}
		
		for(ResultElement<?> modelResult : getResults()) {
			similarity += getSimilarity(modelResult.getSimilarity(),modelResult.getAttribute(), getMetric().isWeighted());
		}
		
		//if not weighted we have to dived the similarity with the count of the results else its normed by 100% trough the weights.
		if(!getMetric().isWeighted() && getResults().size() + optionCount > 0) {
			similarity = similarity / (getResults().size() + optionCount);
		}
		setSimilarity(similarity);
	}

	@Override
	public void reset() {
		this.setModelImplementationOption(null);
		this.setModelVariableOption(null);
		this.getResults().clear();
	}

	@Override
	public String getLeftLabel() {
		if(getFirst() != null) {
			return getFirst().getResources().get(0).getName();
		} else {
			return "";
		}
	}

	@Override
	public String getRightLabel() {
		if(getSecond() != null) {
			return getSecond().getResources().get(0).getName();
		} else {
			return "";
		}
	}
	
	@Override
	public Boolean checkCompared() {
		if(modelImplOption != null || modelVarOption != null || isCompared() || !getResults().isEmpty()) {
			return true;	
		} else {
			return false;
		}
	}
}
