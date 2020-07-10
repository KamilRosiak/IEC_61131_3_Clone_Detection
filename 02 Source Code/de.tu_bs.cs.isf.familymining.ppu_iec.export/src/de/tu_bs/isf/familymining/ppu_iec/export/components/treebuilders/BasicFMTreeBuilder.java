package de.tu_bs.isf.familymining.ppu_iec.export.components.treebuilders;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuAdapter;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.action.ActionCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.DiagramContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.FBDNetworkImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.LDNetworkImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.SFCLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.implementation.SFCImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.STLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.implementation.STImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.VariabilityCategoryThresholds;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.util.VariabilityThresholdsUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.gui.swt.util.TreeBuilder;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.isf.familymining.ppu_iec.export.components.FMTreeBuilder;
import de.tu_bs.isf.familymining.ppu_iec.export.components.FMTreeOptionProcessor;
import de.tu_bs.isf.familymining.ppu_iec.export.constants.FileTable;
import de.tu_bs.isf.familymining.ppu_iec.export.constants.StringTable;

/**
 * A basic construct for an {@link FMTreeBuilder}, already taking care of a lot of the usually required functionalities.
 * 
 * @author Fabian Ochmann
 *
 */
public abstract class BasicFMTreeBuilder implements FMTreeBuilder {
	
	/**
	 * The type of a TreeItem
	 */
	enum TreeItemType {
		MANDATORY, ALTERNATIVE, OPTIONAL, UNCOMPARED
	}
	
	private Tree tree;
	private ConfigurationResultRoot compareRoot;
	private ServiceContainer services;
	
	private FMTreeOptionProcessor optionProcessor;
	private TreeItem rootTreeItem;
	
	public BasicFMTreeBuilder(Tree tree, ServiceContainer services) {
		super();
		this.tree = tree;
		this.services = services;
		this.optionProcessor = getOptionProcessor();
		initTree();
	}

	/**
	 * Adds a given Listener for {@link SWT#Selection}-Events and takes care of
	 * cleaning/rebuilding Context-Menus for TreeItems.
	 */
	protected void initTree() {
		if(getSelectionListener() != null) 
			tree.addListener(SWT.Selection, getSelectionListener());
		
		//Set the right click menu
		Menu rightClickMenu = new Menu(tree);
		rightClickMenu.addMenuListener(new MenuAdapter() {
			@Override
			public void menuShown(MenuEvent e) {
				//Clear existing items
				MenuItem[] items = rightClickMenu.getItems();
	            for (int i = 0; i < items.length; i++)
	            {
	                items[i].dispose();
	            }
				if(tree.getSelectionCount() == 1) {
					TreeItem treeItem = tree.getSelection()[0];
					buildRightClickMenu(rightClickMenu, treeItem);
				}
			}
		});
		tree.setMenu(rightClickMenu);
	}
	
	/**
	 * Add {@link MenuItem}-Objects as need to the given menu for the selected TreeItem.
	 * @param rightClickMenu The menu on which to add the MenuItems
	 * @param treeItem The TreeItem which was selected
	 */
	protected abstract void buildRightClickMenu(Menu rightClickMenu, TreeItem treeItem);

	/**
	 * The Listener the handle {@link SWT#Selection}-Events if needed
	 * @return The Listener the handle {@link SWT#Selection}-Events if needed
	 */
	protected abstract Listener getSelectionListener();

	/**
	 * Implements a basic refesh-process:<br>
	 * 1. Cleaning the tree<br>
	 * 2. Actions before option-processing<br>
	 * 3. The options-processing itself<br>
	 * 4. Actions after option-processing<br>
	 */
	@Override
	public void refreshTree() {
		clean();
		preOptionProcessing();
		processOptions();
		postOptionProcessing();
	}

	/**
	 * Clean the current Tree and other objects a needed before refreshing the tree.
	 */
	protected abstract void clean();
	
	/**
	 * Things to before the actual option-processing.
	 */
	protected abstract void preOptionProcessing();

	private void processOptions() {
		rootTreeItem = initRootItem();
		//for every model compared with an other model.	
		for(ModelCompareContainer modelCont : compareRoot.getChildren()) {
			
			if(modelCont.getModelImplementationOption() != null) {
				optionProcessor.processModelImplOption(rootTreeItem, modelCont.getModelImplementationOption());
			}
			
			if(modelCont.getModelVariableOption() != null) {
				optionProcessor.processOption(rootTreeItem, modelCont.getModelVariableOption());
			}

		}
	}
	
	/**
	 * Things to before the option-processing.
	 */
	protected abstract void postOptionProcessing();
	
	/**
	 * Initialize the root item for the Tree
	 * @return The initialized root item
	 */
	protected abstract TreeItem initRootItem();

	/**
	 * The {@link FMTreeOptionProcessor} to use to process the set FamilyModel
	 * @returnThe {@link FMTreeOptionProcessor} to use to process the set FamilyModel
	 */
	protected abstract FMTreeOptionProcessor getOptionProcessor();
	
	/*
	 * Basic Naming Methods
	 */
	
	/**
	 * Get the name of the first Scenario
	 * @return The name of the first Scenario
	 */
	protected String getFirstScenarioName() {
		return compareRoot.getChildren().get(0).getFirst().getResources().get(0).getName();	
	}
	
	/**
	 * Get the name of the second Scenario
	 * @return The name of the second Scenario
	 */
	protected String getSecondScenarioName() {
		return compareRoot.getChildren().get(0).getSecond().getResources().get(0).getName();	
	}
	
	private String getPOUPairName(String source, String target) {
		String sourceModelName = compareRoot.getChildren().get(0).getFirst().getResources().get(0).getName();	
		String targetModelName = compareRoot.getChildren().get(0).getSecond().getResources().get(0).getName();
		String name = sourceModelName+": "+source+" : "+targetModelName+":"+target;
		return name.replaceAll("\n", "");
	}
	
	private float getValueForLang(AbstractLanguageContainer<?> langContainer){
		float mandatoryValue = 0.0f;
		if(langContainer instanceof STLangContainer || langContainer instanceof STImplContainer) {
			mandatoryValue = VariabilityThresholdsUtil.getMandatoryValueSTImpl();
		} else if(langContainer instanceof SFCLangContainer || langContainer instanceof SFCImplContainer) {
			mandatoryValue = VariabilityThresholdsUtil.getMandatoryValueSFCImpl();
		} else if(langContainer instanceof DiagramContainer || langContainer instanceof LDNetworkImplContainer){
			mandatoryValue = VariabilityThresholdsUtil.getMandatoryValueLDImpl();
		} else if(langContainer instanceof FBDNetworkImplContainer) {
			mandatoryValue = VariabilityThresholdsUtil.getMandatoryValueFBDImpl();
		}
		
		return mandatoryValue;
	}
	
	/*
	 * Basic TreeItem creation
	 */
	
	/**
	 * Categorize the given Objects and call the
	 * {@link #createItem(TreeItemType, TreeItem, String, Object)}-Method
	 * accordingly
	 */
	protected TreeItem createTreeItem(float similarity, TreeItem parent, Object container, String firstElement, String secondElement) {
		TreeItem currentTreeItem = null;
		//different thresholds
		if(container instanceof AbstractContainer) {
			if(!((AbstractContainer<?, ?>)container).isCompared()) {
				if(firstElement != null && secondElement != null && firstElement.equals(secondElement)) {
					return createItem(TreeItemType.UNCOMPARED, parent, firstElement, container);
				} else {
					if(firstElement != null) {
						return createItem(TreeItemType.UNCOMPARED, parent, firstElement, container);
					}
					if(secondElement != null) {
						return createItem(TreeItemType.UNCOMPARED, parent, secondElement, container);
					}
				}
			}
		}
		
		float mandatoryValue = 0.0f;
		if(VariabilityThresholdsUtil.isGranularTH()) {
			if(container instanceof ActionCompareContainer) {
				mandatoryValue = VariabilityThresholdsUtil.getMandatoryValueAction();
			} else if(container instanceof POUCompareContainer) {
				mandatoryValue = VariabilityThresholdsUtil.getMandatoryValuePOU();
			} else if(container instanceof AbstractLanguageContainer) {
				AbstractLanguageContainer<?> langContainer = (AbstractLanguageContainer<?>) container;
				if(langContainer.getFirst() != null) {
					mandatoryValue = getValueForLang(langContainer);
				} else if(langContainer.getSecond() != null) {
					mandatoryValue = getValueForLang(langContainer);
				}
			} else {
				mandatoryValue = VariabilityThresholdsUtil.getMandatoryValue();
			}
		} else {
			mandatoryValue = VariabilityThresholdsUtil.getMandatoryValue();
		}

		
		if(similarity >= (mandatoryValue / 100)) {
			if(firstElement != null && secondElement != null) {
				if(firstElement.equals(secondElement)) {
					currentTreeItem = createItem(TreeItemType.MANDATORY, parent, firstElement, container);
				} else {
					if(firstElement.length() > 10)
						firstElement = firstElement.substring(0, 10);
					if(secondElement.length()> 10)
						secondElement = secondElement.substring(0, 10);
					String pairName = getPOUPairName(firstElement, secondElement);
					currentTreeItem = createItem(TreeItemType.MANDATORY, parent, pairName, container);
				}
			}
		} else if(similarity == VariabilityCategoryThresholds.OPTIONAL_THRESHOLD) {
			String optionalPOUName = firstElement == null ? secondElement : firstElement;
			currentTreeItem = createItem(TreeItemType.OPTIONAL, parent, optionalPOUName, container);
	    } else {
	    	String variantSubsystemIdentifier = " ( "+firstElement+" / "+secondElement+" )";
	    	currentTreeItem = createItem(TreeItemType.ALTERNATIVE, parent, PPUStringTable.VARIANT_SUBSYSTEM + variantSubsystemIdentifier , container);
		}

		return currentTreeItem;
	}
	
	/**
	 * Create a TreeItem of the given Type with the given text and data.
	 * 
	 * @param type The category of the TreeItem to create
	 * @param parent The parent of the TreeItem to create
	 * @param text The Text of the TreeItem to create
	 * @param data The data of the TreeItem to create
	 * @return The created TreeItem
	 */
	protected abstract TreeItem createItem(TreeItemType type, TreeItem parent, String text, Object data);

	/**
	 * This method creates a TreeItem with a Subsystem fashion.
	 */
	protected TreeItem createSubsystem(TreeItem parent, String name, Object data) {
		return TreeBuilder.createTreeItem(parent, name, services.imageService.getImage(FileTable.CORE_BUNDLE_NAME, FileTable.Icons.FV_SUB_SYSTEM_16), data);
	}
	
	/**
	 * This method creates a TreeItem with a OptionalItem fashion.
	 */
	protected TreeItem createOptionalItem(TreeItem parent, String name, Object data) {
		return TreeBuilder.createTreeItem(parent, name, services.imageService.getImage(FileTable.CORE_BUNDLE_NAME, FileTable.Icons.FV_OPTIONAL_16), data);
	}
	
	/**
	 * This method creates a TreeItem with a AlternativeItem fashion.
	 */
	protected TreeItem createAlternativeItem(TreeItem parent, String name, Object data) {
		return TreeBuilder.createTreeItem(parent,name,services.imageService.getImage(FileTable.CORE_BUNDLE_NAME, FileTable.Icons.FV_ALTERNATIVE_16), data);
	}
	
	/**
	 * This method creates a TreeItem with a AlternativeItem fashion.
	 */
	protected TreeItem createRightAlternativeItem(TreeItem parent, String name, Object data) {
		return TreeBuilder.createTreeItem(parent,name,services.imageService.getImage(FileTable.CORE_BUNDLE_NAME, FileTable.Icons.FV_ALTERNATIVE_RIGHT_16), data);
	}
	
	/**
	 * This method creates a TreeItem with a AlternativeItem fashion.
	 */
	protected TreeItem createLeftAlternativeItem(TreeItem parent, String name, Object data) {
		return TreeBuilder.createTreeItem(parent,name,services.imageService.getImage(FileTable.CORE_BUNDLE_NAME, FileTable.Icons.FV_ALTERNATIVE_LEFT_16), data);
	}
	
	/**
	 * This method creates a TreeItem with a MandatoryItem fashion.
	 */
	protected TreeItem createMandatoryItem(TreeItem parent, String name, Object data) {
		return TreeBuilder.createTreeItem(parent, name, services.imageService.getImage(FileTable.CORE_BUNDLE_NAME, FileTable.Icons.FV_MANDATORY_16), data);
	}
	
	/**
	 * This method creates a TreeItem with a MandatoryItem fashion.
	 */
	protected TreeItem createUncomparedItem(TreeItem parent, String name, Object data) {
		return TreeBuilder.createTreeItem(parent, name, services.imageService.getImage(FileTable.CORE_BUNDLE_NAME, FileTable.Icons.FV_UNCOMPARED_16), data);
	}


	/*
	 * Getters & Setters
	 */

	@Override
	public Tree getTree() {
		return tree;
	}
	
	@Override
	public void setTree(Tree tree) {
		this.tree = tree;
		initTree();
	}

	@Override
	public ConfigurationResultRoot getCompareRoot() {
		return compareRoot;
	}

	@Override
	public void setCompareRoot(ConfigurationResultRoot compareRoot) {
		this.compareRoot = compareRoot;
	}

	@Override
	public ServiceContainer getServices() {
		return services;
	}

	@Override
	public void setServices(ServiceContainer services) {
		this.services = services;
	}
	
	protected TreeItem getRootItem() {
		return rootTreeItem;
	}

}
