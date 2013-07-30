/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.ui.clipboard;

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

import ti.modules.titanium.ui.clipboard.ClipboardModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class ClipboardModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = 1827529446518887652L;

	private static final String TAG = "ClipboardModulePrototype";
	private static final String CLASS_TAG = "ClipboardModule";
	private static ClipboardModulePrototype clipboardModulePrototype;


	public static ClipboardModulePrototype getProxyPrototype()
	{
		return clipboardModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		clipboardModulePrototype = null;
	}

	public ClipboardModulePrototype()
	{
		if (clipboardModulePrototype == null && getClass().equals(ClipboardModulePrototype.class)) {
			clipboardModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;
	}

	public Scriptable getPrototype()
	{
		if (this == clipboardModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return clipboardModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ClipboardModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getText(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getText()", Log.DEBUG_MODE);

		try {
		ClipboardModule proxy = (ClipboardModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getText();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void clearData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "clearData()", Log.DEBUG_MODE);

		try {
		ClipboardModule proxy = (ClipboardModule) ((Proxy) thisObj).getProxy();
		java.lang.String arg0;
		if (args.length <= 0) {
			arg0 = null;
		} else {
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		}

		proxy.clearData(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getData()", Log.DEBUG_MODE);

		try {
		ClipboardModule proxy = (ClipboardModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getData: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		java.lang.Object javaResult = proxy.getData(arg0);

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object hasData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "hasData()", Log.DEBUG_MODE);

		try {
		ClipboardModule proxy = (ClipboardModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("hasData: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		boolean javaResult = proxy.hasData(arg0);

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void clearText(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "clearText()", Log.DEBUG_MODE);

		try {
		ClipboardModule proxy = (ClipboardModule) ((Proxy) thisObj).getProxy();

		proxy.clearText();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setText(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setText()", Log.DEBUG_MODE);

		try {
		ClipboardModule proxy = (ClipboardModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setText: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setText(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object hasText(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "hasText()", Log.DEBUG_MODE);

		try {
		ClipboardModule proxy = (ClipboardModule) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.hasText();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setData(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setData()", Log.DEBUG_MODE);

		try {
		ClipboardModule proxy = (ClipboardModule) ((Proxy) thisObj).getProxy();
		if (args.length < 2) {
			throw new IllegalArgumentException("setData: Invalid number of arguments. Expected 2 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.Object arg1;
		arg1 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;

		proxy.setData(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public String getter_text()
	{
		Log.d(TAG, "get text", Log.DEBUG_MODE);
		ClipboardModule proxy = (ClipboardModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getText();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_text(Object value)
	{
		Log.d(TAG, "set text", Log.DEBUG_MODE);
		ClipboardModule proxy = (ClipboardModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setText(arg0);
		//proxy.setProperty("text", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getText = 2,
		Id_clearData = 3,
		Id_getData = 4,
		Id_hasData = 5,
		Id_clearText = 6,
		Id_setText = 7,
		Id_hasText = 8,
		Id_setData = 9
;
		

	public static final int MAX_PROTOTYPE_ID = 9;

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
            int s_length = s.length();
            if (s_length==7) {
                c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(6);
                    if (c=='a') { X="getData";id=Id_getData; }
                    else if (c=='t') { X="getText";id=Id_getText; }
                }
                else if (c=='h') {
                    c=s.charAt(6);
                    if (c=='a') { X="hasData";id=Id_hasData; }
                    else if (c=='t') { X="hasText";id=Id_hasText; }
                }
                else if (c=='s') {
                    c=s.charAt(6);
                    if (c=='a') { X="setData";id=Id_setData; }
                    else if (c=='t') { X="setText";id=Id_setText; }
                }
            }
            else if (s_length==9) {
                c=s.charAt(5);
                if (c=='D') { X="clearData";id=Id_clearData; }
                else if (c=='T') { X="clearText";id=Id_clearText; }
            }
            else if (s_length==11) { X="constructor";id=Id_constructor; }
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
			case Id_getText:
				arity = 0;
				name = "getText";
				break;
			case Id_clearData:
				arity = 1;
				name = "clearData";
				break;
			case Id_getData:
				arity = 1;
				name = "getData";
				break;
			case Id_hasData:
				arity = 1;
				name = "hasData";
				break;
			case Id_clearText:
				arity = 0;
				name = "clearText";
				break;
			case Id_setText:
				arity = 1;
				name = "setText";
				break;
			case Id_hasText:
				arity = 0;
				name = "hasText";
				break;
			case Id_setData:
				arity = 2;
				name = "setData";
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

		while (thisObj != null && !(thisObj instanceof ClipboardModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ClipboardModulePrototype proxy = (ClipboardModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getText:
				return getText(cx, thisObj, args);
				
			case Id_clearData:
				 clearData(cx, thisObj, args);
				return Undefined.instance;
			case Id_getData:
				return getData(cx, thisObj, args);
				
			case Id_hasData:
				return hasData(cx, thisObj, args);
				
			case Id_clearText:
				 clearText(cx, thisObj, args);
				return Undefined.instance;
			case Id_setText:
				 setText(cx, thisObj, args);
				return Undefined.instance;
			case Id_hasText:
				return hasText(cx, thisObj, args);
				
			case Id_setData:
				 setData(cx, thisObj, args);
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

		Id_text = 1
		;

;

;

	public static final int MAX_INSTANCE_ID = 1;

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
            if (s.length()==4) { X="text";id=Id_text; }
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
			case Id_text:
				return "text"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ClipboardModulePrototype proxy = this;
		while (start != null && !(start instanceof ClipboardModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ClipboardModulePrototype) {
			proxy = (ClipboardModulePrototype) start;
		}

		switch (id) {
			case Id_text:
				return proxy.getter_text();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ClipboardModulePrototype proxy = this;
		while (start != null && !(start instanceof ClipboardModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ClipboardModulePrototype) {
			proxy = (ClipboardModulePrototype) start;
		}

		switch (id) {
			case Id_text:
				proxy.setter_text(value);
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
