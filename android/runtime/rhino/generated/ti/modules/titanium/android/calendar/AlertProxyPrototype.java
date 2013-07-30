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

import ti.modules.titanium.android.calendar.AlertProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class AlertProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 7526782430247362585L;

	private static final String TAG = "AlertProxyPrototype";
	private static final String CLASS_TAG = "AlertProxy";
	private static AlertProxyPrototype alertProxyPrototype;


	public static AlertProxyPrototype getProxyPrototype()
	{
		return alertProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		alertProxyPrototype = null;
	}

	public AlertProxyPrototype()
	{
		if (alertProxyPrototype == null && getClass().equals(AlertProxyPrototype.class)) {
			alertProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == alertProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return alertProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(AlertProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getState(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getState()", Log.DEBUG_MODE);

		try {
		AlertProxy proxy = (AlertProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getState();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getEventId(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getEventId()", Log.DEBUG_MODE);

		try {
		AlertProxy proxy = (AlertProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getEventId();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAlarmTime(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAlarmTime()", Log.DEBUG_MODE);

		try {
		AlertProxy proxy = (AlertProxy) ((Proxy) thisObj).getProxy();

		java.util.Date javaResult = proxy.getAlarmTime();

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
		AlertProxy proxy = (AlertProxy) ((Proxy) thisObj).getProxy();

		java.util.Date javaResult = proxy.getBegin();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
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
		AlertProxy proxy = (AlertProxy) ((Proxy) thisObj).getProxy();

		java.util.Date javaResult = proxy.getEnd();

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
		AlertProxy proxy = (AlertProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getId();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getMinutes(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getMinutes()", Log.DEBUG_MODE);

		try {
		AlertProxy proxy = (AlertProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getMinutes();

		Number rhinoResult = (Number) javaResult;
	
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
		AlertProxy proxy = (AlertProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getId();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Number getter_minutes()
	{
		Log.d(TAG, "get minutes", Log.DEBUG_MODE);
		AlertProxy proxy = (AlertProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getMinutes();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public String getter_eventId()
	{
		Log.d(TAG, "get eventId", Log.DEBUG_MODE);
		AlertProxy proxy = (AlertProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getEventId();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Number getter_state()
	{
		Log.d(TAG, "get state", Log.DEBUG_MODE);
		AlertProxy proxy = (AlertProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getState();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Object getter_end()
	{
		Log.d(TAG, "get end", Log.DEBUG_MODE);
		AlertProxy proxy = (AlertProxy) getProxy();
		Scriptable thisObj = this;
		java.util.Date javaResult = proxy.getEnd();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Object getter_alarmTime()
	{
		Log.d(TAG, "get alarmTime", Log.DEBUG_MODE);
		AlertProxy proxy = (AlertProxy) getProxy();
		Scriptable thisObj = this;
		java.util.Date javaResult = proxy.getAlarmTime();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Object getter_begin()
	{
		Log.d(TAG, "get begin", Log.DEBUG_MODE);
		AlertProxy proxy = (AlertProxy) getProxy();
		Scriptable thisObj = this;
		java.util.Date javaResult = proxy.getBegin();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getState = 2,
		Id_getEventId = 3,
		Id_getAlarmTime = 4,
		Id_getBegin = 5,
		Id_getEnd = 6,
		Id_getId = 7,
		Id_getMinutes = 8
;
		

	public static final int MAX_PROTOTYPE_ID = 8;

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
                else if (c=='S') { X="getState";id=Id_getState; }
                break L;
            case 10: c=s.charAt(3);
                if (c=='E') { X="getEventId";id=Id_getEventId; }
                else if (c=='M') { X="getMinutes";id=Id_getMinutes; }
                break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: X="getAlarmTime";id=Id_getAlarmTime; break L;
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
			case Id_getState:
				arity = 0;
				name = "getState";
				break;
			case Id_getEventId:
				arity = 0;
				name = "getEventId";
				break;
			case Id_getAlarmTime:
				arity = 0;
				name = "getAlarmTime";
				break;
			case Id_getBegin:
				arity = 0;
				name = "getBegin";
				break;
			case Id_getEnd:
				arity = 0;
				name = "getEnd";
				break;
			case Id_getId:
				arity = 0;
				name = "getId";
				break;
			case Id_getMinutes:
				arity = 0;
				name = "getMinutes";
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

		while (thisObj != null && !(thisObj instanceof AlertProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		AlertProxyPrototype proxy = (AlertProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getState:
				return getState(cx, thisObj, args);
				
			case Id_getEventId:
				return getEventId(cx, thisObj, args);
				
			case Id_getAlarmTime:
				return getAlarmTime(cx, thisObj, args);
				
			case Id_getBegin:
				return getBegin(cx, thisObj, args);
				
			case Id_getEnd:
				return getEnd(cx, thisObj, args);
				
			case Id_getId:
				return getId(cx, thisObj, args);
				
			case Id_getMinutes:
				return getMinutes(cx, thisObj, args);
				
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
		Id_minutes = 2
		,		
		Id_eventId = 3
		,		
		Id_state = 4
		,		
		Id_end = 5
		,		
		Id_alarmTime = 6
		,		
		Id_begin = 7
		;

;

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
            case 2: if (s.charAt(0)=='i' && s.charAt(1)=='d') {id=Id_id; break L0;} break L;
            case 3: X="end";id=Id_end; break L;
            case 5: c=s.charAt(0);
                if (c=='b') { X="begin";id=Id_begin; }
                else if (c=='s') { X="state";id=Id_state; }
                break L;
            case 7: c=s.charAt(0);
                if (c=='e') { X="eventId";id=Id_eventId; }
                else if (c=='m') { X="minutes";id=Id_minutes; }
                break L;
            case 9: X="alarmTime";id=Id_alarmTime; break L;
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
			case Id_minutes:
				return "minutes"; 
			case Id_eventId:
				return "eventId"; 
			case Id_state:
				return "state"; 
			case Id_end:
				return "end"; 
			case Id_alarmTime:
				return "alarmTime"; 
			case Id_begin:
				return "begin"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		AlertProxyPrototype proxy = this;
		while (start != null && !(start instanceof AlertProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AlertProxyPrototype) {
			proxy = (AlertProxyPrototype) start;
		}

		switch (id) {
			case Id_id:
				return proxy.getter_id();
			case Id_minutes:
				return proxy.getter_minutes();
			case Id_eventId:
				return proxy.getter_eventId();
			case Id_state:
				return proxy.getter_state();
			case Id_end:
				return proxy.getter_end();
			case Id_alarmTime:
				return proxy.getter_alarmTime();
			case Id_begin:
				return proxy.getter_begin();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		AlertProxyPrototype proxy = this;
		while (start != null && !(start instanceof AlertProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AlertProxyPrototype) {
			proxy = (AlertProxyPrototype) start;
		}

		switch (id) {
			case Id_id:
				proxy.setProperty("id", value);
				proxy.onPropertyChanged("id", value);
				break; 
			case Id_minutes:
				proxy.setProperty("minutes", value);
				proxy.onPropertyChanged("minutes", value);
				break; 
			case Id_eventId:
				proxy.setProperty("eventId", value);
				proxy.onPropertyChanged("eventId", value);
				break; 
			case Id_state:
				proxy.setProperty("state", value);
				proxy.onPropertyChanged("state", value);
				break; 
			case Id_end:
				proxy.setProperty("end", value);
				proxy.onPropertyChanged("end", value);
				break; 
			case Id_alarmTime:
				proxy.setProperty("alarmTime", value);
				proxy.onPropertyChanged("alarmTime", value);
				break; 
			case Id_begin:
				proxy.setProperty("begin", value);
				proxy.onPropertyChanged("begin", value);
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
