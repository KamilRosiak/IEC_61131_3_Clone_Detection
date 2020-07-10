package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.variable.VariableContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.FamilyModelStrings;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.OptionAttribute;

/**
 * This class represents the model variable option which will be added to data structure 
 * when the "Compare Global variables" option is checked in the configuration.
 * @author {Kamil Rosiak}
 */
public class ModelVariableOption extends IECAbstractOption<VariableContainer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModelVariableOption(MetricContainer metric, OptionAttribute optionAttr) {
		super(metric, optionAttr);
	}

	@Override
	public String getLabel() {
		return FamilyModelStrings.SUBSYSTEM_GLOBAL_VARIABLES;
	}
}
