//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.01 at 04:43:24 CEST 
//


package be.ac.ulg.montefiore.run.totem.scenario.model.jaxb;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/data/software/totem/totem.git/src/resources/scenario/Scenario-v1_3.xsd line 188)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}ASTMEventType">
 *       &lt;attribute name="dataFile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resultFile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="runGLPSOL" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface FastIPMetricType
    extends be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.ASTMEventType
{


    /**
     * Gets the value of the dataFile property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getDataFile();

    /**
     * Sets the value of the dataFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setDataFile(java.lang.String value);

    boolean isSetDataFile();

    void unsetDataFile();

    /**
     * Gets the value of the runGLPSOL property.
     * 
     */
    boolean isRunGLPSOL();

    /**
     * Sets the value of the runGLPSOL property.
     * 
     */
    void setRunGLPSOL(boolean value);

    boolean isSetRunGLPSOL();

    void unsetRunGLPSOL();

    /**
     * Gets the value of the resultFile property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getResultFile();

    /**
     * Sets the value of the resultFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setResultFile(java.lang.String value);

    boolean isSetResultFile();

    void unsetResultFile();

}
