/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package org.appcelerator.kroll;

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

import org.appcelerator.kroll.KrollProxy;



public class KrollProxyPrototype extends Proxy
{
	private static final long serialVersionUID = 6509492362691701116L;

	private static final String TAG = "KrollProxyPrototype";
	private static final String CLASS_TAG = "KrollProxy";
	private static KrollProxyPrototype krollProxyPrototype;


	public static KrollProxyPrototype getProxyPrototype()
	{
		return krollProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		krollProxyPrototype = null;
	}

	public KrollProxyPrototype()
	{
		if (krollProxyPrototype == null && getClass().equals(KrollProxyPrototype.class)) {
			krollProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == krollProxyPrototype) {
			return Proxy.getProxyPrototype();
		}
		return krollProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return Proxy.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(KrollProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void setCreationUrl(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setCreationUrl()", Log.DEBUG_MODE);

		try {
		KrollProxy proxy = (KrollProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setCreationUrl: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setCreationUrl(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getBubbleParent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getBubbleParent()", Log.DEBUG_MODE);

		try {
		KrollProxy proxy = (KrollProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getBubbleParent();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void extend(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "extend()", Log.DEBUG_MODE);

		try {
		KrollProxy proxy = (KrollProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("extend: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		proxy.extend(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setBubbleParent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setBubbleParent()", Log.DEBUG_MODE);

		try {
		KrollProxy proxy = (KrollProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setBubbleParent: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setBubbleParent(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object _fireEventToParent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "_fireEventToParent()", Log.DEBUG_MODE);

		try {
		KrollProxy proxy = (KrollProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("_fireEventToParent: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.Object arg1;
		arg1 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;

		boolean javaResult = proxy.fireEventToParent(arg0, arg1);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void applyProperties(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "applyProperties()", Log.DEBUG_MODE);

		try {
		KrollProxy proxy = (KrollProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("applyProperties: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.applyProperties(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Boolean getter_bubbleParent()
	{
		Log.d(TAG, "get bubbleParent", Log.DEBUG_MODE);
		KrollProxy proxy = (KrollProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getBubbleParent();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_bubbleParent(Object value)
	{
		Log.d(TAG, "set bubbleParent", Log.DEBUG_MODE);
		KrollProxy proxy = (KrollProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setBubbleParent(arg0);
		//proxy.setProperty("bubbleParent", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_get_hasJavaListener = 2,
		Id_set_hasJavaListener = 3,
		// Method IDs
		Id_setCreationUrl = 4,
		Id_getBubbleParent = 5,
		Id_extend = 6,
		Id_setBubbleParent = 7,
		Id__fireEventToParent = 8,
		Id_applyProperties = 9
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
// #generated# Last update: 2013-01-31 18:21:22 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 6: X="extend";id=Id_extend; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 14: X="setCreationUrl";id=Id_setCreationUrl; break L;
            case 15: c=s.charAt(0);
                if (c=='a') { X="applyProperties";id=Id_applyProperties; }
                else if (c=='g') { X="getBubbleParent";id=Id_getBubbleParent; }
                else if (c=='s') { X="setBubbleParent";id=Id_setBubbleParent; }
                break L;
            case 18: X="_fireEventToParent";id=Id__fireEventToParent; break L;
            case 19: c=s.charAt(0);
                if (c=='g') { X="get_hasJavaListener";id=Id_get_hasJavaListener; }
                else if (c=='s') { X="set_hasJavaListener";id=Id_set_hasJavaListener; }
                break L;
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
			case Id_get_hasJavaListener:
				arity = 0;
				name = "get_hasJavaListener";
				break;
			case Id_set_hasJavaListener:
				arity = 1;
				name = "set_hasJavaListener";
				break;
			case Id_setCreationUrl:
				arity = 1;
				name = "setCreationUrl";
				break;
			case Id_getBubbleParent:
				arity = 0;
				name = "getBubbleParent";
				break;
			case Id_extend:
				arity = 1;
				name = "extend";
				break;
			case Id_setBubbleParent:
				arity = 1;
				name = "setBubbleParent";
				break;
			case Id__fireEventToParent:
				arity = 2;
				name = "_fireEventToParent";
				break;
			case Id_applyProperties:
				arity = 1;
				name = "applyProperties";
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

		while (thisObj != null && !(thisObj instanceof KrollProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		KrollProxyPrototype proxy = (KrollProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_get_hasJavaListener:
				return proxy.getProperty("_hasJavaListener");
			case Id_set_hasJavaListener:
				proxy.setProperty("_hasJavaListener", args[0]);
				proxy.onPropertyChanged("_hasJavaListener", args[0]);
				return Undefined.instance;
			case Id_setCreationUrl:
				 setCreationUrl(cx, thisObj, args);
				return Undefined.instance;
			case Id_getBubbleParent:
				return getBubbleParent(cx, thisObj, args);
				
			case Id_extend:
				 extend(cx, thisObj, args);
				return Undefined.instance;
			case Id_setBubbleParent:
				 setBubbleParent(cx, thisObj, args);
				return Undefined.instance;
			case Id__fireEventToParent:
				return _fireEventToParent(cx, thisObj, args);
				
			case Id_applyProperties:
				 applyProperties(cx, thisObj, args);
				return Undefined.instance;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	// Dynamic property IDs
	private static final int

		Id_bubbleParent = 1
		;

	// Property accessor IDs
	private static final int

		Id__hasJavaListener = 2
		;

;

	public static final int MAX_INSTANCE_ID = 2;

	@Override
	protected int getMaxInstanceId()
	{
		return MAX_INSTANCE_ID;
	}

	@Override
	protected int findInstanceIdInfo(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:22 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==12) { X="bubbleParent";id=Id_bubbleParent; }
            else if (s_length==16) { X="_hasJavaListener";id=Id__hasJavaListener; }
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
			case Id_bubbleParent:
				return "bubbleParent"; 
			case Id__hasJavaListener:
				return "_hasJavaListener";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		KrollProxyPrototype proxy = this;
		while (start != null && !(start instanceof KrollProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof KrollProxyPrototype) {
			proxy = (KrollProxyPrototype) start;
		}

		switch (id) {
			case Id_bubbleParent:
				return proxy.getter_bubbleParent();
			case Id__hasJavaListener:
				return proxy.getProperty("_hasJavaListener");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		KrollProxyPrototype proxy = this;
		while (start != null && !(start instanceof KrollProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof KrollProxyPrototype) {
			proxy = (KrollProxyPrototype) start;
		}

		switch (id) {
			case Id_bubbleParent:
				proxy.setter_bubbleParent(value);
				break; 
			case Id__hasJavaListener:
				proxy.setProperty("_hasJavaListener", value);
				proxy.onPropertyChanged("_hasJavaListener", value);
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
