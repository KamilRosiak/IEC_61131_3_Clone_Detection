package de.tu_bs.cs.isf.familymining.ppu_iec.core.contribution.project_explorer;

import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.parts.project_explorer.interfaces.WorkspaceStructureTemplate;

/**
 * This class extends the project explorer and creates the workspace structure.
 * @author Kamil Rosiak
 *
 */
public class IECWorkspaceStructure extends WorkspaceStructureTemplate {
	
	public IECWorkspaceStructure() {
		addDirectory(E4CStringTable.CONFIG_DIRECTORY);
		addDirectory(E4CStringTable.MODEL_DIRECTORY);
		addDirectory(E4CStringTable.RESULT_DIRECTORY);
		addDirectory(E4CStringTable.FAMILY_MODEL_DIRECTORY);
		addDirectory(E4CStringTable.FEATURE_MODEL_DIRECTORY);
	}
	
}
