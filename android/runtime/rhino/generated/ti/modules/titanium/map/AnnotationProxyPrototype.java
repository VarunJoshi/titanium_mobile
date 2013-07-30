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

import ti.modules.titanium.map.AnnotationProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class AnnotationProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -8169480956740656688L;

	private static final String TAG = "AnnotationProxyPrototype";
	private static final String CLASS_TAG = "AnnotationProxy";
	private static AnnotationProxyPrototype annotationProxyPrototype;


	public static AnnotationProxyPrototype getProxyPrototype()
	{
		return annotationProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		annotationProxyPrototype = null;
	}

	public AnnotationProxyPrototype()
	{
		if (annotationProxyPrototype == null && getClass().equals(AnnotationProxyPrototype.class)) {
			annotationProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == annotationProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return annotationProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(AnnotationProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getAnimate = 2,
		Id_setAnimate = 3,
		Id_getImage = 4,
		Id_setImage = 5,
		Id_getLeftButton = 6,
		Id_setLeftButton = 7,
		Id_getLeftView = 8,
		Id_setLeftView = 9,
		Id_getPinImage = 10,
		Id_setPinImage = 11,
		Id_getPincolor = 12,
		Id_setPincolor = 13,
		Id_getRightImage = 14,
		Id_setRightImage = 15,
		Id_getRightView = 16,
		Id_setRightView = 17,
		Id_getRightButton = 18,
		Id_setRightButton = 19,
		Id_getSubtitle = 20,
		Id_setSubtitle = 21,
		Id_getSubtitleid = 22,
		Id_setSubtitleid = 23,
		Id_getTitle = 24,
		Id_setTitle = 25,
		Id_getTitleid = 26,
		Id_setTitleid = 27,
		Id_getLatitude = 28,
		Id_setLatitude = 29,
		Id_getLongitude = 30,
		Id_setLongitude = 31
		// Method IDs
;
		

	public static final int MAX_PROTOTYPE_ID = 31;

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
                if (c=='g') {
                    c=s.charAt(3);
                    if (c=='I') { X="getImage";id=Id_getImage; }
                    else if (c=='T') { X="getTitle";id=Id_getTitle; }
                }
                else if (c=='s') {
                    c=s.charAt(3);
                    if (c=='I') { X="setImage";id=Id_setImage; }
                    else if (c=='T') { X="setTitle";id=Id_setTitle; }
                }
                break L;
            case 10: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(9);
                    if (c=='d') { X="getTitleid";id=Id_getTitleid; }
                    else if (c=='e') { X="getAnimate";id=Id_getAnimate; }
                }
                else if (c=='s') {
                    c=s.charAt(9);
                    if (c=='d') { X="setTitleid";id=Id_setTitleid; }
                    else if (c=='e') { X="setAnimate";id=Id_setAnimate; }
                }
                break L;
            case 11: switch (s.charAt(7)) {
                case 'V': c=s.charAt(0);
                    if (c=='g') { X="getLeftView";id=Id_getLeftView; }
                    else if (c=='s') { X="setLeftView";id=Id_setLeftView; }
                    break L;
                case 'c': X="constructor";id=Id_constructor; break L;
                case 'i': c=s.charAt(0);
                    if (c=='g') { X="getSubtitle";id=Id_getSubtitle; }
                    else if (c=='s') { X="setSubtitle";id=Id_setSubtitle; }
                    break L;
                case 'm': c=s.charAt(0);
                    if (c=='g') { X="getPinImage";id=Id_getPinImage; }
                    else if (c=='s') { X="setPinImage";id=Id_setPinImage; }
                    break L;
                case 'o': c=s.charAt(0);
                    if (c=='g') { X="getPincolor";id=Id_getPincolor; }
                    else if (c=='s') { X="setPincolor";id=Id_setPincolor; }
                    break L;
                case 't': c=s.charAt(0);
                    if (c=='g') { X="getLatitude";id=Id_getLatitude; }
                    else if (c=='s') { X="setLatitude";id=Id_setLatitude; }
                    break L;
                } break L;
            case 12: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(11);
                    if (c=='e') { X="getLongitude";id=Id_getLongitude; }
                    else if (c=='w') { X="getRightView";id=Id_getRightView; }
                }
                else if (c=='s') {
                    c=s.charAt(11);
                    if (c=='e') { X="setLongitude";id=Id_setLongitude; }
                    else if (c=='w') { X="setRightView";id=Id_setRightView; }
                }
                break L;
            case 13: c=s.charAt(3);
                if (c=='L') {
                    c=s.charAt(0);
                    if (c=='g') { X="getLeftButton";id=Id_getLeftButton; }
                    else if (c=='s') { X="setLeftButton";id=Id_setLeftButton; }
                }
                else if (c=='R') {
                    c=s.charAt(0);
                    if (c=='g') { X="getRightImage";id=Id_getRightImage; }
                    else if (c=='s') { X="setRightImage";id=Id_setRightImage; }
                }
                else if (c=='S') {
                    c=s.charAt(0);
                    if (c=='g') { X="getSubtitleid";id=Id_getSubtitleid; }
                    else if (c=='s') { X="setSubtitleid";id=Id_setSubtitleid; }
                }
                break L;
            case 14: c=s.charAt(0);
                if (c=='g') { X="getRightButton";id=Id_getRightButton; }
                else if (c=='s') { X="setRightButton";id=Id_setRightButton; }
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
			case Id_getImage:
				arity = 0;
				name = "getImage";
				break;
			case Id_setImage:
				arity = 1;
				name = "setImage";
				break;
			case Id_getLeftButton:
				arity = 0;
				name = "getLeftButton";
				break;
			case Id_setLeftButton:
				arity = 1;
				name = "setLeftButton";
				break;
			case Id_getLeftView:
				arity = 0;
				name = "getLeftView";
				break;
			case Id_setLeftView:
				arity = 1;
				name = "setLeftView";
				break;
			case Id_getPinImage:
				arity = 0;
				name = "getPinImage";
				break;
			case Id_setPinImage:
				arity = 1;
				name = "setPinImage";
				break;
			case Id_getPincolor:
				arity = 0;
				name = "getPincolor";
				break;
			case Id_setPincolor:
				arity = 1;
				name = "setPincolor";
				break;
			case Id_getRightImage:
				arity = 0;
				name = "getRightImage";
				break;
			case Id_setRightImage:
				arity = 1;
				name = "setRightImage";
				break;
			case Id_getRightView:
				arity = 0;
				name = "getRightView";
				break;
			case Id_setRightView:
				arity = 1;
				name = "setRightView";
				break;
			case Id_getRightButton:
				arity = 0;
				name = "getRightButton";
				break;
			case Id_setRightButton:
				arity = 1;
				name = "setRightButton";
				break;
			case Id_getSubtitle:
				arity = 0;
				name = "getSubtitle";
				break;
			case Id_setSubtitle:
				arity = 1;
				name = "setSubtitle";
				break;
			case Id_getSubtitleid:
				arity = 0;
				name = "getSubtitleid";
				break;
			case Id_setSubtitleid:
				arity = 1;
				name = "setSubtitleid";
				break;
			case Id_getTitle:
				arity = 0;
				name = "getTitle";
				break;
			case Id_setTitle:
				arity = 1;
				name = "setTitle";
				break;
			case Id_getTitleid:
				arity = 0;
				name = "getTitleid";
				break;
			case Id_setTitleid:
				arity = 1;
				name = "setTitleid";
				break;
			case Id_getLatitude:
				arity = 0;
				name = "getLatitude";
				break;
			case Id_setLatitude:
				arity = 1;
				name = "setLatitude";
				break;
			case Id_getLongitude:
				arity = 0;
				name = "getLongitude";
				break;
			case Id_setLongitude:
				arity = 1;
				name = "setLongitude";
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

		while (thisObj != null && !(thisObj instanceof AnnotationProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		AnnotationProxyPrototype proxy = (AnnotationProxyPrototype) thisObj;
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
			case Id_getImage:
				return proxy.getProperty("image");
			case Id_setImage:
				proxy.setProperty("image", args[0]);
				proxy.onPropertyChanged("image", args[0]);
				return Undefined.instance;
			case Id_getLeftButton:
				return proxy.getProperty("leftButton");
			case Id_setLeftButton:
				proxy.setProperty("leftButton", args[0]);
				proxy.onPropertyChanged("leftButton", args[0]);
				return Undefined.instance;
			case Id_getLeftView:
				return proxy.getProperty("leftView");
			case Id_setLeftView:
				proxy.setProperty("leftView", args[0]);
				proxy.onPropertyChanged("leftView", args[0]);
				return Undefined.instance;
			case Id_getPinImage:
				return proxy.getProperty("pinImage");
			case Id_setPinImage:
				proxy.setProperty("pinImage", args[0]);
				proxy.onPropertyChanged("pinImage", args[0]);
				return Undefined.instance;
			case Id_getPincolor:
				return proxy.getProperty("pincolor");
			case Id_setPincolor:
				proxy.setProperty("pincolor", args[0]);
				proxy.onPropertyChanged("pincolor", args[0]);
				return Undefined.instance;
			case Id_getRightImage:
				return proxy.getProperty("rightImage");
			case Id_setRightImage:
				proxy.setProperty("rightImage", args[0]);
				proxy.onPropertyChanged("rightImage", args[0]);
				return Undefined.instance;
			case Id_getRightView:
				return proxy.getProperty("rightView");
			case Id_setRightView:
				proxy.setProperty("rightView", args[0]);
				proxy.onPropertyChanged("rightView", args[0]);
				return Undefined.instance;
			case Id_getRightButton:
				return proxy.getProperty("rightButton");
			case Id_setRightButton:
				proxy.setProperty("rightButton", args[0]);
				proxy.onPropertyChanged("rightButton", args[0]);
				return Undefined.instance;
			case Id_getSubtitle:
				return proxy.getProperty("subtitle");
			case Id_setSubtitle:
				proxy.setProperty("subtitle", args[0]);
				proxy.onPropertyChanged("subtitle", args[0]);
				return Undefined.instance;
			case Id_getSubtitleid:
				return proxy.getProperty("subtitleid");
			case Id_setSubtitleid:
				proxy.setProperty("subtitleid", args[0]);
				proxy.onPropertyChanged("subtitleid", args[0]);
				return Undefined.instance;
			case Id_getTitle:
				return proxy.getProperty("title");
			case Id_setTitle:
				proxy.setProperty("title", args[0]);
				proxy.onPropertyChanged("title", args[0]);
				return Undefined.instance;
			case Id_getTitleid:
				return proxy.getProperty("titleid");
			case Id_setTitleid:
				proxy.setProperty("titleid", args[0]);
				proxy.onPropertyChanged("titleid", args[0]);
				return Undefined.instance;
			case Id_getLatitude:
				return proxy.getProperty("latitude");
			case Id_setLatitude:
				proxy.setProperty("latitude", args[0]);
				proxy.onPropertyChanged("latitude", args[0]);
				return Undefined.instance;
			case Id_getLongitude:
				return proxy.getProperty("longitude");
			case Id_setLongitude:
				proxy.setProperty("longitude", args[0]);
				proxy.onPropertyChanged("longitude", args[0]);
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

		Id_animate = 1
		,		
		Id_image = 2
		,		
		Id_leftButton = 3
		,		
		Id_leftView = 4
		,		
		Id_pinImage = 5
		,		
		Id_pincolor = 6
		,		
		Id_rightImage = 7
		,		
		Id_rightView = 8
		,		
		Id_rightButton = 9
		,		
		Id_subtitle = 10
		,		
		Id_subtitleid = 11
		,		
		Id_title = 12
		,		
		Id_titleid = 13
		,		
		Id_latitude = 14
		,		
		Id_longitude = 15
		;

;

	public static final int MAX_INSTANCE_ID = 15;

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
            case 5: c=s.charAt(0);
                if (c=='i') { X="image";id=Id_image; }
                else if (c=='t') { X="title";id=Id_title; }
                break L;
            case 7: c=s.charAt(0);
                if (c=='a') { X="animate";id=Id_animate; }
                else if (c=='t') { X="titleid";id=Id_titleid; }
                break L;
            case 8: switch (s.charAt(4)) {
                case 'V': X="leftView";id=Id_leftView; break L;
                case 'i': X="subtitle";id=Id_subtitle; break L;
                case 'm': X="pinImage";id=Id_pinImage; break L;
                case 'o': X="pincolor";id=Id_pincolor; break L;
                case 't': X="latitude";id=Id_latitude; break L;
                } break L;
            case 9: c=s.charAt(0);
                if (c=='l') { X="longitude";id=Id_longitude; }
                else if (c=='r') { X="rightView";id=Id_rightView; }
                break L;
            case 10: c=s.charAt(0);
                if (c=='l') { X="leftButton";id=Id_leftButton; }
                else if (c=='r') { X="rightImage";id=Id_rightImage; }
                else if (c=='s') { X="subtitleid";id=Id_subtitleid; }
                break L;
            case 11: X="rightButton";id=Id_rightButton; break L;
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
			case Id_animate:
				return "animate";
			case Id_image:
				return "image";
			case Id_leftButton:
				return "leftButton";
			case Id_leftView:
				return "leftView";
			case Id_pinImage:
				return "pinImage";
			case Id_pincolor:
				return "pincolor";
			case Id_rightImage:
				return "rightImage";
			case Id_rightView:
				return "rightView";
			case Id_rightButton:
				return "rightButton";
			case Id_subtitle:
				return "subtitle";
			case Id_subtitleid:
				return "subtitleid";
			case Id_title:
				return "title";
			case Id_titleid:
				return "titleid";
			case Id_latitude:
				return "latitude";
			case Id_longitude:
				return "longitude";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		AnnotationProxyPrototype proxy = this;
		while (start != null && !(start instanceof AnnotationProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AnnotationProxyPrototype) {
			proxy = (AnnotationProxyPrototype) start;
		}

		switch (id) {
			case Id_animate:
				return proxy.getProperty("animate");
			case Id_image:
				return proxy.getProperty("image");
			case Id_leftButton:
				return proxy.getProperty("leftButton");
			case Id_leftView:
				return proxy.getProperty("leftView");
			case Id_pinImage:
				return proxy.getProperty("pinImage");
			case Id_pincolor:
				return proxy.getProperty("pincolor");
			case Id_rightImage:
				return proxy.getProperty("rightImage");
			case Id_rightView:
				return proxy.getProperty("rightView");
			case Id_rightButton:
				return proxy.getProperty("rightButton");
			case Id_subtitle:
				return proxy.getProperty("subtitle");
			case Id_subtitleid:
				return proxy.getProperty("subtitleid");
			case Id_title:
				return proxy.getProperty("title");
			case Id_titleid:
				return proxy.getProperty("titleid");
			case Id_latitude:
				return proxy.getProperty("latitude");
			case Id_longitude:
				return proxy.getProperty("longitude");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		AnnotationProxyPrototype proxy = this;
		while (start != null && !(start instanceof AnnotationProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AnnotationProxyPrototype) {
			proxy = (AnnotationProxyPrototype) start;
		}

		switch (id) {
			case Id_animate:
				proxy.setProperty("animate", value);
				proxy.onPropertyChanged("animate", value);
				break;
			case Id_image:
				proxy.setProperty("image", value);
				proxy.onPropertyChanged("image", value);
				break;
			case Id_leftButton:
				proxy.setProperty("leftButton", value);
				proxy.onPropertyChanged("leftButton", value);
				break;
			case Id_leftView:
				proxy.setProperty("leftView", value);
				proxy.onPropertyChanged("leftView", value);
				break;
			case Id_pinImage:
				proxy.setProperty("pinImage", value);
				proxy.onPropertyChanged("pinImage", value);
				break;
			case Id_pincolor:
				proxy.setProperty("pincolor", value);
				proxy.onPropertyChanged("pincolor", value);
				break;
			case Id_rightImage:
				proxy.setProperty("rightImage", value);
				proxy.onPropertyChanged("rightImage", value);
				break;
			case Id_rightView:
				proxy.setProperty("rightView", value);
				proxy.onPropertyChanged("rightView", value);
				break;
			case Id_rightButton:
				proxy.setProperty("rightButton", value);
				proxy.onPropertyChanged("rightButton", value);
				break;
			case Id_subtitle:
				proxy.setProperty("subtitle", value);
				proxy.onPropertyChanged("subtitle", value);
				break;
			case Id_subtitleid:
				proxy.setProperty("subtitleid", value);
				proxy.onPropertyChanged("subtitleid", value);
				break;
			case Id_title:
				proxy.setProperty("title", value);
				proxy.onPropertyChanged("title", value);
				break;
			case Id_titleid:
				proxy.setProperty("titleid", value);
				proxy.onPropertyChanged("titleid", value);
				break;
			case Id_latitude:
				proxy.setProperty("latitude", value);
				proxy.onPropertyChanged("latitude", value);
				break;
			case Id_longitude:
				proxy.setProperty("longitude", value);
				proxy.onPropertyChanged("longitude", value);
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
