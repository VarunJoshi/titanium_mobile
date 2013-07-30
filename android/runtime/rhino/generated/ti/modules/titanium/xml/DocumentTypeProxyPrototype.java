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

import ti.modules.titanium.xml.DocumentTypeProxy;

import ti.modules.titanium.xml.NodeProxyPrototype;


public class DocumentTypeProxyPrototype extends NodeProxyPrototype
{
	private static final long serialVersionUID = -1054201079120188350L;

	private static final String TAG = "DocumentTypeProxyPrototype";
	private static final String CLASS_TAG = "DocumentTypeProxy";
	private static DocumentTypeProxyPrototype documentTypeProxyPrototype;


	public static DocumentTypeProxyPrototype getProxyPrototype()
	{
		return documentTypeProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		documentTypeProxyPrototype = null;
	}

	public DocumentTypeProxyPrototype()
	{
		if (documentTypeProxyPrototype == null && getClass().equals(DocumentTypeProxyPrototype.class)) {
			documentTypeProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == documentTypeProxyPrototype) {
			return NodeProxyPrototype.getProxyPrototype();
		}
		return documentTypeProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return NodeProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(DocumentTypeProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getEntities(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getEntities()", Log.DEBUG_MODE);

		try {
		DocumentTypeProxy proxy = (DocumentTypeProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.NamedNodeMapProxy javaResult = proxy.getEntities();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getDocumentType(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDocumentType()", Log.DEBUG_MODE);

		try {
		DocumentTypeProxy proxy = (DocumentTypeProxy) ((Proxy) thisObj).getProxy();

		org.w3c.dom.DocumentType javaResult = proxy.getDocumentType();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
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
		DocumentTypeProxy proxy = (DocumentTypeProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getName();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getPublicId(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPublicId()", Log.DEBUG_MODE);

		try {
		DocumentTypeProxy proxy = (DocumentTypeProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getPublicId();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getInternalSubset(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getInternalSubset()", Log.DEBUG_MODE);

		try {
		DocumentTypeProxy proxy = (DocumentTypeProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getInternalSubset();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getSystemId(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getSystemId()", Log.DEBUG_MODE);

		try {
		DocumentTypeProxy proxy = (DocumentTypeProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getSystemId();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getNotations(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getNotations()", Log.DEBUG_MODE);

		try {
		DocumentTypeProxy proxy = (DocumentTypeProxy) ((Proxy) thisObj).getProxy();

		ti.modules.titanium.xml.NamedNodeMapProxy javaResult = proxy.getNotations();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Object getter_documentType()
	{
		Log.d(TAG, "get documentType", Log.DEBUG_MODE);
		DocumentTypeProxy proxy = (DocumentTypeProxy) getProxy();
		Scriptable thisObj = this;
		org.w3c.dom.DocumentType javaResult = proxy.getDocumentType();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public String getter_internalSubset()
	{
		Log.d(TAG, "get internalSubset", Log.DEBUG_MODE);
		DocumentTypeProxy proxy = (DocumentTypeProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getInternalSubset();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_name()
	{
		Log.d(TAG, "get name", Log.DEBUG_MODE);
		DocumentTypeProxy proxy = (DocumentTypeProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getName();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Proxy getter_notations()
	{
		Log.d(TAG, "get notations", Log.DEBUG_MODE);
		DocumentTypeProxy proxy = (DocumentTypeProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.xml.NamedNodeMapProxy javaResult = proxy.getNotations();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public String getter_publicId()
	{
		Log.d(TAG, "get publicId", Log.DEBUG_MODE);
		DocumentTypeProxy proxy = (DocumentTypeProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getPublicId();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_systemId()
	{
		Log.d(TAG, "get systemId", Log.DEBUG_MODE);
		DocumentTypeProxy proxy = (DocumentTypeProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getSystemId();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Proxy getter_entities()
	{
		Log.d(TAG, "get entities", Log.DEBUG_MODE);
		DocumentTypeProxy proxy = (DocumentTypeProxy) getProxy();
		Scriptable thisObj = this;
		ti.modules.titanium.xml.NamedNodeMapProxy javaResult = proxy.getEntities();

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getEntities = 2,
		Id_getDocumentType = 3,
		Id_getName = 4,
		Id_getPublicId = 5,
		Id_getInternalSubset = 6,
		Id_getSystemId = 7,
		Id_getNotations = 8
;
		

	public static final int MAX_PROTOTYPE_ID = 8;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:25 PST
        L0: { id = 0; String X = null;
            L: switch (s.length()) {
            case 7: X="getName";id=Id_getName; break L;
            case 11: switch (s.charAt(3)) {
                case 'E': X="getEntities";id=Id_getEntities; break L;
                case 'P': X="getPublicId";id=Id_getPublicId; break L;
                case 'S': X="getSystemId";id=Id_getSystemId; break L;
                case 's': X="constructor";id=Id_constructor; break L;
                } break L;
            case 12: X="getNotations";id=Id_getNotations; break L;
            case 15: X="getDocumentType";id=Id_getDocumentType; break L;
            case 17: X="getInternalSubset";id=Id_getInternalSubset; break L;
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
			case Id_getEntities:
				arity = 0;
				name = "getEntities";
				break;
			case Id_getDocumentType:
				arity = 0;
				name = "getDocumentType";
				break;
			case Id_getName:
				arity = 0;
				name = "getName";
				break;
			case Id_getPublicId:
				arity = 0;
				name = "getPublicId";
				break;
			case Id_getInternalSubset:
				arity = 0;
				name = "getInternalSubset";
				break;
			case Id_getSystemId:
				arity = 0;
				name = "getSystemId";
				break;
			case Id_getNotations:
				arity = 0;
				name = "getNotations";
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

		while (thisObj != null && !(thisObj instanceof DocumentTypeProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		DocumentTypeProxyPrototype proxy = (DocumentTypeProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getEntities:
				return getEntities(cx, thisObj, args);
				
			case Id_getDocumentType:
				return getDocumentType(cx, thisObj, args);
				
			case Id_getName:
				return getName(cx, thisObj, args);
				
			case Id_getPublicId:
				return getPublicId(cx, thisObj, args);
				
			case Id_getInternalSubset:
				return getInternalSubset(cx, thisObj, args);
				
			case Id_getSystemId:
				return getSystemId(cx, thisObj, args);
				
			case Id_getNotations:
				return getNotations(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_documentType = 1
		,		
		Id_internalSubset = 2
		,		
		Id_name = 3
		,		
		Id_notations = 4
		,		
		Id_publicId = 5
		,		
		Id_systemId = 6
		,		
		Id_entities = 7
		;

;

;

	public static final int MAX_INSTANCE_ID = 7;

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
            case 4: X="name";id=Id_name; break L;
            case 8: c=s.charAt(0);
                if (c=='e') { X="entities";id=Id_entities; }
                else if (c=='p') { X="publicId";id=Id_publicId; }
                else if (c=='s') { X="systemId";id=Id_systemId; }
                break L;
            case 9: X="notations";id=Id_notations; break L;
            case 12: X="documentType";id=Id_documentType; break L;
            case 14: X="internalSubset";id=Id_internalSubset; break L;
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
			case Id_documentType:
				return "documentType"; 
			case Id_internalSubset:
				return "internalSubset"; 
			case Id_name:
				return "name"; 
			case Id_notations:
				return "notations"; 
			case Id_publicId:
				return "publicId"; 
			case Id_systemId:
				return "systemId"; 
			case Id_entities:
				return "entities"; 
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		DocumentTypeProxyPrototype proxy = this;
		while (start != null && !(start instanceof DocumentTypeProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof DocumentTypeProxyPrototype) {
			proxy = (DocumentTypeProxyPrototype) start;
		}

		switch (id) {
			case Id_documentType:
				return proxy.getter_documentType();
			case Id_internalSubset:
				return proxy.getter_internalSubset();
			case Id_name:
				return proxy.getter_name();
			case Id_notations:
				return proxy.getter_notations();
			case Id_publicId:
				return proxy.getter_publicId();
			case Id_systemId:
				return proxy.getter_systemId();
			case Id_entities:
				return proxy.getter_entities();
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		DocumentTypeProxyPrototype proxy = this;
		while (start != null && !(start instanceof DocumentTypeProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof DocumentTypeProxyPrototype) {
			proxy = (DocumentTypeProxyPrototype) start;
		}

		switch (id) {
			case Id_documentType:
				proxy.setProperty("documentType", value);
				proxy.onPropertyChanged("documentType", value);
				break; 
			case Id_internalSubset:
				proxy.setProperty("internalSubset", value);
				proxy.onPropertyChanged("internalSubset", value);
				break; 
			case Id_name:
				proxy.setProperty("name", value);
				proxy.onPropertyChanged("name", value);
				break; 
			case Id_notations:
				proxy.setProperty("notations", value);
				proxy.onPropertyChanged("notations", value);
				break; 
			case Id_publicId:
				proxy.setProperty("publicId", value);
				proxy.onPropertyChanged("publicId", value);
				break; 
			case Id_systemId:
				proxy.setProperty("systemId", value);
				proxy.onPropertyChanged("systemId", value);
				break; 
			case Id_entities:
				proxy.setProperty("entities", value);
				proxy.onPropertyChanged("entities", value);
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
