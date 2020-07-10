package de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.util.ModelTransformUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.util.ProjectCompareUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.view.ExtractionView;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUCompareContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.graph.core.string_table.GraphEvents;
import de.tu_bs.cs.isf.familymining.rcp_e4.graph.core.string_table.GraphStringTable;
import javafx.embed.swt.FXCanvas;

public class ExtractionViewController {
	private ServiceContainer services;
	private ExtractionView view;
	private String modelName = "";
	
	@PostConstruct
	public void createControll(Composite parent, ServiceContainer services) {
		this.setServices(services);
		FXCanvas canvas = new FXCanvas(parent, SWT.NONE);
		view = new ExtractionView(canvas, this);
	}
	
	public ServiceContainer getServices() {
		return services;
	}

	public void setServices(ServiceContainer services) {
		this.services = services;
	}	

	@Inject
	@Optional
	public void showProjectCompareView(@UIEventTopic(PPUEventTable.PROJECT_COMPARE_EVENT) List<Configuration> models) {
		modelName = "";
		for(Configuration config : models) {
			modelName += config.getIdentifier() +" ";
		}
		view.showView(models);
	}
	
	@Inject
	@Optional
	public void comparePOUs(@UIEventTopic(PPUEventTable.COMPARE_POU_EVENT) List<POU> pous) {
		List<POUCompareContainer> results = ProjectCompareUtil.comparePOUs(pous, view.getBottomBar().getMetric(), view.getBottomBar().getMatcher());
		//Filters the container that has a similarity that is smaller than the threshold.
		results = results.stream()
		.filter(container -> container.getSimilarity() >= view.getBottomBar().getThreshold())
		.collect(Collectors.toList());
		
		ProjectCompareUtil.createCSV(results, modelName+"_compare_results");
		ProjectCompareUtil.findGroups(results);
		services.partService.showPart(GraphStringTable.GRAPH_VIEW);
		services.eventBroker.send(GraphEvents.LOAD_GRAPH_MODEL,ModelTransformUtil.transformGraphModel(results));
	}
	
}
