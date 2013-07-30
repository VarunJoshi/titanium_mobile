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

import ti.modules.titanium.android.AndroidModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class AndroidModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = 7352098726546101729L;

	private static final String TAG = "AndroidModulePrototype";
	private static final String CLASS_TAG = "AndroidModule";
	private static AndroidModulePrototype androidModulePrototype;

	// Lazy loaded child APIs
	private Object API_Environment = null;
	private Object API_NotificationManager = null;
	private Object API_RemoteViews = null;
	private Object API_TiActivityWindow = null;
	private Object API_PendingIntent = null;
	private Object API_Calendar = null;
	private Object API_Notification = null;

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

			putConst("ACTION_GTALK_SERVICE_DISCONNECTED", this, "android.intent.action.GTALK_DISCONNECTED");


			putConst("FILL_IN_CATEGORIES", this, 4);


			putConst("FLAG_GRANT_READ_URI_PERMISSION", this, 1);


			putConst("SCREEN_ORIENTATION_SENSOR", this, 4);


			putConst("ACTION_SET_WALLPAPER", this, "android.intent.action.SET_WALLPAPER");


			putConst("CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST", this, "android.intent.category.FRAMEWORK_INSTRUMENTATION_TEST");


			putConst("EXTRA_SHORTCUT_ICON", this, "android.intent.extra.shortcut.ICON");


			putConst("STREAM_ALARM", this, 4);


			putConst("CATEGORY_INFO", this, "android.intent.category.INFO");


			putConst("EXTRA_EMAIL", this, "android.intent.extra.EMAIL");


			putConst("FLAG_ACTIVITY_REORDER_TO_FRONT", this, 131072);


			putConst("SCREEN_ORIENTATION_LANDSCAPE", this, 0);


			putConst("DEFAULT_ALL", this, -1);


			putConst("DEFAULT_LIGHTS", this, 4);


			putConst("ACTION_INSERT", this, "android.intent.action.INSERT");


			putConst("ACTION_SEARCH_LONG_PRESS", this, "android.intent.action.SEARCH_LONG_PRESS");


			putConst("FLAG_GRANT_WRITE_URI_PERMISSION", this, 2);


			putConst("ACTION_PICK_ACTIVITY", this, "android.intent.action.PICK_ACTIVITY");


			putConst("PENDING_INTENT_FOR_SERVICE", this, 1);


			putConst("ACTION_BUG_REPORT", this, "android.intent.action.BUG_REPORT");


			putConst("FLAG_CANCEL_CURRENT", this, 268435456);


			putConst("ACTION_MEDIA_BUTTON", this, "android.intent.action.MEDIA_BUTTON");


			putConst("FILL_IN_DATA", this, 2);


			putConst("EXTRA_ALARM_COUNT", this, "android.intent.extra.ALARM_COUNT");


			putConst("FLAG_AUTO_CANCEL", this, 16);


			putConst("CATEGORY_SAMPLE_CODE", this, "android.intent.category.SAMPLE_CODE");


			putConst("ACTION_BATTERY_OKAY", this, "android.intent.action.BATTERY_OKAY");


			putConst("FLAG_ACTIVITY_PREVIOUS_IS_TOP", this, 16777216);


			putConst("ACTION_SYSTEM_TUTORIAL", this, "android.intent.action.SYSTEM_TUTORIAL");


			putConst("ACTION_REBOOT", this, "android.intent.action.REBOOT");


			putConst("ACTION_MEDIA_SCANNER_FINISHED", this, "android.intent.action.MEDIA_SCANNER_FINISHED");


			putConst("SHOW_AS_ACTION_IF_ROOM", this, 1);


			putConst("FLAG_NO_CLEAR", this, 32);


			putConst("ACTION_SCREEN_OFF", this, "android.intent.action.SCREEN_OFF");


			putConst("CATEGORY_OPENABLE", this, "android.intent.category.OPENABLE");


			putConst("FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY", this, 1048576);


			putConst("FLAG_ONGOING_EVENT", this, 2);


			putConst("ACTION_MAIN", this, "android.intent.action.MAIN");


			putConst("ACTION_MEDIA_SCANNER_SCAN_FILE", this, "android.intent.action.MEDIA_SCANNER_SCAN_FILE");


			putConst("STREAM_RING", this, 2);


			putConst("ACTION_VOICE_COMMAND", this, "android.intent.action.VOICE_COMMAND");


			putConst("ACTION_MEDIA_BAD_REMOVAL", this, "android.intent.action.MEDIA_BAD_REMOVAL");


			putConst("ACTION_VIEW", this, "android.intent.action.VIEW");


			putConst("ACTION_NEW_OUTGOING_CALL", this, "android.intent.action.NEW_OUTGOING_CALL");


			putConst("SHOW_AS_ACTION_ALWAYS", this, 2);


			putConst("ACTION_USER_PRESENT", this, "android.intent.action.USER_PRESENT");


			putConst("EXTRA_CC", this, "android.intent.extra.CC");


			putConst("ACTION_SCREEN_ON", this, "android.intent.action.SCREEN_ON");


			putConst("SCREEN_ORIENTATION_BEHIND", this, 3);


			putConst("CATEGORY_LAUNCHER", this, "android.intent.category.LAUNCHER");


			putConst("CATEGORY_SELECTED_ALTERNATIVE", this, "android.intent.category.SELECTED_ALTERNATIVE");


			putConst("ACTION_CONFIGURATION_CHANGED", this, "android.intent.action.CONFIGURATION_CHANGED");


			putConst("ACTION_INPUT_METHOD_CHANGED", this, "android.intent.action.INPUT_METHOD_CHANGED");


			putConst("EXTRA_DONT_KILL_APP", this, "android.intent.extra.DONT_KILL_APP");


			putConst("ACTION_UMS_CONNECTED", this, "android.intent.action.UMS_CONNECTED");


			putConst("ACTION_DATE_CHANGED", this, "android.intent.action.DATE_CHANGED");


			putConst("SCREEN_ORIENTATION_USER", this, 2);


			putConst("FLAG_ACTIVITY_RESET_TASK_IF_NEEDED", this, 2097152);


			putConst("EXTRA_SHORTCUT_ICON_RESOURCE", this, "android.intent.extra.shortcut.ICON_RESOURCE");


			putConst("FLAG_ACTIVITY_CLEAR_TOP", this, 67108864);


			putConst("ACTION_POWER_DISCONNECTED", this, "android.intent.action.ACTION_POWER_DISCONNECTED");


			putConst("ACTION_CLOSE_SYSTEM_DIALOGS", this, "android.intent.action.CLOSE_SYSTEM_DIALOGS");


			putConst("FLAG_ONE_SHOT", this, 1073741824);


			putConst("CATEGORY_EMBED", this, "android.intent.category.EMBED");


			putConst("ACTION_UMS_DISCONNECTED", this, "android.intent.action.UMS_DISCONNECTED");


			putConst("ACTION_TIME_TICK", this, "android.intent.action.TIME_TICK");


			putConst("ACTION_BOOT_COMPLETED", this, "android.intent.action.BOOT_COMPLETED");


			putConst("CATEGORY_MONKEY", this, "android.intent.category.MONKEY");


			putConst("EXTRA_DATA_REMOVED", this, "android.intent.extra.DATA_REMOVED");


			putConst("EXTRA_TEXT", this, "android.intent.extra.TEXT");


			putConst("ACTION_AIRPLANE_MODE_CHANGED", this, "android.intent.action.AIRPLANE_MODE");


			putConst("EXTRA_SHORTCUT_NAME", this, "android.intent.extra.shortcut.NAME");


			putConst("FILL_IN_PACKAGE", this, 16);


			putConst("CATEGORY_BROWSABLE", this, "android.intent.category.BROWSABLE");


			putConst("ACTION_SYNC", this, "android.intent.action.SYNC");


			putConst("ACTION_EDIT", this, "android.intent.action.EDIT");


			putConst("ACTION_PACKAGE_REPLACED", this, "android.intent.action.PACKAGE_REPLACED");


			putConst("ACTION_BATTERY_LOW", this, "android.intent.action.BATTERY_LOW");


			putConst("ACTION_CALL_BUTTON", this, "android.intent.action.CALL_BUTTON");


			putConst("ACTION_POWER_USAGE_SUMMARY", this, "android.intent.action.POWER_USAGE_SUMMARY");


			putConst("FLAG_ACTIVITY_BROUGHT_TO_FRONT", this, 4194304);


			putConst("ACTION_PACKAGE_INSTALL", this, "android.intent.action.PACKAGE_INSTALL");


			putConst("EXTRA_SUBJECT", this, "android.intent.extra.SUBJECT");


			putConst("CATEGORY_TEST", this, "android.intent.category.TEST");


			putConst("ACTION_ATTACH_DATA", this, "android.intent.action.ATTACH_DATA");


			putConst("ACTION_GET_CONTENT", this, "android.intent.action.GET_CONTENT");


			putConst("ACTION_PACKAGE_DATA_CLEARED", this, "android.intent.action.PACKAGE_DATA_CLEARED");


			putConst("ACTION_CHOOSER", this, "android.intent.action.CHOOSER");


			putConst("RESULT_FIRST_USER", this, 1);


			putConst("ACTION_GTALK_SERVICE_CONNECTED", this, "android.intent.action.GTALK_CONNECTED");


			putConst("EXTRA_INTENT", this, "android.intent.extra.INTENT");


			putConst("FLAG_SHOW_LIGHTS", this, 1);


			putConst("STREAM_NOTIFICATION", this, 5);


			putConst("ACTION_MEDIA_EJECT", this, "android.intent.action.MEDIA_EJECT");


			putConst("STREAM_SYSTEM", this, 1);


			putConst("PENDING_INTENT_FOR_ACTIVITY", this, 0);


			putConst("ACTION_ANSWER", this, "android.intent.action.ANSWER");


			putConst("SCREEN_ORIENTATION_NOSENSOR", this, 5);


			putConst("ACTION_SHUTDOWN", this, "android.intent.action.ACTION_SHUTDOWN");


			putConst("EXTRA_SHORTCUT_INTENT", this, "android.intent.extra.shortcut.INTENT");


			putConst("EXTRA_TEMPLATE", this, "android.intent.extra.TEMPLATE");


			putConst("START_NOT_STICKY", this, 2);


			putConst("FILL_IN_COMPONENT", this, 8);


			putConst("CATEGORY_UNIT_TEST", this, "android.intent.category.UNIT_TEST");


			putConst("RESULT_OK", this, -1);


			putConst("CATEGORY_TAB", this, "android.intent.category.TAB");


			putConst("ACTION_MEDIA_UNMOUNTABLE", this, "android.intent.action.MEDIA_UNMOUNTABLE");


			putConst("FLAG_ONLY_ALERT_ONCE", this, 8);


			putConst("DEFAULT_SOUND", this, 1);


			putConst("DEFAULT_VIBRATE", this, 2);


			putConst("ACTION_SEND_MULTIPLE", this, "android.intent.action.SEND_MULTIPLE");


			putConst("ACTION_MEDIA_CHECKING", this, "android.intent.action.MEDIA_CHECKING");


			putConst("CATEGORY_HOME", this, "android.intent.category.HOME");


			putConst("FLAG_ACTIVITY_NEW_TASK", this, 268435456);


			putConst("ACTION_CREATE_SHORTCUT", this, "android.intent.action.CREATE_SHORTCUT");


			putConst("EXTRA_TITLE", this, "android.intent.extra.TITLE");


			putConst("ACTION_HEADSET_PLUG", this, "android.intent.action.HEADSET_PLUG");


			putConst("ACTION_PROVIDER_CHANGED", this, "android.intent.action.PROVIDER_CHANGED");


			putConst("FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET", this, 524288);


			putConst("FLAG_NO_CREATE", this, 536870912);


			putConst("ACTION_MEDIA_SHARED", this, "android.intent.action.MEDIA_SHARED");


			putConst("FLAG_ACTIVITY_NO_ANIMATION", this, 65536);


			putConst("SHOW_AS_ACTION_NEVER", this, 0);


			putConst("FLAG_RECEIVER_REGISTERED_ONLY", this, 1073741824);


			putConst("FLAG_DEBUG_LOG_RESOLUTION", this, 8);


			putConst("SCREEN_ORIENTATION_UNSPECIFIED", this, -1);


			putConst("ACTION_UID_REMOVED", this, "android.intent.action.UID_REMOVED");


			putConst("ACTION_PACKAGE_RESTARTED", this, "android.intent.action.PACKAGE_RESTARTED");


			putConst("ACTION_WEB_SEARCH", this, "android.intent.action.WEB_SEARCH");


			putConst("FLAG_ACTIVITY_MULTIPLE_TASK", this, 134217728);


			putConst("ACTION_DIAL", this, "android.intent.action.DIAL");


			putConst("ACTION_PACKAGE_CHANGED", this, "android.intent.action.PACKAGE_CHANGED");


			putConst("ACTION_SEND", this, "android.intent.action.SEND");


			putConst("ACTION_PACKAGE_REMOVED", this, "android.intent.action.PACKAGE_REMOVED");


			putConst("RESULT_CANCELED", this, 0);


			putConst("FLAG_ACTIVITY_SINGLE_TOP", this, 536870912);


			putConst("CATEGORY_DEFAULT", this, "android.intent.category.DEFAULT");


			putConst("FLAG_ACTIVITY_FORWARD_RESULT", this, 33554432);


			putConst("START_REDELIVER_INTENT", this, 3);


			putConst("FLAG_ACTIVITY_NO_HISTORY", this, 1073741824);


			putConst("ACTION_DEVICE_STORAGE_LOW", this, "android.intent.action.DEVICE_STORAGE_LOW");


			putConst("ACTION_ALL_APPS", this, "android.intent.action.ALL_APPS");


			putConst("ACTION_INSERT_OR_EDIT", this, "android.intent.action.INSERT_OR_EDIT");


			putConst("ACTION_PICK", this, "android.intent.action.PICK");


			putConst("FLAG_UPDATE_CURRENT", this, 134217728);


			putConst("CATEGORY_ALTERNATIVE", this, "android.intent.category.ALTERNATIVE");


			putConst("ACTION_MEDIA_REMOVED", this, "android.intent.action.MEDIA_REMOVED");


			putConst("STREAM_MUSIC", this, 3);


			putConst("ACTION_DEFAULT", this, "android.intent.action.VIEW");


			putConst("EXTRA_UID", this, "android.intent.extra.UID");


			putConst("SCREEN_ORIENTATION_PORTRAIT", this, 1);


			putConst("PENDING_INTENT_MAX_VALUE", this, 2);


			putConst("FILL_IN_ACTION", this, 1);


			putConst("ACTION_SEARCH", this, "android.intent.action.SEARCH");


			putConst("ACTION_MEDIA_MOUNTED", this, "android.intent.action.MEDIA_MOUNTED");


			putConst("EXTRA_REPLACING", this, "android.intent.extra.REPLACING");


			putConst("CATEGORY_PREFERENCE", this, "android.intent.category.PREFERENCE");


			putConst("ACTION_POWER_CONNECTED", this, "android.intent.action.ACTION_POWER_CONNECTED");


			putConst("ACTION_DELETE", this, "android.intent.action.DELETE");


			putConst("EXTRA_STREAM", this, "android.intent.extra.STREAM");


			putConst("ACTION_WALLPAPER_CHANGED", this, "android.intent.action.WALLPAPER_CHANGED");


			putConst("ACTION_TIME_CHANGED", this, "android.intent.action.TIME_SET");


			putConst("ACTION_MEDIA_NOFS", this, "android.intent.action.MEDIA_NOFS");


			putConst("ACTION_MANAGE_PACKAGE_STORAGE", this, "android.intent.action.MANAGE_PACKAGE_STORAGE");


			putConst("CATEGORY_DEVELOPMENT_PREFERENCE", this, "android.intent.category.DEVELOPMENT_PREFERENCE");


			putConst("ACTION_CAMERA_BUTTON", this, "android.intent.action.CAMERA_BUTTON");


			putConst("EXTRA_BCC", this, "android.intent.extra.BCC");


			putConst("FLAG_ACTIVITY_NO_USER_ACTION", this, 262144);


			putConst("FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS", this, 8388608);


			putConst("SHOW_AS_ACTION_WITH_TEXT", this, 4);


			putConst("FLAG_INSISTENT", this, 4);


			putConst("ACTION_MEDIA_UNMOUNTED", this, "android.intent.action.MEDIA_UNMOUNTED");


			putConst("PENDING_INTENT_FOR_BROADCAST", this, 2);


			putConst("URI_INTENT_SCHEME", this, 1);


			putConst("ACTION_RUN", this, "android.intent.action.RUN");


			putConst("EXTRA_KEY_EVENT", this, "android.intent.extra.KEY_EVENT");


			putConst("FLAG_FROM_BACKGROUND", this, 4);


			putConst("ACTION_SENDTO", this, "android.intent.action.SENDTO");


			putConst("ACTION_BATTERY_CHANGED", this, "android.intent.action.BATTERY_CHANGED");


			putConst("ACTION_PACKAGE_ADDED", this, "android.intent.action.PACKAGE_ADDED");


			putConst("STREAM_VOICE_CALL", this, 0);


			putConst("ACTION_CALL", this, "android.intent.action.CALL");


			putConst("SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW", this, 8);


			putConst("ACTION_MEDIA_SCANNER_STARTED", this, "android.intent.action.MEDIA_SCANNER_STARTED");


			putConst("STREAM_DEFAULT", this, -1);


			putConst("EXTRA_PHONE_NUMBER", this, "android.intent.extra.PHONE_NUMBER");

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
	public Object createServiceIntent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createServiceIntent()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		org.appcelerator.titanium.proxy.IntentProxy javaResult = proxy.createServiceIntent(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void stopService(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "stopService()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("stopService: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.IntentProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.IntentProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.stopService(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void startService(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "startService()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("startService: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.IntentProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.IntentProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.startService(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object isServiceRunning(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isServiceRunning()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("isServiceRunning: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.IntentProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.IntentProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		boolean javaResult = proxy.isServiceRunning(arg0);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createIntentChooser(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createIntentChooser()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("createIntentChooser: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.IntentProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.IntentProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		org.appcelerator.titanium.proxy.IntentProxy javaResult = proxy.createIntentChooser(arg0, arg1);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createIntent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createIntent()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		org.appcelerator.titanium.proxy.IntentProxy javaResult = proxy.createIntent(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createService(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createService()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("createService: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.IntentProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.IntentProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		org.appcelerator.titanium.proxy.ServiceProxy javaResult = proxy.createService(arg0);

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
		Id_createServiceIntent = 2,
		Id_stopService = 3,
		Id_startService = 4,
		Id_isServiceRunning = 5,
		Id_createIntentChooser = 6,
		Id_createIntent = 7,
		Id_createService = 8,
		Id_createTiActivityWindow = 9,
				Id_createPendingIntent = 10,
				Id_createRemoteViews = 11,
				Id_createNotification = 12
		;
		

	public static final int MAX_PROTOTYPE_ID = 12;

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
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='s') { X="stopService";id=Id_stopService; }
                break L;
            case 12: c=s.charAt(0);
                if (c=='c') { X="createIntent";id=Id_createIntent; }
                else if (c=='s') { X="startService";id=Id_startService; }
                break L;
            case 13: X="createService";id=Id_createService; break L;
            case 16: X="isServiceRunning";id=Id_isServiceRunning; break L;
            case 17: X="createRemoteViews";id=Id_createRemoteViews; break L;
            case 18: X="createNotification";id=Id_createNotification; break L;
            case 19: c=s.charAt(6);
                if (c=='I') { X="createIntentChooser";id=Id_createIntentChooser; }
                else if (c=='P') { X="createPendingIntent";id=Id_createPendingIntent; }
                else if (c=='S') { X="createServiceIntent";id=Id_createServiceIntent; }
                break L;
            case 22: X="createTiActivityWindow";id=Id_createTiActivityWindow; break L;
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
			case Id_createServiceIntent:
				arity = 1;
				name = "createServiceIntent";
				break;
			case Id_stopService:
				arity = 1;
				name = "stopService";
				break;
			case Id_startService:
				arity = 1;
				name = "startService";
				break;
			case Id_isServiceRunning:
				arity = 1;
				name = "isServiceRunning";
				break;
			case Id_createIntentChooser:
				arity = 2;
				name = "createIntentChooser";
				break;
			case Id_createIntent:
				arity = 1;
				name = "createIntent";
				break;
			case Id_createService:
				arity = 1;
				name = "createService";
				break;
			case Id_createTiActivityWindow:
				arity = 1;
				name = "createTiActivityWindow";
				break;
			case Id_createPendingIntent:
				arity = 1;
				name = "createPendingIntent";
				break;
			case Id_createRemoteViews:
				arity = 1;
				name = "createRemoteViews";
				break;
			case Id_createNotification:
				arity = 1;
				name = "createNotification";
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
			case Id_createServiceIntent:
				return createServiceIntent(cx, thisObj, args);
				
			case Id_stopService:
				 stopService(cx, thisObj, args);
				return Undefined.instance;
			case Id_startService:
				 startService(cx, thisObj, args);
				return Undefined.instance;
			case Id_isServiceRunning:
				return isServiceRunning(cx, thisObj, args);
				
			case Id_createIntentChooser:
				return createIntentChooser(cx, thisObj, args);
				
			case Id_createIntent:
				return createIntent(cx, thisObj, args);
				
			case Id_createService:
				return createService(cx, thisObj, args);
				
			case Id_createTiActivityWindow:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"org.appcelerator.titanium.proxy.TiActivityWindowProxy", args);
			case Id_createPendingIntent:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.android.PendingIntentProxy", args);
			case Id_createRemoteViews:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.android.RemoteViewsProxy", args);
			case Id_createNotification:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.android.notificationmanager.NotificationProxy", args);
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

	// Child APIs
	private static final int

		Id_Environment = 2
		,		
		Id_NotificationManager = 3
		,		
		Id_RemoteViews = 4
		,		
		Id_TiActivityWindow = 5
		,		
		Id_PendingIntent = 6
		,		
		Id_Calendar = 7
		,		
		Id_Notification = 8
		;

	public static final int MAX_INSTANCE_ID = 8;

	@Override
	protected int getMaxInstanceId()
	{
		return MAX_INSTANCE_ID;
	}

	@Override
	protected int findInstanceIdInfo(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:22 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 1: if (s.charAt(0)=='R') {id=Id_R; break L0;} break L;
            case 8: X="Calendar";id=Id_Calendar; break L;
            case 11: c=s.charAt(0);
                if (c=='E') { X="Environment";id=Id_Environment; }
                else if (c=='R') { X="RemoteViews";id=Id_RemoteViews; }
                break L;
            case 12: X="Notification";id=Id_Notification; break L;
            case 13: X="PendingIntent";id=Id_PendingIntent; break L;
            case 16: X="TiActivityWindow";id=Id_TiActivityWindow; break L;
            case 19: X="NotificationManager";id=Id_NotificationManager; break L;
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
			case Id_R:
				return "R"; 
			case Id_Environment:
				return "Environment";
			case Id_NotificationManager:
				return "NotificationManager";
			case Id_RemoteViews:
				return "RemoteViews";
			case Id_TiActivityWindow:
				return "TiActivityWindow";
			case Id_PendingIntent:
				return "PendingIntent";
			case Id_Calendar:
				return "Calendar";
			case Id_Notification:
				return "Notification";
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
			case Id_Environment:
				if (proxy.API_Environment == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Environment = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.android.EnvironmentModule", ti.modules.titanium.android.EnvironmentModulePrototype.class); 
				}
				return proxy.API_Environment;
			case Id_NotificationManager:
				if (proxy.API_NotificationManager == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_NotificationManager = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.android.notificationmanager.NotificationManagerModule", ti.modules.titanium.android.notificationmanager.NotificationManagerModulePrototype.class); 
				}
				return proxy.API_NotificationManager;
			case Id_RemoteViews:
				if (proxy.API_RemoteViews == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_RemoteViews = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.android.RemoteViewsProxy", ti.modules.titanium.android.RemoteViewsProxyPrototype.class); 
				}
				return proxy.API_RemoteViews;
			case Id_TiActivityWindow:
				if (proxy.API_TiActivityWindow == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TiActivityWindow = KrollBindings.getProxyBinding(context, scope,
						"org.appcelerator.titanium.proxy.TiActivityWindowProxy", org.appcelerator.titanium.proxy.TiActivityWindowProxyPrototype.class); 
				}
				return proxy.API_TiActivityWindow;
			case Id_PendingIntent:
				if (proxy.API_PendingIntent == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_PendingIntent = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.android.PendingIntentProxy", ti.modules.titanium.android.PendingIntentProxyPrototype.class); 
				}
				return proxy.API_PendingIntent;
			case Id_Calendar:
				if (proxy.API_Calendar == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Calendar = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.android.calendar.CalendarModule", ti.modules.titanium.android.calendar.CalendarModulePrototype.class); 
				}
				return proxy.API_Calendar;
			case Id_Notification:
				if (proxy.API_Notification == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Notification = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.android.notificationmanager.NotificationProxy", ti.modules.titanium.android.notificationmanager.NotificationProxyPrototype.class); 
				}
				return proxy.API_Notification;
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
			case Id_Environment:
				if (value instanceof Proxy) {
					proxy.API_Environment = value;
				} else {
					defineProperty(original, "Environment", value, 0);
				}
				break;
			case Id_NotificationManager:
				if (value instanceof Proxy) {
					proxy.API_NotificationManager = value;
				} else {
					defineProperty(original, "NotificationManager", value, 0);
				}
				break;
			case Id_RemoteViews:
				if (value instanceof Proxy) {
					proxy.API_RemoteViews = value;
				} else {
					defineProperty(original, "RemoteViews", value, 0);
				}
				break;
			case Id_TiActivityWindow:
				if (value instanceof Proxy) {
					proxy.API_TiActivityWindow = value;
				} else {
					defineProperty(original, "TiActivityWindow", value, 0);
				}
				break;
			case Id_PendingIntent:
				if (value instanceof Proxy) {
					proxy.API_PendingIntent = value;
				} else {
					defineProperty(original, "PendingIntent", value, 0);
				}
				break;
			case Id_Calendar:
				if (value instanceof Proxy) {
					proxy.API_Calendar = value;
				} else {
					defineProperty(original, "Calendar", value, 0);
				}
				break;
			case Id_Notification:
				if (value instanceof Proxy) {
					proxy.API_Notification = value;
				} else {
					defineProperty(original, "Notification", value, 0);
				}
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
