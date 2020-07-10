package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences;


import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.EnableGranularThresholds;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.MandatoryValueActionContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.MandatoryValueFBDContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.VariabilityThresholdsContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.MandatoryValueLDContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.MandatoryValuePOUContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.MandatoryValueSFCContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.MandatoryValueSTContribution;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.interfaces.IPreferencePage;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.PreferencesUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CFileTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;

public class CompareEngineThresholdsPage implements IPreferencePage {
	private EnableGranularThresholds enableGranularThresholds;
	private VariabilityThresholdsContribution mandatoryGeneralContribution;
	private MandatoryValuePOUContribution mandatoryPOUsContribution;
	private MandatoryValueActionContribution mandatoryActionsContribution;
	private MandatoryValueSTContribution mandatorySTContribution;
	private MandatoryValueSFCContribution mandatorySFCContribution;
	private MandatoryValueLDContribution mandatoryLDContribution;
	private MandatoryValueFBDContribution mandatoryFBDContribution;
	@Override
	public void createPage(CTabFolder parent, ServiceContainer services) {
		CTabItem tab = new CTabItem(parent, SWT.NONE);
		
		tab.setText("Variability Thresholds");
		tab.setImage(services.imageService.getImage(null, E4CFileTable.ALGO_BLACK_16_ICON));
		
		Composite page = new Composite(parent,SWT.None);
		page.setLayout(new FillLayout());
		
		// Compare Engine
		Group thresholdGroup = new Group(page, SWT.None);
		thresholdGroup.setText("Set your thresholds");
		thresholdGroup.setLayout(new GridLayout(1,true));
	
		mandatoryGeneralContribution = new VariabilityThresholdsContribution(thresholdGroup);
		enableGranularThresholds = new EnableGranularThresholds(thresholdGroup);
		mandatoryPOUsContribution = new MandatoryValuePOUContribution(thresholdGroup);
		mandatoryActionsContribution = new MandatoryValueActionContribution(thresholdGroup);
		mandatorySTContribution = new MandatoryValueSTContribution(thresholdGroup);
		mandatorySFCContribution = new MandatoryValueSFCContribution(thresholdGroup);
		mandatoryLDContribution = new MandatoryValueLDContribution(thresholdGroup);
		mandatoryFBDContribution = new MandatoryValueFBDContribution(thresholdGroup);
		
		if(enableGranularThresholds.getKeyValueNode().getBoolValue()) {
			setActive();
		} else {
			setInActive();
		}
		
		enableGranularThresholds.getLabeledDecision().getYesButton().addListener(SWT.Selection, e -> {
			enableGranularThresholds.getKeyValueNode().setValue(((Button)e.widget).getSelection());
			if (((Button)e.widget).getSelection()) {
				setActive();
			}
			else {
				setInActive();
			}
		});	
		
		tab.setControl(page);
	}
	
	private void setActive() {
		mandatoryPOUsContribution.setActive();
		mandatoryActionsContribution.setActive();
		mandatorySTContribution.setActive();
		mandatorySFCContribution.setActive();
		mandatoryLDContribution.setActive();
		mandatoryFBDContribution.setActive();
	}
	
	private void setInActive() {
		mandatoryPOUsContribution.setInactive();
		mandatoryActionsContribution.setInactive();
		mandatorySTContribution.setInactive();
		mandatorySFCContribution.setInactive();
		mandatoryLDContribution.setInactive();
		mandatoryFBDContribution.setInactive();
	}
	
	@Override
	public void store() {
		// override when granular is deactivated
		if (enableGranularThresholds.getKeyValueNode().getBoolValue() == false) {
			mandatoryPOUsContribution.getKeyValueNode().setValue(mandatoryGeneralContribution.getMandatoryKeyValueNode().getStringValue());
			mandatoryActionsContribution.getKeyValueNode().setValue(mandatoryGeneralContribution.getMandatoryKeyValueNode().getStringValue());
			mandatorySTContribution.getKeyValueNode().setValue(mandatoryGeneralContribution.getMandatoryKeyValueNode().getStringValue());
			mandatorySFCContribution.getKeyValueNode().setValue(mandatoryGeneralContribution.getMandatoryKeyValueNode().getStringValue());
			mandatoryLDContribution.getKeyValueNode().setValue(mandatoryGeneralContribution.getMandatoryKeyValueNode().getStringValue());
			mandatoryFBDContribution.getKeyValueNode().setValue(mandatoryGeneralContribution.getMandatoryKeyValueNode().getStringValue());
		}
		PreferencesUtil.storeKeyValueNode(enableGranularThresholds.getKeyValueNode());
		PreferencesUtil.storeKeyValueNode(mandatoryGeneralContribution.getOptionalKeyValueNode());
		PreferencesUtil.storeKeyValueNode(mandatoryGeneralContribution.getMandatoryKeyValueNode());
		PreferencesUtil.storeKeyValueNode(mandatoryPOUsContribution.getKeyValueNode());
		PreferencesUtil.storeKeyValueNode(mandatoryActionsContribution.getKeyValueNode());
		PreferencesUtil.storeKeyValueNode(mandatorySTContribution.getKeyValueNode());
		PreferencesUtil.storeKeyValueNode(mandatorySFCContribution.getKeyValueNode());
		PreferencesUtil.storeKeyValueNode(mandatoryLDContribution.getKeyValueNode());
		PreferencesUtil.storeKeyValueNode(mandatoryFBDContribution.getKeyValueNode());
	}
}
