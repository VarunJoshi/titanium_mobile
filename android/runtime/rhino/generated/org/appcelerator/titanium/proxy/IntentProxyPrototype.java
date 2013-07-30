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

import org.appcelerator.titanium.proxy.IntentProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class IntentProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 7488041604686018765L;

	private static final String TAG = "IntentProxyPrototype";
	private static final String CLASS_TAG = "IntentProxy";
	private static IntentProxyPrototype intentProxyPrototype;


	public static IntentProxyPrototype getProxyPrototype()
	{
		return intentProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		intentProxyPrototype = null;
	}

	public IntentProxyPrototype()
	{
		if (intentProxyPrototype == null && getClass().equals(IntentProxyPrototype.class)) {
			intentProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == intentProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return intentProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(IntentProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getStringExtra(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getStringExtra()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getStringExtra: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		java.lang.String javaResult = proxy.getStringExtra(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void putExtra(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "putExtra()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("putExtra: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.Object arg1;
		arg1 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;

		proxy.putExtra(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setFlags(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setFlags()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setFlags: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setFlags(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setType(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setType()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setType: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setType(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object hasExtra(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "hasExtra()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("hasExtra: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		boolean javaResult = proxy.hasExtra(arg0);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void addFlags(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addFlags()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("addFlags: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.addFlags(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void putExtraUri(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "putExtraUri()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("putExtraUri: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		proxy.putExtraUri(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getBlobExtra(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getBlobExtra()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getBlobExtra: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		org.appcelerator.titanium.TiBlob javaResult = proxy.getBlobExtra(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAction(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAction()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getAction();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getFlags(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getFlags()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getFlags();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getLongExtra(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLongExtra()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("getLongExtra: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		long arg1;
		arg1 = (long) TypeConverter.jsObjectToJavaLong(args[1], thisObj) ;

		long javaResult = proxy.getLongExtra(arg0, arg1);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getType(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getType()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getType();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getBooleanExtra(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getBooleanExtra()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("getBooleanExtra: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		if (!(args[1] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg1;
		arg1 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[1], thisObj) ;

		boolean javaResult = proxy.getBooleanExtra(arg0, arg1);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void addCategory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addCategory()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("addCategory: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.addCategory(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getDoubleExtra(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDoubleExtra()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("getDoubleExtra: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		double arg1;
		arg1 = (double) TypeConverter.jsObjectToJavaDouble(args[1], thisObj) ;

		double javaResult = proxy.getDoubleExtra(arg0, arg1);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getData()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getData();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setAction(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setAction()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setAction: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setAction(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getIntExtra(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getIntExtra()", Log.DEBUG_MODE);

		try {
		IntentProxy proxy = (IntentProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("getIntExtra: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;

		int javaResult = proxy.getIntExtra(arg0, arg1);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Number getter_flags()
	{
		Log.d(TAG, "get flags", Log.DEBUG_MODE);
		IntentProxy proxy = (IntentProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getFlags();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public void setter_flags(Object value)
	{
		Log.d(TAG, "set flags", Log.DEBUG_MODE);
		IntentProxy proxy = (IntentProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setFlags(arg0);
		//proxy.setProperty("flags", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_data()
	{
		Log.d(TAG, "get data", Log.DEBUG_MODE);
		IntentProxy proxy = (IntentProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getData();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_action()
	{
		Log.d(TAG, "get action", Log.DEBUG_MODE);
		IntentProxy proxy = (IntentProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getAction();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_action(Object value)
	{
		Log.d(TAG, "set action", Log.DEBUG_MODE);
		IntentProxy proxy = (IntentProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setAction(arg0);
		//proxy.setProperty("action", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_type()
	{
		Log.d(TAG, "get type", Log.DEBUG_MODE);
		IntentProxy proxy = (IntentProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getType();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_type(Object value)
	{
		Log.d(TAG, "set type", Log.DEBUG_MODE);
		IntentProxy proxy = (IntentProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setType(arg0);
		//proxy.setProperty("type", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getClassName = 2,
		Id_setClassName = 3,
		Id_getPackageName = 4,
		Id_setPackageName = 5,
		Id_getUrl = 6,
		Id_setUrl = 7,
		// Method IDs
		Id_getStringExtra = 8,
		Id_putExtra = 9,
		Id_setFlags = 10,
		Id_setType = 11,
		Id_hasExtra = 12,
		Id_addFlags = 13,
		Id_putExtraUri = 14,
		Id_getBlobExtra = 15,
		Id_getAction = 16,
		Id_getFlags = 17,
		Id_getLongExtra = 18,
		Id_getType = 19,
		Id_getBooleanExtra = 20,
		Id_addCategory = 21,
		Id_getDoubleExtra = 22,
		Id_getData = 23,
		Id_setAction = 24,
		Id_getIntExtra = 25
;
		

	public static final int MAX_PROTOTYPE_ID = 25;

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
            case 6: c=s.charAt(0);
                if (c=='g') { X="getUrl";id=Id_getUrl; }
                else if (c=='s') { X="setUrl";id=Id_setUrl; }
                break L;
            case 7: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(6);
                    if (c=='a') { X="getData";id=Id_getData; }
                    else if (c=='e') { X="getType";id=Id_getType; }
                }
                else if (c=='s') { X="setType";id=Id_setType; }
                break L;
            case 8: switch (s.charAt(0)) {
                case 'a': X="addFlags";id=Id_addFlags; break L;
                case 'g': X="getFlags";id=Id_getFlags; break L;
                case 'h': X="hasExtra";id=Id_hasExtra; break L;
                case 'p': X="putExtra";id=Id_putExtra; break L;
                case 's': X="setFlags";id=Id_setFlags; break L;
                } break L;
            case 9: c=s.charAt(0);
                if (c=='g') { X="getAction";id=Id_getAction; }
                else if (c=='s') { X="setAction";id=Id_setAction; }
                break L;
            case 11: switch (s.charAt(0)) {
                case 'a': X="addCategory";id=Id_addCategory; break L;
                case 'c': X="constructor";id=Id_constructor; break L;
                case 'g': X="getIntExtra";id=Id_getIntExtra; break L;
                case 'p': X="putExtraUri";id=Id_putExtraUri; break L;
                } break L;
            case 12: c=s.charAt(3);
                if (c=='B') { X="getBlobExtra";id=Id_getBlobExtra; }
                else if (c=='C') {
                    c=s.charAt(0);
                    if (c=='g') { X="getClassName";id=Id_getClassName; }
                    else if (c=='s') { X="setClassName";id=Id_setClassName; }
                }
                else if (c=='L') { X="getLongExtra";id=Id_getLongExtra; }
                break L;
            case 14: c=s.charAt(3);
                if (c=='D') { X="getDoubleExtra";id=Id_getDoubleExtra; }
                else if (c=='P') {
                    c=s.charAt(0);
                    if (c=='g') { X="getPackageName";id=Id_getPackageName; }
                    else if (c=='s') { X="setPackageName";id=Id_setPackageName; }
                }
                else if (c=='S') { X="getStringExtra";id=Id_getStringExtra; }
                break L;
            case 15: X="getBooleanExtra";id=Id_getBooleanExtra; break L;
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
			case Id_getClassName:
				arity = 0;
				name = "getClassName";
				break;
			case Id_setClassName:
				arity = 1;
				name = "setClassName";
				break;
			case Id_getPackageName:
				arity = 0;
				name = "getPackageName";
				break;
			case Id_setPackageName:
				arity = 1;
				name = "setPackageName";
				break;
			case Id_getUrl:
				arity = 0;
				name = "getUrl";
				break;
			case Id_setUrl:
				arity = 1;
				name = "setUrl";
				break;
			case Id_getStringExtra:
				arity = 1;
				name = "getStringExtra";
				break;
			case Id_putExtra:
				arity = 2;
				name = "putExtra";
				break;
			case Id_setFlags:
				arity = 1;
				name = "setFlags";
				break;
			case Id_setType:
				arity = 1;
				name = "setType";
				break;
			case Id_hasExtra:
				arity = 1;
				name = "hasExtra";
				break;
			case Id_addFlags:
				arity = 1;
				name = "addFlags";
				break;
			case Id_putExtraUri:
				arity = 2;
				name = "putExtraUri";
				break;
			case Id_getBlobExtra:
				arity = 1;
				name = "getBlobExtra";
				break;
			case Id_getAction:
				arity = 0;
				name = "getAction";
				break;
			case Id_getFlags:
				arity = 0;
				name = "getFlags";
				break;
			case Id_getLongExtra:
				arity = 2;
				name = "getLongExtra";
				break;
			case Id_getType:
				arity = 0;
				name = "getType";
				break;
			case Id_getBooleanExtra:
				arity = 2;
				name = "getBooleanExtra";
				break;
			case Id_addCategory:
				arity = 1;
				name = "addCategory";
				break;
			case Id_getDoubleExtra:
				arity = 2;
				name = "getDoubleExtra";
				break;
			case Id_getData:
				arity = 0;
				name = "getData";
				break;
			case Id_setAction:
				arity = 1;
				name = "setAction";
				break;
			case Id_getIntExtra:
				arity = 2;
				name = "getIntExtra";
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

		while (thisObj != null && !(thisObj instanceof IntentProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		IntentProxyPrototype proxy = (IntentProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getClassName:
				return proxy.getProperty("className");
			case Id_setClassName:
				proxy.setProperty("className", args[0]);
				proxy.onPropertyChanged("className", args[0]);
				return Undefined.instance;
			case Id_getPackageName:
				return proxy.getProperty("packageName");
			case Id_setPackageName:
				proxy.setProperty("packageName", args[0]);
				proxy.onPropertyChanged("packageName", args[0]);
				return Undefined.instance;
			case Id_getUrl:
				return proxy.getProperty("url");
			case Id_setUrl:
				proxy.setProperty("url", args[0]);
				proxy.onPropertyChanged("url", args[0]);
				return Undefined.instance;
			case Id_getStringExtra:
				return getStringExtra(cx, thisObj, args);
				
			case Id_putExtra:
				 putExtra(cx, thisObj, args);
				return Undefined.instance;
			case Id_setFlags:
				 setFlags(cx, thisObj, args);
				return Undefined.instance;
			case Id_setType:
				 setType(cx, thisObj, args);
				return Undefined.instance;
			case Id_hasExtra:
				return hasExtra(cx, thisObj, args);
				
			case Id_addFlags:
				 addFlags(cx, thisObj, args);
				return Undefined.instance;
			case Id_putExtraUri:
				 putExtraUri(cx, thisObj, args);
				return Undefined.instance;
			case Id_getBlobExtra:
				return getBlobExtra(cx, thisObj, args);
				
			case Id_getAction:
				return getAction(cx, thisObj, args);
				
			case Id_getFlags:
				return getFlags(cx, thisObj, args);
				
			case Id_getLongExtra:
				return getLongExtra(cx, thisObj, args);
				
			case Id_getType:
				return getType(cx, thisObj, args);
				
			case Id_getBooleanExtra:
				return getBooleanExtra(cx, thisObj, args);
				
			case Id_addCategory:
				 addCategory(cx, thisObj, args);
				return Undefined.instance;
			case Id_getDoubleExtra:
				return getDoubleExtra(cx, thisObj, args);
				
			case Id_getData:
				return getData(cx, thisObj, args);
				
			case Id_setAction:
				 setAction(cx, thisObj, args);
				return Undefined.instance;
			case Id_getIntExtra:
				return getIntExtra(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_flags = 1
		,		
		Id_data = 2
		,		
		Id_action = 3
		,		
		Id_type = 4
		;

	// Property accessor IDs
	private static final int

		Id_className = 5
		,		
		Id_packageName = 6
		,		
		Id_url = 7
		;

;

	public static final int MAX_INSTANCE_ID = 7;

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
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 3: X="url";id=Id_url; break L;
            case 4: c=s.charAt(0);
                if (c=='d') { X="data";id=Id_data; }
                else if (c=='t') { X="type";id=Id_type; }
                break L;
            case 5: X="flags";id=Id_flags; break L;
            case 6: X="action";id=Id_action; break L;
            case 9: X="className";id=Id_className; break L;
            case 11: X="packageName";id=Id_packageName; break L;
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
			case Id_flags:
				return "flags"; 
			case Id_data:
				return "data"; 
			case Id_action:
				return "action"; 
			case Id_type:
				return "type"; 
			case Id_className:
				return "className";
			case Id_packageName:
				return "packageName";
			case Id_url:
				return "url";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		IntentProxyPrototype proxy = this;
		while (start != null && !(start instanceof IntentProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof IntentProxyPrototype) {
			proxy = (IntentProxyPrototype) start;
		}

		switch (id) {
			case Id_flags:
				return proxy.getter_flags();
			case Id_data:
				return proxy.getter_data();
			case Id_action:
				return proxy.getter_action();
			case Id_type:
				return proxy.getter_type();
			case Id_className:
				return proxy.getProperty("className");
			case Id_packageName:
				return proxy.getProperty("packageName");
			case Id_url:
				return proxy.getProperty("url");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		IntentProxyPrototype proxy = this;
		while (start != null && !(start instanceof IntentProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof IntentProxyPrototype) {
			proxy = (IntentProxyPrototype) start;
		}

		switch (id) {
			case Id_flags:
				proxy.setter_flags(value);
				break; 
			case Id_data:
				proxy.setProperty("data", value);
				proxy.onPropertyChanged("data", value);
				break; 
			case Id_action:
				proxy.setter_action(value);
				break; 
			case Id_type:
				proxy.setter_type(value);
				break; 
			case Id_className:
				proxy.setProperty("className", value);
				proxy.onPropertyChanged("className", value);
				break;
			case Id_packageName:
				proxy.setProperty("packageName", value);
				proxy.onPropertyChanged("packageName", value);
				break;
			case Id_url:
				proxy.setProperty("url", value);
				proxy.onPropertyChanged("url", value);
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
