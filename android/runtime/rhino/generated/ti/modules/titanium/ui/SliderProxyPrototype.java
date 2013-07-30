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

import ti.modules.titanium.ui.SliderProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class SliderProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = -1388938154595087276L;

	private static final String TAG = "SliderProxyPrototype";
	private static final String CLASS_TAG = "SliderProxy";
	private static SliderProxyPrototype sliderProxyPrototype;


	public static SliderProxyPrototype getProxyPrototype()
	{
		return sliderProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		sliderProxyPrototype = null;
	}

	public SliderProxyPrototype()
	{
		if (sliderProxyPrototype == null && getClass().equals(SliderProxyPrototype.class)) {
			sliderProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == sliderProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return sliderProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(SliderProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getMin = 2,
		Id_setMin = 3,
		Id_getMax = 4,
		Id_setMax = 5,
		Id_getMinRange = 6,
		Id_setMinRange = 7,
		Id_getMaxRange = 8,
		Id_setMaxRange = 9,
		Id_getThumbImage = 10,
		Id_setThumbImage = 11,
		Id_getLeftTrackImage = 12,
		Id_setLeftTrackImage = 13,
		Id_getRightTrackImage = 14,
		Id_setRightTrackImage = 15,
		Id_getValue = 16,
		Id_setValue = 17
		// Method IDs
;
		

	public static final int MAX_PROTOTYPE_ID = 17;

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
            L: switch (s.length()) {
            case 6: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(5);
                    if (c=='n') { X="getMin";id=Id_getMin; }
                    else if (c=='x') { X="getMax";id=Id_getMax; }
                }
                else if (c=='s') {
                    c=s.charAt(5);
                    if (c=='n') { X="setMin";id=Id_setMin; }
                    else if (c=='x') { X="setMax";id=Id_setMax; }
                }
                break L;
            case 8: c=s.charAt(0);
                if (c=='g') { X="getValue";id=Id_getValue; }
                else if (c=='s') { X="setValue";id=Id_setValue; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') {
                    c=s.charAt(4);
                    if (c=='a') { X="getMaxRange";id=Id_getMaxRange; }
                    else if (c=='i') { X="getMinRange";id=Id_getMinRange; }
                }
                else if (c=='s') {
                    c=s.charAt(4);
                    if (c=='a') { X="setMaxRange";id=Id_setMaxRange; }
                    else if (c=='i') { X="setMinRange";id=Id_setMinRange; }
                }
                break L;
            case 13: c=s.charAt(0);
                if (c=='g') { X="getThumbImage";id=Id_getThumbImage; }
                else if (c=='s') { X="setThumbImage";id=Id_setThumbImage; }
                break L;
            case 17: c=s.charAt(0);
                if (c=='g') { X="getLeftTrackImage";id=Id_getLeftTrackImage; }
                else if (c=='s') { X="setLeftTrackImage";id=Id_setLeftTrackImage; }
                break L;
            case 18: c=s.charAt(0);
                if (c=='g') { X="getRightTrackImage";id=Id_getRightTrackImage; }
                else if (c=='s') { X="setRightTrackImage";id=Id_setRightTrackImage; }
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
			case Id_getMin:
				arity = 0;
				name = "getMin";
				break;
			case Id_setMin:
				arity = 1;
				name = "setMin";
				break;
			case Id_getMax:
				arity = 0;
				name = "getMax";
				break;
			case Id_setMax:
				arity = 1;
				name = "setMax";
				break;
			case Id_getMinRange:
				arity = 0;
				name = "getMinRange";
				break;
			case Id_setMinRange:
				arity = 1;
				name = "setMinRange";
				break;
			case Id_getMaxRange:
				arity = 0;
				name = "getMaxRange";
				break;
			case Id_setMaxRange:
				arity = 1;
				name = "setMaxRange";
				break;
			case Id_getThumbImage:
				arity = 0;
				name = "getThumbImage";
				break;
			case Id_setThumbImage:
				arity = 1;
				name = "setThumbImage";
				break;
			case Id_getLeftTrackImage:
				arity = 0;
				name = "getLeftTrackImage";
				break;
			case Id_setLeftTrackImage:
				arity = 1;
				name = "setLeftTrackImage";
				break;
			case Id_getRightTrackImage:
				arity = 0;
				name = "getRightTrackImage";
				break;
			case Id_setRightTrackImage:
				arity = 1;
				name = "setRightTrackImage";
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

		while (thisObj != null && !(thisObj instanceof SliderProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		SliderProxyPrototype proxy = (SliderProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getMin:
				return proxy.getProperty("min");
			case Id_setMin:
				proxy.setProperty("min", args[0]);
				proxy.onPropertyChanged("min", args[0]);
				return Undefined.instance;
			case Id_getMax:
				return proxy.getProperty("max");
			case Id_setMax:
				proxy.setProperty("max", args[0]);
				proxy.onPropertyChanged("max", args[0]);
				return Undefined.instance;
			case Id_getMinRange:
				return proxy.getProperty("minRange");
			case Id_setMinRange:
				proxy.setProperty("minRange", args[0]);
				proxy.onPropertyChanged("minRange", args[0]);
				return Undefined.instance;
			case Id_getMaxRange:
				return proxy.getProperty("maxRange");
			case Id_setMaxRange:
				proxy.setProperty("maxRange", args[0]);
				proxy.onPropertyChanged("maxRange", args[0]);
				return Undefined.instance;
			case Id_getThumbImage:
				return proxy.getProperty("thumbImage");
			case Id_setThumbImage:
				proxy.setProperty("thumbImage", args[0]);
				proxy.onPropertyChanged("thumbImage", args[0]);
				return Undefined.instance;
			case Id_getLeftTrackImage:
				return proxy.getProperty("leftTrackImage");
			case Id_setLeftTrackImage:
				proxy.setProperty("leftTrackImage", args[0]);
				proxy.onPropertyChanged("leftTrackImage", args[0]);
				return Undefined.instance;
			case Id_getRightTrackImage:
				return proxy.getProperty("rightTrackImage");
			case Id_setRightTrackImage:
				proxy.setProperty("rightTrackImage", args[0]);
				proxy.onPropertyChanged("rightTrackImage", args[0]);
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

		Id_min = 1
		,		
		Id_max = 2
		,		
		Id_minRange = 3
		,		
		Id_maxRange = 4
		,		
		Id_thumbImage = 5
		,		
		Id_leftTrackImage = 6
		,		
		Id_rightTrackImage = 7
		,		
		Id_value = 8
		;

;

	public static final int MAX_INSTANCE_ID = 8;

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
            L: switch (s.length()) {
            case 3: c=s.charAt(1);
                if (c=='a') { if (s.charAt(0)=='m' && s.charAt(2)=='x') {id=Id_max; break L0;} }
                else if (c=='i') { if (s.charAt(0)=='m' && s.charAt(2)=='n') {id=Id_min; break L0;} }
                break L;
            case 5: X="value";id=Id_value; break L;
            case 8: c=s.charAt(1);
                if (c=='a') { X="maxRange";id=Id_maxRange; }
                else if (c=='i') { X="minRange";id=Id_minRange; }
                break L;
            case 10: X="thumbImage";id=Id_thumbImage; break L;
            case 14: X="leftTrackImage";id=Id_leftTrackImage; break L;
            case 15: X="rightTrackImage";id=Id_rightTrackImage; break L;
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
			case Id_min:
				return "min";
			case Id_max:
				return "max";
			case Id_minRange:
				return "minRange";
			case Id_maxRange:
				return "maxRange";
			case Id_thumbImage:
				return "thumbImage";
			case Id_leftTrackImage:
				return "leftTrackImage";
			case Id_rightTrackImage:
				return "rightTrackImage";
			case Id_value:
				return "value";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		SliderProxyPrototype proxy = this;
		while (start != null && !(start instanceof SliderProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof SliderProxyPrototype) {
			proxy = (SliderProxyPrototype) start;
		}

		switch (id) {
			case Id_min:
				return proxy.getProperty("min");
			case Id_max:
				return proxy.getProperty("max");
			case Id_minRange:
				return proxy.getProperty("minRange");
			case Id_maxRange:
				return proxy.getProperty("maxRange");
			case Id_thumbImage:
				return proxy.getProperty("thumbImage");
			case Id_leftTrackImage:
				return proxy.getProperty("leftTrackImage");
			case Id_rightTrackImage:
				return proxy.getProperty("rightTrackImage");
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
		SliderProxyPrototype proxy = this;
		while (start != null && !(start instanceof SliderProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof SliderProxyPrototype) {
			proxy = (SliderProxyPrototype) start;
		}

		switch (id) {
			case Id_min:
				proxy.setProperty("min", value);
				proxy.onPropertyChanged("min", value);
				break;
			case Id_max:
				proxy.setProperty("max", value);
				proxy.onPropertyChanged("max", value);
				break;
			case Id_minRange:
				proxy.setProperty("minRange", value);
				proxy.onPropertyChanged("minRange", value);
				break;
			case Id_maxRange:
				proxy.setProperty("maxRange", value);
				proxy.onPropertyChanged("maxRange", value);
				break;
			case Id_thumbImage:
				proxy.setProperty("thumbImage", value);
				proxy.onPropertyChanged("thumbImage", value);
				break;
			case Id_leftTrackImage:
				proxy.setProperty("leftTrackImage", value);
				proxy.onPropertyChanged("leftTrackImage", value);
				break;
			case Id_rightTrackImage:
				proxy.setProperty("rightTrackImage", value);
				proxy.onPropertyChanged("rightTrackImage", value);
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
