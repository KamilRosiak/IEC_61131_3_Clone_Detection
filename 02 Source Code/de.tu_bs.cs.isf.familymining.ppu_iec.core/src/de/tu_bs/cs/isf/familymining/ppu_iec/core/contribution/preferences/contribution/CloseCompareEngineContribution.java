package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.PreferencesUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.gui.LabeledDecsion;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.key_value.KeyValueNode;

public class CloseCompareEngineContribution {
	public static final String CLOSE_COMPARE_ENGINE_PREF = "CLOSE_COMPARE_ENGINE_OPTION";
	public static final String SAVE_AS_RESULT_DESCRIPTION = "Close CompareEngine after comparing?";
	private KeyValueNode closeEngineValue;
	
	
	public CloseCompareEngineContribution(Composite parent) {
		createControl(parent);
	}
	
	private void createControl(Composite parent) {
		closeEngineValue =  PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, CLOSE_COMPARE_ENGINE_PREF, "false");
		new LabeledDecsion(parent, SWT.None,SAVE_AS_RESULT_DESCRIPTION , closeEngineValue);
	}
	
	public KeyValueNode getKeyValueNode() {
		return closeEngineValue;
	}
}
