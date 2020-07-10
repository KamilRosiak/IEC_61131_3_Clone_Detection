package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.action.ActionCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.FamilyModelStrings;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.OptionAttribute;

/**
 * This class represents the POUActionOption which will be added to data structure 
 * when the "Compare POU actions" option is checked in the configuration.
 * @author {Kamil Rosiak}
 */
public class POUActionOption extends IECAbstractOption<ActionCompareContainer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4748101394133536881L;

	
	public POUActionOption(MetricContainer metric, OptionAttribute pouAttr) {
		super(metric, pouAttr);
	}


	@Override
	public String getLabel() {
		return FamilyModelStrings.SUBSYSTEM_ACTIONS;
	}
}
