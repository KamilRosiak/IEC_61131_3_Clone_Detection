package de.tu_bs.cs.isf.familymining.ppu_iec.core.handler;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.util.SolutionSerializer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.util.FamilyModelTransformUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPSelectionService;
import de.tu_bs.cs.isf.familymining.rcp_e4.featuremodel.core.string_table.FDEventTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.featuremodel.core.string_table.FDStringTable;

public class GenerateFeatureDiagrammFromResultHandler {
	
	@Execute
	public void generateFeatureDiagram(ServiceContainer services) {
		services.partService.showPart(FDStringTable.BUNDLE_NAME);
		
		String filePath = services.rcpSelectionService.getCurrentSelectionFromExplorer().getAbsolutePath();
		
		ConfigurationResultRoot result = SolutionSerializer.decode(filePath);
		
		services.eventBroker.send(FDEventTable.LOAD_FEATURE_DIAGRAM, FamilyModelTransformUtil.transformToFeatureDiagram(result));
		services.eventBroker.send(FDEventTable.FORMAT_DIAGRAM_EVENT, "");
		
	}
	
	@CanExecute
	public boolean canExecute(RCPSelectionService selectionService) {
		if(selectionService.getCurrentSelectionFromExplorer() != null) {
			if(selectionService.getCurrentSelectionFromExplorer().isDirectory()) {
				return false;
			}
		} else {
			return false;
		}

		return selectionService.getCurrentSelectionFromExplorer().getExtension().equals(E4CStringTable.FILE_ENDING_FAMILY_MODEL);
	}
}
