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

import ti.modules.titanium.ui.ActivityWindowProxy;

import org.appcelerator.titanium.proxy.TiWindowProxyPrototype;


public class ActivityWindowProxyPrototype extends TiWindowProxyPrototype
{
	private static final long serialVersionUID = -6660194563616008450L;

	private static final String TAG = "ActivityWindowProxyPrototype";
	private static final String CLASS_TAG = "ActivityWindowProxy";
	private static ActivityWindowProxyPrototype activityWindowProxyPrototype;


	public static ActivityWindowProxyPrototype getProxyPrototype()
	{
		return activityWindowProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		activityWindowProxyPrototype = null;
	}

	public ActivityWindowProxyPrototype()
	{
		if (activityWindowProxyPrototype == null && getClass().equals(ActivityWindowProxyPrototype.class)) {
			activityWindowProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == activityWindowProxyPrototype) {
			return TiWindowProxyPrototype.getProxyPrototype();
		}
		return activityWindowProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiWindowProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ActivityWindowProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getTabGroup(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTabGroup()", Log.DEBUG_MODE);

		try {
		ActivityWindowProxy proxy = (ActivityWindowProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.proxy.TiViewProxy javaResult = proxy.getTabGroup();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
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
		ActivityWindowProxy proxy = (ActivityWindowProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.proxy.TiViewProxy javaResult = proxy.getTab();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Proxy getter_tab()
	{
		Log.d(TAG, "get tab", Log.DEBUG_MODE);
		ActivityWindowProxy proxy = (ActivityWindowProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.proxy.TiViewProxy javaResult = proxy.getTab();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Proxy getter_tabGroup()
	{
		Log.d(TAG, "get tabGroup", Log.DEBUG_MODE);
		ActivityWindowProxy proxy = (ActivityWindowProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.proxy.TiViewProxy javaResult = proxy.getTabGroup();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getTabGroup = 2,
		Id_getTab = 3
;
		

	public static final int MAX_PROTOTYPE_ID = 3;

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
            int s_length = s.length();
            if (s_length==6) { X="getTab";id=Id_getTab; }
            else if (s_length==11) {
                c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') { X="getTabGroup";id=Id_getTabGroup; }
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
			case Id_getTabGroup:
				arity = 0;
				name = "getTabGroup";
				break;
			case Id_getTab:
				arity = 0;
				name = "getTab";
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

		while (thisObj != null && !(thisObj instanceof ActivityWindowProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ActivityWindowProxyPrototype proxy = (ActivityWindowProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getTabGroup:
				return getTabGroup(cx, thisObj, args);
				
			case Id_getTab:
				return getTab(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_tab = 1
		,		
		Id_tabGroup = 2
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
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==3) { X="tab";id=Id_tab; }
            else if (s_length==8) { X="tabGroup";id=Id_tabGroup; }
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
			case Id_tab:
				return "tab"; 
			case Id_tabGroup:
				return "tabGroup"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ActivityWindowProxyPrototype proxy = this;
		while (start != null && !(start instanceof ActivityWindowProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ActivityWindowProxyPrototype) {
			proxy = (ActivityWindowProxyPrototype) start;
		}

		switch (id) {
			case Id_tab:
				return proxy.getter_tab();
			case Id_tabGroup:
				return proxy.getter_tabGroup();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ActivityWindowProxyPrototype proxy = this;
		while (start != null && !(start instanceof ActivityWindowProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ActivityWindowProxyPrototype) {
			proxy = (ActivityWindowProxyPrototype) start;
		}

		switch (id) {
			case Id_tab:
				proxy.setProperty("tab", value);
				proxy.onPropertyChanged("tab", value);
				break; 
			case Id_tabGroup:
				proxy.setProperty("tabGroup", value);
				proxy.onPropertyChanged("tabGroup", value);
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
