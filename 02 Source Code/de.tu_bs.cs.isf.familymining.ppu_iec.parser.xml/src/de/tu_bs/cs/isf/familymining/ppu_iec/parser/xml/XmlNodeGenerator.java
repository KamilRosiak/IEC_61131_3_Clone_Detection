package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_CONTENT_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_NAME_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_TYPE_ATTRIBUTE;

import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Node;

import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;

public class XmlNodeGenerator {
	private Map<Node, ParserNode> _parserNodeMap = new HashMap<>();
	
	public ParserNode generateNode(Node xmlNode) {
		if (xmlNode == null) throw new NullPointerException("XML node is null");
		
		ParserNode node = new ParserNode();
		node.put(NODE_NAME_ATTRIBUTE, xmlNode.getNodeName())
			.put(NODE_CONTENT_ATTRIBUTE, filterTextContent(xmlNode))
			.put(NODE_TYPE_ATTRIBUTE, xmlNode.getNodeType())
			.setParent(deriveParentNodeFrom(xmlNode));
		for (int i = 0; i < xmlNode.getAttributes().getLength(); i++) {
			Node attrNode = xmlNode.getAttributes().item(i);
			node.put(attrNode.getNodeName(), attrNode.getNodeValue());
		}
		map(xmlNode, node);
		return node;
	}
    
    private String filterTextContent(Node n) {
    	String textContent;
    	if (n.getNodeType() == Node.ELEMENT_NODE && hasChildTextNode(n)) {
			textContent = n.getTextContent().trim();
		} else {
			textContent = "";
		}
		return textContent;
	}

	private boolean hasChildTextNode(Node n) {
		return n.getChildNodes().getLength() == 1 && n.getFirstChild().getNodeType() == Node.TEXT_NODE;
	}
	
	private ParserNode deriveParentNodeFrom(Node xmlNode) {
		if (xmlNode.getParentNode() != null) {
			return _parserNodeMap.get(xmlNode.getParentNode());			
		} else {
			return null;
		}
	}
	
	private void map(Node xmlNode, ParserNode node) {
		_parserNodeMap.put(xmlNode, node);
	}
}
