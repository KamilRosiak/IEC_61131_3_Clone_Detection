package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_NAME_ATTRIBUTE;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;

public class XmlDomUtility {

	/**
	 * Gets first child of the parameter node with the specified name.
	 * 
	 * @param n
	 * @param childTagName
	 * @return child node or null, if no child with that tag name exists
	 */
	public static Node getChildOf(Node n, String childTagName) {
		NodeList taskChildren = n.getChildNodes();
    	for (int i = 0; i < taskChildren.getLength(); i++) {
    		Node child = taskChildren.item(i);
    		if (child.getNodeName().equalsIgnoreCase(childTagName)) {
    			return child;
    		}
    	}
    	return null;
	}
	
	/**
	 * Gets first child of the parameter node with the specified name.
	 * 
	 * @param node
	 * @param childTagName
	 * @return child node or null, if no child with that tag name exists
	 */
	public static ParserNode getChildOf(ParserNode node, String childTagName) {
		for (ParserNode child : node.getChildren()) {
			if (child.get(NODE_NAME_ATTRIBUTE).equals(childTagName)) {
				return child;
			}
		}
		return null;
	}
	
	/**
	 * Returns the text content of the parameter node.
	 *  
	 * @param n
	 * @return the text content or null, if the node text is not available or empty
	 */
	public static String getTextContentOf(Node n) {
        if (!n.hasChildNodes()) return null;
          
        for (int i = 0; i < n.getChildNodes().getLength(); i++) {
        	Node child = n.getChildNodes().item(i);
        	if (child.getNodeType() == Node.TEXT_NODE && child.hasChildNodes() == false && 
               	child.getTextContent().trim().length() > 0) {
               	return child.getTextContent();
        	}
        }
        return null;
    }
	
	/**
	 * Gets the attribute value from an attribute map with corresponding key.
	 * 
	 * @param attributes
	 * @param key
	 * @return value for that key or null, if attributes is null or if there is no value for that key
	 */
	public static String getValueFromAttr(NamedNodeMap attributes, String key) {
		if (attributes != null && attributes.getNamedItem(key) != null) {
			return attributes.getNamedItem(key).getNodeValue();
		} else {
			return null;
		}
	}
}
