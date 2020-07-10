package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.IModelAttribute;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractAttribute;

/**
 * Template class for a ModelAttribute. Just implement the compare method and create an extension for the ModelAttr extension point.
 * The attribute will be added to the configuration manager where its possible to add it to the configuration. 
 * @author {Kamil Rosiak}
 *
 */
public abstract class AbstractModelAttribute extends AbstractAttribute implements IModelAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1349614481015199580L;

	public AbstractModelAttribute(String attrName, String attrDescription) {
		super(attrName, attrDescription);
	}
}
