package de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.ppuiecanalyticsview.contribution;

import org.eclipse.swt.graphics.Image;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUFileTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.ppuiecanalyticsview.handler.ShowProjectDetailsHandler;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPImageService;
import de.tu_bs.cs.isf.familymining.rcp_e4.parts.project_explorer.interfaces.IProjectExplorerExtension;

public class ConfigurationFileExtension implements IProjectExplorerExtension {
	public ShowProjectDetailsHandler handler;
	
	@Override
	public Image getIcon(RCPImageService imageService) {
		return imageService.getImage(PPUStringTable.BUNDLE_NAME, PPUFileTable.MODEL_FILE_ICON);	
	}

	@Override
	public void execute(ServiceContainer container) {
		container.partService.showPart(PPUStringTable.ANALYTICS_VIEW_ID);
	}
}



