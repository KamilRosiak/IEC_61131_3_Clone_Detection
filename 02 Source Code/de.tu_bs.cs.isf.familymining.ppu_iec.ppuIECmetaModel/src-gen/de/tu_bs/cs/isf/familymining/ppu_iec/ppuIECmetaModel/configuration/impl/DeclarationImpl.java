/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Declaration;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Struct;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.Comment;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.DeclarationImpl#getInputVariables <em>Input Variables</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.DeclarationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.DeclarationImpl#getInOutVariables <em>In Out Variables</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.DeclarationImpl#getInternalVariables <em>Internal Variables</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.DeclarationImpl#getOutputVariables <em>Output Variables</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.DeclarationImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarationImpl extends MinimalEObjectImpl.Container implements Declaration {
	/**
	 * The cached value of the '{@link #getInputVariables() <em>Input Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> inputVariables;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comment;

	/**
	 * The cached value of the '{@link #getInOutVariables() <em>In Out Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInOutVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> inOutVariables;

	/**
	 * The cached value of the '{@link #getInternalVariables() <em>Internal Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> internalVariables;

	/**
	 * The cached value of the '{@link #getOutputVariables() <em>Output Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> outputVariables;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Struct> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getInputVariables() {
		if (inputVariables == null) {
			inputVariables = new EObjectContainmentEList<Variable>(Variable.class, this, ConfigurationPackage.DECLARATION__INPUT_VARIABLES);
		}
		return inputVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<Comment>(Comment.class, this, ConfigurationPackage.DECLARATION__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getInOutVariables() {
		if (inOutVariables == null) {
			inOutVariables = new EObjectContainmentEList<Variable>(Variable.class, this, ConfigurationPackage.DECLARATION__IN_OUT_VARIABLES);
		}
		return inOutVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getInternalVariables() {
		if (internalVariables == null) {
			internalVariables = new EObjectContainmentEList<Variable>(Variable.class, this, ConfigurationPackage.DECLARATION__INTERNAL_VARIABLES);
		}
		return internalVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getOutputVariables() {
		if (outputVariables == null) {
			outputVariables = new EObjectContainmentEList<Variable>(Variable.class, this, ConfigurationPackage.DECLARATION__OUTPUT_VARIABLES);
		}
		return outputVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Struct> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Struct>(Struct.class, this, ConfigurationPackage.DECLARATION__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.DECLARATION__INPUT_VARIABLES:
				return ((InternalEList<?>)getInputVariables()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.DECLARATION__COMMENT:
				return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.DECLARATION__IN_OUT_VARIABLES:
				return ((InternalEList<?>)getInOutVariables()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.DECLARATION__INTERNAL_VARIABLES:
				return ((InternalEList<?>)getInternalVariables()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.DECLARATION__OUTPUT_VARIABLES:
				return ((InternalEList<?>)getOutputVariables()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.DECLARATION__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case ConfigurationPackage.DECLARATION__INPUT_VARIABLES:
				return getInputVariables();
			case ConfigurationPackage.DECLARATION__COMMENT:
				return getComment();
			case ConfigurationPackage.DECLARATION__IN_OUT_VARIABLES:
				return getInOutVariables();
			case ConfigurationPackage.DECLARATION__INTERNAL_VARIABLES:
				return getInternalVariables();
			case ConfigurationPackage.DECLARATION__OUTPUT_VARIABLES:
				return getOutputVariables();
			case ConfigurationPackage.DECLARATION__TYPES:
				return getTypes();
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
			case ConfigurationPackage.DECLARATION__INPUT_VARIABLES:
				getInputVariables().clear();
				getInputVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ConfigurationPackage.DECLARATION__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case ConfigurationPackage.DECLARATION__IN_OUT_VARIABLES:
				getInOutVariables().clear();
				getInOutVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ConfigurationPackage.DECLARATION__INTERNAL_VARIABLES:
				getInternalVariables().clear();
				getInternalVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ConfigurationPackage.DECLARATION__OUTPUT_VARIABLES:
				getOutputVariables().clear();
				getOutputVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ConfigurationPackage.DECLARATION__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Struct>)newValue);
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
			case ConfigurationPackage.DECLARATION__INPUT_VARIABLES:
				getInputVariables().clear();
				return;
			case ConfigurationPackage.DECLARATION__COMMENT:
				getComment().clear();
				return;
			case ConfigurationPackage.DECLARATION__IN_OUT_VARIABLES:
				getInOutVariables().clear();
				return;
			case ConfigurationPackage.DECLARATION__INTERNAL_VARIABLES:
				getInternalVariables().clear();
				return;
			case ConfigurationPackage.DECLARATION__OUTPUT_VARIABLES:
				getOutputVariables().clear();
				return;
			case ConfigurationPackage.DECLARATION__TYPES:
				getTypes().clear();
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
			case ConfigurationPackage.DECLARATION__INPUT_VARIABLES:
				return inputVariables != null && !inputVariables.isEmpty();
			case ConfigurationPackage.DECLARATION__COMMENT:
				return comment != null && !comment.isEmpty();
			case ConfigurationPackage.DECLARATION__IN_OUT_VARIABLES:
				return inOutVariables != null && !inOutVariables.isEmpty();
			case ConfigurationPackage.DECLARATION__INTERNAL_VARIABLES:
				return internalVariables != null && !internalVariables.isEmpty();
			case ConfigurationPackage.DECLARATION__OUTPUT_VARIABLES:
				return outputVariables != null && !outputVariables.isEmpty();
			case ConfigurationPackage.DECLARATION__TYPES:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeclarationImpl
