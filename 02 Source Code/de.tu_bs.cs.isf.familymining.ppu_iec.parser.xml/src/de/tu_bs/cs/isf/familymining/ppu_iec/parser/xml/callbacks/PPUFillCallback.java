package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.callbacks;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODECALLBACK_EXTENSION_ID;

import org.eclipse.emf.ecore.EObject;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.EntireProjectModelBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserType;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.abstracts.AbstractNodeCallback;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IParserFactory;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.impl.DefaultParserFactory;

/**
 * The class acts as a callback class for each traversed node in a DOM model. 
 * It fills an instance of the "configuration" meta model with data from PPU scenarios.
 * 
 * @author Oliver Urbaniak
 *
 */
public class PPUFillCallback extends AbstractNodeCallback {	
	private IParserFactory parserFactory = new DefaultParserFactory();
	private Configuration config = null;
	private ParserNode rootNode = null;
	
	public PPUFillCallback() {
		super(NODECALLBACK_EXTENSION_ID);
	}

	@Override
	public void processNode(ParserNode node) {
		if (!node.hasParent()) {
			rootNode = node;
		}
	}
	
	@Override
	public int postProcessing() {
		EntireProjectModelBuilder configBuilder = new EntireProjectModelBuilder(parserFactory);
		config = configBuilder.buildConfiguration(rootNode);	
		return 0;
	}

	@Override
	public EObject getResult() {
		return config;
	}

	@Override
	public ParserType getType() {
		return ParserType.XML;
	}

}
