package de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_view.contribution;

import org.eclipse.swt.graphics.Image;

import de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_view.string_table.FMStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.familymodel_view.string_table.FileTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPImageService;
import de.tu_bs.cs.isf.familymining.rcp_e4.parts.project_explorer.interfaces.IProjectExplorerExtension;

public class FamilyModelXMLExtension implements IProjectExplorerExtension {

	@Override
	public Image getIcon(RCPImageService imageService) {
		return imageService.getImage(FMStringTable.BUNDLE_NAME, FileTable.FAMILY_MODEL_16_XML_ICON_PATH);
	}

	@Override
	public void execute(ServiceContainer container) {
		RCPMessageProvider.informationMessage("Not Available", "An Editor for familyXML is not available now.");	
	}

}
