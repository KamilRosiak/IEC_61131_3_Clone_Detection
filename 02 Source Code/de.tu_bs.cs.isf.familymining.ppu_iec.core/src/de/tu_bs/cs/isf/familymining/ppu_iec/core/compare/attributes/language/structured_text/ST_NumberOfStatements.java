package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.language.structured_text;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;
/**
 * Example CompareElement
 * @author {Kamil Rosiak}
 *
 */
public class ST_NumberOfStatements extends AbstractSTLangAttribute {
	private static final long serialVersionUID = 1L;
	public static final String UNIT_NAME = "ST Number of Statements";
	public static final String UNIT_DESCRIPTION = "Compares the number of statements of ST implementations.";
	
	public ST_NumberOfStatements() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<StructuredText>  compare(StructuredText source, StructuredText target) {
		float similarity = 0f;
		
		float sizeSt1 = 1;
		float sizeST2 = 1;
		
		if (!source.getStatements().isEmpty()) {
			sizeSt1 = source.getStatements().size();
		}
		
		if (!target.getStatements().isEmpty()) {
			sizeST2 = target.getStatements().size();
		}
		
		similarity = (float)Math.min(sizeSt1, sizeST2) / Math.max(sizeSt1, sizeST2);
		return new ResultElement<StructuredText> (source, target, similarity ,this);

	}
}
