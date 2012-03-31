//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.31 at 08:54:47 CEST 
//


package be.ac.ulg.montefiore.run.totem.domain.model.jaxb;


/**
 * Java content class for information complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/data/software/totem/totem.git/src/resources/domain/Domain-v1_3.xsd line 143)
 * <p>
 * <pre>
 * &lt;complexType name="information">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="units">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}unit" maxOccurs="2" minOccurs="2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="diff-serv" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="priority" maxOccurs="8">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ct" use="required" type="{}ctType" />
 *                           &lt;attribute name="id" use="required" type="{}priorityIdType" />
 *                           &lt;attribute name="preemption" use="required" type="{}preemptionType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="classes-of-service" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cos" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sub-class" type="{}cosType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" use="required" type="{}cosType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="srlgs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="srlg" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="id" use="required" type="{}srlgIdType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
 */
public interface Information {


    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getDescription();

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setDescription(java.lang.String value);

    boolean isSetDescription();

    void unsetDescription();

    /**
     * Gets the value of the diffServ property.
     * 
     * @return
     *     possible object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.DiffServType}
     */
    be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.DiffServType getDiffServ();

    /**
     * Sets the value of the diffServ property.
     * 
     * @param value
     *     allowed object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.DiffServType}
     */
    void setDiffServ(be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.DiffServType value);

    boolean isSetDiffServ();

    void unsetDiffServ();

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.UnitsType}
     */
    be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.UnitsType getUnits();

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.UnitsType}
     */
    void setUnits(be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.UnitsType value);

    boolean isSetUnits();

    void unsetUnits();

    /**
     * Gets the value of the classesOfService property.
     * 
     * @return
     *     possible object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.ClassesOfServiceType}
     */
    be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.ClassesOfServiceType getClassesOfService();

    /**
     * Sets the value of the classesOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.ClassesOfServiceType}
     */
    void setClassesOfService(be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.ClassesOfServiceType value);

    boolean isSetClassesOfService();

    void unsetClassesOfService();

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getDate();

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setDate(java.util.Calendar value);

    boolean isSetDate();

    void unsetDate();

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAuthor();

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAuthor(java.lang.String value);

    boolean isSetAuthor();

    void unsetAuthor();

    /**
     * Gets the value of the srlgs property.
     * 
     * @return
     *     possible object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.SrlgsType}
     */
    be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.SrlgsType getSrlgs();

    /**
     * Sets the value of the srlgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.SrlgsType}
     */
    void setSrlgs(be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.SrlgsType value);

    boolean isSetSrlgs();

    void unsetSrlgs();

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getTitle();

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setTitle(java.lang.String value);

    boolean isSetTitle();

    void unsetTitle();


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/data/software/totem/totem.git/src/resources/domain/Domain-v1_3.xsd line 172)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cos" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sub-class" type="{}cosType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" use="required" type="{}cosType" />
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
     */
    public interface ClassesOfServiceType {


        /**
         * Gets the value of the Cos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the Cos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCos().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.ClassesOfServiceType.CosType}
         * 
         */
        java.util.List getCos();

        boolean isSetCos();

        void unsetCos();


        /**
         * Java content class for anonymous complex type.
         * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/data/software/totem/totem.git/src/resources/domain/Domain-v1_3.xsd line 175)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="sub-class" type="{}cosType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="name" use="required" type="{}cosType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface CosType {


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
             * Gets the value of the SubClass property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the SubClass property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubClass().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link java.lang.String}
             * 
             */
            java.util.List getSubClass();

            boolean isSetSubClass();

            void unsetSubClass();

        }

    }


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/data/software/totem/totem.git/src/resources/domain/Domain-v1_3.xsd line 159)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="priority" maxOccurs="8">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ct" use="required" type="{}ctType" />
     *                 &lt;attribute name="id" use="required" type="{}priorityIdType" />
     *                 &lt;attribute name="preemption" use="required" type="{}preemptionType" />
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
     */
    public interface DiffServType {


        /**
         * Gets the value of the Priority property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the Priority property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriority().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.DiffServType.PriorityType}
         * 
         */
        java.util.List getPriority();

        boolean isSetPriority();

        void unsetPriority();


        /**
         * Java content class for anonymous complex type.
         * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/data/software/totem/totem.git/src/resources/domain/Domain-v1_3.xsd line 162)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ct" use="required" type="{}ctType" />
         *       &lt;attribute name="id" use="required" type="{}priorityIdType" />
         *       &lt;attribute name="preemption" use="required" type="{}preemptionType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface PriorityType {


            /**
             * Gets the value of the ct property.
             * 
             */
            int getCt();

            /**
             * Sets the value of the ct property.
             * 
             */
            void setCt(int value);

            boolean isSetCt();

            void unsetCt();

            /**
             * Gets the value of the id property.
             * 
             */
            int getId();

            /**
             * Sets the value of the id property.
             * 
             */
            void setId(int value);

            boolean isSetId();

            void unsetId();

            /**
             * Gets the value of the preemption property.
             * 
             */
            int getPreemption();

            /**
             * Sets the value of the preemption property.
             * 
             */
            void setPreemption(int value);

            boolean isSetPreemption();

            void unsetPreemption();

        }

    }


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/data/software/totem/totem.git/src/resources/domain/Domain-v1_3.xsd line 186)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="srlg" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" use="required" type="{}srlgIdType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface SrlgsType {


        /**
         * Gets the value of the Srlg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the Srlg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSrlg().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Information.SrlgsType.SrlgType}
         * 
         */
        java.util.List getSrlg();

        boolean isSetSrlg();

        void unsetSrlg();


        /**
         * Java content class for anonymous complex type.
         * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/data/software/totem/totem.git/src/resources/domain/Domain-v1_3.xsd line 189)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" use="required" type="{}srlgIdType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface SrlgType {


            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getValue();

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setValue(java.lang.String value);

            boolean isSetValue();

            void unsetValue();

            /**
             * Gets the value of the id property.
             * 
             */
            int getId();

            /**
             * Sets the value of the id property.
             * 
             */
            void setId(int value);

            boolean isSetId();

            void unsetId();

        }

    }


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/data/software/totem/totem.git/src/resources/domain/Domain-v1_3.xsd line 150)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{}unit" maxOccurs="2" minOccurs="2"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface UnitsType {


        /**
         * Gets the value of the Unit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the Unit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.Unit}
         * {@link be.ac.ulg.montefiore.run.totem.domain.model.jaxb.UnitType}
         * 
         */
        java.util.List getUnit();

        boolean isSetUnit();

        void unsetUnit();

    }

}
