package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.IPOUAttribute;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractAttribute;

/**
 * Template class for a POUAttribute. Just implement the compare method and create an extension for the POUAttr extension point.
 * The attribute will be added to the configuration manager where its possible to add it to the configuration. 
 * @author {Kamil Rosiak}
 *
 */
public abstract class AbstractPOUAttribute extends AbstractAttribute implements IPOUAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6018675197412575763L;

	public AbstractPOUAttribute(String attrName, String attrDescription) {
		super(attrName, attrDescription);
	}
}
