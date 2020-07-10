package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.sequential_function_chart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class SFC_StepLinkedVarsTypeAttr extends AbstractSFCImplAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5804049127623945449L;
	public static final String UNIT_NAME = "SFC Linked Variables Type Compare";
	public static final String UNIT_DESCRIPTION = "Compares the of the linked variables."; 
	
	public SFC_StepLinkedVarsTypeAttr() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<Step> compare(Step source, Step target) {
		//If both steps have no variables, there is nothing to compare.
		if(source.getLinkedVariable().size() == 0 && target.getLinkedVariable().size() == 0) {
			return null;
		}
		
		List<Variable> sourceVars = new ArrayList<Variable>();
		sourceVars.addAll(source.getLinkedVariable());
		
		List<Variable> targetVars = new ArrayList<Variable>();
		targetVars.addAll(target.getLinkedVariable());


		Iterator<Variable> sourceVarIterator = sourceVars.iterator();
		Iterator<Variable> targetVarIterator = targetVars.iterator();
		
		int matchedVars = 0;
		
		while(sourceVarIterator.hasNext()) {
			Variable sourceVar = sourceVarIterator.next();
			while(targetVarIterator.hasNext()) {
				Variable targetVar = targetVarIterator.next();
				System.out.println(sourceVar.getType());
				if(sourceVar.getType().equals(targetVar.getType())) {
					matchedVars++;
					sourceVarIterator.remove();
					targetVarIterator.remove();
					break;
				}
			}
		}
		
		int maxSize = Math.max(source.getLinkedVariable().size(), target.getLinkedVariable().size());
		return new ResultElement<Step>(source, target, (float) (matchedVars/maxSize), this);
	}
}
