package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.IVariableAttribute;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractAttribute;

/**
 * Template class for a VariableAttribute. Just implement the compare method and create an extension for the VariableAttr extension point.
 * The attribute will be added to the configuration manager where its possible to add it to the configuration. 
 * @author {Kamil Rosiak}
 *
 */
public abstract class AbstractVariableAttribute extends AbstractAttribute implements IVariableAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5213690112540839419L;
	
	
	public AbstractVariableAttribute(String attrName, String attrDescription) {
		super(attrName, attrDescription);
	}
}
