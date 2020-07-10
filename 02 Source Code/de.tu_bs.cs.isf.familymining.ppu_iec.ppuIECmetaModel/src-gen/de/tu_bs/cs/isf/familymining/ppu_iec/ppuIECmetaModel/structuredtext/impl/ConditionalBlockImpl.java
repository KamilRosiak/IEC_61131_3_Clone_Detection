/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.ConditionalBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ConditionalBlockImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ConditionalBlockImpl#getSubstatements <em>Substatements</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.ConditionalBlockImpl#isElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalBlockImpl extends StatementImpl implements ConditionalBlock {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getSubstatements() <em>Substatements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> substatements;

	/**
	 * The default value of the '{@link #isElse() <em>Else</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELSE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isElse() <em>Else</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElse()
	 * @generated
	 * @ordered
	 */
	protected boolean else_ = ELSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredTextPackage.Literals.CONDITIONAL_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredTextPackage.CONDITIONAL_BLOCK__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuredTextPackage.CONDITIONAL_BLOCK__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuredTextPackage.CONDITIONAL_BLOCK__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredTextPackage.CONDITIONAL_BLOCK__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Statement> getSubstatements() {
		if (substatements == null) {
			substatements = new EObjectContainmentEList<Statement>(Statement.class, this, StructuredTextPackage.CONDITIONAL_BLOCK__SUBSTATEMENTS);
		}
		return substatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElse(boolean newElse) {
		boolean oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredTextPackage.CONDITIONAL_BLOCK__ELSE, oldElse, else_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredTextPackage.CONDITIONAL_BLOCK__CONDITION:
				return basicSetCondition(null, msgs);
			case StructuredTextPackage.CONDITIONAL_BLOCK__SUBSTATEMENTS:
				return ((InternalEList<?>)getSubstatements()).basicRemove(otherEnd, msgs);
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
			case StructuredTextPackage.CONDITIONAL_BLOCK__CONDITION:
				return getCondition();
			case StructuredTextPackage.CONDITIONAL_BLOCK__SUBSTATEMENTS:
				return getSubstatements();
			case StructuredTextPackage.CONDITIONAL_BLOCK__ELSE:
				return isElse();
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
			case StructuredTextPackage.CONDITIONAL_BLOCK__CONDITION:
				setCondition((Expression)newValue);
				return;
			case StructuredTextPackage.CONDITIONAL_BLOCK__SUBSTATEMENTS:
				getSubstatements().clear();
				getSubstatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case StructuredTextPackage.CONDITIONAL_BLOCK__ELSE:
				setElse((Boolean)newValue);
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
			case StructuredTextPackage.CONDITIONAL_BLOCK__CONDITION:
				setCondition((Expression)null);
				return;
			case StructuredTextPackage.CONDITIONAL_BLOCK__SUBSTATEMENTS:
				getSubstatements().clear();
				return;
			case StructuredTextPackage.CONDITIONAL_BLOCK__ELSE:
				setElse(ELSE_EDEFAULT);
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
			case StructuredTextPackage.CONDITIONAL_BLOCK__CONDITION:
				return condition != null;
			case StructuredTextPackage.CONDITIONAL_BLOCK__SUBSTATEMENTS:
				return substatements != null && !substatements.isEmpty();
			case StructuredTextPackage.CONDITIONAL_BLOCK__ELSE:
				return else_ != ELSE_EDEFAULT;
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
		result.append(" (else: ");
		result.append(else_);
		result.append(')');
		return result.toString();
	}

} //ConditionalBlockImpl
