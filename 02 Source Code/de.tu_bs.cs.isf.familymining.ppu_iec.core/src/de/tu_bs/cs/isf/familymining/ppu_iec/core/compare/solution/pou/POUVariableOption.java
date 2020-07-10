package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.variable.VariableContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.FamilyModelStrings;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.OptionAttribute;

/**
 * This class represents the POUVariableOption which will be added to data structure 
 * when the "Compare POU variables" option is checked in the configuration.
 * @author {Kamil Rosiak}
 */
public class POUVariableOption extends IECAbstractOption<VariableContainer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2134523030329113962L;
	
	public POUVariableOption(MetricContainer metric, OptionAttribute pouAttr) {
		super(metric,pouAttr);
	}

	@Override
	public String getLabel() {
		return FamilyModelStrings.SUBSYSTEM_VARIABLES;
	}
}
