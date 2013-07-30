/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.ui;

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

import ti.modules.titanium.ui.PickerRowProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class PickerRowProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = 3668382702365176316L;

	private static final String TAG = "PickerRowProxyPrototype";
	private static final String CLASS_TAG = "PickerRowProxy";
	private static PickerRowProxyPrototype pickerRowProxyPrototype;


	public static PickerRowProxyPrototype getProxyPrototype()
	{
		return pickerRowProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		pickerRowProxyPrototype = null;
	}

	public PickerRowProxyPrototype()
	{
		if (pickerRowProxyPrototype == null && getClass().equals(PickerRowProxyPrototype.class)) {
			pickerRowProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == pickerRowProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return pickerRowProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(PickerRowProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void setTitle(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setTitle()", Log.DEBUG_MODE);

		try {
		PickerRowProxy proxy = (PickerRowProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setTitle: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setTitle(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getTitle(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTitle()", Log.DEBUG_MODE);

		try {
		PickerRowProxy proxy = (PickerRowProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getTitle();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public String getter_title()
	{
		Log.d(TAG, "get title", Log.DEBUG_MODE);
		PickerRowProxy proxy = (PickerRowProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getTitle();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_title(Object value)
	{
		Log.d(TAG, "set title", Log.DEBUG_MODE);
		PickerRowProxy proxy = (PickerRowProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setTitle(arg0);
		//proxy.setProperty("title", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_setTitle = 2,
		Id_getTitle = 3
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
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null; int c;
            int s_length = s.length();
            if (s_length==8) {
                c=s.charAt(0);
                if (c=='g') { X="getTitle";id=Id_getTitle; }
                else if (c=='s') { X="setTitle";id=Id_setTitle; }
            }
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
			case Id_setTitle:
				arity = 1;
				name = "setTitle";
				break;
			case Id_getTitle:
				arity = 0;
				name = "getTitle";
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

		while (thisObj != null && !(thisObj instanceof PickerRowProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		PickerRowProxyPrototype proxy = (PickerRowProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_setTitle:
				 setTitle(cx, thisObj, args);
				return Undefined.instance;
			case Id_getTitle:
				return getTitle(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_title = 1
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
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null;
            if (s.length()==5) { X="title";id=Id_title; }
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
			case Id_title:
				return "title"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		PickerRowProxyPrototype proxy = this;
		while (start != null && !(start instanceof PickerRowProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof PickerRowProxyPrototype) {
			proxy = (PickerRowProxyPrototype) start;
		}

		switch (id) {
			case Id_title:
				return proxy.getter_title();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		PickerRowProxyPrototype proxy = this;
		while (start != null && !(start instanceof PickerRowProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof PickerRowProxyPrototype) {
			proxy = (PickerRowProxyPrototype) start;
		}

		switch (id) {
			case Id_title:
				proxy.setter_title(value);
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
