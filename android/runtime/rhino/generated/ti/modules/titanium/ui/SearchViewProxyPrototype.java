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

import ti.modules.titanium.ui.SearchViewProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class SearchViewProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = -6849762915157751114L;

	private static final String TAG = "SearchViewProxyPrototype";
	private static final String CLASS_TAG = "SearchViewProxy";
	private static SearchViewProxyPrototype searchViewProxyPrototype;


	public static SearchViewProxyPrototype getProxyPrototype()
	{
		return searchViewProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		searchViewProxyPrototype = null;
	}

	public SearchViewProxyPrototype()
	{
		if (searchViewProxyPrototype == null && getClass().equals(SearchViewProxyPrototype.class)) {
			searchViewProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == searchViewProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return searchViewProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(SearchViewProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getIconified = 2,
		Id_setIconified = 3,
		Id_getIconifiedByDefault = 4,
		Id_setIconifiedByDefault = 5,
		Id_getHintText = 6,
		Id_setHintText = 7,
		Id_getValue = 8,
		Id_setValue = 9
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
            case 8: c=s.charAt(0);
                if (c=='g') { X="getValue";id=Id_getValue; }
                else if (c=='s') { X="setValue";id=Id_setValue; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') { X="getHintText";id=Id_getHintText; }
                else if (c=='s') { X="setHintText";id=Id_setHintText; }
                break L;
            case 12: c=s.charAt(0);
                if (c=='g') { X="getIconified";id=Id_getIconified; }
                else if (c=='s') { X="setIconified";id=Id_setIconified; }
                break L;
            case 21: c=s.charAt(0);
                if (c=='g') { X="getIconifiedByDefault";id=Id_getIconifiedByDefault; }
                else if (c=='s') { X="setIconifiedByDefault";id=Id_setIconifiedByDefault; }
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
			case Id_getIconified:
				arity = 0;
				name = "getIconified";
				break;
			case Id_setIconified:
				arity = 1;
				name = "setIconified";
				break;
			case Id_getIconifiedByDefault:
				arity = 0;
				name = "getIconifiedByDefault";
				break;
			case Id_setIconifiedByDefault:
				arity = 1;
				name = "setIconifiedByDefault";
				break;
			case Id_getHintText:
				arity = 0;
				name = "getHintText";
				break;
			case Id_setHintText:
				arity = 1;
				name = "setHintText";
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

		while (thisObj != null && !(thisObj instanceof SearchViewProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		SearchViewProxyPrototype proxy = (SearchViewProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getIconified:
				return proxy.getProperty("iconified");
			case Id_setIconified:
				proxy.setProperty("iconified", args[0]);
				proxy.onPropertyChanged("iconified", args[0]);
				return Undefined.instance;
			case Id_getIconifiedByDefault:
				return proxy.getProperty("iconifiedByDefault");
			case Id_setIconifiedByDefault:
				proxy.setProperty("iconifiedByDefault", args[0]);
				proxy.onPropertyChanged("iconifiedByDefault", args[0]);
				return Undefined.instance;
			case Id_getHintText:
				return proxy.getProperty("hintText");
			case Id_setHintText:
				proxy.setProperty("hintText", args[0]);
				proxy.onPropertyChanged("hintText", args[0]);
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

		Id_iconified = 1
		,		
		Id_iconifiedByDefault = 2
		,		
		Id_hintText = 3
		,		
		Id_value = 4
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
        L0: { id = 0; String X = null;
            L: switch (s.length()) {
            case 5: X="value";id=Id_value; break L;
            case 8: X="hintText";id=Id_hintText; break L;
            case 9: X="iconified";id=Id_iconified; break L;
            case 18: X="iconifiedByDefault";id=Id_iconifiedByDefault; break L;
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
			case Id_iconified:
				return "iconified";
			case Id_iconifiedByDefault:
				return "iconifiedByDefault";
			case Id_hintText:
				return "hintText";
			case Id_value:
				return "value";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		SearchViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof SearchViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof SearchViewProxyPrototype) {
			proxy = (SearchViewProxyPrototype) start;
		}

		switch (id) {
			case Id_iconified:
				return proxy.getProperty("iconified");
			case Id_iconifiedByDefault:
				return proxy.getProperty("iconifiedByDefault");
			case Id_hintText:
				return proxy.getProperty("hintText");
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
		SearchViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof SearchViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof SearchViewProxyPrototype) {
			proxy = (SearchViewProxyPrototype) start;
		}

		switch (id) {
			case Id_iconified:
				proxy.setProperty("iconified", value);
				proxy.onPropertyChanged("iconified", value);
				break;
			case Id_iconifiedByDefault:
				proxy.setProperty("iconifiedByDefault", value);
				proxy.onPropertyChanged("iconifiedByDefault", value);
				break;
			case Id_hintText:
				proxy.setProperty("hintText", value);
				proxy.onPropertyChanged("hintText", value);
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
