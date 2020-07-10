package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractOption;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.OptionAttribute;

public abstract class IECAbstractOption<ContainerType extends AbstractContainer<?,MetricContainer>> extends AbstractOption<ContainerType , MetricContainer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3040700778943729353L;

	public IECAbstractOption(MetricContainer metric, OptionAttribute optionAttr) {
		super(metric, optionAttr);
	}
}
