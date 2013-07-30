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

import ti.modules.titanium.xml.DOMImplementationProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class DOMImplementationProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -5624453265309059168L;

	private static final String TAG = "DOMImplementationProxyPrototype";
	private static final String CLASS_TAG = "DOMImplementationProxy";
	private static DOMImplementationProxyPrototype dOMImplementationProxyPrototype;


	public static DOMImplementationProxyPrototype getProxyPrototype()
	{
		return dOMImplementationProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		dOMImplementationProxyPrototype = null;
	}

	public DOMImplementationProxyPrototype()
	{
		if (dOMImplementationProxyPrototype == null && getClass().equals(DOMImplementationProxyPrototype.class)) {
			dOMImplementationProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == dOMImplementationProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return dOMImplementationProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(DOMImplementationProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object createDocument(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createDocument()", Log.DEBUG_MODE);

		try {
		DOMImplementationProxy proxy = (DOMImplementationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("createDocument: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;
		if (!(args[2] instanceof Proxy) && args[2] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[2];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.xml.DocumentTypeProxy arg2;
		arg2 = (ti.modules.titanium.xml.DocumentTypeProxy) TypeConverter.jsObjectToJavaObject(args[2], thisObj) ;

		ti.modules.titanium.xml.DocumentProxy javaResult = proxy.createDocument(arg0, arg1, arg2);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object createDocumentType(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createDocumentType()", Log.DEBUG_MODE);

		try {
		DOMImplementationProxy proxy = (DOMImplementationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("createDocumentType: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;
		java.lang.String arg2;
		arg2 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[2], thisObj) ;

		ti.modules.titanium.xml.DocumentTypeProxy javaResult = proxy.createDocumentType(arg0, arg1, arg2);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object hasFeature(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "hasFeature()", Log.DEBUG_MODE);

		try {
		DOMImplementationProxy proxy = (DOMImplementationProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("hasFeature: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		boolean javaResult = proxy.hasFeature(arg0, arg1);

		Boolean rhinoResult = (Boolean) javaResult;
	
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
		Id_createDocument = 2,
		Id_createDocumentType = 3,
		Id_hasFeature = 4
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
        L0: { id = 0; String X = null;
            L: switch (s.length()) {
            case 10: X="hasFeature";id=Id_hasFeature; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 14: X="createDocument";id=Id_createDocument; break L;
            case 18: X="createDocumentType";id=Id_createDocumentType; break L;
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
			case Id_createDocument:
				arity = 3;
				name = "createDocument";
				break;
			case Id_createDocumentType:
				arity = 3;
				name = "createDocumentType";
				break;
			case Id_hasFeature:
				arity = 2;
				name = "hasFeature";
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

		while (thisObj != null && !(thisObj instanceof DOMImplementationProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		DOMImplementationProxyPrototype proxy = (DOMImplementationProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_createDocument:
				return createDocument(cx, thisObj, args);
				
			case Id_createDocumentType:
				return createDocumentType(cx, thisObj, args);
				
			case Id_hasFeature:
				return hasFeature(cx, thisObj, args);
				
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
