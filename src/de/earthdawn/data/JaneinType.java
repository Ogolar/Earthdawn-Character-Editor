//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.01 at 11:44:24 AM MEZ 
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for janein_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="janein_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="j"/>
 *     &lt;enumeration value="n"/>
 *     &lt;enumeration value="-"/>
 *     &lt;enumeration value="*"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "janein_type")
@XmlEnum
public enum JaneinType {

    @XmlEnumValue("j")
    J("j"),
    @XmlEnumValue("n")
    N("n"),
    @XmlEnumValue("-")
    MINUS("-"),
    @XmlEnumValue("*")
    STERN("*");
    private final String value;

    JaneinType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JaneinType fromValue(String v) {
        for (JaneinType c: JaneinType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
