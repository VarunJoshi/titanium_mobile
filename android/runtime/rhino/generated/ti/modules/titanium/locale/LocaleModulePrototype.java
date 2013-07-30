/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.locale;

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

import ti.modules.titanium.locale.LocaleModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class LocaleModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = -2809640313872915995L;

	private static final String TAG = "LocaleModulePrototype";
	private static final String CLASS_TAG = "LocaleModule";
	private static LocaleModulePrototype localeModulePrototype;


	public static LocaleModulePrototype getProxyPrototype()
	{
		return localeModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		localeModulePrototype = null;
	}

	public LocaleModulePrototype()
	{
		if (localeModulePrototype == null && getClass().equals(LocaleModulePrototype.class)) {
			localeModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;
	}

	public Scriptable getPrototype()
	{
		if (this == localeModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return localeModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(LocaleModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getCurrencyCode(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getCurrencyCode()", Log.DEBUG_MODE);

		try {
		LocaleModule proxy = (LocaleModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getCurrencyCode: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		java.lang.String javaResult = proxy.getCurrencyCode(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getCurrentLanguage(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getCurrentLanguage()", Log.DEBUG_MODE);

		try {
		LocaleModule proxy = (LocaleModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getCurrentLanguage();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getCurrencySymbol(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getCurrencySymbol()", Log.DEBUG_MODE);

		try {
		LocaleModule proxy = (LocaleModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getCurrencySymbol: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		java.lang.String javaResult = proxy.getCurrencySymbol(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getCurrentCountry(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getCurrentCountry()", Log.DEBUG_MODE);

		try {
		LocaleModule proxy = (LocaleModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getCurrentCountry();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getCurrentLocale(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getCurrentLocale()", Log.DEBUG_MODE);

		try {
		LocaleModule proxy = (LocaleModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getCurrentLocale();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getLocaleCurrencySymbol(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLocaleCurrencySymbol()", Log.DEBUG_MODE);

		try {
		LocaleModule proxy = (LocaleModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getLocaleCurrencySymbol: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		java.lang.String javaResult = proxy.getLocaleCurrencySymbol(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setLanguage(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setLanguage()", Log.DEBUG_MODE);

		try {
		LocaleModule proxy = (LocaleModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setLanguage: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setLanguage(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getString(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getString()", Log.DEBUG_MODE);

		try {
		LocaleModule proxy = (LocaleModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getString: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		if (args.length <= 1) {
			arg1 = null;
		} else {
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;
		}

		java.lang.String javaResult = proxy.getString(arg0, arg1);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object formatTelephoneNumber(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "formatTelephoneNumber()", Log.DEBUG_MODE);

		try {
		LocaleModule proxy = (LocaleModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("formatTelephoneNumber: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		java.lang.String javaResult = proxy.formatTelephoneNumber(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public String getter_currentLocale()
	{
		Log.d(TAG, "get currentLocale", Log.DEBUG_MODE);
		LocaleModule proxy = (LocaleModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getCurrentLocale();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_currentLanguage()
	{
		Log.d(TAG, "get currentLanguage", Log.DEBUG_MODE);
		LocaleModule proxy = (LocaleModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getCurrentLanguage();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_language(Object value)
	{
		Log.d(TAG, "set language", Log.DEBUG_MODE);
		LocaleModule proxy = (LocaleModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setLanguage(arg0);
		//proxy.setProperty("language", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_currentCountry()
	{
		Log.d(TAG, "get currentCountry", Log.DEBUG_MODE);
		LocaleModule proxy = (LocaleModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getCurrentCountry();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getCurrencyCode = 2,
		Id_getCurrentLanguage = 3,
		Id_getCurrencySymbol = 4,
		Id_getCurrentCountry = 5,
		Id_getCurrentLocale = 6,
		Id_getLocaleCurrencySymbol = 7,
		Id_setLanguage = 8,
		Id_getString = 9,
		Id_formatTelephoneNumber = 10
;
		

	public static final int MAX_PROTOTYPE_ID = 10;

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
            case 9: X="getString";id=Id_getString; break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='s') { X="setLanguage";id=Id_setLanguage; }
                break L;
            case 15: X="getCurrencyCode";id=Id_getCurrencyCode; break L;
            case 16: X="getCurrentLocale";id=Id_getCurrentLocale; break L;
            case 17: c=s.charAt(9);
                if (c=='c') { X="getCurrencySymbol";id=Id_getCurrencySymbol; }
                else if (c=='t') { X="getCurrentCountry";id=Id_getCurrentCountry; }
                break L;
            case 18: X="getCurrentLanguage";id=Id_getCurrentLanguage; break L;
            case 21: X="formatTelephoneNumber";id=Id_formatTelephoneNumber; break L;
            case 23: X="getLocaleCurrencySymbol";id=Id_getLocaleCurrencySymbol; break L;
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
			case Id_getCurrencyCode:
				arity = 1;
				name = "getCurrencyCode";
				break;
			case Id_getCurrentLanguage:
				arity = 0;
				name = "getCurrentLanguage";
				break;
			case Id_getCurrencySymbol:
				arity = 1;
				name = "getCurrencySymbol";
				break;
			case Id_getCurrentCountry:
				arity = 0;
				name = "getCurrentCountry";
				break;
			case Id_getCurrentLocale:
				arity = 0;
				name = "getCurrentLocale";
				break;
			case Id_getLocaleCurrencySymbol:
				arity = 1;
				name = "getLocaleCurrencySymbol";
				break;
			case Id_setLanguage:
				arity = 1;
				name = "setLanguage";
				break;
			case Id_getString:
				arity = 2;
				name = "getString";
				break;
			case Id_formatTelephoneNumber:
				arity = 1;
				name = "formatTelephoneNumber";
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

		while (thisObj != null && !(thisObj instanceof LocaleModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		LocaleModulePrototype proxy = (LocaleModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getCurrencyCode:
				return getCurrencyCode(cx, thisObj, args);
				
			case Id_getCurrentLanguage:
				return getCurrentLanguage(cx, thisObj, args);
				
			case Id_getCurrencySymbol:
				return getCurrencySymbol(cx, thisObj, args);
				
			case Id_getCurrentCountry:
				return getCurrentCountry(cx, thisObj, args);
				
			case Id_getCurrentLocale:
				return getCurrentLocale(cx, thisObj, args);
				
			case Id_getLocaleCurrencySymbol:
				return getLocaleCurrencySymbol(cx, thisObj, args);
				
			case Id_setLanguage:
				 setLanguage(cx, thisObj, args);
				return Undefined.instance;
			case Id_getString:
				return getString(cx, thisObj, args);
				
			case Id_formatTelephoneNumber:
				return formatTelephoneNumber(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_currentLocale = 1
		,		
		Id_currentLanguage = 2
		,		
		Id_language = 3
		,		
		Id_currentCountry = 4
		;

;

;

	public static final int MAX_INSTANCE_ID = 4;

	@Override
	protected int getMaxInstanceId()
	{
		return MAX_INSTANCE_ID;
	}

	@Override
	protected int findInstanceIdInfo(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null;
            L: switch (s.length()) {
            case 8: X="language";id=Id_language; break L;
            case 13: X="currentLocale";id=Id_currentLocale; break L;
            case 14: X="currentCountry";id=Id_currentCountry; break L;
            case 15: X="currentLanguage";id=Id_currentLanguage; break L;
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
			case Id_currentLocale:
				return "currentLocale"; 
			case Id_currentLanguage:
				return "currentLanguage"; 
			case Id_language:
				return "language"; 
			case Id_currentCountry:
				return "currentCountry"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		LocaleModulePrototype proxy = this;
		while (start != null && !(start instanceof LocaleModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof LocaleModulePrototype) {
			proxy = (LocaleModulePrototype) start;
		}

		switch (id) {
			case Id_currentLocale:
				return proxy.getter_currentLocale();
			case Id_currentLanguage:
				return proxy.getter_currentLanguage();
			case Id_language:
				return proxy.getProperty("language");
			case Id_currentCountry:
				return proxy.getter_currentCountry();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		LocaleModulePrototype proxy = this;
		while (start != null && !(start instanceof LocaleModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof LocaleModulePrototype) {
			proxy = (LocaleModulePrototype) start;
		}

		switch (id) {
			case Id_currentLocale:
				proxy.setProperty("currentLocale", value);
				proxy.onPropertyChanged("currentLocale", value);
				break; 
			case Id_currentLanguage:
				proxy.setProperty("currentLanguage", value);
				proxy.onPropertyChanged("currentLanguage", value);
				break; 
			case Id_language:
				proxy.setter_language(value);
				break; 
			case Id_currentCountry:
				proxy.setProperty("currentCountry", value);
				proxy.onPropertyChanged("currentCountry", value);
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
