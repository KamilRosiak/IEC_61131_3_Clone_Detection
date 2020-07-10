package de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;

public class StyleConst {
	public static final Font BOLD_FONT = new Font(Display.getDefault(), new FontData( "Arial", 8, SWT.BOLD ) );
	public static final Font NORMAL_FONT = new Font(Display.getDefault(), new FontData( "Arial", 8, SWT.NORMAL ) );
	public static final Color ELEMENT_ATTR_COLOR = new Color(Display.getDefault(),255,255,204);
	public static final Color POU_ATTR_COLOR = new Color(Display.getDefault(),235,241,223);
	public static final Color MODEL_ATTR_COLOR = new Color(Display.getDefault(),205,227,228);
	public static final Color MAPPED_UNIT_COLOR = new Color(Display.getDefault(),205,227,228);
}
