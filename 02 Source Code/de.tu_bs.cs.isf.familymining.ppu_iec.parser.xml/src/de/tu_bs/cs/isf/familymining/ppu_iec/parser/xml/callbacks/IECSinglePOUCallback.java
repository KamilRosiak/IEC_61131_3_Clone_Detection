package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.callbacks;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODECALLBACK_SINGLE_POU_EXTENSION_ID;

import de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.SinglePOUModelBuilder;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserType;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.abstracts.AbstractNodeCallback;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IParserFactory;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.impl.DefaultParserFactory;

public class IECSinglePOUCallback extends AbstractNodeCallback {
	private IParserFactory parserFactory = new DefaultParserFactory();
	private Configuration config;
	protected ParserNode rootNode;
	
	public IECSinglePOUCallback() {
		super(NODECALLBACK_SINGLE_POU_EXTENSION_ID);
	}

	@Override
	public void processNode(ParserNode node) {
		if (!node.hasParent()) {
			rootNode = node;
		}
	}

	@Override
	public int postProcessing() {
		SinglePOUModelBuilder modelBuilder = new SinglePOUModelBuilder(parserFactory);
		config = modelBuilder.buildConfiguration(rootNode);
		return 0;
	}

	@Override
	public Object getResult() {
		return config;
	}

	@Override
	public ParserType getType() {
		return ParserType.XML;
	}

}
