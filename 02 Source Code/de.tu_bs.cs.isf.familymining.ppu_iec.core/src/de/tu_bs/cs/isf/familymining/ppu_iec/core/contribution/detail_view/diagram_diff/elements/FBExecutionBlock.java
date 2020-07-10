package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util.Coloring;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 * Execution Block
 * @author Domenik Eichhorn
 */
public class FBExecutionBlock extends BorderPane {

	private final double PREF_SIZE = 49;
	private String name;
	private String impl;
	private int color;
	private double scale;

	public FBExecutionBlock(String name, String impl, int color, double scale) {
		this.name = name;
		this.impl = impl;
		this.color = color;
		this.scale = scale;
		createLayout();
	}
	
	public FBExecutionBlock(String name, String impl, int color) {
		this.name = name;
		this.impl = impl;
		this.color = color;
		this.scale = 1.0;
		createLayout();
	}

	/**
	 * creates the Layout of the Element
	 */
	private void createLayout() {
		// set layout from the pane: (one button and the name)
		Button button = new Button();
		button.setText("EXC");
		Coloring.colorButton(button, color);
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Alert dialog = new Alert(AlertType.INFORMATION);
				dialog.setTitle("ExecuteBlock Details");
				dialog.setHeaderText("name: " + name);
				dialog.setContentText("impl: \n" + impl);
				dialog.show();
			}
		});
		this.setCenter(button);

		// set sizes:
		button.setMinHeight((PREF_SIZE) * scale);
		button.setMinWidth(PREF_SIZE * scale);
		button.setMaxHeight((PREF_SIZE ) * scale);
		button.setMaxWidth(PREF_SIZE * scale);
		//this.setMinHeight(PREF_SIZE * scale);
	//	this.setMinWidth(PREF_SIZE * scale);
		//this.setMaxHeight(PREF_SIZE * scale);
	//	this.setMaxWidth(PREF_SIZE * scale);
	}
}