/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.geolocation;

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

import ti.modules.titanium.geolocation.GeolocationModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class GeolocationModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = -5481442383152077034L;

	private static final String TAG = "GeolocationModulePrototype";
	private static final String CLASS_TAG = "GeolocationModule";
	private static GeolocationModulePrototype geolocationModulePrototype;

	// Lazy loaded child APIs
	private Object API_Android = null;

	public static GeolocationModulePrototype getProxyPrototype()
	{
		return geolocationModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		geolocationModulePrototype = null;
	}

	public GeolocationModulePrototype()
	{
		if (geolocationModulePrototype == null && getClass().equals(GeolocationModulePrototype.class)) {
			geolocationModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("ACCURACY_LOW", this, 0);


			putConst("ACCURACY_HUNDRED_METERS", this, 4);


			putConst("PROVIDER_PASSIVE", this, "passive");


			putConst("ACCURACY_THREE_KILOMETERS", this, 6);


			putConst("PROVIDER_NETWORK", this, "network");


			putConst("ACCURACY_NEAREST_TEN_METERS", this, 3);


			putConst("ACCURACY_HIGH", this, 1);


			putConst("ACCURACY_KILOMETER", this, 5);


			putConst("PROVIDER_GPS", this, "gps");


			putConst("ACCURACY_BEST", this, 2);

	}

	public Scriptable getPrototype()
	{
		if (this == geolocationModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return geolocationModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(GeolocationModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void getCurrentHeading(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getCurrentHeading()", Log.DEBUG_MODE);

		try {
		GeolocationModule proxy = (GeolocationModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getCurrentHeading: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollFunction arg0;
		arg0 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.getCurrentHeading(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void reverseGeocoder(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "reverseGeocoder()", Log.DEBUG_MODE);

		try {
		GeolocationModule proxy = (GeolocationModule) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("reverseGeocoder: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		double arg0;
		arg0 = (double) TypeConverter.jsObjectToJavaDouble(args[0], thisObj) ;
		double arg1;
		arg1 = (double) TypeConverter.jsObjectToJavaDouble(args[1], thisObj) ;
		org.appcelerator.kroll.KrollFunction arg2;
		arg2 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[2], thisObj) ;

		proxy.reverseGeocoder(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void forwardGeocoder(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "forwardGeocoder()", Log.DEBUG_MODE);

		try {
		GeolocationModule proxy = (GeolocationModule) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("forwardGeocoder: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		org.appcelerator.kroll.KrollFunction arg1;
		arg1 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;

		proxy.forwardGeocoder(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getHasCompass(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getHasCompass()", Log.DEBUG_MODE);

		try {
		GeolocationModule proxy = (GeolocationModule) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getHasCompass();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getLocationServicesEnabled(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLocationServicesEnabled()", Log.DEBUG_MODE);

		try {
		GeolocationModule proxy = (GeolocationModule) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getLocationServicesEnabled();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void getCurrentPosition(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getCurrentPosition()", Log.DEBUG_MODE);

		try {
		GeolocationModule proxy = (GeolocationModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getCurrentPosition: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollFunction arg0;
		arg0 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.getCurrentPosition(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Boolean getter_hasCompass()
	{
		Log.d(TAG, "get hasCompass", Log.DEBUG_MODE);
		GeolocationModule proxy = (GeolocationModule) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getHasCompass();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public Boolean getter_locationServicesEnabled()
	{
		Log.d(TAG, "get locationServicesEnabled", Log.DEBUG_MODE);
		GeolocationModule proxy = (GeolocationModule) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getLocationServicesEnabled();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getAccuracy = 2,
		Id_setAccuracy = 3,
		Id_getFrequency = 4,
		Id_setFrequency = 5,
		Id_getPreferredProvider = 6,
		Id_setPreferredProvider = 7,
		// Method IDs
		Id_getCurrentHeading = 8,
		Id_reverseGeocoder = 9,
		Id_forwardGeocoder = 10,
		Id_getHasCompass = 11,
		Id_getLocationServicesEnabled = 12,
		Id_getCurrentPosition = 13
;
		

	public static final int MAX_PROTOTYPE_ID = 13;

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
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') { X="getAccuracy";id=Id_getAccuracy; }
                else if (c=='s') { X="setAccuracy";id=Id_setAccuracy; }
                break L;
            case 12: c=s.charAt(0);
                if (c=='g') { X="getFrequency";id=Id_getFrequency; }
                else if (c=='s') { X="setFrequency";id=Id_setFrequency; }
                break L;
            case 13: X="getHasCompass";id=Id_getHasCompass; break L;
            case 15: c=s.charAt(0);
                if (c=='f') { X="forwardGeocoder";id=Id_forwardGeocoder; }
                else if (c=='r') { X="reverseGeocoder";id=Id_reverseGeocoder; }
                break L;
            case 17: X="getCurrentHeading";id=Id_getCurrentHeading; break L;
            case 18: X="getCurrentPosition";id=Id_getCurrentPosition; break L;
            case 20: c=s.charAt(0);
                if (c=='g') { X="getPreferredProvider";id=Id_getPreferredProvider; }
                else if (c=='s') { X="setPreferredProvider";id=Id_setPreferredProvider; }
                break L;
            case 26: X="getLocationServicesEnabled";id=Id_getLocationServicesEnabled; break L;
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
			case Id_getAccuracy:
				arity = 0;
				name = "getAccuracy";
				break;
			case Id_setAccuracy:
				arity = 1;
				name = "setAccuracy";
				break;
			case Id_getFrequency:
				arity = 0;
				name = "getFrequency";
				break;
			case Id_setFrequency:
				arity = 1;
				name = "setFrequency";
				break;
			case Id_getPreferredProvider:
				arity = 0;
				name = "getPreferredProvider";
				break;
			case Id_setPreferredProvider:
				arity = 1;
				name = "setPreferredProvider";
				break;
			case Id_getCurrentHeading:
				arity = 1;
				name = "getCurrentHeading";
				break;
			case Id_reverseGeocoder:
				arity = 3;
				name = "reverseGeocoder";
				break;
			case Id_forwardGeocoder:
				arity = 2;
				name = "forwardGeocoder";
				break;
			case Id_getHasCompass:
				arity = 0;
				name = "getHasCompass";
				break;
			case Id_getLocationServicesEnabled:
				arity = 0;
				name = "getLocationServicesEnabled";
				break;
			case Id_getCurrentPosition:
				arity = 1;
				name = "getCurrentPosition";
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

		while (thisObj != null && !(thisObj instanceof GeolocationModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		GeolocationModulePrototype proxy = (GeolocationModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getAccuracy:
				return proxy.getProperty("accuracy");
			case Id_setAccuracy:
				proxy.setProperty("accuracy", args[0]);
				proxy.onPropertyChanged("accuracy", args[0]);
				return Undefined.instance;
			case Id_getFrequency:
				return proxy.getProperty("frequency");
			case Id_setFrequency:
				proxy.setProperty("frequency", args[0]);
				proxy.onPropertyChanged("frequency", args[0]);
				return Undefined.instance;
			case Id_getPreferredProvider:
				return proxy.getProperty("preferredProvider");
			case Id_setPreferredProvider:
				proxy.setProperty("preferredProvider", args[0]);
				proxy.onPropertyChanged("preferredProvider", args[0]);
				return Undefined.instance;
			case Id_getCurrentHeading:
				 getCurrentHeading(cx, thisObj, args);
				return Undefined.instance;
			case Id_reverseGeocoder:
				 reverseGeocoder(cx, thisObj, args);
				return Undefined.instance;
			case Id_forwardGeocoder:
				 forwardGeocoder(cx, thisObj, args);
				return Undefined.instance;
			case Id_getHasCompass:
				return getHasCompass(cx, thisObj, args);
				
			case Id_getLocationServicesEnabled:
				return getLocationServicesEnabled(cx, thisObj, args);
				
			case Id_getCurrentPosition:
				 getCurrentPosition(cx, thisObj, args);
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

		Id_hasCompass = 1
		,		
		Id_locationServicesEnabled = 2
		;

	// Property accessor IDs
	private static final int

		Id_accuracy = 3
		,		
		Id_frequency = 4
		,		
		Id_preferredProvider = 5
		;

	// Child APIs
	private static final int

		Id_Android = 6
		;

	public static final int MAX_INSTANCE_ID = 6;

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
            L: switch (s.length()) {
            case 7: X="Android";id=Id_Android; break L;
            case 8: X="accuracy";id=Id_accuracy; break L;
            case 9: X="frequency";id=Id_frequency; break L;
            case 10: X="hasCompass";id=Id_hasCompass; break L;
            case 17: X="preferredProvider";id=Id_preferredProvider; break L;
            case 23: X="locationServicesEnabled";id=Id_locationServicesEnabled; break L;
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
			case Id_hasCompass:
				return "hasCompass"; 
			case Id_locationServicesEnabled:
				return "locationServicesEnabled"; 
			case Id_accuracy:
				return "accuracy";
			case Id_frequency:
				return "frequency";
			case Id_preferredProvider:
				return "preferredProvider";
			case Id_Android:
				return "Android";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		GeolocationModulePrototype proxy = this;
		while (start != null && !(start instanceof GeolocationModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof GeolocationModulePrototype) {
			proxy = (GeolocationModulePrototype) start;
		}

		switch (id) {
			case Id_hasCompass:
				return proxy.getter_hasCompass();
			case Id_locationServicesEnabled:
				return proxy.getter_locationServicesEnabled();
			case Id_accuracy:
				return proxy.getProperty("accuracy");
			case Id_frequency:
				return proxy.getProperty("frequency");
			case Id_preferredProvider:
				return proxy.getProperty("preferredProvider");
			case Id_Android:
				if (proxy.API_Android == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Android = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.geolocation.android.AndroidModule", ti.modules.titanium.geolocation.android.AndroidModulePrototype.class); 
				}
				return proxy.API_Android;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		GeolocationModulePrototype proxy = this;
		while (start != null && !(start instanceof GeolocationModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof GeolocationModulePrototype) {
			proxy = (GeolocationModulePrototype) start;
		}

		switch (id) {
			case Id_hasCompass:
				proxy.setProperty("hasCompass", value);
				proxy.onPropertyChanged("hasCompass", value);
				break; 
			case Id_locationServicesEnabled:
				proxy.setProperty("locationServicesEnabled", value);
				proxy.onPropertyChanged("locationServicesEnabled", value);
				break; 
			case Id_accuracy:
				proxy.setProperty("accuracy", value);
				proxy.onPropertyChanged("accuracy", value);
				break;
			case Id_frequency:
				proxy.setProperty("frequency", value);
				proxy.onPropertyChanged("frequency", value);
				break;
			case Id_preferredProvider:
				proxy.setProperty("preferredProvider", value);
				proxy.onPropertyChanged("preferredProvider", value);
				break;
			case Id_Android:
				if (value instanceof Proxy) {
					proxy.API_Android = value;
				} else {
					defineProperty(original, "Android", value, 0);
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
