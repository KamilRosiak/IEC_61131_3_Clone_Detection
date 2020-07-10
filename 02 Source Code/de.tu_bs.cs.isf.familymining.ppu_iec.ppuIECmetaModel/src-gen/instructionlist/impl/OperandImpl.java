/**
 */
package instructionlist.impl;

import instructionlist.InstructionListPackage;
import instructionlist.Operand;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instructionlist.impl.OperandImpl#getNextOperand <em>Next Operand</em>}</li>
 *   <li>{@link instructionlist.impl.OperandImpl#getPrevOperand <em>Prev Operand</em>}</li>
 *   <li>{@link instructionlist.impl.OperandImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperandImpl extends MinimalEObjectImpl.Container implements Operand {
	/**
	 * The cached value of the '{@link #getNextOperand() <em>Next Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextOperand()
	 * @generated
	 * @ordered
	 */
	protected Operand nextOperand;

	/**
	 * The cached value of the '{@link #getPrevOperand() <em>Prev Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevOperand()
	 * @generated
	 * @ordered
	 */
	protected Operand prevOperand;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstructionListPackage.Literals.OPERAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operand getNextOperand() {
		if (nextOperand != null && nextOperand.eIsProxy()) {
			InternalEObject oldNextOperand = (InternalEObject)nextOperand;
			nextOperand = (Operand)eResolveProxy(oldNextOperand);
			if (nextOperand != oldNextOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstructionListPackage.OPERAND__NEXT_OPERAND, oldNextOperand, nextOperand));
			}
		}
		return nextOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operand basicGetNextOperand() {
		return nextOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextOperand(Operand newNextOperand) {
		Operand oldNextOperand = nextOperand;
		nextOperand = newNextOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionListPackage.OPERAND__NEXT_OPERAND, oldNextOperand, nextOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operand getPrevOperand() {
		if (prevOperand != null && prevOperand.eIsProxy()) {
			InternalEObject oldPrevOperand = (InternalEObject)prevOperand;
			prevOperand = (Operand)eResolveProxy(oldPrevOperand);
			if (prevOperand != oldPrevOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstructionListPackage.OPERAND__PREV_OPERAND, oldPrevOperand, prevOperand));
			}
		}
		return prevOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operand basicGetPrevOperand() {
		return prevOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrevOperand(Operand newPrevOperand) {
		Operand oldPrevOperand = prevOperand;
		prevOperand = newPrevOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionListPackage.OPERAND__PREV_OPERAND, oldPrevOperand, prevOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionListPackage.OPERAND__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstructionListPackage.OPERAND__NEXT_OPERAND:
				if (resolve) return getNextOperand();
				return basicGetNextOperand();
			case InstructionListPackage.OPERAND__PREV_OPERAND:
				if (resolve) return getPrevOperand();
				return basicGetPrevOperand();
			case InstructionListPackage.OPERAND__LABEL:
				return getLabel();
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
			case InstructionListPackage.OPERAND__NEXT_OPERAND:
				setNextOperand((Operand)newValue);
				return;
			case InstructionListPackage.OPERAND__PREV_OPERAND:
				setPrevOperand((Operand)newValue);
				return;
			case InstructionListPackage.OPERAND__LABEL:
				setLabel((String)newValue);
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
			case InstructionListPackage.OPERAND__NEXT_OPERAND:
				setNextOperand((Operand)null);
				return;
			case InstructionListPackage.OPERAND__PREV_OPERAND:
				setPrevOperand((Operand)null);
				return;
			case InstructionListPackage.OPERAND__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case InstructionListPackage.OPERAND__NEXT_OPERAND:
				return nextOperand != null;
			case InstructionListPackage.OPERAND__PREV_OPERAND:
				return prevOperand != null;
			case InstructionListPackage.OPERAND__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //OperandImpl
