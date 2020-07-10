package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.function_block_diagram.templates.AbstractFBDImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.function_block_diagram.templates.AbstractFBDLangAttribute;
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
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.OptionAttribute;

/**
 * This class is a data class that stores all options and attributes that are selected during the the configuration of the metric.
 * @author {Kamil Rosiak}
 *
 */
public class MetricContainer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2903385362231211956L;
	//Option Attribute 
	private boolean isModelImplementationOption 		= false;
	private boolean isModelVariableOption 				= false;
	
	private boolean isPOUOImplementationOtion 			= false;
	private boolean isPOUActionOption					= false;
	private boolean isPOUVariableOption 				= false;
	
	private boolean isLanguageImplementationOption 		= false;
	
	private boolean isLanguageSTCompare 				= false;
	private boolean isLanguageSFCCompare				= false;
	private boolean isLanguageLDCompare					= false;
	private boolean isLanguageFBDCompare				= false;

	
	private boolean isSTImplCompare     				= false;
	private boolean isSFCImplCompare    				= false;
	private boolean isLDImplCompare     				= false;
	private boolean isLDFunctionBlockOption				= false;
	private boolean isFBDSTcompare					    = false;
	private boolean isSFCActionImplCompare				= false;
	private boolean isFBDImplCompare					= false;
		
	private boolean isActionImplementaionOption 		= false;
	
	//Compare and modes 
	private boolean isModelCompare 						= false;
	private boolean isPOUCompare 						= false;
	private boolean isLanguageCompare 					= false;
	private boolean isVariableCompare 					= false;

	private boolean isWeighted 							= false;
	
	private List<AbstractModelAttribute> 		modelAttributs;
	private List<AbstractPOUAttribute> 			pouAttributs;

	private List<AbstractActionAttribute> 		actionAttributes;
	private List<AbstractVariableAttribute> 	variableAttributes;
	
	/**
	 * IEC 61131-3 Attributes 
	 */
	//Structured Text
	private List<AbstractSTLangAttribute>		stLangAttributes;
	private List<AbstractSTImplAttribute> 		stImplAttributes;

	//Sequential function chart
	private List<AbstractSFCLangAttribute> 		sfcLangAttributes;
	private List<AbstractSFCImplAttribute> 		sfcImplAttributes;
	
	//Ladder Diagram
	private List<AbstractLDLangAttribute> 		ldLangAttributes;
	private List<AbstractLDImplAttribute> 		ldImplAttributes;
	
	//Function Block Diagram
	private List<AbstractFBDImplAttribute>		fbdImplAttributes;
	private List<AbstractFBDLangAttribute>		fbdLangAttributes;
	
	
	private String configurationName, configurationDescription;
	
	private OptionAttribute modelImplementationOptionAttr, modelVariableOptionAttr, pouVariableOptionAttr, pouImplementaionOptionAttr , pouActionOptionAttr, actionImplementationAttr , 
							stImplOptionAttr,sfcImplOptionAttr, ldImplOptionAttr, ldFunctionBlockOption, fbdImplOptionAttr, fbdSTImplOption, sfcActionImplOption;
	
	public MetricContainer(String configName, String description) {
		setName(configName);
		setConfigurationDescription(description);
		init();
	}
	
	private void init() {
		actionAttributes = new ArrayList<AbstractActionAttribute>();
		modelAttributs = new ArrayList<AbstractModelAttribute>();
		pouAttributs = new ArrayList<AbstractPOUAttribute>();

		variableAttributes = new ArrayList<AbstractVariableAttribute>();
		
		stLangAttributes = new ArrayList<AbstractSTLangAttribute>();
		stImplAttributes = new ArrayList<AbstractSTImplAttribute>();
		
		sfcImplAttributes = new ArrayList<AbstractSFCImplAttribute>();
		sfcLangAttributes = new ArrayList<AbstractSFCLangAttribute>();
		
		ldImplAttributes = new ArrayList<AbstractLDImplAttribute>();
		ldLangAttributes = new ArrayList<AbstractLDLangAttribute>();
		
		fbdImplAttributes = new ArrayList<AbstractFBDImplAttribute>();
		fbdLangAttributes = new ArrayList<AbstractFBDLangAttribute>();
		
		setModelOptionAttr(new OptionAttribute());
		setPouOptionAttr(new OptionAttribute());
		setPouActionAttr(new OptionAttribute());
		setActionImplementationAttr(new OptionAttribute());
		setModelVariableOptionAttr(new OptionAttribute());
		setPouVariableOptionAttr(new OptionAttribute());
		
		setStImplOptionAttr(new OptionAttribute());
		setSfcImplOptionAttr(new OptionAttribute());
		setLdImplOptionAttr(new OptionAttribute());
		setLdFunctionBlockOption(new OptionAttribute());
		setFbdImplOptionAttr(new OptionAttribute());
		setFbdSTImplOption(new OptionAttribute());
		setSfcActionImplOption(new OptionAttribute());
		
	}
	
	//getter and setter for name and description 
	public String getName() {
		return configurationName;
	}

	public void setName(String _configurationName) {
		this.configurationName = _configurationName;
	}

	public String getConfigurationDescription() {
		return configurationDescription;
	}

	public void setConfigurationDescription(String _configurationDescription) {
		this.configurationDescription = _configurationDescription;
	}
	
	//*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~
	//*~*~*~*~*~*~*~*~*~*~*~*~     Attributes    *~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*
	//*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~
	
	public void clearAllAttributes() {
		modelAttributs.clear();
		pouAttributs.clear();
		actionAttributes.clear();
		variableAttributes.clear();
		stLangAttributes.clear();
		stImplAttributes.clear(); 		
		sfcImplAttributes.clear();
		sfcLangAttributes.clear();
		ldImplAttributes.clear();
		ldLangAttributes.clear();
		fbdImplAttributes.clear();
		fbdLangAttributes.clear();
	}
	/**
	 * 
	 * @return get all model attributes as list 
	 */
	public List<AbstractModelAttribute> getModelAttributs() {
		return modelAttributs;
	}
	/**
	 * Adding model attribute to metric if not exists
	 * @param attribute
	 */
	public void addModelAttribute(AbstractModelAttribute attribute) {
		if(!modelAttributs.contains(attribute))
			modelAttributs.add(attribute);	
	}
	/**
	 * remove model attribute from config
	 * @param attribute
	 */
	public void removeModelAttribute(AbstractModelAttribute attribute) {
		modelAttributs.remove(attribute);
	}
	/**
	 * Getter for pou attributes 
	 * @return
	 */
	public List<AbstractPOUAttribute> getPOUAttributs() {
		return pouAttributs;
	}
	/**
	 * Adding pou attribute to config if not exists
	 * @param attribute
	 */
	public void addPOUAttribute(AbstractPOUAttribute attribute) {
		if(!pouAttributs.contains(attribute))
			pouAttributs.add(attribute);
	}
	/**
	 * remove pou attribute from config
	 * @param attribute
	 */
	public void removePOUAttribute(AbstractPOUAttribute attribute) {
		pouAttributs.remove(attribute);
	}
	
	public List<AbstractActionAttribute> getActionAttributes() {
		return actionAttributes;
	}

	public void addActionAttribute(AbstractActionAttribute attribute) {
		if(!actionAttributes.contains(attribute))
			actionAttributes.add(attribute);
	}
	
	public void addVariabelAttribute(AbstractVariableAttribute attribute) {
		if(!variableAttributes.contains(attribute))
			variableAttributes.add(attribute);
	}
	
	public void removeActionAttribute(AbstractActionAttribute attribute) {
		actionAttributes.remove(attribute);
	}
	
	/**
	 * Getter and setter for ST Attributes
	 */
	//ST Implementation Attributes
	public void addSTImplAttribute(AbstractSTImplAttribute attribute) {
		if(!stImplAttributes.contains(attribute)) {
			stImplAttributes.add(attribute);
		}
	}

	public List<AbstractSTImplAttribute> getSTImplAttributes() {
		return stImplAttributes;
	}
	
	public void removeSTImplAttribute(AbstractSTImplAttribute attribute) {
		stImplAttributes.remove(attribute);
	}
	
	//ST Language Attributes 
	public void addSTLangAttribute(AbstractSTLangAttribute attribute) {
		if(!stLangAttributes.contains(attribute)) {
			stLangAttributes.add(attribute);
		}
	}

	public List<AbstractSTLangAttribute> getSTLangAttributes() {
		return stLangAttributes;
	}
	
	public void removeSTLangAttribute(AbstractSTLangAttribute attribute) {
		stLangAttributes.remove(attribute);
	}
	
	/**
	 * Getter and setter for SFC Attributes
	 */
	//SFC Implementation Attributes
	public void addSFCImplAttribute(AbstractSFCImplAttribute attribute) {
		if(!sfcImplAttributes.contains(attribute)) {
			sfcImplAttributes.add(attribute);
		}
	}

	public List<AbstractSFCImplAttribute> getSFCImplAttributes() {
		return sfcImplAttributes;
	}
	
	public void removeSFCImplAttribute(AbstractSFCImplAttribute attribute) {
		sfcImplAttributes.remove(attribute);
	}
	
	//SFC Language Attributes 
	public void addSFCLangAttribute(AbstractSFCLangAttribute attribute) {
		if(!sfcLangAttributes.contains(attribute)) {
			sfcLangAttributes.add(attribute);
		}
	}

	public List<AbstractSFCLangAttribute> getSFCLangAttributes() {
		return sfcLangAttributes;
	}
	
	public void removeSFCLangAttribute(AbstractSFCLangAttribute attribute) {
		sfcLangAttributes.remove(attribute);
	}
	
	/**
	 * Getter and setter for LD Attributes
	 */
	//LD Implementation Attributes
	public void addLDImplAttribute(AbstractLDImplAttribute attribute) {
		if(!ldImplAttributes.contains(attribute)) {
			ldImplAttributes.add(attribute);
		}
	}
	
	public List<AbstractLDImplAttribute> getLDImplAttributes() {
		return ldImplAttributes;
	}
	
	public void removeLDImplAttribute(AbstractLDImplAttribute attribute) {
		ldImplAttributes.remove(attribute);
	}
	
	//LD Language Attributes 
	public void addLDLangAttribute(AbstractLDLangAttribute attribute) {
		if(!ldLangAttributes.contains(attribute)) {
			ldLangAttributes.add(attribute);
		}
	}
	
	public List<AbstractLDLangAttribute> getLDLangAttributes() {
		return ldLangAttributes;
	}
	
	public void removeLDLangAttribute(AbstractLDLangAttribute attribute) {
		ldLangAttributes.remove(attribute);
	}
	
	//FBD Implementation Attributes
	public List<AbstractFBDImplAttribute> getFBDImplAttributes() {
		return fbdImplAttributes;
	}

	public void addFBDImplAttribute(AbstractFBDImplAttribute fbdImplAttribute) {
		if(!fbdImplAttributes.contains(fbdImplAttribute)) {
			fbdImplAttributes.add(fbdImplAttribute);
		}
	}
	
	public void removeFBDImplAttribute(AbstractFBDImplAttribute fbdImplAttribute) {
		fbdImplAttributes.remove(fbdImplAttribute);
	}
	
	public List<AbstractFBDLangAttribute> getFbdLangAttributes() {
		return fbdLangAttributes;
	}

	public void addFbdLangAttribute(AbstractFBDLangAttribute fbdLangAttribute) {
		if(!fbdLangAttributes.contains(fbdLangAttribute)) {
			fbdLangAttributes.add(fbdLangAttribute);
		}
	}
	
	public void removeFbdLangAttribute(AbstractFBDLangAttribute fbdImplAttribute) {
		fbdLangAttributes.remove(fbdImplAttribute);
	}
	
	/**
	 * the optional attribute in the model folder
	 * @return
	 */
	public OptionAttribute getModelImplementationOptionAttr() {
		return modelImplementationOptionAttr;
	}

	public void setModelOptionAttr(OptionAttribute modelOption) {
		this.modelImplementationOptionAttr = modelOption;
	}
	/**
	 * the optional attribute in the pou folder
	 * @return
	 */
	public OptionAttribute getPouOptionAttr() {
		return pouImplementaionOptionAttr;
	}

	public void setPouOptionAttr(OptionAttribute pouOption) {
		this.pouImplementaionOptionAttr = pouOption;
	}
	
	
	
	
	//*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~
	//*~*~*~*~*~*~*~*~*~*~*~*~ Compare Options *~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*
	//*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~
	/**
	 * If the pou attribute is selected
	 * @return
	 */
	public boolean isPOUImplementationOption() {
		return isPOUOImplementationOtion;
	}
	public void setPOUImplementationOption(boolean isPOU) {
		this.isPOUOImplementationOtion = isPOU;
	}
	
	public boolean isModelImplementationOption() {
		return isModelImplementationOption;
	}

	public void setModelImplementationOption(boolean isModel) {
		this.isModelImplementationOption = isModel;
	}
	
	//Language Option recursvly
	public boolean isLanguageImplementationOption() {
		return isLanguageImplementationOption;
	}
	public void setLanguageImplementationOption(boolean isLanguageElement) {
		this.isLanguageImplementationOption = isLanguageElement;
	}
	//Variable Options
	public boolean isModelVariableOption() {
		return isModelVariableOption;
	}
	
	public void setModelVariableOption(boolean isModelVariableOption) {
		this.isModelVariableOption = isModelVariableOption;
	}
	
	public boolean isPOUVariableOption() {
		return isPOUVariableOption;
	}
	
	public void setPOUVariableOption(boolean isPOUVariableOption) {
		this.isPOUVariableOption = isPOUVariableOption;
	}
	
	//*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~
	//*~*~*~*~*~*~*~*~*~*~*~*~  Folder selection ~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*
	//*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~

	public boolean isLanguageOption() {
		return isLanguageCompare;
	}

	public void setLanguageCompare(boolean isLanguage) {
		this.isLanguageCompare = isLanguage;
	}

	public boolean isModelCompare() {
		return isModelCompare;
	}

	public void setModelCompare(boolean isModelCompare) {
		this.isModelCompare = isModelCompare;
	}

	public boolean isPOUCompare() {
		return isPOUCompare;
	}

	public void setPOUCompare(boolean isPOUCompare) {
		this.isPOUCompare = isPOUCompare;
	}

	public boolean isWeighted() {
		return isWeighted;
	}

	public void setWeighted(boolean isWeighted) {
		this.isWeighted = isWeighted;
	}

	public boolean isActionOption() {
		return isPOUActionOption;
	}

	public void setPOUActionOption(boolean isActionOption) {
		this.isPOUActionOption = isActionOption;
	}

	public OptionAttribute getPouActionAttr() {
		return pouActionOptionAttr;
	}

	public void setPouActionAttr(OptionAttribute pouActionAttr) {
		this.pouActionOptionAttr = pouActionAttr;
	}

	public boolean isActionImplementaionOption() {
		return isActionImplementaionOption;
	}

	public void setActionImplementaionOption(boolean isActionImplementaionOption) {
		this.isActionImplementaionOption = isActionImplementaionOption;
	}

	public OptionAttribute getActionImplementationAttr() {
		return actionImplementationAttr;
	}

	public void setActionImplementationAttr(OptionAttribute _actionImplementationAttr) {
		this.actionImplementationAttr = _actionImplementationAttr;
	}

	public OptionAttribute getModelVariableOptionAttr() {
		return modelVariableOptionAttr;
	}

	public void setModelVariableOptionAttr(OptionAttribute modelVariableOptionAttr) {
		this.modelVariableOptionAttr = modelVariableOptionAttr;
	}

	public OptionAttribute getPouVariableOptionAttr() {
		return pouVariableOptionAttr;
	}

	public void setPouVariableOptionAttr(OptionAttribute pouVariableOptionAttr) {
		this.pouVariableOptionAttr = pouVariableOptionAttr;
	}
	
	public List<AbstractVariableAttribute> getVariableAttributes() {
		return variableAttributes;
	}
	public boolean isLanguageSFCCompare() {
		return isLanguageSFCCompare;
	}
	public void setLanguageSFCCompare(boolean isLanguageSFCCompare) {
		this.isLanguageSFCCompare = isLanguageSFCCompare;
	}
	public boolean isLanguageSTCompare() {
		return isLanguageSTCompare;
	}
	public void setLanguageSTCompare(boolean isLanguageSTCompare) {
		this.isLanguageSTCompare = isLanguageSTCompare;
	}
	public boolean isVariableCompare() {
		return isVariableCompare;
	}
	public void setVariableCompare(boolean isVariableCompare) {
		this.isVariableCompare = isVariableCompare;
	}
	public boolean isLanguageLDCompare() {
		return isLanguageLDCompare;
	}
	public void setLanguageLDCompare(boolean isLanguageLDCompare) {
		this.isLanguageLDCompare = isLanguageLDCompare;
	}
	public boolean isSTImplCompare() {
		return isSTImplCompare;
	}
	public void setSTImplCompare(boolean isSTImplCompare) {
		this.isSTImplCompare = isSTImplCompare;
	}
	public boolean isSFCImplCompare() {
		return isSFCImplCompare;
	}
	public void setSFCImplCompare(boolean isSFCImplCompare) {
		this.isSFCImplCompare = isSFCImplCompare;
	}
	public boolean isLDImplCompare() {
		return isLDImplCompare;
	}
	public void setLDImplCompare(boolean isLDImplCompare) {
		this.isLDImplCompare = isLDImplCompare;
	}
	public OptionAttribute getStImplOptionAttr() {
		return stImplOptionAttr;
	}
	public void setStImplOptionAttr(OptionAttribute stImplOptionAttr) {
		this.stImplOptionAttr = stImplOptionAttr;
	}
	public OptionAttribute getSfcImplOptionAttr() {
		return sfcImplOptionAttr;
	}
	public void setSfcImplOptionAttr(OptionAttribute sfcImplOptionAttr) {
		this.sfcImplOptionAttr = sfcImplOptionAttr;
	}
	public OptionAttribute getLdImplOptionAttr() {
		return ldImplOptionAttr;
	}
	public void setLdImplOptionAttr(OptionAttribute ldImplOptionAttr) {
		this.ldImplOptionAttr = ldImplOptionAttr;
	}

	public OptionAttribute getFbdImplOptionAttr() {
		return fbdImplOptionAttr;
	}

	public void setFbdImplOptionAttr(OptionAttribute fbdImplOptionAttr) {
		this.fbdImplOptionAttr = fbdImplOptionAttr;
	}

	public boolean isFBDImplCompare() {
		return isFBDImplCompare;
	}

	public void setFBDImplCompare(boolean isFBDImplCompare) {
		this.isFBDImplCompare = isFBDImplCompare;
	}

	public boolean isLanguageFBDCompare() {
		return isLanguageFBDCompare;
	}

	public void setLanguageFBDCompare(boolean isLanguageFBDCompare) {
		this.isLanguageFBDCompare = isLanguageFBDCompare;
	}

	public boolean isLDFunctionBlockOption() {
		return isLDFunctionBlockOption;
	}

	public void setLDFunctionBlockOption(boolean isLDFunctionBlockOption) {
		this.isLDFunctionBlockOption = isLDFunctionBlockOption;
	}

	public OptionAttribute getLdFunctionBlockOption() {
		return ldFunctionBlockOption;
	}

	public void setLdFunctionBlockOption(OptionAttribute ldFunctionBlockOption) {
		this.ldFunctionBlockOption = ldFunctionBlockOption;
	}

	public OptionAttribute getFbdSTImplOption() {
		return fbdSTImplOption;
	}

	public void setFbdSTImplOption(OptionAttribute fbdSTImplOption) {
		this.fbdSTImplOption = fbdSTImplOption;
	}

	public boolean isFBDSTCompare() {
		return isFBDSTcompare;
	}

	public void setFBDSTCompare(boolean isFBDSTOption) {
		this.isFBDSTcompare = isFBDSTOption;
	}

	public boolean isSFCActionImplCompare() {
		return isSFCActionImplCompare;
	}

	public void setSFCActionImplCompare(boolean isSFCActionImplCompare) {
		this.isSFCActionImplCompare = isSFCActionImplCompare;
	}

	public OptionAttribute getSfcActionImplOption() {
		return sfcActionImplOption;
	}

	public void setSfcActionImplOption(OptionAttribute sfcActionImplOption) {
		this.sfcActionImplOption = sfcActionImplOption;
	}




}
