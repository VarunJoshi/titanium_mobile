/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.xml;

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

import ti.modules.titanium.xml.TextProxy;

import ti.modules.titanium.xml.CharacterDataProxyPrototype;


public class TextProxyPrototype extends CharacterDataProxyPrototype
{
	private static final long serialVersionUID = -2665045781875123767L;

	private static final String TAG = "TextProxyPrototype";
	private static final String CLASS_TAG = "TextProxy";
	private static TextProxyPrototype textProxyPrototype;


	public static TextProxyPrototype getProxyPrototype()
	{
		return textProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		textProxyPrototype = null;
	}

	public TextProxyPrototype()
	{
		if (textProxyPrototype == null && getClass().equals(TextProxyPrototype.class)) {
			textProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == textProxyPrototype) {
			return CharacterDataProxyPrototype.getProxyPrototype();
		}
		return textProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return CharacterDataProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(TextProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getText(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getText()", Log.DEBUG_MODE);

		try {
		TextProxy proxy = (TextProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getText();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object splitText(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "splitText()", Log.DEBUG_MODE);

		try {
		TextProxy proxy = (TextProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("splitText: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		int arg0;
		arg0 = (int) TypeConverter.jsObjectToJavaInt(args[0], thisObj) ;

		ti.modules.titanium.xml.TextProxy javaResult = proxy.splitText(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getTextContent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getTextContent()", Log.DEBUG_MODE);

		try {
		TextProxy proxy = (TextProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getTextContent();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public String getter_text()
	{
		Log.d(TAG, "get text", Log.DEBUG_MODE);
		TextProxy proxy = (TextProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getText();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_textContent()
	{
		Log.d(TAG, "get textContent", Log.DEBUG_MODE);
		TextProxy proxy = (TextProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getTextContent();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getText = 2,
		Id_splitText = 3,
		Id_getTextContent = 4
;
		

	public static final int MAX_PROTOTYPE_ID = 4;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:26 PST
        L0: { id = 0; String X = null;
            L: switch (s.length()) {
            case 7: X="getText";id=Id_getText; break L;
            case 9: X="splitText";id=Id_splitText; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 14: X="getTextContent";id=Id_getTextContent; break L;
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
			case Id_getText:
				arity = 0;
				name = "getText";
				break;
			case Id_splitText:
				arity = 1;
				name = "splitText";
				break;
			case Id_getTextContent:
				arity = 0;
				name = "getTextContent";
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

		while (thisObj != null && !(thisObj instanceof TextProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		TextProxyPrototype proxy = (TextProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getText:
				return getText(cx, thisObj, args);
				
			case Id_splitText:
				return splitText(cx, thisObj, args);
				
			case Id_getTextContent:
				return getTextContent(cx, thisObj, args);
				
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
		,		
		Id_textContent = 2
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
// #generated# Last update: 2013-01-31 18:21:26 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==4) { X="text";id=Id_text; }
            else if (s_length==11) { X="textContent";id=Id_textContent; }
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
			case Id_textContent:
				return "textContent"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		TextProxyPrototype proxy = this;
		while (start != null && !(start instanceof TextProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TextProxyPrototype) {
			proxy = (TextProxyPrototype) start;
		}

		switch (id) {
			case Id_text:
				return proxy.getter_text();
			case Id_textContent:
				return proxy.getter_textContent();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		TextProxyPrototype proxy = this;
		while (start != null && !(start instanceof TextProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof TextProxyPrototype) {
			proxy = (TextProxyPrototype) start;
		}

		switch (id) {
			case Id_text:
				proxy.setProperty("text", value);
				proxy.onPropertyChanged("text", value);
				break; 
			case Id_textContent:
				proxy.setProperty("textContent", value);
				proxy.onPropertyChanged("textContent", value);
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
