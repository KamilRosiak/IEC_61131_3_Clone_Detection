package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.ISFCLangAttribute;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractAttribute;

/**
 * Template class for a ILDLangAttribute. Just implement the compare method and create an extension for the ISFCLangAttribute extension point.
 * The attribute will be added to the configuration manager where its possible to add it to the configuration. 
 * @author {Kamil Rosiak}
 *
 */
public abstract class AbstractSFCLangAttribute extends AbstractAttribute implements ISFCLangAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6267435015274963455L;

	public AbstractSFCLangAttribute(String attrName, String attrDescription) {
		super(attrName, attrDescription);
	}
}
