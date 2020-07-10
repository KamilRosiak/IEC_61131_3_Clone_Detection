package de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.contribution.project_explorer;

import org.eclipse.swt.graphics.Image;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUFileTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPImageService;
import de.tu_bs.cs.isf.familymining.rcp_e4.parts.project_explorer.interfaces.IProjectExplorerExtension;

public class MetricFileExtension implements IProjectExplorerExtension {
	
	@Override
	public Image getIcon(RCPImageService imageService) {
		return imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.METRIC_ICON_16);
	}

	@Override
	public void execute(ServiceContainer container) {
		container.partService.showPart(PPUStringTable.METRIC_MANAGER_VIEW_ID);
		FileTreeElement target = container.rcpSelectionService.getCurrentSelectionFromExplorer();
		container.eventBroker.send(PPUEventTable.LOAD_METRIC_FROM_FILE, target);
	}
}
