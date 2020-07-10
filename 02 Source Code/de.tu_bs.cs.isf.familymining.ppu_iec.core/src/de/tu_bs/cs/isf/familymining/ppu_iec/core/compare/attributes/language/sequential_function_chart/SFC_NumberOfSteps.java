package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.language.sequential_function_chart;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class SFC_NumberOfSteps extends AbstractSFCLangAttribute{
	
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "SFC Compare Number of Steps";
	public static final String UNIT_DESCRIPTION = "Compares the total number of steps of an SFC";

	public SFC_NumberOfSteps() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<SequentialFunctionChart> compare(SequentialFunctionChart source, SequentialFunctionChart target) {
			float number1 = 1;
			float number2 = 1;
			
			float similarity = 0f;
			
			if (!source.getSteps().isEmpty()) {
				number1 = source.getSteps().size();
			}
			
			if (!target.getSteps().isEmpty()) {
				number2 = target.getSteps().size();
			}
			
			if (Math.max(number1, number2) > 0) {
				similarity = (float)Math.min(number1, number2) / Math.max(number1, number2);				
			}
			return new ResultElement<SequentialFunctionChart>(source, target, similarity ,this);
	}
}
