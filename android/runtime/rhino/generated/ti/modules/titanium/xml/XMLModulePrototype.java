/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.xml;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollInvocation;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.KrollProxySupport;
import org.appcelerator.kroll.KrollRuntime;

import org.appcelerator.kroll.runtime.rhino.KrollBindings;
import org.appcelerator.kroll.runtime.rhino.KrollGeneratedBindings;
import org.appcelerator.kroll.runtime.rhino.Proxy;
import org.appcelerator.kroll.runtime.rhino.ProxyFactory;
import org.appcelerator.kroll.runtime.rhino.RhinoRuntime;
import org.appcelerator.kroll.runtime.rhino.TypeConverter;
import org.appcelerator.kroll.common.Log;

import java.util.HashMap;

import ti.modules.titanium.xml.XMLModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class XMLModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = 5360125882982760633L;

	private static final String TAG = "XMLModulePrototype";
	private static final String CLASS_TAG = "XMLModule";
	private static XMLModulePrototype xMLModulePrototype;

	// Lazy loaded child APIs
	private Object API_CharacterData = null;
	private Object API_Document = null;
	private Object API_DocumentFragment = null;
	private Object API_Attr = null;
	private Object API_Comment = null;
	private Object API_Notation = null;
	private Object API_NamedNodeMap = null;
	private Object API_Text = null;
	private Object API_CDATASection = null;
	private Object API_Node = null;
	private Object API_XPathNodeList = null;
	private Object API_DOMImplementation = null;
	private Object API_ProcessingInstruction = null;
	private Object API_DocumentType = null;
	private Object API_Element = null;
	private Object API_EntityReference = null;
	private Object API_NodeList = null;
	private Object API_Entity = null;

	public static XMLModulePrototype getProxyPrototype()
	{
		return xMLModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		xMLModulePrototype = null;
	}

	public XMLModulePrototype()
	{
		if (xMLModulePrototype == null && getClass().equals(XMLModulePrototype.class)) {
			xMLModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;
	}

	public Scriptable getPrototype()
	{
		if (this == xMLModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return xMLModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(XMLModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object parseString(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "parseString()", Log.DEBUG_MODE);

		try {
		XMLModule proxy = (XMLModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("parseString: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		ti.modules.titanium.xml.DocumentProxy javaResult = proxy.parseString(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object serializeToString(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "serializeToString()", Log.DEBUG_MODE);

		try {
		XMLModule proxy = (XMLModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("serializeToString: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.xml.NodeProxy arg0;
		arg0 = (ti.modules.titanium.xml.NodeProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		java.lang.String javaResult = proxy.serializeToString(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_parseString = 2,
		Id_serializeToString = 3
;
		

	public static final int MAX_PROTOTYPE_ID = 3;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:26 PST
        L0: { id = 0; String X = null; int c;
            int s_length = s.length();
            if (s_length==11) {
                c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='p') { X="parseString";id=Id_parseString; }
            }
            else if (s_length==17) { X="serializeToString";id=Id_serializeToString; }
            if (X!=null && X!=s && !X.equals(s)) id = 0;
            break L0;
        }
// #/generated#
		return id;
	}

// #/string_id_map#

	@Override
	protected void initPrototypeId(int id)
	{
		String name;
		int arity;
		switch (id) {
			case Id_constructor:
				arity = 0;
				name = "constructor";
				break;
			case Id_parseString:
				arity = 1;
				name = "parseString";
				break;
			case Id_serializeToString:
				arity = 1;
				name = "serializeToString";
				break;
			default:
				super.initPrototypeId(id);
				return;
		}
		initPrototypeMethod(CLASS_TAG, id, name, arity);
	}

	@Override
	public Object execIdCall(IdFunctionObject f,
		Context cx, Scriptable scope, Scriptable thisObj, Object[] args)
	{
		if (!f.hasTag(CLASS_TAG)) {
			return super.execIdCall(f, cx, scope, thisObj, args);
		}

		while (thisObj != null && !(thisObj instanceof XMLModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		XMLModulePrototype proxy = (XMLModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_parseString:
				return parseString(cx, thisObj, args);
				
			case Id_serializeToString:
				return serializeToString(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
;

;

	// Child APIs
	private static final int

		Id_CharacterData = 1
		,		
		Id_Document = 2
		,		
		Id_DocumentFragment = 3
		,		
		Id_Attr = 4
		,		
		Id_Comment = 5
		,		
		Id_Notation = 6
		,		
		Id_NamedNodeMap = 7
		,		
		Id_Text = 8
		,		
		Id_CDATASection = 9
		,		
		Id_Node = 10
		,		
		Id_XPathNodeList = 11
		,		
		Id_DOMImplementation = 12
		,		
		Id_ProcessingInstruction = 13
		,		
		Id_DocumentType = 14
		,		
		Id_Element = 15
		,		
		Id_EntityReference = 16
		,		
		Id_NodeList = 17
		,		
		Id_Entity = 18
		;

	public static final int MAX_INSTANCE_ID = 18;

	@Override
	protected int getMaxInstanceId()
	{
		return MAX_INSTANCE_ID;
	}

	@Override
	protected int findInstanceIdInfo(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:26 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 4: c=s.charAt(0);
                if (c=='A') { X="Attr";id=Id_Attr; }
                else if (c=='N') { X="Node";id=Id_Node; }
                else if (c=='T') { X="Text";id=Id_Text; }
                break L;
            case 6: X="Entity";id=Id_Entity; break L;
            case 7: c=s.charAt(0);
                if (c=='C') { X="Comment";id=Id_Comment; }
                else if (c=='E') { X="Element";id=Id_Element; }
                break L;
            case 8: c=s.charAt(2);
                if (c=='c') { X="Document";id=Id_Document; }
                else if (c=='d') { X="NodeList";id=Id_NodeList; }
                else if (c=='t') { X="Notation";id=Id_Notation; }
                break L;
            case 12: c=s.charAt(0);
                if (c=='C') { X="CDATASection";id=Id_CDATASection; }
                else if (c=='D') { X="DocumentType";id=Id_DocumentType; }
                else if (c=='N') { X="NamedNodeMap";id=Id_NamedNodeMap; }
                break L;
            case 13: c=s.charAt(0);
                if (c=='C') { X="CharacterData";id=Id_CharacterData; }
                else if (c=='X') { X="XPathNodeList";id=Id_XPathNodeList; }
                break L;
            case 15: X="EntityReference";id=Id_EntityReference; break L;
            case 16: X="DocumentFragment";id=Id_DocumentFragment; break L;
            case 17: X="DOMImplementation";id=Id_DOMImplementation; break L;
            case 21: X="ProcessingInstruction";id=Id_ProcessingInstruction; break L;
            }
            if (X!=null && X!=s && !X.equals(s)) id = 0;
            break L0;
        }
// #/generated#
		if (id == 0) {
			return id;
		}
		return instanceIdInfo(PERMANENT, id);
	}

// #/string_id_map#

	@Override
	protected String getInstanceIdName(int id)
	{
		switch (id) {
			case Id_CharacterData:
				return "CharacterData";
			case Id_Document:
				return "Document";
			case Id_DocumentFragment:
				return "DocumentFragment";
			case Id_Attr:
				return "Attr";
			case Id_Comment:
				return "Comment";
			case Id_Notation:
				return "Notation";
			case Id_NamedNodeMap:
				return "NamedNodeMap";
			case Id_Text:
				return "Text";
			case Id_CDATASection:
				return "CDATASection";
			case Id_Node:
				return "Node";
			case Id_XPathNodeList:
				return "XPathNodeList";
			case Id_DOMImplementation:
				return "DOMImplementation";
			case Id_ProcessingInstruction:
				return "ProcessingInstruction";
			case Id_DocumentType:
				return "DocumentType";
			case Id_Element:
				return "Element";
			case Id_EntityReference:
				return "EntityReference";
			case Id_NodeList:
				return "NodeList";
			case Id_Entity:
				return "Entity";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		XMLModulePrototype proxy = this;
		while (start != null && !(start instanceof XMLModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof XMLModulePrototype) {
			proxy = (XMLModulePrototype) start;
		}

		switch (id) {
			case Id_CharacterData:
				if (proxy.API_CharacterData == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_CharacterData = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.CharacterDataProxy", ti.modules.titanium.xml.CharacterDataProxyPrototype.class); 
				}
				return proxy.API_CharacterData;
			case Id_Document:
				if (proxy.API_Document == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Document = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.DocumentProxy", ti.modules.titanium.xml.DocumentProxyPrototype.class); 
				}
				return proxy.API_Document;
			case Id_DocumentFragment:
				if (proxy.API_DocumentFragment == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_DocumentFragment = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.DocumentFragmentProxy", ti.modules.titanium.xml.DocumentFragmentProxyPrototype.class); 
				}
				return proxy.API_DocumentFragment;
			case Id_Attr:
				if (proxy.API_Attr == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Attr = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.AttrProxy", ti.modules.titanium.xml.AttrProxyPrototype.class); 
				}
				return proxy.API_Attr;
			case Id_Comment:
				if (proxy.API_Comment == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Comment = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.CommentProxy", ti.modules.titanium.xml.CommentProxyPrototype.class); 
				}
				return proxy.API_Comment;
			case Id_Notation:
				if (proxy.API_Notation == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Notation = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.NotationProxy", ti.modules.titanium.xml.NotationProxyPrototype.class); 
				}
				return proxy.API_Notation;
			case Id_NamedNodeMap:
				if (proxy.API_NamedNodeMap == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_NamedNodeMap = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.NamedNodeMapProxy", ti.modules.titanium.xml.NamedNodeMapProxyPrototype.class); 
				}
				return proxy.API_NamedNodeMap;
			case Id_Text:
				if (proxy.API_Text == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Text = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.TextProxy", ti.modules.titanium.xml.TextProxyPrototype.class); 
				}
				return proxy.API_Text;
			case Id_CDATASection:
				if (proxy.API_CDATASection == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_CDATASection = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.CDATASectionProxy", ti.modules.titanium.xml.CDATASectionProxyPrototype.class); 
				}
				return proxy.API_CDATASection;
			case Id_Node:
				if (proxy.API_Node == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Node = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.NodeProxy", ti.modules.titanium.xml.NodeProxyPrototype.class); 
				}
				return proxy.API_Node;
			case Id_XPathNodeList:
				if (proxy.API_XPathNodeList == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_XPathNodeList = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.XPathNodeListProxy", ti.modules.titanium.xml.XPathNodeListProxyPrototype.class); 
				}
				return proxy.API_XPathNodeList;
			case Id_DOMImplementation:
				if (proxy.API_DOMImplementation == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_DOMImplementation = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.DOMImplementationProxy", ti.modules.titanium.xml.DOMImplementationProxyPrototype.class); 
				}
				return proxy.API_DOMImplementation;
			case Id_ProcessingInstruction:
				if (proxy.API_ProcessingInstruction == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_ProcessingInstruction = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.ProcessingInstructionProxy", ti.modules.titanium.xml.ProcessingInstructionProxyPrototype.class); 
				}
				return proxy.API_ProcessingInstruction;
			case Id_DocumentType:
				if (proxy.API_DocumentType == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_DocumentType = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.DocumentTypeProxy", ti.modules.titanium.xml.DocumentTypeProxyPrototype.class); 
				}
				return proxy.API_DocumentType;
			case Id_Element:
				if (proxy.API_Element == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Element = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.ElementProxy", ti.modules.titanium.xml.ElementProxyPrototype.class); 
				}
				return proxy.API_Element;
			case Id_EntityReference:
				if (proxy.API_EntityReference == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_EntityReference = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.EntityReferenceProxy", ti.modules.titanium.xml.EntityReferenceProxyPrototype.class); 
				}
				return proxy.API_EntityReference;
			case Id_NodeList:
				if (proxy.API_NodeList == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_NodeList = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.NodeListProxy", ti.modules.titanium.xml.NodeListProxyPrototype.class); 
				}
				return proxy.API_NodeList;
			case Id_Entity:
				if (proxy.API_Entity == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Entity = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.EntityProxy", ti.modules.titanium.xml.EntityProxyPrototype.class); 
				}
				return proxy.API_Entity;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		XMLModulePrototype proxy = this;
		while (start != null && !(start instanceof XMLModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof XMLModulePrototype) {
			proxy = (XMLModulePrototype) start;
		}

		switch (id) {
			case Id_CharacterData:
				if (value instanceof Proxy) {
					proxy.API_CharacterData = value;
				} else {
					defineProperty(original, "CharacterData", value, 0);
				}
				break;
			case Id_Document:
				if (value instanceof Proxy) {
					proxy.API_Document = value;
				} else {
					defineProperty(original, "Document", value, 0);
				}
				break;
			case Id_DocumentFragment:
				if (value instanceof Proxy) {
					proxy.API_DocumentFragment = value;
				} else {
					defineProperty(original, "DocumentFragment", value, 0);
				}
				break;
			case Id_Attr:
				if (value instanceof Proxy) {
					proxy.API_Attr = value;
				} else {
					defineProperty(original, "Attr", value, 0);
				}
				break;
			case Id_Comment:
				if (value instanceof Proxy) {
					proxy.API_Comment = value;
				} else {
					defineProperty(original, "Comment", value, 0);
				}
				break;
			case Id_Notation:
				if (value instanceof Proxy) {
					proxy.API_Notation = value;
				} else {
					defineProperty(original, "Notation", value, 0);
				}
				break;
			case Id_NamedNodeMap:
				if (value instanceof Proxy) {
					proxy.API_NamedNodeMap = value;
				} else {
					defineProperty(original, "NamedNodeMap", value, 0);
				}
				break;
			case Id_Text:
				if (value instanceof Proxy) {
					proxy.API_Text = value;
				} else {
					defineProperty(original, "Text", value, 0);
				}
				break;
			case Id_CDATASection:
				if (value instanceof Proxy) {
					proxy.API_CDATASection = value;
				} else {
					defineProperty(original, "CDATASection", value, 0);
				}
				break;
			case Id_Node:
				if (value instanceof Proxy) {
					proxy.API_Node = value;
				} else {
					defineProperty(original, "Node", value, 0);
				}
				break;
			case Id_XPathNodeList:
				if (value instanceof Proxy) {
					proxy.API_XPathNodeList = value;
				} else {
					defineProperty(original, "XPathNodeList", value, 0);
				}
				break;
			case Id_DOMImplementation:
				if (value instanceof Proxy) {
					proxy.API_DOMImplementation = value;
				} else {
					defineProperty(original, "DOMImplementation", value, 0);
				}
				break;
			case Id_ProcessingInstruction:
				if (value instanceof Proxy) {
					proxy.API_ProcessingInstruction = value;
				} else {
					defineProperty(original, "ProcessingInstruction", value, 0);
				}
				break;
			case Id_DocumentType:
				if (value instanceof Proxy) {
					proxy.API_DocumentType = value;
				} else {
					defineProperty(original, "DocumentType", value, 0);
				}
				break;
			case Id_Element:
				if (value instanceof Proxy) {
					proxy.API_Element = value;
				} else {
					defineProperty(original, "Element", value, 0);
				}
				break;
			case Id_EntityReference:
				if (value instanceof Proxy) {
					proxy.API_EntityReference = value;
				} else {
					defineProperty(original, "EntityReference", value, 0);
				}
				break;
			case Id_NodeList:
				if (value instanceof Proxy) {
					proxy.API_NodeList = value;
				} else {
					defineProperty(original, "NodeList", value, 0);
				}
				break;
			case Id_Entity:
				if (value instanceof Proxy) {
					proxy.API_Entity = value;
				} else {
					defineProperty(original, "Entity", value, 0);
				}
				break;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	public String getClassName()
	{
		return CLASS_TAG;
	}
}
