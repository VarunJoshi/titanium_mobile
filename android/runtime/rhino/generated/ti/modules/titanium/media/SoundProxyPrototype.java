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

import ti.modules.titanium.media.SoundProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class SoundProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 3075628658743637752L;

	private static final String TAG = "SoundProxyPrototype";
	private static final String CLASS_TAG = "SoundProxy";
	private static SoundProxyPrototype soundProxyPrototype;


	public static SoundProxyPrototype getProxyPrototype()
	{
		return soundProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		soundProxyPrototype = null;
	}

	public SoundProxyPrototype()
	{
		if (soundProxyPrototype == null && getClass().equals(SoundProxyPrototype.class)) {
			soundProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == soundProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return soundProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(SoundProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void setTime(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setTime()", Log.DEBUG_MODE);

		try {
		SoundProxy proxy = (SoundProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setTime: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setTime(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void stop(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "stop()", Log.DEBUG_MODE);

		try {
		SoundProxy proxy = (SoundProxy) ((Proxy) thisObj).getProxy();

		proxy.stop();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object isPaused(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isPaused()", Log.DEBUG_MODE);

		try {
		SoundProxy proxy = (SoundProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isPaused();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void play(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "play()", Log.DEBUG_MODE);

		try {
		SoundProxy proxy = (SoundProxy) ((Proxy) thisObj).getProxy();

		proxy.play();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setLooping(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setLooping()", Log.DEBUG_MODE);

		try {
		SoundProxy proxy = (SoundProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setLooping: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		proxy.setLooping(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getDuration(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDuration()", Log.DEBUG_MODE);

		try {
		SoundProxy proxy = (SoundProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getDuration();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object isPlaying(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isPlaying()", Log.DEBUG_MODE);

		try {
		SoundProxy proxy = (SoundProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isPlaying();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void destroy(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "destroy()", Log.DEBUG_MODE);

		try {
		SoundProxy proxy = (SoundProxy) ((Proxy) thisObj).getProxy();

		proxy.destroy();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void pause(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "pause()", Log.DEBUG_MODE);

		try {
		SoundProxy proxy = (SoundProxy) ((Proxy) thisObj).getProxy();

		proxy.pause();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getTime(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTime()", Log.DEBUG_MODE);

		try {
		SoundProxy proxy = (SoundProxy) ((Proxy) thisObj).getProxy();

		double javaResult = proxy.getTime();

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
		SoundProxy proxy = (SoundProxy) ((Proxy) thisObj).getProxy();

		proxy.start();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object isLooping(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isLooping()", Log.DEBUG_MODE);

		try {
		SoundProxy proxy = (SoundProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isLooping();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void reset(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "reset()", Log.DEBUG_MODE);

		try {
		SoundProxy proxy = (SoundProxy) ((Proxy) thisObj).getProxy();

		proxy.reset();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void release(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "release()", Log.DEBUG_MODE);

		try {
		SoundProxy proxy = (SoundProxy) ((Proxy) thisObj).getProxy();

		proxy.release();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Boolean getter_playing()
	{
		Log.d(TAG, "get playing", Log.DEBUG_MODE);
		SoundProxy proxy = (SoundProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.isPlaying();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public Number getter_duration()
	{
		Log.d(TAG, "get duration", Log.DEBUG_MODE);
		SoundProxy proxy = (SoundProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getDuration();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Number getter_time()
	{
		Log.d(TAG, "get time", Log.DEBUG_MODE);
		SoundProxy proxy = (SoundProxy) getProxy();
		Scriptable thisObj = this;
		double javaResult = proxy.getTime();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public void setter_time(Object value)
	{
		Log.d(TAG, "set time", Log.DEBUG_MODE);
		SoundProxy proxy = (SoundProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setTime(arg0);
		//proxy.setProperty("time", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Boolean getter_paused()
	{
		Log.d(TAG, "get paused", Log.DEBUG_MODE);
		SoundProxy proxy = (SoundProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.isPaused();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public Boolean getter_looping()
	{
		Log.d(TAG, "get looping", Log.DEBUG_MODE);
		SoundProxy proxy = (SoundProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.isLooping();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_looping(Object value)
	{
		Log.d(TAG, "set looping", Log.DEBUG_MODE);
		SoundProxy proxy = (SoundProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setLooping(arg0);
		//proxy.setProperty("looping", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_url()
	{
		Log.d(TAG, "get url", Log.DEBUG_MODE);
		SoundProxy proxy = (SoundProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getUrl();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_url(Object value)
	{
		Log.d(TAG, "set url", Log.DEBUG_MODE);
		SoundProxy proxy = (SoundProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setUrl(arg0);
		//proxy.setProperty("url", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getVolume = 2,
		Id_setVolume = 3,
		// Method IDs
		Id_setTime = 4,
		Id_stop = 5,
		Id_isPaused = 6,
		Id_play = 7,
		Id_setLooping = 8,
		Id_getDuration = 9,
		Id_isPlaying = 10,
		Id_destroy = 11,
		Id_pause = 12,
		Id_getTime = 13,
		Id_start = 14,
		Id_isLooping = 15,
		Id_reset = 16,
		Id_release = 17
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
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 4: c=s.charAt(0);
                if (c=='p') { X="play";id=Id_play; }
                else if (c=='s') { X="stop";id=Id_stop; }
                break L;
            case 5: c=s.charAt(0);
                if (c=='p') { X="pause";id=Id_pause; }
                else if (c=='r') { X="reset";id=Id_reset; }
                else if (c=='s') { X="start";id=Id_start; }
                break L;
            case 7: switch (s.charAt(0)) {
                case 'd': X="destroy";id=Id_destroy; break L;
                case 'g': X="getTime";id=Id_getTime; break L;
                case 'r': X="release";id=Id_release; break L;
                case 's': X="setTime";id=Id_setTime; break L;
                } break L;
            case 8: X="isPaused";id=Id_isPaused; break L;
            case 9: c=s.charAt(0);
                if (c=='g') { X="getVolume";id=Id_getVolume; }
                else if (c=='i') {
                    c=s.charAt(2);
                    if (c=='L') { X="isLooping";id=Id_isLooping; }
                    else if (c=='P') { X="isPlaying";id=Id_isPlaying; }
                }
                else if (c=='s') { X="setVolume";id=Id_setVolume; }
                break L;
            case 10: X="setLooping";id=Id_setLooping; break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') { X="getDuration";id=Id_getDuration; }
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
			case Id_getVolume:
				arity = 0;
				name = "getVolume";
				break;
			case Id_setVolume:
				arity = 1;
				name = "setVolume";
				break;
			case Id_setTime:
				arity = 1;
				name = "setTime";
				break;
			case Id_stop:
				arity = 0;
				name = "stop";
				break;
			case Id_isPaused:
				arity = 0;
				name = "isPaused";
				break;
			case Id_play:
				arity = 0;
				name = "play";
				break;
			case Id_setLooping:
				arity = 1;
				name = "setLooping";
				break;
			case Id_getDuration:
				arity = 0;
				name = "getDuration";
				break;
			case Id_isPlaying:
				arity = 0;
				name = "isPlaying";
				break;
			case Id_destroy:
				arity = 0;
				name = "destroy";
				break;
			case Id_pause:
				arity = 0;
				name = "pause";
				break;
			case Id_getTime:
				arity = 0;
				name = "getTime";
				break;
			case Id_start:
				arity = 0;
				name = "start";
				break;
			case Id_isLooping:
				arity = 0;
				name = "isLooping";
				break;
			case Id_reset:
				arity = 0;
				name = "reset";
				break;
			case Id_release:
				arity = 0;
				name = "release";
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

		while (thisObj != null && !(thisObj instanceof SoundProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		SoundProxyPrototype proxy = (SoundProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getVolume:
				return proxy.getProperty("volume");
			case Id_setVolume:
				proxy.setProperty("volume", args[0]);
				proxy.onPropertyChanged("volume", args[0]);
				return Undefined.instance;
			case Id_setTime:
				 setTime(cx, thisObj, args);
				return Undefined.instance;
			case Id_stop:
				 stop(cx, thisObj, args);
				return Undefined.instance;
			case Id_isPaused:
				return isPaused(cx, thisObj, args);
				
			case Id_play:
				 play(cx, thisObj, args);
				return Undefined.instance;
			case Id_setLooping:
				 setLooping(cx, thisObj, args);
				return Undefined.instance;
			case Id_getDuration:
				return getDuration(cx, thisObj, args);
				
			case Id_isPlaying:
				return isPlaying(cx, thisObj, args);
				
			case Id_destroy:
				 destroy(cx, thisObj, args);
				return Undefined.instance;
			case Id_pause:
				 pause(cx, thisObj, args);
				return Undefined.instance;
			case Id_getTime:
				return getTime(cx, thisObj, args);
				
			case Id_start:
				 start(cx, thisObj, args);
				return Undefined.instance;
			case Id_isLooping:
				return isLooping(cx, thisObj, args);
				
			case Id_reset:
				 reset(cx, thisObj, args);
				return Undefined.instance;
			case Id_release:
				 release(cx, thisObj, args);
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
		Id_duration = 2
		,		
		Id_time = 3
		,		
		Id_paused = 4
		,		
		Id_looping = 5
		,		
		Id_url = 6
		;

	// Property accessor IDs
	private static final int

		Id_volume = 7
		;

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
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 3: X="url";id=Id_url; break L;
            case 4: X="time";id=Id_time; break L;
            case 6: c=s.charAt(0);
                if (c=='p') { X="paused";id=Id_paused; }
                else if (c=='v') { X="volume";id=Id_volume; }
                break L;
            case 7: c=s.charAt(0);
                if (c=='l') { X="looping";id=Id_looping; }
                else if (c=='p') { X="playing";id=Id_playing; }
                break L;
            case 8: X="duration";id=Id_duration; break L;
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
			case Id_duration:
				return "duration"; 
			case Id_time:
				return "time"; 
			case Id_paused:
				return "paused"; 
			case Id_looping:
				return "looping"; 
			case Id_url:
				return "url"; 
			case Id_volume:
				return "volume";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		SoundProxyPrototype proxy = this;
		while (start != null && !(start instanceof SoundProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof SoundProxyPrototype) {
			proxy = (SoundProxyPrototype) start;
		}

		switch (id) {
			case Id_playing:
				return proxy.getter_playing();
			case Id_duration:
				return proxy.getter_duration();
			case Id_time:
				return proxy.getter_time();
			case Id_paused:
				return proxy.getter_paused();
			case Id_looping:
				return proxy.getter_looping();
			case Id_url:
				return proxy.getter_url();
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
		SoundProxyPrototype proxy = this;
		while (start != null && !(start instanceof SoundProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof SoundProxyPrototype) {
			proxy = (SoundProxyPrototype) start;
		}

		switch (id) {
			case Id_playing:
				proxy.setProperty("playing", value);
				proxy.onPropertyChanged("playing", value);
				break; 
			case Id_duration:
				proxy.setProperty("duration", value);
				proxy.onPropertyChanged("duration", value);
				break; 
			case Id_time:
				proxy.setter_time(value);
				break; 
			case Id_paused:
				proxy.setProperty("paused", value);
				proxy.onPropertyChanged("paused", value);
				break; 
			case Id_looping:
				proxy.setter_looping(value);
				break; 
			case Id_url:
				proxy.setter_url(value);
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
