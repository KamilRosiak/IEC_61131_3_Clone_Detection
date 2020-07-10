package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.string_table.GDVStringTable;

/**
 * @author Domenik Eichhorn, Ziad Alhajjar, Eike Schmitz
 */
public class FBTOF extends FBRawButton {

	private static final String[] INPUTPARAMETER = {"EN", "IN", "PT"};
	private static final String[] OUTPUTPARAMETER = {"Q", "ET"};
	private static final String ID = "TOF";
	
	/**
	 * creates an FBTOF element from the FB language
	 * @param scale - to make the object bigger or smaller, default is 1
	 * @param colorValue 
	 */
	public FBTOF(int scale, String Name, String[] inputExp, String[] outputExp, int colorValue) {
		super(ID, INPUTPARAMETER, OUTPUTPARAMETER, scale, Name, inputExp, outputExp, colorValue);
	}
	
	public FBTOF(String Name, String[] inputExp, String[] outputExp, int colorValue) {
		this(GDVStringTable.DEFAULT_SCALE, Name, inputExp, outputExp, colorValue);
	}

}
