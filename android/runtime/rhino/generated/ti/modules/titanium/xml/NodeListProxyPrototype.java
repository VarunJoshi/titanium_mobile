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

import ti.modules.titanium.xml.NodeListProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class NodeListProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 3825155967285394390L;

	private static final String TAG = "NodeListProxyPrototype";
	private static final String CLASS_TAG = "NodeListProxy";
	private static NodeListProxyPrototype nodeListProxyPrototype;


	public static NodeListProxyPrototype getProxyPrototype()
	{
		return nodeListProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		nodeListProxyPrototype = null;
	}

	public NodeListProxyPrototype()
	{
		if (nodeListProxyPrototype == null && getClass().equals(NodeListProxyPrototype.class)) {
			nodeListProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == nodeListProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return nodeListProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(NodeListProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object item(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "item()", Log.DEBUG_MODE);

		try {
		NodeListProxy proxy = (NodeListProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("item: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		ti.modules.titanium.xml.NodeProxy javaResult = proxy.item(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
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
		NodeListProxy proxy = (NodeListProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getLength();

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
		NodeListProxy proxy = (NodeListProxy) getProxy();
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
		Id_item = 2,
		Id_getLength = 3
;
		

	public static final int MAX_PROTOTYPE_ID = 3;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==4) { X="item";id=Id_item; }
            else if (s_length==9) { X="getLength";id=Id_getLength; }
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
			case Id_item:
				arity = 1;
				name = "item";
				break;
			case Id_getLength:
				arity = 0;
				name = "getLength";
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

		while (thisObj != null && !(thisObj instanceof NodeListProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		NodeListProxyPrototype proxy = (NodeListProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_item:
				return item(cx, thisObj, args);
				
			case Id_getLength:
				return getLength(cx, thisObj, args);
				
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
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null;
            if (s.length()==6) { X="length";id=Id_length; }
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
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		NodeListProxyPrototype proxy = this;
		while (start != null && !(start instanceof NodeListProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof NodeListProxyPrototype) {
			proxy = (NodeListProxyPrototype) start;
		}

		switch (id) {
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
		NodeListProxyPrototype proxy = this;
		while (start != null && !(start instanceof NodeListProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof NodeListProxyPrototype) {
			proxy = (NodeListProxyPrototype) start;
		}

		switch (id) {
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
