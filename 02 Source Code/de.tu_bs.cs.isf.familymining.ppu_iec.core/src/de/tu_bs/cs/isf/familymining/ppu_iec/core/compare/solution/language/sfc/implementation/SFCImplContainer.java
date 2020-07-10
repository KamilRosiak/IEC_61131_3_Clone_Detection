package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.implementation;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.LanguageImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class SFCImplContainer  extends AbstractLanguageContainer<Step>{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 6636918009701619947L;
	private SFCActionOption actionOption;
	
	public SFCImplContainer(Step first, Step second, MetricContainer metric) {
		super(first, second, metric);
	}
	
	
	
	public float getTotalWeight() {
		float totalWeight = 0.0f;
		for(ResultElement<?> langResult : getResults()) {
			totalWeight += langResult.getAttribute().getWeight();	
		}
		
		totalWeight += actionOption != null ? actionOption.getOptionAttr().getWeight():0.0f;
		totalWeight += getImplOption() != null ? getImplOption().getOptionAttr().getWeight():0.0f;
		return totalWeight;
	}
	

	@Override
	public void updateSimilarity() {
		float similarity = 0.0f;
		float optionCounter = 0;

		for(ResultElement<?> langResult : getResults()) {
			similarity += getSimilarity(langResult.getSimilarity(), langResult.getAttribute(), getMetric().isWeighted());	
		}
		
		if(getImplOption() != null) {
			optionCounter++;
			LanguageImplementationOption<?> langImplOpt = getImplOption();
			langImplOpt.updateSimilarity();
			similarity += langImplOpt.getSimilarity(langImplOpt.getSimilarity(), langImplOpt.getOptionAttr(), getMetric().isWeighted());
		}
		
		if(getActionOption() != null) {
			optionCounter++;
			actionOption.updateSimilarity();
			similarity += getSimilarity(actionOption.getSimilarity(), actionOption.getOptionAttr(), getMetric().isWeighted());
		} 
		
		//if not weighted we have to dived the similarity with the count of the results else its normed by 100% trough the weights.
		if((!getMetric().isWeighted() && getResults().size() + optionCounter > 0)) {
			similarity = similarity / (getResults().size() + optionCounter);	
		}
		setSimilarity(similarity);
	}
	
	@Override
	public String getLeftLabel() {
		if(getFirst() == null) {
			return null;
		} else {
			return getFirst().getName();
		}
	}

	@Override
	public String getRightLabel() {
		if(getSecond() == null) {
			return null;
		} else {
			return getSecond().getName();
		}
	}
	
	@Override
	public void reset() {
		getResults().clear();
		setImplOption(null);
		setActionOption(null);
	}
	public SFCActionOption getActionOption() {
		return actionOption;
	}

	public void setActionOption(SFCActionOption actionOption) {
		this.actionOption = actionOption;
	}
	
	@Override
	public Boolean checkCompared() {
		if(getImplOption() != null || isCompared() ) {
			return true;
		} else {
			return false;
		}	
	}
}


