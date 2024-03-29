//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.27 at 05:36:21 PM CEST 
//


package org.aleroddepaz.soapuimodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSinkStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSinkStep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataSink" type="{http://eviware.com/soapui/config}DataSink"/>
 *         &lt;element name="skipOnEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="shared" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="properties" type="{http://eviware.com/soapui/config}PropertiesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSinkStep", propOrder = {
    "dataSink",
    "skipOnEmpty",
    "shared",
    "properties"
})
public class DataSinkStep {

    @XmlElement(required = true)
    protected DataSink dataSink;
    protected boolean skipOnEmpty;
    protected boolean shared;
    @XmlElement(required = true)
    protected PropertiesType properties;

    /**
     * Gets the value of the dataSink property.
     * 
     * @return
     *     possible object is
     *     {@link DataSink }
     *     
     */
    public DataSink getDataSink() {
        return dataSink;
    }

    /**
     * Sets the value of the dataSink property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSink }
     *     
     */
    public void setDataSink(DataSink value) {
        this.dataSink = value;
    }

    /**
     * Gets the value of the skipOnEmpty property.
     * 
     */
    public boolean isSkipOnEmpty() {
        return skipOnEmpty;
    }

    /**
     * Sets the value of the skipOnEmpty property.
     * 
     */
    public void setSkipOnEmpty(boolean value) {
        this.skipOnEmpty = value;
    }

    /**
     * Gets the value of the shared property.
     * 
     */
    public boolean isShared() {
        return shared;
    }

    /**
     * Sets the value of the shared property.
     * 
     */
    public void setShared(boolean value) {
        this.shared = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setProperties(PropertiesType value) {
        this.properties = value;
    }

}
