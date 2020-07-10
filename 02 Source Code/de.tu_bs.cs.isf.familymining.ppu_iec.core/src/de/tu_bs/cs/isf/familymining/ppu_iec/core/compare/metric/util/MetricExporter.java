package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.util;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonTarget;
import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.ladder_diagram.templates.AbstractLDLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.structured_text.templates.AbstractSTLangAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.string_table.CMStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.AbstractAttribute;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;

/**
 * This class transforms a metric to a ecore instance an supports exporting into a XML file .
 * @author {Kamil Rosiak}
 */
public class MetricExporter {
	private MetricContainer metricContainer;
	private ComparisonMetricFactory compFactory;
	
	public MetricExporter(MetricContainer metric) {
		this.metricContainer = metric;
		initialiaze();
	}
	/**
	 * Initialize the ecore content.
	 */
	private void initialiaze() {
		// Initialize the model
		ComparisonMetricPackage.eINSTANCE.eClass();
		compFactory = ComparisonMetricFactory.eINSTANCE;
	}
	
	/**
	 * This method returns the ecore representation of a metricContainer.
	 */
	public Metric transformMetric() {
		Metric ecoreMetric = compFactory.createMetric();
		ecoreMetric.setName(metricContainer.getName());
		ecoreMetric.setDescription(metricContainer.getConfigurationDescription());
		ecoreMetric.setIsWeighted(metricContainer.isWeighted());
		//Project
		ecoreMetric.getComparisonattribute().add(buildProjectAttrs());
		//POUAttributes
		ecoreMetric.getComparisonattribute().add(buildPOUAttrs());
		//ImplementationAttributes
		ecoreMetric.getComparisonattribute().add(buildImplementationAttrs());
		//VariableAttributes
		ecoreMetric.getComparisonattribute().add(buildVariableAttr());
		return ecoreMetric;
	}
	
	/**
	 * This method builds the content for projects.
	 */
	private ComparisonAttribute buildProjectAttrs() {
		ComparisonAttribute projectAttributes = compFactory.createComparisonAttribute();
		projectAttributes.setLabel(CMStringTable.PROJECT_CONTAINER_NAME);
		projectAttributes.setDescription(CMStringTable.CONTAINER_TYPE);
		projectAttributes.setIsOption(metricContainer.isModelCompare());
		projectAttributes.setWeight(metricContainer.getModelImplementationOptionAttr().getWeight());
		
		//ModelImplementationOption
		ComparisonAttribute modelImplOption = compFactory.createComparisonAttribute();
		modelImplOption.setLabel(CMStringTable.PROJECT_IMPL_OPTION);
		modelImplOption.setDescription(CMStringTable.PROJECT_IMPL_OPTION_DESC);
		modelImplOption.setIsOption(metricContainer.isModelImplementationOption());
		modelImplOption.setWeight(metricContainer.getModelImplementationOptionAttr().getWeight());
		modelImplOption.setParentAttribute(projectAttributes);
		projectAttributes.getChildAttributes().add(modelImplOption);
				
		//ModelVariableOption
		ComparisonAttribute modelVarOption = compFactory.createComparisonAttribute();
		modelVarOption.setLabel(CMStringTable.PROJECT_VAR_OPTION);
		modelVarOption.setDescription(CMStringTable.PROJECT_VAR_OPTION_DESC);
		modelVarOption.setIsOption(metricContainer.isModelVariableOption());
		modelVarOption.setWeight(metricContainer.getModelVariableOptionAttr().getWeight());
		modelVarOption.setParentAttribute(projectAttributes);
		projectAttributes.getChildAttributes().add(modelVarOption);
		
		//Add Project Attributes
		buildAttrs(projectAttributes, metricContainer.getModelAttributs(),ComparisonTarget.VARIANT);
		return projectAttributes;
	}
	
	/**
	 * This method builds the content for POUs.
	 */
	private ComparisonAttribute buildPOUAttrs() {
		ComparisonAttribute pouAttributes = compFactory.createComparisonAttribute();
		pouAttributes.setLabel(CMStringTable.POU_CONTAINER_NAME);
		pouAttributes.setDescription(CMStringTable.CONTAINER_TYPE);
		pouAttributes.setIsOption(metricContainer.isPOUCompare());
		pouAttributes.setWeight(metricContainer.getPouOptionAttr().getWeight());
		
		//ADD Options
		ComparisonAttribute pouImplOption = compFactory.createComparisonAttribute();
		pouImplOption.setLabel(CMStringTable.POU_IMPL_OPTION);
		pouImplOption.setDescription(CMStringTable.POU_IMPL_OPTION_DESC);
		pouImplOption.setIsOption(metricContainer.isPOUImplementationOption());
		pouImplOption.setWeight(metricContainer.getPouOptionAttr().getWeight());
		pouImplOption.setParentAttribute(pouAttributes);
		pouAttributes.getChildAttributes().add(pouImplOption);
		
		ComparisonAttribute pouVarOption = compFactory.createComparisonAttribute();
		pouVarOption.setLabel(CMStringTable.POU_VAR_OPTION);
		pouVarOption.setDescription(CMStringTable.POU_IMPL_OPTION_DESC);
		pouVarOption.setIsOption(metricContainer.isPOUVariableOption());
		pouVarOption.setWeight(metricContainer.getPouVariableOptionAttr().getWeight());
		pouVarOption.setParentAttribute(pouAttributes);
		pouAttributes.getChildAttributes().add(pouVarOption);
		
		ComparisonAttribute pouActionOption = buildActionOption();
		pouAttributes.getChildAttributes().add(pouActionOption);
		pouActionOption.setParentAttribute(pouAttributes);
		
		//Add Project Attributes
		buildAttrs(pouAttributes, metricContainer.getPOUAttributs(), ComparisonTarget.POU);
		return pouAttributes;
	}
	
	/**
	 * This method builds the action option of a MetricContainer
	 */
	private ComparisonAttribute buildActionOption() {
		ComparisonAttribute pouActionOption = compFactory.createComparisonAttribute();
		pouActionOption.setLabel(CMStringTable.POU_ACTION_OPTION);
		pouActionOption.setDescription(CMStringTable.CONTAINER_TYPE);
		pouActionOption.setIsOption(metricContainer.isPOUVariableOption());
		pouActionOption.setWeight(metricContainer.getPouActionAttr().getWeight());
		
		ComparisonAttribute actionImplOption = compFactory.createComparisonAttribute();
		actionImplOption.setLabel(CMStringTable.ACTION_IMPL_OPTION);
		actionImplOption.setDescription(CMStringTable.ACTION_IMPL_OPTION_DESC);
		actionImplOption.setIsOption(metricContainer.isPOUImplementationOption());
		actionImplOption.setWeight(metricContainer.getActionImplementationAttr().getWeight());
		actionImplOption.setParentAttribute(pouActionOption);
		pouActionOption.getChildAttributes().add(actionImplOption);
		
		buildAttrs(pouActionOption, metricContainer.getActionAttributes(), ComparisonTarget.ACTION);
		
		return pouActionOption;
	}
	
	/**
	 * Build the implementation option
	 * @return ComparisonAttribute that contains all implementation attributes of a metric.
	 */
	private ComparisonAttribute buildImplementationAttrs() {
		ComparisonAttribute implAttributes = compFactory.createComparisonAttribute();
		implAttributes.setLabel(CMStringTable.LANGUAGE_CONTAINER_NAME);
		implAttributes.setDescription(CMStringTable.CONTAINER_TYPE);
		implAttributes.setIsOption(metricContainer.isLanguageOption());
		implAttributes.setWeight(metricContainer.getModelImplementationOptionAttr().getWeight());
		
		ComparisonAttribute nestedOption = compFactory.createComparisonAttribute();
		nestedOption.setLabel(CMStringTable.LANGUAGE_NESTED_OPTION);
		nestedOption.setDescription(CMStringTable.LANGUAGE_NESTED_OPTION_DESC);
		nestedOption.setIsOption(metricContainer.isModelImplementationOption());
		implAttributes.getChildAttributes().add(nestedOption);
		nestedOption.setParentAttribute(implAttributes);
		
		List<AbstractSTLangAttribute> stAttrs =  metricContainer.getSTLangAttributes();
		buildAttrs(implAttributes,stAttrs, ComparisonTarget.STRUCTURED_TEXT);
		
		List<AbstractSFCLangAttribute> sfcAttrs =  metricContainer.getSFCLangAttributes();
		buildAttrs(implAttributes,sfcAttrs, ComparisonTarget.SEQUENTIAL_FUNCTION_CHART);
		
		List<AbstractLDLangAttribute> ldAttrs =  metricContainer.getLDLangAttributes();
		buildAttrs(implAttributes, ldAttrs, ComparisonTarget.SEQUENTIAL_FUNCTION_CHART);
		
		return implAttributes;
	}
	
	/**
	 * This method builds the content for Variables.
	 */
	private ComparisonAttribute buildVariableAttr() {
		ComparisonAttribute varAttributes = compFactory.createComparisonAttribute();
		varAttributes.setLabel(CMStringTable.VARIABLE_CONTAINER_NAME);
		varAttributes.setDescription(CMStringTable.CONTAINER_TYPE);
		varAttributes.setIsOption(metricContainer.isVariableCompare());
		varAttributes.setWeight(metricContainer.getModelVariableOptionAttr().getWeight());
		
		buildAttrs(varAttributes, metricContainer.getVariableAttributes(), ComparisonTarget.VARIABLE);
		
		return varAttributes;
	}
	
	/**
	 * This method builds the Attributes.
	 */
	private <K> void buildAttrs(ComparisonAttribute parent, List<K> attrs, ComparisonTarget target) {
		for(K genAttr : attrs) {
			ComparisonAttribute attr = compFactory.createComparisonAttribute();
			AbstractAttribute absAttr = (AbstractAttribute)genAttr;
			attr.setParentAttribute(parent);
			parent.getChildAttributes().add(attr);
			attr.setLabel(absAttr.getAttributeName());
			attr.setDescription(absAttr.getAttributDescription());
			attr.setTargetType(target);
			attr.setWeight(absAttr.getWeight());
			attr.setIsOption(absAttr.isEnabled());
		}
	}
	
	/**
	 * This method exports the metric to XML.
	 */
	public void saveMetricToXmi(String path) {
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("ComparisonMetric", new XMIResourceFactoryImpl());
        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.createResource(URI.createURI(path));
        resource.getContents().add(transformMetric());
        // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
        	RCPMessageProvider.errorMessage("Exporter", "Could not export metric.");
        	e.printStackTrace();
        }
    }
}
