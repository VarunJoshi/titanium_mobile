/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.android.notificationmanager;

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

import ti.modules.titanium.android.notificationmanager.NotificationProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class NotificationProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 3288922574243406562L;

	private static final String TAG = "NotificationProxyPrototype";
	private static final String CLASS_TAG = "NotificationProxy";
	private static NotificationProxyPrototype notificationProxyPrototype;


	public static NotificationProxyPrototype getProxyPrototype()
	{
		return notificationProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		notificationProxyPrototype = null;
	}

	public NotificationProxyPrototype()
	{
		if (notificationProxyPrototype == null && getClass().equals(NotificationProxyPrototype.class)) {
			notificationProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == notificationProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return notificationProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(NotificationProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void setDeleteIntent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setDeleteIntent()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setDeleteIntent: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.android.PendingIntentProxy arg0;
		arg0 = (ti.modules.titanium.android.PendingIntentProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setDeleteIntent(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setContentView(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setContentView()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setContentView: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.android.RemoteViewsProxy arg0;
		arg0 = (ti.modules.titanium.android.RemoteViewsProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setContentView(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setIconLevel(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setIconLevel()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setIconLevel: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setIconLevel(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setFlags(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setFlags()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setFlags: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setFlags(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setLedOnMS(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setLedOnMS()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setLedOnMS: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setLedOnMS(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setDefaults(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setDefaults()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setDefaults: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setDefaults(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setTickerText(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setTickerText()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setTickerText: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setTickerText(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setLatestEventInfo(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setLatestEventInfo()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("setLatestEventInfo: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;
		if (!(args[2] instanceof Proxy) && args[2] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[2];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.android.PendingIntentProxy arg2;
		arg2 = (ti.modules.titanium.android.PendingIntentProxy) TypeConverter.jsObjectToJavaObject(args[2], thisObj) ;

		proxy.setLatestEventInfo(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setLedARGB(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setLedARGB()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setLedARGB: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setLedARGB(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setSound(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setSound()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setSound: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setSound(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setAudioStreamType(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setAudioStreamType()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setAudioStreamType: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setAudioStreamType(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setVibratePattern(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setVibratePattern()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		proxy.setVibratePattern(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setLedOffMS(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setLedOffMS()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setLedOffMS: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setLedOffMS(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setWhen(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setWhen()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setWhen: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setWhen(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setNumber(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setNumber()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setNumber: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setNumber(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setIcon(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setIcon()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setIcon: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setIcon(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setContentIntent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setContentIntent()", Log.DEBUG_MODE);

		try {
		NotificationProxy proxy = (NotificationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setContentIntent: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.android.PendingIntentProxy arg0;
		arg0 = (ti.modules.titanium.android.PendingIntentProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setContentIntent(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public void setter_vibratePattern(Object value)
	{
		Log.d(TAG, "set vibratePattern", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Scriptable) && value != null) {
			String error = "Invalid value, expected type Scriptable, got: " + value;
			Log.e(TAG, error);
		}
		java.lang.Object[] arg0;
		arg0 = (java.lang.Object[]) TypeConverter.jsArrayToJavaObjectArray((Scriptable) value, thisObj) ;
		proxy.setVibratePattern(arg0);
		//proxy.setProperty("vibratePattern", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_icon(Object value)
	{
		Log.d(TAG, "set icon", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setIcon(arg0);
		//proxy.setProperty("icon", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_flags(Object value)
	{
		Log.d(TAG, "set flags", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setFlags(arg0);
		//proxy.setProperty("flags", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_iconLevel(Object value)
	{
		Log.d(TAG, "set iconLevel", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setIconLevel(arg0);
		//proxy.setProperty("iconLevel", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_contentView(Object value)
	{
		Log.d(TAG, "set contentView", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Proxy) && value != null) {
			String error = "Invalid value, expected type Proxy, got: " + value;
			Log.e(TAG, error);
		}
		ti.modules.titanium.android.RemoteViewsProxy arg0;
		arg0 = (ti.modules.titanium.android.RemoteViewsProxy) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setContentView(arg0);
		//proxy.setProperty("contentView", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_number(Object value)
	{
		Log.d(TAG, "set number", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setNumber(arg0);
		//proxy.setProperty("number", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_audioStreamType(Object value)
	{
		Log.d(TAG, "set audioStreamType", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setAudioStreamType(arg0);
		//proxy.setProperty("audioStreamType", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_deleteIntent(Object value)
	{
		Log.d(TAG, "set deleteIntent", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Proxy) && value != null) {
			String error = "Invalid value, expected type Proxy, got: " + value;
			Log.e(TAG, error);
		}
		ti.modules.titanium.android.PendingIntentProxy arg0;
		arg0 = (ti.modules.titanium.android.PendingIntentProxy) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setDeleteIntent(arg0);
		//proxy.setProperty("deleteIntent", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_defaults(Object value)
	{
		Log.d(TAG, "set defaults", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setDefaults(arg0);
		//proxy.setProperty("defaults", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_tickerText(Object value)
	{
		Log.d(TAG, "set tickerText", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setTickerText(arg0);
		//proxy.setProperty("tickerText", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_ledARGB(Object value)
	{
		Log.d(TAG, "set ledARGB", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setLedARGB(arg0);
		//proxy.setProperty("ledARGB", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_sound(Object value)
	{
		Log.d(TAG, "set sound", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setSound(arg0);
		//proxy.setProperty("sound", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_when(Object value)
	{
		Log.d(TAG, "set when", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setWhen(arg0);
		//proxy.setProperty("when", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_ledOnMS(Object value)
	{
		Log.d(TAG, "set ledOnMS", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setLedOnMS(arg0);
		//proxy.setProperty("ledOnMS", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_contentIntent(Object value)
	{
		Log.d(TAG, "set contentIntent", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Proxy) && value != null) {
			String error = "Invalid value, expected type Proxy, got: " + value;
			Log.e(TAG, error);
		}
		ti.modules.titanium.android.PendingIntentProxy arg0;
		arg0 = (ti.modules.titanium.android.PendingIntentProxy) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setContentIntent(arg0);
		//proxy.setProperty("contentIntent", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_ledOffMS(Object value)
	{
		Log.d(TAG, "set ledOffMS", Log.DEBUG_MODE);
		NotificationProxy proxy = (NotificationProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setLedOffMS(arg0);
		//proxy.setProperty("ledOffMS", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getContentText = 2,
		Id_setContentText = 3,
		Id_getContentTitle = 4,
		Id_setContentTitle = 5,
		// Method IDs
		Id_setDeleteIntent = 6,
		Id_setContentView = 7,
		Id_setIconLevel = 8,
		Id_setFlags = 9,
		Id_setLedOnMS = 10,
		Id_setDefaults = 11,
		Id_setTickerText = 12,
		Id_setLatestEventInfo = 13,
		Id_setLedARGB = 14,
		Id_setSound = 15,
		Id_setAudioStreamType = 16,
		Id_setVibratePattern = 17,
		Id_setLedOffMS = 18,
		Id_setWhen = 19,
		Id_setNumber = 20,
		Id_setIcon = 21,
		Id_setContentIntent = 22
;
		

	public static final int MAX_PROTOTYPE_ID = 22;

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
            case 7: c=s.charAt(3);
                if (c=='I') { X="setIcon";id=Id_setIcon; }
                else if (c=='W') { X="setWhen";id=Id_setWhen; }
                break L;
            case 8: c=s.charAt(3);
                if (c=='F') { X="setFlags";id=Id_setFlags; }
                else if (c=='S') { X="setSound";id=Id_setSound; }
                break L;
            case 9: X="setNumber";id=Id_setNumber; break L;
            case 10: c=s.charAt(6);
                if (c=='A') { X="setLedARGB";id=Id_setLedARGB; }
                else if (c=='O') { X="setLedOnMS";id=Id_setLedOnMS; }
                break L;
            case 11: c=s.charAt(3);
                if (c=='D') { X="setDefaults";id=Id_setDefaults; }
                else if (c=='L') { X="setLedOffMS";id=Id_setLedOffMS; }
                else if (c=='s') { X="constructor";id=Id_constructor; }
                break L;
            case 12: X="setIconLevel";id=Id_setIconLevel; break L;
            case 13: X="setTickerText";id=Id_setTickerText; break L;
            case 14: c=s.charAt(0);
                if (c=='g') { X="getContentText";id=Id_getContentText; }
                else if (c=='s') {
                    c=s.charAt(13);
                    if (c=='t') { X="setContentText";id=Id_setContentText; }
                    else if (c=='w') { X="setContentView";id=Id_setContentView; }
                }
                break L;
            case 15: c=s.charAt(0);
                if (c=='g') { X="getContentTitle";id=Id_getContentTitle; }
                else if (c=='s') {
                    c=s.charAt(14);
                    if (c=='e') { X="setContentTitle";id=Id_setContentTitle; }
                    else if (c=='t') { X="setDeleteIntent";id=Id_setDeleteIntent; }
                }
                break L;
            case 16: X="setContentIntent";id=Id_setContentIntent; break L;
            case 17: X="setVibratePattern";id=Id_setVibratePattern; break L;
            case 18: c=s.charAt(3);
                if (c=='A') { X="setAudioStreamType";id=Id_setAudioStreamType; }
                else if (c=='L') { X="setLatestEventInfo";id=Id_setLatestEventInfo; }
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
			case Id_getContentText:
				arity = 0;
				name = "getContentText";
				break;
			case Id_setContentText:
				arity = 1;
				name = "setContentText";
				break;
			case Id_getContentTitle:
				arity = 0;
				name = "getContentTitle";
				break;
			case Id_setContentTitle:
				arity = 1;
				name = "setContentTitle";
				break;
			case Id_setDeleteIntent:
				arity = 1;
				name = "setDeleteIntent";
				break;
			case Id_setContentView:
				arity = 1;
				name = "setContentView";
				break;
			case Id_setIconLevel:
				arity = 1;
				name = "setIconLevel";
				break;
			case Id_setFlags:
				arity = 1;
				name = "setFlags";
				break;
			case Id_setLedOnMS:
				arity = 1;
				name = "setLedOnMS";
				break;
			case Id_setDefaults:
				arity = 1;
				name = "setDefaults";
				break;
			case Id_setTickerText:
				arity = 1;
				name = "setTickerText";
				break;
			case Id_setLatestEventInfo:
				arity = 3;
				name = "setLatestEventInfo";
				break;
			case Id_setLedARGB:
				arity = 1;
				name = "setLedARGB";
				break;
			case Id_setSound:
				arity = 1;
				name = "setSound";
				break;
			case Id_setAudioStreamType:
				arity = 1;
				name = "setAudioStreamType";
				break;
			case Id_setVibratePattern:
				arity = 1;
				name = "setVibratePattern";
				break;
			case Id_setLedOffMS:
				arity = 1;
				name = "setLedOffMS";
				break;
			case Id_setWhen:
				arity = 1;
				name = "setWhen";
				break;
			case Id_setNumber:
				arity = 1;
				name = "setNumber";
				break;
			case Id_setIcon:
				arity = 1;
				name = "setIcon";
				break;
			case Id_setContentIntent:
				arity = 1;
				name = "setContentIntent";
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

		while (thisObj != null && !(thisObj instanceof NotificationProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		NotificationProxyPrototype proxy = (NotificationProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getContentText:
				return proxy.getProperty("contentText");
			case Id_setContentText:
				proxy.setProperty("contentText", args[0]);
				proxy.onPropertyChanged("contentText", args[0]);
				return Undefined.instance;
			case Id_getContentTitle:
				return proxy.getProperty("contentTitle");
			case Id_setContentTitle:
				proxy.setProperty("contentTitle", args[0]);
				proxy.onPropertyChanged("contentTitle", args[0]);
				return Undefined.instance;
			case Id_setDeleteIntent:
				 setDeleteIntent(cx, thisObj, args);
				return Undefined.instance;
			case Id_setContentView:
				 setContentView(cx, thisObj, args);
				return Undefined.instance;
			case Id_setIconLevel:
				 setIconLevel(cx, thisObj, args);
				return Undefined.instance;
			case Id_setFlags:
				 setFlags(cx, thisObj, args);
				return Undefined.instance;
			case Id_setLedOnMS:
				 setLedOnMS(cx, thisObj, args);
				return Undefined.instance;
			case Id_setDefaults:
				 setDefaults(cx, thisObj, args);
				return Undefined.instance;
			case Id_setTickerText:
				 setTickerText(cx, thisObj, args);
				return Undefined.instance;
			case Id_setLatestEventInfo:
				 setLatestEventInfo(cx, thisObj, args);
				return Undefined.instance;
			case Id_setLedARGB:
				 setLedARGB(cx, thisObj, args);
				return Undefined.instance;
			case Id_setSound:
				 setSound(cx, thisObj, args);
				return Undefined.instance;
			case Id_setAudioStreamType:
				 setAudioStreamType(cx, thisObj, args);
				return Undefined.instance;
			case Id_setVibratePattern:
				 setVibratePattern(cx, thisObj, args);
				return Undefined.instance;
			case Id_setLedOffMS:
				 setLedOffMS(cx, thisObj, args);
				return Undefined.instance;
			case Id_setWhen:
				 setWhen(cx, thisObj, args);
				return Undefined.instance;
			case Id_setNumber:
				 setNumber(cx, thisObj, args);
				return Undefined.instance;
			case Id_setIcon:
				 setIcon(cx, thisObj, args);
				return Undefined.instance;
			case Id_setContentIntent:
				 setContentIntent(cx, thisObj, args);
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

		Id_vibratePattern = 1
		,		
		Id_icon = 2
		,		
		Id_flags = 3
		,		
		Id_iconLevel = 4
		,		
		Id_contentView = 5
		,		
		Id_number = 6
		,		
		Id_audioStreamType = 7
		,		
		Id_deleteIntent = 8
		,		
		Id_defaults = 9
		,		
		Id_tickerText = 10
		,		
		Id_ledARGB = 11
		,		
		Id_sound = 12
		,		
		Id_when = 13
		,		
		Id_ledOnMS = 14
		,		
		Id_contentIntent = 15
		,		
		Id_ledOffMS = 16
		;

	// Property accessor IDs
	private static final int

		Id_contentText = 17
		,		
		Id_contentTitle = 18
		;

;

	public static final int MAX_INSTANCE_ID = 18;

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
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 4: c=s.charAt(0);
                if (c=='i') { X="icon";id=Id_icon; }
                else if (c=='w') { X="when";id=Id_when; }
                break L;
            case 5: c=s.charAt(0);
                if (c=='f') { X="flags";id=Id_flags; }
                else if (c=='s') { X="sound";id=Id_sound; }
                break L;
            case 6: X="number";id=Id_number; break L;
            case 7: c=s.charAt(3);
                if (c=='A') { X="ledARGB";id=Id_ledARGB; }
                else if (c=='O') { X="ledOnMS";id=Id_ledOnMS; }
                break L;
            case 8: c=s.charAt(0);
                if (c=='d') { X="defaults";id=Id_defaults; }
                else if (c=='l') { X="ledOffMS";id=Id_ledOffMS; }
                break L;
            case 9: X="iconLevel";id=Id_iconLevel; break L;
            case 10: X="tickerText";id=Id_tickerText; break L;
            case 11: c=s.charAt(7);
                if (c=='T') { X="contentText";id=Id_contentText; }
                else if (c=='V') { X="contentView";id=Id_contentView; }
                break L;
            case 12: c=s.charAt(0);
                if (c=='c') { X="contentTitle";id=Id_contentTitle; }
                else if (c=='d') { X="deleteIntent";id=Id_deleteIntent; }
                break L;
            case 13: X="contentIntent";id=Id_contentIntent; break L;
            case 14: X="vibratePattern";id=Id_vibratePattern; break L;
            case 15: X="audioStreamType";id=Id_audioStreamType; break L;
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
			case Id_vibratePattern:
				return "vibratePattern"; 
			case Id_icon:
				return "icon"; 
			case Id_flags:
				return "flags"; 
			case Id_iconLevel:
				return "iconLevel"; 
			case Id_contentView:
				return "contentView"; 
			case Id_number:
				return "number"; 
			case Id_audioStreamType:
				return "audioStreamType"; 
			case Id_deleteIntent:
				return "deleteIntent"; 
			case Id_defaults:
				return "defaults"; 
			case Id_tickerText:
				return "tickerText"; 
			case Id_ledARGB:
				return "ledARGB"; 
			case Id_sound:
				return "sound"; 
			case Id_when:
				return "when"; 
			case Id_ledOnMS:
				return "ledOnMS"; 
			case Id_contentIntent:
				return "contentIntent"; 
			case Id_ledOffMS:
				return "ledOffMS"; 
			case Id_contentText:
				return "contentText";
			case Id_contentTitle:
				return "contentTitle";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		NotificationProxyPrototype proxy = this;
		while (start != null && !(start instanceof NotificationProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof NotificationProxyPrototype) {
			proxy = (NotificationProxyPrototype) start;
		}

		switch (id) {
			case Id_vibratePattern:
				return proxy.getProperty("vibratePattern");
			case Id_icon:
				return proxy.getProperty("icon");
			case Id_flags:
				return proxy.getProperty("flags");
			case Id_iconLevel:
				return proxy.getProperty("iconLevel");
			case Id_contentView:
				return proxy.getProperty("contentView");
			case Id_number:
				return proxy.getProperty("number");
			case Id_audioStreamType:
				return proxy.getProperty("audioStreamType");
			case Id_deleteIntent:
				return proxy.getProperty("deleteIntent");
			case Id_defaults:
				return proxy.getProperty("defaults");
			case Id_tickerText:
				return proxy.getProperty("tickerText");
			case Id_ledARGB:
				return proxy.getProperty("ledARGB");
			case Id_sound:
				return proxy.getProperty("sound");
			case Id_when:
				return proxy.getProperty("when");
			case Id_ledOnMS:
				return proxy.getProperty("ledOnMS");
			case Id_contentIntent:
				return proxy.getProperty("contentIntent");
			case Id_ledOffMS:
				return proxy.getProperty("ledOffMS");
			case Id_contentText:
				return proxy.getProperty("contentText");
			case Id_contentTitle:
				return proxy.getProperty("contentTitle");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		NotificationProxyPrototype proxy = this;
		while (start != null && !(start instanceof NotificationProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof NotificationProxyPrototype) {
			proxy = (NotificationProxyPrototype) start;
		}

		switch (id) {
			case Id_vibratePattern:
				proxy.setter_vibratePattern(value);
				break; 
			case Id_icon:
				proxy.setter_icon(value);
				break; 
			case Id_flags:
				proxy.setter_flags(value);
				break; 
			case Id_iconLevel:
				proxy.setter_iconLevel(value);
				break; 
			case Id_contentView:
				proxy.setter_contentView(value);
				break; 
			case Id_number:
				proxy.setter_number(value);
				break; 
			case Id_audioStreamType:
				proxy.setter_audioStreamType(value);
				break; 
			case Id_deleteIntent:
				proxy.setter_deleteIntent(value);
				break; 
			case Id_defaults:
				proxy.setter_defaults(value);
				break; 
			case Id_tickerText:
				proxy.setter_tickerText(value);
				break; 
			case Id_ledARGB:
				proxy.setter_ledARGB(value);
				break; 
			case Id_sound:
				proxy.setter_sound(value);
				break; 
			case Id_when:
				proxy.setter_when(value);
				break; 
			case Id_ledOnMS:
				proxy.setter_ledOnMS(value);
				break; 
			case Id_contentIntent:
				proxy.setter_contentIntent(value);
				break; 
			case Id_ledOffMS:
				proxy.setter_ledOffMS(value);
				break; 
			case Id_contentText:
				proxy.setProperty("contentText", value);
				proxy.onPropertyChanged("contentText", value);
				break;
			case Id_contentTitle:
				proxy.setProperty("contentTitle", value);
				proxy.onPropertyChanged("contentTitle", value);
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
