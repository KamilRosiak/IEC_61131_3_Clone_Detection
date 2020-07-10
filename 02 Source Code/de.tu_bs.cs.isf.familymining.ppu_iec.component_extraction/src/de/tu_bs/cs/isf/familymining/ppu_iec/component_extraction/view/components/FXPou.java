package de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.view.components;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;

/**
 * Wrapper for POUs that are added to the configuration tree.
 */
public class FXPou {
	private POU pou;
	private String modelName;
	
	public FXPou(POU element, String modelName) {
		this.pou = element;
		this.modelName = modelName;
	}

	public POU getElement() {
		return pou;
	}

	public void setElement(POU pou) {
		this.pou = pou;
	}
	
	@Override
	public String toString() {
		String name = "( "+ modelName +" ) ";
		name += pou.getIdentifier();
		name += " ("+ pou.getType()+")";
		return name;	
	}
}
