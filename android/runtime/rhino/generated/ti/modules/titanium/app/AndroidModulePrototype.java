/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.app;

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

import ti.modules.titanium.app.AndroidModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class AndroidModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = -1542103265029581726L;

	private static final String TAG = "AndroidModulePrototype";
	private static final String CLASS_TAG = "AndroidModule";
	private static AndroidModulePrototype androidModulePrototype;


	public static AndroidModulePrototype getProxyPrototype()
	{
		return androidModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		androidModulePrototype = null;
	}

	public AndroidModulePrototype()
	{
		if (androidModulePrototype == null && getClass().equals(AndroidModulePrototype.class)) {
			androidModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;
	}

	public Scriptable getPrototype()
	{
		if (this == androidModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return androidModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(AndroidModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getTopActivity(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTopActivity()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.proxy.ActivityProxy javaResult = proxy.getTopActivity();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Proxy getter_R()
	{
		Log.d(TAG, "get R", Log.DEBUG_MODE);
		AndroidModule proxy = (AndroidModule) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.proxy.RProxy javaResult = proxy.getR();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getTopActivity = 2
;
		

	public static final int MAX_PROTOTYPE_ID = 2;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==11) { X="constructor";id=Id_constructor; }
            else if (s_length==14) { X="getTopActivity";id=Id_getTopActivity; }
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
			case Id_getTopActivity:
				arity = 0;
				name = "getTopActivity";
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

		while (thisObj != null && !(thisObj instanceof AndroidModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		AndroidModulePrototype proxy = (AndroidModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getTopActivity:
				return getTopActivity(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_R = 1
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
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null;
            if (s.length()==1) { if (s.charAt(0)=='R') {id=Id_R; break L0;} }
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
			case Id_R:
				return "R"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		AndroidModulePrototype proxy = this;
		while (start != null && !(start instanceof AndroidModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AndroidModulePrototype) {
			proxy = (AndroidModulePrototype) start;
		}

		switch (id) {
			case Id_R:
				return proxy.getter_R();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		AndroidModulePrototype proxy = this;
		while (start != null && !(start instanceof AndroidModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AndroidModulePrototype) {
			proxy = (AndroidModulePrototype) start;
		}

		switch (id) {
			case Id_R:
				proxy.setProperty("R", value);
				proxy.onPropertyChanged("R", value);
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
