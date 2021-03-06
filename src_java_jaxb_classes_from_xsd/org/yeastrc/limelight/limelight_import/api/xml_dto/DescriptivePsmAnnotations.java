//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.25 at 01:00:07 PM PDT 
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
 *         &lt;element ref="{}descriptive_psm_annotation" maxOccurs="unbounded"/>
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
    "descriptivePsmAnnotation"
})
@XmlRootElement(name = "descriptive_psm_annotations")
public class DescriptivePsmAnnotations {

    @XmlElement(name = "descriptive_psm_annotation", required = true)
    protected List<DescriptivePsmAnnotation> descriptivePsmAnnotation;

    /**
     * A descriptive annotation (numeric or string) assigned to a peptide spectrum match (PSM) that is not meant to describe the quality of the match or filter out poor matches.Gets the value of the descriptivePsmAnnotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptivePsmAnnotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptivePsmAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptivePsmAnnotation }
     * 
     * 
     */
    public List<DescriptivePsmAnnotation> getDescriptivePsmAnnotation() {
        if (descriptivePsmAnnotation == null) {
            descriptivePsmAnnotation = new ArrayList<DescriptivePsmAnnotation>();
        }
        return this.descriptivePsmAnnotation;
    }

}
