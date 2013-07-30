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

import org.appcelerator.titanium.proxy.ServiceProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class ServiceProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -3405803958512503372L;

	private static final String TAG = "ServiceProxyPrototype";
	private static final String CLASS_TAG = "ServiceProxy";
	private static ServiceProxyPrototype serviceProxyPrototype;


	public static ServiceProxyPrototype getProxyPrototype()
	{
		return serviceProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		serviceProxyPrototype = null;
	}

	public ServiceProxyPrototype()
	{
		if (serviceProxyPrototype == null && getClass().equals(ServiceProxyPrototype.class)) {
			serviceProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == serviceProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return serviceProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ServiceProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getIntent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getIntent()", Log.DEBUG_MODE);

		try {
		ServiceProxy proxy = (ServiceProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.proxy.IntentProxy javaResult = proxy.getIntent();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void stop(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "stop()", Log.DEBUG_MODE);

		try {
		ServiceProxy proxy = (ServiceProxy) ((Proxy) thisObj).getProxy();

		proxy.stop();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getServiceInstanceId(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getServiceInstanceId()", Log.DEBUG_MODE);

		try {
		ServiceProxy proxy = (ServiceProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getServiceInstanceId();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void start(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "start()", Log.DEBUG_MODE);

		try {
		ServiceProxy proxy = (ServiceProxy) ((Proxy) thisObj).getProxy();

		proxy.start();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Number getter_serviceInstanceId()
	{
		Log.d(TAG, "get serviceInstanceId", Log.DEBUG_MODE);
		ServiceProxy proxy = (ServiceProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getServiceInstanceId();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Proxy getter_intent()
	{
		Log.d(TAG, "get intent", Log.DEBUG_MODE);
		ServiceProxy proxy = (ServiceProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.proxy.IntentProxy javaResult = proxy.getIntent();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getIntent = 2,
		Id_stop = 3,
		Id_getServiceInstanceId = 4,
		Id_start = 5
;
		

	public static final int MAX_PROTOTYPE_ID = 5;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:22 PST
        L0: { id = 0; String X = null;
            L: switch (s.length()) {
            case 4: X="stop";id=Id_stop; break L;
            case 5: X="start";id=Id_start; break L;
            case 9: X="getIntent";id=Id_getIntent; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 20: X="getServiceInstanceId";id=Id_getServiceInstanceId; break L;
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
			case Id_getIntent:
				arity = 0;
				name = "getIntent";
				break;
			case Id_stop:
				arity = 0;
				name = "stop";
				break;
			case Id_getServiceInstanceId:
				arity = 0;
				name = "getServiceInstanceId";
				break;
			case Id_start:
				arity = 0;
				name = "start";
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

		while (thisObj != null && !(thisObj instanceof ServiceProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ServiceProxyPrototype proxy = (ServiceProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getIntent:
				return getIntent(cx, thisObj, args);
				
			case Id_stop:
				 stop(cx, thisObj, args);
				return Undefined.instance;
			case Id_getServiceInstanceId:
				return getServiceInstanceId(cx, thisObj, args);
				
			case Id_start:
				 start(cx, thisObj, args);
				return Undefined.instance;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_serviceInstanceId = 1
		,		
		Id_intent = 2
		;

;

;

	public static final int MAX_INSTANCE_ID = 2;

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
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==6) { X="intent";id=Id_intent; }
            else if (s_length==17) { X="serviceInstanceId";id=Id_serviceInstanceId; }
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
			case Id_serviceInstanceId:
				return "serviceInstanceId"; 
			case Id_intent:
				return "intent"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ServiceProxyPrototype proxy = this;
		while (start != null && !(start instanceof ServiceProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ServiceProxyPrototype) {
			proxy = (ServiceProxyPrototype) start;
		}

		switch (id) {
			case Id_serviceInstanceId:
				return proxy.getter_serviceInstanceId();
			case Id_intent:
				return proxy.getter_intent();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ServiceProxyPrototype proxy = this;
		while (start != null && !(start instanceof ServiceProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ServiceProxyPrototype) {
			proxy = (ServiceProxyPrototype) start;
		}

		switch (id) {
			case Id_serviceInstanceId:
				proxy.setProperty("serviceInstanceId", value);
				proxy.onPropertyChanged("serviceInstanceId", value);
				break; 
			case Id_intent:
				proxy.setProperty("intent", value);
				proxy.onPropertyChanged("intent", value);
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
