package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.util;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.DiagramContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld.implementation.LDNetworkImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.SFCLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.sfc.implementation.SFCImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.STLangContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.implementation.STImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.templates.IECAbstractContainer;

/**
 * This class represents a helper for solution classes and simplifies the usage of it.
 * @author {Kamil Rosiak}
 *
 */
public abstract class SolutionUtil {
	
	/**
	 * This method returns the first label of an LanguageContainer if not null.
	 */
	public static String getFirstLabel(IECAbstractContainer<?> container) {
		//Label for ST Container 
		if(container instanceof STLangContainer) {
			if(container.getFirst() != null) {
				return ((STLangContainer)container).getFirst().getLabel();
			}
		} else if(container instanceof STImplContainer) {
			if(container.getFirst() != null) {
				return ((STImplContainer)container).getFirst().getText();
			}
		//Label for SFC Container 
		} else if(container instanceof SFCLangContainer) {
			if(container.getFirst() != null) {
				return ((SFCLangContainer)container).getFirst().getLabel();
			}
		} else if(container instanceof SFCImplContainer) {
			if(container.getFirst() != null) {
				return ((SFCImplContainer)container).getFirst().getName();
			}
		//Label for LD Container 
		} else if(container instanceof DiagramContainer) {
			if(container.getFirst() != null) {
				return ((DiagramContainer)container).getFirst().getLabel();
			}
		} else if(container instanceof LDNetworkImplContainer) {
			if(container.getFirst() != null) {
				//return ((LDImplContainer)container).getSecond();
				return "sourceLD";
			}
		}
		return ""; 
	}

	/**
	 * This method returns the second label of an LanguageContainer if not null.
	 */
	public static String getSecondLabel(IECAbstractContainer<?> container) {
		//Label for ST Container 
		if(container instanceof STLangContainer) {
			if(container.getSecond() != null) {
				return ((STLangContainer)container).getSecond().getLabel();
			}
		} else if(container instanceof STImplContainer) {
			if(container.getSecond() != null) {
				return ((STImplContainer)container).getSecond().getText();
			}
		//Label for SFC Container 
		} else if(container instanceof SFCLangContainer) {
			if(container.getSecond() != null) {
				return ((SFCLangContainer)container).getSecond().getLabel();
			}
		} else if(container instanceof SFCImplContainer) {
			if(container.getSecond() != null) {
				return ((SFCImplContainer)container).getSecond().getName();
			}
		//Label for LD Container 
		} else if(container instanceof DiagramContainer) {
			if(container.getSecond() != null) {
				return ((DiagramContainer)container).getSecond().getLabel();
			}
		} else if(container instanceof LDNetworkImplContainer) {
			if(container.getSecond() != null) {
				//return ((LDImplContainer)container).getSecond();
				return "targetLD";
			}
		}
		return ""; 
	}
	
}
