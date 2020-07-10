package de.tu_bs.cs.isf.familymining.ppu_iec.parts.compare_engine_view.view;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.CompareEngine;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.util.MetricContainerSerializer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.util.SolutionSerializer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.DefaultSettingContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.SaveResultContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.match.interfaces.AbstractMatcher;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.match.interfaces.IMatcher;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.util.IECCompareUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.parts.compare_engine_view.string_table.CEStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.EMFModelLoader.impl.EMFModelLoader;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.benchmark.BenchmarkSystem;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.gui.swt.util.SWTGuiBuilder;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.PreferencesUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.key_value.KeyValueNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPContentProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
/**
 * This class represents the view in the MVC implementation of the CompareEngine.
 * @author {Kamil Rosiak}
 *
 */
public class CompareEngineView {
	private ComboViewer matchViewer;
	private Button weightedcheck, saveAsResult;
	private ServiceContainer services;
	private Configuration sourceModel;
	private Configuration targetModel;
	private MetricContainer metricContainer;
	private IMatcher matcher; 
	private CLabel sourceModelLabel;
	private CLabel targetModelLabel;
	private CLabel metricLabel;
	private ConfigurationResultRoot currentResult;
	private BenchmarkSystem benchmark = new BenchmarkSystem();
	private Group grpSourceModel, grpTargetModel;
	private Composite parent;
	
	public MetricContainer getMetricContainer() {
		return metricContainer;
	}

	public void setMetricContainer(MetricContainer metricContainer) {
		this.metricContainer = metricContainer;
	}

	public CompareEngineView(Composite parent, ServiceContainer services) {
		this.services = services;
		this.setParent(parent);
		createControl(parent);
	}
	
	public void createControl(Composite parent) {
		parent.setLayout(new GridLayout());
		GridData data = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		
		/**
		 * Source Group
		 */
		grpSourceModel = SWTGuiBuilder.creatGroup(parent, CEStringTable.SOURCE_MODEL_LABEL, new FillLayout(SWT.HORIZONTAL), data);
		sourceModelLabel = SWTGuiBuilder.createCLabel(grpSourceModel, CEStringTable.SOURCE_MODEL_LABEL, services.imageService.getImage(PPUStringTable.BUNDLE_NAME, "icons/model_24.png"));
		//Create Button to open a FileSelectionDialog to choose the source model from the filesystem.
		SWTGuiBuilder.createButton(grpSourceModel, CEStringTable.SELECT_MODEL_LABEL, e->{
			Configuration sourceModel = (Configuration) EMFModelLoader.load(RCPMessageProvider.getFilePathDialog("Select Source Model", E4CStringTable.MODEL_DIRECTORY), E4CStringTable.FILE_ENDING_CONFIGURATION);
			if(sourceModel != null) {
				this.setSourceModel(sourceModel);
			}
		});
		/**
		 * Target Group
		 */
		grpTargetModel = SWTGuiBuilder.creatGroup(parent, CEStringTable.TARGET_MODEL_LABEL, new FillLayout(SWT.HORIZONTAL), data);
		targetModelLabel = SWTGuiBuilder.createCLabel(grpTargetModel, CEStringTable.TARGET_MODEL_LABEL,services.imageService.getImage(PPUStringTable.BUNDLE_NAME, "icons/model_24.png"));
		//Create Button to open a FileSelectionDialog to choose the target model from the filesystem.
		SWTGuiBuilder.createButton(grpTargetModel, CEStringTable.SELECT_MODEL_LABEL, e-> {
			Configuration configurationModel = (Configuration) EMFModelLoader.load(RCPMessageProvider.getFilePathDialog("Select Target Model", E4CStringTable.MODEL_DIRECTORY), E4CStringTable.FILE_ENDING_CONFIGURATION);
			if(configurationModel != null) {
				this.setTargetModel(configurationModel);
			}
		});
	
		/**
		 * Metric Group
		 */
		Group grpMetric = SWTGuiBuilder.creatGroup(parent, CEStringTable.METRIC_LABEL, new FillLayout(SWT.HORIZONTAL), data);
		metricLabel = SWTGuiBuilder.createCLabel(grpMetric, CEStringTable.SELECT_METRIC_LABEL, services.imageService.getImage(PPUStringTable.BUNDLE_NAME, "icons/config24.png"));
		//Create Button to open a FileSelectionDialog to choose a metric from the filesystem.
		SWTGuiBuilder.createButton(grpMetric, CEStringTable.SELECT_METRIC_LABEL, e-> {
			MetricContainer selectedMetric = MetricContainerSerializer.decode(RCPMessageProvider.getFilePathDialog(E4CStringTable.DIALOG_SELECT_METRIC, E4CStringTable.CONFIG_DIRECTORY));
			if(selectedMetric != null) {
				this.setMetricContainer(selectedMetric);
				metricLabel.setText(selectedMetric.getName());
				updateWeighted();
			}
		});

		/**
		 * Matching Grp
		 */
		Group grpMatch = SWTGuiBuilder.creatGroup(parent, CEStringTable.MATCHING_LABEL, new FillLayout(), data);
		
		matchViewer = new ComboViewer(grpMatch, SWT.READ_ONLY);
		matchViewer.setContentProvider(ArrayContentProvider.getInstance());
		matchViewer.setLabelProvider(new LabelProvider() {
			@Override
	        public String getText(Object element) {
				if(element instanceof AbstractMatcher) {
					return ((AbstractMatcher)element).getName();
				}
				return "";
	        }
		});
		
		setDefaultMatcher();
		
		Group weightControllGroup = SWTGuiBuilder.creatGroup(parent, "WeightedCompare", new FillLayout(), data);
		
		weightedcheck = SWTGuiBuilder.createButton(weightControllGroup, "", e-> {
			if(metricContainer != null) {
				if(metricContainer.isWeighted()) {
					metricContainer.setWeighted(false);
				} else {
					metricContainer.setWeighted(true);
				}
				updateWeighted();
			} else {
				RCPMessageProvider.errorMessage("Config error","No configuration is selected.");
			}
		}
		, new Color(Display.getCurrent(),150,0,0), false);
				
		weightControllGroup.layout();
		
		saveAsResult = new Button(parent,SWT.CHECK);
		saveAsResult.setText("save after comparing as result ?");
		KeyValueNode saveAsResultNode = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, SaveResultContribution.SAVE_AS_RESULT_PREF,"false");
		saveAsResult.setSelection(saveAsResultNode.getBoolValue());
		
		saveAsResult.addListener(SWT.Selection, e-> {
			saveAsResultNode.setValue(saveAsResult.getSelection());
			PreferencesUtil.storeKeyValueNode(saveAsResultNode);
		});
		
		
		/**
		 * Compare Group
		 */
		Group grpCompare = SWTGuiBuilder.creatGroup(parent, CEStringTable.COMPARE_LABEL, new GridLayout(), data);

		Button compareBtn = SWTGuiBuilder.createButton(grpCompare, CEStringTable.COMPARE_LABEL, e-> {
			
			if(sourceModel == null) {
				RCPMessageProvider.errorMessage(PPUStringTable.CE_ERROR, PPUStringTable.CE_ERROR_SOURCE_MODEL);
			} else {
				if(targetModel == null) {
					RCPMessageProvider.errorMessage(PPUStringTable.CE_ERROR, PPUStringTable.CE_ERROR_TARGET_MODEL);
				} else {
					if(metricContainer ==  null) {
						RCPMessageProvider.errorMessage(PPUStringTable.CE_ERROR, PPUStringTable.CE_ERROR_CONFIG);
					} else {
						if(getMatcher() == null) {
							RCPMessageProvider.errorMessage(PPUStringTable.CE_ERROR, PPUStringTable.CE_ERROR_MATCHER);
						} else {
							compare();
						}
					}	
				}	
			}
		});
		compareBtn.setLayoutData(data);

		setDefaultMetric();
		grpCompare.layout();
		parent.pack();
	}
	
	/**
	 * this method gets the default matcher value from preferences and sets the matcher. 
	 */
	private void setDefaultMatcher() {
		KeyValueNode defaultMatcherValue = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, DefaultSettingContribution.DEFAULT_MATCHER_PREF, "");
		List<Object> objects = RCPContentProvider.getInstanceFromBundle(PPUStringTable.MATCHER_ATTRIBUTE_SYMBOLIC_NAME, PPUStringTable.MATCHER_ATTR_EXTENSION);
		AbstractMatcher defaultMatcher = null;
		int i = 0;
		matchViewer.getCombo().removeAll();
		for(Object obj : objects) {
			if(obj instanceof AbstractMatcher) {
				AbstractMatcher matcher = (AbstractMatcher)obj;
				if(defaultMatcher == null) {
					defaultMatcher = matcher;
				}
				if(matcher.getName().equals(defaultMatcherValue.getStringValue())) {
					defaultMatcher = matcher;
				}
				matchViewer.insert(matcher, i);
				i++;
			}
		}
		if(defaultMatcher != null) {
			matchViewer.setSelection(new StructuredSelection(defaultMatcher));
			matcher = defaultMatcher;
		}
	}
	
	private void compare() {
		CompareEngine compareEngine = new CompareEngine(Arrays.asList(sourceModel), Arrays.asList(targetModel), metricContainer);
		
		benchmark.startBenchmark("Compare Runtime");
		benchmark.startEvent("Compare");
		ConfigurationResultRoot result = compareEngine.compareModelList(Arrays.asList(sourceModel), Arrays.asList(targetModel), metricContainer);
		benchmark.stopEvent("Compare");
		
		update(result);
		
		saveAsResult.setSelection(PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, SaveResultContribution.SAVE_AS_RESULT_PREF,"false").getBoolValue());
		if(saveAsResult.getSelection()) {
			SolutionSerializer.encode(result,true);
		}
		match(result);
		update(result);
		
		benchmark.finishBenchmark("Compare Runtime");
		setCurrentResult(result);
		//Serialize as family model
		SolutionSerializer.encode(result, RCPContentProvider.getCurrentWorkspacePath()+E4CStringTable.FAMILY_MODEL_DIRECTORY,E4CStringTable.FILE_ENDING_FAMILY_MODEL, true);
		
		System.out.println("ModelSimilarity is :"+result.getSimilarity());
		showResult(result);
	}
	
	public void showResult(ConfigurationResultRoot result) {
		services.partService.showPart("de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_view"); 
		services.partService.showPart("de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_detail_view"); 
		services.eventBroker.send(PPUEventTable.RESULT_EVENT, result);
		
	}
	
	private void update(ConfigurationResultRoot result) {
		benchmark.startEvent("Update");
		result.updateSimilarity();
		benchmark.stopEvent("Update");
	}
	
	private void match(ConfigurationResultRoot result) {
		benchmark.startEvent("Matching");
		//Matching 
		if(matcher != getMatcher()) {
			matcher = getMatcher();
		}
		
		matcher.match(result);
		benchmark.stopEvent("Matching");
	}
	
	public void quickCompare() {
		setDefaultMetric();
		if(metricContainer == null) {
			RCPMessageProvider.errorMessage(PPUStringTable.CE_ERROR, PPUStringTable.CE_ERROR_DEFAULT_CONFIG);
		} else {
			setDefaultMatcher();
			//get selected matcher
			if(matcher != getMatcher()) {
				matcher = getMatcher();
			}
			//set save as result option
			saveAsResult.setSelection(PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, SaveResultContribution.SAVE_AS_RESULT_PREF,"false").getBoolValue());
			
			CompareEngine compareEngine = new CompareEngine(Arrays.asList(sourceModel), Arrays.asList(targetModel),matcher, metricContainer, saveAsResult.getSelection(),services);
			Display.getCurrent().asyncExec(compareEngine);
		}
	}
	
	/**
	 * this method gets the default metric from preferences and sets it.
	 */
	private void setDefaultMetric() {
		MetricContainer metric = IECCompareUtil.getDefaultMetric();
		if(metric != null) {
			metricLabel.setText(metric.getName());
			metricContainer = metric;
			KeyValueNode isWeightedValue =  PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, DefaultSettingContribution.DEFAULT_WEIGHTED_PREF, "false");
			metricContainer.setWeighted(isWeightedValue.getBoolValue());
			updateWeighted();
		}
	}
	
	/**
	 * Returns the selected matcher when no matcher available returns null.
	 */
	public AbstractMatcher getMatcher() {
		StructuredSelection selection = (StructuredSelection) matchViewer.getSelection();
		if(selection.getFirstElement() instanceof AbstractMatcher) {
			AbstractMatcher matcher = (AbstractMatcher)selection.getFirstElement();
			return matcher;
		}
		return null;
	}
	
	/**
	 * This method changes the color of a button based on selection.
	 */
	private void updateWeighted() {
		if(metricContainer != null) {
			if(metricContainer.isWeighted()) {
				weightedcheck.setBackground(new Color(Display.getCurrent(),14,135,38));
			} else {
				weightedcheck.setBackground(new Color(Display.getCurrent(),150,0,0));
			}
		} else {
			weightedcheck.setBackground(new Color(Display.getCurrent(),150,0,0));
		}
	}

	public CLabel getSourceModelLabel() {
		return sourceModelLabel;
	}

	public void setSourceModelLabel(CLabel sourceModelLabel) {
		this.sourceModelLabel = sourceModelLabel;
	}

	public CLabel getTargetModelLabel() {
		return targetModelLabel;
	}

	public void setTargetModelLabel(CLabel targetModelLabel) {
		this.targetModelLabel = targetModelLabel;
	}

	public Configuration getSourceModel() {
		return sourceModel;
	}

	public void setSourceModel(Configuration sourceModel) {
		sourceModelLabel.setText(sourceModel.getIdentifier());
		this.sourceModel = sourceModel;
	}

	public Configuration getTargetModel() {
		return targetModel;
	}

	public void setTargetModel(Configuration targetModel) {
		targetModelLabel.setText(targetModel.getIdentifier());
		this.targetModel = targetModel;
	}

	public ConfigurationResultRoot getCurrentResult() {
		return currentResult;
	}

	public void setCurrentResult(ConfigurationResultRoot currentResult) {
		this.currentResult = currentResult;
	}

	public Composite getParent() {
		return parent;
	}

	public void setParent(Composite parent) {
		this.parent = parent;
	}
}
