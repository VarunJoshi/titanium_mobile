/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package org.appcelerator.titanium.proxy;

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

import org.appcelerator.titanium.proxy.TiBaseWindowProxy;

import org.appcelerator.titanium.proxy.TiWindowProxyPrototype;


public class TiBaseWindowProxyPrototype extends TiWindowProxyPrototype
{
	private static final long serialVersionUID = -8761341288590205805L;

	private static final String TAG = "TiBaseWindowProxyPrototype";
	private static final String CLASS_TAG = "TiBaseWindowProxy";
	private static TiBaseWindowProxyPrototype tiBaseWindowProxyPrototype;


	public static TiBaseWindowProxyPrototype getProxyPrototype()
	{
		return tiBaseWindowProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		tiBaseWindowProxyPrototype = null;
	}

	public TiBaseWindowProxyPrototype()
	{
		if (tiBaseWindowProxyPrototype == null && getClass().equals(TiBaseWindowProxyPrototype.class)) {
			tiBaseWindowProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == tiBaseWindowProxyPrototype) {
			return TiWindowProxyPrototype.getProxyPrototype();
		}
		return tiBaseWindowProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiWindowProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TiBaseWindowProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void setWindowView(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setWindowView()", Log.DEBUG_MODE);

		try {
		TiBaseWindowProxy proxy = (TiBaseWindowProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setWindowView: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		org.appcelerator.titanium.proxy.TiViewProxy arg0;
		arg0 = (org.appcelerator.titanium.proxy.TiViewProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setWindowView(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void removeSelfFromStack(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeSelfFromStack()", Log.DEBUG_MODE);

		try {
		TiBaseWindowProxy proxy = (TiBaseWindowProxy) ((Proxy) thisObj).getProxy();

		proxy.removeSelfFromStack();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void addSelfToStack(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addSelfToStack()", Log.DEBUG_MODE);

		try {
		TiBaseWindowProxy proxy = (TiBaseWindowProxy) ((Proxy) thisObj).getProxy();

		proxy.addSelfToStack();
	

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
		Id_setWindowView = 2,
		Id_removeSelfFromStack = 3,
		Id_addSelfToStack = 4
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
// #generated# Last update: 2013-01-31 18:21:22 PST
        L0: { id = 0; String X = null;
            L: switch (s.length()) {
            case 11: X="constructor";id=Id_constructor; break L;
            case 13: X="setWindowView";id=Id_setWindowView; break L;
            case 14: X="addSelfToStack";id=Id_addSelfToStack; break L;
            case 19: X="removeSelfFromStack";id=Id_removeSelfFromStack; break L;
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
			case Id_setWindowView:
				arity = 1;
				name = "setWindowView";
				break;
			case Id_removeSelfFromStack:
				arity = 0;
				name = "removeSelfFromStack";
				break;
			case Id_addSelfToStack:
				arity = 0;
				name = "addSelfToStack";
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

		while (thisObj != null && !(thisObj instanceof TiBaseWindowProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TiBaseWindowProxyPrototype proxy = (TiBaseWindowProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_setWindowView:
				 setWindowView(cx, thisObj, args);
				return Undefined.instance;
			case Id_removeSelfFromStack:
				 removeSelfFromStack(cx, thisObj, args);
				return Undefined.instance;
			case Id_addSelfToStack:
				 addSelfToStack(cx, thisObj, args);
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
