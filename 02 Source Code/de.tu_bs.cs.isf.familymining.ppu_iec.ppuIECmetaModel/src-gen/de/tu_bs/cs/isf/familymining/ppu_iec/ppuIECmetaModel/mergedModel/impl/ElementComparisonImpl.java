/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.VariabilityCategory;

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
 * An implementation of the model object '<em><b>Element Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.ElementComparisonImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.ElementComparisonImpl#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.ElementComparisonImpl#getSimilarity <em>Similarity</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.ElementComparisonImpl#getSubElements <em>Sub Elements</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.ElementComparisonImpl#getParentElement <em>Parent Element</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.ElementComparisonImpl#getVariability <em>Variability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementComparisonImpl extends MinimalEObjectImpl.Container implements ElementComparison {
	/**
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected EObject sourceElement;

	/**
	 * The cached value of the '{@link #getTargetElement() <em>Target Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected EObject targetElement;

	/**
	 * The default value of the '{@link #getSimilarity() <em>Similarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimilarity()
	 * @generated
	 * @ordered
	 */
	protected static final float SIMILARITY_EDEFAULT = -1.0F;

	/**
	 * The cached value of the '{@link #getSimilarity() <em>Similarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimilarity()
	 * @generated
	 * @ordered
	 */
	protected float similarity = SIMILARITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubElements() <em>Sub Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementComparison> subElements;

	/**
	 * The cached value of the '{@link #getParentElement() <em>Parent Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentElement()
	 * @generated
	 * @ordered
	 */
	protected ElementComparison parentElement;

	/**
	 * The default value of the '{@link #getVariability() <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariability()
	 * @generated
	 * @ordered
	 */
	protected static final VariabilityCategory VARIABILITY_EDEFAULT = VariabilityCategory.UNDEFINED;

	/**
	 * The cached value of the '{@link #getVariability() <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariability()
	 * @generated
	 * @ordered
	 */
	protected VariabilityCategory variability = VARIABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MergedModelPackage.Literals.ELEMENT_COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getSourceElement() {
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceElement(EObject newSourceElement, NotificationChain msgs) {
		EObject oldSourceElement = sourceElement;
		sourceElement = newSourceElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MergedModelPackage.ELEMENT_COMPARISON__SOURCE_ELEMENT, oldSourceElement, newSourceElement);
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
	public void setSourceElement(EObject newSourceElement) {
		if (newSourceElement != sourceElement) {
			NotificationChain msgs = null;
			if (sourceElement != null)
				msgs = ((InternalEObject)sourceElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MergedModelPackage.ELEMENT_COMPARISON__SOURCE_ELEMENT, null, msgs);
			if (newSourceElement != null)
				msgs = ((InternalEObject)newSourceElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MergedModelPackage.ELEMENT_COMPARISON__SOURCE_ELEMENT, null, msgs);
			msgs = basicSetSourceElement(newSourceElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MergedModelPackage.ELEMENT_COMPARISON__SOURCE_ELEMENT, newSourceElement, newSourceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getTargetElement() {
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetElement(EObject newTargetElement, NotificationChain msgs) {
		EObject oldTargetElement = targetElement;
		targetElement = newTargetElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MergedModelPackage.ELEMENT_COMPARISON__TARGET_ELEMENT, oldTargetElement, newTargetElement);
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
	public void setTargetElement(EObject newTargetElement) {
		if (newTargetElement != targetElement) {
			NotificationChain msgs = null;
			if (targetElement != null)
				msgs = ((InternalEObject)targetElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MergedModelPackage.ELEMENT_COMPARISON__TARGET_ELEMENT, null, msgs);
			if (newTargetElement != null)
				msgs = ((InternalEObject)newTargetElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MergedModelPackage.ELEMENT_COMPARISON__TARGET_ELEMENT, null, msgs);
			msgs = basicSetTargetElement(newTargetElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MergedModelPackage.ELEMENT_COMPARISON__TARGET_ELEMENT, newTargetElement, newTargetElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getSimilarity() {
		return similarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimilarity(float newSimilarity) {
		float oldSimilarity = similarity;
		similarity = newSimilarity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MergedModelPackage.ELEMENT_COMPARISON__SIMILARITY, oldSimilarity, similarity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementComparison> getSubElements() {
		if (subElements == null) {
			subElements = new EObjectContainmentEList<ElementComparison>(ElementComparison.class, this, MergedModelPackage.ELEMENT_COMPARISON__SUB_ELEMENTS);
		}
		return subElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementComparison getParentElement() {
		return parentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentElement(ElementComparison newParentElement, NotificationChain msgs) {
		ElementComparison oldParentElement = parentElement;
		parentElement = newParentElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MergedModelPackage.ELEMENT_COMPARISON__PARENT_ELEMENT, oldParentElement, newParentElement);
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
	public void setParentElement(ElementComparison newParentElement) {
		if (newParentElement != parentElement) {
			NotificationChain msgs = null;
			if (parentElement != null)
				msgs = ((InternalEObject)parentElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MergedModelPackage.ELEMENT_COMPARISON__PARENT_ELEMENT, null, msgs);
			if (newParentElement != null)
				msgs = ((InternalEObject)newParentElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MergedModelPackage.ELEMENT_COMPARISON__PARENT_ELEMENT, null, msgs);
			msgs = basicSetParentElement(newParentElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MergedModelPackage.ELEMENT_COMPARISON__PARENT_ELEMENT, newParentElement, newParentElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariabilityCategory getVariability() {
		return variability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariability(VariabilityCategory newVariability) {
		VariabilityCategory oldVariability = variability;
		variability = newVariability == null ? VARIABILITY_EDEFAULT : newVariability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MergedModelPackage.ELEMENT_COMPARISON__VARIABILITY, oldVariability, variability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MergedModelPackage.ELEMENT_COMPARISON__SOURCE_ELEMENT:
				return basicSetSourceElement(null, msgs);
			case MergedModelPackage.ELEMENT_COMPARISON__TARGET_ELEMENT:
				return basicSetTargetElement(null, msgs);
			case MergedModelPackage.ELEMENT_COMPARISON__SUB_ELEMENTS:
				return ((InternalEList<?>)getSubElements()).basicRemove(otherEnd, msgs);
			case MergedModelPackage.ELEMENT_COMPARISON__PARENT_ELEMENT:
				return basicSetParentElement(null, msgs);
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
			case MergedModelPackage.ELEMENT_COMPARISON__SOURCE_ELEMENT:
				return getSourceElement();
			case MergedModelPackage.ELEMENT_COMPARISON__TARGET_ELEMENT:
				return getTargetElement();
			case MergedModelPackage.ELEMENT_COMPARISON__SIMILARITY:
				return getSimilarity();
			case MergedModelPackage.ELEMENT_COMPARISON__SUB_ELEMENTS:
				return getSubElements();
			case MergedModelPackage.ELEMENT_COMPARISON__PARENT_ELEMENT:
				return getParentElement();
			case MergedModelPackage.ELEMENT_COMPARISON__VARIABILITY:
				return getVariability();
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
			case MergedModelPackage.ELEMENT_COMPARISON__SOURCE_ELEMENT:
				setSourceElement((EObject)newValue);
				return;
			case MergedModelPackage.ELEMENT_COMPARISON__TARGET_ELEMENT:
				setTargetElement((EObject)newValue);
				return;
			case MergedModelPackage.ELEMENT_COMPARISON__SIMILARITY:
				setSimilarity((Float)newValue);
				return;
			case MergedModelPackage.ELEMENT_COMPARISON__SUB_ELEMENTS:
				getSubElements().clear();
				getSubElements().addAll((Collection<? extends ElementComparison>)newValue);
				return;
			case MergedModelPackage.ELEMENT_COMPARISON__PARENT_ELEMENT:
				setParentElement((ElementComparison)newValue);
				return;
			case MergedModelPackage.ELEMENT_COMPARISON__VARIABILITY:
				setVariability((VariabilityCategory)newValue);
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
			case MergedModelPackage.ELEMENT_COMPARISON__SOURCE_ELEMENT:
				setSourceElement((EObject)null);
				return;
			case MergedModelPackage.ELEMENT_COMPARISON__TARGET_ELEMENT:
				setTargetElement((EObject)null);
				return;
			case MergedModelPackage.ELEMENT_COMPARISON__SIMILARITY:
				setSimilarity(SIMILARITY_EDEFAULT);
				return;
			case MergedModelPackage.ELEMENT_COMPARISON__SUB_ELEMENTS:
				getSubElements().clear();
				return;
			case MergedModelPackage.ELEMENT_COMPARISON__PARENT_ELEMENT:
				setParentElement((ElementComparison)null);
				return;
			case MergedModelPackage.ELEMENT_COMPARISON__VARIABILITY:
				setVariability(VARIABILITY_EDEFAULT);
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
			case MergedModelPackage.ELEMENT_COMPARISON__SOURCE_ELEMENT:
				return sourceElement != null;
			case MergedModelPackage.ELEMENT_COMPARISON__TARGET_ELEMENT:
				return targetElement != null;
			case MergedModelPackage.ELEMENT_COMPARISON__SIMILARITY:
				return similarity != SIMILARITY_EDEFAULT;
			case MergedModelPackage.ELEMENT_COMPARISON__SUB_ELEMENTS:
				return subElements != null && !subElements.isEmpty();
			case MergedModelPackage.ELEMENT_COMPARISON__PARENT_ELEMENT:
				return parentElement != null;
			case MergedModelPackage.ELEMENT_COMPARISON__VARIABILITY:
				return variability != VARIABILITY_EDEFAULT;
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
		result.append(" (similarity: ");
		result.append(similarity);
		result.append(", variability: ");
		result.append(variability);
		result.append(')');
		return result.toString();
	}

} //ElementComparisonImpl
