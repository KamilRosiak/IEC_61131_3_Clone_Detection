/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage;

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
 * An implementation of the model object '<em><b>Family Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.FamilyModelImpl#getSourceVariant <em>Source Variant</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.FamilyModelImpl#getTargetVariant <em>Target Variant</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.FamilyModelImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.impl.FamilyModelImpl#getComparedElements <em>Compared Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilyModelImpl extends MinimalEObjectImpl.Container implements FamilyModel {
	/**
	 * The cached value of the '{@link #getSourceVariant() <em>Source Variant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVariant()
	 * @generated
	 * @ordered
	 */
	protected Configuration sourceVariant;

	/**
	 * The cached value of the '{@link #getTargetVariant() <em>Target Variant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVariant()
	 * @generated
	 * @ordered
	 */
	protected Configuration targetVariant;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected Metric metric;

	/**
	 * The cached value of the '{@link #getComparedElements() <em>Compared Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementComparison> comparedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MergedModelPackage.Literals.FAMILY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration getSourceVariant() {
		return sourceVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceVariant(Configuration newSourceVariant, NotificationChain msgs) {
		Configuration oldSourceVariant = sourceVariant;
		sourceVariant = newSourceVariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MergedModelPackage.FAMILY_MODEL__SOURCE_VARIANT, oldSourceVariant, newSourceVariant);
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
	public void setSourceVariant(Configuration newSourceVariant) {
		if (newSourceVariant != sourceVariant) {
			NotificationChain msgs = null;
			if (sourceVariant != null)
				msgs = ((InternalEObject)sourceVariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MergedModelPackage.FAMILY_MODEL__SOURCE_VARIANT, null, msgs);
			if (newSourceVariant != null)
				msgs = ((InternalEObject)newSourceVariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MergedModelPackage.FAMILY_MODEL__SOURCE_VARIANT, null, msgs);
			msgs = basicSetSourceVariant(newSourceVariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MergedModelPackage.FAMILY_MODEL__SOURCE_VARIANT, newSourceVariant, newSourceVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration getTargetVariant() {
		return targetVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetVariant(Configuration newTargetVariant, NotificationChain msgs) {
		Configuration oldTargetVariant = targetVariant;
		targetVariant = newTargetVariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MergedModelPackage.FAMILY_MODEL__TARGET_VARIANT, oldTargetVariant, newTargetVariant);
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
	public void setTargetVariant(Configuration newTargetVariant) {
		if (newTargetVariant != targetVariant) {
			NotificationChain msgs = null;
			if (targetVariant != null)
				msgs = ((InternalEObject)targetVariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MergedModelPackage.FAMILY_MODEL__TARGET_VARIANT, null, msgs);
			if (newTargetVariant != null)
				msgs = ((InternalEObject)newTargetVariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MergedModelPackage.FAMILY_MODEL__TARGET_VARIANT, null, msgs);
			msgs = basicSetTargetVariant(newTargetVariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MergedModelPackage.FAMILY_MODEL__TARGET_VARIANT, newTargetVariant, newTargetVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metric getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetric(Metric newMetric, NotificationChain msgs) {
		Metric oldMetric = metric;
		metric = newMetric;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MergedModelPackage.FAMILY_MODEL__METRIC, oldMetric, newMetric);
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
	public void setMetric(Metric newMetric) {
		if (newMetric != metric) {
			NotificationChain msgs = null;
			if (metric != null)
				msgs = ((InternalEObject)metric).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MergedModelPackage.FAMILY_MODEL__METRIC, null, msgs);
			if (newMetric != null)
				msgs = ((InternalEObject)newMetric).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MergedModelPackage.FAMILY_MODEL__METRIC, null, msgs);
			msgs = basicSetMetric(newMetric, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MergedModelPackage.FAMILY_MODEL__METRIC, newMetric, newMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementComparison> getComparedElements() {
		if (comparedElements == null) {
			comparedElements = new EObjectContainmentEList<ElementComparison>(ElementComparison.class, this, MergedModelPackage.FAMILY_MODEL__COMPARED_ELEMENTS);
		}
		return comparedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MergedModelPackage.FAMILY_MODEL__SOURCE_VARIANT:
				return basicSetSourceVariant(null, msgs);
			case MergedModelPackage.FAMILY_MODEL__TARGET_VARIANT:
				return basicSetTargetVariant(null, msgs);
			case MergedModelPackage.FAMILY_MODEL__METRIC:
				return basicSetMetric(null, msgs);
			case MergedModelPackage.FAMILY_MODEL__COMPARED_ELEMENTS:
				return ((InternalEList<?>)getComparedElements()).basicRemove(otherEnd, msgs);
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
			case MergedModelPackage.FAMILY_MODEL__SOURCE_VARIANT:
				return getSourceVariant();
			case MergedModelPackage.FAMILY_MODEL__TARGET_VARIANT:
				return getTargetVariant();
			case MergedModelPackage.FAMILY_MODEL__METRIC:
				return getMetric();
			case MergedModelPackage.FAMILY_MODEL__COMPARED_ELEMENTS:
				return getComparedElements();
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
			case MergedModelPackage.FAMILY_MODEL__SOURCE_VARIANT:
				setSourceVariant((Configuration)newValue);
				return;
			case MergedModelPackage.FAMILY_MODEL__TARGET_VARIANT:
				setTargetVariant((Configuration)newValue);
				return;
			case MergedModelPackage.FAMILY_MODEL__METRIC:
				setMetric((Metric)newValue);
				return;
			case MergedModelPackage.FAMILY_MODEL__COMPARED_ELEMENTS:
				getComparedElements().clear();
				getComparedElements().addAll((Collection<? extends ElementComparison>)newValue);
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
			case MergedModelPackage.FAMILY_MODEL__SOURCE_VARIANT:
				setSourceVariant((Configuration)null);
				return;
			case MergedModelPackage.FAMILY_MODEL__TARGET_VARIANT:
				setTargetVariant((Configuration)null);
				return;
			case MergedModelPackage.FAMILY_MODEL__METRIC:
				setMetric((Metric)null);
				return;
			case MergedModelPackage.FAMILY_MODEL__COMPARED_ELEMENTS:
				getComparedElements().clear();
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
			case MergedModelPackage.FAMILY_MODEL__SOURCE_VARIANT:
				return sourceVariant != null;
			case MergedModelPackage.FAMILY_MODEL__TARGET_VARIANT:
				return targetVariant != null;
			case MergedModelPackage.FAMILY_MODEL__METRIC:
				return metric != null;
			case MergedModelPackage.FAMILY_MODEL__COMPARED_ELEMENTS:
				return comparedElements != null && !comparedElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FamilyModelImpl
