/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.geolocation.android;

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

import ti.modules.titanium.geolocation.android.LocationRuleProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class LocationRuleProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -50059251021095089L;

	private static final String TAG = "LocationRuleProxyPrototype";
	private static final String CLASS_TAG = "LocationRuleProxy";
	private static LocationRuleProxyPrototype locationRuleProxyPrototype;


	public static LocationRuleProxyPrototype getProxyPrototype()
	{
		return locationRuleProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		locationRuleProxyPrototype = null;
	}

	public LocationRuleProxyPrototype()
	{
		if (locationRuleProxyPrototype == null && getClass().equals(LocationRuleProxyPrototype.class)) {
			locationRuleProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == locationRuleProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return locationRuleProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(LocationRuleProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getProvider = 2,
		Id_setProvider = 3,
		Id_getAccuracy = 4,
		Id_setAccuracy = 5,
		Id_getMinAge = 6,
		Id_setMinAge = 7,
		Id_getMaxAge = 8,
		Id_setMaxAge = 9
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
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null; int c;
            int s_length = s.length();
            if (s_length==9) {
                c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(4);
                    if (c=='a') { X="getMaxAge";id=Id_getMaxAge; }
                    else if (c=='i') { X="getMinAge";id=Id_getMinAge; }
                }
                else if (c=='s') {
                    c=s.charAt(4);
                    if (c=='a') { X="setMaxAge";id=Id_setMaxAge; }
                    else if (c=='i') { X="setMinAge";id=Id_setMinAge; }
                }
            }
            else if (s_length==11) {
                c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') {
                    c=s.charAt(10);
                    if (c=='r') { X="getProvider";id=Id_getProvider; }
                    else if (c=='y') { X="getAccuracy";id=Id_getAccuracy; }
                }
                else if (c=='s') {
                    c=s.charAt(10);
                    if (c=='r') { X="setProvider";id=Id_setProvider; }
                    else if (c=='y') { X="setAccuracy";id=Id_setAccuracy; }
                }
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
			case Id_getProvider:
				arity = 0;
				name = "getProvider";
				break;
			case Id_setProvider:
				arity = 1;
				name = "setProvider";
				break;
			case Id_getAccuracy:
				arity = 0;
				name = "getAccuracy";
				break;
			case Id_setAccuracy:
				arity = 1;
				name = "setAccuracy";
				break;
			case Id_getMinAge:
				arity = 0;
				name = "getMinAge";
				break;
			case Id_setMinAge:
				arity = 1;
				name = "setMinAge";
				break;
			case Id_getMaxAge:
				arity = 0;
				name = "getMaxAge";
				break;
			case Id_setMaxAge:
				arity = 1;
				name = "setMaxAge";
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

		while (thisObj != null && !(thisObj instanceof LocationRuleProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		LocationRuleProxyPrototype proxy = (LocationRuleProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getProvider:
				return proxy.getProperty("provider");
			case Id_setProvider:
				proxy.setProperty("provider", args[0]);
				proxy.onPropertyChanged("provider", args[0]);
				return Undefined.instance;
			case Id_getAccuracy:
				return proxy.getProperty("accuracy");
			case Id_setAccuracy:
				proxy.setProperty("accuracy", args[0]);
				proxy.onPropertyChanged("accuracy", args[0]);
				return Undefined.instance;
			case Id_getMinAge:
				return proxy.getProperty("minAge");
			case Id_setMinAge:
				proxy.setProperty("minAge", args[0]);
				proxy.onPropertyChanged("minAge", args[0]);
				return Undefined.instance;
			case Id_getMaxAge:
				return proxy.getProperty("maxAge");
			case Id_setMaxAge:
				proxy.setProperty("maxAge", args[0]);
				proxy.onPropertyChanged("maxAge", args[0]);
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

		Id_provider = 1
		,		
		Id_accuracy = 2
		,		
		Id_minAge = 3
		,		
		Id_maxAge = 4
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
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null; int c;
            int s_length = s.length();
            if (s_length==6) {
                c=s.charAt(1);
                if (c=='a') { X="maxAge";id=Id_maxAge; }
                else if (c=='i') { X="minAge";id=Id_minAge; }
            }
            else if (s_length==8) {
                c=s.charAt(0);
                if (c=='a') { X="accuracy";id=Id_accuracy; }
                else if (c=='p') { X="provider";id=Id_provider; }
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
			case Id_provider:
				return "provider";
			case Id_accuracy:
				return "accuracy";
			case Id_minAge:
				return "minAge";
			case Id_maxAge:
				return "maxAge";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		LocationRuleProxyPrototype proxy = this;
		while (start != null && !(start instanceof LocationRuleProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof LocationRuleProxyPrototype) {
			proxy = (LocationRuleProxyPrototype) start;
		}

		switch (id) {
			case Id_provider:
				return proxy.getProperty("provider");
			case Id_accuracy:
				return proxy.getProperty("accuracy");
			case Id_minAge:
				return proxy.getProperty("minAge");
			case Id_maxAge:
				return proxy.getProperty("maxAge");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		LocationRuleProxyPrototype proxy = this;
		while (start != null && !(start instanceof LocationRuleProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof LocationRuleProxyPrototype) {
			proxy = (LocationRuleProxyPrototype) start;
		}

		switch (id) {
			case Id_provider:
				proxy.setProperty("provider", value);
				proxy.onPropertyChanged("provider", value);
				break;
			case Id_accuracy:
				proxy.setProperty("accuracy", value);
				proxy.onPropertyChanged("accuracy", value);
				break;
			case Id_minAge:
				proxy.setProperty("minAge", value);
				proxy.onPropertyChanged("minAge", value);
				break;
			case Id_maxAge:
				proxy.setProperty("maxAge", value);
				proxy.onPropertyChanged("maxAge", value);
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
