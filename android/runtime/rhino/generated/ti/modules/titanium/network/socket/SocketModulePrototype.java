/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.network.socket;

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

import ti.modules.titanium.network.socket.SocketModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class SocketModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = -6749932747696078275L;

	private static final String TAG = "SocketModulePrototype";
	private static final String CLASS_TAG = "SocketModule";
	private static SocketModulePrototype socketModulePrototype;

	// Lazy loaded child APIs
	private Object API_TCP = null;

	public static SocketModulePrototype getProxyPrototype()
	{
		return socketModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		socketModulePrototype = null;
	}

	public SocketModulePrototype()
	{
		if (socketModulePrototype == null && getClass().equals(SocketModulePrototype.class)) {
			socketModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("LISTENING", this, 3);


			putConst("CLOSED", this, 4);


			putConst("CONNECTED", this, 2);


			putConst("ERROR", this, 5);


			putConst("INITIALIZED", this, 1);

	}

	public Scriptable getPrototype()
	{
		if (this == socketModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return socketModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(SocketModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_createTCP = 2
		;
		

	public static final int MAX_PROTOTYPE_ID = 2;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==9) { X="createTCP";id=Id_createTCP; }
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
			case Id_createTCP:
				arity = 1;
				name = "createTCP";
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

		while (thisObj != null && !(thisObj instanceof SocketModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		SocketModulePrototype proxy = (SocketModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_createTCP:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.network.socket.TCPProxy", args);
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
;

;

	// Child APIs
	private static final int

		Id_TCP = 1
		;

	public static final int MAX_INSTANCE_ID = 1;

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
        L0: { id = 0; String X = null;
            if (s.length()==3) { X="TCP";id=Id_TCP; }
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
			case Id_TCP:
				return "TCP";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		SocketModulePrototype proxy = this;
		while (start != null && !(start instanceof SocketModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof SocketModulePrototype) {
			proxy = (SocketModulePrototype) start;
		}

		switch (id) {
			case Id_TCP:
				if (proxy.API_TCP == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TCP = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.network.socket.TCPProxy", ti.modules.titanium.network.socket.TCPProxyPrototype.class); 
				}
				return proxy.API_TCP;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		SocketModulePrototype proxy = this;
		while (start != null && !(start instanceof SocketModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof SocketModulePrototype) {
			proxy = (SocketModulePrototype) start;
		}

		switch (id) {
			case Id_TCP:
				if (value instanceof Proxy) {
					proxy.API_TCP = value;
				} else {
					defineProperty(original, "TCP", value, 0);
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
