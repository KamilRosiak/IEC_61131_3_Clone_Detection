/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FBDPOU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.FunctionBlockDiagramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FBDPOU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.functionblockdiagram.impl.FBDPOUImpl#getRefPOU <em>Ref POU</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FBDPOUImpl extends FBDElementImpl implements FBDPOU {
	/**
	 * The cached value of the '{@link #getRefPOU() <em>Ref POU</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPOU()
	 * @generated
	 * @ordered
	 */
	protected POU refPOU;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FBDPOUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionBlockDiagramPackage.Literals.FBDPOU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public POU getRefPOU() {
		if (refPOU != null && ((EObject)refPOU).eIsProxy()) {
			InternalEObject oldRefPOU = (InternalEObject)refPOU;
			refPOU = (POU)eResolveProxy(oldRefPOU);
			if (refPOU != oldRefPOU) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionBlockDiagramPackage.FBDPOU__REF_POU, oldRefPOU, refPOU));
			}
		}
		return refPOU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POU basicGetRefPOU() {
		return refPOU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefPOU(POU newRefPOU) {
		POU oldRefPOU = refPOU;
		refPOU = newRefPOU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionBlockDiagramPackage.FBDPOU__REF_POU, oldRefPOU, refPOU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionBlockDiagramPackage.FBDPOU__REF_POU:
				if (resolve) return getRefPOU();
				return basicGetRefPOU();
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
			case FunctionBlockDiagramPackage.FBDPOU__REF_POU:
				setRefPOU((POU)newValue);
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
			case FunctionBlockDiagramPackage.FBDPOU__REF_POU:
				setRefPOU((POU)null);
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
			case FunctionBlockDiagramPackage.FBDPOU__REF_POU:
				return refPOU != null;
		}
		return super.eIsSet(featureID);
	}

} //FBDPOUImpl
