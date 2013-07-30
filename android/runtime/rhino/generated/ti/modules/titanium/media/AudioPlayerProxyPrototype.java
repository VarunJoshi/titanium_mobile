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

import ti.modules.titanium.media.AudioPlayerProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class AudioPlayerProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = -3704140243821572139L;

	private static final String TAG = "AudioPlayerProxyPrototype";
	private static final String CLASS_TAG = "AudioPlayerProxy";
	private static AudioPlayerProxyPrototype audioPlayerProxyPrototype;


	public static AudioPlayerProxyPrototype getProxyPrototype()
	{
		return audioPlayerProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		audioPlayerProxyPrototype = null;
	}

	public AudioPlayerProxyPrototype()
	{
		if (audioPlayerProxyPrototype == null && getClass().equals(AudioPlayerProxyPrototype.class)) {
			audioPlayerProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}


			putConst("STATE_PAUSED", this, 2);


			putConst("STATE_WAITING_FOR_DATA", this, 7);


			putConst("STATE_PLAYING", this, 3);


			putConst("STATE_BUFFERING", this, 0);


			putConst("STATE_WAITING_FOR_QUEUE", this, 8);


			putConst("STATE_STARTING", this, 4);


			putConst("STATE_STOPPED", this, 5);


			putConst("STATE_INITIALIZED", this, 1);


			putConst("STATE_STOPPING", this, 6);

	}

	public Scriptable getPrototype()
	{
		if (this == audioPlayerProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return audioPlayerProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(AudioPlayerProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void pause(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "pause()", Log.DEBUG_MODE);

		try {
		AudioPlayerProxy proxy = (AudioPlayerProxy) ((Proxy) thisObj).getProxy();

		proxy.pause();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void destroy(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "destroy()", Log.DEBUG_MODE);

		try {
		AudioPlayerProxy proxy = (AudioPlayerProxy) ((Proxy) thisObj).getProxy();

		proxy.destroy();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void stop(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "stop()", Log.DEBUG_MODE);

		try {
		AudioPlayerProxy proxy = (AudioPlayerProxy) ((Proxy) thisObj).getProxy();

		proxy.stop();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getUrl(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getUrl()", Log.DEBUG_MODE);

		try {
		AudioPlayerProxy proxy = (AudioPlayerProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getUrl();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setUrl(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setUrl()", Log.DEBUG_MODE);

		try {
		AudioPlayerProxy proxy = (AudioPlayerProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setUrl: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setUrl(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object isPaused(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isPaused()", Log.DEBUG_MODE);

		try {
		AudioPlayerProxy proxy = (AudioPlayerProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isPaused();

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
		AudioPlayerProxy proxy = (AudioPlayerProxy) ((Proxy) thisObj).getProxy();

		proxy.start();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void play(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "play()", Log.DEBUG_MODE);

		try {
		AudioPlayerProxy proxy = (AudioPlayerProxy) ((Proxy) thisObj).getProxy();

		proxy.play();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void release(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "release()", Log.DEBUG_MODE);

		try {
		AudioPlayerProxy proxy = (AudioPlayerProxy) ((Proxy) thisObj).getProxy();

		proxy.release();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object isPlaying(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isPlaying()", Log.DEBUG_MODE);

		try {
		AudioPlayerProxy proxy = (AudioPlayerProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isPlaying();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Boolean getter_playing()
	{
		Log.d(TAG, "get playing", Log.DEBUG_MODE);
		AudioPlayerProxy proxy = (AudioPlayerProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.isPlaying();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public Boolean getter_paused()
	{
		Log.d(TAG, "get paused", Log.DEBUG_MODE);
		AudioPlayerProxy proxy = (AudioPlayerProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.isPaused();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public String getter_url()
	{
		Log.d(TAG, "get url", Log.DEBUG_MODE);
		AudioPlayerProxy proxy = (AudioPlayerProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getUrl();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_url(Object value)
	{
		Log.d(TAG, "set url", Log.DEBUG_MODE);
		AudioPlayerProxy proxy = (AudioPlayerProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
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
		Id_pause = 4,
		Id_destroy = 5,
		Id_stop = 6,
		Id_getUrl = 7,
		Id_setUrl = 8,
		Id_isPaused = 9,
		Id_start = 10,
		Id_play = 11,
		Id_release = 12,
		Id_isPlaying = 13
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
            case 7: c=s.charAt(0);
                if (c=='d') { X="destroy";id=Id_destroy; }
                else if (c=='r') { X="release";id=Id_release; }
                break L;
            case 8: X="isPaused";id=Id_isPaused; break L;
            case 9: c=s.charAt(0);
                if (c=='g') { X="getVolume";id=Id_getVolume; }
                else if (c=='i') { X="isPlaying";id=Id_isPlaying; }
                else if (c=='s') { X="setVolume";id=Id_setVolume; }
                break L;
            case 11: X="constructor";id=Id_constructor; break L;
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
			case Id_pause:
				arity = 0;
				name = "pause";
				break;
			case Id_destroy:
				arity = 0;
				name = "destroy";
				break;
			case Id_stop:
				arity = 0;
				name = "stop";
				break;
			case Id_getUrl:
				arity = 0;
				name = "getUrl";
				break;
			case Id_setUrl:
				arity = 1;
				name = "setUrl";
				break;
			case Id_isPaused:
				arity = 0;
				name = "isPaused";
				break;
			case Id_start:
				arity = 0;
				name = "start";
				break;
			case Id_play:
				arity = 0;
				name = "play";
				break;
			case Id_release:
				arity = 0;
				name = "release";
				break;
			case Id_isPlaying:
				arity = 0;
				name = "isPlaying";
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

		while (thisObj != null && !(thisObj instanceof AudioPlayerProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		AudioPlayerProxyPrototype proxy = (AudioPlayerProxyPrototype) thisObj;
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
			case Id_pause:
				 pause(cx, thisObj, args);
				return Undefined.instance;
			case Id_destroy:
				 destroy(cx, thisObj, args);
				return Undefined.instance;
			case Id_stop:
				 stop(cx, thisObj, args);
				return Undefined.instance;
			case Id_getUrl:
				return getUrl(cx, thisObj, args);
				
			case Id_setUrl:
				 setUrl(cx, thisObj, args);
				return Undefined.instance;
			case Id_isPaused:
				return isPaused(cx, thisObj, args);
				
			case Id_start:
				 start(cx, thisObj, args);
				return Undefined.instance;
			case Id_play:
				 play(cx, thisObj, args);
				return Undefined.instance;
			case Id_release:
				 release(cx, thisObj, args);
				return Undefined.instance;
			case Id_isPlaying:
				return isPlaying(cx, thisObj, args);
				
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
		Id_paused = 2
		,		
		Id_url = 3
		;

	// Property accessor IDs
	private static final int

		Id_volume = 4
		;

;

	public static final int MAX_INSTANCE_ID = 4;

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
            int s_length = s.length();
            if (s_length==3) { X="url";id=Id_url; }
            else if (s_length==6) {
                c=s.charAt(0);
                if (c=='p') { X="paused";id=Id_paused; }
                else if (c=='v') { X="volume";id=Id_volume; }
            }
            else if (s_length==7) { X="playing";id=Id_playing; }
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
			case Id_paused:
				return "paused"; 
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
		AudioPlayerProxyPrototype proxy = this;
		while (start != null && !(start instanceof AudioPlayerProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AudioPlayerProxyPrototype) {
			proxy = (AudioPlayerProxyPrototype) start;
		}

		switch (id) {
			case Id_playing:
				return proxy.getter_playing();
			case Id_paused:
				return proxy.getter_paused();
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
		AudioPlayerProxyPrototype proxy = this;
		while (start != null && !(start instanceof AudioPlayerProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AudioPlayerProxyPrototype) {
			proxy = (AudioPlayerProxyPrototype) start;
		}

		switch (id) {
			case Id_playing:
				proxy.setProperty("playing", value);
				proxy.onPropertyChanged("playing", value);
				break; 
			case Id_paused:
				proxy.setProperty("paused", value);
				proxy.onPropertyChanged("paused", value);
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
