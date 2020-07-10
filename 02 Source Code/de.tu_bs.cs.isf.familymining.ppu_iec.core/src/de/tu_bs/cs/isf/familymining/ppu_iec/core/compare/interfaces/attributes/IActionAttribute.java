package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public interface IActionAttribute {
	
	public ResultElement<Action> compare(Action action1, Action action2);
}
