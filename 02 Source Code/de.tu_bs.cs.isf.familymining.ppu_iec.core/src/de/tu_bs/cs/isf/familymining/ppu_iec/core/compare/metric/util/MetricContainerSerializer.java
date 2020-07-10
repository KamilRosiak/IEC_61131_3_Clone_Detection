package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.eclipse.swt.widgets.Shell;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.gui.swt.dialogs.InputDialog;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPContentProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;
/**
 * This utility class provides an encode and a decoder for CompareUnits its saves all parameters.
 * @author {Kamil Rosiak}
 *
 */
public class MetricContainerSerializer {
	public static final String FILE_EXISTS = "file exists";
	public static final String METRIC_WITH_NAME_EXISTS = "A metric with this name already exists.";

	/**
	 * this method serializes a MetricContainer 
	 * @param config serialized unit 
	 */
	public static void encode(MetricContainer config) {
		File file = new File(RCPContentProvider.getCurrentWorkspacePath() + E4CStringTable.CONFIG_DIRECTORY + "/" + config.getName()+"."+E4CStringTable.FILE_ENDING_METRIC);

		int choice = 0;
		int inputChoice = 1;
		
		if(file.exists()) {
			choice = RCPMessageProvider.optionMessage(FILE_EXISTS, METRIC_WITH_NAME_EXISTS, E4CStringTable.DIALOG_OK, E4CStringTable.DIALOG_RENAME, E4CStringTable.DIALOG_CANCEL);
		}
		if(choice == 1) {
			InputDialog dialog = new InputDialog(new Shell(),"Name");
			inputChoice = dialog.open();
			if(inputChoice == 0) {
				file = new File(RCPContentProvider.getCurrentWorkspacePath() + E4CStringTable.CONFIG_DIRECTORY + "/" + dialog.getFirstVar()+"."+E4CStringTable.FILE_ENDING_METRIC);
				config.setName(dialog.getFirstVar());
				if(file.exists()) {
					choice = 1;
					RCPMessageProvider.errorMessage(FILE_EXISTS, METRIC_WITH_NAME_EXISTS);
				}
			}
		}
		
		if(choice == 0 || (choice == 1 && inputChoice == 0)) {
			try {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
				oos.writeObject(config);
				oos.close();
				System.out.println("Metric: "+file.getAbsolutePath()+" saved.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
	}
	/**
	 * this method deserializes a MetricContainer an returns it if string is empty return null. 
	 * @param path path of the file
	 */
	public static MetricContainer decode(String path) {
		if(!path.equals("")) {
			MetricContainer loadedUnit = null;
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
				Object obj = ois.readObject();
				ois.close();
				if(obj instanceof MetricContainer) {
					loadedUnit = (MetricContainer) obj;
				} else {
					RCPMessageProvider.errorMessage("Type error", "no metric selected");
				}
			} catch (IOException | ClassNotFoundException e) {
				String metricName = path.substring(path.lastIndexOf("\\")+1,path.lastIndexOf("."));
				RCPMessageProvider.errorMessage("Warning", "Your default metric, "+metricName+", has not been found");
			}
			return loadedUnit;	
		}
		return null;
	}
}
