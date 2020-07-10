package de.tu_bs.cs.isf.familymining.ppu_iec.parser.SFC.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Transition;

public class SFCTransition {
	private int refLocalID ;
	private int localID; 
	private Transition transition; 
	
	public SFCTransition(int localID, Transition transition) {
		setLocalID(localID);
		setTransition(transition);
	}

	public int getRefLocalID() {
		return refLocalID;
	}

	public void setRefLocalID(int refLocalID) {
		this.refLocalID = refLocalID;
	}

	public int getLocalID() {
		return localID;
	}

	public void setLocalID(int localID) {
		this.localID = localID;
	}

	public Transition getTransition() {
		return transition;
	}

	public void setTransition(Transition transition) {
		this.transition = transition;
	}
}
