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

import ti.modules.titanium.ui.TableViewSectionProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class TableViewSectionProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = -2995292276522949927L;

	private static final String TAG = "TableViewSectionProxyPrototype";
	private static final String CLASS_TAG = "TableViewSectionProxy";
	private static TableViewSectionProxyPrototype tableViewSectionProxyPrototype;


	public static TableViewSectionProxyPrototype getProxyPrototype()
	{
		return tableViewSectionProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		tableViewSectionProxyPrototype = null;
	}

	public TableViewSectionProxyPrototype()
	{
		if (tableViewSectionProxyPrototype == null && getClass().equals(TableViewSectionProxyPrototype.class)) {
			tableViewSectionProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == tableViewSectionProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return tableViewSectionProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TableViewSectionProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void remove(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "remove()", Log.DEBUG_MODE);

		try {
		TableViewSectionProxy proxy = (TableViewSectionProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("remove: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.ui.TableViewRowProxy arg0;
		arg0 = (ti.modules.titanium.ui.TableViewRowProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.remove(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void updateRowAt(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "updateRowAt()", Log.DEBUG_MODE);

		try {
		TableViewSectionProxy proxy = (TableViewSectionProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("updateRowAt: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		if (!(args[1] instanceof Proxy) && args[1] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.ui.TableViewRowProxy arg1;
		arg1 = (ti.modules.titanium.ui.TableViewRowProxy) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;

		proxy.updateRowAt(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void insertRowAt(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "insertRowAt()", Log.DEBUG_MODE);

		try {
		TableViewSectionProxy proxy = (TableViewSectionProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("insertRowAt: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		if (!(args[1] instanceof Proxy) && args[1] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[1];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.ui.TableViewRowProxy arg1;
		arg1 = (ti.modules.titanium.ui.TableViewRowProxy) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;

		proxy.insertRowAt(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getRows(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getRows()", Log.DEBUG_MODE);

		try {
		TableViewSectionProxy proxy = (TableViewSectionProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.ui.TableViewRowProxy[] javaResult = proxy.getRows();

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
		TableViewSectionProxy proxy = (TableViewSectionProxy) ((Proxy) thisObj).getProxy();

		double javaResult = proxy.getRowCount();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object rowAtIndex(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "rowAtIndex()", Log.DEBUG_MODE);

		try {
		TableViewSectionProxy proxy = (TableViewSectionProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("rowAtIndex: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		ti.modules.titanium.ui.TableViewRowProxy javaResult = proxy.rowAtIndex(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void add(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "add()", Log.DEBUG_MODE);

		try {
		TableViewSectionProxy proxy = (TableViewSectionProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("add: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.ui.TableViewRowProxy arg0;
		arg0 = (ti.modules.titanium.ui.TableViewRowProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.add(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void removeRowAt(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removeRowAt()", Log.DEBUG_MODE);

		try {
		TableViewSectionProxy proxy = (TableViewSectionProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removeRowAt: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.removeRowAt(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Number getter_rowCount()
	{
		Log.d(TAG, "get rowCount", Log.DEBUG_MODE);
		TableViewSectionProxy proxy = (TableViewSectionProxy) getProxy();
		Scriptable thisObj = this;
		double javaResult = proxy.getRowCount();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Object getter_rows()
	{
		Log.d(TAG, "get rows", Log.DEBUG_MODE);
		TableViewSectionProxy proxy = (TableViewSectionProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.ui.TableViewRowProxy[] javaResult = proxy.getRows();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getHeaderTitle = 2,
		Id_setHeaderTitle = 3,
		Id_getFooterTitle = 4,
		Id_setFooterTitle = 5,
		// Method IDs
		Id_remove = 6,
		Id_updateRowAt = 7,
		Id_insertRowAt = 8,
		Id_getRows = 9,
		Id_getRowCount = 10,
		Id_rowAtIndex = 11,
		Id_add = 12,
		Id_removeRowAt = 13
;
		

	public static final int MAX_PROTOTYPE_ID = 13;

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
            case 3: X="add";id=Id_add; break L;
            case 6: X="remove";id=Id_remove; break L;
            case 7: X="getRows";id=Id_getRows; break L;
            case 10: X="rowAtIndex";id=Id_rowAtIndex; break L;
            case 11: switch (s.charAt(0)) {
                case 'c': X="constructor";id=Id_constructor; break L;
                case 'g': X="getRowCount";id=Id_getRowCount; break L;
                case 'i': X="insertRowAt";id=Id_insertRowAt; break L;
                case 'r': X="removeRowAt";id=Id_removeRowAt; break L;
                case 'u': X="updateRowAt";id=Id_updateRowAt; break L;
                } break L;
            case 14: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(3);
                    if (c=='F') { X="getFooterTitle";id=Id_getFooterTitle; }
                    else if (c=='H') { X="getHeaderTitle";id=Id_getHeaderTitle; }
                }
                else if (c=='s') {
                    c=s.charAt(3);
                    if (c=='F') { X="setFooterTitle";id=Id_setFooterTitle; }
                    else if (c=='H') { X="setHeaderTitle";id=Id_setHeaderTitle; }
                }
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
			case Id_getHeaderTitle:
				arity = 0;
				name = "getHeaderTitle";
				break;
			case Id_setHeaderTitle:
				arity = 1;
				name = "setHeaderTitle";
				break;
			case Id_getFooterTitle:
				arity = 0;
				name = "getFooterTitle";
				break;
			case Id_setFooterTitle:
				arity = 1;
				name = "setFooterTitle";
				break;
			case Id_remove:
				arity = 1;
				name = "remove";
				break;
			case Id_updateRowAt:
				arity = 2;
				name = "updateRowAt";
				break;
			case Id_insertRowAt:
				arity = 2;
				name = "insertRowAt";
				break;
			case Id_getRows:
				arity = 0;
				name = "getRows";
				break;
			case Id_getRowCount:
				arity = 0;
				name = "getRowCount";
				break;
			case Id_rowAtIndex:
				arity = 1;
				name = "rowAtIndex";
				break;
			case Id_add:
				arity = 1;
				name = "add";
				break;
			case Id_removeRowAt:
				arity = 1;
				name = "removeRowAt";
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

		while (thisObj != null && !(thisObj instanceof TableViewSectionProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TableViewSectionProxyPrototype proxy = (TableViewSectionProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getHeaderTitle:
				return proxy.getProperty("headerTitle");
			case Id_setHeaderTitle:
				proxy.setProperty("headerTitle", args[0]);
				proxy.onPropertyChanged("headerTitle", args[0]);
				return Undefined.instance;
			case Id_getFooterTitle:
				return proxy.getProperty("footerTitle");
			case Id_setFooterTitle:
				proxy.setProperty("footerTitle", args[0]);
				proxy.onPropertyChanged("footerTitle", args[0]);
				return Undefined.instance;
			case Id_remove:
				 remove(cx, thisObj, args);
				return Undefined.instance;
			case Id_updateRowAt:
				 updateRowAt(cx, thisObj, args);
				return Undefined.instance;
			case Id_insertRowAt:
				 insertRowAt(cx, thisObj, args);
				return Undefined.instance;
			case Id_getRows:
				return getRows(cx, thisObj, args);
				
			case Id_getRowCount:
				return getRowCount(cx, thisObj, args);
				
			case Id_rowAtIndex:
				return rowAtIndex(cx, thisObj, args);
				
			case Id_add:
				 add(cx, thisObj, args);
				return Undefined.instance;
			case Id_removeRowAt:
				 removeRowAt(cx, thisObj, args);
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

	// Property accessor IDs
	private static final int

		Id_headerTitle = 3
		,		
		Id_footerTitle = 4
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
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null; int c;
            int s_length = s.length();
            if (s_length==4) { X="rows";id=Id_rows; }
            else if (s_length==8) { X="rowCount";id=Id_rowCount; }
            else if (s_length==11) {
                c=s.charAt(0);
                if (c=='f') { X="footerTitle";id=Id_footerTitle; }
                else if (c=='h') { X="headerTitle";id=Id_headerTitle; }
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
			case Id_rowCount:
				return "rowCount"; 
			case Id_rows:
				return "rows"; 
			case Id_headerTitle:
				return "headerTitle";
			case Id_footerTitle:
				return "footerTitle";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TableViewSectionProxyPrototype proxy = this;
		while (start != null && !(start instanceof TableViewSectionProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TableViewSectionProxyPrototype) {
			proxy = (TableViewSectionProxyPrototype) start;
		}

		switch (id) {
			case Id_rowCount:
				return proxy.getter_rowCount();
			case Id_rows:
				return proxy.getter_rows();
			case Id_headerTitle:
				return proxy.getProperty("headerTitle");
			case Id_footerTitle:
				return proxy.getProperty("footerTitle");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		TableViewSectionProxyPrototype proxy = this;
		while (start != null && !(start instanceof TableViewSectionProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TableViewSectionProxyPrototype) {
			proxy = (TableViewSectionProxyPrototype) start;
		}

		switch (id) {
			case Id_rowCount:
				proxy.setProperty("rowCount", value);
				proxy.onPropertyChanged("rowCount", value);
				break; 
			case Id_rows:
				proxy.setProperty("rows", value);
				proxy.onPropertyChanged("rows", value);
				break; 
			case Id_headerTitle:
				proxy.setProperty("headerTitle", value);
				proxy.onPropertyChanged("headerTitle", value);
				break;
			case Id_footerTitle:
				proxy.setProperty("footerTitle", value);
				proxy.onPropertyChanged("footerTitle", value);
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
