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

import ti.modules.titanium.xml.AttrProxy;

import ti.modules.titanium.xml.NodeProxyPrototype;


public class AttrProxyPrototype extends NodeProxyPrototype
{
	private static final long serialVersionUID = 8686663311720310189L;

	private static final String TAG = "AttrProxyPrototype";
	private static final String CLASS_TAG = "AttrProxy";
	private static AttrProxyPrototype attrProxyPrototype;


	public static AttrProxyPrototype getProxyPrototype()
	{
		return attrProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		attrProxyPrototype = null;
	}

	public AttrProxyPrototype()
	{
		if (attrProxyPrototype == null && getClass().equals(AttrProxyPrototype.class)) {
			attrProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == attrProxyPrototype) {
			return NodeProxyPrototype.getProxyPrototype();
		}
		return attrProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return NodeProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(AttrProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getValue(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getValue()", Log.DEBUG_MODE);

		try {
		AttrProxy proxy = (AttrProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getValue();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getName()", Log.DEBUG_MODE);

		try {
		AttrProxy proxy = (AttrProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getName();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getOwnerElement(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getOwnerElement()", Log.DEBUG_MODE);

		try {
		AttrProxy proxy = (AttrProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.ElementProxy javaResult = proxy.getOwnerElement();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getSpecified(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getSpecified()", Log.DEBUG_MODE);

		try {
		AttrProxy proxy = (AttrProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getSpecified();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setValue(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setValue()", Log.DEBUG_MODE);

		try {
		AttrProxy proxy = (AttrProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setValue: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setValue(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public Boolean getter_specified()
	{
		Log.d(TAG, "get specified", Log.DEBUG_MODE);
		AttrProxy proxy = (AttrProxy) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getSpecified();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public Proxy getter_ownerElement()
	{
		Log.d(TAG, "get ownerElement", Log.DEBUG_MODE);
		AttrProxy proxy = (AttrProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.xml.ElementProxy javaResult = proxy.getOwnerElement();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public String getter_name()
	{
		Log.d(TAG, "get name", Log.DEBUG_MODE);
		AttrProxy proxy = (AttrProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getName();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_value()
	{
		Log.d(TAG, "get value", Log.DEBUG_MODE);
		AttrProxy proxy = (AttrProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getValue();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_value(Object value)
	{
		Log.d(TAG, "set value", Log.DEBUG_MODE);
		AttrProxy proxy = (AttrProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setValue(arg0);
		//proxy.setProperty("value", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getValue = 2,
		Id_getName = 3,
		Id_getOwnerElement = 4,
		Id_getSpecified = 5,
		Id_setValue = 6
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
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 7: X="getName";id=Id_getName; break L;
            case 8: c=s.charAt(0);
                if (c=='g') { X="getValue";id=Id_getValue; }
                else if (c=='s') { X="setValue";id=Id_setValue; }
                break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: X="getSpecified";id=Id_getSpecified; break L;
            case 15: X="getOwnerElement";id=Id_getOwnerElement; break L;
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
			case Id_getValue:
				arity = 0;
				name = "getValue";
				break;
			case Id_getName:
				arity = 0;
				name = "getName";
				break;
			case Id_getOwnerElement:
				arity = 0;
				name = "getOwnerElement";
				break;
			case Id_getSpecified:
				arity = 0;
				name = "getSpecified";
				break;
			case Id_setValue:
				arity = 1;
				name = "setValue";
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

		while (thisObj != null && !(thisObj instanceof AttrProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		AttrProxyPrototype proxy = (AttrProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getValue:
				return getValue(cx, thisObj, args);
				
			case Id_getName:
				return getName(cx, thisObj, args);
				
			case Id_getOwnerElement:
				return getOwnerElement(cx, thisObj, args);
				
			case Id_getSpecified:
				return getSpecified(cx, thisObj, args);
				
			case Id_setValue:
				 setValue(cx, thisObj, args);
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

		Id_specified = 1
		,		
		Id_ownerElement = 2
		,		
		Id_name = 3
		,		
		Id_value = 4
		;

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
        L0: { id = 0; String X = null;
            L: switch (s.length()) {
            case 4: X="name";id=Id_name; break L;
            case 5: X="value";id=Id_value; break L;
            case 9: X="specified";id=Id_specified; break L;
            case 12: X="ownerElement";id=Id_ownerElement; break L;
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
			case Id_specified:
				return "specified"; 
			case Id_ownerElement:
				return "ownerElement"; 
			case Id_name:
				return "name"; 
			case Id_value:
				return "value"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		AttrProxyPrototype proxy = this;
		while (start != null && !(start instanceof AttrProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AttrProxyPrototype) {
			proxy = (AttrProxyPrototype) start;
		}

		switch (id) {
			case Id_specified:
				return proxy.getter_specified();
			case Id_ownerElement:
				return proxy.getter_ownerElement();
			case Id_name:
				return proxy.getter_name();
			case Id_value:
				return proxy.getter_value();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		AttrProxyPrototype proxy = this;
		while (start != null && !(start instanceof AttrProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AttrProxyPrototype) {
			proxy = (AttrProxyPrototype) start;
		}

		switch (id) {
			case Id_specified:
				proxy.setProperty("specified", value);
				proxy.onPropertyChanged("specified", value);
				break; 
			case Id_ownerElement:
				proxy.setProperty("ownerElement", value);
				proxy.onPropertyChanged("ownerElement", value);
				break; 
			case Id_name:
				proxy.setProperty("name", value);
				proxy.onPropertyChanged("name", value);
				break; 
			case Id_value:
				proxy.setter_value(value);
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
