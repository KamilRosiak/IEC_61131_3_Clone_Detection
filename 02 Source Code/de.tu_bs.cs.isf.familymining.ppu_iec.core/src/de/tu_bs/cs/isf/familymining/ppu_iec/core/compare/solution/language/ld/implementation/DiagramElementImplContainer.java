package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.ld.LDNameUtil;

public class DiagramElementImplContainer extends AbstractLanguageContainer<DiagramElement> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6390657005464673119L;

	public DiagramElementImplContainer(DiagramElement first, DiagramElement second, MetricContainer metric) {
		super(first, second, metric);
	}

	@Override
	public String getLeftLabel() {
		if(getFirst() == null) {
			return null;
		} else {
			return LDNameUtil.getName(getFirst());
		}
	}

	@Override
	public String getRightLabel() {
		if(getSecond() == null) {
			return null;
		} else {
			return LDNameUtil.getName(getSecond());
		}
	}

}
