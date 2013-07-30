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

import ti.modules.titanium.ui.SearchBarProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class SearchBarProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = 4014753016431599923L;

	private static final String TAG = "SearchBarProxyPrototype";
	private static final String CLASS_TAG = "SearchBarProxy";
	private static SearchBarProxyPrototype searchBarProxyPrototype;


	public static SearchBarProxyPrototype getProxyPrototype()
	{
		return searchBarProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		searchBarProxyPrototype = null;
	}

	public SearchBarProxyPrototype()
	{
		if (searchBarProxyPrototype == null && getClass().equals(SearchBarProxyPrototype.class)) {
			searchBarProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == searchBarProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return searchBarProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(SearchBarProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getPrompt = 2,
		Id_setPrompt = 3,
		Id_getPromptid = 4,
		Id_setPromptid = 5,
		Id_getHintText = 6,
		Id_setHintText = 7,
		Id_getHinttextid = 8,
		Id_setHinttextid = 9,
		Id_getShowCancel = 10,
		Id_setShowCancel = 11,
		Id_getBarColor = 12,
		Id_setBarColor = 13,
		Id_getValue = 14,
		Id_setValue = 15
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
                if (c=='g') { X="getValue";id=Id_getValue; }
                else if (c=='s') { X="setValue";id=Id_setValue; }
                break L;
            case 9: c=s.charAt(0);
                if (c=='g') { X="getPrompt";id=Id_getPrompt; }
                else if (c=='s') { X="setPrompt";id=Id_setPrompt; }
                break L;
            case 11: switch (s.charAt(3)) {
                case 'B': c=s.charAt(0);
                    if (c=='g') { X="getBarColor";id=Id_getBarColor; }
                    else if (c=='s') { X="setBarColor";id=Id_setBarColor; }
                    break L;
                case 'H': c=s.charAt(0);
                    if (c=='g') { X="getHintText";id=Id_getHintText; }
                    else if (c=='s') { X="setHintText";id=Id_setHintText; }
                    break L;
                case 'P': c=s.charAt(0);
                    if (c=='g') { X="getPromptid";id=Id_getPromptid; }
                    else if (c=='s') { X="setPromptid";id=Id_setPromptid; }
                    break L;
                case 's': X="constructor";id=Id_constructor; break L;
                } break L;
            case 13: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(12);
                    if (c=='d') { X="getHinttextid";id=Id_getHinttextid; }
                    else if (c=='l') { X="getShowCancel";id=Id_getShowCancel; }
                }
                else if (c=='s') {
                    c=s.charAt(12);
                    if (c=='d') { X="setHinttextid";id=Id_setHinttextid; }
                    else if (c=='l') { X="setShowCancel";id=Id_setShowCancel; }
                }
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
			case Id_getPrompt:
				arity = 0;
				name = "getPrompt";
				break;
			case Id_setPrompt:
				arity = 1;
				name = "setPrompt";
				break;
			case Id_getPromptid:
				arity = 0;
				name = "getPromptid";
				break;
			case Id_setPromptid:
				arity = 1;
				name = "setPromptid";
				break;
			case Id_getHintText:
				arity = 0;
				name = "getHintText";
				break;
			case Id_setHintText:
				arity = 1;
				name = "setHintText";
				break;
			case Id_getHinttextid:
				arity = 0;
				name = "getHinttextid";
				break;
			case Id_setHinttextid:
				arity = 1;
				name = "setHinttextid";
				break;
			case Id_getShowCancel:
				arity = 0;
				name = "getShowCancel";
				break;
			case Id_setShowCancel:
				arity = 1;
				name = "setShowCancel";
				break;
			case Id_getBarColor:
				arity = 0;
				name = "getBarColor";
				break;
			case Id_setBarColor:
				arity = 1;
				name = "setBarColor";
				break;
			case Id_getValue:
				arity = 0;
				name = "getValue";
				break;
			case Id_setValue:
				arity = 1;
				name = "setValue";
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

		while (thisObj != null && !(thisObj instanceof SearchBarProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		SearchBarProxyPrototype proxy = (SearchBarProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getPrompt:
				return proxy.getProperty("prompt");
			case Id_setPrompt:
				proxy.setProperty("prompt", args[0]);
				proxy.onPropertyChanged("prompt", args[0]);
				return Undefined.instance;
			case Id_getPromptid:
				return proxy.getProperty("promptid");
			case Id_setPromptid:
				proxy.setProperty("promptid", args[0]);
				proxy.onPropertyChanged("promptid", args[0]);
				return Undefined.instance;
			case Id_getHintText:
				return proxy.getProperty("hintText");
			case Id_setHintText:
				proxy.setProperty("hintText", args[0]);
				proxy.onPropertyChanged("hintText", args[0]);
				return Undefined.instance;
			case Id_getHinttextid:
				return proxy.getProperty("hinttextid");
			case Id_setHinttextid:
				proxy.setProperty("hinttextid", args[0]);
				proxy.onPropertyChanged("hinttextid", args[0]);
				return Undefined.instance;
			case Id_getShowCancel:
				return proxy.getProperty("showCancel");
			case Id_setShowCancel:
				proxy.setProperty("showCancel", args[0]);
				proxy.onPropertyChanged("showCancel", args[0]);
				return Undefined.instance;
			case Id_getBarColor:
				return proxy.getProperty("barColor");
			case Id_setBarColor:
				proxy.setProperty("barColor", args[0]);
				proxy.onPropertyChanged("barColor", args[0]);
				return Undefined.instance;
			case Id_getValue:
				return proxy.getProperty("value");
			case Id_setValue:
				proxy.setProperty("value", args[0]);
				proxy.onPropertyChanged("value", args[0]);
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

		Id_prompt = 1
		,		
		Id_promptid = 2
		,		
		Id_hintText = 3
		,		
		Id_hinttextid = 4
		,		
		Id_showCancel = 5
		,		
		Id_barColor = 6
		,		
		Id_value = 7
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
            case 5: X="value";id=Id_value; break L;
            case 6: X="prompt";id=Id_prompt; break L;
            case 8: c=s.charAt(0);
                if (c=='b') { X="barColor";id=Id_barColor; }
                else if (c=='h') { X="hintText";id=Id_hintText; }
                else if (c=='p') { X="promptid";id=Id_promptid; }
                break L;
            case 10: c=s.charAt(0);
                if (c=='h') { X="hinttextid";id=Id_hinttextid; }
                else if (c=='s') { X="showCancel";id=Id_showCancel; }
                break L;
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
			case Id_prompt:
				return "prompt";
			case Id_promptid:
				return "promptid";
			case Id_hintText:
				return "hintText";
			case Id_hinttextid:
				return "hinttextid";
			case Id_showCancel:
				return "showCancel";
			case Id_barColor:
				return "barColor";
			case Id_value:
				return "value";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		SearchBarProxyPrototype proxy = this;
		while (start != null && !(start instanceof SearchBarProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof SearchBarProxyPrototype) {
			proxy = (SearchBarProxyPrototype) start;
		}

		switch (id) {
			case Id_prompt:
				return proxy.getProperty("prompt");
			case Id_promptid:
				return proxy.getProperty("promptid");
			case Id_hintText:
				return proxy.getProperty("hintText");
			case Id_hinttextid:
				return proxy.getProperty("hinttextid");
			case Id_showCancel:
				return proxy.getProperty("showCancel");
			case Id_barColor:
				return proxy.getProperty("barColor");
			case Id_value:
				return proxy.getProperty("value");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		SearchBarProxyPrototype proxy = this;
		while (start != null && !(start instanceof SearchBarProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof SearchBarProxyPrototype) {
			proxy = (SearchBarProxyPrototype) start;
		}

		switch (id) {
			case Id_prompt:
				proxy.setProperty("prompt", value);
				proxy.onPropertyChanged("prompt", value);
				break;
			case Id_promptid:
				proxy.setProperty("promptid", value);
				proxy.onPropertyChanged("promptid", value);
				break;
			case Id_hintText:
				proxy.setProperty("hintText", value);
				proxy.onPropertyChanged("hintText", value);
				break;
			case Id_hinttextid:
				proxy.setProperty("hinttextid", value);
				proxy.onPropertyChanged("hinttextid", value);
				break;
			case Id_showCancel:
				proxy.setProperty("showCancel", value);
				proxy.onPropertyChanged("showCancel", value);
				break;
			case Id_barColor:
				proxy.setProperty("barColor", value);
				proxy.onPropertyChanged("barColor", value);
				break;
			case Id_value:
				proxy.setProperty("value", value);
				proxy.onPropertyChanged("value", value);
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
