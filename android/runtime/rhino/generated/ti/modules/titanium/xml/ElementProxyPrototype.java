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

import ti.modules.titanium.xml.ElementProxy;

import ti.modules.titanium.xml.NodeProxyPrototype;


public class ElementProxyPrototype extends NodeProxyPrototype
{
	private static final long serialVersionUID = 8131804572710749738L;

	private static final String TAG = "ElementProxyPrototype";
	private static final String CLASS_TAG = "ElementProxy";
	private static ElementProxyPrototype elementProxyPrototype;


	public static ElementProxyPrototype getProxyPrototype()
	{
		return elementProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		elementProxyPrototype = null;
	}

	public ElementProxyPrototype()
	{
		if (elementProxyPrototype == null && getClass().equals(ElementProxyPrototype.class)) {
			elementProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == elementProxyPrototype) {
			return NodeProxyPrototype.getProxyPrototype();
		}
		return elementProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return NodeProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ElementProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object hasAttribute(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "hasAttribute()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("hasAttribute: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		boolean javaResult = proxy.hasAttribute(arg0);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAttributeNS(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAttributeNS()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("getAttributeNS: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		java.lang.String javaResult = proxy.getAttributeNS(arg0, arg1);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object setAttributeNodeNS(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setAttributeNodeNS()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setAttributeNodeNS: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.xml.AttrProxy arg0;
		arg0 = (ti.modules.titanium.xml.AttrProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		ti.modules.titanium.xml.AttrProxy javaResult = proxy.setAttributeNodeNS(arg0);

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
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();
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

	public void removeAttributeNS(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeAttributeNS()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("removeAttributeNS: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		proxy.removeAttributeNS(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setAttributeNS(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setAttributeNS()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("setAttributeNS: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;
		java.lang.String arg2;
		arg2 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[2], thisObj) ;

		proxy.setAttributeNS(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setAttribute(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setAttribute()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setAttribute: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		proxy.setAttribute(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getAttribute(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAttribute()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getAttribute: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		java.lang.String javaResult = proxy.getAttribute(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getText(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getText()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getText();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object removeAttributeNode(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeAttributeNode()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removeAttributeNode: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.xml.AttrProxy arg0;
		arg0 = (ti.modules.titanium.xml.AttrProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		ti.modules.titanium.xml.AttrProxy javaResult = proxy.removeAttributeNode(arg0);

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
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();
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

	public Object getAttributeNode(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAttributeNode()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getAttributeNode: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		ti.modules.titanium.xml.AttrProxy javaResult = proxy.getAttributeNode(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object setAttributeNode(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setAttributeNode()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setAttributeNode: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.xml.AttrProxy arg0;
		arg0 = (ti.modules.titanium.xml.AttrProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		ti.modules.titanium.xml.AttrProxy javaResult = proxy.setAttributeNode(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getTextContent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTextContent()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getTextContent();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void removeAttribute(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeAttribute()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removeAttribute: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.removeAttribute(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object hasAttributeNS(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "hasAttributeNS()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("hasAttributeNS: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		boolean javaResult = proxy.hasAttributeNS(arg0, arg1);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getTagName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTagName()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getTagName();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAttributeNodeNS(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAttributeNodeNS()", Log.DEBUG_MODE);

		try {
		ElementProxy proxy = (ElementProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("getAttributeNodeNS: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		ti.modules.titanium.xml.AttrProxy javaResult = proxy.getAttributeNodeNS(arg0, arg1);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public String getter_text()
	{
		Log.d(TAG, "get text", Log.DEBUG_MODE);
		ElementProxy proxy = (ElementProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getText();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_textContent()
	{
		Log.d(TAG, "get textContent", Log.DEBUG_MODE);
		ElementProxy proxy = (ElementProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getTextContent();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_tagName()
	{
		Log.d(TAG, "get tagName", Log.DEBUG_MODE);
		ElementProxy proxy = (ElementProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getTagName();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_hasAttribute = 2,
		Id_getAttributeNS = 3,
		Id_setAttributeNodeNS = 4,
		Id_getElementsByTagNameNS = 5,
		Id_removeAttributeNS = 6,
		Id_setAttributeNS = 7,
		Id_setAttribute = 8,
		Id_getAttribute = 9,
		Id_getText = 10,
		Id_removeAttributeNode = 11,
		Id_getElementsByTagName = 12,
		Id_getAttributeNode = 13,
		Id_setAttributeNode = 14,
		Id_getTextContent = 15,
		Id_removeAttribute = 16,
		Id_hasAttributeNS = 17,
		Id_getTagName = 18,
		Id_getAttributeNodeNS = 19
;
		

	public static final int MAX_PROTOTYPE_ID = 19;

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
            case 7: X="getText";id=Id_getText; break L;
            case 10: X="getTagName";id=Id_getTagName; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: c=s.charAt(0);
                if (c=='g') { X="getAttribute";id=Id_getAttribute; }
                else if (c=='h') { X="hasAttribute";id=Id_hasAttribute; }
                else if (c=='s') { X="setAttribute";id=Id_setAttribute; }
                break L;
            case 14: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(13);
                    if (c=='S') { X="getAttributeNS";id=Id_getAttributeNS; }
                    else if (c=='t') { X="getTextContent";id=Id_getTextContent; }
                }
                else if (c=='h') { X="hasAttributeNS";id=Id_hasAttributeNS; }
                else if (c=='s') { X="setAttributeNS";id=Id_setAttributeNS; }
                break L;
            case 15: X="removeAttribute";id=Id_removeAttribute; break L;
            case 16: c=s.charAt(0);
                if (c=='g') { X="getAttributeNode";id=Id_getAttributeNode; }
                else if (c=='s') { X="setAttributeNode";id=Id_setAttributeNode; }
                break L;
            case 17: X="removeAttributeNS";id=Id_removeAttributeNS; break L;
            case 18: c=s.charAt(0);
                if (c=='g') { X="getAttributeNodeNS";id=Id_getAttributeNodeNS; }
                else if (c=='s') { X="setAttributeNodeNS";id=Id_setAttributeNodeNS; }
                break L;
            case 19: X="removeAttributeNode";id=Id_removeAttributeNode; break L;
            case 20: X="getElementsByTagName";id=Id_getElementsByTagName; break L;
            case 22: X="getElementsByTagNameNS";id=Id_getElementsByTagNameNS; break L;
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
			case Id_hasAttribute:
				arity = 1;
				name = "hasAttribute";
				break;
			case Id_getAttributeNS:
				arity = 2;
				name = "getAttributeNS";
				break;
			case Id_setAttributeNodeNS:
				arity = 1;
				name = "setAttributeNodeNS";
				break;
			case Id_getElementsByTagNameNS:
				arity = 2;
				name = "getElementsByTagNameNS";
				break;
			case Id_removeAttributeNS:
				arity = 2;
				name = "removeAttributeNS";
				break;
			case Id_setAttributeNS:
				arity = 3;
				name = "setAttributeNS";
				break;
			case Id_setAttribute:
				arity = 2;
				name = "setAttribute";
				break;
			case Id_getAttribute:
				arity = 1;
				name = "getAttribute";
				break;
			case Id_getText:
				arity = 0;
				name = "getText";
				break;
			case Id_removeAttributeNode:
				arity = 1;
				name = "removeAttributeNode";
				break;
			case Id_getElementsByTagName:
				arity = 1;
				name = "getElementsByTagName";
				break;
			case Id_getAttributeNode:
				arity = 1;
				name = "getAttributeNode";
				break;
			case Id_setAttributeNode:
				arity = 1;
				name = "setAttributeNode";
				break;
			case Id_getTextContent:
				arity = 0;
				name = "getTextContent";
				break;
			case Id_removeAttribute:
				arity = 1;
				name = "removeAttribute";
				break;
			case Id_hasAttributeNS:
				arity = 2;
				name = "hasAttributeNS";
				break;
			case Id_getTagName:
				arity = 0;
				name = "getTagName";
				break;
			case Id_getAttributeNodeNS:
				arity = 2;
				name = "getAttributeNodeNS";
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

		while (thisObj != null && !(thisObj instanceof ElementProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ElementProxyPrototype proxy = (ElementProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_hasAttribute:
				return hasAttribute(cx, thisObj, args);
				
			case Id_getAttributeNS:
				return getAttributeNS(cx, thisObj, args);
				
			case Id_setAttributeNodeNS:
				return setAttributeNodeNS(cx, thisObj, args);
				
			case Id_getElementsByTagNameNS:
				return getElementsByTagNameNS(cx, thisObj, args);
				
			case Id_removeAttributeNS:
				 removeAttributeNS(cx, thisObj, args);
				return Undefined.instance;
			case Id_setAttributeNS:
				 setAttributeNS(cx, thisObj, args);
				return Undefined.instance;
			case Id_setAttribute:
				 setAttribute(cx, thisObj, args);
				return Undefined.instance;
			case Id_getAttribute:
				return getAttribute(cx, thisObj, args);
				
			case Id_getText:
				return getText(cx, thisObj, args);
				
			case Id_removeAttributeNode:
				return removeAttributeNode(cx, thisObj, args);
				
			case Id_getElementsByTagName:
				return getElementsByTagName(cx, thisObj, args);
				
			case Id_getAttributeNode:
				return getAttributeNode(cx, thisObj, args);
				
			case Id_setAttributeNode:
				return setAttributeNode(cx, thisObj, args);
				
			case Id_getTextContent:
				return getTextContent(cx, thisObj, args);
				
			case Id_removeAttribute:
				 removeAttribute(cx, thisObj, args);
				return Undefined.instance;
			case Id_hasAttributeNS:
				return hasAttributeNS(cx, thisObj, args);
				
			case Id_getTagName:
				return getTagName(cx, thisObj, args);
				
			case Id_getAttributeNodeNS:
				return getAttributeNodeNS(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_text = 1
		,		
		Id_textContent = 2
		,		
		Id_tagName = 3
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
            if (s_length==4) { X="text";id=Id_text; }
            else if (s_length==7) { X="tagName";id=Id_tagName; }
            else if (s_length==11) { X="textContent";id=Id_textContent; }
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
			case Id_text:
				return "text"; 
			case Id_textContent:
				return "textContent"; 
			case Id_tagName:
				return "tagName"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ElementProxyPrototype proxy = this;
		while (start != null && !(start instanceof ElementProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ElementProxyPrototype) {
			proxy = (ElementProxyPrototype) start;
		}

		switch (id) {
			case Id_text:
				return proxy.getter_text();
			case Id_textContent:
				return proxy.getter_textContent();
			case Id_tagName:
				return proxy.getter_tagName();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ElementProxyPrototype proxy = this;
		while (start != null && !(start instanceof ElementProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ElementProxyPrototype) {
			proxy = (ElementProxyPrototype) start;
		}

		switch (id) {
			case Id_text:
				proxy.setProperty("text", value);
				proxy.onPropertyChanged("text", value);
				break; 
			case Id_textContent:
				proxy.setProperty("textContent", value);
				proxy.onPropertyChanged("textContent", value);
				break; 
			case Id_tagName:
				proxy.setProperty("tagName", value);
				proxy.onPropertyChanged("tagName", value);
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
