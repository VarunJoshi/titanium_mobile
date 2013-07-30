/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.geolocation.android;

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

import ti.modules.titanium.geolocation.android.AndroidModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class AndroidModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = -675523668773665182L;

	private static final String TAG = "AndroidModulePrototype";
	private static final String CLASS_TAG = "AndroidModule";
	private static AndroidModulePrototype androidModulePrototype;


	public static AndroidModulePrototype getProxyPrototype()
	{
		return androidModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		androidModulePrototype = null;
	}

	public AndroidModulePrototype()
	{
		if (androidModulePrototype == null && getClass().equals(AndroidModulePrototype.class)) {
			androidModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("PROVIDER_PASSIVE", this, "passive");


			putConst("PROVIDER_NETWORK", this, "network");


			putConst("PROVIDER_GPS", this, "gps");

	}

	public Scriptable getPrototype()
	{
		if (this == androidModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return androidModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(AndroidModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void removeLocationRule(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeLocationRule()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removeLocationRule: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.geolocation.android.LocationRuleProxy arg0;
		arg0 = (ti.modules.titanium.geolocation.android.LocationRuleProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.removeLocationRule(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void addLocationProvider(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addLocationProvider()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("addLocationProvider: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.geolocation.android.LocationProviderProxy arg0;
		arg0 = (ti.modules.titanium.geolocation.android.LocationProviderProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.addLocationProvider(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void addLocationRule(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addLocationRule()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("addLocationRule: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.geolocation.android.LocationRuleProxy arg0;
		arg0 = (ti.modules.titanium.geolocation.android.LocationRuleProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.addLocationRule(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void removeLocationProvider(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeLocationProvider()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removeLocationProvider: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.geolocation.android.LocationProviderProxy arg0;
		arg0 = (ti.modules.titanium.geolocation.android.LocationProviderProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.removeLocationProvider(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object createLocationProvider(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createLocationProvider()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		ti.modules.titanium.geolocation.android.LocationProviderProxy javaResult = proxy.createLocationProvider(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createLocationRule(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createLocationRule()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		ti.modules.titanium.geolocation.android.LocationRuleProxy javaResult = proxy.createLocationRule(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Boolean getter_manualMode()
	{
		Log.d(TAG, "get manualMode", Log.DEBUG_MODE);
		AndroidModule proxy = (AndroidModule) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getManualMode();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_manualMode(Object value)
	{
		Log.d(TAG, "set manualMode", Log.DEBUG_MODE);
		AndroidModule proxy = (AndroidModule) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setManualMode(arg0);
		//proxy.setProperty("manualMode", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_removeLocationRule = 2,
		Id_addLocationProvider = 3,
		Id_addLocationRule = 4,
		Id_removeLocationProvider = 5,
		Id_createLocationProvider = 6,
		Id_createLocationRule = 7
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
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 11: X="constructor";id=Id_constructor; break L;
            case 15: X="addLocationRule";id=Id_addLocationRule; break L;
            case 18: c=s.charAt(0);
                if (c=='c') { X="createLocationRule";id=Id_createLocationRule; }
                else if (c=='r') { X="removeLocationRule";id=Id_removeLocationRule; }
                break L;
            case 19: X="addLocationProvider";id=Id_addLocationProvider; break L;
            case 22: c=s.charAt(0);
                if (c=='c') { X="createLocationProvider";id=Id_createLocationProvider; }
                else if (c=='r') { X="removeLocationProvider";id=Id_removeLocationProvider; }
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
			case Id_removeLocationRule:
				arity = 1;
				name = "removeLocationRule";
				break;
			case Id_addLocationProvider:
				arity = 1;
				name = "addLocationProvider";
				break;
			case Id_addLocationRule:
				arity = 1;
				name = "addLocationRule";
				break;
			case Id_removeLocationProvider:
				arity = 1;
				name = "removeLocationProvider";
				break;
			case Id_createLocationProvider:
				arity = 1;
				name = "createLocationProvider";
				break;
			case Id_createLocationRule:
				arity = 1;
				name = "createLocationRule";
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

		while (thisObj != null && !(thisObj instanceof AndroidModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		AndroidModulePrototype proxy = (AndroidModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_removeLocationRule:
				 removeLocationRule(cx, thisObj, args);
				return Undefined.instance;
			case Id_addLocationProvider:
				 addLocationProvider(cx, thisObj, args);
				return Undefined.instance;
			case Id_addLocationRule:
				 addLocationRule(cx, thisObj, args);
				return Undefined.instance;
			case Id_removeLocationProvider:
				 removeLocationProvider(cx, thisObj, args);
				return Undefined.instance;
			case Id_createLocationProvider:
				return createLocationProvider(cx, thisObj, args);
				
			case Id_createLocationRule:
				return createLocationRule(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_manualMode = 1
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
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null;
            if (s.length()==10) { X="manualMode";id=Id_manualMode; }
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
			case Id_manualMode:
				return "manualMode"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		AndroidModulePrototype proxy = this;
		while (start != null && !(start instanceof AndroidModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AndroidModulePrototype) {
			proxy = (AndroidModulePrototype) start;
		}

		switch (id) {
			case Id_manualMode:
				return proxy.getter_manualMode();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		AndroidModulePrototype proxy = this;
		while (start != null && !(start instanceof AndroidModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AndroidModulePrototype) {
			proxy = (AndroidModulePrototype) start;
		}

		switch (id) {
			case Id_manualMode:
				proxy.setter_manualMode(value);
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
