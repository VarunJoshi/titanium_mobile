/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.stream;

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

import ti.modules.titanium.stream.BufferStreamProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class BufferStreamProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -8032327986652350529L;

	private static final String TAG = "BufferStreamProxyPrototype";
	private static final String CLASS_TAG = "BufferStreamProxy";
	private static BufferStreamProxyPrototype bufferStreamProxyPrototype;


	public static BufferStreamProxyPrototype getProxyPrototype()
	{
		return bufferStreamProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		bufferStreamProxyPrototype = null;
	}

	public BufferStreamProxyPrototype()
	{
		if (bufferStreamProxyPrototype == null && getClass().equals(BufferStreamProxyPrototype.class)) {
			bufferStreamProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == bufferStreamProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return bufferStreamProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(BufferStreamProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object write(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "write()", Log.DEBUG_MODE);

		try {
		BufferStreamProxy proxy = (BufferStreamProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		int javaResult = proxy.write(arg0);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object isWritable(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isWritable()", Log.DEBUG_MODE);

		try {
		BufferStreamProxy proxy = (BufferStreamProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isWritable();

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
		BufferStreamProxy proxy = (BufferStreamProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		int javaResult = proxy.read(arg0);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object isReadable(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isReadable()", Log.DEBUG_MODE);

		try {
		BufferStreamProxy proxy = (BufferStreamProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isReadable();

		Boolean rhinoResult = (Boolean) javaResult;
	
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
		BufferStreamProxy proxy = (BufferStreamProxy) ((Proxy) thisObj).getProxy();

		proxy.close();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_write = 2,
		Id_isWritable = 3,
		Id_read = 4,
		Id_isReadable = 5,
		Id_close = 6
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
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 4: X="read";id=Id_read; break L;
            case 5: c=s.charAt(0);
                if (c=='c') { X="close";id=Id_close; }
                else if (c=='w') { X="write";id=Id_write; }
                break L;
            case 10: c=s.charAt(2);
                if (c=='R') { X="isReadable";id=Id_isReadable; }
                else if (c=='W') { X="isWritable";id=Id_isWritable; }
                break L;
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
			case Id_write:
				arity = 1;
				name = "write";
				break;
			case Id_isWritable:
				arity = 0;
				name = "isWritable";
				break;
			case Id_read:
				arity = 1;
				name = "read";
				break;
			case Id_isReadable:
				arity = 0;
				name = "isReadable";
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

		while (thisObj != null && !(thisObj instanceof BufferStreamProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		BufferStreamProxyPrototype proxy = (BufferStreamProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_write:
				return write(cx, thisObj, args);
				
			case Id_isWritable:
				return isWritable(cx, thisObj, args);
				
			case Id_read:
				return read(cx, thisObj, args);
				
			case Id_isReadable:
				return isReadable(cx, thisObj, args);
				
			case Id_close:
				 close(cx, thisObj, args);
				return Undefined.instance;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



	public static final int MAX_INSTANCE_ID = -1;


	@Override
	public String getClassName()
	{
		return CLASS_TAG;
	}
}
