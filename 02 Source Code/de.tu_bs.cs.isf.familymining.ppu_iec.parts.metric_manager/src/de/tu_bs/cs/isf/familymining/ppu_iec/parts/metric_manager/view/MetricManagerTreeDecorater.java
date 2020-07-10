package de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
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
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.CMStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUFileTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.util.CMColor;
import de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.util.events.CompareEngineEventConsts;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.gui.swt.util.TreeBuilder;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;


/**
 * This class creates the graphical representation of the metric.
 * @author {Kamil Rosiak}
 */
public class MetricManagerTreeDecorater {
	private static int RESULT_TREE_STYLE = 570426116;
	private ServiceContainer services;
	private MetricContainer config;
	private TreeItem modelContainer, pouContainer, pouActionOption ,variableContainer, langContainer, stContainer, sfcContainer, ldContainer, stImplOption, sfcImplOption,
	ldImplOption, fbdContainer, fbdImplOption, fbdSTImplOption;
	public MetricManagerTreeDecorater(Tree tree, ServiceContainer services, MetricContainer config) {
		this.config = config;
		this.services = services;
		createControll(tree);
	}
	
	private void createControll(Tree tree) {
		//MetricContainer
		TreeItem metricContainer = new TreeItem(tree, SWT.ICON);
		metricContainer.setText(new String[] {config.getName(),CMStringTable.METRIC_CONTAINER_TYPE,config.getConfigurationDescription()});
		metricContainer.setImage(services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.METRIC_ICON_16));
		metricContainer.setBackground(CMColor.METRIC_CONTAINER_COLOR);
		metricContainer.setData(config);
		metricContainer.setChecked(true);
		metricContainer.setGrayed(true);
		metricContainer.setExpanded(true);
		
		//Create the structure for the model attributes
		modelContainer = TreeBuilder.createTreeItem(metricContainer, CMStringTable.PROJECT_CONTAINER_NAME, CMStringTable.CONTAINER_TYPE,CMStringTable.PROJECT_CONTAINER_DESCRIPTION, 
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.MODEL_CONTAINER_16), config.isModelCompare(), CMColor.MODEL_CONTAINER_COLOR);
		//ModelImplementationOption
	    TreeItem modelImplementationOption = TreeBuilder.createTreeItem(modelContainer, CMStringTable.PROJECT_IMPL_OPTION, CMStringTable.OPTION_TYPE, CMStringTable.PROJECT_IMPL_OPTION_DESC, 
	    		services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.MODEL_OPTION_16), config.isModelImplementationOption(), CMColor.MODEL_ATTR_COLOR,
	    		config.getModelImplementationOptionAttr());

		//ModelVariableOption
		TreeItem modelVariableOption = TreeBuilder.createTreeItem(modelContainer, CMStringTable.PROJECT_VAR_OPTION, CMStringTable.OPTION_TYPE, CMStringTable.PROJECT_VAR_OPTION_DESC, 
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.MODEL_OPTION_16), config.isModelVariableOption(), CMColor.MODEL_ATTR_COLOR,
				config.getModelVariableOptionAttr());
		
		//for all model attributes in configuration
		for(AbstractModelAttribute modelAttr : config.getModelAttributs()) {
			addModelAttribute(modelAttr);
		}
		
		//POUContainer
		pouContainer = TreeBuilder.createTreeItem(metricContainer, CMStringTable.POU_CONTAINER_NAME, CMStringTable.CONTAINER_TYPE,CMStringTable.POU_CONTAINER_DESCRIPTION , 
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.POU_CONTAINER_16), config.isPOUCompare(), CMColor.POU_CONTAINER_COLOR);
		//POU Implementation Option
		TreeItem pouImplementationOption = TreeBuilder.createTreeItem(pouContainer, CMStringTable.POU_IMPL_OPTION, CMStringTable.OPTION_TYPE, CMStringTable.POU_IMPL_OPTION_DESC, 
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.POU_OPTION_16), config.isPOUImplementationOption(), CMColor.POU_ATTR_COLOR, 
				config.getPouOptionAttr());
		//POU Variable Option
		TreeItem pouVariableOption = TreeBuilder.createTreeItem(pouContainer, CMStringTable.POU_VAR_OPTION, CMStringTable.OPTION_TYPE, CMStringTable.POU_VAR_OPTION_DESC, 
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.POU_OPTION_16), config.isPOUVariableOption(), CMColor.POU_ATTR_COLOR, 
				config.getPouVariableOptionAttr());
		//action compare
		pouActionOption = TreeBuilder.createTreeItem(pouContainer, CMStringTable.POU_ACTION_OPTION, CMStringTable.CONTAINER_TYPE,
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.ACTION_OPTION_16), config.isActionOption(), CMColor.ACTION_CONTAINER_COLOR,
				config.getPouActionAttr());

		//ActionImplementationOption
		TreeItem actionImplementaionOption = TreeBuilder.createTreeItem(pouActionOption, CMStringTable.ACTION_IMPL_OPTION, CMStringTable.OPTION_TYPE, CMStringTable.ACTION_IMPL_OPTION_DESC, 
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.ACTION_OPTION_16), config.isActionImplementaionOption(), CMColor.ACTION_ATTR_COLOR,
				config.getActionImplementationAttr());

		//For all POU attributes in configuration
		for(AbstractPOUAttribute pouAttr : config.getPOUAttributs()) {
			addPOUAttribute(pouAttr);
		}

		//for all action attributes in configuration
		for(AbstractActionAttribute actionAttr : config.getActionAttributes()) {
			addActionAttribute(actionAttr);
		}
		
		Image langContainerImg = services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.LANG_CONTAINER_16);
		
		//LanguageContainer
		langContainer = TreeBuilder.createTreeItem(metricContainer, CMStringTable.LANGUAGE_CONTAINER_NAME, CMStringTable.CONTAINER_TYPE, CMStringTable.LANGUAGE_CONTAINER_NAME_CONTAINER_DESCRIPTION,
				langContainerImg, config.isLanguageOption(), CMColor.LANGUAGE_CONTAINER_COLOR);
		//LanguageOption
		TreeItem langOption = TreeBuilder.createTreeItem(langContainer, CMStringTable.LANGUAGE_NESTED_OPTION, CMStringTable.OPTION_TYPE, CMStringTable.LANGUAGE_NESTED_OPTION_DESC,
				langContainerImg, config.isLanguageImplementationOption(), CMColor.LANGUAGE_CONTAINER_COLOR);
		//STContainer
		stContainer = TreeBuilder.createTreeItem(langContainer, CMStringTable.LANGUAGE_ATTR_CONTAINER_ST,CMStringTable.CONTAINER_TYPE, langContainerImg,
				config.isLanguageSTCompare(), CMColor.LANGUAGE_CONTAINER_COLOR);
		
		stImplOption = TreeBuilder.createTreeItem(stContainer, CMStringTable.IMPLEMENTATION_ATTR,CMStringTable.CONTAINER_TYPE, langContainerImg,
				config.isSTImplCompare(), CMColor.LANGUAGE_CONTAINER_COLOR, config.getStImplOptionAttr());

		//SFCContainer
		sfcContainer = TreeBuilder.createTreeItem(langContainer, CMStringTable.LANGUAGE_ATTR_CONTAINER_SFC, CMStringTable.CONTAINER_TYPE,
				langContainerImg, config.isLanguageSFCCompare(), CMColor.LANGUAGE_CONTAINER_COLOR);
		sfcImplOption = TreeBuilder.createTreeItem(sfcContainer, CMStringTable.IMPLEMENTATION_ATTR, CMStringTable.CONTAINER_TYPE, langContainerImg,
				config.isSFCImplCompare(), CMColor.LANGUAGE_CONTAINER_COLOR, config.getSfcImplOptionAttr());
		//Create the ST in SFC compare option
		TreeBuilder.createTreeItem(sfcImplOption, CMStringTable.SFC_ACTION_OPTION, CMStringTable.OPTION_TYPE, CMStringTable.SFC_ACTION_DESC, langContainerImg ,
				config.isSFCActionImplCompare(), CMColor.LANGUAGE_CONTAINER_COLOR, config.getSfcActionImplOption());
		
		//LDContainer
		ldContainer = TreeBuilder.createTreeItem(langContainer, CMStringTable.LANGUAGE_ATTR_CONTAINER_LD, CMStringTable.CONTAINER_TYPE, 
				langContainerImg, config.isLanguageLDCompare(), CMColor.LANGUAGE_CONTAINER_COLOR);
		ldImplOption = TreeBuilder.createTreeItem(ldContainer, CMStringTable.IMPLEMENTATION_ATTR, CMStringTable.CONTAINER_TYPE, langContainerImg ,
				config.isLDImplCompare(), CMColor.LANGUAGE_CONTAINER_COLOR, config.getLdImplOptionAttr());
		//Create the function block compare option
		TreeBuilder.createTreeItem(ldImplOption, CMStringTable.LD_FBD_OPTION, CMStringTable.OPTION_TYPE, CMStringTable.LD_FBD_OPTION_DESC, langContainerImg ,
				config.isLDFunctionBlockOption(), CMColor.LANGUAGE_CONTAINER_COLOR);
		
		//FDBContainer 
		fbdContainer = TreeBuilder.createTreeItem(langContainer, CMStringTable.LANGUAGE_ATTR_CONTAINER_FBD, CMStringTable.CONTAINER_TYPE, 
				langContainerImg, config.isLanguageFBDCompare(), CMColor.LANGUAGE_CONTAINER_COLOR);
		fbdImplOption = TreeBuilder.createTreeItem(fbdContainer, CMStringTable.IMPLEMENTATION_ATTR, CMStringTable.CONTAINER_TYPE, langContainerImg ,
				config.isFBDImplCompare(), CMColor.LANGUAGE_CONTAINER_COLOR, config.getFbdImplOptionAttr());
		//Create the ST compare option for FBs
		TreeBuilder.createTreeItem(fbdImplOption, CMStringTable.FBD_ST_OPTION, CMStringTable.OPTION_TYPE, CMStringTable.FBD_ST_OPTION_DESC, langContainerImg ,
				config.isFBDSTCompare(), CMColor.LANGUAGE_CONTAINER_COLOR, config.getFbdSTImplOption());
		//adding all ST attributes from metric 
		for(AbstractSTImplAttribute stAttr : config.getSTImplAttributes()) {
			addSTImplAttribute(stAttr);
		}
		
		for(AbstractSTLangAttribute stAttr : config.getSTLangAttributes()) {
			addSTLangAttribute(stAttr);
		}
		
		//adding all ST attributes from metric 
		for(AbstractLDImplAttribute ldAttr : config.getLDImplAttributes()) {
			addLDImplAttribute(ldAttr);
		}

		for(AbstractLDLangAttribute ldAttr : config.getLDLangAttributes()) {
			addLDLangAttribute(ldAttr);
		}

		//adding all ST attributes from metric 
		for(AbstractSFCLangAttribute sfcAttr : config.getSFCLangAttributes()) {
			addSFCLangAttribute(sfcAttr);
		}
		for(AbstractSFCImplAttribute sfcAttr : config.getSFCImplAttributes()) {
			addSFCImplAttribute(sfcAttr);
		}
		
		//adding all FBD attributes from metric
		
		for(AbstractFBDImplAttribute fdbAttr : config.getFBDImplAttributes()) {
			addFBDImplAttribute(fdbAttr);
		}
		
		//VairableContainer
		variableContainer = TreeBuilder.createTreeItem(metricContainer,CMStringTable.VARIABLE_CONTAINER_NAME,CMStringTable.CONTAINER_TYPE ,CMStringTable.VARIABLE_CONTAINER_DESCRIPTION,
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.VARIABLE_CONTAINER_16), config.isVariableCompare(), CMColor.VARIABLE_CONTAINER_COLOR);

		//Add all variable attributes to the view 
		for(AbstractVariableAttribute variableAttr : config.getVariableAttributes()) {
			addVariableAttribute(variableAttr);
		}
		
		//Listener usability
		tree.addListener(SWT.Selection, e-> {
			
			if(e.item instanceof TreeItem) {
				TreeItem selection = (TreeItem)e.item;
				//when selecting a group update weight control
				if (selection.getText(1).equals(CMStringTable.CONTAINER_TYPE)) {
					if(!(tree.getStyle() == RESULT_TREE_STYLE)) {
						services.eventBroker.send(CompareEngineEventConsts.OPEN_CONFIG_WEIGHTS, selection);
					} else {
						services.eventBroker.send(CompareEngineEventConsts.OPEN_RESULT_WEIGHTS, selection);
					}

				}

				
				if(selection.equals(metricContainer)) {
					metricContainer.setChecked(true);
				}
				
				//Variables checked when options checked
				if(selection.equals(modelVariableOption) || selection.equals(pouVariableOption)) {
					if(selection.getChecked()) {
						variableContainer.setChecked(true);
					}
				}

				//action implementation
				if(selection.equals(actionImplementaionOption)) {
					if(selection.getChecked()) {
						pouActionOption.setChecked(true);
						pouContainer.setChecked(true);
						modelContainer.setChecked(true);
						modelImplementationOption.setChecked(true);
					}
				}
				
				//model option duel selection
				if(selection.equals(modelImplementationOption)) {
					if(selection.getChecked()) {
						pouContainer.setChecked(true);
						modelContainer.setChecked(true);
					} else {
						pouContainer.setChecked(false);
					}
				}
				if(selection.equals(pouContainer)) {
					if(selection.getChecked()) {
						modelImplementationOption.setChecked(true);
					} else {
						modelImplementationOption.setChecked(false);
					}
				}
				
				//pou option duel selection
				if(selection.equals(langContainer)) {
					if(selection.getChecked()) {
						pouImplementationOption.setChecked(true);
						modelImplementationOption.setChecked(true);
						pouContainer.setChecked(true);
						modelContainer.setChecked(true);
					} else {
						pouImplementationOption.setChecked(false);
					}
				}
				
				if(selection.equals(pouImplementationOption)) {
					if(selection.getChecked()) {
						langContainer.setChecked(true);
						pouContainer.setChecked(true);
						modelContainer.setChecked(true);
						modelImplementationOption.setChecked(true);
					} else {
						if(!pouImplementationOption.getChecked() && !pouActionOption.getChecked()) {
							langContainer.setChecked(false);
						}
					}
				}
				
				if(selection.equals(actionImplementaionOption)) {
					pouActionOption.setChecked(true);
					langContainer.setChecked(true);
					pouContainer.setChecked(true);
					modelContainer.setChecked(true);
					modelImplementationOption.setChecked(true);
				}
				
				if(selection.equals(langOption)) {
					//disable nested implementation 
						langOption.setChecked(false);
						config.setLanguageImplementationOption(false);
				}	
			}
			if(!(tree.getStyle() == RESULT_TREE_STYLE)) {
				services.eventBroker.send(CompareEngineEventConsts.REFRESH_WEIGHTS_CONFIG, "");
			} else {
				services.eventBroker.send(CompareEngineEventConsts.REFRESH_WEIGHTS_RESULT, "");
			}
			
		});
	}
	
	/**
	 * This method adds a AbstractModelAttribute to the metric.
	 */
	public void addModelAttribute(AbstractModelAttribute modelAttr) {
		TreeBuilder.createTreeItem(modelContainer, modelAttr.getAttributeName(),CMStringTable.MODEL_ATTR_TYPE, modelAttr.getAttributDescription(),
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.MODEL_ATTRIBUTE_16), modelAttr.isEnabled(), CMColor.MODEL_ATTR_COLOR, modelAttr);
	}
	
	/**
	 * This method adds a AbstractPOUAttribute to the metric.
	 */
	public void addPOUAttribute(AbstractPOUAttribute pouAttr) {
		TreeBuilder.createTreeItem(pouContainer, pouAttr.getAttributeName(),CMStringTable.POU_ATTR_TYPE,pouAttr.getAttributDescription(),
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.POU_ATTRIBUTE_16), pouAttr.isEnabled(), CMColor.POU_CONTAINER_COLOR, pouAttr);
	}
	
	/**
	 * This method adds a AbstractVariableAttribute to the metric.
	 */
	public void addVariableAttribute(AbstractVariableAttribute variableAttr) {
		TreeBuilder.createTreeItem(variableContainer, variableAttr.getAttributeName(),CMStringTable.VARIABLE_ATTR_TYPE, variableAttr.getAttributDescription(),
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.VARIABLE_ATTRIBUTE_16), variableAttr.isEnabled(), CMColor.VARIABLE_ATTR_COLOR,variableAttr);
	}
	
	/**
	 * This method adds a AbstractActionAttribute to the metric.
	 */
	public void addActionAttribute(AbstractActionAttribute actionAttr) {
		TreeBuilder.createTreeItem(pouActionOption, actionAttr.getAttributeName(),CMStringTable.ACTION_ATTR_TYPE, actionAttr.getAttributDescription(), 
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.ACTION_ATTRIBUTE_16), actionAttr.isEnabled(), CMColor.ACTION_CONTAINER_COLOR, actionAttr);
	}
	
	/**
	 * This method adds a AbstractSTImplAttribute to the metric.
	 */
	public void addSTImplAttribute(AbstractSTImplAttribute stAttr) {
		TreeBuilder.createTreeItem(stImplOption, stAttr.getAttributeName(), PPUStringTable.ST_IMPLEMENTATION_ATTR_TYPE, stAttr.getAttributDescription(), 
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.LANG_ATTRIBUTE_16),stAttr.isEnabled(),CMColor.LANGUAGE_ATTR_COLOR, stAttr);
	}
	/**
	 * This method adds a AbstractSFCImplAttribute to the metric.
	 */
	public void addSFCImplAttribute(AbstractSFCImplAttribute sfcAttr) {
		TreeBuilder.createTreeItem(sfcImplOption, sfcAttr.getAttributeName(), PPUStringTable.SFC_IMPLEMENTATION_ATTR_TYPE, sfcAttr.getAttributDescription(), 
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.LANG_ATTRIBUTE_16),sfcAttr.isEnabled(),CMColor.LANGUAGE_ATTR_COLOR, sfcAttr);
	}
	/**
	 * This method adds a AbstractLDImplAttribute to the metric.
	 */
	public void addLDImplAttribute(AbstractLDImplAttribute ldAttr) {
		TreeBuilder.createTreeItem(ldImplOption, ldAttr.getAttributeName(), PPUStringTable.LD_IMPLEMENTATION_ATTR_TYPE, ldAttr.getAttributDescription(), 
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.LANG_ATTRIBUTE_16),ldAttr.isEnabled(),CMColor.LANGUAGE_ATTR_COLOR, ldAttr);
	}
	
	/**
	 * This method adds a AbstractSTImplAttribute to the metric.
	 */
	public void addSTLangAttribute(AbstractSTLangAttribute stAttr) {
		TreeBuilder.createTreeItem(stContainer, stAttr.getAttributeName(),PPUStringTable.ST_LANGUAGE_ATTR_TYPE,stAttr.getAttributDescription(), 
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.LANG_ATTRIBUTE_16),stAttr.isEnabled(),CMColor.LANGUAGE_ATTR_COLOR, stAttr);
	}
	/**
	 * This method adds a AbstractSFCImplAttribute to the metric.
	 */
	public void addSFCLangAttribute(AbstractSFCLangAttribute sfcAttr) {
		TreeBuilder.createTreeItem(sfcContainer, sfcAttr.getAttributeName(),PPUStringTable.SFC_LANGUAGE_ATTR_TYPE,sfcAttr.getAttributDescription(), 
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.LANG_ATTRIBUTE_16),sfcAttr.isEnabled(),CMColor.LANGUAGE_ATTR_COLOR, sfcAttr);
	}
	/**
	 * This method adds a AbstractLDImplAttribute to the metric.
	 */
	public void addLDLangAttribute(AbstractLDLangAttribute ldAttr) {
		TreeBuilder.createTreeItem(ldContainer, ldAttr.getAttributeName(),PPUStringTable.LD_LANGUAGE_ATTR_TYPE ,ldAttr.getAttributDescription(), 
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.LANG_ATTRIBUTE_16),ldAttr.isEnabled(),CMColor.LANGUAGE_ATTR_COLOR, ldAttr);
	}

	public void addFBDImplAttribute(AbstractFBDImplAttribute fdbAttr) {
		TreeBuilder.createTreeItem(fbdImplOption, fdbAttr.getAttributeName(),PPUStringTable.FBD_IMPLEMENTATION_ATTR_TYPE ,fdbAttr.getAttributDescription(), 
				services.imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.LANG_ATTRIBUTE_16),fdbAttr.isEnabled(),CMColor.LANGUAGE_ATTR_COLOR, fdbAttr);
		
	}
}
