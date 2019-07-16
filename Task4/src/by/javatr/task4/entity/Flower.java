//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.24 at 08:10:39 PM MSK
//


package by.javatr.task4.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{}visual_param"/>
 *         &lt;element ref="{}growing_tips"/>
 *         &lt;element name="landing_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/all>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="soil" use="required" type="{}soilType" />
 *       &lt;attribute name="multiplying" use="required" type="{}multiplyingType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "flower")
public class Flower {

    @XmlElement(required = true, defaultValue = "unknown")
    protected String name;
    @XmlElement(required = true, defaultValue = "Earth")
    protected String origin;
    @XmlElement(name = "visual_param", required = true)
    protected VisualParam visualParam=new VisualParam();
    @XmlElement(name = "growing_tips", required = true)
    protected GrowingTips growingTips=new GrowingTips();
    @XmlElement(name = "landing_date", required = true)
    @XmlSchemaType(name = "date")
    protected Calendar landingDate;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "soil", required = true)
    protected SoilType soil;
    @XmlAttribute(name = "multiplying", required = true)
    protected MultiplyingType multiplying;

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
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the visualParam property.
     * 
     * @return
     *     possible object is
     *     {@link VisualParam }
     *     
     */
    public VisualParam getVisualParam() {
        return visualParam;
    }

    /**
     * Sets the value of the visualParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisualParam }
     *     
     */
    public void setVisualParam(VisualParam value) {
        this.visualParam = value;
    }

    /**
     * Gets the value of the growingTips property.
     * 
     * @return
     *     possible object is
     *     {@link GrowingTips }
     *     
     */
    public GrowingTips getGrowingTips() {
        return growingTips;
    }

    /**
     * Sets the value of the growingTips property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrowingTips }
     *     
     */
    public void setGrowingTips(GrowingTips value) {
        this.growingTips = value;
    }

    /**
     * Gets the value of the landingDate property.
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    public Calendar getLandingDate() {
        return landingDate;
    }

    /**
     * Sets the value of the landingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     */
    public void setLandingDate(Calendar value) {

        this.landingDate = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the soil property.
     * 
     * @return
     *     possible object is
     *     {@link SoilType }
     *     
     */
    public SoilType getSoil() {
        return soil;
    }

    /**
     * Sets the value of the soil property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoilType }
     *     
     */
    public void setSoil(SoilType value) {
        this.soil = value;
    }

    /**
     * Gets the value of the multiplying property.
     * 
     * @return
     *     possible object is
     *     {@link MultiplyingType }
     *     
     */
    public MultiplyingType getMultiplying() {
        return multiplying;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", visualParam=" + visualParam +
                ", growingTips=" + growingTips +
                ", landingDate=" + landingDate +
                ", id='" + id + '\'' +
                ", soil=" + soil +
                ", multiplying=" + multiplying +
                '}';
    }

    /**
     * Sets the value of the multiplying property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiplyingType }
     *     
     */
    public void setMultiplying(MultiplyingType value) {
        this.multiplying = value;
    }

}
