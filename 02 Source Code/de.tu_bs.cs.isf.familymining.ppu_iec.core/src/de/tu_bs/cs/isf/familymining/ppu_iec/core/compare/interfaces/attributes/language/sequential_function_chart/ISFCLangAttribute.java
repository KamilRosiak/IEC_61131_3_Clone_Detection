package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public interface ISFCLangAttribute {
	/**
	 * This method is called by the framework during the comparison process and compares two instances of Sequential Function Chart.
	 */
	public ResultElement<SequentialFunctionChart> compare(SequentialFunctionChart source, SequentialFunctionChart target);
}
