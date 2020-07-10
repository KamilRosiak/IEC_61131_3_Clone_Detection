package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.action;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

/**
 * This class represents the AbstractContainer which will be added to data structure 
 * when the engine compares some Actions.
 * @author {Kamil Rosiak}
 */

public class ActionCompareContainer extends IECAbstractContainer<Action> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -774043101030225235L;

	private ActionImplementationOption actionImplOption;
	
	public ActionCompareContainer(Action first, Action second, MetricContainer metric) {
		super(first, second, metric);
	}

	public ActionImplementationOption getActionImplOption() {
		return actionImplOption;
	}

	public void setActionImplOption(ActionImplementationOption actionImplOption) {
		this.actionImplOption = actionImplOption;
	}
	
	@Override
	public void updateSimilarity() {
		float actionContainerSimilarity = 0.0f;
		int optionCount = 0;

		if(actionImplOption != null) {
			actionImplOption.updateSimilarity();
			actionContainerSimilarity += getSimilarity(actionImplOption.getSimilarity(), actionImplOption.getOptionAttr(), getMetric().isWeighted());
			optionCount++;
		}
		
		for(ResultElement<?> actionResult : getResults()) {
			actionContainerSimilarity += getSimilarity(actionResult.getSimilarity(), actionResult.getAttribute(), getMetric().isWeighted());

		}
		//if not weighted we have to dived the similarity with the count of the results else its normed by 100% trough the weights.
		if(!getMetric().isWeighted() && getResults().size() + optionCount > 0) {
			actionContainerSimilarity = actionContainerSimilarity / (getResults().size() + optionCount);
		}
		setSimilarity(actionContainerSimilarity);	
	}

	@Override
	public void reset() {
		setActionImplOption(null);
		getResults().clear();
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
	public Boolean checkCompared() {
		if(actionImplOption != null || isCompared()) {
			return true;
		}else if (getFirst() == null || getSecond() == null){
			return true;
		} else {
			return false;
		}	
	}
	
	public String toString() {
		String firstID = super.getFirst() == null ? "null" : super.getFirst().getName();
		String secondID = super.getSecond() == null ? "null" : super.getSecond().getName();
		
		String result = "";
		
		result += "First:\t"+firstID+"\n";
		result += "Second:\t"+secondID+"\n";
		result += "-----------------------------------\n";
		result += "Similarity: "+super.getSimilarity()+"\n\n";
		return result;
	}
}
