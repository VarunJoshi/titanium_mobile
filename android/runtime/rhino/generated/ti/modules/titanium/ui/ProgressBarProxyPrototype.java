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

import ti.modules.titanium.ui.ProgressBarProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class ProgressBarProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = 3742549429659415809L;

	private static final String TAG = "ProgressBarProxyPrototype";
	private static final String CLASS_TAG = "ProgressBarProxy";
	private static ProgressBarProxyPrototype progressBarProxyPrototype;


	public static ProgressBarProxyPrototype getProxyPrototype()
	{
		return progressBarProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		progressBarProxyPrototype = null;
	}

	public ProgressBarProxyPrototype()
	{
		if (progressBarProxyPrototype == null && getClass().equals(ProgressBarProxyPrototype.class)) {
			progressBarProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == progressBarProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return progressBarProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ProgressBarProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getMin = 2,
		Id_setMin = 3,
		Id_getMax = 4,
		Id_setMax = 5,
		Id_getValue = 6,
		Id_setValue = 7,
		Id_getMessage = 8,
		Id_setMessage = 9
		// Method IDs
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
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 6: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(5);
                    if (c=='n') { X="getMin";id=Id_getMin; }
                    else if (c=='x') { X="getMax";id=Id_getMax; }
                }
                else if (c=='s') {
                    c=s.charAt(5);
                    if (c=='n') { X="setMin";id=Id_setMin; }
                    else if (c=='x') { X="setMax";id=Id_setMax; }
                }
                break L;
            case 8: c=s.charAt(0);
                if (c=='g') { X="getValue";id=Id_getValue; }
                else if (c=='s') { X="setValue";id=Id_setValue; }
                break L;
            case 10: c=s.charAt(0);
                if (c=='g') { X="getMessage";id=Id_getMessage; }
                else if (c=='s') { X="setMessage";id=Id_setMessage; }
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
			case Id_getMin:
				arity = 0;
				name = "getMin";
				break;
			case Id_setMin:
				arity = 1;
				name = "setMin";
				break;
			case Id_getMax:
				arity = 0;
				name = "getMax";
				break;
			case Id_setMax:
				arity = 1;
				name = "setMax";
				break;
			case Id_getValue:
				arity = 0;
				name = "getValue";
				break;
			case Id_setValue:
				arity = 1;
				name = "setValue";
				break;
			case Id_getMessage:
				arity = 0;
				name = "getMessage";
				break;
			case Id_setMessage:
				arity = 1;
				name = "setMessage";
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

		while (thisObj != null && !(thisObj instanceof ProgressBarProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ProgressBarProxyPrototype proxy = (ProgressBarProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getMin:
				return proxy.getProperty("min");
			case Id_setMin:
				proxy.setProperty("min", args[0]);
				proxy.onPropertyChanged("min", args[0]);
				return Undefined.instance;
			case Id_getMax:
				return proxy.getProperty("max");
			case Id_setMax:
				proxy.setProperty("max", args[0]);
				proxy.onPropertyChanged("max", args[0]);
				return Undefined.instance;
			case Id_getValue:
				return proxy.getProperty("value");
			case Id_setValue:
				proxy.setProperty("value", args[0]);
				proxy.onPropertyChanged("value", args[0]);
				return Undefined.instance;
			case Id_getMessage:
				return proxy.getProperty("message");
			case Id_setMessage:
				proxy.setProperty("message", args[0]);
				proxy.onPropertyChanged("message", args[0]);
				return Undefined.instance;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
;

	// Property accessor IDs
	private static final int

		Id_min = 1
		,		
		Id_max = 2
		,		
		Id_value = 3
		,		
		Id_message = 4
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
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null; int c;
            int s_length = s.length();
            if (s_length==3) {
                c=s.charAt(1);
                if (c=='a') { if (s.charAt(0)=='m' && s.charAt(2)=='x') {id=Id_max; break L0;} }
                else if (c=='i') { if (s.charAt(0)=='m' && s.charAt(2)=='n') {id=Id_min; break L0;} }
            }
            else if (s_length==5) { X="value";id=Id_value; }
            else if (s_length==7) { X="message";id=Id_message; }
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
			case Id_min:
				return "min";
			case Id_max:
				return "max";
			case Id_value:
				return "value";
			case Id_message:
				return "message";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ProgressBarProxyPrototype proxy = this;
		while (start != null && !(start instanceof ProgressBarProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ProgressBarProxyPrototype) {
			proxy = (ProgressBarProxyPrototype) start;
		}

		switch (id) {
			case Id_min:
				return proxy.getProperty("min");
			case Id_max:
				return proxy.getProperty("max");
			case Id_value:
				return proxy.getProperty("value");
			case Id_message:
				return proxy.getProperty("message");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ProgressBarProxyPrototype proxy = this;
		while (start != null && !(start instanceof ProgressBarProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ProgressBarProxyPrototype) {
			proxy = (ProgressBarProxyPrototype) start;
		}

		switch (id) {
			case Id_min:
				proxy.setProperty("min", value);
				proxy.onPropertyChanged("min", value);
				break;
			case Id_max:
				proxy.setProperty("max", value);
				proxy.onPropertyChanged("max", value);
				break;
			case Id_value:
				proxy.setProperty("value", value);
				proxy.onPropertyChanged("value", value);
				break;
			case Id_message:
				proxy.setProperty("message", value);
				proxy.onPropertyChanged("message", value);
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
