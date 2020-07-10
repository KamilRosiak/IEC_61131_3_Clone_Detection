 
package de.tu_bs.cs.isf.familymining.ppu_iec.core.handler;

import java.util.List;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.util.MetricContainerSerializer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.util.MetricExporter;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPContentProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPSelectionService;

public class ExportMetricHandler {
	
	@Execute
	public void execute(ServiceContainer services) {
		MetricContainer metricCont = MetricContainerSerializer.decode(services.rcpSelectionService.getCurrentSelectionsFromExplorer().get(0).getAbsolutePath());
		String path = "file:///" +RCPContentProvider.getCurrentWorkspacePath() + E4CStringTable.FAMILY_MODEL_DIRECTORY + "/" + metricCont.getName()+"."+E4CStringTable.FILE_ENDING_XML;
		MetricExporter exporter = new MetricExporter(metricCont);
		exporter.saveMetricToXmi(path);
	}
	
	private boolean checkForMetric(List<FileTreeElement> selectedFiles) {
		return !selectedFiles.stream()
				.filter(element -> !element.isDirectory())
				.anyMatch(element -> !element.getExtension().equals(E4CStringTable.FILE_ENDING_METRIC));
	}
	
	@CanExecute
	public boolean canExecute(RCPSelectionService selectionService) {
		List<FileTreeElement> selectedFiles = selectionService.getCurrentSelectionsFromExplorer();
		return checkForMetric(selectedFiles) && selectedFiles.size() == 1;
	}
		
}