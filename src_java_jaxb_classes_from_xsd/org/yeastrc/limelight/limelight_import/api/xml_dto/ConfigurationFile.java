//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.21 at 10:06:54 AM PDT 
//


package org.yeastrc.limelight.limelight_import.api.xml_dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{}file_content"/>
 *       &lt;/sequence>
 *       &lt;attribute name="search_program" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="file_name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileContent"
})
@XmlRootElement(name = "configuration_file")
public class ConfigurationFile {

    @XmlElement(name = "file_content", required = true)
    protected byte[] fileContent;
    @XmlAttribute(name = "search_program", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String searchProgram;
    @XmlAttribute(name = "file_name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String fileName;

    /**
     * Gets the value of the fileContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileContent() {
        return fileContent;
    }

    /**
     * Sets the value of the fileContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileContent(byte[] value) {
        this.fileContent = value;
    }

    /**
     * Gets the value of the searchProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchProgram() {
        return searchProgram;
    }

    /**
     * Sets the value of the searchProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchProgram(String value) {
        this.searchProgram = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

}
