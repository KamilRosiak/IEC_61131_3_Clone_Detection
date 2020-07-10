package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.action;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.FamilyModelStrings;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.OptionAttribute;

public class ActionImplementationOption extends IECAbstractOption<IECAbstractContainer<?>> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8721548304978613227L;
	
	public ActionImplementationOption(MetricContainer metric, OptionAttribute actionAttr) {
		super(metric ,actionAttr);
	}

	@Override
	public String getLabel() {
		return FamilyModelStrings.SUBSYSTEM_IMPLEMENTATION;
	}
}
