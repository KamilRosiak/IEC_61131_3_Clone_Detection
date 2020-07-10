/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.JumpImpl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.AbstractTransitElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LDJump;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementStatus;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LD Jump</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.impl.LDJumpImpl#getTransitElementType <em>Transit Element Type</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.impl.LDJumpImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.impl.LDJumpImpl#getLabeledVariable <em>Labeled Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LDJumpImpl extends JumpImpl implements LDJump {
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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final LLElementStatus STATUS_EDEFAULT = LLElementStatus.UNDEFINED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected LLElementStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabeledVariable() <em>Labeled Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabeledVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableExpression labeledVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LDJumpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LadderDiagramPackage.Literals.LD_JUMP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LadderDiagramPackage.LD_JUMP__TRANSIT_ELEMENT_TYPE, oldTransitElementType, transitElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LLElementStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(LLElementStatus newStatus) {
		LLElementStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LadderDiagramPackage.LD_JUMP__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableExpression getLabeledVariable() {
		return labeledVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabeledVariable(VariableExpression newLabeledVariable, NotificationChain msgs) {
		VariableExpression oldLabeledVariable = labeledVariable;
		labeledVariable = newLabeledVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LadderDiagramPackage.LD_JUMP__LABELED_VARIABLE, oldLabeledVariable, newLabeledVariable);
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
	public void setLabeledVariable(VariableExpression newLabeledVariable) {
		if (newLabeledVariable != labeledVariable) {
			NotificationChain msgs = null;
			if (labeledVariable != null)
				msgs = ((InternalEObject)labeledVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LadderDiagramPackage.LD_JUMP__LABELED_VARIABLE, null, msgs);
			if (newLabeledVariable != null)
				msgs = ((InternalEObject)newLabeledVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LadderDiagramPackage.LD_JUMP__LABELED_VARIABLE, null, msgs);
			msgs = basicSetLabeledVariable(newLabeledVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LadderDiagramPackage.LD_JUMP__LABELED_VARIABLE, newLabeledVariable, newLabeledVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LadderDiagramPackage.LD_JUMP__LABELED_VARIABLE:
				return basicSetLabeledVariable(null, msgs);
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
			case LadderDiagramPackage.LD_JUMP__TRANSIT_ELEMENT_TYPE:
				return getTransitElementType();
			case LadderDiagramPackage.LD_JUMP__STATUS:
				return getStatus();
			case LadderDiagramPackage.LD_JUMP__LABELED_VARIABLE:
				return getLabeledVariable();
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
			case LadderDiagramPackage.LD_JUMP__TRANSIT_ELEMENT_TYPE:
				setTransitElementType((LLElementType)newValue);
				return;
			case LadderDiagramPackage.LD_JUMP__STATUS:
				setStatus((LLElementStatus)newValue);
				return;
			case LadderDiagramPackage.LD_JUMP__LABELED_VARIABLE:
				setLabeledVariable((VariableExpression)newValue);
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
			case LadderDiagramPackage.LD_JUMP__TRANSIT_ELEMENT_TYPE:
				setTransitElementType(TRANSIT_ELEMENT_TYPE_EDEFAULT);
				return;
			case LadderDiagramPackage.LD_JUMP__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case LadderDiagramPackage.LD_JUMP__LABELED_VARIABLE:
				setLabeledVariable((VariableExpression)null);
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
			case LadderDiagramPackage.LD_JUMP__TRANSIT_ELEMENT_TYPE:
				return transitElementType != TRANSIT_ELEMENT_TYPE_EDEFAULT;
			case LadderDiagramPackage.LD_JUMP__STATUS:
				return status != STATUS_EDEFAULT;
			case LadderDiagramPackage.LD_JUMP__LABELED_VARIABLE:
				return labeledVariable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractTransitElement.class) {
			switch (derivedFeatureID) {
				case LadderDiagramPackage.LD_JUMP__TRANSIT_ELEMENT_TYPE: return LadderDiagramPackage.ABSTRACT_TRANSIT_ELEMENT__TRANSIT_ELEMENT_TYPE;
				default: return -1;
			}
		}
		if (baseClass == LLElement.class) {
			switch (derivedFeatureID) {
				case LadderDiagramPackage.LD_JUMP__STATUS: return LadderDiagramPackage.LL_ELEMENT__STATUS;
				case LadderDiagramPackage.LD_JUMP__LABELED_VARIABLE: return LadderDiagramPackage.LL_ELEMENT__LABELED_VARIABLE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractTransitElement.class) {
			switch (baseFeatureID) {
				case LadderDiagramPackage.ABSTRACT_TRANSIT_ELEMENT__TRANSIT_ELEMENT_TYPE: return LadderDiagramPackage.LD_JUMP__TRANSIT_ELEMENT_TYPE;
				default: return -1;
			}
		}
		if (baseClass == LLElement.class) {
			switch (baseFeatureID) {
				case LadderDiagramPackage.LL_ELEMENT__STATUS: return LadderDiagramPackage.LD_JUMP__STATUS;
				case LadderDiagramPackage.LL_ELEMENT__LABELED_VARIABLE: return LadderDiagramPackage.LD_JUMP__LABELED_VARIABLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //LDJumpImpl
