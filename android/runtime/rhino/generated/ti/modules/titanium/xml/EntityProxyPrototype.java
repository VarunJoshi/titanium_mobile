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

import ti.modules.titanium.xml.EntityProxy;

import ti.modules.titanium.xml.NodeProxyPrototype;


public class EntityProxyPrototype extends NodeProxyPrototype
{
	private static final long serialVersionUID = -1299037080306981559L;

	private static final String TAG = "EntityProxyPrototype";
	private static final String CLASS_TAG = "EntityProxy";
	private static EntityProxyPrototype entityProxyPrototype;


	public static EntityProxyPrototype getProxyPrototype()
	{
		return entityProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		entityProxyPrototype = null;
	}

	public EntityProxyPrototype()
	{
		if (entityProxyPrototype == null && getClass().equals(EntityProxyPrototype.class)) {
			entityProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == entityProxyPrototype) {
			return NodeProxyPrototype.getProxyPrototype();
		}
		return entityProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return NodeProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(EntityProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getPublicId(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPublicId()", Log.DEBUG_MODE);

		try {
		EntityProxy proxy = (EntityProxy) ((Proxy) thisObj).getProxy();

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
		EntityProxy proxy = (EntityProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getSystemId();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getNotationName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getNotationName()", Log.DEBUG_MODE);

		try {
		EntityProxy proxy = (EntityProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getNotationName();

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
		EntityProxy proxy = (EntityProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getPublicId();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_systemId()
	{
		Log.d(TAG, "get systemId", Log.DEBUG_MODE);
		EntityProxy proxy = (EntityProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getSystemId();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_notationName()
	{
		Log.d(TAG, "get notationName", Log.DEBUG_MODE);
		EntityProxy proxy = (EntityProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getNotationName();

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
		Id_getSystemId = 3,
		Id_getNotationName = 4
;
		

	public static final int MAX_PROTOTYPE_ID = 4;

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
            int s_length = s.length();
            if (s_length==11) {
                c=s.charAt(3);
                if (c=='P') { X="getPublicId";id=Id_getPublicId; }
                else if (c=='S') { X="getSystemId";id=Id_getSystemId; }
                else if (c=='s') { X="constructor";id=Id_constructor; }
            }
            else if (s_length==15) { X="getNotationName";id=Id_getNotationName; }
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
			case Id_getNotationName:
				arity = 0;
				name = "getNotationName";
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

		while (thisObj != null && !(thisObj instanceof EntityProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		EntityProxyPrototype proxy = (EntityProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getPublicId:
				return getPublicId(cx, thisObj, args);
				
			case Id_getSystemId:
				return getSystemId(cx, thisObj, args);
				
			case Id_getNotationName:
				return getNotationName(cx, thisObj, args);
				
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
		,		
		Id_notationName = 3
		;

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
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null; int c;
            int s_length = s.length();
            if (s_length==8) {
                c=s.charAt(0);
                if (c=='p') { X="publicId";id=Id_publicId; }
                else if (c=='s') { X="systemId";id=Id_systemId; }
            }
            else if (s_length==12) { X="notationName";id=Id_notationName; }
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
			case Id_notationName:
				return "notationName"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		EntityProxyPrototype proxy = this;
		while (start != null && !(start instanceof EntityProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof EntityProxyPrototype) {
			proxy = (EntityProxyPrototype) start;
		}

		switch (id) {
			case Id_publicId:
				return proxy.getter_publicId();
			case Id_systemId:
				return proxy.getter_systemId();
			case Id_notationName:
				return proxy.getter_notationName();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		EntityProxyPrototype proxy = this;
		while (start != null && !(start instanceof EntityProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof EntityProxyPrototype) {
			proxy = (EntityProxyPrototype) start;
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
			case Id_notationName:
				proxy.setProperty("notationName", value);
				proxy.onPropertyChanged("notationName", value);
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
