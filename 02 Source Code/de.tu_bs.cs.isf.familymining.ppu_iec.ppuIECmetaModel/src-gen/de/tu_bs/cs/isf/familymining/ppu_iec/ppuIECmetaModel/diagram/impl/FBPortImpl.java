/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.DiagramPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.FBPort;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FB Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.FBPortImpl#getPortVariable <em>Port Variable</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.FBPortImpl#isNegated <em>Negated</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.FBPortImpl#getAssignedValue <em>Assigned Value</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.diagram.impl.FBPortImpl#isConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FBPortImpl extends PortImpl implements FBPort {
	/**
	 * The cached value of the '{@link #getPortVariable() <em>Port Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableExpression portVariable;

	/**
	 * The default value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected boolean negated = NEGATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignedValue() <em>Assigned Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedValue()
	 * @generated
	 * @ordered
	 */
	protected Expression assignedValue;

	/**
	 * The default value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean connected = CONNECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FBPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.FB_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableExpression getPortVariable() {
		return portVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortVariable(VariableExpression newPortVariable, NotificationChain msgs) {
		VariableExpression oldPortVariable = portVariable;
		portVariable = newPortVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramPackage.FB_PORT__PORT_VARIABLE, oldPortVariable, newPortVariable);
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
	public void setPortVariable(VariableExpression newPortVariable) {
		if (newPortVariable != portVariable) {
			NotificationChain msgs = null;
			if (portVariable != null)
				msgs = ((InternalEObject)portVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.FB_PORT__PORT_VARIABLE, null, msgs);
			if (newPortVariable != null)
				msgs = ((InternalEObject)newPortVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.FB_PORT__PORT_VARIABLE, null, msgs);
			msgs = basicSetPortVariable(newPortVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FB_PORT__PORT_VARIABLE, newPortVariable, newPortVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNegated() {
		return negated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNegated(boolean newNegated) {
		boolean oldNegated = negated;
		negated = newNegated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FB_PORT__NEGATED, oldNegated, negated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getAssignedValue() {
		return assignedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedValue(Expression newAssignedValue, NotificationChain msgs) {
		Expression oldAssignedValue = assignedValue;
		assignedValue = newAssignedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramPackage.FB_PORT__ASSIGNED_VALUE, oldAssignedValue, newAssignedValue);
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
	public void setAssignedValue(Expression newAssignedValue) {
		if (newAssignedValue != assignedValue) {
			NotificationChain msgs = null;
			if (assignedValue != null)
				msgs = ((InternalEObject)assignedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.FB_PORT__ASSIGNED_VALUE, null, msgs);
			if (newAssignedValue != null)
				msgs = ((InternalEObject)newAssignedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.FB_PORT__ASSIGNED_VALUE, null, msgs);
			msgs = basicSetAssignedValue(newAssignedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FB_PORT__ASSIGNED_VALUE, newAssignedValue, newAssignedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConnected() {
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnected(boolean newConnected) {
		boolean oldConnected = connected;
		connected = newConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FB_PORT__CONNECTED, oldConnected, connected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramPackage.FB_PORT__PORT_VARIABLE:
				return basicSetPortVariable(null, msgs);
			case DiagramPackage.FB_PORT__ASSIGNED_VALUE:
				return basicSetAssignedValue(null, msgs);
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
			case DiagramPackage.FB_PORT__PORT_VARIABLE:
				return getPortVariable();
			case DiagramPackage.FB_PORT__NEGATED:
				return isNegated();
			case DiagramPackage.FB_PORT__ASSIGNED_VALUE:
				return getAssignedValue();
			case DiagramPackage.FB_PORT__CONNECTED:
				return isConnected();
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
			case DiagramPackage.FB_PORT__PORT_VARIABLE:
				setPortVariable((VariableExpression)newValue);
				return;
			case DiagramPackage.FB_PORT__NEGATED:
				setNegated((Boolean)newValue);
				return;
			case DiagramPackage.FB_PORT__ASSIGNED_VALUE:
				setAssignedValue((Expression)newValue);
				return;
			case DiagramPackage.FB_PORT__CONNECTED:
				setConnected((Boolean)newValue);
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
			case DiagramPackage.FB_PORT__PORT_VARIABLE:
				setPortVariable((VariableExpression)null);
				return;
			case DiagramPackage.FB_PORT__NEGATED:
				setNegated(NEGATED_EDEFAULT);
				return;
			case DiagramPackage.FB_PORT__ASSIGNED_VALUE:
				setAssignedValue((Expression)null);
				return;
			case DiagramPackage.FB_PORT__CONNECTED:
				setConnected(CONNECTED_EDEFAULT);
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
			case DiagramPackage.FB_PORT__PORT_VARIABLE:
				return portVariable != null;
			case DiagramPackage.FB_PORT__NEGATED:
				return negated != NEGATED_EDEFAULT;
			case DiagramPackage.FB_PORT__ASSIGNED_VALUE:
				return assignedValue != null;
			case DiagramPackage.FB_PORT__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
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
		result.append(" (negated: ");
		result.append(negated);
		result.append(", connected: ");
		result.append(connected);
		result.append(')');
		return result.toString();
	}

} //FBPortImpl
