//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.06 at 10:56:18 AM MEZ 
//


package de.tu_bs.isf.familymining.ppu_iec.export.xsd_objects;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Describes a connection between the consumer element (eg. input variable of a function block) and the producer element (eg. output variable of a function block). It may contain a list of positions that describes the path of the connection.
 * 
 * <p>Java class for connection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.plcopen.org/xml/tc6_0201}position" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="addData" type="{http://www.plcopen.org/xml/tc6_0201}addData" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="globalId" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="refLocalId" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="formalParameter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connection", propOrder = {
    "position",
    "addData"
})
public class Connection {

    protected List<Position> position;
    protected AddData addData;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String globalId;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger refLocalId;
    @XmlAttribute
    protected String formalParameter;

    /**
     * Gets the value of the position property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Position }
     * 
     * 
     */
    public List<Position> getPosition() {
        if (position == null) {
            position = new ArrayList<Position>();
        }
        return this.position;
    }

    /**
     * Gets the value of the addData property.
     * 
     * @return
     *     possible object is
     *     {@link AddData }
     *     
     */
    public AddData getAddData() {
        return addData;
    }

    /**
     * Sets the value of the addData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddData }
     *     
     */
    public void setAddData(AddData value) {
        this.addData = value;
    }

    /**
     * Gets the value of the globalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalId() {
        return globalId;
    }

    /**
     * Sets the value of the globalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalId(String value) {
        this.globalId = value;
    }

    /**
     * Gets the value of the refLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefLocalId() {
        return refLocalId;
    }

    /**
     * Sets the value of the refLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefLocalId(BigInteger value) {
        this.refLocalId = value;
    }

    /**
     * Gets the value of the formalParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormalParameter() {
        return formalParameter;
    }

    /**
     * Sets the value of the formalParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormalParameter(String value) {
        this.formalParameter = value;
    }

}
