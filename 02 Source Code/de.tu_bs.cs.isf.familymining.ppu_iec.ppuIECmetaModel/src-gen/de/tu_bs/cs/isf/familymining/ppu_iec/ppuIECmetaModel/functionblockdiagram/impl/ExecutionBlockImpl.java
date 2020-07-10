/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.ExecutionBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.ExecutionBlockImpl#getExecutionStatements <em>Execution Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionBlockImpl extends FBDElementImpl implements ExecutionBlock {
	/**
	 * The cached value of the '{@link #getExecutionStatements() <em>Execution Statements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionStatements()
	 * @generated
	 * @ordered
	 */
	protected StructuredText executionStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionBlockDiagramPackage.Literals.EXECUTION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuredText getExecutionStatements() {
		return executionStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionStatements(StructuredText newExecutionStatements, NotificationChain msgs) {
		StructuredText oldExecutionStatements = executionStatements;
		executionStatements = newExecutionStatements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionBlockDiagramPackage.EXECUTION_BLOCK__EXECUTION_STATEMENTS, oldExecutionStatements, newExecutionStatements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionStatements(StructuredText newExecutionStatements) {
		if (newExecutionStatements != executionStatements) {
			NotificationChain msgs = null;
			if (executionStatements != null)
				msgs = ((InternalEObject)executionStatements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionBlockDiagramPackage.EXECUTION_BLOCK__EXECUTION_STATEMENTS, null, msgs);
			if (newExecutionStatements != null)
				msgs = ((InternalEObject)newExecutionStatements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionBlockDiagramPackage.EXECUTION_BLOCK__EXECUTION_STATEMENTS, null, msgs);
			msgs = basicSetExecutionStatements(newExecutionStatements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionBlockDiagramPackage.EXECUTION_BLOCK__EXECUTION_STATEMENTS, newExecutionStatements, newExecutionStatements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionBlockDiagramPackage.EXECUTION_BLOCK__EXECUTION_STATEMENTS:
				return basicSetExecutionStatements(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionBlockDiagramPackage.EXECUTION_BLOCK__EXECUTION_STATEMENTS:
				return getExecutionStatements();
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
			case FunctionBlockDiagramPackage.EXECUTION_BLOCK__EXECUTION_STATEMENTS:
				setExecutionStatements((StructuredText)newValue);
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
			case FunctionBlockDiagramPackage.EXECUTION_BLOCK__EXECUTION_STATEMENTS:
				setExecutionStatements((StructuredText)null);
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
			case FunctionBlockDiagramPackage.EXECUTION_BLOCK__EXECUTION_STATEMENTS:
				return executionStatements != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutionBlockImpl
