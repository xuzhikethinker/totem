//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.31 at 09:01:13 CEST 
//


package be.ac.ulg.montefiore.run.totem.scenario.model.jaxb;


/**
 * Java content class for infoLinkType.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *   &lt;enumeration value="LOAD"/>
 *   &lt;enumeration value="LOAD_BIS"/>
 *   &lt;enumeration value="LOAD_IS"/>
 *   &lt;enumeration value="LOAD_OVERLAY"/>
 *   &lt;enumeration value="RESERVATION"/>
 *   &lt;enumeration value="PRIMARY_BACKUP"/>
 * &lt;/restriction>
 * </pre>
 * 
 */
public class InfoLinkType {

    private final static java.util.Map valueMap = new java.util.HashMap();
    public final static java.lang.String _LOAD = com.sun.xml.bind.DatatypeConverterImpl.installHook("LOAD");
    public final static be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType LOAD = new be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType(_LOAD);
    public final static java.lang.String _LOAD_BIS = com.sun.xml.bind.DatatypeConverterImpl.installHook("LOAD_BIS");
    public final static be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType LOAD_BIS = new be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType(_LOAD_BIS);
    public final static java.lang.String _LOAD_IS = com.sun.xml.bind.DatatypeConverterImpl.installHook("LOAD_IS");
    public final static be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType LOAD_IS = new be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType(_LOAD_IS);
    public final static java.lang.String _LOAD_OVERLAY = com.sun.xml.bind.DatatypeConverterImpl.installHook("LOAD_OVERLAY");
    public final static be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType LOAD_OVERLAY = new be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType(_LOAD_OVERLAY);
    public final static java.lang.String _RESERVATION = com.sun.xml.bind.DatatypeConverterImpl.installHook("RESERVATION");
    public final static be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType RESERVATION = new be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType(_RESERVATION);
    public final static java.lang.String _PRIMARY_BACKUP = com.sun.xml.bind.DatatypeConverterImpl.installHook("PRIMARY_BACKUP");
    public final static be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType PRIMARY_BACKUP = new be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType(_PRIMARY_BACKUP);
    private final java.lang.String lexicalValue;
    private final java.lang.String value;

    protected InfoLinkType(java.lang.String v) {
        value = v;
        lexicalValue = v;
        valueMap.put(v, this);
    }

    public java.lang.String toString() {
        return lexicalValue;
    }

    public java.lang.String getValue() {
        return value;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(java.lang.Object o) {
        return super.equals(o);
    }

    public static be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType fromValue(java.lang.String value) {
        be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType t = ((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType) valueMap.get(value));
        if (t == null) {
            throw new java.lang.IllegalArgumentException();
        } else {
            return t;
        }
    }

    public static be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.InfoLinkType fromString(java.lang.String str) {
        return fromValue(str);
    }

}
