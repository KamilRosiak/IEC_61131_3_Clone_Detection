/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.Port;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.PortImpl#getAttachedElement <em>Attached Element</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.PortImpl#getConnectedPorts <em>Connected Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends MinimalEObjectImpl.Container implements Port {
	/**
	 * The cached value of the '{@link #getAttachedElement() <em>Attached Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedElement()
	 * @generated
	 * @ordered
	 */
	protected DiagramElement attachedElement;

	/**
	 * The cached value of the '{@link #getConnectedPorts() <em>Connected Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> connectedPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramElement getAttachedElement() {
		if (attachedElement != null && ((EObject)attachedElement).eIsProxy()) {
			InternalEObject oldAttachedElement = (InternalEObject)attachedElement;
			attachedElement = (DiagramElement)eResolveProxy(oldAttachedElement);
			if (attachedElement != oldAttachedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiagramPackage.PORT__ATTACHED_ELEMENT, oldAttachedElement, attachedElement));
			}
		}
		return attachedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement basicGetAttachedElement() {
		return attachedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachedElement(DiagramElement newAttachedElement) {
		DiagramElement oldAttachedElement = attachedElement;
		attachedElement = newAttachedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.PORT__ATTACHED_ELEMENT, oldAttachedElement, attachedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getConnectedPorts() {
		if (connectedPorts == null) {
			connectedPorts = new EObjectResolvingEList<Port>(Port.class, this, DiagramPackage.PORT__CONNECTED_PORTS);
		}
		return connectedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramPackage.PORT__ATTACHED_ELEMENT:
				if (resolve) return getAttachedElement();
				return basicGetAttachedElement();
			case DiagramPackage.PORT__CONNECTED_PORTS:
				return getConnectedPorts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagramPackage.PORT__ATTACHED_ELEMENT:
				setAttachedElement((DiagramElement)newValue);
				return;
			case DiagramPackage.PORT__CONNECTED_PORTS:
				getConnectedPorts().clear();
				getConnectedPorts().addAll((Collection<? extends Port>)newValue);
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
			case DiagramPackage.PORT__ATTACHED_ELEMENT:
				setAttachedElement((DiagramElement)null);
				return;
			case DiagramPackage.PORT__CONNECTED_PORTS:
				getConnectedPorts().clear();
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
			case DiagramPackage.PORT__ATTACHED_ELEMENT:
				return attachedElement != null;
			case DiagramPackage.PORT__CONNECTED_PORTS:
				return connectedPorts != null && !connectedPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PortImpl
