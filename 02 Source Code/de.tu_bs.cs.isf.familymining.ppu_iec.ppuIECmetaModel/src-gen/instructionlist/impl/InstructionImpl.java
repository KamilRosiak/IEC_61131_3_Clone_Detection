/**
 */
package instructionlist.impl;

import instructionlist.Instruction;
import instructionlist.InstructionListPackage;
import instructionlist.Operand;
import instructionlist.Operator;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instructionlist.impl.InstructionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link instructionlist.impl.InstructionImpl#getOperands <em>Operands</em>}</li>
 *   <li>{@link instructionlist.impl.InstructionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link instructionlist.impl.InstructionImpl#getNextInstruction <em>Next Instruction</em>}</li>
 *   <li>{@link instructionlist.impl.InstructionImpl#getPrevInstruction <em>Prev Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction {
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator operator;

	/**
	 * The cached value of the '{@link #getOperands() <em>Operands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperands()
	 * @generated
	 * @ordered
	 */
	protected EList<Operand> operands;

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
	 * The cached value of the '{@link #getNextInstruction() <em>Next Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextInstruction()
	 * @generated
	 * @ordered
	 */
	protected Instruction nextInstruction;

	/**
	 * The cached value of the '{@link #getPrevInstruction() <em>Prev Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevInstruction()
	 * @generated
	 * @ordered
	 */
	protected Instruction prevInstruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstructionListPackage.Literals.INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs) {
		Operator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstructionListPackage.INSTRUCTION__OPERATOR, oldOperator, newOperator);
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
	public void setOperator(Operator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstructionListPackage.INSTRUCTION__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstructionListPackage.INSTRUCTION__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionListPackage.INSTRUCTION__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operand> getOperands() {
		if (operands == null) {
			operands = new EObjectContainmentEList<Operand>(Operand.class, this, InstructionListPackage.INSTRUCTION__OPERANDS);
		}
		return operands;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionListPackage.INSTRUCTION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instruction getNextInstruction() {
		if (nextInstruction != null && nextInstruction.eIsProxy()) {
			InternalEObject oldNextInstruction = (InternalEObject)nextInstruction;
			nextInstruction = (Instruction)eResolveProxy(oldNextInstruction);
			if (nextInstruction != oldNextInstruction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstructionListPackage.INSTRUCTION__NEXT_INSTRUCTION, oldNextInstruction, nextInstruction));
			}
		}
		return nextInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction basicGetNextInstruction() {
		return nextInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextInstruction(Instruction newNextInstruction) {
		Instruction oldNextInstruction = nextInstruction;
		nextInstruction = newNextInstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionListPackage.INSTRUCTION__NEXT_INSTRUCTION, oldNextInstruction, nextInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instruction getPrevInstruction() {
		if (prevInstruction != null && prevInstruction.eIsProxy()) {
			InternalEObject oldPrevInstruction = (InternalEObject)prevInstruction;
			prevInstruction = (Instruction)eResolveProxy(oldPrevInstruction);
			if (prevInstruction != oldPrevInstruction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstructionListPackage.INSTRUCTION__PREV_INSTRUCTION, oldPrevInstruction, prevInstruction));
			}
		}
		return prevInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction basicGetPrevInstruction() {
		return prevInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrevInstruction(Instruction newPrevInstruction) {
		Instruction oldPrevInstruction = prevInstruction;
		prevInstruction = newPrevInstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionListPackage.INSTRUCTION__PREV_INSTRUCTION, oldPrevInstruction, prevInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstructionListPackage.INSTRUCTION__OPERATOR:
				return basicSetOperator(null, msgs);
			case InstructionListPackage.INSTRUCTION__OPERANDS:
				return ((InternalEList<?>)getOperands()).basicRemove(otherEnd, msgs);
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
			case InstructionListPackage.INSTRUCTION__OPERATOR:
				return getOperator();
			case InstructionListPackage.INSTRUCTION__OPERANDS:
				return getOperands();
			case InstructionListPackage.INSTRUCTION__LABEL:
				return getLabel();
			case InstructionListPackage.INSTRUCTION__NEXT_INSTRUCTION:
				if (resolve) return getNextInstruction();
				return basicGetNextInstruction();
			case InstructionListPackage.INSTRUCTION__PREV_INSTRUCTION:
				if (resolve) return getPrevInstruction();
				return basicGetPrevInstruction();
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
			case InstructionListPackage.INSTRUCTION__OPERATOR:
				setOperator((Operator)newValue);
				return;
			case InstructionListPackage.INSTRUCTION__OPERANDS:
				getOperands().clear();
				getOperands().addAll((Collection<? extends Operand>)newValue);
				return;
			case InstructionListPackage.INSTRUCTION__LABEL:
				setLabel((String)newValue);
				return;
			case InstructionListPackage.INSTRUCTION__NEXT_INSTRUCTION:
				setNextInstruction((Instruction)newValue);
				return;
			case InstructionListPackage.INSTRUCTION__PREV_INSTRUCTION:
				setPrevInstruction((Instruction)newValue);
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
			case InstructionListPackage.INSTRUCTION__OPERATOR:
				setOperator((Operator)null);
				return;
			case InstructionListPackage.INSTRUCTION__OPERANDS:
				getOperands().clear();
				return;
			case InstructionListPackage.INSTRUCTION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case InstructionListPackage.INSTRUCTION__NEXT_INSTRUCTION:
				setNextInstruction((Instruction)null);
				return;
			case InstructionListPackage.INSTRUCTION__PREV_INSTRUCTION:
				setPrevInstruction((Instruction)null);
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
			case InstructionListPackage.INSTRUCTION__OPERATOR:
				return operator != null;
			case InstructionListPackage.INSTRUCTION__OPERANDS:
				return operands != null && !operands.isEmpty();
			case InstructionListPackage.INSTRUCTION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case InstructionListPackage.INSTRUCTION__NEXT_INSTRUCTION:
				return nextInstruction != null;
			case InstructionListPackage.INSTRUCTION__PREV_INSTRUCTION:
				return prevInstruction != null;
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

} //InstructionImpl
