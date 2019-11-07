//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.07 at 02:47:46 PM PST 
//


package org.yeastrc.limelight.limelight_import.api.xml_dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}filterable_matched_protein_annotation" maxOccurs="unbounded"/>
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
    "filterableMatchedProteinAnnotation"
})
@XmlRootElement(name = "filterable_matched_protein_annotations")
public class FilterableMatchedProteinAnnotations {

    @XmlElement(name = "filterable_matched_protein_annotation", required = true)
    protected List<FilterableMatchedProteinAnnotation> filterableMatchedProteinAnnotation;

    /**
     * An annotation or score assigned to a reported peptide Gets the value of the filterableMatchedProteinAnnotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterableMatchedProteinAnnotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterableMatchedProteinAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterableMatchedProteinAnnotation }
     * 
     * 
     */
    public List<FilterableMatchedProteinAnnotation> getFilterableMatchedProteinAnnotation() {
        if (filterableMatchedProteinAnnotation == null) {
            filterableMatchedProteinAnnotation = new ArrayList<FilterableMatchedProteinAnnotation>();
        }
        return this.filterableMatchedProteinAnnotation;
    }

}
