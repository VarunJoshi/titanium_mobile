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

import ti.modules.titanium.geolocation.android.LocationProviderProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class LocationProviderProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 5534122954882515273L;

	private static final String TAG = "LocationProviderProxyPrototype";
	private static final String CLASS_TAG = "LocationProviderProxy";
	private static LocationProviderProxyPrototype locationProviderProxyPrototype;


	public static LocationProviderProxyPrototype getProxyPrototype()
	{
		return locationProviderProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		locationProviderProxyPrototype = null;
	}

	public LocationProviderProxyPrototype()
	{
		if (locationProviderProxyPrototype == null && getClass().equals(LocationProviderProxyPrototype.class)) {
			locationProviderProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == locationProviderProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return locationProviderProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(LocationProviderProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties
	public Number getter_minUpdateTime()
	{
		Log.d(TAG, "get minUpdateTime", Log.DEBUG_MODE);
		LocationProviderProxy proxy = (LocationProviderProxy) getProxy();
		Scriptable thisObj = this;
		double javaResult = proxy.getMinUpdateTime();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public void setter_minUpdateTime(Object value)
	{
		Log.d(TAG, "set minUpdateTime", Log.DEBUG_MODE);
		LocationProviderProxy proxy = (LocationProviderProxy) getProxy();
		Scriptable thisObj = this;
		double arg0;
		arg0 = (double) TypeConverter.jsObjectToJavaDouble(value, thisObj) ;
		proxy.setMinUpdateTime(arg0);
		//proxy.setProperty("minUpdateTime", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_name()
	{
		Log.d(TAG, "get name", Log.DEBUG_MODE);
		LocationProviderProxy proxy = (LocationProviderProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getName();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_name(Object value)
	{
		Log.d(TAG, "set name", Log.DEBUG_MODE);
		LocationProviderProxy proxy = (LocationProviderProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setName(arg0);
		//proxy.setProperty("name", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Number getter_minUpdateDistance()
	{
		Log.d(TAG, "get minUpdateDistance", Log.DEBUG_MODE);
		LocationProviderProxy proxy = (LocationProviderProxy) getProxy();
		Scriptable thisObj = this;
		double javaResult = proxy.getMinUpdateDistance();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public void setter_minUpdateDistance(Object value)
	{
		Log.d(TAG, "set minUpdateDistance", Log.DEBUG_MODE);
		LocationProviderProxy proxy = (LocationProviderProxy) getProxy();
		Scriptable thisObj = this;
		double arg0;
		arg0 = (double) TypeConverter.jsObjectToJavaDouble(value, thisObj) ;
		proxy.setMinUpdateDistance(arg0);
		//proxy.setProperty("minUpdateDistance", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
		// Property IDs
		// Method IDs
;
		

	public static final int MAX_PROTOTYPE_ID = 1;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null;
            if (s.length()==11) { X="constructor";id=Id_constructor; }
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

		while (thisObj != null && !(thisObj instanceof LocationProviderProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		LocationProviderProxyPrototype proxy = (LocationProviderProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_minUpdateTime = 1
		,		
		Id_name = 2
		,		
		Id_minUpdateDistance = 3
		;

;

;

	public static final int MAX_INSTANCE_ID = 3;

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
            int s_length = s.length();
            if (s_length==4) { X="name";id=Id_name; }
            else if (s_length==13) { X="minUpdateTime";id=Id_minUpdateTime; }
            else if (s_length==17) { X="minUpdateDistance";id=Id_minUpdateDistance; }
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
			case Id_minUpdateTime:
				return "minUpdateTime"; 
			case Id_name:
				return "name"; 
			case Id_minUpdateDistance:
				return "minUpdateDistance"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		LocationProviderProxyPrototype proxy = this;
		while (start != null && !(start instanceof LocationProviderProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof LocationProviderProxyPrototype) {
			proxy = (LocationProviderProxyPrototype) start;
		}

		switch (id) {
			case Id_minUpdateTime:
				return proxy.getter_minUpdateTime();
			case Id_name:
				return proxy.getter_name();
			case Id_minUpdateDistance:
				return proxy.getter_minUpdateDistance();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		LocationProviderProxyPrototype proxy = this;
		while (start != null && !(start instanceof LocationProviderProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof LocationProviderProxyPrototype) {
			proxy = (LocationProviderProxyPrototype) start;
		}

		switch (id) {
			case Id_minUpdateTime:
				proxy.setter_minUpdateTime(value);
				break; 
			case Id_name:
				proxy.setter_name(value);
				break; 
			case Id_minUpdateDistance:
				proxy.setter_minUpdateDistance(value);
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
