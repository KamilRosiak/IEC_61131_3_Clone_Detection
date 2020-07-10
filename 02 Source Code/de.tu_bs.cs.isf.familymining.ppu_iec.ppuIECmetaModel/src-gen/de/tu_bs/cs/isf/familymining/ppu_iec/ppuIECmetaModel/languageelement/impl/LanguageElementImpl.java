/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.Comment;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElementPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.impl.LanguageElementImpl#getParentElement <em>Parent Element</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.impl.LanguageElementImpl#getChildElements <em>Child Elements</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.impl.LanguageElementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.impl.LanguageElementImpl#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LanguageElementImpl extends MinimalEObjectImpl.Container implements LanguageElement {
	/**
	 * The cached value of the '{@link #getParentElement() <em>Parent Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentElement()
	 * @generated
	 * @ordered
	 */
	protected LanguageElement parentElement;

	/**
	 * The cached value of the '{@link #getChildElements() <em>Child Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildElements()
	 * @generated
	 * @ordered
	 */
	protected EList<LanguageElement> childElements;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = "";

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
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LanguageElementPackage.Literals.LANGUAGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageElement getParentElement() {
		if (parentElement != null && ((EObject)parentElement).eIsProxy()) {
			InternalEObject oldParentElement = (InternalEObject)parentElement;
			parentElement = (LanguageElement)eResolveProxy(oldParentElement);
			if (parentElement != oldParentElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LanguageElementPackage.LANGUAGE_ELEMENT__PARENT_ELEMENT, oldParentElement, parentElement));
			}
		}
		return parentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageElement basicGetParentElement() {
		return parentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentElement(LanguageElement newParentElement) {
		LanguageElement oldParentElement = parentElement;
		parentElement = newParentElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguageElementPackage.LANGUAGE_ELEMENT__PARENT_ELEMENT, oldParentElement, parentElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LanguageElement> getChildElements() {
		if (childElements == null) {
			childElements = new EObjectContainmentEList<LanguageElement>(LanguageElement.class, this, LanguageElementPackage.LANGUAGE_ELEMENT__CHILD_ELEMENTS);
		}
		return childElements;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LanguageElementPackage.LANGUAGE_ELEMENT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentEList<Comment>(Comment.class, this, LanguageElementPackage.LANGUAGE_ELEMENT__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LanguageElementPackage.LANGUAGE_ELEMENT__CHILD_ELEMENTS:
				return ((InternalEList<?>)getChildElements()).basicRemove(otherEnd, msgs);
			case LanguageElementPackage.LANGUAGE_ELEMENT__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
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
			case LanguageElementPackage.LANGUAGE_ELEMENT__PARENT_ELEMENT:
				if (resolve) return getParentElement();
				return basicGetParentElement();
			case LanguageElementPackage.LANGUAGE_ELEMENT__CHILD_ELEMENTS:
				return getChildElements();
			case LanguageElementPackage.LANGUAGE_ELEMENT__LABEL:
				return getLabel();
			case LanguageElementPackage.LANGUAGE_ELEMENT__COMMENTS:
				return getComments();
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
			case LanguageElementPackage.LANGUAGE_ELEMENT__PARENT_ELEMENT:
				setParentElement((LanguageElement)newValue);
				return;
			case LanguageElementPackage.LANGUAGE_ELEMENT__CHILD_ELEMENTS:
				getChildElements().clear();
				getChildElements().addAll((Collection<? extends LanguageElement>)newValue);
				return;
			case LanguageElementPackage.LANGUAGE_ELEMENT__LABEL:
				setLabel((String)newValue);
				return;
			case LanguageElementPackage.LANGUAGE_ELEMENT__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
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
			case LanguageElementPackage.LANGUAGE_ELEMENT__PARENT_ELEMENT:
				setParentElement((LanguageElement)null);
				return;
			case LanguageElementPackage.LANGUAGE_ELEMENT__CHILD_ELEMENTS:
				getChildElements().clear();
				return;
			case LanguageElementPackage.LANGUAGE_ELEMENT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case LanguageElementPackage.LANGUAGE_ELEMENT__COMMENTS:
				getComments().clear();
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
			case LanguageElementPackage.LANGUAGE_ELEMENT__PARENT_ELEMENT:
				return parentElement != null;
			case LanguageElementPackage.LANGUAGE_ELEMENT__CHILD_ELEMENTS:
				return childElements != null && !childElements.isEmpty();
			case LanguageElementPackage.LANGUAGE_ELEMENT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case LanguageElementPackage.LANGUAGE_ELEMENT__COMMENTS:
				return comments != null && !comments.isEmpty();
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

} //LanguageElementImpl
