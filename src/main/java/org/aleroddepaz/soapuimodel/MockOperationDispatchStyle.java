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
 * <p>Java class for MockOperationDispatchStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MockOperationDispatchStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RANDOM"/>
 *     &lt;enumeration value="SEQUENCE"/>
 *     &lt;enumeration value="XPATH"/>
 *     &lt;enumeration value="SCRIPT"/>
 *     &lt;enumeration value="QUERY_MATCH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MockOperationDispatchStyle")
@XmlEnum
public enum MockOperationDispatchStyle {

    RANDOM,
    SEQUENCE,
    XPATH,
    SCRIPT,
    QUERY_MATCH;

    public String value() {
        return name();
    }

    public static MockOperationDispatchStyle fromValue(String v) {
        return valueOf(v);
    }

}
