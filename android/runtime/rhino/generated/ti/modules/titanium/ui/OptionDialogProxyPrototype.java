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

import ti.modules.titanium.ui.OptionDialogProxy;

import ti.modules.titanium.ui.TiDialogProxyPrototype;


public class OptionDialogProxyPrototype extends TiDialogProxyPrototype
{
	private static final long serialVersionUID = -2390699178123213772L;

	private static final String TAG = "OptionDialogProxyPrototype";
	private static final String CLASS_TAG = "OptionDialogProxy";
	private static OptionDialogProxyPrototype optionDialogProxyPrototype;


	public static OptionDialogProxyPrototype getProxyPrototype()
	{
		return optionDialogProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		optionDialogProxyPrototype = null;
	}

	public OptionDialogProxyPrototype()
	{
		if (optionDialogProxyPrototype == null && getClass().equals(OptionDialogProxyPrototype.class)) {
			optionDialogProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == optionDialogProxyPrototype) {
			return TiDialogProxyPrototype.getProxyPrototype();
		}
		return optionDialogProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiDialogProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(OptionDialogProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getAndroidView = 2,
		Id_setAndroidView = 3,
		Id_getCancel = 4,
		Id_setCancel = 5,
		Id_getOptions = 6,
		Id_setOptions = 7,
		Id_getSelectedIndex = 8,
		Id_setSelectedIndex = 9,
		Id_getTitle = 10,
		Id_setTitle = 11,
		Id_getTitleid = 12,
		Id_setTitleid = 13,
		Id_getPersistent = 14,
		Id_setPersistent = 15
		// Method IDs
;
		

	public static final int MAX_PROTOTYPE_ID = 15;

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
            case 8: c=s.charAt(0);
                if (c=='g') { X="getTitle";id=Id_getTitle; }
                else if (c=='s') { X="setTitle";id=Id_setTitle; }
                break L;
            case 9: c=s.charAt(0);
                if (c=='g') { X="getCancel";id=Id_getCancel; }
                else if (c=='s') { X="setCancel";id=Id_setCancel; }
                break L;
            case 10: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(9);
                    if (c=='d') { X="getTitleid";id=Id_getTitleid; }
                    else if (c=='s') { X="getOptions";id=Id_getOptions; }
                }
                else if (c=='s') {
                    c=s.charAt(9);
                    if (c=='d') { X="setTitleid";id=Id_setTitleid; }
                    else if (c=='s') { X="setOptions";id=Id_setOptions; }
                }
                break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 13: c=s.charAt(0);
                if (c=='g') { X="getPersistent";id=Id_getPersistent; }
                else if (c=='s') { X="setPersistent";id=Id_setPersistent; }
                break L;
            case 14: c=s.charAt(0);
                if (c=='g') { X="getAndroidView";id=Id_getAndroidView; }
                else if (c=='s') { X="setAndroidView";id=Id_setAndroidView; }
                break L;
            case 16: c=s.charAt(0);
                if (c=='g') { X="getSelectedIndex";id=Id_getSelectedIndex; }
                else if (c=='s') { X="setSelectedIndex";id=Id_setSelectedIndex; }
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
			case Id_getAndroidView:
				arity = 0;
				name = "getAndroidView";
				break;
			case Id_setAndroidView:
				arity = 1;
				name = "setAndroidView";
				break;
			case Id_getCancel:
				arity = 0;
				name = "getCancel";
				break;
			case Id_setCancel:
				arity = 1;
				name = "setCancel";
				break;
			case Id_getOptions:
				arity = 0;
				name = "getOptions";
				break;
			case Id_setOptions:
				arity = 1;
				name = "setOptions";
				break;
			case Id_getSelectedIndex:
				arity = 0;
				name = "getSelectedIndex";
				break;
			case Id_setSelectedIndex:
				arity = 1;
				name = "setSelectedIndex";
				break;
			case Id_getTitle:
				arity = 0;
				name = "getTitle";
				break;
			case Id_setTitle:
				arity = 1;
				name = "setTitle";
				break;
			case Id_getTitleid:
				arity = 0;
				name = "getTitleid";
				break;
			case Id_setTitleid:
				arity = 1;
				name = "setTitleid";
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

		while (thisObj != null && !(thisObj instanceof OptionDialogProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		OptionDialogProxyPrototype proxy = (OptionDialogProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getAndroidView:
				return proxy.getProperty("androidView");
			case Id_setAndroidView:
				proxy.setProperty("androidView", args[0]);
				proxy.onPropertyChanged("androidView", args[0]);
				return Undefined.instance;
			case Id_getCancel:
				return proxy.getProperty("cancel");
			case Id_setCancel:
				proxy.setProperty("cancel", args[0]);
				proxy.onPropertyChanged("cancel", args[0]);
				return Undefined.instance;
			case Id_getOptions:
				return proxy.getProperty("options");
			case Id_setOptions:
				proxy.setProperty("options", args[0]);
				proxy.onPropertyChanged("options", args[0]);
				return Undefined.instance;
			case Id_getSelectedIndex:
				return proxy.getProperty("selectedIndex");
			case Id_setSelectedIndex:
				proxy.setProperty("selectedIndex", args[0]);
				proxy.onPropertyChanged("selectedIndex", args[0]);
				return Undefined.instance;
			case Id_getTitle:
				return proxy.getProperty("title");
			case Id_setTitle:
				proxy.setProperty("title", args[0]);
				proxy.onPropertyChanged("title", args[0]);
				return Undefined.instance;
			case Id_getTitleid:
				return proxy.getProperty("titleid");
			case Id_setTitleid:
				proxy.setProperty("titleid", args[0]);
				proxy.onPropertyChanged("titleid", args[0]);
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

		Id_androidView = 1
		,		
		Id_cancel = 2
		,		
		Id_options = 3
		,		
		Id_selectedIndex = 4
		,		
		Id_title = 5
		,		
		Id_titleid = 6
		,		
		Id_persistent = 7
		;

;

	public static final int MAX_INSTANCE_ID = 7;

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
            case 5: X="title";id=Id_title; break L;
            case 6: X="cancel";id=Id_cancel; break L;
            case 7: c=s.charAt(0);
                if (c=='o') { X="options";id=Id_options; }
                else if (c=='t') { X="titleid";id=Id_titleid; }
                break L;
            case 10: X="persistent";id=Id_persistent; break L;
            case 11: X="androidView";id=Id_androidView; break L;
            case 13: X="selectedIndex";id=Id_selectedIndex; break L;
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
			case Id_androidView:
				return "androidView";
			case Id_cancel:
				return "cancel";
			case Id_options:
				return "options";
			case Id_selectedIndex:
				return "selectedIndex";
			case Id_title:
				return "title";
			case Id_titleid:
				return "titleid";
			case Id_persistent:
				return "persistent";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		OptionDialogProxyPrototype proxy = this;
		while (start != null && !(start instanceof OptionDialogProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof OptionDialogProxyPrototype) {
			proxy = (OptionDialogProxyPrototype) start;
		}

		switch (id) {
			case Id_androidView:
				return proxy.getProperty("androidView");
			case Id_cancel:
				return proxy.getProperty("cancel");
			case Id_options:
				return proxy.getProperty("options");
			case Id_selectedIndex:
				return proxy.getProperty("selectedIndex");
			case Id_title:
				return proxy.getProperty("title");
			case Id_titleid:
				return proxy.getProperty("titleid");
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
		OptionDialogProxyPrototype proxy = this;
		while (start != null && !(start instanceof OptionDialogProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof OptionDialogProxyPrototype) {
			proxy = (OptionDialogProxyPrototype) start;
		}

		switch (id) {
			case Id_androidView:
				proxy.setProperty("androidView", value);
				proxy.onPropertyChanged("androidView", value);
				break;
			case Id_cancel:
				proxy.setProperty("cancel", value);
				proxy.onPropertyChanged("cancel", value);
				break;
			case Id_options:
				proxy.setProperty("options", value);
				proxy.onPropertyChanged("options", value);
				break;
			case Id_selectedIndex:
				proxy.setProperty("selectedIndex", value);
				proxy.onPropertyChanged("selectedIndex", value);
				break;
			case Id_title:
				proxy.setProperty("title", value);
				proxy.onPropertyChanged("title", value);
				break;
			case Id_titleid:
				proxy.setProperty("titleid", value);
				proxy.onPropertyChanged("titleid", value);
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
