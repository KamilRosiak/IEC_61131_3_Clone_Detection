package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.util;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements.FBCTD;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements.FBCTU;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements.FBExecutionBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements.FBF_TRIG;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements.FBRS;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements.FBR_TRIG;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements.FBSR;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements.FBTOF;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements.FBTON;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements.LDCoil;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements.LDContact;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.diagram_diff.elements.LDVerticalConnector;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.ExecutionBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.ld.LDNameUtil;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 * this class maps Strings from the family model elements to JavaFX graphical
 * elements creates by us also paints the elements in the given pane
 * 
 * @author Domenik Eichhorn, Eike Schmitz, Ziad Alhajjar
 */

public class ElementMapper {

	public static void mapObject(DiagramElement element, int color, GridPane pane, int column, int row) {
		if (element == null || pane == null) {
			return;
		}
		String object = LDNameUtil.getName(element);
		String type;
		String name;
		String status = "";
		String[] inputPorts = new String[element.getInputPorts().size()];
		String[] outputPorts = new String[element.getOutputPorts().size()];
		if (!object.contains(":")) {
			type = object;
			name = "";
		} else {
			type = object.split(":")[0];
			name = object.split(":")[1];
		}
		// get LLElementStatus as String
		if (element instanceof LLElement) {
			status = ((LLElement) element).getStatus().toString();
		}
		if (element instanceof FBDElement) {

			// objectType = ((FBDElement) element).getFBDElementType()
			for (int i = 0; i < element.getInputPorts().size(); i++) {
				inputPorts[i] = LDNameUtil.getName(element.getInputPorts().get(i).getAttachedElement());
			}
			
			for (int i = 0; i < element.getOutputPorts().size(); i++) {
				outputPorts[i] = LDNameUtil.getName(element.getOutputPorts().get(i).getAttachedElement());

			}
			// checking whether the FDBElement is instance of StandardFunctionBlock or
			// StandardFunction
			if (((FBDElement) element) instanceof StandardFunctionBlock) {
				StandardFunctionBlock stFB = (StandardFunctionBlock) element;
				type = stFB.getFunctionBlockOperation().getName();
			} else if (((FBDElement) element) instanceof StandardFunction) {
				StandardFunction stF = (StandardFunction) element;
				type = stF.getFunctionOperation().getName();
			}
			// pane.add(new FBRawElement("FB" + type, null, null,
			// GDVStringTable.DEFAULT_SCALE, status, null, null), column, row);
		}

		switch (type) {
		case "TON":
			pane.add(new FBTON(status, inputPorts, outputPorts, color), column, row);
			return;
		case "TOF":
			pane.add(new FBTOF(status, inputPorts, outputPorts, color), column, row);
			return;
		case "CTD":
			pane.add(new FBCTD(status, inputPorts, outputPorts, color), column, row);
			return;
		case "CTU":
			pane.add(new FBCTU(status, inputPorts, outputPorts, color), column, row);
			return;
		case "SR":
			pane.add(new FBSR(status, inputPorts, outputPorts, color), column, row);
			return;
		case "RS":
			pane.add(new FBRS(status, inputPorts, outputPorts, color), column, row);
			return;
		case "RTRIG":
			pane.add(new FBR_TRIG(status, inputPorts, outputPorts, color), column, row);
			return;
		case "FTRIG":
			pane.add(new FBF_TRIG(status, inputPorts, outputPorts, color), column, row);
			return;
		case "LEFT_POWERRAIL":
			pane.add(new LDVerticalConnector(0), column, row);
			return;
		case "RIGHT_POWERRAIL":
			pane.add(new LDVerticalConnector(0), column, row);
			return;
		case "CONTACT":
			// Check if negated
			if (status == "NORMAL_CLOSE") {
				pane.add(new LDContact(name, true, color), column, row);
			} else {
				pane.add(new LDContact(name, false, color), column, row);
			}
			return;
		case "COIL":
			// check if is reset
			if (status == "RESET") {
				pane.add(new LDCoil(name, true, color), column, row);
			} else {
				pane.add(new LDCoil(name, false, color), column, row);
			}
			return;
		default:
			String structuredText = "";
			if (element instanceof ExecutionBlock) {
				ExecutionBlock execImplContainer = (ExecutionBlock) element;
				structuredText = execImplContainer.getExecutionStatements().getText();
				String information = "[" + type + "]" + "\n" + "[" + structuredText + "]";
				pane.add(new FBExecutionBlock(execImplContainer.getName(), information, color), column, row);
				//pane.add(new Text("[" + type + "]" + "\n" + "[" + structuredText + "]"), column, row);
			} else {
				pane.add(new Text("[" + type + "]"), column, row);
			}
			return;
		}
	}
}
