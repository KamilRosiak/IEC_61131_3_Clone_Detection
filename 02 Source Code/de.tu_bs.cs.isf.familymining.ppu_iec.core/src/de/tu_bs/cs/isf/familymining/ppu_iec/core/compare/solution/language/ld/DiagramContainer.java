package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.ld;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.AbstractLanguageContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.FamilyModelStrings;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramType;

public class DiagramContainer  extends AbstractLanguageContainer<Diagram>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6031261661816806903L;

	public DiagramContainer(Diagram first, Diagram second, MetricContainer metric) {
		super(first, second, metric);
	}

	@Override
	public String getLeftLabel() {
		if(getFirst() != null) {
			return getLabelForDiagram(getFirst().getType());
		} else if (getSecond() != null) {
			return getLabelForDiagram(getSecond().getType());
		} else {
			return null;
		}
	}

	@Override
	public String getRightLabel() {
		if(getFirst() != null) {
			return getLabelForDiagram(getFirst().getType());
		} else if (getSecond() != null) {
			return getLabelForDiagram(getSecond().getType());
		} else {
			return null;
		}
	}
	
	private String getLabelForDiagram(DiagramType type) {
		if(type.equals(DiagramType.LADDER_DIAGRAM)) {
			return FamilyModelStrings.LD_IMPLEMENTATION;
		}  else {
			return FamilyModelStrings.FBD_IMPLEMENTATION;
		}
	}
}
