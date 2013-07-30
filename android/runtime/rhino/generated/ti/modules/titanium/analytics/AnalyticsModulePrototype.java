/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.analytics;

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

import ti.modules.titanium.analytics.AnalyticsModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class AnalyticsModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = 3575724301331544055L;

	private static final String TAG = "AnalyticsModulePrototype";
	private static final String CLASS_TAG = "AnalyticsModule";
	private static AnalyticsModulePrototype analyticsModulePrototype;


	public static AnalyticsModulePrototype getProxyPrototype()
	{
		return analyticsModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		analyticsModulePrototype = null;
	}

	public AnalyticsModulePrototype()
	{
		if (analyticsModulePrototype == null && getClass().equals(AnalyticsModulePrototype.class)) {
			analyticsModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;
	}

	public Scriptable getPrototype()
	{
		if (this == analyticsModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return analyticsModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(AnalyticsModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void featureEvent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "featureEvent()", Log.DEBUG_MODE);

		try {
		AnalyticsModule proxy = (AnalyticsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("featureEvent: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		org.appcelerator.kroll.KrollDict arg1;
		if (args.length <= 1) {
			arg1 = null;
		} else {
		if (args[1] == null) {
			arg1 = null;
		} else {
		arg1 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[1], thisObj) );
		}
		}

		proxy.featureEvent(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void settingsEvent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "settingsEvent()", Log.DEBUG_MODE);

		try {
		AnalyticsModule proxy = (AnalyticsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("settingsEvent: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		org.appcelerator.kroll.KrollDict arg1;
		if (args.length <= 1) {
			arg1 = null;
		} else {
		if (args[1] == null) {
			arg1 = null;
		} else {
		arg1 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[1], thisObj) );
		}
		}

		proxy.settingsEvent(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void userEvent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "userEvent()", Log.DEBUG_MODE);

		try {
		AnalyticsModule proxy = (AnalyticsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("userEvent: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		org.appcelerator.kroll.KrollDict arg1;
		if (args.length <= 1) {
			arg1 = null;
		} else {
		if (args[1] == null) {
			arg1 = null;
		} else {
		arg1 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[1], thisObj) );
		}
		}

		proxy.userEvent(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void navEvent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "navEvent()", Log.DEBUG_MODE);

		try {
		AnalyticsModule proxy = (AnalyticsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("navEvent: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;
		java.lang.String arg2;
		if (args.length <= 2) {
			arg2 = null;
		} else {
		arg2 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[2], thisObj) ;
		}
		org.appcelerator.kroll.KrollDict arg3;
		if (args.length <= 3) {
			arg3 = null;
		} else {
		if (args[3] == null) {
			arg3 = null;
		} else {
		arg3 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[3], thisObj) );
		}
		}

		proxy.navEvent(arg0, arg1, arg2, arg3);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void addEvent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addEvent()", Log.DEBUG_MODE);

		try {
		AnalyticsModule proxy = (AnalyticsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("addEvent: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;
		org.appcelerator.kroll.KrollDict arg2;
		if (args.length <= 2) {
			arg2 = null;
		} else {
		if (args[2] == null) {
			arg2 = null;
		} else {
		arg2 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[2], thisObj) );
		}
		}

		proxy.addEvent(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void timedEvent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "timedEvent()", Log.DEBUG_MODE);

		try {
		AnalyticsModule proxy = (AnalyticsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 4) {
			throw new IllegalArgumentException("timedEvent: Invalid number of arguments. Expected 4 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.Object arg1;
		arg1 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;
		java.lang.Object arg2;
		arg2 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[2], thisObj) ;
		int arg3;
		arg3 = (int) TypeConverter.jsObjectToJavaInt(args[3], thisObj) ;
		org.appcelerator.kroll.KrollDict arg4;
		if (args.length <= 4) {
			arg4 = null;
		} else {
		if (args[4] == null) {
			arg4 = null;
		} else {
		arg4 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[4], thisObj) );
		}
		}

		proxy.timedEvent(arg0, arg1, arg2, arg3, arg4);
	

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
		Id_featureEvent = 2,
		Id_settingsEvent = 3,
		Id_userEvent = 4,
		Id_navEvent = 5,
		Id_addEvent = 6,
		Id_timedEvent = 7
;
		

	public static final int MAX_PROTOTYPE_ID = 7;

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
            case 8: c=s.charAt(0);
                if (c=='a') { X="addEvent";id=Id_addEvent; }
                else if (c=='n') { X="navEvent";id=Id_navEvent; }
                break L;
            case 9: X="userEvent";id=Id_userEvent; break L;
            case 10: X="timedEvent";id=Id_timedEvent; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: X="featureEvent";id=Id_featureEvent; break L;
            case 13: X="settingsEvent";id=Id_settingsEvent; break L;
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
			case Id_featureEvent:
				arity = 2;
				name = "featureEvent";
				break;
			case Id_settingsEvent:
				arity = 2;
				name = "settingsEvent";
				break;
			case Id_userEvent:
				arity = 2;
				name = "userEvent";
				break;
			case Id_navEvent:
				arity = 4;
				name = "navEvent";
				break;
			case Id_addEvent:
				arity = 3;
				name = "addEvent";
				break;
			case Id_timedEvent:
				arity = 5;
				name = "timedEvent";
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

		while (thisObj != null && !(thisObj instanceof AnalyticsModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		AnalyticsModulePrototype proxy = (AnalyticsModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_featureEvent:
				 featureEvent(cx, thisObj, args);
				return Undefined.instance;
			case Id_settingsEvent:
				 settingsEvent(cx, thisObj, args);
				return Undefined.instance;
			case Id_userEvent:
				 userEvent(cx, thisObj, args);
				return Undefined.instance;
			case Id_navEvent:
				 navEvent(cx, thisObj, args);
				return Undefined.instance;
			case Id_addEvent:
				 addEvent(cx, thisObj, args);
				return Undefined.instance;
			case Id_timedEvent:
				 timedEvent(cx, thisObj, args);
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
