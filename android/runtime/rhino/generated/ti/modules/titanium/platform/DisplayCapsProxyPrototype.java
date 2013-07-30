/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.platform;

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

import ti.modules.titanium.platform.DisplayCapsProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class DisplayCapsProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -8119919008767676232L;

	private static final String TAG = "DisplayCapsProxyPrototype";
	private static final String CLASS_TAG = "DisplayCapsProxy";
	private static DisplayCapsProxyPrototype displayCapsProxyPrototype;


	public static DisplayCapsProxyPrototype getProxyPrototype()
	{
		return displayCapsProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		displayCapsProxyPrototype = null;
	}

	public DisplayCapsProxyPrototype()
	{
		if (displayCapsProxyPrototype == null && getClass().equals(DisplayCapsProxyPrototype.class)) {
			displayCapsProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == displayCapsProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return displayCapsProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(DisplayCapsProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getPlatformHeight(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPlatformHeight()", Log.DEBUG_MODE);

		try {
		DisplayCapsProxy proxy = (DisplayCapsProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getPlatformHeight();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getLogicalDensityFactor(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLogicalDensityFactor()", Log.DEBUG_MODE);

		try {
		DisplayCapsProxy proxy = (DisplayCapsProxy) ((Proxy) thisObj).getProxy();

		float javaResult = proxy.getLogicalDensityFactor();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getXdpi(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getXdpi()", Log.DEBUG_MODE);

		try {
		DisplayCapsProxy proxy = (DisplayCapsProxy) ((Proxy) thisObj).getProxy();

		float javaResult = proxy.getXdpi();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getPlatformWidth(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPlatformWidth()", Log.DEBUG_MODE);

		try {
		DisplayCapsProxy proxy = (DisplayCapsProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getPlatformWidth();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getDpi(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDpi()", Log.DEBUG_MODE);

		try {
		DisplayCapsProxy proxy = (DisplayCapsProxy) ((Proxy) thisObj).getProxy();

		float javaResult = proxy.getDpi();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getYdpi(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getYdpi()", Log.DEBUG_MODE);

		try {
		DisplayCapsProxy proxy = (DisplayCapsProxy) ((Proxy) thisObj).getProxy();

		float javaResult = proxy.getYdpi();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getDensity(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDensity()", Log.DEBUG_MODE);

		try {
		DisplayCapsProxy proxy = (DisplayCapsProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getDensity();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Number getter_platformWidth()
	{
		Log.d(TAG, "get platformWidth", Log.DEBUG_MODE);
		DisplayCapsProxy proxy = (DisplayCapsProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getPlatformWidth();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public String getter_density()
	{
		Log.d(TAG, "get density", Log.DEBUG_MODE);
		DisplayCapsProxy proxy = (DisplayCapsProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getDensity();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Number getter_platformHeight()
	{
		Log.d(TAG, "get platformHeight", Log.DEBUG_MODE);
		DisplayCapsProxy proxy = (DisplayCapsProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getPlatformHeight();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Number getter_xdpi()
	{
		Log.d(TAG, "get xdpi", Log.DEBUG_MODE);
		DisplayCapsProxy proxy = (DisplayCapsProxy) getProxy();
		Scriptable thisObj = this;
		float javaResult = proxy.getXdpi();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Number getter_logicalDensityFactor()
	{
		Log.d(TAG, "get logicalDensityFactor", Log.DEBUG_MODE);
		DisplayCapsProxy proxy = (DisplayCapsProxy) getProxy();
		Scriptable thisObj = this;
		float javaResult = proxy.getLogicalDensityFactor();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Number getter_ydpi()
	{
		Log.d(TAG, "get ydpi", Log.DEBUG_MODE);
		DisplayCapsProxy proxy = (DisplayCapsProxy) getProxy();
		Scriptable thisObj = this;
		float javaResult = proxy.getYdpi();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Number getter_dpi()
	{
		Log.d(TAG, "get dpi", Log.DEBUG_MODE);
		DisplayCapsProxy proxy = (DisplayCapsProxy) getProxy();
		Scriptable thisObj = this;
		float javaResult = proxy.getDpi();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getPlatformHeight = 2,
		Id_getLogicalDensityFactor = 3,
		Id_getXdpi = 4,
		Id_getPlatformWidth = 5,
		Id_getDpi = 6,
		Id_getYdpi = 7,
		Id_getDensity = 8
;
		

	public static final int MAX_PROTOTYPE_ID = 8;

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
            L: switch (s.length()) {
            case 6: X="getDpi";id=Id_getDpi; break L;
            case 7: c=s.charAt(3);
                if (c=='X') { X="getXdpi";id=Id_getXdpi; }
                else if (c=='Y') { X="getYdpi";id=Id_getYdpi; }
                break L;
            case 10: X="getDensity";id=Id_getDensity; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 16: X="getPlatformWidth";id=Id_getPlatformWidth; break L;
            case 17: X="getPlatformHeight";id=Id_getPlatformHeight; break L;
            case 23: X="getLogicalDensityFactor";id=Id_getLogicalDensityFactor; break L;
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
			case Id_getPlatformHeight:
				arity = 0;
				name = "getPlatformHeight";
				break;
			case Id_getLogicalDensityFactor:
				arity = 0;
				name = "getLogicalDensityFactor";
				break;
			case Id_getXdpi:
				arity = 0;
				name = "getXdpi";
				break;
			case Id_getPlatformWidth:
				arity = 0;
				name = "getPlatformWidth";
				break;
			case Id_getDpi:
				arity = 0;
				name = "getDpi";
				break;
			case Id_getYdpi:
				arity = 0;
				name = "getYdpi";
				break;
			case Id_getDensity:
				arity = 0;
				name = "getDensity";
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

		while (thisObj != null && !(thisObj instanceof DisplayCapsProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		DisplayCapsProxyPrototype proxy = (DisplayCapsProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getPlatformHeight:
				return getPlatformHeight(cx, thisObj, args);
				
			case Id_getLogicalDensityFactor:
				return getLogicalDensityFactor(cx, thisObj, args);
				
			case Id_getXdpi:
				return getXdpi(cx, thisObj, args);
				
			case Id_getPlatformWidth:
				return getPlatformWidth(cx, thisObj, args);
				
			case Id_getDpi:
				return getDpi(cx, thisObj, args);
				
			case Id_getYdpi:
				return getYdpi(cx, thisObj, args);
				
			case Id_getDensity:
				return getDensity(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_platformWidth = 1
		,		
		Id_density = 2
		,		
		Id_platformHeight = 3
		,		
		Id_xdpi = 4
		,		
		Id_logicalDensityFactor = 5
		,		
		Id_ydpi = 6
		,		
		Id_dpi = 7
		;

;

;

	public static final int MAX_INSTANCE_ID = 7;

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
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 3: X="dpi";id=Id_dpi; break L;
            case 4: c=s.charAt(0);
                if (c=='x') { X="xdpi";id=Id_xdpi; }
                else if (c=='y') { X="ydpi";id=Id_ydpi; }
                break L;
            case 7: X="density";id=Id_density; break L;
            case 13: X="platformWidth";id=Id_platformWidth; break L;
            case 14: X="platformHeight";id=Id_platformHeight; break L;
            case 20: X="logicalDensityFactor";id=Id_logicalDensityFactor; break L;
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
			case Id_platformWidth:
				return "platformWidth"; 
			case Id_density:
				return "density"; 
			case Id_platformHeight:
				return "platformHeight"; 
			case Id_xdpi:
				return "xdpi"; 
			case Id_logicalDensityFactor:
				return "logicalDensityFactor"; 
			case Id_ydpi:
				return "ydpi"; 
			case Id_dpi:
				return "dpi"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		DisplayCapsProxyPrototype proxy = this;
		while (start != null && !(start instanceof DisplayCapsProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof DisplayCapsProxyPrototype) {
			proxy = (DisplayCapsProxyPrototype) start;
		}

		switch (id) {
			case Id_platformWidth:
				return proxy.getter_platformWidth();
			case Id_density:
				return proxy.getter_density();
			case Id_platformHeight:
				return proxy.getter_platformHeight();
			case Id_xdpi:
				return proxy.getter_xdpi();
			case Id_logicalDensityFactor:
				return proxy.getter_logicalDensityFactor();
			case Id_ydpi:
				return proxy.getter_ydpi();
			case Id_dpi:
				return proxy.getter_dpi();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		DisplayCapsProxyPrototype proxy = this;
		while (start != null && !(start instanceof DisplayCapsProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof DisplayCapsProxyPrototype) {
			proxy = (DisplayCapsProxyPrototype) start;
		}

		switch (id) {
			case Id_platformWidth:
				proxy.setProperty("platformWidth", value);
				proxy.onPropertyChanged("platformWidth", value);
				break; 
			case Id_density:
				proxy.setProperty("density", value);
				proxy.onPropertyChanged("density", value);
				break; 
			case Id_platformHeight:
				proxy.setProperty("platformHeight", value);
				proxy.onPropertyChanged("platformHeight", value);
				break; 
			case Id_xdpi:
				proxy.setProperty("xdpi", value);
				proxy.onPropertyChanged("xdpi", value);
				break; 
			case Id_logicalDensityFactor:
				proxy.setProperty("logicalDensityFactor", value);
				proxy.onPropertyChanged("logicalDensityFactor", value);
				break; 
			case Id_ydpi:
				proxy.setProperty("ydpi", value);
				proxy.onPropertyChanged("ydpi", value);
				break; 
			case Id_dpi:
				proxy.setProperty("dpi", value);
				proxy.onPropertyChanged("dpi", value);
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
