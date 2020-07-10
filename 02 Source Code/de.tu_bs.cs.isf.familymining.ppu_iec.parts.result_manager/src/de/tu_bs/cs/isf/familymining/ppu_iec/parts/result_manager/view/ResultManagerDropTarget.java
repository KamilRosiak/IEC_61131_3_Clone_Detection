package de.tu_bs.cs.isf.familymining.ppu_iec.parts.result_manager.view;

import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.widgets.Control;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.util.SolutionSerializer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.dnd.drop.AbstractFileDropTarget;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;

/**
 * DropTarget for the configuration manager allows to drop .metric files into the configuration manager. 
 * Dropping a file causes loading them into the configuration manager.
 * @author {Kamil Rosiak}
 *
 */
public class ResultManagerDropTarget extends AbstractFileDropTarget{
	private ResultManagerView resultManagerView;
	
	public ResultManagerDropTarget(Control control, ResultManagerView resultManagerView) {
		super(control);
		this.resultManagerView = resultManagerView;
	}

	@Override
	public void handleItem(DropTargetEvent event) {
		String[] files = (String[])event.data;
		if(files[0].endsWith("." + E4CStringTable.FILE_ENDING_RESULT)) {
			ConfigurationResultRoot result = SolutionSerializer.decode(files[0]);
			
			if(result != null) {
				resultManagerView.setResult(result);
			}		
		}
	}
}
