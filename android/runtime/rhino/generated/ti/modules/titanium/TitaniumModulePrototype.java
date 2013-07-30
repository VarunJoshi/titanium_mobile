/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium;

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

import ti.modules.titanium.TitaniumModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class TitaniumModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = 1606504795374365325L;

	private static final String TAG = "TitaniumModulePrototype";
	private static final String CLASS_TAG = "TitaniumModule";
	private static TitaniumModulePrototype titaniumModulePrototype;

	// Lazy loaded child APIs
	private Object API_Service = null;
	private Object API_Accelerometer = null;
	private Object API_Intent = null;
	private Object API_Instrumentation = null;
	private Object API_Database = null;
	private Object API_Filesystem = null;
	private Object API_TiAnimation = null;
	private Object API_KrollProxy = null;
	private Object API_Buffer = null;
	private Object API_Analytics = null;
	private Object API_Menu = null;
	private Object API_TiFile = null;
	private Object API_TiWindow = null;
	private Object API_Codec = null;
	private Object API_R = null;
	private Object API_ActionBar = null;
	private Object API_Contacts = null;
	private Object API_Platform = null;
	private Object API_Media = null;
	private Object API_Map = null;
	private Object API_LocationProvider = null;
	private Object API_LocationRule = null;
	private Object API_UI = null;
	private Object API_Gesture = null;
	private Object API_Utils = null;
	private Object API_Locale = null;
	private Object API_Facebook = null;
	private Object API_Geolocation = null;
	private Object API_TiBlob = null;
	private Object API_TiView = null;
	private Object API_MenuItem = null;
	private Object API_TiBaseWindow = null;
	private Object API_Android = null;
	private Object API_KrollModule = null;
	private Object API_Activity = null;
	private Object API_App = null;
	private Object API_Network = null;
	private Object API_Stream = null;
	private Object API_Ti2DMatrix = null;
	private Object API_XML = null;
	private Object API_DecorView = null;

	public static TitaniumModulePrototype getProxyPrototype()
	{
		return titaniumModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		titaniumModulePrototype = null;
	}

	public TitaniumModulePrototype()
	{
		if (titaniumModulePrototype == null && getClass().equals(TitaniumModulePrototype.class)) {
			titaniumModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;
	}

	public Scriptable getPrototype()
	{
		if (this == titaniumModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return titaniumModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TitaniumModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getBuildHash(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getBuildHash()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getBuildHash();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object localize(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "localize()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		java.lang.String javaResult = proxy.localize(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object stringFormatDecimal(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "stringFormatDecimal()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		java.lang.String javaResult = proxy.stringFormatDecimal(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void alert(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "alert()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("alert: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.alert(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void testThrow(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "testThrow()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();

		proxy.testThrow();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getBuildTimestamp(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getBuildTimestamp()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getBuildTimestamp();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object stringFormatDate(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "stringFormatDate()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("stringFormatDate: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.util.Date arg0;
		arg0 = (java.util.Date) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		java.lang.String arg1;
		if (args.length <= 1) {
			arg1 = null;
		} else {
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;
		}

		java.lang.String javaResult = proxy.stringFormatDate(arg0, arg1);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object stringFormatTime(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "stringFormatTime()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("stringFormatTime: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.util.Date arg0;
		arg0 = (java.util.Date) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		java.lang.String javaResult = proxy.stringFormatTime(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getVersion(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getVersion()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getVersion();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getBuildDate(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getBuildDate()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getBuildDate();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object setTimeout(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setTimeout()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setTimeout: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		org.appcelerator.kroll.KrollFunction arg0;
		arg0 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		long arg1;
		arg1 = (long) TypeConverter.jsObjectToJavaLong(args[1], thisObj) ;
	int length = args.length - 2;
	if (length < 0) {
		length = 0;
	}

	Object[] arg2 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg2[i] = TypeConverter.jsObjectToJavaObject(args[i+2], this);
	}

		int javaResult = proxy.setTimeout(arg0, arg1, arg2);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void dumpCoverage(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "dumpCoverage()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();

		proxy.dumpCoverage();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void clearInterval(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "clearInterval()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("clearInterval: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.clearInterval(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getUserAgent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getUserAgent()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getUserAgent();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object stringFormat(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "stringFormat()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("stringFormat: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
	int length = args.length - 1;
	if (length < 0) {
		length = 0;
	}

	Object[] arg1 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg1[i] = TypeConverter.jsObjectToJavaObject(args[i+1], this);
	}

		java.lang.String javaResult = proxy.stringFormat(arg0, arg1);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void clearTimeout(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "clearTimeout()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("clearTimeout: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.clearTimeout(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object stringFormatCurrency(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "stringFormatCurrency()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("stringFormatCurrency: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		double arg0;
		arg0 = (double) TypeConverter.jsObjectToJavaDouble(args[0], thisObj) ;

		java.lang.String javaResult = proxy.stringFormatCurrency(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object setInterval(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setInterval()", Log.DEBUG_MODE);

		try {
		TitaniumModule proxy = (TitaniumModule) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setInterval: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		org.appcelerator.kroll.KrollFunction arg0;
		arg0 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		long arg1;
		arg1 = (long) TypeConverter.jsObjectToJavaLong(args[1], thisObj) ;
	int length = args.length - 2;
	if (length < 0) {
		length = 0;
	}

	Object[] arg2 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg2[i] = TypeConverter.jsObjectToJavaObject(args[i+2], this);
	}

		int javaResult = proxy.setInterval(arg0, arg1, arg2);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public String getter_userAgent()
	{
		Log.d(TAG, "get userAgent", Log.DEBUG_MODE);
		TitaniumModule proxy = (TitaniumModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getUserAgent();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_buildHash()
	{
		Log.d(TAG, "get buildHash", Log.DEBUG_MODE);
		TitaniumModule proxy = (TitaniumModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getBuildHash();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_buildDate()
	{
		Log.d(TAG, "get buildDate", Log.DEBUG_MODE);
		TitaniumModule proxy = (TitaniumModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getBuildDate();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_buildTimestamp()
	{
		Log.d(TAG, "get buildTimestamp", Log.DEBUG_MODE);
		TitaniumModule proxy = (TitaniumModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getBuildTimestamp();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_version()
	{
		Log.d(TAG, "get version", Log.DEBUG_MODE);
		TitaniumModule proxy = (TitaniumModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getVersion();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getBuildHash = 2,
		Id_localize = 3,
		Id_stringFormatDecimal = 4,
		Id_alert = 5,
		Id_testThrow = 6,
		Id_getBuildTimestamp = 7,
		Id_stringFormatDate = 8,
		Id_stringFormatTime = 9,
		Id_getVersion = 10,
		Id_getBuildDate = 11,
		Id_setTimeout = 12,
		Id_dumpCoverage = 13,
		Id_clearInterval = 14,
		Id_getUserAgent = 15,
		Id_stringFormat = 16,
		Id_clearTimeout = 17,
		Id_stringFormatCurrency = 18,
		Id_setInterval = 19,
		Id_createBuffer = 20
		;
		

	public static final int MAX_PROTOTYPE_ID = 20;

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
            case 5: X="alert";id=Id_alert; break L;
            case 8: X="localize";id=Id_localize; break L;
            case 9: X="testThrow";id=Id_testThrow; break L;
            case 10: c=s.charAt(0);
                if (c=='g') { X="getVersion";id=Id_getVersion; }
                else if (c=='s') { X="setTimeout";id=Id_setTimeout; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='s') { X="setInterval";id=Id_setInterval; }
                break L;
            case 12: switch (s.charAt(10)) {
                case 'a': X="stringFormat";id=Id_stringFormat; break L;
                case 'e': X="createBuffer";id=Id_createBuffer; break L;
                case 'g': X="dumpCoverage";id=Id_dumpCoverage; break L;
                case 'n': X="getUserAgent";id=Id_getUserAgent; break L;
                case 's': X="getBuildHash";id=Id_getBuildHash; break L;
                case 't': X="getBuildDate";id=Id_getBuildDate; break L;
                case 'u': X="clearTimeout";id=Id_clearTimeout; break L;
                } break L;
            case 13: X="clearInterval";id=Id_clearInterval; break L;
            case 16: c=s.charAt(12);
                if (c=='D') { X="stringFormatDate";id=Id_stringFormatDate; }
                else if (c=='T') { X="stringFormatTime";id=Id_stringFormatTime; }
                break L;
            case 17: X="getBuildTimestamp";id=Id_getBuildTimestamp; break L;
            case 19: X="stringFormatDecimal";id=Id_stringFormatDecimal; break L;
            case 20: X="stringFormatCurrency";id=Id_stringFormatCurrency; break L;
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
			case Id_getBuildHash:
				arity = 0;
				name = "getBuildHash";
				break;
			case Id_localize:
				arity = 1;
				name = "localize";
				break;
			case Id_stringFormatDecimal:
				arity = 1;
				name = "stringFormatDecimal";
				break;
			case Id_alert:
				arity = 1;
				name = "alert";
				break;
			case Id_testThrow:
				arity = 0;
				name = "testThrow";
				break;
			case Id_getBuildTimestamp:
				arity = 0;
				name = "getBuildTimestamp";
				break;
			case Id_stringFormatDate:
				arity = 2;
				name = "stringFormatDate";
				break;
			case Id_stringFormatTime:
				arity = 1;
				name = "stringFormatTime";
				break;
			case Id_getVersion:
				arity = 0;
				name = "getVersion";
				break;
			case Id_getBuildDate:
				arity = 0;
				name = "getBuildDate";
				break;
			case Id_setTimeout:
				arity = 3;
				name = "setTimeout";
				break;
			case Id_dumpCoverage:
				arity = 0;
				name = "dumpCoverage";
				break;
			case Id_clearInterval:
				arity = 1;
				name = "clearInterval";
				break;
			case Id_getUserAgent:
				arity = 0;
				name = "getUserAgent";
				break;
			case Id_stringFormat:
				arity = 2;
				name = "stringFormat";
				break;
			case Id_clearTimeout:
				arity = 1;
				name = "clearTimeout";
				break;
			case Id_stringFormatCurrency:
				arity = 1;
				name = "stringFormatCurrency";
				break;
			case Id_setInterval:
				arity = 3;
				name = "setInterval";
				break;
			case Id_createBuffer:
				arity = 1;
				name = "createBuffer";
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

		while (thisObj != null && !(thisObj instanceof TitaniumModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TitaniumModulePrototype proxy = (TitaniumModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getBuildHash:
				return getBuildHash(cx, thisObj, args);
				
			case Id_localize:
				return localize(cx, thisObj, args);
				
			case Id_stringFormatDecimal:
				return stringFormatDecimal(cx, thisObj, args);
				
			case Id_alert:
				 alert(cx, thisObj, args);
				return Undefined.instance;
			case Id_testThrow:
				 testThrow(cx, thisObj, args);
				return Undefined.instance;
			case Id_getBuildTimestamp:
				return getBuildTimestamp(cx, thisObj, args);
				
			case Id_stringFormatDate:
				return stringFormatDate(cx, thisObj, args);
				
			case Id_stringFormatTime:
				return stringFormatTime(cx, thisObj, args);
				
			case Id_getVersion:
				return getVersion(cx, thisObj, args);
				
			case Id_getBuildDate:
				return getBuildDate(cx, thisObj, args);
				
			case Id_setTimeout:
				return setTimeout(cx, thisObj, args);
				
			case Id_dumpCoverage:
				 dumpCoverage(cx, thisObj, args);
				return Undefined.instance;
			case Id_clearInterval:
				 clearInterval(cx, thisObj, args);
				return Undefined.instance;
			case Id_getUserAgent:
				return getUserAgent(cx, thisObj, args);
				
			case Id_stringFormat:
				return stringFormat(cx, thisObj, args);
				
			case Id_clearTimeout:
				 clearTimeout(cx, thisObj, args);
				return Undefined.instance;
			case Id_stringFormatCurrency:
				return stringFormatCurrency(cx, thisObj, args);
				
			case Id_setInterval:
				return setInterval(cx, thisObj, args);
				
			case Id_createBuffer:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.BufferProxy", args);
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_userAgent = 1
		,		
		Id_buildHash = 2
		,		
		Id_buildDate = 3
		,		
		Id_buildTimestamp = 4
		,		
		Id_version = 5
		;

;

	// Child APIs
	private static final int

		Id_Service = 6
		,		
		Id_Accelerometer = 7
		,		
		Id_Intent = 8
		,		
		Id_Instrumentation = 9
		,		
		Id_Database = 10
		,		
		Id_Filesystem = 11
		,		
		Id_TiAnimation = 12
		,		
		Id_KrollProxy = 13
		,		
		Id_Buffer = 14
		,		
		Id_Analytics = 15
		,		
		Id_Menu = 16
		,		
		Id_TiFile = 17
		,		
		Id_TiWindow = 18
		,		
		Id_Codec = 19
		,		
		Id_R = 20
		,		
		Id_ActionBar = 21
		,		
		Id_Contacts = 22
		,		
		Id_Platform = 23
		,		
		Id_Media = 24
		,		
		Id_Map = 25
		,		
		Id_LocationProvider = 26
		,		
		Id_LocationRule = 27
		,		
		Id_UI = 28
		,		
		Id_Gesture = 29
		,		
		Id_Utils = 30
		,		
		Id_Locale = 31
		,		
		Id_Facebook = 32
		,		
		Id_Geolocation = 33
		,		
		Id_TiBlob = 34
		,		
		Id_TiView = 35
		,		
		Id_MenuItem = 36
		,		
		Id_TiBaseWindow = 37
		,		
		Id_Android = 38
		,		
		Id_KrollModule = 39
		,		
		Id_Activity = 40
		,		
		Id_App = 41
		,		
		Id_Network = 42
		,		
		Id_Stream = 43
		,		
		Id_Ti2DMatrix = 44
		,		
		Id_XML = 45
		,		
		Id_DecorView = 46
		;

	public static final int MAX_INSTANCE_ID = 46;

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
            case 1: if (s.charAt(0)=='R') {id=Id_R; break L0;} break L;
            case 2: if (s.charAt(0)=='U' && s.charAt(1)=='I') {id=Id_UI; break L0;} break L;
            case 3: c=s.charAt(0);
                if (c=='A') { if (s.charAt(2)=='p' && s.charAt(1)=='p') {id=Id_App; break L0;} }
                else if (c=='M') { if (s.charAt(2)=='p' && s.charAt(1)=='a') {id=Id_Map; break L0;} }
                else if (c=='X') { if (s.charAt(2)=='L' && s.charAt(1)=='M') {id=Id_XML; break L0;} }
                break L;
            case 4: X="Menu";id=Id_Menu; break L;
            case 5: c=s.charAt(0);
                if (c=='C') { X="Codec";id=Id_Codec; }
                else if (c=='M') { X="Media";id=Id_Media; }
                else if (c=='U') { X="Utils";id=Id_Utils; }
                break L;
            case 6: switch (s.charAt(2)) {
                case 'B': X="TiBlob";id=Id_TiBlob; break L;
                case 'F': X="TiFile";id=Id_TiFile; break L;
                case 'V': X="TiView";id=Id_TiView; break L;
                case 'c': X="Locale";id=Id_Locale; break L;
                case 'f': X="Buffer";id=Id_Buffer; break L;
                case 'r': X="Stream";id=Id_Stream; break L;
                case 't': X="Intent";id=Id_Intent; break L;
                } break L;
            case 7: switch (s.charAt(0)) {
                case 'A': X="Android";id=Id_Android; break L;
                case 'G': X="Gesture";id=Id_Gesture; break L;
                case 'N': X="Network";id=Id_Network; break L;
                case 'S': X="Service";id=Id_Service; break L;
                case 'v': X="version";id=Id_version; break L;
                } break L;
            case 8: switch (s.charAt(0)) {
                case 'A': X="Activity";id=Id_Activity; break L;
                case 'C': X="Contacts";id=Id_Contacts; break L;
                case 'D': X="Database";id=Id_Database; break L;
                case 'F': X="Facebook";id=Id_Facebook; break L;
                case 'M': X="MenuItem";id=Id_MenuItem; break L;
                case 'P': X="Platform";id=Id_Platform; break L;
                case 'T': X="TiWindow";id=Id_TiWindow; break L;
                } break L;
            case 9: switch (s.charAt(5)) {
                case 'D': X="buildDate";id=Id_buildDate; break L;
                case 'H': X="buildHash";id=Id_buildHash; break L;
                case 'V': X="DecorView";id=Id_DecorView; break L;
                case 'g': X="userAgent";id=Id_userAgent; break L;
                case 'n': X="ActionBar";id=Id_ActionBar; break L;
                case 't': X="Analytics";id=Id_Analytics; break L;
                } break L;
            case 10: c=s.charAt(0);
                if (c=='F') { X="Filesystem";id=Id_Filesystem; }
                else if (c=='K') { X="KrollProxy";id=Id_KrollProxy; }
                else if (c=='T') { X="Ti2DMatrix";id=Id_Ti2DMatrix; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='G') { X="Geolocation";id=Id_Geolocation; }
                else if (c=='K') { X="KrollModule";id=Id_KrollModule; }
                else if (c=='T') { X="TiAnimation";id=Id_TiAnimation; }
                break L;
            case 12: c=s.charAt(0);
                if (c=='L') { X="LocationRule";id=Id_LocationRule; }
                else if (c=='T') { X="TiBaseWindow";id=Id_TiBaseWindow; }
                break L;
            case 13: X="Accelerometer";id=Id_Accelerometer; break L;
            case 14: X="buildTimestamp";id=Id_buildTimestamp; break L;
            case 15: X="Instrumentation";id=Id_Instrumentation; break L;
            case 16: X="LocationProvider";id=Id_LocationProvider; break L;
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
			case Id_userAgent:
				return "userAgent"; 
			case Id_buildHash:
				return "buildHash"; 
			case Id_buildDate:
				return "buildDate"; 
			case Id_buildTimestamp:
				return "buildTimestamp"; 
			case Id_version:
				return "version"; 
			case Id_Service:
				return "Service";
			case Id_Accelerometer:
				return "Accelerometer";
			case Id_Intent:
				return "Intent";
			case Id_Instrumentation:
				return "Instrumentation";
			case Id_Database:
				return "Database";
			case Id_Filesystem:
				return "Filesystem";
			case Id_TiAnimation:
				return "TiAnimation";
			case Id_KrollProxy:
				return "KrollProxy";
			case Id_Buffer:
				return "Buffer";
			case Id_Analytics:
				return "Analytics";
			case Id_Menu:
				return "Menu";
			case Id_TiFile:
				return "TiFile";
			case Id_TiWindow:
				return "TiWindow";
			case Id_Codec:
				return "Codec";
			case Id_R:
				return "R";
			case Id_ActionBar:
				return "ActionBar";
			case Id_Contacts:
				return "Contacts";
			case Id_Platform:
				return "Platform";
			case Id_Media:
				return "Media";
			case Id_Map:
				return "Map";
			case Id_LocationProvider:
				return "LocationProvider";
			case Id_LocationRule:
				return "LocationRule";
			case Id_UI:
				return "UI";
			case Id_Gesture:
				return "Gesture";
			case Id_Utils:
				return "Utils";
			case Id_Locale:
				return "Locale";
			case Id_Facebook:
				return "Facebook";
			case Id_Geolocation:
				return "Geolocation";
			case Id_TiBlob:
				return "TiBlob";
			case Id_TiView:
				return "TiView";
			case Id_MenuItem:
				return "MenuItem";
			case Id_TiBaseWindow:
				return "TiBaseWindow";
			case Id_Android:
				return "Android";
			case Id_KrollModule:
				return "KrollModule";
			case Id_Activity:
				return "Activity";
			case Id_App:
				return "App";
			case Id_Network:
				return "Network";
			case Id_Stream:
				return "Stream";
			case Id_Ti2DMatrix:
				return "Ti2DMatrix";
			case Id_XML:
				return "XML";
			case Id_DecorView:
				return "DecorView";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TitaniumModulePrototype proxy = this;
		while (start != null && !(start instanceof TitaniumModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TitaniumModulePrototype) {
			proxy = (TitaniumModulePrototype) start;
		}

		switch (id) {
			case Id_userAgent:
				return proxy.getter_userAgent();
			case Id_buildHash:
				return proxy.getter_buildHash();
			case Id_buildDate:
				return proxy.getter_buildDate();
			case Id_buildTimestamp:
				return proxy.getter_buildTimestamp();
			case Id_version:
				return proxy.getter_version();
			case Id_Service:
				if (proxy.API_Service == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Service = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.proxy.ServiceProxy", org.appcelerator.titanium.proxy.ServiceProxyPrototype.class); 
				}
				return proxy.API_Service;
			case Id_Accelerometer:
				if (proxy.API_Accelerometer == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Accelerometer = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.accelerometer.AccelerometerModule", ti.modules.titanium.accelerometer.AccelerometerModulePrototype.class); 
				}
				return proxy.API_Accelerometer;
			case Id_Intent:
				if (proxy.API_Intent == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Intent = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.proxy.IntentProxy", org.appcelerator.titanium.proxy.IntentProxyPrototype.class); 
				}
				return proxy.API_Intent;
			case Id_Instrumentation:
				if (proxy.API_Instrumentation == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Instrumentation = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.proxy.InstrumentationProxy", org.appcelerator.titanium.proxy.InstrumentationProxyPrototype.class); 
				}
				return proxy.API_Instrumentation;
			case Id_Database:
				if (proxy.API_Database == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Database = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.database.DatabaseModule", ti.modules.titanium.database.DatabaseModulePrototype.class); 
				}
				return proxy.API_Database;
			case Id_Filesystem:
				if (proxy.API_Filesystem == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Filesystem = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.filesystem.FilesystemModule", ti.modules.titanium.filesystem.FilesystemModulePrototype.class); 
				}
				return proxy.API_Filesystem;
			case Id_TiAnimation:
				if (proxy.API_TiAnimation == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TiAnimation = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.view.TiAnimation", org.appcelerator.titanium.view.TiAnimationPrototype.class); 
				}
				return proxy.API_TiAnimation;
			case Id_KrollProxy:
				if (proxy.API_KrollProxy == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_KrollProxy = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.kroll.KrollProxy", org.appcelerator.kroll.KrollProxyPrototype.class); 
				}
				return proxy.API_KrollProxy;
			case Id_Buffer:
				if (proxy.API_Buffer == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Buffer = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.BufferProxy", ti.modules.titanium.BufferProxyPrototype.class); 
				}
				return proxy.API_Buffer;
			case Id_Analytics:
				if (proxy.API_Analytics == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Analytics = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.analytics.AnalyticsModule", ti.modules.titanium.analytics.AnalyticsModulePrototype.class); 
				}
				return proxy.API_Analytics;
			case Id_Menu:
				if (proxy.API_Menu == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Menu = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.proxy.MenuProxy", org.appcelerator.titanium.proxy.MenuProxyPrototype.class); 
				}
				return proxy.API_Menu;
			case Id_TiFile:
				if (proxy.API_TiFile == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TiFile = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.TiFileProxy", org.appcelerator.titanium.TiFileProxyPrototype.class); 
				}
				return proxy.API_TiFile;
			case Id_TiWindow:
				if (proxy.API_TiWindow == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TiWindow = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.proxy.TiWindowProxy", org.appcelerator.titanium.proxy.TiWindowProxyPrototype.class); 
				}
				return proxy.API_TiWindow;
			case Id_Codec:
				if (proxy.API_Codec == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Codec = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.codec.CodecModule", ti.modules.titanium.codec.CodecModulePrototype.class); 
				}
				return proxy.API_Codec;
			case Id_R:
				if (proxy.API_R == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_R = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.proxy.RProxy", org.appcelerator.titanium.proxy.RProxyPrototype.class); 
				}
				return proxy.API_R;
			case Id_ActionBar:
				if (proxy.API_ActionBar == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_ActionBar = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.proxy.ActionBarProxy", org.appcelerator.titanium.proxy.ActionBarProxyPrototype.class); 
				}
				return proxy.API_ActionBar;
			case Id_Contacts:
				if (proxy.API_Contacts == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Contacts = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.contacts.ContactsModule", ti.modules.titanium.contacts.ContactsModulePrototype.class); 
				}
				return proxy.API_Contacts;
			case Id_Platform:
				if (proxy.API_Platform == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Platform = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.platform.PlatformModule", ti.modules.titanium.platform.PlatformModulePrototype.class); 
				}
				return proxy.API_Platform;
			case Id_Media:
				if (proxy.API_Media == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Media = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.media.MediaModule", ti.modules.titanium.media.MediaModulePrototype.class); 
				}
				return proxy.API_Media;
			case Id_Map:
				if (proxy.API_Map == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Map = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.map.MapModule", ti.modules.titanium.map.MapModulePrototype.class); 
				}
				return proxy.API_Map;
			case Id_LocationProvider:
				if (proxy.API_LocationProvider == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_LocationProvider = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.geolocation.android.LocationProviderProxy", ti.modules.titanium.geolocation.android.LocationProviderProxyPrototype.class); 
				}
				return proxy.API_LocationProvider;
			case Id_LocationRule:
				if (proxy.API_LocationRule == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_LocationRule = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.geolocation.android.LocationRuleProxy", ti.modules.titanium.geolocation.android.LocationRuleProxyPrototype.class); 
				}
				return proxy.API_LocationRule;
			case Id_UI:
				if (proxy.API_UI == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_UI = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.UIModule", ti.modules.titanium.ui.UIModulePrototype.class); 
				}
				return proxy.API_UI;
			case Id_Gesture:
				if (proxy.API_Gesture == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Gesture = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.gesture.GestureModule", ti.modules.titanium.gesture.GestureModulePrototype.class); 
				}
				return proxy.API_Gesture;
			case Id_Utils:
				if (proxy.API_Utils == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Utils = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.utils.UtilsModule", ti.modules.titanium.utils.UtilsModulePrototype.class); 
				}
				return proxy.API_Utils;
			case Id_Locale:
				if (proxy.API_Locale == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Locale = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.locale.LocaleModule", ti.modules.titanium.locale.LocaleModulePrototype.class); 
				}
				return proxy.API_Locale;
			case Id_Facebook:
				if (proxy.API_Facebook == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Facebook = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.facebook.FacebookModule", ti.modules.titanium.facebook.FacebookModulePrototype.class); 
				}
				return proxy.API_Facebook;
			case Id_Geolocation:
				if (proxy.API_Geolocation == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Geolocation = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.geolocation.GeolocationModule", ti.modules.titanium.geolocation.GeolocationModulePrototype.class); 
				}
				return proxy.API_Geolocation;
			case Id_TiBlob:
				if (proxy.API_TiBlob == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TiBlob = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.TiBlob", org.appcelerator.titanium.TiBlobPrototype.class); 
				}
				return proxy.API_TiBlob;
			case Id_TiView:
				if (proxy.API_TiView == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TiView = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.proxy.TiViewProxy", org.appcelerator.titanium.proxy.TiViewProxyPrototype.class); 
				}
				return proxy.API_TiView;
			case Id_MenuItem:
				if (proxy.API_MenuItem == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_MenuItem = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.proxy.MenuItemProxy", org.appcelerator.titanium.proxy.MenuItemProxyPrototype.class); 
				}
				return proxy.API_MenuItem;
			case Id_TiBaseWindow:
				if (proxy.API_TiBaseWindow == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TiBaseWindow = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.proxy.TiBaseWindowProxy", org.appcelerator.titanium.proxy.TiBaseWindowProxyPrototype.class); 
				}
				return proxy.API_TiBaseWindow;
			case Id_Android:
				if (proxy.API_Android == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Android = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.android.AndroidModule", ti.modules.titanium.android.AndroidModulePrototype.class); 
				}
				return proxy.API_Android;
			case Id_KrollModule:
				if (proxy.API_KrollModule == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_KrollModule = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.kroll.KrollModule", org.appcelerator.kroll.KrollModulePrototype.class); 
				}
				return proxy.API_KrollModule;
			case Id_Activity:
				if (proxy.API_Activity == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Activity = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.proxy.ActivityProxy", org.appcelerator.titanium.proxy.ActivityProxyPrototype.class); 
				}
				return proxy.API_Activity;
			case Id_App:
				if (proxy.API_App == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_App = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.app.AppModule", ti.modules.titanium.app.AppModulePrototype.class); 
				}
				return proxy.API_App;
			case Id_Network:
				if (proxy.API_Network == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Network = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.network.NetworkModule", ti.modules.titanium.network.NetworkModulePrototype.class); 
				}
				return proxy.API_Network;
			case Id_Stream:
				if (proxy.API_Stream == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Stream = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.stream.StreamModule", ti.modules.titanium.stream.StreamModulePrototype.class); 
				}
				return proxy.API_Stream;
			case Id_Ti2DMatrix:
				if (proxy.API_Ti2DMatrix == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Ti2DMatrix = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.view.Ti2DMatrix", org.appcelerator.titanium.view.Ti2DMatrixPrototype.class); 
				}
				return proxy.API_Ti2DMatrix;
			case Id_XML:
				if (proxy.API_XML == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_XML = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.xml.XMLModule", ti.modules.titanium.xml.XMLModulePrototype.class); 
				}
				return proxy.API_XML;
			case Id_DecorView:
				if (proxy.API_DecorView == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_DecorView = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.proxy.DecorViewProxy", org.appcelerator.titanium.proxy.DecorViewProxyPrototype.class); 
				}
				return proxy.API_DecorView;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		TitaniumModulePrototype proxy = this;
		while (start != null && !(start instanceof TitaniumModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TitaniumModulePrototype) {
			proxy = (TitaniumModulePrototype) start;
		}

		switch (id) {
			case Id_userAgent:
				proxy.setProperty("userAgent", value);
				proxy.onPropertyChanged("userAgent", value);
				break; 
			case Id_buildHash:
				proxy.setProperty("buildHash", value);
				proxy.onPropertyChanged("buildHash", value);
				break; 
			case Id_buildDate:
				proxy.setProperty("buildDate", value);
				proxy.onPropertyChanged("buildDate", value);
				break; 
			case Id_buildTimestamp:
				proxy.setProperty("buildTimestamp", value);
				proxy.onPropertyChanged("buildTimestamp", value);
				break; 
			case Id_version:
				proxy.setProperty("version", value);
				proxy.onPropertyChanged("version", value);
				break; 
			case Id_Service:
				if (value instanceof Proxy) {
					proxy.API_Service = value;
				} else {
					defineProperty(original, "Service", value, 0);
				}
				break;
			case Id_Accelerometer:
				if (value instanceof Proxy) {
					proxy.API_Accelerometer = value;
				} else {
					defineProperty(original, "Accelerometer", value, 0);
				}
				break;
			case Id_Intent:
				if (value instanceof Proxy) {
					proxy.API_Intent = value;
				} else {
					defineProperty(original, "Intent", value, 0);
				}
				break;
			case Id_Instrumentation:
				if (value instanceof Proxy) {
					proxy.API_Instrumentation = value;
				} else {
					defineProperty(original, "Instrumentation", value, 0);
				}
				break;
			case Id_Database:
				if (value instanceof Proxy) {
					proxy.API_Database = value;
				} else {
					defineProperty(original, "Database", value, 0);
				}
				break;
			case Id_Filesystem:
				if (value instanceof Proxy) {
					proxy.API_Filesystem = value;
				} else {
					defineProperty(original, "Filesystem", value, 0);
				}
				break;
			case Id_TiAnimation:
				if (value instanceof Proxy) {
					proxy.API_TiAnimation = value;
				} else {
					defineProperty(original, "TiAnimation", value, 0);
				}
				break;
			case Id_KrollProxy:
				if (value instanceof Proxy) {
					proxy.API_KrollProxy = value;
				} else {
					defineProperty(original, "KrollProxy", value, 0);
				}
				break;
			case Id_Buffer:
				if (value instanceof Proxy) {
					proxy.API_Buffer = value;
				} else {
					defineProperty(original, "Buffer", value, 0);
				}
				break;
			case Id_Analytics:
				if (value instanceof Proxy) {
					proxy.API_Analytics = value;
				} else {
					defineProperty(original, "Analytics", value, 0);
				}
				break;
			case Id_Menu:
				if (value instanceof Proxy) {
					proxy.API_Menu = value;
				} else {
					defineProperty(original, "Menu", value, 0);
				}
				break;
			case Id_TiFile:
				if (value instanceof Proxy) {
					proxy.API_TiFile = value;
				} else {
					defineProperty(original, "TiFile", value, 0);
				}
				break;
			case Id_TiWindow:
				if (value instanceof Proxy) {
					proxy.API_TiWindow = value;
				} else {
					defineProperty(original, "TiWindow", value, 0);
				}
				break;
			case Id_Codec:
				if (value instanceof Proxy) {
					proxy.API_Codec = value;
				} else {
					defineProperty(original, "Codec", value, 0);
				}
				break;
			case Id_R:
				if (value instanceof Proxy) {
					proxy.API_R = value;
				} else {
					defineProperty(original, "R", value, 0);
				}
				break;
			case Id_ActionBar:
				if (value instanceof Proxy) {
					proxy.API_ActionBar = value;
				} else {
					defineProperty(original, "ActionBar", value, 0);
				}
				break;
			case Id_Contacts:
				if (value instanceof Proxy) {
					proxy.API_Contacts = value;
				} else {
					defineProperty(original, "Contacts", value, 0);
				}
				break;
			case Id_Platform:
				if (value instanceof Proxy) {
					proxy.API_Platform = value;
				} else {
					defineProperty(original, "Platform", value, 0);
				}
				break;
			case Id_Media:
				if (value instanceof Proxy) {
					proxy.API_Media = value;
				} else {
					defineProperty(original, "Media", value, 0);
				}
				break;
			case Id_Map:
				if (value instanceof Proxy) {
					proxy.API_Map = value;
				} else {
					defineProperty(original, "Map", value, 0);
				}
				break;
			case Id_LocationProvider:
				if (value instanceof Proxy) {
					proxy.API_LocationProvider = value;
				} else {
					defineProperty(original, "LocationProvider", value, 0);
				}
				break;
			case Id_LocationRule:
				if (value instanceof Proxy) {
					proxy.API_LocationRule = value;
				} else {
					defineProperty(original, "LocationRule", value, 0);
				}
				break;
			case Id_UI:
				if (value instanceof Proxy) {
					proxy.API_UI = value;
				} else {
					defineProperty(original, "UI", value, 0);
				}
				break;
			case Id_Gesture:
				if (value instanceof Proxy) {
					proxy.API_Gesture = value;
				} else {
					defineProperty(original, "Gesture", value, 0);
				}
				break;
			case Id_Utils:
				if (value instanceof Proxy) {
					proxy.API_Utils = value;
				} else {
					defineProperty(original, "Utils", value, 0);
				}
				break;
			case Id_Locale:
				if (value instanceof Proxy) {
					proxy.API_Locale = value;
				} else {
					defineProperty(original, "Locale", value, 0);
				}
				break;
			case Id_Facebook:
				if (value instanceof Proxy) {
					proxy.API_Facebook = value;
				} else {
					defineProperty(original, "Facebook", value, 0);
				}
				break;
			case Id_Geolocation:
				if (value instanceof Proxy) {
					proxy.API_Geolocation = value;
				} else {
					defineProperty(original, "Geolocation", value, 0);
				}
				break;
			case Id_TiBlob:
				if (value instanceof Proxy) {
					proxy.API_TiBlob = value;
				} else {
					defineProperty(original, "TiBlob", value, 0);
				}
				break;
			case Id_TiView:
				if (value instanceof Proxy) {
					proxy.API_TiView = value;
				} else {
					defineProperty(original, "TiView", value, 0);
				}
				break;
			case Id_MenuItem:
				if (value instanceof Proxy) {
					proxy.API_MenuItem = value;
				} else {
					defineProperty(original, "MenuItem", value, 0);
				}
				break;
			case Id_TiBaseWindow:
				if (value instanceof Proxy) {
					proxy.API_TiBaseWindow = value;
				} else {
					defineProperty(original, "TiBaseWindow", value, 0);
				}
				break;
			case Id_Android:
				if (value instanceof Proxy) {
					proxy.API_Android = value;
				} else {
					defineProperty(original, "Android", value, 0);
				}
				break;
			case Id_KrollModule:
				if (value instanceof Proxy) {
					proxy.API_KrollModule = value;
				} else {
					defineProperty(original, "KrollModule", value, 0);
				}
				break;
			case Id_Activity:
				if (value instanceof Proxy) {
					proxy.API_Activity = value;
				} else {
					defineProperty(original, "Activity", value, 0);
				}
				break;
			case Id_App:
				if (value instanceof Proxy) {
					proxy.API_App = value;
				} else {
					defineProperty(original, "App", value, 0);
				}
				break;
			case Id_Network:
				if (value instanceof Proxy) {
					proxy.API_Network = value;
				} else {
					defineProperty(original, "Network", value, 0);
				}
				break;
			case Id_Stream:
				if (value instanceof Proxy) {
					proxy.API_Stream = value;
				} else {
					defineProperty(original, "Stream", value, 0);
				}
				break;
			case Id_Ti2DMatrix:
				if (value instanceof Proxy) {
					proxy.API_Ti2DMatrix = value;
				} else {
					defineProperty(original, "Ti2DMatrix", value, 0);
				}
				break;
			case Id_XML:
				if (value instanceof Proxy) {
					proxy.API_XML = value;
				} else {
					defineProperty(original, "XML", value, 0);
				}
				break;
			case Id_DecorView:
				if (value instanceof Proxy) {
					proxy.API_DecorView = value;
				} else {
					defineProperty(original, "DecorView", value, 0);
				}
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
