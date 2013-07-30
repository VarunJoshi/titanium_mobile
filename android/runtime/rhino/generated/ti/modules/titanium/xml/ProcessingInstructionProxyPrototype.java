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

import ti.modules.titanium.xml.ProcessingInstructionProxy;

import ti.modules.titanium.xml.NodeProxyPrototype;


public class ProcessingInstructionProxyPrototype extends NodeProxyPrototype
{
	private static final long serialVersionUID = -7321887582593335779L;

	private static final String TAG = "ProcessingInstructionProxyPrototype";
	private static final String CLASS_TAG = "ProcessingInstructionProxy";
	private static ProcessingInstructionProxyPrototype processingInstructionProxyPrototype;


	public static ProcessingInstructionProxyPrototype getProxyPrototype()
	{
		return processingInstructionProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		processingInstructionProxyPrototype = null;
	}

	public ProcessingInstructionProxyPrototype()
	{
		if (processingInstructionProxyPrototype == null && getClass().equals(ProcessingInstructionProxyPrototype.class)) {
			processingInstructionProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == processingInstructionProxyPrototype) {
			return NodeProxyPrototype.getProxyPrototype();
		}
		return processingInstructionProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return NodeProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ProcessingInstructionProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getData()", Log.DEBUG_MODE);

		try {
		ProcessingInstructionProxy proxy = (ProcessingInstructionProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getData();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getTarget(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTarget()", Log.DEBUG_MODE);

		try {
		ProcessingInstructionProxy proxy = (ProcessingInstructionProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getTarget();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setData()", Log.DEBUG_MODE);

		try {
		ProcessingInstructionProxy proxy = (ProcessingInstructionProxy) ((Proxy) thisObj).getProxy();
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


	// Dynamic properties
	public String getter_data()
	{
		Log.d(TAG, "get data", Log.DEBUG_MODE);
		ProcessingInstructionProxy proxy = (ProcessingInstructionProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getData();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_data(Object value)
	{
		Log.d(TAG, "set data", Log.DEBUG_MODE);
		ProcessingInstructionProxy proxy = (ProcessingInstructionProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setData(arg0);
		//proxy.setProperty("data", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_target()
	{
		Log.d(TAG, "get target", Log.DEBUG_MODE);
		ProcessingInstructionProxy proxy = (ProcessingInstructionProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getTarget();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getData = 2,
		Id_getTarget = 3,
		Id_setData = 4
;
		

	public static final int MAX_PROTOTYPE_ID = 4;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:26 PST
        L0: { id = 0; String X = null; int c;
            int s_length = s.length();
            if (s_length==7) {
                c=s.charAt(0);
                if (c=='g') { X="getData";id=Id_getData; }
                else if (c=='s') { X="setData";id=Id_setData; }
            }
            else if (s_length==9) { X="getTarget";id=Id_getTarget; }
            else if (s_length==11) { X="constructor";id=Id_constructor; }
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
			case Id_getData:
				arity = 0;
				name = "getData";
				break;
			case Id_getTarget:
				arity = 0;
				name = "getTarget";
				break;
			case Id_setData:
				arity = 1;
				name = "setData";
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

		while (thisObj != null && !(thisObj instanceof ProcessingInstructionProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ProcessingInstructionProxyPrototype proxy = (ProcessingInstructionProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getData:
				return getData(cx, thisObj, args);
				
			case Id_getTarget:
				return getTarget(cx, thisObj, args);
				
			case Id_setData:
				 setData(cx, thisObj, args);
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

		Id_data = 1
		,		
		Id_target = 2
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
// #generated# Last update: 2013-01-31 18:21:26 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==4) { X="data";id=Id_data; }
            else if (s_length==6) { X="target";id=Id_target; }
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
			case Id_target:
				return "target"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ProcessingInstructionProxyPrototype proxy = this;
		while (start != null && !(start instanceof ProcessingInstructionProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ProcessingInstructionProxyPrototype) {
			proxy = (ProcessingInstructionProxyPrototype) start;
		}

		switch (id) {
			case Id_data:
				return proxy.getter_data();
			case Id_target:
				return proxy.getter_target();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ProcessingInstructionProxyPrototype proxy = this;
		while (start != null && !(start instanceof ProcessingInstructionProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ProcessingInstructionProxyPrototype) {
			proxy = (ProcessingInstructionProxyPrototype) start;
		}

		switch (id) {
			case Id_data:
				proxy.setter_data(value);
				break; 
			case Id_target:
				proxy.setProperty("target", value);
				proxy.onPropertyChanged("target", value);
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
