package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.ladder_diagram.templates;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.ladder_diagram.ILDLangAttribute;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractAttribute;

/**
 * Template class for a ILDLangAttribute. Just implement the compare method and create an extension for the ILDLangAttribute extension point.
 * The attribute will be added to the configuration manager where its possible to add it to the configuration. 
 * @author {Kamil Rosiak}
 *
 */
public abstract class AbstractLDLangAttribute extends AbstractAttribute implements ILDLangAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6267435015274963455L;

	public AbstractLDLangAttribute(String attrName, String attrDescription) {
		super(attrName, attrDescription);
	}
}
