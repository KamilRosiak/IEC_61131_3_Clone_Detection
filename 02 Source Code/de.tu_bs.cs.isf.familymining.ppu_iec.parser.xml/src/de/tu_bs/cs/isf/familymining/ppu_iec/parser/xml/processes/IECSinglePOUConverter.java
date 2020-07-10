package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.processes;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.MODEL_INSTANCE_EXTENSION;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODECALLBACK_SINGLE_POU_EXTENSION_ID;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.PARSER_EXTENSION_ID;
import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.PARSER_PROCESS_SINGLE_POU_EXTENSION_ID;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.INodeCallback;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.IParser;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserType;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.abstracts.AbstractParserProcess;

public class IECSinglePOUConverter extends AbstractParserProcess<Configuration> {

	public IECSinglePOUConverter() {
		super(PARSER_PROCESS_SINGLE_POU_EXTENSION_ID);
	}
	
	@Override
	protected Configuration parse(Path xmlFile) throws IOException {
		try {
			IParser xmlParser = getParserFactory().createParser(PARSER_EXTENSION_ID, null);
			INodeCallback singlePOUCallback = getParserFactory().createNodeCallable(NODECALLBACK_SINGLE_POU_EXTENSION_ID);			
			xmlParser.removeAllNodeCallables();	
			xmlParser.addNodeCallable(singlePOUCallback);
			
			// start parser and store result in for the corresponding scenario map
			String xmlString = getFileContent(xmlFile, StandardCharsets.UTF_8);
			xmlParser.parse(xmlString);
			
			// store the output path and scenario object
			Configuration configurationModel = (Configuration) singlePOUCallback.getResult();
			return configurationModel;
		} catch (CoreException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	protected String getModelFilename(Configuration modelInstance) {
		return null;
	}

	@Override
	public List<String> getCompatibleFileFormats() {
		return Arrays.asList(ParserType.XML.getExtension());
	}

	@Override
	public String getOutputFileFormat() {
		return MODEL_INSTANCE_EXTENSION;
	}

	@Override
	public ParserType getType() {
		return ParserType.XML;
	}

}
