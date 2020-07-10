package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.FamilyModelStrings;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.OptionAttribute;

/**
 * This class represents the POUImplementaionOption which will be added to data structure 
 * when the "Compare POU implementation" option is checked in the configuration.
 * @author {Kamil Rosiak}
 */
public class POUImplementationOption extends IECAbstractOption<AbstractLanguageContainer<?>> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5550815534184831702L;

	public POUImplementationOption(MetricContainer metric, OptionAttribute optionAttr) {
		super(metric, optionAttr);
	}

	@Override
	public String getLabel() {
		return FamilyModelStrings.SUBSYSTEM_IMPLEMENTATION;
	}
	

}
