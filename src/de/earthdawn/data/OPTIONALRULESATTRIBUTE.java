//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OPTIONALRULES_ATTRIBUTE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OPTIONALRULES_ATTRIBUTE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="points" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="limitoneway" type="{http://earthdawn.com/datatypes}yesno_type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPTIONALRULES_ATTRIBUTE", namespace = "http://earthdawn.com/optionalrules")
public class OPTIONALRULESATTRIBUTE {

    @XmlAttribute
    protected Integer points;
    @XmlAttribute
    protected YesnoType limitoneway;

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPoints(Integer value) {
        this.points = value;
    }

    /**
     * Gets the value of the limitoneway property.
     * 
     * @return
     *     possible object is
     *     {@link YesnoType }
     *     
     */
    public YesnoType getLimitoneway() {
        return limitoneway;
    }

    /**
     * Sets the value of the limitoneway property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *     
     */
    public void setLimitoneway(YesnoType value) {
        this.limitoneway = value;
    }

}