/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package org.appcelerator.titanium.proxy;

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

import org.appcelerator.titanium.proxy.DecorViewProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class DecorViewProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = 7698156106609883473L;

	private static final String TAG = "DecorViewProxyPrototype";
	private static final String CLASS_TAG = "DecorViewProxy";
	private static DecorViewProxyPrototype decorViewProxyPrototype;


	public static DecorViewProxyPrototype getProxyPrototype()
	{
		return decorViewProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		decorViewProxyPrototype = null;
	}

	public DecorViewProxyPrototype()
	{
		if (decorViewProxyPrototype == null && getClass().equals(DecorViewProxyPrototype.class)) {
			decorViewProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == decorViewProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return decorViewProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(DecorViewProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getOrientationModes(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getOrientationModes()", Log.DEBUG_MODE);

		try {
		DecorViewProxy proxy = (DecorViewProxy) ((Proxy) thisObj).getProxy();

		int[] javaResult = proxy.getOrientationModes();

		Scriptable rhinoResult = (Scriptable) TypeConverter.javaIntArrayToJsArray(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getOrientation(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getOrientation()", Log.DEBUG_MODE);

		try {
		DecorViewProxy proxy = (DecorViewProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getOrientation();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setOrientationModes(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setOrientationModes()", Log.DEBUG_MODE);

		try {
		DecorViewProxy proxy = (DecorViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setOrientationModes: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Scriptable) && args[0] != null) {
			String error = "Invalid value, expected type Scriptable, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		int[] arg0;
		arg0 = (int[]) TypeConverter.jsArrayToJavaIntArray((Scriptable) args[0], thisObj) ;

		proxy.setOrientationModes(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getOrientationModes = 2,
		Id_getOrientation = 3,
		Id_setOrientationModes = 4
;
		

	public static final int MAX_PROTOTYPE_ID = 4;

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
            int s_length = s.length();
            if (s_length==11) { X="constructor";id=Id_constructor; }
            else if (s_length==14) { X="getOrientation";id=Id_getOrientation; }
            else if (s_length==19) {
                c=s.charAt(0);
                if (c=='g') { X="getOrientationModes";id=Id_getOrientationModes; }
                else if (c=='s') { X="setOrientationModes";id=Id_setOrientationModes; }
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
			case Id_getOrientationModes:
				arity = 0;
				name = "getOrientationModes";
				break;
			case Id_getOrientation:
				arity = 0;
				name = "getOrientation";
				break;
			case Id_setOrientationModes:
				arity = 1;
				name = "setOrientationModes";
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

		while (thisObj != null && !(thisObj instanceof DecorViewProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		DecorViewProxyPrototype proxy = (DecorViewProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getOrientationModes:
				return getOrientationModes(cx, thisObj, args);
				
			case Id_getOrientation:
				return getOrientation(cx, thisObj, args);
				
			case Id_setOrientationModes:
				 setOrientationModes(cx, thisObj, args);
				return Undefined.instance;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



	public static final int MAX_INSTANCE_ID = -1;


	@Override
	public String getClassName()
	{
		return CLASS_TAG;
	}
}
