package de.tu_bs.cs.isf.familymining.ppu_iec.parser.SFC.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.AbstractAction;

/**
 * Helper for the parsing of actions in SFC.
 * @author {Kamil Rosiak}
 *
 */
public class SFCAction {
	private int refLocation;
	private AbstractAction action ;
	
	SFCAction(int refLocation, AbstractAction action) {
		setAction(action);
		setRefLocation(refLocation);
	}
	
	public int getRefLocation() {
		return refLocation;
	}
	public void setRefLocation(int refLocation) {
		this.refLocation = refLocation;
	}
	public AbstractAction getAction() {
		return action;
	}
	public void setAction(AbstractAction action) {
		this.action = action;
	}
}
