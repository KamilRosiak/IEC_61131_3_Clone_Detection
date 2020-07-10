/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage;
import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric;

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
 * An implementation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.MetricImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.MetricImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.MetricImpl#isIsWeighted <em>Is Weighted</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.impl.MetricImpl#getComparisonattribute <em>Comparisonattribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetricImpl extends MinimalEObjectImpl.Container implements Metric {
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
	 * The default value of the '{@link #isIsWeighted() <em>Is Weighted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWeighted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WEIGHTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsWeighted() <em>Is Weighted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWeighted()
	 * @generated
	 * @ordered
	 */
	protected boolean isWeighted = IS_WEIGHTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComparisonattribute() <em>Comparisonattribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonattribute()
	 * @generated
	 * @ordered
	 */
	protected EList<ComparisonAttribute> comparisonattribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparisonMetricPackage.Literals.METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparisonMetricPackage.METRIC__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComparisonMetricPackage.METRIC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsWeighted() {
		return isWeighted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWeighted(boolean newIsWeighted) {
		boolean oldIsWeighted = isWeighted;
		isWeighted = newIsWeighted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparisonMetricPackage.METRIC__IS_WEIGHTED, oldIsWeighted, isWeighted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComparisonAttribute> getComparisonattribute() {
		if (comparisonattribute == null) {
			comparisonattribute = new EObjectContainmentEList<ComparisonAttribute>(ComparisonAttribute.class, this, ComparisonMetricPackage.METRIC__COMPARISONATTRIBUTE);
		}
		return comparisonattribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComparisonMetricPackage.METRIC__COMPARISONATTRIBUTE:
				return ((InternalEList<?>)getComparisonattribute()).basicRemove(otherEnd, msgs);
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
			case ComparisonMetricPackage.METRIC__NAME:
				return getName();
			case ComparisonMetricPackage.METRIC__DESCRIPTION:
				return getDescription();
			case ComparisonMetricPackage.METRIC__IS_WEIGHTED:
				return isIsWeighted();
			case ComparisonMetricPackage.METRIC__COMPARISONATTRIBUTE:
				return getComparisonattribute();
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
			case ComparisonMetricPackage.METRIC__NAME:
				setName((String)newValue);
				return;
			case ComparisonMetricPackage.METRIC__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ComparisonMetricPackage.METRIC__IS_WEIGHTED:
				setIsWeighted((Boolean)newValue);
				return;
			case ComparisonMetricPackage.METRIC__COMPARISONATTRIBUTE:
				getComparisonattribute().clear();
				getComparisonattribute().addAll((Collection<? extends ComparisonAttribute>)newValue);
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
			case ComparisonMetricPackage.METRIC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComparisonMetricPackage.METRIC__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ComparisonMetricPackage.METRIC__IS_WEIGHTED:
				setIsWeighted(IS_WEIGHTED_EDEFAULT);
				return;
			case ComparisonMetricPackage.METRIC__COMPARISONATTRIBUTE:
				getComparisonattribute().clear();
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
			case ComparisonMetricPackage.METRIC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComparisonMetricPackage.METRIC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ComparisonMetricPackage.METRIC__IS_WEIGHTED:
				return isWeighted != IS_WEIGHTED_EDEFAULT;
			case ComparisonMetricPackage.METRIC__COMPARISONATTRIBUTE:
				return comparisonattribute != null && !comparisonattribute.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", isWeighted: ");
		result.append(isWeighted);
		result.append(')');
		return result.toString();
	}

} //MetricImpl
