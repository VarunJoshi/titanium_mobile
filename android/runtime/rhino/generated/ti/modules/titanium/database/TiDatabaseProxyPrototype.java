/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.database;

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

import ti.modules.titanium.database.TiDatabaseProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class TiDatabaseProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -8993768622548209923L;

	private static final String TAG = "TiDatabaseProxyPrototype";
	private static final String CLASS_TAG = "TiDatabaseProxy";
	private static TiDatabaseProxyPrototype tiDatabaseProxyPrototype;


	public static TiDatabaseProxyPrototype getProxyPrototype()
	{
		return tiDatabaseProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		tiDatabaseProxyPrototype = null;
	}

	public TiDatabaseProxyPrototype()
	{
		if (tiDatabaseProxyPrototype == null && getClass().equals(TiDatabaseProxyPrototype.class)) {
			tiDatabaseProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == tiDatabaseProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return tiDatabaseProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TiDatabaseProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object execute(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "execute()", Log.DEBUG_MODE);

		try {
		TiDatabaseProxy proxy = (TiDatabaseProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("execute: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
	int length = args.length - 1;
	if (length < 0) {
		length = 0;
	}

	Object[] arg1 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg1[i] = TypeConverter.jsObjectToJavaObject(args[i+1], this);
	}

		ti.modules.titanium.database.TiResultSetProxy javaResult = proxy.execute(arg0, arg1);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void remove(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "remove()", Log.DEBUG_MODE);

		try {
		TiDatabaseProxy proxy = (TiDatabaseProxy) ((Proxy) thisObj).getProxy();

		proxy.remove();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getRowsAffected(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getRowsAffected()", Log.DEBUG_MODE);

		try {
		TiDatabaseProxy proxy = (TiDatabaseProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getRowsAffected();

		Number rhinoResult = (Number) javaResult;
	
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
		TiDatabaseProxy proxy = (TiDatabaseProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getName();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getLastInsertRowId(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLastInsertRowId()", Log.DEBUG_MODE);

		try {
		TiDatabaseProxy proxy = (TiDatabaseProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getLastInsertRowId();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void close(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "close()", Log.DEBUG_MODE);

		try {
		TiDatabaseProxy proxy = (TiDatabaseProxy) ((Proxy) thisObj).getProxy();

		proxy.close();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Number getter_lastInsertRowId()
	{
		Log.d(TAG, "get lastInsertRowId", Log.DEBUG_MODE);
		TiDatabaseProxy proxy = (TiDatabaseProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getLastInsertRowId();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Number getter_rowsAffected()
	{
		Log.d(TAG, "get rowsAffected", Log.DEBUG_MODE);
		TiDatabaseProxy proxy = (TiDatabaseProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getRowsAffected();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public String getter_name()
	{
		Log.d(TAG, "get name", Log.DEBUG_MODE);
		TiDatabaseProxy proxy = (TiDatabaseProxy) getProxy();
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
		Id_execute = 2,
		Id_remove = 3,
		Id_getRowsAffected = 4,
		Id_getName = 5,
		Id_getLastInsertRowId = 6,
		Id_close = 7
;
		

	public static final int MAX_PROTOTYPE_ID = 7;

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
            case 5: X="close";id=Id_close; break L;
            case 6: X="remove";id=Id_remove; break L;
            case 7: c=s.charAt(0);
                if (c=='e') { X="execute";id=Id_execute; }
                else if (c=='g') { X="getName";id=Id_getName; }
                break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 15: X="getRowsAffected";id=Id_getRowsAffected; break L;
            case 18: X="getLastInsertRowId";id=Id_getLastInsertRowId; break L;
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
			case Id_execute:
				arity = 2;
				name = "execute";
				break;
			case Id_remove:
				arity = 0;
				name = "remove";
				break;
			case Id_getRowsAffected:
				arity = 0;
				name = "getRowsAffected";
				break;
			case Id_getName:
				arity = 0;
				name = "getName";
				break;
			case Id_getLastInsertRowId:
				arity = 0;
				name = "getLastInsertRowId";
				break;
			case Id_close:
				arity = 0;
				name = "close";
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

		while (thisObj != null && !(thisObj instanceof TiDatabaseProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TiDatabaseProxyPrototype proxy = (TiDatabaseProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_execute:
				return execute(cx, thisObj, args);
				
			case Id_remove:
				 remove(cx, thisObj, args);
				return Undefined.instance;
			case Id_getRowsAffected:
				return getRowsAffected(cx, thisObj, args);
				
			case Id_getName:
				return getName(cx, thisObj, args);
				
			case Id_getLastInsertRowId:
				return getLastInsertRowId(cx, thisObj, args);
				
			case Id_close:
				 close(cx, thisObj, args);
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

		Id_lastInsertRowId = 1
		,		
		Id_rowsAffected = 2
		,		
		Id_name = 3
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
            if (s_length==4) { X="name";id=Id_name; }
            else if (s_length==12) { X="rowsAffected";id=Id_rowsAffected; }
            else if (s_length==15) { X="lastInsertRowId";id=Id_lastInsertRowId; }
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
			case Id_lastInsertRowId:
				return "lastInsertRowId"; 
			case Id_rowsAffected:
				return "rowsAffected"; 
			case Id_name:
				return "name"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TiDatabaseProxyPrototype proxy = this;
		while (start != null && !(start instanceof TiDatabaseProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TiDatabaseProxyPrototype) {
			proxy = (TiDatabaseProxyPrototype) start;
		}

		switch (id) {
			case Id_lastInsertRowId:
				return proxy.getter_lastInsertRowId();
			case Id_rowsAffected:
				return proxy.getter_rowsAffected();
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
		TiDatabaseProxyPrototype proxy = this;
		while (start != null && !(start instanceof TiDatabaseProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TiDatabaseProxyPrototype) {
			proxy = (TiDatabaseProxyPrototype) start;
		}

		switch (id) {
			case Id_lastInsertRowId:
				proxy.setProperty("lastInsertRowId", value);
				proxy.onPropertyChanged("lastInsertRowId", value);
				break; 
			case Id_rowsAffected:
				proxy.setProperty("rowsAffected", value);
				proxy.onPropertyChanged("rowsAffected", value);
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
