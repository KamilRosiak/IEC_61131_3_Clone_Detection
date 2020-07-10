/**
 */
package instructionlist;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jump</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instructionlist.Jump#getTargetNetwork <em>Target Network</em>}</li>
 * </ul>
 *
 * @see instructionlist.InstructionListPackage#getJump()
 * @model
 * @generated
 */
public interface Jump extends Instruction {
	/**
	 * Returns the value of the '<em><b>Target Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Network</em>' reference.
	 * @see #setTargetNetwork(Network)
	 * @see instructionlist.InstructionListPackage#getJump_TargetNetwork()
	 * @model required="true"
	 * @generated
	 */
	Network getTargetNetwork();

	/**
	 * Sets the value of the '{@link instructionlist.Jump#getTargetNetwork <em>Target Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Network</em>' reference.
	 * @see #getTargetNetwork()
	 * @generated
	 */
	void setTargetNetwork(Network value);

} // Jump
