//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.03.28 at 12:33:07 CET 
//


package be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl;

public class TopologyGenerationTypeImpl
    extends be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.EventTypeImpl
    implements be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.TopologyGenerationType, com.sun.xml.bind.JAXBObject, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallableObject, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializable, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.ValidatableObject
{

    protected java.lang.String _Type;
    protected com.sun.xml.bind.util.ListImpl _Param;
    protected java.lang.String _Path;
    public final static java.lang.Class version = (be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.TopologyGenerationType.class);
    }

    public java.lang.String getType() {
        return _Type;
    }

    public void setType(java.lang.String value) {
        _Type = value;
    }

    public boolean isSetType() {
        return (_Type!= null);
    }

    public void unsetType() {
        _Type = null;
    }

    protected com.sun.xml.bind.util.ListImpl _getParam() {
        if (_Param == null) {
            _Param = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Param;
    }

    public java.util.List getParam() {
        return _getParam();
    }

    public boolean isSetParam() {
        return ((_Param == null)?false:_Param.isModified());
    }

    public void unsetParam() {
        if (_Param!= null) {
            _Param.clear();
            _Param.setModified(false);
        }
    }

    public java.lang.String getPath() {
        return _Path;
    }

    public void setPath(java.lang.String value) {
        _Path = value;
    }

    public boolean isSetPath() {
        return (_Path!= null);
    }

    public void unsetPath() {
        _Path = null;
    }

    public be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingEventHandler createUnmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context) {
        return new be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.TopologyGenerationTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Param == null)? 0 :_Param.size());
        super.serializeBody(context);
        while (idx2 != len2) {
            if (_Param.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Param.get(idx2 ++)), "Param");
            } else {
                context.startElement("http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be", "param");
                int idx_0 = idx2;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Param.get(idx_0 ++)), "Param");
                context.endNamespaceDecls();
                int idx_1 = idx2;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Param.get(idx_1 ++)), "Param");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Param.get(idx2 ++)), "Param");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Param == null)? 0 :_Param.size());
        if (_Path!= null) {
            context.startAttribute("", "path");
            try {
                context.text(((java.lang.String) _Path), "Path");
            } catch (java.lang.Exception e) {
                be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Type!= null) {
            context.startAttribute("", "type");
            try {
                context.text(((java.lang.String) _Type), "Type");
            } catch (java.lang.Exception e) {
                be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        super.serializeAttributes(context);
        while (idx2 != len2) {
            if (_Param.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Param.get(idx2 ++)), "Param");
            } else {
                idx2 += 1;
            }
        }
    }

    public void serializeURIs(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Param == null)? 0 :_Param.size());
        super.serializeURIs(context);
        while (idx2 != len2) {
            if (_Param.get(idx2) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Param.get(idx2 ++)), "Param");
            } else {
                idx2 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.TopologyGenerationType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar."
+"ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000 com.sun.msv.grammar.OneOrMor"
+"eExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000ps"
+"q\u0000~\u0000\bq\u0000~\u0000\u000epsr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.s"
+"un.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttri"
+"butesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\nq\u0000~\u0000\u000epsr"
+"\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tn"
+"ameClassq\u0000~\u0000\u0011xq\u0000~\u0000\u0003q\u0000~\u0000\u000epsr\u00002com.sun.msv.grammar.Expression$"
+"AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\r\u0001q\u0000~\u0000\u0019sr\u0000 com.sun."
+"msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.N"
+"ameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$Epsi"
+"lonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.gram"
+"mar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/Stri"
+"ng;L\u0000\fnamespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u00008be.ac.ulg.montefiore.run.tot"
+"em.scenario.model.jaxb.Paramt\u0000+http://java.sun.com/jaxb/xjc/"
+"dummy-elementssq\u0000~\u0000\u0010q\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0010pp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\nq\u0000"
+"~\u0000\u000epsq\u0000~\u0000\u0016q\u0000~\u0000\u000epq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000<be.ac.ulg.montefiore"
+".run.totem.scenario.model.jaxb.ParamTypeq\u0000~\u0000$sq\u0000~\u0000\bppsq\u0000~\u0000\u0016q"
+"\u0000~\u0000\u000epsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/"
+"relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/m"
+"sv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.Qnam"
+"eType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicTy"
+"pe\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L"
+"\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeNameq\u0000~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/"
+"msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/"
+"2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpac"
+"eProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.W"
+"hiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expre"
+"ssion$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.msv.ut"
+"il.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000"
+"!xpq\u0000~\u0000:q\u0000~\u00009sq\u0000~\u0000 t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchem"
+"a-instanceq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0005paramt\u00009http://jaxb.model.scenario.t"
+"otem.run.montefiore.ulg.ac.beq\u0000~\u0000\u001fsq\u0000~\u0000\bppsq\u0000~\u0000\u0016q\u0000~\u0000\u000epsq\u0000~\u0000/"
+"ppsr\u0000!com.sun.msv.datatype.xsd.TimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.su"
+"n.msv.datatype.xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u00004q\u0000~\u00009t\u0000\u0004"
+"timeq\u0000~\u0000=q\u0000~\u0000?sq\u0000~\u0000@q\u0000~\u0000Nq\u0000~\u00009sq\u0000~\u0000 t\u0000\u0004timet\u0000\u0000q\u0000~\u0000\u001fsq\u0000~\u0000\bpps"
+"q\u0000~\u0000\u0016q\u0000~\u0000\u000epsq\u0000~\u0000/ppsr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00004q\u0000~\u00009t\u0000\u0006stringsr\u00005com.sun.msv"
+".datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000<\u0001"
+"q\u0000~\u0000?sq\u0000~\u0000@q\u0000~\u0000Xq\u0000~\u00009sq\u0000~\u0000 t\u0000\u0004pathq\u0000~\u0000Rq\u0000~\u0000\u001fsq\u0000~\u0000\bppsq\u0000~\u0000\u0016q\u0000"
+"~\u0000\u000epq\u0000~\u0000Usq\u0000~\u0000 t\u0000\u0004typeq\u0000~\u0000Rq\u0000~\u0000\u001fsr\u0000\"com.sun.msv.grammar.Expr"
+"essionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expr"
+"essionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPo"
+"ol$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$"
+"Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u000f\u0001pq\u0000~\u0000Sq\u0000~\u0000\u000fq\u0000~\u0000\u0015q"
+"\u0000~\u0000)q\u0000~\u0000-q\u0000~\u0000\fq\u0000~\u0000&q\u0000~\u0000\u0006q\u0000~\u0000\tq\u0000~\u0000\u0007q\u0000~\u0000\u0014q\u0000~\u0000(q\u0000~\u0000\u0005q\u0000~\u0000Hq\u0000~\u0000^x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context) {
            super(context, "-----------");
        }

        protected Unmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.TopologyGenerationTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        attIdx = context.getAttribute("", "path");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  7 :
                        if (("param" == ___local)&&("http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be" == ___uri)) {
                            _getParam().add(((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.ParamImpl) spawnChildFromEnterElement((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.ParamImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("param" == ___local)&&("http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 8;
                            return ;
                        }
                        state = 10;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("", "time");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.EventTypeImpl)be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.TopologyGenerationTypeImpl.this).new Unmarshaller(context)), 7, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  10 :
                        if (("param" == ___local)&&("http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be" == ___uri)) {
                            _getParam().add(((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.ParamImpl) spawnChildFromEnterElement((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.ParamImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("param" == ___local)&&("http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 8;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  8 :
                        attIdx = context.getAttribute("", "name");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "type");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 6;
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Path = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Type = value;
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        attIdx = context.getAttribute("", "path");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  7 :
                        state = 10;
                        continue outer;
                    case  9 :
                        if (("param" == ___local)&&("http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be" == ___uri)) {
                            context.popAttributes();
                            state = 10;
                            return ;
                        }
                        break;
                    case  6 :
                        attIdx = context.getAttribute("", "time");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveElement((((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.EventTypeImpl)be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.TopologyGenerationTypeImpl.this).new Unmarshaller(context)), 7, ___uri, ___local, ___qname);
                        return ;
                    case  10 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  8 :
                        attIdx = context.getAttribute("", "name");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "type");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 6;
                            continue outer;
                        }
                        state = 6;
                        continue outer;
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
                    case  0 :
                        if (("path" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  7 :
                        state = 10;
                        continue outer;
                    case  6 :
                        if (("time" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.EventTypeImpl)be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.TopologyGenerationTypeImpl.this).new Unmarshaller(context)), 7, ___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromEnterAttribute((((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.EventTypeImpl)be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.TopologyGenerationTypeImpl.this).new Unmarshaller(context)), 7, ___uri, ___local, ___qname);
                        return ;
                    case  10 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  8 :
                        if (("name" == ___local)&&("" == ___uri)) {
                            _getParam().add(((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.ParamTypeImpl) spawnChildFromEnterAttribute((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.ParamTypeImpl.class), 9, ___uri, ___local, ___qname)));
                            return ;
                        }
                        break;
                    case  3 :
                        if (("type" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
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
                    case  0 :
                        attIdx = context.getAttribute("", "path");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 3;
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  7 :
                        state = 10;
                        continue outer;
                    case  6 :
                        attIdx = context.getAttribute("", "time");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveAttribute((((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.EventTypeImpl)be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.TopologyGenerationTypeImpl.this).new Unmarshaller(context)), 7, ___uri, ___local, ___qname);
                        return ;
                    case  10 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  8 :
                        attIdx = context.getAttribute("", "name");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  2 :
                        if (("path" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  5 :
                        if (("type" == ___local)&&("" == ___uri)) {
                            state = 6;
                            return ;
                        }
                        break;
                    case  3 :
                        attIdx = context.getAttribute("", "type");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 6;
                            continue outer;
                        }
                        state = 6;
                        continue outer;
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
                        case  0 :
                            attIdx = context.getAttribute("", "path");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 3;
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  7 :
                            state = 10;
                            continue outer;
                        case  6 :
                            attIdx = context.getAttribute("", "time");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            spawnHandlerFromText((((be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.EventTypeImpl)be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.impl.TopologyGenerationTypeImpl.this).new Unmarshaller(context)), 7, value);
                            return ;
                        case  10 :
                            revertToParentFromText(value);
                            return ;
                        case  8 :
                            attIdx = context.getAttribute("", "name");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  1 :
                            eatText1(value);
                            state = 2;
                            return ;
                        case  3 :
                            attIdx = context.getAttribute("", "type");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText2(v);
                                state = 6;
                                continue outer;
                            }
                            state = 6;
                            continue outer;
                        case  4 :
                            eatText2(value);
                            state = 5;
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}