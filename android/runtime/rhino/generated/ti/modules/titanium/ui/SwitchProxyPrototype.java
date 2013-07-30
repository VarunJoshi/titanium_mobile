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

import ti.modules.titanium.ui.SwitchProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class SwitchProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = -3178086382216747692L;

	private static final String TAG = "SwitchProxyPrototype";
	private static final String CLASS_TAG = "SwitchProxy";
	private static SwitchProxyPrototype switchProxyPrototype;


	public static SwitchProxyPrototype getProxyPrototype()
	{
		return switchProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		switchProxyPrototype = null;
	}

	public SwitchProxyPrototype()
	{
		if (switchProxyPrototype == null && getClass().equals(SwitchProxyPrototype.class)) {
			switchProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == switchProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return switchProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(SwitchProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getValue = 2,
		Id_setValue = 3,
		Id_getStyle = 4,
		Id_setStyle = 5,
		Id_getTitle = 6,
		Id_setTitle = 7,
		Id_getTitleOn = 8,
		Id_setTitleOn = 9,
		Id_getTitleOff = 10,
		Id_setTitleOff = 11,
		Id_getColor = 12,
		Id_setColor = 13,
		Id_getFont = 14,
		Id_setFont = 15,
		Id_getTextAlign = 16,
		Id_setTextAlign = 17,
		Id_getVerticalAlign = 18,
		Id_setVerticalAlign = 19
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
            case 7: c=s.charAt(0);
                if (c=='g') { X="getFont";id=Id_getFont; }
                else if (c=='s') { X="setFont";id=Id_setFont; }
                break L;
            case 8: switch (s.charAt(3)) {
                case 'C': c=s.charAt(0);
                    if (c=='g') { X="getColor";id=Id_getColor; }
                    else if (c=='s') { X="setColor";id=Id_setColor; }
                    break L;
                case 'S': c=s.charAt(0);
                    if (c=='g') { X="getStyle";id=Id_getStyle; }
                    else if (c=='s') { X="setStyle";id=Id_setStyle; }
                    break L;
                case 'T': c=s.charAt(0);
                    if (c=='g') { X="getTitle";id=Id_getTitle; }
                    else if (c=='s') { X="setTitle";id=Id_setTitle; }
                    break L;
                case 'V': c=s.charAt(0);
                    if (c=='g') { X="getValue";id=Id_getValue; }
                    else if (c=='s') { X="setValue";id=Id_setValue; }
                    break L;
                } break L;
            case 10: c=s.charAt(0);
                if (c=='g') { X="getTitleOn";id=Id_getTitleOn; }
                else if (c=='s') { X="setTitleOn";id=Id_setTitleOn; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') { X="getTitleOff";id=Id_getTitleOff; }
                else if (c=='s') { X="setTitleOff";id=Id_setTitleOff; }
                break L;
            case 12: c=s.charAt(0);
                if (c=='g') { X="getTextAlign";id=Id_getTextAlign; }
                else if (c=='s') { X="setTextAlign";id=Id_setTextAlign; }
                break L;
            case 16: c=s.charAt(0);
                if (c=='g') { X="getVerticalAlign";id=Id_getVerticalAlign; }
                else if (c=='s') { X="setVerticalAlign";id=Id_setVerticalAlign; }
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
			case Id_getValue:
				arity = 0;
				name = "getValue";
				break;
			case Id_setValue:
				arity = 1;
				name = "setValue";
				break;
			case Id_getStyle:
				arity = 0;
				name = "getStyle";
				break;
			case Id_setStyle:
				arity = 1;
				name = "setStyle";
				break;
			case Id_getTitle:
				arity = 0;
				name = "getTitle";
				break;
			case Id_setTitle:
				arity = 1;
				name = "setTitle";
				break;
			case Id_getTitleOn:
				arity = 0;
				name = "getTitleOn";
				break;
			case Id_setTitleOn:
				arity = 1;
				name = "setTitleOn";
				break;
			case Id_getTitleOff:
				arity = 0;
				name = "getTitleOff";
				break;
			case Id_setTitleOff:
				arity = 1;
				name = "setTitleOff";
				break;
			case Id_getColor:
				arity = 0;
				name = "getColor";
				break;
			case Id_setColor:
				arity = 1;
				name = "setColor";
				break;
			case Id_getFont:
				arity = 0;
				name = "getFont";
				break;
			case Id_setFont:
				arity = 1;
				name = "setFont";
				break;
			case Id_getTextAlign:
				arity = 0;
				name = "getTextAlign";
				break;
			case Id_setTextAlign:
				arity = 1;
				name = "setTextAlign";
				break;
			case Id_getVerticalAlign:
				arity = 0;
				name = "getVerticalAlign";
				break;
			case Id_setVerticalAlign:
				arity = 1;
				name = "setVerticalAlign";
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

		while (thisObj != null && !(thisObj instanceof SwitchProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		SwitchProxyPrototype proxy = (SwitchProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getValue:
				return proxy.getProperty("value");
			case Id_setValue:
				proxy.setProperty("value", args[0]);
				proxy.onPropertyChanged("value", args[0]);
				return Undefined.instance;
			case Id_getStyle:
				return proxy.getProperty("style");
			case Id_setStyle:
				proxy.setProperty("style", args[0]);
				proxy.onPropertyChanged("style", args[0]);
				return Undefined.instance;
			case Id_getTitle:
				return proxy.getProperty("title");
			case Id_setTitle:
				proxy.setProperty("title", args[0]);
				proxy.onPropertyChanged("title", args[0]);
				return Undefined.instance;
			case Id_getTitleOn:
				return proxy.getProperty("titleOn");
			case Id_setTitleOn:
				proxy.setProperty("titleOn", args[0]);
				proxy.onPropertyChanged("titleOn", args[0]);
				return Undefined.instance;
			case Id_getTitleOff:
				return proxy.getProperty("titleOff");
			case Id_setTitleOff:
				proxy.setProperty("titleOff", args[0]);
				proxy.onPropertyChanged("titleOff", args[0]);
				return Undefined.instance;
			case Id_getColor:
				return proxy.getProperty("color");
			case Id_setColor:
				proxy.setProperty("color", args[0]);
				proxy.onPropertyChanged("color", args[0]);
				return Undefined.instance;
			case Id_getFont:
				return proxy.getProperty("font");
			case Id_setFont:
				proxy.setProperty("font", args[0]);
				proxy.onPropertyChanged("font", args[0]);
				return Undefined.instance;
			case Id_getTextAlign:
				return proxy.getProperty("textAlign");
			case Id_setTextAlign:
				proxy.setProperty("textAlign", args[0]);
				proxy.onPropertyChanged("textAlign", args[0]);
				return Undefined.instance;
			case Id_getVerticalAlign:
				return proxy.getProperty("verticalAlign");
			case Id_setVerticalAlign:
				proxy.setProperty("verticalAlign", args[0]);
				proxy.onPropertyChanged("verticalAlign", args[0]);
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

		Id_value = 1
		,		
		Id_style = 2
		,		
		Id_title = 3
		,		
		Id_titleOn = 4
		,		
		Id_titleOff = 5
		,		
		Id_color = 6
		,		
		Id_font = 7
		,		
		Id_textAlign = 8
		,		
		Id_verticalAlign = 9
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
        L0: { id = 0; String X = null;
            L: switch (s.length()) {
            case 4: X="font";id=Id_font; break L;
            case 5: switch (s.charAt(0)) {
                case 'c': X="color";id=Id_color; break L;
                case 's': X="style";id=Id_style; break L;
                case 't': X="title";id=Id_title; break L;
                case 'v': X="value";id=Id_value; break L;
                } break L;
            case 7: X="titleOn";id=Id_titleOn; break L;
            case 8: X="titleOff";id=Id_titleOff; break L;
            case 9: X="textAlign";id=Id_textAlign; break L;
            case 13: X="verticalAlign";id=Id_verticalAlign; break L;
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
			case Id_value:
				return "value";
			case Id_style:
				return "style";
			case Id_title:
				return "title";
			case Id_titleOn:
				return "titleOn";
			case Id_titleOff:
				return "titleOff";
			case Id_color:
				return "color";
			case Id_font:
				return "font";
			case Id_textAlign:
				return "textAlign";
			case Id_verticalAlign:
				return "verticalAlign";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		SwitchProxyPrototype proxy = this;
		while (start != null && !(start instanceof SwitchProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof SwitchProxyPrototype) {
			proxy = (SwitchProxyPrototype) start;
		}

		switch (id) {
			case Id_value:
				return proxy.getProperty("value");
			case Id_style:
				return proxy.getProperty("style");
			case Id_title:
				return proxy.getProperty("title");
			case Id_titleOn:
				return proxy.getProperty("titleOn");
			case Id_titleOff:
				return proxy.getProperty("titleOff");
			case Id_color:
				return proxy.getProperty("color");
			case Id_font:
				return proxy.getProperty("font");
			case Id_textAlign:
				return proxy.getProperty("textAlign");
			case Id_verticalAlign:
				return proxy.getProperty("verticalAlign");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		SwitchProxyPrototype proxy = this;
		while (start != null && !(start instanceof SwitchProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof SwitchProxyPrototype) {
			proxy = (SwitchProxyPrototype) start;
		}

		switch (id) {
			case Id_value:
				proxy.setProperty("value", value);
				proxy.onPropertyChanged("value", value);
				break;
			case Id_style:
				proxy.setProperty("style", value);
				proxy.onPropertyChanged("style", value);
				break;
			case Id_title:
				proxy.setProperty("title", value);
				proxy.onPropertyChanged("title", value);
				break;
			case Id_titleOn:
				proxy.setProperty("titleOn", value);
				proxy.onPropertyChanged("titleOn", value);
				break;
			case Id_titleOff:
				proxy.setProperty("titleOff", value);
				proxy.onPropertyChanged("titleOff", value);
				break;
			case Id_color:
				proxy.setProperty("color", value);
				proxy.onPropertyChanged("color", value);
				break;
			case Id_font:
				proxy.setProperty("font", value);
				proxy.onPropertyChanged("font", value);
				break;
			case Id_textAlign:
				proxy.setProperty("textAlign", value);
				proxy.onPropertyChanged("textAlign", value);
				break;
			case Id_verticalAlign:
				proxy.setProperty("verticalAlign", value);
				proxy.onPropertyChanged("verticalAlign", value);
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
