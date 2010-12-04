//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.04 at 02:38:25 PM MEZ 
//


package de.earthdawn.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for THREADRANK_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="THREADRANK_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="rank" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="keyknowledge" use="required" type="{http://earthdawn.com}yesno_type" />
 *       &lt;attribute name="lpcost" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="attribute" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="effect" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "THREADRANK_type")
public class THREADRANKType {

    @XmlAttribute(required = true)
    protected BigInteger rank;
    @XmlAttribute(required = true)
    protected YesnoType keyknowledge;
    @XmlAttribute(required = true)
    protected BigInteger lpcost;
    @XmlAttribute(required = true)
    protected BigInteger attribute;
    @XmlAttribute(required = true)
    protected String effect;

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRank(BigInteger value) {
        this.rank = value;
    }

    /**
     * Gets the value of the keyknowledge property.
     * 
     * @return
     *     possible object is
     *     {@link YesnoType }
     *     
     */
    public YesnoType getKeyknowledge() {
        return keyknowledge;
    }

    /**
     * Sets the value of the keyknowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *     
     */
    public void setKeyknowledge(YesnoType value) {
        this.keyknowledge = value;
    }

    /**
     * Gets the value of the lpcost property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLpcost() {
        return lpcost;
    }

    /**
     * Sets the value of the lpcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLpcost(BigInteger value) {
        this.lpcost = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAttribute(BigInteger value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the effect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffect() {
        return effect;
    }

    /**
     * Sets the value of the effect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffect(String value) {
        this.effect = value;
    }

}
