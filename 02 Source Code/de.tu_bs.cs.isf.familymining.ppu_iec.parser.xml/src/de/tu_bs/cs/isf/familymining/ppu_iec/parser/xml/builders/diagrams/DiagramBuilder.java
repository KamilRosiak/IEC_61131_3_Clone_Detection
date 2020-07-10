package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Diagram;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IModelBuilder;

public abstract class DiagramBuilder implements IModelBuilder<Diagram>{

	private DiagramFactory diagramFactory;
	private Network activeNetwork;
	
	public DiagramBuilder() {
		diagramFactory = DiagramFactory.eINSTANCE;
	}
	
	/**
	 * Constructs an instance of {@link Diagram} or one of its subtypes.
	 * 
	 * @param rootNode
	 */
	abstract public Diagram build(ParserNode rootNode);
	
	/**
	 * Creates {@link Diagram} and sets its type.
	 * 
	 * @param type the chosen type for the diagram
	 * @return new diagram
	 */
	public Diagram createDiagram(DiagramType type) {
		Diagram ladderDiagram = diagramFactory.createDiagram();
		ladderDiagram.setType(type);
		return ladderDiagram;
	}
	
	/**
	 * Returns the currently active network.
	 * Networks are active through the use of either {@link #setActiveNetwork(Network)} or {@link #openNetwork(int, Diagram)}.
	 * 
	 * @return
	 */
	public Network getActiveNetwork() {
		return activeNetwork;
	}
	
	public void setActiveNetwork(Network network) {
		this.activeNetwork = network;
	}
	
	/**
	 * Opens a new network. Initializes the network and sets it as active.
	 * 
	 * @param position network position 
	 * @param diagram the containing diagram
	 * @see #getActiveNetwork(Network)
	 */
	public void openNetwork(int position, Diagram diagram) {
		Network network = newNetwork();
		network.setPosition(position);
		network.setDiagram(diagram);
		diagram.getNetworks().add(network);
		setActiveNetwork(network);
	}
	
	/**
	 * Creates a new instance of {@link Network} or or a subtype. 
	 * Used by {@link #createDiagram(DiagramType)} to create subtyped networks.
	 * 
	 * @return <i>empty</i> instance
	 */
	abstract protected Network newNetwork();
}
