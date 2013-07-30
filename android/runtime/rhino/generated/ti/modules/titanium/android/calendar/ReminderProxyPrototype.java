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

import ti.modules.titanium.android.calendar.ReminderProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class ReminderProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 9352408591548185L;

	private static final String TAG = "ReminderProxyPrototype";
	private static final String CLASS_TAG = "ReminderProxy";
	private static ReminderProxyPrototype reminderProxyPrototype;


	public static ReminderProxyPrototype getProxyPrototype()
	{
		return reminderProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		reminderProxyPrototype = null;
	}

	public ReminderProxyPrototype()
	{
		if (reminderProxyPrototype == null && getClass().equals(ReminderProxyPrototype.class)) {
			reminderProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == reminderProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return reminderProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ReminderProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getMethod(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getMethod()", Log.DEBUG_MODE);

		try {
		ReminderProxy proxy = (ReminderProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getMethod();

		Number rhinoResult = (Number) javaResult;
	
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
		ReminderProxy proxy = (ReminderProxy) ((Proxy) thisObj).getProxy();

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
		ReminderProxy proxy = (ReminderProxy) ((Proxy) thisObj).getProxy();

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
		ReminderProxy proxy = (ReminderProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getId();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Number getter_minutes()
	{
		Log.d(TAG, "get minutes", Log.DEBUG_MODE);
		ReminderProxy proxy = (ReminderProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getMinutes();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Number getter_method()
	{
		Log.d(TAG, "get method", Log.DEBUG_MODE);
		ReminderProxy proxy = (ReminderProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getMethod();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getMethod = 2,
		Id_getId = 3,
		Id_getMinutes = 4
;
		

	public static final int MAX_PROTOTYPE_ID = 4;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null;
            L: switch (s.length()) {
            case 5: X="getId";id=Id_getId; break L;
            case 9: X="getMethod";id=Id_getMethod; break L;
            case 10: X="getMinutes";id=Id_getMinutes; break L;
            case 11: X="constructor";id=Id_constructor; break L;
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
			case Id_getMethod:
				arity = 0;
				name = "getMethod";
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

		while (thisObj != null && !(thisObj instanceof ReminderProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ReminderProxyPrototype proxy = (ReminderProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getMethod:
				return getMethod(cx, thisObj, args);
				
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
		Id_method = 3
		;

;

;

	public static final int MAX_INSTANCE_ID = 3;

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
            int s_length = s.length();
            if (s_length==2) { if (s.charAt(0)=='i' && s.charAt(1)=='d') {id=Id_id; break L0;} }
            else if (s_length==6) { X="method";id=Id_method; }
            else if (s_length==7) { X="minutes";id=Id_minutes; }
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
			case Id_method:
				return "method"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ReminderProxyPrototype proxy = this;
		while (start != null && !(start instanceof ReminderProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ReminderProxyPrototype) {
			proxy = (ReminderProxyPrototype) start;
		}

		switch (id) {
			case Id_id:
				return proxy.getter_id();
			case Id_minutes:
				return proxy.getter_minutes();
			case Id_method:
				return proxy.getter_method();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ReminderProxyPrototype proxy = this;
		while (start != null && !(start instanceof ReminderProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ReminderProxyPrototype) {
			proxy = (ReminderProxyPrototype) start;
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
			case Id_method:
				proxy.setProperty("method", value);
				proxy.onPropertyChanged("method", value);
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
