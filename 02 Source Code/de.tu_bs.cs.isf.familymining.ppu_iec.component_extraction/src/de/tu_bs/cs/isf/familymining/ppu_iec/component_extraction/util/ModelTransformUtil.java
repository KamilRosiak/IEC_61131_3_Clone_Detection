package de.tu_bs.cs.isf.familymining.ppu_iec.component_extraction.util;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.geometry.planar.Rectangle;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.pou.POUCompareContainer;
import de.tu_bs.cs.isf.familymining.rcp_e4.graph.core.elements.model.GraphEdge;
import de.tu_bs.cs.isf.familymining.rcp_e4.graph.core.elements.model.GraphNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.graph.core.elements.model.SimpleGraph;
import javafx.scene.paint.Color;

public class ModelTransformUtil {
	
	public static SimpleGraph transformGraphModel(List<POUCompareContainer> edgeList) {
		SimpleGraph graph = new SimpleGraph();
		Map<String,GraphNode> nodeMap = new HashMap<String,GraphNode>();
		
		for(POUCompareContainer pouContainer : edgeList) {
			GraphNode first;
			GraphNode second;
			//create a node for the fist and second POU
			if(nodeMap.containsKey(pouContainer.getFirst().getIdentifier())) {
				first = nodeMap.get(pouContainer.getFirst().getIdentifier());
			} else {
				first = createNode(pouContainer.getFirst().getIdentifier(),"", new Rectangle(250,250,10,10), Color.AQUAMARINE);
				nodeMap.put(pouContainer.getFirst().getIdentifier(), first);
				graph.addChildElement(first);
			}
			
			if(nodeMap.containsKey(pouContainer.getSecond().getIdentifier())) {
				second = nodeMap.get(pouContainer.getSecond().getIdentifier());
			} else {
				second = createNode(pouContainer.getSecond().getIdentifier(),"", new Rectangle(250,250,10,10), Color.AQUAMARINE);
				graph.addChildElement(second);
				nodeMap.put(pouContainer.getSecond().getIdentifier(), second);
			}
			if(first != second) {
				//connect nodes 
				GraphEdge edge = new GraphEdge();
				edge.setWeight(Math.round(100.0 * pouContainer.getSimilarity()) / 100.0f);
				edge.connect(first, second);
				graph.getChildElements().add(edge);
			}
		}
		return graph;
	}

	public static GraphNode createNode(String name, String description, Rectangle bounds, Color color) {
		GraphNode node = new GraphNode();
		node.setTitle(name);
		node.setDescription(description);
		node.setBounds(bounds);
		node.setColor(color);
		return node;
	}
}
