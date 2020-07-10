package de.tu_bs.cs.isf.familymining.ppu_iec.core.util.compare;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.eclipse.e4.core.services.events.IEventBroker;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.status_bar.util.E4CStatus;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CEventTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPContentProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;

public class MultiModelContainer {
	public ConfigurationResultRoot[][] results;
	public List<Configuration> models;
	private E4CStatus status;
	private IEventBroker eventBroker; 
	private int workDone = 0;
	private int compareCount = 0;
	
	public MultiModelContainer(List<Configuration> models, IEventBroker broker) {
		results = new ConfigurationResultRoot[models.size()][models.size()];
		this.models = models;
		this.eventBroker = broker;
		initStatus();
	}
	
	private void initStatus() {
		for(int elements = models.size() ; elements >= 1 ; elements--) {
			compareCount +=elements;
		}
		status = new E4CStatus("Multi Pairwise Model Compare"+ "( "+workDone+ " / "+compareCount + ")", compareCount, workDone);
		updateStatus();
	}
	
	/**
	 * This method updates the statusbar.
	 */
	private void updateStatus() {
		status.setCurrentStatus(workDone);
		status.setStatusText("Multi Pairwise Model Compare"+ "("+workDone+ " / "+compareCount + ")");
		eventBroker.send(E4CEventTable.UPDATE_STATUS_BAR, status);
	}
	
	private void resetStatus() {
		status.setCurrentStatus(0);
		status.setMaximalStatus(0);
		status.setStatusText("");
		eventBroker.send(E4CEventTable.UPDATE_STATUS_BAR, status);
	}
	
	
	public void addResult(int n, int m , ConfigurationResultRoot result) {
		results[n][m] = result;
		workDone++;
		updateStatus();
		
	}
	/**
	 * This method puts a result to the container.
	 * @param result
	 */
	public void addResult(ConfigurationResultRoot result) {
		int n = models.indexOf(result.getChildren().get(0).getFirst());
		int m = models.indexOf(result.getChildren().get(0).getSecond());
		addResult(n, m, result);
	}
	
	/**
	 * This method checks if all ConfigurationResultRoots are available
	 * @return
	 */
	public boolean checkContainerStatus() {
		for(int i = 0 ; i < models.size(); i++) {
			for(int j = i ; j < models.size() ; j++) {
				if(results[i][j] == null) {
					return false;
				}	
			}
		}
		return true;
	}
	/**
	 * This method creates a CSV-File with all comparison details if status is true.
	 */
	public void createCSV() {
		String fileName = RCPContentProvider.getCurrentWorkspacePath() + E4CStringTable.MODEL_DIRECTORY+ "/"+"ComparisionResults."+E4CStringTable.FILE_ENDING_CSV;
		if(checkContainerStatus()) {
			try (PrintWriter writer = new PrintWriter(new File(fileName))) {
				StringBuilder sb = new StringBuilder();
				sb.append(";");
				for(Configuration model : models) {
					sb.append(model.getIdentifier() + ";");
				}
				
				for(int i = 0 ; i < models.size() ; i++) {
					sb.append('\n');
					sb.append(models.get(i).getIdentifier() + ";");
					for(int k = 0 ; k < i ; k++) {
						sb.append(";");
					}
					for(int j = i ; j < models.size() ; j++) {
						sb.append(results[i][j].getSimilarity() + ";");
					}
				}
				writer.append(sb.toString());
				resetStatus();

			} catch (IOException e) {
				RCPMessageProvider.errorMessage("File accsess error" , "Could not write file "+ fileName);
			}
		}	
	}
}
