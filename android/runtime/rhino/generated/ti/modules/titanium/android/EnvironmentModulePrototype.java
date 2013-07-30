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

import ti.modules.titanium.android.EnvironmentModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class EnvironmentModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = -1394886268426286295L;

	private static final String TAG = "EnvironmentModulePrototype";
	private static final String CLASS_TAG = "EnvironmentModule";
	private static EnvironmentModulePrototype environmentModulePrototype;


	public static EnvironmentModulePrototype getProxyPrototype()
	{
		return environmentModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		environmentModulePrototype = null;
	}

	public EnvironmentModulePrototype()
	{
		if (environmentModulePrototype == null && getClass().equals(EnvironmentModulePrototype.class)) {
			environmentModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("MEDIA_NOFS", this, "nofs");


			putConst("MEDIA_BAD_REMOVAL", this, "bad_removal");


			putConst("MEDIA_REMOVED", this, "removed");


			putConst("MEDIA_CHECKING", this, "checking");


			putConst("MEDIA_UNMOUNTED", this, "unmounted");


			putConst("MEDIA_MOUNTED", this, "mounted");


			putConst("MEDIA_SHARED", this, "shared");


			putConst("MEDIA_MOUNTED_READ_ONLY", this, "mounted_ro");


			putConst("MEDIA_UNMOUNTABLE", this, "unmountable");

	}

	public Scriptable getPrototype()
	{
		if (this == environmentModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return environmentModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(EnvironmentModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getDownloadCacheDirectory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDownloadCacheDirectory()", Log.DEBUG_MODE);

		try {
		EnvironmentModule proxy = (EnvironmentModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getDownloadCacheDirectory();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getExternalStorageDirectory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getExternalStorageDirectory()", Log.DEBUG_MODE);

		try {
		EnvironmentModule proxy = (EnvironmentModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getExternalStorageDirectory();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getExternalStorageState(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getExternalStorageState()", Log.DEBUG_MODE);

		try {
		EnvironmentModule proxy = (EnvironmentModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getExternalStorageState();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getDataDirectory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDataDirectory()", Log.DEBUG_MODE);

		try {
		EnvironmentModule proxy = (EnvironmentModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getDataDirectory();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getRootDirectory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getRootDirectory()", Log.DEBUG_MODE);

		try {
		EnvironmentModule proxy = (EnvironmentModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getRootDirectory();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public String getter_rootDirectory()
	{
		Log.d(TAG, "get rootDirectory", Log.DEBUG_MODE);
		EnvironmentModule proxy = (EnvironmentModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getRootDirectory();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_dataDirectory()
	{
		Log.d(TAG, "get dataDirectory", Log.DEBUG_MODE);
		EnvironmentModule proxy = (EnvironmentModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getDataDirectory();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_externalStorageState()
	{
		Log.d(TAG, "get externalStorageState", Log.DEBUG_MODE);
		EnvironmentModule proxy = (EnvironmentModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getExternalStorageState();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_externalStorageDirectory()
	{
		Log.d(TAG, "get externalStorageDirectory", Log.DEBUG_MODE);
		EnvironmentModule proxy = (EnvironmentModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getExternalStorageDirectory();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_downloadCacheDirectory()
	{
		Log.d(TAG, "get downloadCacheDirectory", Log.DEBUG_MODE);
		EnvironmentModule proxy = (EnvironmentModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getDownloadCacheDirectory();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getDownloadCacheDirectory = 2,
		Id_getExternalStorageDirectory = 3,
		Id_getExternalStorageState = 4,
		Id_getDataDirectory = 5,
		Id_getRootDirectory = 6
;
		

	public static final int MAX_PROTOTYPE_ID = 6;

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
            case 11: X="constructor";id=Id_constructor; break L;
            case 16: c=s.charAt(3);
                if (c=='D') { X="getDataDirectory";id=Id_getDataDirectory; }
                else if (c=='R') { X="getRootDirectory";id=Id_getRootDirectory; }
                break L;
            case 23: X="getExternalStorageState";id=Id_getExternalStorageState; break L;
            case 25: X="getDownloadCacheDirectory";id=Id_getDownloadCacheDirectory; break L;
            case 27: X="getExternalStorageDirectory";id=Id_getExternalStorageDirectory; break L;
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
			case Id_getDownloadCacheDirectory:
				arity = 0;
				name = "getDownloadCacheDirectory";
				break;
			case Id_getExternalStorageDirectory:
				arity = 0;
				name = "getExternalStorageDirectory";
				break;
			case Id_getExternalStorageState:
				arity = 0;
				name = "getExternalStorageState";
				break;
			case Id_getDataDirectory:
				arity = 0;
				name = "getDataDirectory";
				break;
			case Id_getRootDirectory:
				arity = 0;
				name = "getRootDirectory";
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

		while (thisObj != null && !(thisObj instanceof EnvironmentModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		EnvironmentModulePrototype proxy = (EnvironmentModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getDownloadCacheDirectory:
				return getDownloadCacheDirectory(cx, thisObj, args);
				
			case Id_getExternalStorageDirectory:
				return getExternalStorageDirectory(cx, thisObj, args);
				
			case Id_getExternalStorageState:
				return getExternalStorageState(cx, thisObj, args);
				
			case Id_getDataDirectory:
				return getDataDirectory(cx, thisObj, args);
				
			case Id_getRootDirectory:
				return getRootDirectory(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_rootDirectory = 1
		,		
		Id_dataDirectory = 2
		,		
		Id_externalStorageState = 3
		,		
		Id_externalStorageDirectory = 4
		,		
		Id_downloadCacheDirectory = 5
		;

;

;

	public static final int MAX_INSTANCE_ID = 5;

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
            case 13: c=s.charAt(0);
                if (c=='d') { X="dataDirectory";id=Id_dataDirectory; }
                else if (c=='r') { X="rootDirectory";id=Id_rootDirectory; }
                break L;
            case 20: X="externalStorageState";id=Id_externalStorageState; break L;
            case 22: X="downloadCacheDirectory";id=Id_downloadCacheDirectory; break L;
            case 24: X="externalStorageDirectory";id=Id_externalStorageDirectory; break L;
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
			case Id_rootDirectory:
				return "rootDirectory"; 
			case Id_dataDirectory:
				return "dataDirectory"; 
			case Id_externalStorageState:
				return "externalStorageState"; 
			case Id_externalStorageDirectory:
				return "externalStorageDirectory"; 
			case Id_downloadCacheDirectory:
				return "downloadCacheDirectory"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		EnvironmentModulePrototype proxy = this;
		while (start != null && !(start instanceof EnvironmentModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof EnvironmentModulePrototype) {
			proxy = (EnvironmentModulePrototype) start;
		}

		switch (id) {
			case Id_rootDirectory:
				return proxy.getter_rootDirectory();
			case Id_dataDirectory:
				return proxy.getter_dataDirectory();
			case Id_externalStorageState:
				return proxy.getter_externalStorageState();
			case Id_externalStorageDirectory:
				return proxy.getter_externalStorageDirectory();
			case Id_downloadCacheDirectory:
				return proxy.getter_downloadCacheDirectory();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		EnvironmentModulePrototype proxy = this;
		while (start != null && !(start instanceof EnvironmentModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof EnvironmentModulePrototype) {
			proxy = (EnvironmentModulePrototype) start;
		}

		switch (id) {
			case Id_rootDirectory:
				proxy.setProperty("rootDirectory", value);
				proxy.onPropertyChanged("rootDirectory", value);
				break; 
			case Id_dataDirectory:
				proxy.setProperty("dataDirectory", value);
				proxy.onPropertyChanged("dataDirectory", value);
				break; 
			case Id_externalStorageState:
				proxy.setProperty("externalStorageState", value);
				proxy.onPropertyChanged("externalStorageState", value);
				break; 
			case Id_externalStorageDirectory:
				proxy.setProperty("externalStorageDirectory", value);
				proxy.onPropertyChanged("externalStorageDirectory", value);
				break; 
			case Id_downloadCacheDirectory:
				proxy.setProperty("downloadCacheDirectory", value);
				proxy.onPropertyChanged("downloadCacheDirectory", value);
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
