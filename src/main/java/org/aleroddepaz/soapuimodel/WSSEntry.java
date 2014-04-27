//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.27 at 05:36:21 PM CEST 
//


package org.aleroddepaz.soapuimodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSSEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSSEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://eviware.com/soapui/config}RegistryEntry">
 *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="keyIdentifierType" type="{http://eviware.com/soapui/config}KeyIdentifierType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSSEntry")
@XmlSeeAlso({
    WSSAddTimestamp.class,
    WSSAddUsernameEntry.class
})
public class WSSEntry
    extends RegistryEntry
{

    @XmlAttribute(name = "username")
    protected String username;
    @XmlAttribute(name = "password")
    protected String password;
    @XmlAttribute(name = "keyIdentifierType")
    protected KeyIdentifierType keyIdentifierType;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the keyIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link KeyIdentifierType }
     *     
     */
    public KeyIdentifierType getKeyIdentifierType() {
        return keyIdentifierType;
    }

    /**
     * Sets the value of the keyIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyIdentifierType }
     *     
     */
    public void setKeyIdentifierType(KeyIdentifierType value) {
        this.keyIdentifierType = value;
    }

}