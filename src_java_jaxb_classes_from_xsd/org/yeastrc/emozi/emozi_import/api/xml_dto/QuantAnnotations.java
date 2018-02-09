//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.08 at 11:34:17 AM PST 
//


package org.yeastrc.emozi.emozi_import.api.xml_dto;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="quant_annotation" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="search_program" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="annotation_name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    "quantAnnotation"
})
@XmlRootElement(name = "quant_annotations")
public class QuantAnnotations {

    @XmlElement(name = "quant_annotation", required = true)
    protected List<QuantAnnotations.QuantAnnotation> quantAnnotation;

    /**
     * Gets the value of the quantAnnotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantAnnotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantAnnotations.QuantAnnotation }
     * 
     * 
     */
    public List<QuantAnnotations.QuantAnnotation> getQuantAnnotation() {
        if (quantAnnotation == null) {
            quantAnnotation = new ArrayList<QuantAnnotations.QuantAnnotation>();
        }
        return this.quantAnnotation;
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
     *       &lt;attribute name="search_program" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="annotation_name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class QuantAnnotation {

        @XmlAttribute(name = "search_program", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String searchProgram;
        @XmlAttribute(name = "annotation_name", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String annotationName;
        @XmlAttribute(name = "value", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String value;

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
         * Gets the value of the annotationName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnnotationName() {
            return annotationName;
        }

        /**
         * Sets the value of the annotationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnnotationName(String value) {
            this.annotationName = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}