package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.util;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractActionAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractModelAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractVariableAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;
/**
 * This Utility class provides checks for the configuration
 * @author {Rosiak, Schlie}
 *
 */
public class MetricConsistentCheck {

	public static boolean weightCheck(MetricContainer config) {
		float modelWeight = 0;
		float pouWeight = 0;
		float actionWeight = 0;
		float langWeight_ST = 0;
		float langWeight_SFC = 0;
		float variableWeight = 0;
		
		boolean stActivated = false;
		boolean sfcActivated = false;
		
		for(AbstractModelAttribute modelAttr : config.getModelAttributs()) {
			if(modelAttr.isEnabled()) {
				modelWeight = modelWeight + modelAttr.getWeight();
			}
			
		}
		modelWeight = modelWeight + config.getModelImplementationOptionAttr().getWeight();
		
		for(AbstractPOUAttribute pouAttr : config.getPOUAttributs()) {
			if(pouAttr.isEnabled()) {
				pouWeight = pouWeight + pouAttr.getWeight();
			}
		}
		pouWeight = pouWeight + config.getPouOptionAttr().getWeight();
		/**
		 * 		for (AbstractLanguageAttribute langAttr : config.getLanguageAttributs()) {
			if (langAttr.getLanguageType().equals("ST")) {
				langWeight_ST = langWeight_ST + langAttr.getWeight();
				stActivated = true;
			}
			else if (langAttr.getLanguageType().equals("SFC")) {
				langWeight_SFC = langWeight_SFC + langAttr.getWeight();
				stActivated = true;
			}
		}
		 */

		
		for (AbstractActionAttribute actionAttribute : config.getActionAttributes()) {
			if (actionAttribute.isEnabled()) {
				actionWeight += actionAttribute.getWeight();
			}
		}
		
		for (AbstractVariableAttribute variableAttribute : config.getVariableAttributes()) {
			if (variableAttribute.isEnabled()) {
				variableWeight += variableAttribute.getWeight();
			}
		}
		
		
		
		String errorMessage = "";
		
		if (config.isModelCompare()) {
			if (modelWeight > 100) {
				errorMessage += "Project attribute weights exceed 100%"+"\n";
			}
			else if (modelWeight < 100) {
				errorMessage += "Project attribute weights smaller then 100%"+"\n";
			}
		}
		
		if (config.isPOUCompare()) {
			if (pouWeight > 100) {
				errorMessage += "POU attribute weights exceed 100%"+"\n";
			}
			else if (pouWeight < 100) {
				errorMessage += "POU attribute weights smaller then 100%"+"\n";
			}
		}
		
		if (config.isActionOption()) {
			if (actionWeight > 100) {
				errorMessage += "Action attribute weights exceed 100%"+"\n";
			}
			else if (actionWeight < 100) {
				errorMessage += "Action attribute weights smaller then 100%"+"\n";
			}
		}
		
		if (config.isVariableCompare()) {
			if (variableWeight > 100) {
				errorMessage += "Variable attribute weights exceed 100%"+"\n";
			}
			else if (variableWeight < 100) {
				errorMessage += "Variable attribute weights smaller then 100%"+"\n";
			}
		}
		
		if (config.isLanguageImplementationOption()) {
			if(stActivated) {
				if (langWeight_ST > 100) {
					errorMessage += "Structured Text attribute weights exceed 100%"+"\n";
				}
				else if (langWeight_ST < 100) {
					errorMessage += "Structured Text attribute weights smaller then 100%"+"\n";
				}
				if (sfcActivated) {
					if (langWeight_SFC > 100) {
						errorMessage += "Sequential Function Chart attribute weights exceed 100%"+"\n";
					}
					else if (langWeight_SFC < 100) {
						errorMessage += "Sequential Function Chart attribute weights smaller then 100%"+"\n";
					}
				}
				
			}
		}
		
		
		if (errorMessage.length() > 0) {
			RCPMessageProvider.errorMessage("Weight Error", errorMessage);
//			return false;
		}
		return true;
	}
}
