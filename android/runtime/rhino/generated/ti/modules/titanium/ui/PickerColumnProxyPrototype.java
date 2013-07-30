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

import ti.modules.titanium.ui.PickerColumnProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class PickerColumnProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = 1668569296292724374L;

	private static final String TAG = "PickerColumnProxyPrototype";
	private static final String CLASS_TAG = "PickerColumnProxy";
	private static PickerColumnProxyPrototype pickerColumnProxyPrototype;


	public static PickerColumnProxyPrototype getProxyPrototype()
	{
		return pickerColumnProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		pickerColumnProxyPrototype = null;
	}

	public PickerColumnProxyPrototype()
	{
		if (pickerColumnProxyPrototype == null && getClass().equals(PickerColumnProxyPrototype.class)) {
			pickerColumnProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == pickerColumnProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return pickerColumnProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(PickerColumnProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getRows(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getRows()", Log.DEBUG_MODE);

		try {
		PickerColumnProxy proxy = (PickerColumnProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.ui.PickerRowProxy[] javaResult = proxy.getRows();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getRowCount(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getRowCount()", Log.DEBUG_MODE);

		try {
		PickerColumnProxy proxy = (PickerColumnProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getRowCount();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void addRow(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addRow()", Log.DEBUG_MODE);

		try {
		PickerColumnProxy proxy = (PickerColumnProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("addRow: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.addRow(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void removeRow(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeRow()", Log.DEBUG_MODE);

		try {
		PickerColumnProxy proxy = (PickerColumnProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removeRow: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.removeRow(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setRows(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setRows()", Log.DEBUG_MODE);

		try {
		PickerColumnProxy proxy = (PickerColumnProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		proxy.setRows(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Number getter_rowCount()
	{
		Log.d(TAG, "get rowCount", Log.DEBUG_MODE);
		PickerColumnProxy proxy = (PickerColumnProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getRowCount();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Object getter_rows()
	{
		Log.d(TAG, "get rows", Log.DEBUG_MODE);
		PickerColumnProxy proxy = (PickerColumnProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.ui.PickerRowProxy[] javaResult = proxy.getRows();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public void setter_rows(Object value)
	{
		Log.d(TAG, "set rows", Log.DEBUG_MODE);
		PickerColumnProxy proxy = (PickerColumnProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Scriptable) && value != null) {
			String error = "Invalid value, expected type Scriptable, got: " + value;
			Log.e(TAG, error);
		}
		java.lang.Object[] arg0;
		arg0 = (java.lang.Object[]) TypeConverter.jsArrayToJavaObjectArray((Scriptable) value, thisObj) ;
		proxy.setRows(arg0);
		//proxy.setProperty("rows", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getRows = 2,
		Id_getRowCount = 3,
		Id_addRow = 4,
		Id_removeRow = 5,
		Id_setRows = 6
;
		

	public static final int MAX_PROTOTYPE_ID = 6;

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
            case 6: X="addRow";id=Id_addRow; break L;
            case 7: c=s.charAt(0);
                if (c=='g') { X="getRows";id=Id_getRows; }
                else if (c=='s') { X="setRows";id=Id_setRows; }
                break L;
            case 9: X="removeRow";id=Id_removeRow; break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') { X="getRowCount";id=Id_getRowCount; }
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
			case Id_getRows:
				arity = 0;
				name = "getRows";
				break;
			case Id_getRowCount:
				arity = 0;
				name = "getRowCount";
				break;
			case Id_addRow:
				arity = 1;
				name = "addRow";
				break;
			case Id_removeRow:
				arity = 1;
				name = "removeRow";
				break;
			case Id_setRows:
				arity = 1;
				name = "setRows";
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

		while (thisObj != null && !(thisObj instanceof PickerColumnProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		PickerColumnProxyPrototype proxy = (PickerColumnProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getRows:
				return getRows(cx, thisObj, args);
				
			case Id_getRowCount:
				return getRowCount(cx, thisObj, args);
				
			case Id_addRow:
				 addRow(cx, thisObj, args);
				return Undefined.instance;
			case Id_removeRow:
				 removeRow(cx, thisObj, args);
				return Undefined.instance;
			case Id_setRows:
				 setRows(cx, thisObj, args);
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

		Id_rowCount = 1
		,		
		Id_rows = 2
		;

;

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
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==4) { X="rows";id=Id_rows; }
            else if (s_length==8) { X="rowCount";id=Id_rowCount; }
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
			case Id_rowCount:
				return "rowCount"; 
			case Id_rows:
				return "rows"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		PickerColumnProxyPrototype proxy = this;
		while (start != null && !(start instanceof PickerColumnProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof PickerColumnProxyPrototype) {
			proxy = (PickerColumnProxyPrototype) start;
		}

		switch (id) {
			case Id_rowCount:
				return proxy.getter_rowCount();
			case Id_rows:
				return proxy.getter_rows();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		PickerColumnProxyPrototype proxy = this;
		while (start != null && !(start instanceof PickerColumnProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof PickerColumnProxyPrototype) {
			proxy = (PickerColumnProxyPrototype) start;
		}

		switch (id) {
			case Id_rowCount:
				proxy.setProperty("rowCount", value);
				proxy.onPropertyChanged("rowCount", value);
				break; 
			case Id_rows:
				proxy.setter_rows(value);
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
