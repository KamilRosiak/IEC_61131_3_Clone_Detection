/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LLElementStatus;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.LadderDiagramPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LL Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.impl.LLElementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.ladderdiagram.impl.LLElementImpl#getLabeledVariable <em>Labeled Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LLElementImpl extends AbstractTransitElementImpl implements LLElement {
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
	protected LLElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LadderDiagramPackage.Literals.LL_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LadderDiagramPackage.LL_ELEMENT__STATUS, oldStatus, status));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LadderDiagramPackage.LL_ELEMENT__LABELED_VARIABLE, oldLabeledVariable, newLabeledVariable);
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
				msgs = ((InternalEObject)labeledVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LadderDiagramPackage.LL_ELEMENT__LABELED_VARIABLE, null, msgs);
			if (newLabeledVariable != null)
				msgs = ((InternalEObject)newLabeledVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LadderDiagramPackage.LL_ELEMENT__LABELED_VARIABLE, null, msgs);
			msgs = basicSetLabeledVariable(newLabeledVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LadderDiagramPackage.LL_ELEMENT__LABELED_VARIABLE, newLabeledVariable, newLabeledVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LadderDiagramPackage.LL_ELEMENT__LABELED_VARIABLE:
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
			case LadderDiagramPackage.LL_ELEMENT__STATUS:
				return getStatus();
			case LadderDiagramPackage.LL_ELEMENT__LABELED_VARIABLE:
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
			case LadderDiagramPackage.LL_ELEMENT__STATUS:
				setStatus((LLElementStatus)newValue);
				return;
			case LadderDiagramPackage.LL_ELEMENT__LABELED_VARIABLE:
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
			case LadderDiagramPackage.LL_ELEMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case LadderDiagramPackage.LL_ELEMENT__LABELED_VARIABLE:
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
			case LadderDiagramPackage.LL_ELEMENT__STATUS:
				return status != STATUS_EDEFAULT;
			case LadderDiagramPackage.LL_ELEMENT__LABELED_VARIABLE:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //LLElementImpl
