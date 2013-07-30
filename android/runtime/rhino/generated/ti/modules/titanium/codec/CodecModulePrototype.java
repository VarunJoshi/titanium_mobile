/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.codec;

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

import ti.modules.titanium.codec.CodecModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class CodecModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = -4731279195281232375L;

	private static final String TAG = "CodecModulePrototype";
	private static final String CLASS_TAG = "CodecModule";
	private static CodecModulePrototype codecModulePrototype;


	public static CodecModulePrototype getProxyPrototype()
	{
		return codecModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		codecModulePrototype = null;
	}

	public CodecModulePrototype()
	{
		if (codecModulePrototype == null && getClass().equals(CodecModulePrototype.class)) {
			codecModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("CHARSET_ISO_LATIN_1", this, "latin1");


			putConst("TYPE_SHORT", this, "short");


			putConst("CHARSET_UTF8", this, "utf8");


			putConst("TYPE_INT", this, "int");


			putConst("CHARSET_UTF16LE", this, "utf16le");


			putConst("CHARSET_UTF16", this, "utf16");


			putConst("BIG_ENDIAN", this, 0);


			putConst("TYPE_FLOAT", this, "float");


			putConst("TYPE_BYTE", this, "byte");


			putConst("TYPE_LONG", this, "long");


			putConst("CHARSET_UTF16BE", this, "utf16be");


			putConst("TYPE_DOUBLE", this, "double");


			putConst("LITTLE_ENDIAN", this, 1);


			putConst("CHARSET_ASCII", this, "ascii");

	}

	public Scriptable getPrototype()
	{
		if (this == codecModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return codecModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(CodecModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object decodeString(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "decodeString()", Log.DEBUG_MODE);

		try {
		CodecModule proxy = (CodecModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("decodeString: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		java.lang.String javaResult = proxy.decodeString(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object decodeNumber(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "decodeNumber()", Log.DEBUG_MODE);

		try {
		CodecModule proxy = (CodecModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("decodeNumber: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		java.lang.Object javaResult = proxy.decodeNumber(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getNativeByteOrder(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getNativeByteOrder()", Log.DEBUG_MODE);

		try {
		CodecModule proxy = (CodecModule) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getNativeByteOrder();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object encodeString(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "encodeString()", Log.DEBUG_MODE);

		try {
		CodecModule proxy = (CodecModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("encodeString: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		int javaResult = proxy.encodeString(arg0);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object encodeNumber(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "encodeNumber()", Log.DEBUG_MODE);

		try {
		CodecModule proxy = (CodecModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("encodeNumber: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		int javaResult = proxy.encodeNumber(arg0);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Number getter_nativeByteOrder()
	{
		Log.d(TAG, "get nativeByteOrder", Log.DEBUG_MODE);
		CodecModule proxy = (CodecModule) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getNativeByteOrder();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_decodeString = 2,
		Id_decodeNumber = 3,
		Id_getNativeByteOrder = 4,
		Id_encodeString = 5,
		Id_encodeNumber = 6
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
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null; int c;
            int s_length = s.length();
            if (s_length==11) { X="constructor";id=Id_constructor; }
            else if (s_length==12) {
                c=s.charAt(0);
                if (c=='d') {
                    c=s.charAt(11);
                    if (c=='g') { X="decodeString";id=Id_decodeString; }
                    else if (c=='r') { X="decodeNumber";id=Id_decodeNumber; }
                }
                else if (c=='e') {
                    c=s.charAt(11);
                    if (c=='g') { X="encodeString";id=Id_encodeString; }
                    else if (c=='r') { X="encodeNumber";id=Id_encodeNumber; }
                }
            }
            else if (s_length==18) { X="getNativeByteOrder";id=Id_getNativeByteOrder; }
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
			case Id_decodeString:
				arity = 1;
				name = "decodeString";
				break;
			case Id_decodeNumber:
				arity = 1;
				name = "decodeNumber";
				break;
			case Id_getNativeByteOrder:
				arity = 0;
				name = "getNativeByteOrder";
				break;
			case Id_encodeString:
				arity = 1;
				name = "encodeString";
				break;
			case Id_encodeNumber:
				arity = 1;
				name = "encodeNumber";
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

		while (thisObj != null && !(thisObj instanceof CodecModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		CodecModulePrototype proxy = (CodecModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_decodeString:
				return decodeString(cx, thisObj, args);
				
			case Id_decodeNumber:
				return decodeNumber(cx, thisObj, args);
				
			case Id_getNativeByteOrder:
				return getNativeByteOrder(cx, thisObj, args);
				
			case Id_encodeString:
				return encodeString(cx, thisObj, args);
				
			case Id_encodeNumber:
				return encodeNumber(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_nativeByteOrder = 1
		;

;

;

	public static final int MAX_INSTANCE_ID = 1;

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
            if (s.length()==15) { X="nativeByteOrder";id=Id_nativeByteOrder; }
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
			case Id_nativeByteOrder:
				return "nativeByteOrder"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		CodecModulePrototype proxy = this;
		while (start != null && !(start instanceof CodecModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof CodecModulePrototype) {
			proxy = (CodecModulePrototype) start;
		}

		switch (id) {
			case Id_nativeByteOrder:
				return proxy.getter_nativeByteOrder();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		CodecModulePrototype proxy = this;
		while (start != null && !(start instanceof CodecModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof CodecModulePrototype) {
			proxy = (CodecModulePrototype) start;
		}

		switch (id) {
			case Id_nativeByteOrder:
				proxy.setProperty("nativeByteOrder", value);
				proxy.onPropertyChanged("nativeByteOrder", value);
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
