/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Jump;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Network;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jump</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.JumpImpl#getTargetNetwork <em>Target Network</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.JumpImpl#getJumpLabel <em>Jump Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JumpImpl extends DiagramElementImpl implements Jump {
	/**
	 * The cached value of the '{@link #getTargetNetwork() <em>Target Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNetwork()
	 * @generated
	 * @ordered
	 */
	protected Network targetNetwork;

	/**
	 * The default value of the '{@link #getJumpLabel() <em>Jump Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String JUMP_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJumpLabel() <em>Jump Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJumpLabel()
	 * @generated
	 * @ordered
	 */
	protected String jumpLabel = JUMP_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JumpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.JUMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Network getTargetNetwork() {
		if (targetNetwork != null && ((EObject)targetNetwork).eIsProxy()) {
			InternalEObject oldTargetNetwork = (InternalEObject)targetNetwork;
			targetNetwork = (Network)eResolveProxy(oldTargetNetwork);
			if (targetNetwork != oldTargetNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramPackage.JUMP__TARGET_NETWORK, oldTargetNetwork, targetNetwork));
			}
		}
		return targetNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network basicGetTargetNetwork() {
		return targetNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetNetwork(Network newTargetNetwork) {
		Network oldTargetNetwork = targetNetwork;
		targetNetwork = newTargetNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.JUMP__TARGET_NETWORK, oldTargetNetwork, targetNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJumpLabel() {
		return jumpLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJumpLabel(String newJumpLabel) {
		String oldJumpLabel = jumpLabel;
		jumpLabel = newJumpLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.JUMP__JUMP_LABEL, oldJumpLabel, jumpLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramPackage.JUMP__TARGET_NETWORK:
				if (resolve) return getTargetNetwork();
				return basicGetTargetNetwork();
			case DiagramPackage.JUMP__JUMP_LABEL:
				return getJumpLabel();
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
			case DiagramPackage.JUMP__TARGET_NETWORK:
				setTargetNetwork((Network)newValue);
				return;
			case DiagramPackage.JUMP__JUMP_LABEL:
				setJumpLabel((String)newValue);
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
			case DiagramPackage.JUMP__TARGET_NETWORK:
				setTargetNetwork((Network)null);
				return;
			case DiagramPackage.JUMP__JUMP_LABEL:
				setJumpLabel(JUMP_LABEL_EDEFAULT);
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
			case DiagramPackage.JUMP__TARGET_NETWORK:
				return targetNetwork != null;
			case DiagramPackage.JUMP__JUMP_LABEL:
				return JUMP_LABEL_EDEFAULT == null ? jumpLabel != null : !JUMP_LABEL_EDEFAULT.equals(jumpLabel);
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
		result.append(" (jumpLabel: ");
		result.append(jumpLabel);
		result.append(')');
		return result.toString();
	}

} //JumpImpl
