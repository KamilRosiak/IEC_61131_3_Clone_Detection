/**
 */
package instructionlist;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Standard_Operator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instructionlist.Operator#getType <em>Type</em>}</li>
 *   <li>{@link instructionlist.Operator#getModifier <em>Modifier</em>}</li>
 *   <li>{@link instructionlist.Operator#getFunctioncall <em>Functioncall</em>}</li>
 * </ul>
 *
 * @see instructionlist.InstructionListPackage#getOperator()
 * @model
 * @generated
 */
public interface Operator extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Standard_Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Standard_Operator
	 * @see #setType(Standard_Operator)
	 * @see instructionlist.InstructionListPackage#getOperator_Type()
	 * @model
	 * @generated
	 */
	Standard_Operator getType();

	/**
	 * Sets the value of the '{@link instructionlist.Operator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Standard_Operator
	 * @see #getType()
	 * @generated
	 */
	void setType(Standard_Operator value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' attribute.
	 * The default value is <code>"UNSET"</code>.
	 * The literals are from the enumeration {@link instructionlist.IL_Modifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' attribute.
	 * @see instructionlist.IL_Modifier
	 * @see #setModifier(IL_Modifier)
	 * @see instructionlist.InstructionListPackage#getOperator_Modifier()
	 * @model default="UNSET"
	 * @generated
	 */
	IL_Modifier getModifier();

	/**
	 * Sets the value of the '{@link instructionlist.Operator#getModifier <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' attribute.
	 * @see instructionlist.IL_Modifier
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(IL_Modifier value);

	/**
	 * Returns the value of the '<em><b>Functioncall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functioncall</em>' containment reference.
	 * @see #setFunctioncall(FunctionCall)
	 * @see instructionlist.InstructionListPackage#getOperator_Functioncall()
	 * @model containment="true"
	 * @generated
	 */
	FunctionCall getFunctioncall();

	/**
	 * Sets the value of the '{@link instructionlist.Operator#getFunctioncall <em>Functioncall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functioncall</em>' containment reference.
	 * @see #getFunctioncall()
	 * @generated
	 */
	void setFunctioncall(FunctionCall value);

} // Operator
