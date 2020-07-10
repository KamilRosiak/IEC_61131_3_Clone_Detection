package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.pou;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class POUVariableCompare extends AbstractPOUAttribute{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String MODUL_NAME = "Variables - Plain";
	public static final String MODUL_DESCRIPTION = "Compares all types of variables independently, then aggregates them all";

	public static final double weight = 0.1;
	
	public POUVariableCompare() {
		super(MODUL_NAME, MODUL_DESCRIPTION);
	}

	@Override
	public ResultElement<POU> compare(POU pou1, POU pou2) {
		
		float t1 = Math.min(pou1.getDeclaration().getInOutVariables().size(), pou2.getDeclaration().getInOutVariables().size());
		float t2 = Math.max(pou1.getDeclaration().getInOutVariables().size(), pou2.getDeclaration().getInOutVariables().size());
		float sim1 = (t1 == 0.0f) ? 0.0f : (t1/t2);

		float t3 = Math.min(pou1.getDeclaration().getInputVariables().size(), pou2.getDeclaration().getInputVariables().size());
		float t4 = Math.max(pou1.getDeclaration().getInputVariables().size(), pou2.getDeclaration().getInputVariables().size());
		float sim2 = (t3 == 0.0f) ? 0.0f : (t3/t4);
		
		float t5 = Math.min(pou1.getDeclaration().getInternalVariables().size(), pou2.getDeclaration().getInternalVariables().size());
		float t6 = Math.max(pou1.getDeclaration().getInternalVariables().size(), pou2.getDeclaration().getInternalVariables().size());
		float sim3 = (t5 == 0.0f) ? 0.0f : (t5/t6);
		
		float t7 = Math.min(pou1.getDeclaration().getOutputVariables().size(), pou2.getDeclaration().getOutputVariables().size());
		float t8 = Math.max(pou1.getDeclaration().getOutputVariables().size(), pou2.getDeclaration().getOutputVariables().size());
		float sim4 = (t7 == 0.0f) ? 0.0f : (t7/t8);
				
		return new ResultElement<POU>(pou1, pou2, ((sim1+sim2+sim3+sim4)/4),this);
	}
}
