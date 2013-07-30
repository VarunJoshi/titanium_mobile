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

import ti.modules.titanium.map.ViewProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class ViewProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = -2393149085348229913L;

	private static final String TAG = "ViewProxyPrototype";
	private static final String CLASS_TAG = "ViewProxy";
	private static ViewProxyPrototype viewProxyPrototype;


	public static ViewProxyPrototype getProxyPrototype()
	{
		return viewProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		viewProxyPrototype = null;
	}

	public ViewProxyPrototype()
	{
		if (viewProxyPrototype == null && getClass().equals(ViewProxyPrototype.class)) {
			viewProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == viewProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return viewProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ViewProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void setLocation(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setLocation()", Log.DEBUG_MODE);

		try {
		ViewProxy proxy = (ViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setLocation: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		proxy.setLocation(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void deselectAnnotation(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "deselectAnnotation()", Log.DEBUG_MODE);

		try {
		ViewProxy proxy = (ViewProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		proxy.deselectAnnotation(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void zoom(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "zoom()", Log.DEBUG_MODE);

		try {
		ViewProxy proxy = (ViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("zoom: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.zoom(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void removeAllAnnotations(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeAllAnnotations()", Log.DEBUG_MODE);

		try {
		ViewProxy proxy = (ViewProxy) ((Proxy) thisObj).getProxy();

		proxy.removeAllAnnotations();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getLongitudeDelta(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLongitudeDelta()", Log.DEBUG_MODE);

		try {
		ViewProxy proxy = (ViewProxy) ((Proxy) thisObj).getProxy();

		double javaResult = proxy.getLongitudeDelta();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void selectAnnotation(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "selectAnnotation()", Log.DEBUG_MODE);

		try {
		ViewProxy proxy = (ViewProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		proxy.selectAnnotation(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void addRoute(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addRoute()", Log.DEBUG_MODE);

		try {
		ViewProxy proxy = (ViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("addRoute: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		proxy.addRoute(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void addAnnotations(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addAnnotations()", Log.DEBUG_MODE);

		try {
		ViewProxy proxy = (ViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("addAnnotations: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.addAnnotations(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void removeAnnotation(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeAnnotation()", Log.DEBUG_MODE);

		try {
		ViewProxy proxy = (ViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removeAnnotation: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.removeAnnotation(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void removeRoute(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeRoute()", Log.DEBUG_MODE);

		try {
		ViewProxy proxy = (ViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removeRoute: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		proxy.removeRoute(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getLatitudeDelta(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLatitudeDelta()", Log.DEBUG_MODE);

		try {
		ViewProxy proxy = (ViewProxy) ((Proxy) thisObj).getProxy();

		double javaResult = proxy.getLatitudeDelta();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void addAnnotation(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addAnnotation()", Log.DEBUG_MODE);

		try {
		ViewProxy proxy = (ViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("addAnnotation: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.map.AnnotationProxy arg0;
		arg0 = (ti.modules.titanium.map.AnnotationProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.addAnnotation(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Number getter_latitudeDelta()
	{
		Log.d(TAG, "get latitudeDelta", Log.DEBUG_MODE);
		ViewProxy proxy = (ViewProxy) getProxy();
		Scriptable thisObj = this;
		double javaResult = proxy.getLatitudeDelta();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Number getter_longitudeDelta()
	{
		Log.d(TAG, "get longitudeDelta", Log.DEBUG_MODE);
		ViewProxy proxy = (ViewProxy) getProxy();
		Scriptable thisObj = this;
		double javaResult = proxy.getLongitudeDelta();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getAnimate = 2,
		Id_setAnimate = 3,
		Id_getAnnotations = 4,
		Id_setAnnotations = 5,
		Id_getMapType = 6,
		Id_setMapType = 7,
		Id_getRegion = 8,
		Id_setRegion = 9,
		Id_getRegionFit = 10,
		Id_setRegionFit = 11,
		Id_getUserLocation = 12,
		Id_setUserLocation = 13,
		Id_getHideAnnotationWhenTouchMap = 14,
		Id_setHideAnnotationWhenTouchMap = 15,
		// Method IDs
		Id_setLocation = 16,
		Id_deselectAnnotation = 17,
		Id_zoom = 18,
		Id_removeAllAnnotations = 19,
		Id_getLongitudeDelta = 20,
		Id_selectAnnotation = 21,
		Id_addRoute = 22,
		Id_addAnnotations = 23,
		Id_removeAnnotation = 24,
		Id_removeRoute = 25,
		Id_getLatitudeDelta = 26,
		Id_addAnnotation = 27
;
		

	public static final int MAX_PROTOTYPE_ID = 27;

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
            case 4: X="zoom";id=Id_zoom; break L;
            case 8: X="addRoute";id=Id_addRoute; break L;
            case 9: c=s.charAt(0);
                if (c=='g') { X="getRegion";id=Id_getRegion; }
                else if (c=='s') { X="setRegion";id=Id_setRegion; }
                break L;
            case 10: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(3);
                    if (c=='A') { X="getAnimate";id=Id_getAnimate; }
                    else if (c=='M') { X="getMapType";id=Id_getMapType; }
                }
                else if (c=='s') {
                    c=s.charAt(3);
                    if (c=='A') { X="setAnimate";id=Id_setAnimate; }
                    else if (c=='M') { X="setMapType";id=Id_setMapType; }
                }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='r') { X="removeRoute";id=Id_removeRoute; }
                else if (c=='s') { X="setLocation";id=Id_setLocation; }
                break L;
            case 12: c=s.charAt(0);
                if (c=='g') { X="getRegionFit";id=Id_getRegionFit; }
                else if (c=='s') { X="setRegionFit";id=Id_setRegionFit; }
                break L;
            case 13: X="addAnnotation";id=Id_addAnnotation; break L;
            case 14: c=s.charAt(0);
                if (c=='a') { X="addAnnotations";id=Id_addAnnotations; }
                else if (c=='g') { X="getAnnotations";id=Id_getAnnotations; }
                else if (c=='s') { X="setAnnotations";id=Id_setAnnotations; }
                break L;
            case 15: c=s.charAt(0);
                if (c=='g') { X="getUserLocation";id=Id_getUserLocation; }
                else if (c=='s') { X="setUserLocation";id=Id_setUserLocation; }
                break L;
            case 16: c=s.charAt(0);
                if (c=='g') { X="getLatitudeDelta";id=Id_getLatitudeDelta; }
                else if (c=='r') { X="removeAnnotation";id=Id_removeAnnotation; }
                else if (c=='s') { X="selectAnnotation";id=Id_selectAnnotation; }
                break L;
            case 17: X="getLongitudeDelta";id=Id_getLongitudeDelta; break L;
            case 18: X="deselectAnnotation";id=Id_deselectAnnotation; break L;
            case 20: X="removeAllAnnotations";id=Id_removeAllAnnotations; break L;
            case 29: c=s.charAt(0);
                if (c=='g') { X="getHideAnnotationWhenTouchMap";id=Id_getHideAnnotationWhenTouchMap; }
                else if (c=='s') { X="setHideAnnotationWhenTouchMap";id=Id_setHideAnnotationWhenTouchMap; }
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
			case Id_getAnimate:
				arity = 0;
				name = "getAnimate";
				break;
			case Id_setAnimate:
				arity = 1;
				name = "setAnimate";
				break;
			case Id_getAnnotations:
				arity = 0;
				name = "getAnnotations";
				break;
			case Id_setAnnotations:
				arity = 1;
				name = "setAnnotations";
				break;
			case Id_getMapType:
				arity = 0;
				name = "getMapType";
				break;
			case Id_setMapType:
				arity = 1;
				name = "setMapType";
				break;
			case Id_getRegion:
				arity = 0;
				name = "getRegion";
				break;
			case Id_setRegion:
				arity = 1;
				name = "setRegion";
				break;
			case Id_getRegionFit:
				arity = 0;
				name = "getRegionFit";
				break;
			case Id_setRegionFit:
				arity = 1;
				name = "setRegionFit";
				break;
			case Id_getUserLocation:
				arity = 0;
				name = "getUserLocation";
				break;
			case Id_setUserLocation:
				arity = 1;
				name = "setUserLocation";
				break;
			case Id_getHideAnnotationWhenTouchMap:
				arity = 0;
				name = "getHideAnnotationWhenTouchMap";
				break;
			case Id_setHideAnnotationWhenTouchMap:
				arity = 1;
				name = "setHideAnnotationWhenTouchMap";
				break;
			case Id_setLocation:
				arity = 1;
				name = "setLocation";
				break;
			case Id_deselectAnnotation:
				arity = 1;
				name = "deselectAnnotation";
				break;
			case Id_zoom:
				arity = 1;
				name = "zoom";
				break;
			case Id_removeAllAnnotations:
				arity = 0;
				name = "removeAllAnnotations";
				break;
			case Id_getLongitudeDelta:
				arity = 0;
				name = "getLongitudeDelta";
				break;
			case Id_selectAnnotation:
				arity = 1;
				name = "selectAnnotation";
				break;
			case Id_addRoute:
				arity = 1;
				name = "addRoute";
				break;
			case Id_addAnnotations:
				arity = 1;
				name = "addAnnotations";
				break;
			case Id_removeAnnotation:
				arity = 1;
				name = "removeAnnotation";
				break;
			case Id_removeRoute:
				arity = 1;
				name = "removeRoute";
				break;
			case Id_getLatitudeDelta:
				arity = 0;
				name = "getLatitudeDelta";
				break;
			case Id_addAnnotation:
				arity = 1;
				name = "addAnnotation";
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

		while (thisObj != null && !(thisObj instanceof ViewProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ViewProxyPrototype proxy = (ViewProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getAnimate:
				return proxy.getProperty("animate");
			case Id_setAnimate:
				proxy.setProperty("animate", args[0]);
				proxy.onPropertyChanged("animate", args[0]);
				return Undefined.instance;
			case Id_getAnnotations:
				return proxy.getProperty("annotations");
			case Id_setAnnotations:
				proxy.setProperty("annotations", args[0]);
				proxy.onPropertyChanged("annotations", args[0]);
				return Undefined.instance;
			case Id_getMapType:
				return proxy.getProperty("mapType");
			case Id_setMapType:
				proxy.setProperty("mapType", args[0]);
				proxy.onPropertyChanged("mapType", args[0]);
				return Undefined.instance;
			case Id_getRegion:
				return proxy.getProperty("region");
			case Id_setRegion:
				proxy.setProperty("region", args[0]);
				proxy.onPropertyChanged("region", args[0]);
				return Undefined.instance;
			case Id_getRegionFit:
				return proxy.getProperty("regionFit");
			case Id_setRegionFit:
				proxy.setProperty("regionFit", args[0]);
				proxy.onPropertyChanged("regionFit", args[0]);
				return Undefined.instance;
			case Id_getUserLocation:
				return proxy.getProperty("userLocation");
			case Id_setUserLocation:
				proxy.setProperty("userLocation", args[0]);
				proxy.onPropertyChanged("userLocation", args[0]);
				return Undefined.instance;
			case Id_getHideAnnotationWhenTouchMap:
				return proxy.getProperty("hideAnnotationWhenTouchMap");
			case Id_setHideAnnotationWhenTouchMap:
				proxy.setProperty("hideAnnotationWhenTouchMap", args[0]);
				proxy.onPropertyChanged("hideAnnotationWhenTouchMap", args[0]);
				return Undefined.instance;
			case Id_setLocation:
				 setLocation(cx, thisObj, args);
				return Undefined.instance;
			case Id_deselectAnnotation:
				 deselectAnnotation(cx, thisObj, args);
				return Undefined.instance;
			case Id_zoom:
				 zoom(cx, thisObj, args);
				return Undefined.instance;
			case Id_removeAllAnnotations:
				 removeAllAnnotations(cx, thisObj, args);
				return Undefined.instance;
			case Id_getLongitudeDelta:
				return getLongitudeDelta(cx, thisObj, args);
				
			case Id_selectAnnotation:
				 selectAnnotation(cx, thisObj, args);
				return Undefined.instance;
			case Id_addRoute:
				 addRoute(cx, thisObj, args);
				return Undefined.instance;
			case Id_addAnnotations:
				 addAnnotations(cx, thisObj, args);
				return Undefined.instance;
			case Id_removeAnnotation:
				 removeAnnotation(cx, thisObj, args);
				return Undefined.instance;
			case Id_removeRoute:
				 removeRoute(cx, thisObj, args);
				return Undefined.instance;
			case Id_getLatitudeDelta:
				return getLatitudeDelta(cx, thisObj, args);
				
			case Id_addAnnotation:
				 addAnnotation(cx, thisObj, args);
				return Undefined.instance;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_latitudeDelta = 1
		,		
		Id_longitudeDelta = 2
		;

	// Property accessor IDs
	private static final int

		Id_animate = 3
		,		
		Id_annotations = 4
		,		
		Id_mapType = 5
		,		
		Id_region = 6
		,		
		Id_regionFit = 7
		,		
		Id_userLocation = 8
		,		
		Id_hideAnnotationWhenTouchMap = 9
		;

;

	public static final int MAX_INSTANCE_ID = 9;

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
            L: switch (s.length()) {
            case 6: X="region";id=Id_region; break L;
            case 7: c=s.charAt(0);
                if (c=='a') { X="animate";id=Id_animate; }
                else if (c=='m') { X="mapType";id=Id_mapType; }
                break L;
            case 9: X="regionFit";id=Id_regionFit; break L;
            case 11: X="annotations";id=Id_annotations; break L;
            case 12: X="userLocation";id=Id_userLocation; break L;
            case 13: X="latitudeDelta";id=Id_latitudeDelta; break L;
            case 14: X="longitudeDelta";id=Id_longitudeDelta; break L;
            case 26: X="hideAnnotationWhenTouchMap";id=Id_hideAnnotationWhenTouchMap; break L;
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
			case Id_latitudeDelta:
				return "latitudeDelta"; 
			case Id_longitudeDelta:
				return "longitudeDelta"; 
			case Id_animate:
				return "animate";
			case Id_annotations:
				return "annotations";
			case Id_mapType:
				return "mapType";
			case Id_region:
				return "region";
			case Id_regionFit:
				return "regionFit";
			case Id_userLocation:
				return "userLocation";
			case Id_hideAnnotationWhenTouchMap:
				return "hideAnnotationWhenTouchMap";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof ViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ViewProxyPrototype) {
			proxy = (ViewProxyPrototype) start;
		}

		switch (id) {
			case Id_latitudeDelta:
				return proxy.getter_latitudeDelta();
			case Id_longitudeDelta:
				return proxy.getter_longitudeDelta();
			case Id_animate:
				return proxy.getProperty("animate");
			case Id_annotations:
				return proxy.getProperty("annotations");
			case Id_mapType:
				return proxy.getProperty("mapType");
			case Id_region:
				return proxy.getProperty("region");
			case Id_regionFit:
				return proxy.getProperty("regionFit");
			case Id_userLocation:
				return proxy.getProperty("userLocation");
			case Id_hideAnnotationWhenTouchMap:
				return proxy.getProperty("hideAnnotationWhenTouchMap");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof ViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ViewProxyPrototype) {
			proxy = (ViewProxyPrototype) start;
		}

		switch (id) {
			case Id_latitudeDelta:
				proxy.setProperty("latitudeDelta", value);
				proxy.onPropertyChanged("latitudeDelta", value);
				break; 
			case Id_longitudeDelta:
				proxy.setProperty("longitudeDelta", value);
				proxy.onPropertyChanged("longitudeDelta", value);
				break; 
			case Id_animate:
				proxy.setProperty("animate", value);
				proxy.onPropertyChanged("animate", value);
				break;
			case Id_annotations:
				proxy.setProperty("annotations", value);
				proxy.onPropertyChanged("annotations", value);
				break;
			case Id_mapType:
				proxy.setProperty("mapType", value);
				proxy.onPropertyChanged("mapType", value);
				break;
			case Id_region:
				proxy.setProperty("region", value);
				proxy.onPropertyChanged("region", value);
				break;
			case Id_regionFit:
				proxy.setProperty("regionFit", value);
				proxy.onPropertyChanged("regionFit", value);
				break;
			case Id_userLocation:
				proxy.setProperty("userLocation", value);
				proxy.onPropertyChanged("userLocation", value);
				break;
			case Id_hideAnnotationWhenTouchMap:
				proxy.setProperty("hideAnnotationWhenTouchMap", value);
				proxy.onPropertyChanged("hideAnnotationWhenTouchMap", value);
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
