/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.android;

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

import ti.modules.titanium.android.RemoteViewsProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class RemoteViewsProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 73914813570859703L;

	private static final String TAG = "RemoteViewsProxyPrototype";
	private static final String CLASS_TAG = "RemoteViewsProxy";
	private static RemoteViewsProxyPrototype remoteViewsProxyPrototype;


	public static RemoteViewsProxyPrototype getProxyPrototype()
	{
		return remoteViewsProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		remoteViewsProxyPrototype = null;
	}

	public RemoteViewsProxyPrototype()
	{
		if (remoteViewsProxyPrototype == null && getClass().equals(RemoteViewsProxyPrototype.class)) {
			remoteViewsProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == remoteViewsProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return remoteViewsProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(RemoteViewsProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void setChronometer(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setChronometer()", Log.DEBUG_MODE);

		try {
		RemoteViewsProxy proxy = (RemoteViewsProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 4) {
			throw new IllegalArgumentException("setChronometer: Invalid number of arguments. Expected 4 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		long arg1;
		arg1 = (long) TypeConverter.jsObjectToJavaLong(args[1], thisObj) ;
		java.lang.String arg2;
		arg2 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[2], thisObj) ;
		if (!(args[3] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[3];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg3;
		arg3 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[3], thisObj) ;

		proxy.setChronometer(arg0, arg1, arg2, arg3);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setTextViewText(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setTextViewText()", Log.DEBUG_MODE);

		try {
		RemoteViewsProxy proxy = (RemoteViewsProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setTextViewText: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		proxy.setTextViewText(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setImageViewResource(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setImageViewResource()", Log.DEBUG_MODE);

		try {
		RemoteViewsProxy proxy = (RemoteViewsProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setImageViewResource: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;

		proxy.setImageViewResource(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setString(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setString()", Log.DEBUG_MODE);

		try {
		RemoteViewsProxy proxy = (RemoteViewsProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("setString: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;
		java.lang.String arg2;
		arg2 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[2], thisObj) ;

		proxy.setString(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setViewVisibility(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setViewVisibility()", Log.DEBUG_MODE);

		try {
		RemoteViewsProxy proxy = (RemoteViewsProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setViewVisibility: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;

		proxy.setViewVisibility(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setBoolean(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setBoolean()", Log.DEBUG_MODE);

		try {
		RemoteViewsProxy proxy = (RemoteViewsProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("setBoolean: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;
		if (!(args[2] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[2];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg2;
		arg2 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[2], thisObj) ;

		proxy.setBoolean(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setImageViewUri(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setImageViewUri()", Log.DEBUG_MODE);

		try {
		RemoteViewsProxy proxy = (RemoteViewsProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setImageViewUri: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		proxy.setImageViewUri(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setDouble(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setDouble()", Log.DEBUG_MODE);

		try {
		RemoteViewsProxy proxy = (RemoteViewsProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("setDouble: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;
		double arg2;
		arg2 = (double) TypeConverter.jsObjectToJavaDouble(args[2], thisObj) ;

		proxy.setDouble(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setUri(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setUri()", Log.DEBUG_MODE);

		try {
		RemoteViewsProxy proxy = (RemoteViewsProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("setUri: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;
		java.lang.String arg2;
		arg2 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[2], thisObj) ;

		proxy.setUri(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setOnClickPendingIntent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setOnClickPendingIntent()", Log.DEBUG_MODE);

		try {
		RemoteViewsProxy proxy = (RemoteViewsProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setOnClickPendingIntent: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		if (!(args[1] instanceof Proxy) && args[1] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.android.PendingIntentProxy arg1;
		arg1 = (ti.modules.titanium.android.PendingIntentProxy) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;

		proxy.setOnClickPendingIntent(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setInt(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setInt()", Log.DEBUG_MODE);

		try {
		RemoteViewsProxy proxy = (RemoteViewsProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("setInt: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;
		int arg2;
		arg2 = (int) TypeConverter.jsObjectToJavaInt(args[2], thisObj) ;

		proxy.setInt(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setTextColor(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setTextColor()", Log.DEBUG_MODE);

		try {
		RemoteViewsProxy proxy = (RemoteViewsProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setTextColor: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;

		proxy.setTextColor(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setProgressBar(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setProgressBar()", Log.DEBUG_MODE);

		try {
		RemoteViewsProxy proxy = (RemoteViewsProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 4) {
			throw new IllegalArgumentException("setProgressBar: Invalid number of arguments. Expected 4 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;
		int arg2;
		arg2 = (int) TypeConverter.jsObjectToJavaInt(args[2], thisObj) ;
		if (!(args[3] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[3];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg3;
		arg3 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[3], thisObj) ;

		proxy.setProgressBar(arg0, arg1, arg2, arg3);
	

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
		Id_setChronometer = 2,
		Id_setTextViewText = 3,
		Id_setImageViewResource = 4,
		Id_setString = 5,
		Id_setViewVisibility = 6,
		Id_setBoolean = 7,
		Id_setImageViewUri = 8,
		Id_setDouble = 9,
		Id_setUri = 10,
		Id_setOnClickPendingIntent = 11,
		Id_setInt = 12,
		Id_setTextColor = 13,
		Id_setProgressBar = 14
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
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 6: c=s.charAt(3);
                if (c=='I') { X="setInt";id=Id_setInt; }
                else if (c=='U') { X="setUri";id=Id_setUri; }
                break L;
            case 9: c=s.charAt(3);
                if (c=='D') { X="setDouble";id=Id_setDouble; }
                else if (c=='S') { X="setString";id=Id_setString; }
                break L;
            case 10: X="setBoolean";id=Id_setBoolean; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: X="setTextColor";id=Id_setTextColor; break L;
            case 14: c=s.charAt(3);
                if (c=='C') { X="setChronometer";id=Id_setChronometer; }
                else if (c=='P') { X="setProgressBar";id=Id_setProgressBar; }
                break L;
            case 15: c=s.charAt(3);
                if (c=='I') { X="setImageViewUri";id=Id_setImageViewUri; }
                else if (c=='T') { X="setTextViewText";id=Id_setTextViewText; }
                break L;
            case 17: X="setViewVisibility";id=Id_setViewVisibility; break L;
            case 20: X="setImageViewResource";id=Id_setImageViewResource; break L;
            case 23: X="setOnClickPendingIntent";id=Id_setOnClickPendingIntent; break L;
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
			case Id_setChronometer:
				arity = 4;
				name = "setChronometer";
				break;
			case Id_setTextViewText:
				arity = 2;
				name = "setTextViewText";
				break;
			case Id_setImageViewResource:
				arity = 2;
				name = "setImageViewResource";
				break;
			case Id_setString:
				arity = 3;
				name = "setString";
				break;
			case Id_setViewVisibility:
				arity = 2;
				name = "setViewVisibility";
				break;
			case Id_setBoolean:
				arity = 3;
				name = "setBoolean";
				break;
			case Id_setImageViewUri:
				arity = 2;
				name = "setImageViewUri";
				break;
			case Id_setDouble:
				arity = 3;
				name = "setDouble";
				break;
			case Id_setUri:
				arity = 3;
				name = "setUri";
				break;
			case Id_setOnClickPendingIntent:
				arity = 2;
				name = "setOnClickPendingIntent";
				break;
			case Id_setInt:
				arity = 3;
				name = "setInt";
				break;
			case Id_setTextColor:
				arity = 2;
				name = "setTextColor";
				break;
			case Id_setProgressBar:
				arity = 4;
				name = "setProgressBar";
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

		while (thisObj != null && !(thisObj instanceof RemoteViewsProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		RemoteViewsProxyPrototype proxy = (RemoteViewsProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_setChronometer:
				 setChronometer(cx, thisObj, args);
				return Undefined.instance;
			case Id_setTextViewText:
				 setTextViewText(cx, thisObj, args);
				return Undefined.instance;
			case Id_setImageViewResource:
				 setImageViewResource(cx, thisObj, args);
				return Undefined.instance;
			case Id_setString:
				 setString(cx, thisObj, args);
				return Undefined.instance;
			case Id_setViewVisibility:
				 setViewVisibility(cx, thisObj, args);
				return Undefined.instance;
			case Id_setBoolean:
				 setBoolean(cx, thisObj, args);
				return Undefined.instance;
			case Id_setImageViewUri:
				 setImageViewUri(cx, thisObj, args);
				return Undefined.instance;
			case Id_setDouble:
				 setDouble(cx, thisObj, args);
				return Undefined.instance;
			case Id_setUri:
				 setUri(cx, thisObj, args);
				return Undefined.instance;
			case Id_setOnClickPendingIntent:
				 setOnClickPendingIntent(cx, thisObj, args);
				return Undefined.instance;
			case Id_setInt:
				 setInt(cx, thisObj, args);
				return Undefined.instance;
			case Id_setTextColor:
				 setTextColor(cx, thisObj, args);
				return Undefined.instance;
			case Id_setProgressBar:
				 setProgressBar(cx, thisObj, args);
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
