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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyTransfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceStep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourcePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetStep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://eviware.com/soapui/config}PropertyTransferTypes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="failOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="setNullOnMissingSource" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="transferTextContent" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignoreEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="transferToAll" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="useXQuery" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="disabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="transferChildNodes" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="entitize" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyTransfer", propOrder = {
    "name",
    "sourceType",
    "sourceStep",
    "sourcePath",
    "targetType",
    "targetStep",
    "targetPath",
    "type"
})
public class PropertyTransfer {

    @XmlElement(required = true)
    protected String name;
    protected String sourceType;
    protected String sourceStep;
    @XmlElement(required = true)
    protected String sourcePath;
    protected String targetType;
    protected String targetStep;
    @XmlElement(required = true)
    protected String targetPath;
    @XmlElement(defaultValue = "XPATH")
    protected PropertyTransferTypes type;
    @XmlAttribute(name = "failOnError")
    protected Boolean failOnError;
    @XmlAttribute(name = "setNullOnMissingSource")
    protected Boolean setNullOnMissingSource;
    @XmlAttribute(name = "transferTextContent")
    protected Boolean transferTextContent;
    @XmlAttribute(name = "ignoreEmpty")
    protected Boolean ignoreEmpty;
    @XmlAttribute(name = "transferToAll")
    protected Boolean transferToAll;
    @XmlAttribute(name = "useXQuery")
    protected Boolean useXQuery;
    @XmlAttribute(name = "disabled")
    protected Boolean disabled;
    @XmlAttribute(name = "transferChildNodes")
    protected Boolean transferChildNodes;
    @XmlAttribute(name = "entitize")
    protected Boolean entitize;

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

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceType(String value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the sourceStep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceStep() {
        return sourceStep;
    }

    /**
     * Sets the value of the sourceStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceStep(String value) {
        this.sourceStep = value;
    }

    /**
     * Gets the value of the sourcePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcePath() {
        return sourcePath;
    }

    /**
     * Sets the value of the sourcePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcePath(String value) {
        this.sourcePath = value;
    }

    /**
     * Gets the value of the targetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * Sets the value of the targetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetType(String value) {
        this.targetType = value;
    }

    /**
     * Gets the value of the targetStep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetStep() {
        return targetStep;
    }

    /**
     * Sets the value of the targetStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetStep(String value) {
        this.targetStep = value;
    }

    /**
     * Gets the value of the targetPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPath() {
        return targetPath;
    }

    /**
     * Sets the value of the targetPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPath(String value) {
        this.targetPath = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyTransferTypes }
     *     
     */
    public PropertyTransferTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyTransferTypes }
     *     
     */
    public void setType(PropertyTransferTypes value) {
        this.type = value;
    }

    /**
     * Gets the value of the failOnError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailOnError() {
        return failOnError;
    }

    /**
     * Sets the value of the failOnError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailOnError(Boolean value) {
        this.failOnError = value;
    }

    /**
     * Gets the value of the setNullOnMissingSource property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetNullOnMissingSource() {
        return setNullOnMissingSource;
    }

    /**
     * Sets the value of the setNullOnMissingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetNullOnMissingSource(Boolean value) {
        this.setNullOnMissingSource = value;
    }

    /**
     * Gets the value of the transferTextContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferTextContent() {
        return transferTextContent;
    }

    /**
     * Sets the value of the transferTextContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferTextContent(Boolean value) {
        this.transferTextContent = value;
    }

    /**
     * Gets the value of the ignoreEmpty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreEmpty() {
        return ignoreEmpty;
    }

    /**
     * Sets the value of the ignoreEmpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreEmpty(Boolean value) {
        this.ignoreEmpty = value;
    }

    /**
     * Gets the value of the transferToAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferToAll() {
        return transferToAll;
    }

    /**
     * Sets the value of the transferToAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferToAll(Boolean value) {
        this.transferToAll = value;
    }

    /**
     * Gets the value of the useXQuery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseXQuery() {
        return useXQuery;
    }

    /**
     * Sets the value of the useXQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseXQuery(Boolean value) {
        this.useXQuery = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabled(Boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the transferChildNodes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferChildNodes() {
        return transferChildNodes;
    }

    /**
     * Sets the value of the transferChildNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferChildNodes(Boolean value) {
        this.transferChildNodes = value;
    }

    /**
     * Gets the value of the entitize property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntitize() {
        return entitize;
    }

    /**
     * Sets the value of the entitize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntitize(Boolean value) {
        this.entitize = value;
    }

}
