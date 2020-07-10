package de.tu_bs.cs.isf.familymining.ppu_iec.parts.compare_engine_view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.swt.widgets.Composite;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.ConfigurationResultRoot;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUEventTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.util.compare.MultiModelContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.parts.compare_engine_view.view.CompareEngineView;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;


public class CompareEngineController {
	private CompareEngineView view;
	private MultiModelContainer multiContainer;
	private ServiceContainer services;
	
	@PostConstruct
	public void createControl(Composite parent, ServiceContainer services) {
		setView(new CompareEngineView(parent, services));
		this.services = services;
	}

	public CompareEngineView getView() {
		return view;
	}

	public void setView(CompareEngineView view) {
		this.view = view;
	}

	@Inject
	@Optional
	public void initialize(@UIEventTopic(PPUEventTable.START_COMPARE_ENGINE) List<Configuration> programs) {
		view.setSourceModel(programs.get(0));
		view.setTargetModel(programs.get(1));	
	}
	
	@Inject
	@Optional
	public void quickCompare(@UIEventTopic(PPUEventTable.QUICK_COMPARE_ENGINE) List<Configuration> programs) {
		initialize(programs);	
		view.quickCompare();
	}
	
	@Inject
	@Optional
	public void multiCompare(@UIEventTopic(PPUEventTable.MULTI_COMPARE_ENGINE) List<Configuration> modelList) {
		multiContainer = new MultiModelContainer(modelList, services.eventBroker);
		for(int i = 0 ; i < modelList.size() ; i++) {
			for(int j = i ; j <modelList.size() ; j++) {
				view.setSourceModel(modelList.get(i));
				view.setTargetModel(modelList.get(j));
				view.quickCompare();
			}
		}	
	}
	
	@Inject
	@Optional
	public void addResult(@UIEventTopic(PPUEventTable.ADD_RESULT) ConfigurationResultRoot result) {
		if(multiContainer != null) {
			multiContainer.addResult(result);
			if(multiContainer.checkContainerStatus()) {
				multiContainer.createCSV();
			}
		} else {
			view.showResult(result);
		}
	}
}
