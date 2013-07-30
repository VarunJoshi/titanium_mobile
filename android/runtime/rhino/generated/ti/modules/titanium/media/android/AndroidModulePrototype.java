/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.media.android;

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

import ti.modules.titanium.media.android.AndroidModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class AndroidModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = 6213514832925803483L;

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
	public void scanMediaFiles(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "scanMediaFiles()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
		if (!(args[0] instanceof Scriptable) && args[0] != null) {
			String error = "Invalid value, expected type Scriptable, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		java.lang.Object[] arg0;
		arg0 = (java.lang.Object[]) TypeConverter.jsArrayToJavaObjectArray((Scriptable) args[0], thisObj) ;
		if (!(args[1] instanceof Scriptable) && args[1] != null) {
			String error = "Invalid value, expected type Scriptable, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		java.lang.Object[] arg1;
		arg1 = (java.lang.Object[]) TypeConverter.jsArrayToJavaObjectArray((Scriptable) args[1], thisObj) ;
		org.appcelerator.kroll.KrollFunction arg2;
		arg2 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[2], thisObj) ;

		proxy.scanMediaFiles(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setSystemWallpaper(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setSystemWallpaper()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setSystemWallpaper: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		org.appcelerator.titanium.TiBlob arg0;
		arg0 = (org.appcelerator.titanium.TiBlob) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		if (!(args[1] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg1;
		arg1 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[1], thisObj) ;

		proxy.setSystemWallpaper(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_scanMediaFiles = 2,
		Id_setSystemWallpaper = 3
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
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==11) { X="constructor";id=Id_constructor; }
            else if (s_length==14) { X="scanMediaFiles";id=Id_scanMediaFiles; }
            else if (s_length==18) { X="setSystemWallpaper";id=Id_setSystemWallpaper; }
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
			case Id_scanMediaFiles:
				arity = 3;
				name = "scanMediaFiles";
				break;
			case Id_setSystemWallpaper:
				arity = 2;
				name = "setSystemWallpaper";
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
			case Id_scanMediaFiles:
				 scanMediaFiles(cx, thisObj, args);
				return Undefined.instance;
			case Id_setSystemWallpaper:
				 setSystemWallpaper(cx, thisObj, args);
				return Undefined.instance;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



	public static final int MAX_INSTANCE_ID = -1;


	@Override
	public String getClassName()
	{
		return CLASS_TAG;
	}
}
