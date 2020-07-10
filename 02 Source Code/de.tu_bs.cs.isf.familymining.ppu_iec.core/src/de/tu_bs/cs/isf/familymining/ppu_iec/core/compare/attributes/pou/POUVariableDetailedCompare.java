package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.pou;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class POUVariableDetailedCompare extends AbstractPOUAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String MODUL_NAME = "Variables - Detailed";
	public static final String MODUL_DESCRIPTION = "Compares the different types of variables and their distribution and also their data types";
	
	public static final double weight = 0.2;
	
	public POUVariableDetailedCompare() {
		super(MODUL_NAME, MODUL_DESCRIPTION);
	}

	
	@Override
	public ResultElement<POU> compare(POU pou1, POU pou2) {
		
		float similarityValue = 0.0f;
		
		List<List<Variable>> sourceVariables = new ArrayList<>();
		sourceVariables.add(pou1.getDeclaration().getInOutVariables());
		sourceVariables.add(pou1.getDeclaration().getInputVariables());
		sourceVariables.add(pou1.getDeclaration().getInternalVariables());
		sourceVariables.add(pou1.getDeclaration().getOutputVariables());
		
		List<List<Variable>> targetVariables = new ArrayList<>();
		targetVariables.add(pou2.getDeclaration().getInOutVariables());
		targetVariables.add(pou2.getDeclaration().getInputVariables());
		targetVariables.add(pou2.getDeclaration().getInternalVariables());
		targetVariables.add(pou2.getDeclaration().getOutputVariables());
		
		Set<String> matchedVariableNames = new HashSet<>();
		
		for (int i=0; i<sourceVariables.size(); i++) {
			int maxListSize = Math.max(sourceVariables.get(i).size(), targetVariables.get(i).size());
			
			if (maxListSize == 0) {
				similarityValue += 1.0;
			}
			else {
				
				double listSimilarity = 0.0;
				
				for (Variable var1 : sourceVariables.get(i)) {
					for (Variable var2 : targetVariables.get(i)) {
						if (var1.getName().equals(var2.getName())) {
							matchedVariableNames.add(var1.getName());
							if (var1.getType().equals(var2.getType())) {
								listSimilarity += 1.0;
								break;
							}
							listSimilarity += 0.5;
						}
					}
				}
				similarityValue += (float)(listSimilarity / maxListSize);
			}
		}
		
		return new ResultElement<POU>(pou1, pou2, (similarityValue/4),this);
	}

}
