//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.31 at 08:54:47 CEST 
//


package be.ac.ulg.montefiore.run.totem.domain.model.jaxb;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at http://totem.run.montefiore.ulg.ac.be/Schema/TOTEM-base-v1_0.xsd line 24)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required" type="{}unitsType" />
 *       &lt;attribute name="value" use="required" type="{}unitsValue" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface UnitType {


    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.DelayUnits}
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.BandwidthUnits}
     */
    java.lang.Object getValue();

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.DelayUnits}
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.BandwidthUnits}
     */
    void setValue(java.lang.Object value);

    boolean isSetValue();

    void unsetValue();

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.UnitsType}
     */
    be.ac.ulg.montefiore.run.totem.domain.model.jaxb.UnitsType getType();

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.UnitsType}
     */
    void setType(be.ac.ulg.montefiore.run.totem.domain.model.jaxb.UnitsType value);

    boolean isSetType();

    void unsetType();

}
