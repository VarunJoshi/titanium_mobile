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

import org.appcelerator.titanium.proxy.MenuItemProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class MenuItemProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -2650369565732821059L;

	private static final String TAG = "MenuItemProxyPrototype";
	private static final String CLASS_TAG = "MenuItemProxy";
	private static MenuItemProxyPrototype menuItemProxyPrototype;


	public static MenuItemProxyPrototype getProxyPrototype()
	{
		return menuItemProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		menuItemProxyPrototype = null;
	}

	public MenuItemProxyPrototype()
	{
		if (menuItemProxyPrototype == null && getClass().equals(MenuItemProxyPrototype.class)) {
			menuItemProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == menuItemProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return menuItemProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(MenuItemProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object setCheckable(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setCheckable()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setCheckable: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		org.appcelerator.titanium.proxy.MenuItemProxy javaResult = proxy.setCheckable(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setShowAsAction(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setShowAsAction()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setShowAsAction: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setShowAsAction(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object setVisible(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setVisible()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setVisible: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		org.appcelerator.titanium.proxy.MenuItemProxy javaResult = proxy.setVisible(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object setChecked(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setChecked()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setChecked: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		org.appcelerator.titanium.proxy.MenuItemProxy javaResult = proxy.setChecked(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object hasSubMenu(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "hasSubMenu()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.hasSubMenu();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void expandActionView(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "expandActionView()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();

		proxy.expandActionView();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void collapseActionView(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "collapseActionView()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();

		proxy.collapseActionView();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object isEnabled(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isEnabled()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isEnabled();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getOrder(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getOrder()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getOrder();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getTitleCondensed(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTitleCondensed()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getTitleCondensed();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getItemId(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getItemId()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getItemId();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getGroupId(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getGroupId()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getGroupId();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object setTitleCondensed(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setTitleCondensed()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setTitleCondensed: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		org.appcelerator.titanium.proxy.MenuItemProxy javaResult = proxy.setTitleCondensed(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object isVisible(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isVisible()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isVisible();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object isCheckable(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isCheckable()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isCheckable();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object setTitle(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setTitle()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setTitle: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		org.appcelerator.titanium.proxy.MenuItemProxy javaResult = proxy.setTitle(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object isChecked(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isChecked()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isChecked();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setActionView(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setActionView()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setActionView: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setActionView(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object setEnabled(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setEnabled()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setEnabled: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		org.appcelerator.titanium.proxy.MenuItemProxy javaResult = proxy.setEnabled(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object isActionViewExpanded(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isActionViewExpanded()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isActionViewExpanded();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getTitle(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTitle()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getTitle();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object setIcon(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setIcon()", Log.DEBUG_MODE);

		try {
		MenuItemProxy proxy = (MenuItemProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setIcon: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		org.appcelerator.titanium.proxy.MenuItemProxy javaResult = proxy.setIcon(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public void setter_showAsAction(Object value)
	{
		Log.d(TAG, "set showAsAction", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setShowAsAction(arg0);
		//proxy.setProperty("showAsAction", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_icon(Object value)
	{
		Log.d(TAG, "set icon", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setIcon(arg0);
		//proxy.setProperty("icon", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Boolean getter_enabled()
	{
		Log.d(TAG, "get enabled", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.isEnabled();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_enabled(Object value)
	{
		Log.d(TAG, "set enabled", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setEnabled(arg0);
		//proxy.setProperty("enabled", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Boolean getter_visible()
	{
		Log.d(TAG, "get visible", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.isVisible();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_visible(Object value)
	{
		Log.d(TAG, "set visible", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setVisible(arg0);
		//proxy.setProperty("visible", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Boolean getter_checkable()
	{
		Log.d(TAG, "get checkable", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.isCheckable();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_checkable(Object value)
	{
		Log.d(TAG, "set checkable", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setCheckable(arg0);
		//proxy.setProperty("checkable", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Number getter_itemId()
	{
		Log.d(TAG, "get itemId", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getItemId();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Boolean getter_actionViewExpanded()
	{
		Log.d(TAG, "get actionViewExpanded", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.isActionViewExpanded();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_actionView(Object value)
	{
		Log.d(TAG, "set actionView", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setActionView(arg0);
		//proxy.setProperty("actionView", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_titleCondensed()
	{
		Log.d(TAG, "get titleCondensed", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getTitleCondensed();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_titleCondensed(Object value)
	{
		Log.d(TAG, "set titleCondensed", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setTitleCondensed(arg0);
		//proxy.setProperty("titleCondensed", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Number getter_groupId()
	{
		Log.d(TAG, "get groupId", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getGroupId();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public String getter_title()
	{
		Log.d(TAG, "get title", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getTitle();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_title(Object value)
	{
		Log.d(TAG, "set title", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setTitle(arg0);
		//proxy.setProperty("title", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Number getter_order()
	{
		Log.d(TAG, "get order", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getOrder();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Boolean getter_checked()
	{
		Log.d(TAG, "get checked", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.isChecked();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_checked(Object value)
	{
		Log.d(TAG, "set checked", Log.DEBUG_MODE);
		MenuItemProxy proxy = (MenuItemProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setChecked(arg0);
		//proxy.setProperty("checked", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_setCheckable = 2,
		Id_setShowAsAction = 3,
		Id_setVisible = 4,
		Id_setChecked = 5,
		Id_hasSubMenu = 6,
		Id_expandActionView = 7,
		Id_collapseActionView = 8,
		Id_isEnabled = 9,
		Id_getOrder = 10,
		Id_getTitleCondensed = 11,
		Id_getItemId = 12,
		Id_getGroupId = 13,
		Id_setTitleCondensed = 14,
		Id_isVisible = 15,
		Id_isCheckable = 16,
		Id_setTitle = 17,
		Id_isChecked = 18,
		Id_setActionView = 19,
		Id_setEnabled = 20,
		Id_isActionViewExpanded = 21,
		Id_getTitle = 22,
		Id_setIcon = 23
;
		

	public static final int MAX_PROTOTYPE_ID = 23;

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
            case 7: X="setIcon";id=Id_setIcon; break L;
            case 8: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(7);
                    if (c=='e') { X="getTitle";id=Id_getTitle; }
                    else if (c=='r') { X="getOrder";id=Id_getOrder; }
                }
                else if (c=='s') { X="setTitle";id=Id_setTitle; }
                break L;
            case 9: switch (s.charAt(2)) {
                case 'C': X="isChecked";id=Id_isChecked; break L;
                case 'E': X="isEnabled";id=Id_isEnabled; break L;
                case 'V': X="isVisible";id=Id_isVisible; break L;
                case 't': X="getItemId";id=Id_getItemId; break L;
                } break L;
            case 10: switch (s.charAt(3)) {
                case 'C': X="setChecked";id=Id_setChecked; break L;
                case 'E': X="setEnabled";id=Id_setEnabled; break L;
                case 'G': X="getGroupId";id=Id_getGroupId; break L;
                case 'S': X="hasSubMenu";id=Id_hasSubMenu; break L;
                case 'V': X="setVisible";id=Id_setVisible; break L;
                } break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='i') { X="isCheckable";id=Id_isCheckable; }
                break L;
            case 12: X="setCheckable";id=Id_setCheckable; break L;
            case 13: X="setActionView";id=Id_setActionView; break L;
            case 15: X="setShowAsAction";id=Id_setShowAsAction; break L;
            case 16: X="expandActionView";id=Id_expandActionView; break L;
            case 17: c=s.charAt(0);
                if (c=='g') { X="getTitleCondensed";id=Id_getTitleCondensed; }
                else if (c=='s') { X="setTitleCondensed";id=Id_setTitleCondensed; }
                break L;
            case 18: X="collapseActionView";id=Id_collapseActionView; break L;
            case 20: X="isActionViewExpanded";id=Id_isActionViewExpanded; break L;
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
			case Id_setCheckable:
				arity = 1;
				name = "setCheckable";
				break;
			case Id_setShowAsAction:
				arity = 1;
				name = "setShowAsAction";
				break;
			case Id_setVisible:
				arity = 1;
				name = "setVisible";
				break;
			case Id_setChecked:
				arity = 1;
				name = "setChecked";
				break;
			case Id_hasSubMenu:
				arity = 0;
				name = "hasSubMenu";
				break;
			case Id_expandActionView:
				arity = 0;
				name = "expandActionView";
				break;
			case Id_collapseActionView:
				arity = 0;
				name = "collapseActionView";
				break;
			case Id_isEnabled:
				arity = 0;
				name = "isEnabled";
				break;
			case Id_getOrder:
				arity = 0;
				name = "getOrder";
				break;
			case Id_getTitleCondensed:
				arity = 0;
				name = "getTitleCondensed";
				break;
			case Id_getItemId:
				arity = 0;
				name = "getItemId";
				break;
			case Id_getGroupId:
				arity = 0;
				name = "getGroupId";
				break;
			case Id_setTitleCondensed:
				arity = 1;
				name = "setTitleCondensed";
				break;
			case Id_isVisible:
				arity = 0;
				name = "isVisible";
				break;
			case Id_isCheckable:
				arity = 0;
				name = "isCheckable";
				break;
			case Id_setTitle:
				arity = 1;
				name = "setTitle";
				break;
			case Id_isChecked:
				arity = 0;
				name = "isChecked";
				break;
			case Id_setActionView:
				arity = 1;
				name = "setActionView";
				break;
			case Id_setEnabled:
				arity = 1;
				name = "setEnabled";
				break;
			case Id_isActionViewExpanded:
				arity = 0;
				name = "isActionViewExpanded";
				break;
			case Id_getTitle:
				arity = 0;
				name = "getTitle";
				break;
			case Id_setIcon:
				arity = 1;
				name = "setIcon";
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

		while (thisObj != null && !(thisObj instanceof MenuItemProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		MenuItemProxyPrototype proxy = (MenuItemProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_setCheckable:
				return setCheckable(cx, thisObj, args);
				
			case Id_setShowAsAction:
				 setShowAsAction(cx, thisObj, args);
				return Undefined.instance;
			case Id_setVisible:
				return setVisible(cx, thisObj, args);
				
			case Id_setChecked:
				return setChecked(cx, thisObj, args);
				
			case Id_hasSubMenu:
				return hasSubMenu(cx, thisObj, args);
				
			case Id_expandActionView:
				 expandActionView(cx, thisObj, args);
				return Undefined.instance;
			case Id_collapseActionView:
				 collapseActionView(cx, thisObj, args);
				return Undefined.instance;
			case Id_isEnabled:
				return isEnabled(cx, thisObj, args);
				
			case Id_getOrder:
				return getOrder(cx, thisObj, args);
				
			case Id_getTitleCondensed:
				return getTitleCondensed(cx, thisObj, args);
				
			case Id_getItemId:
				return getItemId(cx, thisObj, args);
				
			case Id_getGroupId:
				return getGroupId(cx, thisObj, args);
				
			case Id_setTitleCondensed:
				return setTitleCondensed(cx, thisObj, args);
				
			case Id_isVisible:
				return isVisible(cx, thisObj, args);
				
			case Id_isCheckable:
				return isCheckable(cx, thisObj, args);
				
			case Id_setTitle:
				return setTitle(cx, thisObj, args);
				
			case Id_isChecked:
				return isChecked(cx, thisObj, args);
				
			case Id_setActionView:
				 setActionView(cx, thisObj, args);
				return Undefined.instance;
			case Id_setEnabled:
				return setEnabled(cx, thisObj, args);
				
			case Id_isActionViewExpanded:
				return isActionViewExpanded(cx, thisObj, args);
				
			case Id_getTitle:
				return getTitle(cx, thisObj, args);
				
			case Id_setIcon:
				return setIcon(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_showAsAction = 1
		,		
		Id_icon = 2
		,		
		Id_enabled = 3
		,		
		Id_visible = 4
		,		
		Id_checkable = 5
		,		
		Id_itemId = 6
		,		
		Id_actionViewExpanded = 7
		,		
		Id_actionView = 8
		,		
		Id_titleCondensed = 9
		,		
		Id_groupId = 10
		,		
		Id_title = 11
		,		
		Id_order = 12
		,		
		Id_checked = 13
		;

;

;

	public static final int MAX_INSTANCE_ID = 13;

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
            case 4: X="icon";id=Id_icon; break L;
            case 5: c=s.charAt(0);
                if (c=='o') { X="order";id=Id_order; }
                else if (c=='t') { X="title";id=Id_title; }
                break L;
            case 6: X="itemId";id=Id_itemId; break L;
            case 7: switch (s.charAt(0)) {
                case 'c': X="checked";id=Id_checked; break L;
                case 'e': X="enabled";id=Id_enabled; break L;
                case 'g': X="groupId";id=Id_groupId; break L;
                case 'v': X="visible";id=Id_visible; break L;
                } break L;
            case 9: X="checkable";id=Id_checkable; break L;
            case 10: X="actionView";id=Id_actionView; break L;
            case 12: X="showAsAction";id=Id_showAsAction; break L;
            case 14: X="titleCondensed";id=Id_titleCondensed; break L;
            case 18: X="actionViewExpanded";id=Id_actionViewExpanded; break L;
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
			case Id_showAsAction:
				return "showAsAction"; 
			case Id_icon:
				return "icon"; 
			case Id_enabled:
				return "enabled"; 
			case Id_visible:
				return "visible"; 
			case Id_checkable:
				return "checkable"; 
			case Id_itemId:
				return "itemId"; 
			case Id_actionViewExpanded:
				return "actionViewExpanded"; 
			case Id_actionView:
				return "actionView"; 
			case Id_titleCondensed:
				return "titleCondensed"; 
			case Id_groupId:
				return "groupId"; 
			case Id_title:
				return "title"; 
			case Id_order:
				return "order"; 
			case Id_checked:
				return "checked"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		MenuItemProxyPrototype proxy = this;
		while (start != null && !(start instanceof MenuItemProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof MenuItemProxyPrototype) {
			proxy = (MenuItemProxyPrototype) start;
		}

		switch (id) {
			case Id_showAsAction:
				return proxy.getProperty("showAsAction");
			case Id_icon:
				return proxy.getProperty("icon");
			case Id_enabled:
				return proxy.getter_enabled();
			case Id_visible:
				return proxy.getter_visible();
			case Id_checkable:
				return proxy.getter_checkable();
			case Id_itemId:
				return proxy.getter_itemId();
			case Id_actionViewExpanded:
				return proxy.getter_actionViewExpanded();
			case Id_actionView:
				return proxy.getProperty("actionView");
			case Id_titleCondensed:
				return proxy.getter_titleCondensed();
			case Id_groupId:
				return proxy.getter_groupId();
			case Id_title:
				return proxy.getter_title();
			case Id_order:
				return proxy.getter_order();
			case Id_checked:
				return proxy.getter_checked();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		MenuItemProxyPrototype proxy = this;
		while (start != null && !(start instanceof MenuItemProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof MenuItemProxyPrototype) {
			proxy = (MenuItemProxyPrototype) start;
		}

		switch (id) {
			case Id_showAsAction:
				proxy.setter_showAsAction(value);
				break; 
			case Id_icon:
				proxy.setter_icon(value);
				break; 
			case Id_enabled:
				proxy.setter_enabled(value);
				break; 
			case Id_visible:
				proxy.setter_visible(value);
				break; 
			case Id_checkable:
				proxy.setter_checkable(value);
				break; 
			case Id_itemId:
				proxy.setProperty("itemId", value);
				proxy.onPropertyChanged("itemId", value);
				break; 
			case Id_actionViewExpanded:
				proxy.setProperty("actionViewExpanded", value);
				proxy.onPropertyChanged("actionViewExpanded", value);
				break; 
			case Id_actionView:
				proxy.setter_actionView(value);
				break; 
			case Id_titleCondensed:
				proxy.setter_titleCondensed(value);
				break; 
			case Id_groupId:
				proxy.setProperty("groupId", value);
				proxy.onPropertyChanged("groupId", value);
				break; 
			case Id_title:
				proxy.setter_title(value);
				break; 
			case Id_order:
				proxy.setProperty("order", value);
				proxy.onPropertyChanged("order", value);
				break; 
			case Id_checked:
				proxy.setter_checked(value);
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
