/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Action;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Declaration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.OrganizationType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.POU;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Task;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ElementaryDataType;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>POU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.POUImpl#getControlTasks <em>Control Tasks</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.POUImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.POUImpl#getCallees <em>Callees</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.POUImpl#getCallers <em>Callers</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.POUImpl#getImplementations <em>Implementations</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.POUImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.POUImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.POUImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.POUImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class POUImpl extends MinimalEObjectImpl.Container implements POU {
	/**
	 * The cached value of the '{@link #getControlTasks() <em>Control Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> controlTasks;

	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected Declaration declaration;

	/**
	 * The cached value of the '{@link #getCallees() <em>Callees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallees()
	 * @generated
	 * @ordered
	 */
	protected EList<POU> callees;

	/**
	 * The cached value of the '{@link #getCallers() <em>Callers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallers()
	 * @generated
	 * @ordered
	 */
	protected EList<POU> callers;

	/**
	 * The cached value of the '{@link #getImplementations() <em>Implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<LanguageElement> implementations;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final ElementaryDataType RETURN_TYPE_EDEFAULT = ElementaryDataType.UNSET;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected ElementaryDataType returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final OrganizationType TYPE_EDEFAULT = OrganizationType.PROGRAM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OrganizationType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected POUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.POU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getControlTasks() {
		if (controlTasks == null) {
			controlTasks = new EObjectWithInverseResolvingEList<Task>(Task.class, this, ConfigurationPackage.POU__CONTROL_TASKS, ConfigurationPackage.TASK__CONTROLLED_PROGRAMS);
		}
		return controlTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Declaration getDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclaration(Declaration newDeclaration, NotificationChain msgs) {
		Declaration oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.POU__DECLARATION, oldDeclaration, newDeclaration);
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
	public void setDeclaration(Declaration newDeclaration) {
		if (newDeclaration != declaration) {
			NotificationChain msgs = null;
			if (declaration != null)
				msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.POU__DECLARATION, null, msgs);
			if (newDeclaration != null)
				msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.POU__DECLARATION, null, msgs);
			msgs = basicSetDeclaration(newDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.POU__DECLARATION, newDeclaration, newDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<POU> getCallees() {
		if (callees == null) {
			callees = new EObjectResolvingEList<POU>(POU.class, this, ConfigurationPackage.POU__CALLEES);
		}
		return callees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<POU> getCallers() {
		if (callers == null) {
			callers = new EObjectResolvingEList<POU>(POU.class, this, ConfigurationPackage.POU__CALLERS);
		}
		return callers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LanguageElement> getImplementations() {
		if (implementations == null) {
			implementations = new EObjectContainmentEList<LanguageElement>(LanguageElement.class, this, ConfigurationPackage.POU__IMPLEMENTATIONS);
		}
		return implementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.POU__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementaryDataType getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnType(ElementaryDataType newReturnType) {
		ElementaryDataType oldReturnType = returnType;
		returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.POU__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(OrganizationType newType) {
		OrganizationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.POU__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, ConfigurationPackage.POU__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.POU__CONTROL_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlTasks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.POU__CONTROL_TASKS:
				return ((InternalEList<?>)getControlTasks()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.POU__DECLARATION:
				return basicSetDeclaration(null, msgs);
			case ConfigurationPackage.POU__IMPLEMENTATIONS:
				return ((InternalEList<?>)getImplementations()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.POU__ACTIONS:
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
			case ConfigurationPackage.POU__CONTROL_TASKS:
				return getControlTasks();
			case ConfigurationPackage.POU__DECLARATION:
				return getDeclaration();
			case ConfigurationPackage.POU__CALLEES:
				return getCallees();
			case ConfigurationPackage.POU__CALLERS:
				return getCallers();
			case ConfigurationPackage.POU__IMPLEMENTATIONS:
				return getImplementations();
			case ConfigurationPackage.POU__IDENTIFIER:
				return getIdentifier();
			case ConfigurationPackage.POU__RETURN_TYPE:
				return getReturnType();
			case ConfigurationPackage.POU__TYPE:
				return getType();
			case ConfigurationPackage.POU__ACTIONS:
				return getActions();
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
			case ConfigurationPackage.POU__CONTROL_TASKS:
				getControlTasks().clear();
				getControlTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case ConfigurationPackage.POU__DECLARATION:
				setDeclaration((Declaration)newValue);
				return;
			case ConfigurationPackage.POU__CALLEES:
				getCallees().clear();
				getCallees().addAll((Collection<? extends POU>)newValue);
				return;
			case ConfigurationPackage.POU__CALLERS:
				getCallers().clear();
				getCallers().addAll((Collection<? extends POU>)newValue);
				return;
			case ConfigurationPackage.POU__IMPLEMENTATIONS:
				getImplementations().clear();
				getImplementations().addAll((Collection<? extends LanguageElement>)newValue);
				return;
			case ConfigurationPackage.POU__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case ConfigurationPackage.POU__RETURN_TYPE:
				setReturnType((ElementaryDataType)newValue);
				return;
			case ConfigurationPackage.POU__TYPE:
				setType((OrganizationType)newValue);
				return;
			case ConfigurationPackage.POU__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
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
			case ConfigurationPackage.POU__CONTROL_TASKS:
				getControlTasks().clear();
				return;
			case ConfigurationPackage.POU__DECLARATION:
				setDeclaration((Declaration)null);
				return;
			case ConfigurationPackage.POU__CALLEES:
				getCallees().clear();
				return;
			case ConfigurationPackage.POU__CALLERS:
				getCallers().clear();
				return;
			case ConfigurationPackage.POU__IMPLEMENTATIONS:
				getImplementations().clear();
				return;
			case ConfigurationPackage.POU__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case ConfigurationPackage.POU__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case ConfigurationPackage.POU__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ConfigurationPackage.POU__ACTIONS:
				getActions().clear();
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
			case ConfigurationPackage.POU__CONTROL_TASKS:
				return controlTasks != null && !controlTasks.isEmpty();
			case ConfigurationPackage.POU__DECLARATION:
				return declaration != null;
			case ConfigurationPackage.POU__CALLEES:
				return callees != null && !callees.isEmpty();
			case ConfigurationPackage.POU__CALLERS:
				return callers != null && !callers.isEmpty();
			case ConfigurationPackage.POU__IMPLEMENTATIONS:
				return implementations != null && !implementations.isEmpty();
			case ConfigurationPackage.POU__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case ConfigurationPackage.POU__RETURN_TYPE:
				return returnType != RETURN_TYPE_EDEFAULT;
			case ConfigurationPackage.POU__TYPE:
				return type != TYPE_EDEFAULT;
			case ConfigurationPackage.POU__ACTIONS:
				return actions != null && !actions.isEmpty();
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", returnType: ");
		result.append(returnType);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //POUImpl
