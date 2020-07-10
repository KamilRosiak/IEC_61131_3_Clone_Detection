/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChartPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.TransitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.TransitionImpl#isIsJump <em>Is Jump</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.TransitionImpl#getSourceStep <em>Source Step</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.TransitionImpl#getTargetStep <em>Target Step</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.TransitionImpl#getLocal_ID <em>Local ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsJump() <em>Is Jump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsJump()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_JUMP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsJump() <em>Is Jump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsJump()
	 * @generated
	 * @ordered
	 */
	protected boolean isJump = IS_JUMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceStep() <em>Source Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> sourceStep;

	/**
	 * The cached value of the '{@link #getTargetStep() <em>Target Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> targetStep;

	/**
	 * The default value of the '{@link #getLocal_ID() <em>Local ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCAL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLocal_ID() <em>Local ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal_ID()
	 * @generated
	 * @ordered
	 */
	protected int local_ID = LOCAL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequentialFunctionChartPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequentialFunctionChartPackage.TRANSITION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsJump() {
		return isJump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsJump(boolean newIsJump) {
		boolean oldIsJump = isJump;
		isJump = newIsJump;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequentialFunctionChartPackage.TRANSITION__IS_JUMP, oldIsJump, isJump));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getSourceStep() {
		if (sourceStep == null) {
			sourceStep = new EObjectResolvingEList<Step>(Step.class, this, SequentialFunctionChartPackage.TRANSITION__SOURCE_STEP);
		}
		return sourceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getTargetStep() {
		if (targetStep == null) {
			targetStep = new EObjectResolvingEList<Step>(Step.class, this, SequentialFunctionChartPackage.TRANSITION__TARGET_STEP);
		}
		return targetStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLocal_ID() {
		return local_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocal_ID(int newLocal_ID) {
		int oldLocal_ID = local_ID;
		local_ID = newLocal_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequentialFunctionChartPackage.TRANSITION__LOCAL_ID, oldLocal_ID, local_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SequentialFunctionChartPackage.TRANSITION__CONDITION:
				return getCondition();
			case SequentialFunctionChartPackage.TRANSITION__IS_JUMP:
				return isIsJump();
			case SequentialFunctionChartPackage.TRANSITION__SOURCE_STEP:
				return getSourceStep();
			case SequentialFunctionChartPackage.TRANSITION__TARGET_STEP:
				return getTargetStep();
			case SequentialFunctionChartPackage.TRANSITION__LOCAL_ID:
				return getLocal_ID();
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
			case SequentialFunctionChartPackage.TRANSITION__CONDITION:
				setCondition((String)newValue);
				return;
			case SequentialFunctionChartPackage.TRANSITION__IS_JUMP:
				setIsJump((Boolean)newValue);
				return;
			case SequentialFunctionChartPackage.TRANSITION__SOURCE_STEP:
				getSourceStep().clear();
				getSourceStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SequentialFunctionChartPackage.TRANSITION__TARGET_STEP:
				getTargetStep().clear();
				getTargetStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SequentialFunctionChartPackage.TRANSITION__LOCAL_ID:
				setLocal_ID((Integer)newValue);
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
			case SequentialFunctionChartPackage.TRANSITION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case SequentialFunctionChartPackage.TRANSITION__IS_JUMP:
				setIsJump(IS_JUMP_EDEFAULT);
				return;
			case SequentialFunctionChartPackage.TRANSITION__SOURCE_STEP:
				getSourceStep().clear();
				return;
			case SequentialFunctionChartPackage.TRANSITION__TARGET_STEP:
				getTargetStep().clear();
				return;
			case SequentialFunctionChartPackage.TRANSITION__LOCAL_ID:
				setLocal_ID(LOCAL_ID_EDEFAULT);
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
			case SequentialFunctionChartPackage.TRANSITION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case SequentialFunctionChartPackage.TRANSITION__IS_JUMP:
				return isJump != IS_JUMP_EDEFAULT;
			case SequentialFunctionChartPackage.TRANSITION__SOURCE_STEP:
				return sourceStep != null && !sourceStep.isEmpty();
			case SequentialFunctionChartPackage.TRANSITION__TARGET_STEP:
				return targetStep != null && !targetStep.isEmpty();
			case SequentialFunctionChartPackage.TRANSITION__LOCAL_ID:
				return local_ID != LOCAL_ID_EDEFAULT;
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(", isJump: ");
		result.append(isJump);
		result.append(", local_ID: ");
		result.append(local_ID);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
