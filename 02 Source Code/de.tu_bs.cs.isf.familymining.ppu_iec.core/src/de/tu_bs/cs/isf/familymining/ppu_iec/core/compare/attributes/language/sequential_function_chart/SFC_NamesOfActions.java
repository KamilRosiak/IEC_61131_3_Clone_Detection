package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.language.sequential_function_chart;

import java.util.ArrayList;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.AbstractAction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.ComplexAction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SimpleAction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class SFC_NamesOfActions extends AbstractSFCLangAttribute {
	
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "SFC Compare the Names of Actions";
	public static final String UNIT_DESCRIPTION = "Compares the names of all Actions of an SFC";

	public SFC_NamesOfActions() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<SequentialFunctionChart> compare(SequentialFunctionChart source, SequentialFunctionChart target) {
			float similarity = 0f;
		
			List<Step> firstSteps = new ArrayList<>();
			List<Step> secondSteps = new ArrayList<>();
			
			firstSteps.addAll(source.getSteps());
			secondSteps.addAll(target.getSteps());
			
			List<AbstractAction> firstActions = new ArrayList<>();
			List<AbstractAction> secondActions = new ArrayList<>();
			
			int matches = 0; 
			
			for (Step s : firstSteps) {
				firstActions.addAll(s.getActions());
			}
			for (Step s : secondSteps) {
				secondActions.addAll(s.getActions());
			}
			
			int totalListSize = firstActions.size() + secondActions.size();
			
			
			for (AbstractAction fa : firstActions) {
				for (AbstractAction sa : secondActions) {
					if (fa instanceof SimpleAction && sa instanceof SimpleAction)  {
						Variable faVar = ((SimpleAction) fa).getActionVariable();
						Variable saVar = ((SimpleAction) sa).getActionVariable();
						if (faVar.getName().equals(saVar.getName())) {
							matches++;
							break;
						}
					} else if (fa instanceof ComplexAction && sa instanceof ComplexAction) {
						Action faAction = ((ComplexAction) fa).getPouAction();
						Action saAction = ((ComplexAction) sa).getPouAction();
						if (faAction.getName().equals(saAction.getName())) {
							matches++;
						}
					}
				}
			}
			
			if (totalListSize > 0) {
				similarity = (float)(matches / totalListSize);				
				return new ResultElement<SequentialFunctionChart>(source, target, similarity ,this);
			}
			else
				return new ResultElement<SequentialFunctionChart>(source, target, 1f, this);				// Return sim=1 if both sfcs do not have actions
	}
}
