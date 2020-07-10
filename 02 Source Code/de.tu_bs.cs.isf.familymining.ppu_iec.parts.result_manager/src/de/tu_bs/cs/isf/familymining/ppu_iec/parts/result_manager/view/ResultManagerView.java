package de.tu_bs.cs.isf.familymining.ppu_iec.parts.result_manager.view;

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.util.MetricConsistentCheck;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.util.MetricContainerSerializer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.util.SolutionSerializer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.match.interfaces.AbstractMatcher;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.view.MetricManagerTreeDecorater;
import de.tu_bs.cs.isf.familymining.ppu_iec.parts.result_manager.ResultManagerController;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.string_table.E4CompareEventTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.tree.ConfigTree;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.gui.swt.util.SWTGuiBuilder;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CEventTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPContentProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;

public class ResultManagerView {
	private ResultManagerController controller;
	private ConfigTree configTree;
	private Tree tree;
	private ServiceContainer services;
	private ComboViewer matchViewer;
	private Button weightedcheck;
	
	public ResultManagerView(ResultManagerController controller,Composite parent, ServiceContainer services) {
		this.controller = controller;
		this.services = services;
		init(parent);
	}
	
	private void init(Composite parent) {
		parent.setLayout(new GridLayout(1,false));
		setupControllArea(parent);
		setupTree(parent);
		addListener();
	}
	
	private void setupTree(Composite parent) {
		this.configTree = new ConfigTree(parent, SWT.NONE);
		tree = configTree.getTree();
		new ResultManagerDropTarget(tree,this);	
	}
	
	private void addListener() {
		tree.addListener(SWT.Selection, e->{
			if(e.item instanceof TreeItem) {
				TreeItem treeItem = (TreeItem) e.item;
				if(treeItem.getData() instanceof AbstractContainer) {
					services.eventBroker.send(E4CompareEventTable.OPEN_RESULT_WEIGHTS, treeItem);
				}
			}
		});
	}
	
	private void setupControllArea(Composite parent) {
		Group control = new Group(parent, SWT.SHADOW_ETCHED_OUT);
		control.setLayout(new GridLayout(2,false));
		control.setText("Control");
		control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		
		Group controlPanel = new Group(control, SWT.NONE);
		controlPanel.setLayout(new FillLayout(SWT.HORIZONTAL));
		controlPanel.setText("Metric");

		//Setups the save button
		SWTGuiBuilder.createButton(parent, "Show Familymodel", e -> {
			controller.getModel().updateSimilarity();
			//Matching 
			getMatcher().match(controller.getModel());
			controller.getModel().updateSimilarity();						
			System.out.println("ModelSimilarity is :"+controller.getModel().getSimilarity());
			services.partService.showPart("de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_view"); 
			services.partService.showPart("de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_detail_view"); 
			services.eventBroker.send(PPUEventTable.RESULT_EVENT, controller.getModel());
			
		});
		//matcher combo
		matchViewer = new ComboViewer(controlPanel, SWT.READ_ONLY);
		matchViewer.setContentProvider(ArrayContentProvider.getInstance());
		matchViewer.setLabelProvider(new LabelProvider() {
			@Override
	        public String getText(Object element) {
	            if (element instanceof AbstractMatcher) {
	            	AbstractMatcher current = (AbstractMatcher) element;
	            	return current.getName();
	            }
				return "";
	        }
		});
		List<Object> objects = RCPContentProvider.getInstanceFromBundle(PPUStringTable.MATCHER_ATTRIBUTE_SYMBOLIC_NAME, PPUStringTable.MATCHER_ATTR_EXTENSION);
		int i = 0;
		for(Object obj : objects) {
			if(obj instanceof AbstractMatcher) {
				matchViewer.insert((AbstractMatcher)obj, i);
				i++;
			}
		}
		final ISelection selection = new StructuredSelection((AbstractMatcher)objects.get(0));
		matchViewer.setSelection(selection);
		
		weightedcheck = new Button(controlPanel, SWT.NONE);
		weightedcheck.setBackground(new Color(Display.getCurrent(), 150,0,0));
		weightedcheck.addListener(SWT.Selection, e-> {
			if(controller.getModel().getMetric() != null) {
				if(controller.getModel().getMetric().isWeighted()) {
					controller.getModel().getMetric().setWeighted(false);
				} else {
					controller.getModel().getMetric().setWeighted(true);
				}
				updateWeighted();
				controlPanel.layout();
			}
	
		});
		
		Group optionGroup = new Group(control, SWT.NONE);
		optionGroup.setLayout(new FillLayout(SWT.HORIZONTAL));
		optionGroup.setText("Options");
		optionGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		
		//save as config
		SWTGuiBuilder.createButton(optionGroup, "Save As Metric", e -> {
			if(tree.getItemCount() > 0) {
				if(MetricConsistentCheck.weightCheck(controller.getModel().getMetric())) {
					MetricContainerSerializer.encode(controller.getModel().getMetric());
					services.eventBroker.send(E4CEventTable.EVENT_REFRESH_PROJECT_VIEWER, "null");
				}
			} else {
				RCPMessageProvider.errorMessage("no selection", "no result available to save");
			}
		});
		//Save as result
		SWTGuiBuilder.createButton(optionGroup, "Save As Result", e -> {
			if(tree.getItemCount() > 0) {
				SolutionSerializer.encode(controller.getModel(),true);
				services.eventBroker.send(E4CEventTable.EVENT_REFRESH_PROJECT_VIEWER, "null");
			} else {
				RCPMessageProvider.errorMessage("no selection", "no result available to save");
			}
		});

		//Setups the load button
		SWTGuiBuilder.createButton(optionGroup, "Load", e -> {
			String path = RCPMessageProvider.getFilePathDialog(E4CStringTable.DIALOG_SELECT_METRIC,E4CStringTable.RESULT_DIRECTORY);
			ConfigurationResultRoot result = SolutionSerializer.decode(path);
			if(result!= null) {
				controller.setModel(result);
				setResult(result);
				System.out.println("Result: "+ path + " loaded.");
			}
		});
		

		//Setups the expand button
		SWTGuiBuilder.createButton(optionGroup, "Expand Tree",  e -> {
			configTree.expandTree();
		});
		
		SWTGuiBuilder.createButton(optionGroup, "Colapse Tree", e -> {
			configTree.colapseTree();
		});

		controlPanel.pack();
	}
	
	public void setResult(ConfigurationResultRoot result) {
		weightedcheck.setSelection(result.getMetric().isWeighted());
		controller.setModel(result);
		updateWeighted();
		tree.removeAll();
		//MetricContainer
		new MetricManagerTreeDecorater(tree,services, result.getMetric());
	}
		
	public Tree getTree() {
		return tree;
	}

	public void setTree(Tree tree) {
		this.tree = tree;
	}
	
	/**
	 * Returns the selected matcher when no matcher available returns null.
	 */
	public AbstractMatcher getMatcher() {
		StructuredSelection selection = (StructuredSelection)matchViewer.getSelection();
		if(selection.getFirstElement() instanceof AbstractMatcher) {
			AbstractMatcher matcher = (AbstractMatcher)selection.getFirstElement();
			return matcher;
		}
		return null;
	}

	private void updateWeighted() {
		if(controller.getModel().getMetric() != null) {
			if(controller.getModel().getMetric().isWeighted()) {
				weightedcheck.setBackground(new Color(Display.getCurrent(), 14,135,38));
			} else {
				weightedcheck.setBackground(new Color(Display.getCurrent(),150,0,0));
			}
		} else {
			weightedcheck.setBackground(new Color(Display.getCurrent(),150,0,0));
		}
	}

}
