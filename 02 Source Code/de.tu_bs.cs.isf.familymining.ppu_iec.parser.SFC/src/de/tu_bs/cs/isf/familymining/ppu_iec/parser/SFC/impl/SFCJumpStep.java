package de.tu_bs.cs.isf.familymining.ppu_iec.parser.SFC.impl;

public class SFCJumpStep {
	private int localID;
	private int refLocalId;
	private String jumpTarget;
	
	public SFCJumpStep(int localId, String jumpTarget) {
		setLocalID(localId);
		setJumpTarget(jumpTarget);
	}
	
	public int getLocalID() {
		return localID;
	}
	public void setLocalID(int localID) {
		this.localID = localID;
	}
	public int getRefLocalId() {
		return refLocalId;
	}
	public void setRefLocalId(int refLocalId) {
		this.refLocalId = refLocalId;
	}

	public String getJumpTarget() {
		return jumpTarget;
	}

	public void setJumpTarget(String jumpTarget) {
		this.jumpTarget = jumpTarget;
	}
}
