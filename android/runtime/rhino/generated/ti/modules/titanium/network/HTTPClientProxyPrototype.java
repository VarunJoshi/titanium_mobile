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

import ti.modules.titanium.network.HTTPClientProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class HTTPClientProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -4090171699277538037L;

	private static final String TAG = "HTTPClientProxyPrototype";
	private static final String CLASS_TAG = "HTTPClientProxy";
	private static HTTPClientProxyPrototype hTTPClientProxyPrototype;


	public static HTTPClientProxyPrototype getProxyPrototype()
	{
		return hTTPClientProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		hTTPClientProxyPrototype = null;
	}

	public HTTPClientProxyPrototype()
	{
		if (hTTPClientProxyPrototype == null && getClass().equals(HTTPClientProxyPrototype.class)) {
			hTTPClientProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}


			putConst("LOADING", this, 3);


			putConst("DONE", this, 4);


			putConst("UNSENT", this, 0);


			putConst("HEADERS_RECEIVED", this, 2);


			putConst("OPENED", this, 1);

	}

	public Scriptable getPrototype()
	{
		if (this == hTTPClientProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return hTTPClientProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(HTTPClientProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getAutoEncodeUrl(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAutoEncodeUrl()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getAutoEncodeUrl();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAllResponseHeaders(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAllResponseHeaders()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getAllResponseHeaders();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getResponseText(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getResponseText()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getResponseText();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void addTrustManager(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addTrustManager()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("addTrustManager: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.addTrustManager(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void send(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "send()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();
		java.lang.Object arg0;
		if (args.length <= 0) {
			arg0 = null;
		} else {
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		}

		proxy.send(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getReadyState(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getReadyState()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getReadyState();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getResponseXML(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getResponseXML()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.DocumentProxy javaResult = proxy.getResponseXML();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getConnectionType(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getConnectionType()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getConnectionType();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setUsername(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setUsername()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setUsername: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setUsername(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getResponseData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getResponseData()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.TiBlob javaResult = proxy.getResponseData();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void open(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "open()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("open: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		proxy.open(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getStatusText(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getStatusText()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getStatusText();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getResponseHeader(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getResponseHeader()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getResponseHeader: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		java.lang.String javaResult = proxy.getResponseHeader(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setValidatesSecureCertificate(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setValidatesSecureCertificate()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setValidatesSecureCertificate: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		proxy.setValidatesSecureCertificate(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void clearCookies(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "clearCookies()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("clearCookies: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.clearCookies(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getConnected(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getConnected()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getConnected();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setDomain(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setDomain()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setDomain: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setDomain(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setAutoEncodeUrl(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setAutoEncodeUrl()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setAutoEncodeUrl: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		proxy.setAutoEncodeUrl(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setPassword(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setPassword()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setPassword: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setPassword(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getStatus(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getStatus()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getStatus();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getValidatesSecureCertificate(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getValidatesSecureCertificate()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getValidatesSecureCertificate();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getPassword(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPassword()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getPassword();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void addAuthFactory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addAuthFactory()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("addAuthFactory: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.Object arg1;
		arg1 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;

		proxy.addAuthFactory(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getLocation(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLocation()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getLocation();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setAutoRedirect(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setAutoRedirect()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setAutoRedirect: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		proxy.setAutoRedirect(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getAutoRedirect(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAutoRedirect()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getAutoRedirect();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setRequestHeader(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setRequestHeader()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setRequestHeader: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		proxy.setRequestHeader(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setTimeout(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setTimeout()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setTimeout: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setTimeout(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getUsername(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getUsername()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getUsername();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void addKeyManager(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addKeyManager()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("addKeyManager: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.addKeyManager(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getDomain(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDomain()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getDomain();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void abort(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "abort()", Log.DEBUG_MODE);

		try {
		HTTPClientProxy proxy = (HTTPClientProxy) ((Proxy) thisObj).getProxy();

		proxy.abort();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Object getter_responseData()
	{
		Log.d(TAG, "get responseData", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.TiBlob javaResult = proxy.getResponseData();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Boolean getter_validatesSecureCertificate()
	{
		Log.d(TAG, "get validatesSecureCertificate", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getValidatesSecureCertificate();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_validatesSecureCertificate(Object value)
	{
		Log.d(TAG, "set validatesSecureCertificate", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setValidatesSecureCertificate(arg0);
		//proxy.setProperty("validatesSecureCertificate", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_allResponseHeaders()
	{
		Log.d(TAG, "get allResponseHeaders", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getAllResponseHeaders();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_location()
	{
		Log.d(TAG, "get location", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getLocation();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Number getter_status()
	{
		Log.d(TAG, "get status", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getStatus();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Proxy getter_responseXML()
	{
		Log.d(TAG, "get responseXML", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.xml.DocumentProxy javaResult = proxy.getResponseXML();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Boolean getter_connected()
	{
		Log.d(TAG, "get connected", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getConnected();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public String getter_connectionType()
	{
		Log.d(TAG, "get connectionType", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getConnectionType();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_statusText()
	{
		Log.d(TAG, "get statusText", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getStatusText();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_responseText()
	{
		Log.d(TAG, "get responseText", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getResponseText();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Number getter_readyState()
	{
		Log.d(TAG, "get readyState", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getReadyState();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public String getter_password()
	{
		Log.d(TAG, "get password", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getPassword();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_password(Object value)
	{
		Log.d(TAG, "set password", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setPassword(arg0);
		//proxy.setProperty("password", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Boolean getter_autoRedirect()
	{
		Log.d(TAG, "get autoRedirect", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getAutoRedirect();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_autoRedirect(Object value)
	{
		Log.d(TAG, "set autoRedirect", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setAutoRedirect(arg0);
		//proxy.setProperty("autoRedirect", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_username()
	{
		Log.d(TAG, "get username", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getUsername();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_username(Object value)
	{
		Log.d(TAG, "set username", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setUsername(arg0);
		//proxy.setProperty("username", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Boolean getter_autoEncodeUrl()
	{
		Log.d(TAG, "get autoEncodeUrl", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getAutoEncodeUrl();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_autoEncodeUrl(Object value)
	{
		Log.d(TAG, "set autoEncodeUrl", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setAutoEncodeUrl(arg0);
		//proxy.setProperty("autoEncodeUrl", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_domain()
	{
		Log.d(TAG, "get domain", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getDomain();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_domain(Object value)
	{
		Log.d(TAG, "set domain", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setDomain(arg0);
		//proxy.setProperty("domain", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_timeout(Object value)
	{
		Log.d(TAG, "set timeout", Log.DEBUG_MODE);
		HTTPClientProxy proxy = (HTTPClientProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setTimeout(arg0);
		//proxy.setProperty("timeout", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getAutoEncodeUrl = 2,
		Id_getAllResponseHeaders = 3,
		Id_getResponseText = 4,
		Id_addTrustManager = 5,
		Id_send = 6,
		Id_getReadyState = 7,
		Id_getResponseXML = 8,
		Id_getConnectionType = 9,
		Id_setUsername = 10,
		Id_getResponseData = 11,
		Id_open = 12,
		Id_getStatusText = 13,
		Id_getResponseHeader = 14,
		Id_setValidatesSecureCertificate = 15,
		Id_clearCookies = 16,
		Id_getConnected = 17,
		Id_setDomain = 18,
		Id_setAutoEncodeUrl = 19,
		Id_setPassword = 20,
		Id_getStatus = 21,
		Id_getValidatesSecureCertificate = 22,
		Id_getPassword = 23,
		Id_addAuthFactory = 24,
		Id_getLocation = 25,
		Id_setAutoRedirect = 26,
		Id_getAutoRedirect = 27,
		Id_setRequestHeader = 28,
		Id_setTimeout = 29,
		Id_getUsername = 30,
		Id_addKeyManager = 31,
		Id_getDomain = 32,
		Id_abort = 33
;
		

	public static final int MAX_PROTOTYPE_ID = 33;

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
            case 4: c=s.charAt(0);
                if (c=='o') { X="open";id=Id_open; }
                else if (c=='s') { X="send";id=Id_send; }
                break L;
            case 5: X="abort";id=Id_abort; break L;
            case 9: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(8);
                    if (c=='n') { X="getDomain";id=Id_getDomain; }
                    else if (c=='s') { X="getStatus";id=Id_getStatus; }
                }
                else if (c=='s') { X="setDomain";id=Id_setDomain; }
                break L;
            case 10: X="setTimeout";id=Id_setTimeout; break L;
            case 11: switch (s.charAt(3)) {
                case 'L': X="getLocation";id=Id_getLocation; break L;
                case 'P': c=s.charAt(0);
                    if (c=='g') { X="getPassword";id=Id_getPassword; }
                    else if (c=='s') { X="setPassword";id=Id_setPassword; }
                    break L;
                case 'U': c=s.charAt(0);
                    if (c=='g') { X="getUsername";id=Id_getUsername; }
                    else if (c=='s') { X="setUsername";id=Id_setUsername; }
                    break L;
                case 's': X="constructor";id=Id_constructor; break L;
                } break L;
            case 12: c=s.charAt(0);
                if (c=='c') { X="clearCookies";id=Id_clearCookies; }
                else if (c=='g') { X="getConnected";id=Id_getConnected; }
                break L;
            case 13: c=s.charAt(3);
                if (c=='K') { X="addKeyManager";id=Id_addKeyManager; }
                else if (c=='R') { X="getReadyState";id=Id_getReadyState; }
                else if (c=='S') { X="getStatusText";id=Id_getStatusText; }
                break L;
            case 14: c=s.charAt(0);
                if (c=='a') { X="addAuthFactory";id=Id_addAuthFactory; }
                else if (c=='g') { X="getResponseXML";id=Id_getResponseXML; }
                break L;
            case 15: switch (s.charAt(11)) {
                case 'D': X="getResponseData";id=Id_getResponseData; break L;
                case 'T': X="getResponseText";id=Id_getResponseText; break L;
                case 'a': X="addTrustManager";id=Id_addTrustManager; break L;
                case 'r': c=s.charAt(0);
                    if (c=='g') { X="getAutoRedirect";id=Id_getAutoRedirect; }
                    else if (c=='s') { X="setAutoRedirect";id=Id_setAutoRedirect; }
                    break L;
                } break L;
            case 16: c=s.charAt(0);
                if (c=='g') { X="getAutoEncodeUrl";id=Id_getAutoEncodeUrl; }
                else if (c=='s') {
                    c=s.charAt(15);
                    if (c=='l') { X="setAutoEncodeUrl";id=Id_setAutoEncodeUrl; }
                    else if (c=='r') { X="setRequestHeader";id=Id_setRequestHeader; }
                }
                break L;
            case 17: c=s.charAt(3);
                if (c=='C') { X="getConnectionType";id=Id_getConnectionType; }
                else if (c=='R') { X="getResponseHeader";id=Id_getResponseHeader; }
                break L;
            case 21: X="getAllResponseHeaders";id=Id_getAllResponseHeaders; break L;
            case 29: c=s.charAt(0);
                if (c=='g') { X="getValidatesSecureCertificate";id=Id_getValidatesSecureCertificate; }
                else if (c=='s') { X="setValidatesSecureCertificate";id=Id_setValidatesSecureCertificate; }
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
			case Id_getAutoEncodeUrl:
				arity = 0;
				name = "getAutoEncodeUrl";
				break;
			case Id_getAllResponseHeaders:
				arity = 0;
				name = "getAllResponseHeaders";
				break;
			case Id_getResponseText:
				arity = 0;
				name = "getResponseText";
				break;
			case Id_addTrustManager:
				arity = 1;
				name = "addTrustManager";
				break;
			case Id_send:
				arity = 1;
				name = "send";
				break;
			case Id_getReadyState:
				arity = 0;
				name = "getReadyState";
				break;
			case Id_getResponseXML:
				arity = 0;
				name = "getResponseXML";
				break;
			case Id_getConnectionType:
				arity = 0;
				name = "getConnectionType";
				break;
			case Id_setUsername:
				arity = 1;
				name = "setUsername";
				break;
			case Id_getResponseData:
				arity = 0;
				name = "getResponseData";
				break;
			case Id_open:
				arity = 2;
				name = "open";
				break;
			case Id_getStatusText:
				arity = 0;
				name = "getStatusText";
				break;
			case Id_getResponseHeader:
				arity = 1;
				name = "getResponseHeader";
				break;
			case Id_setValidatesSecureCertificate:
				arity = 1;
				name = "setValidatesSecureCertificate";
				break;
			case Id_clearCookies:
				arity = 1;
				name = "clearCookies";
				break;
			case Id_getConnected:
				arity = 0;
				name = "getConnected";
				break;
			case Id_setDomain:
				arity = 1;
				name = "setDomain";
				break;
			case Id_setAutoEncodeUrl:
				arity = 1;
				name = "setAutoEncodeUrl";
				break;
			case Id_setPassword:
				arity = 1;
				name = "setPassword";
				break;
			case Id_getStatus:
				arity = 0;
				name = "getStatus";
				break;
			case Id_getValidatesSecureCertificate:
				arity = 0;
				name = "getValidatesSecureCertificate";
				break;
			case Id_getPassword:
				arity = 0;
				name = "getPassword";
				break;
			case Id_addAuthFactory:
				arity = 2;
				name = "addAuthFactory";
				break;
			case Id_getLocation:
				arity = 0;
				name = "getLocation";
				break;
			case Id_setAutoRedirect:
				arity = 1;
				name = "setAutoRedirect";
				break;
			case Id_getAutoRedirect:
				arity = 0;
				name = "getAutoRedirect";
				break;
			case Id_setRequestHeader:
				arity = 2;
				name = "setRequestHeader";
				break;
			case Id_setTimeout:
				arity = 1;
				name = "setTimeout";
				break;
			case Id_getUsername:
				arity = 0;
				name = "getUsername";
				break;
			case Id_addKeyManager:
				arity = 1;
				name = "addKeyManager";
				break;
			case Id_getDomain:
				arity = 0;
				name = "getDomain";
				break;
			case Id_abort:
				arity = 0;
				name = "abort";
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

		while (thisObj != null && !(thisObj instanceof HTTPClientProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		HTTPClientProxyPrototype proxy = (HTTPClientProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getAutoEncodeUrl:
				return getAutoEncodeUrl(cx, thisObj, args);
				
			case Id_getAllResponseHeaders:
				return getAllResponseHeaders(cx, thisObj, args);
				
			case Id_getResponseText:
				return getResponseText(cx, thisObj, args);
				
			case Id_addTrustManager:
				 addTrustManager(cx, thisObj, args);
				return Undefined.instance;
			case Id_send:
				 send(cx, thisObj, args);
				return Undefined.instance;
			case Id_getReadyState:
				return getReadyState(cx, thisObj, args);
				
			case Id_getResponseXML:
				return getResponseXML(cx, thisObj, args);
				
			case Id_getConnectionType:
				return getConnectionType(cx, thisObj, args);
				
			case Id_setUsername:
				 setUsername(cx, thisObj, args);
				return Undefined.instance;
			case Id_getResponseData:
				return getResponseData(cx, thisObj, args);
				
			case Id_open:
				 open(cx, thisObj, args);
				return Undefined.instance;
			case Id_getStatusText:
				return getStatusText(cx, thisObj, args);
				
			case Id_getResponseHeader:
				return getResponseHeader(cx, thisObj, args);
				
			case Id_setValidatesSecureCertificate:
				 setValidatesSecureCertificate(cx, thisObj, args);
				return Undefined.instance;
			case Id_clearCookies:
				 clearCookies(cx, thisObj, args);
				return Undefined.instance;
			case Id_getConnected:
				return getConnected(cx, thisObj, args);
				
			case Id_setDomain:
				 setDomain(cx, thisObj, args);
				return Undefined.instance;
			case Id_setAutoEncodeUrl:
				 setAutoEncodeUrl(cx, thisObj, args);
				return Undefined.instance;
			case Id_setPassword:
				 setPassword(cx, thisObj, args);
				return Undefined.instance;
			case Id_getStatus:
				return getStatus(cx, thisObj, args);
				
			case Id_getValidatesSecureCertificate:
				return getValidatesSecureCertificate(cx, thisObj, args);
				
			case Id_getPassword:
				return getPassword(cx, thisObj, args);
				
			case Id_addAuthFactory:
				 addAuthFactory(cx, thisObj, args);
				return Undefined.instance;
			case Id_getLocation:
				return getLocation(cx, thisObj, args);
				
			case Id_setAutoRedirect:
				 setAutoRedirect(cx, thisObj, args);
				return Undefined.instance;
			case Id_getAutoRedirect:
				return getAutoRedirect(cx, thisObj, args);
				
			case Id_setRequestHeader:
				 setRequestHeader(cx, thisObj, args);
				return Undefined.instance;
			case Id_setTimeout:
				 setTimeout(cx, thisObj, args);
				return Undefined.instance;
			case Id_getUsername:
				return getUsername(cx, thisObj, args);
				
			case Id_addKeyManager:
				 addKeyManager(cx, thisObj, args);
				return Undefined.instance;
			case Id_getDomain:
				return getDomain(cx, thisObj, args);
				
			case Id_abort:
				 abort(cx, thisObj, args);
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

		Id_responseData = 1
		,		
		Id_validatesSecureCertificate = 2
		,		
		Id_allResponseHeaders = 3
		,		
		Id_location = 4
		,		
		Id_status = 5
		,		
		Id_responseXML = 6
		,		
		Id_connected = 7
		,		
		Id_connectionType = 8
		,		
		Id_statusText = 9
		,		
		Id_responseText = 10
		,		
		Id_readyState = 11
		,		
		Id_password = 12
		,		
		Id_autoRedirect = 13
		,		
		Id_username = 14
		,		
		Id_autoEncodeUrl = 15
		,		
		Id_domain = 16
		,		
		Id_timeout = 17
		;

;

;

	public static final int MAX_INSTANCE_ID = 17;

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
                if (c=='d') { X="domain";id=Id_domain; }
                else if (c=='s') { X="status";id=Id_status; }
                break L;
            case 7: X="timeout";id=Id_timeout; break L;
            case 8: c=s.charAt(0);
                if (c=='l') { X="location";id=Id_location; }
                else if (c=='p') { X="password";id=Id_password; }
                else if (c=='u') { X="username";id=Id_username; }
                break L;
            case 9: X="connected";id=Id_connected; break L;
            case 10: c=s.charAt(0);
                if (c=='r') { X="readyState";id=Id_readyState; }
                else if (c=='s') { X="statusText";id=Id_statusText; }
                break L;
            case 11: X="responseXML";id=Id_responseXML; break L;
            case 12: c=s.charAt(8);
                if (c=='D') { X="responseData";id=Id_responseData; }
                else if (c=='T') { X="responseText";id=Id_responseText; }
                else if (c=='r') { X="autoRedirect";id=Id_autoRedirect; }
                break L;
            case 13: X="autoEncodeUrl";id=Id_autoEncodeUrl; break L;
            case 14: X="connectionType";id=Id_connectionType; break L;
            case 18: X="allResponseHeaders";id=Id_allResponseHeaders; break L;
            case 26: X="validatesSecureCertificate";id=Id_validatesSecureCertificate; break L;
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
			case Id_responseData:
				return "responseData"; 
			case Id_validatesSecureCertificate:
				return "validatesSecureCertificate"; 
			case Id_allResponseHeaders:
				return "allResponseHeaders"; 
			case Id_location:
				return "location"; 
			case Id_status:
				return "status"; 
			case Id_responseXML:
				return "responseXML"; 
			case Id_connected:
				return "connected"; 
			case Id_connectionType:
				return "connectionType"; 
			case Id_statusText:
				return "statusText"; 
			case Id_responseText:
				return "responseText"; 
			case Id_readyState:
				return "readyState"; 
			case Id_password:
				return "password"; 
			case Id_autoRedirect:
				return "autoRedirect"; 
			case Id_username:
				return "username"; 
			case Id_autoEncodeUrl:
				return "autoEncodeUrl"; 
			case Id_domain:
				return "domain"; 
			case Id_timeout:
				return "timeout"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		HTTPClientProxyPrototype proxy = this;
		while (start != null && !(start instanceof HTTPClientProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof HTTPClientProxyPrototype) {
			proxy = (HTTPClientProxyPrototype) start;
		}

		switch (id) {
			case Id_responseData:
				return proxy.getter_responseData();
			case Id_validatesSecureCertificate:
				return proxy.getter_validatesSecureCertificate();
			case Id_allResponseHeaders:
				return proxy.getter_allResponseHeaders();
			case Id_location:
				return proxy.getter_location();
			case Id_status:
				return proxy.getter_status();
			case Id_responseXML:
				return proxy.getter_responseXML();
			case Id_connected:
				return proxy.getter_connected();
			case Id_connectionType:
				return proxy.getter_connectionType();
			case Id_statusText:
				return proxy.getter_statusText();
			case Id_responseText:
				return proxy.getter_responseText();
			case Id_readyState:
				return proxy.getter_readyState();
			case Id_password:
				return proxy.getter_password();
			case Id_autoRedirect:
				return proxy.getter_autoRedirect();
			case Id_username:
				return proxy.getter_username();
			case Id_autoEncodeUrl:
				return proxy.getter_autoEncodeUrl();
			case Id_domain:
				return proxy.getter_domain();
			case Id_timeout:
				return proxy.getProperty("timeout");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		HTTPClientProxyPrototype proxy = this;
		while (start != null && !(start instanceof HTTPClientProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof HTTPClientProxyPrototype) {
			proxy = (HTTPClientProxyPrototype) start;
		}

		switch (id) {
			case Id_responseData:
				proxy.setProperty("responseData", value);
				proxy.onPropertyChanged("responseData", value);
				break; 
			case Id_validatesSecureCertificate:
				proxy.setter_validatesSecureCertificate(value);
				break; 
			case Id_allResponseHeaders:
				proxy.setProperty("allResponseHeaders", value);
				proxy.onPropertyChanged("allResponseHeaders", value);
				break; 
			case Id_location:
				proxy.setProperty("location", value);
				proxy.onPropertyChanged("location", value);
				break; 
			case Id_status:
				proxy.setProperty("status", value);
				proxy.onPropertyChanged("status", value);
				break; 
			case Id_responseXML:
				proxy.setProperty("responseXML", value);
				proxy.onPropertyChanged("responseXML", value);
				break; 
			case Id_connected:
				proxy.setProperty("connected", value);
				proxy.onPropertyChanged("connected", value);
				break; 
			case Id_connectionType:
				proxy.setProperty("connectionType", value);
				proxy.onPropertyChanged("connectionType", value);
				break; 
			case Id_statusText:
				proxy.setProperty("statusText", value);
				proxy.onPropertyChanged("statusText", value);
				break; 
			case Id_responseText:
				proxy.setProperty("responseText", value);
				proxy.onPropertyChanged("responseText", value);
				break; 
			case Id_readyState:
				proxy.setProperty("readyState", value);
				proxy.onPropertyChanged("readyState", value);
				break; 
			case Id_password:
				proxy.setter_password(value);
				break; 
			case Id_autoRedirect:
				proxy.setter_autoRedirect(value);
				break; 
			case Id_username:
				proxy.setter_username(value);
				break; 
			case Id_autoEncodeUrl:
				proxy.setter_autoEncodeUrl(value);
				break; 
			case Id_domain:
				proxy.setter_domain(value);
				break; 
			case Id_timeout:
				proxy.setter_timeout(value);
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
