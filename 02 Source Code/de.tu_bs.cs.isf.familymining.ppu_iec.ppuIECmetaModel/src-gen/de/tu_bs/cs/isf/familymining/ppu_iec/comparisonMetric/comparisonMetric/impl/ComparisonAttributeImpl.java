/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonTarget;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonAttributeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonAttributeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonAttributeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonAttributeImpl#isIsOption <em>Is Option</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonAttributeImpl#getChildAttributes <em>Child Attributes</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonAttributeImpl#getParentAttribute <em>Parent Attribute</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.ComparisonAttributeImpl#getTargetType <em>Target Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonAttributeImpl extends MinimalEObjectImpl.Container implements ComparisonAttribute {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Float WEIGHT_EDEFAULT = new Float(0.0F);

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected Float weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOption() <em>Is Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOption() <em>Is Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOption()
	 * @generated
	 * @ordered
	 */
	protected boolean isOption = IS_OPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildAttributes() <em>Child Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComparisonAttribute> childAttributes;

	/**
	 * The cached value of the '{@link #getParentAttribute() <em>Parent Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentAttribute()
	 * @generated
	 * @ordered
	 */
	protected ComparisonAttribute parentAttribute;

	/**
	 * The default value of the '{@link #getTargetType() <em>Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetType()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonTarget TARGET_TYPE_EDEFAULT = ComparisonTarget.VARIANT;

	/**
	 * The cached value of the '{@link #getTargetType() <em>Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetType()
	 * @generated
	 * @ordered
	 */
	protected ComparisonTarget targetType = TARGET_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparisonMetricPackage.Literals.COMPARISON_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparisonMetricPackage.COMPARISON_ATTRIBUTE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparisonMetricPackage.COMPARISON_ATTRIBUTE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(Float newWeight) {
		Float oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparisonMetricPackage.COMPARISON_ATTRIBUTE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOption() {
		return isOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOption(boolean newIsOption) {
		boolean oldIsOption = isOption;
		isOption = newIsOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparisonMetricPackage.COMPARISON_ATTRIBUTE__IS_OPTION, oldIsOption, isOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComparisonAttribute> getChildAttributes() {
		if (childAttributes == null) {
			childAttributes = new EObjectContainmentEList<ComparisonAttribute>(ComparisonAttribute.class, this, ComparisonMetricPackage.COMPARISON_ATTRIBUTE__CHILD_ATTRIBUTES);
		}
		return childAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonAttribute getParentAttribute() {
		if (parentAttribute != null && parentAttribute.eIsProxy()) {
			InternalEObject oldParentAttribute = (InternalEObject)parentAttribute;
			parentAttribute = (ComparisonAttribute)eResolveProxy(oldParentAttribute);
			if (parentAttribute != oldParentAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComparisonMetricPackage.COMPARISON_ATTRIBUTE__PARENT_ATTRIBUTE, oldParentAttribute, parentAttribute));
			}
		}
		return parentAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonAttribute basicGetParentAttribute() {
		return parentAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAttribute(ComparisonAttribute newParentAttribute) {
		ComparisonAttribute oldParentAttribute = parentAttribute;
		parentAttribute = newParentAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparisonMetricPackage.COMPARISON_ATTRIBUTE__PARENT_ATTRIBUTE, oldParentAttribute, parentAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonTarget getTargetType() {
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetType(ComparisonTarget newTargetType) {
		ComparisonTarget oldTargetType = targetType;
		targetType = newTargetType == null ? TARGET_TYPE_EDEFAULT : newTargetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparisonMetricPackage.COMPARISON_ATTRIBUTE__TARGET_TYPE, oldTargetType, targetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__CHILD_ATTRIBUTES:
				return ((InternalEList<?>)getChildAttributes()).basicRemove(otherEnd, msgs);
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
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__LABEL:
				return getLabel();
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__DESCRIPTION:
				return getDescription();
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__WEIGHT:
				return getWeight();
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__IS_OPTION:
				return isIsOption();
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__CHILD_ATTRIBUTES:
				return getChildAttributes();
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__PARENT_ATTRIBUTE:
				if (resolve) return getParentAttribute();
				return basicGetParentAttribute();
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__TARGET_TYPE:
				return getTargetType();
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
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__LABEL:
				setLabel((String)newValue);
				return;
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__WEIGHT:
				setWeight((Float)newValue);
				return;
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__IS_OPTION:
				setIsOption((Boolean)newValue);
				return;
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__CHILD_ATTRIBUTES:
				getChildAttributes().clear();
				getChildAttributes().addAll((Collection<? extends ComparisonAttribute>)newValue);
				return;
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__PARENT_ATTRIBUTE:
				setParentAttribute((ComparisonAttribute)newValue);
				return;
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__TARGET_TYPE:
				setTargetType((ComparisonTarget)newValue);
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
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__IS_OPTION:
				setIsOption(IS_OPTION_EDEFAULT);
				return;
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__CHILD_ATTRIBUTES:
				getChildAttributes().clear();
				return;
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__PARENT_ATTRIBUTE:
				setParentAttribute((ComparisonAttribute)null);
				return;
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__TARGET_TYPE:
				setTargetType(TARGET_TYPE_EDEFAULT);
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
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__IS_OPTION:
				return isOption != IS_OPTION_EDEFAULT;
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__CHILD_ATTRIBUTES:
				return childAttributes != null && !childAttributes.isEmpty();
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__PARENT_ATTRIBUTE:
				return parentAttribute != null;
			case ComparisonMetricPackage.COMPARISON_ATTRIBUTE__TARGET_TYPE:
				return targetType != TARGET_TYPE_EDEFAULT;
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
		result.append(", description: ");
		result.append(description);
		result.append(", weight: ");
		result.append(weight);
		result.append(", isOption: ");
		result.append(isOption);
		result.append(", targetType: ");
		result.append(targetType);
		result.append(')');
		return result.toString();
	}

} //ComparisonAttributeImpl
