package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.FamilyModelStrings;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;

public class SFCLangContainer  extends AbstractLanguageContainer<SequentialFunctionChart> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8471351600138863159L;

	public SFCLangContainer(SequentialFunctionChart first, SequentialFunctionChart second, MetricContainer metric) {
		super(first, second, metric);
	}

	@Override
	public String getLeftLabel() {
		return FamilyModelStrings.SFC_IMPLEMENTATION;
	}

	@Override
	public String getRightLabel() {
		return FamilyModelStrings.SFC_IMPLEMENTATION;
	}

}
