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

import ti.modules.titanium.ui.TableViewProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class TableViewProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = -725411347108916214L;

	private static final String TAG = "TableViewProxyPrototype";
	private static final String CLASS_TAG = "TableViewProxy";
	private static TableViewProxyPrototype tableViewProxyPrototype;


	public static TableViewProxyPrototype getProxyPrototype()
	{
		return tableViewProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		tableViewProxyPrototype = null;
	}

	public TableViewProxyPrototype()
	{
		if (tableViewProxyPrototype == null && getClass().equals(TableViewProxyPrototype.class)) {
			tableViewProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == tableViewProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return tableViewProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TableViewProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public void deleteSection(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "deleteSection()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("deleteSection: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		org.appcelerator.kroll.KrollDict arg1;
		if (args.length <= 1) {
			arg1 = null;
		} else {
		if (args[1] == null) {
			arg1 = null;
		} else {
		arg1 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[1], thisObj) );
		}
		}

		proxy.deleteSection(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getIndexByName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getIndexByName()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getIndexByName: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		int javaResult = proxy.getIndexByName(arg0);

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void selectRow(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "selectRow()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("selectRow: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.selectRow(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void appendSection(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "appendSection()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("appendSection: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		org.appcelerator.kroll.KrollDict arg1;
		if (args.length <= 1) {
			arg1 = null;
		} else {
		if (args[1] == null) {
			arg1 = null;
		} else {
		arg1 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[1], thisObj) );
		}
		}

		proxy.appendSection(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getSectionCount(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getSectionCount()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getSectionCount();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void deleteRow(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "deleteRow()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("deleteRow: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		org.appcelerator.kroll.KrollDict arg1;
		if (args.length <= 1) {
			arg1 = null;
		} else {
		if (args[1] == null) {
			arg1 = null;
		} else {
		arg1 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[1], thisObj) );
		}
		}

		proxy.deleteRow(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void scrollToIndex(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "scrollToIndex()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("scrollToIndex: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.scrollToIndex(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void appendRow(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "appendRow()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("appendRow: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		org.appcelerator.kroll.KrollDict arg1;
		if (args.length <= 1) {
			arg1 = null;
		} else {
		if (args[1] == null) {
			arg1 = null;
		} else {
		arg1 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[1], thisObj) );
		}
		}

		proxy.appendRow(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setData()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		proxy.setData(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void scrollToTop(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "scrollToTop()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("scrollToTop: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		proxy.scrollToTop(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void insertRowAfter(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "insertRowAfter()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("insertRowAfter: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		java.lang.Object arg1;
		arg1 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;
		org.appcelerator.kroll.KrollDict arg2;
		if (args.length <= 2) {
			arg2 = null;
		} else {
		if (args[2] == null) {
			arg2 = null;
		} else {
		arg2 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[2], thisObj) );
		}
		}

		proxy.insertRowAfter(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void updateSection(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "updateSection()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("updateSection: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.Number arg0;
		arg0 = (java.lang.Number) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		java.lang.Object arg1;
		arg1 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;
		org.appcelerator.kroll.KrollDict arg2;
		if (args.length <= 2) {
			arg2 = null;
		} else {
		if (args[2] == null) {
			arg2 = null;
		} else {
		arg2 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[2], thisObj) );
		}
		}

		proxy.updateSection(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getData()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();

		java.lang.Object[] javaResult = proxy.getData();

		Scriptable rhinoResult = (Scriptable) TypeConverter.javaObjectArrayToJsArray(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getSections(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getSections()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.ui.TableViewSectionProxy[] javaResult = proxy.getSections();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void insertRowBefore(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "insertRowBefore()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("insertRowBefore: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		java.lang.Object arg1;
		arg1 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;
		org.appcelerator.kroll.KrollDict arg2;
		if (args.length <= 2) {
			arg2 = null;
		} else {
		if (args[2] == null) {
			arg2 = null;
		} else {
		arg2 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[2], thisObj) );
		}
		}

		proxy.insertRowBefore(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void insertSectionAfter(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "insertSectionAfter()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("insertSectionAfter: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		java.lang.Object arg1;
		arg1 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;
		org.appcelerator.kroll.KrollDict arg2;
		if (args.length <= 2) {
			arg2 = null;
		} else {
		if (args[2] == null) {
			arg2 = null;
		} else {
		arg2 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[2], thisObj) );
		}
		}

		proxy.insertSectionAfter(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void updateRow(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "updateRow()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("updateRow: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;
		java.lang.Object arg1;
		arg1 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;
		org.appcelerator.kroll.KrollDict arg2;
		if (args.length <= 2) {
			arg2 = null;
		} else {
		if (args[2] == null) {
			arg2 = null;
		} else {
		arg2 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[2], thisObj) );
		}
		}

		proxy.updateRow(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void insertSectionBefore(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "insertSectionBefore()", Log.DEBUG_MODE);

		try {
		TableViewProxy proxy = (TableViewProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("insertSectionBefore: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;
		java.lang.Object arg1;
		arg1 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;
		org.appcelerator.kroll.KrollDict arg2;
		if (args.length <= 2) {
			arg2 = null;
		} else {
		if (args[2] == null) {
			arg2 = null;
		} else {
		arg2 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[2], thisObj) );
		}
		}

		proxy.insertSectionBefore(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Number getter_sectionCount()
	{
		Log.d(TAG, "get sectionCount", Log.DEBUG_MODE);
		TableViewProxy proxy = (TableViewProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getSectionCount();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Object getter_sections()
	{
		Log.d(TAG, "get sections", Log.DEBUG_MODE);
		TableViewProxy proxy = (TableViewProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.ui.TableViewSectionProxy[] javaResult = proxy.getSections();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public Scriptable getter_data()
	{
		Log.d(TAG, "get data", Log.DEBUG_MODE);
		TableViewProxy proxy = (TableViewProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.Object[] javaResult = proxy.getData();

		Scriptable rhinoResult = (Scriptable) TypeConverter.javaObjectArrayToJsArray(javaResult, this);
		return rhinoResult;
	}
	public void setter_data(Object value)
	{
		Log.d(TAG, "set data", Log.DEBUG_MODE);
		TableViewProxy proxy = (TableViewProxy) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Scriptable) && value != null) {
			String error = "Invalid value, expected type Scriptable, got: " + value;
			Log.e(TAG, error);
		}
		java.lang.Object[] arg0;
		arg0 = (java.lang.Object[]) TypeConverter.jsArrayToJavaObjectArray((Scriptable) value, thisObj) ;
		proxy.setData(arg0);
		//proxy.setProperty("data", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getFilterAttribute = 2,
		Id_setFilterAttribute = 3,
		Id_getFilterCaseInsensitive = 4,
		Id_setFilterCaseInsensitive = 5,
		Id_getHeaderTitle = 6,
		Id_setHeaderTitle = 7,
		Id_getHeaderView = 8,
		Id_setHeaderView = 9,
		Id_getFooterTitle = 10,
		Id_setFooterTitle = 11,
		Id_getFooterView = 12,
		Id_setFooterView = 13,
		Id_getSearch = 14,
		Id_setSearch = 15,
		Id_getSeparatorColor = 16,
		Id_setSeparatorColor = 17,
		// Method IDs
		Id_deleteSection = 18,
		Id_getIndexByName = 19,
		Id_selectRow = 20,
		Id_appendSection = 21,
		Id_getSectionCount = 22,
		Id_deleteRow = 23,
		Id_scrollToIndex = 24,
		Id_appendRow = 25,
		Id_setData = 26,
		Id_scrollToTop = 27,
		Id_insertRowAfter = 28,
		Id_updateSection = 29,
		Id_getData = 30,
		Id_getSections = 31,
		Id_insertRowBefore = 32,
		Id_insertSectionAfter = 33,
		Id_updateRow = 34,
		Id_insertSectionBefore = 35
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
            case 7: c=s.charAt(0);
                if (c=='g') { X="getData";id=Id_getData; }
                else if (c=='s') { X="setData";id=Id_setData; }
                break L;
            case 9: switch (s.charAt(0)) {
                case 'a': X="appendRow";id=Id_appendRow; break L;
                case 'd': X="deleteRow";id=Id_deleteRow; break L;
                case 'g': X="getSearch";id=Id_getSearch; break L;
                case 's': c=s.charAt(8);
                    if (c=='h') { X="setSearch";id=Id_setSearch; }
                    else if (c=='w') { X="selectRow";id=Id_selectRow; }
                    break L;
                case 'u': X="updateRow";id=Id_updateRow; break L;
                } break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') { X="getSections";id=Id_getSections; }
                else if (c=='s') { X="scrollToTop";id=Id_scrollToTop; }
                break L;
            case 13: switch (s.charAt(0)) {
                case 'a': X="appendSection";id=Id_appendSection; break L;
                case 'd': X="deleteSection";id=Id_deleteSection; break L;
                case 'g': c=s.charAt(3);
                    if (c=='F') { X="getFooterView";id=Id_getFooterView; }
                    else if (c=='H') { X="getHeaderView";id=Id_getHeaderView; }
                    break L;
                case 's': c=s.charAt(3);
                    if (c=='F') { X="setFooterView";id=Id_setFooterView; }
                    else if (c=='H') { X="setHeaderView";id=Id_setHeaderView; }
                    else if (c=='o') { X="scrollToIndex";id=Id_scrollToIndex; }
                    break L;
                case 'u': X="updateSection";id=Id_updateSection; break L;
                } break L;
            case 14: switch (s.charAt(3)) {
                case 'F': c=s.charAt(0);
                    if (c=='g') { X="getFooterTitle";id=Id_getFooterTitle; }
                    else if (c=='s') { X="setFooterTitle";id=Id_setFooterTitle; }
                    break L;
                case 'H': c=s.charAt(0);
                    if (c=='g') { X="getHeaderTitle";id=Id_getHeaderTitle; }
                    else if (c=='s') { X="setHeaderTitle";id=Id_setHeaderTitle; }
                    break L;
                case 'I': X="getIndexByName";id=Id_getIndexByName; break L;
                case 'e': X="insertRowAfter";id=Id_insertRowAfter; break L;
                } break L;
            case 15: c=s.charAt(0);
                if (c=='g') { X="getSectionCount";id=Id_getSectionCount; }
                else if (c=='i') { X="insertRowBefore";id=Id_insertRowBefore; }
                break L;
            case 17: c=s.charAt(0);
                if (c=='g') { X="getSeparatorColor";id=Id_getSeparatorColor; }
                else if (c=='s') { X="setSeparatorColor";id=Id_setSeparatorColor; }
                break L;
            case 18: c=s.charAt(0);
                if (c=='g') { X="getFilterAttribute";id=Id_getFilterAttribute; }
                else if (c=='i') { X="insertSectionAfter";id=Id_insertSectionAfter; }
                else if (c=='s') { X="setFilterAttribute";id=Id_setFilterAttribute; }
                break L;
            case 19: X="insertSectionBefore";id=Id_insertSectionBefore; break L;
            case 24: c=s.charAt(0);
                if (c=='g') { X="getFilterCaseInsensitive";id=Id_getFilterCaseInsensitive; }
                else if (c=='s') { X="setFilterCaseInsensitive";id=Id_setFilterCaseInsensitive; }
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
			case Id_getFilterAttribute:
				arity = 0;
				name = "getFilterAttribute";
				break;
			case Id_setFilterAttribute:
				arity = 1;
				name = "setFilterAttribute";
				break;
			case Id_getFilterCaseInsensitive:
				arity = 0;
				name = "getFilterCaseInsensitive";
				break;
			case Id_setFilterCaseInsensitive:
				arity = 1;
				name = "setFilterCaseInsensitive";
				break;
			case Id_getHeaderTitle:
				arity = 0;
				name = "getHeaderTitle";
				break;
			case Id_setHeaderTitle:
				arity = 1;
				name = "setHeaderTitle";
				break;
			case Id_getHeaderView:
				arity = 0;
				name = "getHeaderView";
				break;
			case Id_setHeaderView:
				arity = 1;
				name = "setHeaderView";
				break;
			case Id_getFooterTitle:
				arity = 0;
				name = "getFooterTitle";
				break;
			case Id_setFooterTitle:
				arity = 1;
				name = "setFooterTitle";
				break;
			case Id_getFooterView:
				arity = 0;
				name = "getFooterView";
				break;
			case Id_setFooterView:
				arity = 1;
				name = "setFooterView";
				break;
			case Id_getSearch:
				arity = 0;
				name = "getSearch";
				break;
			case Id_setSearch:
				arity = 1;
				name = "setSearch";
				break;
			case Id_getSeparatorColor:
				arity = 0;
				name = "getSeparatorColor";
				break;
			case Id_setSeparatorColor:
				arity = 1;
				name = "setSeparatorColor";
				break;
			case Id_deleteSection:
				arity = 2;
				name = "deleteSection";
				break;
			case Id_getIndexByName:
				arity = 1;
				name = "getIndexByName";
				break;
			case Id_selectRow:
				arity = 1;
				name = "selectRow";
				break;
			case Id_appendSection:
				arity = 2;
				name = "appendSection";
				break;
			case Id_getSectionCount:
				arity = 0;
				name = "getSectionCount";
				break;
			case Id_deleteRow:
				arity = 2;
				name = "deleteRow";
				break;
			case Id_scrollToIndex:
				arity = 1;
				name = "scrollToIndex";
				break;
			case Id_appendRow:
				arity = 2;
				name = "appendRow";
				break;
			case Id_setData:
				arity = 1;
				name = "setData";
				break;
			case Id_scrollToTop:
				arity = 1;
				name = "scrollToTop";
				break;
			case Id_insertRowAfter:
				arity = 3;
				name = "insertRowAfter";
				break;
			case Id_updateSection:
				arity = 3;
				name = "updateSection";
				break;
			case Id_getData:
				arity = 0;
				name = "getData";
				break;
			case Id_getSections:
				arity = 0;
				name = "getSections";
				break;
			case Id_insertRowBefore:
				arity = 3;
				name = "insertRowBefore";
				break;
			case Id_insertSectionAfter:
				arity = 3;
				name = "insertSectionAfter";
				break;
			case Id_updateRow:
				arity = 3;
				name = "updateRow";
				break;
			case Id_insertSectionBefore:
				arity = 3;
				name = "insertSectionBefore";
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

		while (thisObj != null && !(thisObj instanceof TableViewProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TableViewProxyPrototype proxy = (TableViewProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getFilterAttribute:
				return proxy.getProperty("filterAttribute");
			case Id_setFilterAttribute:
				proxy.setProperty("filterAttribute", args[0]);
				proxy.onPropertyChanged("filterAttribute", args[0]);
				return Undefined.instance;
			case Id_getFilterCaseInsensitive:
				return proxy.getProperty("filterCaseInsensitive");
			case Id_setFilterCaseInsensitive:
				proxy.setProperty("filterCaseInsensitive", args[0]);
				proxy.onPropertyChanged("filterCaseInsensitive", args[0]);
				return Undefined.instance;
			case Id_getHeaderTitle:
				return proxy.getProperty("headerTitle");
			case Id_setHeaderTitle:
				proxy.setProperty("headerTitle", args[0]);
				proxy.onPropertyChanged("headerTitle", args[0]);
				return Undefined.instance;
			case Id_getHeaderView:
				return proxy.getProperty("headerView");
			case Id_setHeaderView:
				proxy.setProperty("headerView", args[0]);
				proxy.onPropertyChanged("headerView", args[0]);
				return Undefined.instance;
			case Id_getFooterTitle:
				return proxy.getProperty("footerTitle");
			case Id_setFooterTitle:
				proxy.setProperty("footerTitle", args[0]);
				proxy.onPropertyChanged("footerTitle", args[0]);
				return Undefined.instance;
			case Id_getFooterView:
				return proxy.getProperty("footerView");
			case Id_setFooterView:
				proxy.setProperty("footerView", args[0]);
				proxy.onPropertyChanged("footerView", args[0]);
				return Undefined.instance;
			case Id_getSearch:
				return proxy.getProperty("search");
			case Id_setSearch:
				proxy.setProperty("search", args[0]);
				proxy.onPropertyChanged("search", args[0]);
				return Undefined.instance;
			case Id_getSeparatorColor:
				return proxy.getProperty("separatorColor");
			case Id_setSeparatorColor:
				proxy.setProperty("separatorColor", args[0]);
				proxy.onPropertyChanged("separatorColor", args[0]);
				return Undefined.instance;
			case Id_deleteSection:
				 deleteSection(cx, thisObj, args);
				return Undefined.instance;
			case Id_getIndexByName:
				return getIndexByName(cx, thisObj, args);
				
			case Id_selectRow:
				 selectRow(cx, thisObj, args);
				return Undefined.instance;
			case Id_appendSection:
				 appendSection(cx, thisObj, args);
				return Undefined.instance;
			case Id_getSectionCount:
				return getSectionCount(cx, thisObj, args);
				
			case Id_deleteRow:
				 deleteRow(cx, thisObj, args);
				return Undefined.instance;
			case Id_scrollToIndex:
				 scrollToIndex(cx, thisObj, args);
				return Undefined.instance;
			case Id_appendRow:
				 appendRow(cx, thisObj, args);
				return Undefined.instance;
			case Id_setData:
				 setData(cx, thisObj, args);
				return Undefined.instance;
			case Id_scrollToTop:
				 scrollToTop(cx, thisObj, args);
				return Undefined.instance;
			case Id_insertRowAfter:
				 insertRowAfter(cx, thisObj, args);
				return Undefined.instance;
			case Id_updateSection:
				 updateSection(cx, thisObj, args);
				return Undefined.instance;
			case Id_getData:
				return getData(cx, thisObj, args);
				
			case Id_getSections:
				return getSections(cx, thisObj, args);
				
			case Id_insertRowBefore:
				 insertRowBefore(cx, thisObj, args);
				return Undefined.instance;
			case Id_insertSectionAfter:
				 insertSectionAfter(cx, thisObj, args);
				return Undefined.instance;
			case Id_updateRow:
				 updateRow(cx, thisObj, args);
				return Undefined.instance;
			case Id_insertSectionBefore:
				 insertSectionBefore(cx, thisObj, args);
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

		Id_sectionCount = 1
		,		
		Id_sections = 2
		,		
		Id_data = 3
		;

	// Property accessor IDs
	private static final int

		Id_filterAttribute = 4
		,		
		Id_filterCaseInsensitive = 5
		,		
		Id_headerTitle = 6
		,		
		Id_headerView = 7
		,		
		Id_footerTitle = 8
		,		
		Id_footerView = 9
		,		
		Id_search = 10
		,		
		Id_separatorColor = 11
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
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 4: X="data";id=Id_data; break L;
            case 6: X="search";id=Id_search; break L;
            case 8: X="sections";id=Id_sections; break L;
            case 10: c=s.charAt(0);
                if (c=='f') { X="footerView";id=Id_footerView; }
                else if (c=='h') { X="headerView";id=Id_headerView; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='f') { X="footerTitle";id=Id_footerTitle; }
                else if (c=='h') { X="headerTitle";id=Id_headerTitle; }
                break L;
            case 12: X="sectionCount";id=Id_sectionCount; break L;
            case 14: X="separatorColor";id=Id_separatorColor; break L;
            case 15: X="filterAttribute";id=Id_filterAttribute; break L;
            case 21: X="filterCaseInsensitive";id=Id_filterCaseInsensitive; break L;
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
			case Id_sectionCount:
				return "sectionCount"; 
			case Id_sections:
				return "sections"; 
			case Id_data:
				return "data"; 
			case Id_filterAttribute:
				return "filterAttribute";
			case Id_filterCaseInsensitive:
				return "filterCaseInsensitive";
			case Id_headerTitle:
				return "headerTitle";
			case Id_headerView:
				return "headerView";
			case Id_footerTitle:
				return "footerTitle";
			case Id_footerView:
				return "footerView";
			case Id_search:
				return "search";
			case Id_separatorColor:
				return "separatorColor";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TableViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof TableViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TableViewProxyPrototype) {
			proxy = (TableViewProxyPrototype) start;
		}

		switch (id) {
			case Id_sectionCount:
				return proxy.getter_sectionCount();
			case Id_sections:
				return proxy.getter_sections();
			case Id_data:
				return proxy.getter_data();
			case Id_filterAttribute:
				return proxy.getProperty("filterAttribute");
			case Id_filterCaseInsensitive:
				return proxy.getProperty("filterCaseInsensitive");
			case Id_headerTitle:
				return proxy.getProperty("headerTitle");
			case Id_headerView:
				return proxy.getProperty("headerView");
			case Id_footerTitle:
				return proxy.getProperty("footerTitle");
			case Id_footerView:
				return proxy.getProperty("footerView");
			case Id_search:
				return proxy.getProperty("search");
			case Id_separatorColor:
				return proxy.getProperty("separatorColor");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		TableViewProxyPrototype proxy = this;
		while (start != null && !(start instanceof TableViewProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TableViewProxyPrototype) {
			proxy = (TableViewProxyPrototype) start;
		}

		switch (id) {
			case Id_sectionCount:
				proxy.setProperty("sectionCount", value);
				proxy.onPropertyChanged("sectionCount", value);
				break; 
			case Id_sections:
				proxy.setProperty("sections", value);
				proxy.onPropertyChanged("sections", value);
				break; 
			case Id_data:
				proxy.setter_data(value);
				break; 
			case Id_filterAttribute:
				proxy.setProperty("filterAttribute", value);
				proxy.onPropertyChanged("filterAttribute", value);
				break;
			case Id_filterCaseInsensitive:
				proxy.setProperty("filterCaseInsensitive", value);
				proxy.onPropertyChanged("filterCaseInsensitive", value);
				break;
			case Id_headerTitle:
				proxy.setProperty("headerTitle", value);
				proxy.onPropertyChanged("headerTitle", value);
				break;
			case Id_headerView:
				proxy.setProperty("headerView", value);
				proxy.onPropertyChanged("headerView", value);
				break;
			case Id_footerTitle:
				proxy.setProperty("footerTitle", value);
				proxy.onPropertyChanged("footerTitle", value);
				break;
			case Id_footerView:
				proxy.setProperty("footerView", value);
				proxy.onPropertyChanged("footerView", value);
				break;
			case Id_search:
				proxy.setProperty("search", value);
				proxy.onPropertyChanged("search", value);
				break;
			case Id_separatorColor:
				proxy.setProperty("separatorColor", value);
				proxy.onPropertyChanged("separatorColor", value);
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
