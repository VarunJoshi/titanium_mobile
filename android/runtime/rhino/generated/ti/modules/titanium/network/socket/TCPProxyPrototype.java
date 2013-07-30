/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.network.socket;

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

import ti.modules.titanium.network.socket.TCPProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class TCPProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 2671024001926724478L;

	private static final String TAG = "TCPProxyPrototype";
	private static final String CLASS_TAG = "TCPProxy";
	private static TCPProxyPrototype tCPProxyPrototype;


	public static TCPProxyPrototype getProxyPrototype()
	{
		return tCPProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		tCPProxyPrototype = null;
	}

	public TCPProxyPrototype()
	{
		if (tCPProxyPrototype == null && getClass().equals(TCPProxyPrototype.class)) {
			tCPProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == tCPProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return tCPProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TCPProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getState(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getState()", Log.DEBUG_MODE);

		try {
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getState();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setConnected(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setConnected()", Log.DEBUG_MODE);

		try {
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setConnected: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollFunction arg0;
		arg0 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setConnected(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setPort(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setPort()", Log.DEBUG_MODE);

		try {
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setPort: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setPort(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void connect(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "connect()", Log.DEBUG_MODE);

		try {
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();

		proxy.connect();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void accept(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "accept()", Log.DEBUG_MODE);

		try {
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("accept: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		proxy.accept(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object isWritable(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isWritable()", Log.DEBUG_MODE);

		try {
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isWritable();

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
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();

		proxy.close();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setAccepted(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setAccepted()", Log.DEBUG_MODE);

		try {
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setAccepted: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollFunction arg0;
		arg0 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setAccepted(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setListenQueueSize(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setListenQueueSize()", Log.DEBUG_MODE);

		try {
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setListenQueueSize: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setListenQueueSize(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setOptions(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setOptions()", Log.DEBUG_MODE);

		try {
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setOptions: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		proxy.setOptions(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setTimeout(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setTimeout()", Log.DEBUG_MODE);

		try {
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setTimeout: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setTimeout(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object isConnected(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isConnected()", Log.DEBUG_MODE);

		try {
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isConnected();

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
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();
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

	public Object read(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "read()", Log.DEBUG_MODE);

		try {
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();
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
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isReadable();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void listen(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "listen()", Log.DEBUG_MODE);

		try {
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();

		proxy.listen();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setHost(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setHost()", Log.DEBUG_MODE);

		try {
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setHost: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setHost(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setError(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setError()", Log.DEBUG_MODE);

		try {
		TCPProxy proxy = (TCPProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setError: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollFunction arg0;
		arg0 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setError(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public void setter_port(Object value)
	{
		Log.d(TAG, "set port", Log.DEBUG_MODE);
		TCPProxy proxy = (TCPProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setPort(arg0);
		//proxy.setProperty("port", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_host(Object value)
	{
		Log.d(TAG, "set host", Log.DEBUG_MODE);
		TCPProxy proxy = (TCPProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setHost(arg0);
		//proxy.setProperty("host", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_error(Object value)
	{
		Log.d(TAG, "set error", Log.DEBUG_MODE);
		TCPProxy proxy = (TCPProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.kroll.KrollFunction arg0;
		arg0 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setError(arg0);
		//proxy.setProperty("error", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_accepted(Object value)
	{
		Log.d(TAG, "set accepted", Log.DEBUG_MODE);
		TCPProxy proxy = (TCPProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.kroll.KrollFunction arg0;
		arg0 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setAccepted(arg0);
		//proxy.setProperty("accepted", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_connected(Object value)
	{
		Log.d(TAG, "set connected", Log.DEBUG_MODE);
		TCPProxy proxy = (TCPProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.kroll.KrollFunction arg0;
		arg0 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setConnected(arg0);
		//proxy.setProperty("connected", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Number getter_state()
	{
		Log.d(TAG, "get state", Log.DEBUG_MODE);
		TCPProxy proxy = (TCPProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getState();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public void setter_listenQueueSize(Object value)
	{
		Log.d(TAG, "set listenQueueSize", Log.DEBUG_MODE);
		TCPProxy proxy = (TCPProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setListenQueueSize(arg0);
		//proxy.setProperty("listenQueueSize", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_timeout(Object value)
	{
		Log.d(TAG, "set timeout", Log.DEBUG_MODE);
		TCPProxy proxy = (TCPProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setTimeout(arg0);
		//proxy.setProperty("timeout", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_options(Object value)
	{
		Log.d(TAG, "set options", Log.DEBUG_MODE);
		TCPProxy proxy = (TCPProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.kroll.KrollDict arg0;
		if (value == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(value, thisObj) );
		}
		proxy.setOptions(arg0);
		//proxy.setProperty("options", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getState = 2,
		Id_setConnected = 3,
		Id_setPort = 4,
		Id_connect = 5,
		Id_accept = 6,
		Id_isWritable = 7,
		Id_close = 8,
		Id_setAccepted = 9,
		Id_setListenQueueSize = 10,
		Id_setOptions = 11,
		Id_setTimeout = 12,
		Id_isConnected = 13,
		Id_write = 14,
		Id_read = 15,
		Id_isReadable = 16,
		Id_listen = 17,
		Id_setHost = 18,
		Id_setError = 19
;
		

	public static final int MAX_PROTOTYPE_ID = 19;

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
            case 6: c=s.charAt(0);
                if (c=='a') { X="accept";id=Id_accept; }
                else if (c=='l') { X="listen";id=Id_listen; }
                break L;
            case 7: c=s.charAt(3);
                if (c=='H') { X="setHost";id=Id_setHost; }
                else if (c=='P') { X="setPort";id=Id_setPort; }
                else if (c=='n') { X="connect";id=Id_connect; }
                break L;
            case 8: c=s.charAt(0);
                if (c=='g') { X="getState";id=Id_getState; }
                else if (c=='s') { X="setError";id=Id_setError; }
                break L;
            case 10: switch (s.charAt(3)) {
                case 'O': X="setOptions";id=Id_setOptions; break L;
                case 'T': X="setTimeout";id=Id_setTimeout; break L;
                case 'e': X="isReadable";id=Id_isReadable; break L;
                case 'r': X="isWritable";id=Id_isWritable; break L;
                } break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='i') { X="isConnected";id=Id_isConnected; }
                else if (c=='s') { X="setAccepted";id=Id_setAccepted; }
                break L;
            case 12: X="setConnected";id=Id_setConnected; break L;
            case 18: X="setListenQueueSize";id=Id_setListenQueueSize; break L;
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
			case Id_getState:
				arity = 0;
				name = "getState";
				break;
			case Id_setConnected:
				arity = 1;
				name = "setConnected";
				break;
			case Id_setPort:
				arity = 1;
				name = "setPort";
				break;
			case Id_connect:
				arity = 0;
				name = "connect";
				break;
			case Id_accept:
				arity = 1;
				name = "accept";
				break;
			case Id_isWritable:
				arity = 0;
				name = "isWritable";
				break;
			case Id_close:
				arity = 0;
				name = "close";
				break;
			case Id_setAccepted:
				arity = 1;
				name = "setAccepted";
				break;
			case Id_setListenQueueSize:
				arity = 1;
				name = "setListenQueueSize";
				break;
			case Id_setOptions:
				arity = 1;
				name = "setOptions";
				break;
			case Id_setTimeout:
				arity = 1;
				name = "setTimeout";
				break;
			case Id_isConnected:
				arity = 0;
				name = "isConnected";
				break;
			case Id_write:
				arity = 1;
				name = "write";
				break;
			case Id_read:
				arity = 1;
				name = "read";
				break;
			case Id_isReadable:
				arity = 0;
				name = "isReadable";
				break;
			case Id_listen:
				arity = 0;
				name = "listen";
				break;
			case Id_setHost:
				arity = 1;
				name = "setHost";
				break;
			case Id_setError:
				arity = 1;
				name = "setError";
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

		while (thisObj != null && !(thisObj instanceof TCPProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TCPProxyPrototype proxy = (TCPProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getState:
				return getState(cx, thisObj, args);
				
			case Id_setConnected:
				 setConnected(cx, thisObj, args);
				return Undefined.instance;
			case Id_setPort:
				 setPort(cx, thisObj, args);
				return Undefined.instance;
			case Id_connect:
				 connect(cx, thisObj, args);
				return Undefined.instance;
			case Id_accept:
				 accept(cx, thisObj, args);
				return Undefined.instance;
			case Id_isWritable:
				return isWritable(cx, thisObj, args);
				
			case Id_close:
				 close(cx, thisObj, args);
				return Undefined.instance;
			case Id_setAccepted:
				 setAccepted(cx, thisObj, args);
				return Undefined.instance;
			case Id_setListenQueueSize:
				 setListenQueueSize(cx, thisObj, args);
				return Undefined.instance;
			case Id_setOptions:
				 setOptions(cx, thisObj, args);
				return Undefined.instance;
			case Id_setTimeout:
				 setTimeout(cx, thisObj, args);
				return Undefined.instance;
			case Id_isConnected:
				return isConnected(cx, thisObj, args);
				
			case Id_write:
				return write(cx, thisObj, args);
				
			case Id_read:
				return read(cx, thisObj, args);
				
			case Id_isReadable:
				return isReadable(cx, thisObj, args);
				
			case Id_listen:
				 listen(cx, thisObj, args);
				return Undefined.instance;
			case Id_setHost:
				 setHost(cx, thisObj, args);
				return Undefined.instance;
			case Id_setError:
				 setError(cx, thisObj, args);
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

		Id_port = 1
		,		
		Id_host = 2
		,		
		Id_error = 3
		,		
		Id_accepted = 4
		,		
		Id_connected = 5
		,		
		Id_state = 6
		,		
		Id_listenQueueSize = 7
		,		
		Id_timeout = 8
		,		
		Id_options = 9
		;

;

;

	public static final int MAX_INSTANCE_ID = 9;

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
            L: switch (s.length()) {
            case 4: c=s.charAt(0);
                if (c=='h') { X="host";id=Id_host; }
                else if (c=='p') { X="port";id=Id_port; }
                break L;
            case 5: c=s.charAt(0);
                if (c=='e') { X="error";id=Id_error; }
                else if (c=='s') { X="state";id=Id_state; }
                break L;
            case 7: c=s.charAt(0);
                if (c=='o') { X="options";id=Id_options; }
                else if (c=='t') { X="timeout";id=Id_timeout; }
                break L;
            case 8: X="accepted";id=Id_accepted; break L;
            case 9: X="connected";id=Id_connected; break L;
            case 15: X="listenQueueSize";id=Id_listenQueueSize; break L;
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
			case Id_port:
				return "port"; 
			case Id_host:
				return "host"; 
			case Id_error:
				return "error"; 
			case Id_accepted:
				return "accepted"; 
			case Id_connected:
				return "connected"; 
			case Id_state:
				return "state"; 
			case Id_listenQueueSize:
				return "listenQueueSize"; 
			case Id_timeout:
				return "timeout"; 
			case Id_options:
				return "options"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TCPProxyPrototype proxy = this;
		while (start != null && !(start instanceof TCPProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TCPProxyPrototype) {
			proxy = (TCPProxyPrototype) start;
		}

		switch (id) {
			case Id_port:
				return proxy.getProperty("port");
			case Id_host:
				return proxy.getProperty("host");
			case Id_error:
				return proxy.getProperty("error");
			case Id_accepted:
				return proxy.getProperty("accepted");
			case Id_connected:
				return proxy.getProperty("connected");
			case Id_state:
				return proxy.getter_state();
			case Id_listenQueueSize:
				return proxy.getProperty("listenQueueSize");
			case Id_timeout:
				return proxy.getProperty("timeout");
			case Id_options:
				return proxy.getProperty("options");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		TCPProxyPrototype proxy = this;
		while (start != null && !(start instanceof TCPProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TCPProxyPrototype) {
			proxy = (TCPProxyPrototype) start;
		}

		switch (id) {
			case Id_port:
				proxy.setter_port(value);
				break; 
			case Id_host:
				proxy.setter_host(value);
				break; 
			case Id_error:
				proxy.setter_error(value);
				break; 
			case Id_accepted:
				proxy.setter_accepted(value);
				break; 
			case Id_connected:
				proxy.setter_connected(value);
				break; 
			case Id_state:
				proxy.setProperty("state", value);
				proxy.onPropertyChanged("state", value);
				break; 
			case Id_listenQueueSize:
				proxy.setter_listenQueueSize(value);
				break; 
			case Id_timeout:
				proxy.setter_timeout(value);
				break; 
			case Id_options:
				proxy.setter_options(value);
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
