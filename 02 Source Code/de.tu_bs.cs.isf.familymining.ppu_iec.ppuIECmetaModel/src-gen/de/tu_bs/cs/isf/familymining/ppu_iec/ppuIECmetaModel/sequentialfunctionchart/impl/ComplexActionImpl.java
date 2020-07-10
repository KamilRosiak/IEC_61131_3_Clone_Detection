/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.ComplexAction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChartPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.ComplexActionImpl#getPouAction <em>Pou Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexActionImpl extends AbstractActionImpl implements ComplexAction {
	/**
	 * The cached value of the '{@link #getPouAction() <em>Pou Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPouAction()
	 * @generated
	 * @ordered
	 */
	protected Action pouAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequentialFunctionChartPackage.Literals.COMPLEX_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action getPouAction() {
		if (pouAction != null && ((EObject)pouAction).eIsProxy()) {
			InternalEObject oldPouAction = (InternalEObject)pouAction;
			pouAction = (Action)eResolveProxy(oldPouAction);
			if (pouAction != oldPouAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequentialFunctionChartPackage.COMPLEX_ACTION__POU_ACTION, oldPouAction, pouAction));
			}
		}
		return pouAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetPouAction() {
		return pouAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPouAction(Action newPouAction) {
		Action oldPouAction = pouAction;
		pouAction = newPouAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequentialFunctionChartPackage.COMPLEX_ACTION__POU_ACTION, oldPouAction, pouAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SequentialFunctionChartPackage.COMPLEX_ACTION__POU_ACTION:
				if (resolve) return getPouAction();
				return basicGetPouAction();
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
			case SequentialFunctionChartPackage.COMPLEX_ACTION__POU_ACTION:
				setPouAction((Action)newValue);
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
			case SequentialFunctionChartPackage.COMPLEX_ACTION__POU_ACTION:
				setPouAction((Action)null);
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
			case SequentialFunctionChartPackage.COMPLEX_ACTION__POU_ACTION:
				return pouAction != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplexActionImpl
