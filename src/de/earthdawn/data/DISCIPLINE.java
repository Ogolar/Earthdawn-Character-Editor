//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DURABILITY" type="{http://earthdawn.com/discipline}DISCIPLINEDURABILITY_type"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="OPTIONALTALENT" type="{http://earthdawn.com/datatypes}TALENTABILITY_type" maxOccurs="8" minOccurs="5"/>
 *           &lt;sequence maxOccurs="4">
 *             &lt;element name="DISCIPLINETALENT" type="{http://earthdawn.com/datatypes}TALENTABILITY_type" maxOccurs="8" minOccurs="0"/>
 *             &lt;element name="SPELL" type="{http://earthdawn.com/discipline}DISCIPLINESPELL_type" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="SPELLABILITY" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="DEFENSE" type="{http://earthdawn.com/datatypes}DEFENSEABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="INITIATIVE" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="RECOVERYTEST" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="KARMA" type="{http://earthdawn.com/datatypes}KARMAABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="KARMASTEP" type="{http://earthdawn.com/datatypes}DISZIPINABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element name="ABILITY" type="{http://earthdawn.com/datatypes}CIRCLENAME_type" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="lang" use="required" type="{http://earthdawn.com/datatypes}language_type" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "durability",
    "optionaltalentOrDISCIPLINETALENTAndSPELL"
})
@XmlRootElement(name = "DISCIPLINE", namespace = "http://earthdawn.com/discipline")
public class DISCIPLINE {

    @XmlElement(name = "DURABILITY", namespace = "http://earthdawn.com/discipline", required = true)
    protected DISCIPLINEDURABILITYType durability;
    @XmlElementRefs({
        @XmlElementRef(name = "INITIATIVE", namespace = "http://earthdawn.com/discipline", type = JAXBElement.class),
        @XmlElementRef(name = "ABILITY", namespace = "http://earthdawn.com/discipline", type = JAXBElement.class),
        @XmlElementRef(name = "SPELLABILITY", namespace = "http://earthdawn.com/discipline", type = JAXBElement.class),
        @XmlElementRef(name = "DISCIPLINETALENT", namespace = "http://earthdawn.com/discipline", type = JAXBElement.class),
        @XmlElementRef(name = "KARMASTEP", namespace = "http://earthdawn.com/discipline", type = JAXBElement.class),
        @XmlElementRef(name = "RECOVERYTEST", namespace = "http://earthdawn.com/discipline", type = JAXBElement.class),
        @XmlElementRef(name = "SPELL", namespace = "http://earthdawn.com/discipline", type = JAXBElement.class),
        @XmlElementRef(name = "OPTIONALTALENT", namespace = "http://earthdawn.com/discipline", type = JAXBElement.class),
        @XmlElementRef(name = "DEFENSE", namespace = "http://earthdawn.com/discipline", type = JAXBElement.class),
        @XmlElementRef(name = "KARMA", namespace = "http://earthdawn.com/discipline", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> optionaltalentOrDISCIPLINETALENTAndSPELL;
    @XmlAttribute(required = true)
    protected LanguageType lang;
    @XmlAttribute(required = true)
    protected String name;

    /**
     * Gets the value of the durability property.
     * 
     * @return
     *     possible object is
     *     {@link DISCIPLINEDURABILITYType }
     *     
     */
    public DISCIPLINEDURABILITYType getDURABILITY() {
        return durability;
    }

    /**
     * Sets the value of the durability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DISCIPLINEDURABILITYType }
     *     
     */
    public void setDURABILITY(DISCIPLINEDURABILITYType value) {
        this.durability = value;
    }

    /**
     * Gets the value of the optionaltalentOrDISCIPLINETALENTAndSPELL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionaltalentOrDISCIPLINETALENTAndSPELL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOPTIONALTALENTOrDISCIPLINETALENTAndSPELL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DISZIPINABILITYType }{@code >}
     * {@link JAXBElement }{@code <}{@link DISZIPINABILITYType }{@code >}
     * {@link JAXBElement }{@code <}{@link CIRCLENAMEType }{@code >}
     * {@link JAXBElement }{@code <}{@link DISZIPINABILITYType }{@code >}
     * {@link JAXBElement }{@code <}{@link TALENTABILITYType }{@code >}
     * {@link JAXBElement }{@code <}{@link DISZIPINABILITYType }{@code >}
     * {@link JAXBElement }{@code <}{@link DISCIPLINESPELLType }{@code >}
     * {@link JAXBElement }{@code <}{@link DEFENSEABILITYType }{@code >}
     * {@link JAXBElement }{@code <}{@link TALENTABILITYType }{@code >}
     * {@link JAXBElement }{@code <}{@link KARMAABILITYType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getOPTIONALTALENTOrDISCIPLINETALENTAndSPELL() {
        if (optionaltalentOrDISCIPLINETALENTAndSPELL == null) {
            optionaltalentOrDISCIPLINETALENTAndSPELL = new ArrayList<JAXBElement<?>>();
        }
        return this.optionaltalentOrDISCIPLINETALENTAndSPELL;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setLang(LanguageType value) {
        this.lang = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
