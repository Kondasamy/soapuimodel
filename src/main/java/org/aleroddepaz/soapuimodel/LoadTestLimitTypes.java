//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.27 at 05:36:21 PM CEST 
//


package org.aleroddepaz.soapuimodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadTestLimitTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoadTestLimitTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COUNT"/>
 *     &lt;enumeration value="TIME"/>
 *     &lt;enumeration value="COUNT_PER_THREAD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoadTestLimitTypes")
@XmlEnum
public enum LoadTestLimitTypes {

    COUNT,
    TIME,
    COUNT_PER_THREAD;

    public String value() {
        return name();
    }

    public static LoadTestLimitTypes fromValue(String v) {
        return valueOf(v);
    }

}
