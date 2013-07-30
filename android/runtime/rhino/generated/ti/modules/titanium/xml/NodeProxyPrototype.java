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

import ti.modules.titanium.xml.NodeProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class NodeProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -1350033671315747689L;

	private static final String TAG = "NodeProxyPrototype";
	private static final String CLASS_TAG = "NodeProxy";
	private static NodeProxyPrototype nodeProxyPrototype;


	public static NodeProxyPrototype getProxyPrototype()
	{
		return nodeProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		nodeProxyPrototype = null;
	}

	public NodeProxyPrototype()
	{
		if (nodeProxyPrototype == null && getClass().equals(NodeProxyPrototype.class)) {
			nodeProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}


			putConst("TEXT_NODE", this, 3);


			putConst("ENTITY_REFERENCE_NODE", this, 5);


			putConst("ENTITY_NODE", this, 6);


			putConst("DOCUMENT_TYPE_NODE", this, 10);


			putConst("ATTRIBUTE_NODE", this, 2);


			putConst("NOTATION_NODE", this, 12);


			putConst("CDATA_SECTION_NODE", this, 4);


			putConst("DOCUMENT_FRAGMENT_NODE", this, 11);


			putConst("COMMENT_NODE", this, 8);


			putConst("PROCESSING_INSTRUCTION_NODE", this, 7);


			putConst("DOCUMENT_NODE", this, 9);


			putConst("ELEMENT_NODE", this, 1);

	}

	public Scriptable getPrototype()
	{
		if (this == nodeProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return nodeProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(NodeProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getParentNode(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getParentNode()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.getParentNode();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object evaluate(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "evaluate()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("evaluate: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		ti.modules.titanium.xml.XPathNodeListProxy javaResult = proxy.evaluate(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object hasAttributes(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "hasAttributes()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.hasAttributes();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object replaceChild(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "replaceChild()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("replaceChild: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.xml.NodeProxy arg0;
		arg0 = (ti.modules.titanium.xml.NodeProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		if (!(args[1] instanceof Proxy) && args[1] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.xml.NodeProxy arg1;
		arg1 = (ti.modules.titanium.xml.NodeProxy) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.replaceChild(arg0, arg1);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void normalize(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "normalize()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		proxy.normalize();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getNodeType(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getNodeType()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		short javaResult = proxy.getNodeType();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setPrefix(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setPrefix()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setPrefix: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setPrefix(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getNamespaceURI(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getNamespaceURI()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getNamespaceURI();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object hasChildNodes(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "hasChildNodes()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.hasChildNodes();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object cloneNode(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "cloneNode()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("cloneNode: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.cloneNode(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object isSupported(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isSupported()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("isSupported: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		boolean javaResult = proxy.isSupported(arg0, arg1);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object insertBefore(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "insertBefore()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("insertBefore: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.xml.NodeProxy arg0;
		arg0 = (ti.modules.titanium.xml.NodeProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		if (!(args[1] instanceof Proxy) && args[1] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.xml.NodeProxy arg1;
		arg1 = (ti.modules.titanium.xml.NodeProxy) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.insertBefore(arg0, arg1);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getLastChild(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLastChild()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.getLastChild();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setNodeValue(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setNodeValue()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setNodeValue: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setNodeValue(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object appendChild(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "appendChild()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("appendChild: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.xml.NodeProxy arg0;
		arg0 = (ti.modules.titanium.xml.NodeProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.appendChild(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getLocalName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLocalName()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getLocalName();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getChildNodes(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getChildNodes()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.NodeListProxy javaResult = proxy.getChildNodes();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getPreviousSibling(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPreviousSibling()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.getPreviousSibling();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getOwnerDocument(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getOwnerDocument()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.DocumentProxy javaResult = proxy.getOwnerDocument();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object removeChild(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeChild()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removeChild: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.xml.NodeProxy arg0;
		arg0 = (ti.modules.titanium.xml.NodeProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.removeChild(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getFirstChild(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getFirstChild()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.getFirstChild();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getNextSibling(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getNextSibling()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.getNextSibling();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getNodeName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getNodeName()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getNodeName();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getPrefix(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPrefix()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getPrefix();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getNodeValue(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getNodeValue()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getNodeValue();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAttributes(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAttributes()", Log.DEBUG_MODE);

		try {
		NodeProxy proxy = (NodeProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.NamedNodeMapProxy javaResult = proxy.getAttributes();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public String getter_localName()
	{
		Log.d(TAG, "get localName", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getLocalName();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_nodeName()
	{
		Log.d(TAG, "get nodeName", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getNodeName();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Proxy getter_firstChild()
	{
		Log.d(TAG, "get firstChild", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.xml.NodeProxy javaResult = proxy.getFirstChild();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Proxy getter_childNodes()
	{
		Log.d(TAG, "get childNodes", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.xml.NodeListProxy javaResult = proxy.getChildNodes();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Proxy getter_ownerDocument()
	{
		Log.d(TAG, "get ownerDocument", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.xml.DocumentProxy javaResult = proxy.getOwnerDocument();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Proxy getter_lastChild()
	{
		Log.d(TAG, "get lastChild", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.xml.NodeProxy javaResult = proxy.getLastChild();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public String getter_namespaceURI()
	{
		Log.d(TAG, "get namespaceURI", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getNamespaceURI();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Proxy getter_previousSibling()
	{
		Log.d(TAG, "get previousSibling", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.xml.NodeProxy javaResult = proxy.getPreviousSibling();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Proxy getter_parentNode()
	{
		Log.d(TAG, "get parentNode", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.xml.NodeProxy javaResult = proxy.getParentNode();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public String getter_prefix()
	{
		Log.d(TAG, "get prefix", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getPrefix();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_prefix(Object value)
	{
		Log.d(TAG, "set prefix", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setPrefix(arg0);
		//proxy.setProperty("prefix", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_nodeValue()
	{
		Log.d(TAG, "get nodeValue", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getNodeValue();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_nodeValue(Object value)
	{
		Log.d(TAG, "set nodeValue", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setNodeValue(arg0);
		//proxy.setProperty("nodeValue", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Proxy getter_attributes()
	{
		Log.d(TAG, "get attributes", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.xml.NamedNodeMapProxy javaResult = proxy.getAttributes();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Number getter_nodeType()
	{
		Log.d(TAG, "get nodeType", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		short javaResult = proxy.getNodeType();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Proxy getter_nextSibling()
	{
		Log.d(TAG, "get nextSibling", Log.DEBUG_MODE);
		NodeProxy proxy = (NodeProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.xml.NodeProxy javaResult = proxy.getNextSibling();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getParentNode = 2,
		Id_evaluate = 3,
		Id_hasAttributes = 4,
		Id_replaceChild = 5,
		Id_normalize = 6,
		Id_getNodeType = 7,
		Id_setPrefix = 8,
		Id_getNamespaceURI = 9,
		Id_hasChildNodes = 10,
		Id_cloneNode = 11,
		Id_isSupported = 12,
		Id_insertBefore = 13,
		Id_getLastChild = 14,
		Id_setNodeValue = 15,
		Id_appendChild = 16,
		Id_getLocalName = 17,
		Id_getChildNodes = 18,
		Id_getPreviousSibling = 19,
		Id_getOwnerDocument = 20,
		Id_removeChild = 21,
		Id_getFirstChild = 22,
		Id_getNextSibling = 23,
		Id_getNodeName = 24,
		Id_getPrefix = 25,
		Id_getNodeValue = 26,
		Id_getAttributes = 27
;
		

	public static final int MAX_PROTOTYPE_ID = 27;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 8: X="evaluate";id=Id_evaluate; break L;
            case 9: switch (s.charAt(0)) {
                case 'c': X="cloneNode";id=Id_cloneNode; break L;
                case 'g': X="getPrefix";id=Id_getPrefix; break L;
                case 'n': X="normalize";id=Id_normalize; break L;
                case 's': X="setPrefix";id=Id_setPrefix; break L;
                } break L;
            case 11: switch (s.charAt(0)) {
                case 'a': X="appendChild";id=Id_appendChild; break L;
                case 'c': X="constructor";id=Id_constructor; break L;
                case 'g': c=s.charAt(7);
                    if (c=='N') { X="getNodeName";id=Id_getNodeName; }
                    else if (c=='T') { X="getNodeType";id=Id_getNodeType; }
                    break L;
                case 'i': X="isSupported";id=Id_isSupported; break L;
                case 'r': X="removeChild";id=Id_removeChild; break L;
                } break L;
            case 12: switch (s.charAt(0)) {
                case 'g': c=s.charAt(5);
                    if (c=='c') { X="getLocalName";id=Id_getLocalName; }
                    else if (c=='d') { X="getNodeValue";id=Id_getNodeValue; }
                    else if (c=='s') { X="getLastChild";id=Id_getLastChild; }
                    break L;
                case 'i': X="insertBefore";id=Id_insertBefore; break L;
                case 'r': X="replaceChild";id=Id_replaceChild; break L;
                case 's': X="setNodeValue";id=Id_setNodeValue; break L;
                } break L;
            case 13: switch (s.charAt(3)) {
                case 'A': c=s.charAt(0);
                    if (c=='g') { X="getAttributes";id=Id_getAttributes; }
                    else if (c=='h') { X="hasAttributes";id=Id_hasAttributes; }
                    break L;
                case 'C': c=s.charAt(0);
                    if (c=='g') { X="getChildNodes";id=Id_getChildNodes; }
                    else if (c=='h') { X="hasChildNodes";id=Id_hasChildNodes; }
                    break L;
                case 'F': X="getFirstChild";id=Id_getFirstChild; break L;
                case 'P': X="getParentNode";id=Id_getParentNode; break L;
                } break L;
            case 14: X="getNextSibling";id=Id_getNextSibling; break L;
            case 15: X="getNamespaceURI";id=Id_getNamespaceURI; break L;
            case 16: X="getOwnerDocument";id=Id_getOwnerDocument; break L;
            case 18: X="getPreviousSibling";id=Id_getPreviousSibling; break L;
            }
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
			case Id_getParentNode:
				arity = 0;
				name = "getParentNode";
				break;
			case Id_evaluate:
				arity = 1;
				name = "evaluate";
				break;
			case Id_hasAttributes:
				arity = 0;
				name = "hasAttributes";
				break;
			case Id_replaceChild:
				arity = 2;
				name = "replaceChild";
				break;
			case Id_normalize:
				arity = 0;
				name = "normalize";
				break;
			case Id_getNodeType:
				arity = 0;
				name = "getNodeType";
				break;
			case Id_setPrefix:
				arity = 1;
				name = "setPrefix";
				break;
			case Id_getNamespaceURI:
				arity = 0;
				name = "getNamespaceURI";
				break;
			case Id_hasChildNodes:
				arity = 0;
				name = "hasChildNodes";
				break;
			case Id_cloneNode:
				arity = 1;
				name = "cloneNode";
				break;
			case Id_isSupported:
				arity = 2;
				name = "isSupported";
				break;
			case Id_insertBefore:
				arity = 2;
				name = "insertBefore";
				break;
			case Id_getLastChild:
				arity = 0;
				name = "getLastChild";
				break;
			case Id_setNodeValue:
				arity = 1;
				name = "setNodeValue";
				break;
			case Id_appendChild:
				arity = 1;
				name = "appendChild";
				break;
			case Id_getLocalName:
				arity = 0;
				name = "getLocalName";
				break;
			case Id_getChildNodes:
				arity = 0;
				name = "getChildNodes";
				break;
			case Id_getPreviousSibling:
				arity = 0;
				name = "getPreviousSibling";
				break;
			case Id_getOwnerDocument:
				arity = 0;
				name = "getOwnerDocument";
				break;
			case Id_removeChild:
				arity = 1;
				name = "removeChild";
				break;
			case Id_getFirstChild:
				arity = 0;
				name = "getFirstChild";
				break;
			case Id_getNextSibling:
				arity = 0;
				name = "getNextSibling";
				break;
			case Id_getNodeName:
				arity = 0;
				name = "getNodeName";
				break;
			case Id_getPrefix:
				arity = 0;
				name = "getPrefix";
				break;
			case Id_getNodeValue:
				arity = 0;
				name = "getNodeValue";
				break;
			case Id_getAttributes:
				arity = 0;
				name = "getAttributes";
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

		while (thisObj != null && !(thisObj instanceof NodeProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		NodeProxyPrototype proxy = (NodeProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getParentNode:
				return getParentNode(cx, thisObj, args);
				
			case Id_evaluate:
				return evaluate(cx, thisObj, args);
				
			case Id_hasAttributes:
				return hasAttributes(cx, thisObj, args);
				
			case Id_replaceChild:
				return replaceChild(cx, thisObj, args);
				
			case Id_normalize:
				 normalize(cx, thisObj, args);
				return Undefined.instance;
			case Id_getNodeType:
				return getNodeType(cx, thisObj, args);
				
			case Id_setPrefix:
				 setPrefix(cx, thisObj, args);
				return Undefined.instance;
			case Id_getNamespaceURI:
				return getNamespaceURI(cx, thisObj, args);
				
			case Id_hasChildNodes:
				return hasChildNodes(cx, thisObj, args);
				
			case Id_cloneNode:
				return cloneNode(cx, thisObj, args);
				
			case Id_isSupported:
				return isSupported(cx, thisObj, args);
				
			case Id_insertBefore:
				return insertBefore(cx, thisObj, args);
				
			case Id_getLastChild:
				return getLastChild(cx, thisObj, args);
				
			case Id_setNodeValue:
				 setNodeValue(cx, thisObj, args);
				return Undefined.instance;
			case Id_appendChild:
				return appendChild(cx, thisObj, args);
				
			case Id_getLocalName:
				return getLocalName(cx, thisObj, args);
				
			case Id_getChildNodes:
				return getChildNodes(cx, thisObj, args);
				
			case Id_getPreviousSibling:
				return getPreviousSibling(cx, thisObj, args);
				
			case Id_getOwnerDocument:
				return getOwnerDocument(cx, thisObj, args);
				
			case Id_removeChild:
				return removeChild(cx, thisObj, args);
				
			case Id_getFirstChild:
				return getFirstChild(cx, thisObj, args);
				
			case Id_getNextSibling:
				return getNextSibling(cx, thisObj, args);
				
			case Id_getNodeName:
				return getNodeName(cx, thisObj, args);
				
			case Id_getPrefix:
				return getPrefix(cx, thisObj, args);
				
			case Id_getNodeValue:
				return getNodeValue(cx, thisObj, args);
				
			case Id_getAttributes:
				return getAttributes(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_localName = 1
		,		
		Id_nodeName = 2
		,		
		Id_firstChild = 3
		,		
		Id_childNodes = 4
		,		
		Id_ownerDocument = 5
		,		
		Id_lastChild = 6
		,		
		Id_namespaceURI = 7
		,		
		Id_previousSibling = 8
		,		
		Id_parentNode = 9
		,		
		Id_prefix = 10
		,		
		Id_nodeValue = 11
		,		
		Id_attributes = 12
		,		
		Id_nodeType = 13
		,		
		Id_nextSibling = 14
		;

;

;

	public static final int MAX_INSTANCE_ID = 14;

	@Override
	protected int getMaxInstanceId()
	{
		return MAX_INSTANCE_ID;
	}

	@Override
	protected int findInstanceIdInfo(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 6: X="prefix";id=Id_prefix; break L;
            case 8: c=s.charAt(4);
                if (c=='N') { X="nodeName";id=Id_nodeName; }
                else if (c=='T') { X="nodeType";id=Id_nodeType; }
                break L;
            case 9: c=s.charAt(2);
                if (c=='c') { X="localName";id=Id_localName; }
                else if (c=='d') { X="nodeValue";id=Id_nodeValue; }
                else if (c=='s') { X="lastChild";id=Id_lastChild; }
                break L;
            case 10: switch (s.charAt(0)) {
                case 'a': X="attributes";id=Id_attributes; break L;
                case 'c': X="childNodes";id=Id_childNodes; break L;
                case 'f': X="firstChild";id=Id_firstChild; break L;
                case 'p': X="parentNode";id=Id_parentNode; break L;
                } break L;
            case 11: X="nextSibling";id=Id_nextSibling; break L;
            case 12: X="namespaceURI";id=Id_namespaceURI; break L;
            case 13: X="ownerDocument";id=Id_ownerDocument; break L;
            case 15: X="previousSibling";id=Id_previousSibling; break L;
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
			case Id_localName:
				return "localName"; 
			case Id_nodeName:
				return "nodeName"; 
			case Id_firstChild:
				return "firstChild"; 
			case Id_childNodes:
				return "childNodes"; 
			case Id_ownerDocument:
				return "ownerDocument"; 
			case Id_lastChild:
				return "lastChild"; 
			case Id_namespaceURI:
				return "namespaceURI"; 
			case Id_previousSibling:
				return "previousSibling"; 
			case Id_parentNode:
				return "parentNode"; 
			case Id_prefix:
				return "prefix"; 
			case Id_nodeValue:
				return "nodeValue"; 
			case Id_attributes:
				return "attributes"; 
			case Id_nodeType:
				return "nodeType"; 
			case Id_nextSibling:
				return "nextSibling"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		NodeProxyPrototype proxy = this;
		while (start != null && !(start instanceof NodeProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof NodeProxyPrototype) {
			proxy = (NodeProxyPrototype) start;
		}

		switch (id) {
			case Id_localName:
				return proxy.getter_localName();
			case Id_nodeName:
				return proxy.getter_nodeName();
			case Id_firstChild:
				return proxy.getter_firstChild();
			case Id_childNodes:
				return proxy.getter_childNodes();
			case Id_ownerDocument:
				return proxy.getter_ownerDocument();
			case Id_lastChild:
				return proxy.getter_lastChild();
			case Id_namespaceURI:
				return proxy.getter_namespaceURI();
			case Id_previousSibling:
				return proxy.getter_previousSibling();
			case Id_parentNode:
				return proxy.getter_parentNode();
			case Id_prefix:
				return proxy.getter_prefix();
			case Id_nodeValue:
				return proxy.getter_nodeValue();
			case Id_attributes:
				return proxy.getter_attributes();
			case Id_nodeType:
				return proxy.getter_nodeType();
			case Id_nextSibling:
				return proxy.getter_nextSibling();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		NodeProxyPrototype proxy = this;
		while (start != null && !(start instanceof NodeProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof NodeProxyPrototype) {
			proxy = (NodeProxyPrototype) start;
		}

		switch (id) {
			case Id_localName:
				proxy.setProperty("localName", value);
				proxy.onPropertyChanged("localName", value);
				break; 
			case Id_nodeName:
				proxy.setProperty("nodeName", value);
				proxy.onPropertyChanged("nodeName", value);
				break; 
			case Id_firstChild:
				proxy.setProperty("firstChild", value);
				proxy.onPropertyChanged("firstChild", value);
				break; 
			case Id_childNodes:
				proxy.setProperty("childNodes", value);
				proxy.onPropertyChanged("childNodes", value);
				break; 
			case Id_ownerDocument:
				proxy.setProperty("ownerDocument", value);
				proxy.onPropertyChanged("ownerDocument", value);
				break; 
			case Id_lastChild:
				proxy.setProperty("lastChild", value);
				proxy.onPropertyChanged("lastChild", value);
				break; 
			case Id_namespaceURI:
				proxy.setProperty("namespaceURI", value);
				proxy.onPropertyChanged("namespaceURI", value);
				break; 
			case Id_previousSibling:
				proxy.setProperty("previousSibling", value);
				proxy.onPropertyChanged("previousSibling", value);
				break; 
			case Id_parentNode:
				proxy.setProperty("parentNode", value);
				proxy.onPropertyChanged("parentNode", value);
				break; 
			case Id_prefix:
				proxy.setter_prefix(value);
				break; 
			case Id_nodeValue:
				proxy.setter_nodeValue(value);
				break; 
			case Id_attributes:
				proxy.setProperty("attributes", value);
				proxy.onPropertyChanged("attributes", value);
				break; 
			case Id_nodeType:
				proxy.setProperty("nodeType", value);
				proxy.onPropertyChanged("nodeType", value);
				break; 
			case Id_nextSibling:
				proxy.setProperty("nextSibling", value);
				proxy.onPropertyChanged("nextSibling", value);
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
