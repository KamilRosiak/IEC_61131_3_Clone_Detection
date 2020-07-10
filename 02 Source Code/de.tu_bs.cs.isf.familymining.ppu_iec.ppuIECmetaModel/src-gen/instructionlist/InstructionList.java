/**
 */
package instructionlist;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.languageelement.LanguageElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link instructionlist.InstructionList#getName <em>Name</em>}</li>
 *   <li>{@link instructionlist.InstructionList#getNetwork <em>Network</em>}</li>
 * </ul>
 *
 * @see instructionlist.InstructionListPackage#getInstructionList()
 * @model
 * @generated
 */
public interface InstructionList extends EObject, LanguageElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see instructionlist.InstructionListPackage#getInstructionList_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link instructionlist.InstructionList#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference list.
	 * The list contents are of type {@link instructionlist.Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference list.
	 * @see instructionlist.InstructionListPackage#getInstructionList_Network()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Network> getNetwork();

} // InstructionList
