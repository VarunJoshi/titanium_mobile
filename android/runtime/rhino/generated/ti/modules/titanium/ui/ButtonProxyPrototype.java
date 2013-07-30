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

import ti.modules.titanium.ui.ButtonProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class ButtonProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = 4860108722424321341L;

	private static final String TAG = "ButtonProxyPrototype";
	private static final String CLASS_TAG = "ButtonProxy";
	private static ButtonProxyPrototype buttonProxyPrototype;


	public static ButtonProxyPrototype getProxyPrototype()
	{
		return buttonProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		buttonProxyPrototype = null;
	}

	public ButtonProxyPrototype()
	{
		if (buttonProxyPrototype == null && getClass().equals(ButtonProxyPrototype.class)) {
			buttonProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == buttonProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return buttonProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ButtonProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getTitle = 2,
		Id_setTitle = 3,
		Id_getTitleid = 4,
		Id_setTitleid = 5,
		Id_getColor = 6,
		Id_setColor = 7,
		Id_getEnabled = 8,
		Id_setEnabled = 9,
		Id_getFont = 10,
		Id_setFont = 11,
		Id_getImage = 12,
		Id_setImage = 13,
		Id_getTextAlign = 14,
		Id_setTextAlign = 15,
		Id_getVerticalAlign = 16,
		Id_setVerticalAlign = 17
		// Method IDs
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
            case 7: c=s.charAt(0);
                if (c=='g') { X="getFont";id=Id_getFont; }
                else if (c=='s') { X="setFont";id=Id_setFont; }
                break L;
            case 8: c=s.charAt(3);
                if (c=='C') {
                    c=s.charAt(0);
                    if (c=='g') { X="getColor";id=Id_getColor; }
                    else if (c=='s') { X="setColor";id=Id_setColor; }
                }
                else if (c=='I') {
                    c=s.charAt(0);
                    if (c=='g') { X="getImage";id=Id_getImage; }
                    else if (c=='s') { X="setImage";id=Id_setImage; }
                }
                else if (c=='T') {
                    c=s.charAt(0);
                    if (c=='g') { X="getTitle";id=Id_getTitle; }
                    else if (c=='s') { X="setTitle";id=Id_setTitle; }
                }
                break L;
            case 10: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(3);
                    if (c=='E') { X="getEnabled";id=Id_getEnabled; }
                    else if (c=='T') { X="getTitleid";id=Id_getTitleid; }
                }
                else if (c=='s') {
                    c=s.charAt(3);
                    if (c=='E') { X="setEnabled";id=Id_setEnabled; }
                    else if (c=='T') { X="setTitleid";id=Id_setTitleid; }
                }
                break L;
            case 11: X="constructor";id=Id_constructor; break L;
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
			case Id_getTitle:
				arity = 0;
				name = "getTitle";
				break;
			case Id_setTitle:
				arity = 1;
				name = "setTitle";
				break;
			case Id_getTitleid:
				arity = 0;
				name = "getTitleid";
				break;
			case Id_setTitleid:
				arity = 1;
				name = "setTitleid";
				break;
			case Id_getColor:
				arity = 0;
				name = "getColor";
				break;
			case Id_setColor:
				arity = 1;
				name = "setColor";
				break;
			case Id_getEnabled:
				arity = 0;
				name = "getEnabled";
				break;
			case Id_setEnabled:
				arity = 1;
				name = "setEnabled";
				break;
			case Id_getFont:
				arity = 0;
				name = "getFont";
				break;
			case Id_setFont:
				arity = 1;
				name = "setFont";
				break;
			case Id_getImage:
				arity = 0;
				name = "getImage";
				break;
			case Id_setImage:
				arity = 1;
				name = "setImage";
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

		while (thisObj != null && !(thisObj instanceof ButtonProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ButtonProxyPrototype proxy = (ButtonProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getTitle:
				return proxy.getProperty("title");
			case Id_setTitle:
				proxy.setProperty("title", args[0]);
				proxy.onPropertyChanged("title", args[0]);
				return Undefined.instance;
			case Id_getTitleid:
				return proxy.getProperty("titleid");
			case Id_setTitleid:
				proxy.setProperty("titleid", args[0]);
				proxy.onPropertyChanged("titleid", args[0]);
				return Undefined.instance;
			case Id_getColor:
				return proxy.getProperty("color");
			case Id_setColor:
				proxy.setProperty("color", args[0]);
				proxy.onPropertyChanged("color", args[0]);
				return Undefined.instance;
			case Id_getEnabled:
				return proxy.getProperty("enabled");
			case Id_setEnabled:
				proxy.setProperty("enabled", args[0]);
				proxy.onPropertyChanged("enabled", args[0]);
				return Undefined.instance;
			case Id_getFont:
				return proxy.getProperty("font");
			case Id_setFont:
				proxy.setProperty("font", args[0]);
				proxy.onPropertyChanged("font", args[0]);
				return Undefined.instance;
			case Id_getImage:
				return proxy.getProperty("image");
			case Id_setImage:
				proxy.setProperty("image", args[0]);
				proxy.onPropertyChanged("image", args[0]);
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

		Id_title = 1
		,		
		Id_titleid = 2
		,		
		Id_color = 3
		,		
		Id_enabled = 4
		,		
		Id_font = 5
		,		
		Id_image = 6
		,		
		Id_textAlign = 7
		,		
		Id_verticalAlign = 8
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
            case 4: X="font";id=Id_font; break L;
            case 5: c=s.charAt(0);
                if (c=='c') { X="color";id=Id_color; }
                else if (c=='i') { X="image";id=Id_image; }
                else if (c=='t') { X="title";id=Id_title; }
                break L;
            case 7: c=s.charAt(0);
                if (c=='e') { X="enabled";id=Id_enabled; }
                else if (c=='t') { X="titleid";id=Id_titleid; }
                break L;
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
			case Id_title:
				return "title";
			case Id_titleid:
				return "titleid";
			case Id_color:
				return "color";
			case Id_enabled:
				return "enabled";
			case Id_font:
				return "font";
			case Id_image:
				return "image";
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
		ButtonProxyPrototype proxy = this;
		while (start != null && !(start instanceof ButtonProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ButtonProxyPrototype) {
			proxy = (ButtonProxyPrototype) start;
		}

		switch (id) {
			case Id_title:
				return proxy.getProperty("title");
			case Id_titleid:
				return proxy.getProperty("titleid");
			case Id_color:
				return proxy.getProperty("color");
			case Id_enabled:
				return proxy.getProperty("enabled");
			case Id_font:
				return proxy.getProperty("font");
			case Id_image:
				return proxy.getProperty("image");
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
		ButtonProxyPrototype proxy = this;
		while (start != null && !(start instanceof ButtonProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ButtonProxyPrototype) {
			proxy = (ButtonProxyPrototype) start;
		}

		switch (id) {
			case Id_title:
				proxy.setProperty("title", value);
				proxy.onPropertyChanged("title", value);
				break;
			case Id_titleid:
				proxy.setProperty("titleid", value);
				proxy.onPropertyChanged("titleid", value);
				break;
			case Id_color:
				proxy.setProperty("color", value);
				proxy.onPropertyChanged("color", value);
				break;
			case Id_enabled:
				proxy.setProperty("enabled", value);
				proxy.onPropertyChanged("enabled", value);
				break;
			case Id_font:
				proxy.setProperty("font", value);
				proxy.onPropertyChanged("font", value);
				break;
			case Id_image:
				proxy.setProperty("image", value);
				proxy.onPropertyChanged("image", value);
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
