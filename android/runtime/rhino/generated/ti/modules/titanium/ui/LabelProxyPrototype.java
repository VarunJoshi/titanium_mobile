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

import ti.modules.titanium.ui.LabelProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class LabelProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = -4718201567607479306L;

	private static final String TAG = "LabelProxyPrototype";
	private static final String CLASS_TAG = "LabelProxy";
	private static LabelProxyPrototype labelProxyPrototype;


	public static LabelProxyPrototype getProxyPrototype()
	{
		return labelProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		labelProxyPrototype = null;
	}

	public LabelProxyPrototype()
	{
		if (labelProxyPrototype == null && getClass().equals(LabelProxyPrototype.class)) {
			labelProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == labelProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return labelProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(LabelProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods

	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getAutoLink = 2,
		Id_setAutoLink = 3,
		Id_getColor = 4,
		Id_setColor = 5,
		Id_getEllipsize = 6,
		Id_setEllipsize = 7,
		Id_getFont = 8,
		Id_setFont = 9,
		Id_getHighlightedColor = 10,
		Id_setHighlightedColor = 11,
		Id_getHtml = 12,
		Id_setHtml = 13,
		Id_getText = 14,
		Id_setText = 15,
		Id_getTextAlign = 16,
		Id_setTextAlign = 17,
		Id_getTextid = 18,
		Id_setTextid = 19,
		Id_getWordWrap = 20,
		Id_setWordWrap = 21,
		Id_getVerticalAlign = 22,
		Id_setVerticalAlign = 23
		// Method IDs
;
		

	public static final int MAX_PROTOTYPE_ID = 23;

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
            case 7: c=s.charAt(3);
                if (c=='F') {
                    c=s.charAt(0);
                    if (c=='g') { X="getFont";id=Id_getFont; }
                    else if (c=='s') { X="setFont";id=Id_setFont; }
                }
                else if (c=='H') {
                    c=s.charAt(0);
                    if (c=='g') { X="getHtml";id=Id_getHtml; }
                    else if (c=='s') { X="setHtml";id=Id_setHtml; }
                }
                else if (c=='T') {
                    c=s.charAt(0);
                    if (c=='g') { X="getText";id=Id_getText; }
                    else if (c=='s') { X="setText";id=Id_setText; }
                }
                break L;
            case 8: c=s.charAt(0);
                if (c=='g') { X="getColor";id=Id_getColor; }
                else if (c=='s') { X="setColor";id=Id_setColor; }
                break L;
            case 9: c=s.charAt(0);
                if (c=='g') { X="getTextid";id=Id_getTextid; }
                else if (c=='s') { X="setTextid";id=Id_setTextid; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') {
                    c=s.charAt(10);
                    if (c=='k') { X="getAutoLink";id=Id_getAutoLink; }
                    else if (c=='p') { X="getWordWrap";id=Id_getWordWrap; }
                }
                else if (c=='s') {
                    c=s.charAt(10);
                    if (c=='k') { X="setAutoLink";id=Id_setAutoLink; }
                    else if (c=='p') { X="setWordWrap";id=Id_setWordWrap; }
                }
                break L;
            case 12: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(11);
                    if (c=='e') { X="getEllipsize";id=Id_getEllipsize; }
                    else if (c=='n') { X="getTextAlign";id=Id_getTextAlign; }
                }
                else if (c=='s') {
                    c=s.charAt(11);
                    if (c=='e') { X="setEllipsize";id=Id_setEllipsize; }
                    else if (c=='n') { X="setTextAlign";id=Id_setTextAlign; }
                }
                break L;
            case 16: c=s.charAt(0);
                if (c=='g') { X="getVerticalAlign";id=Id_getVerticalAlign; }
                else if (c=='s') { X="setVerticalAlign";id=Id_setVerticalAlign; }
                break L;
            case 19: c=s.charAt(0);
                if (c=='g') { X="getHighlightedColor";id=Id_getHighlightedColor; }
                else if (c=='s') { X="setHighlightedColor";id=Id_setHighlightedColor; }
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
			case Id_getAutoLink:
				arity = 0;
				name = "getAutoLink";
				break;
			case Id_setAutoLink:
				arity = 1;
				name = "setAutoLink";
				break;
			case Id_getColor:
				arity = 0;
				name = "getColor";
				break;
			case Id_setColor:
				arity = 1;
				name = "setColor";
				break;
			case Id_getEllipsize:
				arity = 0;
				name = "getEllipsize";
				break;
			case Id_setEllipsize:
				arity = 1;
				name = "setEllipsize";
				break;
			case Id_getFont:
				arity = 0;
				name = "getFont";
				break;
			case Id_setFont:
				arity = 1;
				name = "setFont";
				break;
			case Id_getHighlightedColor:
				arity = 0;
				name = "getHighlightedColor";
				break;
			case Id_setHighlightedColor:
				arity = 1;
				name = "setHighlightedColor";
				break;
			case Id_getHtml:
				arity = 0;
				name = "getHtml";
				break;
			case Id_setHtml:
				arity = 1;
				name = "setHtml";
				break;
			case Id_getText:
				arity = 0;
				name = "getText";
				break;
			case Id_setText:
				arity = 1;
				name = "setText";
				break;
			case Id_getTextAlign:
				arity = 0;
				name = "getTextAlign";
				break;
			case Id_setTextAlign:
				arity = 1;
				name = "setTextAlign";
				break;
			case Id_getTextid:
				arity = 0;
				name = "getTextid";
				break;
			case Id_setTextid:
				arity = 1;
				name = "setTextid";
				break;
			case Id_getWordWrap:
				arity = 0;
				name = "getWordWrap";
				break;
			case Id_setWordWrap:
				arity = 1;
				name = "setWordWrap";
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

		while (thisObj != null && !(thisObj instanceof LabelProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		LabelProxyPrototype proxy = (LabelProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getAutoLink:
				return proxy.getProperty("autoLink");
			case Id_setAutoLink:
				proxy.setProperty("autoLink", args[0]);
				proxy.onPropertyChanged("autoLink", args[0]);
				return Undefined.instance;
			case Id_getColor:
				return proxy.getProperty("color");
			case Id_setColor:
				proxy.setProperty("color", args[0]);
				proxy.onPropertyChanged("color", args[0]);
				return Undefined.instance;
			case Id_getEllipsize:
				return proxy.getProperty("ellipsize");
			case Id_setEllipsize:
				proxy.setProperty("ellipsize", args[0]);
				proxy.onPropertyChanged("ellipsize", args[0]);
				return Undefined.instance;
			case Id_getFont:
				return proxy.getProperty("font");
			case Id_setFont:
				proxy.setProperty("font", args[0]);
				proxy.onPropertyChanged("font", args[0]);
				return Undefined.instance;
			case Id_getHighlightedColor:
				return proxy.getProperty("highlightedColor");
			case Id_setHighlightedColor:
				proxy.setProperty("highlightedColor", args[0]);
				proxy.onPropertyChanged("highlightedColor", args[0]);
				return Undefined.instance;
			case Id_getHtml:
				return proxy.getProperty("html");
			case Id_setHtml:
				proxy.setProperty("html", args[0]);
				proxy.onPropertyChanged("html", args[0]);
				return Undefined.instance;
			case Id_getText:
				return proxy.getProperty("text");
			case Id_setText:
				proxy.setProperty("text", args[0]);
				proxy.onPropertyChanged("text", args[0]);
				return Undefined.instance;
			case Id_getTextAlign:
				return proxy.getProperty("textAlign");
			case Id_setTextAlign:
				proxy.setProperty("textAlign", args[0]);
				proxy.onPropertyChanged("textAlign", args[0]);
				return Undefined.instance;
			case Id_getTextid:
				return proxy.getProperty("textid");
			case Id_setTextid:
				proxy.setProperty("textid", args[0]);
				proxy.onPropertyChanged("textid", args[0]);
				return Undefined.instance;
			case Id_getWordWrap:
				return proxy.getProperty("wordWrap");
			case Id_setWordWrap:
				proxy.setProperty("wordWrap", args[0]);
				proxy.onPropertyChanged("wordWrap", args[0]);
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

		Id_autoLink = 1
		,		
		Id_color = 2
		,		
		Id_ellipsize = 3
		,		
		Id_font = 4
		,		
		Id_highlightedColor = 5
		,		
		Id_html = 6
		,		
		Id_text = 7
		,		
		Id_textAlign = 8
		,		
		Id_textid = 9
		,		
		Id_wordWrap = 10
		,		
		Id_verticalAlign = 11
		;

;

	public static final int MAX_INSTANCE_ID = 11;

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
            case 4: c=s.charAt(0);
                if (c=='f') { X="font";id=Id_font; }
                else if (c=='h') { X="html";id=Id_html; }
                else if (c=='t') { X="text";id=Id_text; }
                break L;
            case 5: X="color";id=Id_color; break L;
            case 6: X="textid";id=Id_textid; break L;
            case 8: c=s.charAt(0);
                if (c=='a') { X="autoLink";id=Id_autoLink; }
                else if (c=='w') { X="wordWrap";id=Id_wordWrap; }
                break L;
            case 9: c=s.charAt(0);
                if (c=='e') { X="ellipsize";id=Id_ellipsize; }
                else if (c=='t') { X="textAlign";id=Id_textAlign; }
                break L;
            case 13: X="verticalAlign";id=Id_verticalAlign; break L;
            case 16: X="highlightedColor";id=Id_highlightedColor; break L;
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
			case Id_autoLink:
				return "autoLink";
			case Id_color:
				return "color";
			case Id_ellipsize:
				return "ellipsize";
			case Id_font:
				return "font";
			case Id_highlightedColor:
				return "highlightedColor";
			case Id_html:
				return "html";
			case Id_text:
				return "text";
			case Id_textAlign:
				return "textAlign";
			case Id_textid:
				return "textid";
			case Id_wordWrap:
				return "wordWrap";
			case Id_verticalAlign:
				return "verticalAlign";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		LabelProxyPrototype proxy = this;
		while (start != null && !(start instanceof LabelProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof LabelProxyPrototype) {
			proxy = (LabelProxyPrototype) start;
		}

		switch (id) {
			case Id_autoLink:
				return proxy.getProperty("autoLink");
			case Id_color:
				return proxy.getProperty("color");
			case Id_ellipsize:
				return proxy.getProperty("ellipsize");
			case Id_font:
				return proxy.getProperty("font");
			case Id_highlightedColor:
				return proxy.getProperty("highlightedColor");
			case Id_html:
				return proxy.getProperty("html");
			case Id_text:
				return proxy.getProperty("text");
			case Id_textAlign:
				return proxy.getProperty("textAlign");
			case Id_textid:
				return proxy.getProperty("textid");
			case Id_wordWrap:
				return proxy.getProperty("wordWrap");
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
		LabelProxyPrototype proxy = this;
		while (start != null && !(start instanceof LabelProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof LabelProxyPrototype) {
			proxy = (LabelProxyPrototype) start;
		}

		switch (id) {
			case Id_autoLink:
				proxy.setProperty("autoLink", value);
				proxy.onPropertyChanged("autoLink", value);
				break;
			case Id_color:
				proxy.setProperty("color", value);
				proxy.onPropertyChanged("color", value);
				break;
			case Id_ellipsize:
				proxy.setProperty("ellipsize", value);
				proxy.onPropertyChanged("ellipsize", value);
				break;
			case Id_font:
				proxy.setProperty("font", value);
				proxy.onPropertyChanged("font", value);
				break;
			case Id_highlightedColor:
				proxy.setProperty("highlightedColor", value);
				proxy.onPropertyChanged("highlightedColor", value);
				break;
			case Id_html:
				proxy.setProperty("html", value);
				proxy.onPropertyChanged("html", value);
				break;
			case Id_text:
				proxy.setProperty("text", value);
				proxy.onPropertyChanged("text", value);
				break;
			case Id_textAlign:
				proxy.setProperty("textAlign", value);
				proxy.onPropertyChanged("textAlign", value);
				break;
			case Id_textid:
				proxy.setProperty("textid", value);
				proxy.onPropertyChanged("textid", value);
				break;
			case Id_wordWrap:
				proxy.setProperty("wordWrap", value);
				proxy.onPropertyChanged("wordWrap", value);
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
