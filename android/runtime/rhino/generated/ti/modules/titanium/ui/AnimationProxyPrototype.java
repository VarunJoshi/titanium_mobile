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

import ti.modules.titanium.ui.AnimationProxy;

import org.appcelerator.titanium.view.TiAnimationPrototype;


public class AnimationProxyPrototype extends TiAnimationPrototype
{
	private static final long serialVersionUID = 1928436983346501640L;

	private static final String TAG = "AnimationProxyPrototype";
	private static final String CLASS_TAG = "AnimationProxy";
	private static AnimationProxyPrototype animationProxyPrototype;


	public static AnimationProxyPrototype getProxyPrototype()
	{
		return animationProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		animationProxyPrototype = null;
	}

	public AnimationProxyPrototype()
	{
		if (animationProxyPrototype == null && getClass().equals(AnimationProxyPrototype.class)) {
			animationProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == animationProxyPrototype) {
			return TiAnimationPrototype.getProxyPrototype();
		}
		return animationProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiAnimationPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(AnimationProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getAnchorPoint = 2,
		Id_setAnchorPoint = 3,
		Id_getTransform = 4,
		Id_setTransform = 5,
		Id_getDelay = 6,
		Id_setDelay = 7,
		Id_getDuration = 8,
		Id_setDuration = 9,
		Id_getOpacity = 10,
		Id_setOpacity = 11,
		Id_getRepeat = 12,
		Id_setRepeat = 13,
		Id_getAutoreverse = 14,
		Id_setAutoreverse = 15,
		Id_getTop = 16,
		Id_setTop = 17,
		Id_getBottom = 18,
		Id_setBottom = 19,
		Id_getLeft = 20,
		Id_setLeft = 21,
		Id_getRight = 22,
		Id_setRight = 23,
		Id_getCenter = 24,
		Id_setCenter = 25,
		Id_getWidth = 26,
		Id_setWidth = 27,
		Id_getHeight = 28,
		Id_setHeight = 29
		// Method IDs
;
		

	public static final int MAX_PROTOTYPE_ID = 29;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 6: c=s.charAt(0);
                if (c=='g') { X="getTop";id=Id_getTop; }
                else if (c=='s') { X="setTop";id=Id_setTop; }
                break L;
            case 7: c=s.charAt(0);
                if (c=='g') { X="getLeft";id=Id_getLeft; }
                else if (c=='s') { X="setLeft";id=Id_setLeft; }
                break L;
            case 8: c=s.charAt(3);
                if (c=='D') {
                    c=s.charAt(0);
                    if (c=='g') { X="getDelay";id=Id_getDelay; }
                    else if (c=='s') { X="setDelay";id=Id_setDelay; }
                }
                else if (c=='R') {
                    c=s.charAt(0);
                    if (c=='g') { X="getRight";id=Id_getRight; }
                    else if (c=='s') { X="setRight";id=Id_setRight; }
                }
                else if (c=='W') {
                    c=s.charAt(0);
                    if (c=='g') { X="getWidth";id=Id_getWidth; }
                    else if (c=='s') { X="setWidth";id=Id_setWidth; }
                }
                break L;
            case 9: switch (s.charAt(3)) {
                case 'B': c=s.charAt(0);
                    if (c=='g') { X="getBottom";id=Id_getBottom; }
                    else if (c=='s') { X="setBottom";id=Id_setBottom; }
                    break L;
                case 'C': c=s.charAt(0);
                    if (c=='g') { X="getCenter";id=Id_getCenter; }
                    else if (c=='s') { X="setCenter";id=Id_setCenter; }
                    break L;
                case 'H': c=s.charAt(0);
                    if (c=='g') { X="getHeight";id=Id_getHeight; }
                    else if (c=='s') { X="setHeight";id=Id_setHeight; }
                    break L;
                case 'R': c=s.charAt(0);
                    if (c=='g') { X="getRepeat";id=Id_getRepeat; }
                    else if (c=='s') { X="setRepeat";id=Id_setRepeat; }
                    break L;
                } break L;
            case 10: c=s.charAt(0);
                if (c=='g') { X="getOpacity";id=Id_getOpacity; }
                else if (c=='s') { X="setOpacity";id=Id_setOpacity; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') { X="getDuration";id=Id_getDuration; }
                else if (c=='s') { X="setDuration";id=Id_setDuration; }
                break L;
            case 12: c=s.charAt(0);
                if (c=='g') { X="getTransform";id=Id_getTransform; }
                else if (c=='s') { X="setTransform";id=Id_setTransform; }
                break L;
            case 14: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(13);
                    if (c=='e') { X="getAutoreverse";id=Id_getAutoreverse; }
                    else if (c=='t') { X="getAnchorPoint";id=Id_getAnchorPoint; }
                }
                else if (c=='s') {
                    c=s.charAt(13);
                    if (c=='e') { X="setAutoreverse";id=Id_setAutoreverse; }
                    else if (c=='t') { X="setAnchorPoint";id=Id_setAnchorPoint; }
                }
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
			case Id_getAnchorPoint:
				arity = 0;
				name = "getAnchorPoint";
				break;
			case Id_setAnchorPoint:
				arity = 1;
				name = "setAnchorPoint";
				break;
			case Id_getTransform:
				arity = 0;
				name = "getTransform";
				break;
			case Id_setTransform:
				arity = 1;
				name = "setTransform";
				break;
			case Id_getDelay:
				arity = 0;
				name = "getDelay";
				break;
			case Id_setDelay:
				arity = 1;
				name = "setDelay";
				break;
			case Id_getDuration:
				arity = 0;
				name = "getDuration";
				break;
			case Id_setDuration:
				arity = 1;
				name = "setDuration";
				break;
			case Id_getOpacity:
				arity = 0;
				name = "getOpacity";
				break;
			case Id_setOpacity:
				arity = 1;
				name = "setOpacity";
				break;
			case Id_getRepeat:
				arity = 0;
				name = "getRepeat";
				break;
			case Id_setRepeat:
				arity = 1;
				name = "setRepeat";
				break;
			case Id_getAutoreverse:
				arity = 0;
				name = "getAutoreverse";
				break;
			case Id_setAutoreverse:
				arity = 1;
				name = "setAutoreverse";
				break;
			case Id_getTop:
				arity = 0;
				name = "getTop";
				break;
			case Id_setTop:
				arity = 1;
				name = "setTop";
				break;
			case Id_getBottom:
				arity = 0;
				name = "getBottom";
				break;
			case Id_setBottom:
				arity = 1;
				name = "setBottom";
				break;
			case Id_getLeft:
				arity = 0;
				name = "getLeft";
				break;
			case Id_setLeft:
				arity = 1;
				name = "setLeft";
				break;
			case Id_getRight:
				arity = 0;
				name = "getRight";
				break;
			case Id_setRight:
				arity = 1;
				name = "setRight";
				break;
			case Id_getCenter:
				arity = 0;
				name = "getCenter";
				break;
			case Id_setCenter:
				arity = 1;
				name = "setCenter";
				break;
			case Id_getWidth:
				arity = 0;
				name = "getWidth";
				break;
			case Id_setWidth:
				arity = 1;
				name = "setWidth";
				break;
			case Id_getHeight:
				arity = 0;
				name = "getHeight";
				break;
			case Id_setHeight:
				arity = 1;
				name = "setHeight";
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

		while (thisObj != null && !(thisObj instanceof AnimationProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		AnimationProxyPrototype proxy = (AnimationProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getAnchorPoint:
				return proxy.getProperty("anchorPoint");
			case Id_setAnchorPoint:
				proxy.setProperty("anchorPoint", args[0]);
				proxy.onPropertyChanged("anchorPoint", args[0]);
				return Undefined.instance;
			case Id_getTransform:
				return proxy.getProperty("transform");
			case Id_setTransform:
				proxy.setProperty("transform", args[0]);
				proxy.onPropertyChanged("transform", args[0]);
				return Undefined.instance;
			case Id_getDelay:
				return proxy.getProperty("delay");
			case Id_setDelay:
				proxy.setProperty("delay", args[0]);
				proxy.onPropertyChanged("delay", args[0]);
				return Undefined.instance;
			case Id_getDuration:
				return proxy.getProperty("duration");
			case Id_setDuration:
				proxy.setProperty("duration", args[0]);
				proxy.onPropertyChanged("duration", args[0]);
				return Undefined.instance;
			case Id_getOpacity:
				return proxy.getProperty("opacity");
			case Id_setOpacity:
				proxy.setProperty("opacity", args[0]);
				proxy.onPropertyChanged("opacity", args[0]);
				return Undefined.instance;
			case Id_getRepeat:
				return proxy.getProperty("repeat");
			case Id_setRepeat:
				proxy.setProperty("repeat", args[0]);
				proxy.onPropertyChanged("repeat", args[0]);
				return Undefined.instance;
			case Id_getAutoreverse:
				return proxy.getProperty("autoreverse");
			case Id_setAutoreverse:
				proxy.setProperty("autoreverse", args[0]);
				proxy.onPropertyChanged("autoreverse", args[0]);
				return Undefined.instance;
			case Id_getTop:
				return proxy.getProperty("top");
			case Id_setTop:
				proxy.setProperty("top", args[0]);
				proxy.onPropertyChanged("top", args[0]);
				return Undefined.instance;
			case Id_getBottom:
				return proxy.getProperty("bottom");
			case Id_setBottom:
				proxy.setProperty("bottom", args[0]);
				proxy.onPropertyChanged("bottom", args[0]);
				return Undefined.instance;
			case Id_getLeft:
				return proxy.getProperty("left");
			case Id_setLeft:
				proxy.setProperty("left", args[0]);
				proxy.onPropertyChanged("left", args[0]);
				return Undefined.instance;
			case Id_getRight:
				return proxy.getProperty("right");
			case Id_setRight:
				proxy.setProperty("right", args[0]);
				proxy.onPropertyChanged("right", args[0]);
				return Undefined.instance;
			case Id_getCenter:
				return proxy.getProperty("center");
			case Id_setCenter:
				proxy.setProperty("center", args[0]);
				proxy.onPropertyChanged("center", args[0]);
				return Undefined.instance;
			case Id_getWidth:
				return proxy.getProperty("width");
			case Id_setWidth:
				proxy.setProperty("width", args[0]);
				proxy.onPropertyChanged("width", args[0]);
				return Undefined.instance;
			case Id_getHeight:
				return proxy.getProperty("height");
			case Id_setHeight:
				proxy.setProperty("height", args[0]);
				proxy.onPropertyChanged("height", args[0]);
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

		Id_anchorPoint = 1
		,		
		Id_transform = 2
		,		
		Id_delay = 3
		,		
		Id_duration = 4
		,		
		Id_opacity = 5
		,		
		Id_repeat = 6
		,		
		Id_autoreverse = 7
		,		
		Id_top = 8
		,		
		Id_bottom = 9
		,		
		Id_left = 10
		,		
		Id_right = 11
		,		
		Id_center = 12
		,		
		Id_width = 13
		,		
		Id_height = 14
		;

;

	public static final int MAX_INSTANCE_ID = 14;

	@Override
	protected int getMaxInstanceId()
	{
		return MAX_INSTANCE_ID;
	}

	@Override
	protected int findInstanceIdInfo(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 3: X="top";id=Id_top; break L;
            case 4: X="left";id=Id_left; break L;
            case 5: c=s.charAt(0);
                if (c=='d') { X="delay";id=Id_delay; }
                else if (c=='r') { X="right";id=Id_right; }
                else if (c=='w') { X="width";id=Id_width; }
                break L;
            case 6: switch (s.charAt(0)) {
                case 'b': X="bottom";id=Id_bottom; break L;
                case 'c': X="center";id=Id_center; break L;
                case 'h': X="height";id=Id_height; break L;
                case 'r': X="repeat";id=Id_repeat; break L;
                } break L;
            case 7: X="opacity";id=Id_opacity; break L;
            case 8: X="duration";id=Id_duration; break L;
            case 9: X="transform";id=Id_transform; break L;
            case 11: c=s.charAt(1);
                if (c=='n') { X="anchorPoint";id=Id_anchorPoint; }
                else if (c=='u') { X="autoreverse";id=Id_autoreverse; }
                break L;
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
			case Id_anchorPoint:
				return "anchorPoint";
			case Id_transform:
				return "transform";
			case Id_delay:
				return "delay";
			case Id_duration:
				return "duration";
			case Id_opacity:
				return "opacity";
			case Id_repeat:
				return "repeat";
			case Id_autoreverse:
				return "autoreverse";
			case Id_top:
				return "top";
			case Id_bottom:
				return "bottom";
			case Id_left:
				return "left";
			case Id_right:
				return "right";
			case Id_center:
				return "center";
			case Id_width:
				return "width";
			case Id_height:
				return "height";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		AnimationProxyPrototype proxy = this;
		while (start != null && !(start instanceof AnimationProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AnimationProxyPrototype) {
			proxy = (AnimationProxyPrototype) start;
		}

		switch (id) {
			case Id_anchorPoint:
				return proxy.getProperty("anchorPoint");
			case Id_transform:
				return proxy.getProperty("transform");
			case Id_delay:
				return proxy.getProperty("delay");
			case Id_duration:
				return proxy.getProperty("duration");
			case Id_opacity:
				return proxy.getProperty("opacity");
			case Id_repeat:
				return proxy.getProperty("repeat");
			case Id_autoreverse:
				return proxy.getProperty("autoreverse");
			case Id_top:
				return proxy.getProperty("top");
			case Id_bottom:
				return proxy.getProperty("bottom");
			case Id_left:
				return proxy.getProperty("left");
			case Id_right:
				return proxy.getProperty("right");
			case Id_center:
				return proxy.getProperty("center");
			case Id_width:
				return proxy.getProperty("width");
			case Id_height:
				return proxy.getProperty("height");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		AnimationProxyPrototype proxy = this;
		while (start != null && !(start instanceof AnimationProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AnimationProxyPrototype) {
			proxy = (AnimationProxyPrototype) start;
		}

		switch (id) {
			case Id_anchorPoint:
				proxy.setProperty("anchorPoint", value);
				proxy.onPropertyChanged("anchorPoint", value);
				break;
			case Id_transform:
				proxy.setProperty("transform", value);
				proxy.onPropertyChanged("transform", value);
				break;
			case Id_delay:
				proxy.setProperty("delay", value);
				proxy.onPropertyChanged("delay", value);
				break;
			case Id_duration:
				proxy.setProperty("duration", value);
				proxy.onPropertyChanged("duration", value);
				break;
			case Id_opacity:
				proxy.setProperty("opacity", value);
				proxy.onPropertyChanged("opacity", value);
				break;
			case Id_repeat:
				proxy.setProperty("repeat", value);
				proxy.onPropertyChanged("repeat", value);
				break;
			case Id_autoreverse:
				proxy.setProperty("autoreverse", value);
				proxy.onPropertyChanged("autoreverse", value);
				break;
			case Id_top:
				proxy.setProperty("top", value);
				proxy.onPropertyChanged("top", value);
				break;
			case Id_bottom:
				proxy.setProperty("bottom", value);
				proxy.onPropertyChanged("bottom", value);
				break;
			case Id_left:
				proxy.setProperty("left", value);
				proxy.onPropertyChanged("left", value);
				break;
			case Id_right:
				proxy.setProperty("right", value);
				proxy.onPropertyChanged("right", value);
				break;
			case Id_center:
				proxy.setProperty("center", value);
				proxy.onPropertyChanged("center", value);
				break;
			case Id_width:
				proxy.setProperty("width", value);
				proxy.onPropertyChanged("width", value);
				break;
			case Id_height:
				proxy.setProperty("height", value);
				proxy.onPropertyChanged("height", value);
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
