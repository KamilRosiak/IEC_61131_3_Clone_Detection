package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.language.sequential_function_chart;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class SFC_NumberOfActions extends AbstractSFCLangAttribute{
	
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "SFC Compare the number of actions";
	public static final String UNIT_DESCRIPTION = "Compares the number of actions of an SFC";

	public SFC_NumberOfActions() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<SequentialFunctionChart> compare(SequentialFunctionChart source, SequentialFunctionChart target) {
			float similarity = 0f;
			int firstActions = 0;
			int secondActions = 0;
			
			for (Step s : source.getSteps()) {
				firstActions += s.getActions().size();
			}
			
			for (Step s : target.getSteps()) {
				secondActions += s.getActions().size();
			}
			
			if (Math.max(firstActions, secondActions) > 0) {
				similarity = (float)Math.min(firstActions, secondActions) / Math.max(firstActions, secondActions);
			}
			else 
				similarity = 1f;			// return sim=1f when both sfc have no actions											
				
			return new ResultElement<SequentialFunctionChart>(source, target, similarity ,this);
	}
}
