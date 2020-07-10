/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.StructuredTextExpressionPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.VariableExpression;

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
 * An implementation of the model object '<em><b>Variable Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.impl.VariableExpressionImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.impl.VariableExpressionImpl#getArrayIndices <em>Array Indices</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.impl.VariableExpressionImpl#getInnerVariable <em>Inner Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableExpressionImpl extends ExpressionImpl implements VariableExpression {
	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArrayIndices() <em>Array Indices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayIndices()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> arrayIndices;

	/**
	 * The cached value of the '{@link #getInnerVariable() <em>Inner Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableExpression innerVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredTextExpressionPackage.Literals.VARIABLE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredTextExpressionPackage.VARIABLE_EXPRESSION__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getArrayIndices() {
		if (arrayIndices == null) {
			arrayIndices = new EObjectContainmentEList<Expression>(Expression.class, this, StructuredTextExpressionPackage.VARIABLE_EXPRESSION__ARRAY_INDICES);
		}
		return arrayIndices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableExpression getInnerVariable() {
		return innerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerVariable(VariableExpression newInnerVariable, NotificationChain msgs) {
		VariableExpression oldInnerVariable = innerVariable;
		innerVariable = newInnerVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructuredTextExpressionPackage.VARIABLE_EXPRESSION__INNER_VARIABLE, oldInnerVariable, newInnerVariable);
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
	public void setInnerVariable(VariableExpression newInnerVariable) {
		if (newInnerVariable != innerVariable) {
			NotificationChain msgs = null;
			if (innerVariable != null)
				msgs = ((InternalEObject)innerVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructuredTextExpressionPackage.VARIABLE_EXPRESSION__INNER_VARIABLE, null, msgs);
			if (newInnerVariable != null)
				msgs = ((InternalEObject)newInnerVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructuredTextExpressionPackage.VARIABLE_EXPRESSION__INNER_VARIABLE, null, msgs);
			msgs = basicSetInnerVariable(newInnerVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredTextExpressionPackage.VARIABLE_EXPRESSION__INNER_VARIABLE, newInnerVariable, newInnerVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredTextExpressionPackage.VARIABLE_EXPRESSION__ARRAY_INDICES:
				return ((InternalEList<?>)getArrayIndices()).basicRemove(otherEnd, msgs);
			case StructuredTextExpressionPackage.VARIABLE_EXPRESSION__INNER_VARIABLE:
				return basicSetInnerVariable(null, msgs);
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
			case StructuredTextExpressionPackage.VARIABLE_EXPRESSION__SYMBOL:
				return getSymbol();
			case StructuredTextExpressionPackage.VARIABLE_EXPRESSION__ARRAY_INDICES:
				return getArrayIndices();
			case StructuredTextExpressionPackage.VARIABLE_EXPRESSION__INNER_VARIABLE:
				return getInnerVariable();
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
			case StructuredTextExpressionPackage.VARIABLE_EXPRESSION__SYMBOL:
				setSymbol((String)newValue);
				return;
			case StructuredTextExpressionPackage.VARIABLE_EXPRESSION__ARRAY_INDICES:
				getArrayIndices().clear();
				getArrayIndices().addAll((Collection<? extends Expression>)newValue);
				return;
			case StructuredTextExpressionPackage.VARIABLE_EXPRESSION__INNER_VARIABLE:
				setInnerVariable((VariableExpression)newValue);
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
			case StructuredTextExpressionPackage.VARIABLE_EXPRESSION__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case StructuredTextExpressionPackage.VARIABLE_EXPRESSION__ARRAY_INDICES:
				getArrayIndices().clear();
				return;
			case StructuredTextExpressionPackage.VARIABLE_EXPRESSION__INNER_VARIABLE:
				setInnerVariable((VariableExpression)null);
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
			case StructuredTextExpressionPackage.VARIABLE_EXPRESSION__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case StructuredTextExpressionPackage.VARIABLE_EXPRESSION__ARRAY_INDICES:
				return arrayIndices != null && !arrayIndices.isEmpty();
			case StructuredTextExpressionPackage.VARIABLE_EXPRESSION__INNER_VARIABLE:
				return innerVariable != null;
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
		result.append(" (Symbol: ");
		result.append(symbol);
		result.append(')');
		return result.toString();
	}

} //VariableExpressionImpl
