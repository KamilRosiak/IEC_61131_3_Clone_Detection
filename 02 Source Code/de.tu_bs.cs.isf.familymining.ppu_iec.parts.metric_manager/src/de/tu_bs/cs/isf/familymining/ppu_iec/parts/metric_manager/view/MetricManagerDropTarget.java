package de.tu_bs.cs.isf.familymining.ppu_iec.parts.metric_manager.view;

import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.widgets.Control;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.util.MetricContainerSerializer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.dnd.drop.AbstractFileDropTarget;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;

/**
 * DropTarget for the configuration manager allows to drop .metric files into the configuration manager. 
 * Dropping a file causes loading them into the configuration manager.
 * @author {Kamil Rosiak}
 *
 */
public class MetricManagerDropTarget extends AbstractFileDropTarget{
	private MetricManagerView configManagerView;
	
	public MetricManagerDropTarget(Control control, MetricManagerView configManagerView) {
		super(control);
		this.configManagerView = configManagerView;
	}

	@Override
	public void handleItem(DropTargetEvent event) {
		String[] files = (String[])event.data;
		if(files[0].endsWith("." + E4CStringTable.FILE_ENDING_METRIC)) {
			MetricContainer config = MetricContainerSerializer.decode(files[0]);
			
			if(config != null) {
				configManagerView.setConfiguration(config);
			}		
		}
	}
}
