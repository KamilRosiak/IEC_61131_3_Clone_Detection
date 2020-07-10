package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.implementation;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.LanguageImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.AbstractAction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.ComplexAction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SimpleAction;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class SFCActionContainer extends IECAbstractContainer<AbstractAction> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7454018215874989807L;
	private LanguageImplementationOption<AbstractLanguageContainer<?>> implOption;
	
	public SFCActionContainer(AbstractAction first, AbstractAction second, MetricContainer metric) {
		super(first, second, metric);
	}

	@Override
	public void updateSimilarity() {
		float pouContainerSimilarity = 0.0f;
		int optionCount = 0;
		
		
		if(implOption != null) {
			implOption.updateSimilarity();
			pouContainerSimilarity += getSimilarity(implOption.getSimilarity(), implOption.getOptionAttr(), getMetric().isWeighted());
			optionCount++;
		}
		
		//adds all results weighted or not weighted.
		for(ResultElement<?> pouResult : getResults()) {			
			pouContainerSimilarity += getSimilarity(pouResult.getSimilarity(), pouResult.getAttribute(), getMetric().isWeighted());
		}
		
		//if not weighted we have to dived the similarity with the count of the results else its normed by 100% trough the weights.
		if(!getMetric().isWeighted() && getResults().size() + optionCount > 0) {
			pouContainerSimilarity = pouContainerSimilarity / (getResults().size() + optionCount);
		}
		setSimilarity(pouContainerSimilarity);
	}

	@Override
	public String getLeftLabel() {
		if(getFirst() != null) {
			if(getFirst() instanceof ComplexAction) {
				if(((ComplexAction)getFirst()).getPouAction() !=null) {
					return ((ComplexAction)getFirst()).getPouAction().getName();
				}
				return "";
			} else if (getFirst() instanceof SimpleAction){
				return ((SimpleAction)getFirst()).getActionVariable().getName();
			} else {
				return "";
			}
		} else {
			return "";
		}
	}

	@Override
	public String getRightLabel() {
		if(getSecond() != null) {
			if(getSecond() instanceof ComplexAction) {
				if(((ComplexAction)getSecond()).getPouAction() !=null) {
					return ((ComplexAction)getSecond()).getPouAction().getName();
				}
				return "";
			} else if (getSecond() instanceof SimpleAction){
				return ((SimpleAction)getSecond()).getActionVariable().getName();
			} else {
				return "";
			}
		}else {
			return "";
		}
	}

	@Override
	public void reset() {
		implOption = null;
		getResults().clear();	
	}
	
	public LanguageImplementationOption<AbstractLanguageContainer<?>> getImplOption() {
		return implOption;
	}

	public void setImplOption(LanguageImplementationOption<AbstractLanguageContainer<?>> nestedSTImpl) {
		this.implOption = nestedSTImpl;
	}

	@Override
	public Boolean checkCompared() {
		if(implOption != null || isCompared()) {
			return true;
		} else {
			return false;
		}	
	}

}
