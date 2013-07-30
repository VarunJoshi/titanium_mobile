/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.network;

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

import ti.modules.titanium.network.NetworkModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class NetworkModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = -8310487183764751802L;

	private static final String TAG = "NetworkModulePrototype";
	private static final String CLASS_TAG = "NetworkModule";
	private static NetworkModulePrototype networkModulePrototype;

	// Lazy loaded child APIs
	private Object API_Socket = null;
	private Object API_HTTPClient = null;

	public static NetworkModulePrototype getProxyPrototype()
	{
		return networkModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		networkModulePrototype = null;
	}

	public NetworkModulePrototype()
	{
		if (networkModulePrototype == null && getClass().equals(NetworkModulePrototype.class)) {
			networkModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("NETWORK_NONE", this, 0);


			putConst("NETWORK_LAN", this, 3);


			putConst("NETWORK_MOBILE", this, 2);


			putConst("NETWORK_WIFI", this, 1);


			putConst("NETWORK_UNKNOWN", this, 4);

	}

	public Scriptable getPrototype()
	{
		if (this == networkModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return networkModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(NetworkModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getNetworkType(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getNetworkType()", Log.DEBUG_MODE);

		try {
		NetworkModule proxy = (NetworkModule) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getNetworkType();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getOnline(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getOnline()", Log.DEBUG_MODE);

		try {
		NetworkModule proxy = (NetworkModule) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getOnline();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getNetworkTypeName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getNetworkTypeName()", Log.DEBUG_MODE);

		try {
		NetworkModule proxy = (NetworkModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getNetworkTypeName();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object encodeURIComponent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "encodeURIComponent()", Log.DEBUG_MODE);

		try {
		NetworkModule proxy = (NetworkModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("encodeURIComponent: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		java.lang.String javaResult = proxy.encodeURIComponent(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object decodeURIComponent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "decodeURIComponent()", Log.DEBUG_MODE);

		try {
		NetworkModule proxy = (NetworkModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("decodeURIComponent: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		java.lang.String javaResult = proxy.decodeURIComponent(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Number getter_networkType()
	{
		Log.d(TAG, "get networkType", Log.DEBUG_MODE);
		NetworkModule proxy = (NetworkModule) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getNetworkType();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Boolean getter_online()
	{
		Log.d(TAG, "get online", Log.DEBUG_MODE);
		NetworkModule proxy = (NetworkModule) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getOnline();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public String getter_networkTypeName()
	{
		Log.d(TAG, "get networkTypeName", Log.DEBUG_MODE);
		NetworkModule proxy = (NetworkModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getNetworkTypeName();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getNetworkType = 2,
		Id_getOnline = 3,
		Id_getNetworkTypeName = 4,
		Id_encodeURIComponent = 5,
		Id_decodeURIComponent = 6,
		Id_createHTTPClient = 7
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
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 9: X="getOnline";id=Id_getOnline; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 14: X="getNetworkType";id=Id_getNetworkType; break L;
            case 16: X="createHTTPClient";id=Id_createHTTPClient; break L;
            case 18: c=s.charAt(0);
                if (c=='d') { X="decodeURIComponent";id=Id_decodeURIComponent; }
                else if (c=='e') { X="encodeURIComponent";id=Id_encodeURIComponent; }
                else if (c=='g') { X="getNetworkTypeName";id=Id_getNetworkTypeName; }
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
			case Id_getNetworkType:
				arity = 0;
				name = "getNetworkType";
				break;
			case Id_getOnline:
				arity = 0;
				name = "getOnline";
				break;
			case Id_getNetworkTypeName:
				arity = 0;
				name = "getNetworkTypeName";
				break;
			case Id_encodeURIComponent:
				arity = 1;
				name = "encodeURIComponent";
				break;
			case Id_decodeURIComponent:
				arity = 1;
				name = "decodeURIComponent";
				break;
			case Id_createHTTPClient:
				arity = 1;
				name = "createHTTPClient";
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

		while (thisObj != null && !(thisObj instanceof NetworkModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		NetworkModulePrototype proxy = (NetworkModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getNetworkType:
				return getNetworkType(cx, thisObj, args);
				
			case Id_getOnline:
				return getOnline(cx, thisObj, args);
				
			case Id_getNetworkTypeName:
				return getNetworkTypeName(cx, thisObj, args);
				
			case Id_encodeURIComponent:
				return encodeURIComponent(cx, thisObj, args);
				
			case Id_decodeURIComponent:
				return decodeURIComponent(cx, thisObj, args);
				
			case Id_createHTTPClient:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.network.HTTPClientProxy", args);
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_networkType = 1
		,		
		Id_online = 2
		,		
		Id_networkTypeName = 3
		;

;

	// Child APIs
	private static final int

		Id_Socket = 4
		,		
		Id_HTTPClient = 5
		;

	public static final int MAX_INSTANCE_ID = 5;

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
            case 6: c=s.charAt(0);
                if (c=='S') { X="Socket";id=Id_Socket; }
                else if (c=='o') { X="online";id=Id_online; }
                break L;
            case 10: X="HTTPClient";id=Id_HTTPClient; break L;
            case 11: X="networkType";id=Id_networkType; break L;
            case 15: X="networkTypeName";id=Id_networkTypeName; break L;
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
			case Id_networkType:
				return "networkType"; 
			case Id_online:
				return "online"; 
			case Id_networkTypeName:
				return "networkTypeName"; 
			case Id_Socket:
				return "Socket";
			case Id_HTTPClient:
				return "HTTPClient";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		NetworkModulePrototype proxy = this;
		while (start != null && !(start instanceof NetworkModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof NetworkModulePrototype) {
			proxy = (NetworkModulePrototype) start;
		}

		switch (id) {
			case Id_networkType:
				return proxy.getter_networkType();
			case Id_online:
				return proxy.getter_online();
			case Id_networkTypeName:
				return proxy.getter_networkTypeName();
			case Id_Socket:
				if (proxy.API_Socket == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Socket = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.network.socket.SocketModule", ti.modules.titanium.network.socket.SocketModulePrototype.class); 
				}
				return proxy.API_Socket;
			case Id_HTTPClient:
				if (proxy.API_HTTPClient == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_HTTPClient = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.network.HTTPClientProxy", ti.modules.titanium.network.HTTPClientProxyPrototype.class); 
				}
				return proxy.API_HTTPClient;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		NetworkModulePrototype proxy = this;
		while (start != null && !(start instanceof NetworkModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof NetworkModulePrototype) {
			proxy = (NetworkModulePrototype) start;
		}

		switch (id) {
			case Id_networkType:
				proxy.setProperty("networkType", value);
				proxy.onPropertyChanged("networkType", value);
				break; 
			case Id_online:
				proxy.setProperty("online", value);
				proxy.onPropertyChanged("online", value);
				break; 
			case Id_networkTypeName:
				proxy.setProperty("networkTypeName", value);
				proxy.onPropertyChanged("networkTypeName", value);
				break; 
			case Id_Socket:
				if (value instanceof Proxy) {
					proxy.API_Socket = value;
				} else {
					defineProperty(original, "Socket", value, 0);
				}
				break;
			case Id_HTTPClient:
				if (value instanceof Proxy) {
					proxy.API_HTTPClient = value;
				} else {
					defineProperty(original, "HTTPClient", value, 0);
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
