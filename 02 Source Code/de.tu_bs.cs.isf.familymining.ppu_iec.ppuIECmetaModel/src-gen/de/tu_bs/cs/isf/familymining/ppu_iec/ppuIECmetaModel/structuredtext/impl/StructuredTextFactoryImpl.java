/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredTextFactoryImpl extends EFactoryImpl implements StructuredTextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructuredTextFactory init() {
		try {
			StructuredTextFactory theStructuredTextFactory = (StructuredTextFactory)EPackage.Registry.INSTANCE.getEFactory(StructuredTextPackage.eNS_URI);
			if (theStructuredTextFactory != null) {
				return theStructuredTextFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructuredTextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredTextFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StructuredTextPackage.STRUCTURED_TEXT: return (EObject)createStructuredText();
			case StructuredTextPackage.ASSIGNMENT: return (EObject)createAssignment();
			case StructuredTextPackage.IF: return (EObject)createIf();
			case StructuredTextPackage.CONDITIONAL_BLOCK: return (EObject)createConditionalBlock();
			case StructuredTextPackage.CASE: return (EObject)createCase();
			case StructuredTextPackage.CASE_BLOCK: return (EObject)createCaseBlock();
			case StructuredTextPackage.FUNCTION_CALL_STATEMENT: return (EObject)createFunctionCallStatement();
			case StructuredTextPackage.UNBOUNDED_LOOP: return (EObject)createUnboundedLoop();
			case StructuredTextPackage.FOR_LOOP: return (EObject)createForLoop();
			case StructuredTextPackage.EXIT_STATEMENT: return (EObject)createExitStatement();
			case StructuredTextPackage.RETURN_STATEMENT: return (EObject)createReturnStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StructuredTextPackage.STATEMENT_TYPE:
				return createStatementTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StructuredTextPackage.STATEMENT_TYPE:
				return convertStatementTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuredText createStructuredText() {
		StructuredTextImpl structuredText = new StructuredTextImpl();
		return structuredText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalBlock createConditionalBlock() {
		ConditionalBlockImpl conditionalBlock = new ConditionalBlockImpl();
		return conditionalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseBlock createCaseBlock() {
		CaseBlockImpl caseBlock = new CaseBlockImpl();
		return caseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionCallStatement createFunctionCallStatement() {
		FunctionCallStatementImpl functionCallStatement = new FunctionCallStatementImpl();
		return functionCallStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnboundedLoop createUnboundedLoop() {
		UnboundedLoopImpl unboundedLoop = new UnboundedLoopImpl();
		return unboundedLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForLoop createForLoop() {
		ForLoopImpl forLoop = new ForLoopImpl();
		return forLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExitStatement createExitStatement() {
		ExitStatementImpl exitStatement = new ExitStatementImpl();
		return exitStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnStatement createReturnStatement() {
		ReturnStatementImpl returnStatement = new ReturnStatementImpl();
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementType createStatementTypeFromString(EDataType eDataType, String initialValue) {
		StatementType result = StatementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuredTextPackage getStructuredTextPackage() {
		return (StructuredTextPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructuredTextPackage getPackage() {
		return StructuredTextPackage.eINSTANCE;
	}

} //StructuredTextFactoryImpl
