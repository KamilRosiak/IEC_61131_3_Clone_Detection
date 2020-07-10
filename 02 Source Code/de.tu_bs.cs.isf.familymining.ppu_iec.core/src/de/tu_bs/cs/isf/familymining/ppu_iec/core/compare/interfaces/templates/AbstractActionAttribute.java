package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.IActionAttribute;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractAttribute;
/**
 * Template class for a ActionAttribute. Just implement the compare method and create an extension for the ActionAttr extension point.
 * The attribute will be added to the configuration manager where its possible to add it to the configuration. 
 * @author {Kamil Rosiak}
 *
 */
public abstract class AbstractActionAttribute extends AbstractAttribute implements IActionAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4043397758963248925L;

	public AbstractActionAttribute(String attrName, String attrDescription) {
		super(attrName, attrDescription);
	}
}
