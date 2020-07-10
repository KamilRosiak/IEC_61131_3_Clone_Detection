package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPContentProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;

/**
 * This utility class provides an encode and a decoder for Solutions its saves all parameters.
 * @author {Kamil Rosiak}
 *
 */
public class SolutionSerializer {
	/**
	 * this method serializes a MetricContainer to the Result directory.
	 * @param config serialized unit 
	 */
	public static void encode(ConfigurationResultRoot resultRoot, Boolean isOverwritte) {
		encode(resultRoot, RCPContentProvider.getCurrentWorkspacePath()+E4CStringTable.RESULT_DIRECTORY, E4CStringTable.FILE_ENDING_RESULT, isOverwritte);
	}
	
	/**
	 * this method serializes a MetricContainer to a given path with a given file extension.
	 * @param config serialized unit 
	 */
	public static void encode(ConfigurationResultRoot resultRoot, String path, String fileExtension, Boolean isOverwritte) {
		if(!resultRoot.getChildren().isEmpty()) {
			Configuration firstConfig = resultRoot.getChildren().get(0).getFirst();
			Configuration secondConfig = resultRoot.getChildren().get(0).getSecond();
			String first = "";
			String second = "";
			if(firstConfig != null) {
				first = firstConfig.getIdentifier();
			}
			if(secondConfig != null) {
				second = secondConfig.getIdentifier();
			}
			
			
			
			String fileName = first+"_with_"+second+"_config_"+ resultRoot.getMetric().getName();
	
			File file = new File(path +"/"+ fileName +"."+ fileExtension);
			boolean overwritte = true;
			
			if(file.exists() && isOverwritte) {
				overwritte = RCPMessageProvider.questionMessage("file exists", "A result with this name already exists.");
			}
			if(overwritte) {
				try {
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
					oos.writeObject(resultRoot);
					oos.close();
					System.out.println("Result: "+fileName+" saved.");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}	
		} else {
			RCPMessageProvider.errorMessage("no result elements", "The compare result is empty. Please check your metric.");
		}
	}
	
	/**
	 * this method deserializes a MetricContainer 
	 * @param path path of the file
	 */
	public static ConfigurationResultRoot decode(String path) {
		ConfigurationResultRoot loadedUnit = null;

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
			Object obj = ois.readObject();
			ois.close();
			if(obj instanceof ConfigurationResultRoot) {
				loadedUnit = (ConfigurationResultRoot) obj;
			} else {
				RCPMessageProvider.errorMessage("Type error", "no compare unit selected");
			}
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return loadedUnit;	
	}
}
