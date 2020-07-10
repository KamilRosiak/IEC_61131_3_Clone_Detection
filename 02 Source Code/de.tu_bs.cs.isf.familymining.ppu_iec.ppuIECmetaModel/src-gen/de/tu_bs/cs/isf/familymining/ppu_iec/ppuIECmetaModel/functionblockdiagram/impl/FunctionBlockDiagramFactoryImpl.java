/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.*;

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
public class FunctionBlockDiagramFactoryImpl extends EFactoryImpl implements FunctionBlockDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FunctionBlockDiagramFactory init() {
		try {
			FunctionBlockDiagramFactory theFunctionBlockDiagramFactory = (FunctionBlockDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(FunctionBlockDiagramPackage.eNS_URI);
			if (theFunctionBlockDiagramFactory != null) {
				return theFunctionBlockDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FunctionBlockDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlockDiagramFactoryImpl() {
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
			case FunctionBlockDiagramPackage.FBD_ELEMENT: return createFBDElement();
			case FunctionBlockDiagramPackage.FBDPOU: return createFBDPOU();
			case FunctionBlockDiagramPackage.STANDARD_FUNCTION: return createStandardFunction();
			case FunctionBlockDiagramPackage.STANDARD_FUNCTION_BLOCK: return createStandardFunctionBlock();
			case FunctionBlockDiagramPackage.EXECUTION_BLOCK: return createExecutionBlock();
			case FunctionBlockDiagramPackage.FBD_JUMP: return createFBDJump();
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
			case FunctionBlockDiagramPackage.FBD_ELEMENT_TYPE:
				return createFBDElementTypeFromString(eDataType, initialValue);
			case FunctionBlockDiagramPackage.STANDARD_FUNCTION_OPERATION:
				return createStandardFunctionOperationFromString(eDataType, initialValue);
			case FunctionBlockDiagramPackage.STANDARD_FUNCTION_BLOCK_OPERATION:
				return createStandardFunctionBlockOperationFromString(eDataType, initialValue);
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
			case FunctionBlockDiagramPackage.FBD_ELEMENT_TYPE:
				return convertFBDElementTypeToString(eDataType, instanceValue);
			case FunctionBlockDiagramPackage.STANDARD_FUNCTION_OPERATION:
				return convertStandardFunctionOperationToString(eDataType, instanceValue);
			case FunctionBlockDiagramPackage.STANDARD_FUNCTION_BLOCK_OPERATION:
				return convertStandardFunctionBlockOperationToString(eDataType, instanceValue);
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
	public FBDElement createFBDElement() {
		FBDElementImpl fbdElement = new FBDElementImpl();
		return fbdElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FBDPOU createFBDPOU() {
		FBDPOUImpl fbdpou = new FBDPOUImpl();
		return fbdpou;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardFunction createStandardFunction() {
		StandardFunctionImpl standardFunction = new StandardFunctionImpl();
		return standardFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardFunctionBlock createStandardFunctionBlock() {
		StandardFunctionBlockImpl standardFunctionBlock = new StandardFunctionBlockImpl();
		return standardFunctionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionBlock createExecutionBlock() {
		ExecutionBlockImpl executionBlock = new ExecutionBlockImpl();
		return executionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FBDJump createFBDJump() {
		FBDJumpImpl fbdJump = new FBDJumpImpl();
		return fbdJump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBDElementType createFBDElementTypeFromString(EDataType eDataType, String initialValue) {
		FBDElementType result = FBDElementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFBDElementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardFunctionOperation createStandardFunctionOperationFromString(EDataType eDataType, String initialValue) {
		StandardFunctionOperation result = StandardFunctionOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStandardFunctionOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardFunctionBlockOperation createStandardFunctionBlockOperationFromString(EDataType eDataType, String initialValue) {
		StandardFunctionBlockOperation result = StandardFunctionBlockOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStandardFunctionBlockOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionBlockDiagramPackage getFunctionBlockDiagramPackage() {
		return (FunctionBlockDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FunctionBlockDiagramPackage getPackage() {
		return FunctionBlockDiagramPackage.eINSTANCE;
	}

} //FunctionBlockDiagramFactoryImpl
