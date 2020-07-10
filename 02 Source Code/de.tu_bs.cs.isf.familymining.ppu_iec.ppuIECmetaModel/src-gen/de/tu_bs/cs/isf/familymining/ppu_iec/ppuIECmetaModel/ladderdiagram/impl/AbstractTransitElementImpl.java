/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.DiagramElementImpl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.AbstractTransitElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Transit Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.impl.AbstractTransitElementImpl#getTransitElementType <em>Transit Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTransitElementImpl extends DiagramElementImpl implements AbstractTransitElement {
	/**
	 * The default value of the '{@link #getTransitElementType() <em>Transit Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitElementType()
	 * @generated
	 * @ordered
	 */
	protected static final LLElementType TRANSIT_ELEMENT_TYPE_EDEFAULT = LLElementType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getTransitElementType() <em>Transit Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitElementType()
	 * @generated
	 * @ordered
	 */
	protected LLElementType transitElementType = TRANSIT_ELEMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTransitElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LadderDiagramPackage.Literals.ABSTRACT_TRANSIT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LLElementType getTransitElementType() {
		return transitElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitElementType(LLElementType newTransitElementType) {
		LLElementType oldTransitElementType = transitElementType;
		transitElementType = newTransitElementType == null ? TRANSIT_ELEMENT_TYPE_EDEFAULT : newTransitElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LadderDiagramPackage.ABSTRACT_TRANSIT_ELEMENT__TRANSIT_ELEMENT_TYPE, oldTransitElementType, transitElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LadderDiagramPackage.ABSTRACT_TRANSIT_ELEMENT__TRANSIT_ELEMENT_TYPE:
				return getTransitElementType();
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
			case LadderDiagramPackage.ABSTRACT_TRANSIT_ELEMENT__TRANSIT_ELEMENT_TYPE:
				setTransitElementType((LLElementType)newValue);
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
			case LadderDiagramPackage.ABSTRACT_TRANSIT_ELEMENT__TRANSIT_ELEMENT_TYPE:
				setTransitElementType(TRANSIT_ELEMENT_TYPE_EDEFAULT);
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
			case LadderDiagramPackage.ABSTRACT_TRANSIT_ELEMENT__TRANSIT_ELEMENT_TYPE:
				return transitElementType != TRANSIT_ELEMENT_TYPE_EDEFAULT;
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
		result.append(" (TransitElementType: ");
		result.append(transitElementType);
		result.append(')');
		return result.toString();
	}

} //AbstractTransitElementImpl
