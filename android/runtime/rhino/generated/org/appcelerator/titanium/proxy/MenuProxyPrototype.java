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

import org.appcelerator.titanium.proxy.MenuProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class MenuProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 1231239396145571499L;

	private static final String TAG = "MenuProxyPrototype";
	private static final String CLASS_TAG = "MenuProxy";
	private static MenuProxyPrototype menuProxyPrototype;


	public static MenuProxyPrototype getProxyPrototype()
	{
		return menuProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		menuProxyPrototype = null;
	}

	public MenuProxyPrototype()
	{
		if (menuProxyPrototype == null && getClass().equals(MenuProxyPrototype.class)) {
			menuProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == menuProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return menuProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(MenuProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void setGroupCheckable(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setGroupCheckable()", Log.DEBUG_MODE);

		try {
		MenuProxy proxy = (MenuProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("setGroupCheckable: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		if (!(args[1] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg1;
		arg1 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[1], thisObj) ;
		if (!(args[2] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[2];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg2;
		arg2 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[2], thisObj) ;

		proxy.setGroupCheckable(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setGroupEnabled(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setGroupEnabled()", Log.DEBUG_MODE);

		try {
		MenuProxy proxy = (MenuProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setGroupEnabled: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		if (!(args[1] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg1;
		arg1 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[1], thisObj) ;

		proxy.setGroupEnabled(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void removeItem(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeItem()", Log.DEBUG_MODE);

		try {
		MenuProxy proxy = (MenuProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removeItem: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.removeItem(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void removeGroup(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeGroup()", Log.DEBUG_MODE);

		try {
		MenuProxy proxy = (MenuProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removeGroup: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.removeGroup(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object add(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "add()", Log.DEBUG_MODE);

		try {
		MenuProxy proxy = (MenuProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("add: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		org.appcelerator.titanium.proxy.MenuItemProxy javaResult = proxy.add(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object size(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "size()", Log.DEBUG_MODE);

		try {
		MenuProxy proxy = (MenuProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.size();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void close(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "close()", Log.DEBUG_MODE);

		try {
		MenuProxy proxy = (MenuProxy) ((Proxy) thisObj).getProxy();

		proxy.close();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void clear(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "clear()", Log.DEBUG_MODE);

		try {
		MenuProxy proxy = (MenuProxy) ((Proxy) thisObj).getProxy();

		proxy.clear();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object hasVisibleItems(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "hasVisibleItems()", Log.DEBUG_MODE);

		try {
		MenuProxy proxy = (MenuProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.hasVisibleItems();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getItem(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getItem()", Log.DEBUG_MODE);

		try {
		MenuProxy proxy = (MenuProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getItem: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		org.appcelerator.titanium.proxy.MenuItemProxy javaResult = proxy.getItem(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getItems(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getItems()", Log.DEBUG_MODE);

		try {
		MenuProxy proxy = (MenuProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.proxy.MenuItemProxy[] javaResult = proxy.getItems();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object findItem(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "findItem()", Log.DEBUG_MODE);

		try {
		MenuProxy proxy = (MenuProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("findItem: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		org.appcelerator.titanium.proxy.MenuItemProxy javaResult = proxy.findItem(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setGroupVisible(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setGroupVisible()", Log.DEBUG_MODE);

		try {
		MenuProxy proxy = (MenuProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setGroupVisible: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		if (!(args[1] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg1;
		arg1 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[1], thisObj) ;

		proxy.setGroupVisible(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Object getter_items()
	{
		Log.d(TAG, "get items", Log.DEBUG_MODE);
		MenuProxy proxy = (MenuProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.proxy.MenuItemProxy[] javaResult = proxy.getItems();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_setGroupCheckable = 2,
		Id_setGroupEnabled = 3,
		Id_removeItem = 4,
		Id_removeGroup = 5,
		Id_add = 6,
		Id_size = 7,
		Id_close = 8,
		Id_clear = 9,
		Id_hasVisibleItems = 10,
		Id_getItem = 11,
		Id_getItems = 12,
		Id_findItem = 13,
		Id_setGroupVisible = 14
;
		

	public static final int MAX_PROTOTYPE_ID = 14;

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
            case 4: X="size";id=Id_size; break L;
            case 5: c=s.charAt(2);
                if (c=='e') { X="clear";id=Id_clear; }
                else if (c=='o') { X="close";id=Id_close; }
                break L;
            case 7: X="getItem";id=Id_getItem; break L;
            case 8: c=s.charAt(0);
                if (c=='f') { X="findItem";id=Id_findItem; }
                else if (c=='g') { X="getItems";id=Id_getItems; }
                break L;
            case 10: X="removeItem";id=Id_removeItem; break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='r') { X="removeGroup";id=Id_removeGroup; }
                break L;
            case 15: c=s.charAt(8);
                if (c=='E') { X="setGroupEnabled";id=Id_setGroupEnabled; }
                else if (c=='V') { X="setGroupVisible";id=Id_setGroupVisible; }
                else if (c=='l') { X="hasVisibleItems";id=Id_hasVisibleItems; }
                break L;
            case 17: X="setGroupCheckable";id=Id_setGroupCheckable; break L;
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
			case Id_setGroupCheckable:
				arity = 3;
				name = "setGroupCheckable";
				break;
			case Id_setGroupEnabled:
				arity = 2;
				name = "setGroupEnabled";
				break;
			case Id_removeItem:
				arity = 1;
				name = "removeItem";
				break;
			case Id_removeGroup:
				arity = 1;
				name = "removeGroup";
				break;
			case Id_add:
				arity = 1;
				name = "add";
				break;
			case Id_size:
				arity = 0;
				name = "size";
				break;
			case Id_close:
				arity = 0;
				name = "close";
				break;
			case Id_clear:
				arity = 0;
				name = "clear";
				break;
			case Id_hasVisibleItems:
				arity = 0;
				name = "hasVisibleItems";
				break;
			case Id_getItem:
				arity = 1;
				name = "getItem";
				break;
			case Id_getItems:
				arity = 0;
				name = "getItems";
				break;
			case Id_findItem:
				arity = 1;
				name = "findItem";
				break;
			case Id_setGroupVisible:
				arity = 2;
				name = "setGroupVisible";
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

		while (thisObj != null && !(thisObj instanceof MenuProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		MenuProxyPrototype proxy = (MenuProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_setGroupCheckable:
				 setGroupCheckable(cx, thisObj, args);
				return Undefined.instance;
			case Id_setGroupEnabled:
				 setGroupEnabled(cx, thisObj, args);
				return Undefined.instance;
			case Id_removeItem:
				 removeItem(cx, thisObj, args);
				return Undefined.instance;
			case Id_removeGroup:
				 removeGroup(cx, thisObj, args);
				return Undefined.instance;
			case Id_add:
				return add(cx, thisObj, args);
				
			case Id_size:
				return size(cx, thisObj, args);
				
			case Id_close:
				 close(cx, thisObj, args);
				return Undefined.instance;
			case Id_clear:
				 clear(cx, thisObj, args);
				return Undefined.instance;
			case Id_hasVisibleItems:
				return hasVisibleItems(cx, thisObj, args);
				
			case Id_getItem:
				return getItem(cx, thisObj, args);
				
			case Id_getItems:
				return getItems(cx, thisObj, args);
				
			case Id_findItem:
				return findItem(cx, thisObj, args);
				
			case Id_setGroupVisible:
				 setGroupVisible(cx, thisObj, args);
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

		Id_items = 1
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
// #generated# Last update: 2013-01-31 18:21:22 PST
        L0: { id = 0; String X = null;
            if (s.length()==5) { X="items";id=Id_items; }
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
			case Id_items:
				return "items"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		MenuProxyPrototype proxy = this;
		while (start != null && !(start instanceof MenuProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof MenuProxyPrototype) {
			proxy = (MenuProxyPrototype) start;
		}

		switch (id) {
			case Id_items:
				return proxy.getter_items();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		MenuProxyPrototype proxy = this;
		while (start != null && !(start instanceof MenuProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof MenuProxyPrototype) {
			proxy = (MenuProxyPrototype) start;
		}

		switch (id) {
			case Id_items:
				proxy.setProperty("items", value);
				proxy.onPropertyChanged("items", value);
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
