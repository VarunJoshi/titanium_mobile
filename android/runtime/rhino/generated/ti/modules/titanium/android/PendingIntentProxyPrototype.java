/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.android;

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

import ti.modules.titanium.android.PendingIntentProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class PendingIntentProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -7869052297821764625L;

	private static final String TAG = "PendingIntentProxyPrototype";
	private static final String CLASS_TAG = "PendingIntentProxy";
	private static PendingIntentProxyPrototype pendingIntentProxyPrototype;


	public static PendingIntentProxyPrototype getProxyPrototype()
	{
		return pendingIntentProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		pendingIntentProxyPrototype = null;
	}

	public PendingIntentProxyPrototype()
	{
		if (pendingIntentProxyPrototype == null && getClass().equals(PendingIntentProxyPrototype.class)) {
			pendingIntentProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == pendingIntentProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return pendingIntentProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(PendingIntentProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getFlags = 2,
		Id_setFlags = 3,
		Id_getIntent = 4,
		Id_setIntent = 5,
		Id_getUpdateCurrentIntent = 6,
		Id_setUpdateCurrentIntent = 7
		// Method IDs
;
		

	public static final int MAX_PROTOTYPE_ID = 7;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 8: c=s.charAt(0);
                if (c=='g') { X="getFlags";id=Id_getFlags; }
                else if (c=='s') { X="setFlags";id=Id_setFlags; }
                break L;
            case 9: c=s.charAt(0);
                if (c=='g') { X="getIntent";id=Id_getIntent; }
                else if (c=='s') { X="setIntent";id=Id_setIntent; }
                break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 22: c=s.charAt(0);
                if (c=='g') { X="getUpdateCurrentIntent";id=Id_getUpdateCurrentIntent; }
                else if (c=='s') { X="setUpdateCurrentIntent";id=Id_setUpdateCurrentIntent; }
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
			case Id_getFlags:
				arity = 0;
				name = "getFlags";
				break;
			case Id_setFlags:
				arity = 1;
				name = "setFlags";
				break;
			case Id_getIntent:
				arity = 0;
				name = "getIntent";
				break;
			case Id_setIntent:
				arity = 1;
				name = "setIntent";
				break;
			case Id_getUpdateCurrentIntent:
				arity = 0;
				name = "getUpdateCurrentIntent";
				break;
			case Id_setUpdateCurrentIntent:
				arity = 1;
				name = "setUpdateCurrentIntent";
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

		while (thisObj != null && !(thisObj instanceof PendingIntentProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		PendingIntentProxyPrototype proxy = (PendingIntentProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getFlags:
				return proxy.getProperty("flags");
			case Id_setFlags:
				proxy.setProperty("flags", args[0]);
				proxy.onPropertyChanged("flags", args[0]);
				return Undefined.instance;
			case Id_getIntent:
				return proxy.getProperty("intent");
			case Id_setIntent:
				proxy.setProperty("intent", args[0]);
				proxy.onPropertyChanged("intent", args[0]);
				return Undefined.instance;
			case Id_getUpdateCurrentIntent:
				return proxy.getProperty("updateCurrentIntent");
			case Id_setUpdateCurrentIntent:
				proxy.setProperty("updateCurrentIntent", args[0]);
				proxy.onPropertyChanged("updateCurrentIntent", args[0]);
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

		Id_flags = 1
		,		
		Id_intent = 2
		,		
		Id_updateCurrentIntent = 3
		;

;

	public static final int MAX_INSTANCE_ID = 3;

	@Override
	protected int getMaxInstanceId()
	{
		return MAX_INSTANCE_ID;
	}

	@Override
	protected int findInstanceIdInfo(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==5) { X="flags";id=Id_flags; }
            else if (s_length==6) { X="intent";id=Id_intent; }
            else if (s_length==19) { X="updateCurrentIntent";id=Id_updateCurrentIntent; }
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
			case Id_flags:
				return "flags";
			case Id_intent:
				return "intent";
			case Id_updateCurrentIntent:
				return "updateCurrentIntent";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		PendingIntentProxyPrototype proxy = this;
		while (start != null && !(start instanceof PendingIntentProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof PendingIntentProxyPrototype) {
			proxy = (PendingIntentProxyPrototype) start;
		}

		switch (id) {
			case Id_flags:
				return proxy.getProperty("flags");
			case Id_intent:
				return proxy.getProperty("intent");
			case Id_updateCurrentIntent:
				return proxy.getProperty("updateCurrentIntent");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		PendingIntentProxyPrototype proxy = this;
		while (start != null && !(start instanceof PendingIntentProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof PendingIntentProxyPrototype) {
			proxy = (PendingIntentProxyPrototype) start;
		}

		switch (id) {
			case Id_flags:
				proxy.setProperty("flags", value);
				proxy.onPropertyChanged("flags", value);
				break;
			case Id_intent:
				proxy.setProperty("intent", value);
				proxy.onPropertyChanged("intent", value);
				break;
			case Id_updateCurrentIntent:
				proxy.setProperty("updateCurrentIntent", value);
				proxy.onPropertyChanged("updateCurrentIntent", value);
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
