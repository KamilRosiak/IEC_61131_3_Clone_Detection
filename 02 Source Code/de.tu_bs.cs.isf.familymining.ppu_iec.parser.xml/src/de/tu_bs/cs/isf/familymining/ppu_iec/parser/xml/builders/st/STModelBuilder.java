package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.st;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_CONTENT_ATTRIBUTE;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_NAME_ATTRIBUTE;

import java.util.NoSuchElementException;

import org.eclipse.core.runtime.CoreException;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.EntireProjectModelBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XmlDomUtility;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.INodeCallback;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.IParser;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IParserFactory;

public class STModelBuilder {

	private final static String STRUCTURED_TEXT_PARSER_ID = "STParser";
	
	private IParserFactory _parserFactory;

	public STModelBuilder(IParserFactory parserFactory) {
		_parserFactory = parserFactory;
	}

	public StructuredText buildStructuredText(ParserNode STNode, String label) {
		if (STNode.get(NODE_NAME_ATTRIBUTE).equals("ST")) {
			// get xhtml node
			ParserNode xhtmlNode = XmlDomUtility.getChildOf(STNode, "xhtml");  			
			try {
				// get text of xhtml tag
				String structuredTextString = xhtmlNode.get(NODE_CONTENT_ATTRIBUTE);
				if (structuredTextString != null && !structuredTextString.isEmpty()) {
					// initialize node callables
					INodeCallback STFillCallable = createSTNodeCallback();
					
					// start another parser pass
					IParser stParser = createSTParser();
					stParser.addNodeCallable(STFillCallable);
					stParser.parse(structuredTextString);
	
					// get the resulting structured text model instance
					StructuredText STModelInstance = getStructuredTextResult(STFillCallable);
					STModelInstance.setLabel(label);
					STModelInstance.setText(structuredTextString);
					STModelInstance.setParentElement(null);
					return STModelInstance;
				}
				return null;
			} catch (NullPointerException | NoSuchElementException | CoreException e) {
				e.printStackTrace();
				return null;
			}
		} else {
			throw new IllegalArgumentException(EntireProjectModelBuilder.illegalTagMessage(STNode));
		}
	}
	
	private INodeCallback createSTNodeCallback() throws CoreException {
		INodeCallback STFillCallable = _parserFactory.createNodeCallable("STNodeCallback");
		if (STFillCallable == null) throw new NullPointerException("NodeCallback for STParser is null");
		return STFillCallable;
	}
	
	private IParser createSTParser() throws CoreException {
		return _parserFactory.createParser(STRUCTURED_TEXT_PARSER_ID, null);
	}

	private StructuredText getStructuredTextResult(INodeCallback STFillCallable) {
		StructuredText STModelInstance = (StructuredText) STFillCallable.getResult();
		if (STModelInstance != null) {
			return STModelInstance;
		} else {
			throw new NullPointerException("Structured Text Instance is null");			
		}
	}
}
