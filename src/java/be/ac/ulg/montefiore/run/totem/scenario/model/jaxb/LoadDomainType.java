//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.31 at 09:01:13 CEST 
//


package be.ac.ulg.montefiore.run.totem.scenario.model.jaxb;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/data/software/totem/totem.git/src/resources/scenario/Scenario-v1_3.xsd line 129)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}eventType">
 *       &lt;attribute name="defaultDomain" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="file" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="removeMultipleLinks" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="useBWSharing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface LoadDomainType
    extends be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.EventType
{


    /**
     * Gets the value of the useBWSharing property.
     * 
     */
    boolean isUseBWSharing();

    /**
     * Sets the value of the useBWSharing property.
     * 
     */
    void setUseBWSharing(boolean value);

    boolean isSetUseBWSharing();

    void unsetUseBWSharing();

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getFile();

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setFile(java.lang.String value);

    boolean isSetFile();

    void unsetFile();

    /**
     * Gets the value of the removeMultipleLinks property.
     * 
     */
    boolean isRemoveMultipleLinks();

    /**
     * Sets the value of the removeMultipleLinks property.
     * 
     */
    void setRemoveMultipleLinks(boolean value);

    boolean isSetRemoveMultipleLinks();

    void unsetRemoveMultipleLinks();

    /**
     * Gets the value of the defaultDomain property.
     * 
     */
    boolean isDefaultDomain();

    /**
     * Sets the value of the defaultDomain property.
     * 
     */
    void setDefaultDomain(boolean value);

    boolean isSetDefaultDomain();

    void unsetDefaultDomain();

}
