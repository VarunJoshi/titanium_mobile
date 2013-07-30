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

import ti.modules.titanium.ui.TextFieldProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class TextFieldProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = 2921743675648325413L;

	private static final String TAG = "TextFieldProxyPrototype";
	private static final String CLASS_TAG = "TextFieldProxy";
	private static TextFieldProxyPrototype textFieldProxyPrototype;


	public static TextFieldProxyPrototype getProxyPrototype()
	{
		return textFieldProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		textFieldProxyPrototype = null;
	}

	public TextFieldProxyPrototype()
	{
		if (textFieldProxyPrototype == null && getClass().equals(TextFieldProxyPrototype.class)) {
			textFieldProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == textFieldProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return textFieldProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TextFieldProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void setSelection(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setSelection()", Log.DEBUG_MODE);

		try {
		TextFieldProxy proxy = (TextFieldProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setSelection: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;

		proxy.setSelection(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object hasText(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "hasText()", Log.DEBUG_MODE);

		try {
		TextFieldProxy proxy = (TextFieldProxy) ((Proxy) thisObj).getProxy();

		java.lang.Boolean javaResult = proxy.hasText();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getAutocapitalization = 2,
		Id_setAutocapitalization = 3,
		Id_getAutocorrect = 4,
		Id_setAutocorrect = 5,
		Id_getAutoLink = 6,
		Id_setAutoLink = 7,
		Id_getClearOnEdit = 8,
		Id_setClearOnEdit = 9,
		Id_getColor = 10,
		Id_setColor = 11,
		Id_getEditable = 12,
		Id_setEditable = 13,
		Id_getEllipsize = 14,
		Id_setEllipsize = 15,
		Id_getEnableReturnKey = 16,
		Id_setEnableReturnKey = 17,
		Id_getFont = 18,
		Id_setFont = 19,
		Id_getHintText = 20,
		Id_setHintText = 21,
		Id_getKeyboardType = 22,
		Id_setKeyboardType = 23,
		Id_getMaxLength = 24,
		Id_setMaxLength = 25,
		Id_getPasswordMask = 26,
		Id_setPasswordMask = 27,
		Id_getTextAlign = 28,
		Id_setTextAlign = 29,
		Id_getValue = 30,
		Id_setValue = 31,
		Id_getVerticalAlign = 32,
		Id_setVerticalAlign = 33,
		Id_getReturnKeyType = 34,
		Id_setReturnKeyType = 35,
		// Method IDs
		Id_setSelection = 36,
		Id_hasText = 37
;
		

	public static final int MAX_PROTOTYPE_ID = 37;

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
                else if (c=='h') { X="hasText";id=Id_hasText; }
                else if (c=='s') { X="setFont";id=Id_setFont; }
                break L;
            case 8: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(7);
                    if (c=='e') { X="getValue";id=Id_getValue; }
                    else if (c=='r') { X="getColor";id=Id_getColor; }
                }
                else if (c=='s') {
                    c=s.charAt(7);
                    if (c=='e') { X="setValue";id=Id_setValue; }
                    else if (c=='r') { X="setColor";id=Id_setColor; }
                }
                break L;
            case 11: switch (s.charAt(3)) {
                case 'A': c=s.charAt(0);
                    if (c=='g') { X="getAutoLink";id=Id_getAutoLink; }
                    else if (c=='s') { X="setAutoLink";id=Id_setAutoLink; }
                    break L;
                case 'E': c=s.charAt(0);
                    if (c=='g') { X="getEditable";id=Id_getEditable; }
                    else if (c=='s') { X="setEditable";id=Id_setEditable; }
                    break L;
                case 'H': c=s.charAt(0);
                    if (c=='g') { X="getHintText";id=Id_getHintText; }
                    else if (c=='s') { X="setHintText";id=Id_setHintText; }
                    break L;
                case 's': X="constructor";id=Id_constructor; break L;
                } break L;
            case 12: switch (s.charAt(3)) {
                case 'E': c=s.charAt(0);
                    if (c=='g') { X="getEllipsize";id=Id_getEllipsize; }
                    else if (c=='s') { X="setEllipsize";id=Id_setEllipsize; }
                    break L;
                case 'M': c=s.charAt(0);
                    if (c=='g') { X="getMaxLength";id=Id_getMaxLength; }
                    else if (c=='s') { X="setMaxLength";id=Id_setMaxLength; }
                    break L;
                case 'S': X="setSelection";id=Id_setSelection; break L;
                case 'T': c=s.charAt(0);
                    if (c=='g') { X="getTextAlign";id=Id_getTextAlign; }
                    else if (c=='s') { X="setTextAlign";id=Id_setTextAlign; }
                    break L;
                } break L;
            case 14: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(3);
                    if (c=='A') { X="getAutocorrect";id=Id_getAutocorrect; }
                    else if (c=='C') { X="getClearOnEdit";id=Id_getClearOnEdit; }
                }
                else if (c=='s') {
                    c=s.charAt(3);
                    if (c=='A') { X="setAutocorrect";id=Id_setAutocorrect; }
                    else if (c=='C') { X="setClearOnEdit";id=Id_setClearOnEdit; }
                }
                break L;
            case 15: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(14);
                    if (c=='e') { X="getKeyboardType";id=Id_getKeyboardType; }
                    else if (c=='k') { X="getPasswordMask";id=Id_getPasswordMask; }
                }
                else if (c=='s') {
                    c=s.charAt(14);
                    if (c=='e') { X="setKeyboardType";id=Id_setKeyboardType; }
                    else if (c=='k') { X="setPasswordMask";id=Id_setPasswordMask; }
                }
                break L;
            case 16: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(15);
                    if (c=='e') { X="getReturnKeyType";id=Id_getReturnKeyType; }
                    else if (c=='n') { X="getVerticalAlign";id=Id_getVerticalAlign; }
                }
                else if (c=='s') {
                    c=s.charAt(15);
                    if (c=='e') { X="setReturnKeyType";id=Id_setReturnKeyType; }
                    else if (c=='n') { X="setVerticalAlign";id=Id_setVerticalAlign; }
                }
                break L;
            case 18: c=s.charAt(0);
                if (c=='g') { X="getEnableReturnKey";id=Id_getEnableReturnKey; }
                else if (c=='s') { X="setEnableReturnKey";id=Id_setEnableReturnKey; }
                break L;
            case 21: c=s.charAt(0);
                if (c=='g') { X="getAutocapitalization";id=Id_getAutocapitalization; }
                else if (c=='s') { X="setAutocapitalization";id=Id_setAutocapitalization; }
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
			case Id_getAutocapitalization:
				arity = 0;
				name = "getAutocapitalization";
				break;
			case Id_setAutocapitalization:
				arity = 1;
				name = "setAutocapitalization";
				break;
			case Id_getAutocorrect:
				arity = 0;
				name = "getAutocorrect";
				break;
			case Id_setAutocorrect:
				arity = 1;
				name = "setAutocorrect";
				break;
			case Id_getAutoLink:
				arity = 0;
				name = "getAutoLink";
				break;
			case Id_setAutoLink:
				arity = 1;
				name = "setAutoLink";
				break;
			case Id_getClearOnEdit:
				arity = 0;
				name = "getClearOnEdit";
				break;
			case Id_setClearOnEdit:
				arity = 1;
				name = "setClearOnEdit";
				break;
			case Id_getColor:
				arity = 0;
				name = "getColor";
				break;
			case Id_setColor:
				arity = 1;
				name = "setColor";
				break;
			case Id_getEditable:
				arity = 0;
				name = "getEditable";
				break;
			case Id_setEditable:
				arity = 1;
				name = "setEditable";
				break;
			case Id_getEllipsize:
				arity = 0;
				name = "getEllipsize";
				break;
			case Id_setEllipsize:
				arity = 1;
				name = "setEllipsize";
				break;
			case Id_getEnableReturnKey:
				arity = 0;
				name = "getEnableReturnKey";
				break;
			case Id_setEnableReturnKey:
				arity = 1;
				name = "setEnableReturnKey";
				break;
			case Id_getFont:
				arity = 0;
				name = "getFont";
				break;
			case Id_setFont:
				arity = 1;
				name = "setFont";
				break;
			case Id_getHintText:
				arity = 0;
				name = "getHintText";
				break;
			case Id_setHintText:
				arity = 1;
				name = "setHintText";
				break;
			case Id_getKeyboardType:
				arity = 0;
				name = "getKeyboardType";
				break;
			case Id_setKeyboardType:
				arity = 1;
				name = "setKeyboardType";
				break;
			case Id_getMaxLength:
				arity = 0;
				name = "getMaxLength";
				break;
			case Id_setMaxLength:
				arity = 1;
				name = "setMaxLength";
				break;
			case Id_getPasswordMask:
				arity = 0;
				name = "getPasswordMask";
				break;
			case Id_setPasswordMask:
				arity = 1;
				name = "setPasswordMask";
				break;
			case Id_getTextAlign:
				arity = 0;
				name = "getTextAlign";
				break;
			case Id_setTextAlign:
				arity = 1;
				name = "setTextAlign";
				break;
			case Id_getValue:
				arity = 0;
				name = "getValue";
				break;
			case Id_setValue:
				arity = 1;
				name = "setValue";
				break;
			case Id_getVerticalAlign:
				arity = 0;
				name = "getVerticalAlign";
				break;
			case Id_setVerticalAlign:
				arity = 1;
				name = "setVerticalAlign";
				break;
			case Id_getReturnKeyType:
				arity = 0;
				name = "getReturnKeyType";
				break;
			case Id_setReturnKeyType:
				arity = 1;
				name = "setReturnKeyType";
				break;
			case Id_setSelection:
				arity = 2;
				name = "setSelection";
				break;
			case Id_hasText:
				arity = 0;
				name = "hasText";
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

		while (thisObj != null && !(thisObj instanceof TextFieldProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TextFieldProxyPrototype proxy = (TextFieldProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getAutocapitalization:
				return proxy.getProperty("autocapitalization");
			case Id_setAutocapitalization:
				proxy.setProperty("autocapitalization", args[0]);
				proxy.onPropertyChanged("autocapitalization", args[0]);
				return Undefined.instance;
			case Id_getAutocorrect:
				return proxy.getProperty("autocorrect");
			case Id_setAutocorrect:
				proxy.setProperty("autocorrect", args[0]);
				proxy.onPropertyChanged("autocorrect", args[0]);
				return Undefined.instance;
			case Id_getAutoLink:
				return proxy.getProperty("autoLink");
			case Id_setAutoLink:
				proxy.setProperty("autoLink", args[0]);
				proxy.onPropertyChanged("autoLink", args[0]);
				return Undefined.instance;
			case Id_getClearOnEdit:
				return proxy.getProperty("clearOnEdit");
			case Id_setClearOnEdit:
				proxy.setProperty("clearOnEdit", args[0]);
				proxy.onPropertyChanged("clearOnEdit", args[0]);
				return Undefined.instance;
			case Id_getColor:
				return proxy.getProperty("color");
			case Id_setColor:
				proxy.setProperty("color", args[0]);
				proxy.onPropertyChanged("color", args[0]);
				return Undefined.instance;
			case Id_getEditable:
				return proxy.getProperty("editable");
			case Id_setEditable:
				proxy.setProperty("editable", args[0]);
				proxy.onPropertyChanged("editable", args[0]);
				return Undefined.instance;
			case Id_getEllipsize:
				return proxy.getProperty("ellipsize");
			case Id_setEllipsize:
				proxy.setProperty("ellipsize", args[0]);
				proxy.onPropertyChanged("ellipsize", args[0]);
				return Undefined.instance;
			case Id_getEnableReturnKey:
				return proxy.getProperty("enableReturnKey");
			case Id_setEnableReturnKey:
				proxy.setProperty("enableReturnKey", args[0]);
				proxy.onPropertyChanged("enableReturnKey", args[0]);
				return Undefined.instance;
			case Id_getFont:
				return proxy.getProperty("font");
			case Id_setFont:
				proxy.setProperty("font", args[0]);
				proxy.onPropertyChanged("font", args[0]);
				return Undefined.instance;
			case Id_getHintText:
				return proxy.getProperty("hintText");
			case Id_setHintText:
				proxy.setProperty("hintText", args[0]);
				proxy.onPropertyChanged("hintText", args[0]);
				return Undefined.instance;
			case Id_getKeyboardType:
				return proxy.getProperty("keyboardType");
			case Id_setKeyboardType:
				proxy.setProperty("keyboardType", args[0]);
				proxy.onPropertyChanged("keyboardType", args[0]);
				return Undefined.instance;
			case Id_getMaxLength:
				return proxy.getProperty("maxLength");
			case Id_setMaxLength:
				proxy.setProperty("maxLength", args[0]);
				proxy.onPropertyChanged("maxLength", args[0]);
				return Undefined.instance;
			case Id_getPasswordMask:
				return proxy.getProperty("passwordMask");
			case Id_setPasswordMask:
				proxy.setProperty("passwordMask", args[0]);
				proxy.onPropertyChanged("passwordMask", args[0]);
				return Undefined.instance;
			case Id_getTextAlign:
				return proxy.getProperty("textAlign");
			case Id_setTextAlign:
				proxy.setProperty("textAlign", args[0]);
				proxy.onPropertyChanged("textAlign", args[0]);
				return Undefined.instance;
			case Id_getValue:
				return proxy.getProperty("value");
			case Id_setValue:
				proxy.setProperty("value", args[0]);
				proxy.onPropertyChanged("value", args[0]);
				return Undefined.instance;
			case Id_getVerticalAlign:
				return proxy.getProperty("verticalAlign");
			case Id_setVerticalAlign:
				proxy.setProperty("verticalAlign", args[0]);
				proxy.onPropertyChanged("verticalAlign", args[0]);
				return Undefined.instance;
			case Id_getReturnKeyType:
				return proxy.getProperty("returnKeyType");
			case Id_setReturnKeyType:
				proxy.setProperty("returnKeyType", args[0]);
				proxy.onPropertyChanged("returnKeyType", args[0]);
				return Undefined.instance;
			case Id_setSelection:
				 setSelection(cx, thisObj, args);
				return Undefined.instance;
			case Id_hasText:
				return hasText(cx, thisObj, args);
				
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

		Id_autocapitalization = 1
		,		
		Id_autocorrect = 2
		,		
		Id_autoLink = 3
		,		
		Id_clearOnEdit = 4
		,		
		Id_color = 5
		,		
		Id_editable = 6
		,		
		Id_ellipsize = 7
		,		
		Id_enableReturnKey = 8
		,		
		Id_font = 9
		,		
		Id_hintText = 10
		,		
		Id_keyboardType = 11
		,		
		Id_maxLength = 12
		,		
		Id_passwordMask = 13
		,		
		Id_textAlign = 14
		,		
		Id_value = 15
		,		
		Id_verticalAlign = 16
		,		
		Id_returnKeyType = 17
		;

;

	public static final int MAX_INSTANCE_ID = 17;

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
            case 4: X="font";id=Id_font; break L;
            case 5: c=s.charAt(0);
                if (c=='c') { X="color";id=Id_color; }
                else if (c=='v') { X="value";id=Id_value; }
                break L;
            case 8: c=s.charAt(0);
                if (c=='a') { X="autoLink";id=Id_autoLink; }
                else if (c=='e') { X="editable";id=Id_editable; }
                else if (c=='h') { X="hintText";id=Id_hintText; }
                break L;
            case 9: c=s.charAt(0);
                if (c=='e') { X="ellipsize";id=Id_ellipsize; }
                else if (c=='m') { X="maxLength";id=Id_maxLength; }
                else if (c=='t') { X="textAlign";id=Id_textAlign; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='a') { X="autocorrect";id=Id_autocorrect; }
                else if (c=='c') { X="clearOnEdit";id=Id_clearOnEdit; }
                break L;
            case 12: c=s.charAt(0);
                if (c=='k') { X="keyboardType";id=Id_keyboardType; }
                else if (c=='p') { X="passwordMask";id=Id_passwordMask; }
                break L;
            case 13: c=s.charAt(0);
                if (c=='r') { X="returnKeyType";id=Id_returnKeyType; }
                else if (c=='v') { X="verticalAlign";id=Id_verticalAlign; }
                break L;
            case 15: X="enableReturnKey";id=Id_enableReturnKey; break L;
            case 18: X="autocapitalization";id=Id_autocapitalization; break L;
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
			case Id_autocapitalization:
				return "autocapitalization";
			case Id_autocorrect:
				return "autocorrect";
			case Id_autoLink:
				return "autoLink";
			case Id_clearOnEdit:
				return "clearOnEdit";
			case Id_color:
				return "color";
			case Id_editable:
				return "editable";
			case Id_ellipsize:
				return "ellipsize";
			case Id_enableReturnKey:
				return "enableReturnKey";
			case Id_font:
				return "font";
			case Id_hintText:
				return "hintText";
			case Id_keyboardType:
				return "keyboardType";
			case Id_maxLength:
				return "maxLength";
			case Id_passwordMask:
				return "passwordMask";
			case Id_textAlign:
				return "textAlign";
			case Id_value:
				return "value";
			case Id_verticalAlign:
				return "verticalAlign";
			case Id_returnKeyType:
				return "returnKeyType";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TextFieldProxyPrototype proxy = this;
		while (start != null && !(start instanceof TextFieldProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TextFieldProxyPrototype) {
			proxy = (TextFieldProxyPrototype) start;
		}

		switch (id) {
			case Id_autocapitalization:
				return proxy.getProperty("autocapitalization");
			case Id_autocorrect:
				return proxy.getProperty("autocorrect");
			case Id_autoLink:
				return proxy.getProperty("autoLink");
			case Id_clearOnEdit:
				return proxy.getProperty("clearOnEdit");
			case Id_color:
				return proxy.getProperty("color");
			case Id_editable:
				return proxy.getProperty("editable");
			case Id_ellipsize:
				return proxy.getProperty("ellipsize");
			case Id_enableReturnKey:
				return proxy.getProperty("enableReturnKey");
			case Id_font:
				return proxy.getProperty("font");
			case Id_hintText:
				return proxy.getProperty("hintText");
			case Id_keyboardType:
				return proxy.getProperty("keyboardType");
			case Id_maxLength:
				return proxy.getProperty("maxLength");
			case Id_passwordMask:
				return proxy.getProperty("passwordMask");
			case Id_textAlign:
				return proxy.getProperty("textAlign");
			case Id_value:
				return proxy.getProperty("value");
			case Id_verticalAlign:
				return proxy.getProperty("verticalAlign");
			case Id_returnKeyType:
				return proxy.getProperty("returnKeyType");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		TextFieldProxyPrototype proxy = this;
		while (start != null && !(start instanceof TextFieldProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TextFieldProxyPrototype) {
			proxy = (TextFieldProxyPrototype) start;
		}

		switch (id) {
			case Id_autocapitalization:
				proxy.setProperty("autocapitalization", value);
				proxy.onPropertyChanged("autocapitalization", value);
				break;
			case Id_autocorrect:
				proxy.setProperty("autocorrect", value);
				proxy.onPropertyChanged("autocorrect", value);
				break;
			case Id_autoLink:
				proxy.setProperty("autoLink", value);
				proxy.onPropertyChanged("autoLink", value);
				break;
			case Id_clearOnEdit:
				proxy.setProperty("clearOnEdit", value);
				proxy.onPropertyChanged("clearOnEdit", value);
				break;
			case Id_color:
				proxy.setProperty("color", value);
				proxy.onPropertyChanged("color", value);
				break;
			case Id_editable:
				proxy.setProperty("editable", value);
				proxy.onPropertyChanged("editable", value);
				break;
			case Id_ellipsize:
				proxy.setProperty("ellipsize", value);
				proxy.onPropertyChanged("ellipsize", value);
				break;
			case Id_enableReturnKey:
				proxy.setProperty("enableReturnKey", value);
				proxy.onPropertyChanged("enableReturnKey", value);
				break;
			case Id_font:
				proxy.setProperty("font", value);
				proxy.onPropertyChanged("font", value);
				break;
			case Id_hintText:
				proxy.setProperty("hintText", value);
				proxy.onPropertyChanged("hintText", value);
				break;
			case Id_keyboardType:
				proxy.setProperty("keyboardType", value);
				proxy.onPropertyChanged("keyboardType", value);
				break;
			case Id_maxLength:
				proxy.setProperty("maxLength", value);
				proxy.onPropertyChanged("maxLength", value);
				break;
			case Id_passwordMask:
				proxy.setProperty("passwordMask", value);
				proxy.onPropertyChanged("passwordMask", value);
				break;
			case Id_textAlign:
				proxy.setProperty("textAlign", value);
				proxy.onPropertyChanged("textAlign", value);
				break;
			case Id_value:
				proxy.setProperty("value", value);
				proxy.onPropertyChanged("value", value);
				break;
			case Id_verticalAlign:
				proxy.setProperty("verticalAlign", value);
				proxy.onPropertyChanged("verticalAlign", value);
				break;
			case Id_returnKeyType:
				proxy.setProperty("returnKeyType", value);
				proxy.onPropertyChanged("returnKeyType", value);
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
