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

import ti.modules.titanium.android.calendar.CalendarModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class CalendarModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = -7740519343012563097L;

	private static final String TAG = "CalendarModulePrototype";
	private static final String CLASS_TAG = "CalendarModule";
	private static CalendarModulePrototype calendarModulePrototype;

	// Lazy loaded child APIs
	private Object API_Alert = null;
	private Object API_Event = null;
	private Object API_Reminder = null;
	private Object API_Calendar = null;

	public static CalendarModulePrototype getProxyPrototype()
	{
		return calendarModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		calendarModulePrototype = null;
	}

	public CalendarModulePrototype()
	{
		if (calendarModulePrototype == null && getClass().equals(CalendarModulePrototype.class)) {
			calendarModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("STATE_FIRED", this, 1);


			putConst("METHOD_ALERT", this, 1);


			putConst("STATUS_TENTATIVE", this, 0);


			putConst("METHOD_EMAIL", this, 2);


			putConst("VISIBILITY_PUBLIC", this, 3);


			putConst("STATUS_CONFIRMED", this, 1);


			putConst("VISIBILITY_DEFAULT", this, 0);


			putConst("STATUS_CANCELED", this, 2);


			putConst("METHOD_DEFAULT", this, 0);


			putConst("VISIBILITY_CONFIDENTIAL", this, 1);


			putConst("METHOD_SMS", this, 3);


			putConst("STATE_SCHEDULED", this, 0);


			putConst("VISIBILITY_PRIVATE", this, 2);


			putConst("STATE_DISMISSED", this, 2);

	}

	public Scriptable getPrototype()
	{
		if (this == calendarModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return calendarModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(CalendarModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getSelectableCalendars(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getSelectableCalendars()", Log.DEBUG_MODE);

		try {
		CalendarModule proxy = (CalendarModule) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.android.calendar.CalendarProxy[] javaResult = proxy.getSelectableCalendars();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAllCalendars(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAllCalendars()", Log.DEBUG_MODE);

		try {
		CalendarModule proxy = (CalendarModule) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.android.calendar.CalendarProxy[] javaResult = proxy.getAllCalendars();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAllAlerts(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAllAlerts()", Log.DEBUG_MODE);

		try {
		CalendarModule proxy = (CalendarModule) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.android.calendar.AlertProxy[] javaResult = proxy.getAllAlerts();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getCalendarById(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getCalendarById()", Log.DEBUG_MODE);

		try {
		CalendarModule proxy = (CalendarModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getCalendarById: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		ti.modules.titanium.android.calendar.CalendarProxy javaResult = proxy.getCalendarById(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Object getter_allCalendars()
	{
		Log.d(TAG, "get allCalendars", Log.DEBUG_MODE);
		CalendarModule proxy = (CalendarModule) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.android.calendar.CalendarProxy[] javaResult = proxy.getAllCalendars();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Object getter_allAlerts()
	{
		Log.d(TAG, "get allAlerts", Log.DEBUG_MODE);
		CalendarModule proxy = (CalendarModule) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.android.calendar.AlertProxy[] javaResult = proxy.getAllAlerts();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Object getter_selectableCalendars()
	{
		Log.d(TAG, "get selectableCalendars", Log.DEBUG_MODE);
		CalendarModule proxy = (CalendarModule) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.android.calendar.CalendarProxy[] javaResult = proxy.getSelectableCalendars();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getSelectableCalendars = 2,
		Id_getAllCalendars = 3,
		Id_getAllAlerts = 4,
		Id_getCalendarById = 5
;
		

	public static final int MAX_PROTOTYPE_ID = 5;

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
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: X="getAllAlerts";id=Id_getAllAlerts; break L;
            case 15: c=s.charAt(3);
                if (c=='A') { X="getAllCalendars";id=Id_getAllCalendars; }
                else if (c=='C') { X="getCalendarById";id=Id_getCalendarById; }
                break L;
            case 22: X="getSelectableCalendars";id=Id_getSelectableCalendars; break L;
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
			case Id_getSelectableCalendars:
				arity = 0;
				name = "getSelectableCalendars";
				break;
			case Id_getAllCalendars:
				arity = 0;
				name = "getAllCalendars";
				break;
			case Id_getAllAlerts:
				arity = 0;
				name = "getAllAlerts";
				break;
			case Id_getCalendarById:
				arity = 1;
				name = "getCalendarById";
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

		while (thisObj != null && !(thisObj instanceof CalendarModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		CalendarModulePrototype proxy = (CalendarModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getSelectableCalendars:
				return getSelectableCalendars(cx, thisObj, args);
				
			case Id_getAllCalendars:
				return getAllCalendars(cx, thisObj, args);
				
			case Id_getAllAlerts:
				return getAllAlerts(cx, thisObj, args);
				
			case Id_getCalendarById:
				return getCalendarById(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_allCalendars = 1
		,		
		Id_allAlerts = 2
		,		
		Id_selectableCalendars = 3
		;

;

	// Child APIs
	private static final int

		Id_Alert = 4
		,		
		Id_Event = 5
		,		
		Id_Reminder = 6
		,		
		Id_Calendar = 7
		;

	public static final int MAX_INSTANCE_ID = 7;

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
            case 5: c=s.charAt(0);
                if (c=='A') { X="Alert";id=Id_Alert; }
                else if (c=='E') { X="Event";id=Id_Event; }
                break L;
            case 8: c=s.charAt(0);
                if (c=='C') { X="Calendar";id=Id_Calendar; }
                else if (c=='R') { X="Reminder";id=Id_Reminder; }
                break L;
            case 9: X="allAlerts";id=Id_allAlerts; break L;
            case 12: X="allCalendars";id=Id_allCalendars; break L;
            case 19: X="selectableCalendars";id=Id_selectableCalendars; break L;
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
			case Id_allCalendars:
				return "allCalendars"; 
			case Id_allAlerts:
				return "allAlerts"; 
			case Id_selectableCalendars:
				return "selectableCalendars"; 
			case Id_Alert:
				return "Alert";
			case Id_Event:
				return "Event";
			case Id_Reminder:
				return "Reminder";
			case Id_Calendar:
				return "Calendar";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		CalendarModulePrototype proxy = this;
		while (start != null && !(start instanceof CalendarModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof CalendarModulePrototype) {
			proxy = (CalendarModulePrototype) start;
		}

		switch (id) {
			case Id_allCalendars:
				return proxy.getter_allCalendars();
			case Id_allAlerts:
				return proxy.getter_allAlerts();
			case Id_selectableCalendars:
				return proxy.getter_selectableCalendars();
			case Id_Alert:
				if (proxy.API_Alert == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Alert = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.android.calendar.AlertProxy", ti.modules.titanium.android.calendar.AlertProxyPrototype.class); 
				}
				return proxy.API_Alert;
			case Id_Event:
				if (proxy.API_Event == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Event = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.android.calendar.EventProxy", ti.modules.titanium.android.calendar.EventProxyPrototype.class); 
				}
				return proxy.API_Event;
			case Id_Reminder:
				if (proxy.API_Reminder == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Reminder = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.android.calendar.ReminderProxy", ti.modules.titanium.android.calendar.ReminderProxyPrototype.class); 
				}
				return proxy.API_Reminder;
			case Id_Calendar:
				if (proxy.API_Calendar == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Calendar = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.android.calendar.CalendarProxy", ti.modules.titanium.android.calendar.CalendarProxyPrototype.class); 
				}
				return proxy.API_Calendar;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		CalendarModulePrototype proxy = this;
		while (start != null && !(start instanceof CalendarModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof CalendarModulePrototype) {
			proxy = (CalendarModulePrototype) start;
		}

		switch (id) {
			case Id_allCalendars:
				proxy.setProperty("allCalendars", value);
				proxy.onPropertyChanged("allCalendars", value);
				break; 
			case Id_allAlerts:
				proxy.setProperty("allAlerts", value);
				proxy.onPropertyChanged("allAlerts", value);
				break; 
			case Id_selectableCalendars:
				proxy.setProperty("selectableCalendars", value);
				proxy.onPropertyChanged("selectableCalendars", value);
				break; 
			case Id_Alert:
				if (value instanceof Proxy) {
					proxy.API_Alert = value;
				} else {
					defineProperty(original, "Alert", value, 0);
				}
				break;
			case Id_Event:
				if (value instanceof Proxy) {
					proxy.API_Event = value;
				} else {
					defineProperty(original, "Event", value, 0);
				}
				break;
			case Id_Reminder:
				if (value instanceof Proxy) {
					proxy.API_Reminder = value;
				} else {
					defineProperty(original, "Reminder", value, 0);
				}
				break;
			case Id_Calendar:
				if (value instanceof Proxy) {
					proxy.API_Calendar = value;
				} else {
					defineProperty(original, "Calendar", value, 0);
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
