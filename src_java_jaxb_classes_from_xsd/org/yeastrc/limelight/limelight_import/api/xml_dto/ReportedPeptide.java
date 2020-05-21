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
 *         &lt;element ref="{}psms"/>
 *         &lt;element name="reported_peptide_annotations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}filterable_reported_peptide_annotations" minOccurs="0"/>
 *                   &lt;element ref="{}descriptive_reported_peptide_annotations" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}peptide_modifications" minOccurs="0"/>
 *         &lt;element ref="{}peptide_isotope_labels" minOccurs="0"/>
 *         &lt;element ref="{}matched_proteins_for_peptide" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="reported_peptide_string" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sequence" use="required" type="{}sequence_type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "psms",
    "reportedPeptideAnnotations",
    "peptideModifications",
    "peptideIsotopeLabels",
    "matchedProteinsForPeptide"
})
@XmlRootElement(name = "reported_peptide")
public class ReportedPeptide {

    @XmlElement(required = true)
    protected Psms psms;
    @XmlElement(name = "reported_peptide_annotations")
    protected ReportedPeptide.ReportedPeptideAnnotations reportedPeptideAnnotations;
    @XmlElement(name = "peptide_modifications")
    protected PeptideModifications peptideModifications;
    @XmlElement(name = "peptide_isotope_labels")
    protected PeptideIsotopeLabels peptideIsotopeLabels;
    @XmlElement(name = "matched_proteins_for_peptide")
    protected MatchedProteinsForPeptide matchedProteinsForPeptide;
    @XmlAttribute(name = "reported_peptide_string", required = true)
    protected String reportedPeptideString;
    @XmlAttribute(name = "sequence", required = true)
    protected String sequence;

    /**
     * The PSMs found for this reported peptide in this search.
     * 
     * @return
     *     possible object is
     *     {@link Psms }
     *     
     */
    public Psms getPsms() {
        return psms;
    }

    /**
     * Sets the value of the psms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Psms }
     *     
     */
    public void setPsms(Psms value) {
        this.psms = value;
    }

    /**
     * Gets the value of the reportedPeptideAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedPeptide.ReportedPeptideAnnotations }
     *     
     */
    public ReportedPeptide.ReportedPeptideAnnotations getReportedPeptideAnnotations() {
        return reportedPeptideAnnotations;
    }

    /**
     * Sets the value of the reportedPeptideAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedPeptide.ReportedPeptideAnnotations }
     *     
     */
    public void setReportedPeptideAnnotations(ReportedPeptide.ReportedPeptideAnnotations value) {
        this.reportedPeptideAnnotations = value;
    }

    /**
     * The variable modifications identified for this reported peptide. E.g., if phosphorylation was searched for, store those modifcations here. Do not list static / fixed modifications (e.g. 57 on C)
     * 
     * @return
     *     possible object is
     *     {@link PeptideModifications }
     *     
     */
    public PeptideModifications getPeptideModifications() {
        return peptideModifications;
    }

    /**
     * Sets the value of the peptideModifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeptideModifications }
     *     
     */
    public void setPeptideModifications(PeptideModifications value) {
        this.peptideModifications = value;
    }

    /**
     * Gets the value of the peptideIsotopeLabels property.
     * 
     * @return
     *     possible object is
     *     {@link PeptideIsotopeLabels }
     *     
     */
    public PeptideIsotopeLabels getPeptideIsotopeLabels() {
        return peptideIsotopeLabels;
    }

    /**
     * Sets the value of the peptideIsotopeLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeptideIsotopeLabels }
     *     
     */
    public void setPeptideIsotopeLabels(PeptideIsotopeLabels value) {
        this.peptideIsotopeLabels = value;
    }

    /**
     * Gets the value of the matchedProteinsForPeptide property.
     * 
     * @return
     *     possible object is
     *     {@link MatchedProteinsForPeptide }
     *     
     */
    public MatchedProteinsForPeptide getMatchedProteinsForPeptide() {
        return matchedProteinsForPeptide;
    }

    /**
     * Sets the value of the matchedProteinsForPeptide property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchedProteinsForPeptide }
     *     
     */
    public void setMatchedProteinsForPeptide(MatchedProteinsForPeptide value) {
        this.matchedProteinsForPeptide = value;
    }

    /**
     * Gets the value of the reportedPeptideString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportedPeptideString() {
        return reportedPeptideString;
    }

    /**
     * Sets the value of the reportedPeptideString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportedPeptideString(String value) {
        this.reportedPeptideString = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
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
     *         &lt;element ref="{}filterable_reported_peptide_annotations" minOccurs="0"/>
     *         &lt;element ref="{}descriptive_reported_peptide_annotations" minOccurs="0"/>
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
        "filterableReportedPeptideAnnotations",
        "descriptiveReportedPeptideAnnotations"
    })
    public static class ReportedPeptideAnnotations {

        @XmlElement(name = "filterable_reported_peptide_annotations")
        protected FilterableReportedPeptideAnnotations filterableReportedPeptideAnnotations;
        @XmlElement(name = "descriptive_reported_peptide_annotations")
        protected DescriptiveReportedPeptideAnnotations descriptiveReportedPeptideAnnotations;

        /**
         * Gets the value of the filterableReportedPeptideAnnotations property.
         * 
         * @return
         *     possible object is
         *     {@link FilterableReportedPeptideAnnotations }
         *     
         */
        public FilterableReportedPeptideAnnotations getFilterableReportedPeptideAnnotations() {
            return filterableReportedPeptideAnnotations;
        }

        /**
         * Sets the value of the filterableReportedPeptideAnnotations property.
         * 
         * @param value
         *     allowed object is
         *     {@link FilterableReportedPeptideAnnotations }
         *     
         */
        public void setFilterableReportedPeptideAnnotations(FilterableReportedPeptideAnnotations value) {
            this.filterableReportedPeptideAnnotations = value;
        }

        /**
         * Gets the value of the descriptiveReportedPeptideAnnotations property.
         * 
         * @return
         *     possible object is
         *     {@link DescriptiveReportedPeptideAnnotations }
         *     
         */
        public DescriptiveReportedPeptideAnnotations getDescriptiveReportedPeptideAnnotations() {
            return descriptiveReportedPeptideAnnotations;
        }

        /**
         * Sets the value of the descriptiveReportedPeptideAnnotations property.
         * 
         * @param value
         *     allowed object is
         *     {@link DescriptiveReportedPeptideAnnotations }
         *     
         */
        public void setDescriptiveReportedPeptideAnnotations(DescriptiveReportedPeptideAnnotations value) {
            this.descriptiveReportedPeptideAnnotations = value;
        }

    }

}
