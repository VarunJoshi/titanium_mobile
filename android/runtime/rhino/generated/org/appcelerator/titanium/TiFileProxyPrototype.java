/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package org.appcelerator.titanium;

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

import org.appcelerator.titanium.TiFileProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class TiFileProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -3155827656147072751L;

	private static final String TAG = "TiFileProxyPrototype";
	private static final String CLASS_TAG = "TiFileProxy";
	private static TiFileProxyPrototype tiFileProxyPrototype;


	public static TiFileProxyPrototype getProxyPrototype()
	{
		return tiFileProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		tiFileProxyPrototype = null;
	}

	public TiFileProxyPrototype()
	{
		if (tiFileProxyPrototype == null && getClass().equals(TiFileProxyPrototype.class)) {
			tiFileProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == tiFileProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return tiFileProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TiFileProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getNativePath(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getNativePath()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getNativePath();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object rename(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "rename()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("rename: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		boolean javaResult = proxy.rename(arg0);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getReadonly(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getReadonly()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getReadonly();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object modificationTimestamp(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "modificationTimestamp()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		double javaResult = proxy.modificationTimestamp();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object spaceAvailable(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "spaceAvailable()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		double javaResult = proxy.spaceAvailable();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createTimestamp(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createTimestamp()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		double javaResult = proxy.createTimestamp();

		Number rhinoResult = (Number) javaResult;
	
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
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("open: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		ti.modules.titanium.stream.FileStreamProxy javaResult = proxy.open(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getSymbolicLink(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getSymbolicLink()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getSymbolicLink();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object write(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "write()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		boolean javaResult = proxy.write(arg0);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object read(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "read()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.TiBlob javaResult = proxy.read();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getWritable(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getWritable()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getWritable();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void writeLine(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "writeLine()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("writeLine: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.writeLine(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getSize(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getSize()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		double javaResult = proxy.getSize();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getDirectoryListing(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDirectoryListing()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		java.lang.String[] javaResult = proxy.getDirectoryListing();

		Scriptable rhinoResult = (Scriptable) TypeConverter.javaStringArrayToJsArray(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object move(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "move()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("move: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		boolean javaResult = proxy.move(arg0);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object deleteDirectory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "deleteDirectory()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();
		java.lang.Object arg0;
		if (args.length <= 0) {
			arg0 = null;
		} else {
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		}

		boolean javaResult = proxy.deleteDirectory(arg0);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object copy(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "copy()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("copy: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		boolean javaResult = proxy.copy(arg0);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object deleteFile(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "deleteFile()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.deleteFile();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object resolve(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "resolve()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.resolve();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getParent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getParent()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.TiFileProxy javaResult = proxy.getParent();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createDirectory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createDirectory()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();
		java.lang.Object arg0;
		if (args.length <= 0) {
			arg0 = null;
		} else {
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		}

		boolean javaResult = proxy.createDirectory(arg0);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getExecutable(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getExecutable()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getExecutable();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object extension(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "extension()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.extension();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object isDirectory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isDirectory()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isDirectory();

		Boolean rhinoResult = (Boolean) javaResult;
	
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
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getHidden();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object readLine(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "readLine()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.readLine();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object isFile(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isFile()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isFile();

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
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getName();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object exists(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "exists()", Log.DEBUG_MODE);

		try {
		TiFileProxy proxy = (TiFileProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.exists();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Boolean getter_hidden()
	{
		Log.d(TAG, "get hidden", Log.DEBUG_MODE);
		TiFileProxy proxy = (TiFileProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getHidden();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public String getter_nativePath()
	{
		Log.d(TAG, "get nativePath", Log.DEBUG_MODE);
		TiFileProxy proxy = (TiFileProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getNativePath();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Boolean getter_writable()
	{
		Log.d(TAG, "get writable", Log.DEBUG_MODE);
		TiFileProxy proxy = (TiFileProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getWritable();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public String getter_name()
	{
		Log.d(TAG, "get name", Log.DEBUG_MODE);
		TiFileProxy proxy = (TiFileProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getName();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Boolean getter_executable()
	{
		Log.d(TAG, "get executable", Log.DEBUG_MODE);
		TiFileProxy proxy = (TiFileProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getExecutable();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public Proxy getter_parent()
	{
		Log.d(TAG, "get parent", Log.DEBUG_MODE);
		TiFileProxy proxy = (TiFileProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.TiFileProxy javaResult = proxy.getParent();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Boolean getter_readonly()
	{
		Log.d(TAG, "get readonly", Log.DEBUG_MODE);
		TiFileProxy proxy = (TiFileProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getReadonly();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public Boolean getter_symbolicLink()
	{
		Log.d(TAG, "get symbolicLink", Log.DEBUG_MODE);
		TiFileProxy proxy = (TiFileProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getSymbolicLink();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public Scriptable getter_directoryListing()
	{
		Log.d(TAG, "get directoryListing", Log.DEBUG_MODE);
		TiFileProxy proxy = (TiFileProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String[] javaResult = proxy.getDirectoryListing();

		Scriptable rhinoResult = (Scriptable) TypeConverter.javaStringArrayToJsArray(javaResult, this);
		return rhinoResult;
	}
	public Number getter_size()
	{
		Log.d(TAG, "get size", Log.DEBUG_MODE);
		TiFileProxy proxy = (TiFileProxy) getProxy();
		Scriptable thisObj = this;
		double javaResult = proxy.getSize();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getNativePath = 2,
		Id_rename = 3,
		Id_getReadonly = 4,
		Id_modificationTimestamp = 5,
		Id_spaceAvailable = 6,
		Id_createTimestamp = 7,
		Id_open = 8,
		Id_getSymbolicLink = 9,
		Id_write = 10,
		Id_read = 11,
		Id_getWritable = 12,
		Id_writeLine = 13,
		Id_getSize = 14,
		Id_getDirectoryListing = 15,
		Id_move = 16,
		Id_deleteDirectory = 17,
		Id_copy = 18,
		Id_deleteFile = 19,
		Id_resolve = 20,
		Id_getParent = 21,
		Id_createDirectory = 22,
		Id_getExecutable = 23,
		Id_extension = 24,
		Id_isDirectory = 25,
		Id_getHidden = 26,
		Id_readLine = 27,
		Id_isFile = 28,
		Id_getName = 29,
		Id_exists = 30
;
		

	public static final int MAX_PROTOTYPE_ID = 30;

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
            case 4: switch (s.charAt(0)) {
                case 'c': X="copy";id=Id_copy; break L;
                case 'm': X="move";id=Id_move; break L;
                case 'o': X="open";id=Id_open; break L;
                case 'r': X="read";id=Id_read; break L;
                } break L;
            case 5: X="write";id=Id_write; break L;
            case 6: c=s.charAt(0);
                if (c=='e') { X="exists";id=Id_exists; }
                else if (c=='i') { X="isFile";id=Id_isFile; }
                else if (c=='r') { X="rename";id=Id_rename; }
                break L;
            case 7: c=s.charAt(3);
                if (c=='N') { X="getName";id=Id_getName; }
                else if (c=='S') { X="getSize";id=Id_getSize; }
                else if (c=='o') { X="resolve";id=Id_resolve; }
                break L;
            case 8: X="readLine";id=Id_readLine; break L;
            case 9: switch (s.charAt(3)) {
                case 'H': X="getHidden";id=Id_getHidden; break L;
                case 'P': X="getParent";id=Id_getParent; break L;
                case 'e': X="extension";id=Id_extension; break L;
                case 't': X="writeLine";id=Id_writeLine; break L;
                } break L;
            case 10: X="deleteFile";id=Id_deleteFile; break L;
            case 11: switch (s.charAt(3)) {
                case 'R': X="getReadonly";id=Id_getReadonly; break L;
                case 'W': X="getWritable";id=Id_getWritable; break L;
                case 'i': X="isDirectory";id=Id_isDirectory; break L;
                case 's': X="constructor";id=Id_constructor; break L;
                } break L;
            case 13: c=s.charAt(3);
                if (c=='E') { X="getExecutable";id=Id_getExecutable; }
                else if (c=='N') { X="getNativePath";id=Id_getNativePath; }
                break L;
            case 14: X="spaceAvailable";id=Id_spaceAvailable; break L;
            case 15: c=s.charAt(0);
                if (c=='c') {
                    c=s.charAt(14);
                    if (c=='p') { X="createTimestamp";id=Id_createTimestamp; }
                    else if (c=='y') { X="createDirectory";id=Id_createDirectory; }
                }
                else if (c=='d') { X="deleteDirectory";id=Id_deleteDirectory; }
                else if (c=='g') { X="getSymbolicLink";id=Id_getSymbolicLink; }
                break L;
            case 19: X="getDirectoryListing";id=Id_getDirectoryListing; break L;
            case 21: X="modificationTimestamp";id=Id_modificationTimestamp; break L;
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
			case Id_getNativePath:
				arity = 0;
				name = "getNativePath";
				break;
			case Id_rename:
				arity = 1;
				name = "rename";
				break;
			case Id_getReadonly:
				arity = 0;
				name = "getReadonly";
				break;
			case Id_modificationTimestamp:
				arity = 0;
				name = "modificationTimestamp";
				break;
			case Id_spaceAvailable:
				arity = 0;
				name = "spaceAvailable";
				break;
			case Id_createTimestamp:
				arity = 0;
				name = "createTimestamp";
				break;
			case Id_open:
				arity = 1;
				name = "open";
				break;
			case Id_getSymbolicLink:
				arity = 0;
				name = "getSymbolicLink";
				break;
			case Id_write:
				arity = 1;
				name = "write";
				break;
			case Id_read:
				arity = 0;
				name = "read";
				break;
			case Id_getWritable:
				arity = 0;
				name = "getWritable";
				break;
			case Id_writeLine:
				arity = 1;
				name = "writeLine";
				break;
			case Id_getSize:
				arity = 0;
				name = "getSize";
				break;
			case Id_getDirectoryListing:
				arity = 0;
				name = "getDirectoryListing";
				break;
			case Id_move:
				arity = 1;
				name = "move";
				break;
			case Id_deleteDirectory:
				arity = 1;
				name = "deleteDirectory";
				break;
			case Id_copy:
				arity = 1;
				name = "copy";
				break;
			case Id_deleteFile:
				arity = 0;
				name = "deleteFile";
				break;
			case Id_resolve:
				arity = 0;
				name = "resolve";
				break;
			case Id_getParent:
				arity = 0;
				name = "getParent";
				break;
			case Id_createDirectory:
				arity = 1;
				name = "createDirectory";
				break;
			case Id_getExecutable:
				arity = 0;
				name = "getExecutable";
				break;
			case Id_extension:
				arity = 0;
				name = "extension";
				break;
			case Id_isDirectory:
				arity = 0;
				name = "isDirectory";
				break;
			case Id_getHidden:
				arity = 0;
				name = "getHidden";
				break;
			case Id_readLine:
				arity = 0;
				name = "readLine";
				break;
			case Id_isFile:
				arity = 0;
				name = "isFile";
				break;
			case Id_getName:
				arity = 0;
				name = "getName";
				break;
			case Id_exists:
				arity = 0;
				name = "exists";
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

		while (thisObj != null && !(thisObj instanceof TiFileProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TiFileProxyPrototype proxy = (TiFileProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getNativePath:
				return getNativePath(cx, thisObj, args);
				
			case Id_rename:
				return rename(cx, thisObj, args);
				
			case Id_getReadonly:
				return getReadonly(cx, thisObj, args);
				
			case Id_modificationTimestamp:
				return modificationTimestamp(cx, thisObj, args);
				
			case Id_spaceAvailable:
				return spaceAvailable(cx, thisObj, args);
				
			case Id_createTimestamp:
				return createTimestamp(cx, thisObj, args);
				
			case Id_open:
				return open(cx, thisObj, args);
				
			case Id_getSymbolicLink:
				return getSymbolicLink(cx, thisObj, args);
				
			case Id_write:
				return write(cx, thisObj, args);
				
			case Id_read:
				return read(cx, thisObj, args);
				
			case Id_getWritable:
				return getWritable(cx, thisObj, args);
				
			case Id_writeLine:
				 writeLine(cx, thisObj, args);
				return Undefined.instance;
			case Id_getSize:
				return getSize(cx, thisObj, args);
				
			case Id_getDirectoryListing:
				return getDirectoryListing(cx, thisObj, args);
				
			case Id_move:
				return move(cx, thisObj, args);
				
			case Id_deleteDirectory:
				return deleteDirectory(cx, thisObj, args);
				
			case Id_copy:
				return copy(cx, thisObj, args);
				
			case Id_deleteFile:
				return deleteFile(cx, thisObj, args);
				
			case Id_resolve:
				return resolve(cx, thisObj, args);
				
			case Id_getParent:
				return getParent(cx, thisObj, args);
				
			case Id_createDirectory:
				return createDirectory(cx, thisObj, args);
				
			case Id_getExecutable:
				return getExecutable(cx, thisObj, args);
				
			case Id_extension:
				return extension(cx, thisObj, args);
				
			case Id_isDirectory:
				return isDirectory(cx, thisObj, args);
				
			case Id_getHidden:
				return getHidden(cx, thisObj, args);
				
			case Id_readLine:
				return readLine(cx, thisObj, args);
				
			case Id_isFile:
				return isFile(cx, thisObj, args);
				
			case Id_getName:
				return getName(cx, thisObj, args);
				
			case Id_exists:
				return exists(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_hidden = 1
		,		
		Id_nativePath = 2
		,		
		Id_writable = 3
		,		
		Id_name = 4
		,		
		Id_executable = 5
		,		
		Id_parent = 6
		,		
		Id_readonly = 7
		,		
		Id_symbolicLink = 8
		,		
		Id_directoryListing = 9
		,		
		Id_size = 10
		;

;

;

	public static final int MAX_INSTANCE_ID = 10;

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
                if (c=='n') { X="name";id=Id_name; }
                else if (c=='s') { X="size";id=Id_size; }
                break L;
            case 6: c=s.charAt(0);
                if (c=='h') { X="hidden";id=Id_hidden; }
                else if (c=='p') { X="parent";id=Id_parent; }
                break L;
            case 8: c=s.charAt(0);
                if (c=='r') { X="readonly";id=Id_readonly; }
                else if (c=='w') { X="writable";id=Id_writable; }
                break L;
            case 10: c=s.charAt(0);
                if (c=='e') { X="executable";id=Id_executable; }
                else if (c=='n') { X="nativePath";id=Id_nativePath; }
                break L;
            case 12: X="symbolicLink";id=Id_symbolicLink; break L;
            case 16: X="directoryListing";id=Id_directoryListing; break L;
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
			case Id_hidden:
				return "hidden"; 
			case Id_nativePath:
				return "nativePath"; 
			case Id_writable:
				return "writable"; 
			case Id_name:
				return "name"; 
			case Id_executable:
				return "executable"; 
			case Id_parent:
				return "parent"; 
			case Id_readonly:
				return "readonly"; 
			case Id_symbolicLink:
				return "symbolicLink"; 
			case Id_directoryListing:
				return "directoryListing"; 
			case Id_size:
				return "size"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TiFileProxyPrototype proxy = this;
		while (start != null && !(start instanceof TiFileProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TiFileProxyPrototype) {
			proxy = (TiFileProxyPrototype) start;
		}

		switch (id) {
			case Id_hidden:
				return proxy.getter_hidden();
			case Id_nativePath:
				return proxy.getter_nativePath();
			case Id_writable:
				return proxy.getter_writable();
			case Id_name:
				return proxy.getter_name();
			case Id_executable:
				return proxy.getter_executable();
			case Id_parent:
				return proxy.getter_parent();
			case Id_readonly:
				return proxy.getter_readonly();
			case Id_symbolicLink:
				return proxy.getter_symbolicLink();
			case Id_directoryListing:
				return proxy.getter_directoryListing();
			case Id_size:
				return proxy.getter_size();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		TiFileProxyPrototype proxy = this;
		while (start != null && !(start instanceof TiFileProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TiFileProxyPrototype) {
			proxy = (TiFileProxyPrototype) start;
		}

		switch (id) {
			case Id_hidden:
				proxy.setProperty("hidden", value);
				proxy.onPropertyChanged("hidden", value);
				break; 
			case Id_nativePath:
				proxy.setProperty("nativePath", value);
				proxy.onPropertyChanged("nativePath", value);
				break; 
			case Id_writable:
				proxy.setProperty("writable", value);
				proxy.onPropertyChanged("writable", value);
				break; 
			case Id_name:
				proxy.setProperty("name", value);
				proxy.onPropertyChanged("name", value);
				break; 
			case Id_executable:
				proxy.setProperty("executable", value);
				proxy.onPropertyChanged("executable", value);
				break; 
			case Id_parent:
				proxy.setProperty("parent", value);
				proxy.onPropertyChanged("parent", value);
				break; 
			case Id_readonly:
				proxy.setProperty("readonly", value);
				proxy.onPropertyChanged("readonly", value);
				break; 
			case Id_symbolicLink:
				proxy.setProperty("symbolicLink", value);
				proxy.onPropertyChanged("symbolicLink", value);
				break; 
			case Id_directoryListing:
				proxy.setProperty("directoryListing", value);
				proxy.onPropertyChanged("directoryListing", value);
				break; 
			case Id_size:
				proxy.setProperty("size", value);
				proxy.onPropertyChanged("size", value);
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
