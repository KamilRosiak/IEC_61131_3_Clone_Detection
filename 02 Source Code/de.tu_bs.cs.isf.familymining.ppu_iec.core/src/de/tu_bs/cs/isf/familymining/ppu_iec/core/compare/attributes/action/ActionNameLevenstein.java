package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.action;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.commons.LevenstheinDistance;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractActionAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class ActionNameLevenstein extends AbstractActionAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6797812342693371082L;
	public static final String UNIT_NAME = "Action Names - Levenshtein Distance";
	public static final String UNIT_DESCRIPTION = "Compares the names of two actions using the levenshtein distance.";
	public ActionNameLevenstein() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResultElement<Action> compare(Action action1, Action action2) {
		float distance = LevenstheinDistance.computeLevenshteinDistance(action1.getName(),action2.getName());
		
		float maxWordLength = Math.max(action1.getName().length(), action2.getName().length());
		
		float similarity = (1-(distance/maxWordLength)) > 0 ? (1-(distance/maxWordLength)) : 0;

		return new ResultElement<Action>(action1, action2, similarity, this);
	}

}
