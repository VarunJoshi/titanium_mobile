/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.android.calendar;

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

import ti.modules.titanium.android.calendar.CalendarProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class CalendarProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -475449450037265828L;

	private static final String TAG = "CalendarProxyPrototype";
	private static final String CLASS_TAG = "CalendarProxy";
	private static CalendarProxyPrototype calendarProxyPrototype;


	public static CalendarProxyPrototype getProxyPrototype()
	{
		return calendarProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		calendarProxyPrototype = null;
	}

	public CalendarProxyPrototype()
	{
		if (calendarProxyPrototype == null && getClass().equals(CalendarProxyPrototype.class)) {
			calendarProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == calendarProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return calendarProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(CalendarProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getEventsInYear(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getEventsInYear()", Log.DEBUG_MODE);

		try {
		CalendarProxy proxy = (CalendarProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getEventsInYear: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		ti.modules.titanium.android.calendar.EventProxy[] javaResult = proxy.getEventsInYear(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getEventsBetweenDates(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getEventsBetweenDates()", Log.DEBUG_MODE);

		try {
		CalendarProxy proxy = (CalendarProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("getEventsBetweenDates: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.util.Date arg0;
		arg0 = (java.util.Date) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		java.util.Date arg1;
		arg1 = (java.util.Date) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;

		ti.modules.titanium.android.calendar.EventProxy[] javaResult = proxy.getEventsBetweenDates(arg0, arg1);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createEvent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createEvent()", Log.DEBUG_MODE);

		try {
		CalendarProxy proxy = (CalendarProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("createEvent: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		ti.modules.titanium.android.calendar.EventProxy javaResult = proxy.createEvent(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getEventById(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getEventById()", Log.DEBUG_MODE);

		try {
		CalendarProxy proxy = (CalendarProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getEventById: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		ti.modules.titanium.android.calendar.EventProxy javaResult = proxy.getEventById(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getHidden(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getHidden()", Log.DEBUG_MODE);

		try {
		CalendarProxy proxy = (CalendarProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getHidden();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getName()", Log.DEBUG_MODE);

		try {
		CalendarProxy proxy = (CalendarProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getName();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getSelected(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getSelected()", Log.DEBUG_MODE);

		try {
		CalendarProxy proxy = (CalendarProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getSelected();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getEventsInDate(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getEventsInDate()", Log.DEBUG_MODE);

		try {
		CalendarProxy proxy = (CalendarProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("getEventsInDate: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;
		int arg2;
		arg2 = (int) TypeConverter.jsObjectToJavaInt(args[2], thisObj) ;

		ti.modules.titanium.android.calendar.EventProxy[] javaResult = proxy.getEventsInDate(arg0, arg1, arg2);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getEventsInMonth(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getEventsInMonth()", Log.DEBUG_MODE);

		try {
		CalendarProxy proxy = (CalendarProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("getEventsInMonth: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;

		ti.modules.titanium.android.calendar.EventProxy[] javaResult = proxy.getEventsInMonth(arg0, arg1);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getId(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getId()", Log.DEBUG_MODE);

		try {
		CalendarProxy proxy = (CalendarProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getId();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public String getter_id()
	{
		Log.d(TAG, "get id", Log.DEBUG_MODE);
		CalendarProxy proxy = (CalendarProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getId();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Boolean getter_selected()
	{
		Log.d(TAG, "get selected", Log.DEBUG_MODE);
		CalendarProxy proxy = (CalendarProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getSelected();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public Boolean getter_hidden()
	{
		Log.d(TAG, "get hidden", Log.DEBUG_MODE);
		CalendarProxy proxy = (CalendarProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getHidden();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public String getter_name()
	{
		Log.d(TAG, "get name", Log.DEBUG_MODE);
		CalendarProxy proxy = (CalendarProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getName();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getEventsInYear = 2,
		Id_getEventsBetweenDates = 3,
		Id_createEvent = 4,
		Id_getEventById = 5,
		Id_getHidden = 6,
		Id_getName = 7,
		Id_getSelected = 8,
		Id_getEventsInDate = 9,
		Id_getEventsInMonth = 10,
		Id_getId = 11
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
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 5: X="getId";id=Id_getId; break L;
            case 7: X="getName";id=Id_getName; break L;
            case 9: X="getHidden";id=Id_getHidden; break L;
            case 11: c=s.charAt(1);
                if (c=='e') { X="getSelected";id=Id_getSelected; }
                else if (c=='o') { X="constructor";id=Id_constructor; }
                else if (c=='r') { X="createEvent";id=Id_createEvent; }
                break L;
            case 12: X="getEventById";id=Id_getEventById; break L;
            case 15: c=s.charAt(11);
                if (c=='D') { X="getEventsInDate";id=Id_getEventsInDate; }
                else if (c=='Y') { X="getEventsInYear";id=Id_getEventsInYear; }
                break L;
            case 16: X="getEventsInMonth";id=Id_getEventsInMonth; break L;
            case 21: X="getEventsBetweenDates";id=Id_getEventsBetweenDates; break L;
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
			case Id_getEventsInYear:
				arity = 1;
				name = "getEventsInYear";
				break;
			case Id_getEventsBetweenDates:
				arity = 2;
				name = "getEventsBetweenDates";
				break;
			case Id_createEvent:
				arity = 1;
				name = "createEvent";
				break;
			case Id_getEventById:
				arity = 1;
				name = "getEventById";
				break;
			case Id_getHidden:
				arity = 0;
				name = "getHidden";
				break;
			case Id_getName:
				arity = 0;
				name = "getName";
				break;
			case Id_getSelected:
				arity = 0;
				name = "getSelected";
				break;
			case Id_getEventsInDate:
				arity = 3;
				name = "getEventsInDate";
				break;
			case Id_getEventsInMonth:
				arity = 2;
				name = "getEventsInMonth";
				break;
			case Id_getId:
				arity = 0;
				name = "getId";
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

		while (thisObj != null && !(thisObj instanceof CalendarProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		CalendarProxyPrototype proxy = (CalendarProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getEventsInYear:
				return getEventsInYear(cx, thisObj, args);
				
			case Id_getEventsBetweenDates:
				return getEventsBetweenDates(cx, thisObj, args);
				
			case Id_createEvent:
				return createEvent(cx, thisObj, args);
				
			case Id_getEventById:
				return getEventById(cx, thisObj, args);
				
			case Id_getHidden:
				return getHidden(cx, thisObj, args);
				
			case Id_getName:
				return getName(cx, thisObj, args);
				
			case Id_getSelected:
				return getSelected(cx, thisObj, args);
				
			case Id_getEventsInDate:
				return getEventsInDate(cx, thisObj, args);
				
			case Id_getEventsInMonth:
				return getEventsInMonth(cx, thisObj, args);
				
			case Id_getId:
				return getId(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_id = 1
		,		
		Id_selected = 2
		,		
		Id_hidden = 3
		,		
		Id_name = 4
		;

;

;

	public static final int MAX_INSTANCE_ID = 4;

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
            L: switch (s.length()) {
            case 2: if (s.charAt(0)=='i' && s.charAt(1)=='d') {id=Id_id; break L0;} break L;
            case 4: X="name";id=Id_name; break L;
            case 6: X="hidden";id=Id_hidden; break L;
            case 8: X="selected";id=Id_selected; break L;
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
			case Id_id:
				return "id"; 
			case Id_selected:
				return "selected"; 
			case Id_hidden:
				return "hidden"; 
			case Id_name:
				return "name"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		CalendarProxyPrototype proxy = this;
		while (start != null && !(start instanceof CalendarProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof CalendarProxyPrototype) {
			proxy = (CalendarProxyPrototype) start;
		}

		switch (id) {
			case Id_id:
				return proxy.getter_id();
			case Id_selected:
				return proxy.getter_selected();
			case Id_hidden:
				return proxy.getter_hidden();
			case Id_name:
				return proxy.getter_name();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		CalendarProxyPrototype proxy = this;
		while (start != null && !(start instanceof CalendarProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof CalendarProxyPrototype) {
			proxy = (CalendarProxyPrototype) start;
		}

		switch (id) {
			case Id_id:
				proxy.setProperty("id", value);
				proxy.onPropertyChanged("id", value);
				break; 
			case Id_selected:
				proxy.setProperty("selected", value);
				proxy.onPropertyChanged("selected", value);
				break; 
			case Id_hidden:
				proxy.setProperty("hidden", value);
				proxy.onPropertyChanged("hidden", value);
				break; 
			case Id_name:
				proxy.setProperty("name", value);
				proxy.onPropertyChanged("name", value);
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
