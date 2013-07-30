/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.database;

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

import ti.modules.titanium.database.TiResultSetProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class TiResultSetProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 9176499586004995860L;

	private static final String TAG = "TiResultSetProxyPrototype";
	private static final String CLASS_TAG = "TiResultSetProxy";
	private static TiResultSetProxyPrototype tiResultSetProxyPrototype;


	public static TiResultSetProxyPrototype getProxyPrototype()
	{
		return tiResultSetProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		tiResultSetProxyPrototype = null;
	}

	public TiResultSetProxyPrototype()
	{
		if (tiResultSetProxyPrototype == null && getClass().equals(TiResultSetProxyPrototype.class)) {
			tiResultSetProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == tiResultSetProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return tiResultSetProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TiResultSetProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object field(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "field()", Log.DEBUG_MODE);

		try {
		TiResultSetProxy proxy = (TiResultSetProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		java.lang.Object javaResult = proxy.field(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object isValidRow(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isValidRow()", Log.DEBUG_MODE);

		try {
		TiResultSetProxy proxy = (TiResultSetProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isValidRow();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getField(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getField()", Log.DEBUG_MODE);

		try {
		TiResultSetProxy proxy = (TiResultSetProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		java.lang.Object javaResult = proxy.getField(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void next(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "next()", Log.DEBUG_MODE);

		try {
		TiResultSetProxy proxy = (TiResultSetProxy) ((Proxy) thisObj).getProxy();

		proxy.next();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getRowCount(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getRowCount()", Log.DEBUG_MODE);

		try {
		TiResultSetProxy proxy = (TiResultSetProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getRowCount();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getFieldCount(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getFieldCount()", Log.DEBUG_MODE);

		try {
		TiResultSetProxy proxy = (TiResultSetProxy) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getFieldCount();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getFieldByName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getFieldByName()", Log.DEBUG_MODE);

		try {
		TiResultSetProxy proxy = (TiResultSetProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		java.lang.Object javaResult = proxy.getFieldByName(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object fieldName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "fieldName()", Log.DEBUG_MODE);

		try {
		TiResultSetProxy proxy = (TiResultSetProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("fieldName: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		java.lang.String javaResult = proxy.fieldName(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object fieldByName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "fieldByName()", Log.DEBUG_MODE);

		try {
		TiResultSetProxy proxy = (TiResultSetProxy) ((Proxy) thisObj).getProxy();
	int length = args.length - 0;
	if (length < 0) {
		length = 0;
	}

	Object[] arg0 = new Object[length];
	for (int i = 0; i < length; i++) {
		arg0[i] = TypeConverter.jsObjectToJavaObject(args[i+0], this);
	}

		java.lang.Object javaResult = proxy.fieldByName(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getFieldName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getFieldName()", Log.DEBUG_MODE);

		try {
		TiResultSetProxy proxy = (TiResultSetProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getFieldName: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		java.lang.String javaResult = proxy.getFieldName(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void close(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "close()", Log.DEBUG_MODE);

		try {
		TiResultSetProxy proxy = (TiResultSetProxy) ((Proxy) thisObj).getProxy();

		proxy.close();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Boolean getter_validRow()
	{
		Log.d(TAG, "get validRow", Log.DEBUG_MODE);
		TiResultSetProxy proxy = (TiResultSetProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.isValidRow();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public Number getter_rowCount()
	{
		Log.d(TAG, "get rowCount", Log.DEBUG_MODE);
		TiResultSetProxy proxy = (TiResultSetProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getRowCount();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Number getter_fieldCount()
	{
		Log.d(TAG, "get fieldCount", Log.DEBUG_MODE);
		TiResultSetProxy proxy = (TiResultSetProxy) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getFieldCount();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_field = 2,
		Id_isValidRow = 3,
		Id_getField = 4,
		Id_next = 5,
		Id_getRowCount = 6,
		Id_getFieldCount = 7,
		Id_getFieldByName = 8,
		Id_fieldName = 9,
		Id_fieldByName = 10,
		Id_getFieldName = 11,
		Id_close = 12
;
		

	public static final int MAX_PROTOTYPE_ID = 12;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 4: X="next";id=Id_next; break L;
            case 5: c=s.charAt(0);
                if (c=='c') { X="close";id=Id_close; }
                else if (c=='f') { X="field";id=Id_field; }
                break L;
            case 8: X="getField";id=Id_getField; break L;
            case 9: X="fieldName";id=Id_fieldName; break L;
            case 10: X="isValidRow";id=Id_isValidRow; break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='f') { X="fieldByName";id=Id_fieldByName; }
                else if (c=='g') { X="getRowCount";id=Id_getRowCount; }
                break L;
            case 12: X="getFieldName";id=Id_getFieldName; break L;
            case 13: X="getFieldCount";id=Id_getFieldCount; break L;
            case 14: X="getFieldByName";id=Id_getFieldByName; break L;
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
			case Id_field:
				arity = 1;
				name = "field";
				break;
			case Id_isValidRow:
				arity = 0;
				name = "isValidRow";
				break;
			case Id_getField:
				arity = 1;
				name = "getField";
				break;
			case Id_next:
				arity = 0;
				name = "next";
				break;
			case Id_getRowCount:
				arity = 0;
				name = "getRowCount";
				break;
			case Id_getFieldCount:
				arity = 0;
				name = "getFieldCount";
				break;
			case Id_getFieldByName:
				arity = 1;
				name = "getFieldByName";
				break;
			case Id_fieldName:
				arity = 1;
				name = "fieldName";
				break;
			case Id_fieldByName:
				arity = 1;
				name = "fieldByName";
				break;
			case Id_getFieldName:
				arity = 1;
				name = "getFieldName";
				break;
			case Id_close:
				arity = 0;
				name = "close";
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

		while (thisObj != null && !(thisObj instanceof TiResultSetProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TiResultSetProxyPrototype proxy = (TiResultSetProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_field:
				return field(cx, thisObj, args);
				
			case Id_isValidRow:
				return isValidRow(cx, thisObj, args);
				
			case Id_getField:
				return getField(cx, thisObj, args);
				
			case Id_next:
				 next(cx, thisObj, args);
				return Undefined.instance;
			case Id_getRowCount:
				return getRowCount(cx, thisObj, args);
				
			case Id_getFieldCount:
				return getFieldCount(cx, thisObj, args);
				
			case Id_getFieldByName:
				return getFieldByName(cx, thisObj, args);
				
			case Id_fieldName:
				return fieldName(cx, thisObj, args);
				
			case Id_fieldByName:
				return fieldByName(cx, thisObj, args);
				
			case Id_getFieldName:
				return getFieldName(cx, thisObj, args);
				
			case Id_close:
				 close(cx, thisObj, args);
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

		Id_validRow = 1
		,		
		Id_rowCount = 2
		,		
		Id_fieldCount = 3
		;

;

;

	public static final int MAX_INSTANCE_ID = 3;

	@Override
	protected int getMaxInstanceId()
	{
		return MAX_INSTANCE_ID;
	}

	@Override
	protected int findInstanceIdInfo(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null; int c;
            int s_length = s.length();
            if (s_length==8) {
                c=s.charAt(0);
                if (c=='r') { X="rowCount";id=Id_rowCount; }
                else if (c=='v') { X="validRow";id=Id_validRow; }
            }
            else if (s_length==10) { X="fieldCount";id=Id_fieldCount; }
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
			case Id_validRow:
				return "validRow"; 
			case Id_rowCount:
				return "rowCount"; 
			case Id_fieldCount:
				return "fieldCount"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TiResultSetProxyPrototype proxy = this;
		while (start != null && !(start instanceof TiResultSetProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TiResultSetProxyPrototype) {
			proxy = (TiResultSetProxyPrototype) start;
		}

		switch (id) {
			case Id_validRow:
				return proxy.getter_validRow();
			case Id_rowCount:
				return proxy.getter_rowCount();
			case Id_fieldCount:
				return proxy.getter_fieldCount();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		TiResultSetProxyPrototype proxy = this;
		while (start != null && !(start instanceof TiResultSetProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TiResultSetProxyPrototype) {
			proxy = (TiResultSetProxyPrototype) start;
		}

		switch (id) {
			case Id_validRow:
				proxy.setProperty("validRow", value);
				proxy.onPropertyChanged("validRow", value);
				break; 
			case Id_rowCount:
				proxy.setProperty("rowCount", value);
				proxy.onPropertyChanged("rowCount", value);
				break; 
			case Id_fieldCount:
				proxy.setProperty("fieldCount", value);
				proxy.onPropertyChanged("fieldCount", value);
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
