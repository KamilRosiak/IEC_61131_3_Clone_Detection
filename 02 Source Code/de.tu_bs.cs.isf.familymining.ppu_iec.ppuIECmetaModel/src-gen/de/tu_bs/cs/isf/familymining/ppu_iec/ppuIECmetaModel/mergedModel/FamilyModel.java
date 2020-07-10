/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel;

import de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.Metric;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel#getSourceVariant <em>Source Variant</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel#getTargetVariant <em>Target Variant</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel#getMetric <em>Metric</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel#getComparedElements <em>Compared Elements</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage#getFamilyModel()
 * @model
 * @generated
 */
public interface FamilyModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Variant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Variant</em>' containment reference.
	 * @see #setSourceVariant(Configuration)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage#getFamilyModel_SourceVariant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Configuration getSourceVariant();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel#getSourceVariant <em>Source Variant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Variant</em>' containment reference.
	 * @see #getSourceVariant()
	 * @generated
	 */
	void setSourceVariant(Configuration value);

	/**
	 * Returns the value of the '<em><b>Target Variant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Variant</em>' containment reference.
	 * @see #setTargetVariant(Configuration)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage#getFamilyModel_TargetVariant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Configuration getTargetVariant();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel#getTargetVariant <em>Target Variant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Variant</em>' containment reference.
	 * @see #getTargetVariant()
	 * @generated
	 */
	void setTargetVariant(Configuration value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' containment reference.
	 * @see #setMetric(Metric)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage#getFamilyModel_Metric()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Metric getMetric();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.FamilyModel#getMetric <em>Metric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' containment reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metric value);

	/**
	 * Returns the value of the '<em><b>Compared Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compared Elements</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage#getFamilyModel_ComparedElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ElementComparison> getComparedElements();

} // FamilyModel
