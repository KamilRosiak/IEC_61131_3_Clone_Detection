/**
 */
package de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.impl.POUImpl;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.AbstractPOUCall;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.Statement;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StatementType;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredText;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.StructuredTextPackage;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.Identifier;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtextexpression.StructuredTextExpressionPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract POU Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AbstractPOUCallImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AbstractPOUCallImpl#getStatementType <em>Statement Type</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AbstractPOUCallImpl#getAbsStartLine <em>Abs Start Line</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AbstractPOUCallImpl#getAbsEndLine <em>Abs End Line</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AbstractPOUCallImpl#getRelStartLine <em>Rel Start Line</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AbstractPOUCallImpl#getRelEndLine <em>Rel End Line</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AbstractPOUCallImpl#getStartColumnPos <em>Start Column Pos</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AbstractPOUCallImpl#getEndColumnPos <em>End Column Pos</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.structuredtext.impl.AbstractPOUCallImpl#getStructuredText <em>Structured Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractPOUCallImpl extends POUImpl implements AbstractPOUCall {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatementType() <em>Statement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementType()
	 * @generated
	 * @ordered
	 */
	protected static final StatementType STATEMENT_TYPE_EDEFAULT = StatementType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getStatementType() <em>Statement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementType()
	 * @generated
	 * @ordered
	 */
	protected StatementType statementType = STATEMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbsStartLine() <em>Abs Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsStartLine()
	 * @generated
	 * @ordered
	 */
	protected static final int ABS_START_LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAbsStartLine() <em>Abs Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsStartLine()
	 * @generated
	 * @ordered
	 */
	protected int absStartLine = ABS_START_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbsEndLine() <em>Abs End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsEndLine()
	 * @generated
	 * @ordered
	 */
	protected static final int ABS_END_LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAbsEndLine() <em>Abs End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsEndLine()
	 * @generated
	 * @ordered
	 */
	protected int absEndLine = ABS_END_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelStartLine() <em>Rel Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelStartLine()
	 * @generated
	 * @ordered
	 */
	protected static final int REL_START_LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRelStartLine() <em>Rel Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelStartLine()
	 * @generated
	 * @ordered
	 */
	protected int relStartLine = REL_START_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelEndLine() <em>Rel End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelEndLine()
	 * @generated
	 * @ordered
	 */
	protected static final int REL_END_LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRelEndLine() <em>Rel End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelEndLine()
	 * @generated
	 * @ordered
	 */
	protected int relEndLine = REL_END_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartColumnPos() <em>Start Column Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartColumnPos()
	 * @generated
	 * @ordered
	 */
	protected static final int START_COLUMN_POS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartColumnPos() <em>Start Column Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartColumnPos()
	 * @generated
	 * @ordered
	 */
	protected int startColumnPos = START_COLUMN_POS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndColumnPos() <em>End Column Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndColumnPos()
	 * @generated
	 * @ordered
	 */
	protected static final int END_COLUMN_POS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndColumnPos() <em>End Column Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndColumnPos()
	 * @generated
	 * @ordered
	 */
	protected int endColumnPos = END_COLUMN_POS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructuredText() <em>Structured Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredText()
	 * @generated
	 * @ordered
	 */
	protected StructuredText structuredText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPOUCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredTextPackage.Literals.ABSTRACT_POU_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredTextPackage.ABSTRACT_POU_CALL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatementType getStatementType() {
		return statementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatementType(StatementType newStatementType) {
		StatementType oldStatementType = statementType;
		statementType = newStatementType == null ? STATEMENT_TYPE_EDEFAULT : newStatementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredTextPackage.ABSTRACT_POU_CALL__STATEMENT_TYPE, oldStatementType, statementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAbsStartLine() {
		return absStartLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbsStartLine(int newAbsStartLine) {
		int oldAbsStartLine = absStartLine;
		absStartLine = newAbsStartLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredTextPackage.ABSTRACT_POU_CALL__ABS_START_LINE, oldAbsStartLine, absStartLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAbsEndLine() {
		return absEndLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbsEndLine(int newAbsEndLine) {
		int oldAbsEndLine = absEndLine;
		absEndLine = newAbsEndLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredTextPackage.ABSTRACT_POU_CALL__ABS_END_LINE, oldAbsEndLine, absEndLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRelStartLine() {
		return relStartLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelStartLine(int newRelStartLine) {
		int oldRelStartLine = relStartLine;
		relStartLine = newRelStartLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredTextPackage.ABSTRACT_POU_CALL__REL_START_LINE, oldRelStartLine, relStartLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRelEndLine() {
		return relEndLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelEndLine(int newRelEndLine) {
		int oldRelEndLine = relEndLine;
		relEndLine = newRelEndLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredTextPackage.ABSTRACT_POU_CALL__REL_END_LINE, oldRelEndLine, relEndLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartColumnPos() {
		return startColumnPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartColumnPos(int newStartColumnPos) {
		int oldStartColumnPos = startColumnPos;
		startColumnPos = newStartColumnPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredTextPackage.ABSTRACT_POU_CALL__START_COLUMN_POS, oldStartColumnPos, startColumnPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEndColumnPos() {
		return endColumnPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndColumnPos(int newEndColumnPos) {
		int oldEndColumnPos = endColumnPos;
		endColumnPos = newEndColumnPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredTextPackage.ABSTRACT_POU_CALL__END_COLUMN_POS, oldEndColumnPos, endColumnPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuredText getStructuredText() {
		if (structuredText != null && ((EObject)structuredText).eIsProxy()) {
			InternalEObject oldStructuredText = (InternalEObject)structuredText;
			structuredText = (StructuredText)eResolveProxy(oldStructuredText);
			if (structuredText != oldStructuredText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuredTextPackage.ABSTRACT_POU_CALL__STRUCTURED_TEXT, oldStructuredText, structuredText));
			}
		}
		return structuredText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredText basicGetStructuredText() {
		return structuredText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStructuredText(StructuredText newStructuredText) {
		StructuredText oldStructuredText = structuredText;
		structuredText = newStructuredText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredTextPackage.ABSTRACT_POU_CALL__STRUCTURED_TEXT, oldStructuredText, structuredText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		String[] lines = structuredText.getText().split("\\n");
		String startLineString = lines[absStartLine-1];
		String endLineString = lines[absEndLine-1];
		
		int startCharInText = 0;
		for (int index = 0; index < absStartLine-1; index++) {
			startCharInText += lines[index].length()+1;
		}
		startCharInText += startColumnPos;
		
		int endCharInText = 0;
		for (int index = 0; index < absEndLine-1; index++) {
			endCharInText += lines[index].length()+1;
		}
		endCharInText += endColumnPos+1;
		
		return structuredText.getText().substring(startCharInText, endCharInText).trim();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuredTextPackage.ABSTRACT_POU_CALL__ID:
				return getId();
			case StructuredTextPackage.ABSTRACT_POU_CALL__STATEMENT_TYPE:
				return getStatementType();
			case StructuredTextPackage.ABSTRACT_POU_CALL__ABS_START_LINE:
				return getAbsStartLine();
			case StructuredTextPackage.ABSTRACT_POU_CALL__ABS_END_LINE:
				return getAbsEndLine();
			case StructuredTextPackage.ABSTRACT_POU_CALL__REL_START_LINE:
				return getRelStartLine();
			case StructuredTextPackage.ABSTRACT_POU_CALL__REL_END_LINE:
				return getRelEndLine();
			case StructuredTextPackage.ABSTRACT_POU_CALL__START_COLUMN_POS:
				return getStartColumnPos();
			case StructuredTextPackage.ABSTRACT_POU_CALL__END_COLUMN_POS:
				return getEndColumnPos();
			case StructuredTextPackage.ABSTRACT_POU_CALL__STRUCTURED_TEXT:
				if (resolve) return getStructuredText();
				return basicGetStructuredText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructuredTextPackage.ABSTRACT_POU_CALL__ID:
				setId((String)newValue);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__STATEMENT_TYPE:
				setStatementType((StatementType)newValue);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__ABS_START_LINE:
				setAbsStartLine((Integer)newValue);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__ABS_END_LINE:
				setAbsEndLine((Integer)newValue);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__REL_START_LINE:
				setRelStartLine((Integer)newValue);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__REL_END_LINE:
				setRelEndLine((Integer)newValue);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__START_COLUMN_POS:
				setStartColumnPos((Integer)newValue);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__END_COLUMN_POS:
				setEndColumnPos((Integer)newValue);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__STRUCTURED_TEXT:
				setStructuredText((StructuredText)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StructuredTextPackage.ABSTRACT_POU_CALL__ID:
				setId(ID_EDEFAULT);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__STATEMENT_TYPE:
				setStatementType(STATEMENT_TYPE_EDEFAULT);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__ABS_START_LINE:
				setAbsStartLine(ABS_START_LINE_EDEFAULT);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__ABS_END_LINE:
				setAbsEndLine(ABS_END_LINE_EDEFAULT);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__REL_START_LINE:
				setRelStartLine(REL_START_LINE_EDEFAULT);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__REL_END_LINE:
				setRelEndLine(REL_END_LINE_EDEFAULT);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__START_COLUMN_POS:
				setStartColumnPos(START_COLUMN_POS_EDEFAULT);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__END_COLUMN_POS:
				setEndColumnPos(END_COLUMN_POS_EDEFAULT);
				return;
			case StructuredTextPackage.ABSTRACT_POU_CALL__STRUCTURED_TEXT:
				setStructuredText((StructuredText)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StructuredTextPackage.ABSTRACT_POU_CALL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case StructuredTextPackage.ABSTRACT_POU_CALL__STATEMENT_TYPE:
				return statementType != STATEMENT_TYPE_EDEFAULT;
			case StructuredTextPackage.ABSTRACT_POU_CALL__ABS_START_LINE:
				return absStartLine != ABS_START_LINE_EDEFAULT;
			case StructuredTextPackage.ABSTRACT_POU_CALL__ABS_END_LINE:
				return absEndLine != ABS_END_LINE_EDEFAULT;
			case StructuredTextPackage.ABSTRACT_POU_CALL__REL_START_LINE:
				return relStartLine != REL_START_LINE_EDEFAULT;
			case StructuredTextPackage.ABSTRACT_POU_CALL__REL_END_LINE:
				return relEndLine != REL_END_LINE_EDEFAULT;
			case StructuredTextPackage.ABSTRACT_POU_CALL__START_COLUMN_POS:
				return startColumnPos != START_COLUMN_POS_EDEFAULT;
			case StructuredTextPackage.ABSTRACT_POU_CALL__END_COLUMN_POS:
				return endColumnPos != END_COLUMN_POS_EDEFAULT;
			case StructuredTextPackage.ABSTRACT_POU_CALL__STRUCTURED_TEXT:
				return structuredText != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Identifier.class) {
			switch (derivedFeatureID) {
				case StructuredTextPackage.ABSTRACT_POU_CALL__ID: return StructuredTextExpressionPackage.IDENTIFIER__ID;
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (derivedFeatureID) {
				case StructuredTextPackage.ABSTRACT_POU_CALL__STATEMENT_TYPE: return StructuredTextPackage.STATEMENT__STATEMENT_TYPE;
				case StructuredTextPackage.ABSTRACT_POU_CALL__ABS_START_LINE: return StructuredTextPackage.STATEMENT__ABS_START_LINE;
				case StructuredTextPackage.ABSTRACT_POU_CALL__ABS_END_LINE: return StructuredTextPackage.STATEMENT__ABS_END_LINE;
				case StructuredTextPackage.ABSTRACT_POU_CALL__REL_START_LINE: return StructuredTextPackage.STATEMENT__REL_START_LINE;
				case StructuredTextPackage.ABSTRACT_POU_CALL__REL_END_LINE: return StructuredTextPackage.STATEMENT__REL_END_LINE;
				case StructuredTextPackage.ABSTRACT_POU_CALL__START_COLUMN_POS: return StructuredTextPackage.STATEMENT__START_COLUMN_POS;
				case StructuredTextPackage.ABSTRACT_POU_CALL__END_COLUMN_POS: return StructuredTextPackage.STATEMENT__END_COLUMN_POS;
				case StructuredTextPackage.ABSTRACT_POU_CALL__STRUCTURED_TEXT: return StructuredTextPackage.STATEMENT__STRUCTURED_TEXT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Identifier.class) {
			switch (baseFeatureID) {
				case StructuredTextExpressionPackage.IDENTIFIER__ID: return StructuredTextPackage.ABSTRACT_POU_CALL__ID;
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (baseFeatureID) {
				case StructuredTextPackage.STATEMENT__STATEMENT_TYPE: return StructuredTextPackage.ABSTRACT_POU_CALL__STATEMENT_TYPE;
				case StructuredTextPackage.STATEMENT__ABS_START_LINE: return StructuredTextPackage.ABSTRACT_POU_CALL__ABS_START_LINE;
				case StructuredTextPackage.STATEMENT__ABS_END_LINE: return StructuredTextPackage.ABSTRACT_POU_CALL__ABS_END_LINE;
				case StructuredTextPackage.STATEMENT__REL_START_LINE: return StructuredTextPackage.ABSTRACT_POU_CALL__REL_START_LINE;
				case StructuredTextPackage.STATEMENT__REL_END_LINE: return StructuredTextPackage.ABSTRACT_POU_CALL__REL_END_LINE;
				case StructuredTextPackage.STATEMENT__START_COLUMN_POS: return StructuredTextPackage.ABSTRACT_POU_CALL__START_COLUMN_POS;
				case StructuredTextPackage.STATEMENT__END_COLUMN_POS: return StructuredTextPackage.ABSTRACT_POU_CALL__END_COLUMN_POS;
				case StructuredTextPackage.STATEMENT__STRUCTURED_TEXT: return StructuredTextPackage.ABSTRACT_POU_CALL__STRUCTURED_TEXT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Identifier.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (baseOperationID) {
				case StructuredTextPackage.STATEMENT___GET_TEXT: return StructuredTextPackage.ABSTRACT_POU_CALL___GET_TEXT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StructuredTextPackage.ABSTRACT_POU_CALL___GET_TEXT:
				return getText();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", statementType: ");
		result.append(statementType);
		result.append(", absStartLine: ");
		result.append(absStartLine);
		result.append(", absEndLine: ");
		result.append(absEndLine);
		result.append(", relStartLine: ");
		result.append(relStartLine);
		result.append(", relEndLine: ");
		result.append(relEndLine);
		result.append(", startColumnPos: ");
		result.append(startColumnPos);
		result.append(", endColumnPos: ");
		result.append(endColumnPos);
		result.append(')');
		return result.toString();
	}

} //AbstractPOUCallImpl
