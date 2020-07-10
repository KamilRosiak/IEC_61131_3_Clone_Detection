package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.processor;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CFileTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.templates.processor.AbstractMainWindowProcessor;

public class ApplicationWindowProcessor extends AbstractMainWindowProcessor {
	public static String WINDOW_NAME ="VariabilityAnalysisToolkit for IEC61131-3";
	
	public ApplicationWindowProcessor() {
		super(WINDOW_NAME, E4CStringTable.DEFAULT_BUNDLE_NAME, E4CFileTable.FRAMEWORK_LOGO_SMALL);
	}
}
