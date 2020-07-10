package de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.view;

import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.ExtractionViewController;
import de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.view.components.ConfigurationTree;
import de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.view.components.ExtractionViewBottomToolBar;
import de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.view.components.ExtractionViewToolBar;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class ExtractionView {
	private BorderPane root;
	private Scene scene;
	private FXCanvas parent;
	private ExtractionViewController controller;
	private ConfigurationTree tree;
	private ExtractionViewBottomToolBar bottomBar;
	
	public ExtractionView(FXCanvas canvas, ExtractionViewController controller) {
		this.parent = canvas;
		this.controller = controller;
	}
	
	/**
	 * This method initialize the TreeViewer and shows them.
	 */
	public void showView(List<Configuration> models) {
	        root = new BorderPane();
	        scene = new Scene(root);
	        tree = new ConfigurationTree(models);
	        scene.getStylesheets().add("css/default_theme.css");
	        
	        root.getChildren().clear();
	        root.setTop(new ExtractionViewToolBar(controller.getServices(), this));
	        bottomBar = new ExtractionViewBottomToolBar(controller.getServices(),this);
	        root.setBottom(bottomBar);
	        root.setCenter(tree.getTree());
	        parent.setScene(scene);
	}
	
	public ConfigurationTree getTree() {
		return tree;
	}
	
	public Pane getRootPane() {
		return root;
	}

	public ExtractionViewBottomToolBar getBottomBar() {
		return bottomBar;
	}

	public void setBottomBar(ExtractionViewBottomToolBar bottomBar) {
		this.bottomBar = bottomBar;
	}
	
}
