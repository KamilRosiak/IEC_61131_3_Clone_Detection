package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.PARSER_EXTENSION_ID;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserType;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.abstracts.AbstractParser;

public abstract class AbstractXmlParser extends AbstractParser {

	protected Document doc;
	
	public AbstractXmlParser() {
		super(PARSER_EXTENSION_ID);
        doc = null;
	}
	
	@Override
	public ParserType getType() {
		return ParserType.XML;
	}

	protected void loadDOMDocument(String xmlString) throws NullPointerException {		
		if(xmlString == null) {
			throw new NullPointerException("The provided xml string is null.");
		}
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        DocumentBuilder builder;  
        try  
        {  
            builder = factory.newDocumentBuilder();  
            doc = builder.parse(new InputSource(new StringReader(xmlString))); 
        } catch (Exception e) {  
            e.printStackTrace();
            System.err.println(xmlString.substring(0, 20));
            doc = null;
        } 		
	}

}
