package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.similarity_detail;

import java.util.Arrays;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.action.ActionCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.action.ActionImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.LanguageImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.DiagramContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.DiagramElementImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.LDNetworkImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.SFCLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.implementation.SFCImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.STLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.implementation.STImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelImplementaionOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelVariableOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUActionOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUImplementationOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUVariableOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.util.SolutionUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.variable.VariableContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.detail_view.DetailViewStrings;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUFileTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.parts.detail_view.DetailViewController;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.parts.detail_view.interfaces.IDetailView;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractAttribute;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.OptionAttribute;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.gui.swt.util.TreeBuilder;

public class SimilarityView implements IDetailView {
	public static final String SIMILARITY_VIEW_TAB_NAME = "Details";
	private static final int COLUMN_WIDTH = 300;
	private static final String[] SUPPORTED_CONTAINERS = {
			name(ModelCompareContainer.class),
			name(POUCompareContainer.class),
			name(AbstractLanguageContainer.class),
			name(ActionCompareContainer.class),
			name(VariableContainer.class),
			name(STImplContainer.class),
			name(STLangContainer.class),
			name(SFCImplContainer.class),
			name(SFCLangContainer.class),
			name(LDNetworkImplContainer.class),
			name(DiagramContainer.class),
			name(DiagramElementImplContainer.class)
	};
	
	private DetailViewController controller;
	private Label sourceLabel, targetLabel, similarityLabel ;
	private TreeViewer treeViewer;
	private Composite root;
	
	public SimilarityView() {
		this.root = null;
	}
	
	/**
	 * This method initializing the view elements.
	 */
	@Override
	public void createControl(Composite parent) {
		root = parent;
		root.setLayout(new GridLayout(2, false));
		//source ui
		
		sourceLabel = creatGroupWithLabel(root, getSourceModelName(), 1, false);
		//target ui
		targetLabel = creatGroupWithLabel(root, getTargetModelName(), 1, false);
		//tree ui
		treeViewer = new TreeViewer(root, SWT.BORDER | SWT.ICON);
		Tree tree = treeViewer.getTree();
		tree.setLinesVisible(true);
		tree.setHeaderVisible(true);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		//columns
		TreeBuilder.createTreeColumn(treeViewer.getTree(), DetailViewStrings.NAME_COLUMN_HEADING, SWT.LEFT, COLUMN_WIDTH);
		TreeBuilder.createTreeColumn(treeViewer.getTree(), DetailViewStrings.WEIGHT_COLUMN_HEADING, SWT.CENTER, COLUMN_WIDTH);
		TreeBuilder.createTreeColumn(treeViewer.getTree(), DetailViewStrings.SIMILARITY_COLUMN_HEADING, SWT.RIGHT, COLUMN_WIDTH);
		//sim ui
		similarityLabel = creatGroupWithLabel(root, DetailViewStrings.SIMILARITY_TEXT, 2, false);
		
		root.layout();
	}
	
	private String getSourceModelName() {
		//TODO:AFTEF FIX
		/**
		ConfigurationResultRoot compareRoot = controller.getCompareRoot();
		if (compareRoot != null && compareRoot.getChildren().get(0) != null) {
			return compareRoot.getChildren().get(0).getFirst().getResources().get(0).getName();
		} else {
			return StringTable.SOURCE_TEXT;
		}
		 */
		return DetailViewStrings.SOURCE_TEXT;

	}
	
	private String getTargetModelName() {
		/**
		ConfigurationResultRoot compareRoot = controller.getCompareRoot();
		if (compareRoot != null && compareRoot.getChildren().get(0).getSecond() != null) {
			return compareRoot.getChildren().get(0).getSecond().getResources().get(0).getName();
		} else {
			return StringTable.TARGET_TEXT;
		}
		 */
		return DetailViewStrings.TARGET_TEXT;
	}
	
	/**
	 * This method creates a group with a label in it.
	 */
	private Label creatGroupWithLabel(Composite parent,String groupName, int rowSpan, boolean grabHor) {
		Group sourceGroup = new Group(parent, SWT.NONE);
		sourceGroup.setLayout(new FillLayout(SWT.HORIZONTAL));
		sourceGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, grabHor, rowSpan, 1));
		sourceGroup.setText(groupName);
		Label label = new Label(sourceGroup, SWT.NONE);
		return label;
	}

	/**
	 * This method decorates a TreeItem with an icon.
	 */
	private void decorateItem(TreeItem item) {
		if(item.getData() instanceof AbstractAttribute) {
			item.setImage(controller.getServices().imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.ATTR_ICON_16));
		} else if(item.getData() instanceof OptionAttribute) {
			item.setImage(controller.getServices().imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.OPTION_ICON_16));
		}
	}
	
	/**
	 * This method shows the details of a ModelCompareContainer in the detailView.
	 */
	public void showModelContainer(ModelCompareContainer container) {
		//setting the labels 
		setSimilarityLabel(container.getSimilarity());
		if(container.getFirst() != null) {
			setSourceLabel(container.getFirst().getIdentifier());
		} else {
			setSourceLabel("");
		}
		
		if(container.getSecond() != null) {
			setTargetLabel(container.getSecond().getIdentifier());
		} else {
			setTargetLabel("");
		}
		

		if(container.getModelImplementationOption() != null) {
			ModelImplementaionOption modelImplOption = container.getModelImplementationOption();
			addOptionAttribute(DetailViewStrings.MODEL_IMPL_OPTION, modelImplOption.getOptionAttr() , modelImplOption.getSimilarity());
		}
		
		if(container.getModelVariableOption() != null) {
			ModelVariableOption modelVarOption = container.getModelVariableOption();
			addOptionAttribute(DetailViewStrings.MODEL_VAR_OPTION, modelVarOption.getOptionAttr() , modelVarOption.getSimilarity());
		}

		//adding attributes to view 
		for(ResultElement<Configuration> compareResult : container.getResults()) {
			addAttribute((AbstractAttribute)compareResult.getAttribute(), compareResult.getSimilarity());				
		}	
	}
	
	/**
	 * This method shows the details of a POUCompareContainer in the detailView.
	 */
	public void showPOUContainer(POUCompareContainer container) {
		//setting the label 
		//setting the labels 
		setSimilarityLabel(container.getSimilarity());
		if(container.getFirst() != null) {
			setSourceLabel(container.getFirst().getIdentifier());
		} else {
			setSourceLabel("");
		}
		
		if(container.getSecond() != null) {
			setTargetLabel(container.getSecond().getIdentifier());
		} else {
			setTargetLabel("");
		}

		if(container.getPouImplOption() != null) {
			POUImplementationOption pouImplOption = container.getPouImplOption();
			TreeItem optionParent = addOptionAttribute(DetailViewStrings.POU_IMPL_OPTION, pouImplOption.getOptionAttr() , pouImplOption.getSimilarity());
			//add underlying attrs
			for(IECAbstractContainer<?> compareContainer : pouImplOption.getAllContainer()) {
				showLanguageContainerDetails(compareContainer, optionParent);		 
			}	
		}
		
		if(container.getPouActionOption() != null) {
			POUActionOption pouActionOption = container.getPouActionOption();
			addOptionAttribute(DetailViewStrings.POU_ACTION_OPTION,(OptionAttribute) pouActionOption.getOptionAttr() , pouActionOption.getSimilarity());
		}
		
		if(container.getPouVarOption() != null) {
			POUVariableOption pouVarOption = container.getPouVarOption();
			addOptionAttribute(DetailViewStrings.POU_VAR_OPTION,(OptionAttribute) pouVarOption.getOptionAttr() , pouVarOption.getSimilarity());
		}
		
		//adding attributes to view 
		for(ResultElement<?> compareResult : container.getResults()) {
			addAttribute(compareResult.getAttribute(), compareResult.getSimilarity());				
		}	
	}
	
	/**
	 * This method shows the details of a LanguageCompareContaine in the detailView.
	 */
	private void showLanguageContainerDetails(IECAbstractContainer<?> compareContainer, TreeItem parent) {
		//adding attributes to view 
		for(ResultElement<?> compareResult : compareContainer.getResults()) {
			addAttribute(compareResult.getAttribute(), parent, compareResult.getSimilarity());				 
		}	
	}

	
	/**
	 * This method shows the details of a LanguageCompareContaine in the detailView.
	 */
	public void showLanguageContainer(AbstractLanguageContainer<?> container) {
		//setting the label 
		setLabelForLanguage(container);
		//adding attributes to view 

		if(container.getImplOption() != null) {
			LanguageImplementationOption<?> option = container.getImplOption();
			addOptionAttribute(DetailViewStrings.IMPL_OPTION, option.getOptionAttr(), option.getSimilarity());
		}
		
		for(ResultElement<?> compareResult : container.getResults()) {
			addAttribute(compareResult.getAttribute(), compareResult.getSimilarity());				 
		}
	}
	
	/**
	 * This method shows the details of a POUCompareContainer in the detailView.
	 */
	public void showActionContainer(ActionCompareContainer container) {
		//setting the labels 
		setSimilarityLabel(container.getSimilarity());
		if(container.getFirst() != null) {
			setSourceLabel(container.getFirst().getName());
		} else {
			setSourceLabel("");
		}
		
		if(container.getSecond() != null) {
			setTargetLabel(container.getSecond().getName());
		} else {
			setTargetLabel("");
		}
		
		//adding attributes to view 
		if(container.getActionImplOption() != null) {
			ActionImplementationOption actionImplOption = container.getActionImplOption();
			TreeItem optionParent = addOptionAttribute(DetailViewStrings.ACTION_IMPL_OPTION,actionImplOption.getOptionAttr(), actionImplOption.getSimilarity());
			//add underlying attrs
			for(IECAbstractContainer<?> compareContainer : actionImplOption.getAllContainer()) {
				showLanguageContainerDetails(compareContainer, optionParent);		 
			}
			
		}
		for(ResultElement<?> compareResult : container.getResults()) {
			addAttribute((AbstractAttribute)compareResult.getAttribute(),compareResult.getSimilarity());				
		}	
	}
	
	/**
	 * This method shows the details of a POUCompareContainer in the detailView.
	 */
	public void showVarContainer(VariableContainer container) {
		//setting the labels 
		setSimilarityLabel(container.getSimilarity());
		if(container.getFirst() != null) {
			setSourceLabel(container.getFirst().getName());
		} else {
			setSourceLabel("");
		}
		
		if(container.getSecond() != null) {
			setTargetLabel(container.getSecond().getName());
		} else {
			setTargetLabel("");
		}
		
		//adding attributes to view 
		for(ResultElement<?> compareResult : container.getResults()) {
			addAttribute((AbstractAttribute)compareResult.getAttribute(),compareResult.getSimilarity());				
		}	
	}
	
	/**
	 * This method shows the details of a POUCompareContainer in the detailView.
	 */
	public void showModelVarContainer(VariableContainer container) {
		//setting the labels 
		setSimilarityLabel(container.getSimilarity());
		if(container.getFirst() != null) {
			setSourceLabel(container.getFirst().getName());
		} else {
			setSourceLabel("");
		}
		
		if(container.getSecond() != null) {
			setTargetLabel(container.getSecond().getName());
		} else {
			setTargetLabel("");
		}
		
		//adding attributes to view 
		for(ResultElement<?> compareResult : container.getResults()) {
			addAttribute((AbstractAttribute)compareResult.getAttribute(), compareResult.getSimilarity());				
		}	
	}
	
	/**
	 * This method shows the details of a STImplContainer in the detailView.
	 */
	public void showSTImplContainer(STImplContainer container) {
		setLabelForLanguage(container);
		for(ResultElement<?> compareResult : container.getResults()) {
			addAttribute((AbstractAttribute)compareResult.getAttribute(), compareResult.getSimilarity());
		}
	}
	
	/**
	 * This method shows the details of a SFCImplContainer in the detailView.
	 */
	public void showSFCImplContainer(SFCImplContainer container) {
		setLabelForLanguage(container);
		if(container.getActionOption() != null) {
			addOptionAttribute(DetailViewStrings.ACTION_IMPL_OPTION, container.getActionOption().getOptionAttr(), container.getActionOption().getSimilarity());
		}
		for(ResultElement<?> compareResult : container.getResults()) {
			addAttribute((AbstractAttribute)compareResult.getAttribute(), compareResult.getSimilarity());
		}	
	}
	
	/**
	 * This method adds a attribute TreeItem to the DetailView.
	 */
	private void addAttribute(AbstractAttribute attr, float similarity) {
		TreeItem item = new TreeItem(treeViewer.getTree(), SWT.None);
		item.setText(new String[] {attr.getAttributeName(), String.valueOf(attr.getWeight()),String.valueOf(similarity)});
		item.setData(attr);
		decorateItem(item);
	}
	
	/**
	 * This method adds a attribute TreeItem to the DetailView.
	 */
	private void addAttribute(AbstractAttribute attr,TreeItem parent ,float similarity) {
		TreeItem item = new TreeItem(parent, SWT.None);
		item.setText(new String[] {attr.getAttributeName(), String.valueOf(attr.getWeight()),String.valueOf(similarity)});
		item.setData(attr);
		decorateItem(item);
	}
	
	/**
	 * This method adds a attribute TreeItem to the DetailView.
	 */
	private TreeItem addOptionAttribute(String optionName, OptionAttribute attr, float similarity) {
		TreeItem item = new TreeItem(treeViewer.getTree(), SWT.None);
		item.setText(new String[] {optionName, String.valueOf(attr.getWeight()), String.valueOf(similarity)});
		item.setData(attr);
		decorateItem(item);
		return item;
	}

	/**
	 * This method sets the label for a AbstractLanguageContainer
	 */
	private void setLabelForLanguage(AbstractLanguageContainer<?> container) {
		if(container != null) {
			setSimilarityLabel(container.getSimilarity());
		}
		//source label
		if(container.getFirst() != null) {
			setSourceLabel(SolutionUtil.getFirstLabel(container));	
		} else {
			setSourceLabel("");
		}
		//target label
		if(container.getSecond() != null) {
			setTargetLabel(SolutionUtil.getSecondLabel(container));
		} else {
			setTargetLabel("");
		}
	}
	
	public Label getSourceLabel() {
		return sourceLabel;
	}

	public void setSourceLabel(String sourceLabel) {
		this.sourceLabel.setText(sourceLabel);
	}

	public Label getTargetLabel() {
		return targetLabel;
	}

	public void setTargetLabel(String targetLabel) {
		this.targetLabel.setText(targetLabel);
	}
	
	public Label getSimilarityLabel() {
		return similarityLabel;
	}

	public void setSimilarityLabel(float similarityLabel) {
		this.similarityLabel.setText(String.valueOf(similarityLabel));
	}
	
	public Tree getTree() {
		return treeViewer.getTree();
	}

	@Override
	public <T> boolean isSupportedContainerType(Class<T> containerClass) {
		String className = containerClass.getSimpleName();
		return Arrays.asList(SUPPORTED_CONTAINERS).contains(className);
	}

	@Override
	public void showContainer(Object element) {
		if (element instanceof ModelCompareContainer) {
			showModelContainer((ModelCompareContainer) element);
		} else if (element instanceof POUCompareContainer) {
			showPOUContainer((POUCompareContainer) element);
		} else if (element instanceof SFCImplContainer) {
			showSFCImplContainer((SFCImplContainer) element);
		} else if (element instanceof AbstractLanguageContainer<?>) {
			showLanguageContainer((AbstractLanguageContainer<?>) element);
		} else if (element instanceof ActionCompareContainer) {
			showActionContainer((ActionCompareContainer) element);
		} else if (element instanceof VariableContainer) {
			showVarContainer((VariableContainer)element);
		} else if (element instanceof STImplContainer) {
			showSTImplContainer((STImplContainer) element);
		} else if (element instanceof STLangContainer) {
			showLanguageContainer((STLangContainer) element);
		}  else if (element instanceof SFCLangContainer) {
			showLanguageContainer((SFCLangContainer) element);
		} else if (element instanceof LDNetworkImplContainer) {
			showLanguageContainer((LDNetworkImplContainer) element);
		} else if (element instanceof DiagramContainer) {
			showLanguageContainer((DiagramContainer) element);
		} 
	}

	private static <T> String name(Class<T> clazz) {
		return clazz.getSimpleName();
	}
	
	@Override
	public String getName() {
		return SIMILARITY_VIEW_TAB_NAME;
	}

	@Override
	public void dispose() {
		if (root != null && !root.isDisposed()) {
			root.dispose();
		}
	}

	@Override
	public void setController(DetailViewController controller) {
		this.controller = controller;	
	}
}
