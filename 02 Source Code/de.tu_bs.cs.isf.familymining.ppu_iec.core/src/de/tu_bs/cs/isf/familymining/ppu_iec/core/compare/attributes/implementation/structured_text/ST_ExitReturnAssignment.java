package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.structured_text;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ExitStatement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ReturnStatement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class ST_ExitReturnAssignment extends AbstractSTImplAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5804049127623945449L;
	public static final String UNIT_NAME = "ST Exit or Return Assignment";
	public static final String UNIT_DESCRIPTION = "When finding an exit or return it assigns them a similarity.";
	
	public ST_ExitReturnAssignment() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<Statement> compare(Statement source, Statement target) {
		if(source instanceof ReturnStatement && target instanceof ReturnStatement) {
			return new ResultElement<Statement>(source, target, 1f, this);			
		} else if (source instanceof ExitStatement && target instanceof ExitStatement) {
			return new ResultElement<Statement>(source, target, 1f, this);	
		}
		return null;	
	}
}
