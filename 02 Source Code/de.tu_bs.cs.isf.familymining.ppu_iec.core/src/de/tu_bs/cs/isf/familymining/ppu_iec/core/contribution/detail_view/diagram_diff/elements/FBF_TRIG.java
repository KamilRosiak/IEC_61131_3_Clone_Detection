package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.string_table.GDVStringTable;

/**
 * @author Domenik Eichhorn, Ziad Alhajjar, Eike Schmitz
 */
public class FBF_TRIG extends FBRawButton {

	private static final String[] INPUTPARAMETER = {"EN", "CLK"};
	private static final String[] OUTPUTPARAMETER = {"Q"};
	private static final String ID = "F_TRIG";
	
	/**
	 * creates an FBF_TRIG element from the FB language
	 * @param scale - to make the object bigger or smaller, default is 1
	 * @param colorValue 
	 */
	public FBF_TRIG(int scale, String Name, String[] inputExp, String[] outputExp, int colorValue) {
		super(ID, INPUTPARAMETER, OUTPUTPARAMETER, scale, Name, inputExp, outputExp, colorValue);
	}
	
	public FBF_TRIG(String Name, String[] inputExp, String[] outputExp, int colorValue) {
		this(GDVStringTable.DEFAULT_SCALE, Name, inputExp, outputExp, colorValue);
	}

}
