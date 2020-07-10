/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.interfaces.EObjectSerializable;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.Comment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Declaration#getInputVariables <em>Input Variables</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Declaration#getComment <em>Comment</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Declaration#getInOutVariables <em>In Out Variables</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Declaration#getInternalVariables <em>Internal Variables</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Declaration#getOutputVariables <em>Output Variables</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Declaration#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getDeclaration()
 * @model
 * @extends EObjectSerializable
 * @generated
 */
public interface Declaration extends EObjectSerializable {
	/**
	 * Returns the value of the '<em><b>Input Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Variables</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getDeclaration_InputVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getInputVariables();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getDeclaration_Comment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComment();

	/**
	 * Returns the value of the '<em><b>In Out Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Out Variables</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getDeclaration_InOutVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getInOutVariables();

	/**
	 * Returns the value of the '<em><b>Internal Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Variables</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getDeclaration_InternalVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getInternalVariables();

	/**
	 * Returns the value of the '<em><b>Output Variables</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Variables</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getDeclaration_OutputVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getOutputVariables();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Struct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getDeclaration_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<Struct> getTypes();

} // Declaration
