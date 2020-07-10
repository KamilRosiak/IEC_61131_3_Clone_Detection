package de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_view.contribution;

import org.eclipse.swt.graphics.Image;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.util.SolutionSerializer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_view.string_table.FMStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_view.string_table.FileTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPImageService;
import de.tu_bs.cs.isf.familymining.rcp_e4.parts.project_explorer.interfaces.IProjectExplorerExtension;

public class FamilyModelExtension implements IProjectExplorerExtension {

	@Override
	public Image getIcon(RCPImageService imageService) {
		return imageService.getImage(FMStringTable.BUNDLE_NAME, FileTable.FAMILY_MODEL_16_ICON_PATH);
	}

	@Override
	public void execute(ServiceContainer container) {

		FileTreeElement target = container.rcpSelectionService.getCurrentSelectionFromExplorer();
		ConfigurationResultRoot result = SolutionSerializer.decode(target.getAbsolutePath());
		container.partService.showPart("de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_view"); 
		container.partService.showPart("de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_detail_view"); 

		container.eventBroker.send(PPUEventTable.RESULT_EVENT, result);
		
	}

}
