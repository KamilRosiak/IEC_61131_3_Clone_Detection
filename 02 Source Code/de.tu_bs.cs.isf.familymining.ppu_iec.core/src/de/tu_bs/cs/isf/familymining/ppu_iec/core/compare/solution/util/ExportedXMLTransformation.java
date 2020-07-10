package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.util;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class ExportedXMLTransformation {

        public static void transform(String path) {
                try {
                        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                        Document doc = docBuilder.parse(path);
                        
                        Node sourceVariant = doc.getElementsByTagName("sourceVariant").item(0);
                        NamedNodeMap sourceVariantMap = sourceVariant.getAttributes();
                        Node nodeAttrSource = sourceVariantMap.getNamedItem("identifier");
                        
                        Node targetVariant = doc.getElementsByTagName("targetVariant").item(0);
                        NamedNodeMap targetVariantMap = targetVariant.getAttributes();
                        Node nodeAttrTarget = targetVariantMap.getNamedItem("identifier");

                        String sourceVariantIdentifier = nodeAttrSource.getTextContent();
                        String targetVariantIdentifier = nodeAttrTarget.getTextContent();

                        

                        changeTagName(doc, "sourceVariant", "variant");
                        changeTagName(doc, "targetVariant", "variant");
                        
                        addAttribute(doc, "sourceElement", "origin", sourceVariantIdentifier);
                        addAttribute(doc, "targetElement", "origin", targetVariantIdentifier);
                        
                        changeTagName(doc, "sourceElement", "element");
                        changeTagName(doc, "targetElement", "element");

                        

                        // write the content into xml file

                        TransformerFactory transformerFactory = TransformerFactory.newInstance();
                        Transformer transformer = transformerFactory.newTransformer();

                        DOMSource source = new DOMSource(doc);
                        StreamResult result = new StreamResult(new File(path));
                        transformer.transform(source, result);


                } catch (ParserConfigurationException pce) {
                        pce.printStackTrace();
                } catch (TransformerException tfe) {
                        tfe.printStackTrace();
                } catch (IOException ioe) {
                        ioe.printStackTrace();
                } catch (SAXException sae) {
                        sae.printStackTrace();
                }

        }

        

        private static void addAttribute(Document doc, String fromTag, String attrTag, String attrValue) {

                NodeList nodes = doc.getElementsByTagName(fromTag);

                for (int i = 0; i < nodes.getLength(); i++) {
                        Attr attr = doc.createAttribute(attrTag);
                        attr.setTextContent(attrValue);
	                if (nodes.item(i) instanceof Element) {
	                    Element elem = (Element)nodes.item(i);
	                    elem.setAttributeNode(attr);
	                }
            }
        }

        public static void changeTagName(Document doc, String fromTag, String toTag) {
            NodeList nodes = doc.getElementsByTagName(fromTag);
            for (int i = 0; i < nodes.getLength(); i++) {
                if (nodes.item(i) instanceof Element) {
                    Element elem = (Element)nodes.item(i);
                    doc.renameNode(elem, elem.getNamespaceURI(), toTag);
                }
            }
        }

}
