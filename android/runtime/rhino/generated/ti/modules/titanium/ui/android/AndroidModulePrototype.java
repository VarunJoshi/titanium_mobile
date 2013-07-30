/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.ui.android;

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

import ti.modules.titanium.ui.android.AndroidModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class AndroidModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = 6195329605955854971L;

	private static final String TAG = "AndroidModulePrototype";
	private static final String CLASS_TAG = "AndroidModule";
	private static AndroidModulePrototype androidModulePrototype;

	// Lazy loaded child APIs
	private Object API_SearchView = null;
	private Object API_ProgressIndicator = null;

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

			putConst("PIXEL_FORMAT_RGB_565", this, 4);


			putConst("PROGRESS_INDICATOR_DIALOG", this, 1);


			putConst("PROGRESS_INDICATOR_INDETERMINANT", this, 0);


			putConst("SOFT_KEYBOARD_DEFAULT_ON_FOCUS", this, 0);


			putConst("SOFT_INPUT_STATE_HIDDEN", this, 2);


			putConst("SOFT_INPUT_STATE_UNSPECIFIED", this, 0);


			putConst("PIXEL_FORMAT_RGBA_8888", this, 1);


			putConst("SOFT_INPUT_STATE_ALWAYS_HIDDEN", this, 3);


			putConst("PIXEL_FORMAT_UNKNOWN", this, 0);


			putConst("SWITCH_STYLE_TOGGLEBUTTON", this, 1);


			putConst("LINKIFY_ALL", this, 15);


			putConst("SOFT_INPUT_STATE_ALWAYS_VISIBLE", this, 5);


			putConst("PIXEL_FORMAT_LA_88", this, 10);


			putConst("PIXEL_FORMAT_RGB_888", this, 3);


			putConst("PIXEL_FORMAT_RGBA_4444", this, 7);


			putConst("SOFT_INPUT_STATE_VISIBLE", this, 4);


			putConst("WEBVIEW_PLUGINS_ON_DEMAND", this, 2);


			putConst("SOFT_KEYBOARD_HIDE_ON_FOCUS", this, 1);


			putConst("PIXEL_FORMAT_OPAQUE", this, -1);


			putConst("PIXEL_FORMAT_TRANSLUCENT", this, -3);


			putConst("LINKIFY_PHONE_NUMBERS", this, 4);


			putConst("LINKIFY_MAP_ADDRESSES", this, 8);


			putConst("PIXEL_FORMAT_RGB_332", this, 11);


			putConst("PIXEL_FORMAT_L_8", this, 9);


			putConst("PIXEL_FORMAT_TRANSPARENT", this, -2);


			putConst("WEBVIEW_PLUGINS_OFF", this, 0);


			putConst("SOFT_KEYBOARD_SHOW_ON_FOCUS", this, 2);


			putConst("PROGRESS_INDICATOR_STATUS_BAR", this, 0);


			putConst("PROGRESS_INDICATOR_DETERMINANT", this, 1);


			putConst("SOFT_INPUT_ADJUST_RESIZE", this, 16);


			putConst("SOFT_INPUT_ADJUST_UNSPECIFIED", this, 0);


			putConst("SWITCH_STYLE_CHECKBOX", this, 0);


			putConst("PIXEL_FORMAT_A_8", this, 8);


			putConst("SOFT_INPUT_ADJUST_PAN", this, 32);


			putConst("PIXEL_FORMAT_RGBX_8888", this, 2);


			putConst("WEBVIEW_PLUGINS_ON", this, 1);


			putConst("PIXEL_FORMAT_RGBA_5551", this, 6);


			putConst("LINKIFY_WEB_URLS", this, 1);


			putConst("LINKIFY_EMAIL_ADDRESSES", this, 2);

	}

	public Scriptable getPrototype()
	{
		if (this == androidModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return androidModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(AndroidModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void openPreferences(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "openPreferences()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();
		java.lang.String arg0;
		if (args.length <= 0) {
			arg0 = null;
		} else {
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		}

		proxy.openPreferences(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void hideSoftKeyboard(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "hideSoftKeyboard()", Log.DEBUG_MODE);

		try {
		AndroidModule proxy = (AndroidModule) ((Proxy) thisObj).getProxy();

		proxy.hideSoftKeyboard();
	

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
		Id_openPreferences = 2,
		Id_hideSoftKeyboard = 3,
		Id_createSearchView = 4,
				Id_createProgressIndicator = 5
		;
		

	public static final int MAX_PROTOTYPE_ID = 5;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 11: X="constructor";id=Id_constructor; break L;
            case 15: X="openPreferences";id=Id_openPreferences; break L;
            case 16: c=s.charAt(0);
                if (c=='c') { X="createSearchView";id=Id_createSearchView; }
                else if (c=='h') { X="hideSoftKeyboard";id=Id_hideSoftKeyboard; }
                break L;
            case 23: X="createProgressIndicator";id=Id_createProgressIndicator; break L;
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
			case Id_openPreferences:
				arity = 1;
				name = "openPreferences";
				break;
			case Id_hideSoftKeyboard:
				arity = 0;
				name = "hideSoftKeyboard";
				break;
			case Id_createSearchView:
				arity = 1;
				name = "createSearchView";
				break;
			case Id_createProgressIndicator:
				arity = 1;
				name = "createProgressIndicator";
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
			case Id_openPreferences:
				 openPreferences(cx, thisObj, args);
				return Undefined.instance;
			case Id_hideSoftKeyboard:
				 hideSoftKeyboard(cx, thisObj, args);
				return Undefined.instance;
			case Id_createSearchView:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.SearchViewProxy", args);
			case Id_createProgressIndicator:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.android.ProgressIndicatorProxy", args);
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

		Id_SearchView = 1
		,		
		Id_ProgressIndicator = 2
		;

	public static final int MAX_INSTANCE_ID = 2;

	@Override
	protected int getMaxInstanceId()
	{
		return MAX_INSTANCE_ID;
	}

	@Override
	protected int findInstanceIdInfo(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==10) { X="SearchView";id=Id_SearchView; }
            else if (s_length==17) { X="ProgressIndicator";id=Id_ProgressIndicator; }
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
			case Id_SearchView:
				return "SearchView";
			case Id_ProgressIndicator:
				return "ProgressIndicator";
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
			case Id_SearchView:
				if (proxy.API_SearchView == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_SearchView = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.SearchViewProxy", ti.modules.titanium.ui.SearchViewProxyPrototype.class); 
				}
				return proxy.API_SearchView;
			case Id_ProgressIndicator:
				if (proxy.API_ProgressIndicator == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_ProgressIndicator = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.android.ProgressIndicatorProxy", ti.modules.titanium.ui.android.ProgressIndicatorProxyPrototype.class); 
				}
				return proxy.API_ProgressIndicator;
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
			case Id_SearchView:
				if (value instanceof Proxy) {
					proxy.API_SearchView = value;
				} else {
					defineProperty(original, "SearchView", value, 0);
				}
				break;
			case Id_ProgressIndicator:
				if (value instanceof Proxy) {
					proxy.API_ProgressIndicator = value;
				} else {
					defineProperty(original, "ProgressIndicator", value, 0);
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
