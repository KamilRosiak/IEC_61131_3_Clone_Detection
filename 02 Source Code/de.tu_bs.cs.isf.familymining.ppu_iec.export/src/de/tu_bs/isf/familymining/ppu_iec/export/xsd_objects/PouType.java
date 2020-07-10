//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.06 at 10:56:18 AM MEZ 
//


package de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pouType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pouType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="function"/>
 *     &lt;enumeration value="functionBlock"/>
 *     &lt;enumeration value="program"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pouType")
@XmlEnum
public enum PouType {

    @XmlEnumValue("function")
    FUNCTION("function"),
    @XmlEnumValue("functionBlock")
    FUNCTION_BLOCK("functionBlock"),
    @XmlEnumValue("program")
    PROGRAM("program");
    private final String value;

    PouType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PouType fromValue(String v) {
        for (PouType c: PouType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}