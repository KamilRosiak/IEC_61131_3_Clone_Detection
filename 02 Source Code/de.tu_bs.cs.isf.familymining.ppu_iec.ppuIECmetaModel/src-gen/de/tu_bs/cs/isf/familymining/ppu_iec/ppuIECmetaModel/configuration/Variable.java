/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.interfaces.EObjectSerializable;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ElementaryDataType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable#getScope <em>Scope</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable#getType <em>Type</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable#getLocation <em>Location</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable#isArray <em>Array</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getVariable()
 * @model
 * @extends EObjectSerializable
 * @generated
 */
public interface Variable extends EObjectSerializable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.VariableDeclaration
	 * @see #setScope(VariableDeclaration)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getVariable_Scope()
	 * @model
	 * @generated
	 */
	VariableDeclaration getScope();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.VariableDeclaration
	 * @see #getScope()
	 * @generated
	 */
	void setScope(VariableDeclaration value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ElementaryDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ElementaryDataType
	 * @see #setType(ElementaryDataType)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getVariable_Type()
	 * @model
	 * @generated
	 */
	ElementaryDataType getType();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.ElementaryDataType
	 * @see #getType()
	 * @generated
	 */
	void setType(ElementaryDataType value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getVariable_Location()
	 * @model containment="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getVariable_TypeName()
	 * @model required="true"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Array</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' attribute.
	 * @see #setArray(boolean)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getVariable_Array()
	 * @model default="false"
	 * @generated
	 */
	boolean isArray();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable#isArray <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' attribute.
	 * @see #isArray()
	 * @generated
	 */
	void setArray(boolean value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(Expression)
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.ConfigurationPackage#getVariable_InitialValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitialValue();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(Expression value);

} // Variable
