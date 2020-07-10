package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderNetwork;

public class LDNetworkImplContainer extends AbstractLanguageContainer<LadderNetwork> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6390657005464673119L;

	public LDNetworkImplContainer(LadderNetwork first, LadderNetwork second, MetricContainer metric) {
		super(first, second, metric);
	}

	@Override
	public String getLeftLabel() {
		if(getFirst() == null) {
			return null;
		} else {
			return "Network: " + getFirst().getPosition();
		}
	}

	@Override
	public String getRightLabel() {
		if(getSecond() == null) {
			return null;
		} else {
			return "Network: " + getSecond().getPosition();
		}
	}

}
