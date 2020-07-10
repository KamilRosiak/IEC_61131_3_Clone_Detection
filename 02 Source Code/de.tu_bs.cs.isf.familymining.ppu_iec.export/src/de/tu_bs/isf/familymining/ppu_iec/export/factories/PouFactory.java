package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.PouType;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.Project.Types.Pous.Pou;

/**
 * {@code <pou>..</pou>} factory.
 */
@Creatable
@Singleton
public class PouFactory {

	/**
	 * {@code <interface>..</interface>} factory.
	 */
	@Inject
	public InterfaceFactory interfaceFactory;

	/**
	 * {@code <body>..</body>} factory.
	 */
	@Inject
	public BodyFactory bodyFactory;

	/**
	 * @param pou             Pou.
	 * @param localVariables  List of local variables.
	 * @param inputVariables  List of input variables.
	 * @param outputVariables List of output variables.
	 * @return {@code <pou>..</pou>}.
	 */
	public Pou createPou(POU pou, List<Variable> localVariables, List<Variable> inputVariables,
			List<Variable> outputVariables) {

		Pou pouInstance = new Pou();
		PouType pouType = null;
		switch (pou.getType()) {
		case FUNCTION:
			pouType = PouType.FUNCTION;
			break;
		case FUNCTIONBLOCK:
			pouType = PouType.FUNCTION_BLOCK;
			break;
		case PROGRAM:
			pouType = PouType.PROGRAM;
			break;
		default:
			break;
		}

		pouInstance.setName(pou.getIdentifier());
		pouInstance.setPouType(pouType);
		pouInstance.setInterface(interfaceFactory.createInterface(localVariables, inputVariables, outputVariables));
		pouInstance.getBody().add(bodyFactory.createBody());

		return pouInstance;
	}

}
