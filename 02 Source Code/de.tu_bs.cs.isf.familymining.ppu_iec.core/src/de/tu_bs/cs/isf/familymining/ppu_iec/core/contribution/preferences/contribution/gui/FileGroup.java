package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.preferences.contribution.gui;


import java.nio.file.Paths;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.util.MetricContainerSerializer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.util.FileHandlingUtility;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.preferences.util.key_value.KeyValueNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;

public class FileGroup {
	private KeyValueNode metricValue;
	
	public FileGroup(Composite parent, int style, KeyValueNode metricValue) {
		this.metricValue = metricValue;
		createControl(parent, style);
	}
	
	private void createControl(Composite parent, int style) {
		Composite comp = new Composite(parent, style);
		comp.setLayout(new GridLayout(3,false));
		comp.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		Label description = new Label(comp, SWT.None);
		description.setText("Default Metric:");
		
		Label value = new Label(comp, SWT.NONE);
		value.setText(metricValue.getStringValue().substring(metricValue.getStringValue().lastIndexOf("\\") + 1));
		
		Button btnNewButton = new Button(comp, SWT.NONE);
		btnNewButton.setText("select metric");
		btnNewButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false));
		btnNewButton.addListener(SWT.Selection, e -> {
			String path = RCPMessageProvider.getFilePathDialog(E4CStringTable.DIALOG_SELECT_METRIC, E4CStringTable.CONFIG_DIRECTORY);
			if(FileHandlingUtility.isFile(Paths.get(path))) {
				MetricContainer config = MetricContainerSerializer.decode(path);
			if(config != null) {
				value.setText(path.substring(path.lastIndexOf("\\") + 1));
				metricValue.setValue(path);
				comp.pack();
			}
			}else {
				RCPMessageProvider.errorMessage("No File", "No file selected.");
			
			}

		});
	}
	
	
	public KeyValueNode getKeyValueNode() {
		return metricValue;
	}

}
