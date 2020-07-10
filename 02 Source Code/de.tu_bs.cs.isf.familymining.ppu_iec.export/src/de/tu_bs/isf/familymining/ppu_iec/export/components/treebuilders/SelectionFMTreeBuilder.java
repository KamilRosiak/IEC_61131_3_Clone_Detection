package de.tu_bs.isf.familymining.ppu_iec.export.components.treebuilders;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.isf.familymining.ppu_iec.export.components.FMTreeOptionProcessor;
import de.tu_bs.isf.familymining.ppu_iec.export.components.selection.extractors.FMSelectionExtractors;
import de.tu_bs.isf.familymining.ppu_iec.export.constants.FileTable;
import de.tu_bs.isf.familymining.ppu_iec.export.constants.StringTable;
import de.tu_bs.isf.familymining.ppu_iec.export.utils.MenuUtils;
import de.tu_bs.isf.familymining.ppu_iec.export.utils.TreeUtils;

/**
 * This FMTreeBuilder builds a Tree as used by the PLCOpen-XML Exporter. Use
 * {@link FMSelectionExtractors#fromTree()} to get the current selection from
 * the Tree.
 * 
 * @author Fabian Ochmann
 * 
 */
public final class SelectionFMTreeBuilder extends BasicFMTreeBuilder {
	
	public static final int REQUIRED_STYLE = SWT.CHECK;

	/*
	 * Data-Keys for TreeItems
	 */
	private static final String ORIGINAL_ITEM_TEXT_DATA_TAG = "SelectionFMTreeBuilder.originalItemText";
	private static final String CONTAINER_DATA_TAG = "SelectionFMSelectionTreeBuilder.container";
	
	/**
	 * Represent Options that can be (in)active on the tree
	 */
	private enum TreeOptions {
		SHOW_SCENARIO_NAMES, SHOW_SIMILARITY
	}
	
	/**
	 * All active options
	 */
	private List<TreeOptions> options = new LinkedList<>();
	
	/*
	 * Categorization of the items 
	 */
	private List<TreeItem> mandatoryItems = new LinkedList<>();
	private Map<TreeItem, TreeItem> alternativeItems = new HashMap<>();
	private List<TreeItem> optionalItems = new LinkedList<>();
	private List<TreeItem> uncomparedItems = new LinkedList<>();
	
	public SelectionFMTreeBuilder(Tree tree, ServiceContainer services) {
		super(tree, services);
	}
	
	/**
	 * The tree requires the {@link SWT#CHECK}-Style to be active
	 */
	@Override
	public int requiredTreeStyle() {
		return REQUIRED_STYLE;
	}
	
	/**
	 * Implements the Selection-Logic on click 
	 */
	@Override
	protected Listener getSelectionListener() {
		return event -> {
			if(event.detail == SWT.CHECK) {
				TreeItem item = (TreeItem) event.item;
				if(item != null) onItemChecked(item);
			}
		};
	}
	
	/**
	 * Adds a couple of MenuItems depending on the TreeItem selected.
	 */
	@Override
	protected void buildRightClickMenu(Menu menu, TreeItem treeItem) {
		// Add Expand/Collapse option
		if (treeItem.getItemCount() > 0) {
			// Expand all
			MenuItem expandMenuItem = MenuUtils.createImageMenuItem(menu, "Expand all", () -> {
				treeItem.setExpanded(true);
				TreeUtils.getAllChildItems(treeItem).stream().filter(item -> item.getItemCount() > 0)
						.forEach(item -> item.setExpanded(true));
			}, getServices().imageService.getImage(StringTable.BUNDLE_NAME, FileTable.Icons.EXPAND_ALL_16));
			boolean allExpanded = treeItem.getExpanded() && TreeUtils.getAllChildItems(treeItem).stream()
					.filter(item -> item.getItemCount() > 0).allMatch(TreeItem::getExpanded);
			expandMenuItem.setEnabled(!allExpanded);

			// Collapse all
			MenuItem collapseMenuItem = MenuUtils.createImageMenuItem(menu, "Collapse all", () -> {
				treeItem.setExpanded(false);
				TreeUtils.getAllChildItems(treeItem).stream().filter(item -> item.getItemCount() > 0)
						.forEach(item -> item.setExpanded(false));
			},getServices().imageService.getImage(StringTable.BUNDLE_NAME, FileTable.Icons.COLLAPSE_ALL_16));
			boolean allCollapsed = !treeItem.getExpanded() && TreeUtils.getAllChildItems(treeItem).stream()
					.filter(item -> item.getItemCount() > 0).allMatch(item -> !item.getExpanded());
			collapseMenuItem.setEnabled(!allCollapsed);
		}

		// Show Scenario name after optional/uncompared items
		if (optionalItems.contains(treeItem) || uncomparedItems.contains(treeItem) || isAlternativeItem(treeItem)) {
			MenuUtils.createCheckBoxMenuItem(menu, "Show scenario name",
					options.contains(TreeOptions.SHOW_SCENARIO_NAMES), checked -> {
						setOption(TreeOptions.SHOW_SCENARIO_NAMES, checked);
						updateNameOptions();
					});
		}
		
		//Show similarity after container items
		if(isContainerItem(treeItem)) {
			MenuUtils.createCheckBoxMenuItem(menu, "Show similarity", options.contains(TreeOptions.SHOW_SIMILARITY), checked -> {
				setOption(TreeOptions.SHOW_SIMILARITY, checked);
				updateNameOptions();
			});
		}
	}

	@Override
	protected void clean() {
		getTree().removeAll();
		mandatoryItems.clear();
		alternativeItems.clear();
		optionalItems.clear();
		uncomparedItems.clear();
	}

	@Override
	protected void preOptionProcessing() {}

	@Override
	protected TreeItem initRootItem() {
		//create tree root 
		TreeItem rootTreeItem = new TreeItem(getTree(), SWT.ICON);
	
		rootTreeItem.setImage(getServices().imageService.getImage(FileTable.CORE_BUNDLE_NAME, FileTable.Icons.FV_ROOT_16));
		String name = getFirstScenarioName()+"_"+getSecondScenarioName()+"_Family_Model";
		rootTreeItem.setText(name);
		rootTreeItem.setData(ORIGINAL_ITEM_TEXT_DATA_TAG, name);
		
		if(!getCompareRoot().getChildren().isEmpty()) {
			rootTreeItem.setData(getCompareRoot().getChildren().get(0));
		}
		
		mandatoryItems.add(rootTreeItem);
		return rootTreeItem;
	}

	/**
	 * Uses the {@link BasicFMTreeProcessor} for basic processing
	 */
	@Override
	protected FMTreeOptionProcessor getOptionProcessor() {
		return new BasicFMTreeProcessor(this);
	}
	
	@Override
	protected void postOptionProcessing() {
		if(getRootItem() != null) getRootItem().setExpanded(true);
		updateNameOptions();
		updateTreeCheckedStatus();
	}

	
	/*
	 * Item creation
	 */
	
	@Override
	protected TreeItem createItem(TreeItemType type, TreeItem parent, String name, Object data) {
		return createContainerTreeItem(type, parent, name, data);
	}
	
	/**
	 * Creates an item, depending on the given type and adds it to the according category-list.
	 * If the Item is of an {@link IECAbstractContainer}, Sub-TreeItems will be created.
	 */
	private TreeItem createContainerTreeItem(TreeItemType type, TreeItem parent, String name, Object data) {
		//Create parent item
		TreeItem item = null;
		switch(type) {
		case MANDATORY:
			item = createMandatoryItem(parent, name, data);
			mandatoryItems.add(item);
			break;
		case ALTERNATIVE:
			item = createAlternativeItem(parent, name, data); break;
		case OPTIONAL:
			item = createOptionalItem(parent, name, getOptionalData(data)); 
			optionalItems.add(item);
			break;
		case UNCOMPARED:
			item = createUncomparedItem(parent, name, getOptionalData(data)); 
			uncomparedItems.add(item);
			break;
		}
		
		item.setData(ORIGINAL_ITEM_TEXT_DATA_TAG, name);
		
		//Create alternative pair if data is container with two elements
		if(data instanceof IECAbstractContainer<?>) {
			IECAbstractContainer<?> container = (IECAbstractContainer<?>) data;
			item.setData(CONTAINER_DATA_TAG, container);
			Object first = container.getFirst();
			Object second = container.getSecond();
			if (first != null && second != null && !first.equals(second)) {
				String leftItemText = "Source Model";
				String rightItemText = "Target Model";
	    		TreeItem leftItem = createLeftAlternativeItem(item, leftItemText, container.getFirst());					
	    		TreeItem rightItem = createRightAlternativeItem(item, rightItemText, container.getSecond());
	    		alternativeItems.put(leftItem, rightItem);
	    		leftItem.setData(ORIGINAL_ITEM_TEXT_DATA_TAG, leftItemText);
	    		rightItem.setData(ORIGINAL_ITEM_TEXT_DATA_TAG, rightItemText);
	    		leftItem.setData(CONTAINER_DATA_TAG, container);
	    		rightItem.setData(CONTAINER_DATA_TAG, container);
	    	} 
		}
		
		return item;
	}
	
	/**
	 * Gets the Data for Optional-Items, i.e. if the passed Object is a container and only one 
	 * element is set, this will be returned. Otherwise the Oject itself will be returned.
	 * @param data The Object to check
	 * @return The only set element if the Object is an {@link IECAbstractContainer}, or data itself otherwise
	 */
	private Object getOptionalData(Object data) {
		Object optionalData = data;
		if(data instanceof IECAbstractContainer<?>) {
			IECAbstractContainer<?> container = (IECAbstractContainer<?>) data;
			Object first = container.getFirst();
			Object second = container.getSecond();
			if(first == null || second == null) {
				optionalData = first == null ? second : first;
			}
		}
		return optionalData;
	}
	
	/**
	 * Checks if the item contains data of the type {@link IECAbstractContainer}.
	 */
	private boolean isContainerItem(TreeItem treeItem) {
		return treeItem != null && treeItem.getData() != null && treeItem.getData() instanceof IECAbstractContainer<?>;
	}
	

	/*
	 * Selection-Logic Methods
	 */
	
	private void onItemChecked(TreeItem item) {
		if(item.getItemCount() > 0) {
			onParentItemChecked(item);
		} else {
			onLeafItemChecked(item);
		}
	}
	
	/**
	 * Handle a leaf item getting checked
	 */
	private void onLeafItemChecked(TreeItem item) {
		if(isMandatoryItem(item)) {
			//Mandatory Items -> Stays checked
			item.setChecked(true);
		} else if(isAlternativeItem(item)) {
			//Alternative Item -> Update Checked-Status of alternative item
			if(!item.getChecked()) {
				//If parent is mandatory it can't be unchecked
				if(item.getParentItem() != null && mandatoryItems.contains(item.getParentItem())) {
					TreeItem alternativeItem = getAlternativeItem(item);
					alternativeItem.setChecked(!item.getChecked());				
				}				
			} else {
				TreeItem alternativeItem = getAlternativeItem(item);
				alternativeItem.setChecked(false);
			}
			
			if(item.getParentItem() != null) updateParentItemCheckedStatus(item.getParentItem());
		} else {
			//Optional Items -> Update parent status
			if(item.getParentItem() != null) updateParentItemCheckedStatus(item.getParentItem());
		}
	}

	/**
	 * Handle a parent item getting checked
	 */
	private void onParentItemChecked(TreeItem item) {
		boolean check = item.getChecked() || item.getGrayed();
		
		//(Un)Check all leaf nodes and update their status
		TreeUtils.getAllChildItems(item).stream()
				.filter(Objects::nonNull)
				.filter(childItem -> childItem.getItemCount() == 0)
				.filter(leafItem -> 
					//When we check, alternative items where on of the items is already checked can be left out
					!check || 
					!isAlternativeItem(leafItem) || 
					(!leafItem.getChecked() && !getAlternativeItem(leafItem).getChecked()))
				.filter(leafItem -> 
					//When we uncheck, alternative items where the parent is mandatory can be left out
					check || 
					!(isAlternativeItem(leafItem) && leafItem.getParentItem() != null && isMandatoryItem(leafItem.getParentItem())))
				.forEach(leafItem -> {
					leafItem.setChecked(check);
					onLeafItemChecked(leafItem);
				});
	}

	/**
	 * Update the initial selection for all mandatory items and alternative-pairs after the processing
	 */
	private void updateTreeCheckedStatus() {
		for (TreeItem item : mandatoryItems) {
			item.setChecked(true);
			if(item.getParentItem() != null) updateParentItemCheckedStatus(item.getParentItem());
		}
		
		for(TreeItem item : alternativeItems.keySet()) {
			TreeItem alternativeItem = alternativeItems.get(item);
			if(item.getParentItem() != null && mandatoryItems.contains(item.getParentItem()) && 
					!item.getChecked() && !alternativeItem.getChecked()) {
				item.setChecked(true);
			}
			if(item.getParentItem() != null) updateParentItemCheckedStatus(item.getParentItem());
		}
	}
	
	/**
	 * Update the selection status for the given parent-item recursively
	 * @param item
	 */
	private void updateParentItemCheckedStatus(TreeItem item) {
		if(item != null && item.getItemCount() > 0) {
			int checkedChilds = 0;
			int maxCheckedChilds = item.getItemCount();
			boolean containsAlternativeItems = false;
			
			for(TreeItem child : item.getItems()) {
				if(child.getChecked()) checkedChilds++;
				if(!containsAlternativeItems) containsAlternativeItems = isAlternativeItem(child);
			}
			
			if(containsAlternativeItems) maxCheckedChilds--;
			
			if(checkedChilds == maxCheckedChilds) {
				item.setChecked(true);
				item.setGrayed(false);
			} else if(checkedChilds == 0) {
				item.setChecked(false);
			} else {
				item.setGrayed(true);
				item.setChecked(true);
			}
			
			if(item.getParentItem() != null) updateParentItemCheckedStatus(item.getParentItem());
		}
	}
	
	/*
	 * Option handling
	 */
	
	/**
	 * Adds or removes an option to/from the list of active options.
	 */
	private void setOption(TreeOptions option, boolean active) {
		if(active) options.add(option);
		else options.remove(option);
	}
	
	/**
	 * Iterated thorugh all TreeItems an updated their text, depending on what options are active.
	 */
	private void updateNameOptions() {
		for(TreeItem item : TreeUtils.getAllItems(getTree())) {
			applyNameOptions(item);
		}
	}
	
	/**
	 * Sets the text of all options depending on what options are active
	 */
	private void applyNameOptions(TreeItem item) {
		String text = item.getText();
		Object originalText = item.getData(ORIGINAL_ITEM_TEXT_DATA_TAG);
		if(originalText != null && originalText instanceof String) {
			text = (String) originalText;
			List<String> optionStrings = new LinkedList<>();
			
			//Add Scenario name
			if(options.contains(TreeOptions.SHOW_SCENARIO_NAMES)) {
				if(isOptionalItem(item) || isUncomparedItem(item) || isAlternativeItem(item)) {
					Object data = item.getData(CONTAINER_DATA_TAG);
					if(data != null && data instanceof IECAbstractContainer<?>) {
						IECAbstractContainer<?> container = (IECAbstractContainer<?>) data;
						boolean isFirst = container.getFirst() == item.getData();
						optionStrings.add("Scenario: " + (isFirst ? getFirstScenarioName() : getSecondScenarioName()));
					}
				}
			}
			
			//Show Similarity
			if(options.contains(TreeOptions.SHOW_SIMILARITY)) {
				if(isContainerItem(item)) {
					IECAbstractContainer<?> container = (IECAbstractContainer<?>) item.getData();
					optionStrings.add("Similarity: " + container.getSimilarity());
				}
			}
			
			if(!optionStrings.isEmpty()) {
				text =  originalText + " - " + String.join(", ", optionStrings) + "";
			}
		}
		
		item.setText(text);
	}
	
	
	
	/*
	 * Helper Methods
	 */
	
	private boolean isMandatoryItem(TreeItem item) {
		return item != null && mandatoryItems.contains(item);
	}
	
	private boolean isOptionalItem(TreeItem item) {
		return item != null && optionalItems.contains(item);
	}
	
	private boolean isUncomparedItem(TreeItem item) {
		return item != null && uncomparedItems.contains(item);
	}
	
	private boolean isAlternativeItem(TreeItem item) {
		if(item == null) return false;
		
		return alternativeItems.containsKey(item) || alternativeItems.containsValue(item);
	}
	
	/**
	 * Gets the alternative item for the given item, or null if none is present.
	 * @param item The item for which the alternative item should be returned
	 * @return The alternative item if the given item has one, null otherwise
	 */
	private TreeItem getAlternativeItem(TreeItem item) {
		if(!isAlternativeItem(item)) return null;
		
		return alternativeItems.containsKey(item) ? alternativeItems.get(item) :
			alternativeItems.keySet().stream()
			.filter(key -> alternativeItems.get(key) == item)
			.findFirst().orElse(null);
	}
	
}