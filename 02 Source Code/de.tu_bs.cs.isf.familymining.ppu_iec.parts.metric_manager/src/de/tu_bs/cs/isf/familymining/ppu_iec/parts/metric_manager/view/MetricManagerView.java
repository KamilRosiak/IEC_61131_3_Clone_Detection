package de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.view;

import java.io.Serializable;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.function_block_diagram.templates.AbstractFBDImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.ladder_diagram.templates.AbstractLDImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.ladder_diagram.templates.AbstractLDLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractActionAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractModelAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractVariableAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.util.MetricContainerSerializer;
import de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.MetricManagerController;
import de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.string_table.MMStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.tree.ConfigTree;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.gui.swt.util.SWTGuiBuilder;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CEventTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;

/**
 * This class represents the view part of a MVC implementation of the metric.
 * @author {Kamil Rosiak}
 *
 */
public class MetricManagerView implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2520137600439721716L;
	private MetricManagerController controller;
	private Text text;
	private ConfigTree configTree;
	private Tree tree;
	private ServiceContainer _services;
	private MetricManagerTreeDecorater decoratedTree;

	public MetricManagerView(MetricManagerController controller, Composite parent, ServiceContainer services) {
		this.controller = controller;
		_services = services;
		init(parent);
	}

	private void init(Composite parent) {
		parent.setLayout(new GridLayout(1,false));
		setupControllArea(parent);
		setupTree(parent);	
	}
	
	private void setupTree(Composite parent) {
		configTree = new ConfigTree(parent, SWT.CHECK | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		tree = configTree.getTree();
		new MetricManagerDropTarget(tree,this);
	}
	
	private void setupControllArea(Composite parent) {
		Group controlPanel = new Group(parent, SWT.NONE);
		controlPanel.setLayout(new FillLayout(SWT.HORIZONTAL));
		controlPanel.setText("Control");
		controlPanel.setLayoutData(createGridData());
		createNewMetricButton(controlPanel);
		createSaveButton(controlPanel);
		createLoadButton(controlPanel);
		createExpandButton(controlPanel);
		createColapseButton(controlPanel);
		controlPanel.pack();
	}
	
	
	private GridData createGridData() {
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		return gridData;
	}
	
	private Button createSaveButton(Composite parent) {
		return SWTGuiBuilder.createButton(parent, MMStringTable.MM_BUTTON_SAVE, e -> {
			if(tree.getItemCount() > 0) {
				updateConfiguration();
				MetricContainerSerializer.encode(controller.getModel());
				_services.eventBroker.send(E4CEventTable.EVENT_REFRESH_PROJECT_VIEWER, "null");	
			} else {
				RCPMessageProvider.errorMessage("no selection", "no container available to save");
			}
		});
	}
	
	private Button createNewMetricButton(Composite parent) {
		return SWTGuiBuilder.createButton(parent, "New Metric", e -> {
			if(tree.getItemCount() == 0) {
				controller.newConfiguration("");
			} else {
				boolean decision = RCPMessageProvider.questionMessage("Decision","Would you like to create a new configuration ?");
				if(decision) {
					tree.removeAll();
					controller.newConfiguration("");
				}
			}			
		});
	}
	
	private Button createLoadButton(Composite parent) {
		return SWTGuiBuilder.createButton(parent, MMStringTable.MM_BUTTON_LOAD, e -> {
			String path = RCPMessageProvider.getFilePathDialog(E4CStringTable.DIALOG_SELECT_METRIC,E4CStringTable.CONFIG_DIRECTORY);
			MetricContainer metricCont = MetricContainerSerializer.decode(path);
			if(metricCont!= null) {
				setConfiguration(metricCont);
				System.out.println("Metric: "+ path + " loaded.");
			}
		});
	}
	
	private Button createExpandButton(Composite parent) {
		return SWTGuiBuilder.createButton(parent, MMStringTable.MM_BUTTON_EXPAND, e -> {
			configTree.expandTree();
		});	
	}
	
	private Button createColapseButton(Composite parent) {
		return SWTGuiBuilder.createButton(parent, MMStringTable.MM_BUTTON_COLAPSE, e -> {
			configTree.colapseTree();
		});
	}

	public void setConfiguration(MetricContainer metric) {
		tree.removeAll();
		controller.setModel(metric);
		decoratedTree = new MetricManagerTreeDecorater(tree, _services, metric);	
	}
	
	/**
	 * This method updates the model with the data of the view.
	 */
	public void updateConfiguration() {
		if(tree.getItemCount() > 0) {
			MetricContainer metricContainer = controller.getModel();
			metricContainer.clearAllAttributes();
			TreeItem modelAttrs = tree.getItem(0).getItem(0);
			TreeItem pouAttrs = tree.getItem(0).getItem(1);
			TreeItem langAttrs = tree.getItem(0).getItem(2);
			TreeItem actionAttrs = tree.getItem(0).getItem(1).getItem(2);
			TreeItem variableAttr = tree.getItem(0).getItem(3);
			TreeItem stLangAttrs = langAttrs.getItem(1);	
			TreeItem stImplAttrs = stLangAttrs.getItem(0);
			TreeItem sfcLangAttrs = langAttrs.getItem(2);
			TreeItem sfcImplAttrs = sfcLangAttrs.getItem(0);
			TreeItem ldLangAttrs = langAttrs.getItem(3);
			TreeItem ldImplAttrs = ldLangAttrs.getItem(0);
			TreeItem fbdLangAttrs = langAttrs.getItem(4);
			TreeItem fbdImplAttrs = fbdLangAttrs.getItem(0);
			
			//Update model attributes 
			for(TreeItem item : modelAttrs.getItems()) {
				if(item.getData() instanceof AbstractModelAttribute) {
					AbstractModelAttribute modelAttr = (AbstractModelAttribute)item.getData();
					modelAttr.setEnabled(item.getChecked() ? true : false);
					metricContainer.addModelAttribute(modelAttr);
				}
			}
			//Update pou attributes 
			for(TreeItem item : pouAttrs.getItems()) {
				if(item.getData() instanceof AbstractPOUAttribute) {
					AbstractPOUAttribute pouAttr = (AbstractPOUAttribute)item.getData();
					pouAttr.setEnabled(item.getChecked() ? true : false);
					metricContainer.addPOUAttribute(pouAttr);
				}
			}
		
			//update action attr 
			for(TreeItem item : actionAttrs.getItems()) {
				if(item.getData() instanceof AbstractActionAttribute) {
					AbstractActionAttribute actionAttr = (AbstractActionAttribute)item.getData();
					actionAttr.setEnabled(item.getChecked() ? true : false);
					metricContainer.addActionAttribute(actionAttr);
				}
			}
			//update variable attr
			for(TreeItem item : variableAttr.getItems()) {
				if(item.getData() instanceof AbstractVariableAttribute) {
					AbstractVariableAttribute variablAttr = (AbstractVariableAttribute)item.getData();
					variablAttr.setEnabled(item.getChecked() ? true : false);
					metricContainer.addVariabelAttribute(variablAttr);
				}
			}
			
			/**
			 * update language attributes
			 */
			//ST ATTRIBUTES
			for(TreeItem item : stLangAttrs.getItems()) {
				if(item.getData() instanceof AbstractSTLangAttribute) {
					AbstractSTLangAttribute absStAttr = (AbstractSTLangAttribute)item.getData();
					absStAttr.setEnabled(item.getChecked() ? true : false);
					metricContainer.addSTLangAttribute(absStAttr);
				}
			}
			//SFC ATTRIBUTES
			for(TreeItem item : sfcLangAttrs.getItems()) {
				if(item.getData() instanceof AbstractSFCLangAttribute) {
					AbstractSFCLangAttribute absSFCAttr = (AbstractSFCLangAttribute)item.getData();
					absSFCAttr.setEnabled(item.getChecked() ? true : false);
					metricContainer.addSFCLangAttribute(absSFCAttr);
				}
			}
			//LD ATTRIBUTES
			for(TreeItem item : ldLangAttrs.getItems()) {
				if(item.getData() instanceof AbstractLDLangAttribute) {
					AbstractLDLangAttribute absLDAttr = (AbstractLDLangAttribute)item.getData();
					absLDAttr.setEnabled(item.getChecked() ? true : false);
					metricContainer.addLDLangAttribute(absLDAttr);
				}
			}
			
			//FBD ATTRIBUTES
			for(TreeItem item : fbdLangAttrs.getItems()) {
				//TODO: Impl
			}
			
			/**
			 * update implementation attributes
			 */
			//ST ATTRIBUTES
			for(TreeItem item : stImplAttrs.getItems()) {
				if(item.getData() instanceof AbstractSTImplAttribute) {
					AbstractSTImplAttribute absStAttr = (AbstractSTImplAttribute)item.getData();
					absStAttr.setEnabled(item.getChecked() ? true : false);
					metricContainer.addSTImplAttribute(absStAttr);
				}
			}
			//SFC ATTRIBUTES
			for(TreeItem item : sfcImplAttrs.getItems()) {
				if(item.getData() instanceof AbstractSFCImplAttribute) {
					AbstractSFCImplAttribute absSFCAttr = (AbstractSFCImplAttribute)item.getData();
					absSFCAttr.setEnabled(item.getChecked() ? true : false);
					metricContainer.addSFCImplAttribute(absSFCAttr);
				}
			}
			//LD ATTRIBUTES
			for(TreeItem item : ldImplAttrs.getItems()) {
				if(item.getData() instanceof AbstractLDImplAttribute) {
					AbstractLDImplAttribute absLDAttr = (AbstractLDImplAttribute)item.getData();
					absLDAttr.setEnabled(item.getChecked() ? true : false);
					metricContainer.addLDImplAttribute(absLDAttr);
				}
			}
			
			//FBD IMPL ATTRIBUTES
			for(TreeItem item : fbdImplAttrs.getItems()) {
				if(item.getData() instanceof AbstractFBDImplAttribute) {
					AbstractFBDImplAttribute absFBDAttr = (AbstractFBDImplAttribute)item.getData();
					absFBDAttr.setEnabled(item.getChecked() ? true : false); 
					metricContainer.addFBDImplAttribute(absFBDAttr);
				}
			}

			metricContainer.setModelCompare(modelAttrs.getChecked());
			metricContainer.setPOUCompare(pouAttrs.getChecked());
			metricContainer.setLanguageCompare(langAttrs.getChecked());
			metricContainer.setVariableCompare(variableAttr.getChecked());
			
			metricContainer.setModelImplementationOption(modelAttrs.getItem(0).getChecked());
			metricContainer.setModelVariableOption(modelAttrs.getItem(1).getChecked());
			
			metricContainer.setPOUImplementationOption(pouAttrs.getItem(0).getChecked());
			metricContainer.setPOUVariableOption(pouAttrs.getItem(1).getChecked());
			metricContainer.setPOUActionOption(pouAttrs.getItem(2).getChecked());
			
			metricContainer.setLanguageImplementationOption(langAttrs.getItem(0).getChecked());
			metricContainer.setLanguageSTCompare(stLangAttrs.getChecked());
			metricContainer.setLanguageSFCCompare(sfcLangAttrs.getChecked());
			metricContainer.setLanguageLDCompare(ldLangAttrs.getChecked());
			metricContainer.setLanguageFBDCompare(fbdLangAttrs.getChecked());
			
			metricContainer.setSTImplCompare(stImplAttrs.getChecked());
			metricContainer.setSFCImplCompare(sfcImplAttrs.getChecked());
			metricContainer.setLDImplCompare(ldImplAttrs.getChecked());
			metricContainer.setLDFunctionBlockOption(ldImplAttrs.getItem(0).getChecked());
			metricContainer.setFBDImplCompare(fbdImplAttrs.getChecked());
			metricContainer.setFBDSTCompare(fbdImplAttrs.getItem(0).getChecked());
			metricContainer.setSFCActionImplCompare(sfcImplAttrs.getItem(0).getChecked());
			metricContainer.setActionImplementaionOption(actionAttrs.getItem(0).getChecked());
		}
	}
	
	public MetricManagerController getController() {
		return controller;
	}

	public void setController(MetricManagerController _controller) {
		this.controller = _controller;
	}
	
	public void refreshView() {
		text.setText(controller.getModel().getName());
	}

	public Tree getTree() {
		return tree;
	}

	public MetricManagerTreeDecorater getDecoratedTree() {
		if(decoratedTree == null) {
			RCPMessageProvider.errorMessage("Metric Manager Error", "No configuration availible.");
			return null;
		} else {
			return decoratedTree;
		}
	}

	public void setDecoratedTree(MetricManagerTreeDecorater decoratedTree) {
		this.decoratedTree = decoratedTree;
	}
	
	public void expandAndpackConfigTree() {
		configTree.expandTree();
		configTree.packColumn();
	}

}
