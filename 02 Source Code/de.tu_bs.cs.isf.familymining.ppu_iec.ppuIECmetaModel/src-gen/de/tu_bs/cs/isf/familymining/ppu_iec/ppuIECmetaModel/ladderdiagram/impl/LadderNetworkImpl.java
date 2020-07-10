/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.NetworkImpl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderNetwork;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ladder Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.impl.LadderNetworkImpl#getLeftPowerRail <em>Left Power Rail</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.impl.LadderNetworkImpl#getRightPowerRail <em>Right Power Rail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LadderNetworkImpl extends NetworkImpl implements LadderNetwork {
	/**
	 * The cached value of the '{@link #getLeftPowerRail() <em>Left Power Rail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftPowerRail()
	 * @generated
	 * @ordered
	 */
	protected LLElement leftPowerRail;

	/**
	 * The cached value of the '{@link #getRightPowerRail() <em>Right Power Rail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightPowerRail()
	 * @generated
	 * @ordered
	 */
	protected LLElement rightPowerRail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LadderNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LadderDiagramPackage.Literals.LADDER_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LLElement getLeftPowerRail() {
		if (leftPowerRail != null && ((EObject)leftPowerRail).eIsProxy()) {
			InternalEObject oldLeftPowerRail = (InternalEObject)leftPowerRail;
			leftPowerRail = (LLElement)eResolveProxy(oldLeftPowerRail);
			if (leftPowerRail != oldLeftPowerRail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LadderDiagramPackage.LADDER_NETWORK__LEFT_POWER_RAIL, oldLeftPowerRail, leftPowerRail));
			}
		}
		return leftPowerRail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLElement basicGetLeftPowerRail() {
		return leftPowerRail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftPowerRail(LLElement newLeftPowerRail) {
		LLElement oldLeftPowerRail = leftPowerRail;
		leftPowerRail = newLeftPowerRail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LadderDiagramPackage.LADDER_NETWORK__LEFT_POWER_RAIL, oldLeftPowerRail, leftPowerRail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LLElement getRightPowerRail() {
		if (rightPowerRail != null && ((EObject)rightPowerRail).eIsProxy()) {
			InternalEObject oldRightPowerRail = (InternalEObject)rightPowerRail;
			rightPowerRail = (LLElement)eResolveProxy(oldRightPowerRail);
			if (rightPowerRail != oldRightPowerRail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LadderDiagramPackage.LADDER_NETWORK__RIGHT_POWER_RAIL, oldRightPowerRail, rightPowerRail));
			}
		}
		return rightPowerRail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLElement basicGetRightPowerRail() {
		return rightPowerRail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightPowerRail(LLElement newRightPowerRail) {
		LLElement oldRightPowerRail = rightPowerRail;
		rightPowerRail = newRightPowerRail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LadderDiagramPackage.LADDER_NETWORK__RIGHT_POWER_RAIL, oldRightPowerRail, rightPowerRail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LadderDiagramPackage.LADDER_NETWORK__LEFT_POWER_RAIL:
				if (resolve) return getLeftPowerRail();
				return basicGetLeftPowerRail();
			case LadderDiagramPackage.LADDER_NETWORK__RIGHT_POWER_RAIL:
				if (resolve) return getRightPowerRail();
				return basicGetRightPowerRail();
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
			case LadderDiagramPackage.LADDER_NETWORK__LEFT_POWER_RAIL:
				setLeftPowerRail((LLElement)newValue);
				return;
			case LadderDiagramPackage.LADDER_NETWORK__RIGHT_POWER_RAIL:
				setRightPowerRail((LLElement)newValue);
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
			case LadderDiagramPackage.LADDER_NETWORK__LEFT_POWER_RAIL:
				setLeftPowerRail((LLElement)null);
				return;
			case LadderDiagramPackage.LADDER_NETWORK__RIGHT_POWER_RAIL:
				setRightPowerRail((LLElement)null);
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
			case LadderDiagramPackage.LADDER_NETWORK__LEFT_POWER_RAIL:
				return leftPowerRail != null;
			case LadderDiagramPackage.LADDER_NETWORK__RIGHT_POWER_RAIL:
				return rightPowerRail != null;
		}
		return super.eIsSet(featureID);
	}

} //LadderNetworkImpl
