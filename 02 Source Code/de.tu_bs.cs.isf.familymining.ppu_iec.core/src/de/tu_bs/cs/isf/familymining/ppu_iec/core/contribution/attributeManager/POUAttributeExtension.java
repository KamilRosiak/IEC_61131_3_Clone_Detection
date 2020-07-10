package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.attributeManager;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.ConfigurationManagerColor;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUFileTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.parts.attribute_manager.extension.IAttributeExtension;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractAttribute;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPContentProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.services.RCPImageService;

public class POUAttributeExtension implements IAttributeExtension {

	@Override
	public String getAttributeTypeName() {
		return PPUStringTable.POU_CONTAINER_NAME;
	}

	@Override
	public List<AbstractAttribute> getAttributes() {
		List<Object> attrs = RCPContentProvider.getInstanceFromBundle(PPUStringTable.POU_ATTRIBUTE_SYMBOLIC_NAME,PPUStringTable.POU_ATTR_EXTENSION);
		List<AbstractAttribute> absAttrs = new ArrayList<AbstractAttribute>();
		for(Object obj : attrs) {
			if(obj instanceof AbstractAttribute) {
				absAttrs.add((AbstractAttribute)obj);
			}
		}
		return absAttrs;
	}
	
	@Override
	public Color getAttributeColor() {
		return ConfigurationManagerColor.POU_ATTR_COLOR;
	}
	
	@Override
	public Color getAttributeTypColor() {
		return ConfigurationManagerColor.POU_CONTAINER_COLOR;
	}
	@Override
	public Image getIcon(RCPImageService imageService) {
		return imageService.getImage(PPUStringTable.BUNDLE_NAME ,PPUFileTable.POU_ATTRIBUTE_16);
	}

	@Override
	public void execute(ServiceContainer services, AbstractAttribute attribute) {
		services.partService.showPart(PPUStringTable.METRIC_MANAGER_VIEW_ID);
		services.eventBroker.send(PPUEventTable.ADD_POU_ATTR, attribute);
	}

}
