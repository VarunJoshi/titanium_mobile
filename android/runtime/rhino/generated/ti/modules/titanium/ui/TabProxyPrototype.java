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

import ti.modules.titanium.ui.TabProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class TabProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = -4508232344841947044L;

	private static final String TAG = "TabProxyPrototype";
	private static final String CLASS_TAG = "TabProxy";
	private static TabProxyPrototype tabProxyPrototype;


	public static TabProxyPrototype getProxyPrototype()
	{
		return tabProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		tabProxyPrototype = null;
	}

	public TabProxyPrototype()
	{
		if (tabProxyPrototype == null && getClass().equals(TabProxyPrototype.class)) {
			tabProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == tabProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return tabProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TabProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void setWindow(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setWindow()", Log.DEBUG_MODE);

		try {
		TabProxy proxy = (TabProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setWindow: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.TiWindowProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.TiWindowProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setWindow(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getActive(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getActive()", Log.DEBUG_MODE);

		try {
		TabProxy proxy = (TabProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getActive();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setActive(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setActive()", Log.DEBUG_MODE);

		try {
		TabProxy proxy = (TabProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setActive: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		proxy.setActive(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getTabGroup(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTabGroup()", Log.DEBUG_MODE);

		try {
		TabProxy proxy = (TabProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.ui.TabGroupProxy javaResult = proxy.getTabGroup();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Boolean getter_active()
	{
		Log.d(TAG, "get active", Log.DEBUG_MODE);
		TabProxy proxy = (TabProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getActive();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_active(Object value)
	{
		Log.d(TAG, "set active", Log.DEBUG_MODE);
		TabProxy proxy = (TabProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setActive(arg0);
		//proxy.setProperty("active", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Proxy getter_tabGroup()
	{
		Log.d(TAG, "get tabGroup", Log.DEBUG_MODE);
		TabProxy proxy = (TabProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.ui.TabGroupProxy javaResult = proxy.getTabGroup();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getTitle = 2,
		Id_setTitle = 3,
		Id_getTitleid = 4,
		Id_setTitleid = 5,
		Id_getIcon = 6,
		Id_setIcon = 7,
		// Method IDs
		Id_setWindow = 8,
		Id_getActive = 9,
		Id_setActive = 10,
		Id_getTabGroup = 11
;
		

	public static final int MAX_PROTOTYPE_ID = 11;

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
            case 7: c=s.charAt(0);
                if (c=='g') { X="getIcon";id=Id_getIcon; }
                else if (c=='s') { X="setIcon";id=Id_setIcon; }
                break L;
            case 8: c=s.charAt(0);
                if (c=='g') { X="getTitle";id=Id_getTitle; }
                else if (c=='s') { X="setTitle";id=Id_setTitle; }
                break L;
            case 9: c=s.charAt(0);
                if (c=='g') { X="getActive";id=Id_getActive; }
                else if (c=='s') {
                    c=s.charAt(8);
                    if (c=='e') { X="setActive";id=Id_setActive; }
                    else if (c=='w') { X="setWindow";id=Id_setWindow; }
                }
                break L;
            case 10: c=s.charAt(0);
                if (c=='g') { X="getTitleid";id=Id_getTitleid; }
                else if (c=='s') { X="setTitleid";id=Id_setTitleid; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') { X="getTabGroup";id=Id_getTabGroup; }
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
			case Id_getIcon:
				arity = 0;
				name = "getIcon";
				break;
			case Id_setIcon:
				arity = 1;
				name = "setIcon";
				break;
			case Id_setWindow:
				arity = 1;
				name = "setWindow";
				break;
			case Id_getActive:
				arity = 0;
				name = "getActive";
				break;
			case Id_setActive:
				arity = 1;
				name = "setActive";
				break;
			case Id_getTabGroup:
				arity = 0;
				name = "getTabGroup";
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

		while (thisObj != null && !(thisObj instanceof TabProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TabProxyPrototype proxy = (TabProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
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
			case Id_getIcon:
				return proxy.getProperty("icon");
			case Id_setIcon:
				proxy.setProperty("icon", args[0]);
				proxy.onPropertyChanged("icon", args[0]);
				return Undefined.instance;
			case Id_setWindow:
				 setWindow(cx, thisObj, args);
				return Undefined.instance;
			case Id_getActive:
				return getActive(cx, thisObj, args);
				
			case Id_setActive:
				 setActive(cx, thisObj, args);
				return Undefined.instance;
			case Id_getTabGroup:
				return getTabGroup(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_active = 1
		,		
		Id_tabGroup = 2
		;

	// Property accessor IDs
	private static final int

		Id_title = 3
		,		
		Id_titleid = 4
		,		
		Id_icon = 5
		;

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
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null;
            L: switch (s.length()) {
            case 4: X="icon";id=Id_icon; break L;
            case 5: X="title";id=Id_title; break L;
            case 6: X="active";id=Id_active; break L;
            case 7: X="titleid";id=Id_titleid; break L;
            case 8: X="tabGroup";id=Id_tabGroup; break L;
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
			case Id_active:
				return "active"; 
			case Id_tabGroup:
				return "tabGroup"; 
			case Id_title:
				return "title";
			case Id_titleid:
				return "titleid";
			case Id_icon:
				return "icon";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TabProxyPrototype proxy = this;
		while (start != null && !(start instanceof TabProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TabProxyPrototype) {
			proxy = (TabProxyPrototype) start;
		}

		switch (id) {
			case Id_active:
				return proxy.getter_active();
			case Id_tabGroup:
				return proxy.getter_tabGroup();
			case Id_title:
				return proxy.getProperty("title");
			case Id_titleid:
				return proxy.getProperty("titleid");
			case Id_icon:
				return proxy.getProperty("icon");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		TabProxyPrototype proxy = this;
		while (start != null && !(start instanceof TabProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TabProxyPrototype) {
			proxy = (TabProxyPrototype) start;
		}

		switch (id) {
			case Id_active:
				proxy.setter_active(value);
				break; 
			case Id_tabGroup:
				proxy.setProperty("tabGroup", value);
				proxy.onPropertyChanged("tabGroup", value);
				break; 
			case Id_title:
				proxy.setProperty("title", value);
				proxy.onPropertyChanged("title", value);
				break;
			case Id_titleid:
				proxy.setProperty("titleid", value);
				proxy.onPropertyChanged("titleid", value);
				break;
			case Id_icon:
				proxy.setProperty("icon", value);
				proxy.onPropertyChanged("icon", value);
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
