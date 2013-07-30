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

import org.appcelerator.titanium.proxy.ActionBarProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class ActionBarProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 4482116550622240000L;

	private static final String TAG = "ActionBarProxyPrototype";
	private static final String CLASS_TAG = "ActionBarProxy";
	private static ActionBarProxyPrototype actionBarProxyPrototype;


	public static ActionBarProxyPrototype getProxyPrototype()
	{
		return actionBarProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		actionBarProxyPrototype = null;
	}

	public ActionBarProxyPrototype()
	{
		if (actionBarProxyPrototype == null && getClass().equals(ActionBarProxyPrototype.class)) {
			actionBarProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == actionBarProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return actionBarProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ActionBarProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void setLogo(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setLogo()", Log.DEBUG_MODE);

		try {
		ActionBarProxy proxy = (ActionBarProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setLogo: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setLogo(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setBackgroundImage(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setBackgroundImage()", Log.DEBUG_MODE);

		try {
		ActionBarProxy proxy = (ActionBarProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setBackgroundImage: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setBackgroundImage(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void hide(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "hide()", Log.DEBUG_MODE);

		try {
		ActionBarProxy proxy = (ActionBarProxy) ((Proxy) thisObj).getProxy();

		proxy.hide();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setTitle(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setTitle()", Log.DEBUG_MODE);

		try {
		ActionBarProxy proxy = (ActionBarProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setTitle: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setTitle(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getTitle(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTitle()", Log.DEBUG_MODE);

		try {
		ActionBarProxy proxy = (ActionBarProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getTitle();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void show(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "show()", Log.DEBUG_MODE);

		try {
		ActionBarProxy proxy = (ActionBarProxy) ((Proxy) thisObj).getProxy();

		proxy.show();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setDisplayHomeAsUp(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setDisplayHomeAsUp()", Log.DEBUG_MODE);

		try {
		ActionBarProxy proxy = (ActionBarProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setDisplayHomeAsUp: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		proxy.setDisplayHomeAsUp(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setIcon(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setIcon()", Log.DEBUG_MODE);

		try {
		ActionBarProxy proxy = (ActionBarProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setIcon: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setIcon(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public void setter_logo(Object value)
	{
		Log.d(TAG, "set logo", Log.DEBUG_MODE);
		ActionBarProxy proxy = (ActionBarProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setLogo(arg0);
		//proxy.setProperty("logo", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_icon(Object value)
	{
		Log.d(TAG, "set icon", Log.DEBUG_MODE);
		ActionBarProxy proxy = (ActionBarProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setIcon(arg0);
		//proxy.setProperty("icon", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_title()
	{
		Log.d(TAG, "get title", Log.DEBUG_MODE);
		ActionBarProxy proxy = (ActionBarProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getTitle();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_title(Object value)
	{
		Log.d(TAG, "set title", Log.DEBUG_MODE);
		ActionBarProxy proxy = (ActionBarProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setTitle(arg0);
		//proxy.setProperty("title", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_displayHomeAsUp(Object value)
	{
		Log.d(TAG, "set displayHomeAsUp", Log.DEBUG_MODE);
		ActionBarProxy proxy = (ActionBarProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setDisplayHomeAsUp(arg0);
		//proxy.setProperty("displayHomeAsUp", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_backgroundImage(Object value)
	{
		Log.d(TAG, "set backgroundImage", Log.DEBUG_MODE);
		ActionBarProxy proxy = (ActionBarProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setBackgroundImage(arg0);
		//proxy.setProperty("backgroundImage", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getOnHomeIconItemSelected = 2,
		Id_setOnHomeIconItemSelected = 3,
		// Method IDs
		Id_setLogo = 4,
		Id_setBackgroundImage = 5,
		Id_hide = 6,
		Id_setTitle = 7,
		Id_getTitle = 8,
		Id_show = 9,
		Id_setDisplayHomeAsUp = 10,
		Id_setIcon = 11
;
		

	public static final int MAX_PROTOTYPE_ID = 11;

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
            case 4: c=s.charAt(0);
                if (c=='h') { X="hide";id=Id_hide; }
                else if (c=='s') { X="show";id=Id_show; }
                break L;
            case 7: c=s.charAt(3);
                if (c=='I') { X="setIcon";id=Id_setIcon; }
                else if (c=='L') { X="setLogo";id=Id_setLogo; }
                break L;
            case 8: c=s.charAt(0);
                if (c=='g') { X="getTitle";id=Id_getTitle; }
                else if (c=='s') { X="setTitle";id=Id_setTitle; }
                break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 18: c=s.charAt(3);
                if (c=='B') { X="setBackgroundImage";id=Id_setBackgroundImage; }
                else if (c=='D') { X="setDisplayHomeAsUp";id=Id_setDisplayHomeAsUp; }
                break L;
            case 25: c=s.charAt(0);
                if (c=='g') { X="getOnHomeIconItemSelected";id=Id_getOnHomeIconItemSelected; }
                else if (c=='s') { X="setOnHomeIconItemSelected";id=Id_setOnHomeIconItemSelected; }
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
			case Id_getOnHomeIconItemSelected:
				arity = 0;
				name = "getOnHomeIconItemSelected";
				break;
			case Id_setOnHomeIconItemSelected:
				arity = 1;
				name = "setOnHomeIconItemSelected";
				break;
			case Id_setLogo:
				arity = 1;
				name = "setLogo";
				break;
			case Id_setBackgroundImage:
				arity = 1;
				name = "setBackgroundImage";
				break;
			case Id_hide:
				arity = 0;
				name = "hide";
				break;
			case Id_setTitle:
				arity = 1;
				name = "setTitle";
				break;
			case Id_getTitle:
				arity = 0;
				name = "getTitle";
				break;
			case Id_show:
				arity = 0;
				name = "show";
				break;
			case Id_setDisplayHomeAsUp:
				arity = 1;
				name = "setDisplayHomeAsUp";
				break;
			case Id_setIcon:
				arity = 1;
				name = "setIcon";
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

		while (thisObj != null && !(thisObj instanceof ActionBarProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ActionBarProxyPrototype proxy = (ActionBarProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getOnHomeIconItemSelected:
				return proxy.getProperty("onHomeIconItemSelected");
			case Id_setOnHomeIconItemSelected:
				proxy.setProperty("onHomeIconItemSelected", args[0]);
				proxy.onPropertyChanged("onHomeIconItemSelected", args[0]);
				return Undefined.instance;
			case Id_setLogo:
				 setLogo(cx, thisObj, args);
				return Undefined.instance;
			case Id_setBackgroundImage:
				 setBackgroundImage(cx, thisObj, args);
				return Undefined.instance;
			case Id_hide:
				 hide(cx, thisObj, args);
				return Undefined.instance;
			case Id_setTitle:
				 setTitle(cx, thisObj, args);
				return Undefined.instance;
			case Id_getTitle:
				return getTitle(cx, thisObj, args);
				
			case Id_show:
				 show(cx, thisObj, args);
				return Undefined.instance;
			case Id_setDisplayHomeAsUp:
				 setDisplayHomeAsUp(cx, thisObj, args);
				return Undefined.instance;
			case Id_setIcon:
				 setIcon(cx, thisObj, args);
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

		Id_logo = 1
		,		
		Id_icon = 2
		,		
		Id_title = 3
		,		
		Id_displayHomeAsUp = 4
		,		
		Id_backgroundImage = 5
		;

	// Property accessor IDs
	private static final int

		Id_onHomeIconItemSelected = 6
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
            case 4: c=s.charAt(0);
                if (c=='i') { X="icon";id=Id_icon; }
                else if (c=='l') { X="logo";id=Id_logo; }
                break L;
            case 5: X="title";id=Id_title; break L;
            case 15: c=s.charAt(0);
                if (c=='b') { X="backgroundImage";id=Id_backgroundImage; }
                else if (c=='d') { X="displayHomeAsUp";id=Id_displayHomeAsUp; }
                break L;
            case 22: X="onHomeIconItemSelected";id=Id_onHomeIconItemSelected; break L;
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
			case Id_logo:
				return "logo"; 
			case Id_icon:
				return "icon"; 
			case Id_title:
				return "title"; 
			case Id_displayHomeAsUp:
				return "displayHomeAsUp"; 
			case Id_backgroundImage:
				return "backgroundImage"; 
			case Id_onHomeIconItemSelected:
				return "onHomeIconItemSelected";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ActionBarProxyPrototype proxy = this;
		while (start != null && !(start instanceof ActionBarProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ActionBarProxyPrototype) {
			proxy = (ActionBarProxyPrototype) start;
		}

		switch (id) {
			case Id_logo:
				return proxy.getProperty("logo");
			case Id_icon:
				return proxy.getProperty("icon");
			case Id_title:
				return proxy.getter_title();
			case Id_displayHomeAsUp:
				return proxy.getProperty("displayHomeAsUp");
			case Id_backgroundImage:
				return proxy.getProperty("backgroundImage");
			case Id_onHomeIconItemSelected:
				return proxy.getProperty("onHomeIconItemSelected");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ActionBarProxyPrototype proxy = this;
		while (start != null && !(start instanceof ActionBarProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ActionBarProxyPrototype) {
			proxy = (ActionBarProxyPrototype) start;
		}

		switch (id) {
			case Id_logo:
				proxy.setter_logo(value);
				break; 
			case Id_icon:
				proxy.setter_icon(value);
				break; 
			case Id_title:
				proxy.setter_title(value);
				break; 
			case Id_displayHomeAsUp:
				proxy.setter_displayHomeAsUp(value);
				break; 
			case Id_backgroundImage:
				proxy.setter_backgroundImage(value);
				break; 
			case Id_onHomeIconItemSelected:
				proxy.setProperty("onHomeIconItemSelected", value);
				proxy.onPropertyChanged("onHomeIconItemSelected", value);
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
