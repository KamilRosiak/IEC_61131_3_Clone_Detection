package de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.view.components;

import de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.view.ExtractionView;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.gui.java_fx.util.JavaFXBuilder;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import javafx.scene.control.ToolBar;

public class ExtractionViewToolBar extends ToolBar {
	private ServiceContainer services;
	private ExtractionView view;
	
	public ExtractionViewToolBar(ServiceContainer services, ExtractionView view) {
		this.services = services;
		this.view = view;
		initControl();
	}

	/**
	 * This method initializes the ToolBar and adds all buttons to it.
	 */
	private void initControl() {
		minWidthProperty().bind(view.getRootPane().widthProperty());
		
		/**
		 * Add Buttons to ToolBar
		 */
		getItems().add(JavaFXBuilder.createButton("Compare", e-> {
			if(view.getBottomBar().getMetric() == null) {
				RCPMessageProvider.errorMessage("Compare Error", "No Metric is selected, please select a Metric.");
				return;
			}
			
			if(view.getBottomBar().getMatcher() == null) {
				RCPMessageProvider.errorMessage("Compare Error", "No Matcher is selected, please select a Matcher.");
				return;
			}

			services.eventBroker.send(PPUEventTable.COMPARE_POU_EVENT,view.getTree().getSelectedPOUs());
		})); 
		
		getItems().add(JavaFXBuilder.createButton("Select All", e-> {
			view.getTree().selectAllElements();
		})); 
		
		getItems().add(JavaFXBuilder.createButton("Deselect All", e-> {
			view.getTree().deselectAllElements();
		})); 
	}

}
