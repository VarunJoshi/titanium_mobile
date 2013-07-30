/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.xml;

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

import ti.modules.titanium.xml.CharacterDataProxy;

import ti.modules.titanium.xml.NodeProxyPrototype;


public class CharacterDataProxyPrototype extends NodeProxyPrototype
{
	private static final long serialVersionUID = -2093903641008073003L;

	private static final String TAG = "CharacterDataProxyPrototype";
	private static final String CLASS_TAG = "CharacterDataProxy";
	private static CharacterDataProxyPrototype characterDataProxyPrototype;


	public static CharacterDataProxyPrototype getProxyPrototype()
	{
		return characterDataProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		characterDataProxyPrototype = null;
	}

	public CharacterDataProxyPrototype()
	{
		if (characterDataProxyPrototype == null && getClass().equals(CharacterDataProxyPrototype.class)) {
			characterDataProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == characterDataProxyPrototype) {
			return NodeProxyPrototype.getProxyPrototype();
		}
		return characterDataProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return NodeProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(CharacterDataProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void replaceData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "replaceData()", Log.DEBUG_MODE);

		try {
		CharacterDataProxy proxy = (CharacterDataProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("replaceData: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;
		java.lang.String arg2;
		arg2 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[2], thisObj) ;

		proxy.replaceData(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getData()", Log.DEBUG_MODE);

		try {
		CharacterDataProxy proxy = (CharacterDataProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getData();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void deleteData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "deleteData()", Log.DEBUG_MODE);

		try {
		CharacterDataProxy proxy = (CharacterDataProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("deleteData: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;

		proxy.deleteData(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getLength(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLength()", Log.DEBUG_MODE);

		try {
		CharacterDataProxy proxy = (CharacterDataProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getLength();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void appendData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "appendData()", Log.DEBUG_MODE);

		try {
		CharacterDataProxy proxy = (CharacterDataProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("appendData: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.appendData(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setData()", Log.DEBUG_MODE);

		try {
		CharacterDataProxy proxy = (CharacterDataProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setData: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setData(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void insertData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "insertData()", Log.DEBUG_MODE);

		try {
		CharacterDataProxy proxy = (CharacterDataProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("insertData: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		proxy.insertData(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object substringData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "substringData()", Log.DEBUG_MODE);

		try {
		CharacterDataProxy proxy = (CharacterDataProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("substringData: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;

		java.lang.String javaResult = proxy.substringData(arg0, arg1);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public String getter_data()
	{
		Log.d(TAG, "get data", Log.DEBUG_MODE);
		CharacterDataProxy proxy = (CharacterDataProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getData();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_data(Object value)
	{
		Log.d(TAG, "set data", Log.DEBUG_MODE);
		CharacterDataProxy proxy = (CharacterDataProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setData(arg0);
		//proxy.setProperty("data", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Number getter_length()
	{
		Log.d(TAG, "get length", Log.DEBUG_MODE);
		CharacterDataProxy proxy = (CharacterDataProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getLength();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_replaceData = 2,
		Id_getData = 3,
		Id_deleteData = 4,
		Id_getLength = 5,
		Id_appendData = 6,
		Id_setData = 7,
		Id_insertData = 8,
		Id_substringData = 9
;
		

	public static final int MAX_PROTOTYPE_ID = 9;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 7: c=s.charAt(0);
                if (c=='g') { X="getData";id=Id_getData; }
                else if (c=='s') { X="setData";id=Id_setData; }
                break L;
            case 9: X="getLength";id=Id_getLength; break L;
            case 10: c=s.charAt(0);
                if (c=='a') { X="appendData";id=Id_appendData; }
                else if (c=='d') { X="deleteData";id=Id_deleteData; }
                else if (c=='i') { X="insertData";id=Id_insertData; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='r') { X="replaceData";id=Id_replaceData; }
                break L;
            case 13: X="substringData";id=Id_substringData; break L;
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
			case Id_replaceData:
				arity = 3;
				name = "replaceData";
				break;
			case Id_getData:
				arity = 0;
				name = "getData";
				break;
			case Id_deleteData:
				arity = 2;
				name = "deleteData";
				break;
			case Id_getLength:
				arity = 0;
				name = "getLength";
				break;
			case Id_appendData:
				arity = 1;
				name = "appendData";
				break;
			case Id_setData:
				arity = 1;
				name = "setData";
				break;
			case Id_insertData:
				arity = 2;
				name = "insertData";
				break;
			case Id_substringData:
				arity = 2;
				name = "substringData";
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

		while (thisObj != null && !(thisObj instanceof CharacterDataProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		CharacterDataProxyPrototype proxy = (CharacterDataProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_replaceData:
				 replaceData(cx, thisObj, args);
				return Undefined.instance;
			case Id_getData:
				return getData(cx, thisObj, args);
				
			case Id_deleteData:
				 deleteData(cx, thisObj, args);
				return Undefined.instance;
			case Id_getLength:
				return getLength(cx, thisObj, args);
				
			case Id_appendData:
				 appendData(cx, thisObj, args);
				return Undefined.instance;
			case Id_setData:
				 setData(cx, thisObj, args);
				return Undefined.instance;
			case Id_insertData:
				 insertData(cx, thisObj, args);
				return Undefined.instance;
			case Id_substringData:
				return substringData(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_data = 1
		,		
		Id_length = 2
		;

;

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
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==4) { X="data";id=Id_data; }
            else if (s_length==6) { X="length";id=Id_length; }
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
			case Id_data:
				return "data"; 
			case Id_length:
				return "length"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		CharacterDataProxyPrototype proxy = this;
		while (start != null && !(start instanceof CharacterDataProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof CharacterDataProxyPrototype) {
			proxy = (CharacterDataProxyPrototype) start;
		}

		switch (id) {
			case Id_data:
				return proxy.getter_data();
			case Id_length:
				return proxy.getter_length();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		CharacterDataProxyPrototype proxy = this;
		while (start != null && !(start instanceof CharacterDataProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof CharacterDataProxyPrototype) {
			proxy = (CharacterDataProxyPrototype) start;
		}

		switch (id) {
			case Id_data:
				proxy.setter_data(value);
				break; 
			case Id_length:
				proxy.setProperty("length", value);
				proxy.onPropertyChanged("length", value);
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
