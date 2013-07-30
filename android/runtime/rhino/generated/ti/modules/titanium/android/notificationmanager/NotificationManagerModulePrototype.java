/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.android.notificationmanager;

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

import ti.modules.titanium.android.notificationmanager.NotificationManagerModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class NotificationManagerModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = 4339007838806626177L;

	private static final String TAG = "NotificationManagerModulePrototype";
	private static final String CLASS_TAG = "NotificationManagerModule";
	private static NotificationManagerModulePrototype notificationManagerModulePrototype;


	public static NotificationManagerModulePrototype getProxyPrototype()
	{
		return notificationManagerModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		notificationManagerModulePrototype = null;
	}

	public NotificationManagerModulePrototype()
	{
		if (notificationManagerModulePrototype == null && getClass().equals(NotificationManagerModulePrototype.class)) {
			notificationManagerModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("FLAG_ONGOING_EVENT", this, 2);


			putConst("FLAG_AUTO_CANCEL", this, 16);


			putConst("STREAM_DEFAULT", this, -1);


			putConst("FLAG_INSISTENT", this, 4);


			putConst("FLAG_NO_CLEAR", this, 32);


			putConst("FLAG_ONLY_ALERT_ONCE", this, 8);


			putConst("FLAG_SHOW_LIGHTS", this, 1);


			putConst("DEFAULT_ALL", this, -1);


			putConst("DEFAULT_LIGHTS", this, 4);


			putConst("DEFAULT_SOUND", this, 1);


			putConst("DEFAULT_VIBRATE", this, 2);

	}

	public Scriptable getPrototype()
	{
		if (this == notificationManagerModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return notificationManagerModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(NotificationManagerModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void cancelAll(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "cancelAll()", Log.DEBUG_MODE);

		try {
		NotificationManagerModule proxy = (NotificationManagerModule) ((Proxy) thisObj).getProxy();

		proxy.cancelAll();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void notify(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "notify()", Log.DEBUG_MODE);

		try {
		NotificationManagerModule proxy = (NotificationManagerModule) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("notify: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		if (!(args[1] instanceof Proxy) && args[1] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.android.notificationmanager.NotificationProxy arg1;
		arg1 = (ti.modules.titanium.android.notificationmanager.NotificationProxy) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;

		proxy.notify(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void cancel(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "cancel()", Log.DEBUG_MODE);

		try {
		NotificationManagerModule proxy = (NotificationManagerModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("cancel: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.cancel(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_cancelAll = 2,
		Id_notify = 3,
		Id_cancel = 4
;
		

	public static final int MAX_PROTOTYPE_ID = 4;

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
            int s_length = s.length();
            if (s_length==6) {
                c=s.charAt(0);
                if (c=='c') { X="cancel";id=Id_cancel; }
                else if (c=='n') { X="notify";id=Id_notify; }
            }
            else if (s_length==9) { X="cancelAll";id=Id_cancelAll; }
            else if (s_length==11) { X="constructor";id=Id_constructor; }
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
			case Id_cancelAll:
				arity = 0;
				name = "cancelAll";
				break;
			case Id_notify:
				arity = 2;
				name = "notify";
				break;
			case Id_cancel:
				arity = 1;
				name = "cancel";
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

		while (thisObj != null && !(thisObj instanceof NotificationManagerModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		NotificationManagerModulePrototype proxy = (NotificationManagerModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_cancelAll:
				 cancelAll(cx, thisObj, args);
				return Undefined.instance;
			case Id_notify:
				 notify(cx, thisObj, args);
				return Undefined.instance;
			case Id_cancel:
				 cancel(cx, thisObj, args);
				return Undefined.instance;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



	public static final int MAX_INSTANCE_ID = -1;


	@Override
	public String getClassName()
	{
		return CLASS_TAG;
	}
}
