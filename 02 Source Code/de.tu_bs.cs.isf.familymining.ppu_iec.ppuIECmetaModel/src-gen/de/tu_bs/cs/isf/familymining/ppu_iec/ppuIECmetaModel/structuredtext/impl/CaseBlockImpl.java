/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.CaseBlock;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.CaseBlockImpl#getCaseExpressions <em>Case Expressions</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.CaseBlockImpl#getSubstatements <em>Substatements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseBlockImpl extends StatementImpl implements CaseBlock {
	/**
	 * The cached value of the '{@link #getCaseExpressions() <em>Case Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> caseExpressions;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredTextPackage.Literals.CASE_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getCaseExpressions() {
		if (caseExpressions == null) {
			caseExpressions = new EObjectContainmentEList<Expression>(Expression.class, this, StructuredTextPackage.CASE_BLOCK__CASE_EXPRESSIONS);
		}
		return caseExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Statement> getSubstatements() {
		if (substatements == null) {
			substatements = new EObjectContainmentEList<Statement>(Statement.class, this, StructuredTextPackage.CASE_BLOCK__SUBSTATEMENTS);
		}
		return substatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredTextPackage.CASE_BLOCK__CASE_EXPRESSIONS:
				return ((InternalEList<?>)getCaseExpressions()).basicRemove(otherEnd, msgs);
			case StructuredTextPackage.CASE_BLOCK__SUBSTATEMENTS:
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
			case StructuredTextPackage.CASE_BLOCK__CASE_EXPRESSIONS:
				return getCaseExpressions();
			case StructuredTextPackage.CASE_BLOCK__SUBSTATEMENTS:
				return getSubstatements();
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
			case StructuredTextPackage.CASE_BLOCK__CASE_EXPRESSIONS:
				getCaseExpressions().clear();
				getCaseExpressions().addAll((Collection<? extends Expression>)newValue);
				return;
			case StructuredTextPackage.CASE_BLOCK__SUBSTATEMENTS:
				getSubstatements().clear();
				getSubstatements().addAll((Collection<? extends Statement>)newValue);
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
			case StructuredTextPackage.CASE_BLOCK__CASE_EXPRESSIONS:
				getCaseExpressions().clear();
				return;
			case StructuredTextPackage.CASE_BLOCK__SUBSTATEMENTS:
				getSubstatements().clear();
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
			case StructuredTextPackage.CASE_BLOCK__CASE_EXPRESSIONS:
				return caseExpressions != null && !caseExpressions.isEmpty();
			case StructuredTextPackage.CASE_BLOCK__SUBSTATEMENTS:
				return substatements != null && !substatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CaseBlockImpl
