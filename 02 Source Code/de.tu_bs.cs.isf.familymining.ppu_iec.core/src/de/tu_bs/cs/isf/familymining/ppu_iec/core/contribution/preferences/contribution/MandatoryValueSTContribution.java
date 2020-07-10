package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.PreferencesUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.gui.LabeledSliderGroup;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.key_value.KeyValueNode;

public class MandatoryValueSTContribution {
	public static final String MANDATORY_VALUE_PREF = "MANDATORY_VALUE_STIMPL";
	public static final String SAVE_AS_RESULT_DESCRIPTION = "Mandatory Value ST Impl";
	private KeyValueNode mandatoryValue;
	private LabeledSliderGroup labeledSliderGroup;
	
	public MandatoryValueSTContribution(Composite parent) {
		createControl(parent);
	}
	
	private void createControl(Composite parent) {
		mandatoryValue =  PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, MANDATORY_VALUE_PREF, "0");
		labeledSliderGroup = new LabeledSliderGroup(parent, SWT.NONE,SAVE_AS_RESULT_DESCRIPTION, mandatoryValue);
	}

	public KeyValueNode getKeyValueNode() {
		return mandatoryValue;
	}
	
	public void setActive() {
		labeledSliderGroup.getGroup().setEnabled(true);
	}
	
	public void setInactive() {
		labeledSliderGroup.getGroup().setEnabled(false);
	}
}
