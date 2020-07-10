/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getLabel <em>Label</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getDescription <em>Description</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getWeight <em>Weight</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#isIsOption <em>Is Option</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getChildAttributes <em>Child Attributes</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getParentAttribute <em>Parent Attribute</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getTargetType <em>Target Type</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage#getComparisonAttribute()
 * @model
 * @generated
 */
public interface ComparisonAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage#getComparisonAttribute_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage#getComparisonAttribute_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(Float)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage#getComparisonAttribute_Weight()
	 * @model default="0"
	 * @generated
	 */
	Float getWeight();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(Float value);

	/**
	 * Returns the value of the '<em><b>Is Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Option</em>' attribute.
	 * @see #setIsOption(boolean)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage#getComparisonAttribute_IsOption()
	 * @model
	 * @generated
	 */
	boolean isIsOption();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#isIsOption <em>Is Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Option</em>' attribute.
	 * @see #isIsOption()
	 * @generated
	 */
	void setIsOption(boolean value);

	/**
	 * Returns the value of the '<em><b>Child Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Attributes</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage#getComparisonAttribute_ChildAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComparisonAttribute> getChildAttributes();

	/**
	 * Returns the value of the '<em><b>Parent Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Attribute</em>' reference.
	 * @see #setParentAttribute(ComparisonAttribute)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage#getComparisonAttribute_ParentAttribute()
	 * @model
	 * @generated
	 */
	ComparisonAttribute getParentAttribute();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getParentAttribute <em>Parent Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Attribute</em>' reference.
	 * @see #getParentAttribute()
	 * @generated
	 */
	void setParentAttribute(ComparisonAttribute value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonTarget
	 * @see #setTargetType(ComparisonTarget)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonMetricPackage#getComparisonAttribute_TargetType()
	 * @model
	 * @generated
	 */
	ComparisonTarget getTargetType();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonAttribute#getTargetType <em>Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.comparisonMetric.comparisonMetric.ComparisonTarget
	 * @see #getTargetType()
	 * @generated
	 */
	void setTargetType(ComparisonTarget value);

} // ComparisonAttribute
