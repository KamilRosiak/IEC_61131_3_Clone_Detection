package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util.Coloring;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

/**
 * raw element of a function block that can be extended by other function block
 * elements
 * 
 * @author Domenik Eichhorn, Eike Schmitz, Ziad Alhajjar
 */
public class FBRawButton extends BorderPane {

	private final double PREF_SIZE = 49;

	private String identifier;
	private String[] inputParameter;
	private String[] outputParameter;
	private String[] inputExp;
	private String[] outputExp;
	private int scale;
	private String blockName;
	private int colorValue;

//	public FBRawButton(String identifier, String[] inputParameter, String[] outputParameter, int scale,
//			String blockName, String[] inputExp, String[] outputExp) {
//		this(identifier, inputParameter, outputParameter, scale, blockName, inputExp, outputExp,
//				GDVStringTable.COLOR_BLACK);
//	}

	public FBRawButton(String identifier, String[] inputParameter, String[] outputParameter, int scale,
			String blockName, String[] inputExp, String[] outputExp, int color) {
		this.colorValue = color;
		this.scale = scale;
		this.blockName = blockName;
		setIdentifier(identifier);
		setInput(inputParameter);
		setOutput(outputParameter);
		setInputExp(inputExp);
		setOutputExp(outputExp);
		createLayout();

	}

	/**
	 * Append expressions to parameters.
	 */
	private void mergeParameterWithExp() {
		if (inputParameter.length >= inputExp.length) {
			for (int i = 0; i < inputExp.length; i++) {
				inputParameter[i] = inputParameter[i] + ":" + inputExp[i];
			}
		} else {
			for (int i = 0; i < inputParameter.length; i++) {
				inputParameter[i] = inputParameter[i] + ":" + inputExp[i];
			}
		}
		if (outputParameter.length >= outputExp.length) {
			for (int i = 0; i < outputExp.length; i++) {
				outputParameter[i] = outputParameter[i] + ":" + outputExp[i];
			}
		} else {
			for (int i = 0; i < outputParameter.length; i++) {
				outputParameter[i] = outputParameter[i] + ":" + outputExp[i];
			}
		}
	}

	/**
	 * creates the Layout of the Element
	 */
	private void createLayout() {
		mergeParameterWithExp();
		// set layout from the pane: (one button and the name)
		Button button = new Button();
		button.setText("FB");
		Coloring.colorButton(button, colorValue);
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Alert dialog = new Alert(AlertType.INFORMATION);
				dialog.setTitle("FBElement Details");
				dialog.setHeaderText("element type: " + identifier + "\nelement name: " + blockName);
				String content = "inputExp: \n";
				for (int i = 0; i < inputParameter.length; i++) {
					content = content.concat(inputParameter[i] + "\n");
				}
				content = content.concat("\noutputExp: \n");
				for (int i = 0; i < outputParameter.length; i++) {
					content = content.concat(outputParameter[i] + "\n");
				}
				dialog.setContentText(content);
				dialog.show();
			}
		});
		Text name = new Text(blockName);
		setAlignment(name, Pos.TOP_CENTER);
		//this.setTop(name);
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

	private void setIdentifier(String id) {
		this.identifier = id;
	}

	private void setInput(String[] inputs) {
		if (inputs == null) {
			this.inputParameter = new String[] { "" };
		} else {

			this.inputParameter = new String[inputs.length];
			for (int i = 0; i < inputs.length; i++) {
				this.inputParameter[i] = inputs[i];
			}
		}
	}

	private void setOutput(String[] outputs) {
		if (outputs == null) {
			this.outputParameter = new String[] { "" };
		} else {
			this.outputParameter = new String[outputs.length];
			for (int i = 0; i < outputs.length; i++) {
				this.outputParameter[i] = outputs[i];
			}
		}
	}

	private void setInputExp(String[] inputArgs) {
		if (inputArgs == null) {
			this.inputExp = new String[] { "" };

		} else {
			this.inputExp = new String[inputArgs.length];
			for (int i = 0; i < inputArgs.length; i++) {
				this.inputExp[i] = inputArgs[i];
			}
		}

	}

	private void setOutputExp(String[] outputArgs) {
		if (outputArgs == null) {
			this.outputExp = new String[] { "" };

		} else {
			this.outputExp = new String[outputArgs.length];
			for (int i = 0; i < outputArgs.length; i++) {
				this.outputExp[i] = outputArgs[i];
			}
		}
	}

	public String getIdentifier() {
		return identifier;
	}

	public String[] getInput() {
		return inputParameter;
	}

	public String[] getOutput() {
		return outputParameter;
	}

}
