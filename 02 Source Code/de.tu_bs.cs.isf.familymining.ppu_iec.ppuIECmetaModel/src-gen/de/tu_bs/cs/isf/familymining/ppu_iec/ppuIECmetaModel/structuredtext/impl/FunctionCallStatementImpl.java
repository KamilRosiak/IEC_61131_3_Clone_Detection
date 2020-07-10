/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.FunctionCallStatement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.FunctionCallExpression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.FunctionCallStatementImpl#getInvokingVariable <em>Invoking Variable</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.FunctionCallStatementImpl#getFunctionCall <em>Function Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCallStatementImpl extends StatementImpl implements FunctionCallStatement {
	/**
	 * The cached value of the '{@link #getInvokingVariable() <em>Invoking Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokingVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableExpression invokingVariable;

	/**
	 * The cached value of the '{@link #getFunctionCall() <em>Function Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionCall()
	 * @generated
	 * @ordered
	 */
	protected FunctionCallExpression functionCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredTextPackage.Literals.FUNCTION_CALL_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableExpression getInvokingVariable() {
		return invokingVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvokingVariable(VariableExpression newInvokingVariable, NotificationChain msgs) {
		VariableExpression oldInvokingVariable = invokingVariable;
		invokingVariable = newInvokingVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredTextPackage.FUNCTION_CALL_STATEMENT__INVOKING_VARIABLE, oldInvokingVariable, newInvokingVariable);
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
	public void setInvokingVariable(VariableExpression newInvokingVariable) {
		if (newInvokingVariable != invokingVariable) {
			NotificationChain msgs = null;
			if (invokingVariable != null)
				msgs = ((InternalEObject)invokingVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuredTextPackage.FUNCTION_CALL_STATEMENT__INVOKING_VARIABLE, null, msgs);
			if (newInvokingVariable != null)
				msgs = ((InternalEObject)newInvokingVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuredTextPackage.FUNCTION_CALL_STATEMENT__INVOKING_VARIABLE, null, msgs);
			msgs = basicSetInvokingVariable(newInvokingVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredTextPackage.FUNCTION_CALL_STATEMENT__INVOKING_VARIABLE, newInvokingVariable, newInvokingVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionCallExpression getFunctionCall() {
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionCall(FunctionCallExpression newFunctionCall, NotificationChain msgs) {
		FunctionCallExpression oldFunctionCall = functionCall;
		functionCall = newFunctionCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredTextPackage.FUNCTION_CALL_STATEMENT__FUNCTION_CALL, oldFunctionCall, newFunctionCall);
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
	public void setFunctionCall(FunctionCallExpression newFunctionCall) {
		if (newFunctionCall != functionCall) {
			NotificationChain msgs = null;
			if (functionCall != null)
				msgs = ((InternalEObject)functionCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuredTextPackage.FUNCTION_CALL_STATEMENT__FUNCTION_CALL, null, msgs);
			if (newFunctionCall != null)
				msgs = ((InternalEObject)newFunctionCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuredTextPackage.FUNCTION_CALL_STATEMENT__FUNCTION_CALL, null, msgs);
			msgs = basicSetFunctionCall(newFunctionCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredTextPackage.FUNCTION_CALL_STATEMENT__FUNCTION_CALL, newFunctionCall, newFunctionCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredTextPackage.FUNCTION_CALL_STATEMENT__INVOKING_VARIABLE:
				return basicSetInvokingVariable(null, msgs);
			case StructuredTextPackage.FUNCTION_CALL_STATEMENT__FUNCTION_CALL:
				return basicSetFunctionCall(null, msgs);
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
			case StructuredTextPackage.FUNCTION_CALL_STATEMENT__INVOKING_VARIABLE:
				return getInvokingVariable();
			case StructuredTextPackage.FUNCTION_CALL_STATEMENT__FUNCTION_CALL:
				return getFunctionCall();
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
			case StructuredTextPackage.FUNCTION_CALL_STATEMENT__INVOKING_VARIABLE:
				setInvokingVariable((VariableExpression)newValue);
				return;
			case StructuredTextPackage.FUNCTION_CALL_STATEMENT__FUNCTION_CALL:
				setFunctionCall((FunctionCallExpression)newValue);
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
			case StructuredTextPackage.FUNCTION_CALL_STATEMENT__INVOKING_VARIABLE:
				setInvokingVariable((VariableExpression)null);
				return;
			case StructuredTextPackage.FUNCTION_CALL_STATEMENT__FUNCTION_CALL:
				setFunctionCall((FunctionCallExpression)null);
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
			case StructuredTextPackage.FUNCTION_CALL_STATEMENT__INVOKING_VARIABLE:
				return invokingVariable != null;
			case StructuredTextPackage.FUNCTION_CALL_STATEMENT__FUNCTION_CALL:
				return functionCall != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionCallStatementImpl
