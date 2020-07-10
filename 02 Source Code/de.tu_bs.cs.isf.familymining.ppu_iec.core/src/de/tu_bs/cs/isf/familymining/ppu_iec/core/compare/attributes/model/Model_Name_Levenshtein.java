package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.model;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.commons.LevenstheinDistance;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractModelAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

/**
 * 
 * @author Schlie
 *
 */
public class Model_Name_Levenshtein extends AbstractModelAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 119095714130805799L;
	public static final String UNIT_NAME = "Names - Levenshtein Distance";
	public static final String UNIT_DESCRIPTION = "Compares the names of two projects using the levenshtein distance.";

	public Model_Name_Levenshtein() {
		super(UNIT_NAME, UNIT_DESCRIPTION);	
	}

	@Override
	public ResultElement<Configuration> compare(Configuration modell1, Configuration modell2) {
		
		float distance = LevenstheinDistance.computeLevenshteinDistance(modell1.getResources().get(0).getName(), modell2.getResources().get(0).getName());
		
		float maxWordLength = Math.max(modell1.getResources().get(0).getName().length(), modell2.getResources().get(0).getName().length());
		
		float similarity = (1-(distance/maxWordLength)) > 0 ? (1-(distance/maxWordLength)) : 0;
		
		return new ResultElement<Configuration>(modell1, modell2, similarity, this);
	}

}