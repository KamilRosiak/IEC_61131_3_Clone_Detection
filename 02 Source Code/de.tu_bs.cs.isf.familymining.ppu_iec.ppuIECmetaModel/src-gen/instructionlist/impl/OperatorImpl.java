/**
 */
package instructionlist.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Standard_Operator;

import instructionlist.FunctionCall;
import instructionlist.IL_Modifier;
import instructionlist.InstructionListPackage;
import instructionlist.Operator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link instructionlist.impl.OperatorImpl#getType <em>Type</em>}</li>
 *   <li>{@link instructionlist.impl.OperatorImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link instructionlist.impl.OperatorImpl#getFunctioncall <em>Functioncall</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatorImpl extends MinimalEObjectImpl.Container implements Operator {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Standard_Operator TYPE_EDEFAULT = Standard_Operator.UNSET;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Standard_Operator type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected static final IL_Modifier MODIFIER_EDEFAULT = IL_Modifier.UNSET;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected IL_Modifier modifier = MODIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunctioncall() <em>Functioncall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctioncall()
	 * @generated
	 * @ordered
	 */
	protected FunctionCall functioncall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstructionListPackage.Literals.OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Standard_Operator getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Standard_Operator newType) {
		Standard_Operator oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionListPackage.OPERATOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IL_Modifier getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifier(IL_Modifier newModifier) {
		IL_Modifier oldModifier = modifier;
		modifier = newModifier == null ? MODIFIER_EDEFAULT : newModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionListPackage.OPERATOR__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionCall getFunctioncall() {
		return functioncall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctioncall(FunctionCall newFunctioncall, NotificationChain msgs) {
		FunctionCall oldFunctioncall = functioncall;
		functioncall = newFunctioncall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstructionListPackage.OPERATOR__FUNCTIONCALL, oldFunctioncall, newFunctioncall);
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
	public void setFunctioncall(FunctionCall newFunctioncall) {
		if (newFunctioncall != functioncall) {
			NotificationChain msgs = null;
			if (functioncall != null)
				msgs = ((InternalEObject)functioncall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstructionListPackage.OPERATOR__FUNCTIONCALL, null, msgs);
			if (newFunctioncall != null)
				msgs = ((InternalEObject)newFunctioncall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstructionListPackage.OPERATOR__FUNCTIONCALL, null, msgs);
			msgs = basicSetFunctioncall(newFunctioncall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstructionListPackage.OPERATOR__FUNCTIONCALL, newFunctioncall, newFunctioncall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstructionListPackage.OPERATOR__FUNCTIONCALL:
				return basicSetFunctioncall(null, msgs);
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
			case InstructionListPackage.OPERATOR__TYPE:
				return getType();
			case InstructionListPackage.OPERATOR__MODIFIER:
				return getModifier();
			case InstructionListPackage.OPERATOR__FUNCTIONCALL:
				return getFunctioncall();
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
			case InstructionListPackage.OPERATOR__TYPE:
				setType((Standard_Operator)newValue);
				return;
			case InstructionListPackage.OPERATOR__MODIFIER:
				setModifier((IL_Modifier)newValue);
				return;
			case InstructionListPackage.OPERATOR__FUNCTIONCALL:
				setFunctioncall((FunctionCall)newValue);
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
			case InstructionListPackage.OPERATOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case InstructionListPackage.OPERATOR__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case InstructionListPackage.OPERATOR__FUNCTIONCALL:
				setFunctioncall((FunctionCall)null);
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
			case InstructionListPackage.OPERATOR__TYPE:
				return type != TYPE_EDEFAULT;
			case InstructionListPackage.OPERATOR__MODIFIER:
				return modifier != MODIFIER_EDEFAULT;
			case InstructionListPackage.OPERATOR__FUNCTIONCALL:
				return functioncall != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", modifier: ");
		result.append(modifier);
		result.append(')');
		return result.toString();
	}

} //OperatorImpl
