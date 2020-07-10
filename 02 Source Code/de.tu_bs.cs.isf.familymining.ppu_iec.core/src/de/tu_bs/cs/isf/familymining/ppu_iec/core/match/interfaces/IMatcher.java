package de.tu_bs.cs.isf.familymining.ppu_iec.core.match.interfaces;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUCompareContainer;
/**
 * interface for the matching
 * @author {Kamil Rosiak}
 *
 */
public interface IMatcher {
	
	public void match(ConfigurationResultRoot root);
	public void matchPOUOContainer(POUCompareContainer pouContainer);
}
