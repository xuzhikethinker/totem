//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.31 at 09:01:13 CEST 
//


package be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl;

public class BgpAwareIGPWOImpl
    extends be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.BgpAwareIGPWOTypeImpl
    implements be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.BgpAwareIGPWO, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallableObject, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializable, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.ValidatableObject
{

    public final static java.lang.Class version = (be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.BgpAwareIGPWO.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "bgpAwareIGPWO";
    }

    public be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingEventHandler createUnmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context) {
        return new be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.BgpAwareIGPWOImpl.Unmarshaller(context);
    }

    public void serializeBody(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be", "bgpAwareIGPWO");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.BgpAwareIGPWO.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.m"
+"sv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000\u0000sr\u0000\u0011java.lang.B"
+"oolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0012ppsr\u0000 c"
+"om.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.gr"
+"ammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004q\u0000~\u0000\u0016psr\u0000 com.sun."
+"msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000"
+"~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0016psr\u00002com.sun.msv.grammar.Expression$AnyStringE"
+"xpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0015\u0001q\u0000~\u0000 sr\u0000 com.sun.msv.gramma"
+"r.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpress"
+"ion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000!q\u0000~\u0000&sr\u0000#com.sun.msv.grammar.Simple"
+"NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fname"
+"spaceURIq\u0000~\u0000(xq\u0000~\u0000#t\u0000Ube.ac.ulg.montefiore.run.totem.scenari"
+"o.model.jaxb.BgpAwareIGPWOType.SamplingRateTypet\u0000+http://jav"
+"a.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016psr\u0000\u001bcom"
+".sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/data"
+"type/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/Stri"
+"ngPair;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com"
+".sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceU"
+"riq\u0000~\u0000(L\u0000\btypeNameq\u0000~\u0000(L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype"
+"/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSche"
+"mat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$C"
+"ollapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpacePro"
+"cessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSe"
+"tExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004ppsr\u0000\u001bcom.sun.msv.util.StringPai"
+"r\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000(L\u0000\fnamespaceURIq\u0000~\u0000(xpq\u0000~\u00009q\u0000~\u0000"
+"8sq\u0000~\u0000\'t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000"
+"~\u0000&sq\u0000~\u0000\'t\u0000\fsamplingRatet\u00009http://jaxb.model.scenario.totem."
+"run.montefiore.ulg.ac.beq\u0000~\u0000&sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0016psq\u0000~\u0000\u0000q\u0000~\u0000\u0016"
+"p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0016psq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u0000 q\u0000~\u0000"
+"$q\u0000~\u0000&sq\u0000~\u0000\'t\u0000Vbe.ac.ulg.montefiore.run.totem.scenario.model"
+".jaxb.BgpAwareIGPWOType.TrafficMatrixTypeq\u0000~\u0000+sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001d"
+"q\u0000~\u0000\u0016pq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\rtrafficMatrixq\u0000~\u0000Fq\u0000~\u0000&sq\u0000~\u0000\u0012p"
+"psq\u0000~\u0000\u001dq\u0000~\u0000\u0016psq\u0000~\u0000.ppsr\u0000!com.sun.msv.datatype.xsd.TimeType\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatype.xsd.DateTimeBaseType\u0014W\u001a@3\u00a5"
+"\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u00003q\u0000~\u00008t\u0000\u0004timeq\u0000~\u0000<q\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000[q\u0000~\u00008sq\u0000~\u0000\'t\u0000\u0004ti"
+"met\u0000\u0000q\u0000~\u0000&sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016psq\u0000~\u0000.ppsr\u0000\'com.sun.msv.dataty"
+"pe.xsd.FinalComponent\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\nfinalValuexr\u0000\u001ecom.sun.msv"
+".datatype.xsd.Proxy\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bbaseTypet\u0000)Lcom/sun/msv/dat"
+"atype/xsd/XSDatatypeImpl;xq\u0000~\u00005q\u0000~\u0000Ft\u0000\bASIdTypeq\u0000~\u0000<sr\u0000 com."
+"sun.msv.datatype.xsd.IntType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.datat"
+"ype.xsd.IntegerDerivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacetsq\u0000~\u0000exq\u0000~\u0000"
+"3q\u0000~\u00008t\u0000\u0003intq\u0000~\u0000<sr\u0000*com.sun.msv.datatype.xsd.MaxInclusiveFa"
+"cet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.RangeFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0001L\u0000\nlimitValuet\u0000\u0012Ljava/lang/Object;xr\u00009com.sun.msv.dataty"
+"pe.xsd.DataTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.su"
+"n.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFix"
+"edZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypeq\u0000~\u0000eL\u0000\fconcreteTypet\u0000\'Lco"
+"m/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000(xq\u0000~\u00005p"
+"pq\u0000~\u0000<\u0000\u0001sr\u0000*com.sun.msv.datatype.xsd.MinInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000mppq\u0000~\u0000<\u0000\u0000sr\u0000!com.sun.msv.datatype.xsd.LongType\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000iq\u0000~\u00008t\u0000\u0004longq\u0000~\u0000<sq\u0000~\u0000lppq\u0000~\u0000<\u0000\u0001sq\u0000~\u0000sppq\u0000~\u0000<\u0000"
+"\u0000sr\u0000$com.sun.msv.datatype.xsd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000iq\u0000"
+"~\u00008t\u0000\u0007integerq\u0000~\u0000<sr\u0000,com.sun.msv.datatype.xsd.FractionDigit"
+"sFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005scalexr\u0000;com.sun.msv.datatype.xsd.DataTy"
+"peWithLexicalConstraintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq\u0000~\u0000pppq\u0000~\u0000<\u0001\u0000sr\u0000#co"
+"m.sun.msv.datatype.xsd.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00003q\u0000~\u00008t\u0000\u0007de"
+"cimalq\u0000~\u0000<q\u0000~\u0000\u0081t\u0000\u000efractionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000{t\u0000\fminInclusivesr\u0000\u000e"
+"java.lang.Long;\u008b\u00e4\u0090\u00cc\u008f#\u00df\u0002\u0000\u0001J\u0000\u0005valuexr\u0000\u0010java.lang.Number\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0"
+"\u008b\u0002\u0000\u0000xp\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000{t\u0000\fmaxInclusivesq\u0000~\u0000\u0085\u007f\u00ff\u00ff\u00ff\u00ff\u00ff\u00ff\u00ffq\u0000~\u0000vq\u0000~\u0000\u0084sr"
+"\u0000\u0011java.lang.Integer\u0012\u00e2\u00a0\u00a4\u00f7\u0081\u00878\u0002\u0000\u0001I\u0000\u0005valuexq\u0000~\u0000\u0086\u0080\u0000\u0000\u0000q\u0000~\u0000vq\u0000~\u0000\u0088sq"
+"\u0000~\u0000\u008a\u007f\u00ff\u00ff\u00ff\u0000\u0000\u0000\u0000q\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000kq\u0000~\u0000Fsq\u0000~\u0000\'t\u0000\u0004ASIDq\u0000~\u0000_q\u0000~\u0000&sq\u0000~"
+"\u0000\u0012ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016psq\u0000~\u0000.ppsr\u0000)com.sun.msv.datatype.xsd.Enumera"
+"tionFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0006valuest\u0000\u000fLjava/util/Set;xq\u0000~\u0000oq\u0000~\u0000Ft\u0000"
+"\u001bigpwoInitialWeightArrayTypesr\u00005com.sun.msv.datatype.xsd.Whi"
+"teSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000;\u0000\u0000sr\u0000#com.sun.msv."
+"datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00003q\u0000~\u0000"
+"8t\u0000\u0006stringq\u0000~\u0000\u0098\u0001q\u0000~\u0000\u009at\u0000\u000benumerationsr\u0000\u0011java.util.HashSet\u00baD\u0085\u0095"
+"\u0096\u00b8\u00b74\u0003\u0000\u0000xpw\f\u0000\u0000\u0000\u0010?@\u0000\u0000\u0000\u0000\u0000\u0002t\u0000\u0006RANDOMt\u0000\u0007CURRENTxq\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000\u0096q"
+"\u0000~\u0000Fsq\u0000~\u0000\'t\u0000\u0012initialWeightArrayq\u0000~\u0000_q\u0000~\u0000&sq\u0000~\u0000\u001dppsq\u0000~\u0000.ppsr\u0000"
+"$com.sun.msv.datatype.xsd.BooleanType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00003q\u0000~\u00008t"
+"\u0000\u0007booleanq\u0000~\u0000<q\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000\u00a8q\u0000~\u00008sq\u0000~\u0000\'t\u0000\rinterdomainTEq\u0000~"
+"\u0000_sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016psq\u0000~\u0000.ppq\u0000~\u0000jq\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000kq\u0000~\u00008sq\u0000~"
+"\u0000\'t\u0000\u0011maxPossibleWeightq\u0000~\u0000_q\u0000~\u0000&sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u0000\u00aesq\u0000"
+"~\u0000\'t\u0000\u0006nbIterq\u0000~\u0000_q\u0000~\u0000&sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u0000\u00aesq\u0000~\u0000\'t\u0000\u0004seed"
+"q\u0000~\u0000_q\u0000~\u0000&sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001dq\u0000~\u0000\u0016pq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000&sq\u0000~\u0000\'t\u0000\rbgpAwa"
+"reIGPWOq\u0000~\u0000Fsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHas"
+"h;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed"
+"\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar"
+"/ExpressionPool;xp\u0000\u0000\u0000\u001b\u0001pq\u0000~\u0000,q\u0000~\u0000\u0019q\u0000~\u0000Lq\u0000~\u0000Qq\u0000~\u0000\u00baq\u0000~\u0000\u0017q\u0000~\u0000Jq"
+"\u0000~\u0000\nq\u0000~\u0000\u0010q\u0000~\u0000Gq\u0000~\u0000Uq\u0000~\u0000\u0090q\u0000~\u0000\rq\u0000~\u0000\u001cq\u0000~\u0000Mq\u0000~\u0000\u000fq\u0000~\u0000\u0011q\u0000~\u0000\u000bq\u0000~\u0000`q"
+"\u0000~\u0000\u0013q\u0000~\u0000\tq\u0000~\u0000\u00acq\u0000~\u0000\u00b6q\u0000~\u0000\u000eq\u0000~\u0000Hq\u0000~\u0000\u00b2q\u0000~\u0000\fx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.BgpAwareIGPWOImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "initialWeightArray");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "interdomainTE");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("bgpAwareIGPWO" == ___local)&&("http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("bgpAwareIGPWO" == ___local)&&("http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "initialWeightArray");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "interdomainTE");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("initialWeightArray" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.BgpAwareIGPWOTypeImpl)be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.BgpAwareIGPWOImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("interdomainTE" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.BgpAwareIGPWOTypeImpl)be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.BgpAwareIGPWOImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "initialWeightArray");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "interdomainTE");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "initialWeightArray");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "interdomainTE");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
