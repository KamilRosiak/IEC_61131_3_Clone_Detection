package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;

public class XmlParser extends AbstractXmlParser {

	public static final String PARSER_ID = "XmlParser";
	
	private XmlNodeGenerator _parserNodeGenerator;
	
	public XmlParser() {
		super();
	}
	
	public XmlParser(String description) {
		this.description = description;
	}

	@Override
	public void parse(String input) {
        _parserNodeGenerator = new XmlNodeGenerator(); 
        
        loadDOMDocument(input);
        
        Node root = doc.getDocumentElement();
        traverse(root);
        
        finish();
	}
	
    /**
     * get through the xml-file and process each node in the order given by construction
     * 
     * @param xmlNode
     */
    protected void traverse(Node xmlNode) {
		if (xmlNode.getNodeType() == Node.ELEMENT_NODE) {
	    	// distribute ParserNodes to the callback functions
	    	ParserNode node = _parserNodeGenerator.generateNode(xmlNode);
	    	callbacks.forEach(callback -> callback.processNode(node));
	
	    	// get list of children
	    	NodeList nodes = xmlNode.getChildNodes();
	
	    	// recursive calls
			for(int nIndex = 0; nIndex < nodes.getLength(); nIndex++) {
				traverse(nodes.item(nIndex));                
			}
		}
    }
}
