/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getSimilarity <em>Similarity</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getSubElements <em>Sub Elements</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getParentElement <em>Parent Element</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getVariability <em>Variability</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage#getElementComparison()
 * @model
 * @generated
 */
public interface ElementComparison extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' containment reference.
	 * @see #setSourceElement(EObject)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage#getElementComparison_SourceElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EObject getSourceElement();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getSourceElement <em>Source Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' containment reference.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' containment reference.
	 * @see #setTargetElement(EObject)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage#getElementComparison_TargetElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EObject getTargetElement();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getTargetElement <em>Target Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' containment reference.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Similarity</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Similarity</em>' attribute.
	 * @see #setSimilarity(float)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage#getElementComparison_Similarity()
	 * @model default="-1" required="true"
	 * @generated
	 */
	float getSimilarity();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getSimilarity <em>Similarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Similarity</em>' attribute.
	 * @see #getSimilarity()
	 * @generated
	 */
	void setSimilarity(float value);

	/**
	 * Returns the value of the '<em><b>Sub Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Elements</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage#getElementComparison_SubElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementComparison> getSubElements();

	/**
	 * Returns the value of the '<em><b>Parent Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Element</em>' containment reference.
	 * @see #setParentElement(ElementComparison)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage#getElementComparison_ParentElement()
	 * @model containment="true"
	 * @generated
	 */
	ElementComparison getParentElement();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getParentElement <em>Parent Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Element</em>' containment reference.
	 * @see #getParentElement()
	 * @generated
	 */
	void setParentElement(ElementComparison value);

	/**
	 * Returns the value of the '<em><b>Variability</b></em>' attribute.
	 * The default value is <code>"UNDEFINED"</code>.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.VariabilityCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variability</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.VariabilityCategory
	 * @see #setVariability(VariabilityCategory)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.MergedModelPackage#getElementComparison_Variability()
	 * @model default="UNDEFINED"
	 * @generated
	 */
	VariabilityCategory getVariability();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.ElementComparison#getVariability <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variability</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.mergedModel.VariabilityCategory
	 * @see #getVariability()
	 * @generated
	 */
	void setVariability(VariabilityCategory value);

} // ElementComparison
