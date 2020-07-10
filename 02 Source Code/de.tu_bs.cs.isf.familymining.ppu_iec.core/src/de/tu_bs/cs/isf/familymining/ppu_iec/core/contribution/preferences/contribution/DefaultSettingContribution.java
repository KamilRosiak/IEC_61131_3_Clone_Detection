package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.gui.ComboGroup;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.gui.FileGroup;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.PreferencesUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.gui.LabeledDecsion;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.key_value.KeyValueNode;

public class DefaultSettingContribution {
	public static final String DEFAULT_PREF_TEXT = "Default Settings";
	public static final String DEFAULT_WEIGHTED_PREF = "DEFAULT_WEIGHTED_PREF";
	public static final String DEFAULT_METRIC_PREF = "DEFAULT_METRIC_PREF";
	public static final String DEFAULT_MATCHER_PREF = "DEFAULT_MATCHER_PREF";
	
	public static final String COMPARE_WEIGHTED = "Weighted compare?";
	public static final String DEFAULT_METRIC_TEXT = "Default Metric";
	
	private KeyValueNode isWeightedValue;
	private KeyValueNode metricValue;
	private KeyValueNode matcherValue;

	
	public DefaultSettingContribution(Composite parent) {
		createControl(parent);
	}
	
	private void createControl(Composite parent) {
		Group group = new Group(parent, SWT.NONE);
		group.setLayout(new GridLayout(1,false));
		
		group.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,true,false));
		group.setText(DEFAULT_PREF_TEXT);
		
		isWeightedValue =  PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, DEFAULT_WEIGHTED_PREF, "false");
		new LabeledDecsion(group, SWT.None, COMPARE_WEIGHTED , isWeightedValue);
		
		metricValue = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, DEFAULT_METRIC_PREF, "");
		new FileGroup(group, SWT.NONE, metricValue);
		
		matcherValue = PreferencesUtil.getValueWithDefault(PPUStringTable.BUNDLE_NAME, DEFAULT_MATCHER_PREF, "");
		new ComboGroup(group, SWT.None, matcherValue);
	}
	
	public void store() {
		PreferencesUtil.storeKeyValueNode(isWeightedValue);
		PreferencesUtil.storeKeyValueNode(metricValue);
		PreferencesUtil.storeKeyValueNode(matcherValue);
	}
	
}
