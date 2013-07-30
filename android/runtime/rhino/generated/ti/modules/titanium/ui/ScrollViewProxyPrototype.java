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

import ti.modules.titanium.ui.ScrollViewProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class ScrollViewProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = -7919475959613542593L;

	private static final String TAG = "ScrollViewProxyPrototype";
	private static final String CLASS_TAG = "ScrollViewProxy";
	private static ScrollViewProxyPrototype scrollViewProxyPrototype;


	public static ScrollViewProxyPrototype getProxyPrototype()
	{
		return scrollViewProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		scrollViewProxyPrototype = null;
	}

	public ScrollViewProxyPrototype()
	{
		if (scrollViewProxyPrototype == null && getClass().equals(ScrollViewProxyPrototype.class)) {
			scrollViewProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == scrollViewProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return scrollViewProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ScrollViewProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void setScrollingEnabled(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setScrollingEnabled()", Log.DEBUG_MODE);

		try {
		ScrollViewProxy proxy = (ScrollViewProxy) ((Proxy) thisObj).getProxy();
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

	public Object getScrollingEnabled(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getScrollingEnabled()", Log.DEBUG_MODE);

		try {
		ScrollViewProxy proxy = (ScrollViewProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getScrollingEnabled();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void scrollTo(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "scrollTo()", Log.DEBUG_MODE);

		try {
		ScrollViewProxy proxy = (ScrollViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("scrollTo: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;

		proxy.scrollTo(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void scrollToBottom(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "scrollToBottom()", Log.DEBUG_MODE);

		try {
		ScrollViewProxy proxy = (ScrollViewProxy) ((Proxy) thisObj).getProxy();

		proxy.scrollToBottom();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Boolean getter_scrollingEnabled()
	{
		Log.d(TAG, "get scrollingEnabled", Log.DEBUG_MODE);
		ScrollViewProxy proxy = (ScrollViewProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getScrollingEnabled();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_scrollingEnabled(Object value)
	{
		Log.d(TAG, "set scrollingEnabled", Log.DEBUG_MODE);
		ScrollViewProxy proxy = (ScrollViewProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setScrollingEnabled(arg0);
		//proxy.setProperty("scrollingEnabled", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getContentHeight = 2,
		Id_setContentHeight = 3,
		Id_getContentWidth = 4,
		Id_setContentWidth = 5,
		Id_getShowHorizontalScrollIndicator = 6,
		Id_setShowHorizontalScrollIndicator = 7,
		Id_getShowVerticalScrollIndicator = 8,
		Id_setShowVerticalScrollIndicator = 9,
		Id_getScrollType = 10,
		Id_setScrollType = 11,
		Id_getContentOffset = 12,
		Id_setContentOffset = 13,
		Id_getCanCancelEvents = 14,
		Id_setCanCancelEvents = 15,
		// Method IDs
		Id_setScrollingEnabled = 16,
		Id_getScrollingEnabled = 17,
		Id_scrollTo = 18,
		Id_scrollToBottom = 19
;
		

	public static final int MAX_PROTOTYPE_ID = 19;

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
            case 8: X="scrollTo";id=Id_scrollTo; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 13: c=s.charAt(0);
                if (c=='g') { X="getScrollType";id=Id_getScrollType; }
                else if (c=='s') { X="setScrollType";id=Id_setScrollType; }
                break L;
            case 14: X="scrollToBottom";id=Id_scrollToBottom; break L;
            case 15: c=s.charAt(0);
                if (c=='g') { X="getContentWidth";id=Id_getContentWidth; }
                else if (c=='s') { X="setContentWidth";id=Id_setContentWidth; }
                break L;
            case 16: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(10);
                    if (c=='H') { X="getContentHeight";id=Id_getContentHeight; }
                    else if (c=='O') { X="getContentOffset";id=Id_getContentOffset; }
                }
                else if (c=='s') {
                    c=s.charAt(10);
                    if (c=='H') { X="setContentHeight";id=Id_setContentHeight; }
                    else if (c=='O') { X="setContentOffset";id=Id_setContentOffset; }
                }
                break L;
            case 18: c=s.charAt(0);
                if (c=='g') { X="getCanCancelEvents";id=Id_getCanCancelEvents; }
                else if (c=='s') { X="setCanCancelEvents";id=Id_setCanCancelEvents; }
                break L;
            case 19: c=s.charAt(0);
                if (c=='g') { X="getScrollingEnabled";id=Id_getScrollingEnabled; }
                else if (c=='s') { X="setScrollingEnabled";id=Id_setScrollingEnabled; }
                break L;
            case 30: c=s.charAt(0);
                if (c=='g') { X="getShowVerticalScrollIndicator";id=Id_getShowVerticalScrollIndicator; }
                else if (c=='s') { X="setShowVerticalScrollIndicator";id=Id_setShowVerticalScrollIndicator; }
                break L;
            case 32: c=s.charAt(0);
                if (c=='g') { X="getShowHorizontalScrollIndicator";id=Id_getShowHorizontalScrollIndicator; }
                else if (c=='s') { X="setShowHorizontalScrollIndicator";id=Id_setShowHorizontalScrollIndicator; }
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
			case Id_getContentHeight:
				arity = 0;
				name = "getContentHeight";
				break;
			case Id_setContentHeight:
				arity = 1;
				name = "setContentHeight";
				break;
			case Id_getContentWidth:
				arity = 0;
				name = "getContentWidth";
				break;
			case Id_setContentWidth:
				arity = 1;
				name = "setContentWidth";
				break;
			case Id_getShowHorizontalScrollIndicator:
				arity = 0;
				name = "getShowHorizontalScrollIndicator";
				break;
			case Id_setShowHorizontalScrollIndicator:
				arity = 1;
				name = "setShowHorizontalScrollIndicator";
				break;
			case Id_getShowVerticalScrollIndicator:
				arity = 0;
				name = "getShowVerticalScrollIndicator";
				break;
			case Id_setShowVerticalScrollIndicator:
				arity = 1;
				name = "setShowVerticalScrollIndicator";
				break;
			case Id_getScrollType:
				arity = 0;
				name = "getScrollType";
				break;
			case Id_setScrollType:
				arity = 1;
				name = "setScrollType";
				break;
			case Id_getContentOffset:
				arity = 0;
				name = "getContentOffset";
				break;
			case Id_setContentOffset:
				arity = 1;
				name = "setContentOffset";
				break;
			case Id_getCanCancelEvents:
				arity = 0;
				name = "getCanCancelEvents";
				break;
			case Id_setCanCancelEvents:
				arity = 1;
				name = "setCanCancelEvents";
				break;
			case Id_setScrollingEnabled:
				arity = 1;
				name = "setScrollingEnabled";
				break;
			case Id_getScrollingEnabled:
				arity = 0;
				name = "getScrollingEnabled";
				break;
			case Id_scrollTo:
				arity = 2;
				name = "scrollTo";
				break;
			case Id_scrollToBottom:
				arity = 0;
				name = "scrollToBottom";
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

		while (thisObj != null && !(thisObj instanceof ScrollViewProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ScrollViewProxyPrototype proxy = (ScrollViewProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getContentHeight:
				return proxy.getProperty("contentHeight");
			case Id_setContentHeight:
				proxy.setProperty("contentHeight", args[0]);
				proxy.onPropertyChanged("contentHeight", args[0]);
				return Undefined.instance;
			case Id_getContentWidth:
				return proxy.getProperty("contentWidth");
			case Id_setContentWidth:
				proxy.setProperty("contentWidth", args[0]);
				proxy.onPropertyChanged("contentWidth", args[0]);
				return Undefined.instance;
			case Id_getShowHorizontalScrollIndicator:
				return proxy.getProperty("showHorizontalScrollIndicator");
			case Id_setShowHorizontalScrollIndicator:
				proxy.setProperty("showHorizontalScrollIndicator", args[0]);
				proxy.onPropertyChanged("showHorizontalScrollIndicator", args[0]);
				return Undefined.instance;
			case Id_getShowVerticalScrollIndicator:
				return proxy.getProperty("showVerticalScrollIndicator");
			case Id_setShowVerticalScrollIndicator:
				proxy.setProperty("showVerticalScrollIndicator", args[0]);
				proxy.onPropertyChanged("showVerticalScrollIndicator", args[0]);
				return Undefined.instance;
			case Id_getScrollType:
				return proxy.getProperty("scrollType");
			case Id_setScrollType:
				proxy.setProperty("scrollType", args[0]);
				proxy.onPropertyChanged("scrollType", args[0]);
				return Undefined.instance;
			case Id_getContentOffset:
				return proxy.getProperty("contentOffset");
			case Id_setContentOffset:
				proxy.setProperty("contentOffset", args[0]);
				proxy.onPropertyChanged("contentOffset", args[0]);
				return Undefined.instance;
			case Id_getCanCancelEvents:
				return proxy.getProperty("canCancelEvents");
			case Id_setCanCancelEvents:
				proxy.setProperty("canCancelEvents", args[0]);
				proxy.onPropertyChanged("canCancelEvents", args[0]);
				return Undefined.instance;
			case Id_setScrollingEnabled:
				 setScrollingEnabled(cx, thisObj, args);
				return Undefined.instance;
			case Id_getScrollingEnabled:
				return getScrollingEnabled(cx, thisObj, args);
				
			case Id_scrollTo:
				 scrollTo(cx, thisObj, args);
				return Undefined.instance;
			case Id_scrollToBottom:
				 scrollToBottom(cx, thisObj, args);
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
		;

	// Property accessor IDs
	private static final int

		Id_contentHeight = 2
		,		
		Id_contentWidth = 3
		,		
		Id_showHorizontalScrollIndicator = 4
		,		
		Id_showVerticalScrollIndicator = 5
		,		
		Id_scrollType = 6
		,		
		Id_contentOffset = 7
		,		
		Id_canCancelEvents = 8
		;

;

	public static final int MAX_INSTANCE_ID = 8;

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
            case 10: X="scrollType";id=Id_scrollType; break L;
            case 12: X="contentWidth";id=Id_contentWidth; break L;
            case 13: c=s.charAt(7);
                if (c=='H') { X="contentHeight";id=Id_contentHeight; }
                else if (c=='O') { X="contentOffset";id=Id_contentOffset; }
                break L;
            case 15: X="canCancelEvents";id=Id_canCancelEvents; break L;
            case 16: X="scrollingEnabled";id=Id_scrollingEnabled; break L;
            case 27: X="showVerticalScrollIndicator";id=Id_showVerticalScrollIndicator; break L;
            case 29: X="showHorizontalScrollIndicator";id=Id_showHorizontalScrollIndicator; break L;
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
			case Id_contentHeight:
				return "contentHeight";
			case Id_contentWidth:
				return "contentWidth";
			case Id_showHorizontalScrollIndicator:
				return "showHorizontalScrollIndicator";
			case Id_showVerticalScrollIndicator:
				return "showVerticalScrollIndicator";
			case Id_scrollType:
				return "scrollType";
			case Id_contentOffset:
				return "contentOffset";
			case Id_canCancelEvents:
				return "canCancelEvents";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ScrollViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof ScrollViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ScrollViewProxyPrototype) {
			proxy = (ScrollViewProxyPrototype) start;
		}

		switch (id) {
			case Id_scrollingEnabled:
				return proxy.getter_scrollingEnabled();
			case Id_contentHeight:
				return proxy.getProperty("contentHeight");
			case Id_contentWidth:
				return proxy.getProperty("contentWidth");
			case Id_showHorizontalScrollIndicator:
				return proxy.getProperty("showHorizontalScrollIndicator");
			case Id_showVerticalScrollIndicator:
				return proxy.getProperty("showVerticalScrollIndicator");
			case Id_scrollType:
				return proxy.getProperty("scrollType");
			case Id_contentOffset:
				return proxy.getProperty("contentOffset");
			case Id_canCancelEvents:
				return proxy.getProperty("canCancelEvents");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ScrollViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof ScrollViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ScrollViewProxyPrototype) {
			proxy = (ScrollViewProxyPrototype) start;
		}

		switch (id) {
			case Id_scrollingEnabled:
				proxy.setter_scrollingEnabled(value);
				break; 
			case Id_contentHeight:
				proxy.setProperty("contentHeight", value);
				proxy.onPropertyChanged("contentHeight", value);
				break;
			case Id_contentWidth:
				proxy.setProperty("contentWidth", value);
				proxy.onPropertyChanged("contentWidth", value);
				break;
			case Id_showHorizontalScrollIndicator:
				proxy.setProperty("showHorizontalScrollIndicator", value);
				proxy.onPropertyChanged("showHorizontalScrollIndicator", value);
				break;
			case Id_showVerticalScrollIndicator:
				proxy.setProperty("showVerticalScrollIndicator", value);
				proxy.onPropertyChanged("showVerticalScrollIndicator", value);
				break;
			case Id_scrollType:
				proxy.setProperty("scrollType", value);
				proxy.onPropertyChanged("scrollType", value);
				break;
			case Id_contentOffset:
				proxy.setProperty("contentOffset", value);
				proxy.onPropertyChanged("contentOffset", value);
				break;
			case Id_canCancelEvents:
				proxy.setProperty("canCancelEvents", value);
				proxy.onPropertyChanged("canCancelEvents", value);
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
