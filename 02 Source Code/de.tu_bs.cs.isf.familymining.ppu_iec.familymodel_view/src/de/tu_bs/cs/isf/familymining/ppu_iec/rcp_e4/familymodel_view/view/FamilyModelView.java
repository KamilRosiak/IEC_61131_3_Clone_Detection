package de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_view.view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.action.ActionCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.action.ActionImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.LanguageImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.DiagramContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.DiagramElementImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.FBDNetworkImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.LDNetworkImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.SFCLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.implementation.SFCImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.STLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.implementation.STImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelImplementaionOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUActionOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUVariableOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.util.ContainerSortingUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.variable.VariableContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.FamilyModelStrings;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.util.FamilyModelTransformUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.util.VariabilityThresholdsUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.VariableDeclaration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.If;
import de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_view.FamilyModelController;
import de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_view.string_table.FMStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_view.string_table.FileTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.string_table.E4CompareEventTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.gui.swt.util.TreeBuilder;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.featuremodel.core.string_table.FDEventTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.featuremodel.core.string_table.FDStringTable;

public class FamilyModelView {
	private Tree tree;
	private ServiceContainer services;
	private FamilyModelController controller; 
	
	
	public FamilyModelView(Composite parent , FamilyModelController controller,ServiceContainer serviceContainer) {
		this.services = serviceContainer;
		this.controller = controller;
		createTree(parent);
		createSearchBar(parent);
	}


	private void createTree(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		tree = new Tree(parent, SWT.ICON);
		
		//sends a detailEvent when changing the selected tree item 
		tree.addListener(SWT.Selection , e -> {
			if(tree.getSelection().length > 0) {
				if(tree.getSelection()[0].getData() != null) {
					services.eventBroker.send(E4CompareEventTable.SHOW_DETAIL_EVENT, tree.getSelection()[0].getData());
				}
			}
		});
		
		//setting the selection of the selection service.
		tree.addListener(SWT.Selection, e-> {
			services.rcpSelectionService.selectionService.setSelection(tree.getSelection());
		});

		GridData d1 = new GridData(SWT.FILL, SWT.FILL, true, true);
		tree.setLayoutData(d1);
	}
	
	
	private void createSearchBar(Composite parent) {
		Composite searchBar = new Composite(parent, SWT.NONE);
		GridData searchBarDataLayout = new GridData(SWT.FILL, SWT.NONE, true, false);
		
		searchBar.setLayout(new GridLayout(2,false));
		searchBar.setLayoutData(searchBarDataLayout);
		Label searchLabel = new Label(searchBar, SWT.NONE);
		searchLabel.setText("Enter RegEx :");
		
		Combo search = new Combo(searchBar, SWT.NONE);
		GridData comboBoxDataLayout = new GridData(SWT.FILL, SWT.NONE, true, false);
		search.setLayoutData(comboBoxDataLayout);
		toggleSearchbarVisibility(searchBar, false);
		
		//RCPContentProvider.getCurrentWorkspacePath();
    	Path searchHistoryPath = Paths.get("SearchHistory.txt");
		//Load the search history if it exists
		try {
		    List<String> historyListItem = Files.readAllLines(searchHistoryPath);
		    String[] items = historyListItem.get(0).split(";");
		    Arrays.asList(items).forEach(item -> {
		    	search.add(item);
		    });
		} catch (IOException e) {
		    // exception handling
		}
		
		
		tree.addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(((e.stateMask & SWT.CTRL) == SWT.CTRL) && (e.keyCode == 'f') && parent.getVisible()) {
					toggleSearchbarVisibility(searchBar, true);
                } else if (e.keyCode == SWT.ESC && parent.getVisible()) {
					toggleSearchbarVisibility(searchBar, false);
                }	
			}

		});

		search.addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				String inputRegEx = search.getText();
				if(e.keyCode == SWT.CR && !inputRegEx.isEmpty())  {
					List<String> searchHistoryList = Arrays.asList(search.getItems());
					if(!searchHistoryList.contains(inputRegEx)) {
						if(search.getItemCount() >= 10) {
							search.remove(0);
						}
						search.add(inputRegEx);
						storeHistroy(search, searchHistoryPath); //update the stored data (ToDo: try doing rewrite in a smarter way, disposelEvent causes infinity error loop and runtime shutdown hook does not work as the widget is already disposed)

					}
						
					matchAndExpand(tree, inputRegEx);
//					search.setText(""); //empty the search text field when finished matching
				} else if (e.keyCode == SWT.ESC && parent.getVisible()) {
					toggleSearchbarVisibility(searchBar, false);
					resetTreeBackgroundColor(tree);
                }				
			}
		});

		search.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				matchAndExpand(tree, search.getText());
				search.setText("");
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		searchBar.addListener(SWT.FOCUSED, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				search.setFocus();
			}
		});
	}
	
	private void matchAndExpand(Tree tree, String regex) {
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		tree.setRedraw(false);
		matchingForwardRecursion(tree.getItems(), pattern);
		tree.setRedraw(true);
		tree.redraw();
	}
	
	private void matchingForwardRecursion(TreeItem [] tree, Pattern pattern) {
		for(TreeItem item : tree) {
			String itemName = item.getText();
			Matcher matcher = pattern.matcher(itemName);
			if(item.getItems().length > 0) {
				matchingForwardRecursion(item.getItems(), pattern);
			} 
			if(matcher.matches()) {
				expandBackwardRecursion(item);
				item.setBackground(new Color(item.getDisplay(), 255,174,174));
			}
		}
	}

	private void expandBackwardRecursion(TreeItem item) {
		// TODO Auto-generated method stub
		TreeItem parent = item.getParentItem();
		if (parent != null) {
			if(!parent.getExpanded()) parent.setExpanded(true);
			expandBackwardRecursion(parent);
		}
	}
	
	private void toggleSearchbarVisibility(Composite searchBar, boolean isVisible) {
		((GridData)searchBar.getLayoutData()).exclude = !isVisible;
		searchBar.setVisible(isVisible);
		searchBar.getParent().layout(true);
		if(isVisible) searchBar.setFocus();
	}
	
	private void storeHistroy(Combo searchBox, Path searchHistoryPath) {
		String[] searchHistoryItemList = searchBox.getItems();
		String concatItems = searchHistoryItemList[0];
        for (int i = 1; i < searchBox.getItemCount(); i++) {
        	concatItems += ";"+ searchHistoryItemList[i];
        }
        try {
			Files.write(searchHistoryPath, concatItems.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
		   } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
	}
	
	private void resetTreeBackgroundColor(Tree tree) {
		tree.setRedraw(false);
		
		recursiveBackgroundColorReset(tree.getItems());
		
		tree.setRedraw(true);
		tree.redraw();
	}
	
	private void recursiveBackgroundColorReset(TreeItem[] items) {
		for(TreeItem item : items) {
			item.setBackground(new Color(item.getDisplay(), 255,255,255));
			recursiveBackgroundColorReset(item.getItems());
		}
	}

	public void refreshView() {
		tree.removeAll();
		ConfigurationResultRoot compareRoot = controller.getResultRoot();
		ModelCompareContainer modelContainer = compareRoot.getChildren().get(0);
		String sourceName = modelContainer.getLeftLabel();
		String targetName = modelContainer.getRightLabel();
		
		//create tree root 
		TreeItem rootTreeItem = new TreeItem(tree, SWT.ICON);
		rootTreeItem.setImage(services.imageService.getImage(FMStringTable.BUNDLE_NAME, "icons/root_16.png"));
		rootTreeItem.setText(sourceName+"_"+targetName+"_Family_Model");
		
		if(!compareRoot.getChildren().isEmpty()) {
			rootTreeItem.setData(compareRoot.getChildren().get(0));
		}
		
		//for every model compared with an other model.	
		for(ModelCompareContainer modelCont : compareRoot.getChildren()) {
			
			if(modelCont.getModelImplementationOption() != null) {
				processModelImplOption(rootTreeItem, modelCont.getModelImplementationOption());
			}
			
			if(modelCont.getModelVariableOption() != null) {
				processOption(rootTreeItem, modelCont.getModelVariableOption());
			}
		}
		tree.getShell().layout();
		
		/**
		 * Event that shows feature diagram
		 */
		services.partService.showPart(FDStringTable.BUNDLE_NAME);
		services.eventBroker.send(FDEventTable.LOAD_FEATURE_DIAGRAM, FamilyModelTransformUtil.transformToFeatureDiagram(rootTreeItem));
	}
	
	private void processOption(TreeItem parent, IECAbstractOption<?> option) {
		if(!option.getAllContainer().isEmpty()) {
			TreeItem varRoot = createSubsystem(parent, option.getLabel(), null);
			for(AbstractContainer<?, MetricContainer> container : option.getAllContainer()) {
				String first = container.getLeftLabel();
				String second = container.getRightLabel();
				createTreeItem(container.getSimilarity(), varRoot, container, first, second);
			}
		}	
	}

	/**
	 * This method processes a ModelImplementaionOption and builds all items for the implementation.
	 */
	private void processModelImplOption(TreeItem parent, ModelImplementaionOption modelImplOption) {
		
		for(POUCompareContainer pouContainer : modelImplOption.getAllContainer()) {
			String first =  pouContainer.getLeftLabel();
			String second = pouContainer.getRightLabel();

			TreeItem currentTreeItem = createTreeItem(pouContainer.getSimilarity(), parent, pouContainer, first, second);
			processPOUContainer(currentTreeItem, pouContainer);
		}
	}
	
	
	/**
	 * This method processes a POUContainer and calls processing methods for the Option items.
	 */
	private void processPOUContainer(TreeItem parent, POUCompareContainer container) {
		if(container.getPouImplOption() != null) {
			processPOUImplOption(parent, container.getPouImplOption());
		}
		if(container.getPouActionOption() != null) {
			processPOUActionOption(parent, container.getPouActionOption());
		}
		if(container.getPouVarOption() != null) {
			processPOUVarOption(parent,container.getPouVarOption());
		}
	}
	
	
	
	/**
	 * This method processes a POUVariableOption and builds all items for the variables.
	 */
	private void processPOUVarOption(TreeItem parent, POUVariableOption pouVarOption) {
		if(pouVarOption.getAllContainer().size() > 0) {
			TreeItem varRoot = createSubsystem(parent, pouVarOption.getLabel(), null);
			for(VariableContainer modelVarCont : pouVarOption.getAllContainer()) {
				processVarContainer(varRoot, modelVarCont);
				// process variables separately based on their scope, thus input, output etc. 
				
			}
		}
	}
	
	private void processVarContainer(TreeItem parent, VariableContainer varContainer) {
		String first;
		String second;
		VariableDeclaration scope = null;
		//Check for null values 
		first = varContainer.getLeftLabel();
		if(varContainer.getFirst() != null) {
			scope = varContainer.getFirst().getScope();
		}
		if(varContainer.getSecond() != null) {
			scope = varContainer.getSecond().getScope();
		}
		second = varContainer.getRightLabel();

		dispatchBasedOnCategory(varContainer.getSimilarity(), parent, varContainer, first, second, scope);

	}
	
	/**
	 * TODO comment
	 */
	private void dispatchBasedOnCategory(float similarity, TreeItem varRoot, VariableContainer modelVarCont, String first, String second, VariableDeclaration scope) {
		if (scope.equals(VariableDeclaration.VAR_INPUT)) {
		
			for (TreeItem item : varRoot.getItems()) {
				if (item.getText().equals(FMStringTable.SUBSYSTEM_VARIABLES_IN)) {
					createTreeItem(modelVarCont.getSimilarity(), item, modelVarCont, first, second);
					return;
				}
			}
			TreeItem inputVars = createSubsystem(varRoot, FMStringTable.SUBSYSTEM_VARIABLES_IN, null);
			createTreeItem(modelVarCont.getSimilarity(), inputVars, modelVarCont, first, second);
		}
		else if (scope.equals(VariableDeclaration.VAR_OUTPUT)) {
		
			for (TreeItem item : varRoot.getItems()) {
				if (item.getText().equals(FMStringTable.SUBSYSTEM_VARIABLES_OUT)) {
					createTreeItem(modelVarCont.getSimilarity(), item, modelVarCont, first, second);
					return;
				}
			}
			TreeItem inputVars = createSubsystem(varRoot, FMStringTable.SUBSYSTEM_VARIABLES_OUT, null);
			createTreeItem(modelVarCont.getSimilarity(), inputVars, modelVarCont, first, second);
		}
		else if (scope.equals(VariableDeclaration.VAR)) {
		
			for (TreeItem item : varRoot.getItems()) {
				if (item.getText().equals(FMStringTable.SUBSYSTEM_VARIABLES_INTERNAL)) {
					createTreeItem(modelVarCont.getSimilarity(), item, modelVarCont, first, second);
					return;
				}
			}
			TreeItem inputVars = createSubsystem(varRoot, FMStringTable.SUBSYSTEM_VARIABLES_INTERNAL, null);
			createTreeItem(modelVarCont.getSimilarity(), inputVars, modelVarCont, first, second);
		}
	}

	/**
	 * This method processes a POUImplementationOption and builds all items for the imp.
	 */
	private void processPOUImplOption(TreeItem parent, POUImplementationOption pouImplOption) {
		if (!pouImplOption.getAllContainer().isEmpty()) {
			TreeItem subSystemImpl = createSubsystem(parent, pouImplOption.getLabel(), pouImplOption);
			
			//For all implementations
			for (IECAbstractContainer<?> langCompareContainer : pouImplOption.getAllContainer()) {
				//Label the item by implementation type.
				String first = langCompareContainer.getLeftLabel();
				String second = langCompareContainer.getRightLabel();

				TreeItem languageItem = createTreeItem(langCompareContainer.getSimilarity(), subSystemImpl, langCompareContainer, first, second);
				
				AbstractLanguageContainer<?> langContainer = ((AbstractLanguageContainer<?>)langCompareContainer);
				if(langContainer.getImplOption() != null) {
					processLanguageImplOption(languageItem, langContainer.getImplOption());
				}
			}
		}		
	}
	
	/**
	 * This method processes language implementations and calls methods to build the TreeItems for explicit Languages. 
	 */
	private void processLanguageImplOption(TreeItem parent, LanguageImplementationOption<?> implOption) {
		List<?> container = implOption.getAllContainer();
		
		if(!container.isEmpty()) {
			if(container.get(0) instanceof STImplContainer) {
				List<STImplContainer> stContainers = ContainerSortingUtil.sortST(implOption.getAllContainer());
				for(STImplContainer stContainer : stContainers) {
					processSTImpl(parent, stContainer);
				}
			} else if (container.get(0) instanceof SFCImplContainer) {
				List<SFCImplContainer> sfcContainers = ContainerSortingUtil.sortSFC(implOption.getAllContainer());
				for(SFCImplContainer sfcContainer : sfcContainers) {
					processSFCImpl(parent, sfcContainer);
				}
			} else if (container.get(0) instanceof LDNetworkImplContainer) {
				List<LDNetworkImplContainer> ldContainers = ContainerSortingUtil.sortLD(implOption.getAllContainer());
				for(LDNetworkImplContainer ldContainer :ldContainers) {
					processLDNetworkImplContainer(parent, ldContainer);
				}
			} else if(container.get(0) instanceof FBDNetworkImplContainer) {
				List<FBDNetworkImplContainer> networkContainers = ContainerSortingUtil.sortFBD(implOption.getAllContainer());
				for(FBDNetworkImplContainer networkContainer : networkContainers) {
					processFBDNetworkImplContainer(parent, networkContainer);
				}
			}
		}
	}
	
	/**
	 * This method processes implementations in Ladder Diagram and creates the TreeItems.
	 */
	private void processFBDNetworkImplContainer(TreeItem parent, FBDNetworkImplContainer fbdContainer) {
		String first = fbdContainer.getLeftLabel();
		String second = fbdContainer.getRightLabel();
		
		TreeItem networkItem = createTreeItem(fbdContainer.getSimilarity(), parent, fbdContainer, first, second);
		if(fbdContainer.getImplOption() != null) {
			//TODO: sorting for elements
			List<DiagramElementImplContainer> ldContainers = ContainerSortingUtil.sortFBDElements(fbdContainer.getImplOption().getAllContainer());
			for(DiagramElementImplContainer elementContainer : ldContainers) {
				processDiagramElementImpl(networkItem,elementContainer);
			}
		}
	}
	/**
	 * This method processes implementations in Ladder Diagram and creates the TreeItems.
	 */
	private void processLDNetworkImplContainer(TreeItem parent, LDNetworkImplContainer ldContainer) {
		String first = ldContainer.getLeftLabel();
		String second = ldContainer.getRightLabel();
		//Check for null values 

		TreeItem networkItem = createTreeItem(ldContainer.getSimilarity(), parent, ldContainer, first, second);
		if(ldContainer.getImplOption() != null) {
			List<DiagramElementImplContainer> ldContainers = ContainerSortingUtil.sortLDElements(ldContainer.getImplOption().getAllContainer());
			for(DiagramElementImplContainer elementContainer : ldContainers) {
				processDiagramElementImpl(networkItem,elementContainer);
			}
			
		}
	}
	
	/**
	 * This method processes implementations in Ladder Diagram and creates the TreeItems.
	 */
	private void processDiagramElementImpl(TreeItem parent, DiagramElementImplContainer ldContainer) {
		String first = ldContainer.getLeftLabel();
		String second =ldContainer.getRightLabel();

		TreeItem implContainer = createTreeItem(ldContainer.getSimilarity(), parent, ldContainer, first, second);
		if(ldContainer.getImplOption() != null) {
			if(!ldContainer.getImplOption().getAllContainer().isEmpty()) {
				TreeItem subSystemImpl = createSubsystem(implContainer, FMStringTable.SUBSYSTEM_IMPLEMENTATION, ldContainer.getImplOption());
				
				processLanguageImplOption(subSystemImpl, ldContainer.getImplOption());
			}
		}
	}

	/**
	 * This method processes implementations in Sequential Function Chart  and creates the TreeItems.
	 */
	private void processSFCImpl(TreeItem parent, SFCImplContainer sfcContainer) {
		String first = sfcContainer.getLeftLabel();
		String second = sfcContainer.getRightLabel();
		TreeItem step = createTreeItem(sfcContainer.getSimilarity(), parent, sfcContainer, first, second);
		
		if(sfcContainer.getActionOption() != null) {
			TreeItem actions = createSubsystem(step, FamilyModelStrings.SUBSYSTEM_ACTIONS, sfcContainer.getActionOption());
			for(Object container : sfcContainer.getActionOption().getAllContainer()) {
				if(container instanceof ActionCompareContainer) {
					processActionContainer(actions, (ActionCompareContainer)container);
				}
				if(container instanceof VariableContainer) {
					processVarContainer(actions, (VariableContainer)container);
				}
			}
		}

	}

	/**
	 * This method processes implementations in Structured Text and creates the TreeItems.
	 */
	private void processSTImpl(TreeItem parent, STImplContainer stContainer) {
		String first = stContainer.getLeftLabel();
		String second = stContainer.getRightLabel();
		if(stContainer.getFirst() instanceof If && stContainer.getSecond() instanceof If) {
			List<STImplContainer> sortedContainer = ContainerSortingUtil.sortST(stContainer.getImplOption().getAllContainer());
			for(STImplContainer stImplContainer : sortedContainer) {
				processSTImpl(parent, stImplContainer);				
			}
			return;
		}
		TreeItem parentStatement = createTreeItem(stContainer.getSimilarity(), parent, stContainer, first, second);
		if(stContainer.getImplOption() != null) {
			processLanguageImplOption(parentStatement, stContainer.getImplOption());
		}
		
	}
	
	/**
	 * This method processes a POUActionOption and builds all items for the imp.
	 */
	private void processPOUActionOption(TreeItem parent, POUActionOption pouActionOpt) {
		if (!pouActionOpt.getAllContainer().isEmpty()) {
			TreeItem subSystemImpl = createSubsystem(parent, pouActionOpt.getLabel(), pouActionOpt);
			//For all implementations
			for (ActionCompareContainer actionCompareContainer : pouActionOpt.getAllContainer()) {
				processActionContainer(subSystemImpl, actionCompareContainer);
			}
		}		
	}
	
	private void processActionContainer(TreeItem parent, ActionCompareContainer actionContainer) {
		String first = actionContainer.getLeftLabel();
		String second = actionContainer.getRightLabel();
		//Check for null values 

		TreeItem currentItem = createTreeItem(actionContainer.getSimilarity(), parent, actionContainer, first,second);
		//Label the item by implementation type.
		if(actionContainer.getActionImplOption() != null) {
			ActionImplementationOption actionImplOption = actionContainer.getActionImplOption();
			TreeItem actionSystemImpl = createSubsystem(currentItem, actionImplOption.getLabel(), actionImplOption);
			for(IECAbstractContainer<?> langContainer : actionImplOption.getAllContainer()) {
				first = langContainer.getLeftLabel(); 
				second = langContainer.getRightLabel();
				TreeItem languageItem = createTreeItem(langContainer.getSimilarity(), actionSystemImpl, langContainer, first, second);
				if(langContainer instanceof AbstractLanguageContainer && ((AbstractLanguageContainer<?>)langContainer).getImplOption() != null ) {
					processLanguageImplOption(languageItem, ((AbstractLanguageContainer<?>)langContainer).getImplOption());
				}
			}
		}
	}
	
	/**
	 * This method creates a TreeItem for given container based on his similarity and the selected compare mode.
	 */
	private TreeItem createTreeItem(float similarity, TreeItem parent, Object container, String firstElement, String secondElement) {
		TreeItem currentTreeItem = null;
		//different thresholds
		if(container instanceof AbstractContainer) {
			if(!((IECAbstractContainer)container).checkCompared()) {
				if(firstElement != null && secondElement != null && firstElement.equals(secondElement)) {
					return createUncomparedItem(parent, firstElement, container);
				} else {
					if(firstElement != null) {
						return createUncomparedItem(parent,  firstElement, container);
					}
					if(secondElement != null) {
						return createUncomparedItem(parent,  secondElement, container);
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
					currentTreeItem = createMandatoryItem(parent, firstElement, container);
				} else {
					if(firstElement.length() > 10)
						firstElement = firstElement.substring(0, 10);
					if(secondElement.length()> 10)
						secondElement = secondElement.substring(0, 10);

					currentTreeItem = createMandatoryItem(parent,  getPOUPairName(firstElement,secondElement), container);
				}
			}
		} else if(similarity <= (VariabilityThresholdsUtil.getOptionalValue()/100)) {
			String optionalPOUName = firstElement == null ? secondElement : firstElement;
			currentTreeItem = createOptionalItem(parent, optionalPOUName, container);
	    } else {
	    	String variantSubsystemIdentifier = " ( "+firstElement+" / "+secondElement+" )";
	    	currentTreeItem = createAlternativeItem(parent, PPUStringTable.VARIANT_SUBSYSTEM + variantSubsystemIdentifier , container);
	    	IECAbstractContainer<?> cont = (IECAbstractContainer<?>)container;
	    	if (firstElement != null && !firstElement.equals(secondElement)) {
	    		createLeftAlternativeItem(currentTreeItem, firstElement+" - Source Model", cont.getFirst());					
	    		createRightAlternativeItem(currentTreeItem, secondElement+" - Target Model", cont.getSecond());
	    	}
		}

		return currentTreeItem;
	}
	
	/**
	 * This method returns the mandatory value for the given LanguageElement based on his type.
	 */
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
		} else if(langContainer instanceof DiagramElementImplContainer) {
			DiagramElementImplContainer diagramCont = (DiagramElementImplContainer)langContainer;
			if(diagramCont.getFirst() != null ) {
				if(diagramCont.getFirst() instanceof LLElement) {
					mandatoryValue = VariabilityThresholdsUtil.getMandatoryValueLDImpl();
				} else if(diagramCont.getFirst() instanceof FBDElement) {
					mandatoryValue = VariabilityThresholdsUtil.getMandatoryValueLDImpl();
				}
			} else if(diagramCont.getSecond() != null) {
				if(diagramCont.getFirst() instanceof LLElement) {
					mandatoryValue = VariabilityThresholdsUtil.getMandatoryValueLDImpl();
				} else if(diagramCont.getFirst() instanceof FBDElement) {
					mandatoryValue = VariabilityThresholdsUtil.getMandatoryValueLDImpl();
				}
			}
		}
		return mandatoryValue;
	}
	
	/**
	 * This method creates a TreeItem with a SubSystem fashion.
	 */
	private TreeItem createSubsystem(TreeItem parent, String name, Object data) {
		return TreeBuilder.createTreeItem(parent, name, services.imageService.getImage(FMStringTable.BUNDLE_NAME, FileTable.FV_SUB_SYSTEM_16), data);
	}
	
	/**
	 * This method creates a TreeItem with a OptionalItem fashion.
	 */
	private TreeItem createOptionalItem(TreeItem parent, String name, Object data) {
		return TreeBuilder.createTreeItem(parent, name, services.imageService.getImage(FMStringTable.BUNDLE_NAME, FileTable.FV_OPTIONAL_16), data);
	}
	
	/**
	 * This method creates a TreeItem with a AlternativeItem fashion.
	 */
	private TreeItem createAlternativeItem(TreeItem parent, String name, Object data) {
		return TreeBuilder.createTreeItem(parent,name,services.imageService.getImage(FMStringTable.BUNDLE_NAME, FileTable.FV_ALTERNATIVE_16), data);
	}
	
	/**
	 * This method creates a TreeItem with a AlternativeItem fashion.
	 */
	private TreeItem createRightAlternativeItem(TreeItem parent, String name, Object data) {
		return TreeBuilder.createTreeItem(parent,name,services.imageService.getImage(FMStringTable.BUNDLE_NAME, FileTable.FV_ALTERNATIVE_RIGHT_16), data);
	}
	
	/**
	 * This method creates a TreeItem with a AlternativeItem fashion.
	 */
	private TreeItem createLeftAlternativeItem(TreeItem parent, String name, Object data) {
		return TreeBuilder.createTreeItem(parent,name,services.imageService.getImage(FMStringTable.BUNDLE_NAME, FileTable.FV_ALTERNATIVE_LEFT_16), data);
	}
	
	/**
	 * This method creates a TreeItem with a MandatoryItem fashion.
	 */
	private TreeItem createMandatoryItem(TreeItem parent, String name, Object data) {
		return TreeBuilder.createTreeItem(parent, name, services.imageService.getImage(FMStringTable.BUNDLE_NAME, FileTable.FV_MANDATORY_16), data);
	}
	
	/**
	 * This method creates a TreeItem with a MandatoryItem fashion.
	 */
	private TreeItem createUncomparedItem(TreeItem parent, String name, Object data) {
		return TreeBuilder.createTreeItem(parent, name, services.imageService.getImage(FMStringTable.BUNDLE_NAME, FileTable.FV_UNCOMPARED_16), data);
	}
	
	/**
	 * This method returns a name based on given Strings.
	 */
	private String getPOUPairName(String source, String target) {
		String sourceModelName = controller.getResultRoot().getChildren().get(0).getFirst().getResources().get(0).getName();	
		String targetModelName = controller.getResultRoot().getChildren().get(0).getSecond().getResources().get(0).getName();
		String name = sourceModelName+": "+source+" : "+targetModelName+":"+target;
		return name.replaceAll("\n", "");
	}

	public Tree getTree() {
		return tree;
	}
}
