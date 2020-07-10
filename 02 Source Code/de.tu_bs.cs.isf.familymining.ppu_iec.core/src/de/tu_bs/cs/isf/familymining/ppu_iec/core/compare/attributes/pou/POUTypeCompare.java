package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.pou;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class POUTypeCompare extends AbstractPOUAttribute {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String MODUL_NAME = "Type";
	public static final String MODUL_DESCRIPTION = "Evaluates if POUs have the same type, thus, Program, Function or Function Block";
	
	public static final double weight = 0.7;
	
	public POUTypeCompare() {
		super( MODUL_NAME, MODUL_DESCRIPTION);
	}

	@Override
	public ResultElement<POU> compare(POU pou1, POU pou2) {
		
		if (pou1.getType().equals(pou2.getType())) {
			return new ResultElement<POU>(pou1, pou2, 1.0f,this);
		}
		else
			return new ResultElement<POU>(pou1, pou2, 0.0f,this);
	}

}
