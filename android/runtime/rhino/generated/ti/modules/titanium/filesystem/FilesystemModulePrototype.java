/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.filesystem;

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

import ti.modules.titanium.filesystem.FilesystemModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class FilesystemModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = 5742183829928281949L;

	private static final String TAG = "FilesystemModulePrototype";
	private static final String CLASS_TAG = "FilesystemModule";
	private static FilesystemModulePrototype filesystemModulePrototype;

	// Lazy loaded child APIs
	private Object API_File = null;

	public static FilesystemModulePrototype getProxyPrototype()
	{
		return filesystemModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		filesystemModulePrototype = null;
	}

	public FilesystemModulePrototype()
	{
		if (filesystemModulePrototype == null && getClass().equals(FilesystemModulePrototype.class)) {
			filesystemModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("MODE_WRITE", this, 1);


			putConst("MODE_READ", this, 0);


			putConst("MODE_APPEND", this, 2);

	}

	public Scriptable getPrototype()
	{
		if (this == filesystemModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return filesystemModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(FilesystemModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getFile(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getFile()", Log.DEBUG_MODE);

		try {
		FilesystemModule proxy = (FilesystemModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getFile: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		Scriptable scopeVars = (Scriptable) args[0];
		String sourceUrl = (String) ScriptableObject.getProperty(scopeVars, "sourceUrl");
		KrollInvocation arg0 = new KrollInvocation(sourceUrl);
	int length = args.length - 1;
	if (length < 0) {
		length = 0;
	}

	Object[] arg1 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg1[i] = TypeConverter.jsObjectToJavaObject(args[i+1], this);
	}

		ti.modules.titanium.filesystem.FileProxy javaResult = proxy.getFile(arg0, arg1);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getSeparator(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getSeparator()", Log.DEBUG_MODE);

		try {
		FilesystemModule proxy = (FilesystemModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getSeparator();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getResourcesDirectory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getResourcesDirectory()", Log.DEBUG_MODE);

		try {
		FilesystemModule proxy = (FilesystemModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getResourcesDirectory();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getLineEnding(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLineEnding()", Log.DEBUG_MODE);

		try {
		FilesystemModule proxy = (FilesystemModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getLineEnding();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createTempFile(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createTempFile()", Log.DEBUG_MODE);

		try {
		FilesystemModule proxy = (FilesystemModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("createTempFile: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		Scriptable scopeVars = (Scriptable) args[0];
		String sourceUrl = (String) ScriptableObject.getProperty(scopeVars, "sourceUrl");
		KrollInvocation arg0 = new KrollInvocation(sourceUrl);

		ti.modules.titanium.filesystem.FileProxy javaResult = proxy.createTempFile(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
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
		FilesystemModule proxy = (FilesystemModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getExternalStorageDirectory();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getApplicationCacheDirectory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getApplicationCacheDirectory()", Log.DEBUG_MODE);

		try {
		FilesystemModule proxy = (FilesystemModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getApplicationCacheDirectory();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object isExternalStoragePresent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isExternalStoragePresent()", Log.DEBUG_MODE);

		try {
		FilesystemModule proxy = (FilesystemModule) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isExternalStoragePresent();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getApplicationDirectory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getApplicationDirectory()", Log.DEBUG_MODE);

		try {
		FilesystemModule proxy = (FilesystemModule) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.filesystem.FileProxy javaResult = proxy.getApplicationDirectory();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getTempDirectory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTempDirectory()", Log.DEBUG_MODE);

		try {
		FilesystemModule proxy = (FilesystemModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getTempDirectory();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getResRawDirectory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getResRawDirectory()", Log.DEBUG_MODE);

		try {
		FilesystemModule proxy = (FilesystemModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getResRawDirectory();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getApplicationDataDirectory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getApplicationDataDirectory()", Log.DEBUG_MODE);

		try {
		FilesystemModule proxy = (FilesystemModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getApplicationDataDirectory();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object openStream(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "openStream()", Log.DEBUG_MODE);

		try {
		FilesystemModule proxy = (FilesystemModule) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("openStream: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		Scriptable scopeVars = (Scriptable) args[0];
		String sourceUrl = (String) ScriptableObject.getProperty(scopeVars, "sourceUrl");
		KrollInvocation arg0 = new KrollInvocation(sourceUrl);
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;
	int length = args.length - 2;
	if (length < 0) {
		length = 0;
	}

	Object[] arg2 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg2[i] = TypeConverter.jsObjectToJavaObject(args[i+2], this);
	}

		ti.modules.titanium.stream.FileStreamProxy javaResult = proxy.openStream(arg0, arg1, arg2);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createTempDirectory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createTempDirectory()", Log.DEBUG_MODE);

		try {
		FilesystemModule proxy = (FilesystemModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("createTempDirectory: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		Scriptable scopeVars = (Scriptable) args[0];
		String sourceUrl = (String) ScriptableObject.getProperty(scopeVars, "sourceUrl");
		KrollInvocation arg0 = new KrollInvocation(sourceUrl);

		ti.modules.titanium.filesystem.FileProxy javaResult = proxy.createTempDirectory(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public String getter_applicationDataDirectory()
	{
		Log.d(TAG, "get applicationDataDirectory", Log.DEBUG_MODE);
		FilesystemModule proxy = (FilesystemModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getApplicationDataDirectory();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Proxy getter_applicationDirectory()
	{
		Log.d(TAG, "get applicationDirectory", Log.DEBUG_MODE);
		FilesystemModule proxy = (FilesystemModule) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.filesystem.FileProxy javaResult = proxy.getApplicationDirectory();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Boolean getter_externalStoragePresent()
	{
		Log.d(TAG, "get externalStoragePresent", Log.DEBUG_MODE);
		FilesystemModule proxy = (FilesystemModule) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.isExternalStoragePresent();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public String getter_lineEnding()
	{
		Log.d(TAG, "get lineEnding", Log.DEBUG_MODE);
		FilesystemModule proxy = (FilesystemModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getLineEnding();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_applicationCacheDirectory()
	{
		Log.d(TAG, "get applicationCacheDirectory", Log.DEBUG_MODE);
		FilesystemModule proxy = (FilesystemModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getApplicationCacheDirectory();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_resourcesDirectory()
	{
		Log.d(TAG, "get resourcesDirectory", Log.DEBUG_MODE);
		FilesystemModule proxy = (FilesystemModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getResourcesDirectory();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_tempDirectory()
	{
		Log.d(TAG, "get tempDirectory", Log.DEBUG_MODE);
		FilesystemModule proxy = (FilesystemModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getTempDirectory();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_externalStorageDirectory()
	{
		Log.d(TAG, "get externalStorageDirectory", Log.DEBUG_MODE);
		FilesystemModule proxy = (FilesystemModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getExternalStorageDirectory();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_resRawDirectory()
	{
		Log.d(TAG, "get resRawDirectory", Log.DEBUG_MODE);
		FilesystemModule proxy = (FilesystemModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getResRawDirectory();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_separator()
	{
		Log.d(TAG, "get separator", Log.DEBUG_MODE);
		FilesystemModule proxy = (FilesystemModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getSeparator();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getFile = 2,
		Id_getSeparator = 3,
		Id_getResourcesDirectory = 4,
		Id_getLineEnding = 5,
		Id_createTempFile = 6,
		Id_getExternalStorageDirectory = 7,
		Id_getApplicationCacheDirectory = 8,
		Id_isExternalStoragePresent = 9,
		Id_getApplicationDirectory = 10,
		Id_getTempDirectory = 11,
		Id_getResRawDirectory = 12,
		Id_getApplicationDataDirectory = 13,
		Id_openStream = 14,
		Id_createTempDirectory = 15
;
		

	public static final int MAX_PROTOTYPE_ID = 15;

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
            case 7: X="getFile";id=Id_getFile; break L;
            case 10: X="openStream";id=Id_openStream; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: X="getSeparator";id=Id_getSeparator; break L;
            case 13: X="getLineEnding";id=Id_getLineEnding; break L;
            case 14: X="createTempFile";id=Id_createTempFile; break L;
            case 16: X="getTempDirectory";id=Id_getTempDirectory; break L;
            case 18: X="getResRawDirectory";id=Id_getResRawDirectory; break L;
            case 19: X="createTempDirectory";id=Id_createTempDirectory; break L;
            case 21: X="getResourcesDirectory";id=Id_getResourcesDirectory; break L;
            case 23: X="getApplicationDirectory";id=Id_getApplicationDirectory; break L;
            case 24: X="isExternalStoragePresent";id=Id_isExternalStoragePresent; break L;
            case 27: c=s.charAt(3);
                if (c=='A') { X="getApplicationDataDirectory";id=Id_getApplicationDataDirectory; }
                else if (c=='E') { X="getExternalStorageDirectory";id=Id_getExternalStorageDirectory; }
                break L;
            case 28: X="getApplicationCacheDirectory";id=Id_getApplicationCacheDirectory; break L;
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
			case Id_getFile:
				arity = 1;
				name = "getFile";
				break;
			case Id_getSeparator:
				arity = 0;
				name = "getSeparator";
				break;
			case Id_getResourcesDirectory:
				arity = 0;
				name = "getResourcesDirectory";
				break;
			case Id_getLineEnding:
				arity = 0;
				name = "getLineEnding";
				break;
			case Id_createTempFile:
				arity = 0;
				name = "createTempFile";
				break;
			case Id_getExternalStorageDirectory:
				arity = 0;
				name = "getExternalStorageDirectory";
				break;
			case Id_getApplicationCacheDirectory:
				arity = 0;
				name = "getApplicationCacheDirectory";
				break;
			case Id_isExternalStoragePresent:
				arity = 0;
				name = "isExternalStoragePresent";
				break;
			case Id_getApplicationDirectory:
				arity = 0;
				name = "getApplicationDirectory";
				break;
			case Id_getTempDirectory:
				arity = 0;
				name = "getTempDirectory";
				break;
			case Id_getResRawDirectory:
				arity = 0;
				name = "getResRawDirectory";
				break;
			case Id_getApplicationDataDirectory:
				arity = 0;
				name = "getApplicationDataDirectory";
				break;
			case Id_openStream:
				arity = 2;
				name = "openStream";
				break;
			case Id_createTempDirectory:
				arity = 0;
				name = "createTempDirectory";
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

		while (thisObj != null && !(thisObj instanceof FilesystemModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		FilesystemModulePrototype proxy = (FilesystemModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getFile:
				return getFile(cx, thisObj, args);
				
			case Id_getSeparator:
				return getSeparator(cx, thisObj, args);
				
			case Id_getResourcesDirectory:
				return getResourcesDirectory(cx, thisObj, args);
				
			case Id_getLineEnding:
				return getLineEnding(cx, thisObj, args);
				
			case Id_createTempFile:
				return createTempFile(cx, thisObj, args);
				
			case Id_getExternalStorageDirectory:
				return getExternalStorageDirectory(cx, thisObj, args);
				
			case Id_getApplicationCacheDirectory:
				return getApplicationCacheDirectory(cx, thisObj, args);
				
			case Id_isExternalStoragePresent:
				return isExternalStoragePresent(cx, thisObj, args);
				
			case Id_getApplicationDirectory:
				return getApplicationDirectory(cx, thisObj, args);
				
			case Id_getTempDirectory:
				return getTempDirectory(cx, thisObj, args);
				
			case Id_getResRawDirectory:
				return getResRawDirectory(cx, thisObj, args);
				
			case Id_getApplicationDataDirectory:
				return getApplicationDataDirectory(cx, thisObj, args);
				
			case Id_openStream:
				return openStream(cx, thisObj, args);
				
			case Id_createTempDirectory:
				return createTempDirectory(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_applicationDataDirectory = 1
		,		
		Id_applicationDirectory = 2
		,		
		Id_externalStoragePresent = 3
		,		
		Id_lineEnding = 4
		,		
		Id_applicationCacheDirectory = 5
		,		
		Id_resourcesDirectory = 6
		,		
		Id_tempDirectory = 7
		,		
		Id_externalStorageDirectory = 8
		,		
		Id_resRawDirectory = 9
		,		
		Id_separator = 10
		;

;

	// Child APIs
	private static final int

		Id_File = 11
		;

	public static final int MAX_INSTANCE_ID = 11;

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
            case 4: X="File";id=Id_File; break L;
            case 9: X="separator";id=Id_separator; break L;
            case 10: X="lineEnding";id=Id_lineEnding; break L;
            case 13: X="tempDirectory";id=Id_tempDirectory; break L;
            case 15: X="resRawDirectory";id=Id_resRawDirectory; break L;
            case 18: X="resourcesDirectory";id=Id_resourcesDirectory; break L;
            case 20: X="applicationDirectory";id=Id_applicationDirectory; break L;
            case 22: X="externalStoragePresent";id=Id_externalStoragePresent; break L;
            case 24: c=s.charAt(0);
                if (c=='a') { X="applicationDataDirectory";id=Id_applicationDataDirectory; }
                else if (c=='e') { X="externalStorageDirectory";id=Id_externalStorageDirectory; }
                break L;
            case 25: X="applicationCacheDirectory";id=Id_applicationCacheDirectory; break L;
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
			case Id_applicationDataDirectory:
				return "applicationDataDirectory"; 
			case Id_applicationDirectory:
				return "applicationDirectory"; 
			case Id_externalStoragePresent:
				return "externalStoragePresent"; 
			case Id_lineEnding:
				return "lineEnding"; 
			case Id_applicationCacheDirectory:
				return "applicationCacheDirectory"; 
			case Id_resourcesDirectory:
				return "resourcesDirectory"; 
			case Id_tempDirectory:
				return "tempDirectory"; 
			case Id_externalStorageDirectory:
				return "externalStorageDirectory"; 
			case Id_resRawDirectory:
				return "resRawDirectory"; 
			case Id_separator:
				return "separator"; 
			case Id_File:
				return "File";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		FilesystemModulePrototype proxy = this;
		while (start != null && !(start instanceof FilesystemModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof FilesystemModulePrototype) {
			proxy = (FilesystemModulePrototype) start;
		}

		switch (id) {
			case Id_applicationDataDirectory:
				return proxy.getter_applicationDataDirectory();
			case Id_applicationDirectory:
				return proxy.getter_applicationDirectory();
			case Id_externalStoragePresent:
				return proxy.getter_externalStoragePresent();
			case Id_lineEnding:
				return proxy.getter_lineEnding();
			case Id_applicationCacheDirectory:
				return proxy.getter_applicationCacheDirectory();
			case Id_resourcesDirectory:
				return proxy.getter_resourcesDirectory();
			case Id_tempDirectory:
				return proxy.getter_tempDirectory();
			case Id_externalStorageDirectory:
				return proxy.getter_externalStorageDirectory();
			case Id_resRawDirectory:
				return proxy.getter_resRawDirectory();
			case Id_separator:
				return proxy.getter_separator();
			case Id_File:
				if (proxy.API_File == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_File = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.filesystem.FileProxy", ti.modules.titanium.filesystem.FileProxyPrototype.class); 
				}
				return proxy.API_File;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		FilesystemModulePrototype proxy = this;
		while (start != null && !(start instanceof FilesystemModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof FilesystemModulePrototype) {
			proxy = (FilesystemModulePrototype) start;
		}

		switch (id) {
			case Id_applicationDataDirectory:
				proxy.setProperty("applicationDataDirectory", value);
				proxy.onPropertyChanged("applicationDataDirectory", value);
				break; 
			case Id_applicationDirectory:
				proxy.setProperty("applicationDirectory", value);
				proxy.onPropertyChanged("applicationDirectory", value);
				break; 
			case Id_externalStoragePresent:
				proxy.setProperty("externalStoragePresent", value);
				proxy.onPropertyChanged("externalStoragePresent", value);
				break; 
			case Id_lineEnding:
				proxy.setProperty("lineEnding", value);
				proxy.onPropertyChanged("lineEnding", value);
				break; 
			case Id_applicationCacheDirectory:
				proxy.setProperty("applicationCacheDirectory", value);
				proxy.onPropertyChanged("applicationCacheDirectory", value);
				break; 
			case Id_resourcesDirectory:
				proxy.setProperty("resourcesDirectory", value);
				proxy.onPropertyChanged("resourcesDirectory", value);
				break; 
			case Id_tempDirectory:
				proxy.setProperty("tempDirectory", value);
				proxy.onPropertyChanged("tempDirectory", value);
				break; 
			case Id_externalStorageDirectory:
				proxy.setProperty("externalStorageDirectory", value);
				proxy.onPropertyChanged("externalStorageDirectory", value);
				break; 
			case Id_resRawDirectory:
				proxy.setProperty("resRawDirectory", value);
				proxy.onPropertyChanged("resRawDirectory", value);
				break; 
			case Id_separator:
				proxy.setProperty("separator", value);
				proxy.onPropertyChanged("separator", value);
				break; 
			case Id_File:
				if (value instanceof Proxy) {
					proxy.API_File = value;
				} else {
					defineProperty(original, "File", value, 0);
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
