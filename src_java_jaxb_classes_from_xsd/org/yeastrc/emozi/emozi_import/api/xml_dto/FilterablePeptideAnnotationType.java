//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.01 at 04:57:51 PM PST 
//


package org.yeastrc.emozi.emozi_import.api.xml_dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="filter_direction" use="required" type="{}filter_direction_type" />
 *       &lt;attribute name="default_filter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="default_filter_value" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "filterable_peptide_annotation_type")
public class FilterablePeptideAnnotationType {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "filter_direction", required = true)
    protected FilterDirectionType filterDirection;
    @XmlAttribute(name = "default_filter")
    protected Boolean defaultFilter;
    @XmlAttribute(name = "default_filter_value")
    protected BigDecimal defaultFilterValue;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the filterDirection property.
     * 
     * @return
     *     possible object is
     *     {@link FilterDirectionType }
     *     
     */
    public FilterDirectionType getFilterDirection() {
        return filterDirection;
    }

    /**
     * Sets the value of the filterDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterDirectionType }
     *     
     */
    public void setFilterDirection(FilterDirectionType value) {
        this.filterDirection = value;
    }

    /**
     * Gets the value of the defaultFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultFilter() {
        return defaultFilter;
    }

    /**
     * Sets the value of the defaultFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultFilter(Boolean value) {
        this.defaultFilter = value;
    }

    /**
     * Gets the value of the defaultFilterValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultFilterValue() {
        return defaultFilterValue;
    }

    /**
     * Sets the value of the defaultFilterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultFilterValue(BigDecimal value) {
        this.defaultFilterValue = value;
    }

}
