package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.CloseCompareEngineContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.DefaultSettingContribution;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.SaveResultContribution;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.interfaces.IPreferencePage;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.PreferencesUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CFileTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;

public class CompareEnginePreferencePage implements IPreferencePage {
	private SaveResultContribution saveResultContribution;
	private CloseCompareEngineContribution closeCompareContribution;
	private DefaultSettingContribution defaultSettingContribution;
	
	@Override
	public void createPage(CTabFolder parent, ServiceContainer services) {
		CTabItem tab = new CTabItem(parent, SWT.NONE);
		tab.setText("Compare Engine");
		tab.setImage(services.imageService.getImage(null, E4CFileTable.ALGO_BLACK_16_ICON));
		
		Composite page = new Composite(parent,SWT.None);
		page.setLayout(new FillLayout());
		
		// Compare Engine
		Group compareEngineGroup = new Group(page, SWT.NONE);
		compareEngineGroup.setText("CompareEngine");
		compareEngineGroup.setLayout(new GridLayout(1,true));
	
		saveResultContribution = new SaveResultContribution(compareEngineGroup);
		closeCompareContribution = new CloseCompareEngineContribution(compareEngineGroup);
		defaultSettingContribution = new DefaultSettingContribution(compareEngineGroup);
		
		tab.setControl(page);
	}

	@Override
	public void store() {
		PreferencesUtil.storeKeyValueNode(saveResultContribution.getKeyValueNode());
		PreferencesUtil.storeKeyValueNode(closeCompareContribution.getKeyValueNode());
		defaultSettingContribution.store();
	}


}
