//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.08 at 11:03:48 AM CEST 
//


package org.netarchivesuite.fitswrapper.jaxb;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for metadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="image" type="{http://hul.harvard.edu/ois/xml/ns/fits/fits_output}technicalMetadata" minOccurs="0"/>
 *         &lt;element name="text" type="{http://hul.harvard.edu/ois/xml/ns/fits/fits_output}technicalMetadata" minOccurs="0"/>
 *         &lt;element name="document" type="{http://hul.harvard.edu/ois/xml/ns/fits/fits_output}technicalMetadata" minOccurs="0"/>
 *         &lt;element name="audio" type="{http://hul.harvard.edu/ois/xml/ns/fits/fits_output}technicalMetadata" minOccurs="0"/>
 *         &lt;element name="video" type="{http://hul.harvard.edu/ois/xml/ns/fits/fits_output}technicalMetadata" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadataType", propOrder = {
    "image",
    "text",
    "document",
    "audio",
    "video"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class MetadataType {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TechnicalMetadata image;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TechnicalMetadata text;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TechnicalMetadata document;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TechnicalMetadata audio;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TechnicalMetadata video;

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalMetadata }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TechnicalMetadata getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalMetadata }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setImage(TechnicalMetadata value) {
        this.image = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalMetadata }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TechnicalMetadata getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalMetadata }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setText(TechnicalMetadata value) {
        this.text = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalMetadata }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TechnicalMetadata getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalMetadata }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDocument(TechnicalMetadata value) {
        this.document = value;
    }

    /**
     * Gets the value of the audio property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalMetadata }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TechnicalMetadata getAudio() {
        return audio;
    }

    /**
     * Sets the value of the audio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalMetadata }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAudio(TechnicalMetadata value) {
        this.audio = value;
    }

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalMetadata }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TechnicalMetadata getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalMetadata }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-08T11:03:48+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVideo(TechnicalMetadata value) {
        this.video = value;
    }

}
