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

import ti.modules.titanium.ui.TabGroupProxy;

import org.appcelerator.titanium.proxy.TiWindowProxyPrototype;


public class TabGroupProxyPrototype extends TiWindowProxyPrototype
{
	private static final long serialVersionUID = 8525507725791603709L;

	private static final String TAG = "TabGroupProxyPrototype";
	private static final String CLASS_TAG = "TabGroupProxy";
	private static TabGroupProxyPrototype tabGroupProxyPrototype;


	public static TabGroupProxyPrototype getProxyPrototype()
	{
		return tabGroupProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		tabGroupProxyPrototype = null;
	}

	public TabGroupProxyPrototype()
	{
		if (tabGroupProxyPrototype == null && getClass().equals(TabGroupProxyPrototype.class)) {
			tabGroupProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == tabGroupProxyPrototype) {
			return TiWindowProxyPrototype.getProxyPrototype();
		}
		return tabGroupProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiWindowProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TabGroupProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void removeTab(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeTab()", Log.DEBUG_MODE);

		try {
		TabGroupProxy proxy = (TabGroupProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removeTab: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.ui.TabProxy arg0;
		arg0 = (ti.modules.titanium.ui.TabProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.removeTab(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getActiveTab(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getActiveTab()", Log.DEBUG_MODE);

		try {
		TabGroupProxy proxy = (TabGroupProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.ui.TabProxy javaResult = proxy.getActiveTab();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setTabs(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setTabs()", Log.DEBUG_MODE);

		try {
		TabGroupProxy proxy = (TabGroupProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setTabs: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setTabs(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void addTab(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addTab()", Log.DEBUG_MODE);

		try {
		TabGroupProxy proxy = (TabGroupProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("addTab: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.ui.TabProxy arg0;
		arg0 = (ti.modules.titanium.ui.TabProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.addTab(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setOrientationModes(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setOrientationModes()", Log.DEBUG_MODE);

		try {
		TabGroupProxy proxy = (TabGroupProxy) ((Proxy) thisObj).getProxy();
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

	public void setActiveTab(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setActiveTab()", Log.DEBUG_MODE);

		try {
		TabGroupProxy proxy = (TabGroupProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setActiveTab: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setActiveTab(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Proxy getter_activeTab()
	{
		Log.d(TAG, "get activeTab", Log.DEBUG_MODE);
		TabGroupProxy proxy = (TabGroupProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.ui.TabProxy javaResult = proxy.getActiveTab();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public void setter_activeTab(Object value)
	{
		Log.d(TAG, "set activeTab", Log.DEBUG_MODE);
		TabGroupProxy proxy = (TabGroupProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setActiveTab(arg0);
		//proxy.setProperty("activeTab", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_orientationModes(Object value)
	{
		Log.d(TAG, "set orientationModes", Log.DEBUG_MODE);
		TabGroupProxy proxy = (TabGroupProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Scriptable) && value != null) {
			String error = "Invalid value, expected type Scriptable, got: " + value;
			Log.e(TAG, error);
		}
		int[] arg0;
		arg0 = (int[]) TypeConverter.jsArrayToJavaIntArray((Scriptable) value, thisObj) ;
		proxy.setOrientationModes(arg0);
		//proxy.setProperty("orientationModes", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getTabsBackgroundColor = 2,
		Id_setTabsBackgroundColor = 3,
		Id_getActiveTabBackgroundColor = 4,
		Id_setActiveTabBackgroundColor = 5,
		// Method IDs
		Id_removeTab = 6,
		Id_getActiveTab = 7,
		Id_setTabs = 8,
		Id_addTab = 9,
		Id_setOrientationModes = 10,
		Id_setActiveTab = 11
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
            case 6: X="addTab";id=Id_addTab; break L;
            case 7: X="setTabs";id=Id_setTabs; break L;
            case 9: X="removeTab";id=Id_removeTab; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: c=s.charAt(0);
                if (c=='g') { X="getActiveTab";id=Id_getActiveTab; }
                else if (c=='s') { X="setActiveTab";id=Id_setActiveTab; }
                break L;
            case 19: X="setOrientationModes";id=Id_setOrientationModes; break L;
            case 22: c=s.charAt(0);
                if (c=='g') { X="getTabsBackgroundColor";id=Id_getTabsBackgroundColor; }
                else if (c=='s') { X="setTabsBackgroundColor";id=Id_setTabsBackgroundColor; }
                break L;
            case 27: c=s.charAt(0);
                if (c=='g') { X="getActiveTabBackgroundColor";id=Id_getActiveTabBackgroundColor; }
                else if (c=='s') { X="setActiveTabBackgroundColor";id=Id_setActiveTabBackgroundColor; }
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
			case Id_getTabsBackgroundColor:
				arity = 0;
				name = "getTabsBackgroundColor";
				break;
			case Id_setTabsBackgroundColor:
				arity = 1;
				name = "setTabsBackgroundColor";
				break;
			case Id_getActiveTabBackgroundColor:
				arity = 0;
				name = "getActiveTabBackgroundColor";
				break;
			case Id_setActiveTabBackgroundColor:
				arity = 1;
				name = "setActiveTabBackgroundColor";
				break;
			case Id_removeTab:
				arity = 1;
				name = "removeTab";
				break;
			case Id_getActiveTab:
				arity = 0;
				name = "getActiveTab";
				break;
			case Id_setTabs:
				arity = 1;
				name = "setTabs";
				break;
			case Id_addTab:
				arity = 1;
				name = "addTab";
				break;
			case Id_setOrientationModes:
				arity = 1;
				name = "setOrientationModes";
				break;
			case Id_setActiveTab:
				arity = 1;
				name = "setActiveTab";
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

		while (thisObj != null && !(thisObj instanceof TabGroupProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TabGroupProxyPrototype proxy = (TabGroupProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getTabsBackgroundColor:
				return proxy.getProperty("tabsBackgroundColor");
			case Id_setTabsBackgroundColor:
				proxy.setProperty("tabsBackgroundColor", args[0]);
				proxy.onPropertyChanged("tabsBackgroundColor", args[0]);
				return Undefined.instance;
			case Id_getActiveTabBackgroundColor:
				return proxy.getProperty("activeTabBackgroundColor");
			case Id_setActiveTabBackgroundColor:
				proxy.setProperty("activeTabBackgroundColor", args[0]);
				proxy.onPropertyChanged("activeTabBackgroundColor", args[0]);
				return Undefined.instance;
			case Id_removeTab:
				 removeTab(cx, thisObj, args);
				return Undefined.instance;
			case Id_getActiveTab:
				return getActiveTab(cx, thisObj, args);
				
			case Id_setTabs:
				 setTabs(cx, thisObj, args);
				return Undefined.instance;
			case Id_addTab:
				 addTab(cx, thisObj, args);
				return Undefined.instance;
			case Id_setOrientationModes:
				 setOrientationModes(cx, thisObj, args);
				return Undefined.instance;
			case Id_setActiveTab:
				 setActiveTab(cx, thisObj, args);
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

		Id_activeTab = 1
		,		
		Id_orientationModes = 2
		;

	// Property accessor IDs
	private static final int

		Id_tabsBackgroundColor = 3
		,		
		Id_activeTabBackgroundColor = 4
		;

;

	public static final int MAX_INSTANCE_ID = 4;

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
            case 9: X="activeTab";id=Id_activeTab; break L;
            case 16: X="orientationModes";id=Id_orientationModes; break L;
            case 19: X="tabsBackgroundColor";id=Id_tabsBackgroundColor; break L;
            case 24: X="activeTabBackgroundColor";id=Id_activeTabBackgroundColor; break L;
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
			case Id_activeTab:
				return "activeTab"; 
			case Id_orientationModes:
				return "orientationModes"; 
			case Id_tabsBackgroundColor:
				return "tabsBackgroundColor";
			case Id_activeTabBackgroundColor:
				return "activeTabBackgroundColor";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TabGroupProxyPrototype proxy = this;
		while (start != null && !(start instanceof TabGroupProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TabGroupProxyPrototype) {
			proxy = (TabGroupProxyPrototype) start;
		}

		switch (id) {
			case Id_activeTab:
				return proxy.getter_activeTab();
			case Id_orientationModes:
				return proxy.getProperty("orientationModes");
			case Id_tabsBackgroundColor:
				return proxy.getProperty("tabsBackgroundColor");
			case Id_activeTabBackgroundColor:
				return proxy.getProperty("activeTabBackgroundColor");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		TabGroupProxyPrototype proxy = this;
		while (start != null && !(start instanceof TabGroupProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TabGroupProxyPrototype) {
			proxy = (TabGroupProxyPrototype) start;
		}

		switch (id) {
			case Id_activeTab:
				proxy.setter_activeTab(value);
				break; 
			case Id_orientationModes:
				proxy.setter_orientationModes(value);
				break; 
			case Id_tabsBackgroundColor:
				proxy.setProperty("tabsBackgroundColor", value);
				proxy.onPropertyChanged("tabsBackgroundColor", value);
				break;
			case Id_activeTabBackgroundColor:
				proxy.setProperty("activeTabBackgroundColor", value);
				proxy.onPropertyChanged("activeTabBackgroundColor", value);
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
