/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.StandardFunctionBlockOperation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Function Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.StandardFunctionBlockImpl#getFunctionBlockOperation <em>Function Block Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardFunctionBlockImpl extends FBDElementImpl implements StandardFunctionBlock {
	/**
	 * The default value of the '{@link #getFunctionBlockOperation() <em>Function Block Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionBlockOperation()
	 * @generated
	 * @ordered
	 */
	protected static final StandardFunctionBlockOperation FUNCTION_BLOCK_OPERATION_EDEFAULT = StandardFunctionBlockOperation.UNSET;

	/**
	 * The cached value of the '{@link #getFunctionBlockOperation() <em>Function Block Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionBlockOperation()
	 * @generated
	 * @ordered
	 */
	protected StandardFunctionBlockOperation functionBlockOperation = FUNCTION_BLOCK_OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardFunctionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionBlockDiagramPackage.Literals.STANDARD_FUNCTION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardFunctionBlockOperation getFunctionBlockOperation() {
		return functionBlockOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionBlockOperation(StandardFunctionBlockOperation newFunctionBlockOperation) {
		StandardFunctionBlockOperation oldFunctionBlockOperation = functionBlockOperation;
		functionBlockOperation = newFunctionBlockOperation == null ? FUNCTION_BLOCK_OPERATION_EDEFAULT : newFunctionBlockOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionBlockDiagramPackage.STANDARD_FUNCTION_BLOCK__FUNCTION_BLOCK_OPERATION, oldFunctionBlockOperation, functionBlockOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionBlockDiagramPackage.STANDARD_FUNCTION_BLOCK__FUNCTION_BLOCK_OPERATION:
				return getFunctionBlockOperation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FunctionBlockDiagramPackage.STANDARD_FUNCTION_BLOCK__FUNCTION_BLOCK_OPERATION:
				setFunctionBlockOperation((StandardFunctionBlockOperation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FunctionBlockDiagramPackage.STANDARD_FUNCTION_BLOCK__FUNCTION_BLOCK_OPERATION:
				setFunctionBlockOperation(FUNCTION_BLOCK_OPERATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FunctionBlockDiagramPackage.STANDARD_FUNCTION_BLOCK__FUNCTION_BLOCK_OPERATION:
				return functionBlockOperation != FUNCTION_BLOCK_OPERATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (functionBlockOperation: ");
		result.append(functionBlockOperation);
		result.append(')');
		return result.toString();
	}

} //StandardFunctionBlockImpl
