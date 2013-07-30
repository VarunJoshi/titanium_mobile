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

import ti.modules.titanium.media.MediaModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class MediaModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = -1349281847525146349L;

	private static final String TAG = "MediaModulePrototype";
	private static final String CLASS_TAG = "MediaModule";
	private static MediaModulePrototype mediaModulePrototype;

	// Lazy loaded child APIs
	private Object API_Android = null;
	private Object API_AudioPlayer = null;
	private Object API_Camera = null;
	private Object API_VideoPlayer = null;
	private Object API_Sound = null;
	private Object API_CameraPreview = null;

	public static MediaModulePrototype getProxyPrototype()
	{
		return mediaModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		mediaModulePrototype = null;
	}

	public MediaModulePrototype()
	{
		if (mediaModulePrototype == null && getClass().equals(MediaModulePrototype.class)) {
			mediaModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("VIDEO_PLAYBACK_STATE_STOPPED", this, 0);


			putConst("VIDEO_CONTROL_DEFAULT", this, 0);


			putConst("VIDEO_CONTROL_NONE", this, 3);


			putConst("VIDEO_FINISH_REASON_USER_EXITED", this, 2);


			putConst("MEDIA_TYPE_VIDEO", this, "public.video");


			putConst("VIDEO_PLAYBACK_STATE_INTERRUPTED", this, 3);


			putConst("UNKNOWN_ERROR", this, 0);


			putConst("VIDEO_PLAYBACK_STATE_SEEKING_FORWARD", this, 4);


			putConst("VIDEO_FINISH_REASON_PLAYBACK_ENDED", this, 0);


			putConst("VIDEO_CONTROL_EMBEDDED", this, 1);


			putConst("VIDEO_CONTROL_FULLSCREEN", this, 2);


			putConst("NO_VIDEO", this, 3);


			putConst("MEDIA_TYPE_PHOTO", this, "public.image");


			putConst("NO_CAMERA", this, 2);


			putConst("DEVICE_BUSY", this, 1);


			putConst("VIDEO_CONTROL_HIDDEN", this, 4);


			putConst("VIDEO_PLAYBACK_STATE_PAUSED", this, 2);


			putConst("VIDEO_SCALING_NONE", this, 0);


			putConst("VIDEO_SCALING_ASPECT_FILL", this, 1);


			putConst("VIDEO_FINISH_REASON_PLAYBACK_ERROR", this, 1);


			putConst("VIDEO_LOAD_STATE_PLAYTHROUGH_OK", this, 2);


			putConst("VIDEO_LOAD_STATE_PLAYABLE", this, 1);


			putConst("VIDEO_LOAD_STATE_STALLED", this, 4);


			putConst("VIDEO_LOAD_STATE_UNKNOWN", this, 0);


			putConst("VIDEO_SCALING_MODE_FILL", this, 3);


			putConst("VIDEO_SCALING_ASPECT_FIT", this, 2);


			putConst("VIDEO_PLAYBACK_STATE_SEEKING_BACKWARD", this, 5);


			putConst("VIDEO_PLAYBACK_STATE_PLAYING", this, 1);

	}

	public Scriptable getPrototype()
	{
		if (this == mediaModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return mediaModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(MediaModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void takePicture(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "takePicture()", Log.DEBUG_MODE);

		try {
		MediaModule proxy = (MediaModule) ((Proxy) thisObj).getProxy();

		proxy.takePicture();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void openPhotoGallery(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "openPhotoGallery()", Log.DEBUG_MODE);

		try {
		MediaModule proxy = (MediaModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("openPhotoGallery: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		proxy.openPhotoGallery(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void previewImage(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "previewImage()", Log.DEBUG_MODE);

		try {
		MediaModule proxy = (MediaModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("previewImage: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		proxy.previewImage(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getIsCameraSupported(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getIsCameraSupported()", Log.DEBUG_MODE);

		try {
		MediaModule proxy = (MediaModule) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getIsCameraSupported();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void takeScreenshot(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "takeScreenshot()", Log.DEBUG_MODE);

		try {
		MediaModule proxy = (MediaModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("takeScreenshot: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollFunction arg0;
		arg0 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.takeScreenshot(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void vibrate(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "vibrate()", Log.DEBUG_MODE);

		try {
		MediaModule proxy = (MediaModule) ((Proxy) thisObj).getProxy();
		long[] arg0;
		if (args.length <= 0) {
			arg0 = null;
		} else {
		arg0 = (long[]) TypeConverter.jsArrayToJavaLongArray((Scriptable) args[0], thisObj) ;
		}

		proxy.vibrate(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void showCamera(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "showCamera()", Log.DEBUG_MODE);

		try {
		MediaModule proxy = (MediaModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("showCamera: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.util.HashMap arg0;
		arg0 = (java.util.HashMap) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.showCamera(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Boolean getter_isCameraSupported()
	{
		Log.d(TAG, "get isCameraSupported", Log.DEBUG_MODE);
		MediaModule proxy = (MediaModule) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getIsCameraSupported();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_takePicture = 2,
		Id_openPhotoGallery = 3,
		Id_previewImage = 4,
		Id_getIsCameraSupported = 5,
		Id_takeScreenshot = 6,
		Id_vibrate = 7,
		Id_showCamera = 8,
		Id_createAudioPlayer = 9,
				Id_createCamera = 10,
				Id_createSound = 11,
				Id_createVideoPlayer = 12
		;
		

	public static final int MAX_PROTOTYPE_ID = 12;

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
            case 7: X="vibrate";id=Id_vibrate; break L;
            case 10: X="showCamera";id=Id_showCamera; break L;
            case 11: c=s.charAt(1);
                if (c=='a') { X="takePicture";id=Id_takePicture; }
                else if (c=='o') { X="constructor";id=Id_constructor; }
                else if (c=='r') { X="createSound";id=Id_createSound; }
                break L;
            case 12: c=s.charAt(0);
                if (c=='c') { X="createCamera";id=Id_createCamera; }
                else if (c=='p') { X="previewImage";id=Id_previewImage; }
                break L;
            case 14: X="takeScreenshot";id=Id_takeScreenshot; break L;
            case 16: X="openPhotoGallery";id=Id_openPhotoGallery; break L;
            case 17: c=s.charAt(6);
                if (c=='A') { X="createAudioPlayer";id=Id_createAudioPlayer; }
                else if (c=='V') { X="createVideoPlayer";id=Id_createVideoPlayer; }
                break L;
            case 20: X="getIsCameraSupported";id=Id_getIsCameraSupported; break L;
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
			case Id_takePicture:
				arity = 0;
				name = "takePicture";
				break;
			case Id_openPhotoGallery:
				arity = 1;
				name = "openPhotoGallery";
				break;
			case Id_previewImage:
				arity = 1;
				name = "previewImage";
				break;
			case Id_getIsCameraSupported:
				arity = 0;
				name = "getIsCameraSupported";
				break;
			case Id_takeScreenshot:
				arity = 1;
				name = "takeScreenshot";
				break;
			case Id_vibrate:
				arity = 1;
				name = "vibrate";
				break;
			case Id_showCamera:
				arity = 1;
				name = "showCamera";
				break;
			case Id_createAudioPlayer:
				arity = 1;
				name = "createAudioPlayer";
				break;
			case Id_createCamera:
				arity = 1;
				name = "createCamera";
				break;
			case Id_createSound:
				arity = 1;
				name = "createSound";
				break;
			case Id_createVideoPlayer:
				arity = 1;
				name = "createVideoPlayer";
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

		while (thisObj != null && !(thisObj instanceof MediaModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		MediaModulePrototype proxy = (MediaModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_takePicture:
				 takePicture(cx, thisObj, args);
				return Undefined.instance;
			case Id_openPhotoGallery:
				 openPhotoGallery(cx, thisObj, args);
				return Undefined.instance;
			case Id_previewImage:
				 previewImage(cx, thisObj, args);
				return Undefined.instance;
			case Id_getIsCameraSupported:
				return getIsCameraSupported(cx, thisObj, args);
				
			case Id_takeScreenshot:
				 takeScreenshot(cx, thisObj, args);
				return Undefined.instance;
			case Id_vibrate:
				 vibrate(cx, thisObj, args);
				return Undefined.instance;
			case Id_showCamera:
				 showCamera(cx, thisObj, args);
				return Undefined.instance;
			case Id_createAudioPlayer:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.media.AudioPlayerProxy", args);
			case Id_createCamera:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.media.CameraProxy", args);
			case Id_createSound:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.media.SoundProxy", args);
			case Id_createVideoPlayer:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.media.VideoPlayerProxy", args);
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_isCameraSupported = 1
		;

;

	// Child APIs
	private static final int

		Id_Android = 2
		,		
		Id_AudioPlayer = 3
		,		
		Id_Camera = 4
		,		
		Id_VideoPlayer = 5
		,		
		Id_Sound = 6
		,		
		Id_CameraPreview = 7
		;

	public static final int MAX_INSTANCE_ID = 7;

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
            case 5: X="Sound";id=Id_Sound; break L;
            case 6: X="Camera";id=Id_Camera; break L;
            case 7: X="Android";id=Id_Android; break L;
            case 11: c=s.charAt(0);
                if (c=='A') { X="AudioPlayer";id=Id_AudioPlayer; }
                else if (c=='V') { X="VideoPlayer";id=Id_VideoPlayer; }
                break L;
            case 13: X="CameraPreview";id=Id_CameraPreview; break L;
            case 17: X="isCameraSupported";id=Id_isCameraSupported; break L;
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
			case Id_isCameraSupported:
				return "isCameraSupported"; 
			case Id_Android:
				return "Android";
			case Id_AudioPlayer:
				return "AudioPlayer";
			case Id_Camera:
				return "Camera";
			case Id_VideoPlayer:
				return "VideoPlayer";
			case Id_Sound:
				return "Sound";
			case Id_CameraPreview:
				return "CameraPreview";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		MediaModulePrototype proxy = this;
		while (start != null && !(start instanceof MediaModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof MediaModulePrototype) {
			proxy = (MediaModulePrototype) start;
		}

		switch (id) {
			case Id_isCameraSupported:
				return proxy.getter_isCameraSupported();
			case Id_Android:
				if (proxy.API_Android == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Android = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.media.android.AndroidModule", ti.modules.titanium.media.android.AndroidModulePrototype.class); 
				}
				return proxy.API_Android;
			case Id_AudioPlayer:
				if (proxy.API_AudioPlayer == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_AudioPlayer = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.media.AudioPlayerProxy", ti.modules.titanium.media.AudioPlayerProxyPrototype.class); 
				}
				return proxy.API_AudioPlayer;
			case Id_Camera:
				if (proxy.API_Camera == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Camera = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.media.CameraProxy", ti.modules.titanium.media.CameraProxyPrototype.class); 
				}
				return proxy.API_Camera;
			case Id_VideoPlayer:
				if (proxy.API_VideoPlayer == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_VideoPlayer = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.media.VideoPlayerProxy", ti.modules.titanium.media.VideoPlayerProxyPrototype.class); 
				}
				return proxy.API_VideoPlayer;
			case Id_Sound:
				if (proxy.API_Sound == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Sound = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.media.SoundProxy", ti.modules.titanium.media.SoundProxyPrototype.class); 
				}
				return proxy.API_Sound;
			case Id_CameraPreview:
				if (proxy.API_CameraPreview == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_CameraPreview = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.media.CameraPreviewProxy", ti.modules.titanium.media.CameraPreviewProxyPrototype.class); 
				}
				return proxy.API_CameraPreview;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		MediaModulePrototype proxy = this;
		while (start != null && !(start instanceof MediaModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof MediaModulePrototype) {
			proxy = (MediaModulePrototype) start;
		}

		switch (id) {
			case Id_isCameraSupported:
				proxy.setProperty("isCameraSupported", value);
				proxy.onPropertyChanged("isCameraSupported", value);
				break; 
			case Id_Android:
				if (value instanceof Proxy) {
					proxy.API_Android = value;
				} else {
					defineProperty(original, "Android", value, 0);
				}
				break;
			case Id_AudioPlayer:
				if (value instanceof Proxy) {
					proxy.API_AudioPlayer = value;
				} else {
					defineProperty(original, "AudioPlayer", value, 0);
				}
				break;
			case Id_Camera:
				if (value instanceof Proxy) {
					proxy.API_Camera = value;
				} else {
					defineProperty(original, "Camera", value, 0);
				}
				break;
			case Id_VideoPlayer:
				if (value instanceof Proxy) {
					proxy.API_VideoPlayer = value;
				} else {
					defineProperty(original, "VideoPlayer", value, 0);
				}
				break;
			case Id_Sound:
				if (value instanceof Proxy) {
					proxy.API_Sound = value;
				} else {
					defineProperty(original, "Sound", value, 0);
				}
				break;
			case Id_CameraPreview:
				if (value instanceof Proxy) {
					proxy.API_CameraPreview = value;
				} else {
					defineProperty(original, "CameraPreview", value, 0);
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
