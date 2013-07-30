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

import ti.modules.titanium.ui.TableViewRowProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class TableViewRowProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = 2253898237403621715L;

	private static final String TAG = "TableViewRowProxyPrototype";
	private static final String CLASS_TAG = "TableViewRowProxy";
	private static TableViewRowProxyPrototype tableViewRowProxyPrototype;


	public static TableViewRowProxyPrototype getProxyPrototype()
	{
		return tableViewRowProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		tableViewRowProxyPrototype = null;
	}

	public TableViewRowProxyPrototype()
	{
		if (tableViewRowProxyPrototype == null && getClass().equals(TableViewRowProxyPrototype.class)) {
			tableViewRowProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == tableViewRowProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return tableViewRowProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TableViewRowProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getHasCheck = 2,
		Id_setHasCheck = 3,
		Id_getHasChild = 4,
		Id_setHasChild = 5,
		Id_getClassName = 6,
		Id_setClassName = 7,
		Id_getLayout = 8,
		Id_setLayout = 9,
		Id_getLeftImage = 10,
		Id_setLeftImage = 11,
		Id_getRightImage = 12,
		Id_setRightImage = 13,
		Id_getTitle = 14,
		Id_setTitle = 15,
		Id_getHeader = 16,
		Id_setHeader = 17,
		Id_getFooter = 18,
		Id_setFooter = 19
		// Method IDs
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
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 8: c=s.charAt(0);
                if (c=='g') { X="getTitle";id=Id_getTitle; }
                else if (c=='s') { X="setTitle";id=Id_setTitle; }
                break L;
            case 9: c=s.charAt(3);
                if (c=='F') {
                    c=s.charAt(0);
                    if (c=='g') { X="getFooter";id=Id_getFooter; }
                    else if (c=='s') { X="setFooter";id=Id_setFooter; }
                }
                else if (c=='H') {
                    c=s.charAt(0);
                    if (c=='g') { X="getHeader";id=Id_getHeader; }
                    else if (c=='s') { X="setHeader";id=Id_setHeader; }
                }
                else if (c=='L') {
                    c=s.charAt(0);
                    if (c=='g') { X="getLayout";id=Id_getLayout; }
                    else if (c=='s') { X="setLayout";id=Id_setLayout; }
                }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') {
                    c=s.charAt(10);
                    if (c=='d') { X="getHasChild";id=Id_getHasChild; }
                    else if (c=='k') { X="getHasCheck";id=Id_getHasCheck; }
                }
                else if (c=='s') {
                    c=s.charAt(10);
                    if (c=='d') { X="setHasChild";id=Id_setHasChild; }
                    else if (c=='k') { X="setHasCheck";id=Id_setHasCheck; }
                }
                break L;
            case 12: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(3);
                    if (c=='C') { X="getClassName";id=Id_getClassName; }
                    else if (c=='L') { X="getLeftImage";id=Id_getLeftImage; }
                }
                else if (c=='s') {
                    c=s.charAt(3);
                    if (c=='C') { X="setClassName";id=Id_setClassName; }
                    else if (c=='L') { X="setLeftImage";id=Id_setLeftImage; }
                }
                break L;
            case 13: c=s.charAt(0);
                if (c=='g') { X="getRightImage";id=Id_getRightImage; }
                else if (c=='s') { X="setRightImage";id=Id_setRightImage; }
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
			case Id_getHasCheck:
				arity = 0;
				name = "getHasCheck";
				break;
			case Id_setHasCheck:
				arity = 1;
				name = "setHasCheck";
				break;
			case Id_getHasChild:
				arity = 0;
				name = "getHasChild";
				break;
			case Id_setHasChild:
				arity = 1;
				name = "setHasChild";
				break;
			case Id_getClassName:
				arity = 0;
				name = "getClassName";
				break;
			case Id_setClassName:
				arity = 1;
				name = "setClassName";
				break;
			case Id_getLayout:
				arity = 0;
				name = "getLayout";
				break;
			case Id_setLayout:
				arity = 1;
				name = "setLayout";
				break;
			case Id_getLeftImage:
				arity = 0;
				name = "getLeftImage";
				break;
			case Id_setLeftImage:
				arity = 1;
				name = "setLeftImage";
				break;
			case Id_getRightImage:
				arity = 0;
				name = "getRightImage";
				break;
			case Id_setRightImage:
				arity = 1;
				name = "setRightImage";
				break;
			case Id_getTitle:
				arity = 0;
				name = "getTitle";
				break;
			case Id_setTitle:
				arity = 1;
				name = "setTitle";
				break;
			case Id_getHeader:
				arity = 0;
				name = "getHeader";
				break;
			case Id_setHeader:
				arity = 1;
				name = "setHeader";
				break;
			case Id_getFooter:
				arity = 0;
				name = "getFooter";
				break;
			case Id_setFooter:
				arity = 1;
				name = "setFooter";
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

		while (thisObj != null && !(thisObj instanceof TableViewRowProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TableViewRowProxyPrototype proxy = (TableViewRowProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getHasCheck:
				return proxy.getProperty("hasCheck");
			case Id_setHasCheck:
				proxy.setProperty("hasCheck", args[0]);
				proxy.onPropertyChanged("hasCheck", args[0]);
				return Undefined.instance;
			case Id_getHasChild:
				return proxy.getProperty("hasChild");
			case Id_setHasChild:
				proxy.setProperty("hasChild", args[0]);
				proxy.onPropertyChanged("hasChild", args[0]);
				return Undefined.instance;
			case Id_getClassName:
				return proxy.getProperty("className");
			case Id_setClassName:
				proxy.setProperty("className", args[0]);
				proxy.onPropertyChanged("className", args[0]);
				return Undefined.instance;
			case Id_getLayout:
				return proxy.getProperty("layout");
			case Id_setLayout:
				proxy.setProperty("layout", args[0]);
				proxy.onPropertyChanged("layout", args[0]);
				return Undefined.instance;
			case Id_getLeftImage:
				return proxy.getProperty("leftImage");
			case Id_setLeftImage:
				proxy.setProperty("leftImage", args[0]);
				proxy.onPropertyChanged("leftImage", args[0]);
				return Undefined.instance;
			case Id_getRightImage:
				return proxy.getProperty("rightImage");
			case Id_setRightImage:
				proxy.setProperty("rightImage", args[0]);
				proxy.onPropertyChanged("rightImage", args[0]);
				return Undefined.instance;
			case Id_getTitle:
				return proxy.getProperty("title");
			case Id_setTitle:
				proxy.setProperty("title", args[0]);
				proxy.onPropertyChanged("title", args[0]);
				return Undefined.instance;
			case Id_getHeader:
				return proxy.getProperty("header");
			case Id_setHeader:
				proxy.setProperty("header", args[0]);
				proxy.onPropertyChanged("header", args[0]);
				return Undefined.instance;
			case Id_getFooter:
				return proxy.getProperty("footer");
			case Id_setFooter:
				proxy.setProperty("footer", args[0]);
				proxy.onPropertyChanged("footer", args[0]);
				return Undefined.instance;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
;

	// Property accessor IDs
	private static final int

		Id_hasCheck = 1
		,		
		Id_hasChild = 2
		,		
		Id_className = 3
		,		
		Id_layout = 4
		,		
		Id_leftImage = 5
		,		
		Id_rightImage = 6
		,		
		Id_title = 7
		,		
		Id_header = 8
		,		
		Id_footer = 9
		;

;

	public static final int MAX_INSTANCE_ID = 9;

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
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 5: X="title";id=Id_title; break L;
            case 6: c=s.charAt(0);
                if (c=='f') { X="footer";id=Id_footer; }
                else if (c=='h') { X="header";id=Id_header; }
                else if (c=='l') { X="layout";id=Id_layout; }
                break L;
            case 8: c=s.charAt(5);
                if (c=='e') { X="hasCheck";id=Id_hasCheck; }
                else if (c=='i') { X="hasChild";id=Id_hasChild; }
                break L;
            case 9: c=s.charAt(0);
                if (c=='c') { X="className";id=Id_className; }
                else if (c=='l') { X="leftImage";id=Id_leftImage; }
                break L;
            case 10: X="rightImage";id=Id_rightImage; break L;
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
			case Id_hasCheck:
				return "hasCheck";
			case Id_hasChild:
				return "hasChild";
			case Id_className:
				return "className";
			case Id_layout:
				return "layout";
			case Id_leftImage:
				return "leftImage";
			case Id_rightImage:
				return "rightImage";
			case Id_title:
				return "title";
			case Id_header:
				return "header";
			case Id_footer:
				return "footer";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TableViewRowProxyPrototype proxy = this;
		while (start != null && !(start instanceof TableViewRowProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TableViewRowProxyPrototype) {
			proxy = (TableViewRowProxyPrototype) start;
		}

		switch (id) {
			case Id_hasCheck:
				return proxy.getProperty("hasCheck");
			case Id_hasChild:
				return proxy.getProperty("hasChild");
			case Id_className:
				return proxy.getProperty("className");
			case Id_layout:
				return proxy.getProperty("layout");
			case Id_leftImage:
				return proxy.getProperty("leftImage");
			case Id_rightImage:
				return proxy.getProperty("rightImage");
			case Id_title:
				return proxy.getProperty("title");
			case Id_header:
				return proxy.getProperty("header");
			case Id_footer:
				return proxy.getProperty("footer");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		TableViewRowProxyPrototype proxy = this;
		while (start != null && !(start instanceof TableViewRowProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TableViewRowProxyPrototype) {
			proxy = (TableViewRowProxyPrototype) start;
		}

		switch (id) {
			case Id_hasCheck:
				proxy.setProperty("hasCheck", value);
				proxy.onPropertyChanged("hasCheck", value);
				break;
			case Id_hasChild:
				proxy.setProperty("hasChild", value);
				proxy.onPropertyChanged("hasChild", value);
				break;
			case Id_className:
				proxy.setProperty("className", value);
				proxy.onPropertyChanged("className", value);
				break;
			case Id_layout:
				proxy.setProperty("layout", value);
				proxy.onPropertyChanged("layout", value);
				break;
			case Id_leftImage:
				proxy.setProperty("leftImage", value);
				proxy.onPropertyChanged("leftImage", value);
				break;
			case Id_rightImage:
				proxy.setProperty("rightImage", value);
				proxy.onPropertyChanged("rightImage", value);
				break;
			case Id_title:
				proxy.setProperty("title", value);
				proxy.onPropertyChanged("title", value);
				break;
			case Id_header:
				proxy.setProperty("header", value);
				proxy.onPropertyChanged("header", value);
				break;
			case Id_footer:
				proxy.setProperty("footer", value);
				proxy.onPropertyChanged("footer", value);
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
