/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LadderDiagramFactoryImpl extends EFactoryImpl implements LadderDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LadderDiagramFactory init() {
		try {
			LadderDiagramFactory theLadderDiagramFactory = (LadderDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(LadderDiagramPackage.eNS_URI);
			if (theLadderDiagramFactory != null) {
				return theLadderDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LadderDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LadderDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LadderDiagramPackage.LL_ELEMENT: return (EObject)createLLElement();
			case LadderDiagramPackage.LADDER_NETWORK: return (EObject)createLadderNetwork();
			case LadderDiagramPackage.LD_JUMP: return (EObject)createLDJump();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LadderDiagramPackage.LL_ELEMENT_TYPE:
				return createLLElementTypeFromString(eDataType, initialValue);
			case LadderDiagramPackage.LL_ELEMENT_STATUS:
				return createLLElementStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LadderDiagramPackage.LL_ELEMENT_TYPE:
				return convertLLElementTypeToString(eDataType, instanceValue);
			case LadderDiagramPackage.LL_ELEMENT_STATUS:
				return convertLLElementStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LLElement createLLElement() {
		LLElementImpl llElement = new LLElementImpl();
		return llElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LadderNetwork createLadderNetwork() {
		LadderNetworkImpl ladderNetwork = new LadderNetworkImpl();
		return ladderNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LDJump createLDJump() {
		LDJumpImpl ldJump = new LDJumpImpl();
		return ldJump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLElementType createLLElementTypeFromString(EDataType eDataType, String initialValue) {
		LLElementType result = LLElementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLLElementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLElementStatus createLLElementStatusFromString(EDataType eDataType, String initialValue) {
		LLElementStatus result = LLElementStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLLElementStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LadderDiagramPackage getLadderDiagramPackage() {
		return (LadderDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LadderDiagramPackage getPackage() {
		return LadderDiagramPackage.eINSTANCE;
	}

} //LadderDiagramFactoryImpl
