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
 *         &lt;element ref="{}descriptive_matched_protein_annotation" maxOccurs="unbounded"/>
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
    "descriptiveMatchedProteinAnnotation"
})
@XmlRootElement(name = "descriptive_matched_protein_annotations")
public class DescriptiveMatchedProteinAnnotations {

    @XmlElement(name = "descriptive_matched_protein_annotation", required = true)
    protected List<DescriptiveMatchedProteinAnnotation> descriptiveMatchedProteinAnnotation;

    /**
     * An annotation or score assigned to a protein sequence.Gets the value of the descriptiveMatchedProteinAnnotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptiveMatchedProteinAnnotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptiveMatchedProteinAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptiveMatchedProteinAnnotation }
     * 
     * 
     */
    public List<DescriptiveMatchedProteinAnnotation> getDescriptiveMatchedProteinAnnotation() {
        if (descriptiveMatchedProteinAnnotation == null) {
            descriptiveMatchedProteinAnnotation = new ArrayList<DescriptiveMatchedProteinAnnotation>();
        }
        return this.descriptiveMatchedProteinAnnotation;
    }

}
