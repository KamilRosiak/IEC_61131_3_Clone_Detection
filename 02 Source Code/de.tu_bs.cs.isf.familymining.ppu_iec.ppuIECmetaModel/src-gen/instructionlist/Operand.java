/**
 */
package instructionlist;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instructionlist.Operand#getNextOperand <em>Next Operand</em>}</li>
 *   <li>{@link instructionlist.Operand#getPrevOperand <em>Prev Operand</em>}</li>
 *   <li>{@link instructionlist.Operand#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see instructionlist.InstructionListPackage#getOperand()
 * @model
 * @generated
 */
public interface Operand extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Operand</em>' reference.
	 * @see #setNextOperand(Operand)
	 * @see instructionlist.InstructionListPackage#getOperand_NextOperand()
	 * @model
	 * @generated
	 */
	Operand getNextOperand();

	/**
	 * Sets the value of the '{@link instructionlist.Operand#getNextOperand <em>Next Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Operand</em>' reference.
	 * @see #getNextOperand()
	 * @generated
	 */
	void setNextOperand(Operand value);

	/**
	 * Returns the value of the '<em><b>Prev Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev Operand</em>' reference.
	 * @see #setPrevOperand(Operand)
	 * @see instructionlist.InstructionListPackage#getOperand_PrevOperand()
	 * @model
	 * @generated
	 */
	Operand getPrevOperand();

	/**
	 * Sets the value of the '{@link instructionlist.Operand#getPrevOperand <em>Prev Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev Operand</em>' reference.
	 * @see #getPrevOperand()
	 * @generated
	 */
	void setPrevOperand(Operand value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see instructionlist.InstructionListPackage#getOperand_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link instructionlist.Operand#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // Operand
