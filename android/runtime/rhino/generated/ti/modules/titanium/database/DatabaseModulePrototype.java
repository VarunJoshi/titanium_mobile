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

import ti.modules.titanium.database.DatabaseModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class DatabaseModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = -524687207001257971L;

	private static final String TAG = "DatabaseModulePrototype";
	private static final String CLASS_TAG = "DatabaseModule";
	private static DatabaseModulePrototype databaseModulePrototype;

	// Lazy loaded child APIs
	private Object API_TiResultSet = null;
	private Object API_TiDatabase = null;

	public static DatabaseModulePrototype getProxyPrototype()
	{
		return databaseModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		databaseModulePrototype = null;
	}

	public DatabaseModulePrototype()
	{
		if (databaseModulePrototype == null && getClass().equals(DatabaseModulePrototype.class)) {
			databaseModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("FIELD_TYPE_FLOAT", this, 2);


			putConst("FIELD_TYPE_DOUBLE", this, 3);


			putConst("FIELD_TYPE_INT", this, 1);


			putConst("FIELD_TYPE_UNKNOWN", this, -1);


			putConst("FIELD_TYPE_STRING", this, 0);

	}

	public Scriptable getPrototype()
	{
		if (this == databaseModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return databaseModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(DatabaseModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object install(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "install()", Log.DEBUG_MODE);

		try {
		DatabaseModule proxy = (DatabaseModule) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("install: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		Scriptable scopeVars = (Scriptable) args[0];
		String sourceUrl = (String) ScriptableObject.getProperty(scopeVars, "sourceUrl");
		KrollInvocation arg0 = new KrollInvocation(sourceUrl);
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;
		java.lang.String arg2;
		arg2 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[2], thisObj) ;

		ti.modules.titanium.database.TiDatabaseProxy javaResult = proxy.install(arg0, arg1, arg2);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object open(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "open()", Log.DEBUG_MODE);

		try {
		DatabaseModule proxy = (DatabaseModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("open: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		ti.modules.titanium.database.TiDatabaseProxy javaResult = proxy.open(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_install = 2,
		Id_open = 3
;
		

	public static final int MAX_PROTOTYPE_ID = 3;

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
            int s_length = s.length();
            if (s_length==4) { X="open";id=Id_open; }
            else if (s_length==7) { X="install";id=Id_install; }
            else if (s_length==11) { X="constructor";id=Id_constructor; }
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
			case Id_install:
				arity = 2;
				name = "install";
				break;
			case Id_open:
				arity = 1;
				name = "open";
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

		while (thisObj != null && !(thisObj instanceof DatabaseModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		DatabaseModulePrototype proxy = (DatabaseModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_install:
				return install(cx, thisObj, args);
				
			case Id_open:
				return open(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
;

;

	// Child APIs
	private static final int

		Id_TiResultSet = 1
		,		
		Id_TiDatabase = 2
		;

	public static final int MAX_INSTANCE_ID = 2;

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
            if (s_length==10) { X="TiDatabase";id=Id_TiDatabase; }
            else if (s_length==11) { X="TiResultSet";id=Id_TiResultSet; }
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
			case Id_TiResultSet:
				return "TiResultSet";
			case Id_TiDatabase:
				return "TiDatabase";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		DatabaseModulePrototype proxy = this;
		while (start != null && !(start instanceof DatabaseModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof DatabaseModulePrototype) {
			proxy = (DatabaseModulePrototype) start;
		}

		switch (id) {
			case Id_TiResultSet:
				if (proxy.API_TiResultSet == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TiResultSet = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.database.TiResultSetProxy", ti.modules.titanium.database.TiResultSetProxyPrototype.class); 
				}
				return proxy.API_TiResultSet;
			case Id_TiDatabase:
				if (proxy.API_TiDatabase == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TiDatabase = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.database.TiDatabaseProxy", ti.modules.titanium.database.TiDatabaseProxyPrototype.class); 
				}
				return proxy.API_TiDatabase;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		DatabaseModulePrototype proxy = this;
		while (start != null && !(start instanceof DatabaseModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof DatabaseModulePrototype) {
			proxy = (DatabaseModulePrototype) start;
		}

		switch (id) {
			case Id_TiResultSet:
				if (value instanceof Proxy) {
					proxy.API_TiResultSet = value;
				} else {
					defineProperty(original, "TiResultSet", value, 0);
				}
				break;
			case Id_TiDatabase:
				if (value instanceof Proxy) {
					proxy.API_TiDatabase = value;
				} else {
					defineProperty(original, "TiDatabase", value, 0);
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
