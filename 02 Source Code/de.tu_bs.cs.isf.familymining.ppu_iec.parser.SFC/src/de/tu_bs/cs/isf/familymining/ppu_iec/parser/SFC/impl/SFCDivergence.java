package de.tu_bs.cs.isf.familymining.ppu_iec.parser.SFC.impl;

public class SFCDivergence {
	private int refLocalId;
	private int localID;
	
	
	public SFCDivergence(int localID) {
		setLocalID(localID);
	}
	
	public int getRefLocalId() {
		return refLocalId;
	}

	public void setRefLocalId(int refLocalId) {
		this.refLocalId = refLocalId;
	}
	public int getLocalID() {
		return localID;
	}
	public void setLocalID(int localID) {
		this.localID = localID;
	}
	
}
