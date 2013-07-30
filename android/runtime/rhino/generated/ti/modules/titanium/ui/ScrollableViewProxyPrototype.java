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

import ti.modules.titanium.ui.ScrollableViewProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class ScrollableViewProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = -1265037385469679242L;

	private static final String TAG = "ScrollableViewProxyPrototype";
	private static final String CLASS_TAG = "ScrollableViewProxy";
	private static ScrollableViewProxyPrototype scrollableViewProxyPrototype;


	public static ScrollableViewProxyPrototype getProxyPrototype()
	{
		return scrollableViewProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		scrollableViewProxyPrototype = null;
	}

	public ScrollableViewProxyPrototype()
	{
		if (scrollableViewProxyPrototype == null && getClass().equals(ScrollableViewProxyPrototype.class)) {
			scrollableViewProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == scrollableViewProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return scrollableViewProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ScrollableViewProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void setViews(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setViews()", Log.DEBUG_MODE);

		try {
		ScrollableViewProxy proxy = (ScrollableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setViews: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setViews(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void removeView(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeView()", Log.DEBUG_MODE);

		try {
		ScrollableViewProxy proxy = (ScrollableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removeView: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.removeView(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void addView(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addView()", Log.DEBUG_MODE);

		try {
		ScrollableViewProxy proxy = (ScrollableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("addView: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.addView(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getViews(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getViews()", Log.DEBUG_MODE);

		try {
		ScrollableViewProxy proxy = (ScrollableViewProxy) ((Proxy) thisObj).getProxy();

		java.lang.Object javaResult = proxy.getViews();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setScrollingEnabled(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setScrollingEnabled()", Log.DEBUG_MODE);

		try {
		ScrollableViewProxy proxy = (ScrollableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setScrollingEnabled: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setScrollingEnabled(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void movePrevious(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "movePrevious()", Log.DEBUG_MODE);

		try {
		ScrollableViewProxy proxy = (ScrollableViewProxy) ((Proxy) thisObj).getProxy();

		proxy.movePrevious();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void moveNext(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "moveNext()", Log.DEBUG_MODE);

		try {
		ScrollableViewProxy proxy = (ScrollableViewProxy) ((Proxy) thisObj).getProxy();

		proxy.moveNext();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getCurrentPage(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getCurrentPage()", Log.DEBUG_MODE);

		try {
		ScrollableViewProxy proxy = (ScrollableViewProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getCurrentPage();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getScrollingEnabled(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getScrollingEnabled()", Log.DEBUG_MODE);

		try {
		ScrollableViewProxy proxy = (ScrollableViewProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getScrollingEnabled();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void scrollToView(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "scrollToView()", Log.DEBUG_MODE);

		try {
		ScrollableViewProxy proxy = (ScrollableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("scrollToView: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.scrollToView(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setCurrentPage(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setCurrentPage()", Log.DEBUG_MODE);

		try {
		ScrollableViewProxy proxy = (ScrollableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setCurrentPage: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setCurrentPage(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Boolean getter_scrollingEnabled()
	{
		Log.d(TAG, "get scrollingEnabled", Log.DEBUG_MODE);
		ScrollableViewProxy proxy = (ScrollableViewProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getScrollingEnabled();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_scrollingEnabled(Object value)
	{
		Log.d(TAG, "set scrollingEnabled", Log.DEBUG_MODE);
		ScrollableViewProxy proxy = (ScrollableViewProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setScrollingEnabled(arg0);
		//proxy.setProperty("scrollingEnabled", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Object getter_views()
	{
		Log.d(TAG, "get views", Log.DEBUG_MODE);
		ScrollableViewProxy proxy = (ScrollableViewProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object javaResult = proxy.getViews();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public void setter_views(Object value)
	{
		Log.d(TAG, "set views", Log.DEBUG_MODE);
		ScrollableViewProxy proxy = (ScrollableViewProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setViews(arg0);
		//proxy.setProperty("views", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Number getter_currentPage()
	{
		Log.d(TAG, "get currentPage", Log.DEBUG_MODE);
		ScrollableViewProxy proxy = (ScrollableViewProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getCurrentPage();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public void setter_currentPage(Object value)
	{
		Log.d(TAG, "set currentPage", Log.DEBUG_MODE);
		ScrollableViewProxy proxy = (ScrollableViewProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setCurrentPage(arg0);
		//proxy.setProperty("currentPage", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getShowPagingControl = 2,
		Id_setShowPagingControl = 3,
		// Method IDs
		Id_setViews = 4,
		Id_removeView = 5,
		Id_addView = 6,
		Id_getViews = 7,
		Id_setScrollingEnabled = 8,
		Id_movePrevious = 9,
		Id_moveNext = 10,
		Id_getCurrentPage = 11,
		Id_getScrollingEnabled = 12,
		Id_scrollToView = 13,
		Id_setCurrentPage = 14
;
		

	public static final int MAX_PROTOTYPE_ID = 14;

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
            case 7: X="addView";id=Id_addView; break L;
            case 8: c=s.charAt(0);
                if (c=='g') { X="getViews";id=Id_getViews; }
                else if (c=='m') { X="moveNext";id=Id_moveNext; }
                else if (c=='s') { X="setViews";id=Id_setViews; }
                break L;
            case 10: X="removeView";id=Id_removeView; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: c=s.charAt(0);
                if (c=='m') { X="movePrevious";id=Id_movePrevious; }
                else if (c=='s') { X="scrollToView";id=Id_scrollToView; }
                break L;
            case 14: c=s.charAt(0);
                if (c=='g') { X="getCurrentPage";id=Id_getCurrentPage; }
                else if (c=='s') { X="setCurrentPage";id=Id_setCurrentPage; }
                break L;
            case 19: c=s.charAt(0);
                if (c=='g') { X="getScrollingEnabled";id=Id_getScrollingEnabled; }
                else if (c=='s') { X="setScrollingEnabled";id=Id_setScrollingEnabled; }
                break L;
            case 20: c=s.charAt(0);
                if (c=='g') { X="getShowPagingControl";id=Id_getShowPagingControl; }
                else if (c=='s') { X="setShowPagingControl";id=Id_setShowPagingControl; }
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
			case Id_getShowPagingControl:
				arity = 0;
				name = "getShowPagingControl";
				break;
			case Id_setShowPagingControl:
				arity = 1;
				name = "setShowPagingControl";
				break;
			case Id_setViews:
				arity = 1;
				name = "setViews";
				break;
			case Id_removeView:
				arity = 1;
				name = "removeView";
				break;
			case Id_addView:
				arity = 1;
				name = "addView";
				break;
			case Id_getViews:
				arity = 0;
				name = "getViews";
				break;
			case Id_setScrollingEnabled:
				arity = 1;
				name = "setScrollingEnabled";
				break;
			case Id_movePrevious:
				arity = 0;
				name = "movePrevious";
				break;
			case Id_moveNext:
				arity = 0;
				name = "moveNext";
				break;
			case Id_getCurrentPage:
				arity = 0;
				name = "getCurrentPage";
				break;
			case Id_getScrollingEnabled:
				arity = 0;
				name = "getScrollingEnabled";
				break;
			case Id_scrollToView:
				arity = 1;
				name = "scrollToView";
				break;
			case Id_setCurrentPage:
				arity = 1;
				name = "setCurrentPage";
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

		while (thisObj != null && !(thisObj instanceof ScrollableViewProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ScrollableViewProxyPrototype proxy = (ScrollableViewProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getShowPagingControl:
				return proxy.getProperty("showPagingControl");
			case Id_setShowPagingControl:
				proxy.setProperty("showPagingControl", args[0]);
				proxy.onPropertyChanged("showPagingControl", args[0]);
				return Undefined.instance;
			case Id_setViews:
				 setViews(cx, thisObj, args);
				return Undefined.instance;
			case Id_removeView:
				 removeView(cx, thisObj, args);
				return Undefined.instance;
			case Id_addView:
				 addView(cx, thisObj, args);
				return Undefined.instance;
			case Id_getViews:
				return getViews(cx, thisObj, args);
				
			case Id_setScrollingEnabled:
				 setScrollingEnabled(cx, thisObj, args);
				return Undefined.instance;
			case Id_movePrevious:
				 movePrevious(cx, thisObj, args);
				return Undefined.instance;
			case Id_moveNext:
				 moveNext(cx, thisObj, args);
				return Undefined.instance;
			case Id_getCurrentPage:
				return getCurrentPage(cx, thisObj, args);
				
			case Id_getScrollingEnabled:
				return getScrollingEnabled(cx, thisObj, args);
				
			case Id_scrollToView:
				 scrollToView(cx, thisObj, args);
				return Undefined.instance;
			case Id_setCurrentPage:
				 setCurrentPage(cx, thisObj, args);
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

		Id_scrollingEnabled = 1
		,		
		Id_views = 2
		,		
		Id_currentPage = 3
		;

	// Property accessor IDs
	private static final int

		Id_showPagingControl = 4
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
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null;
            L: switch (s.length()) {
            case 5: X="views";id=Id_views; break L;
            case 11: X="currentPage";id=Id_currentPage; break L;
            case 16: X="scrollingEnabled";id=Id_scrollingEnabled; break L;
            case 17: X="showPagingControl";id=Id_showPagingControl; break L;
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
			case Id_scrollingEnabled:
				return "scrollingEnabled"; 
			case Id_views:
				return "views"; 
			case Id_currentPage:
				return "currentPage"; 
			case Id_showPagingControl:
				return "showPagingControl";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ScrollableViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof ScrollableViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ScrollableViewProxyPrototype) {
			proxy = (ScrollableViewProxyPrototype) start;
		}

		switch (id) {
			case Id_scrollingEnabled:
				return proxy.getter_scrollingEnabled();
			case Id_views:
				return proxy.getter_views();
			case Id_currentPage:
				return proxy.getter_currentPage();
			case Id_showPagingControl:
				return proxy.getProperty("showPagingControl");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ScrollableViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof ScrollableViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ScrollableViewProxyPrototype) {
			proxy = (ScrollableViewProxyPrototype) start;
		}

		switch (id) {
			case Id_scrollingEnabled:
				proxy.setter_scrollingEnabled(value);
				break; 
			case Id_views:
				proxy.setter_views(value);
				break; 
			case Id_currentPage:
				proxy.setter_currentPage(value);
				break; 
			case Id_showPagingControl:
				proxy.setProperty("showPagingControl", value);
				proxy.onPropertyChanged("showPagingControl", value);
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
