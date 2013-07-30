/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.app.properties;

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

import ti.modules.titanium.app.properties.PropertiesModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class PropertiesModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = -4524312709339203951L;

	private static final String TAG = "PropertiesModulePrototype";
	private static final String CLASS_TAG = "PropertiesModule";
	private static PropertiesModulePrototype propertiesModulePrototype;


	public static PropertiesModulePrototype getProxyPrototype()
	{
		return propertiesModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		propertiesModulePrototype = null;
	}

	public PropertiesModulePrototype()
	{
		if (propertiesModulePrototype == null && getClass().equals(PropertiesModulePrototype.class)) {
			propertiesModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;
	}

	public Scriptable getPrototype()
	{
		if (this == propertiesModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return propertiesModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(PropertiesModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object hasProperty(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "hasProperty()", Log.DEBUG_MODE);

		try {
		PropertiesModule proxy = (PropertiesModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("hasProperty: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		boolean javaResult = proxy.hasProperty(arg0);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setDouble(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setDouble()", Log.DEBUG_MODE);

		try {
		PropertiesModule proxy = (PropertiesModule) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setDouble: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		double arg1;
		arg1 = (double) TypeConverter.jsObjectToJavaDouble(args[1], thisObj) ;

		proxy.setDouble(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getDouble(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDouble()", Log.DEBUG_MODE);

		try {
		PropertiesModule proxy = (PropertiesModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getDouble: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		double javaResult = proxy.getDouble(arg0);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getInt(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getInt()", Log.DEBUG_MODE);

		try {
		PropertiesModule proxy = (PropertiesModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getInt: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		int javaResult = proxy.getInt(arg0);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setBool(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setBool()", Log.DEBUG_MODE);

		try {
		PropertiesModule proxy = (PropertiesModule) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setBool: Invalid number of arguments. Expected 2 but got " + args.length);
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

		proxy.setBool(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setString(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setString()", Log.DEBUG_MODE);

		try {
		PropertiesModule proxy = (PropertiesModule) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setString: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		proxy.setString(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setInt(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setInt()", Log.DEBUG_MODE);

		try {
		PropertiesModule proxy = (PropertiesModule) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setInt: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;

		proxy.setInt(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object listProperties(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "listProperties()", Log.DEBUG_MODE);

		try {
		PropertiesModule proxy = (PropertiesModule) ((Proxy) thisObj).getProxy();

		java.lang.String[] javaResult = proxy.listProperties();

		Scriptable rhinoResult = (Scriptable) TypeConverter.javaStringArrayToJsArray(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getBool(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getBool()", Log.DEBUG_MODE);

		try {
		PropertiesModule proxy = (PropertiesModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getBool: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		boolean javaResult = proxy.getBool(arg0);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getString(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getString()", Log.DEBUG_MODE);

		try {
		PropertiesModule proxy = (PropertiesModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getString: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		java.lang.String javaResult = proxy.getString(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void removeProperty(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeProperty()", Log.DEBUG_MODE);

		try {
		PropertiesModule proxy = (PropertiesModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removeProperty: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.removeProperty(arg0);
	

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
		Id_hasProperty = 2,
		Id_setDouble = 3,
		Id_getDouble = 4,
		Id_getInt = 5,
		Id_setBool = 6,
		Id_setString = 7,
		Id_setInt = 8,
		Id_listProperties = 9,
		Id_getBool = 10,
		Id_getString = 11,
		Id_removeProperty = 12
;
		

	public static final int MAX_PROTOTYPE_ID = 12;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 6: c=s.charAt(0);
                if (c=='g') { X="getInt";id=Id_getInt; }
                else if (c=='s') { X="setInt";id=Id_setInt; }
                break L;
            case 7: c=s.charAt(0);
                if (c=='g') { X="getBool";id=Id_getBool; }
                else if (c=='s') { X="setBool";id=Id_setBool; }
                break L;
            case 9: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(8);
                    if (c=='e') { X="getDouble";id=Id_getDouble; }
                    else if (c=='g') { X="getString";id=Id_getString; }
                }
                else if (c=='s') {
                    c=s.charAt(8);
                    if (c=='e') { X="setDouble";id=Id_setDouble; }
                    else if (c=='g') { X="setString";id=Id_setString; }
                }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='h') { X="hasProperty";id=Id_hasProperty; }
                break L;
            case 14: c=s.charAt(0);
                if (c=='l') { X="listProperties";id=Id_listProperties; }
                else if (c=='r') { X="removeProperty";id=Id_removeProperty; }
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
			case Id_hasProperty:
				arity = 1;
				name = "hasProperty";
				break;
			case Id_setDouble:
				arity = 2;
				name = "setDouble";
				break;
			case Id_getDouble:
				arity = 1;
				name = "getDouble";
				break;
			case Id_getInt:
				arity = 1;
				name = "getInt";
				break;
			case Id_setBool:
				arity = 2;
				name = "setBool";
				break;
			case Id_setString:
				arity = 2;
				name = "setString";
				break;
			case Id_setInt:
				arity = 2;
				name = "setInt";
				break;
			case Id_listProperties:
				arity = 0;
				name = "listProperties";
				break;
			case Id_getBool:
				arity = 1;
				name = "getBool";
				break;
			case Id_getString:
				arity = 1;
				name = "getString";
				break;
			case Id_removeProperty:
				arity = 1;
				name = "removeProperty";
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

		while (thisObj != null && !(thisObj instanceof PropertiesModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		PropertiesModulePrototype proxy = (PropertiesModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_hasProperty:
				return hasProperty(cx, thisObj, args);
				
			case Id_setDouble:
				 setDouble(cx, thisObj, args);
				return Undefined.instance;
			case Id_getDouble:
				return getDouble(cx, thisObj, args);
				
			case Id_getInt:
				return getInt(cx, thisObj, args);
				
			case Id_setBool:
				 setBool(cx, thisObj, args);
				return Undefined.instance;
			case Id_setString:
				 setString(cx, thisObj, args);
				return Undefined.instance;
			case Id_setInt:
				 setInt(cx, thisObj, args);
				return Undefined.instance;
			case Id_listProperties:
				return listProperties(cx, thisObj, args);
				
			case Id_getBool:
				return getBool(cx, thisObj, args);
				
			case Id_getString:
				return getString(cx, thisObj, args);
				
			case Id_removeProperty:
				 removeProperty(cx, thisObj, args);
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
