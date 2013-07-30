/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.utils;

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

import ti.modules.titanium.utils.UtilsModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class UtilsModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = 4654800245968145556L;

	private static final String TAG = "UtilsModulePrototype";
	private static final String CLASS_TAG = "UtilsModule";
	private static UtilsModulePrototype utilsModulePrototype;


	public static UtilsModulePrototype getProxyPrototype()
	{
		return utilsModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		utilsModulePrototype = null;
	}

	public UtilsModulePrototype()
	{
		if (utilsModulePrototype == null && getClass().equals(UtilsModulePrototype.class)) {
			utilsModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;
	}

	public Scriptable getPrototype()
	{
		if (this == utilsModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return utilsModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(UtilsModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object sha256(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "sha256()", Log.DEBUG_MODE);

		try {
		UtilsModule proxy = (UtilsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("sha256: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		java.lang.String javaResult = proxy.sha256(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object arrayTest(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "arrayTest()", Log.DEBUG_MODE);

		try {
		UtilsModule proxy = (UtilsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 4) {
			throw new IllegalArgumentException("arrayTest: Invalid number of arguments. Expected 4 but got " + args.length);
		}
		if (!(args[0] instanceof Scriptable) && args[0] != null) {
			String error = "Invalid value, expected type Scriptable, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		float[] arg0;
		arg0 = (float[]) TypeConverter.jsArrayToJavaFloatArray((Scriptable) args[0], thisObj) ;
		if (!(args[1] instanceof Scriptable) && args[1] != null) {
			String error = "Invalid value, expected type Scriptable, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		long[] arg1;
		arg1 = (long[]) TypeConverter.jsArrayToJavaLongArray((Scriptable) args[1], thisObj) ;
		if (!(args[2] instanceof Scriptable) && args[2] != null) {
			String error = "Invalid value, expected type Scriptable, got: " + args[2];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		int[] arg2;
		arg2 = (int[]) TypeConverter.jsArrayToJavaIntArray((Scriptable) args[2], thisObj) ;
		if (!(args[3] instanceof Scriptable) && args[3] != null) {
			String error = "Invalid value, expected type Scriptable, got: " + args[3];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		java.lang.String[] arg3;
		arg3 = (java.lang.String[]) TypeConverter.jsArrayToJavaStringArray((Scriptable) args[3], thisObj) ;

		boolean javaResult = proxy.arrayTest(arg0, arg1, arg2, arg3);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object base64decode(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "base64decode()", Log.DEBUG_MODE);

		try {
		UtilsModule proxy = (UtilsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("base64decode: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		org.appcelerator.titanium.TiBlob javaResult = proxy.base64decode(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object md5HexDigest(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "md5HexDigest()", Log.DEBUG_MODE);

		try {
		UtilsModule proxy = (UtilsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("md5HexDigest: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		java.lang.String javaResult = proxy.md5HexDigest(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object sha1(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "sha1()", Log.DEBUG_MODE);

		try {
		UtilsModule proxy = (UtilsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("sha1: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		java.lang.String javaResult = proxy.sha1(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object base64encode(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "base64encode()", Log.DEBUG_MODE);

		try {
		UtilsModule proxy = (UtilsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("base64encode: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		org.appcelerator.titanium.TiBlob javaResult = proxy.base64encode(arg0);

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
		Id_sha256 = 2,
		Id_arrayTest = 3,
		Id_base64decode = 4,
		Id_md5HexDigest = 5,
		Id_sha1 = 6,
		Id_base64encode = 7
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
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 4: X="sha1";id=Id_sha1; break L;
            case 6: X="sha256";id=Id_sha256; break L;
            case 9: X="arrayTest";id=Id_arrayTest; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: c=s.charAt(6);
                if (c=='D') { X="md5HexDigest";id=Id_md5HexDigest; }
                else if (c=='d') { X="base64decode";id=Id_base64decode; }
                else if (c=='e') { X="base64encode";id=Id_base64encode; }
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
			case Id_sha256:
				arity = 1;
				name = "sha256";
				break;
			case Id_arrayTest:
				arity = 4;
				name = "arrayTest";
				break;
			case Id_base64decode:
				arity = 1;
				name = "base64decode";
				break;
			case Id_md5HexDigest:
				arity = 1;
				name = "md5HexDigest";
				break;
			case Id_sha1:
				arity = 1;
				name = "sha1";
				break;
			case Id_base64encode:
				arity = 1;
				name = "base64encode";
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

		while (thisObj != null && !(thisObj instanceof UtilsModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		UtilsModulePrototype proxy = (UtilsModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_sha256:
				return sha256(cx, thisObj, args);
				
			case Id_arrayTest:
				return arrayTest(cx, thisObj, args);
				
			case Id_base64decode:
				return base64decode(cx, thisObj, args);
				
			case Id_md5HexDigest:
				return md5HexDigest(cx, thisObj, args);
				
			case Id_sha1:
				return sha1(cx, thisObj, args);
				
			case Id_base64encode:
				return base64encode(cx, thisObj, args);
				
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
