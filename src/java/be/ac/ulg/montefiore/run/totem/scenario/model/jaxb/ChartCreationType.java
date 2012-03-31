//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.31 at 09:01:13 CEST 
//


package be.ac.ulg.montefiore.run.totem.scenario.model.jaxb;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/data/software/totem/totem.git/src/resources/scenario/Scenario-v1_3.xsd line 677)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}eventType">
 *       &lt;sequence>
 *         &lt;element name="collector">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}param" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}chartIdType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ChartCreationType
    extends be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.EventType
{


    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setId(java.lang.String value);

    boolean isSetId();

    void unsetId();

    /**
     * Gets the value of the collector property.
     * 
     * @return
     *     possible object is
     *     {@link be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.ChartCreationType.CollectorType}
     */
    be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.ChartCreationType.CollectorType getCollector();

    /**
     * Sets the value of the collector property.
     * 
     * @param value
     *     allowed object is
     *     {@link be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.ChartCreationType.CollectorType}
     */
    void setCollector(be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.ChartCreationType.CollectorType value);

    boolean isSetCollector();

    void unsetCollector();


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/data/software/totem/totem.git/src/resources/scenario/Scenario-v1_3.xsd line 682)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}param" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface CollectorType {


        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getName();

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setName(java.lang.String value);

        boolean isSetName();

        void unsetName();

        /**
         * Gets the value of the Param property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the Param property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParam().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.Param}
         * {@link be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.ParamType}
         * 
         */
        java.util.List getParam();

        boolean isSetParam();

        void unsetParam();

    }

}
