/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.xml;

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

import ti.modules.titanium.xml.NotationProxy;

import ti.modules.titanium.xml.NodeProxyPrototype;


public class NotationProxyPrototype extends NodeProxyPrototype
{
	private static final long serialVersionUID = -2038742902756008181L;

	private static final String TAG = "NotationProxyPrototype";
	private static final String CLASS_TAG = "NotationProxy";
	private static NotationProxyPrototype notationProxyPrototype;


	public static NotationProxyPrototype getProxyPrototype()
	{
		return notationProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		notationProxyPrototype = null;
	}

	public NotationProxyPrototype()
	{
		if (notationProxyPrototype == null && getClass().equals(NotationProxyPrototype.class)) {
			notationProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == notationProxyPrototype) {
			return NodeProxyPrototype.getProxyPrototype();
		}
		return notationProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return NodeProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(NotationProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getPublicId(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPublicId()", Log.DEBUG_MODE);

		try {
		NotationProxy proxy = (NotationProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getPublicId();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getSystemId(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getSystemId()", Log.DEBUG_MODE);

		try {
		NotationProxy proxy = (NotationProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getSystemId();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public String getter_publicId()
	{
		Log.d(TAG, "get publicId", Log.DEBUG_MODE);
		NotationProxy proxy = (NotationProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getPublicId();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_systemId()
	{
		Log.d(TAG, "get systemId", Log.DEBUG_MODE);
		NotationProxy proxy = (NotationProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getSystemId();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getPublicId = 2,
		Id_getSystemId = 3
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
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null; int c;
            if (s.length()==11) {
                c=s.charAt(3);
                if (c=='P') { X="getPublicId";id=Id_getPublicId; }
                else if (c=='S') { X="getSystemId";id=Id_getSystemId; }
                else if (c=='s') { X="constructor";id=Id_constructor; }
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
			case Id_getPublicId:
				arity = 0;
				name = "getPublicId";
				break;
			case Id_getSystemId:
				arity = 0;
				name = "getSystemId";
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

		while (thisObj != null && !(thisObj instanceof NotationProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		NotationProxyPrototype proxy = (NotationProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getPublicId:
				return getPublicId(cx, thisObj, args);
				
			case Id_getSystemId:
				return getSystemId(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_publicId = 1
		,		
		Id_systemId = 2
		;

;

;

	public static final int MAX_INSTANCE_ID = 2;

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
            if (s.length()==8) {
                c=s.charAt(0);
                if (c=='p') { X="publicId";id=Id_publicId; }
                else if (c=='s') { X="systemId";id=Id_systemId; }
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
			case Id_publicId:
				return "publicId"; 
			case Id_systemId:
				return "systemId"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		NotationProxyPrototype proxy = this;
		while (start != null && !(start instanceof NotationProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof NotationProxyPrototype) {
			proxy = (NotationProxyPrototype) start;
		}

		switch (id) {
			case Id_publicId:
				return proxy.getter_publicId();
			case Id_systemId:
				return proxy.getter_systemId();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		NotationProxyPrototype proxy = this;
		while (start != null && !(start instanceof NotationProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof NotationProxyPrototype) {
			proxy = (NotationProxyPrototype) start;
		}

		switch (id) {
			case Id_publicId:
				proxy.setProperty("publicId", value);
				proxy.onPropertyChanged("publicId", value);
				break; 
			case Id_systemId:
				proxy.setProperty("systemId", value);
				proxy.onPropertyChanged("systemId", value);
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
