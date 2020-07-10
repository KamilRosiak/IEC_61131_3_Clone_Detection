/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.util;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage
 * @generated
 */
public class FunctionBlockDiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FunctionBlockDiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockDiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = FunctionBlockDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FunctionBlockDiagramPackage.FBD_ELEMENT: {
				FBDElement fbdElement = (FBDElement)theEObject;
				T result = caseFBDElement(fbdElement);
				if (result == null) result = caseDiagramElement(fbdElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionBlockDiagramPackage.FBDPOU: {
				FBDPOU fbdpou = (FBDPOU)theEObject;
				T result = caseFBDPOU(fbdpou);
				if (result == null) result = caseFBDElement(fbdpou);
				if (result == null) result = caseDiagramElement(fbdpou);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionBlockDiagramPackage.STANDARD_FUNCTION: {
				StandardFunction standardFunction = (StandardFunction)theEObject;
				T result = caseStandardFunction(standardFunction);
				if (result == null) result = caseFBDElement(standardFunction);
				if (result == null) result = caseDiagramElement(standardFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionBlockDiagramPackage.STANDARD_FUNCTION_BLOCK: {
				StandardFunctionBlock standardFunctionBlock = (StandardFunctionBlock)theEObject;
				T result = caseStandardFunctionBlock(standardFunctionBlock);
				if (result == null) result = caseFBDElement(standardFunctionBlock);
				if (result == null) result = caseDiagramElement(standardFunctionBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionBlockDiagramPackage.EXECUTION_BLOCK: {
				ExecutionBlock executionBlock = (ExecutionBlock)theEObject;
				T result = caseExecutionBlock(executionBlock);
				if (result == null) result = caseFBDElement(executionBlock);
				if (result == null) result = caseDiagramElement(executionBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FunctionBlockDiagramPackage.FBD_JUMP: {
				FBDJump fbdJump = (FBDJump)theEObject;
				T result = caseFBDJump(fbdJump);
				if (result == null) result = caseJump(fbdJump);
				if (result == null) result = caseFBDElement(fbdJump);
				if (result == null) result = caseDiagramElement(fbdJump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FBD Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FBD Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFBDElement(FBDElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FBDPOU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FBDPOU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFBDPOU(FBDPOU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardFunction(StandardFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Function Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Function Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardFunctionBlock(StandardFunctionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionBlock(ExecutionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FBD Jump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FBD Jump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFBDJump(FBDJump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElement(DiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJump(Jump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FunctionBlockDiagramSwitch
