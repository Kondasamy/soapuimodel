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
 *         &lt;element name="Request">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Header" type="{http://eviware.com/soapui/config}TestOnDemandHeader"/>
 *                   &lt;element name="Body" type="{http://eviware.com/soapui/config}TestOnDemandLocationBody"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="api_version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "request"
})
@XmlRootElement(name = "TestOnDemandLocationsRequest")
public class TestOnDemandLocationsRequest {

    @XmlElement(name = "Request", required = true)
    protected TestOnDemandLocationsRequest.Request request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link TestOnDemandLocationsRequest.Request }
     *     
     */
    public TestOnDemandLocationsRequest.Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestOnDemandLocationsRequest.Request }
     *     
     */
    public void setRequest(TestOnDemandLocationsRequest.Request value) {
        this.request = value;
    }


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
     *         &lt;element name="Header" type="{http://eviware.com/soapui/config}TestOnDemandHeader"/>
     *         &lt;element name="Body" type="{http://eviware.com/soapui/config}TestOnDemandLocationBody"/>
     *       &lt;/sequence>
     *       &lt;attribute name="api_version" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "header",
        "body"
    })
    public static class Request {

        @XmlElement(name = "Header", required = true)
        protected TestOnDemandHeader header;
        @XmlElement(name = "Body", required = true)
        protected TestOnDemandLocationBody body;
        @XmlAttribute(name = "api_version")
        protected String apiVersion;

        /**
         * Gets the value of the header property.
         * 
         * @return
         *     possible object is
         *     {@link TestOnDemandHeader }
         *     
         */
        public TestOnDemandHeader getHeader() {
            return header;
        }

        /**
         * Sets the value of the header property.
         * 
         * @param value
         *     allowed object is
         *     {@link TestOnDemandHeader }
         *     
         */
        public void setHeader(TestOnDemandHeader value) {
            this.header = value;
        }

        /**
         * Gets the value of the body property.
         * 
         * @return
         *     possible object is
         *     {@link TestOnDemandLocationBody }
         *     
         */
        public TestOnDemandLocationBody getBody() {
            return body;
        }

        /**
         * Sets the value of the body property.
         * 
         * @param value
         *     allowed object is
         *     {@link TestOnDemandLocationBody }
         *     
         */
        public void setBody(TestOnDemandLocationBody value) {
            this.body = value;
        }

        /**
         * Gets the value of the apiVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApiVersion() {
            return apiVersion;
        }

        /**
         * Sets the value of the apiVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApiVersion(String value) {
            this.apiVersion = value;
        }

    }

}
