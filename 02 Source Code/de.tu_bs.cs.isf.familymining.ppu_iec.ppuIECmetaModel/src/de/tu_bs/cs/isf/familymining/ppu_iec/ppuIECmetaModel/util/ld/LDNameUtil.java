package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.util.ld;


import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.ExecutionBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDPOU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;

public class LDNameUtil {
	
	public static String getName(DiagramElement element) {
		String name = "";
		if (element instanceof Jump) {
			name = "JUMP: "+((Jump) element).getJumpLabel();
		} else if(element instanceof LLElement) {
			LLElement llElement = (LLElement)element;
			name = llElement.getTransitElementType().getName();
			if(llElement.getLabeledVariable() != null) {
				name = name +": "+ buildInnerVarName(llElement.getLabeledVariable());
			} 
		} else if (element instanceof StandardFunctionBlock) {
			StandardFunctionBlock stdBlock = (StandardFunctionBlock)element;
			name = stdBlock.getName();
		} else if (element instanceof ExecutionBlock) {
			name = "EXECUTE BLOCK";
		} else if(element instanceof StandardFunction) {
			name = ((StandardFunction)element).getName();
		} else if(element instanceof FBDPOU){
			name = ((FBDPOU)element).getName();
		}
		return name;
	}
	
	public static String buildInnerVarName(VariableExpression expression) {
		
		if(expression.getInnerVariable() != null) {
			return expression.getSymbol() +"."+buildInnerVarName(expression.getInnerVariable());
		} else {
			return expression.getSymbol();
		}
	}
	
	
}
