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

import ti.modules.titanium.ui.UIModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class UIModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = -4440402065278573916L;

	private static final String TAG = "UIModulePrototype";
	private static final String CLASS_TAG = "UIModule";
	private static UIModulePrototype uIModulePrototype;

	// Lazy loaded child APIs
	private Object API_Switch = null;
	private Object API_SearchBar = null;
	private Object API_DatePicker = null;
	private Object API_WebView = null;
	private Object API_ActivityIndicatorStyle = null;
	private Object API_OptionDialog = null;
	private Object API_TiDialog = null;
	private Object API_2DMatrix = null;
	private Object API_TextArea = null;
	private Object API_Slider = null;
	private Object API_TabContentView = null;
	private Object API_ActivityWindow = null;
	private Object API_ButtonBar = null;
	private Object API_View = null;
	private Object API_Button = null;
	private Object API_Clipboard = null;
	private Object API_ActivityIndicator = null;
	private Object API_AlertDialog = null;
	private Object API_Tab = null;
	private Object API_TableView = null;
	private Object API_PickerRow = null;
	private Object API_Picker = null;
	private Object API_EmailDialog = null;
	private Object API_ScrollView = null;
	private Object API_Animation = null;
	private Object API_TableViewSection = null;
	private Object API_TabGroup = null;
	private Object API_Notification = null;
	private Object API_TextField = null;
	private Object API_Android = null;
	private Object API_ScrollableView = null;
	private Object API_TableViewRow = null;
	private Object API_Label = null;
	private Object API_ImageView = null;
	private Object API_ProgressBar = null;
	private Object API_PickerColumn = null;

	public static UIModulePrototype getProxyPrototype()
	{
		return uIModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		uIModulePrototype = null;
	}

	public UIModulePrototype()
	{
		if (uIModulePrototype == null && getClass().equals(UIModulePrototype.class)) {
			uIModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("UPSIDE_PORTRAIT", this, 3);


			putConst("PORTRAIT", this, 1);


			putConst("INPUT_BUTTONMODE_NEVER", this, 2);


			putConst("NOTIFICATION_DURATION_LONG", this, 1);


			putConst("AUTOLINK_URLS", this, 1);


			putConst("RETURNKEY_SEND", this, 10);


			putConst("URL_ERROR_TIMEOUT", this, -8);


			putConst("LANDSCAPE_LEFT", this, 2);


			putConst("URL_ERROR_CONNECT", this, -6);


			putConst("INPUT_BORDERSTYLE_LINE", this, 3);


			putConst("PICKER_TYPE_DATE", this, 1);


			putConst("KEYBOARD_APPEARANCE_ALERT", this, -1);


			putConst("TEXT_ALIGNMENT_LEFT", this, "left");


			putConst("URL_ERROR_HOST_LOOKUP", this, -2);


			putConst("KEYBOARD_DECIMAL_PAD", this, 8);


			putConst("RETURNKEY_YAHOO", this, 6);


			putConst("AUTOLINK_NONE", this, 16);


			putConst("PICKER_TYPE_COUNT_DOWN_TIMER", this, 3);


			putConst("KEYBOARD_DEFAULT", this, 7);


			putConst("UNIT_IN", this, "in");


			putConst("URL_ERROR_FILE_NOT_FOUND", this, -14);


			putConst("TABLEVIEW_POSITION_ANY", this, 0);


			putConst("MAP_VIEW_SATELLITE", this, 2);


			putConst("KEYBOARD_NUMBER_PAD", this, 3);


			putConst("KEYBOARD_NAMEPHONE_PAD", this, 6);


			putConst("TEXT_VERTICAL_ALIGNMENT_BOTTOM", this, "bottom");


			putConst("RETURNKEY_JOIN", this, 2);


			putConst("UNKNOWN", this, 0);


			putConst("NOTIFICATION_DURATION_SHORT", this, 0);


			putConst("FILL", this, "fill");


			putConst("URL_ERROR_SSL_FAILED", this, -11);


			putConst("KEYBOARD_ASCII", this, 0);


			putConst("KEYBOARD_URL", this, 2);


			putConst("INPUT_BORDERSTYLE_BEZEL", this, 2);


			putConst("TEXT_AUTOCAPITALIZATION_ALL", this, 3);


			putConst("URL_ERROR_AUTHENTICATION", this, -4);


			putConst("TEXT_VERTICAL_ALIGNMENT_CENTER", this, "middle");


			putConst("URL_ERROR_BAD_URL", this, -12);


			putConst("TEXT_AUTOCAPITALIZATION_NONE", this, 0);


			putConst("TABLEVIEW_POSITION_TOP", this, 1);


			putConst("KEYBOARD_PHONE_PAD", this, 4);


			putConst("URL_ERROR_UNKNOWN", this, -1);


			putConst("URL_ERROR_UNSUPPORTED_SCHEME", this, -10);


			putConst("TEXT_AUTOCAPITALIZATION_SENTENCES", this, 1);


			putConst("KEYBOARD_NUMBERS_PUNCTUATION", this, 1);


			putConst("UNIT_PX", this, "px");


			putConst("TABLEVIEW_POSITION_BOTTOM", this, 3);


			putConst("URL_ERROR_FILE", this, -13);


			putConst("UNIT_CM", this, "cm");


			putConst("UNIT_DIP", this, "dip");


			putConst("RETURNKEY_GO", this, 0);


			putConst("MAP_VIEW_STANDARD", this, 1);


			putConst("FACE_DOWN", this, 6);


			putConst("INPUT_BUTTONMODE_ONFOCUS", this, 0);


			putConst("TEXT_VERTICAL_ALIGNMENT_TOP", this, "top");


			putConst("AUTOLINK_ALL", this, 15);


			putConst("UNIT_MM", this, "mm");


			putConst("PICKER_TYPE_PLAIN", this, -1);


			putConst("TEXT_AUTOCAPITALIZATION_WORDS", this, 2);


			putConst("RETURNKEY_DEFAULT", this, 9);


			putConst("RETURNKEY_GOOGLE", this, 1);


			putConst("RETURNKEY_SEARCH", this, 5);


			putConst("FACE_UP", this, 5);


			putConst("INPUT_BORDERSTYLE_ROUNDED", this, 1);


			putConst("INPUT_BORDERSTYLE_NONE", this, 0);


			putConst("RETURNKEY_ROUTE", this, 4);


			putConst("TEXT_ALIGNMENT_RIGHT", this, "right");


			putConst("KEYBOARD_EMAIL", this, 5);


			putConst("PICKER_TYPE_TIME", this, 0);


			putConst("RETURNKEY_DONE", this, 7);


			putConst("TABLEVIEW_POSITION_MIDDLE", this, 2);


			putConst("INPUT_BUTTONMODE_ALWAYS", this, 1);


			putConst("AUTOLINK_EMAIL_ADDRESSES", this, 2);


			putConst("AUTOLINK_MAP_ADDRESSES", this, 8);


			putConst("MAP_VIEW_HYBRID", this, 3);


			putConst("TEXT_ALIGNMENT_CENTER", this, "center");


			putConst("LANDSCAPE_RIGHT", this, 4);


			putConst("AUTOLINK_PHONE_NUMBERS", this, 4);


			putConst("URL_ERROR_REDIRECT_LOOP", this, -9);


			putConst("KEYBOARD_APPEARANCE_DEFAULT", this, -1);


			putConst("RETURNKEY_EMERGENCY_CALL", this, 8);


			putConst("RETURNKEY_NEXT", this, 3);


			putConst("PICKER_TYPE_DATE_AND_TIME", this, 2);


			putConst("SIZE", this, "size");

	}

	public Scriptable getPrototype()
	{
		if (this == uIModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return uIModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(UIModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void setBackgroundImage(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setBackgroundImage()", Log.DEBUG_MODE);

		try {
		UIModule proxy = (UIModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setBackgroundImage: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setBackgroundImage(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setBackgroundColor(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setBackgroundColor()", Log.DEBUG_MODE);

		try {
		UIModule proxy = (UIModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setBackgroundColor: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setBackgroundColor(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object convertUnits(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "convertUnits()", Log.DEBUG_MODE);

		try {
		UIModule proxy = (UIModule) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("convertUnits: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.String arg1;
		arg1 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[1], thisObj) ;

		double javaResult = proxy.convertUnits(arg0, arg1);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public void setter_backgroundColor(Object value)
	{
		Log.d(TAG, "set backgroundColor", Log.DEBUG_MODE);
		UIModule proxy = (UIModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setBackgroundColor(arg0);
		//proxy.setProperty("backgroundColor", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public void setter_backgroundImage(Object value)
	{
		Log.d(TAG, "set backgroundImage", Log.DEBUG_MODE);
		UIModule proxy = (UIModule) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setBackgroundImage(arg0);
		//proxy.setProperty("backgroundImage", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_setBackgroundImage = 2,
		Id_setBackgroundColor = 3,
		Id_convertUnits = 4,
		Id_createActivityIndicator = 5,
				Id_createActivityWindow = 6,
				Id_createAlertDialog = 7,
				Id_createAnimation = 8,
				Id_createButtonBar = 9,
				Id_createButton = 10,
				Id_createDatePicker = 11,
				Id_createEmailDialog = 12,
				Id_createImageView = 13,
				Id_createLabel = 14,
				Id_createNotification = 15,
				Id_createOptionDialog = 16,
				Id_createPickerColumn = 17,
				Id_createPicker = 18,
				Id_createPickerRow = 19,
				Id_createProgressBar = 20,
				Id_createScrollView = 21,
				Id_createScrollableView = 22,
				Id_createSearchBar = 23,
				Id_createSlider = 24,
				Id_createSwitch = 25,
				Id_createTabGroup = 26,
				Id_createTab = 27,
				Id_createTableView = 28,
				Id_createTableViewRow = 29,
				Id_createTableViewSection = 30,
				Id_createTextArea = 31,
				Id_createTextField = 32,
				Id_createView = 33,
				Id_createWebView = 34,
				Id_create2DMatrix = 35
		;
		

	public static final int MAX_PROTOTYPE_ID = 35;

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
            case 9: X="createTab";id=Id_createTab; break L;
            case 10: X="createView";id=Id_createView; break L;
            case 11: c=s.charAt(1);
                if (c=='o') { X="constructor";id=Id_constructor; }
                else if (c=='r') { X="createLabel";id=Id_createLabel; }
                break L;
            case 12: switch (s.charAt(7)) {
                case 'U': X="convertUnits";id=Id_convertUnits; break L;
                case 'i': X="createPicker";id=Id_createPicker; break L;
                case 'l': X="createSlider";id=Id_createSlider; break L;
                case 'u': X="createButton";id=Id_createButton; break L;
                case 'w': X="createSwitch";id=Id_createSwitch; break L;
                } break L;
            case 13: X="createWebView";id=Id_createWebView; break L;
            case 14: c=s.charAt(7);
                if (c=='D') { X="create2DMatrix";id=Id_create2DMatrix; }
                else if (c=='a') { X="createTabGroup";id=Id_createTabGroup; }
                else if (c=='e') { X="createTextArea";id=Id_createTextArea; }
                break L;
            case 15: switch (s.charAt(6)) {
                case 'A': X="createAnimation";id=Id_createAnimation; break L;
                case 'B': X="createButtonBar";id=Id_createButtonBar; break L;
                case 'I': X="createImageView";id=Id_createImageView; break L;
                case 'P': X="createPickerRow";id=Id_createPickerRow; break L;
                case 'S': X="createSearchBar";id=Id_createSearchBar; break L;
                case 'T': c=s.charAt(14);
                    if (c=='d') { X="createTextField";id=Id_createTextField; }
                    else if (c=='w') { X="createTableView";id=Id_createTableView; }
                    break L;
                } break L;
            case 16: c=s.charAt(6);
                if (c=='D') { X="createDatePicker";id=Id_createDatePicker; }
                else if (c=='S') { X="createScrollView";id=Id_createScrollView; }
                break L;
            case 17: c=s.charAt(6);
                if (c=='A') { X="createAlertDialog";id=Id_createAlertDialog; }
                else if (c=='E') { X="createEmailDialog";id=Id_createEmailDialog; }
                else if (c=='P') { X="createProgressBar";id=Id_createProgressBar; }
                break L;
            case 18: switch (s.charAt(13)) {
                case 'C': X="setBackgroundColor";id=Id_setBackgroundColor; break L;
                case 'I': X="setBackgroundImage";id=Id_setBackgroundImage; break L;
                case 'a': X="createNotification";id=Id_createNotification; break L;
                case 'e': X="createTableViewRow";id=Id_createTableViewRow; break L;
                case 'i': X="createOptionDialog";id=Id_createOptionDialog; break L;
                case 'o': X="createPickerColumn";id=Id_createPickerColumn; break L;
                } break L;
            case 20: c=s.charAt(6);
                if (c=='A') { X="createActivityWindow";id=Id_createActivityWindow; }
                else if (c=='S') { X="createScrollableView";id=Id_createScrollableView; }
                break L;
            case 22: X="createTableViewSection";id=Id_createTableViewSection; break L;
            case 23: X="createActivityIndicator";id=Id_createActivityIndicator; break L;
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
			case Id_setBackgroundImage:
				arity = 1;
				name = "setBackgroundImage";
				break;
			case Id_setBackgroundColor:
				arity = 1;
				name = "setBackgroundColor";
				break;
			case Id_convertUnits:
				arity = 2;
				name = "convertUnits";
				break;
			case Id_createActivityIndicator:
				arity = 1;
				name = "createActivityIndicator";
				break;
			case Id_createActivityWindow:
				arity = 1;
				name = "createActivityWindow";
				break;
			case Id_createAlertDialog:
				arity = 1;
				name = "createAlertDialog";
				break;
			case Id_createAnimation:
				arity = 1;
				name = "createAnimation";
				break;
			case Id_createButtonBar:
				arity = 1;
				name = "createButtonBar";
				break;
			case Id_createButton:
				arity = 1;
				name = "createButton";
				break;
			case Id_createDatePicker:
				arity = 1;
				name = "createDatePicker";
				break;
			case Id_createEmailDialog:
				arity = 1;
				name = "createEmailDialog";
				break;
			case Id_createImageView:
				arity = 1;
				name = "createImageView";
				break;
			case Id_createLabel:
				arity = 1;
				name = "createLabel";
				break;
			case Id_createNotification:
				arity = 1;
				name = "createNotification";
				break;
			case Id_createOptionDialog:
				arity = 1;
				name = "createOptionDialog";
				break;
			case Id_createPickerColumn:
				arity = 1;
				name = "createPickerColumn";
				break;
			case Id_createPicker:
				arity = 1;
				name = "createPicker";
				break;
			case Id_createPickerRow:
				arity = 1;
				name = "createPickerRow";
				break;
			case Id_createProgressBar:
				arity = 1;
				name = "createProgressBar";
				break;
			case Id_createScrollView:
				arity = 1;
				name = "createScrollView";
				break;
			case Id_createScrollableView:
				arity = 1;
				name = "createScrollableView";
				break;
			case Id_createSearchBar:
				arity = 1;
				name = "createSearchBar";
				break;
			case Id_createSlider:
				arity = 1;
				name = "createSlider";
				break;
			case Id_createSwitch:
				arity = 1;
				name = "createSwitch";
				break;
			case Id_createTabGroup:
				arity = 1;
				name = "createTabGroup";
				break;
			case Id_createTab:
				arity = 1;
				name = "createTab";
				break;
			case Id_createTableView:
				arity = 1;
				name = "createTableView";
				break;
			case Id_createTableViewRow:
				arity = 1;
				name = "createTableViewRow";
				break;
			case Id_createTableViewSection:
				arity = 1;
				name = "createTableViewSection";
				break;
			case Id_createTextArea:
				arity = 1;
				name = "createTextArea";
				break;
			case Id_createTextField:
				arity = 1;
				name = "createTextField";
				break;
			case Id_createView:
				arity = 1;
				name = "createView";
				break;
			case Id_createWebView:
				arity = 1;
				name = "createWebView";
				break;
			case Id_create2DMatrix:
				arity = 1;
				name = "create2DMatrix";
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

		while (thisObj != null && !(thisObj instanceof UIModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		UIModulePrototype proxy = (UIModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_setBackgroundImage:
				 setBackgroundImage(cx, thisObj, args);
				return Undefined.instance;
			case Id_setBackgroundColor:
				 setBackgroundColor(cx, thisObj, args);
				return Undefined.instance;
			case Id_convertUnits:
				return convertUnits(cx, thisObj, args);
				
			case Id_createActivityIndicator:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.ActivityIndicatorProxy", args);
			case Id_createActivityWindow:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.ActivityWindowProxy", args);
			case Id_createAlertDialog:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.AlertDialogProxy", args);
			case Id_createAnimation:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.AnimationProxy", args);
			case Id_createButtonBar:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.ButtonBarProxy", args);
			case Id_createButton:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.ButtonProxy", args);
			case Id_createDatePicker:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.DatePickerProxy", args);
			case Id_createEmailDialog:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.EmailDialogProxy", args);
			case Id_createImageView:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.ImageViewProxy", args);
			case Id_createLabel:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.LabelProxy", args);
			case Id_createNotification:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.NotificationProxy", args);
			case Id_createOptionDialog:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.OptionDialogProxy", args);
			case Id_createPickerColumn:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.PickerColumnProxy", args);
			case Id_createPicker:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.PickerProxy", args);
			case Id_createPickerRow:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.PickerRowProxy", args);
			case Id_createProgressBar:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.ProgressBarProxy", args);
			case Id_createScrollView:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.ScrollViewProxy", args);
			case Id_createScrollableView:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.ScrollableViewProxy", args);
			case Id_createSearchBar:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.SearchBarProxy", args);
			case Id_createSlider:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.SliderProxy", args);
			case Id_createSwitch:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.SwitchProxy", args);
			case Id_createTabGroup:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.TabGroupProxy", args);
			case Id_createTab:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.TabProxy", args);
			case Id_createTableView:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.TableViewProxy", args);
			case Id_createTableViewRow:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.TableViewRowProxy", args);
			case Id_createTableViewSection:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.TableViewSectionProxy", args);
			case Id_createTextArea:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.TextAreaProxy", args);
			case Id_createTextField:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.TextFieldProxy", args);
			case Id_createView:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.ViewProxy", args);
			case Id_createWebView:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui.WebViewProxy", args);
			case Id_create2DMatrix:
				return ProxyFactory.createRhinoProxy(cx, scope,
					"ti.modules.titanium.ui._2DMatrixProxy", args);
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_backgroundColor = 1
		,		
		Id_backgroundImage = 2
		;

;

	// Child APIs
	private static final int

		Id_Switch = 3
		,		
		Id_SearchBar = 4
		,		
		Id_DatePicker = 5
		,		
		Id_WebView = 6
		,		
		Id_ActivityIndicatorStyle = 7
		,		
		Id_OptionDialog = 8
		,		
		Id_TiDialog = 9
		,		
		Id_2DMatrix = 10
		,		
		Id_TextArea = 11
		,		
		Id_Slider = 12
		,		
		Id_TabContentView = 13
		,		
		Id_ActivityWindow = 14
		,		
		Id_ButtonBar = 15
		,		
		Id_View = 16
		,		
		Id_Button = 17
		,		
		Id_Clipboard = 18
		,		
		Id_ActivityIndicator = 19
		,		
		Id_AlertDialog = 20
		,		
		Id_Tab = 21
		,		
		Id_TableView = 22
		,		
		Id_PickerRow = 23
		,		
		Id_Picker = 24
		,		
		Id_EmailDialog = 25
		,		
		Id_ScrollView = 26
		,		
		Id_Animation = 27
		,		
		Id_TableViewSection = 28
		,		
		Id_TabGroup = 29
		,		
		Id_Notification = 30
		,		
		Id_TextField = 31
		,		
		Id_Android = 32
		,		
		Id_ScrollableView = 33
		,		
		Id_TableViewRow = 34
		,		
		Id_Label = 35
		,		
		Id_ImageView = 36
		,		
		Id_ProgressBar = 37
		,		
		Id_PickerColumn = 38
		;

	public static final int MAX_INSTANCE_ID = 38;

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
            case 3: X="Tab";id=Id_Tab; break L;
            case 4: X="View";id=Id_View; break L;
            case 5: X="Label";id=Id_Label; break L;
            case 6: switch (s.charAt(1)) {
                case 'i': X="Picker";id=Id_Picker; break L;
                case 'l': X="Slider";id=Id_Slider; break L;
                case 'u': X="Button";id=Id_Button; break L;
                case 'w': X="Switch";id=Id_Switch; break L;
                } break L;
            case 7: c=s.charAt(0);
                if (c=='A') { X="Android";id=Id_Android; }
                else if (c=='W') { X="WebView";id=Id_WebView; }
                break L;
            case 8: switch (s.charAt(1)) {
                case 'D': X="2DMatrix";id=Id_2DMatrix; break L;
                case 'a': X="TabGroup";id=Id_TabGroup; break L;
                case 'e': X="TextArea";id=Id_TextArea; break L;
                case 'i': X="TiDialog";id=Id_TiDialog; break L;
                } break L;
            case 9: switch (s.charAt(0)) {
                case 'A': X="Animation";id=Id_Animation; break L;
                case 'B': X="ButtonBar";id=Id_ButtonBar; break L;
                case 'C': X="Clipboard";id=Id_Clipboard; break L;
                case 'I': X="ImageView";id=Id_ImageView; break L;
                case 'P': X="PickerRow";id=Id_PickerRow; break L;
                case 'S': X="SearchBar";id=Id_SearchBar; break L;
                case 'T': c=s.charAt(8);
                    if (c=='d') { X="TextField";id=Id_TextField; }
                    else if (c=='w') { X="TableView";id=Id_TableView; }
                    break L;
                } break L;
            case 10: c=s.charAt(0);
                if (c=='D') { X="DatePicker";id=Id_DatePicker; }
                else if (c=='S') { X="ScrollView";id=Id_ScrollView; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='A') { X="AlertDialog";id=Id_AlertDialog; }
                else if (c=='E') { X="EmailDialog";id=Id_EmailDialog; }
                else if (c=='P') { X="ProgressBar";id=Id_ProgressBar; }
                break L;
            case 12: switch (s.charAt(0)) {
                case 'N': X="Notification";id=Id_Notification; break L;
                case 'O': X="OptionDialog";id=Id_OptionDialog; break L;
                case 'P': X="PickerColumn";id=Id_PickerColumn; break L;
                case 'T': X="TableViewRow";id=Id_TableViewRow; break L;
                } break L;
            case 14: c=s.charAt(0);
                if (c=='A') { X="ActivityWindow";id=Id_ActivityWindow; }
                else if (c=='S') { X="ScrollableView";id=Id_ScrollableView; }
                else if (c=='T') { X="TabContentView";id=Id_TabContentView; }
                break L;
            case 15: c=s.charAt(10);
                if (c=='C') { X="backgroundColor";id=Id_backgroundColor; }
                else if (c=='I') { X="backgroundImage";id=Id_backgroundImage; }
                break L;
            case 16: X="TableViewSection";id=Id_TableViewSection; break L;
            case 17: X="ActivityIndicator";id=Id_ActivityIndicator; break L;
            case 22: X="ActivityIndicatorStyle";id=Id_ActivityIndicatorStyle; break L;
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
			case Id_backgroundColor:
				return "backgroundColor"; 
			case Id_backgroundImage:
				return "backgroundImage"; 
			case Id_Switch:
				return "Switch";
			case Id_SearchBar:
				return "SearchBar";
			case Id_DatePicker:
				return "DatePicker";
			case Id_WebView:
				return "WebView";
			case Id_ActivityIndicatorStyle:
				return "ActivityIndicatorStyle";
			case Id_OptionDialog:
				return "OptionDialog";
			case Id_TiDialog:
				return "TiDialog";
			case Id_2DMatrix:
				return "2DMatrix";
			case Id_TextArea:
				return "TextArea";
			case Id_Slider:
				return "Slider";
			case Id_TabContentView:
				return "TabContentView";
			case Id_ActivityWindow:
				return "ActivityWindow";
			case Id_ButtonBar:
				return "ButtonBar";
			case Id_View:
				return "View";
			case Id_Button:
				return "Button";
			case Id_Clipboard:
				return "Clipboard";
			case Id_ActivityIndicator:
				return "ActivityIndicator";
			case Id_AlertDialog:
				return "AlertDialog";
			case Id_Tab:
				return "Tab";
			case Id_TableView:
				return "TableView";
			case Id_PickerRow:
				return "PickerRow";
			case Id_Picker:
				return "Picker";
			case Id_EmailDialog:
				return "EmailDialog";
			case Id_ScrollView:
				return "ScrollView";
			case Id_Animation:
				return "Animation";
			case Id_TableViewSection:
				return "TableViewSection";
			case Id_TabGroup:
				return "TabGroup";
			case Id_Notification:
				return "Notification";
			case Id_TextField:
				return "TextField";
			case Id_Android:
				return "Android";
			case Id_ScrollableView:
				return "ScrollableView";
			case Id_TableViewRow:
				return "TableViewRow";
			case Id_Label:
				return "Label";
			case Id_ImageView:
				return "ImageView";
			case Id_ProgressBar:
				return "ProgressBar";
			case Id_PickerColumn:
				return "PickerColumn";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		UIModulePrototype proxy = this;
		while (start != null && !(start instanceof UIModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof UIModulePrototype) {
			proxy = (UIModulePrototype) start;
		}

		switch (id) {
			case Id_backgroundColor:
				return proxy.getProperty("backgroundColor");
			case Id_backgroundImage:
				return proxy.getProperty("backgroundImage");
			case Id_Switch:
				if (proxy.API_Switch == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Switch = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.SwitchProxy", ti.modules.titanium.ui.SwitchProxyPrototype.class); 
				}
				return proxy.API_Switch;
			case Id_SearchBar:
				if (proxy.API_SearchBar == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_SearchBar = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.SearchBarProxy", ti.modules.titanium.ui.SearchBarProxyPrototype.class); 
				}
				return proxy.API_SearchBar;
			case Id_DatePicker:
				if (proxy.API_DatePicker == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_DatePicker = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.DatePickerProxy", ti.modules.titanium.ui.DatePickerProxyPrototype.class); 
				}
				return proxy.API_DatePicker;
			case Id_WebView:
				if (proxy.API_WebView == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_WebView = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.WebViewProxy", ti.modules.titanium.ui.WebViewProxyPrototype.class); 
				}
				return proxy.API_WebView;
			case Id_ActivityIndicatorStyle:
				if (proxy.API_ActivityIndicatorStyle == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_ActivityIndicatorStyle = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.activityindicatorstyle.ActivityIndicatorStyleModule", ti.modules.titanium.ui.activityindicatorstyle.ActivityIndicatorStyleModulePrototype.class); 
				}
				return proxy.API_ActivityIndicatorStyle;
			case Id_OptionDialog:
				if (proxy.API_OptionDialog == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_OptionDialog = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.OptionDialogProxy", ti.modules.titanium.ui.OptionDialogProxyPrototype.class); 
				}
				return proxy.API_OptionDialog;
			case Id_TiDialog:
				if (proxy.API_TiDialog == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TiDialog = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.TiDialogProxy", ti.modules.titanium.ui.TiDialogProxyPrototype.class); 
				}
				return proxy.API_TiDialog;
			case Id_2DMatrix:
				if (proxy.API_2DMatrix == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_2DMatrix = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui._2DMatrixProxy", ti.modules.titanium.ui._2DMatrixProxyPrototype.class); 
				}
				return proxy.API_2DMatrix;
			case Id_TextArea:
				if (proxy.API_TextArea == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TextArea = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.TextAreaProxy", ti.modules.titanium.ui.TextAreaProxyPrototype.class); 
				}
				return proxy.API_TextArea;
			case Id_Slider:
				if (proxy.API_Slider == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Slider = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.SliderProxy", ti.modules.titanium.ui.SliderProxyPrototype.class); 
				}
				return proxy.API_Slider;
			case Id_TabContentView:
				if (proxy.API_TabContentView == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TabContentView = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.TabContentViewProxy", ti.modules.titanium.ui.TabContentViewProxyPrototype.class); 
				}
				return proxy.API_TabContentView;
			case Id_ActivityWindow:
				if (proxy.API_ActivityWindow == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_ActivityWindow = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.ActivityWindowProxy", ti.modules.titanium.ui.ActivityWindowProxyPrototype.class); 
				}
				return proxy.API_ActivityWindow;
			case Id_ButtonBar:
				if (proxy.API_ButtonBar == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_ButtonBar = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.ButtonBarProxy", ti.modules.titanium.ui.ButtonBarProxyPrototype.class); 
				}
				return proxy.API_ButtonBar;
			case Id_View:
				if (proxy.API_View == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_View = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.ViewProxy", ti.modules.titanium.ui.ViewProxyPrototype.class); 
				}
				return proxy.API_View;
			case Id_Button:
				if (proxy.API_Button == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Button = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.ButtonProxy", ti.modules.titanium.ui.ButtonProxyPrototype.class); 
				}
				return proxy.API_Button;
			case Id_Clipboard:
				if (proxy.API_Clipboard == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Clipboard = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.clipboard.ClipboardModule", ti.modules.titanium.ui.clipboard.ClipboardModulePrototype.class); 
				}
				return proxy.API_Clipboard;
			case Id_ActivityIndicator:
				if (proxy.API_ActivityIndicator == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_ActivityIndicator = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.ActivityIndicatorProxy", ti.modules.titanium.ui.ActivityIndicatorProxyPrototype.class); 
				}
				return proxy.API_ActivityIndicator;
			case Id_AlertDialog:
				if (proxy.API_AlertDialog == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_AlertDialog = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.AlertDialogProxy", ti.modules.titanium.ui.AlertDialogProxyPrototype.class); 
				}
				return proxy.API_AlertDialog;
			case Id_Tab:
				if (proxy.API_Tab == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Tab = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.TabProxy", ti.modules.titanium.ui.TabProxyPrototype.class); 
				}
				return proxy.API_Tab;
			case Id_TableView:
				if (proxy.API_TableView == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TableView = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.TableViewProxy", ti.modules.titanium.ui.TableViewProxyPrototype.class); 
				}
				return proxy.API_TableView;
			case Id_PickerRow:
				if (proxy.API_PickerRow == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_PickerRow = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.PickerRowProxy", ti.modules.titanium.ui.PickerRowProxyPrototype.class); 
				}
				return proxy.API_PickerRow;
			case Id_Picker:
				if (proxy.API_Picker == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Picker = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.PickerProxy", ti.modules.titanium.ui.PickerProxyPrototype.class); 
				}
				return proxy.API_Picker;
			case Id_EmailDialog:
				if (proxy.API_EmailDialog == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_EmailDialog = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.EmailDialogProxy", ti.modules.titanium.ui.EmailDialogProxyPrototype.class); 
				}
				return proxy.API_EmailDialog;
			case Id_ScrollView:
				if (proxy.API_ScrollView == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_ScrollView = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.ScrollViewProxy", ti.modules.titanium.ui.ScrollViewProxyPrototype.class); 
				}
				return proxy.API_ScrollView;
			case Id_Animation:
				if (proxy.API_Animation == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Animation = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.AnimationProxy", ti.modules.titanium.ui.AnimationProxyPrototype.class); 
				}
				return proxy.API_Animation;
			case Id_TableViewSection:
				if (proxy.API_TableViewSection == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TableViewSection = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.TableViewSectionProxy", ti.modules.titanium.ui.TableViewSectionProxyPrototype.class); 
				}
				return proxy.API_TableViewSection;
			case Id_TabGroup:
				if (proxy.API_TabGroup == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TabGroup = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.TabGroupProxy", ti.modules.titanium.ui.TabGroupProxyPrototype.class); 
				}
				return proxy.API_TabGroup;
			case Id_Notification:
				if (proxy.API_Notification == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Notification = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.NotificationProxy", ti.modules.titanium.ui.NotificationProxyPrototype.class); 
				}
				return proxy.API_Notification;
			case Id_TextField:
				if (proxy.API_TextField == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TextField = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.TextFieldProxy", ti.modules.titanium.ui.TextFieldProxyPrototype.class); 
				}
				return proxy.API_TextField;
			case Id_Android:
				if (proxy.API_Android == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Android = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.android.AndroidModule", ti.modules.titanium.ui.android.AndroidModulePrototype.class); 
				}
				return proxy.API_Android;
			case Id_ScrollableView:
				if (proxy.API_ScrollableView == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_ScrollableView = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.ScrollableViewProxy", ti.modules.titanium.ui.ScrollableViewProxyPrototype.class); 
				}
				return proxy.API_ScrollableView;
			case Id_TableViewRow:
				if (proxy.API_TableViewRow == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TableViewRow = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.TableViewRowProxy", ti.modules.titanium.ui.TableViewRowProxyPrototype.class); 
				}
				return proxy.API_TableViewRow;
			case Id_Label:
				if (proxy.API_Label == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Label = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.LabelProxy", ti.modules.titanium.ui.LabelProxyPrototype.class); 
				}
				return proxy.API_Label;
			case Id_ImageView:
				if (proxy.API_ImageView == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_ImageView = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.ImageViewProxy", ti.modules.titanium.ui.ImageViewProxyPrototype.class); 
				}
				return proxy.API_ImageView;
			case Id_ProgressBar:
				if (proxy.API_ProgressBar == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_ProgressBar = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.ProgressBarProxy", ti.modules.titanium.ui.ProgressBarProxyPrototype.class); 
				}
				return proxy.API_ProgressBar;
			case Id_PickerColumn:
				if (proxy.API_PickerColumn == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_PickerColumn = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.ui.PickerColumnProxy", ti.modules.titanium.ui.PickerColumnProxyPrototype.class); 
				}
				return proxy.API_PickerColumn;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		UIModulePrototype proxy = this;
		while (start != null && !(start instanceof UIModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof UIModulePrototype) {
			proxy = (UIModulePrototype) start;
		}

		switch (id) {
			case Id_backgroundColor:
				proxy.setter_backgroundColor(value);
				break; 
			case Id_backgroundImage:
				proxy.setter_backgroundImage(value);
				break; 
			case Id_Switch:
				if (value instanceof Proxy) {
					proxy.API_Switch = value;
				} else {
					defineProperty(original, "Switch", value, 0);
				}
				break;
			case Id_SearchBar:
				if (value instanceof Proxy) {
					proxy.API_SearchBar = value;
				} else {
					defineProperty(original, "SearchBar", value, 0);
				}
				break;
			case Id_DatePicker:
				if (value instanceof Proxy) {
					proxy.API_DatePicker = value;
				} else {
					defineProperty(original, "DatePicker", value, 0);
				}
				break;
			case Id_WebView:
				if (value instanceof Proxy) {
					proxy.API_WebView = value;
				} else {
					defineProperty(original, "WebView", value, 0);
				}
				break;
			case Id_ActivityIndicatorStyle:
				if (value instanceof Proxy) {
					proxy.API_ActivityIndicatorStyle = value;
				} else {
					defineProperty(original, "ActivityIndicatorStyle", value, 0);
				}
				break;
			case Id_OptionDialog:
				if (value instanceof Proxy) {
					proxy.API_OptionDialog = value;
				} else {
					defineProperty(original, "OptionDialog", value, 0);
				}
				break;
			case Id_TiDialog:
				if (value instanceof Proxy) {
					proxy.API_TiDialog = value;
				} else {
					defineProperty(original, "TiDialog", value, 0);
				}
				break;
			case Id_2DMatrix:
				if (value instanceof Proxy) {
					proxy.API_2DMatrix = value;
				} else {
					defineProperty(original, "2DMatrix", value, 0);
				}
				break;
			case Id_TextArea:
				if (value instanceof Proxy) {
					proxy.API_TextArea = value;
				} else {
					defineProperty(original, "TextArea", value, 0);
				}
				break;
			case Id_Slider:
				if (value instanceof Proxy) {
					proxy.API_Slider = value;
				} else {
					defineProperty(original, "Slider", value, 0);
				}
				break;
			case Id_TabContentView:
				if (value instanceof Proxy) {
					proxy.API_TabContentView = value;
				} else {
					defineProperty(original, "TabContentView", value, 0);
				}
				break;
			case Id_ActivityWindow:
				if (value instanceof Proxy) {
					proxy.API_ActivityWindow = value;
				} else {
					defineProperty(original, "ActivityWindow", value, 0);
				}
				break;
			case Id_ButtonBar:
				if (value instanceof Proxy) {
					proxy.API_ButtonBar = value;
				} else {
					defineProperty(original, "ButtonBar", value, 0);
				}
				break;
			case Id_View:
				if (value instanceof Proxy) {
					proxy.API_View = value;
				} else {
					defineProperty(original, "View", value, 0);
				}
				break;
			case Id_Button:
				if (value instanceof Proxy) {
					proxy.API_Button = value;
				} else {
					defineProperty(original, "Button", value, 0);
				}
				break;
			case Id_Clipboard:
				if (value instanceof Proxy) {
					proxy.API_Clipboard = value;
				} else {
					defineProperty(original, "Clipboard", value, 0);
				}
				break;
			case Id_ActivityIndicator:
				if (value instanceof Proxy) {
					proxy.API_ActivityIndicator = value;
				} else {
					defineProperty(original, "ActivityIndicator", value, 0);
				}
				break;
			case Id_AlertDialog:
				if (value instanceof Proxy) {
					proxy.API_AlertDialog = value;
				} else {
					defineProperty(original, "AlertDialog", value, 0);
				}
				break;
			case Id_Tab:
				if (value instanceof Proxy) {
					proxy.API_Tab = value;
				} else {
					defineProperty(original, "Tab", value, 0);
				}
				break;
			case Id_TableView:
				if (value instanceof Proxy) {
					proxy.API_TableView = value;
				} else {
					defineProperty(original, "TableView", value, 0);
				}
				break;
			case Id_PickerRow:
				if (value instanceof Proxy) {
					proxy.API_PickerRow = value;
				} else {
					defineProperty(original, "PickerRow", value, 0);
				}
				break;
			case Id_Picker:
				if (value instanceof Proxy) {
					proxy.API_Picker = value;
				} else {
					defineProperty(original, "Picker", value, 0);
				}
				break;
			case Id_EmailDialog:
				if (value instanceof Proxy) {
					proxy.API_EmailDialog = value;
				} else {
					defineProperty(original, "EmailDialog", value, 0);
				}
				break;
			case Id_ScrollView:
				if (value instanceof Proxy) {
					proxy.API_ScrollView = value;
				} else {
					defineProperty(original, "ScrollView", value, 0);
				}
				break;
			case Id_Animation:
				if (value instanceof Proxy) {
					proxy.API_Animation = value;
				} else {
					defineProperty(original, "Animation", value, 0);
				}
				break;
			case Id_TableViewSection:
				if (value instanceof Proxy) {
					proxy.API_TableViewSection = value;
				} else {
					defineProperty(original, "TableViewSection", value, 0);
				}
				break;
			case Id_TabGroup:
				if (value instanceof Proxy) {
					proxy.API_TabGroup = value;
				} else {
					defineProperty(original, "TabGroup", value, 0);
				}
				break;
			case Id_Notification:
				if (value instanceof Proxy) {
					proxy.API_Notification = value;
				} else {
					defineProperty(original, "Notification", value, 0);
				}
				break;
			case Id_TextField:
				if (value instanceof Proxy) {
					proxy.API_TextField = value;
				} else {
					defineProperty(original, "TextField", value, 0);
				}
				break;
			case Id_Android:
				if (value instanceof Proxy) {
					proxy.API_Android = value;
				} else {
					defineProperty(original, "Android", value, 0);
				}
				break;
			case Id_ScrollableView:
				if (value instanceof Proxy) {
					proxy.API_ScrollableView = value;
				} else {
					defineProperty(original, "ScrollableView", value, 0);
				}
				break;
			case Id_TableViewRow:
				if (value instanceof Proxy) {
					proxy.API_TableViewRow = value;
				} else {
					defineProperty(original, "TableViewRow", value, 0);
				}
				break;
			case Id_Label:
				if (value instanceof Proxy) {
					proxy.API_Label = value;
				} else {
					defineProperty(original, "Label", value, 0);
				}
				break;
			case Id_ImageView:
				if (value instanceof Proxy) {
					proxy.API_ImageView = value;
				} else {
					defineProperty(original, "ImageView", value, 0);
				}
				break;
			case Id_ProgressBar:
				if (value instanceof Proxy) {
					proxy.API_ProgressBar = value;
				} else {
					defineProperty(original, "ProgressBar", value, 0);
				}
				break;
			case Id_PickerColumn:
				if (value instanceof Proxy) {
					proxy.API_PickerColumn = value;
				} else {
					defineProperty(original, "PickerColumn", value, 0);
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
