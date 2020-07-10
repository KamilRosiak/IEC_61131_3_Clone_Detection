package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractOption;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.FamilyModelStrings;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.OptionAttribute;

/**
 * This class represents the Model implementation option which will be added to data structure 
 * when the "Compare Program Organization Units (POUs)" option is checked in the configuration.
 * @author {Kamil Rosiak}
 */
public class ModelImplementaionOption extends IECAbstractOption<POUCompareContainer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6227919096733939730L;
	
	public ModelImplementaionOption(MetricContainer metric, OptionAttribute optionAttr) {
		super(metric,optionAttr);
	}

	@Override
	public String getLabel() {
		return FamilyModelStrings.SUBSYSTEM_POUs;
	}
}
