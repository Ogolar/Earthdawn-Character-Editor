//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.26 at 10:48:51 PM MESZ 
//


package de.earthdawn.data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WIDERSTANDSKRAFT_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WIDERSTANDSKRAFT_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="körperlich" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="magisch" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="sozial" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WIDERSTANDSKRAFT_type")
public class WIDERSTANDSKRAFTType {

    @XmlAttribute(required = true)
    protected BigInteger körperlich;
    @XmlAttribute(required = true)
    protected BigInteger magisch;
    @XmlAttribute(required = true)
    protected BigInteger sozial;

    /**
     * Gets the value of the körperlich property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKörperlich() {
        return körperlich;
    }

    /**
     * Sets the value of the körperlich property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKörperlich(BigInteger value) {
        this.körperlich = value;
    }

    /**
     * Gets the value of the magisch property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMagisch() {
        return magisch;
    }

    /**
     * Sets the value of the magisch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMagisch(BigInteger value) {
        this.magisch = value;
    }

    /**
     * Gets the value of the sozial property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSozial() {
        return sozial;
    }

    /**
     * Sets the value of the sozial property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSozial(BigInteger value) {
        this.sozial = value;
    }

}
