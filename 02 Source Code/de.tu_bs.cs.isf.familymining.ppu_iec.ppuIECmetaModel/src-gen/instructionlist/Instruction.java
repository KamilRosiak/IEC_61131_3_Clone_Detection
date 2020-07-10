/**
 */
package instructionlist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instructionlist.Instruction#getOperator <em>Operator</em>}</li>
 *   <li>{@link instructionlist.Instruction#getOperands <em>Operands</em>}</li>
 *   <li>{@link instructionlist.Instruction#getLabel <em>Label</em>}</li>
 *   <li>{@link instructionlist.Instruction#getNextInstruction <em>Next Instruction</em>}</li>
 *   <li>{@link instructionlist.Instruction#getPrevInstruction <em>Prev Instruction</em>}</li>
 * </ul>
 *
 * @see instructionlist.InstructionListPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(Operator)
	 * @see instructionlist.InstructionListPackage#getInstruction_Operator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link instructionlist.Instruction#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link instructionlist.Operand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see instructionlist.InstructionListPackage#getInstruction_Operands()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operand> getOperands();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see instructionlist.InstructionListPackage#getInstruction_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link instructionlist.Instruction#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Next Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Instruction</em>' reference.
	 * @see #setNextInstruction(Instruction)
	 * @see instructionlist.InstructionListPackage#getInstruction_NextInstruction()
	 * @model
	 * @generated
	 */
	Instruction getNextInstruction();

	/**
	 * Sets the value of the '{@link instructionlist.Instruction#getNextInstruction <em>Next Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Instruction</em>' reference.
	 * @see #getNextInstruction()
	 * @generated
	 */
	void setNextInstruction(Instruction value);

	/**
	 * Returns the value of the '<em><b>Prev Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev Instruction</em>' reference.
	 * @see #setPrevInstruction(Instruction)
	 * @see instructionlist.InstructionListPackage#getInstruction_PrevInstruction()
	 * @model
	 * @generated
	 */
	Instruction getPrevInstruction();

	/**
	 * Sets the value of the '{@link instructionlist.Instruction#getPrevInstruction <em>Prev Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev Instruction</em>' reference.
	 * @see #getPrevInstruction()
	 * @generated
	 */
	void setPrevInstruction(Instruction value);

} // Instruction
