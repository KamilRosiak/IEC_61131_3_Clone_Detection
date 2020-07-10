package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.language.sequential_function_chart;

import java.util.ArrayList;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Transition;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class SFC_ConditionOrJump extends AbstractSFCLangAttribute{
	
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "SFC Compare the Type of Transition";
	public static final String UNIT_DESCRIPTION = "Compares the type of transitions (condition or jump) of an SFC";

	public SFC_ConditionOrJump() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<SequentialFunctionChart> compare(SequentialFunctionChart source, SequentialFunctionChart target) {
			float similarity = 0f;
			
			List<Transition> firstTransitions = new ArrayList<>();
			List<Transition> secondTransitions = new ArrayList<>();
			
			firstTransitions.addAll(source.getTransitions());
			secondTransitions.addAll(target.getTransitions());
			
			int[] first = new int[2];
			int[] second = new int[2];
			
			
			for (Transition t : firstTransitions) {
				if (t.isIsJump()) {
					first[0]++;
				}
				else if (t.getCondition() != null && !t.getCondition().isEmpty()) {
					first[1]++;
				}
			}
			
			for (Transition t : secondTransitions) {
				if (t.isIsJump()) {
					second[0]++;
				}
				else if (t.getCondition() != null && !t.getCondition().isEmpty()) {
					second[1]++;
				}
			}
			
			if (Math.max(first[0], second[0]) > 0) {
				similarity += (float)(Math.min(first[0], second[0]) / Math.max(first[0], second[0]));
			}
			if (Math.max(first[1], second[1]) > 0) {
				similarity += (float)(Math.min(first[1], second[1]) / Math.max(first[1], second[1]));
			}
			
			similarity /= 2;
			
			return new ResultElement<SequentialFunctionChart>(source, target, similarity ,this);
	}
}
