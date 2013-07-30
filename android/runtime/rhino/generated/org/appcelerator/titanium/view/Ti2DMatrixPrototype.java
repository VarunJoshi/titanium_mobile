/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package org.appcelerator.titanium.view;

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

import org.appcelerator.titanium.view.Ti2DMatrix;

import org.appcelerator.kroll.KrollProxyPrototype;


public class Ti2DMatrixPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -7994758777453531643L;

	private static final String TAG = "Ti2DMatrixPrototype";
	private static final String CLASS_TAG = "Ti2DMatrix";
	private static Ti2DMatrixPrototype ti2DMatrixPrototype;


	public static Ti2DMatrixPrototype getProxyPrototype()
	{
		return ti2DMatrixPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		ti2DMatrixPrototype = null;
	}

	public Ti2DMatrixPrototype()
	{
		if (ti2DMatrixPrototype == null && getClass().equals(Ti2DMatrixPrototype.class)) {
			ti2DMatrixPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == ti2DMatrixPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return ti2DMatrixPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(Ti2DMatrix.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object invert(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "invert()", Log.DEBUG_MODE);

		try {
		Ti2DMatrix proxy = (Ti2DMatrix) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.view.Ti2DMatrix javaResult = proxy.invert();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object scale(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "scale()", Log.DEBUG_MODE);

		try {
		Ti2DMatrix proxy = (Ti2DMatrix) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		org.appcelerator.titanium.view.Ti2DMatrix javaResult = proxy.scale(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object rotate(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "rotate()", Log.DEBUG_MODE);

		try {
		Ti2DMatrix proxy = (Ti2DMatrix) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		org.appcelerator.titanium.view.Ti2DMatrix javaResult = proxy.rotate(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object finalValuesAfterInterpolation(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "finalValuesAfterInterpolation()", Log.DEBUG_MODE);

		try {
		Ti2DMatrix proxy = (Ti2DMatrix) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("finalValuesAfterInterpolation: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;

		float[] javaResult = proxy.finalValuesAfterInterpolation(arg0, arg1);

		Scriptable rhinoResult = (Scriptable) TypeConverter.javaFloatArrayToJsArray(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object translate(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "translate()", Log.DEBUG_MODE);

		try {
		Ti2DMatrix proxy = (Ti2DMatrix) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("translate: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		double arg0;
		arg0 = (double) TypeConverter.jsObjectToJavaDouble(args[0], thisObj) ;
		double arg1;
		arg1 = (double) TypeConverter.jsObjectToJavaDouble(args[1], thisObj) ;

		org.appcelerator.titanium.view.Ti2DMatrix javaResult = proxy.translate(arg0, arg1);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object multiply(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "multiply()", Log.DEBUG_MODE);

		try {
		Ti2DMatrix proxy = (Ti2DMatrix) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("multiply: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.titanium.view.Ti2DMatrix arg0;
		arg0 = (org.appcelerator.titanium.view.Ti2DMatrix) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		org.appcelerator.titanium.view.Ti2DMatrix javaResult = proxy.multiply(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
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
		Id_invert = 2,
		Id_scale = 3,
		Id_rotate = 4,
		Id_finalValuesAfterInterpolation = 5,
		Id_translate = 6,
		Id_multiply = 7
;
		

	public static final int MAX_PROTOTYPE_ID = 7;

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
            case 5: X="scale";id=Id_scale; break L;
            case 6: c=s.charAt(0);
                if (c=='i') { X="invert";id=Id_invert; }
                else if (c=='r') { X="rotate";id=Id_rotate; }
                break L;
            case 8: X="multiply";id=Id_multiply; break L;
            case 9: X="translate";id=Id_translate; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 29: X="finalValuesAfterInterpolation";id=Id_finalValuesAfterInterpolation; break L;
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
			case Id_invert:
				arity = 0;
				name = "invert";
				break;
			case Id_scale:
				arity = 1;
				name = "scale";
				break;
			case Id_rotate:
				arity = 1;
				name = "rotate";
				break;
			case Id_finalValuesAfterInterpolation:
				arity = 2;
				name = "finalValuesAfterInterpolation";
				break;
			case Id_translate:
				arity = 2;
				name = "translate";
				break;
			case Id_multiply:
				arity = 1;
				name = "multiply";
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

		while (thisObj != null && !(thisObj instanceof Ti2DMatrixPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		Ti2DMatrixPrototype proxy = (Ti2DMatrixPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_invert:
				return invert(cx, thisObj, args);
				
			case Id_scale:
				return scale(cx, thisObj, args);
				
			case Id_rotate:
				return rotate(cx, thisObj, args);
				
			case Id_finalValuesAfterInterpolation:
				return finalValuesAfterInterpolation(cx, thisObj, args);
				
			case Id_translate:
				return translate(cx, thisObj, args);
				
			case Id_multiply:
				return multiply(cx, thisObj, args);
				
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
