/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.ui.android;

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

import ti.modules.titanium.ui.android.ProgressIndicatorProxy;

import ti.modules.titanium.ui.TiDialogProxyPrototype;


public class ProgressIndicatorProxyPrototype extends TiDialogProxyPrototype
{
	private static final long serialVersionUID = -6753460327267727077L;

	private static final String TAG = "ProgressIndicatorProxyPrototype";
	private static final String CLASS_TAG = "ProgressIndicatorProxy";
	private static ProgressIndicatorProxyPrototype progressIndicatorProxyPrototype;


	public static ProgressIndicatorProxyPrototype getProxyPrototype()
	{
		return progressIndicatorProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		progressIndicatorProxyPrototype = null;
	}

	public ProgressIndicatorProxyPrototype()
	{
		if (progressIndicatorProxyPrototype == null && getClass().equals(ProgressIndicatorProxyPrototype.class)) {
			progressIndicatorProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == progressIndicatorProxyPrototype) {
			return TiDialogProxyPrototype.getProxyPrototype();
		}
		return progressIndicatorProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiDialogProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ProgressIndicatorProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getMessage = 2,
		Id_setMessage = 3,
		Id_getMessageid = 4,
		Id_setMessageid = 5,
		Id_getValue = 6,
		Id_setValue = 7,
		Id_getLocation = 8,
		Id_setLocation = 9,
		Id_getType = 10,
		Id_setType = 11,
		Id_getMin = 12,
		Id_setMin = 13,
		Id_getMax = 14,
		Id_setMax = 15,
		Id_getCancelable = 16,
		Id_setCancelable = 17
		// Method IDs
;
		

	public static final int MAX_PROTOTYPE_ID = 17;

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
            case 7: c=s.charAt(0);
                if (c=='g') { X="getType";id=Id_getType; }
                else if (c=='s') { X="setType";id=Id_setType; }
                break L;
            case 8: c=s.charAt(0);
                if (c=='g') { X="getValue";id=Id_getValue; }
                else if (c=='s') { X="setValue";id=Id_setValue; }
                break L;
            case 10: c=s.charAt(0);
                if (c=='g') { X="getMessage";id=Id_getMessage; }
                else if (c=='s') { X="setMessage";id=Id_setMessage; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') { X="getLocation";id=Id_getLocation; }
                else if (c=='s') { X="setLocation";id=Id_setLocation; }
                break L;
            case 12: c=s.charAt(0);
                if (c=='g') { X="getMessageid";id=Id_getMessageid; }
                else if (c=='s') { X="setMessageid";id=Id_setMessageid; }
                break L;
            case 13: c=s.charAt(0);
                if (c=='g') { X="getCancelable";id=Id_getCancelable; }
                else if (c=='s') { X="setCancelable";id=Id_setCancelable; }
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
			case Id_getMessage:
				arity = 0;
				name = "getMessage";
				break;
			case Id_setMessage:
				arity = 1;
				name = "setMessage";
				break;
			case Id_getMessageid:
				arity = 0;
				name = "getMessageid";
				break;
			case Id_setMessageid:
				arity = 1;
				name = "setMessageid";
				break;
			case Id_getValue:
				arity = 0;
				name = "getValue";
				break;
			case Id_setValue:
				arity = 1;
				name = "setValue";
				break;
			case Id_getLocation:
				arity = 0;
				name = "getLocation";
				break;
			case Id_setLocation:
				arity = 1;
				name = "setLocation";
				break;
			case Id_getType:
				arity = 0;
				name = "getType";
				break;
			case Id_setType:
				arity = 1;
				name = "setType";
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
			case Id_getCancelable:
				arity = 0;
				name = "getCancelable";
				break;
			case Id_setCancelable:
				arity = 1;
				name = "setCancelable";
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

		while (thisObj != null && !(thisObj instanceof ProgressIndicatorProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ProgressIndicatorProxyPrototype proxy = (ProgressIndicatorProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getMessage:
				return proxy.getProperty("message");
			case Id_setMessage:
				proxy.setProperty("message", args[0]);
				proxy.onPropertyChanged("message", args[0]);
				return Undefined.instance;
			case Id_getMessageid:
				return proxy.getProperty("messageid");
			case Id_setMessageid:
				proxy.setProperty("messageid", args[0]);
				proxy.onPropertyChanged("messageid", args[0]);
				return Undefined.instance;
			case Id_getValue:
				return proxy.getProperty("value");
			case Id_setValue:
				proxy.setProperty("value", args[0]);
				proxy.onPropertyChanged("value", args[0]);
				return Undefined.instance;
			case Id_getLocation:
				return proxy.getProperty("location");
			case Id_setLocation:
				proxy.setProperty("location", args[0]);
				proxy.onPropertyChanged("location", args[0]);
				return Undefined.instance;
			case Id_getType:
				return proxy.getProperty("type");
			case Id_setType:
				proxy.setProperty("type", args[0]);
				proxy.onPropertyChanged("type", args[0]);
				return Undefined.instance;
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
			case Id_getCancelable:
				return proxy.getProperty("cancelable");
			case Id_setCancelable:
				proxy.setProperty("cancelable", args[0]);
				proxy.onPropertyChanged("cancelable", args[0]);
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

		Id_message = 1
		,		
		Id_messageid = 2
		,		
		Id_value = 3
		,		
		Id_location = 4
		,		
		Id_type = 5
		,		
		Id_min = 6
		,		
		Id_max = 7
		,		
		Id_cancelable = 8
		;

;

	public static final int MAX_INSTANCE_ID = 8;

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
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 3: c=s.charAt(1);
                if (c=='a') { if (s.charAt(0)=='m' && s.charAt(2)=='x') {id=Id_max; break L0;} }
                else if (c=='i') { if (s.charAt(0)=='m' && s.charAt(2)=='n') {id=Id_min; break L0;} }
                break L;
            case 4: X="type";id=Id_type; break L;
            case 5: X="value";id=Id_value; break L;
            case 7: X="message";id=Id_message; break L;
            case 8: X="location";id=Id_location; break L;
            case 9: X="messageid";id=Id_messageid; break L;
            case 10: X="cancelable";id=Id_cancelable; break L;
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
			case Id_message:
				return "message";
			case Id_messageid:
				return "messageid";
			case Id_value:
				return "value";
			case Id_location:
				return "location";
			case Id_type:
				return "type";
			case Id_min:
				return "min";
			case Id_max:
				return "max";
			case Id_cancelable:
				return "cancelable";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ProgressIndicatorProxyPrototype proxy = this;
		while (start != null && !(start instanceof ProgressIndicatorProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ProgressIndicatorProxyPrototype) {
			proxy = (ProgressIndicatorProxyPrototype) start;
		}

		switch (id) {
			case Id_message:
				return proxy.getProperty("message");
			case Id_messageid:
				return proxy.getProperty("messageid");
			case Id_value:
				return proxy.getProperty("value");
			case Id_location:
				return proxy.getProperty("location");
			case Id_type:
				return proxy.getProperty("type");
			case Id_min:
				return proxy.getProperty("min");
			case Id_max:
				return proxy.getProperty("max");
			case Id_cancelable:
				return proxy.getProperty("cancelable");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ProgressIndicatorProxyPrototype proxy = this;
		while (start != null && !(start instanceof ProgressIndicatorProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ProgressIndicatorProxyPrototype) {
			proxy = (ProgressIndicatorProxyPrototype) start;
		}

		switch (id) {
			case Id_message:
				proxy.setProperty("message", value);
				proxy.onPropertyChanged("message", value);
				break;
			case Id_messageid:
				proxy.setProperty("messageid", value);
				proxy.onPropertyChanged("messageid", value);
				break;
			case Id_value:
				proxy.setProperty("value", value);
				proxy.onPropertyChanged("value", value);
				break;
			case Id_location:
				proxy.setProperty("location", value);
				proxy.onPropertyChanged("location", value);
				break;
			case Id_type:
				proxy.setProperty("type", value);
				proxy.onPropertyChanged("type", value);
				break;
			case Id_min:
				proxy.setProperty("min", value);
				proxy.onPropertyChanged("min", value);
				break;
			case Id_max:
				proxy.setProperty("max", value);
				proxy.onPropertyChanged("max", value);
				break;
			case Id_cancelable:
				proxy.setProperty("cancelable", value);
				proxy.onPropertyChanged("cancelable", value);
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
