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

import ti.modules.titanium.stream.StreamModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class StreamModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = 8641665405786766611L;

	private static final String TAG = "StreamModulePrototype";
	private static final String CLASS_TAG = "StreamModule";
	private static StreamModulePrototype streamModulePrototype;

	// Lazy loaded child APIs
	private Object API_BufferStream = null;
	private Object API_FileStream = null;
	private Object API_BlobStream = null;

	public static StreamModulePrototype getProxyPrototype()
	{
		return streamModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		streamModulePrototype = null;
	}

	public StreamModulePrototype()
	{
		if (streamModulePrototype == null && getClass().equals(StreamModulePrototype.class)) {
			streamModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("MODE_WRITE", this, 1);


			putConst("MODE_READ", this, 0);


			putConst("MODE_APPEND", this, 2);

	}

	public Scriptable getPrototype()
	{
		if (this == streamModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return streamModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(StreamModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object writeStream(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "writeStream()", Log.DEBUG_MODE);

		try {
		StreamModule proxy = (StreamModule) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		int javaResult = proxy.writeStream(arg0);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void write(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "write()", Log.DEBUG_MODE);

		try {
		StreamModule proxy = (StreamModule) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		proxy.write(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void read(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "read()", Log.DEBUG_MODE);

		try {
		StreamModule proxy = (StreamModule) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		proxy.read(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void pump(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "pump()", Log.DEBUG_MODE);

		try {
		StreamModule proxy = (StreamModule) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		proxy.pump(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object createStream(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createStream()", Log.DEBUG_MODE);

		try {
		StreamModule proxy = (StreamModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("createStream: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		java.lang.Object javaResult = proxy.createStream(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object readAll(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "readAll()", Log.DEBUG_MODE);

		try {
		StreamModule proxy = (StreamModule) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		java.lang.Object javaResult = proxy.readAll(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
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
		Id_writeStream = 2,
		Id_write = 3,
		Id_read = 4,
		Id_pump = 5,
		Id_createStream = 6,
		Id_readAll = 7
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
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 4: c=s.charAt(0);
                if (c=='p') { X="pump";id=Id_pump; }
                else if (c=='r') { X="read";id=Id_read; }
                break L;
            case 5: X="write";id=Id_write; break L;
            case 7: X="readAll";id=Id_readAll; break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='w') { X="writeStream";id=Id_writeStream; }
                break L;
            case 12: X="createStream";id=Id_createStream; break L;
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
			case Id_writeStream:
				arity = 1;
				name = "writeStream";
				break;
			case Id_write:
				arity = 1;
				name = "write";
				break;
			case Id_read:
				arity = 1;
				name = "read";
				break;
			case Id_pump:
				arity = 1;
				name = "pump";
				break;
			case Id_createStream:
				arity = 1;
				name = "createStream";
				break;
			case Id_readAll:
				arity = 1;
				name = "readAll";
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

		while (thisObj != null && !(thisObj instanceof StreamModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		StreamModulePrototype proxy = (StreamModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_writeStream:
				return writeStream(cx, thisObj, args);
				
			case Id_write:
				 write(cx, thisObj, args);
				return Undefined.instance;
			case Id_read:
				 read(cx, thisObj, args);
				return Undefined.instance;
			case Id_pump:
				 pump(cx, thisObj, args);
				return Undefined.instance;
			case Id_createStream:
				return createStream(cx, thisObj, args);
				
			case Id_readAll:
				return readAll(cx, thisObj, args);
				
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

		Id_BufferStream = 1
		,		
		Id_FileStream = 2
		,		
		Id_BlobStream = 3
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
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null; int c;
            int s_length = s.length();
            if (s_length==10) {
                c=s.charAt(0);
                if (c=='B') { X="BlobStream";id=Id_BlobStream; }
                else if (c=='F') { X="FileStream";id=Id_FileStream; }
            }
            else if (s_length==12) { X="BufferStream";id=Id_BufferStream; }
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
			case Id_BufferStream:
				return "BufferStream";
			case Id_FileStream:
				return "FileStream";
			case Id_BlobStream:
				return "BlobStream";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		StreamModulePrototype proxy = this;
		while (start != null && !(start instanceof StreamModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof StreamModulePrototype) {
			proxy = (StreamModulePrototype) start;
		}

		switch (id) {
			case Id_BufferStream:
				if (proxy.API_BufferStream == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_BufferStream = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.stream.BufferStreamProxy", ti.modules.titanium.stream.BufferStreamProxyPrototype.class); 
				}
				return proxy.API_BufferStream;
			case Id_FileStream:
				if (proxy.API_FileStream == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_FileStream = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.stream.FileStreamProxy", ti.modules.titanium.stream.FileStreamProxyPrototype.class); 
				}
				return proxy.API_FileStream;
			case Id_BlobStream:
				if (proxy.API_BlobStream == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_BlobStream = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.stream.BlobStreamProxy", ti.modules.titanium.stream.BlobStreamProxyPrototype.class); 
				}
				return proxy.API_BlobStream;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		StreamModulePrototype proxy = this;
		while (start != null && !(start instanceof StreamModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof StreamModulePrototype) {
			proxy = (StreamModulePrototype) start;
		}

		switch (id) {
			case Id_BufferStream:
				if (value instanceof Proxy) {
					proxy.API_BufferStream = value;
				} else {
					defineProperty(original, "BufferStream", value, 0);
				}
				break;
			case Id_FileStream:
				if (value instanceof Proxy) {
					proxy.API_FileStream = value;
				} else {
					defineProperty(original, "FileStream", value, 0);
				}
				break;
			case Id_BlobStream:
				if (value instanceof Proxy) {
					proxy.API_BlobStream = value;
				} else {
					defineProperty(original, "BlobStream", value, 0);
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
