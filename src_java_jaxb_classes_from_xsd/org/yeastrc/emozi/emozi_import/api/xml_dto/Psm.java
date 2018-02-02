//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.01 at 04:57:51 PM PST 
//


package org.yeastrc.emozi.emozi_import.api.xml_dto;

import java.math.BigInteger;
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
 *         &lt;element ref="{}filterable_psm_annotations"/>
 *         &lt;element ref="{}descriptive_psm_annotations" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="scan_file_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scan_number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="precursor_charge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filterablePsmAnnotations",
    "descriptivePsmAnnotations"
})
@XmlRootElement(name = "psm")
public class Psm {

    @XmlElement(name = "filterable_psm_annotations", required = true)
    protected FilterablePsmAnnotations filterablePsmAnnotations;
    @XmlElement(name = "descriptive_psm_annotations")
    protected DescriptivePsmAnnotations descriptivePsmAnnotations;
    @XmlAttribute(name = "scan_file_name")
    protected String scanFileName;
    @XmlAttribute(name = "scan_number")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger scanNumber;
    @XmlAttribute(name = "precursor_charge")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger precursorCharge;

    /**
     * Gets the value of the filterablePsmAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link FilterablePsmAnnotations }
     *     
     */
    public FilterablePsmAnnotations getFilterablePsmAnnotations() {
        return filterablePsmAnnotations;
    }

    /**
     * Sets the value of the filterablePsmAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterablePsmAnnotations }
     *     
     */
    public void setFilterablePsmAnnotations(FilterablePsmAnnotations value) {
        this.filterablePsmAnnotations = value;
    }

    /**
     * The descriptive annotations (numeric or string) assigned to the peptide spectrum match (PSM) that are not meant to describe the quality of the match or filter out poor matches.
     * 
     * @return
     *     possible object is
     *     {@link DescriptivePsmAnnotations }
     *     
     */
    public DescriptivePsmAnnotations getDescriptivePsmAnnotations() {
        return descriptivePsmAnnotations;
    }

    /**
     * Sets the value of the descriptivePsmAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptivePsmAnnotations }
     *     
     */
    public void setDescriptivePsmAnnotations(DescriptivePsmAnnotations value) {
        this.descriptivePsmAnnotations = value;
    }

    /**
     * Gets the value of the scanFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanFileName() {
        return scanFileName;
    }

    /**
     * Sets the value of the scanFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanFileName(String value) {
        this.scanFileName = value;
    }

    /**
     * Gets the value of the scanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScanNumber() {
        return scanNumber;
    }

    /**
     * Sets the value of the scanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScanNumber(BigInteger value) {
        this.scanNumber = value;
    }

    /**
     * Gets the value of the precursorCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrecursorCharge() {
        return precursorCharge;
    }

    /**
     * Sets the value of the precursorCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrecursorCharge(BigInteger value) {
        this.precursorCharge = value;
    }

}
