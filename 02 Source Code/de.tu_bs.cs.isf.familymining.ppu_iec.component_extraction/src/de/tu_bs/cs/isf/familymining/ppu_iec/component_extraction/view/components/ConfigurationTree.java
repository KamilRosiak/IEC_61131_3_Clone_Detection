package de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.view.components;

import java.util.ArrayList;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.string_table.FileTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.OrganizationType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ConfigurationTree {
	private TreeView<FXPou> tree;
	
	public ConfigurationTree(List<Configuration> model) {
		initialize(model);
	}
	
	/**
	 * This method initializes the view.
	 * @param model
	 */
	public void initialize(List<Configuration> model) {
		setTree(createTree(model));
		tree.setShowRoot(false);
		tree.setCellFactory(CheckBoxTreeCell.<FXPou>forTreeView());
	}
	
	/**
	 * This method creates the TreeViewer
	 */
	public TreeView<FXPou> createTree(List<Configuration> model) {
		POU rootPOU = ConfigurationFactory.eINSTANCE.createPOU();
		//rootPOU.setIdentifier(model.getIdentifier());
		
		CheckBoxTreeItem<FXPou> root = new CheckBoxTreeItem<FXPou>(new FXPou(rootPOU,rootPOU.getIdentifier()));
		root.getChildren().addAll(getPOUsFromConfig(model));
		return new TreeView<FXPou>(root);
	}
	
	/**
	 * This method extracts all POUs from a configuration and creates FXPou items.
	 * @return 
	 */
	private List<CheckBoxTreeItem<FXPou>> getPOUsFromConfig(List<Configuration> models) {
		List<CheckBoxTreeItem<FXPou>> pouList = new ArrayList<CheckBoxTreeItem<FXPou>>();
		for(Configuration config : models) {
			for(POU pou : config.getResources().get(0).getPous()) {
				CheckBoxTreeItem<FXPou> item = new CheckBoxTreeItem<FXPou> (new FXPou(pou, config.getIdentifier()), new ImageView(new Image(getIconPath(pou))));
				item.setSelected(true);
				pouList.add(item);
			}
		}
		return pouList;
	}
	
	/**
	 * This method return a icon path for the specific pou type.
	 */
	private String getIconPath(POU pou) {
		if(pou.getType() == OrganizationType.PROGRAM) {
			return FileTable.PROGRAM_FILE_ICON;
		} else if(pou.getType() == OrganizationType.FUNCTION) {
			return FileTable.FUNCTION_FILE_ICON;
		} else {
			return FileTable.FUNCTION_BLOCK_FILE_ICON;
		}
	}
	
	/**
	 * This method returns a list of all selected pous.
	 */
	public List<POU> getSelectedPOUs() {
		List<POU> pouList = new ArrayList<POU>();
		for(TreeItem<FXPou> fxPou : tree.getRoot().getChildren()) {
			if(((CheckBoxTreeItem<FXPou>)fxPou).isSelected()) {
				pouList.add(fxPou.getValue().getElement());
			}
		}
		return pouList;
	}
	
	/**
	 * This method selects all elements in the tree.
	 */
	public void selectAllElements() {
		selectAll(true);
	}
	
	/**
	 * This method deselects all elements in the tree.
	 */
	public void deselectAllElements() {
		selectAll(false);
	}
	
	/**
	 * This method changes the selection of elements based on parameter.
	 */
	private void selectAll(Boolean value) {
		for(TreeItem<FXPou> fxPou : tree.getRoot().getChildren()) {
			((CheckBoxTreeItem<FXPou>)fxPou).setSelected(value);
		}
	}
	
	public TreeView<FXPou> getTree() {
		return tree;
	}

	public void setTree(TreeView<FXPou> tree) {
		this.tree = tree;
	}
}
