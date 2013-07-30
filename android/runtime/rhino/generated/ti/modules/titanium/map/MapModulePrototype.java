/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.map;

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

import ti.modules.titanium.map.MapModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class MapModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = 6568384080284699007L;

	private static final String TAG = "MapModulePrototype";
	private static final String CLASS_TAG = "MapModule";
	private static MapModulePrototype mapModulePrototype;

	// Lazy loaded child APIs
	private Object API_View = null;
	private Object API_Annotation = null;

	public static MapModulePrototype getProxyPrototype()
	{
		return mapModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		mapModulePrototype = null;
	}

	public MapModulePrototype()
	{
		if (mapModulePrototype == null && getClass().equals(MapModulePrototype.class)) {
			mapModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("ANNOTATION_RED", this, 1);


			putConst("STANDARD_TYPE", this, 1);


			putConst("SATELLITE_TYPE", this, 2);


			putConst("HYBRID_TYPE", this, 3);


			putConst("ANNOTATION_GREEN", this, 2);


			putConst("ANNOTATION_PURPLE", this, 3);

	}

	public Scriptable getPrototype()
	{
		if (this == mapModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return mapModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(MapModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_createAnnotation = 2,
				Id_createView = 3
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
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==10) { X="createView";id=Id_createView; }
            else if (s_length==11) { X="constructor";id=Id_constructor; }
            else if (s_length==16) { X="createAnnotation";id=Id_createAnnotation; }
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
			case Id_createAnnotation:
				arity = 1;
				name = "createAnnotation";
				break;
			case Id_createView:
				arity = 1;
				name = "createView";
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

		while (thisObj != null && !(thisObj instanceof MapModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		MapModulePrototype proxy = (MapModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_createAnnotation:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.map.AnnotationProxy", args);
			case Id_createView:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.map.ViewProxy", args);
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
;

;

	// Child APIs
	private static final int

		Id_View = 1
		,		
		Id_Annotation = 2
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
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==4) { X="View";id=Id_View; }
            else if (s_length==10) { X="Annotation";id=Id_Annotation; }
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
			case Id_View:
				return "View";
			case Id_Annotation:
				return "Annotation";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		MapModulePrototype proxy = this;
		while (start != null && !(start instanceof MapModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof MapModulePrototype) {
			proxy = (MapModulePrototype) start;
		}

		switch (id) {
			case Id_View:
				if (proxy.API_View == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_View = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.map.ViewProxy", ti.modules.titanium.map.ViewProxyPrototype.class); 
				}
				return proxy.API_View;
			case Id_Annotation:
				if (proxy.API_Annotation == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Annotation = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.map.AnnotationProxy", ti.modules.titanium.map.AnnotationProxyPrototype.class); 
				}
				return proxy.API_Annotation;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		MapModulePrototype proxy = this;
		while (start != null && !(start instanceof MapModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof MapModulePrototype) {
			proxy = (MapModulePrototype) start;
		}

		switch (id) {
			case Id_View:
				if (value instanceof Proxy) {
					proxy.API_View = value;
				} else {
					defineProperty(original, "View", value, 0);
				}
				break;
			case Id_Annotation:
				if (value instanceof Proxy) {
					proxy.API_Annotation = value;
				} else {
					defineProperty(original, "Annotation", value, 0);
				}
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
