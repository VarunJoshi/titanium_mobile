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

import ti.modules.titanium.xml.DocumentProxy;

import ti.modules.titanium.xml.NodeProxyPrototype;


public class DocumentProxyPrototype extends NodeProxyPrototype
{
	private static final long serialVersionUID = 4267772707187602672L;

	private static final String TAG = "DocumentProxyPrototype";
	private static final String CLASS_TAG = "DocumentProxy";
	private static DocumentProxyPrototype documentProxyPrototype;


	public static DocumentProxyPrototype getProxyPrototype()
	{
		return documentProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		documentProxyPrototype = null;
	}

	public DocumentProxyPrototype()
	{
		if (documentProxyPrototype == null && getClass().equals(DocumentProxyPrototype.class)) {
			documentProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == documentProxyPrototype) {
			return NodeProxyPrototype.getProxyPrototype();
		}
		return documentProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return NodeProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(DocumentProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getElementById(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getElementById()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getElementById: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		ti.modules.titanium.xml.ElementProxy javaResult = proxy.getElementById(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createEntityReference(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createEntityReference()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("createEntityReference: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		ti.modules.titanium.xml.EntityReferenceProxy javaResult = proxy.createEntityReference(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getImplementation(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getImplementation()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.DOMImplementationProxy javaResult = proxy.getImplementation();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object importNode(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "importNode()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("importNode: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.xml.NodeProxy arg0;
		arg0 = (ti.modules.titanium.xml.NodeProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		if (!(args[1] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg1;
		arg1 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[1], thisObj) ;

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.importNode(arg0, arg1);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getElementsByTagNameNS(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getElementsByTagNameNS()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("getElementsByTagNameNS: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		ti.modules.titanium.xml.NodeListProxy javaResult = proxy.getElementsByTagNameNS(arg0, arg1);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createTextNode(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createTextNode()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("createTextNode: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		ti.modules.titanium.xml.TextProxy javaResult = proxy.createTextNode(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createElementNS(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createElementNS()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("createElementNS: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		ti.modules.titanium.xml.ElementProxy javaResult = proxy.createElementNS(arg0, arg1);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getDoctype(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDoctype()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.DocumentTypeProxy javaResult = proxy.getDoctype();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createDocumentFragment(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createDocumentFragment()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.DocumentFragmentProxy javaResult = proxy.createDocumentFragment();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createComment(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createComment()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("createComment: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		ti.modules.titanium.xml.CommentProxy javaResult = proxy.createComment(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createAttributeNS(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createAttributeNS()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("createAttributeNS: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		ti.modules.titanium.xml.AttrProxy javaResult = proxy.createAttributeNS(arg0, arg1);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getDocumentElement(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDocumentElement()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.ElementProxy javaResult = proxy.getDocumentElement();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getElementsByTagName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getElementsByTagName()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getElementsByTagName: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		ti.modules.titanium.xml.NodeListProxy javaResult = proxy.getElementsByTagName(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createAttribute(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createAttribute()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("createAttribute: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		ti.modules.titanium.xml.AttrProxy javaResult = proxy.createAttribute(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createCDATASection(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createCDATASection()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("createCDATASection: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		ti.modules.titanium.xml.CDATASectionProxy javaResult = proxy.createCDATASection(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createProcessingInstruction(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createProcessingInstruction()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("createProcessingInstruction: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		ti.modules.titanium.xml.ProcessingInstructionProxy javaResult = proxy.createProcessingInstruction(arg0, arg1);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createElement(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createElement()", Log.DEBUG_MODE);

		try {
		DocumentProxy proxy = (DocumentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("createElement: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		ti.modules.titanium.xml.ElementProxy javaResult = proxy.createElement(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Proxy getter_implementation()
	{
		Log.d(TAG, "get implementation", Log.DEBUG_MODE);
		DocumentProxy proxy = (DocumentProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.xml.DOMImplementationProxy javaResult = proxy.getImplementation();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Proxy getter_doctype()
	{
		Log.d(TAG, "get doctype", Log.DEBUG_MODE);
		DocumentProxy proxy = (DocumentProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.xml.DocumentTypeProxy javaResult = proxy.getDoctype();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Proxy getter_documentElement()
	{
		Log.d(TAG, "get documentElement", Log.DEBUG_MODE);
		DocumentProxy proxy = (DocumentProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.xml.ElementProxy javaResult = proxy.getDocumentElement();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getElementById = 2,
		Id_createEntityReference = 3,
		Id_getImplementation = 4,
		Id_importNode = 5,
		Id_getElementsByTagNameNS = 6,
		Id_createTextNode = 7,
		Id_createElementNS = 8,
		Id_getDoctype = 9,
		Id_createDocumentFragment = 10,
		Id_createComment = 11,
		Id_createAttributeNS = 12,
		Id_getDocumentElement = 13,
		Id_getElementsByTagName = 14,
		Id_createAttribute = 15,
		Id_createCDATASection = 16,
		Id_createProcessingInstruction = 17,
		Id_createElement = 18
;
		

	public static final int MAX_PROTOTYPE_ID = 18;

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
            case 10: c=s.charAt(0);
                if (c=='g') { X="getDoctype";id=Id_getDoctype; }
                else if (c=='i') { X="importNode";id=Id_importNode; }
                break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 13: c=s.charAt(6);
                if (c=='C') { X="createComment";id=Id_createComment; }
                else if (c=='E') { X="createElement";id=Id_createElement; }
                break L;
            case 14: c=s.charAt(0);
                if (c=='c') { X="createTextNode";id=Id_createTextNode; }
                else if (c=='g') { X="getElementById";id=Id_getElementById; }
                break L;
            case 15: c=s.charAt(6);
                if (c=='A') { X="createAttribute";id=Id_createAttribute; }
                else if (c=='E') { X="createElementNS";id=Id_createElementNS; }
                break L;
            case 17: c=s.charAt(0);
                if (c=='c') { X="createAttributeNS";id=Id_createAttributeNS; }
                else if (c=='g') { X="getImplementation";id=Id_getImplementation; }
                break L;
            case 18: c=s.charAt(0);
                if (c=='c') { X="createCDATASection";id=Id_createCDATASection; }
                else if (c=='g') { X="getDocumentElement";id=Id_getDocumentElement; }
                break L;
            case 20: X="getElementsByTagName";id=Id_getElementsByTagName; break L;
            case 21: X="createEntityReference";id=Id_createEntityReference; break L;
            case 22: c=s.charAt(0);
                if (c=='c') { X="createDocumentFragment";id=Id_createDocumentFragment; }
                else if (c=='g') { X="getElementsByTagNameNS";id=Id_getElementsByTagNameNS; }
                break L;
            case 27: X="createProcessingInstruction";id=Id_createProcessingInstruction; break L;
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
			case Id_getElementById:
				arity = 1;
				name = "getElementById";
				break;
			case Id_createEntityReference:
				arity = 1;
				name = "createEntityReference";
				break;
			case Id_getImplementation:
				arity = 0;
				name = "getImplementation";
				break;
			case Id_importNode:
				arity = 2;
				name = "importNode";
				break;
			case Id_getElementsByTagNameNS:
				arity = 2;
				name = "getElementsByTagNameNS";
				break;
			case Id_createTextNode:
				arity = 1;
				name = "createTextNode";
				break;
			case Id_createElementNS:
				arity = 2;
				name = "createElementNS";
				break;
			case Id_getDoctype:
				arity = 0;
				name = "getDoctype";
				break;
			case Id_createDocumentFragment:
				arity = 0;
				name = "createDocumentFragment";
				break;
			case Id_createComment:
				arity = 1;
				name = "createComment";
				break;
			case Id_createAttributeNS:
				arity = 2;
				name = "createAttributeNS";
				break;
			case Id_getDocumentElement:
				arity = 0;
				name = "getDocumentElement";
				break;
			case Id_getElementsByTagName:
				arity = 1;
				name = "getElementsByTagName";
				break;
			case Id_createAttribute:
				arity = 1;
				name = "createAttribute";
				break;
			case Id_createCDATASection:
				arity = 1;
				name = "createCDATASection";
				break;
			case Id_createProcessingInstruction:
				arity = 2;
				name = "createProcessingInstruction";
				break;
			case Id_createElement:
				arity = 1;
				name = "createElement";
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

		while (thisObj != null && !(thisObj instanceof DocumentProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		DocumentProxyPrototype proxy = (DocumentProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getElementById:
				return getElementById(cx, thisObj, args);
				
			case Id_createEntityReference:
				return createEntityReference(cx, thisObj, args);
				
			case Id_getImplementation:
				return getImplementation(cx, thisObj, args);
				
			case Id_importNode:
				return importNode(cx, thisObj, args);
				
			case Id_getElementsByTagNameNS:
				return getElementsByTagNameNS(cx, thisObj, args);
				
			case Id_createTextNode:
				return createTextNode(cx, thisObj, args);
				
			case Id_createElementNS:
				return createElementNS(cx, thisObj, args);
				
			case Id_getDoctype:
				return getDoctype(cx, thisObj, args);
				
			case Id_createDocumentFragment:
				return createDocumentFragment(cx, thisObj, args);
				
			case Id_createComment:
				return createComment(cx, thisObj, args);
				
			case Id_createAttributeNS:
				return createAttributeNS(cx, thisObj, args);
				
			case Id_getDocumentElement:
				return getDocumentElement(cx, thisObj, args);
				
			case Id_getElementsByTagName:
				return getElementsByTagName(cx, thisObj, args);
				
			case Id_createAttribute:
				return createAttribute(cx, thisObj, args);
				
			case Id_createCDATASection:
				return createCDATASection(cx, thisObj, args);
				
			case Id_createProcessingInstruction:
				return createProcessingInstruction(cx, thisObj, args);
				
			case Id_createElement:
				return createElement(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_implementation = 1
		,		
		Id_doctype = 2
		,		
		Id_documentElement = 3
		;

;

;

	public static final int MAX_INSTANCE_ID = 3;

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
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==7) { X="doctype";id=Id_doctype; }
            else if (s_length==14) { X="implementation";id=Id_implementation; }
            else if (s_length==15) { X="documentElement";id=Id_documentElement; }
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
			case Id_implementation:
				return "implementation"; 
			case Id_doctype:
				return "doctype"; 
			case Id_documentElement:
				return "documentElement"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		DocumentProxyPrototype proxy = this;
		while (start != null && !(start instanceof DocumentProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof DocumentProxyPrototype) {
			proxy = (DocumentProxyPrototype) start;
		}

		switch (id) {
			case Id_implementation:
				return proxy.getter_implementation();
			case Id_doctype:
				return proxy.getter_doctype();
			case Id_documentElement:
				return proxy.getter_documentElement();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		DocumentProxyPrototype proxy = this;
		while (start != null && !(start instanceof DocumentProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof DocumentProxyPrototype) {
			proxy = (DocumentProxyPrototype) start;
		}

		switch (id) {
			case Id_implementation:
				proxy.setProperty("implementation", value);
				proxy.onPropertyChanged("implementation", value);
				break; 
			case Id_doctype:
				proxy.setProperty("doctype", value);
				proxy.onPropertyChanged("doctype", value);
				break; 
			case Id_documentElement:
				proxy.setProperty("documentElement", value);
				proxy.onPropertyChanged("documentElement", value);
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
