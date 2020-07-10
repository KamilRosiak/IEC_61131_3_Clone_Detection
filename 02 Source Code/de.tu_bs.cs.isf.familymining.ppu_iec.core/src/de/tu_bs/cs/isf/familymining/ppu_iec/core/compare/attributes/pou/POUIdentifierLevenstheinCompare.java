package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.pou;



import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.commons.LevenstheinDistance;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.templates.AbstractPOUAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class POUIdentifierLevenstheinCompare extends AbstractPOUAttribute{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String MODUL_NAME = "Name - Levensthein";
	public static final String MODUL_DESCRIPTION = "Compares the name by means of calculating their Levensthein Distance";
	
	public static final double weight = 0.3;

	public POUIdentifierLevenstheinCompare() {
		super(MODUL_NAME, MODUL_DESCRIPTION);
	}

	@Override
	public ResultElement<POU> compare(POU pou1, POU pou2) {		
		
		float distance = LevenstheinDistance.computeLevenshteinDistance(pou1.getIdentifier(), pou2.getIdentifier());
		
		float maxWordLength = Math.max(pou1.getIdentifier().length(), pou2.getIdentifier().length());
		
		float similarity = (1-(distance/maxWordLength)) > 0 ? (1-(distance/maxWordLength)) : 0;
		
		return new ResultElement<POU>(pou1, pou2, similarity, this);
		
	}  

}
