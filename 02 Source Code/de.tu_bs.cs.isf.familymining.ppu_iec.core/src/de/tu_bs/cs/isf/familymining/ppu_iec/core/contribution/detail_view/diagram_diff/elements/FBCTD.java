package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.string_table.GDVStringTable;

/**
 * @author Domenik Eichhorn, Ziad Alhajjar, Eike Schmitz
 */
public class FBCTD extends FBRawButton {

	private static final String[] INPUTPARAMETER = {"EN", "CU", "LOAD", "PV"};
	private static final String[] OUTPUTPARAMETER = {"Q", "CV"};
	private static final String ID = "CTD";
	
	/**
	 * creates an FBCTD element from the FB language
	 * @param scale - to make the object bigger or smaller, default is 1
	 * @param colorValue 
	 */
	public FBCTD(int scale, String Name, String[] inputExp, String[] outputExp, int colorValue) {
		super(ID, INPUTPARAMETER, OUTPUTPARAMETER, scale, Name, inputExp, outputExp, colorValue);
	}
	
	/**
	 * creates an TON element from the FB language
	 * @param colorValue 
	 */
	public FBCTD(String Name, String[] inputExp, String[] outputExp, int colorValue) {
		this(GDVStringTable.DEFAULT_SCALE, Name, inputExp, outputExp, colorValue);
	}

}
