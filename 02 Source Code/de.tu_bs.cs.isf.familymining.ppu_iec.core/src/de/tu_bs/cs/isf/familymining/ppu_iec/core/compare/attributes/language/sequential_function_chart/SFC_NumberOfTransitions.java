package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.language.sequential_function_chart;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class SFC_NumberOfTransitions extends AbstractSFCLangAttribute {
	
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "SFC Compare Number of Transitions";
	public static final String UNIT_DESCRIPTION = "Compares the total number of transitions of an SFC";

	public SFC_NumberOfTransitions() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<SequentialFunctionChart> compare(SequentialFunctionChart source, SequentialFunctionChart target) {
			float number1 = 1;
			float number2 = 1;
			
			float similarity = 0f;
			
			if (!source.getTransitions().isEmpty()) {
				number1 = source.getTransitions().size();
			}
			
			if (!target.getTransitions().isEmpty()) {
				number2 = target.getTransitions().size();
			}
			
			if (Math.max(number1, number2) > 0) {
				similarity = (float)Math.min(number1, number2) / Math.max(number1, number2);				
			}
			
			return new ResultElement<SequentialFunctionChart>(source, target, similarity ,this);
		}

	}
