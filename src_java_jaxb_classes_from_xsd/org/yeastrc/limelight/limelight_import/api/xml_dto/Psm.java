//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.25 at 01:00:07 PM PDT 
//


package org.yeastrc.limelight.limelight_import.api.xml_dto;

import java.math.BigDecimal;
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
 *         &lt;element ref="{}psm_modifications" minOccurs="0"/>
 *         &lt;element ref="{}psm_open_modification" minOccurs="0"/>
 *         &lt;element ref="{}reporter_ions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="scan_number" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="precursor_charge" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="precursor_retention_time" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="precursor_m_z" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="scan_file_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subgroup_name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "descriptivePsmAnnotations",
    "psmModifications",
    "psmOpenModification",
    "reporterIons"
})
@XmlRootElement(name = "psm")
public class Psm {

    @XmlElement(name = "filterable_psm_annotations", required = true)
    protected FilterablePsmAnnotations filterablePsmAnnotations;
    @XmlElement(name = "descriptive_psm_annotations")
    protected DescriptivePsmAnnotations descriptivePsmAnnotations;
    @XmlElement(name = "psm_modifications")
    protected PsmModifications psmModifications;
    @XmlElement(name = "psm_open_modification")
    protected PsmOpenModification psmOpenModification;
    @XmlElement(name = "reporter_ions")
    protected ReporterIons reporterIons;
    @XmlAttribute(name = "scan_number", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger scanNumber;
    @XmlAttribute(name = "precursor_charge", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger precursorCharge;
    @XmlAttribute(name = "precursor_retention_time")
    protected BigDecimal precursorRetentionTime;
    @XmlAttribute(name = "precursor_m_z")
    protected BigDecimal precursorMZ;
    @XmlAttribute(name = "scan_file_name")
    protected String scanFileName;
    @XmlAttribute(name = "subgroup_name")
    protected String subgroupName;

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
     * Not common. If there are PSM-level variable / dynamic modification data (ie, each PSM has a distinct mass for the observed modification), such as in the case of open mod searches, store those data here. Do not list static / fixed modifications (e.g. 57 on C)  NOTE: If PSM modifications are defined: All PSMs needs to have a psm_modifications section with its own mass defined for the given position. And, these positions must match one or more of the positions defined for modifications the peptide level.
     * 
     * @return
     *     possible object is
     *     {@link PsmModifications }
     *     
     */
    public PsmModifications getPsmModifications() {
        return psmModifications;
    }

    /**
     * Sets the value of the psmModifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsmModifications }
     *     
     */
    public void setPsmModifications(PsmModifications value) {
        this.psmModifications = value;
    }

    /**
     * If an open modification was found for this PSM (e.g. using msfragger, magnum or cometPTM) associate the found open mod mass with the PSM here. An open mod is essentially an unidentified and unlocalized difference in mass between this peptide and the observed mass of the precursor--though some algorithms will attempt to localize it. There can only be one open mod mass associated with a PSM, though there may be multiple localizations for it (see "psm_open_modification_position" element). 
     * 
     * @return
     *     possible object is
     *     {@link PsmOpenModification }
     *     
     */
    public PsmOpenModification getPsmOpenModification() {
        return psmOpenModification;
    }

    /**
     * Sets the value of the psmOpenModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsmOpenModification }
     *     
     */
    public void setPsmOpenModification(PsmOpenModification value) {
        this.psmOpenModification = value;
    }

    /**
     * Gets the value of the reporterIons property.
     * 
     * @return
     *     possible object is
     *     {@link ReporterIons }
     *     
     */
    public ReporterIons getReporterIons() {
        return reporterIons;
    }

    /**
     * Sets the value of the reporterIons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReporterIons }
     *     
     */
    public void setReporterIons(ReporterIons value) {
        this.reporterIons = value;
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

    /**
     * Gets the value of the precursorRetentionTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecursorRetentionTime() {
        return precursorRetentionTime;
    }

    /**
     * Sets the value of the precursorRetentionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecursorRetentionTime(BigDecimal value) {
        this.precursorRetentionTime = value;
    }

    /**
     * Gets the value of the precursorMZ property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecursorMZ() {
        return precursorMZ;
    }

    /**
     * Sets the value of the precursorMZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecursorMZ(BigDecimal value) {
        this.precursorMZ = value;
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
     * Gets the value of the subgroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubgroupName() {
        return subgroupName;
    }

    /**
     * Sets the value of the subgroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubgroupName(String value) {
        this.subgroupName = value;
    }

}
