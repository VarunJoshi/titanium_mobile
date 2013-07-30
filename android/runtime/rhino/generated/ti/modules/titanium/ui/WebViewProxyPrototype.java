/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.ui;

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

import ti.modules.titanium.ui.WebViewProxy;

import ti.modules.titanium.ui.ViewProxyPrototype;


public class WebViewProxyPrototype extends ViewProxyPrototype
{
	private static final long serialVersionUID = -2046120449295978732L;

	private static final String TAG = "WebViewProxyPrototype";
	private static final String CLASS_TAG = "WebViewProxy";
	private static WebViewProxyPrototype webViewProxyPrototype;


	public static WebViewProxyPrototype getProxyPrototype()
	{
		return webViewProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		webViewProxyPrototype = null;
	}

	public WebViewProxyPrototype()
	{
		if (webViewProxyPrototype == null && getClass().equals(WebViewProxyPrototype.class)) {
			webViewProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == webViewProxyPrototype) {
			return ViewProxyPrototype.getProxyPrototype();
		}
		return webViewProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return ViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(WebViewProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void goBack(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "goBack()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();

		proxy.goBack();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getHtml(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getHtml()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getHtml();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getEnableZoomControls(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getEnableZoomControls()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getEnableZoomControls();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void pause(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "pause()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();

		proxy.pause();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setUserAgent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setUserAgent()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setUserAgent: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setUserAgent(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void resume(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "resume()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();

		proxy.resume();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void goForward(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "goForward()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();

		proxy.goForward();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void stopLoading(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "stopLoading()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();

		proxy.stopLoading();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getUserAgent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getUserAgent()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getUserAgent();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getPluginState(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPluginState()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getPluginState();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object canGoBack(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "canGoBack()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.canGoBack();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setBasicAuthentication(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setBasicAuthentication()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setBasicAuthentication: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		proxy.setBasicAuthentication(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setHtml(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setHtml()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setHtml: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		org.appcelerator.kroll.KrollDict arg1;
		if (args.length <= 1) {
			arg1 = null;
		} else {
		if (args[1] == null) {
			arg1 = null;
		} else {
		arg1 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[1], thisObj) );
		}
		}

		proxy.setHtml(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void reload(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "reload()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();

		proxy.reload();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object evalJS(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "evalJS()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("evalJS: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		java.lang.Object javaResult = proxy.evalJS(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setEnableZoomControls(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setEnableZoomControls()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setEnableZoomControls: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		proxy.setEnableZoomControls(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void release(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "release()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();

		proxy.release();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object canGoForward(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "canGoForward()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.canGoForward();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setPluginState(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setPluginState()", Log.DEBUG_MODE);

		try {
		WebViewProxy proxy = (WebViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setPluginState: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setPluginState(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Boolean getter_enableZoomControls()
	{
		Log.d(TAG, "get enableZoomControls", Log.DEBUG_MODE);
		WebViewProxy proxy = (WebViewProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getEnableZoomControls();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_enableZoomControls(Object value)
	{
		Log.d(TAG, "set enableZoomControls", Log.DEBUG_MODE);
		WebViewProxy proxy = (WebViewProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setEnableZoomControls(arg0);
		//proxy.setProperty("enableZoomControls", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_userAgent()
	{
		Log.d(TAG, "get userAgent", Log.DEBUG_MODE);
		WebViewProxy proxy = (WebViewProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getUserAgent();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_userAgent(Object value)
	{
		Log.d(TAG, "set userAgent", Log.DEBUG_MODE);
		WebViewProxy proxy = (WebViewProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setUserAgent(arg0);
		//proxy.setProperty("userAgent", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_html()
	{
		Log.d(TAG, "get html", Log.DEBUG_MODE);
		WebViewProxy proxy = (WebViewProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getHtml();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Number getter_pluginState()
	{
		Log.d(TAG, "get pluginState", Log.DEBUG_MODE);
		WebViewProxy proxy = (WebViewProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getPluginState();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public void setter_pluginState(Object value)
	{
		Log.d(TAG, "set pluginState", Log.DEBUG_MODE);
		WebViewProxy proxy = (WebViewProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setPluginState(arg0);
		//proxy.setProperty("pluginState", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getData = 2,
		Id_setData = 3,
		Id_getOnCreateWindow = 4,
		Id_setOnCreateWindow = 5,
		Id_getScalesPageToFit = 6,
		Id_setScalesPageToFit = 7,
		Id_getUrl = 8,
		Id_setUrl = 9,
		Id_getIgnoreSslError = 10,
		Id_setIgnoreSslError = 11,
		// Method IDs
		Id_goBack = 12,
		Id_getHtml = 13,
		Id_getEnableZoomControls = 14,
		Id_pause = 15,
		Id_setUserAgent = 16,
		Id_resume = 17,
		Id_goForward = 18,
		Id_stopLoading = 19,
		Id_getUserAgent = 20,
		Id_getPluginState = 21,
		Id_canGoBack = 22,
		Id_setBasicAuthentication = 23,
		Id_setHtml = 24,
		Id_reload = 25,
		Id_evalJS = 26,
		Id_setEnableZoomControls = 27,
		Id_release = 28,
		Id_canGoForward = 29,
		Id_setPluginState = 30
;
		

	public static final int MAX_PROTOTYPE_ID = 30;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 5: X="pause";id=Id_pause; break L;
            case 6: switch (s.charAt(2)) {
                case 'B': X="goBack";id=Id_goBack; break L;
                case 'a': X="evalJS";id=Id_evalJS; break L;
                case 'l': X="reload";id=Id_reload; break L;
                case 's': X="resume";id=Id_resume; break L;
                case 't': c=s.charAt(0);
                    if (c=='g') { X="getUrl";id=Id_getUrl; }
                    else if (c=='s') { X="setUrl";id=Id_setUrl; }
                    break L;
                } break L;
            case 7: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(6);
                    if (c=='a') { X="getData";id=Id_getData; }
                    else if (c=='l') { X="getHtml";id=Id_getHtml; }
                }
                else if (c=='r') { X="release";id=Id_release; }
                else if (c=='s') {
                    c=s.charAt(6);
                    if (c=='a') { X="setData";id=Id_setData; }
                    else if (c=='l') { X="setHtml";id=Id_setHtml; }
                }
                break L;
            case 9: c=s.charAt(0);
                if (c=='c') { X="canGoBack";id=Id_canGoBack; }
                else if (c=='g') { X="goForward";id=Id_goForward; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='s') { X="stopLoading";id=Id_stopLoading; }
                break L;
            case 12: c=s.charAt(0);
                if (c=='c') { X="canGoForward";id=Id_canGoForward; }
                else if (c=='g') { X="getUserAgent";id=Id_getUserAgent; }
                else if (c=='s') { X="setUserAgent";id=Id_setUserAgent; }
                break L;
            case 14: c=s.charAt(0);
                if (c=='g') { X="getPluginState";id=Id_getPluginState; }
                else if (c=='s') { X="setPluginState";id=Id_setPluginState; }
                break L;
            case 17: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(16);
                    if (c=='r') { X="getIgnoreSslError";id=Id_getIgnoreSslError; }
                    else if (c=='w') { X="getOnCreateWindow";id=Id_getOnCreateWindow; }
                }
                else if (c=='s') {
                    c=s.charAt(16);
                    if (c=='r') { X="setIgnoreSslError";id=Id_setIgnoreSslError; }
                    else if (c=='w') { X="setOnCreateWindow";id=Id_setOnCreateWindow; }
                }
                break L;
            case 18: c=s.charAt(0);
                if (c=='g') { X="getScalesPageToFit";id=Id_getScalesPageToFit; }
                else if (c=='s') { X="setScalesPageToFit";id=Id_setScalesPageToFit; }
                break L;
            case 21: c=s.charAt(0);
                if (c=='g') { X="getEnableZoomControls";id=Id_getEnableZoomControls; }
                else if (c=='s') { X="setEnableZoomControls";id=Id_setEnableZoomControls; }
                break L;
            case 22: X="setBasicAuthentication";id=Id_setBasicAuthentication; break L;
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
			case Id_getData:
				arity = 0;
				name = "getData";
				break;
			case Id_setData:
				arity = 1;
				name = "setData";
				break;
			case Id_getOnCreateWindow:
				arity = 0;
				name = "getOnCreateWindow";
				break;
			case Id_setOnCreateWindow:
				arity = 1;
				name = "setOnCreateWindow";
				break;
			case Id_getScalesPageToFit:
				arity = 0;
				name = "getScalesPageToFit";
				break;
			case Id_setScalesPageToFit:
				arity = 1;
				name = "setScalesPageToFit";
				break;
			case Id_getUrl:
				arity = 0;
				name = "getUrl";
				break;
			case Id_setUrl:
				arity = 1;
				name = "setUrl";
				break;
			case Id_getIgnoreSslError:
				arity = 0;
				name = "getIgnoreSslError";
				break;
			case Id_setIgnoreSslError:
				arity = 1;
				name = "setIgnoreSslError";
				break;
			case Id_goBack:
				arity = 0;
				name = "goBack";
				break;
			case Id_getHtml:
				arity = 0;
				name = "getHtml";
				break;
			case Id_getEnableZoomControls:
				arity = 0;
				name = "getEnableZoomControls";
				break;
			case Id_pause:
				arity = 0;
				name = "pause";
				break;
			case Id_setUserAgent:
				arity = 1;
				name = "setUserAgent";
				break;
			case Id_resume:
				arity = 0;
				name = "resume";
				break;
			case Id_goForward:
				arity = 0;
				name = "goForward";
				break;
			case Id_stopLoading:
				arity = 0;
				name = "stopLoading";
				break;
			case Id_getUserAgent:
				arity = 0;
				name = "getUserAgent";
				break;
			case Id_getPluginState:
				arity = 0;
				name = "getPluginState";
				break;
			case Id_canGoBack:
				arity = 0;
				name = "canGoBack";
				break;
			case Id_setBasicAuthentication:
				arity = 2;
				name = "setBasicAuthentication";
				break;
			case Id_setHtml:
				arity = 2;
				name = "setHtml";
				break;
			case Id_reload:
				arity = 0;
				name = "reload";
				break;
			case Id_evalJS:
				arity = 1;
				name = "evalJS";
				break;
			case Id_setEnableZoomControls:
				arity = 1;
				name = "setEnableZoomControls";
				break;
			case Id_release:
				arity = 0;
				name = "release";
				break;
			case Id_canGoForward:
				arity = 0;
				name = "canGoForward";
				break;
			case Id_setPluginState:
				arity = 1;
				name = "setPluginState";
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

		while (thisObj != null && !(thisObj instanceof WebViewProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		WebViewProxyPrototype proxy = (WebViewProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getData:
				return proxy.getProperty("data");
			case Id_setData:
				proxy.setProperty("data", args[0]);
				proxy.onPropertyChanged("data", args[0]);
				return Undefined.instance;
			case Id_getOnCreateWindow:
				return proxy.getProperty("onCreateWindow");
			case Id_setOnCreateWindow:
				proxy.setProperty("onCreateWindow", args[0]);
				proxy.onPropertyChanged("onCreateWindow", args[0]);
				return Undefined.instance;
			case Id_getScalesPageToFit:
				return proxy.getProperty("scalesPageToFit");
			case Id_setScalesPageToFit:
				proxy.setProperty("scalesPageToFit", args[0]);
				proxy.onPropertyChanged("scalesPageToFit", args[0]);
				return Undefined.instance;
			case Id_getUrl:
				return proxy.getProperty("url");
			case Id_setUrl:
				proxy.setProperty("url", args[0]);
				proxy.onPropertyChanged("url", args[0]);
				return Undefined.instance;
			case Id_getIgnoreSslError:
				return proxy.getProperty("ignoreSslError");
			case Id_setIgnoreSslError:
				proxy.setProperty("ignoreSslError", args[0]);
				proxy.onPropertyChanged("ignoreSslError", args[0]);
				return Undefined.instance;
			case Id_goBack:
				 goBack(cx, thisObj, args);
				return Undefined.instance;
			case Id_getHtml:
				return getHtml(cx, thisObj, args);
				
			case Id_getEnableZoomControls:
				return getEnableZoomControls(cx, thisObj, args);
				
			case Id_pause:
				 pause(cx, thisObj, args);
				return Undefined.instance;
			case Id_setUserAgent:
				 setUserAgent(cx, thisObj, args);
				return Undefined.instance;
			case Id_resume:
				 resume(cx, thisObj, args);
				return Undefined.instance;
			case Id_goForward:
				 goForward(cx, thisObj, args);
				return Undefined.instance;
			case Id_stopLoading:
				 stopLoading(cx, thisObj, args);
				return Undefined.instance;
			case Id_getUserAgent:
				return getUserAgent(cx, thisObj, args);
				
			case Id_getPluginState:
				return getPluginState(cx, thisObj, args);
				
			case Id_canGoBack:
				return canGoBack(cx, thisObj, args);
				
			case Id_setBasicAuthentication:
				 setBasicAuthentication(cx, thisObj, args);
				return Undefined.instance;
			case Id_setHtml:
				 setHtml(cx, thisObj, args);
				return Undefined.instance;
			case Id_reload:
				 reload(cx, thisObj, args);
				return Undefined.instance;
			case Id_evalJS:
				return evalJS(cx, thisObj, args);
				
			case Id_setEnableZoomControls:
				 setEnableZoomControls(cx, thisObj, args);
				return Undefined.instance;
			case Id_release:
				 release(cx, thisObj, args);
				return Undefined.instance;
			case Id_canGoForward:
				return canGoForward(cx, thisObj, args);
				
			case Id_setPluginState:
				 setPluginState(cx, thisObj, args);
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

		Id_enableZoomControls = 1
		,		
		Id_userAgent = 2
		,		
		Id_html = 3
		,		
		Id_pluginState = 4
		;

	// Property accessor IDs
	private static final int

		Id_data = 5
		,		
		Id_onCreateWindow = 6
		,		
		Id_scalesPageToFit = 7
		,		
		Id_url = 8
		,		
		Id_ignoreSslError = 9
		;

;

	public static final int MAX_INSTANCE_ID = 9;

	@Override
	protected int getMaxInstanceId()
	{
		return MAX_INSTANCE_ID;
	}

	@Override
	protected int findInstanceIdInfo(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 3: X="url";id=Id_url; break L;
            case 4: c=s.charAt(0);
                if (c=='d') { X="data";id=Id_data; }
                else if (c=='h') { X="html";id=Id_html; }
                break L;
            case 9: X="userAgent";id=Id_userAgent; break L;
            case 11: X="pluginState";id=Id_pluginState; break L;
            case 14: c=s.charAt(0);
                if (c=='i') { X="ignoreSslError";id=Id_ignoreSslError; }
                else if (c=='o') { X="onCreateWindow";id=Id_onCreateWindow; }
                break L;
            case 15: X="scalesPageToFit";id=Id_scalesPageToFit; break L;
            case 18: X="enableZoomControls";id=Id_enableZoomControls; break L;
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
			case Id_enableZoomControls:
				return "enableZoomControls"; 
			case Id_userAgent:
				return "userAgent"; 
			case Id_html:
				return "html"; 
			case Id_pluginState:
				return "pluginState"; 
			case Id_data:
				return "data";
			case Id_onCreateWindow:
				return "onCreateWindow";
			case Id_scalesPageToFit:
				return "scalesPageToFit";
			case Id_url:
				return "url";
			case Id_ignoreSslError:
				return "ignoreSslError";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		WebViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof WebViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof WebViewProxyPrototype) {
			proxy = (WebViewProxyPrototype) start;
		}

		switch (id) {
			case Id_enableZoomControls:
				return proxy.getter_enableZoomControls();
			case Id_userAgent:
				return proxy.getter_userAgent();
			case Id_html:
				return proxy.getter_html();
			case Id_pluginState:
				return proxy.getter_pluginState();
			case Id_data:
				return proxy.getProperty("data");
			case Id_onCreateWindow:
				return proxy.getProperty("onCreateWindow");
			case Id_scalesPageToFit:
				return proxy.getProperty("scalesPageToFit");
			case Id_url:
				return proxy.getProperty("url");
			case Id_ignoreSslError:
				return proxy.getProperty("ignoreSslError");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		WebViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof WebViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof WebViewProxyPrototype) {
			proxy = (WebViewProxyPrototype) start;
		}

		switch (id) {
			case Id_enableZoomControls:
				proxy.setter_enableZoomControls(value);
				break; 
			case Id_userAgent:
				proxy.setter_userAgent(value);
				break; 
			case Id_html:
				proxy.setProperty("html", value);
				proxy.onPropertyChanged("html", value);
				break; 
			case Id_pluginState:
				proxy.setter_pluginState(value);
				break; 
			case Id_data:
				proxy.setProperty("data", value);
				proxy.onPropertyChanged("data", value);
				break;
			case Id_onCreateWindow:
				proxy.setProperty("onCreateWindow", value);
				proxy.onPropertyChanged("onCreateWindow", value);
				break;
			case Id_scalesPageToFit:
				proxy.setProperty("scalesPageToFit", value);
				proxy.onPropertyChanged("scalesPageToFit", value);
				break;
			case Id_url:
				proxy.setProperty("url", value);
				proxy.onPropertyChanged("url", value);
				break;
			case Id_ignoreSslError:
				proxy.setProperty("ignoreSslError", value);
				proxy.onPropertyChanged("ignoreSslError", value);
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
