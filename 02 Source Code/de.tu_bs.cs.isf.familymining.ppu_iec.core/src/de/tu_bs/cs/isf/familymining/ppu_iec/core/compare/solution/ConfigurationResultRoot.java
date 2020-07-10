package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.metric.MetricContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.model.ModelCompareContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.interfaces.ISolutionUpdate;
/**
 * This class represents the solution root. It will be created when the compare process starts.
 * @author {Kamil Rosiak}
 */
public class ConfigurationResultRoot implements Serializable, ISolutionUpdate {
	private static final long serialVersionUID = 1465054834329840122L;
	private MetricContainer config;
	private float similarity = 0.00f;
	private List<ModelCompareContainer> children;
	
	public ConfigurationResultRoot(MetricContainer config) {
		this.config = config;
		this.children = new ArrayList<ModelCompareContainer>();
	}
	/**
	 * @return The ConfigurationContainer thats holds all settings and attributes.
	 */
	public MetricContainer getMetric() {
		return config;
	}
	
	public float getSimilarity() {
		return similarity;
	}

	public void setSimilarity(float similarity) {
		this.similarity = similarity;
	}

	public List<ModelCompareContainer> getChildren() {
		return children;
	}

	public void addChildren(ModelCompareContainer modelResult) {
		children.add(modelResult);
	}
	@Override
	public void updateSimilarity() {
		similarity = 0.0f;
		for(ModelCompareContainer container : children) {
				container.updateSimilarity();
				similarity += container.getSimilarity();		
		}
		
		if(!config.isWeighted() && children.size() > 0) {
			similarity = similarity / children.size();
		}
	}
}
