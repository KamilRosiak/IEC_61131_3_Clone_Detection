package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.implementation;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.LanguageImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class STImplContainer extends AbstractLanguageContainer<Statement>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7246327231243246490L;


	public STImplContainer(Statement first, Statement second, MetricContainer metric) {
		super(first, second, metric);
	}
	
	@Override
	public void updateSimilarity() {
		float similarity = 0.0f;
		float optionCounter = 0;
		
		//adds all results weighted or not weighted.
		for(ResultElement<?> langResult : getResults()) {
			similarity += getSimilarity(langResult.getSimilarity(), langResult.getAttribute(), getMetric().isWeighted());	
		}
	
		if(getImplOption() != null) {
			optionCounter++;
			LanguageImplementationOption<?> langImplOpt = getImplOption();
			langImplOpt.updateSimilarity();
			similarity += langImplOpt.getSimilarity(langImplOpt.getSimilarity(), langImplOpt.getOptionAttr(), getMetric().isWeighted());
		}
		
		//if not weighted we have to dived the similarity with the count of the results else its normed by 100% trough the weights.
		if(!getMetric().isWeighted() && getResults().size() + optionCounter > 0) {
			similarity = similarity / (getResults().size() + optionCounter);	
		} else {
			//if nested implementation is available
			if(getImplOption() != null && !getResults().isEmpty()) {
				similarity = similarity * 0.5f;
			}
		}
		
		setSimilarity(similarity);
	}
	
	
	@Override
	public String getLeftLabel() {
		if(getFirst() == null) {
			return null;
		} else {
			return getFirst().getText();
		}
	}

	@Override
	public String getRightLabel() {
		if(getSecond() == null) {
			return null;
		} else {
			return getSecond().getText();
		}
	}
}
