/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.AbstractAction;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.SequentialFunctionChartPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.StepQualifier;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.StepImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.StepImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.StepImpl#getLinkedVariable <em>Linked Variable</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.StepImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.StepImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.StepImpl#getLocal_ID <em>Local ID</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.StepImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.StepImpl#getInitialStep <em>Initial Step</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.impl.StepImpl#getStepLevel <em>Step Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step {
	/**
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractAction> actions;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkedVariable() <em>Linked Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> linkedVariable;

	/**
	 * The cached value of the '{@link #getIncomingTransitions() <em>Incoming Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incomingTransitions;

	/**
	 * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoingTransitions;

	/**
	 * The default value of the '{@link #getLocal_ID() <em>Local ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCAL_ID_EDEFAULT = -1;

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
	 * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final StepQualifier QUALIFIER_EDEFAULT = StepQualifier.UNDEFINED;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected StepQualifier qualifier = QUALIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialStep() <em>Initial Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStep()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INITIAL_STEP_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getInitialStep() <em>Initial Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStep()
	 * @generated
	 * @ordered
	 */
	protected Boolean initialStep = INITIAL_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepLevel() <em>Step Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STEP_LEVEL_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getStepLevel() <em>Step Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepLevel()
	 * @generated
	 * @ordered
	 */
	protected Integer stepLevel = STEP_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SequentialFunctionChartPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequentialFunctionChartPackage.STEP__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<AbstractAction>(AbstractAction.class, this, SequentialFunctionChartPackage.STEP__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequentialFunctionChartPackage.STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getLinkedVariable() {
		if (linkedVariable == null) {
			linkedVariable = new EObjectResolvingEList<Variable>(Variable.class, this, SequentialFunctionChartPackage.STEP__LINKED_VARIABLE);
		}
		return linkedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectResolvingEList<Transition>(Transition.class, this, SequentialFunctionChartPackage.STEP__INCOMING_TRANSITIONS);
		}
		return incomingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectResolvingEList<Transition>(Transition.class, this, SequentialFunctionChartPackage.STEP__OUTGOING_TRANSITIONS);
		}
		return outgoingTransitions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SequentialFunctionChartPackage.STEP__LOCAL_ID, oldLocal_ID, local_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepQualifier getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifier(StepQualifier newQualifier) {
		StepQualifier oldQualifier = qualifier;
		qualifier = newQualifier == null ? QUALIFIER_EDEFAULT : newQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequentialFunctionChartPackage.STEP__QUALIFIER, oldQualifier, qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getInitialStep() {
		return initialStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialStep(Boolean newInitialStep) {
		Boolean oldInitialStep = initialStep;
		initialStep = newInitialStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequentialFunctionChartPackage.STEP__INITIAL_STEP, oldInitialStep, initialStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStepLevel() {
		return stepLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepLevel(Integer newStepLevel) {
		Integer oldStepLevel = stepLevel;
		stepLevel = newStepLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SequentialFunctionChartPackage.STEP__STEP_LEVEL, oldStepLevel, stepLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SequentialFunctionChartPackage.STEP__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case SequentialFunctionChartPackage.STEP__IS_ACTIVE:
				return isIsActive();
			case SequentialFunctionChartPackage.STEP__ACTIONS:
				return getActions();
			case SequentialFunctionChartPackage.STEP__NAME:
				return getName();
			case SequentialFunctionChartPackage.STEP__LINKED_VARIABLE:
				return getLinkedVariable();
			case SequentialFunctionChartPackage.STEP__INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case SequentialFunctionChartPackage.STEP__OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case SequentialFunctionChartPackage.STEP__LOCAL_ID:
				return getLocal_ID();
			case SequentialFunctionChartPackage.STEP__QUALIFIER:
				return getQualifier();
			case SequentialFunctionChartPackage.STEP__INITIAL_STEP:
				return getInitialStep();
			case SequentialFunctionChartPackage.STEP__STEP_LEVEL:
				return getStepLevel();
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
			case SequentialFunctionChartPackage.STEP__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case SequentialFunctionChartPackage.STEP__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends AbstractAction>)newValue);
				return;
			case SequentialFunctionChartPackage.STEP__NAME:
				setName((String)newValue);
				return;
			case SequentialFunctionChartPackage.STEP__LINKED_VARIABLE:
				getLinkedVariable().clear();
				getLinkedVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case SequentialFunctionChartPackage.STEP__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				getIncomingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case SequentialFunctionChartPackage.STEP__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case SequentialFunctionChartPackage.STEP__LOCAL_ID:
				setLocal_ID((Integer)newValue);
				return;
			case SequentialFunctionChartPackage.STEP__QUALIFIER:
				setQualifier((StepQualifier)newValue);
				return;
			case SequentialFunctionChartPackage.STEP__INITIAL_STEP:
				setInitialStep((Boolean)newValue);
				return;
			case SequentialFunctionChartPackage.STEP__STEP_LEVEL:
				setStepLevel((Integer)newValue);
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
			case SequentialFunctionChartPackage.STEP__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case SequentialFunctionChartPackage.STEP__ACTIONS:
				getActions().clear();
				return;
			case SequentialFunctionChartPackage.STEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SequentialFunctionChartPackage.STEP__LINKED_VARIABLE:
				getLinkedVariable().clear();
				return;
			case SequentialFunctionChartPackage.STEP__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				return;
			case SequentialFunctionChartPackage.STEP__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				return;
			case SequentialFunctionChartPackage.STEP__LOCAL_ID:
				setLocal_ID(LOCAL_ID_EDEFAULT);
				return;
			case SequentialFunctionChartPackage.STEP__QUALIFIER:
				setQualifier(QUALIFIER_EDEFAULT);
				return;
			case SequentialFunctionChartPackage.STEP__INITIAL_STEP:
				setInitialStep(INITIAL_STEP_EDEFAULT);
				return;
			case SequentialFunctionChartPackage.STEP__STEP_LEVEL:
				setStepLevel(STEP_LEVEL_EDEFAULT);
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
			case SequentialFunctionChartPackage.STEP__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case SequentialFunctionChartPackage.STEP__ACTIONS:
				return actions != null && !actions.isEmpty();
			case SequentialFunctionChartPackage.STEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SequentialFunctionChartPackage.STEP__LINKED_VARIABLE:
				return linkedVariable != null && !linkedVariable.isEmpty();
			case SequentialFunctionChartPackage.STEP__INCOMING_TRANSITIONS:
				return incomingTransitions != null && !incomingTransitions.isEmpty();
			case SequentialFunctionChartPackage.STEP__OUTGOING_TRANSITIONS:
				return outgoingTransitions != null && !outgoingTransitions.isEmpty();
			case SequentialFunctionChartPackage.STEP__LOCAL_ID:
				return local_ID != LOCAL_ID_EDEFAULT;
			case SequentialFunctionChartPackage.STEP__QUALIFIER:
				return qualifier != QUALIFIER_EDEFAULT;
			case SequentialFunctionChartPackage.STEP__INITIAL_STEP:
				return INITIAL_STEP_EDEFAULT == null ? initialStep != null : !INITIAL_STEP_EDEFAULT.equals(initialStep);
			case SequentialFunctionChartPackage.STEP__STEP_LEVEL:
				return STEP_LEVEL_EDEFAULT == null ? stepLevel != null : !STEP_LEVEL_EDEFAULT.equals(stepLevel);
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
		result.append(" (isActive: ");
		result.append(isActive);
		result.append(", name: ");
		result.append(name);
		result.append(", local_ID: ");
		result.append(local_ID);
		result.append(", qualifier: ");
		result.append(qualifier);
		result.append(", initialStep: ");
		result.append(initialStep);
		result.append(", stepLevel: ");
		result.append(stepLevel);
		result.append(')');
		return result.toString();
	}

} //StepImpl
