package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.ISTImplAttribute;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractAttribute;

/**
 * Template class for a ILDLangAttribute. Just implement the compare method and create an extension for the ISTLangAttribute extension point.
 * The attribute will be added to the configuration manager where its possible to add it to the configuration. 
 * @author {Kamil Rosiak}
 *
 */
public abstract class AbstractSTImplAttribute extends AbstractAttribute implements ISTImplAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6267435015274963455L;

	public AbstractSTImplAttribute(String attrName, String attrDescription) {
		super(attrName, attrDescription);
	}
}
