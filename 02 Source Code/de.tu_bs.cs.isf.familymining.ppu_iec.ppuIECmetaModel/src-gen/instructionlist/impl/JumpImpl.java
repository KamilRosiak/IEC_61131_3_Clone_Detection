/**
 */
package instructionlist.impl;

import instructionlist.InstructionListPackage;
import instructionlist.Jump;
import instructionlist.Network;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link instructionlist.impl.JumpImpl#getTargetNetwork <em>Target Network</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JumpImpl extends InstructionImpl implements Jump {
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
		return InstructionListPackage.Literals.JUMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Network getTargetNetwork() {
		if (targetNetwork != null && targetNetwork.eIsProxy()) {
			InternalEObject oldTargetNetwork = (InternalEObject)targetNetwork;
			targetNetwork = (Network)eResolveProxy(oldTargetNetwork);
			if (targetNetwork != oldTargetNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstructionListPackage.JUMP__TARGET_NETWORK, oldTargetNetwork, targetNetwork));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionListPackage.JUMP__TARGET_NETWORK, oldTargetNetwork, targetNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstructionListPackage.JUMP__TARGET_NETWORK:
				if (resolve) return getTargetNetwork();
				return basicGetTargetNetwork();
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
			case InstructionListPackage.JUMP__TARGET_NETWORK:
				setTargetNetwork((Network)newValue);
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
			case InstructionListPackage.JUMP__TARGET_NETWORK:
				setTargetNetwork((Network)null);
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
			case InstructionListPackage.JUMP__TARGET_NETWORK:
				return targetNetwork != null;
		}
		return super.eIsSet(featureID);
	}

} //JumpImpl
