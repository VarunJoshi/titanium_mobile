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

import ti.modules.titanium.ui.AlertDialogProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class AlertDialogProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = -3443246925855675259L;

	private static final String TAG = "AlertDialogProxyPrototype";
	private static final String CLASS_TAG = "AlertDialogProxy";
	private static AlertDialogProxyPrototype alertDialogProxyPrototype;


	public static AlertDialogProxyPrototype getProxyPrototype()
	{
		return alertDialogProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		alertDialogProxyPrototype = null;
	}

	public AlertDialogProxyPrototype()
	{
		if (alertDialogProxyPrototype == null && getClass().equals(AlertDialogProxyPrototype.class)) {
			alertDialogProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == alertDialogProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return alertDialogProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(AlertDialogProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getButtonNames = 2,
		Id_setButtonNames = 3,
		Id_getCancel = 4,
		Id_setCancel = 5,
		Id_getMessage = 6,
		Id_setMessage = 7,
		Id_getTitle = 8,
		Id_setTitle = 9,
		Id_getOk = 10,
		Id_setOk = 11,
		Id_getPersistent = 12,
		Id_setPersistent = 13
		// Method IDs
;
		

	public static final int MAX_PROTOTYPE_ID = 13;

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
            case 5: c=s.charAt(0);
                if (c=='g') { X="getOk";id=Id_getOk; }
                else if (c=='s') { X="setOk";id=Id_setOk; }
                break L;
            case 8: c=s.charAt(0);
                if (c=='g') { X="getTitle";id=Id_getTitle; }
                else if (c=='s') { X="setTitle";id=Id_setTitle; }
                break L;
            case 9: c=s.charAt(0);
                if (c=='g') { X="getCancel";id=Id_getCancel; }
                else if (c=='s') { X="setCancel";id=Id_setCancel; }
                break L;
            case 10: c=s.charAt(0);
                if (c=='g') { X="getMessage";id=Id_getMessage; }
                else if (c=='s') { X="setMessage";id=Id_setMessage; }
                break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 13: c=s.charAt(0);
                if (c=='g') { X="getPersistent";id=Id_getPersistent; }
                else if (c=='s') { X="setPersistent";id=Id_setPersistent; }
                break L;
            case 14: c=s.charAt(0);
                if (c=='g') { X="getButtonNames";id=Id_getButtonNames; }
                else if (c=='s') { X="setButtonNames";id=Id_setButtonNames; }
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
			case Id_getButtonNames:
				arity = 0;
				name = "getButtonNames";
				break;
			case Id_setButtonNames:
				arity = 1;
				name = "setButtonNames";
				break;
			case Id_getCancel:
				arity = 0;
				name = "getCancel";
				break;
			case Id_setCancel:
				arity = 1;
				name = "setCancel";
				break;
			case Id_getMessage:
				arity = 0;
				name = "getMessage";
				break;
			case Id_setMessage:
				arity = 1;
				name = "setMessage";
				break;
			case Id_getTitle:
				arity = 0;
				name = "getTitle";
				break;
			case Id_setTitle:
				arity = 1;
				name = "setTitle";
				break;
			case Id_getOk:
				arity = 0;
				name = "getOk";
				break;
			case Id_setOk:
				arity = 1;
				name = "setOk";
				break;
			case Id_getPersistent:
				arity = 0;
				name = "getPersistent";
				break;
			case Id_setPersistent:
				arity = 1;
				name = "setPersistent";
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

		while (thisObj != null && !(thisObj instanceof AlertDialogProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		AlertDialogProxyPrototype proxy = (AlertDialogProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getButtonNames:
				return proxy.getProperty("buttonNames");
			case Id_setButtonNames:
				proxy.setProperty("buttonNames", args[0]);
				proxy.onPropertyChanged("buttonNames", args[0]);
				return Undefined.instance;
			case Id_getCancel:
				return proxy.getProperty("cancel");
			case Id_setCancel:
				proxy.setProperty("cancel", args[0]);
				proxy.onPropertyChanged("cancel", args[0]);
				return Undefined.instance;
			case Id_getMessage:
				return proxy.getProperty("message");
			case Id_setMessage:
				proxy.setProperty("message", args[0]);
				proxy.onPropertyChanged("message", args[0]);
				return Undefined.instance;
			case Id_getTitle:
				return proxy.getProperty("title");
			case Id_setTitle:
				proxy.setProperty("title", args[0]);
				proxy.onPropertyChanged("title", args[0]);
				return Undefined.instance;
			case Id_getOk:
				return proxy.getProperty("ok");
			case Id_setOk:
				proxy.setProperty("ok", args[0]);
				proxy.onPropertyChanged("ok", args[0]);
				return Undefined.instance;
			case Id_getPersistent:
				return proxy.getProperty("persistent");
			case Id_setPersistent:
				proxy.setProperty("persistent", args[0]);
				proxy.onPropertyChanged("persistent", args[0]);
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

		Id_buttonNames = 1
		,		
		Id_cancel = 2
		,		
		Id_message = 3
		,		
		Id_title = 4
		,		
		Id_ok = 5
		,		
		Id_persistent = 6
		;

;

	public static final int MAX_INSTANCE_ID = 6;

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
            L: switch (s.length()) {
            case 2: if (s.charAt(0)=='o' && s.charAt(1)=='k') {id=Id_ok; break L0;} break L;
            case 5: X="title";id=Id_title; break L;
            case 6: X="cancel";id=Id_cancel; break L;
            case 7: X="message";id=Id_message; break L;
            case 10: X="persistent";id=Id_persistent; break L;
            case 11: X="buttonNames";id=Id_buttonNames; break L;
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
			case Id_buttonNames:
				return "buttonNames";
			case Id_cancel:
				return "cancel";
			case Id_message:
				return "message";
			case Id_title:
				return "title";
			case Id_ok:
				return "ok";
			case Id_persistent:
				return "persistent";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		AlertDialogProxyPrototype proxy = this;
		while (start != null && !(start instanceof AlertDialogProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AlertDialogProxyPrototype) {
			proxy = (AlertDialogProxyPrototype) start;
		}

		switch (id) {
			case Id_buttonNames:
				return proxy.getProperty("buttonNames");
			case Id_cancel:
				return proxy.getProperty("cancel");
			case Id_message:
				return proxy.getProperty("message");
			case Id_title:
				return proxy.getProperty("title");
			case Id_ok:
				return proxy.getProperty("ok");
			case Id_persistent:
				return proxy.getProperty("persistent");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		AlertDialogProxyPrototype proxy = this;
		while (start != null && !(start instanceof AlertDialogProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AlertDialogProxyPrototype) {
			proxy = (AlertDialogProxyPrototype) start;
		}

		switch (id) {
			case Id_buttonNames:
				proxy.setProperty("buttonNames", value);
				proxy.onPropertyChanged("buttonNames", value);
				break;
			case Id_cancel:
				proxy.setProperty("cancel", value);
				proxy.onPropertyChanged("cancel", value);
				break;
			case Id_message:
				proxy.setProperty("message", value);
				proxy.onPropertyChanged("message", value);
				break;
			case Id_title:
				proxy.setProperty("title", value);
				proxy.onPropertyChanged("title", value);
				break;
			case Id_ok:
				proxy.setProperty("ok", value);
				proxy.onPropertyChanged("ok", value);
				break;
			case Id_persistent:
				proxy.setProperty("persistent", value);
				proxy.onPropertyChanged("persistent", value);
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
