//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.31 at 09:01:13 CEST 
//


package be.ac.ulg.montefiore.run.totem.scenario.model.jaxb;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/data/software/totem/totem.git/src/resources/scenario/Scenario-v1_3.xsd line 762)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}ASTMEventType">
 *       &lt;attribute name="N" type="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}intOneToInf" default="3" />
 *       &lt;attribute name="establishMultipleFullMesh" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="llcId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="objectiveFunction" type="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}optDivideTMObjFun" default="WMeanDelay" />
 *       &lt;attribute name="verbose" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface OptDivideTMType
    extends be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.ASTMEventType
{


    /**
     * Gets the value of the verbose property.
     * 
     */
    boolean isVerbose();

    /**
     * Sets the value of the verbose property.
     * 
     */
    void setVerbose(boolean value);

    boolean isSetVerbose();

    void unsetVerbose();

    /**
     * Gets the value of the llcId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getLlcId();

    /**
     * Sets the value of the llcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setLlcId(java.lang.String value);

    boolean isSetLlcId();

    void unsetLlcId();

    /**
     * Gets the value of the establishMultipleFullMesh property.
     * 
     */
    boolean isEstablishMultipleFullMesh();

    /**
     * Sets the value of the establishMultipleFullMesh property.
     * 
     */
    void setEstablishMultipleFullMesh(boolean value);

    boolean isSetEstablishMultipleFullMesh();

    void unsetEstablishMultipleFullMesh();

    /**
     * Gets the value of the objectiveFunction property.
     * 
     * @return
     *     possible object is
     *     {@link be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.OptDivideTMObjFun}
     */
    be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.OptDivideTMObjFun getObjectiveFunction();

    /**
     * Sets the value of the objectiveFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.OptDivideTMObjFun}
     */
    void setObjectiveFunction(be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.OptDivideTMObjFun value);

    boolean isSetObjectiveFunction();

    void unsetObjectiveFunction();

    /**
     * Gets the value of the n property.
     * 
     */
    int getN();

    /**
     * Sets the value of the n property.
     * 
     */
    void setN(int value);

    boolean isSetN();

    void unsetN();

}
