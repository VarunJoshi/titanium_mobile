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

import ti.modules.titanium.xml.NamedNodeMapProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class NamedNodeMapProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -6588068211820423678L;

	private static final String TAG = "NamedNodeMapProxyPrototype";
	private static final String CLASS_TAG = "NamedNodeMapProxy";
	private static NamedNodeMapProxyPrototype namedNodeMapProxyPrototype;


	public static NamedNodeMapProxyPrototype getProxyPrototype()
	{
		return namedNodeMapProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		namedNodeMapProxyPrototype = null;
	}

	public NamedNodeMapProxyPrototype()
	{
		if (namedNodeMapProxyPrototype == null && getClass().equals(NamedNodeMapProxyPrototype.class)) {
			namedNodeMapProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == namedNodeMapProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return namedNodeMapProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(NamedNodeMapProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getNamedItem(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getNamedItem()", Log.DEBUG_MODE);

		try {
		NamedNodeMapProxy proxy = (NamedNodeMapProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getNamedItem: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.getNamedItem(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object setNamedItemNS(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setNamedItemNS()", Log.DEBUG_MODE);

		try {
		NamedNodeMapProxy proxy = (NamedNodeMapProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setNamedItemNS: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.xml.NodeProxy arg0;
		arg0 = (ti.modules.titanium.xml.NodeProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.setNamedItemNS(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object removeNamedItemNS(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeNamedItemNS()", Log.DEBUG_MODE);

		try {
		NamedNodeMapProxy proxy = (NamedNodeMapProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("removeNamedItemNS: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.removeNamedItemNS(arg0, arg1);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getNamedItemNS(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getNamedItemNS()", Log.DEBUG_MODE);

		try {
		NamedNodeMapProxy proxy = (NamedNodeMapProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("getNamedItemNS: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.getNamedItemNS(arg0, arg1);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object item(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "item()", Log.DEBUG_MODE);

		try {
		NamedNodeMapProxy proxy = (NamedNodeMapProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("item: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.item(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object setNamedItem(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setNamedItem()", Log.DEBUG_MODE);

		try {
		NamedNodeMapProxy proxy = (NamedNodeMapProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setNamedItem: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.xml.NodeProxy arg0;
		arg0 = (ti.modules.titanium.xml.NodeProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.setNamedItem(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getLength(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLength()", Log.DEBUG_MODE);

		try {
		NamedNodeMapProxy proxy = (NamedNodeMapProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getLength();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object removeNamedItem(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeNamedItem()", Log.DEBUG_MODE);

		try {
		NamedNodeMapProxy proxy = (NamedNodeMapProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removeNamedItem: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.removeNamedItem(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Number getter_length()
	{
		Log.d(TAG, "get length", Log.DEBUG_MODE);
		NamedNodeMapProxy proxy = (NamedNodeMapProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getLength();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getNamedItem = 2,
		Id_setNamedItemNS = 3,
		Id_removeNamedItemNS = 4,
		Id_getNamedItemNS = 5,
		Id_item = 6,
		Id_setNamedItem = 7,
		Id_getLength = 8,
		Id_removeNamedItem = 9
;
		

	public static final int MAX_PROTOTYPE_ID = 9;

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
            case 4: X="item";id=Id_item; break L;
            case 9: X="getLength";id=Id_getLength; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: c=s.charAt(0);
                if (c=='g') { X="getNamedItem";id=Id_getNamedItem; }
                else if (c=='s') { X="setNamedItem";id=Id_setNamedItem; }
                break L;
            case 14: c=s.charAt(0);
                if (c=='g') { X="getNamedItemNS";id=Id_getNamedItemNS; }
                else if (c=='s') { X="setNamedItemNS";id=Id_setNamedItemNS; }
                break L;
            case 15: X="removeNamedItem";id=Id_removeNamedItem; break L;
            case 17: X="removeNamedItemNS";id=Id_removeNamedItemNS; break L;
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
			case Id_getNamedItem:
				arity = 1;
				name = "getNamedItem";
				break;
			case Id_setNamedItemNS:
				arity = 1;
				name = "setNamedItemNS";
				break;
			case Id_removeNamedItemNS:
				arity = 2;
				name = "removeNamedItemNS";
				break;
			case Id_getNamedItemNS:
				arity = 2;
				name = "getNamedItemNS";
				break;
			case Id_item:
				arity = 1;
				name = "item";
				break;
			case Id_setNamedItem:
				arity = 1;
				name = "setNamedItem";
				break;
			case Id_getLength:
				arity = 0;
				name = "getLength";
				break;
			case Id_removeNamedItem:
				arity = 1;
				name = "removeNamedItem";
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

		while (thisObj != null && !(thisObj instanceof NamedNodeMapProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		NamedNodeMapProxyPrototype proxy = (NamedNodeMapProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getNamedItem:
				return getNamedItem(cx, thisObj, args);
				
			case Id_setNamedItemNS:
				return setNamedItemNS(cx, thisObj, args);
				
			case Id_removeNamedItemNS:
				return removeNamedItemNS(cx, thisObj, args);
				
			case Id_getNamedItemNS:
				return getNamedItemNS(cx, thisObj, args);
				
			case Id_item:
				return item(cx, thisObj, args);
				
			case Id_setNamedItem:
				return setNamedItem(cx, thisObj, args);
				
			case Id_getLength:
				return getLength(cx, thisObj, args);
				
			case Id_removeNamedItem:
				return removeNamedItem(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_length = 1
		;

;

;

	public static final int MAX_INSTANCE_ID = 1;

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
            if (s.length()==6) { X="length";id=Id_length; }
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
			case Id_length:
				return "length"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		NamedNodeMapProxyPrototype proxy = this;
		while (start != null && !(start instanceof NamedNodeMapProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof NamedNodeMapProxyPrototype) {
			proxy = (NamedNodeMapProxyPrototype) start;
		}

		switch (id) {
			case Id_length:
				return proxy.getter_length();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		NamedNodeMapProxyPrototype proxy = this;
		while (start != null && !(start instanceof NamedNodeMapProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof NamedNodeMapProxyPrototype) {
			proxy = (NamedNodeMapProxyPrototype) start;
		}

		switch (id) {
			case Id_length:
				proxy.setProperty("length", value);
				proxy.onPropertyChanged("length", value);
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
