//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.08 at 11:03:48 AM CEST 
//


package org.netarchivesuite.fitswrapper.jaxb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for fitsMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fitsMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://hul.harvard.edu/ois/xml/ns/fits/fits_output}nameVersionStatusAttrGrp"/>
 *       &lt;anyAttribute processContents='skip'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fitsMetadataType", propOrder = {
    "any"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class FitsMetadataType {

    @XmlAnyElement
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Element> any;
    @XmlAttribute(name = "status")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected StatusType status;
    @XmlAttribute(name = "toolname")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String toolname;
    @XmlAttribute(name = "toolversion")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String toolversion;
    @XmlAnyAttribute
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the toolname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getToolname() {
        return toolname;
    }

    /**
     * Sets the value of the toolname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setToolname(String value) {
        this.toolname = value;
    }

    /**
     * Gets the value of the toolversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getToolversion() {
        return toolversion;
    }

    /**
     * Sets the value of the toolversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setToolversion(String value) {
        this.toolversion = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
