package de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.builders.diagrams.sfc;

import static de.tu_bs.cs.isf.familymining.ppu_iec.parser.xml.util.XMLStringTable.NODE_NAME_ATTRIBUTE;

import java.util.List;

import org.eclipse.core.runtime.CoreException;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.AbstractAction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChartFactory;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Transition;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.INodeCallback;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.ParserNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IModelBuilder;
import de.tu_bs.cs.isf.familymining.rcp_e4.parser.base.helper.IParserFactory;

public class SFCModelBuilder implements IModelBuilder<SequentialFunctionChart> {

	private final static String SEQUENTIAL_FUNCTION_CHART_PARSER_ID = "SFCParser";
	
	private IParserFactory _parserFactory;
	private SequentialFunctionChartFactory sfcFactory;

	public SFCModelBuilder(IParserFactory parserFactory) {
		_parserFactory = parserFactory;
		sfcFactory = SequentialFunctionChartFactory.eINSTANCE;
	}
	
	@Override
	public SequentialFunctionChart build(ParserNode SFCNode) {
		SequentialFunctionChart sfc = sfcFactory.createSequentialFunctionChart();
		
		for (ParserNode SFCChildNode : SFCNode.getChildren()) {
			switch (name(SFCChildNode)) {
				case "step": {
					Step step = buildStep(SFCChildNode);
				} break;
				case "transition": {
					Transition transition = buildTransition(SFCChildNode);
					
				} break;
				case "inVariable": {
					VariableExpression inputVariable = buildInVariable(SFCChildNode);
				} break;
				case "actionBlock": {
					List<AbstractAction> actions = buildActionBlock(SFCChildNode);
				} break;
				case "jumpStep": {
					Step jumpStep = buildJumpStep(SFCChildNode);
				} break;
				default: {
					throw new RuntimeException();
				}
			}
		}
		return sfc;	
	}
	
	private Step buildStep(ParserNode sFCChildNode) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Transition buildTransition(ParserNode sFCChildNode) {
		// TODO Auto-generated method stub
		return null;
	}

	private VariableExpression buildInVariable(ParserNode sFCChildNode) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private List<AbstractAction> buildActionBlock(ParserNode sFCChildNode) {
		// TODO Auto-generated method stub
		return null;
	}
 
	private Step buildJumpStep(ParserNode sFCChildNode) {
		// TODO Auto-generated method stub
		return null;
	}

	public SequentialFunctionChart buildSequentialFunctionChart(ParserNode SFCNode, String identifier) {	
		// start second parser process
		try { 

			INodeCallback SFCFillCallable = _parserFactory.createNodeCallable("SFCNodeCallback");
			
			if (SFCFillCallable == null) throw new NullPointerException("NodeCallable for SFCParser is null");
			
			
			
			SFCFillCallable.processNode(SFCNode);
			
			// post-process the transitions
			SFCFillCallable.postProcessing();
			
			SequentialFunctionChart SFCModelInstance = (SequentialFunctionChart) SFCFillCallable.getResult();
			if (SFCModelInstance == null) throw new NullPointerException("Sequential Function Chart instance is null");
			SFCModelInstance.setLabel(identifier);
			
			return SFCModelInstance;
		} catch (CoreException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String name(ParserNode node) {
		return node.get(NODE_NAME_ATTRIBUTE);
	}
	
	public static String illegalNodeMessage(ParserNode node) {
		return "the node with the name "+node.get(NODE_NAME_ATTRIBUTE)+" is not expected here.";
		
	}
}
