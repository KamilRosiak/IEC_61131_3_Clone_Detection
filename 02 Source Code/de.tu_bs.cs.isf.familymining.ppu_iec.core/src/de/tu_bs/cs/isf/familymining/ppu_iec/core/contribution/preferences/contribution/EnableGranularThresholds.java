package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.PreferencesUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.gui.LabeledDecsion;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.key_value.KeyValueNode;

public class EnableGranularThresholds {
	public static final String ENABLE_GRANULAR_THRESHOLDS = "ENABLE_GRANULAR_THRESHOLDS";
	public static final String ENABLE_GRANULAR_THRESHOLDS_DESCRIPTION = "Enable custom variability thresholds";
	private KeyValueNode enableThresholds;
	private LabeledDecsion labeledDecision;
	
	
	public EnableGranularThresholds(Composite parent) {
		createControl(parent);
	}
	
	private void createControl(Composite parent) {
		enableThresholds =  PreferencesUtil.getValue(PPUStringTable.BUNDLE_NAME, ENABLE_GRANULAR_THRESHOLDS);
		labeledDecision = new LabeledDecsion(parent, SWT.None,ENABLE_GRANULAR_THRESHOLDS_DESCRIPTION , enableThresholds);
	}
	
	public KeyValueNode getKeyValueNode() {
		return enableThresholds;
	}
	
	public LabeledDecsion getLabeledDecision() {
		return labeledDecision;
	}
}

