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

import ti.modules.titanium.ui.ActivityIndicatorProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class ActivityIndicatorProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = -374046912232525606L;

	private static final String TAG = "ActivityIndicatorProxyPrototype";
	private static final String CLASS_TAG = "ActivityIndicatorProxy";
	private static ActivityIndicatorProxyPrototype activityIndicatorProxyPrototype;


	public static ActivityIndicatorProxyPrototype getProxyPrototype()
	{
		return activityIndicatorProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		activityIndicatorProxyPrototype = null;
	}

	public ActivityIndicatorProxyPrototype()
	{
		if (activityIndicatorProxyPrototype == null && getClass().equals(ActivityIndicatorProxyPrototype.class)) {
			activityIndicatorProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == activityIndicatorProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return activityIndicatorProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ActivityIndicatorProxy.class, getRhinoObject(), args, creationUrl);
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
		Id_getColor = 6,
		Id_setColor = 7,
		Id_getFont = 8,
		Id_setFont = 9,
		Id_getStyle = 10,
		Id_setStyle = 11
		// Method IDs
;
		

	public static final int MAX_PROTOTYPE_ID = 11;

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
            case 7: c=s.charAt(0);
                if (c=='g') { X="getFont";id=Id_getFont; }
                else if (c=='s') { X="setFont";id=Id_setFont; }
                break L;
            case 8: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(7);
                    if (c=='e') { X="getStyle";id=Id_getStyle; }
                    else if (c=='r') { X="getColor";id=Id_getColor; }
                }
                else if (c=='s') {
                    c=s.charAt(7);
                    if (c=='e') { X="setStyle";id=Id_setStyle; }
                    else if (c=='r') { X="setColor";id=Id_setColor; }
                }
                break L;
            case 10: c=s.charAt(0);
                if (c=='g') { X="getMessage";id=Id_getMessage; }
                else if (c=='s') { X="setMessage";id=Id_setMessage; }
                break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: c=s.charAt(0);
                if (c=='g') { X="getMessageid";id=Id_getMessageid; }
                else if (c=='s') { X="setMessageid";id=Id_setMessageid; }
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
			case Id_getColor:
				arity = 0;
				name = "getColor";
				break;
			case Id_setColor:
				arity = 1;
				name = "setColor";
				break;
			case Id_getFont:
				arity = 0;
				name = "getFont";
				break;
			case Id_setFont:
				arity = 1;
				name = "setFont";
				break;
			case Id_getStyle:
				arity = 0;
				name = "getStyle";
				break;
			case Id_setStyle:
				arity = 1;
				name = "setStyle";
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

		while (thisObj != null && !(thisObj instanceof ActivityIndicatorProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ActivityIndicatorProxyPrototype proxy = (ActivityIndicatorProxyPrototype) thisObj;
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
			case Id_getColor:
				return proxy.getProperty("color");
			case Id_setColor:
				proxy.setProperty("color", args[0]);
				proxy.onPropertyChanged("color", args[0]);
				return Undefined.instance;
			case Id_getFont:
				return proxy.getProperty("font");
			case Id_setFont:
				proxy.setProperty("font", args[0]);
				proxy.onPropertyChanged("font", args[0]);
				return Undefined.instance;
			case Id_getStyle:
				return proxy.getProperty("style");
			case Id_setStyle:
				proxy.setProperty("style", args[0]);
				proxy.onPropertyChanged("style", args[0]);
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
		Id_color = 3
		,		
		Id_font = 4
		,		
		Id_style = 5
		;

;

	public static final int MAX_INSTANCE_ID = 5;

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
            case 4: X="font";id=Id_font; break L;
            case 5: c=s.charAt(0);
                if (c=='c') { X="color";id=Id_color; }
                else if (c=='s') { X="style";id=Id_style; }
                break L;
            case 7: X="message";id=Id_message; break L;
            case 9: X="messageid";id=Id_messageid; break L;
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
			case Id_color:
				return "color";
			case Id_font:
				return "font";
			case Id_style:
				return "style";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ActivityIndicatorProxyPrototype proxy = this;
		while (start != null && !(start instanceof ActivityIndicatorProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ActivityIndicatorProxyPrototype) {
			proxy = (ActivityIndicatorProxyPrototype) start;
		}

		switch (id) {
			case Id_message:
				return proxy.getProperty("message");
			case Id_messageid:
				return proxy.getProperty("messageid");
			case Id_color:
				return proxy.getProperty("color");
			case Id_font:
				return proxy.getProperty("font");
			case Id_style:
				return proxy.getProperty("style");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ActivityIndicatorProxyPrototype proxy = this;
		while (start != null && !(start instanceof ActivityIndicatorProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ActivityIndicatorProxyPrototype) {
			proxy = (ActivityIndicatorProxyPrototype) start;
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
			case Id_color:
				proxy.setProperty("color", value);
				proxy.onPropertyChanged("color", value);
				break;
			case Id_font:
				proxy.setProperty("font", value);
				proxy.onPropertyChanged("font", value);
				break;
			case Id_style:
				proxy.setProperty("style", value);
				proxy.onPropertyChanged("style", value);
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
