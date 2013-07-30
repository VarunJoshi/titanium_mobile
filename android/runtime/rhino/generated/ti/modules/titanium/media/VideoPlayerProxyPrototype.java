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

import ti.modules.titanium.media.VideoPlayerProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class VideoPlayerProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = -4040915859129857833L;

	private static final String TAG = "VideoPlayerProxyPrototype";
	private static final String CLASS_TAG = "VideoPlayerProxy";
	private static VideoPlayerProxyPrototype videoPlayerProxyPrototype;


	public static VideoPlayerProxyPrototype getProxyPrototype()
	{
		return videoPlayerProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		videoPlayerProxyPrototype = null;
	}

	public VideoPlayerProxyPrototype()
	{
		if (videoPlayerProxyPrototype == null && getClass().equals(VideoPlayerProxyPrototype.class)) {
			videoPlayerProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == videoPlayerProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return videoPlayerProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(VideoPlayerProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getLoadState(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLoadState()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getLoadState();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void stop(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "stop()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();

		proxy.stop();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getPlaybackState(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPlaybackState()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getPlaybackState();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getMovieControlStyle(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getMovieControlStyle()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getMovieControlStyle();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setMovieControlStyle(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setMovieControlStyle()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setMovieControlStyle: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setMovieControlStyle(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setMediaControlStyle(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setMediaControlStyle()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setMediaControlStyle: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setMediaControlStyle(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void play(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "play()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();

		proxy.play();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setCurrentPlaybackTime(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setCurrentPlaybackTime()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setCurrentPlaybackTime: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setCurrentPlaybackTime(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getScalingMode(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getScalingMode()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getScalingMode();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getCurrentPlaybackTime(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getCurrentPlaybackTime()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getCurrentPlaybackTime();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setMovieControlMode(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setMovieControlMode()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setMovieControlMode: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setMovieControlMode(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void pause(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "pause()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();

		proxy.pause();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getMovieControlMode(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getMovieControlMode()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getMovieControlMode();

		Number rhinoResult = (Number) javaResult;
	
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
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();

		proxy.start();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getPlaying(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPlaying()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getPlaying();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void release(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "release()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();

		proxy.release();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getMediaControlStyle(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getMediaControlStyle()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getMediaControlStyle();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setScalingMode(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setScalingMode()", Log.DEBUG_MODE);

		try {
		VideoPlayerProxy proxy = (VideoPlayerProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setScalingMode: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setScalingMode(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Boolean getter_playing()
	{
		Log.d(TAG, "get playing", Log.DEBUG_MODE);
		VideoPlayerProxy proxy = (VideoPlayerProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getPlaying();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public Number getter_movieControlStyle()
	{
		Log.d(TAG, "get movieControlStyle", Log.DEBUG_MODE);
		VideoPlayerProxy proxy = (VideoPlayerProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getMovieControlStyle();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public void setter_movieControlStyle(Object value)
	{
		Log.d(TAG, "set movieControlStyle", Log.DEBUG_MODE);
		VideoPlayerProxy proxy = (VideoPlayerProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setMovieControlStyle(arg0);
		//proxy.setProperty("movieControlStyle", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Number getter_currentPlaybackTime()
	{
		Log.d(TAG, "get currentPlaybackTime", Log.DEBUG_MODE);
		VideoPlayerProxy proxy = (VideoPlayerProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getCurrentPlaybackTime();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public void setter_currentPlaybackTime(Object value)
	{
		Log.d(TAG, "set currentPlaybackTime", Log.DEBUG_MODE);
		VideoPlayerProxy proxy = (VideoPlayerProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setCurrentPlaybackTime(arg0);
		//proxy.setProperty("currentPlaybackTime", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Number getter_playbackState()
	{
		Log.d(TAG, "get playbackState", Log.DEBUG_MODE);
		VideoPlayerProxy proxy = (VideoPlayerProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getPlaybackState();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Number getter_loadState()
	{
		Log.d(TAG, "get loadState", Log.DEBUG_MODE);
		VideoPlayerProxy proxy = (VideoPlayerProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getLoadState();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Number getter_mediaControlStyle()
	{
		Log.d(TAG, "get mediaControlStyle", Log.DEBUG_MODE);
		VideoPlayerProxy proxy = (VideoPlayerProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getMediaControlStyle();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public void setter_mediaControlStyle(Object value)
	{
		Log.d(TAG, "set mediaControlStyle", Log.DEBUG_MODE);
		VideoPlayerProxy proxy = (VideoPlayerProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setMediaControlStyle(arg0);
		//proxy.setProperty("mediaControlStyle", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Number getter_scalingMode()
	{
		Log.d(TAG, "get scalingMode", Log.DEBUG_MODE);
		VideoPlayerProxy proxy = (VideoPlayerProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getScalingMode();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public void setter_scalingMode(Object value)
	{
		Log.d(TAG, "set scalingMode", Log.DEBUG_MODE);
		VideoPlayerProxy proxy = (VideoPlayerProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setScalingMode(arg0);
		//proxy.setProperty("scalingMode", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Number getter_movieControlMode()
	{
		Log.d(TAG, "get movieControlMode", Log.DEBUG_MODE);
		VideoPlayerProxy proxy = (VideoPlayerProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getMovieControlMode();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public void setter_movieControlMode(Object value)
	{
		Log.d(TAG, "set movieControlMode", Log.DEBUG_MODE);
		VideoPlayerProxy proxy = (VideoPlayerProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setMovieControlMode(arg0);
		//proxy.setProperty("movieControlMode", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getUrl = 2,
		Id_setUrl = 3,
		Id_getInitialPlaybackTime = 4,
		Id_setInitialPlaybackTime = 5,
		Id_getDuration = 6,
		Id_setDuration = 7,
		Id_getContentURL = 8,
		Id_setContentURL = 9,
		Id_getAutoplay = 10,
		Id_setAutoplay = 11,
		Id_getEndPlaybackTime = 12,
		Id_setEndPlaybackTime = 13,
		Id_getPlayableDuration = 14,
		Id_setPlayableDuration = 15,
		Id_getVolume = 16,
		Id_setVolume = 17,
		// Method IDs
		Id_getLoadState = 18,
		Id_stop = 19,
		Id_getPlaybackState = 20,
		Id_getMovieControlStyle = 21,
		Id_setMovieControlStyle = 22,
		Id_setMediaControlStyle = 23,
		Id_play = 24,
		Id_setCurrentPlaybackTime = 25,
		Id_getScalingMode = 26,
		Id_getCurrentPlaybackTime = 27,
		Id_setMovieControlMode = 28,
		Id_pause = 29,
		Id_getMovieControlMode = 30,
		Id_start = 31,
		Id_getPlaying = 32,
		Id_release = 33,
		Id_getMediaControlStyle = 34,
		Id_setScalingMode = 35
;
		

	public static final int MAX_PROTOTYPE_ID = 35;

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
            case 4: c=s.charAt(0);
                if (c=='p') { X="play";id=Id_play; }
                else if (c=='s') { X="stop";id=Id_stop; }
                break L;
            case 5: c=s.charAt(0);
                if (c=='p') { X="pause";id=Id_pause; }
                else if (c=='s') { X="start";id=Id_start; }
                break L;
            case 6: c=s.charAt(0);
                if (c=='g') { X="getUrl";id=Id_getUrl; }
                else if (c=='s') { X="setUrl";id=Id_setUrl; }
                break L;
            case 7: X="release";id=Id_release; break L;
            case 9: c=s.charAt(0);
                if (c=='g') { X="getVolume";id=Id_getVolume; }
                else if (c=='s') { X="setVolume";id=Id_setVolume; }
                break L;
            case 10: X="getPlaying";id=Id_getPlaying; break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') {
                    c=s.charAt(10);
                    if (c=='n') { X="getDuration";id=Id_getDuration; }
                    else if (c=='y') { X="getAutoplay";id=Id_getAutoplay; }
                }
                else if (c=='s') {
                    c=s.charAt(10);
                    if (c=='n') { X="setDuration";id=Id_setDuration; }
                    else if (c=='y') { X="setAutoplay";id=Id_setAutoplay; }
                }
                break L;
            case 12: X="getLoadState";id=Id_getLoadState; break L;
            case 13: c=s.charAt(0);
                if (c=='g') { X="getContentURL";id=Id_getContentURL; }
                else if (c=='s') { X="setContentURL";id=Id_setContentURL; }
                break L;
            case 14: c=s.charAt(0);
                if (c=='g') { X="getScalingMode";id=Id_getScalingMode; }
                else if (c=='s') { X="setScalingMode";id=Id_setScalingMode; }
                break L;
            case 16: X="getPlaybackState";id=Id_getPlaybackState; break L;
            case 18: c=s.charAt(0);
                if (c=='g') { X="getEndPlaybackTime";id=Id_getEndPlaybackTime; }
                else if (c=='s') { X="setEndPlaybackTime";id=Id_setEndPlaybackTime; }
                break L;
            case 19: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(18);
                    if (c=='e') { X="getMovieControlMode";id=Id_getMovieControlMode; }
                    else if (c=='n') { X="getPlayableDuration";id=Id_getPlayableDuration; }
                }
                else if (c=='s') {
                    c=s.charAt(18);
                    if (c=='e') { X="setMovieControlMode";id=Id_setMovieControlMode; }
                    else if (c=='n') { X="setPlayableDuration";id=Id_setPlayableDuration; }
                }
                break L;
            case 20: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(4);
                    if (c=='e') { X="getMediaControlStyle";id=Id_getMediaControlStyle; }
                    else if (c=='o') { X="getMovieControlStyle";id=Id_getMovieControlStyle; }
                }
                else if (c=='s') {
                    c=s.charAt(4);
                    if (c=='e') { X="setMediaControlStyle";id=Id_setMediaControlStyle; }
                    else if (c=='o') { X="setMovieControlStyle";id=Id_setMovieControlStyle; }
                }
                break L;
            case 22: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(3);
                    if (c=='C') { X="getCurrentPlaybackTime";id=Id_getCurrentPlaybackTime; }
                    else if (c=='I') { X="getInitialPlaybackTime";id=Id_getInitialPlaybackTime; }
                }
                else if (c=='s') {
                    c=s.charAt(3);
                    if (c=='C') { X="setCurrentPlaybackTime";id=Id_setCurrentPlaybackTime; }
                    else if (c=='I') { X="setInitialPlaybackTime";id=Id_setInitialPlaybackTime; }
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
			case Id_getUrl:
				arity = 0;
				name = "getUrl";
				break;
			case Id_setUrl:
				arity = 1;
				name = "setUrl";
				break;
			case Id_getInitialPlaybackTime:
				arity = 0;
				name = "getInitialPlaybackTime";
				break;
			case Id_setInitialPlaybackTime:
				arity = 1;
				name = "setInitialPlaybackTime";
				break;
			case Id_getDuration:
				arity = 0;
				name = "getDuration";
				break;
			case Id_setDuration:
				arity = 1;
				name = "setDuration";
				break;
			case Id_getContentURL:
				arity = 0;
				name = "getContentURL";
				break;
			case Id_setContentURL:
				arity = 1;
				name = "setContentURL";
				break;
			case Id_getAutoplay:
				arity = 0;
				name = "getAutoplay";
				break;
			case Id_setAutoplay:
				arity = 1;
				name = "setAutoplay";
				break;
			case Id_getEndPlaybackTime:
				arity = 0;
				name = "getEndPlaybackTime";
				break;
			case Id_setEndPlaybackTime:
				arity = 1;
				name = "setEndPlaybackTime";
				break;
			case Id_getPlayableDuration:
				arity = 0;
				name = "getPlayableDuration";
				break;
			case Id_setPlayableDuration:
				arity = 1;
				name = "setPlayableDuration";
				break;
			case Id_getVolume:
				arity = 0;
				name = "getVolume";
				break;
			case Id_setVolume:
				arity = 1;
				name = "setVolume";
				break;
			case Id_getLoadState:
				arity = 0;
				name = "getLoadState";
				break;
			case Id_stop:
				arity = 0;
				name = "stop";
				break;
			case Id_getPlaybackState:
				arity = 0;
				name = "getPlaybackState";
				break;
			case Id_getMovieControlStyle:
				arity = 0;
				name = "getMovieControlStyle";
				break;
			case Id_setMovieControlStyle:
				arity = 1;
				name = "setMovieControlStyle";
				break;
			case Id_setMediaControlStyle:
				arity = 1;
				name = "setMediaControlStyle";
				break;
			case Id_play:
				arity = 0;
				name = "play";
				break;
			case Id_setCurrentPlaybackTime:
				arity = 1;
				name = "setCurrentPlaybackTime";
				break;
			case Id_getScalingMode:
				arity = 0;
				name = "getScalingMode";
				break;
			case Id_getCurrentPlaybackTime:
				arity = 0;
				name = "getCurrentPlaybackTime";
				break;
			case Id_setMovieControlMode:
				arity = 1;
				name = "setMovieControlMode";
				break;
			case Id_pause:
				arity = 0;
				name = "pause";
				break;
			case Id_getMovieControlMode:
				arity = 0;
				name = "getMovieControlMode";
				break;
			case Id_start:
				arity = 0;
				name = "start";
				break;
			case Id_getPlaying:
				arity = 0;
				name = "getPlaying";
				break;
			case Id_release:
				arity = 0;
				name = "release";
				break;
			case Id_getMediaControlStyle:
				arity = 0;
				name = "getMediaControlStyle";
				break;
			case Id_setScalingMode:
				arity = 1;
				name = "setScalingMode";
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

		while (thisObj != null && !(thisObj instanceof VideoPlayerProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		VideoPlayerProxyPrototype proxy = (VideoPlayerProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getUrl:
				return proxy.getProperty("url");
			case Id_setUrl:
				proxy.setProperty("url", args[0]);
				proxy.onPropertyChanged("url", args[0]);
				return Undefined.instance;
			case Id_getInitialPlaybackTime:
				return proxy.getProperty("initialPlaybackTime");
			case Id_setInitialPlaybackTime:
				proxy.setProperty("initialPlaybackTime", args[0]);
				proxy.onPropertyChanged("initialPlaybackTime", args[0]);
				return Undefined.instance;
			case Id_getDuration:
				return proxy.getProperty("duration");
			case Id_setDuration:
				proxy.setProperty("duration", args[0]);
				proxy.onPropertyChanged("duration", args[0]);
				return Undefined.instance;
			case Id_getContentURL:
				return proxy.getProperty("contentURL");
			case Id_setContentURL:
				proxy.setProperty("contentURL", args[0]);
				proxy.onPropertyChanged("contentURL", args[0]);
				return Undefined.instance;
			case Id_getAutoplay:
				return proxy.getProperty("autoplay");
			case Id_setAutoplay:
				proxy.setProperty("autoplay", args[0]);
				proxy.onPropertyChanged("autoplay", args[0]);
				return Undefined.instance;
			case Id_getEndPlaybackTime:
				return proxy.getProperty("endPlaybackTime");
			case Id_setEndPlaybackTime:
				proxy.setProperty("endPlaybackTime", args[0]);
				proxy.onPropertyChanged("endPlaybackTime", args[0]);
				return Undefined.instance;
			case Id_getPlayableDuration:
				return proxy.getProperty("playableDuration");
			case Id_setPlayableDuration:
				proxy.setProperty("playableDuration", args[0]);
				proxy.onPropertyChanged("playableDuration", args[0]);
				return Undefined.instance;
			case Id_getVolume:
				return proxy.getProperty("volume");
			case Id_setVolume:
				proxy.setProperty("volume", args[0]);
				proxy.onPropertyChanged("volume", args[0]);
				return Undefined.instance;
			case Id_getLoadState:
				return getLoadState(cx, thisObj, args);
				
			case Id_stop:
				 stop(cx, thisObj, args);
				return Undefined.instance;
			case Id_getPlaybackState:
				return getPlaybackState(cx, thisObj, args);
				
			case Id_getMovieControlStyle:
				return getMovieControlStyle(cx, thisObj, args);
				
			case Id_setMovieControlStyle:
				 setMovieControlStyle(cx, thisObj, args);
				return Undefined.instance;
			case Id_setMediaControlStyle:
				 setMediaControlStyle(cx, thisObj, args);
				return Undefined.instance;
			case Id_play:
				 play(cx, thisObj, args);
				return Undefined.instance;
			case Id_setCurrentPlaybackTime:
				 setCurrentPlaybackTime(cx, thisObj, args);
				return Undefined.instance;
			case Id_getScalingMode:
				return getScalingMode(cx, thisObj, args);
				
			case Id_getCurrentPlaybackTime:
				return getCurrentPlaybackTime(cx, thisObj, args);
				
			case Id_setMovieControlMode:
				 setMovieControlMode(cx, thisObj, args);
				return Undefined.instance;
			case Id_pause:
				 pause(cx, thisObj, args);
				return Undefined.instance;
			case Id_getMovieControlMode:
				return getMovieControlMode(cx, thisObj, args);
				
			case Id_start:
				 start(cx, thisObj, args);
				return Undefined.instance;
			case Id_getPlaying:
				return getPlaying(cx, thisObj, args);
				
			case Id_release:
				 release(cx, thisObj, args);
				return Undefined.instance;
			case Id_getMediaControlStyle:
				return getMediaControlStyle(cx, thisObj, args);
				
			case Id_setScalingMode:
				 setScalingMode(cx, thisObj, args);
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

		Id_playing = 1
		,		
		Id_movieControlStyle = 2
		,		
		Id_currentPlaybackTime = 3
		,		
		Id_playbackState = 4
		,		
		Id_loadState = 5
		,		
		Id_mediaControlStyle = 6
		,		
		Id_scalingMode = 7
		,		
		Id_movieControlMode = 8
		;

	// Property accessor IDs
	private static final int

		Id_url = 9
		,		
		Id_initialPlaybackTime = 10
		,		
		Id_duration = 11
		,		
		Id_contentURL = 12
		,		
		Id_autoplay = 13
		,		
		Id_endPlaybackTime = 14
		,		
		Id_playableDuration = 15
		,		
		Id_volume = 16
		;

;

	public static final int MAX_INSTANCE_ID = 16;

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
            case 6: X="volume";id=Id_volume; break L;
            case 7: X="playing";id=Id_playing; break L;
            case 8: c=s.charAt(0);
                if (c=='a') { X="autoplay";id=Id_autoplay; }
                else if (c=='d') { X="duration";id=Id_duration; }
                break L;
            case 9: X="loadState";id=Id_loadState; break L;
            case 10: X="contentURL";id=Id_contentURL; break L;
            case 11: X="scalingMode";id=Id_scalingMode; break L;
            case 13: X="playbackState";id=Id_playbackState; break L;
            case 15: X="endPlaybackTime";id=Id_endPlaybackTime; break L;
            case 16: c=s.charAt(0);
                if (c=='m') { X="movieControlMode";id=Id_movieControlMode; }
                else if (c=='p') { X="playableDuration";id=Id_playableDuration; }
                break L;
            case 17: c=s.charAt(1);
                if (c=='e') { X="mediaControlStyle";id=Id_mediaControlStyle; }
                else if (c=='o') { X="movieControlStyle";id=Id_movieControlStyle; }
                break L;
            case 19: c=s.charAt(0);
                if (c=='c') { X="currentPlaybackTime";id=Id_currentPlaybackTime; }
                else if (c=='i') { X="initialPlaybackTime";id=Id_initialPlaybackTime; }
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
			case Id_playing:
				return "playing"; 
			case Id_movieControlStyle:
				return "movieControlStyle"; 
			case Id_currentPlaybackTime:
				return "currentPlaybackTime"; 
			case Id_playbackState:
				return "playbackState"; 
			case Id_loadState:
				return "loadState"; 
			case Id_mediaControlStyle:
				return "mediaControlStyle"; 
			case Id_scalingMode:
				return "scalingMode"; 
			case Id_movieControlMode:
				return "movieControlMode"; 
			case Id_url:
				return "url";
			case Id_initialPlaybackTime:
				return "initialPlaybackTime";
			case Id_duration:
				return "duration";
			case Id_contentURL:
				return "contentURL";
			case Id_autoplay:
				return "autoplay";
			case Id_endPlaybackTime:
				return "endPlaybackTime";
			case Id_playableDuration:
				return "playableDuration";
			case Id_volume:
				return "volume";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		VideoPlayerProxyPrototype proxy = this;
		while (start != null && !(start instanceof VideoPlayerProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof VideoPlayerProxyPrototype) {
			proxy = (VideoPlayerProxyPrototype) start;
		}

		switch (id) {
			case Id_playing:
				return proxy.getter_playing();
			case Id_movieControlStyle:
				return proxy.getter_movieControlStyle();
			case Id_currentPlaybackTime:
				return proxy.getter_currentPlaybackTime();
			case Id_playbackState:
				return proxy.getter_playbackState();
			case Id_loadState:
				return proxy.getter_loadState();
			case Id_mediaControlStyle:
				return proxy.getter_mediaControlStyle();
			case Id_scalingMode:
				return proxy.getter_scalingMode();
			case Id_movieControlMode:
				return proxy.getter_movieControlMode();
			case Id_url:
				return proxy.getProperty("url");
			case Id_initialPlaybackTime:
				return proxy.getProperty("initialPlaybackTime");
			case Id_duration:
				return proxy.getProperty("duration");
			case Id_contentURL:
				return proxy.getProperty("contentURL");
			case Id_autoplay:
				return proxy.getProperty("autoplay");
			case Id_endPlaybackTime:
				return proxy.getProperty("endPlaybackTime");
			case Id_playableDuration:
				return proxy.getProperty("playableDuration");
			case Id_volume:
				return proxy.getProperty("volume");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		VideoPlayerProxyPrototype proxy = this;
		while (start != null && !(start instanceof VideoPlayerProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof VideoPlayerProxyPrototype) {
			proxy = (VideoPlayerProxyPrototype) start;
		}

		switch (id) {
			case Id_playing:
				proxy.setProperty("playing", value);
				proxy.onPropertyChanged("playing", value);
				break; 
			case Id_movieControlStyle:
				proxy.setter_movieControlStyle(value);
				break; 
			case Id_currentPlaybackTime:
				proxy.setter_currentPlaybackTime(value);
				break; 
			case Id_playbackState:
				proxy.setProperty("playbackState", value);
				proxy.onPropertyChanged("playbackState", value);
				break; 
			case Id_loadState:
				proxy.setProperty("loadState", value);
				proxy.onPropertyChanged("loadState", value);
				break; 
			case Id_mediaControlStyle:
				proxy.setter_mediaControlStyle(value);
				break; 
			case Id_scalingMode:
				proxy.setter_scalingMode(value);
				break; 
			case Id_movieControlMode:
				proxy.setter_movieControlMode(value);
				break; 
			case Id_url:
				proxy.setProperty("url", value);
				proxy.onPropertyChanged("url", value);
				break;
			case Id_initialPlaybackTime:
				proxy.setProperty("initialPlaybackTime", value);
				proxy.onPropertyChanged("initialPlaybackTime", value);
				break;
			case Id_duration:
				proxy.setProperty("duration", value);
				proxy.onPropertyChanged("duration", value);
				break;
			case Id_contentURL:
				proxy.setProperty("contentURL", value);
				proxy.onPropertyChanged("contentURL", value);
				break;
			case Id_autoplay:
				proxy.setProperty("autoplay", value);
				proxy.onPropertyChanged("autoplay", value);
				break;
			case Id_endPlaybackTime:
				proxy.setProperty("endPlaybackTime", value);
				proxy.onPropertyChanged("endPlaybackTime", value);
				break;
			case Id_playableDuration:
				proxy.setProperty("playableDuration", value);
				proxy.onPropertyChanged("playableDuration", value);
				break;
			case Id_volume:
				proxy.setProperty("volume", value);
				proxy.onPropertyChanged("volume", value);
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
