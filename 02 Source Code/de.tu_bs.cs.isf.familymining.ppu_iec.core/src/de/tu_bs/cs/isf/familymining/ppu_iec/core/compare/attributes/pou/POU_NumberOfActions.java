package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.pou;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class POU_NumberOfActions extends AbstractPOUAttribute{
	/**
	 * 
	 * @author Bougouffa
	 */
	private static final long serialVersionUID = 1L;
	public static final String MODUL_NAME = "Number of Actions";
	public static final String MODUL_DESCRIPTION = "Compares the number of actions belonging to both POUs";
	
	public POU_NumberOfActions() {
		super(MODUL_NAME, MODUL_DESCRIPTION);
	}

	@Override
	public ResultElement<POU> compare(POU pou1, POU pou2) {
		/*Gets all the actions of both POUs and compares the size of both lists
		 If the size is the same, it returns 1
		 Else it returns the Min Size/Max Size*/
		
		if (pou1.getActions().size() == pou2.getActions().size()) {
			return new ResultElement<POU>(pou1, pou2, 1.0f, this );
		}
		
		return new ResultElement<POU>(pou1, pou2,(Math.min(pou1.getActions().size(),pou2.getActions().size())/Math.max(pou1.getActions().size(),pou2.getActions().size())),this);
	}
}
