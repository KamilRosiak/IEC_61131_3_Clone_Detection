package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.language.sequential_function_chart;

import java.util.ArrayList;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class SFC_NamesOfSteps extends AbstractSFCLangAttribute {
	
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "SFC Compare the Names of Steps";
	public static final String UNIT_DESCRIPTION = "Compares the names of all steps of an SFC";

	public SFC_NamesOfSteps() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<SequentialFunctionChart> compare(SequentialFunctionChart source, SequentialFunctionChart target) {
			float similarity = 0f;
		
			List<Step> firstSteps = new ArrayList<>();
			List<Step> secondSteps = new ArrayList<>();
			
			firstSteps.addAll(source.getSteps());
			secondSteps.addAll(target.getSteps());
			
			int maxListSize = Math.max(firstSteps.size(), secondSteps.size());
			int matches = 0; 
			
			for (Step fst : firstSteps) {
				for (Step sst : secondSteps) {
					if (fst.getName().equals(sst.getName())) {
						matches++;
						break;
					}
				}
			}
			
			if (maxListSize > 0) {
				similarity = (float)matches / maxListSize;				
			}
			
			return new ResultElement<SequentialFunctionChart>(source, target, similarity ,this);
	}
}
