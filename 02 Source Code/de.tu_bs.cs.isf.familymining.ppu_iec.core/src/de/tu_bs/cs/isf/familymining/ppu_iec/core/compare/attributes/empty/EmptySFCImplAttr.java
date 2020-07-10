package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.empty;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class EmptySFCImplAttr extends AbstractSFCImplAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5804049127623945449L;
	public static final String UNIT_NAME = "No Steps in SFC";
	public static final String UNIT_DESCRIPTION = "If SFC has no steps"; 
	
	public EmptySFCImplAttr() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<Step> compare(Step source, Step target) {
		return new ResultElement<Step>(source, target, 1f,this);
	} 
}
