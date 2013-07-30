/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package org.appcelerator.titanium.proxy;

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

import org.appcelerator.titanium.proxy.ActivityProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class ActivityProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 2775277516410258682L;

	private static final String TAG = "ActivityProxyPrototype";
	private static final String CLASS_TAG = "ActivityProxy";
	private static ActivityProxyPrototype activityProxyPrototype;


	public static ActivityProxyPrototype getProxyPrototype()
	{
		return activityProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		activityProxyPrototype = null;
	}

	public ActivityProxyPrototype()
	{
		if (activityProxyPrototype == null && getClass().equals(ActivityProxyPrototype.class)) {
			activityProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == activityProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return activityProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ActivityProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object startNextMatchingActivity(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "startNextMatchingActivity()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("startNextMatchingActivity: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.IntentProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.IntentProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		boolean javaResult = proxy.startNextMatchingActivity(arg0);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getDir(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDir()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("getDir: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;

		java.lang.String javaResult = proxy.getDir(arg0, arg1);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void openOptionsMenu(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "openOptionsMenu()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();

		proxy.openOptionsMenu();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getWindow(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getWindow()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.proxy.TiWindowProxy javaResult = proxy.getWindow();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object startActivityIfNeeded(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "startActivityIfNeeded()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("startActivityIfNeeded: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.IntentProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.IntentProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;

		boolean javaResult = proxy.startActivityIfNeeded(arg0, arg1);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void startActivityFromChild(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "startActivityFromChild()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("startActivityFromChild: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.ActivityProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.ActivityProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		if (!(args[1] instanceof Proxy) && args[1] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.IntentProxy arg1;
		arg1 = (org.appcelerator.titanium.proxy.IntentProxy) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;
		int arg2;
		arg2 = (int) TypeConverter.jsObjectToJavaInt(args[2], thisObj) ;

		proxy.startActivityFromChild(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setRequestedOrientation(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setRequestedOrientation()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setRequestedOrientation: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setRequestedOrientation(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void finish(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "finish()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();

		proxy.finish();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getIntent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getIntent()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.proxy.IntentProxy javaResult = proxy.getIntent();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void startActivityForResult(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "startActivityForResult()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("startActivityForResult: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.IntentProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.IntentProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		org.appcelerator.kroll.KrollFunction arg1;
		arg1 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;

		proxy.startActivityForResult(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void invalidateOptionsMenu(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "invalidateOptionsMenu()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();

		proxy.invalidateOptionsMenu();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setResult(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setResult()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setResult: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		org.appcelerator.titanium.proxy.IntentProxy arg1;
		if (args.length <= 1) {
			arg1 = null;
		} else {
		arg1 = (org.appcelerator.titanium.proxy.IntentProxy) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;
		}

		proxy.setResult(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getActionBar(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getActionBar()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.proxy.ActionBarProxy javaResult = proxy.getActionBar();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void startActivity(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "startActivity()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("startActivity: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.IntentProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.IntentProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.startActivity(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getString(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getString()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getString: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
	int length = args.length - 1;
	if (length < 0) {
		length = 0;
	}

	Object[] arg1 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg1[i] = TypeConverter.jsObjectToJavaObject(args[i+1], this);
	}

		java.lang.String javaResult = proxy.getString(arg0, arg1);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getDecorView(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDecorView()", Log.DEBUG_MODE);

		try {
		ActivityProxy proxy = (ActivityProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.proxy.DecorViewProxy javaResult = proxy.getDecorView();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public void setter_requestedOrientation(Object value)
	{
		Log.d(TAG, "set requestedOrientation", Log.DEBUG_MODE);
		ActivityProxy proxy = (ActivityProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setRequestedOrientation(arg0);
		//proxy.setProperty("requestedOrientation", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Proxy getter_window()
	{
		Log.d(TAG, "get window", Log.DEBUG_MODE);
		ActivityProxy proxy = (ActivityProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.proxy.TiWindowProxy javaResult = proxy.getWindow();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Proxy getter_actionBar()
	{
		Log.d(TAG, "get actionBar", Log.DEBUG_MODE);
		ActivityProxy proxy = (ActivityProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.proxy.ActionBarProxy javaResult = proxy.getActionBar();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Proxy getter_intent()
	{
		Log.d(TAG, "get intent", Log.DEBUG_MODE);
		ActivityProxy proxy = (ActivityProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.proxy.IntentProxy javaResult = proxy.getIntent();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getOnCreateOptionsMenu = 2,
		Id_setOnCreateOptionsMenu = 3,
		Id_getOnPrepareOptionsMenu = 4,
		Id_setOnPrepareOptionsMenu = 5,
		// Method IDs
		Id_startNextMatchingActivity = 6,
		Id_getDir = 7,
		Id_openOptionsMenu = 8,
		Id_getWindow = 9,
		Id_startActivityIfNeeded = 10,
		Id_startActivityFromChild = 11,
		Id_setRequestedOrientation = 12,
		Id_finish = 13,
		Id_getIntent = 14,
		Id_startActivityForResult = 15,
		Id_invalidateOptionsMenu = 16,
		Id_setResult = 17,
		Id_getActionBar = 18,
		Id_startActivity = 19,
		Id_getString = 20,
		Id_getDecorView = 21
;
		

	public static final int MAX_PROTOTYPE_ID = 21;

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
            case 6: c=s.charAt(0);
                if (c=='f') { X="finish";id=Id_finish; }
                else if (c=='g') { X="getDir";id=Id_getDir; }
                break L;
            case 9: switch (s.charAt(3)) {
                case 'I': X="getIntent";id=Id_getIntent; break L;
                case 'R': X="setResult";id=Id_setResult; break L;
                case 'S': X="getString";id=Id_getString; break L;
                case 'W': X="getWindow";id=Id_getWindow; break L;
                } break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: c=s.charAt(3);
                if (c=='A') { X="getActionBar";id=Id_getActionBar; }
                else if (c=='D') { X="getDecorView";id=Id_getDecorView; }
                break L;
            case 13: X="startActivity";id=Id_startActivity; break L;
            case 15: X="openOptionsMenu";id=Id_openOptionsMenu; break L;
            case 21: c=s.charAt(0);
                if (c=='i') { X="invalidateOptionsMenu";id=Id_invalidateOptionsMenu; }
                else if (c=='s') { X="startActivityIfNeeded";id=Id_startActivityIfNeeded; }
                break L;
            case 22: c=s.charAt(14);
                if (c=='i') {
                    c=s.charAt(0);
                    if (c=='g') { X="getOnCreateOptionsMenu";id=Id_getOnCreateOptionsMenu; }
                    else if (c=='s') { X="setOnCreateOptionsMenu";id=Id_setOnCreateOptionsMenu; }
                }
                else if (c=='o') { X="startActivityForResult";id=Id_startActivityForResult; }
                else if (c=='r') { X="startActivityFromChild";id=Id_startActivityFromChild; }
                break L;
            case 23: c=s.charAt(0);
                if (c=='g') { X="getOnPrepareOptionsMenu";id=Id_getOnPrepareOptionsMenu; }
                else if (c=='s') {
                    c=s.charAt(22);
                    if (c=='n') { X="setRequestedOrientation";id=Id_setRequestedOrientation; }
                    else if (c=='u') { X="setOnPrepareOptionsMenu";id=Id_setOnPrepareOptionsMenu; }
                }
                break L;
            case 25: X="startNextMatchingActivity";id=Id_startNextMatchingActivity; break L;
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
			case Id_getOnCreateOptionsMenu:
				arity = 0;
				name = "getOnCreateOptionsMenu";
				break;
			case Id_setOnCreateOptionsMenu:
				arity = 1;
				name = "setOnCreateOptionsMenu";
				break;
			case Id_getOnPrepareOptionsMenu:
				arity = 0;
				name = "getOnPrepareOptionsMenu";
				break;
			case Id_setOnPrepareOptionsMenu:
				arity = 1;
				name = "setOnPrepareOptionsMenu";
				break;
			case Id_startNextMatchingActivity:
				arity = 1;
				name = "startNextMatchingActivity";
				break;
			case Id_getDir:
				arity = 2;
				name = "getDir";
				break;
			case Id_openOptionsMenu:
				arity = 0;
				name = "openOptionsMenu";
				break;
			case Id_getWindow:
				arity = 0;
				name = "getWindow";
				break;
			case Id_startActivityIfNeeded:
				arity = 2;
				name = "startActivityIfNeeded";
				break;
			case Id_startActivityFromChild:
				arity = 3;
				name = "startActivityFromChild";
				break;
			case Id_setRequestedOrientation:
				arity = 1;
				name = "setRequestedOrientation";
				break;
			case Id_finish:
				arity = 0;
				name = "finish";
				break;
			case Id_getIntent:
				arity = 0;
				name = "getIntent";
				break;
			case Id_startActivityForResult:
				arity = 2;
				name = "startActivityForResult";
				break;
			case Id_invalidateOptionsMenu:
				arity = 0;
				name = "invalidateOptionsMenu";
				break;
			case Id_setResult:
				arity = 2;
				name = "setResult";
				break;
			case Id_getActionBar:
				arity = 0;
				name = "getActionBar";
				break;
			case Id_startActivity:
				arity = 1;
				name = "startActivity";
				break;
			case Id_getString:
				arity = 2;
				name = "getString";
				break;
			case Id_getDecorView:
				arity = 0;
				name = "getDecorView";
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

		while (thisObj != null && !(thisObj instanceof ActivityProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ActivityProxyPrototype proxy = (ActivityProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getOnCreateOptionsMenu:
				return proxy.getProperty("onCreateOptionsMenu");
			case Id_setOnCreateOptionsMenu:
				proxy.setProperty("onCreateOptionsMenu", args[0]);
				proxy.onPropertyChanged("onCreateOptionsMenu", args[0]);
				return Undefined.instance;
			case Id_getOnPrepareOptionsMenu:
				return proxy.getProperty("onPrepareOptionsMenu");
			case Id_setOnPrepareOptionsMenu:
				proxy.setProperty("onPrepareOptionsMenu", args[0]);
				proxy.onPropertyChanged("onPrepareOptionsMenu", args[0]);
				return Undefined.instance;
			case Id_startNextMatchingActivity:
				return startNextMatchingActivity(cx, thisObj, args);
				
			case Id_getDir:
				return getDir(cx, thisObj, args);
				
			case Id_openOptionsMenu:
				 openOptionsMenu(cx, thisObj, args);
				return Undefined.instance;
			case Id_getWindow:
				return getWindow(cx, thisObj, args);
				
			case Id_startActivityIfNeeded:
				return startActivityIfNeeded(cx, thisObj, args);
				
			case Id_startActivityFromChild:
				 startActivityFromChild(cx, thisObj, args);
				return Undefined.instance;
			case Id_setRequestedOrientation:
				 setRequestedOrientation(cx, thisObj, args);
				return Undefined.instance;
			case Id_finish:
				 finish(cx, thisObj, args);
				return Undefined.instance;
			case Id_getIntent:
				return getIntent(cx, thisObj, args);
				
			case Id_startActivityForResult:
				 startActivityForResult(cx, thisObj, args);
				return Undefined.instance;
			case Id_invalidateOptionsMenu:
				 invalidateOptionsMenu(cx, thisObj, args);
				return Undefined.instance;
			case Id_setResult:
				 setResult(cx, thisObj, args);
				return Undefined.instance;
			case Id_getActionBar:
				return getActionBar(cx, thisObj, args);
				
			case Id_startActivity:
				 startActivity(cx, thisObj, args);
				return Undefined.instance;
			case Id_getString:
				return getString(cx, thisObj, args);
				
			case Id_getDecorView:
				return getDecorView(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_requestedOrientation = 1
		,		
		Id_window = 2
		,		
		Id_actionBar = 3
		,		
		Id_intent = 4
		;

	// Property accessor IDs
	private static final int

		Id_onCreateOptionsMenu = 5
		,		
		Id_onPrepareOptionsMenu = 6
		;

;

	public static final int MAX_INSTANCE_ID = 6;

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
            case 6: c=s.charAt(0);
                if (c=='i') { X="intent";id=Id_intent; }
                else if (c=='w') { X="window";id=Id_window; }
                break L;
            case 9: X="actionBar";id=Id_actionBar; break L;
            case 19: X="onCreateOptionsMenu";id=Id_onCreateOptionsMenu; break L;
            case 20: c=s.charAt(0);
                if (c=='o') { X="onPrepareOptionsMenu";id=Id_onPrepareOptionsMenu; }
                else if (c=='r') { X="requestedOrientation";id=Id_requestedOrientation; }
                break L;
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
			case Id_requestedOrientation:
				return "requestedOrientation"; 
			case Id_window:
				return "window"; 
			case Id_actionBar:
				return "actionBar"; 
			case Id_intent:
				return "intent"; 
			case Id_onCreateOptionsMenu:
				return "onCreateOptionsMenu";
			case Id_onPrepareOptionsMenu:
				return "onPrepareOptionsMenu";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ActivityProxyPrototype proxy = this;
		while (start != null && !(start instanceof ActivityProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ActivityProxyPrototype) {
			proxy = (ActivityProxyPrototype) start;
		}

		switch (id) {
			case Id_requestedOrientation:
				return proxy.getProperty("requestedOrientation");
			case Id_window:
				return proxy.getter_window();
			case Id_actionBar:
				return proxy.getter_actionBar();
			case Id_intent:
				return proxy.getter_intent();
			case Id_onCreateOptionsMenu:
				return proxy.getProperty("onCreateOptionsMenu");
			case Id_onPrepareOptionsMenu:
				return proxy.getProperty("onPrepareOptionsMenu");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ActivityProxyPrototype proxy = this;
		while (start != null && !(start instanceof ActivityProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ActivityProxyPrototype) {
			proxy = (ActivityProxyPrototype) start;
		}

		switch (id) {
			case Id_requestedOrientation:
				proxy.setter_requestedOrientation(value);
				break; 
			case Id_window:
				proxy.setProperty("window", value);
				proxy.onPropertyChanged("window", value);
				break; 
			case Id_actionBar:
				proxy.setProperty("actionBar", value);
				proxy.onPropertyChanged("actionBar", value);
				break; 
			case Id_intent:
				proxy.setProperty("intent", value);
				proxy.onPropertyChanged("intent", value);
				break; 
			case Id_onCreateOptionsMenu:
				proxy.setProperty("onCreateOptionsMenu", value);
				proxy.onPropertyChanged("onCreateOptionsMenu", value);
				break;
			case Id_onPrepareOptionsMenu:
				proxy.setProperty("onPrepareOptionsMenu", value);
				proxy.onPropertyChanged("onPrepareOptionsMenu", value);
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
