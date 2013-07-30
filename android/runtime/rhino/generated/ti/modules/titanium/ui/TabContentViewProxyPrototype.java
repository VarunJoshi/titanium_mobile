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

import ti.modules.titanium.ui.TabContentViewProxy;

import ti.modules.titanium.ui.ViewProxyPrototype;


public class TabContentViewProxyPrototype extends ViewProxyPrototype
{
	private static final long serialVersionUID = -8097974621698837153L;

	private static final String TAG = "TabContentViewProxyPrototype";
	private static final String CLASS_TAG = "TabContentViewProxy";
	private static TabContentViewProxyPrototype tabContentViewProxyPrototype;


	public static TabContentViewProxyPrototype getProxyPrototype()
	{
		return tabContentViewProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		tabContentViewProxyPrototype = null;
	}

	public TabContentViewProxyPrototype()
	{
		if (tabContentViewProxyPrototype == null && getClass().equals(TabContentViewProxyPrototype.class)) {
			tabContentViewProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == tabContentViewProxyPrototype) {
			return ViewProxyPrototype.getProxyPrototype();
		}
		return tabContentViewProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return ViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TabContentViewProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties
	public Proxy getter__internalActivity()
	{
		Log.d(TAG, "get _internalActivity", Log.DEBUG_MODE);
		TabContentViewProxy proxy = (TabContentViewProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.proxy.ActivityProxy javaResult = proxy.getActivityProxy();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
		// Property IDs
		// Method IDs
;
		

	public static final int MAX_PROTOTYPE_ID = 1;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null;
            if (s.length()==11) { X="constructor";id=Id_constructor; }
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

		while (thisObj != null && !(thisObj instanceof TabContentViewProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TabContentViewProxyPrototype proxy = (TabContentViewProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id__internalActivity = 1
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
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null;
            if (s.length()==17) { X="_internalActivity";id=Id__internalActivity; }
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
			case Id__internalActivity:
				return "_internalActivity"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TabContentViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof TabContentViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TabContentViewProxyPrototype) {
			proxy = (TabContentViewProxyPrototype) start;
		}

		switch (id) {
			case Id__internalActivity:
				return proxy.getter__internalActivity();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		TabContentViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof TabContentViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TabContentViewProxyPrototype) {
			proxy = (TabContentViewProxyPrototype) start;
		}

		switch (id) {
			case Id__internalActivity:
				proxy.setProperty("_internalActivity", value);
				proxy.onPropertyChanged("_internalActivity", value);
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
