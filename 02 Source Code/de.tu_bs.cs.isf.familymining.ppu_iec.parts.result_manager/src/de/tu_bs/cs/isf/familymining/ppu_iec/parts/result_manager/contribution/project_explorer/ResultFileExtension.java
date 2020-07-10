package de.tu_bs.cs.isf.familymining.ppu_iec.parts.result_manager.contribution.project_explorer;

import org.eclipse.swt.graphics.Image;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUFileTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.parts.result_manager.handler.OpenResultManagerHandler;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPImageService;
import de.tu_bs.cs.isf.familymining.rcp_e4.parts.project_explorer.interfaces.IProjectExplorerExtension;

public class ResultFileExtension implements IProjectExplorerExtension {
	public OpenResultManagerHandler handler;
	
	@Override
	public Image getIcon(RCPImageService imageService) {
		return imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.RESULT_ICON_16);
	}

	@Override
	public void execute(ServiceContainer container) {
		container.partService.showPart(PPUStringTable.RESULT_MANAGER_VIEW_ID);
		FileTreeElement target = container.rcpSelectionService.getCurrentSelectionFromExplorer();
		container.partService.showPart("de.tu_bs.cs.isf.familymining.ppu_iec.result_manager");
		container.eventBroker.send(PPUEventTable.LOAD_RESULT_FROM_FILE, target);
	}
}
