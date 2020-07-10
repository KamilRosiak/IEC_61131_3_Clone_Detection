package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.function_block_diagram.templates;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.function_block_diagram.IFBDLangAttribute;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractAttribute;


/**
 * This class is a template class for a Function block Attribute. Implement the compare method and create an extension for the IFBDImpAttribute extension point.
 *  The attribute is added to the attribute manager where you can use it to extend a metric. The Constructor of the implementation may not have parameters. 
 * @author {Kamil Rosiak}
 *
 */
public abstract class AbstractFBDLangAttribute extends AbstractAttribute implements IFBDLangAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7526693719599377806L;

	public AbstractFBDLangAttribute(String attrName, String attrDescription) {
		super(attrName, attrDescription);
	}
}
