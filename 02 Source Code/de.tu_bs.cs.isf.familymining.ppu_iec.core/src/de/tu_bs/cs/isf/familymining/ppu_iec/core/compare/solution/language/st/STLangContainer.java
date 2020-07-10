package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.FamilyModelStrings;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;

public class STLangContainer extends AbstractLanguageContainer<StructuredText> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -55260960518425890L;

	public STLangContainer(StructuredText first, StructuredText second, MetricContainer metric) {
		super(first, second, metric);
	}

	@Override
	public String getLeftLabel() {
		return FamilyModelStrings.ST_IMPLEMENTATION;
	}

	@Override
	public String getRightLabel() {
		return FamilyModelStrings.ST_IMPLEMENTATION;
	}
}
