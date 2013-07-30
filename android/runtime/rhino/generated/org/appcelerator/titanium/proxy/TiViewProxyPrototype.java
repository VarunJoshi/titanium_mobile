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

import org.appcelerator.titanium.proxy.TiViewProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class TiViewProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 8768103804070071739L;

	private static final String TAG = "TiViewProxyPrototype";
	private static final String CLASS_TAG = "TiViewProxy";
	private static TiViewProxyPrototype tiViewProxyPrototype;


	public static TiViewProxyPrototype getProxyPrototype()
	{
		return tiViewProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		tiViewProxyPrototype = null;
	}

	public TiViewProxyPrototype()
	{
		if (tiViewProxyPrototype == null && getClass().equals(TiViewProxyPrototype.class)) {
			tiViewProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == tiViewProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return tiViewProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TiViewProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void addClass(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addClass()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		proxy.addClass(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void updateLayout(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "updateLayout()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("updateLayout: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.updateLayout(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void startLayout(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "startLayout()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();

		proxy.startLayout();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void animate(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "animate()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("animate: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		org.appcelerator.kroll.KrollFunction arg1;
		if (args.length <= 1) {
			arg1 = null;
		} else {
		arg1 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;
		}

		proxy.animate(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void remove(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "remove()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("remove: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.TiViewProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.TiViewProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.remove(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getChildren(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getChildren()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.proxy.TiViewProxy[] javaResult = proxy.getChildren();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void show(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "show()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();
		org.appcelerator.kroll.KrollDict arg0;
		if (args.length <= 0) {
			arg0 = null;
		} else {
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}
		}

		proxy.show(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void blur(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "blur()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();

		proxy.blur();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void add(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "add()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("add: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.TiViewProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.TiViewProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.add(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void removeAllChildren(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeAllChildren()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();

		proxy.removeAllChildren();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getHeight(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getHeight()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();

		java.lang.Object javaResult = proxy.getHeight();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void hide(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "hide()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();
		org.appcelerator.kroll.KrollDict arg0;
		if (args.length <= 0) {
			arg0 = null;
		} else {
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}
		}

		proxy.hide(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object toImage(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "toImage()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.kroll.KrollDict javaResult = proxy.toImage();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void focus(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "focus()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();

		proxy.focus();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getWidth(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getWidth()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();

		java.lang.Object javaResult = proxy.getWidth();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setWidth(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setWidth()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setWidth: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setWidth(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getSize(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getSize()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.kroll.KrollDict javaResult = proxy.getSize();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getRect(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getRect()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.kroll.KrollDict javaResult = proxy.getRect();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getCenter(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getCenter()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();

		java.lang.Object javaResult = proxy.getCenter();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getKeepScreenOn(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getKeepScreenOn()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getKeepScreenOn();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setKeepScreenOn(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setKeepScreenOn()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setKeepScreenOn: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		proxy.setKeepScreenOn(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getParent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getParent()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.proxy.TiViewProxy javaResult = proxy.getParent();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void finishLayout(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "finishLayout()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();

		proxy.finishLayout();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object convertPointToView(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "convertPointToView()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("convertPointToView: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}
		if (!(args[1] instanceof Proxy) && args[1] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.TiViewProxy arg1;
		arg1 = (org.appcelerator.titanium.proxy.TiViewProxy) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;

		org.appcelerator.kroll.KrollDict javaResult = proxy.convertPointToView(arg0, arg1);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setHeight(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setHeight()", Log.DEBUG_MODE);

		try {
		TiViewProxy proxy = (TiViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setHeight: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setHeight(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Object getter_center()
	{
		Log.d(TAG, "get center", Log.DEBUG_MODE);
		TiViewProxy proxy = (TiViewProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object javaResult = proxy.getCenter();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Object getter_height()
	{
		Log.d(TAG, "get height", Log.DEBUG_MODE);
		TiViewProxy proxy = (TiViewProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object javaResult = proxy.getHeight();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public void setter_height(Object value)
	{
		Log.d(TAG, "set height", Log.DEBUG_MODE);
		TiViewProxy proxy = (TiViewProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setHeight(arg0);
		//proxy.setProperty("height", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Object getter_width()
	{
		Log.d(TAG, "get width", Log.DEBUG_MODE);
		TiViewProxy proxy = (TiViewProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object javaResult = proxy.getWidth();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public void setter_width(Object value)
	{
		Log.d(TAG, "set width", Log.DEBUG_MODE);
		TiViewProxy proxy = (TiViewProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setWidth(arg0);
		//proxy.setProperty("width", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Proxy getter_parent()
	{
		Log.d(TAG, "get parent", Log.DEBUG_MODE);
		TiViewProxy proxy = (TiViewProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.proxy.TiViewProxy javaResult = proxy.getParent();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Object getter_children()
	{
		Log.d(TAG, "get children", Log.DEBUG_MODE);
		TiViewProxy proxy = (TiViewProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.proxy.TiViewProxy[] javaResult = proxy.getChildren();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Boolean getter_keepScreenOn()
	{
		Log.d(TAG, "get keepScreenOn", Log.DEBUG_MODE);
		TiViewProxy proxy = (TiViewProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getKeepScreenOn();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_keepScreenOn(Object value)
	{
		Log.d(TAG, "set keepScreenOn", Log.DEBUG_MODE);
		TiViewProxy proxy = (TiViewProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setKeepScreenOn(arg0);
		//proxy.setProperty("keepScreenOn", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Object getter_rect()
	{
		Log.d(TAG, "get rect", Log.DEBUG_MODE);
		TiViewProxy proxy = (TiViewProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.kroll.KrollDict javaResult = proxy.getRect();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Object getter_size()
	{
		Log.d(TAG, "get size", Log.DEBUG_MODE);
		TiViewProxy proxy = (TiViewProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.kroll.KrollDict javaResult = proxy.getSize();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getBackgroundImage = 2,
		Id_setBackgroundImage = 3,
		Id_getBackgroundRepeat = 4,
		Id_setBackgroundRepeat = 5,
		Id_getBackgroundSelectedImage = 6,
		Id_setBackgroundSelectedImage = 7,
		Id_getBackgroundFocusedImage = 8,
		Id_setBackgroundFocusedImage = 9,
		Id_getBackgroundDisabledImage = 10,
		Id_setBackgroundDisabledImage = 11,
		Id_getBackgroundColor = 12,
		Id_setBackgroundColor = 13,
		Id_getBackgroundSelectedColor = 14,
		Id_setBackgroundSelectedColor = 15,
		Id_getBackgroundFocusedColor = 16,
		Id_setBackgroundFocusedColor = 17,
		Id_getBackgroundDisabledColor = 18,
		Id_setBackgroundDisabledColor = 19,
		Id_getBackgroundPadding = 20,
		Id_setBackgroundPadding = 21,
		Id_getBackgroundGradient = 22,
		Id_setBackgroundGradient = 23,
		Id_getBorderColor = 24,
		Id_setBorderColor = 25,
		Id_getBorderRadius = 26,
		Id_setBorderRadius = 27,
		Id_getBorderWidth = 28,
		Id_setBorderWidth = 29,
		Id_getLeft = 30,
		Id_setLeft = 31,
		Id_getTop = 32,
		Id_setTop = 33,
		Id_getRight = 34,
		Id_setRight = 35,
		Id_getBottom = 36,
		Id_setBottom = 37,
		Id_getLayout = 38,
		Id_setLayout = 39,
		Id_getZIndex = 40,
		Id_setZIndex = 41,
		Id_getAccessibilityHint = 42,
		Id_setAccessibilityHint = 43,
		Id_getAccessibilityLabel = 44,
		Id_setAccessibilityLabel = 45,
		Id_getAccessibilityValue = 46,
		Id_setAccessibilityValue = 47,
		Id_getAccessibilityHidden = 48,
		Id_setAccessibilityHidden = 49,
		Id_getFocusable = 50,
		Id_setFocusable = 51,
		Id_getTouchEnabled = 52,
		Id_setTouchEnabled = 53,
		Id_getVisible = 54,
		Id_setVisible = 55,
		Id_getEnabled = 56,
		Id_setEnabled = 57,
		Id_getOpacity = 58,
		Id_setOpacity = 59,
		Id_getSoftKeyboardOnFocus = 60,
		Id_setSoftKeyboardOnFocus = 61,
		Id_getTransform = 62,
		Id_setTransform = 63,
		// Method IDs
		Id_addClass = 64,
		Id_updateLayout = 65,
		Id_startLayout = 66,
		Id_animate = 67,
		Id_remove = 68,
		Id_getChildren = 69,
		Id_show = 70,
		Id_blur = 71,
		Id_add = 72,
		Id_removeAllChildren = 73,
		Id_getHeight = 74,
		Id_hide = 75,
		Id_toImage = 76,
		Id_focus = 77,
		Id_getWidth = 78,
		Id_setWidth = 79,
		Id_getSize = 80,
		Id_getRect = 81,
		Id_getCenter = 82,
		Id_getKeepScreenOn = 83,
		Id_setKeepScreenOn = 84,
		Id_getParent = 85,
		Id_finishLayout = 86,
		Id_convertPointToView = 87,
		Id_setHeight = 88
;
		

	public static final int MAX_PROTOTYPE_ID = 88;

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
            case 3: X="add";id=Id_add; break L;
            case 4: c=s.charAt(0);
                if (c=='b') { X="blur";id=Id_blur; }
                else if (c=='h') { X="hide";id=Id_hide; }
                else if (c=='s') { X="show";id=Id_show; }
                break L;
            case 5: X="focus";id=Id_focus; break L;
            case 6: c=s.charAt(0);
                if (c=='g') { X="getTop";id=Id_getTop; }
                else if (c=='r') { X="remove";id=Id_remove; }
                else if (c=='s') { X="setTop";id=Id_setTop; }
                break L;
            case 7: switch (s.charAt(5)) {
                case 'c': X="getRect";id=Id_getRect; break L;
                case 'f': c=s.charAt(0);
                    if (c=='g') { X="getLeft";id=Id_getLeft; }
                    else if (c=='s') { X="setLeft";id=Id_setLeft; }
                    break L;
                case 'g': X="toImage";id=Id_toImage; break L;
                case 't': X="animate";id=Id_animate; break L;
                case 'z': X="getSize";id=Id_getSize; break L;
                } break L;
            case 8: c=s.charAt(0);
                if (c=='a') { X="addClass";id=Id_addClass; }
                else if (c=='g') {
                    c=s.charAt(7);
                    if (c=='h') { X="getWidth";id=Id_getWidth; }
                    else if (c=='t') { X="getRight";id=Id_getRight; }
                }
                else if (c=='s') {
                    c=s.charAt(7);
                    if (c=='h') { X="setWidth";id=Id_setWidth; }
                    else if (c=='t') { X="setRight";id=Id_setRight; }
                }
                break L;
            case 9: switch (s.charAt(3)) {
                case 'B': c=s.charAt(0);
                    if (c=='g') { X="getBottom";id=Id_getBottom; }
                    else if (c=='s') { X="setBottom";id=Id_setBottom; }
                    break L;
                case 'C': X="getCenter";id=Id_getCenter; break L;
                case 'H': c=s.charAt(0);
                    if (c=='g') { X="getHeight";id=Id_getHeight; }
                    else if (c=='s') { X="setHeight";id=Id_setHeight; }
                    break L;
                case 'L': c=s.charAt(0);
                    if (c=='g') { X="getLayout";id=Id_getLayout; }
                    else if (c=='s') { X="setLayout";id=Id_setLayout; }
                    break L;
                case 'P': X="getParent";id=Id_getParent; break L;
                case 'Z': c=s.charAt(0);
                    if (c=='g') { X="getZIndex";id=Id_getZIndex; }
                    else if (c=='s') { X="setZIndex";id=Id_setZIndex; }
                    break L;
                } break L;
            case 10: c=s.charAt(3);
                if (c=='E') {
                    c=s.charAt(0);
                    if (c=='g') { X="getEnabled";id=Id_getEnabled; }
                    else if (c=='s') { X="setEnabled";id=Id_setEnabled; }
                }
                else if (c=='O') {
                    c=s.charAt(0);
                    if (c=='g') { X="getOpacity";id=Id_getOpacity; }
                    else if (c=='s') { X="setOpacity";id=Id_setOpacity; }
                }
                else if (c=='V') {
                    c=s.charAt(0);
                    if (c=='g') { X="getVisible";id=Id_getVisible; }
                    else if (c=='s') { X="setVisible";id=Id_setVisible; }
                }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') { X="getChildren";id=Id_getChildren; }
                else if (c=='s') { X="startLayout";id=Id_startLayout; }
                break L;
            case 12: switch (s.charAt(0)) {
                case 'f': X="finishLayout";id=Id_finishLayout; break L;
                case 'g': c=s.charAt(11);
                    if (c=='e') { X="getFocusable";id=Id_getFocusable; }
                    else if (c=='m') { X="getTransform";id=Id_getTransform; }
                    break L;
                case 's': c=s.charAt(11);
                    if (c=='e') { X="setFocusable";id=Id_setFocusable; }
                    else if (c=='m') { X="setTransform";id=Id_setTransform; }
                    break L;
                case 'u': X="updateLayout";id=Id_updateLayout; break L;
                } break L;
            case 14: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(13);
                    if (c=='h') { X="getBorderWidth";id=Id_getBorderWidth; }
                    else if (c=='r') { X="getBorderColor";id=Id_getBorderColor; }
                }
                else if (c=='s') {
                    c=s.charAt(13);
                    if (c=='h') { X="setBorderWidth";id=Id_setBorderWidth; }
                    else if (c=='r') { X="setBorderColor";id=Id_setBorderColor; }
                }
                break L;
            case 15: c=s.charAt(3);
                if (c=='B') {
                    c=s.charAt(0);
                    if (c=='g') { X="getBorderRadius";id=Id_getBorderRadius; }
                    else if (c=='s') { X="setBorderRadius";id=Id_setBorderRadius; }
                }
                else if (c=='K') {
                    c=s.charAt(0);
                    if (c=='g') { X="getKeepScreenOn";id=Id_getKeepScreenOn; }
                    else if (c=='s') { X="setKeepScreenOn";id=Id_setKeepScreenOn; }
                }
                else if (c=='T') {
                    c=s.charAt(0);
                    if (c=='g') { X="getTouchEnabled";id=Id_getTouchEnabled; }
                    else if (c=='s') { X="setTouchEnabled";id=Id_setTouchEnabled; }
                }
                break L;
            case 17: X="removeAllChildren";id=Id_removeAllChildren; break L;
            case 18: c=s.charAt(0);
                if (c=='c') { X="convertPointToView";id=Id_convertPointToView; }
                else if (c=='g') {
                    c=s.charAt(17);
                    if (c=='e') { X="getBackgroundImage";id=Id_getBackgroundImage; }
                    else if (c=='r') { X="getBackgroundColor";id=Id_getBackgroundColor; }
                }
                else if (c=='s') {
                    c=s.charAt(17);
                    if (c=='e') { X="setBackgroundImage";id=Id_setBackgroundImage; }
                    else if (c=='r') { X="setBackgroundColor";id=Id_setBackgroundColor; }
                }
                break L;
            case 19: c=s.charAt(0);
                if (c=='g') { X="getBackgroundRepeat";id=Id_getBackgroundRepeat; }
                else if (c=='s') { X="setBackgroundRepeat";id=Id_setBackgroundRepeat; }
                break L;
            case 20: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(19);
                    if (c=='g') { X="getBackgroundPadding";id=Id_getBackgroundPadding; }
                    else if (c=='t') { X="getAccessibilityHint";id=Id_getAccessibilityHint; }
                }
                else if (c=='s') {
                    c=s.charAt(19);
                    if (c=='g') { X="setBackgroundPadding";id=Id_setBackgroundPadding; }
                    else if (c=='t') { X="setAccessibilityHint";id=Id_setAccessibilityHint; }
                }
                break L;
            case 21: c=s.charAt(16);
                if (c=='L') {
                    c=s.charAt(0);
                    if (c=='g') { X="getAccessibilityLabel";id=Id_getAccessibilityLabel; }
                    else if (c=='s') { X="setAccessibilityLabel";id=Id_setAccessibilityLabel; }
                }
                else if (c=='V') {
                    c=s.charAt(0);
                    if (c=='g') { X="getAccessibilityValue";id=Id_getAccessibilityValue; }
                    else if (c=='s') { X="setAccessibilityValue";id=Id_setAccessibilityValue; }
                }
                else if (c=='d') {
                    c=s.charAt(0);
                    if (c=='g') { X="getBackgroundGradient";id=Id_getBackgroundGradient; }
                    else if (c=='s') { X="setBackgroundGradient";id=Id_setBackgroundGradient; }
                }
                break L;
            case 22: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(21);
                    if (c=='n') { X="getAccessibilityHidden";id=Id_getAccessibilityHidden; }
                    else if (c=='s') { X="getSoftKeyboardOnFocus";id=Id_getSoftKeyboardOnFocus; }
                }
                else if (c=='s') {
                    c=s.charAt(21);
                    if (c=='n') { X="setAccessibilityHidden";id=Id_setAccessibilityHidden; }
                    else if (c=='s') { X="setSoftKeyboardOnFocus";id=Id_setSoftKeyboardOnFocus; }
                }
                break L;
            case 25: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(24);
                    if (c=='e') { X="getBackgroundFocusedImage";id=Id_getBackgroundFocusedImage; }
                    else if (c=='r') { X="getBackgroundFocusedColor";id=Id_getBackgroundFocusedColor; }
                }
                else if (c=='s') {
                    c=s.charAt(24);
                    if (c=='e') { X="setBackgroundFocusedImage";id=Id_setBackgroundFocusedImage; }
                    else if (c=='r') { X="setBackgroundFocusedColor";id=Id_setBackgroundFocusedColor; }
                }
                break L;
            case 26: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(25);
                    if (c=='e') {
                        c=s.charAt(13);
                        if (c=='D') { X="getBackgroundDisabledImage";id=Id_getBackgroundDisabledImage; }
                        else if (c=='S') { X="getBackgroundSelectedImage";id=Id_getBackgroundSelectedImage; }
                    }
                    else if (c=='r') {
                        c=s.charAt(13);
                        if (c=='D') { X="getBackgroundDisabledColor";id=Id_getBackgroundDisabledColor; }
                        else if (c=='S') { X="getBackgroundSelectedColor";id=Id_getBackgroundSelectedColor; }
                    }
                }
                else if (c=='s') {
                    c=s.charAt(25);
                    if (c=='e') {
                        c=s.charAt(13);
                        if (c=='D') { X="setBackgroundDisabledImage";id=Id_setBackgroundDisabledImage; }
                        else if (c=='S') { X="setBackgroundSelectedImage";id=Id_setBackgroundSelectedImage; }
                    }
                    else if (c=='r') {
                        c=s.charAt(13);
                        if (c=='D') { X="setBackgroundDisabledColor";id=Id_setBackgroundDisabledColor; }
                        else if (c=='S') { X="setBackgroundSelectedColor";id=Id_setBackgroundSelectedColor; }
                    }
                }
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
			case Id_getBackgroundImage:
				arity = 0;
				name = "getBackgroundImage";
				break;
			case Id_setBackgroundImage:
				arity = 1;
				name = "setBackgroundImage";
				break;
			case Id_getBackgroundRepeat:
				arity = 0;
				name = "getBackgroundRepeat";
				break;
			case Id_setBackgroundRepeat:
				arity = 1;
				name = "setBackgroundRepeat";
				break;
			case Id_getBackgroundSelectedImage:
				arity = 0;
				name = "getBackgroundSelectedImage";
				break;
			case Id_setBackgroundSelectedImage:
				arity = 1;
				name = "setBackgroundSelectedImage";
				break;
			case Id_getBackgroundFocusedImage:
				arity = 0;
				name = "getBackgroundFocusedImage";
				break;
			case Id_setBackgroundFocusedImage:
				arity = 1;
				name = "setBackgroundFocusedImage";
				break;
			case Id_getBackgroundDisabledImage:
				arity = 0;
				name = "getBackgroundDisabledImage";
				break;
			case Id_setBackgroundDisabledImage:
				arity = 1;
				name = "setBackgroundDisabledImage";
				break;
			case Id_getBackgroundColor:
				arity = 0;
				name = "getBackgroundColor";
				break;
			case Id_setBackgroundColor:
				arity = 1;
				name = "setBackgroundColor";
				break;
			case Id_getBackgroundSelectedColor:
				arity = 0;
				name = "getBackgroundSelectedColor";
				break;
			case Id_setBackgroundSelectedColor:
				arity = 1;
				name = "setBackgroundSelectedColor";
				break;
			case Id_getBackgroundFocusedColor:
				arity = 0;
				name = "getBackgroundFocusedColor";
				break;
			case Id_setBackgroundFocusedColor:
				arity = 1;
				name = "setBackgroundFocusedColor";
				break;
			case Id_getBackgroundDisabledColor:
				arity = 0;
				name = "getBackgroundDisabledColor";
				break;
			case Id_setBackgroundDisabledColor:
				arity = 1;
				name = "setBackgroundDisabledColor";
				break;
			case Id_getBackgroundPadding:
				arity = 0;
				name = "getBackgroundPadding";
				break;
			case Id_setBackgroundPadding:
				arity = 1;
				name = "setBackgroundPadding";
				break;
			case Id_getBackgroundGradient:
				arity = 0;
				name = "getBackgroundGradient";
				break;
			case Id_setBackgroundGradient:
				arity = 1;
				name = "setBackgroundGradient";
				break;
			case Id_getBorderColor:
				arity = 0;
				name = "getBorderColor";
				break;
			case Id_setBorderColor:
				arity = 1;
				name = "setBorderColor";
				break;
			case Id_getBorderRadius:
				arity = 0;
				name = "getBorderRadius";
				break;
			case Id_setBorderRadius:
				arity = 1;
				name = "setBorderRadius";
				break;
			case Id_getBorderWidth:
				arity = 0;
				name = "getBorderWidth";
				break;
			case Id_setBorderWidth:
				arity = 1;
				name = "setBorderWidth";
				break;
			case Id_getLeft:
				arity = 0;
				name = "getLeft";
				break;
			case Id_setLeft:
				arity = 1;
				name = "setLeft";
				break;
			case Id_getTop:
				arity = 0;
				name = "getTop";
				break;
			case Id_setTop:
				arity = 1;
				name = "setTop";
				break;
			case Id_getRight:
				arity = 0;
				name = "getRight";
				break;
			case Id_setRight:
				arity = 1;
				name = "setRight";
				break;
			case Id_getBottom:
				arity = 0;
				name = "getBottom";
				break;
			case Id_setBottom:
				arity = 1;
				name = "setBottom";
				break;
			case Id_getLayout:
				arity = 0;
				name = "getLayout";
				break;
			case Id_setLayout:
				arity = 1;
				name = "setLayout";
				break;
			case Id_getZIndex:
				arity = 0;
				name = "getZIndex";
				break;
			case Id_setZIndex:
				arity = 1;
				name = "setZIndex";
				break;
			case Id_getAccessibilityHint:
				arity = 0;
				name = "getAccessibilityHint";
				break;
			case Id_setAccessibilityHint:
				arity = 1;
				name = "setAccessibilityHint";
				break;
			case Id_getAccessibilityLabel:
				arity = 0;
				name = "getAccessibilityLabel";
				break;
			case Id_setAccessibilityLabel:
				arity = 1;
				name = "setAccessibilityLabel";
				break;
			case Id_getAccessibilityValue:
				arity = 0;
				name = "getAccessibilityValue";
				break;
			case Id_setAccessibilityValue:
				arity = 1;
				name = "setAccessibilityValue";
				break;
			case Id_getAccessibilityHidden:
				arity = 0;
				name = "getAccessibilityHidden";
				break;
			case Id_setAccessibilityHidden:
				arity = 1;
				name = "setAccessibilityHidden";
				break;
			case Id_getFocusable:
				arity = 0;
				name = "getFocusable";
				break;
			case Id_setFocusable:
				arity = 1;
				name = "setFocusable";
				break;
			case Id_getTouchEnabled:
				arity = 0;
				name = "getTouchEnabled";
				break;
			case Id_setTouchEnabled:
				arity = 1;
				name = "setTouchEnabled";
				break;
			case Id_getVisible:
				arity = 0;
				name = "getVisible";
				break;
			case Id_setVisible:
				arity = 1;
				name = "setVisible";
				break;
			case Id_getEnabled:
				arity = 0;
				name = "getEnabled";
				break;
			case Id_setEnabled:
				arity = 1;
				name = "setEnabled";
				break;
			case Id_getOpacity:
				arity = 0;
				name = "getOpacity";
				break;
			case Id_setOpacity:
				arity = 1;
				name = "setOpacity";
				break;
			case Id_getSoftKeyboardOnFocus:
				arity = 0;
				name = "getSoftKeyboardOnFocus";
				break;
			case Id_setSoftKeyboardOnFocus:
				arity = 1;
				name = "setSoftKeyboardOnFocus";
				break;
			case Id_getTransform:
				arity = 0;
				name = "getTransform";
				break;
			case Id_setTransform:
				arity = 1;
				name = "setTransform";
				break;
			case Id_addClass:
				arity = 1;
				name = "addClass";
				break;
			case Id_updateLayout:
				arity = 1;
				name = "updateLayout";
				break;
			case Id_startLayout:
				arity = 0;
				name = "startLayout";
				break;
			case Id_animate:
				arity = 2;
				name = "animate";
				break;
			case Id_remove:
				arity = 1;
				name = "remove";
				break;
			case Id_getChildren:
				arity = 0;
				name = "getChildren";
				break;
			case Id_show:
				arity = 1;
				name = "show";
				break;
			case Id_blur:
				arity = 0;
				name = "blur";
				break;
			case Id_add:
				arity = 1;
				name = "add";
				break;
			case Id_removeAllChildren:
				arity = 0;
				name = "removeAllChildren";
				break;
			case Id_getHeight:
				arity = 0;
				name = "getHeight";
				break;
			case Id_hide:
				arity = 1;
				name = "hide";
				break;
			case Id_toImage:
				arity = 0;
				name = "toImage";
				break;
			case Id_focus:
				arity = 0;
				name = "focus";
				break;
			case Id_getWidth:
				arity = 0;
				name = "getWidth";
				break;
			case Id_setWidth:
				arity = 1;
				name = "setWidth";
				break;
			case Id_getSize:
				arity = 0;
				name = "getSize";
				break;
			case Id_getRect:
				arity = 0;
				name = "getRect";
				break;
			case Id_getCenter:
				arity = 0;
				name = "getCenter";
				break;
			case Id_getKeepScreenOn:
				arity = 0;
				name = "getKeepScreenOn";
				break;
			case Id_setKeepScreenOn:
				arity = 1;
				name = "setKeepScreenOn";
				break;
			case Id_getParent:
				arity = 0;
				name = "getParent";
				break;
			case Id_finishLayout:
				arity = 0;
				name = "finishLayout";
				break;
			case Id_convertPointToView:
				arity = 2;
				name = "convertPointToView";
				break;
			case Id_setHeight:
				arity = 1;
				name = "setHeight";
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

		while (thisObj != null && !(thisObj instanceof TiViewProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TiViewProxyPrototype proxy = (TiViewProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getBackgroundImage:
				return proxy.getProperty("backgroundImage");
			case Id_setBackgroundImage:
				proxy.setProperty("backgroundImage", args[0]);
				proxy.onPropertyChanged("backgroundImage", args[0]);
				return Undefined.instance;
			case Id_getBackgroundRepeat:
				return proxy.getProperty("backgroundRepeat");
			case Id_setBackgroundRepeat:
				proxy.setProperty("backgroundRepeat", args[0]);
				proxy.onPropertyChanged("backgroundRepeat", args[0]);
				return Undefined.instance;
			case Id_getBackgroundSelectedImage:
				return proxy.getProperty("backgroundSelectedImage");
			case Id_setBackgroundSelectedImage:
				proxy.setProperty("backgroundSelectedImage", args[0]);
				proxy.onPropertyChanged("backgroundSelectedImage", args[0]);
				return Undefined.instance;
			case Id_getBackgroundFocusedImage:
				return proxy.getProperty("backgroundFocusedImage");
			case Id_setBackgroundFocusedImage:
				proxy.setProperty("backgroundFocusedImage", args[0]);
				proxy.onPropertyChanged("backgroundFocusedImage", args[0]);
				return Undefined.instance;
			case Id_getBackgroundDisabledImage:
				return proxy.getProperty("backgroundDisabledImage");
			case Id_setBackgroundDisabledImage:
				proxy.setProperty("backgroundDisabledImage", args[0]);
				proxy.onPropertyChanged("backgroundDisabledImage", args[0]);
				return Undefined.instance;
			case Id_getBackgroundColor:
				return proxy.getProperty("backgroundColor");
			case Id_setBackgroundColor:
				proxy.setProperty("backgroundColor", args[0]);
				proxy.onPropertyChanged("backgroundColor", args[0]);
				return Undefined.instance;
			case Id_getBackgroundSelectedColor:
				return proxy.getProperty("backgroundSelectedColor");
			case Id_setBackgroundSelectedColor:
				proxy.setProperty("backgroundSelectedColor", args[0]);
				proxy.onPropertyChanged("backgroundSelectedColor", args[0]);
				return Undefined.instance;
			case Id_getBackgroundFocusedColor:
				return proxy.getProperty("backgroundFocusedColor");
			case Id_setBackgroundFocusedColor:
				proxy.setProperty("backgroundFocusedColor", args[0]);
				proxy.onPropertyChanged("backgroundFocusedColor", args[0]);
				return Undefined.instance;
			case Id_getBackgroundDisabledColor:
				return proxy.getProperty("backgroundDisabledColor");
			case Id_setBackgroundDisabledColor:
				proxy.setProperty("backgroundDisabledColor", args[0]);
				proxy.onPropertyChanged("backgroundDisabledColor", args[0]);
				return Undefined.instance;
			case Id_getBackgroundPadding:
				return proxy.getProperty("backgroundPadding");
			case Id_setBackgroundPadding:
				proxy.setProperty("backgroundPadding", args[0]);
				proxy.onPropertyChanged("backgroundPadding", args[0]);
				return Undefined.instance;
			case Id_getBackgroundGradient:
				return proxy.getProperty("backgroundGradient");
			case Id_setBackgroundGradient:
				proxy.setProperty("backgroundGradient", args[0]);
				proxy.onPropertyChanged("backgroundGradient", args[0]);
				return Undefined.instance;
			case Id_getBorderColor:
				return proxy.getProperty("borderColor");
			case Id_setBorderColor:
				proxy.setProperty("borderColor", args[0]);
				proxy.onPropertyChanged("borderColor", args[0]);
				return Undefined.instance;
			case Id_getBorderRadius:
				return proxy.getProperty("borderRadius");
			case Id_setBorderRadius:
				proxy.setProperty("borderRadius", args[0]);
				proxy.onPropertyChanged("borderRadius", args[0]);
				return Undefined.instance;
			case Id_getBorderWidth:
				return proxy.getProperty("borderWidth");
			case Id_setBorderWidth:
				proxy.setProperty("borderWidth", args[0]);
				proxy.onPropertyChanged("borderWidth", args[0]);
				return Undefined.instance;
			case Id_getLeft:
				return proxy.getProperty("left");
			case Id_setLeft:
				proxy.setProperty("left", args[0]);
				proxy.onPropertyChanged("left", args[0]);
				return Undefined.instance;
			case Id_getTop:
				return proxy.getProperty("top");
			case Id_setTop:
				proxy.setProperty("top", args[0]);
				proxy.onPropertyChanged("top", args[0]);
				return Undefined.instance;
			case Id_getRight:
				return proxy.getProperty("right");
			case Id_setRight:
				proxy.setProperty("right", args[0]);
				proxy.onPropertyChanged("right", args[0]);
				return Undefined.instance;
			case Id_getBottom:
				return proxy.getProperty("bottom");
			case Id_setBottom:
				proxy.setProperty("bottom", args[0]);
				proxy.onPropertyChanged("bottom", args[0]);
				return Undefined.instance;
			case Id_getLayout:
				return proxy.getProperty("layout");
			case Id_setLayout:
				proxy.setProperty("layout", args[0]);
				proxy.onPropertyChanged("layout", args[0]);
				return Undefined.instance;
			case Id_getZIndex:
				return proxy.getProperty("zIndex");
			case Id_setZIndex:
				proxy.setProperty("zIndex", args[0]);
				proxy.onPropertyChanged("zIndex", args[0]);
				return Undefined.instance;
			case Id_getAccessibilityHint:
				return proxy.getProperty("accessibilityHint");
			case Id_setAccessibilityHint:
				proxy.setProperty("accessibilityHint", args[0]);
				proxy.onPropertyChanged("accessibilityHint", args[0]);
				return Undefined.instance;
			case Id_getAccessibilityLabel:
				return proxy.getProperty("accessibilityLabel");
			case Id_setAccessibilityLabel:
				proxy.setProperty("accessibilityLabel", args[0]);
				proxy.onPropertyChanged("accessibilityLabel", args[0]);
				return Undefined.instance;
			case Id_getAccessibilityValue:
				return proxy.getProperty("accessibilityValue");
			case Id_setAccessibilityValue:
				proxy.setProperty("accessibilityValue", args[0]);
				proxy.onPropertyChanged("accessibilityValue", args[0]);
				return Undefined.instance;
			case Id_getAccessibilityHidden:
				return proxy.getProperty("accessibilityHidden");
			case Id_setAccessibilityHidden:
				proxy.setProperty("accessibilityHidden", args[0]);
				proxy.onPropertyChanged("accessibilityHidden", args[0]);
				return Undefined.instance;
			case Id_getFocusable:
				return proxy.getProperty("focusable");
			case Id_setFocusable:
				proxy.setProperty("focusable", args[0]);
				proxy.onPropertyChanged("focusable", args[0]);
				return Undefined.instance;
			case Id_getTouchEnabled:
				return proxy.getProperty("touchEnabled");
			case Id_setTouchEnabled:
				proxy.setProperty("touchEnabled", args[0]);
				proxy.onPropertyChanged("touchEnabled", args[0]);
				return Undefined.instance;
			case Id_getVisible:
				return proxy.getProperty("visible");
			case Id_setVisible:
				proxy.setProperty("visible", args[0]);
				proxy.onPropertyChanged("visible", args[0]);
				return Undefined.instance;
			case Id_getEnabled:
				return proxy.getProperty("enabled");
			case Id_setEnabled:
				proxy.setProperty("enabled", args[0]);
				proxy.onPropertyChanged("enabled", args[0]);
				return Undefined.instance;
			case Id_getOpacity:
				return proxy.getProperty("opacity");
			case Id_setOpacity:
				proxy.setProperty("opacity", args[0]);
				proxy.onPropertyChanged("opacity", args[0]);
				return Undefined.instance;
			case Id_getSoftKeyboardOnFocus:
				return proxy.getProperty("softKeyboardOnFocus");
			case Id_setSoftKeyboardOnFocus:
				proxy.setProperty("softKeyboardOnFocus", args[0]);
				proxy.onPropertyChanged("softKeyboardOnFocus", args[0]);
				return Undefined.instance;
			case Id_getTransform:
				return proxy.getProperty("transform");
			case Id_setTransform:
				proxy.setProperty("transform", args[0]);
				proxy.onPropertyChanged("transform", args[0]);
				return Undefined.instance;
			case Id_addClass:
				 addClass(cx, thisObj, args);
				return Undefined.instance;
			case Id_updateLayout:
				 updateLayout(cx, thisObj, args);
				return Undefined.instance;
			case Id_startLayout:
				 startLayout(cx, thisObj, args);
				return Undefined.instance;
			case Id_animate:
				 animate(cx, thisObj, args);
				return Undefined.instance;
			case Id_remove:
				 remove(cx, thisObj, args);
				return Undefined.instance;
			case Id_getChildren:
				return getChildren(cx, thisObj, args);
				
			case Id_show:
				 show(cx, thisObj, args);
				return Undefined.instance;
			case Id_blur:
				 blur(cx, thisObj, args);
				return Undefined.instance;
			case Id_add:
				 add(cx, thisObj, args);
				return Undefined.instance;
			case Id_removeAllChildren:
				 removeAllChildren(cx, thisObj, args);
				return Undefined.instance;
			case Id_getHeight:
				return getHeight(cx, thisObj, args);
				
			case Id_hide:
				 hide(cx, thisObj, args);
				return Undefined.instance;
			case Id_toImage:
				return toImage(cx, thisObj, args);
				
			case Id_focus:
				 focus(cx, thisObj, args);
				return Undefined.instance;
			case Id_getWidth:
				return getWidth(cx, thisObj, args);
				
			case Id_setWidth:
				 setWidth(cx, thisObj, args);
				return Undefined.instance;
			case Id_getSize:
				return getSize(cx, thisObj, args);
				
			case Id_getRect:
				return getRect(cx, thisObj, args);
				
			case Id_getCenter:
				return getCenter(cx, thisObj, args);
				
			case Id_getKeepScreenOn:
				return getKeepScreenOn(cx, thisObj, args);
				
			case Id_setKeepScreenOn:
				 setKeepScreenOn(cx, thisObj, args);
				return Undefined.instance;
			case Id_getParent:
				return getParent(cx, thisObj, args);
				
			case Id_finishLayout:
				 finishLayout(cx, thisObj, args);
				return Undefined.instance;
			case Id_convertPointToView:
				return convertPointToView(cx, thisObj, args);
				
			case Id_setHeight:
				 setHeight(cx, thisObj, args);
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

		Id_center = 1
		,		
		Id_height = 2
		,		
		Id_width = 3
		,		
		Id_parent = 4
		,		
		Id_children = 5
		,		
		Id_keepScreenOn = 6
		,		
		Id_rect = 7
		,		
		Id_size = 8
		;

	// Property accessor IDs
	private static final int

		Id_backgroundImage = 9
		,		
		Id_backgroundRepeat = 10
		,		
		Id_backgroundSelectedImage = 11
		,		
		Id_backgroundFocusedImage = 12
		,		
		Id_backgroundDisabledImage = 13
		,		
		Id_backgroundColor = 14
		,		
		Id_backgroundSelectedColor = 15
		,		
		Id_backgroundFocusedColor = 16
		,		
		Id_backgroundDisabledColor = 17
		,		
		Id_backgroundPadding = 18
		,		
		Id_backgroundGradient = 19
		,		
		Id_borderColor = 20
		,		
		Id_borderRadius = 21
		,		
		Id_borderWidth = 22
		,		
		Id_left = 23
		,		
		Id_top = 24
		,		
		Id_right = 25
		,		
		Id_bottom = 26
		,		
		Id_layout = 27
		,		
		Id_zIndex = 28
		,		
		Id_accessibilityHint = 29
		,		
		Id_accessibilityLabel = 30
		,		
		Id_accessibilityValue = 31
		,		
		Id_accessibilityHidden = 32
		,		
		Id_focusable = 33
		,		
		Id_touchEnabled = 34
		,		
		Id_visible = 35
		,		
		Id_enabled = 36
		,		
		Id_opacity = 37
		,		
		Id_softKeyboardOnFocus = 38
		,		
		Id_transform = 39
		;

;

	public static final int MAX_INSTANCE_ID = 39;

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
            case 3: X="top";id=Id_top; break L;
            case 4: c=s.charAt(0);
                if (c=='l') { X="left";id=Id_left; }
                else if (c=='r') { X="rect";id=Id_rect; }
                else if (c=='s') { X="size";id=Id_size; }
                break L;
            case 5: c=s.charAt(0);
                if (c=='r') { X="right";id=Id_right; }
                else if (c=='w') { X="width";id=Id_width; }
                break L;
            case 6: switch (s.charAt(0)) {
                case 'b': X="bottom";id=Id_bottom; break L;
                case 'c': X="center";id=Id_center; break L;
                case 'h': X="height";id=Id_height; break L;
                case 'l': X="layout";id=Id_layout; break L;
                case 'p': X="parent";id=Id_parent; break L;
                case 'z': X="zIndex";id=Id_zIndex; break L;
                } break L;
            case 7: c=s.charAt(0);
                if (c=='e') { X="enabled";id=Id_enabled; }
                else if (c=='o') { X="opacity";id=Id_opacity; }
                else if (c=='v') { X="visible";id=Id_visible; }
                break L;
            case 8: X="children";id=Id_children; break L;
            case 9: c=s.charAt(0);
                if (c=='f') { X="focusable";id=Id_focusable; }
                else if (c=='t') { X="transform";id=Id_transform; }
                break L;
            case 11: c=s.charAt(6);
                if (c=='C') { X="borderColor";id=Id_borderColor; }
                else if (c=='W') { X="borderWidth";id=Id_borderWidth; }
                break L;
            case 12: c=s.charAt(0);
                if (c=='b') { X="borderRadius";id=Id_borderRadius; }
                else if (c=='k') { X="keepScreenOn";id=Id_keepScreenOn; }
                else if (c=='t') { X="touchEnabled";id=Id_touchEnabled; }
                break L;
            case 15: c=s.charAt(10);
                if (c=='C') { X="backgroundColor";id=Id_backgroundColor; }
                else if (c=='I') { X="backgroundImage";id=Id_backgroundImage; }
                break L;
            case 16: X="backgroundRepeat";id=Id_backgroundRepeat; break L;
            case 17: c=s.charAt(0);
                if (c=='a') { X="accessibilityHint";id=Id_accessibilityHint; }
                else if (c=='b') { X="backgroundPadding";id=Id_backgroundPadding; }
                break L;
            case 18: c=s.charAt(13);
                if (c=='L') { X="accessibilityLabel";id=Id_accessibilityLabel; }
                else if (c=='V') { X="accessibilityValue";id=Id_accessibilityValue; }
                else if (c=='d') { X="backgroundGradient";id=Id_backgroundGradient; }
                break L;
            case 19: c=s.charAt(0);
                if (c=='a') { X="accessibilityHidden";id=Id_accessibilityHidden; }
                else if (c=='s') { X="softKeyboardOnFocus";id=Id_softKeyboardOnFocus; }
                break L;
            case 22: c=s.charAt(17);
                if (c=='C') { X="backgroundFocusedColor";id=Id_backgroundFocusedColor; }
                else if (c=='I') { X="backgroundFocusedImage";id=Id_backgroundFocusedImage; }
                break L;
            case 23: c=s.charAt(10);
                if (c=='D') {
                    c=s.charAt(22);
                    if (c=='e') { X="backgroundDisabledImage";id=Id_backgroundDisabledImage; }
                    else if (c=='r') { X="backgroundDisabledColor";id=Id_backgroundDisabledColor; }
                }
                else if (c=='S') {
                    c=s.charAt(22);
                    if (c=='e') { X="backgroundSelectedImage";id=Id_backgroundSelectedImage; }
                    else if (c=='r') { X="backgroundSelectedColor";id=Id_backgroundSelectedColor; }
                }
                break L;
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
			case Id_center:
				return "center"; 
			case Id_height:
				return "height"; 
			case Id_width:
				return "width"; 
			case Id_parent:
				return "parent"; 
			case Id_children:
				return "children"; 
			case Id_keepScreenOn:
				return "keepScreenOn"; 
			case Id_rect:
				return "rect"; 
			case Id_size:
				return "size"; 
			case Id_backgroundImage:
				return "backgroundImage";
			case Id_backgroundRepeat:
				return "backgroundRepeat";
			case Id_backgroundSelectedImage:
				return "backgroundSelectedImage";
			case Id_backgroundFocusedImage:
				return "backgroundFocusedImage";
			case Id_backgroundDisabledImage:
				return "backgroundDisabledImage";
			case Id_backgroundColor:
				return "backgroundColor";
			case Id_backgroundSelectedColor:
				return "backgroundSelectedColor";
			case Id_backgroundFocusedColor:
				return "backgroundFocusedColor";
			case Id_backgroundDisabledColor:
				return "backgroundDisabledColor";
			case Id_backgroundPadding:
				return "backgroundPadding";
			case Id_backgroundGradient:
				return "backgroundGradient";
			case Id_borderColor:
				return "borderColor";
			case Id_borderRadius:
				return "borderRadius";
			case Id_borderWidth:
				return "borderWidth";
			case Id_left:
				return "left";
			case Id_top:
				return "top";
			case Id_right:
				return "right";
			case Id_bottom:
				return "bottom";
			case Id_layout:
				return "layout";
			case Id_zIndex:
				return "zIndex";
			case Id_accessibilityHint:
				return "accessibilityHint";
			case Id_accessibilityLabel:
				return "accessibilityLabel";
			case Id_accessibilityValue:
				return "accessibilityValue";
			case Id_accessibilityHidden:
				return "accessibilityHidden";
			case Id_focusable:
				return "focusable";
			case Id_touchEnabled:
				return "touchEnabled";
			case Id_visible:
				return "visible";
			case Id_enabled:
				return "enabled";
			case Id_opacity:
				return "opacity";
			case Id_softKeyboardOnFocus:
				return "softKeyboardOnFocus";
			case Id_transform:
				return "transform";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TiViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof TiViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TiViewProxyPrototype) {
			proxy = (TiViewProxyPrototype) start;
		}

		switch (id) {
			case Id_center:
				return proxy.getter_center();
			case Id_height:
				return proxy.getter_height();
			case Id_width:
				return proxy.getter_width();
			case Id_parent:
				return proxy.getter_parent();
			case Id_children:
				return proxy.getter_children();
			case Id_keepScreenOn:
				return proxy.getter_keepScreenOn();
			case Id_rect:
				return proxy.getter_rect();
			case Id_size:
				return proxy.getter_size();
			case Id_backgroundImage:
				return proxy.getProperty("backgroundImage");
			case Id_backgroundRepeat:
				return proxy.getProperty("backgroundRepeat");
			case Id_backgroundSelectedImage:
				return proxy.getProperty("backgroundSelectedImage");
			case Id_backgroundFocusedImage:
				return proxy.getProperty("backgroundFocusedImage");
			case Id_backgroundDisabledImage:
				return proxy.getProperty("backgroundDisabledImage");
			case Id_backgroundColor:
				return proxy.getProperty("backgroundColor");
			case Id_backgroundSelectedColor:
				return proxy.getProperty("backgroundSelectedColor");
			case Id_backgroundFocusedColor:
				return proxy.getProperty("backgroundFocusedColor");
			case Id_backgroundDisabledColor:
				return proxy.getProperty("backgroundDisabledColor");
			case Id_backgroundPadding:
				return proxy.getProperty("backgroundPadding");
			case Id_backgroundGradient:
				return proxy.getProperty("backgroundGradient");
			case Id_borderColor:
				return proxy.getProperty("borderColor");
			case Id_borderRadius:
				return proxy.getProperty("borderRadius");
			case Id_borderWidth:
				return proxy.getProperty("borderWidth");
			case Id_left:
				return proxy.getProperty("left");
			case Id_top:
				return proxy.getProperty("top");
			case Id_right:
				return proxy.getProperty("right");
			case Id_bottom:
				return proxy.getProperty("bottom");
			case Id_layout:
				return proxy.getProperty("layout");
			case Id_zIndex:
				return proxy.getProperty("zIndex");
			case Id_accessibilityHint:
				return proxy.getProperty("accessibilityHint");
			case Id_accessibilityLabel:
				return proxy.getProperty("accessibilityLabel");
			case Id_accessibilityValue:
				return proxy.getProperty("accessibilityValue");
			case Id_accessibilityHidden:
				return proxy.getProperty("accessibilityHidden");
			case Id_focusable:
				return proxy.getProperty("focusable");
			case Id_touchEnabled:
				return proxy.getProperty("touchEnabled");
			case Id_visible:
				return proxy.getProperty("visible");
			case Id_enabled:
				return proxy.getProperty("enabled");
			case Id_opacity:
				return proxy.getProperty("opacity");
			case Id_softKeyboardOnFocus:
				return proxy.getProperty("softKeyboardOnFocus");
			case Id_transform:
				return proxy.getProperty("transform");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		TiViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof TiViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TiViewProxyPrototype) {
			proxy = (TiViewProxyPrototype) start;
		}

		switch (id) {
			case Id_center:
				proxy.setProperty("center", value);
				proxy.onPropertyChanged("center", value);
				break; 
			case Id_height:
				proxy.setter_height(value);
				break; 
			case Id_width:
				proxy.setter_width(value);
				break; 
			case Id_parent:
				proxy.setProperty("parent", value);
				proxy.onPropertyChanged("parent", value);
				break; 
			case Id_children:
				proxy.setProperty("children", value);
				proxy.onPropertyChanged("children", value);
				break; 
			case Id_keepScreenOn:
				proxy.setter_keepScreenOn(value);
				break; 
			case Id_rect:
				proxy.setProperty("rect", value);
				proxy.onPropertyChanged("rect", value);
				break; 
			case Id_size:
				proxy.setProperty("size", value);
				proxy.onPropertyChanged("size", value);
				break; 
			case Id_backgroundImage:
				proxy.setProperty("backgroundImage", value);
				proxy.onPropertyChanged("backgroundImage", value);
				break;
			case Id_backgroundRepeat:
				proxy.setProperty("backgroundRepeat", value);
				proxy.onPropertyChanged("backgroundRepeat", value);
				break;
			case Id_backgroundSelectedImage:
				proxy.setProperty("backgroundSelectedImage", value);
				proxy.onPropertyChanged("backgroundSelectedImage", value);
				break;
			case Id_backgroundFocusedImage:
				proxy.setProperty("backgroundFocusedImage", value);
				proxy.onPropertyChanged("backgroundFocusedImage", value);
				break;
			case Id_backgroundDisabledImage:
				proxy.setProperty("backgroundDisabledImage", value);
				proxy.onPropertyChanged("backgroundDisabledImage", value);
				break;
			case Id_backgroundColor:
				proxy.setProperty("backgroundColor", value);
				proxy.onPropertyChanged("backgroundColor", value);
				break;
			case Id_backgroundSelectedColor:
				proxy.setProperty("backgroundSelectedColor", value);
				proxy.onPropertyChanged("backgroundSelectedColor", value);
				break;
			case Id_backgroundFocusedColor:
				proxy.setProperty("backgroundFocusedColor", value);
				proxy.onPropertyChanged("backgroundFocusedColor", value);
				break;
			case Id_backgroundDisabledColor:
				proxy.setProperty("backgroundDisabledColor", value);
				proxy.onPropertyChanged("backgroundDisabledColor", value);
				break;
			case Id_backgroundPadding:
				proxy.setProperty("backgroundPadding", value);
				proxy.onPropertyChanged("backgroundPadding", value);
				break;
			case Id_backgroundGradient:
				proxy.setProperty("backgroundGradient", value);
				proxy.onPropertyChanged("backgroundGradient", value);
				break;
			case Id_borderColor:
				proxy.setProperty("borderColor", value);
				proxy.onPropertyChanged("borderColor", value);
				break;
			case Id_borderRadius:
				proxy.setProperty("borderRadius", value);
				proxy.onPropertyChanged("borderRadius", value);
				break;
			case Id_borderWidth:
				proxy.setProperty("borderWidth", value);
				proxy.onPropertyChanged("borderWidth", value);
				break;
			case Id_left:
				proxy.setProperty("left", value);
				proxy.onPropertyChanged("left", value);
				break;
			case Id_top:
				proxy.setProperty("top", value);
				proxy.onPropertyChanged("top", value);
				break;
			case Id_right:
				proxy.setProperty("right", value);
				proxy.onPropertyChanged("right", value);
				break;
			case Id_bottom:
				proxy.setProperty("bottom", value);
				proxy.onPropertyChanged("bottom", value);
				break;
			case Id_layout:
				proxy.setProperty("layout", value);
				proxy.onPropertyChanged("layout", value);
				break;
			case Id_zIndex:
				proxy.setProperty("zIndex", value);
				proxy.onPropertyChanged("zIndex", value);
				break;
			case Id_accessibilityHint:
				proxy.setProperty("accessibilityHint", value);
				proxy.onPropertyChanged("accessibilityHint", value);
				break;
			case Id_accessibilityLabel:
				proxy.setProperty("accessibilityLabel", value);
				proxy.onPropertyChanged("accessibilityLabel", value);
				break;
			case Id_accessibilityValue:
				proxy.setProperty("accessibilityValue", value);
				proxy.onPropertyChanged("accessibilityValue", value);
				break;
			case Id_accessibilityHidden:
				proxy.setProperty("accessibilityHidden", value);
				proxy.onPropertyChanged("accessibilityHidden", value);
				break;
			case Id_focusable:
				proxy.setProperty("focusable", value);
				proxy.onPropertyChanged("focusable", value);
				break;
			case Id_touchEnabled:
				proxy.setProperty("touchEnabled", value);
				proxy.onPropertyChanged("touchEnabled", value);
				break;
			case Id_visible:
				proxy.setProperty("visible", value);
				proxy.onPropertyChanged("visible", value);
				break;
			case Id_enabled:
				proxy.setProperty("enabled", value);
				proxy.onPropertyChanged("enabled", value);
				break;
			case Id_opacity:
				proxy.setProperty("opacity", value);
				proxy.onPropertyChanged("opacity", value);
				break;
			case Id_softKeyboardOnFocus:
				proxy.setProperty("softKeyboardOnFocus", value);
				proxy.onPropertyChanged("softKeyboardOnFocus", value);
				break;
			case Id_transform:
				proxy.setProperty("transform", value);
				proxy.onPropertyChanged("transform", value);
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
