package de.tu_bs.cs.isf.familymining.ppu_iec.core.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Resource;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChart;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.stringtable.E4CStringTable;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPContentProvider;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.util.RCPMessageProvider;
/**
 * This class represents a helper class that counts all model elements and prints it into an csv file.
 * @author {Kamil Rosiak}
 *
 */
public class ModelStatisticsUtil {
	public static int statementCount = 0;
	public static int stepCount = 0;
	public static int transitionCount = 0;
	public static int actionCount = 0;
	public static int pouInput = 0;
	public static int pouOutPut = 0;
	public static int pouLocalVars = 0 ;
	/**
	 * This method creates a csv file and pushes the shows all properties of the selected model. 
	 * @param model
	 */
	public static void printModelStatistics(Configuration model) {
		String fileName =  RCPContentProvider.getCurrentWorkspacePath() + E4CStringTable.MODEL_DIRECTORY+ "/"+model.getIdentifier()+"_statistics."+E4CStringTable.FILE_ENDING_CSV;
		statementCount = 0;
		transitionCount = 0;
		stepCount = 0;
		actionCount = 0;
		pouInput = 0;
		pouOutPut = 0;
		pouLocalVars = 0;
		try (PrintWriter writer = new PrintWriter(new File(fileName))) {
			StringBuilder sb = new StringBuilder();
			sb.append("ModelName");
			sb.append(';');
			sb.append(model.getIdentifier());
			sb.append('\n');
			StringBuilder nestedString = new StringBuilder();
			appendVarInformaion(nestedString, model);
			appendResourceInformation(nestedString, model);
			sb.append("ActionsOverAll: ;" + actionCount);
			sb.append('\n');
			sb.append("StatementsOverAll: ;"+ statementCount);
			sb.append('\n');
			sb.append("StepsOverAll: ;"+ stepCount);
			sb.append('\n');
			sb.append("TransitionOverAll: ;"+ transitionCount);
			sb.append('\n');
			sb.append("InputVarsOverAll: ;"+ pouInput);
			sb.append('\n');
			sb.append("OutputVarsOverAll: ;"+ pouOutPut);
			sb.append('\n');
			sb.append("LocalVarsOverAll: ;"+ pouLocalVars);
			sb.append('\n');
			sb.append(nestedString.toString());
			writer.append(sb.toString());

		} catch (IOException e) {
			RCPMessageProvider.errorMessage("File accsess error","Could not write file "+ fileName);
		}
	}
	
	public static void appendVarInformaion(StringBuilder sb, Configuration model) {
		sb.append("GlobalVariables: ;");
		sb.append(model.getResources().get(0).getGlobalVariables().size());
		sb.append('\n');
	}
	
	public static void appendResourceInformation(StringBuilder sb, Configuration model) {
		sb.append("POUs: ;");
		Resource resource = model.getResources().get(0);
		sb.append(resource.getPous().size());
		sb.append('\n');
		sb.append("POUs");
		sb.append('\n');
		for(POU pou : resource.getPous()) {
			sb.append(';');
			appenPOUInformation(sb, pou);
			sb.append('\n');
		}
		sb.append('\n');
	}
	
	public static void appenPOUInformation(StringBuilder sb, POU pou) {
		sb.append("POU NAME: ;"+pou.getIdentifier());
		sb.append('\n');
		sb.append(";Input Vars: ;" + pou.getDeclaration().getInputVariables().size() +'\n');
		pouInput = pouInput +  pou.getDeclaration().getInputVariables().size();
		sb.append(";Output Vars:; " + pou.getDeclaration().getOutputVariables().size()+'\n');
		pouOutPut = pouOutPut +  pou.getDeclaration().getOutputVariables().size();
		sb.append(";Local Vars: ;" + pou.getDeclaration().getInternalVariables().size()+'\n');
		pouLocalVars = pouLocalVars +  pou.getDeclaration().getInternalVariables().size();
		
		for(LanguageElement le : pou.getImplementations()) {
			appendLanguageInformations(sb, le);
		}
		if(pou.getImplementations().size() == 0) {
			sb.append(";ImplementationLanguage:;");
			sb.append("No Implementation");
		}
		sb.append('\n');
		appenActionInformations(sb,pou);
	}
	
	private static void appenActionInformations(StringBuilder sb, POU pou) {
		sb.append(";Actions: ;"+pou.getActions().size()+"\n");
		actionCount = actionCount + pou.getActions().size();
		for(Action action : pou.getActions()) {		
			sb.append(";ActionName: ;" +action.getName()+"\n");
			appendLanguageInformations(sb, action.getImplementation());
			sb.append('\n');
		}
	}

	public static void appendLanguageInformations(StringBuilder sb , LanguageElement le) {
		sb.append(";ImplementationLanguage:");
		if(le instanceof StructuredText) {
			StructuredText st = (StructuredText)le;
			sb.append(";Structured Text"+ '\n');
			statementCount = statementCount + st.getStatements().size();
			sb.append(";Statements: ;" + st.getStatements().size());
		} else if(le instanceof SequentialFunctionChart) {
			SequentialFunctionChart sfc = (SequentialFunctionChart)le;
			sb.append(";Sequential Function Chart"+ '\n');
			stepCount = stepCount + sfc.getSteps().size();
			sb.append(";Steps: ;" + sfc.getSteps().size() + '\n');
			transitionCount = transitionCount + sfc.getTransitions().size();
			sb.append(";Transition: ;" + sfc.getTransitions().size());
			
		} else {
			
		}
	}
}
