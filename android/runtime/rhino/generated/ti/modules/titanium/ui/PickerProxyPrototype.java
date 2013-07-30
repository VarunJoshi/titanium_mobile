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

import ti.modules.titanium.ui.PickerProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class PickerProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = 1117888257626819685L;

	private static final String TAG = "PickerProxyPrototype";
	private static final String CLASS_TAG = "PickerProxy";
	private static PickerProxyPrototype pickerProxyPrototype;


	public static PickerProxyPrototype getProxyPrototype()
	{
		return pickerProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		pickerProxyPrototype = null;
	}

	public PickerProxyPrototype()
	{
		if (pickerProxyPrototype == null && getClass().equals(PickerProxyPrototype.class)) {
			pickerProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == pickerProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return pickerProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(PickerProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void showDatePickerDialog(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "showDatePickerDialog()", Log.DEBUG_MODE);

		try {
		PickerProxy proxy = (PickerProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		proxy.showDatePickerDialog(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void showTimePickerDialog(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "showTimePickerDialog()", Log.DEBUG_MODE);

		try {
		PickerProxy proxy = (PickerProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		proxy.showTimePickerDialog(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getType(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getType()", Log.DEBUG_MODE);

		try {
		PickerProxy proxy = (PickerProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getType();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setColumns(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setColumns()", Log.DEBUG_MODE);

		try {
		PickerProxy proxy = (PickerProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setColumns: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setColumns(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setUseSpinner(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setUseSpinner()", Log.DEBUG_MODE);

		try {
		PickerProxy proxy = (PickerProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setUseSpinner: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		proxy.setUseSpinner(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setType(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setType()", Log.DEBUG_MODE);

		try {
		PickerProxy proxy = (PickerProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setType: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.setType(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void add(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "add()", Log.DEBUG_MODE);

		try {
		PickerProxy proxy = (PickerProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("add: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.add(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getColumns(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getColumns()", Log.DEBUG_MODE);

		try {
		PickerProxy proxy = (PickerProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.ui.PickerColumnProxy[] javaResult = proxy.getColumns();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getSelectedRow(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getSelectedRow()", Log.DEBUG_MODE);

		try {
		PickerProxy proxy = (PickerProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getSelectedRow: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		ti.modules.titanium.ui.PickerRowProxy javaResult = proxy.getSelectedRow(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getUseSpinner(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getUseSpinner()", Log.DEBUG_MODE);

		try {
		PickerProxy proxy = (PickerProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getUseSpinner();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setSelectedRow(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setSelectedRow()", Log.DEBUG_MODE);

		try {
		PickerProxy proxy = (PickerProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setSelectedRow: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		int arg1;
		arg1 = (int) TypeConverter.jsObjectToJavaInt(args[1], thisObj) ;
		boolean arg2;
		if (args.length <= 2) {
			arg2 = false;
		} else {
		arg2 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[2], thisObj) ;
		}

		proxy.setSelectedRow(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Object getter_columns()
	{
		Log.d(TAG, "get columns", Log.DEBUG_MODE);
		PickerProxy proxy = (PickerProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.ui.PickerColumnProxy[] javaResult = proxy.getColumns();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public void setter_columns(Object value)
	{
		Log.d(TAG, "set columns", Log.DEBUG_MODE);
		PickerProxy proxy = (PickerProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setColumns(arg0);
		//proxy.setProperty("columns", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Boolean getter_useSpinner()
	{
		Log.d(TAG, "get useSpinner", Log.DEBUG_MODE);
		PickerProxy proxy = (PickerProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getUseSpinner();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_useSpinner(Object value)
	{
		Log.d(TAG, "set useSpinner", Log.DEBUG_MODE);
		PickerProxy proxy = (PickerProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setUseSpinner(arg0);
		//proxy.setProperty("useSpinner", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Number getter_type()
	{
		Log.d(TAG, "get type", Log.DEBUG_MODE);
		PickerProxy proxy = (PickerProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getType();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public void setter_type(Object value)
	{
		Log.d(TAG, "set type", Log.DEBUG_MODE);
		PickerProxy proxy = (PickerProxy) getProxy();
		Scriptable thisObj = this;
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(value, thisObj) ;
		proxy.setType(arg0);
		//proxy.setProperty("type", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getLocale = 2,
		Id_setLocale = 3,
		Id_getVisibleItems = 4,
		Id_setVisibleItems = 5,
		Id_getValue = 6,
		Id_setValue = 7,
		// Method IDs
		Id_showDatePickerDialog = 8,
		Id_showTimePickerDialog = 9,
		Id_getType = 10,
		Id_setColumns = 11,
		Id_setUseSpinner = 12,
		Id_setType = 13,
		Id_add = 14,
		Id_getColumns = 15,
		Id_getSelectedRow = 16,
		Id_getUseSpinner = 17,
		Id_setSelectedRow = 18
;
		

	public static final int MAX_PROTOTYPE_ID = 18;

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
            case 3: X="add";id=Id_add; break L;
            case 7: c=s.charAt(0);
                if (c=='g') { X="getType";id=Id_getType; }
                else if (c=='s') { X="setType";id=Id_setType; }
                break L;
            case 8: c=s.charAt(0);
                if (c=='g') { X="getValue";id=Id_getValue; }
                else if (c=='s') { X="setValue";id=Id_setValue; }
                break L;
            case 9: c=s.charAt(0);
                if (c=='g') { X="getLocale";id=Id_getLocale; }
                else if (c=='s') { X="setLocale";id=Id_setLocale; }
                break L;
            case 10: c=s.charAt(0);
                if (c=='g') { X="getColumns";id=Id_getColumns; }
                else if (c=='s') { X="setColumns";id=Id_setColumns; }
                break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 13: c=s.charAt(0);
                if (c=='g') { X="getUseSpinner";id=Id_getUseSpinner; }
                else if (c=='s') { X="setUseSpinner";id=Id_setUseSpinner; }
                break L;
            case 14: c=s.charAt(0);
                if (c=='g') { X="getSelectedRow";id=Id_getSelectedRow; }
                else if (c=='s') { X="setSelectedRow";id=Id_setSelectedRow; }
                break L;
            case 15: c=s.charAt(0);
                if (c=='g') { X="getVisibleItems";id=Id_getVisibleItems; }
                else if (c=='s') { X="setVisibleItems";id=Id_setVisibleItems; }
                break L;
            case 20: c=s.charAt(4);
                if (c=='D') { X="showDatePickerDialog";id=Id_showDatePickerDialog; }
                else if (c=='T') { X="showTimePickerDialog";id=Id_showTimePickerDialog; }
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
			case Id_getLocale:
				arity = 0;
				name = "getLocale";
				break;
			case Id_setLocale:
				arity = 1;
				name = "setLocale";
				break;
			case Id_getVisibleItems:
				arity = 0;
				name = "getVisibleItems";
				break;
			case Id_setVisibleItems:
				arity = 1;
				name = "setVisibleItems";
				break;
			case Id_getValue:
				arity = 0;
				name = "getValue";
				break;
			case Id_setValue:
				arity = 1;
				name = "setValue";
				break;
			case Id_showDatePickerDialog:
				arity = 1;
				name = "showDatePickerDialog";
				break;
			case Id_showTimePickerDialog:
				arity = 1;
				name = "showTimePickerDialog";
				break;
			case Id_getType:
				arity = 0;
				name = "getType";
				break;
			case Id_setColumns:
				arity = 1;
				name = "setColumns";
				break;
			case Id_setUseSpinner:
				arity = 1;
				name = "setUseSpinner";
				break;
			case Id_setType:
				arity = 1;
				name = "setType";
				break;
			case Id_add:
				arity = 1;
				name = "add";
				break;
			case Id_getColumns:
				arity = 0;
				name = "getColumns";
				break;
			case Id_getSelectedRow:
				arity = 1;
				name = "getSelectedRow";
				break;
			case Id_getUseSpinner:
				arity = 0;
				name = "getUseSpinner";
				break;
			case Id_setSelectedRow:
				arity = 3;
				name = "setSelectedRow";
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

		while (thisObj != null && !(thisObj instanceof PickerProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		PickerProxyPrototype proxy = (PickerProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getLocale:
				return proxy.getProperty("locale");
			case Id_setLocale:
				proxy.setProperty("locale", args[0]);
				proxy.onPropertyChanged("locale", args[0]);
				return Undefined.instance;
			case Id_getVisibleItems:
				return proxy.getProperty("visibleItems");
			case Id_setVisibleItems:
				proxy.setProperty("visibleItems", args[0]);
				proxy.onPropertyChanged("visibleItems", args[0]);
				return Undefined.instance;
			case Id_getValue:
				return proxy.getProperty("value");
			case Id_setValue:
				proxy.setProperty("value", args[0]);
				proxy.onPropertyChanged("value", args[0]);
				return Undefined.instance;
			case Id_showDatePickerDialog:
				 showDatePickerDialog(cx, thisObj, args);
				return Undefined.instance;
			case Id_showTimePickerDialog:
				 showTimePickerDialog(cx, thisObj, args);
				return Undefined.instance;
			case Id_getType:
				return getType(cx, thisObj, args);
				
			case Id_setColumns:
				 setColumns(cx, thisObj, args);
				return Undefined.instance;
			case Id_setUseSpinner:
				 setUseSpinner(cx, thisObj, args);
				return Undefined.instance;
			case Id_setType:
				 setType(cx, thisObj, args);
				return Undefined.instance;
			case Id_add:
				 add(cx, thisObj, args);
				return Undefined.instance;
			case Id_getColumns:
				return getColumns(cx, thisObj, args);
				
			case Id_getSelectedRow:
				return getSelectedRow(cx, thisObj, args);
				
			case Id_getUseSpinner:
				return getUseSpinner(cx, thisObj, args);
				
			case Id_setSelectedRow:
				 setSelectedRow(cx, thisObj, args);
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

		Id_columns = 1
		,		
		Id_useSpinner = 2
		,		
		Id_type = 3
		;

	// Property accessor IDs
	private static final int

		Id_locale = 4
		,		
		Id_visibleItems = 5
		,		
		Id_value = 6
		;

;

	public static final int MAX_INSTANCE_ID = 6;

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
            case 4: X="type";id=Id_type; break L;
            case 5: X="value";id=Id_value; break L;
            case 6: X="locale";id=Id_locale; break L;
            case 7: X="columns";id=Id_columns; break L;
            case 10: X="useSpinner";id=Id_useSpinner; break L;
            case 12: X="visibleItems";id=Id_visibleItems; break L;
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
			case Id_columns:
				return "columns"; 
			case Id_useSpinner:
				return "useSpinner"; 
			case Id_type:
				return "type"; 
			case Id_locale:
				return "locale";
			case Id_visibleItems:
				return "visibleItems";
			case Id_value:
				return "value";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		PickerProxyPrototype proxy = this;
		while (start != null && !(start instanceof PickerProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof PickerProxyPrototype) {
			proxy = (PickerProxyPrototype) start;
		}

		switch (id) {
			case Id_columns:
				return proxy.getter_columns();
			case Id_useSpinner:
				return proxy.getter_useSpinner();
			case Id_type:
				return proxy.getter_type();
			case Id_locale:
				return proxy.getProperty("locale");
			case Id_visibleItems:
				return proxy.getProperty("visibleItems");
			case Id_value:
				return proxy.getProperty("value");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		PickerProxyPrototype proxy = this;
		while (start != null && !(start instanceof PickerProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof PickerProxyPrototype) {
			proxy = (PickerProxyPrototype) start;
		}

		switch (id) {
			case Id_columns:
				proxy.setter_columns(value);
				break; 
			case Id_useSpinner:
				proxy.setter_useSpinner(value);
				break; 
			case Id_type:
				proxy.setter_type(value);
				break; 
			case Id_locale:
				proxy.setProperty("locale", value);
				proxy.onPropertyChanged("locale", value);
				break;
			case Id_visibleItems:
				proxy.setProperty("visibleItems", value);
				proxy.onPropertyChanged("visibleItems", value);
				break;
			case Id_value:
				proxy.setProperty("value", value);
				proxy.onPropertyChanged("value", value);
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
