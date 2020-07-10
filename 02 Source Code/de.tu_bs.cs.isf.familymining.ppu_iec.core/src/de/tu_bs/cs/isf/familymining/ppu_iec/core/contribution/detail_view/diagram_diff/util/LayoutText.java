package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util;

import javafx.scene.text.Text;

public class LayoutText {
	
	static final int MAX_WIDTH = 40;
	static double size = 15;
	
	public static Text setTextSize(Text text) {
		if (text.getText().length() > 9) {
			String newText = text.getText().substring(0, 6);
			newText = newText.concat("...");
			text.setText(newText);
		}
		return text;
	}
}
