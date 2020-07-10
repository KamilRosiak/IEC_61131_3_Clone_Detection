package de.tu_bs.cs.isf.familymining.ppu_iec.core.util;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.EnableGranularThresholds;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.MandatoryValueActionContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.MandatoryValueFBDContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.VariabilityThresholdsContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.MandatoryValueLDContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.MandatoryValuePOUContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.MandatoryValueSFCContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.MandatoryValueSTContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.VariabilityCategoryThresholds;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.PreferencesUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.key_value.KeyValueNode;

/**
 * This utility classes provides all thresholds from preferences.
 * @author {Kamil Rosiak}
 *
 */
public abstract class VariabilityThresholdsUtil {
	
	/**
	 * This method returns true if the "enable custom thresholds" option in the preferences is selected"
	 */
	public static boolean isGranularTH() {
		KeyValueNode enableGranularThresholds = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, EnableGranularThresholds.ENABLE_GRANULAR_THRESHOLDS,"false");
		return enableGranularThresholds.getBoolValue();
	}
	
	/**
	 * This method returns the general mandatory value.
	 */
	public static float getMandatoryValue() {
		KeyValueNode mandatoryValueGeneral = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, VariabilityThresholdsContribution.MANDATORY_VALUE_PREF,String.valueOf(VariabilityCategoryThresholds.MANDATORY_DEFAULT_THRESHOLD));
		return mandatoryValueGeneral.getFloatValue();
	}
	
	/**
	 * This method returns the general optional value.
	 */
	public static float getOptionalValue() {
		KeyValueNode mandatoryValueGeneral = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, VariabilityThresholdsContribution.OPTIONAL_VALUE_PREF,String.valueOf(VariabilityCategoryThresholds.MANDATORY_DEFAULT_THRESHOLD));
		return mandatoryValueGeneral.getFloatValue();
	}
	/**
	 * This method returns the specific pou mandatory value.
	 */
	public static float getMandatoryValuePOU() {
		KeyValueNode mandatoryValuePOU = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, MandatoryValuePOUContribution.MANDATORY_VALUE_PREF,String.valueOf(VariabilityCategoryThresholds.POU_MANDATORY_DEFAULT_THRESHOLD));
		return mandatoryValuePOU.getFloatValue();
	}
	
	/**
	 * This method returns the action mandatory value.
	 */
	public static float getMandatoryValueAction() {
		KeyValueNode mandatoryValueAction = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, MandatoryValueActionContribution.MANDATORY_VALUE_PREF,String.valueOf(VariabilityCategoryThresholds.ACTION_MANDATORY_DEFAULT_THRESHOLD));
		return mandatoryValueAction.getFloatValue();
	}	
	
	/**
	 * This method returns the ST mandatory value.
	 */
	public static float getMandatoryValueSTImpl() {
		KeyValueNode mandatoryValueAction = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, MandatoryValueSTContribution.MANDATORY_VALUE_PREF,String.valueOf(VariabilityCategoryThresholds.ST_MANDATORY_DEFAULT_THRESHOLD));
		return mandatoryValueAction.getFloatValue();
	}	
	
	/**
	 * This method returns the SFC mandatory value.
	 */
	public static float getMandatoryValueSFCImpl() {
		KeyValueNode mandatoryValueAction = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, MandatoryValueSFCContribution.MANDATORY_VALUE_PREF,String.valueOf(VariabilityCategoryThresholds.SFC_MANDATORY_DEFAULT_THRESHOLD));
		return mandatoryValueAction.getFloatValue();
	}
	
	/**
	 * This method returns the SFC mandatory value.
	 */
	public static float getMandatoryValueLDImpl() {
		KeyValueNode mandatoryValue = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, MandatoryValueLDContribution.MANDATORY_VALUE_PREF,String.valueOf(VariabilityCategoryThresholds.LD_MANDATORY_DEFAULT_THRESHOLD));
		return mandatoryValue.getFloatValue();
	}
	
	/**
	 * This method returns the FBD mandatory value.
	 */
	public static float getMandatoryValueFBDImpl() {
		KeyValueNode mandatoryValue = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, MandatoryValueFBDContribution.MANDATORY_VALUE_PREF,String.valueOf(VariabilityCategoryThresholds.FBD_MANDATORY_DEFAULT_THRESHOLD));
		return mandatoryValue.getFloatValue();
	}
}
