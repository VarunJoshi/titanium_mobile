/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium;

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

import ti.modules.titanium.BufferProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class BufferProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -8389257040740963558L;

	private static final String TAG = "BufferProxyPrototype";
	private static final String CLASS_TAG = "BufferProxy";
	private static BufferProxyPrototype bufferProxyPrototype;


	public static BufferProxyPrototype getProxyPrototype()
	{
		return bufferProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		bufferProxyPrototype = null;
	}

	public BufferProxyPrototype()
	{
		if (bufferProxyPrototype == null && getClass().equals(BufferProxyPrototype.class)) {
			bufferProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == bufferProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return bufferProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(BufferProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void clear(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "clear()", Log.DEBUG_MODE);

		try {
		BufferProxy proxy = (BufferProxy) ((Proxy) thisObj).getProxy();

		proxy.clear();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object append(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "append()", Log.DEBUG_MODE);

		try {
		BufferProxy proxy = (BufferProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		int javaResult = proxy.append(arg0);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object clone(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "clone()", Log.DEBUG_MODE);

		try {
		BufferProxy proxy = (BufferProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		ti.modules.titanium.BufferProxy javaResult = proxy.clone(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void fill(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "fill()", Log.DEBUG_MODE);

		try {
		BufferProxy proxy = (BufferProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		proxy.fill(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object toString(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "toString()", Log.DEBUG_MODE);

		try {
		BufferProxy proxy = (BufferProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.toString();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object toBlob(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "toBlob()", Log.DEBUG_MODE);

		try {
		BufferProxy proxy = (BufferProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.TiBlob javaResult = proxy.toBlob();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
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
		BufferProxy proxy = (BufferProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getLength();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object insert(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "insert()", Log.DEBUG_MODE);

		try {
		BufferProxy proxy = (BufferProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		int javaResult = proxy.insert(arg0);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setLength(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setLength()", Log.DEBUG_MODE);

		try {
		BufferProxy proxy = (BufferProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setLength: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setLength(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void release(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "release()", Log.DEBUG_MODE);

		try {
		BufferProxy proxy = (BufferProxy) ((Proxy) thisObj).getProxy();

		proxy.release();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object copy(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "copy()", Log.DEBUG_MODE);

		try {
		BufferProxy proxy = (BufferProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		int javaResult = proxy.copy(arg0);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Number getter_length()
	{
		Log.d(TAG, "get length", Log.DEBUG_MODE);
		BufferProxy proxy = (BufferProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getLength();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public void setter_length(Object value)
	{
		Log.d(TAG, "set length", Log.DEBUG_MODE);
		BufferProxy proxy = (BufferProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setLength(arg0);
		//proxy.setProperty("length", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getByteOrder = 2,
		Id_setByteOrder = 3,
		Id_getType = 4,
		Id_setType = 5,
		Id_getValue = 6,
		Id_setValue = 7,
		// Method IDs
		Id_clear = 8,
		Id_append = 9,
		Id_clone = 10,
		Id_fill = 11,
		Id_toString = 12,
		Id_toBlob = 13,
		Id_getLength = 14,
		Id_insert = 15,
		Id_setLength = 16,
		Id_release = 17,
		Id_copy = 18
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
            case 4: c=s.charAt(0);
                if (c=='c') { X="copy";id=Id_copy; }
                else if (c=='f') { X="fill";id=Id_fill; }
                break L;
            case 5: c=s.charAt(2);
                if (c=='e') { X="clear";id=Id_clear; }
                else if (c=='o') { X="clone";id=Id_clone; }
                break L;
            case 6: c=s.charAt(0);
                if (c=='a') { X="append";id=Id_append; }
                else if (c=='i') { X="insert";id=Id_insert; }
                else if (c=='t') { X="toBlob";id=Id_toBlob; }
                break L;
            case 7: c=s.charAt(0);
                if (c=='g') { X="getType";id=Id_getType; }
                else if (c=='r') { X="release";id=Id_release; }
                else if (c=='s') { X="setType";id=Id_setType; }
                break L;
            case 8: c=s.charAt(0);
                if (c=='g') { X="getValue";id=Id_getValue; }
                else if (c=='s') { X="setValue";id=Id_setValue; }
                else if (c=='t') { X="toString";id=Id_toString; }
                break L;
            case 9: c=s.charAt(0);
                if (c=='g') { X="getLength";id=Id_getLength; }
                else if (c=='s') { X="setLength";id=Id_setLength; }
                break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: c=s.charAt(0);
                if (c=='g') { X="getByteOrder";id=Id_getByteOrder; }
                else if (c=='s') { X="setByteOrder";id=Id_setByteOrder; }
                break L;
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
			case Id_getByteOrder:
				arity = 0;
				name = "getByteOrder";
				break;
			case Id_setByteOrder:
				arity = 1;
				name = "setByteOrder";
				break;
			case Id_getType:
				arity = 0;
				name = "getType";
				break;
			case Id_setType:
				arity = 1;
				name = "setType";
				break;
			case Id_getValue:
				arity = 0;
				name = "getValue";
				break;
			case Id_setValue:
				arity = 1;
				name = "setValue";
				break;
			case Id_clear:
				arity = 0;
				name = "clear";
				break;
			case Id_append:
				arity = 1;
				name = "append";
				break;
			case Id_clone:
				arity = 1;
				name = "clone";
				break;
			case Id_fill:
				arity = 1;
				name = "fill";
				break;
			case Id_toString:
				arity = 0;
				name = "toString";
				break;
			case Id_toBlob:
				arity = 0;
				name = "toBlob";
				break;
			case Id_getLength:
				arity = 0;
				name = "getLength";
				break;
			case Id_insert:
				arity = 1;
				name = "insert";
				break;
			case Id_setLength:
				arity = 1;
				name = "setLength";
				break;
			case Id_release:
				arity = 0;
				name = "release";
				break;
			case Id_copy:
				arity = 1;
				name = "copy";
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

		while (thisObj != null && !(thisObj instanceof BufferProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		BufferProxyPrototype proxy = (BufferProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getByteOrder:
				return proxy.getProperty("byteOrder");
			case Id_setByteOrder:
				proxy.setProperty("byteOrder", args[0]);
				proxy.onPropertyChanged("byteOrder", args[0]);
				return Undefined.instance;
			case Id_getType:
				return proxy.getProperty("type");
			case Id_setType:
				proxy.setProperty("type", args[0]);
				proxy.onPropertyChanged("type", args[0]);
				return Undefined.instance;
			case Id_getValue:
				return proxy.getProperty("value");
			case Id_setValue:
				proxy.setProperty("value", args[0]);
				proxy.onPropertyChanged("value", args[0]);
				return Undefined.instance;
			case Id_clear:
				 clear(cx, thisObj, args);
				return Undefined.instance;
			case Id_append:
				return append(cx, thisObj, args);
				
			case Id_clone:
				return clone(cx, thisObj, args);
				
			case Id_fill:
				 fill(cx, thisObj, args);
				return Undefined.instance;
			case Id_toString:
				return toString(cx, thisObj, args);
				
			case Id_toBlob:
				return toBlob(cx, thisObj, args);
				
			case Id_getLength:
				return getLength(cx, thisObj, args);
				
			case Id_insert:
				return insert(cx, thisObj, args);
				
			case Id_setLength:
				 setLength(cx, thisObj, args);
				return Undefined.instance;
			case Id_release:
				 release(cx, thisObj, args);
				return Undefined.instance;
			case Id_copy:
				return copy(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_length = 1
		;

	// Property accessor IDs
	private static final int

		Id_byteOrder = 2
		,		
		Id_type = 3
		,		
		Id_value = 4
		;

;

	public static final int MAX_INSTANCE_ID = 4;

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
        L0: { id = 0; String X = null;
            L: switch (s.length()) {
            case 4: X="type";id=Id_type; break L;
            case 5: X="value";id=Id_value; break L;
            case 6: X="length";id=Id_length; break L;
            case 9: X="byteOrder";id=Id_byteOrder; break L;
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
			case Id_length:
				return "length"; 
			case Id_byteOrder:
				return "byteOrder";
			case Id_type:
				return "type";
			case Id_value:
				return "value";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		BufferProxyPrototype proxy = this;
		while (start != null && !(start instanceof BufferProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof BufferProxyPrototype) {
			proxy = (BufferProxyPrototype) start;
		}

		switch (id) {
			case Id_length:
				return proxy.getter_length();
			case Id_byteOrder:
				return proxy.getProperty("byteOrder");
			case Id_type:
				return proxy.getProperty("type");
			case Id_value:
				return proxy.getProperty("value");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		BufferProxyPrototype proxy = this;
		while (start != null && !(start instanceof BufferProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof BufferProxyPrototype) {
			proxy = (BufferProxyPrototype) start;
		}

		switch (id) {
			case Id_length:
				proxy.setter_length(value);
				break; 
			case Id_byteOrder:
				proxy.setProperty("byteOrder", value);
				proxy.onPropertyChanged("byteOrder", value);
				break;
			case Id_type:
				proxy.setProperty("type", value);
				proxy.onPropertyChanged("type", value);
				break;
			case Id_value:
				proxy.setProperty("value", value);
				proxy.onPropertyChanged("value", value);
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
