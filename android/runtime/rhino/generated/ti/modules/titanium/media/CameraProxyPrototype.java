/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.media;

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

import ti.modules.titanium.media.CameraProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class CameraProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -5806966318039869425L;

	private static final String TAG = "CameraProxyPrototype";
	private static final String CLASS_TAG = "CameraProxy";
	private static CameraProxyPrototype cameraProxyPrototype;


	public static CameraProxyPrototype getProxyPrototype()
	{
		return cameraProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		cameraProxyPrototype = null;
	}

	public CameraProxyPrototype()
	{
		if (cameraProxyPrototype == null && getClass().equals(CameraProxyPrototype.class)) {
			cameraProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == cameraProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return cameraProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(CameraProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getPreview(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPreview()", Log.DEBUG_MODE);

		try {
		CameraProxy proxy = (CameraProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getPreview: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		ti.modules.titanium.media.CameraPreviewProxy javaResult = proxy.getPreview(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getPreview = 2
;
		

	public static final int MAX_PROTOTYPE_ID = 2;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==10) { X="getPreview";id=Id_getPreview; }
            else if (s_length==11) { X="constructor";id=Id_constructor; }
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
			case Id_getPreview:
				arity = 1;
				name = "getPreview";
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

		while (thisObj != null && !(thisObj instanceof CameraProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		CameraProxyPrototype proxy = (CameraProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getPreview:
				return getPreview(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



	public static final int MAX_INSTANCE_ID = -1;


	@Override
	public String getClassName()
	{
		return CLASS_TAG;
	}
}
