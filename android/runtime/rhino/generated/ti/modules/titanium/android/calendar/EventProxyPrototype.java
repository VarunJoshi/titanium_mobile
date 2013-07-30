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

import ti.modules.titanium.android.calendar.EventProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class EventProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -5454811215637626687L;

	private static final String TAG = "EventProxyPrototype";
	private static final String CLASS_TAG = "EventProxy";
	private static EventProxyPrototype eventProxyPrototype;


	public static EventProxyPrototype getProxyPrototype()
	{
		return eventProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		eventProxyPrototype = null;
	}

	public EventProxyPrototype()
	{
		if (eventProxyPrototype == null && getClass().equals(EventProxyPrototype.class)) {
			eventProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == eventProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return eventProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(EventProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getStatus(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getStatus()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getStatus();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getHasAlarm(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getHasAlarm()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getHasAlarm();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAlerts(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAlerts()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.android.calendar.AlertProxy[] javaResult = proxy.getAlerts();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getRecurrenceDate(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getRecurrenceDate()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getRecurrenceDate();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getDescription(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDescription()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getDescription();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getVisibility(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getVisibility()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getVisibility();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createReminder(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createReminder()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("createReminder: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		ti.modules.titanium.android.calendar.ReminderProxy javaResult = proxy.createReminder(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getExtendedProperties(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getExtendedProperties()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.kroll.KrollDict javaResult = proxy.getExtendedProperties();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getRecurrenceRule(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getRecurrenceRule()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getRecurrenceRule();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getExtendedProperty(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getExtendedProperty()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getExtendedProperty: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		java.lang.String javaResult = proxy.getExtendedProperty(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getEnd(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getEnd()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		java.util.Date javaResult = proxy.getEnd();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getBegin(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getBegin()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		java.util.Date javaResult = proxy.getBegin();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getRecurrenceExceptionRule(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getRecurrenceExceptionRule()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getRecurrenceExceptionRule();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getLocation(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLocation()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getLocation();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createAlert(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createAlert()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("createAlert: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		ti.modules.titanium.android.calendar.AlertProxy javaResult = proxy.createAlert(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getHasExtendedProperties(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getHasExtendedProperties()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getHasExtendedProperties();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getReminders(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getReminders()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.android.calendar.ReminderProxy[] javaResult = proxy.getReminders();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getTitle(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTitle()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getTitle();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getRecurrenceExceptionDate(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getRecurrenceExceptionDate()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getRecurrenceExceptionDate();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAllDay(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAllDay()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getAllDay();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getLastDate(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLastDate()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		java.util.Date javaResult = proxy.getLastDate();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setExtendedProperty(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setExtendedProperty()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setExtendedProperty: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		proxy.setExtendedProperty(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getId(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getId()", Log.DEBUG_MODE);

		try {
		EventProxy proxy = (EventProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getId();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Boolean getter_hasExtendedProperties()
	{
		Log.d(TAG, "get hasExtendedProperties", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getHasExtendedProperties();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public Object getter_reminders()
	{
		Log.d(TAG, "get reminders", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.android.calendar.ReminderProxy[] javaResult = proxy.getReminders();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public String getter_recurrenceExceptionDate()
	{
		Log.d(TAG, "get recurrenceExceptionDate", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getRecurrenceExceptionDate();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Number getter_visibility()
	{
		Log.d(TAG, "get visibility", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getVisibility();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Number getter_status()
	{
		Log.d(TAG, "get status", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getStatus();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Boolean getter_allDay()
	{
		Log.d(TAG, "get allDay", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getAllDay();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public String getter_location()
	{
		Log.d(TAG, "get location", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getLocation();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_recurrenceExceptionRule()
	{
		Log.d(TAG, "get recurrenceExceptionRule", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getRecurrenceExceptionRule();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Object getter_lastDate()
	{
		Log.d(TAG, "get lastDate", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		java.util.Date javaResult = proxy.getLastDate();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Boolean getter_hasAlarm()
	{
		Log.d(TAG, "get hasAlarm", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getHasAlarm();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public Object getter_begin()
	{
		Log.d(TAG, "get begin", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		java.util.Date javaResult = proxy.getBegin();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public String getter_id()
	{
		Log.d(TAG, "get id", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getId();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_title()
	{
		Log.d(TAG, "get title", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getTitle();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_recurrenceDate()
	{
		Log.d(TAG, "get recurrenceDate", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getRecurrenceDate();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_description()
	{
		Log.d(TAG, "get description", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getDescription();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Object getter_alerts()
	{
		Log.d(TAG, "get alerts", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.android.calendar.AlertProxy[] javaResult = proxy.getAlerts();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public String getter_recurrenceRule()
	{
		Log.d(TAG, "get recurrenceRule", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getRecurrenceRule();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Object getter_end()
	{
		Log.d(TAG, "get end", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		java.util.Date javaResult = proxy.getEnd();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Object getter_extendedProperties()
	{
		Log.d(TAG, "get extendedProperties", Log.DEBUG_MODE);
		EventProxy proxy = (EventProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.kroll.KrollDict javaResult = proxy.getExtendedProperties();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getStatus = 2,
		Id_getHasAlarm = 3,
		Id_getAlerts = 4,
		Id_getRecurrenceDate = 5,
		Id_getDescription = 6,
		Id_getVisibility = 7,
		Id_createReminder = 8,
		Id_getExtendedProperties = 9,
		Id_getRecurrenceRule = 10,
		Id_getExtendedProperty = 11,
		Id_getEnd = 12,
		Id_getBegin = 13,
		Id_getRecurrenceExceptionRule = 14,
		Id_getLocation = 15,
		Id_createAlert = 16,
		Id_getHasExtendedProperties = 17,
		Id_getReminders = 18,
		Id_getTitle = 19,
		Id_getRecurrenceExceptionDate = 20,
		Id_getAllDay = 21,
		Id_getLastDate = 22,
		Id_setExtendedProperty = 23,
		Id_getId = 24
;
		

	public static final int MAX_PROTOTYPE_ID = 24;

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
            case 6: X="getEnd";id=Id_getEnd; break L;
            case 8: c=s.charAt(3);
                if (c=='B') { X="getBegin";id=Id_getBegin; }
                else if (c=='T') { X="getTitle";id=Id_getTitle; }
                break L;
            case 9: c=s.charAt(5);
                if (c=='a') { X="getStatus";id=Id_getStatus; }
                else if (c=='e') { X="getAlerts";id=Id_getAlerts; }
                else if (c=='l') { X="getAllDay";id=Id_getAllDay; }
                break L;
            case 11: switch (s.charAt(10)) {
                case 'e': X="getLastDate";id=Id_getLastDate; break L;
                case 'm': X="getHasAlarm";id=Id_getHasAlarm; break L;
                case 'n': X="getLocation";id=Id_getLocation; break L;
                case 'r': X="constructor";id=Id_constructor; break L;
                case 't': X="createAlert";id=Id_createAlert; break L;
                } break L;
            case 12: X="getReminders";id=Id_getReminders; break L;
            case 13: X="getVisibility";id=Id_getVisibility; break L;
            case 14: c=s.charAt(0);
                if (c=='c') { X="createReminder";id=Id_createReminder; }
                else if (c=='g') { X="getDescription";id=Id_getDescription; }
                break L;
            case 17: c=s.charAt(13);
                if (c=='D') { X="getRecurrenceDate";id=Id_getRecurrenceDate; }
                else if (c=='R') { X="getRecurrenceRule";id=Id_getRecurrenceRule; }
                break L;
            case 19: c=s.charAt(0);
                if (c=='g') { X="getExtendedProperty";id=Id_getExtendedProperty; }
                else if (c=='s') { X="setExtendedProperty";id=Id_setExtendedProperty; }
                break L;
            case 21: X="getExtendedProperties";id=Id_getExtendedProperties; break L;
            case 24: X="getHasExtendedProperties";id=Id_getHasExtendedProperties; break L;
            case 26: c=s.charAt(22);
                if (c=='D') { X="getRecurrenceExceptionDate";id=Id_getRecurrenceExceptionDate; }
                else if (c=='R') { X="getRecurrenceExceptionRule";id=Id_getRecurrenceExceptionRule; }
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
			case Id_getStatus:
				arity = 0;
				name = "getStatus";
				break;
			case Id_getHasAlarm:
				arity = 0;
				name = "getHasAlarm";
				break;
			case Id_getAlerts:
				arity = 0;
				name = "getAlerts";
				break;
			case Id_getRecurrenceDate:
				arity = 0;
				name = "getRecurrenceDate";
				break;
			case Id_getDescription:
				arity = 0;
				name = "getDescription";
				break;
			case Id_getVisibility:
				arity = 0;
				name = "getVisibility";
				break;
			case Id_createReminder:
				arity = 1;
				name = "createReminder";
				break;
			case Id_getExtendedProperties:
				arity = 0;
				name = "getExtendedProperties";
				break;
			case Id_getRecurrenceRule:
				arity = 0;
				name = "getRecurrenceRule";
				break;
			case Id_getExtendedProperty:
				arity = 1;
				name = "getExtendedProperty";
				break;
			case Id_getEnd:
				arity = 0;
				name = "getEnd";
				break;
			case Id_getBegin:
				arity = 0;
				name = "getBegin";
				break;
			case Id_getRecurrenceExceptionRule:
				arity = 0;
				name = "getRecurrenceExceptionRule";
				break;
			case Id_getLocation:
				arity = 0;
				name = "getLocation";
				break;
			case Id_createAlert:
				arity = 1;
				name = "createAlert";
				break;
			case Id_getHasExtendedProperties:
				arity = 0;
				name = "getHasExtendedProperties";
				break;
			case Id_getReminders:
				arity = 0;
				name = "getReminders";
				break;
			case Id_getTitle:
				arity = 0;
				name = "getTitle";
				break;
			case Id_getRecurrenceExceptionDate:
				arity = 0;
				name = "getRecurrenceExceptionDate";
				break;
			case Id_getAllDay:
				arity = 0;
				name = "getAllDay";
				break;
			case Id_getLastDate:
				arity = 0;
				name = "getLastDate";
				break;
			case Id_setExtendedProperty:
				arity = 2;
				name = "setExtendedProperty";
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

		while (thisObj != null && !(thisObj instanceof EventProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		EventProxyPrototype proxy = (EventProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getStatus:
				return getStatus(cx, thisObj, args);
				
			case Id_getHasAlarm:
				return getHasAlarm(cx, thisObj, args);
				
			case Id_getAlerts:
				return getAlerts(cx, thisObj, args);
				
			case Id_getRecurrenceDate:
				return getRecurrenceDate(cx, thisObj, args);
				
			case Id_getDescription:
				return getDescription(cx, thisObj, args);
				
			case Id_getVisibility:
				return getVisibility(cx, thisObj, args);
				
			case Id_createReminder:
				return createReminder(cx, thisObj, args);
				
			case Id_getExtendedProperties:
				return getExtendedProperties(cx, thisObj, args);
				
			case Id_getRecurrenceRule:
				return getRecurrenceRule(cx, thisObj, args);
				
			case Id_getExtendedProperty:
				return getExtendedProperty(cx, thisObj, args);
				
			case Id_getEnd:
				return getEnd(cx, thisObj, args);
				
			case Id_getBegin:
				return getBegin(cx, thisObj, args);
				
			case Id_getRecurrenceExceptionRule:
				return getRecurrenceExceptionRule(cx, thisObj, args);
				
			case Id_getLocation:
				return getLocation(cx, thisObj, args);
				
			case Id_createAlert:
				return createAlert(cx, thisObj, args);
				
			case Id_getHasExtendedProperties:
				return getHasExtendedProperties(cx, thisObj, args);
				
			case Id_getReminders:
				return getReminders(cx, thisObj, args);
				
			case Id_getTitle:
				return getTitle(cx, thisObj, args);
				
			case Id_getRecurrenceExceptionDate:
				return getRecurrenceExceptionDate(cx, thisObj, args);
				
			case Id_getAllDay:
				return getAllDay(cx, thisObj, args);
				
			case Id_getLastDate:
				return getLastDate(cx, thisObj, args);
				
			case Id_setExtendedProperty:
				 setExtendedProperty(cx, thisObj, args);
				return Undefined.instance;
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

		Id_hasExtendedProperties = 1
		,		
		Id_reminders = 2
		,		
		Id_recurrenceExceptionDate = 3
		,		
		Id_visibility = 4
		,		
		Id_status = 5
		,		
		Id_allDay = 6
		,		
		Id_location = 7
		,		
		Id_recurrenceExceptionRule = 8
		,		
		Id_lastDate = 9
		,		
		Id_hasAlarm = 10
		,		
		Id_begin = 11
		,		
		Id_id = 12
		,		
		Id_title = 13
		,		
		Id_recurrenceDate = 14
		,		
		Id_description = 15
		,		
		Id_alerts = 16
		,		
		Id_recurrenceRule = 17
		,		
		Id_end = 18
		,		
		Id_extendedProperties = 19
		;

;

;

	public static final int MAX_INSTANCE_ID = 19;

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
            case 2: if (s.charAt(0)=='i' && s.charAt(1)=='d') {id=Id_id; break L0;} break L;
            case 3: X="end";id=Id_end; break L;
            case 5: c=s.charAt(0);
                if (c=='b') { X="begin";id=Id_begin; }
                else if (c=='t') { X="title";id=Id_title; }
                break L;
            case 6: c=s.charAt(2);
                if (c=='a') { X="status";id=Id_status; }
                else if (c=='e') { X="alerts";id=Id_alerts; }
                else if (c=='l') { X="allDay";id=Id_allDay; }
                break L;
            case 8: c=s.charAt(3);
                if (c=='A') { X="hasAlarm";id=Id_hasAlarm; }
                else if (c=='a') { X="location";id=Id_location; }
                else if (c=='t') { X="lastDate";id=Id_lastDate; }
                break L;
            case 9: X="reminders";id=Id_reminders; break L;
            case 10: X="visibility";id=Id_visibility; break L;
            case 11: X="description";id=Id_description; break L;
            case 14: c=s.charAt(10);
                if (c=='D') { X="recurrenceDate";id=Id_recurrenceDate; }
                else if (c=='R') { X="recurrenceRule";id=Id_recurrenceRule; }
                break L;
            case 18: X="extendedProperties";id=Id_extendedProperties; break L;
            case 21: X="hasExtendedProperties";id=Id_hasExtendedProperties; break L;
            case 23: c=s.charAt(19);
                if (c=='D') { X="recurrenceExceptionDate";id=Id_recurrenceExceptionDate; }
                else if (c=='R') { X="recurrenceExceptionRule";id=Id_recurrenceExceptionRule; }
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
			case Id_hasExtendedProperties:
				return "hasExtendedProperties"; 
			case Id_reminders:
				return "reminders"; 
			case Id_recurrenceExceptionDate:
				return "recurrenceExceptionDate"; 
			case Id_visibility:
				return "visibility"; 
			case Id_status:
				return "status"; 
			case Id_allDay:
				return "allDay"; 
			case Id_location:
				return "location"; 
			case Id_recurrenceExceptionRule:
				return "recurrenceExceptionRule"; 
			case Id_lastDate:
				return "lastDate"; 
			case Id_hasAlarm:
				return "hasAlarm"; 
			case Id_begin:
				return "begin"; 
			case Id_id:
				return "id"; 
			case Id_title:
				return "title"; 
			case Id_recurrenceDate:
				return "recurrenceDate"; 
			case Id_description:
				return "description"; 
			case Id_alerts:
				return "alerts"; 
			case Id_recurrenceRule:
				return "recurrenceRule"; 
			case Id_end:
				return "end"; 
			case Id_extendedProperties:
				return "extendedProperties"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		EventProxyPrototype proxy = this;
		while (start != null && !(start instanceof EventProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof EventProxyPrototype) {
			proxy = (EventProxyPrototype) start;
		}

		switch (id) {
			case Id_hasExtendedProperties:
				return proxy.getter_hasExtendedProperties();
			case Id_reminders:
				return proxy.getter_reminders();
			case Id_recurrenceExceptionDate:
				return proxy.getter_recurrenceExceptionDate();
			case Id_visibility:
				return proxy.getter_visibility();
			case Id_status:
				return proxy.getter_status();
			case Id_allDay:
				return proxy.getter_allDay();
			case Id_location:
				return proxy.getter_location();
			case Id_recurrenceExceptionRule:
				return proxy.getter_recurrenceExceptionRule();
			case Id_lastDate:
				return proxy.getter_lastDate();
			case Id_hasAlarm:
				return proxy.getter_hasAlarm();
			case Id_begin:
				return proxy.getter_begin();
			case Id_id:
				return proxy.getter_id();
			case Id_title:
				return proxy.getter_title();
			case Id_recurrenceDate:
				return proxy.getter_recurrenceDate();
			case Id_description:
				return proxy.getter_description();
			case Id_alerts:
				return proxy.getter_alerts();
			case Id_recurrenceRule:
				return proxy.getter_recurrenceRule();
			case Id_end:
				return proxy.getter_end();
			case Id_extendedProperties:
				return proxy.getter_extendedProperties();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		EventProxyPrototype proxy = this;
		while (start != null && !(start instanceof EventProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof EventProxyPrototype) {
			proxy = (EventProxyPrototype) start;
		}

		switch (id) {
			case Id_hasExtendedProperties:
				proxy.setProperty("hasExtendedProperties", value);
				proxy.onPropertyChanged("hasExtendedProperties", value);
				break; 
			case Id_reminders:
				proxy.setProperty("reminders", value);
				proxy.onPropertyChanged("reminders", value);
				break; 
			case Id_recurrenceExceptionDate:
				proxy.setProperty("recurrenceExceptionDate", value);
				proxy.onPropertyChanged("recurrenceExceptionDate", value);
				break; 
			case Id_visibility:
				proxy.setProperty("visibility", value);
				proxy.onPropertyChanged("visibility", value);
				break; 
			case Id_status:
				proxy.setProperty("status", value);
				proxy.onPropertyChanged("status", value);
				break; 
			case Id_allDay:
				proxy.setProperty("allDay", value);
				proxy.onPropertyChanged("allDay", value);
				break; 
			case Id_location:
				proxy.setProperty("location", value);
				proxy.onPropertyChanged("location", value);
				break; 
			case Id_recurrenceExceptionRule:
				proxy.setProperty("recurrenceExceptionRule", value);
				proxy.onPropertyChanged("recurrenceExceptionRule", value);
				break; 
			case Id_lastDate:
				proxy.setProperty("lastDate", value);
				proxy.onPropertyChanged("lastDate", value);
				break; 
			case Id_hasAlarm:
				proxy.setProperty("hasAlarm", value);
				proxy.onPropertyChanged("hasAlarm", value);
				break; 
			case Id_begin:
				proxy.setProperty("begin", value);
				proxy.onPropertyChanged("begin", value);
				break; 
			case Id_id:
				proxy.setProperty("id", value);
				proxy.onPropertyChanged("id", value);
				break; 
			case Id_title:
				proxy.setProperty("title", value);
				proxy.onPropertyChanged("title", value);
				break; 
			case Id_recurrenceDate:
				proxy.setProperty("recurrenceDate", value);
				proxy.onPropertyChanged("recurrenceDate", value);
				break; 
			case Id_description:
				proxy.setProperty("description", value);
				proxy.onPropertyChanged("description", value);
				break; 
			case Id_alerts:
				proxy.setProperty("alerts", value);
				proxy.onPropertyChanged("alerts", value);
				break; 
			case Id_recurrenceRule:
				proxy.setProperty("recurrenceRule", value);
				proxy.onPropertyChanged("recurrenceRule", value);
				break; 
			case Id_end:
				proxy.setProperty("end", value);
				proxy.onPropertyChanged("end", value);
				break; 
			case Id_extendedProperties:
				proxy.setProperty("extendedProperties", value);
				proxy.onPropertyChanged("extendedProperties", value);
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
