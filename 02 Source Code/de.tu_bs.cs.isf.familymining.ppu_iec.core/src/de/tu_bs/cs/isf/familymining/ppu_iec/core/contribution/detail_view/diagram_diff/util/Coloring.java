package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util;

import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.string_table.GDVStringTable;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class Coloring {
	/**
	 * Color shapes.
	 * @param shapes List of shapes to be colored
	 * @param color 0 is black, 1 is green and 2 is red.
	 */
	public static void coloring(List<Shape> shapes, int color) {
		shapes.stream().forEach(shape -> shape.setStrokeWidth(2));
		switch(color) {
		case GDVStringTable.COLOR_BLACK:
			shapes.stream().forEach(shape -> shape.setStroke(Color.BLACK));
			break;
		case GDVStringTable.COLOR_GREEN:
			shapes.stream().forEach(shape -> shape.setStroke(Color.GREEN));
			break;
		case GDVStringTable.COLOR_RED:
			shapes.stream().forEach(shape -> shape.setStroke(Color.RED));
			break;
		case GDVStringTable.COLOR_YELLOW:
			shapes.stream().forEach(shape -> shape.setStroke(Color.GOLD));
			break;
		case GDVStringTable.COLOR_ORANGE:
			shapes.stream().forEach(shape -> shape.setStroke(Color.CORAL));
			break;
		case GDVStringTable.COLOR_BLUE:
			shapes.stream().forEach(shape -> shape.setStroke(Color.CORNFLOWERBLUE));
			break;
		}
	}
	
	public static void colorButton(Button button, int color) {
		switch (color) {
		case GDVStringTable.COLOR_BLACK:
			button.setStyle("-fx-background-color: " + GDVStringTable.COLOR_GRAY_RDB + "; -fx-cursor: hand;");
			break;
		case GDVStringTable.COLOR_GREEN:
			button.setStyle("-fx-background-color: " + GDVStringTable.COLOR_GREEN_RDB + "; -fx-cursor: hand;");
			break;
		case GDVStringTable.COLOR_RED:
			button.setStyle("-fx-background-color: " + GDVStringTable.COLOR_RED_RDB + "; -fx-cursor: hand;");
			break;
		case GDVStringTable.COLOR_YELLOW:
			button.setStyle("-fx-background-color: " + GDVStringTable.COLOR_YELLOW_RGB + "; -fx-cursor: hand;");
			break;
		case GDVStringTable.COLOR_ORANGE:
			button.setStyle("-fx-background-color: " + GDVStringTable.COLOR_ORANGE_RGB + "; -fx-cursor: hand;");
			break;
		case GDVStringTable.COLOR_BLUE:
			button.setStyle("-fx-background-color: " + GDVStringTable.COLOR_BLUE_RGB + "; -fx-cursor: hand;");
			break;
		default:
			button.setStyle("-fx-background-color: " + GDVStringTable.COLOR_GRAY_RDB + "; -fx-cursor: hand;");
			break;
		}
	}
}
