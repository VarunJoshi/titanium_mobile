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

import org.appcelerator.titanium.proxy.TiWindowProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class TiWindowProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = 1869643538321713834L;

	private static final String TAG = "TiWindowProxyPrototype";
	private static final String CLASS_TAG = "TiWindowProxy";
	private static TiWindowProxyPrototype tiWindowProxyPrototype;


	public static TiWindowProxyPrototype getProxyPrototype()
	{
		return tiWindowProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		tiWindowProxyPrototype = null;
	}

	public TiWindowProxyPrototype()
	{
		if (tiWindowProxyPrototype == null && getClass().equals(TiWindowProxyPrototype.class)) {
			tiWindowProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == tiWindowProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return tiWindowProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TiWindowProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getOrientationModes(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getOrientationModes()", Log.DEBUG_MODE);

		try {
		TiWindowProxy proxy = (TiWindowProxy) ((Proxy) thisObj).getProxy();

		int[] javaResult = proxy.getOrientationModes();

		Scriptable rhinoResult = (Scriptable) TypeConverter.javaIntArrayToJsArray(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getOrientation(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getOrientation()", Log.DEBUG_MODE);

		try {
		TiWindowProxy proxy = (TiWindowProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getOrientation();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getTab(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTab()", Log.DEBUG_MODE);

		try {
		TiWindowProxy proxy = (TiWindowProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.proxy.TiViewProxy javaResult = proxy.getTabProxy();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getTabGroup(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTabGroup()", Log.DEBUG_MODE);

		try {
		TiWindowProxy proxy = (TiWindowProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.proxy.TiViewProxy javaResult = proxy.getTabGroupProxy();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setTab(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setTab()", Log.DEBUG_MODE);

		try {
		TiWindowProxy proxy = (TiWindowProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setTab: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.TiViewProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.TiViewProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setTabProxy(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setLeftNavButton(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setLeftNavButton()", Log.DEBUG_MODE);

		try {
		TiWindowProxy proxy = (TiWindowProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setLeftNavButton: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setLeftNavButton(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void close(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "close()", Log.DEBUG_MODE);

		try {
		TiWindowProxy proxy = (TiWindowProxy) ((Proxy) thisObj).getProxy();
		java.lang.Object arg0;
		if (args.length <= 0) {
			arg0 = null;
		} else {
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		}

		proxy.close(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getActivity(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getActivity()", Log.DEBUG_MODE);

		try {
		TiWindowProxy proxy = (TiWindowProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.proxy.ActivityProxy javaResult = proxy.getActivityProxy();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
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
		TiWindowProxy proxy = (TiWindowProxy) ((Proxy) thisObj).getProxy();
		java.lang.Object arg0;
		if (args.length <= 0) {
			arg0 = null;
		} else {
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		}

		proxy.open(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setWindowPixelFormat(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setWindowPixelFormat()", Log.DEBUG_MODE);

		try {
		TiWindowProxy proxy = (TiWindowProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setWindowPixelFormat: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setWindowPixelFormat(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getWindowPixelFormat(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getWindowPixelFormat()", Log.DEBUG_MODE);

		try {
		TiWindowProxy proxy = (TiWindowProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getWindowPixelFormat();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setOrientationModes(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setOrientationModes()", Log.DEBUG_MODE);

		try {
		TiWindowProxy proxy = (TiWindowProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setOrientationModes: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Scriptable) && args[0] != null) {
			String error = "Invalid value, expected type Scriptable, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		int[] arg0;
		arg0 = (int[]) TypeConverter.jsArrayToJavaIntArray((Scriptable) args[0], thisObj) ;

		proxy.setOrientationModes(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setTabGroup(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setTabGroup()", Log.DEBUG_MODE);

		try {
		TiWindowProxy proxy = (TiWindowProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setTabGroup: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.TiViewProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.TiViewProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setTabGroupProxy(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public void setter_leftNavButton(Object value)
	{
		Log.d(TAG, "set leftNavButton", Log.DEBUG_MODE);
		TiWindowProxy proxy = (TiWindowProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setLeftNavButton(arg0);
		//proxy.setProperty("leftNavButton", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Proxy getter_tab()
	{
		Log.d(TAG, "get tab", Log.DEBUG_MODE);
		TiWindowProxy proxy = (TiWindowProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.proxy.TiViewProxy javaResult = proxy.getTabProxy();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public void setter_tab(Object value)
	{
		Log.d(TAG, "set tab", Log.DEBUG_MODE);
		TiWindowProxy proxy = (TiWindowProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Proxy) && value != null) {
			String error = "Invalid value, expected type Proxy, got: " + value;
			Log.e(TAG, error);
		}
		org.appcelerator.titanium.proxy.TiViewProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.TiViewProxy) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setTabProxy(arg0);
		//proxy.setProperty("tab", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Proxy getter__internalActivity()
	{
		Log.d(TAG, "get _internalActivity", Log.DEBUG_MODE);
		TiWindowProxy proxy = (TiWindowProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.proxy.ActivityProxy javaResult = proxy.getActivityProxy();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Proxy getter_tabGroup()
	{
		Log.d(TAG, "get tabGroup", Log.DEBUG_MODE);
		TiWindowProxy proxy = (TiWindowProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.proxy.TiViewProxy javaResult = proxy.getTabGroupProxy();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public void setter_tabGroup(Object value)
	{
		Log.d(TAG, "set tabGroup", Log.DEBUG_MODE);
		TiWindowProxy proxy = (TiWindowProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Proxy) && value != null) {
			String error = "Invalid value, expected type Proxy, got: " + value;
			Log.e(TAG, error);
		}
		org.appcelerator.titanium.proxy.TiViewProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.TiViewProxy) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setTabGroupProxy(arg0);
		//proxy.setProperty("tabGroup", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getExitOnClose = 2,
		Id_setExitOnClose = 3,
		Id_getFullscreen = 4,
		Id_setFullscreen = 5,
		Id_getModal = 6,
		Id_setModal = 7,
		Id_getNavBarHidden = 8,
		Id_setNavBarHidden = 9,
		Id_getTitle = 10,
		Id_setTitle = 11,
		Id_getTitleid = 12,
		Id_setTitleid = 13,
		Id_getUrl = 14,
		Id_setUrl = 15,
		Id_getWindowSoftInputMode = 16,
		Id_setWindowSoftInputMode = 17,
		// Method IDs
		Id_getOrientationModes = 18,
		Id_getOrientation = 19,
		Id_getTab = 20,
		Id_getTabGroup = 21,
		Id_setTab = 22,
		Id_setLeftNavButton = 23,
		Id_close = 24,
		Id_getActivity = 25,
		Id_open = 26,
		Id_setWindowPixelFormat = 27,
		Id_getWindowPixelFormat = 28,
		Id_setOrientationModes = 29,
		Id_setTabGroup = 30
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
// #generated# Last update: 2013-01-31 18:21:22 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 4: X="open";id=Id_open; break L;
            case 5: X="close";id=Id_close; break L;
            case 6: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(5);
                    if (c=='b') { X="getTab";id=Id_getTab; }
                    else if (c=='l') { X="getUrl";id=Id_getUrl; }
                }
                else if (c=='s') {
                    c=s.charAt(5);
                    if (c=='b') { X="setTab";id=Id_setTab; }
                    else if (c=='l') { X="setUrl";id=Id_setUrl; }
                }
                break L;
            case 8: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(7);
                    if (c=='e') { X="getTitle";id=Id_getTitle; }
                    else if (c=='l') { X="getModal";id=Id_getModal; }
                }
                else if (c=='s') {
                    c=s.charAt(7);
                    if (c=='e') { X="setTitle";id=Id_setTitle; }
                    else if (c=='l') { X="setModal";id=Id_setModal; }
                }
                break L;
            case 10: c=s.charAt(0);
                if (c=='g') { X="getTitleid";id=Id_getTitleid; }
                else if (c=='s') { X="setTitleid";id=Id_setTitleid; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') {
                    c=s.charAt(10);
                    if (c=='p') { X="getTabGroup";id=Id_getTabGroup; }
                    else if (c=='y') { X="getActivity";id=Id_getActivity; }
                }
                else if (c=='s') { X="setTabGroup";id=Id_setTabGroup; }
                break L;
            case 13: c=s.charAt(0);
                if (c=='g') { X="getFullscreen";id=Id_getFullscreen; }
                else if (c=='s') { X="setFullscreen";id=Id_setFullscreen; }
                break L;
            case 14: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(13);
                    if (c=='e') { X="getExitOnClose";id=Id_getExitOnClose; }
                    else if (c=='n') { X="getOrientation";id=Id_getOrientation; }
                }
                else if (c=='s') { X="setExitOnClose";id=Id_setExitOnClose; }
                break L;
            case 15: c=s.charAt(0);
                if (c=='g') { X="getNavBarHidden";id=Id_getNavBarHidden; }
                else if (c=='s') { X="setNavBarHidden";id=Id_setNavBarHidden; }
                break L;
            case 16: X="setLeftNavButton";id=Id_setLeftNavButton; break L;
            case 19: c=s.charAt(0);
                if (c=='g') { X="getOrientationModes";id=Id_getOrientationModes; }
                else if (c=='s') { X="setOrientationModes";id=Id_setOrientationModes; }
                break L;
            case 20: c=s.charAt(0);
                if (c=='g') { X="getWindowPixelFormat";id=Id_getWindowPixelFormat; }
                else if (c=='s') { X="setWindowPixelFormat";id=Id_setWindowPixelFormat; }
                break L;
            case 22: c=s.charAt(0);
                if (c=='g') { X="getWindowSoftInputMode";id=Id_getWindowSoftInputMode; }
                else if (c=='s') { X="setWindowSoftInputMode";id=Id_setWindowSoftInputMode; }
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
			case Id_getExitOnClose:
				arity = 0;
				name = "getExitOnClose";
				break;
			case Id_setExitOnClose:
				arity = 1;
				name = "setExitOnClose";
				break;
			case Id_getFullscreen:
				arity = 0;
				name = "getFullscreen";
				break;
			case Id_setFullscreen:
				arity = 1;
				name = "setFullscreen";
				break;
			case Id_getModal:
				arity = 0;
				name = "getModal";
				break;
			case Id_setModal:
				arity = 1;
				name = "setModal";
				break;
			case Id_getNavBarHidden:
				arity = 0;
				name = "getNavBarHidden";
				break;
			case Id_setNavBarHidden:
				arity = 1;
				name = "setNavBarHidden";
				break;
			case Id_getTitle:
				arity = 0;
				name = "getTitle";
				break;
			case Id_setTitle:
				arity = 1;
				name = "setTitle";
				break;
			case Id_getTitleid:
				arity = 0;
				name = "getTitleid";
				break;
			case Id_setTitleid:
				arity = 1;
				name = "setTitleid";
				break;
			case Id_getUrl:
				arity = 0;
				name = "getUrl";
				break;
			case Id_setUrl:
				arity = 1;
				name = "setUrl";
				break;
			case Id_getWindowSoftInputMode:
				arity = 0;
				name = "getWindowSoftInputMode";
				break;
			case Id_setWindowSoftInputMode:
				arity = 1;
				name = "setWindowSoftInputMode";
				break;
			case Id_getOrientationModes:
				arity = 0;
				name = "getOrientationModes";
				break;
			case Id_getOrientation:
				arity = 0;
				name = "getOrientation";
				break;
			case Id_getTab:
				arity = 0;
				name = "getTab";
				break;
			case Id_getTabGroup:
				arity = 0;
				name = "getTabGroup";
				break;
			case Id_setTab:
				arity = 1;
				name = "setTab";
				break;
			case Id_setLeftNavButton:
				arity = 1;
				name = "setLeftNavButton";
				break;
			case Id_close:
				arity = 1;
				name = "close";
				break;
			case Id_getActivity:
				arity = 0;
				name = "getActivity";
				break;
			case Id_open:
				arity = 1;
				name = "open";
				break;
			case Id_setWindowPixelFormat:
				arity = 1;
				name = "setWindowPixelFormat";
				break;
			case Id_getWindowPixelFormat:
				arity = 0;
				name = "getWindowPixelFormat";
				break;
			case Id_setOrientationModes:
				arity = 1;
				name = "setOrientationModes";
				break;
			case Id_setTabGroup:
				arity = 1;
				name = "setTabGroup";
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

		while (thisObj != null && !(thisObj instanceof TiWindowProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TiWindowProxyPrototype proxy = (TiWindowProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getExitOnClose:
				return proxy.getProperty("exitOnClose");
			case Id_setExitOnClose:
				proxy.setProperty("exitOnClose", args[0]);
				proxy.onPropertyChanged("exitOnClose", args[0]);
				return Undefined.instance;
			case Id_getFullscreen:
				return proxy.getProperty("fullscreen");
			case Id_setFullscreen:
				proxy.setProperty("fullscreen", args[0]);
				proxy.onPropertyChanged("fullscreen", args[0]);
				return Undefined.instance;
			case Id_getModal:
				return proxy.getProperty("modal");
			case Id_setModal:
				proxy.setProperty("modal", args[0]);
				proxy.onPropertyChanged("modal", args[0]);
				return Undefined.instance;
			case Id_getNavBarHidden:
				return proxy.getProperty("navBarHidden");
			case Id_setNavBarHidden:
				proxy.setProperty("navBarHidden", args[0]);
				proxy.onPropertyChanged("navBarHidden", args[0]);
				return Undefined.instance;
			case Id_getTitle:
				return proxy.getProperty("title");
			case Id_setTitle:
				proxy.setProperty("title", args[0]);
				proxy.onPropertyChanged("title", args[0]);
				return Undefined.instance;
			case Id_getTitleid:
				return proxy.getProperty("titleid");
			case Id_setTitleid:
				proxy.setProperty("titleid", args[0]);
				proxy.onPropertyChanged("titleid", args[0]);
				return Undefined.instance;
			case Id_getUrl:
				return proxy.getProperty("url");
			case Id_setUrl:
				proxy.setProperty("url", args[0]);
				proxy.onPropertyChanged("url", args[0]);
				return Undefined.instance;
			case Id_getWindowSoftInputMode:
				return proxy.getProperty("windowSoftInputMode");
			case Id_setWindowSoftInputMode:
				proxy.setProperty("windowSoftInputMode", args[0]);
				proxy.onPropertyChanged("windowSoftInputMode", args[0]);
				return Undefined.instance;
			case Id_getOrientationModes:
				return getOrientationModes(cx, thisObj, args);
				
			case Id_getOrientation:
				return getOrientation(cx, thisObj, args);
				
			case Id_getTab:
				return getTab(cx, thisObj, args);
				
			case Id_getTabGroup:
				return getTabGroup(cx, thisObj, args);
				
			case Id_setTab:
				 setTab(cx, thisObj, args);
				return Undefined.instance;
			case Id_setLeftNavButton:
				 setLeftNavButton(cx, thisObj, args);
				return Undefined.instance;
			case Id_close:
				 close(cx, thisObj, args);
				return Undefined.instance;
			case Id_getActivity:
				return getActivity(cx, thisObj, args);
				
			case Id_open:
				 open(cx, thisObj, args);
				return Undefined.instance;
			case Id_setWindowPixelFormat:
				 setWindowPixelFormat(cx, thisObj, args);
				return Undefined.instance;
			case Id_getWindowPixelFormat:
				return getWindowPixelFormat(cx, thisObj, args);
				
			case Id_setOrientationModes:
				 setOrientationModes(cx, thisObj, args);
				return Undefined.instance;
			case Id_setTabGroup:
				 setTabGroup(cx, thisObj, args);
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

		Id_leftNavButton = 1
		,		
		Id_tab = 2
		,		
		Id__internalActivity = 3
		,		
		Id_tabGroup = 4
		;

	// Property accessor IDs
	private static final int

		Id_exitOnClose = 5
		,		
		Id_fullscreen = 6
		,		
		Id_modal = 7
		,		
		Id_navBarHidden = 8
		,		
		Id_title = 9
		,		
		Id_titleid = 10
		,		
		Id_url = 11
		,		
		Id_windowSoftInputMode = 12
		;

;

	public static final int MAX_INSTANCE_ID = 12;

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
            case 3: c=s.charAt(0);
                if (c=='t') { if (s.charAt(2)=='b' && s.charAt(1)=='a') {id=Id_tab; break L0;} }
                else if (c=='u') { if (s.charAt(2)=='l' && s.charAt(1)=='r') {id=Id_url; break L0;} }
                break L;
            case 5: c=s.charAt(0);
                if (c=='m') { X="modal";id=Id_modal; }
                else if (c=='t') { X="title";id=Id_title; }
                break L;
            case 7: X="titleid";id=Id_titleid; break L;
            case 8: X="tabGroup";id=Id_tabGroup; break L;
            case 10: X="fullscreen";id=Id_fullscreen; break L;
            case 11: X="exitOnClose";id=Id_exitOnClose; break L;
            case 12: X="navBarHidden";id=Id_navBarHidden; break L;
            case 13: X="leftNavButton";id=Id_leftNavButton; break L;
            case 17: X="_internalActivity";id=Id__internalActivity; break L;
            case 19: X="windowSoftInputMode";id=Id_windowSoftInputMode; break L;
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
			case Id_leftNavButton:
				return "leftNavButton"; 
			case Id_tab:
				return "tab"; 
			case Id__internalActivity:
				return "_internalActivity"; 
			case Id_tabGroup:
				return "tabGroup"; 
			case Id_exitOnClose:
				return "exitOnClose";
			case Id_fullscreen:
				return "fullscreen";
			case Id_modal:
				return "modal";
			case Id_navBarHidden:
				return "navBarHidden";
			case Id_title:
				return "title";
			case Id_titleid:
				return "titleid";
			case Id_url:
				return "url";
			case Id_windowSoftInputMode:
				return "windowSoftInputMode";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TiWindowProxyPrototype proxy = this;
		while (start != null && !(start instanceof TiWindowProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TiWindowProxyPrototype) {
			proxy = (TiWindowProxyPrototype) start;
		}

		switch (id) {
			case Id_leftNavButton:
				return proxy.getProperty("leftNavButton");
			case Id_tab:
				return proxy.getter_tab();
			case Id__internalActivity:
				return proxy.getter__internalActivity();
			case Id_tabGroup:
				return proxy.getter_tabGroup();
			case Id_exitOnClose:
				return proxy.getProperty("exitOnClose");
			case Id_fullscreen:
				return proxy.getProperty("fullscreen");
			case Id_modal:
				return proxy.getProperty("modal");
			case Id_navBarHidden:
				return proxy.getProperty("navBarHidden");
			case Id_title:
				return proxy.getProperty("title");
			case Id_titleid:
				return proxy.getProperty("titleid");
			case Id_url:
				return proxy.getProperty("url");
			case Id_windowSoftInputMode:
				return proxy.getProperty("windowSoftInputMode");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		TiWindowProxyPrototype proxy = this;
		while (start != null && !(start instanceof TiWindowProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TiWindowProxyPrototype) {
			proxy = (TiWindowProxyPrototype) start;
		}

		switch (id) {
			case Id_leftNavButton:
				proxy.setter_leftNavButton(value);
				break; 
			case Id_tab:
				proxy.setter_tab(value);
				break; 
			case Id__internalActivity:
				proxy.setProperty("_internalActivity", value);
				proxy.onPropertyChanged("_internalActivity", value);
				break; 
			case Id_tabGroup:
				proxy.setter_tabGroup(value);
				break; 
			case Id_exitOnClose:
				proxy.setProperty("exitOnClose", value);
				proxy.onPropertyChanged("exitOnClose", value);
				break;
			case Id_fullscreen:
				proxy.setProperty("fullscreen", value);
				proxy.onPropertyChanged("fullscreen", value);
				break;
			case Id_modal:
				proxy.setProperty("modal", value);
				proxy.onPropertyChanged("modal", value);
				break;
			case Id_navBarHidden:
				proxy.setProperty("navBarHidden", value);
				proxy.onPropertyChanged("navBarHidden", value);
				break;
			case Id_title:
				proxy.setProperty("title", value);
				proxy.onPropertyChanged("title", value);
				break;
			case Id_titleid:
				proxy.setProperty("titleid", value);
				proxy.onPropertyChanged("titleid", value);
				break;
			case Id_url:
				proxy.setProperty("url", value);
				proxy.onPropertyChanged("url", value);
				break;
			case Id_windowSoftInputMode:
				proxy.setProperty("windowSoftInputMode", value);
				proxy.onPropertyChanged("windowSoftInputMode", value);
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
