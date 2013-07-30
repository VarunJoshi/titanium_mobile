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

import ti.modules.titanium.ui.ImageViewProxy;

import ti.modules.titanium.ui.ViewProxyPrototype;


public class ImageViewProxyPrototype extends ViewProxyPrototype
{
	private static final long serialVersionUID = -1096133214489103816L;

	private static final String TAG = "ImageViewProxyPrototype";
	private static final String CLASS_TAG = "ImageViewProxy";
	private static ImageViewProxyPrototype imageViewProxyPrototype;


	public static ImageViewProxyPrototype getProxyPrototype()
	{
		return imageViewProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		imageViewProxyPrototype = null;
	}

	public ImageViewProxyPrototype()
	{
		if (imageViewProxyPrototype == null && getClass().equals(ImageViewProxyPrototype.class)) {
			imageViewProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == imageViewProxyPrototype) {
			return ViewProxyPrototype.getProxyPrototype();
		}
		return imageViewProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return ViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ImageViewProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void pause(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "pause()", Log.DEBUG_MODE);

		try {
		ImageViewProxy proxy = (ImageViewProxy) ((Proxy) thisObj).getProxy();

		proxy.pause();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void stop(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "stop()", Log.DEBUG_MODE);

		try {
		ImageViewProxy proxy = (ImageViewProxy) ((Proxy) thisObj).getProxy();

		proxy.stop();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void resume(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "resume()", Log.DEBUG_MODE);

		try {
		ImageViewProxy proxy = (ImageViewProxy) ((Proxy) thisObj).getProxy();

		proxy.resume();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setReverse(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setReverse()", Log.DEBUG_MODE);

		try {
		ImageViewProxy proxy = (ImageViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setReverse: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		proxy.setReverse(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getAnimating(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAnimating()", Log.DEBUG_MODE);

		try {
		ImageViewProxy proxy = (ImageViewProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getAnimating();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void start(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "start()", Log.DEBUG_MODE);

		try {
		ImageViewProxy proxy = (ImageViewProxy) ((Proxy) thisObj).getProxy();

		proxy.start();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getReverse(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getReverse()", Log.DEBUG_MODE);

		try {
		ImageViewProxy proxy = (ImageViewProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getReverse();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object toBlob(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "toBlob()", Log.DEBUG_MODE);

		try {
		ImageViewProxy proxy = (ImageViewProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.TiBlob javaResult = proxy.toBlob();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getPaused(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPaused()", Log.DEBUG_MODE);

		try {
		ImageViewProxy proxy = (ImageViewProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getPaused();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Boolean getter_animating()
	{
		Log.d(TAG, "get animating", Log.DEBUG_MODE);
		ImageViewProxy proxy = (ImageViewProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getAnimating();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public Boolean getter_reverse()
	{
		Log.d(TAG, "get reverse", Log.DEBUG_MODE);
		ImageViewProxy proxy = (ImageViewProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getReverse();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_reverse(Object value)
	{
		Log.d(TAG, "set reverse", Log.DEBUG_MODE);
		ImageViewProxy proxy = (ImageViewProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setReverse(arg0);
		//proxy.setProperty("reverse", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Boolean getter_paused()
	{
		Log.d(TAG, "get paused", Log.DEBUG_MODE);
		ImageViewProxy proxy = (ImageViewProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getPaused();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getDecodeRetries = 2,
		Id_setDecodeRetries = 3,
		Id_getAutorotate = 4,
		Id_setAutorotate = 5,
		Id_getDefaultImage = 6,
		Id_setDefaultImage = 7,
		Id_getDuration = 8,
		Id_setDuration = 9,
		Id_getEnableZoomControls = 10,
		Id_setEnableZoomControls = 11,
		Id_getImage = 12,
		Id_setImage = 13,
		Id_getImages = 14,
		Id_setImages = 15,
		Id_getRepeatCount = 16,
		Id_setRepeatCount = 17,
		Id_getUrl = 18,
		Id_setUrl = 19,
		// Method IDs
		Id_pause = 20,
		Id_stop = 21,
		Id_resume = 22,
		Id_setReverse = 23,
		Id_getAnimating = 24,
		Id_start = 25,
		Id_getReverse = 26,
		Id_toBlob = 27,
		Id_getPaused = 28
;
		

	public static final int MAX_PROTOTYPE_ID = 28;

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
            case 4: X="stop";id=Id_stop; break L;
            case 5: c=s.charAt(0);
                if (c=='p') { X="pause";id=Id_pause; }
                else if (c=='s') { X="start";id=Id_start; }
                break L;
            case 6: switch (s.charAt(0)) {
                case 'g': X="getUrl";id=Id_getUrl; break L;
                case 'r': X="resume";id=Id_resume; break L;
                case 's': X="setUrl";id=Id_setUrl; break L;
                case 't': X="toBlob";id=Id_toBlob; break L;
                } break L;
            case 8: c=s.charAt(0);
                if (c=='g') { X="getImage";id=Id_getImage; }
                else if (c=='s') { X="setImage";id=Id_setImage; }
                break L;
            case 9: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(8);
                    if (c=='d') { X="getPaused";id=Id_getPaused; }
                    else if (c=='s') { X="getImages";id=Id_getImages; }
                }
                else if (c=='s') { X="setImages";id=Id_setImages; }
                break L;
            case 10: c=s.charAt(0);
                if (c=='g') { X="getReverse";id=Id_getReverse; }
                else if (c=='s') { X="setReverse";id=Id_setReverse; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') { X="getDuration";id=Id_getDuration; }
                else if (c=='s') { X="setDuration";id=Id_setDuration; }
                break L;
            case 12: X="getAnimating";id=Id_getAnimating; break L;
            case 13: c=s.charAt(0);
                if (c=='g') { X="getAutorotate";id=Id_getAutorotate; }
                else if (c=='s') { X="setAutorotate";id=Id_setAutorotate; }
                break L;
            case 14: c=s.charAt(0);
                if (c=='g') { X="getRepeatCount";id=Id_getRepeatCount; }
                else if (c=='s') { X="setRepeatCount";id=Id_setRepeatCount; }
                break L;
            case 15: c=s.charAt(0);
                if (c=='g') { X="getDefaultImage";id=Id_getDefaultImage; }
                else if (c=='s') { X="setDefaultImage";id=Id_setDefaultImage; }
                break L;
            case 16: c=s.charAt(0);
                if (c=='g') { X="getDecodeRetries";id=Id_getDecodeRetries; }
                else if (c=='s') { X="setDecodeRetries";id=Id_setDecodeRetries; }
                break L;
            case 21: c=s.charAt(0);
                if (c=='g') { X="getEnableZoomControls";id=Id_getEnableZoomControls; }
                else if (c=='s') { X="setEnableZoomControls";id=Id_setEnableZoomControls; }
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
			case Id_getDecodeRetries:
				arity = 0;
				name = "getDecodeRetries";
				break;
			case Id_setDecodeRetries:
				arity = 1;
				name = "setDecodeRetries";
				break;
			case Id_getAutorotate:
				arity = 0;
				name = "getAutorotate";
				break;
			case Id_setAutorotate:
				arity = 1;
				name = "setAutorotate";
				break;
			case Id_getDefaultImage:
				arity = 0;
				name = "getDefaultImage";
				break;
			case Id_setDefaultImage:
				arity = 1;
				name = "setDefaultImage";
				break;
			case Id_getDuration:
				arity = 0;
				name = "getDuration";
				break;
			case Id_setDuration:
				arity = 1;
				name = "setDuration";
				break;
			case Id_getEnableZoomControls:
				arity = 0;
				name = "getEnableZoomControls";
				break;
			case Id_setEnableZoomControls:
				arity = 1;
				name = "setEnableZoomControls";
				break;
			case Id_getImage:
				arity = 0;
				name = "getImage";
				break;
			case Id_setImage:
				arity = 1;
				name = "setImage";
				break;
			case Id_getImages:
				arity = 0;
				name = "getImages";
				break;
			case Id_setImages:
				arity = 1;
				name = "setImages";
				break;
			case Id_getRepeatCount:
				arity = 0;
				name = "getRepeatCount";
				break;
			case Id_setRepeatCount:
				arity = 1;
				name = "setRepeatCount";
				break;
			case Id_getUrl:
				arity = 0;
				name = "getUrl";
				break;
			case Id_setUrl:
				arity = 1;
				name = "setUrl";
				break;
			case Id_pause:
				arity = 0;
				name = "pause";
				break;
			case Id_stop:
				arity = 0;
				name = "stop";
				break;
			case Id_resume:
				arity = 0;
				name = "resume";
				break;
			case Id_setReverse:
				arity = 1;
				name = "setReverse";
				break;
			case Id_getAnimating:
				arity = 0;
				name = "getAnimating";
				break;
			case Id_start:
				arity = 0;
				name = "start";
				break;
			case Id_getReverse:
				arity = 0;
				name = "getReverse";
				break;
			case Id_toBlob:
				arity = 0;
				name = "toBlob";
				break;
			case Id_getPaused:
				arity = 0;
				name = "getPaused";
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

		while (thisObj != null && !(thisObj instanceof ImageViewProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ImageViewProxyPrototype proxy = (ImageViewProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getDecodeRetries:
				return proxy.getProperty("decodeRetries");
			case Id_setDecodeRetries:
				proxy.setProperty("decodeRetries", args[0]);
				proxy.onPropertyChanged("decodeRetries", args[0]);
				return Undefined.instance;
			case Id_getAutorotate:
				return proxy.getProperty("autorotate");
			case Id_setAutorotate:
				proxy.setProperty("autorotate", args[0]);
				proxy.onPropertyChanged("autorotate", args[0]);
				return Undefined.instance;
			case Id_getDefaultImage:
				return proxy.getProperty("defaultImage");
			case Id_setDefaultImage:
				proxy.setProperty("defaultImage", args[0]);
				proxy.onPropertyChanged("defaultImage", args[0]);
				return Undefined.instance;
			case Id_getDuration:
				return proxy.getProperty("duration");
			case Id_setDuration:
				proxy.setProperty("duration", args[0]);
				proxy.onPropertyChanged("duration", args[0]);
				return Undefined.instance;
			case Id_getEnableZoomControls:
				return proxy.getProperty("enableZoomControls");
			case Id_setEnableZoomControls:
				proxy.setProperty("enableZoomControls", args[0]);
				proxy.onPropertyChanged("enableZoomControls", args[0]);
				return Undefined.instance;
			case Id_getImage:
				return proxy.getProperty("image");
			case Id_setImage:
				proxy.setProperty("image", args[0]);
				proxy.onPropertyChanged("image", args[0]);
				return Undefined.instance;
			case Id_getImages:
				return proxy.getProperty("images");
			case Id_setImages:
				proxy.setProperty("images", args[0]);
				proxy.onPropertyChanged("images", args[0]);
				return Undefined.instance;
			case Id_getRepeatCount:
				return proxy.getProperty("repeatCount");
			case Id_setRepeatCount:
				proxy.setProperty("repeatCount", args[0]);
				proxy.onPropertyChanged("repeatCount", args[0]);
				return Undefined.instance;
			case Id_getUrl:
				return proxy.getProperty("url");
			case Id_setUrl:
				proxy.setProperty("url", args[0]);
				proxy.onPropertyChanged("url", args[0]);
				return Undefined.instance;
			case Id_pause:
				 pause(cx, thisObj, args);
				return Undefined.instance;
			case Id_stop:
				 stop(cx, thisObj, args);
				return Undefined.instance;
			case Id_resume:
				 resume(cx, thisObj, args);
				return Undefined.instance;
			case Id_setReverse:
				 setReverse(cx, thisObj, args);
				return Undefined.instance;
			case Id_getAnimating:
				return getAnimating(cx, thisObj, args);
				
			case Id_start:
				 start(cx, thisObj, args);
				return Undefined.instance;
			case Id_getReverse:
				return getReverse(cx, thisObj, args);
				
			case Id_toBlob:
				return toBlob(cx, thisObj, args);
				
			case Id_getPaused:
				return getPaused(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_animating = 1
		,		
		Id_reverse = 2
		,		
		Id_paused = 3
		;

	// Property accessor IDs
	private static final int

		Id_decodeRetries = 4
		,		
		Id_autorotate = 5
		,		
		Id_defaultImage = 6
		,		
		Id_duration = 7
		,		
		Id_enableZoomControls = 8
		,		
		Id_image = 9
		,		
		Id_images = 10
		,		
		Id_repeatCount = 11
		,		
		Id_url = 12
		;

;

	public static final int MAX_INSTANCE_ID = 12;

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
            case 3: X="url";id=Id_url; break L;
            case 5: X="image";id=Id_image; break L;
            case 6: c=s.charAt(0);
                if (c=='i') { X="images";id=Id_images; }
                else if (c=='p') { X="paused";id=Id_paused; }
                break L;
            case 7: X="reverse";id=Id_reverse; break L;
            case 8: X="duration";id=Id_duration; break L;
            case 9: X="animating";id=Id_animating; break L;
            case 10: X="autorotate";id=Id_autorotate; break L;
            case 11: X="repeatCount";id=Id_repeatCount; break L;
            case 12: X="defaultImage";id=Id_defaultImage; break L;
            case 13: X="decodeRetries";id=Id_decodeRetries; break L;
            case 18: X="enableZoomControls";id=Id_enableZoomControls; break L;
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
			case Id_animating:
				return "animating"; 
			case Id_reverse:
				return "reverse"; 
			case Id_paused:
				return "paused"; 
			case Id_decodeRetries:
				return "decodeRetries";
			case Id_autorotate:
				return "autorotate";
			case Id_defaultImage:
				return "defaultImage";
			case Id_duration:
				return "duration";
			case Id_enableZoomControls:
				return "enableZoomControls";
			case Id_image:
				return "image";
			case Id_images:
				return "images";
			case Id_repeatCount:
				return "repeatCount";
			case Id_url:
				return "url";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ImageViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof ImageViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ImageViewProxyPrototype) {
			proxy = (ImageViewProxyPrototype) start;
		}

		switch (id) {
			case Id_animating:
				return proxy.getter_animating();
			case Id_reverse:
				return proxy.getter_reverse();
			case Id_paused:
				return proxy.getter_paused();
			case Id_decodeRetries:
				return proxy.getProperty("decodeRetries");
			case Id_autorotate:
				return proxy.getProperty("autorotate");
			case Id_defaultImage:
				return proxy.getProperty("defaultImage");
			case Id_duration:
				return proxy.getProperty("duration");
			case Id_enableZoomControls:
				return proxy.getProperty("enableZoomControls");
			case Id_image:
				return proxy.getProperty("image");
			case Id_images:
				return proxy.getProperty("images");
			case Id_repeatCount:
				return proxy.getProperty("repeatCount");
			case Id_url:
				return proxy.getProperty("url");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ImageViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof ImageViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ImageViewProxyPrototype) {
			proxy = (ImageViewProxyPrototype) start;
		}

		switch (id) {
			case Id_animating:
				proxy.setProperty("animating", value);
				proxy.onPropertyChanged("animating", value);
				break; 
			case Id_reverse:
				proxy.setter_reverse(value);
				break; 
			case Id_paused:
				proxy.setProperty("paused", value);
				proxy.onPropertyChanged("paused", value);
				break; 
			case Id_decodeRetries:
				proxy.setProperty("decodeRetries", value);
				proxy.onPropertyChanged("decodeRetries", value);
				break;
			case Id_autorotate:
				proxy.setProperty("autorotate", value);
				proxy.onPropertyChanged("autorotate", value);
				break;
			case Id_defaultImage:
				proxy.setProperty("defaultImage", value);
				proxy.onPropertyChanged("defaultImage", value);
				break;
			case Id_duration:
				proxy.setProperty("duration", value);
				proxy.onPropertyChanged("duration", value);
				break;
			case Id_enableZoomControls:
				proxy.setProperty("enableZoomControls", value);
				proxy.onPropertyChanged("enableZoomControls", value);
				break;
			case Id_image:
				proxy.setProperty("image", value);
				proxy.onPropertyChanged("image", value);
				break;
			case Id_images:
				proxy.setProperty("images", value);
				proxy.onPropertyChanged("images", value);
				break;
			case Id_repeatCount:
				proxy.setProperty("repeatCount", value);
				proxy.onPropertyChanged("repeatCount", value);
				break;
			case Id_url:
				proxy.setProperty("url", value);
				proxy.onPropertyChanged("url", value);
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
