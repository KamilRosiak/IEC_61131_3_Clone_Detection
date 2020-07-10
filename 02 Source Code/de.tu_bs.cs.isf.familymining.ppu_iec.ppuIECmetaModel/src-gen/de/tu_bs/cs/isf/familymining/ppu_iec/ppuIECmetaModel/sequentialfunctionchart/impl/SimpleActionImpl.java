/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChartPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SimpleAction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.SimpleActionImpl#getActionVariable <em>Action Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleActionImpl extends AbstractActionImpl implements SimpleAction {
	/**
	 * The cached value of the '{@link #getActionVariable() <em>Action Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable actionVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequentialFunctionChartPackage.Literals.SIMPLE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getActionVariable() {
		if (actionVariable != null && ((EObject)actionVariable).eIsProxy()) {
			InternalEObject oldActionVariable = (InternalEObject)actionVariable;
			actionVariable = (Variable)eResolveProxy(oldActionVariable);
			if (actionVariable != oldActionVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequentialFunctionChartPackage.SIMPLE_ACTION__ACTION_VARIABLE, oldActionVariable, actionVariable));
			}
		}
		return actionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetActionVariable() {
		return actionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionVariable(Variable newActionVariable) {
		Variable oldActionVariable = actionVariable;
		actionVariable = newActionVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequentialFunctionChartPackage.SIMPLE_ACTION__ACTION_VARIABLE, oldActionVariable, actionVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SequentialFunctionChartPackage.SIMPLE_ACTION__ACTION_VARIABLE:
				if (resolve) return getActionVariable();
				return basicGetActionVariable();
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
			case SequentialFunctionChartPackage.SIMPLE_ACTION__ACTION_VARIABLE:
				setActionVariable((Variable)newValue);
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
			case SequentialFunctionChartPackage.SIMPLE_ACTION__ACTION_VARIABLE:
				setActionVariable((Variable)null);
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
			case SequentialFunctionChartPackage.SIMPLE_ACTION__ACTION_VARIABLE:
				return actionVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleActionImpl
