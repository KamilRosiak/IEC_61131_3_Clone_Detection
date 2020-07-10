package de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.view.components;

import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.string_table.StringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.view.ExtractionView;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.util.MetricContainerSerializer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.match.interfaces.AbstractMatcher;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.PPUStringTable;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.util.IECCompareUtil;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.util.VariabilityThresholdsUtil;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.gui.java_fx.util.JavaFXBuilder;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPContentProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.ServiceContainer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.ToolBar;

/**
 * This class represents the bottom toolbar that allows you to select a metric and a matcher.
 * @author Kamil Rosiak
 *
 */
public class ExtractionViewBottomToolBar extends ToolBar {
	private final double THRESHOLD_VALUE = VariabilityThresholdsUtil.getMandatoryValue();
	
	private ServiceContainer services;
	private ExtractionView view;
	private Label metricLabel;
	private MetricContainer metric;
	private ComboBox<AbstractMatcher> metricCombo;
	private Slider similaritySlider;

	
	
	public ExtractionViewBottomToolBar(ServiceContainer services, ExtractionView view) {
		this.setServices(services);
		this.view = view;
		initControl();
	}

	/**
	 * This method initializes the ToolBar and adds all buttons to it.
	 */
	private void initControl() {
		minWidthProperty().bind(view.getRootPane().widthProperty());
		
		/**
		 * Add Buttons to ToolBar
		 */
		//Metric selection 
		metricLabel = new Label(StringTable.METRIC_LABEL);
		getItems().add(JavaFXBuilder.createButton(StringTable.SELECT_METRIC_LABEL, e-> {
			MetricContainer selectedMetric = MetricContainerSerializer.decode(RCPMessageProvider.getFilePathDialog(E4CStringTable.DIALOG_SELECT_METRIC, E4CStringTable.CONFIG_DIRECTORY));
			if(selectedMetric != null) {
				metricLabel.setText(selectedMetric.getName());
				setMetric(selectedMetric);
			}
			
		})); 
		getItems().add(metricLabel);
		setDefaultMetric();
		
		//matcher combobox
		getItems().add(new Label("      "+StringTable.MATCHING_LABEL));
		ObservableList<AbstractMatcher> matcher = getMatcherList();
		metricCombo = new ComboBox<AbstractMatcher>(matcher);
		metricCombo.getSelectionModel().selectFirst();
		getItems().add(metricCombo);
		
		//similarity threshold 
		getItems().add(new Label("      "+StringTable.SIM_TRESHOLD+"  "));
		Label similarityValueLabel = new Label(String.valueOf(THRESHOLD_VALUE));
		similaritySlider = JavaFXBuilder.createSlider(0, 100, THRESHOLD_VALUE);
		
		similaritySlider.valueProperty().addListener((obs, oldval, newVal)->{
			similaritySlider.setValue(Math.round(newVal.doubleValue()));
			similarityValueLabel.setText(String.valueOf(similaritySlider.getValue()));
		});
		getItems().add(similaritySlider);
		getItems().add(new Label("  Value: "));
		getItems().add(similarityValueLabel);
	}
	

	
	private void setDefaultMetric() {
		MetricContainer metric = IECCompareUtil.getDefaultMetric();
		if(metric != null) {
			setMetric(metric);
			metricLabel.setText(metric.getName());
		}
	}
	/**
	 * Returns a list of all registered matcher
	 * @return
	 */
	private ObservableList<AbstractMatcher> getMatcherList() {
		List<Object> objects = RCPContentProvider.getInstanceFromBundle(PPUStringTable.MATCHER_ATTRIBUTE_SYMBOLIC_NAME, PPUStringTable.MATCHER_ATTR_EXTENSION);
		ObservableList<AbstractMatcher> matcher = FXCollections.observableArrayList();
		for(Object obj : objects) {
			if(obj instanceof AbstractMatcher) {
				matcher.add((AbstractMatcher)obj);
			}
		}
		return matcher;
	}
	
	/**
	 * This method returns the similarity threshold, which is between 0 and 1.
	 */
	public Double getThreshold() {
		return similaritySlider.getValue()/100;
	}
	
	public MetricContainer getMetric() {
		return metric;
	}

	public void setMetric(MetricContainer metric) {
		this.metric = metric;
	}

	public AbstractMatcher getMatcher() {
		return metricCombo.getSelectionModel().getSelectedItem();
	}

	public ServiceContainer getServices() {
		return services;
	}

	public void setServices(ServiceContainer services) {
		this.services = services;
	}
}
