//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.03.16 at 03:54:45 CET 
//


package be.ac.ucl.ingi.totem.measurementReport.model.jaxb;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the be.ac.ucl.ingi.totem.measurementReport.model.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(16, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.GrammarInfo grammarInfo = new be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (be.ac.ucl.ingi.totem.measurementReport.model.jaxb.ObjectFactory.class));
    public final static java.lang.Class version = (be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((be.ac.ucl.ingi.totem.measurementReport.model.jaxb.SubnetMeasures.class), "be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.SubnetMeasuresImpl");
        defaultImplementations.put((be.ac.ucl.ingi.totem.measurementReport.model.jaxb.RttMeasurementReportType.class), "be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.RttMeasurementReportTypeImpl");
        defaultImplementations.put((be.ac.ucl.ingi.totem.measurementReport.model.jaxb.RttMeasurementReport.class), "be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.RttMeasurementReportImpl");
        defaultImplementations.put((be.ac.ucl.ingi.totem.measurementReport.model.jaxb.Unit.class), "be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.UnitImpl");
        defaultImplementations.put((be.ac.ucl.ingi.totem.measurementReport.model.jaxb.DnsServer.class), "be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.DnsServerImpl");
        defaultImplementations.put((be.ac.ucl.ingi.totem.measurementReport.model.jaxb.UnitType.class), "be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.UnitTypeImpl");
        defaultImplementations.put((be.ac.ucl.ingi.totem.measurementReport.model.jaxb.Information.class), "be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.InformationImpl");
        defaultImplementations.put((be.ac.ucl.ingi.totem.measurementReport.model.jaxb.SubnetMeasures.DnsServerMeasuresType.MeasureType.class), "be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.SubnetMeasuresImpl.DnsServerMeasuresTypeImpl.MeasureTypeImpl");
        defaultImplementations.put((be.ac.ucl.ingi.totem.measurementReport.model.jaxb.SubnetMeasures.DnsServerMeasuresType.class), "be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.SubnetMeasuresImpl.DnsServerMeasuresTypeImpl");
        defaultImplementations.put((be.ac.ucl.ingi.totem.measurementReport.model.jaxb.Subnet.class), "be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.SubnetImpl");
        defaultImplementations.put((be.ac.ucl.ingi.totem.measurementReport.model.jaxb.SubnetMeasures.DnsServerMeasuresType.MeasureType.ResultType.class), "be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.SubnetMeasuresImpl.DnsServerMeasuresTypeImpl.MeasureTypeImpl.ResultTypeImpl");
        rootTagMap.put(new javax.xml.namespace.QName("", "unit"), (be.ac.ucl.ingi.totem.measurementReport.model.jaxb.Unit.class));
        rootTagMap.put(new javax.xml.namespace.QName("", "rttMeasurementReport"), (be.ac.ucl.ingi.totem.measurementReport.model.jaxb.RttMeasurementReport.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: be.ac.ucl.ingi.totem.measurementReport.model.jaxb
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param value
     *     the value of the property to be set
     * @param name
     *     the name of the property to retrieve
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of SubnetMeasures
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ucl.ingi.totem.measurementReport.model.jaxb.SubnetMeasures createSubnetMeasures()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.SubnetMeasuresImpl();
    }

    /**
     * Create an instance of RttMeasurementReportType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ucl.ingi.totem.measurementReport.model.jaxb.RttMeasurementReportType createRttMeasurementReportType()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.RttMeasurementReportTypeImpl();
    }

    /**
     * Create an instance of RttMeasurementReport
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ucl.ingi.totem.measurementReport.model.jaxb.RttMeasurementReport createRttMeasurementReport()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.RttMeasurementReportImpl();
    }

    /**
     * Create an instance of Unit
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ucl.ingi.totem.measurementReport.model.jaxb.Unit createUnit()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.UnitImpl();
    }

    /**
     * Create an instance of DnsServer
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ucl.ingi.totem.measurementReport.model.jaxb.DnsServer createDnsServer()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.DnsServerImpl();
    }

    /**
     * Create an instance of UnitType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ucl.ingi.totem.measurementReport.model.jaxb.UnitType createUnitType()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.UnitTypeImpl();
    }

    /**
     * Create an instance of Information
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ucl.ingi.totem.measurementReport.model.jaxb.Information createInformation()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.InformationImpl();
    }

    /**
     * Create an instance of SubnetMeasuresDnsServerMeasuresTypeMeasureType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ucl.ingi.totem.measurementReport.model.jaxb.SubnetMeasures.DnsServerMeasuresType.MeasureType createSubnetMeasuresDnsServerMeasuresTypeMeasureType()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.SubnetMeasuresImpl.DnsServerMeasuresTypeImpl.MeasureTypeImpl();
    }

    /**
     * Create an instance of SubnetMeasuresDnsServerMeasuresType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ucl.ingi.totem.measurementReport.model.jaxb.SubnetMeasures.DnsServerMeasuresType createSubnetMeasuresDnsServerMeasuresType()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.SubnetMeasuresImpl.DnsServerMeasuresTypeImpl();
    }

    /**
     * Create an instance of Subnet
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ucl.ingi.totem.measurementReport.model.jaxb.Subnet createSubnet()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.SubnetImpl();
    }

    /**
     * Create an instance of SubnetMeasuresDnsServerMeasuresTypeMeasureTypeResultType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public be.ac.ucl.ingi.totem.measurementReport.model.jaxb.SubnetMeasures.DnsServerMeasuresType.MeasureType.ResultType createSubnetMeasuresDnsServerMeasuresTypeMeasureTypeResultType()
        throws javax.xml.bind.JAXBException
    {
        return new be.ac.ucl.ingi.totem.measurementReport.model.jaxb.impl.SubnetMeasuresImpl.DnsServerMeasuresTypeImpl.MeasureTypeImpl.ResultTypeImpl();
    }

}
