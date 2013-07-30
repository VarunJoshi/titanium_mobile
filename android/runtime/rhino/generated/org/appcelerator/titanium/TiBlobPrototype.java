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

import org.appcelerator.titanium.TiBlob;

import org.appcelerator.kroll.KrollProxyPrototype;


public class TiBlobPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 3969834836705707537L;

	private static final String TAG = "TiBlobPrototype";
	private static final String CLASS_TAG = "TiBlob";
	private static TiBlobPrototype tiBlobPrototype;


	public static TiBlobPrototype getProxyPrototype()
	{
		return tiBlobPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		tiBlobPrototype = null;
	}

	public TiBlobPrototype()
	{
		if (tiBlobPrototype == null && getClass().equals(TiBlobPrototype.class)) {
			tiBlobPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == tiBlobPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return tiBlobPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TiBlob.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object imageAsCropped(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "imageAsCropped()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("imageAsCropped: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		org.appcelerator.titanium.TiBlob javaResult = proxy.imageAsCropped(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getFile(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getFile()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.TiFileProxy javaResult = proxy.getFile();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void append(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "append()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("append: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.titanium.TiBlob arg0;
		arg0 = (org.appcelerator.titanium.TiBlob) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.append(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getNativePath(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getNativePath()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getNativePath();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object imageWithRoundedCorner(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "imageWithRoundedCorner()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("imageWithRoundedCorner: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Number arg0;
		arg0 = (java.lang.Number) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		java.lang.Number arg1;
		if (args.length <= 1) {
			arg1 = null;
		} else {
		arg1 = (java.lang.Number) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;
		}

		org.appcelerator.titanium.TiBlob javaResult = proxy.imageWithRoundedCorner(arg0, arg1);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getText(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getText()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getText();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object imageWithTransparentBorder(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "imageWithTransparentBorder()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("imageWithTransparentBorder: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Number arg0;
		arg0 = (java.lang.Number) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		org.appcelerator.titanium.TiBlob javaResult = proxy.imageWithTransparentBorder(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getHeight(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getHeight()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getHeight();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getType(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getType()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getType();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object imageWithAlpha(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "imageWithAlpha()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.TiBlob javaResult = proxy.imageWithAlpha();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object toBase64(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "toBase64()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.toBase64();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object toString(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "toString()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.toString();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getWidth(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getWidth()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getWidth();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getLength(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLength()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getLength();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object imageAsResized(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "imageAsResized()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("imageAsResized: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.Number arg0;
		arg0 = (java.lang.Number) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		java.lang.Number arg1;
		arg1 = (java.lang.Number) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;

		org.appcelerator.titanium.TiBlob javaResult = proxy.imageAsResized(arg0, arg1);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getMimeType(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getMimeType()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getMimeType();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object imageAsThumbnail(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "imageAsThumbnail()", Log.DEBUG_MODE);

		try {
		TiBlob proxy = (TiBlob) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("imageAsThumbnail: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Number arg0;
		arg0 = (java.lang.Number) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		java.lang.Number arg1;
		if (args.length <= 1) {
			arg1 = null;
		} else {
		arg1 = (java.lang.Number) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;
		}
		java.lang.Number arg2;
		if (args.length <= 2) {
			arg2 = null;
		} else {
		arg2 = (java.lang.Number) TypeConverter.jsObjectToJavaObject(args[2], thisObj) ;
		}

		org.appcelerator.titanium.TiBlob javaResult = proxy.imageAsThumbnail(arg0, arg1, arg2);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public String getter_text()
	{
		Log.d(TAG, "get text", Log.DEBUG_MODE);
		TiBlob proxy = (TiBlob) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getText();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Number getter_height()
	{
		Log.d(TAG, "get height", Log.DEBUG_MODE);
		TiBlob proxy = (TiBlob) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getHeight();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public String getter_nativePath()
	{
		Log.d(TAG, "get nativePath", Log.DEBUG_MODE);
		TiBlob proxy = (TiBlob) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getNativePath();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Proxy getter_file()
	{
		Log.d(TAG, "get file", Log.DEBUG_MODE);
		TiBlob proxy = (TiBlob) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.TiFileProxy javaResult = proxy.getFile();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Number getter_width()
	{
		Log.d(TAG, "get width", Log.DEBUG_MODE);
		TiBlob proxy = (TiBlob) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getWidth();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Number getter_length()
	{
		Log.d(TAG, "get length", Log.DEBUG_MODE);
		TiBlob proxy = (TiBlob) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getLength();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Number getter_type()
	{
		Log.d(TAG, "get type", Log.DEBUG_MODE);
		TiBlob proxy = (TiBlob) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getType();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public String getter_mimeType()
	{
		Log.d(TAG, "get mimeType", Log.DEBUG_MODE);
		TiBlob proxy = (TiBlob) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getMimeType();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_imageAsCropped = 2,
		Id_getFile = 3,
		Id_append = 4,
		Id_getNativePath = 5,
		Id_imageWithRoundedCorner = 6,
		Id_getText = 7,
		Id_imageWithTransparentBorder = 8,
		Id_getHeight = 9,
		Id_getType = 10,
		Id_imageWithAlpha = 11,
		Id_toBase64 = 12,
		Id_toString = 13,
		Id_getWidth = 14,
		Id_getLength = 15,
		Id_imageAsResized = 16,
		Id_getMimeType = 17,
		Id_imageAsThumbnail = 18
;
		

	public static final int MAX_PROTOTYPE_ID = 18;

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
            case 6: X="append";id=Id_append; break L;
            case 7: c=s.charAt(4);
                if (c=='e') { X="getText";id=Id_getText; }
                else if (c=='i') { X="getFile";id=Id_getFile; }
                else if (c=='y') { X="getType";id=Id_getType; }
                break L;
            case 8: c=s.charAt(2);
                if (c=='B') { X="toBase64";id=Id_toBase64; }
                else if (c=='S') { X="toString";id=Id_toString; }
                else if (c=='t') { X="getWidth";id=Id_getWidth; }
                break L;
            case 9: c=s.charAt(3);
                if (c=='H') { X="getHeight";id=Id_getHeight; }
                else if (c=='L') { X="getLength";id=Id_getLength; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') { X="getMimeType";id=Id_getMimeType; }
                break L;
            case 13: X="getNativePath";id=Id_getNativePath; break L;
            case 14: c=s.charAt(7);
                if (c=='C') { X="imageAsCropped";id=Id_imageAsCropped; }
                else if (c=='R') { X="imageAsResized";id=Id_imageAsResized; }
                else if (c=='t') { X="imageWithAlpha";id=Id_imageWithAlpha; }
                break L;
            case 16: X="imageAsThumbnail";id=Id_imageAsThumbnail; break L;
            case 22: X="imageWithRoundedCorner";id=Id_imageWithRoundedCorner; break L;
            case 26: X="imageWithTransparentBorder";id=Id_imageWithTransparentBorder; break L;
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
			case Id_imageAsCropped:
				arity = 1;
				name = "imageAsCropped";
				break;
			case Id_getFile:
				arity = 0;
				name = "getFile";
				break;
			case Id_append:
				arity = 1;
				name = "append";
				break;
			case Id_getNativePath:
				arity = 0;
				name = "getNativePath";
				break;
			case Id_imageWithRoundedCorner:
				arity = 2;
				name = "imageWithRoundedCorner";
				break;
			case Id_getText:
				arity = 0;
				name = "getText";
				break;
			case Id_imageWithTransparentBorder:
				arity = 1;
				name = "imageWithTransparentBorder";
				break;
			case Id_getHeight:
				arity = 0;
				name = "getHeight";
				break;
			case Id_getType:
				arity = 0;
				name = "getType";
				break;
			case Id_imageWithAlpha:
				arity = 0;
				name = "imageWithAlpha";
				break;
			case Id_toBase64:
				arity = 0;
				name = "toBase64";
				break;
			case Id_toString:
				arity = 0;
				name = "toString";
				break;
			case Id_getWidth:
				arity = 0;
				name = "getWidth";
				break;
			case Id_getLength:
				arity = 0;
				name = "getLength";
				break;
			case Id_imageAsResized:
				arity = 2;
				name = "imageAsResized";
				break;
			case Id_getMimeType:
				arity = 0;
				name = "getMimeType";
				break;
			case Id_imageAsThumbnail:
				arity = 3;
				name = "imageAsThumbnail";
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

		while (thisObj != null && !(thisObj instanceof TiBlobPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TiBlobPrototype proxy = (TiBlobPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_imageAsCropped:
				return imageAsCropped(cx, thisObj, args);
				
			case Id_getFile:
				return getFile(cx, thisObj, args);
				
			case Id_append:
				 append(cx, thisObj, args);
				return Undefined.instance;
			case Id_getNativePath:
				return getNativePath(cx, thisObj, args);
				
			case Id_imageWithRoundedCorner:
				return imageWithRoundedCorner(cx, thisObj, args);
				
			case Id_getText:
				return getText(cx, thisObj, args);
				
			case Id_imageWithTransparentBorder:
				return imageWithTransparentBorder(cx, thisObj, args);
				
			case Id_getHeight:
				return getHeight(cx, thisObj, args);
				
			case Id_getType:
				return getType(cx, thisObj, args);
				
			case Id_imageWithAlpha:
				return imageWithAlpha(cx, thisObj, args);
				
			case Id_toBase64:
				return toBase64(cx, thisObj, args);
				
			case Id_toString:
				return toString(cx, thisObj, args);
				
			case Id_getWidth:
				return getWidth(cx, thisObj, args);
				
			case Id_getLength:
				return getLength(cx, thisObj, args);
				
			case Id_imageAsResized:
				return imageAsResized(cx, thisObj, args);
				
			case Id_getMimeType:
				return getMimeType(cx, thisObj, args);
				
			case Id_imageAsThumbnail:
				return imageAsThumbnail(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_text = 1
		,		
		Id_height = 2
		,		
		Id_nativePath = 3
		,		
		Id_file = 4
		,		
		Id_width = 5
		,		
		Id_length = 6
		,		
		Id_type = 7
		,		
		Id_mimeType = 8
		;

;

;

	public static final int MAX_INSTANCE_ID = 8;

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
            case 4: c=s.charAt(1);
                if (c=='e') { X="text";id=Id_text; }
                else if (c=='i') { X="file";id=Id_file; }
                else if (c=='y') { X="type";id=Id_type; }
                break L;
            case 5: X="width";id=Id_width; break L;
            case 6: c=s.charAt(0);
                if (c=='h') { X="height";id=Id_height; }
                else if (c=='l') { X="length";id=Id_length; }
                break L;
            case 8: X="mimeType";id=Id_mimeType; break L;
            case 10: X="nativePath";id=Id_nativePath; break L;
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
			case Id_text:
				return "text"; 
			case Id_height:
				return "height"; 
			case Id_nativePath:
				return "nativePath"; 
			case Id_file:
				return "file"; 
			case Id_width:
				return "width"; 
			case Id_length:
				return "length"; 
			case Id_type:
				return "type"; 
			case Id_mimeType:
				return "mimeType"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TiBlobPrototype proxy = this;
		while (start != null && !(start instanceof TiBlobPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TiBlobPrototype) {
			proxy = (TiBlobPrototype) start;
		}

		switch (id) {
			case Id_text:
				return proxy.getter_text();
			case Id_height:
				return proxy.getter_height();
			case Id_nativePath:
				return proxy.getter_nativePath();
			case Id_file:
				return proxy.getter_file();
			case Id_width:
				return proxy.getter_width();
			case Id_length:
				return proxy.getter_length();
			case Id_type:
				return proxy.getter_type();
			case Id_mimeType:
				return proxy.getter_mimeType();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		TiBlobPrototype proxy = this;
		while (start != null && !(start instanceof TiBlobPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TiBlobPrototype) {
			proxy = (TiBlobPrototype) start;
		}

		switch (id) {
			case Id_text:
				proxy.setProperty("text", value);
				proxy.onPropertyChanged("text", value);
				break; 
			case Id_height:
				proxy.setProperty("height", value);
				proxy.onPropertyChanged("height", value);
				break; 
			case Id_nativePath:
				proxy.setProperty("nativePath", value);
				proxy.onPropertyChanged("nativePath", value);
				break; 
			case Id_file:
				proxy.setProperty("file", value);
				proxy.onPropertyChanged("file", value);
				break; 
			case Id_width:
				proxy.setProperty("width", value);
				proxy.onPropertyChanged("width", value);
				break; 
			case Id_length:
				proxy.setProperty("length", value);
				proxy.onPropertyChanged("length", value);
				break; 
			case Id_type:
				proxy.setProperty("type", value);
				proxy.onPropertyChanged("type", value);
				break; 
			case Id_mimeType:
				proxy.setProperty("mimeType", value);
				proxy.onPropertyChanged("mimeType", value);
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
