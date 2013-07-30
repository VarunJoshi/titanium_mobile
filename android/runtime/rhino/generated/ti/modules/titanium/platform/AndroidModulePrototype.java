/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.platform;

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

import ti.modules.titanium.platform.AndroidModule;

import ti.modules.titanium.platform.PlatformModulePrototype;


public class AndroidModulePrototype extends PlatformModulePrototype
{
	private static final long serialVersionUID = 8406168599688790463L;

	private static final String TAG = "AndroidModulePrototype";
	private static final String CLASS_TAG = "AndroidModule";
	private static AndroidModulePrototype androidModulePrototype;


	public static AndroidModulePrototype getProxyPrototype()
	{
		return androidModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		androidModulePrototype = null;
	}

	public AndroidModulePrototype()
	{
		if (androidModulePrototype == null && getClass().equals(AndroidModulePrototype.class)) {
			androidModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("PHYSICAL_SIZE_CATEGORY_SMALL", this, 1);


			putConst("PHYSICAL_SIZE_CATEGORY_LARGE", this, 3);


			putConst("PHYSICAL_SIZE_CATEGORY_NORMAL", this, 2);


			putConst("API_LEVEL", this, AndroidModule.API_LEVEL);


			putConst("PHYSICAL_SIZE_CATEGORY_UNDEFINED", this, 0);


			putConst("PHYSICAL_SIZE_CATEGORY_XLARGE", this, 4);

	}

	public Scriptable getPrototype()
	{
		if (this == androidModulePrototype) {
			return PlatformModulePrototype.getProxyPrototype();
		}
		return androidModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return PlatformModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(AndroidModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getPhysicalSizeCategory(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPhysicalSizeCategory()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getPhysicalSizeCategory();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Number getter_physicalSizeCategory()
	{
		Log.d(TAG, "get physicalSizeCategory", Log.DEBUG_MODE);
		AndroidModule proxy = (AndroidModule) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getPhysicalSizeCategory();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getPhysicalSizeCategory = 2
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
            if (s_length==11) { X="constructor";id=Id_constructor; }
            else if (s_length==23) { X="getPhysicalSizeCategory";id=Id_getPhysicalSizeCategory; }
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
			case Id_getPhysicalSizeCategory:
				arity = 0;
				name = "getPhysicalSizeCategory";
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

		while (thisObj != null && !(thisObj instanceof AndroidModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		AndroidModulePrototype proxy = (AndroidModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getPhysicalSizeCategory:
				return getPhysicalSizeCategory(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_physicalSizeCategory = 1
		;

;

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
            if (s.length()==20) { X="physicalSizeCategory";id=Id_physicalSizeCategory; }
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
			case Id_physicalSizeCategory:
				return "physicalSizeCategory"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		AndroidModulePrototype proxy = this;
		while (start != null && !(start instanceof AndroidModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AndroidModulePrototype) {
			proxy = (AndroidModulePrototype) start;
		}

		switch (id) {
			case Id_physicalSizeCategory:
				return proxy.getter_physicalSizeCategory();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		AndroidModulePrototype proxy = this;
		while (start != null && !(start instanceof AndroidModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AndroidModulePrototype) {
			proxy = (AndroidModulePrototype) start;
		}

		switch (id) {
			case Id_physicalSizeCategory:
				proxy.setProperty("physicalSizeCategory", value);
				proxy.onPropertyChanged("physicalSizeCategory", value);
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
