//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ATTRIBUTE" type="{http://earthdawn.com/optionalrules}OPTIONALRULES_ATTRIBUTE"/>
 *         &lt;element name="STARTRANKS" type="{http://earthdawn.com/datatypes}USEDSTARTRANKS_type"/>
 *         &lt;element name="ATTRIBUTEBASEDMOVEMENT" type="{http://earthdawn.com/optionalrules}OPTIONALRULES_ATTRIBUTEBASEDMOVEMENT"/>
 *         &lt;element name="LEGENDPOINTSFORATTRIBUTEINCREASE" type="{http://earthdawn.com/optionalrules}OPTIONALRULE_type"/>
 *         &lt;element name="SPELLLEGENDPOINTCOST" type="{http://earthdawn.com/optionalrules}OPTIONALRULE_type"/>
 *         &lt;element name="KARMALEGENDPOINTCOST" type="{http://earthdawn.com/optionalrules}OPTIONALRULE_type"/>
 *         &lt;element name="THREADITEMDOSTACK" type="{http://earthdawn.com/optionalrules}OPTIONALRULE_type"/>
 *         &lt;element name="AUTOINCREMENTDISCIPLINETALENTS" type="{http://earthdawn.com/optionalrules}OPTIONALRULE_type"/>
 *         &lt;element name="SHOWDEFAULTSKILLS" type="{http://earthdawn.com/optionalrules}OPTIONALRULE_type"/>
 *         &lt;element name="QUESTORTALENTNEEDLEGENDPOINTS" type="{http://earthdawn.com/optionalrules}OPTIONALRULE_type"/>
 *         &lt;element name="AUTOINSERTLEGENDPOINTSPENT" type="{http://earthdawn.com/optionalrules}OPTIONALRULE_type"/>
 *         &lt;element name="KEEPLEGENDPOINTSYNC" type="{http://earthdawn.com/optionalrules}OPTIONALRULE_type"/>
 *         &lt;element name="LANGUAGESASINDIVIDUALSKILLS" type="{http://earthdawn.com/optionalrules}OPTIONALRULE_type"/>
 *         &lt;element name="ENDURINGARMORBYSTRENGTH" type="{http://earthdawn.com/optionalrules}OPTIONALRULE_type"/>
 *         &lt;element name="ALIGNINGTALENTSANDSKILLS" type="{http://earthdawn.com/optionalrules}OPTIONALRULE_type"/>
 *         &lt;element name="DATEFORMAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MULTIUSETALENT" type="{http://earthdawn.com/optionalrules}OPTIONALRULES_MULTIUSETALENT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DEFAULTOPTIONALTALENT" type="{http://earthdawn.com/optionalrules}OPTIONALRULES_DEFAULTOPTIONALTALENT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ORIGIN" type="{http://earthdawn.com/optionalrules}OPTIONALRULES_ORIGIN" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="STARTINGWEAPONS" type="{http://earthdawn.com/optionalrules}NAME_STARTINGWEAPONS_type" maxOccurs="unbounded"/>
 *         &lt;element name="STARTINGITEMS" type="{http://earthdawn.com/optionalrules}NAME_STARTINGITEMS_type" maxOccurs="unbounded"/>
 *         &lt;element name="STARTINGSKILLS" type="{http://earthdawn.com/optionalrules}NAME_STARTINGSKILLS_type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "attribute",
    "startranks",
    "attributebasedmovement",
    "legendpointsforattributeincrease",
    "spelllegendpointcost",
    "karmalegendpointcost",
    "threaditemdostack",
    "autoincrementdisciplinetalents",
    "showdefaultskills",
    "questortalentneedlegendpoints",
    "autoinsertlegendpointspent",
    "keeplegendpointsync",
    "languagesasindividualskills",
    "enduringarmorbystrength",
    "aligningtalentsandskills",
    "dateformat",
    "multiusetalent",
    "defaultoptionaltalent",
    "origin",
    "startingweapons",
    "startingitems",
    "startingskills"
})
@XmlRootElement(name = "OPTIONALRULES", namespace = "http://earthdawn.com/optionalrules")
public class OPTIONALRULES {

    @XmlElement(name = "ATTRIBUTE", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULESATTRIBUTE attribute;
    @XmlElement(name = "STARTRANKS", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected USEDSTARTRANKSType startranks;
    @XmlElement(name = "ATTRIBUTEBASEDMOVEMENT", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULESATTRIBUTEBASEDMOVEMENT attributebasedmovement;
    @XmlElement(name = "LEGENDPOINTSFORATTRIBUTEINCREASE", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULEType legendpointsforattributeincrease;
    @XmlElement(name = "SPELLLEGENDPOINTCOST", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULEType spelllegendpointcost;
    @XmlElement(name = "KARMALEGENDPOINTCOST", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULEType karmalegendpointcost;
    @XmlElement(name = "THREADITEMDOSTACK", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULEType threaditemdostack;
    @XmlElement(name = "AUTOINCREMENTDISCIPLINETALENTS", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULEType autoincrementdisciplinetalents;
    @XmlElement(name = "SHOWDEFAULTSKILLS", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULEType showdefaultskills;
    @XmlElement(name = "QUESTORTALENTNEEDLEGENDPOINTS", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULEType questortalentneedlegendpoints;
    @XmlElement(name = "AUTOINSERTLEGENDPOINTSPENT", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULEType autoinsertlegendpointspent;
    @XmlElement(name = "KEEPLEGENDPOINTSYNC", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULEType keeplegendpointsync;
    @XmlElement(name = "LANGUAGESASINDIVIDUALSKILLS", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULEType languagesasindividualskills;
    @XmlElement(name = "ENDURINGARMORBYSTRENGTH", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULEType enduringarmorbystrength;
    @XmlElement(name = "ALIGNINGTALENTSANDSKILLS", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected OPTIONALRULEType aligningtalentsandskills;
    @XmlElement(name = "DATEFORMAT", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected String dateformat;
    @XmlElement(name = "MULTIUSETALENT", namespace = "http://earthdawn.com/optionalrules")
    protected List<OPTIONALRULESMULTIUSETALENT> multiusetalent;
    @XmlElement(name = "DEFAULTOPTIONALTALENT", namespace = "http://earthdawn.com/optionalrules")
    protected List<OPTIONALRULESDEFAULTOPTIONALTALENT> defaultoptionaltalent;
    @XmlElement(name = "ORIGIN", namespace = "http://earthdawn.com/optionalrules")
    protected List<OPTIONALRULESORIGIN> origin;
    @XmlElement(name = "STARTINGWEAPONS", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected List<NAMESTARTINGWEAPONSType> startingweapons;
    @XmlElement(name = "STARTINGITEMS", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected List<NAMESTARTINGITEMSType> startingitems;
    @XmlElement(name = "STARTINGSKILLS", namespace = "http://earthdawn.com/optionalrules", required = true)
    protected List<NAMESTARTINGSKILLSType> startingskills;

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULESATTRIBUTE }
     *     
     */
    public OPTIONALRULESATTRIBUTE getATTRIBUTE() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULESATTRIBUTE }
     *     
     */
    public void setATTRIBUTE(OPTIONALRULESATTRIBUTE value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the startranks property.
     * 
     * @return
     *     possible object is
     *     {@link USEDSTARTRANKSType }
     *     
     */
    public USEDSTARTRANKSType getSTARTRANKS() {
        return startranks;
    }

    /**
     * Sets the value of the startranks property.
     * 
     * @param value
     *     allowed object is
     *     {@link USEDSTARTRANKSType }
     *     
     */
    public void setSTARTRANKS(USEDSTARTRANKSType value) {
        this.startranks = value;
    }

    /**
     * Gets the value of the attributebasedmovement property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULESATTRIBUTEBASEDMOVEMENT }
     *     
     */
    public OPTIONALRULESATTRIBUTEBASEDMOVEMENT getATTRIBUTEBASEDMOVEMENT() {
        return attributebasedmovement;
    }

    /**
     * Sets the value of the attributebasedmovement property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULESATTRIBUTEBASEDMOVEMENT }
     *     
     */
    public void setATTRIBUTEBASEDMOVEMENT(OPTIONALRULESATTRIBUTEBASEDMOVEMENT value) {
        this.attributebasedmovement = value;
    }

    /**
     * Gets the value of the legendpointsforattributeincrease property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public OPTIONALRULEType getLEGENDPOINTSFORATTRIBUTEINCREASE() {
        return legendpointsforattributeincrease;
    }

    /**
     * Sets the value of the legendpointsforattributeincrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public void setLEGENDPOINTSFORATTRIBUTEINCREASE(OPTIONALRULEType value) {
        this.legendpointsforattributeincrease = value;
    }

    /**
     * Gets the value of the spelllegendpointcost property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public OPTIONALRULEType getSPELLLEGENDPOINTCOST() {
        return spelllegendpointcost;
    }

    /**
     * Sets the value of the spelllegendpointcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public void setSPELLLEGENDPOINTCOST(OPTIONALRULEType value) {
        this.spelllegendpointcost = value;
    }

    /**
     * Gets the value of the karmalegendpointcost property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public OPTIONALRULEType getKARMALEGENDPOINTCOST() {
        return karmalegendpointcost;
    }

    /**
     * Sets the value of the karmalegendpointcost property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public void setKARMALEGENDPOINTCOST(OPTIONALRULEType value) {
        this.karmalegendpointcost = value;
    }

    /**
     * Gets the value of the threaditemdostack property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public OPTIONALRULEType getTHREADITEMDOSTACK() {
        return threaditemdostack;
    }

    /**
     * Sets the value of the threaditemdostack property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public void setTHREADITEMDOSTACK(OPTIONALRULEType value) {
        this.threaditemdostack = value;
    }

    /**
     * Gets the value of the autoincrementdisciplinetalents property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public OPTIONALRULEType getAUTOINCREMENTDISCIPLINETALENTS() {
        return autoincrementdisciplinetalents;
    }

    /**
     * Sets the value of the autoincrementdisciplinetalents property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public void setAUTOINCREMENTDISCIPLINETALENTS(OPTIONALRULEType value) {
        this.autoincrementdisciplinetalents = value;
    }

    /**
     * Gets the value of the showdefaultskills property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public OPTIONALRULEType getSHOWDEFAULTSKILLS() {
        return showdefaultskills;
    }

    /**
     * Sets the value of the showdefaultskills property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public void setSHOWDEFAULTSKILLS(OPTIONALRULEType value) {
        this.showdefaultskills = value;
    }

    /**
     * Gets the value of the questortalentneedlegendpoints property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public OPTIONALRULEType getQUESTORTALENTNEEDLEGENDPOINTS() {
        return questortalentneedlegendpoints;
    }

    /**
     * Sets the value of the questortalentneedlegendpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public void setQUESTORTALENTNEEDLEGENDPOINTS(OPTIONALRULEType value) {
        this.questortalentneedlegendpoints = value;
    }

    /**
     * Gets the value of the autoinsertlegendpointspent property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public OPTIONALRULEType getAUTOINSERTLEGENDPOINTSPENT() {
        return autoinsertlegendpointspent;
    }

    /**
     * Sets the value of the autoinsertlegendpointspent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public void setAUTOINSERTLEGENDPOINTSPENT(OPTIONALRULEType value) {
        this.autoinsertlegendpointspent = value;
    }

    /**
     * Gets the value of the keeplegendpointsync property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public OPTIONALRULEType getKEEPLEGENDPOINTSYNC() {
        return keeplegendpointsync;
    }

    /**
     * Sets the value of the keeplegendpointsync property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public void setKEEPLEGENDPOINTSYNC(OPTIONALRULEType value) {
        this.keeplegendpointsync = value;
    }

    /**
     * Gets the value of the languagesasindividualskills property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public OPTIONALRULEType getLANGUAGESASINDIVIDUALSKILLS() {
        return languagesasindividualskills;
    }

    /**
     * Sets the value of the languagesasindividualskills property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public void setLANGUAGESASINDIVIDUALSKILLS(OPTIONALRULEType value) {
        this.languagesasindividualskills = value;
    }

    /**
     * Gets the value of the enduringarmorbystrength property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public OPTIONALRULEType getENDURINGARMORBYSTRENGTH() {
        return enduringarmorbystrength;
    }

    /**
     * Sets the value of the enduringarmorbystrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public void setENDURINGARMORBYSTRENGTH(OPTIONALRULEType value) {
        this.enduringarmorbystrength = value;
    }

    /**
     * Gets the value of the aligningtalentsandskills property.
     * 
     * @return
     *     possible object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public OPTIONALRULEType getALIGNINGTALENTSANDSKILLS() {
        return aligningtalentsandskills;
    }

    /**
     * Sets the value of the aligningtalentsandskills property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTIONALRULEType }
     *     
     */
    public void setALIGNINGTALENTSANDSKILLS(OPTIONALRULEType value) {
        this.aligningtalentsandskills = value;
    }

    /**
     * Gets the value of the dateformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEFORMAT() {
        return dateformat;
    }

    /**
     * Sets the value of the dateformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEFORMAT(String value) {
        this.dateformat = value;
    }

    /**
     * Gets the value of the multiusetalent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiusetalent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMULTIUSETALENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OPTIONALRULESMULTIUSETALENT }
     * 
     * 
     */
    public List<OPTIONALRULESMULTIUSETALENT> getMULTIUSETALENT() {
        if (multiusetalent == null) {
            multiusetalent = new ArrayList<OPTIONALRULESMULTIUSETALENT>();
        }
        return this.multiusetalent;
    }

    /**
     * Gets the value of the defaultoptionaltalent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultoptionaltalent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEFAULTOPTIONALTALENT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OPTIONALRULESDEFAULTOPTIONALTALENT }
     * 
     * 
     */
    public List<OPTIONALRULESDEFAULTOPTIONALTALENT> getDEFAULTOPTIONALTALENT() {
        if (defaultoptionaltalent == null) {
            defaultoptionaltalent = new ArrayList<OPTIONALRULESDEFAULTOPTIONALTALENT>();
        }
        return this.defaultoptionaltalent;
    }

    /**
     * Gets the value of the origin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the origin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getORIGIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OPTIONALRULESORIGIN }
     * 
     * 
     */
    public List<OPTIONALRULESORIGIN> getORIGIN() {
        if (origin == null) {
            origin = new ArrayList<OPTIONALRULESORIGIN>();
        }
        return this.origin;
    }

    /**
     * Gets the value of the startingweapons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startingweapons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTARTINGWEAPONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAMESTARTINGWEAPONSType }
     * 
     * 
     */
    public List<NAMESTARTINGWEAPONSType> getSTARTINGWEAPONS() {
        if (startingweapons == null) {
            startingweapons = new ArrayList<NAMESTARTINGWEAPONSType>();
        }
        return this.startingweapons;
    }

    /**
     * Gets the value of the startingitems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startingitems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTARTINGITEMS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAMESTARTINGITEMSType }
     * 
     * 
     */
    public List<NAMESTARTINGITEMSType> getSTARTINGITEMS() {
        if (startingitems == null) {
            startingitems = new ArrayList<NAMESTARTINGITEMSType>();
        }
        return this.startingitems;
    }

    /**
     * Gets the value of the startingskills property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startingskills property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTARTINGSKILLS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAMESTARTINGSKILLSType }
     * 
     * 
     */
    public List<NAMESTARTINGSKILLSType> getSTARTINGSKILLS() {
        if (startingskills == null) {
            startingskills = new ArrayList<NAMESTARTINGSKILLSType>();
        }
        return this.startingskills;
    }

}
