/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.platform;

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

import ti.modules.titanium.platform.PlatformModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class PlatformModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = 3734622252355962368L;

	private static final String TAG = "PlatformModulePrototype";
	private static final String CLASS_TAG = "PlatformModule";
	private static PlatformModulePrototype platformModulePrototype;

	// Lazy loaded child APIs
	private Object API_Android = null;
	private Object API_DisplayCaps = null;

	public static PlatformModulePrototype getProxyPrototype()
	{
		return platformModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		platformModulePrototype = null;
	}

	public PlatformModulePrototype()
	{
		if (platformModulePrototype == null && getClass().equals(PlatformModulePrototype.class)) {
			platformModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("BATTERY_STATE_UNKNOWN", this, 0);


			putConst("BATTERY_STATE_UNPLUGGED", this, 1);


			putConst("BATTERY_STATE_CHARGING", this, 2);


			putConst("BATTERY_STATE_FULL", this, 3);

	}

	public Scriptable getPrototype()
	{
		if (this == platformModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return platformModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(PlatformModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getModel(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getModel()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getModel();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getNetmask(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getNetmask()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getNetmask();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getArchitecture(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getArchitecture()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getArchitecture();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getOsname(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getOsname()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getOsname();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAvailableMemory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAvailableMemory()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		double javaResult = proxy.getAvailableMemory();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createUUID(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createUUID()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.createUUID();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getManufacturer(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getManufacturer()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getManufacturer();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getBatteryState(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getBatteryState()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getBatteryState();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getRuntime(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getRuntime()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getRuntime();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getProcessorCount(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getProcessorCount()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getProcessorCount();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getLocale(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLocale()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getLocale();

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
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getVersion();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getBatteryLevel(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getBatteryLevel()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		double javaResult = proxy.getBatteryLevel();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setBatteryMonitoring(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setBatteryMonitoring()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setBatteryMonitoring: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		proxy.setBatteryMonitoring(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getBatteryMonitoring(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getBatteryMonitoring()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getBatteryMonitoring();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getName()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getName();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object is24HourTimeFormat(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "is24HourTimeFormat()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.is24HourTimeFormat();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getOstype(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getOstype()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getOstype();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getUsername(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getUsername()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getUsername();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getDisplayCaps(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDisplayCaps()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.platform.DisplayCapsProxy javaResult = proxy.getDisplayCaps();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getMacaddress(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getMacaddress()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getMacaddress();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object openURL(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "openURL()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("openURL: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		boolean javaResult = proxy.openURL(arg0);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAddress(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAddress()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getAddress();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getId(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getId()", Log.DEBUG_MODE);

		try {
		PlatformModule proxy = (PlatformModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getId();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public String getter_model()
	{
		Log.d(TAG, "get model", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getModel();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Number getter_availableMemory()
	{
		Log.d(TAG, "get availableMemory", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		double javaResult = proxy.getAvailableMemory();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Proxy getter_displayCaps()
	{
		Log.d(TAG, "get displayCaps", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.platform.DisplayCapsProxy javaResult = proxy.getDisplayCaps();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public String getter_ostype()
	{
		Log.d(TAG, "get ostype", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getOstype();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Number getter_processorCount()
	{
		Log.d(TAG, "get processorCount", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getProcessorCount();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public String getter_macaddress()
	{
		Log.d(TAG, "get macaddress", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getMacaddress();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_locale()
	{
		Log.d(TAG, "get locale", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getLocale();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_runtime()
	{
		Log.d(TAG, "get runtime", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getRuntime();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_architecture()
	{
		Log.d(TAG, "get architecture", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getArchitecture();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_netmask()
	{
		Log.d(TAG, "get netmask", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getNetmask();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_version()
	{
		Log.d(TAG, "get version", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getVersion();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_id()
	{
		Log.d(TAG, "get id", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getId();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_osname()
	{
		Log.d(TAG, "get osname", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getOsname();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Boolean getter_batteryMonitoring()
	{
		Log.d(TAG, "get batteryMonitoring", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getBatteryMonitoring();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_batteryMonitoring(Object value)
	{
		Log.d(TAG, "set batteryMonitoring", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setBatteryMonitoring(arg0);
		//proxy.setProperty("batteryMonitoring", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_username()
	{
		Log.d(TAG, "get username", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getUsername();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_address()
	{
		Log.d(TAG, "get address", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getAddress();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_manufacturer()
	{
		Log.d(TAG, "get manufacturer", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getManufacturer();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_name()
	{
		Log.d(TAG, "get name", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getName();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Number getter_batteryLevel()
	{
		Log.d(TAG, "get batteryLevel", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		double javaResult = proxy.getBatteryLevel();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Number getter_batteryState()
	{
		Log.d(TAG, "get batteryState", Log.DEBUG_MODE);
		PlatformModule proxy = (PlatformModule) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getBatteryState();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getModel = 2,
		Id_getNetmask = 3,
		Id_getArchitecture = 4,
		Id_getOsname = 5,
		Id_getAvailableMemory = 6,
		Id_createUUID = 7,
		Id_getManufacturer = 8,
		Id_getBatteryState = 9,
		Id_getRuntime = 10,
		Id_getProcessorCount = 11,
		Id_getLocale = 12,
		Id_getVersion = 13,
		Id_getBatteryLevel = 14,
		Id_setBatteryMonitoring = 15,
		Id_getBatteryMonitoring = 16,
		Id_getName = 17,
		Id_is24HourTimeFormat = 18,
		Id_getOstype = 19,
		Id_getUsername = 20,
		Id_getDisplayCaps = 21,
		Id_getMacaddress = 22,
		Id_openURL = 23,
		Id_getAddress = 24,
		Id_getId = 25
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
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 5: X="getId";id=Id_getId; break L;
            case 7: c=s.charAt(0);
                if (c=='g') { X="getName";id=Id_getName; }
                else if (c=='o') { X="openURL";id=Id_openURL; }
                break L;
            case 8: X="getModel";id=Id_getModel; break L;
            case 9: c=s.charAt(5);
                if (c=='c') { X="getLocale";id=Id_getLocale; }
                else if (c=='n') { X="getOsname";id=Id_getOsname; }
                else if (c=='t') { X="getOstype";id=Id_getOstype; }
                break L;
            case 10: switch (s.charAt(3)) {
                case 'A': X="getAddress";id=Id_getAddress; break L;
                case 'N': X="getNetmask";id=Id_getNetmask; break L;
                case 'R': X="getRuntime";id=Id_getRuntime; break L;
                case 'V': X="getVersion";id=Id_getVersion; break L;
                case 'a': X="createUUID";id=Id_createUUID; break L;
                } break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') { X="getUsername";id=Id_getUsername; }
                break L;
            case 13: X="getMacaddress";id=Id_getMacaddress; break L;
            case 14: X="getDisplayCaps";id=Id_getDisplayCaps; break L;
            case 15: switch (s.charAt(10)) {
                case 'L': X="getBatteryLevel";id=Id_getBatteryLevel; break L;
                case 'S': X="getBatteryState";id=Id_getBatteryState; break L;
                case 'c': X="getArchitecture";id=Id_getArchitecture; break L;
                case 't': X="getManufacturer";id=Id_getManufacturer; break L;
                } break L;
            case 17: X="getProcessorCount";id=Id_getProcessorCount; break L;
            case 18: c=s.charAt(0);
                if (c=='g') { X="getAvailableMemory";id=Id_getAvailableMemory; }
                else if (c=='i') { X="is24HourTimeFormat";id=Id_is24HourTimeFormat; }
                break L;
            case 20: c=s.charAt(0);
                if (c=='g') { X="getBatteryMonitoring";id=Id_getBatteryMonitoring; }
                else if (c=='s') { X="setBatteryMonitoring";id=Id_setBatteryMonitoring; }
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
			case Id_getModel:
				arity = 0;
				name = "getModel";
				break;
			case Id_getNetmask:
				arity = 0;
				name = "getNetmask";
				break;
			case Id_getArchitecture:
				arity = 0;
				name = "getArchitecture";
				break;
			case Id_getOsname:
				arity = 0;
				name = "getOsname";
				break;
			case Id_getAvailableMemory:
				arity = 0;
				name = "getAvailableMemory";
				break;
			case Id_createUUID:
				arity = 0;
				name = "createUUID";
				break;
			case Id_getManufacturer:
				arity = 0;
				name = "getManufacturer";
				break;
			case Id_getBatteryState:
				arity = 0;
				name = "getBatteryState";
				break;
			case Id_getRuntime:
				arity = 0;
				name = "getRuntime";
				break;
			case Id_getProcessorCount:
				arity = 0;
				name = "getProcessorCount";
				break;
			case Id_getLocale:
				arity = 0;
				name = "getLocale";
				break;
			case Id_getVersion:
				arity = 0;
				name = "getVersion";
				break;
			case Id_getBatteryLevel:
				arity = 0;
				name = "getBatteryLevel";
				break;
			case Id_setBatteryMonitoring:
				arity = 1;
				name = "setBatteryMonitoring";
				break;
			case Id_getBatteryMonitoring:
				arity = 0;
				name = "getBatteryMonitoring";
				break;
			case Id_getName:
				arity = 0;
				name = "getName";
				break;
			case Id_is24HourTimeFormat:
				arity = 0;
				name = "is24HourTimeFormat";
				break;
			case Id_getOstype:
				arity = 0;
				name = "getOstype";
				break;
			case Id_getUsername:
				arity = 0;
				name = "getUsername";
				break;
			case Id_getDisplayCaps:
				arity = 0;
				name = "getDisplayCaps";
				break;
			case Id_getMacaddress:
				arity = 0;
				name = "getMacaddress";
				break;
			case Id_openURL:
				arity = 1;
				name = "openURL";
				break;
			case Id_getAddress:
				arity = 0;
				name = "getAddress";
				break;
			case Id_getId:
				arity = 0;
				name = "getId";
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

		while (thisObj != null && !(thisObj instanceof PlatformModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		PlatformModulePrototype proxy = (PlatformModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getModel:
				return getModel(cx, thisObj, args);
				
			case Id_getNetmask:
				return getNetmask(cx, thisObj, args);
				
			case Id_getArchitecture:
				return getArchitecture(cx, thisObj, args);
				
			case Id_getOsname:
				return getOsname(cx, thisObj, args);
				
			case Id_getAvailableMemory:
				return getAvailableMemory(cx, thisObj, args);
				
			case Id_createUUID:
				return createUUID(cx, thisObj, args);
				
			case Id_getManufacturer:
				return getManufacturer(cx, thisObj, args);
				
			case Id_getBatteryState:
				return getBatteryState(cx, thisObj, args);
				
			case Id_getRuntime:
				return getRuntime(cx, thisObj, args);
				
			case Id_getProcessorCount:
				return getProcessorCount(cx, thisObj, args);
				
			case Id_getLocale:
				return getLocale(cx, thisObj, args);
				
			case Id_getVersion:
				return getVersion(cx, thisObj, args);
				
			case Id_getBatteryLevel:
				return getBatteryLevel(cx, thisObj, args);
				
			case Id_setBatteryMonitoring:
				 setBatteryMonitoring(cx, thisObj, args);
				return Undefined.instance;
			case Id_getBatteryMonitoring:
				return getBatteryMonitoring(cx, thisObj, args);
				
			case Id_getName:
				return getName(cx, thisObj, args);
				
			case Id_is24HourTimeFormat:
				return is24HourTimeFormat(cx, thisObj, args);
				
			case Id_getOstype:
				return getOstype(cx, thisObj, args);
				
			case Id_getUsername:
				return getUsername(cx, thisObj, args);
				
			case Id_getDisplayCaps:
				return getDisplayCaps(cx, thisObj, args);
				
			case Id_getMacaddress:
				return getMacaddress(cx, thisObj, args);
				
			case Id_openURL:
				return openURL(cx, thisObj, args);
				
			case Id_getAddress:
				return getAddress(cx, thisObj, args);
				
			case Id_getId:
				return getId(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_model = 1
		,		
		Id_availableMemory = 2
		,		
		Id_displayCaps = 3
		,		
		Id_ostype = 4
		,		
		Id_processorCount = 5
		,		
		Id_macaddress = 6
		,		
		Id_locale = 7
		,		
		Id_runtime = 8
		,		
		Id_architecture = 9
		,		
		Id_netmask = 10
		,		
		Id_version = 11
		,		
		Id_id = 12
		,		
		Id_osname = 13
		,		
		Id_batteryMonitoring = 14
		,		
		Id_username = 15
		,		
		Id_address = 16
		,		
		Id_manufacturer = 17
		,		
		Id_name = 18
		,		
		Id_batteryLevel = 19
		,		
		Id_batteryState = 20
		;

;

	// Child APIs
	private static final int

		Id_Android = 21
		,		
		Id_DisplayCaps = 22
		;

	public static final int MAX_INSTANCE_ID = 22;

	@Override
	protected int getMaxInstanceId()
	{
		return MAX_INSTANCE_ID;
	}

	@Override
	protected int findInstanceIdInfo(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 2: if (s.charAt(0)=='i' && s.charAt(1)=='d') {id=Id_id; break L0;} break L;
            case 4: X="name";id=Id_name; break L;
            case 5: X="model";id=Id_model; break L;
            case 6: c=s.charAt(2);
                if (c=='c') { X="locale";id=Id_locale; }
                else if (c=='n') { X="osname";id=Id_osname; }
                else if (c=='t') { X="ostype";id=Id_ostype; }
                break L;
            case 7: switch (s.charAt(0)) {
                case 'A': X="Android";id=Id_Android; break L;
                case 'a': X="address";id=Id_address; break L;
                case 'n': X="netmask";id=Id_netmask; break L;
                case 'r': X="runtime";id=Id_runtime; break L;
                case 'v': X="version";id=Id_version; break L;
                } break L;
            case 8: X="username";id=Id_username; break L;
            case 10: X="macaddress";id=Id_macaddress; break L;
            case 11: c=s.charAt(0);
                if (c=='D') { X="DisplayCaps";id=Id_DisplayCaps; }
                else if (c=='d') { X="displayCaps";id=Id_displayCaps; }
                break L;
            case 12: switch (s.charAt(7)) {
                case 'L': X="batteryLevel";id=Id_batteryLevel; break L;
                case 'S': X="batteryState";id=Id_batteryState; break L;
                case 'c': X="architecture";id=Id_architecture; break L;
                case 't': X="manufacturer";id=Id_manufacturer; break L;
                } break L;
            case 14: X="processorCount";id=Id_processorCount; break L;
            case 15: X="availableMemory";id=Id_availableMemory; break L;
            case 17: X="batteryMonitoring";id=Id_batteryMonitoring; break L;
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
			case Id_model:
				return "model"; 
			case Id_availableMemory:
				return "availableMemory"; 
			case Id_displayCaps:
				return "displayCaps"; 
			case Id_ostype:
				return "ostype"; 
			case Id_processorCount:
				return "processorCount"; 
			case Id_macaddress:
				return "macaddress"; 
			case Id_locale:
				return "locale"; 
			case Id_runtime:
				return "runtime"; 
			case Id_architecture:
				return "architecture"; 
			case Id_netmask:
				return "netmask"; 
			case Id_version:
				return "version"; 
			case Id_id:
				return "id"; 
			case Id_osname:
				return "osname"; 
			case Id_batteryMonitoring:
				return "batteryMonitoring"; 
			case Id_username:
				return "username"; 
			case Id_address:
				return "address"; 
			case Id_manufacturer:
				return "manufacturer"; 
			case Id_name:
				return "name"; 
			case Id_batteryLevel:
				return "batteryLevel"; 
			case Id_batteryState:
				return "batteryState"; 
			case Id_Android:
				return "Android";
			case Id_DisplayCaps:
				return "DisplayCaps";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		PlatformModulePrototype proxy = this;
		while (start != null && !(start instanceof PlatformModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof PlatformModulePrototype) {
			proxy = (PlatformModulePrototype) start;
		}

		switch (id) {
			case Id_model:
				return proxy.getter_model();
			case Id_availableMemory:
				return proxy.getter_availableMemory();
			case Id_displayCaps:
				return proxy.getter_displayCaps();
			case Id_ostype:
				return proxy.getter_ostype();
			case Id_processorCount:
				return proxy.getter_processorCount();
			case Id_macaddress:
				return proxy.getter_macaddress();
			case Id_locale:
				return proxy.getter_locale();
			case Id_runtime:
				return proxy.getter_runtime();
			case Id_architecture:
				return proxy.getter_architecture();
			case Id_netmask:
				return proxy.getter_netmask();
			case Id_version:
				return proxy.getter_version();
			case Id_id:
				return proxy.getter_id();
			case Id_osname:
				return proxy.getter_osname();
			case Id_batteryMonitoring:
				return proxy.getter_batteryMonitoring();
			case Id_username:
				return proxy.getter_username();
			case Id_address:
				return proxy.getter_address();
			case Id_manufacturer:
				return proxy.getter_manufacturer();
			case Id_name:
				return proxy.getter_name();
			case Id_batteryLevel:
				return proxy.getter_batteryLevel();
			case Id_batteryState:
				return proxy.getter_batteryState();
			case Id_Android:
				if (proxy.API_Android == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Android = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.platform.AndroidModule", ti.modules.titanium.platform.AndroidModulePrototype.class); 
				}
				return proxy.API_Android;
			case Id_DisplayCaps:
				if (proxy.API_DisplayCaps == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_DisplayCaps = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.platform.DisplayCapsProxy", ti.modules.titanium.platform.DisplayCapsProxyPrototype.class); 
				}
				return proxy.API_DisplayCaps;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		PlatformModulePrototype proxy = this;
		while (start != null && !(start instanceof PlatformModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof PlatformModulePrototype) {
			proxy = (PlatformModulePrototype) start;
		}

		switch (id) {
			case Id_model:
				proxy.setProperty("model", value);
				proxy.onPropertyChanged("model", value);
				break; 
			case Id_availableMemory:
				proxy.setProperty("availableMemory", value);
				proxy.onPropertyChanged("availableMemory", value);
				break; 
			case Id_displayCaps:
				proxy.setProperty("displayCaps", value);
				proxy.onPropertyChanged("displayCaps", value);
				break; 
			case Id_ostype:
				proxy.setProperty("ostype", value);
				proxy.onPropertyChanged("ostype", value);
				break; 
			case Id_processorCount:
				proxy.setProperty("processorCount", value);
				proxy.onPropertyChanged("processorCount", value);
				break; 
			case Id_macaddress:
				proxy.setProperty("macaddress", value);
				proxy.onPropertyChanged("macaddress", value);
				break; 
			case Id_locale:
				proxy.setProperty("locale", value);
				proxy.onPropertyChanged("locale", value);
				break; 
			case Id_runtime:
				proxy.setProperty("runtime", value);
				proxy.onPropertyChanged("runtime", value);
				break; 
			case Id_architecture:
				proxy.setProperty("architecture", value);
				proxy.onPropertyChanged("architecture", value);
				break; 
			case Id_netmask:
				proxy.setProperty("netmask", value);
				proxy.onPropertyChanged("netmask", value);
				break; 
			case Id_version:
				proxy.setProperty("version", value);
				proxy.onPropertyChanged("version", value);
				break; 
			case Id_id:
				proxy.setProperty("id", value);
				proxy.onPropertyChanged("id", value);
				break; 
			case Id_osname:
				proxy.setProperty("osname", value);
				proxy.onPropertyChanged("osname", value);
				break; 
			case Id_batteryMonitoring:
				proxy.setter_batteryMonitoring(value);
				break; 
			case Id_username:
				proxy.setProperty("username", value);
				proxy.onPropertyChanged("username", value);
				break; 
			case Id_address:
				proxy.setProperty("address", value);
				proxy.onPropertyChanged("address", value);
				break; 
			case Id_manufacturer:
				proxy.setProperty("manufacturer", value);
				proxy.onPropertyChanged("manufacturer", value);
				break; 
			case Id_name:
				proxy.setProperty("name", value);
				proxy.onPropertyChanged("name", value);
				break; 
			case Id_batteryLevel:
				proxy.setProperty("batteryLevel", value);
				proxy.onPropertyChanged("batteryLevel", value);
				break; 
			case Id_batteryState:
				proxy.setProperty("batteryState", value);
				proxy.onPropertyChanged("batteryState", value);
				break; 
			case Id_Android:
				if (value instanceof Proxy) {
					proxy.API_Android = value;
				} else {
					defineProperty(original, "Android", value, 0);
				}
				break;
			case Id_DisplayCaps:
				if (value instanceof Proxy) {
					proxy.API_DisplayCaps = value;
				} else {
					defineProperty(original, "DisplayCaps", value, 0);
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
