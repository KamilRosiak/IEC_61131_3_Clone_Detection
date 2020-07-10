package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.PreferencesUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.gui.LabeledRangeSliderGroup;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.key_value.KeyValueNode;

public class VariabilityThresholdsContribution {
	public static final String MANDATORY_VALUE_PREF = "MANDATORY_VALUE";
	public static final String SAVE_AS_RESULT_DESCRIPTION = "Variability Thresholds";
	public static final String OPTIONAL_VALUE_PREF = "OPTIONAL_VALUE_PREF";

	private KeyValueNode mandatoryValue;
	private KeyValueNode optionalValue;
	
	public VariabilityThresholdsContribution(Composite parent) {
		createControl(parent);
	}
	
	private void createControl(Composite parent) {
		mandatoryValue =  PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, MANDATORY_VALUE_PREF, "70");
		optionalValue = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, OPTIONAL_VALUE_PREF, "0");

		new LabeledRangeSliderGroup(parent, SWT.NONE,SAVE_AS_RESULT_DESCRIPTION , optionalValue, mandatoryValue);
	}

	public KeyValueNode getOptionalKeyValueNode() {
		return optionalValue;
	}
	public KeyValueNode getMandatoryKeyValueNode() {
		return mandatoryValue;
	}
}
