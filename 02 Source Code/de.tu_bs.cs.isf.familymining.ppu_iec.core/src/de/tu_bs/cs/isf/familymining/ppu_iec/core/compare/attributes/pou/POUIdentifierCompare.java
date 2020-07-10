package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.pou;


import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;


public class POUIdentifierCompare  extends AbstractPOUAttribute{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6235038386043504841L;
	public static final String MODUL_NAME = "Name - Complete or no match";
	public static final String MODUL_DESCRIPTION = "Compares the names of POUs for total equivalence";
	
	public POUIdentifierCompare() {
		super(MODUL_NAME, MODUL_DESCRIPTION);
	}

	@Override
	public ResultElement<POU> compare(POU pou1, POU pou2) {
		if(pou1.getIdentifier().equals(pou2.getIdentifier())) {
			return new ResultElement<POU>(pou1, pou2, 1.0f, this);
		}
		return new ResultElement<POU>(pou1, pou2, 0.0f, this);
	}
	
}
