package de.tu_bs.isf.familymining.ppu_iec.export.factories;

import javax.inject.Singleton;

import org.eclipse.e4.core.di.annotations.Creatable;

import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.configuration.Variable;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.DataType;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.DataType.Derived;
import de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects.DataType.Wstring;

/**
 * {@code <type>..</type>} factory.
 */
@Creatable
@Singleton
public class TypeFactory {

	/**
	 * @param variable Variable.
	 * @return {@code <type>..</type>} with inner type.
	 */
	public DataType createDataType(Variable variable) {

		DataType dataType = new DataType();

		switch (variable.getType()) {
		case BOOL:
			dataType.setBOOL(true);
			break;
		case BYTE:
			dataType.setBYTE(true);
			break;
		case DATE:
			dataType.setDATE(true);
			break;
		case DATE_AND_TIME:
			dataType.setANYDATE(true);
			break;
		case DERIVED:
			Derived derived = new Derived();
			derived.setName(variable.getTypeName());
			dataType.setDerived(derived);
			break;
		case DINT:
			dataType.setDINT(true);
			break;
		case DWORD:
			dataType.setDWORD(true);
			break;
		case INT:
			dataType.setINT(true);
			break;
		case LINT:
			dataType.setLINT(true);
			break;
		case LREAL:
			dataType.setLREAL(true);
			break;
		case LWORD:
			dataType.setLWORD(true);
			break;
		case REAL:
			dataType.setREAL(true);
			break;
		case SINT:
			dataType.setSINT(true);
			break;
		case STRING:
			dataType.setString(new DataType.String());
			break;
		case TIME:
			dataType.setTIME(true);
			break;
		case TIME_OF_DAY:
			dataType.setTIME(true);
			break;
		case TOD:
			dataType.setTOD(true);
			break;
		case UDINT:
			dataType.setUDINT(true);
			break;
		case UINT:
			dataType.setUINT(true);
			break;
		case UNSET:
			dataType.setANY(true);
			break;
		case USINT:
			dataType.setUSINT(true);
			break;
		case WORD:
			dataType.setWORD(true);
			break;
		case WSTRING:
			dataType.setWstring(new Wstring());
			break;
		default:
			dataType.setANY(true);
			break;
		}

		return dataType;
	}

}
