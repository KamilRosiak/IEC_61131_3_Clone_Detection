package de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.demo;

import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.solution.language.st.implementation.STImplContainer;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.ppu_iec.rcp_e4.EMFModelLoader.impl.EMFModelLoader;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.IMappingNode;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.IPatchEngine;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.impl.DefaultPatchEngine;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.impl.IECComparator;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.patch_engine.util.ModelDifferenceVisualizer;

public class PatchDemo {

	private static final String COMPARE_POU = "Crane";
	private static final String COMPARE_ACTION = "";

	public static void execute(String[] args) {
		// handle user input
		if (args.length != 2) {
			System.out.println("You must provide two argument: <pathToModelA> <pathToModelB>");
			return;
		}
		String pathToModelA = args[0];
		String pathToModelB = args[1];
		try {			
			// load model A
			Configuration configA = loadEMFModel(pathToModelA);
			StructuredText stA = getActionImplementation(configA, COMPARE_POU, COMPARE_ACTION);
			Statement statementA = stA.getStatements().get(0);
			
			// load model B
			Configuration configB = loadEMFModel(pathToModelB);
			StructuredText stB = getActionImplementation(configB, COMPARE_POU, COMPARE_ACTION);
			Statement statementB = stB.getStatements().get(0);
			
			//wrap model elements in container
			STImplContainer container = new STImplContainer(statementA, statementB, null);
			
			// compare elements of model A and B
			IPatchEngine patchEngine = new DefaultPatchEngine(new IECComparator());
			
			IMappingNode diffNode = patchEngine.diff(container);
		
			// visualize the result
			ModelDifferenceVisualizer mdv = new ModelDifferenceVisualizer(configA.getIdentifier(), configB.getIdentifier());
			String comparisonOutput = mdv.buildModelDifference(diffNode);
			System.out.println(comparisonOutput);
			
		} catch(RuntimeException e) {
			e.printStackTrace();
			return;
		}
		
		
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T loadEMFModel(String path) {
		Path filePath = Paths.get(path);
		if (!Files.exists(filePath)) {
			throw new InvalidPathException(path, "The specified path does not exist.");
		}
		
		String extension = getExtension(path);
		EObject loadedModel = EMFModelLoader.load(path, extension);
		return (T) loadedModel;
	}

	private static String getExtension(String path) {
		Path filePath = Paths.get(path);
		if (!Files.exists(filePath)) {
			throw new InvalidPathException(path, "The specified path does not exist.");
		}
		return filePath.getFileName().toString().split("\\.")[1];
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getActionImplementation(Configuration config, String pouId, String actionId) {
		POU pou = findPou(getPous(config), pouId);
		if (actionId.isEmpty()) {
			return (T) pou.getImplementations().get(0);
		} else {
			Action action = findAction(pou.getActions(), actionId);
			return (T) action.getImplementation();			
		}
	}
	
	public static List<POU> getPous(Configuration config) {
		return config.getResources().get(0).getPous();
	}
	
	public static POU findPou(List<POU> pous, String id) {
		return findModelElement(pous, id, (pou) -> pou.getIdentifier().equals(id));
	}
	
	public static Action findAction(List<Action> actions, String id) {
		return findModelElement(actions, id, (action) -> action.getName().equals(id));
	}
	
	private static <T> T findModelElement(List<T> modelElements, String id, Predicate<T> pred) {
		return modelElements.stream()
			.filter(pred)
			.findFirst()
			.orElse(null);
	}
}
