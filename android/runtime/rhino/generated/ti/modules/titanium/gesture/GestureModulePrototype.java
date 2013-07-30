/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.gesture;

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

import ti.modules.titanium.gesture.GestureModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class GestureModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = 4166027874190456466L;

	private static final String TAG = "GestureModulePrototype";
	private static final String CLASS_TAG = "GestureModule";
	private static GestureModulePrototype gestureModulePrototype;


	public static GestureModulePrototype getProxyPrototype()
	{
		return gestureModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		gestureModulePrototype = null;
	}

	public GestureModulePrototype()
	{
		if (gestureModulePrototype == null && getClass().equals(GestureModulePrototype.class)) {
			gestureModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;
	}

	public Scriptable getPrototype()
	{
		if (this == gestureModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return gestureModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(GestureModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object isPortrait(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isPortrait()", Log.DEBUG_MODE);

		try {
		GestureModule proxy = (GestureModule) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isPortrait();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object isLandscape(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isLandscape()", Log.DEBUG_MODE);

		try {
		GestureModule proxy = (GestureModule) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isLandscape();

		Boolean rhinoResult = (Boolean) javaResult;
	
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
		GestureModule proxy = (GestureModule) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getOrientation();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Number getter_orientation()
	{
		Log.d(TAG, "get orientation", Log.DEBUG_MODE);
		GestureModule proxy = (GestureModule) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getOrientation();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Boolean getter_landscape()
	{
		Log.d(TAG, "get landscape", Log.DEBUG_MODE);
		GestureModule proxy = (GestureModule) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.isLandscape();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public Boolean getter_portrait()
	{
		Log.d(TAG, "get portrait", Log.DEBUG_MODE);
		GestureModule proxy = (GestureModule) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.isPortrait();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_isPortrait = 2,
		Id_isLandscape = 3,
		Id_getOrientation = 4
;
		

	public static final int MAX_PROTOTYPE_ID = 4;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null; int c;
            int s_length = s.length();
            if (s_length==10) { X="isPortrait";id=Id_isPortrait; }
            else if (s_length==11) {
                c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='i') { X="isLandscape";id=Id_isLandscape; }
            }
            else if (s_length==14) { X="getOrientation";id=Id_getOrientation; }
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
			case Id_isPortrait:
				arity = 0;
				name = "isPortrait";
				break;
			case Id_isLandscape:
				arity = 0;
				name = "isLandscape";
				break;
			case Id_getOrientation:
				arity = 0;
				name = "getOrientation";
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

		while (thisObj != null && !(thisObj instanceof GestureModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		GestureModulePrototype proxy = (GestureModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_isPortrait:
				return isPortrait(cx, thisObj, args);
				
			case Id_isLandscape:
				return isLandscape(cx, thisObj, args);
				
			case Id_getOrientation:
				return getOrientation(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_orientation = 1
		,		
		Id_landscape = 2
		,		
		Id_portrait = 3
		;

;

;

	public static final int MAX_INSTANCE_ID = 3;

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
            int s_length = s.length();
            if (s_length==8) { X="portrait";id=Id_portrait; }
            else if (s_length==9) { X="landscape";id=Id_landscape; }
            else if (s_length==11) { X="orientation";id=Id_orientation; }
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
			case Id_orientation:
				return "orientation"; 
			case Id_landscape:
				return "landscape"; 
			case Id_portrait:
				return "portrait"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		GestureModulePrototype proxy = this;
		while (start != null && !(start instanceof GestureModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof GestureModulePrototype) {
			proxy = (GestureModulePrototype) start;
		}

		switch (id) {
			case Id_orientation:
				return proxy.getter_orientation();
			case Id_landscape:
				return proxy.getter_landscape();
			case Id_portrait:
				return proxy.getter_portrait();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		GestureModulePrototype proxy = this;
		while (start != null && !(start instanceof GestureModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof GestureModulePrototype) {
			proxy = (GestureModulePrototype) start;
		}

		switch (id) {
			case Id_orientation:
				proxy.setProperty("orientation", value);
				proxy.onPropertyChanged("orientation", value);
				break; 
			case Id_landscape:
				proxy.setProperty("landscape", value);
				proxy.onPropertyChanged("landscape", value);
				break; 
			case Id_portrait:
				proxy.setProperty("portrait", value);
				proxy.onPropertyChanged("portrait", value);
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
