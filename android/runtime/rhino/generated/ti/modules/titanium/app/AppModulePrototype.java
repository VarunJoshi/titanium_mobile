/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.app;

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

import ti.modules.titanium.app.AppModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class AppModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = 5240630567855297141L;

	private static final String TAG = "AppModulePrototype";
	private static final String CLASS_TAG = "AppModule";
	private static AppModulePrototype appModulePrototype;

	// Lazy loaded child APIs
	private Object API_Android = null;
	private Object API_Properties = null;

	public static AppModulePrototype getProxyPrototype()
	{
		return appModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		appModulePrototype = null;
	}

	public AppModulePrototype()
	{
		if (appModulePrototype == null && getClass().equals(AppModulePrototype.class)) {
			appModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("EVENT_ACCESSIBILITY_ANNOUNCEMENT", this, "accessibilityannouncement");


			putConst("EVENT_ACCESSIBILITY_CHANGED", this, "accessibilitychanged");

	}

	public Scriptable getPrototype()
	{
		if (this == appModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return appModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(AppModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getDeployType(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDeployType()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getDeployType();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAccessibilityEnabled(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAccessibilityEnabled()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getAccessibilityEnabled();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getCopyright(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getCopyright()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getCopyright();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getID(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getID()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getID();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void fireSystemEvent(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "fireSystemEvent()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("fireSystemEvent: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		java.lang.Object arg1;
		if (args.length <= 1) {
			arg1 = null;
		} else {
		arg1 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[1], thisObj) ;
		}

		proxy.fireSystemEvent(arg0, arg1);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getDescription(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getDescription()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getDescription();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getPublisher(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPublisher()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getPublisher();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getSessionId(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getSessionId()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getSessionId();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getGUID(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getGUID()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getGUID();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object appURLToPath(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "appURLToPath()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("appURLToPath: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		java.lang.String javaResult = proxy.appURLToPath(arg0);

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getGuid(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getGuid()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getGuid();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAnalytics(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAnalytics()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getAnalytics();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getVersion(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getVersion()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getVersion();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getUrl(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getUrl()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getUrl();

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
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getName();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getURL(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getURL()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getURL();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getId(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getId()", Log.DEBUG_MODE);

		try {
		AppModule proxy = (AppModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getId();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public String getter_id()
	{
		Log.d(TAG, "get id", Log.DEBUG_MODE);
		AppModule proxy = (AppModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getId();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_guid()
	{
		Log.d(TAG, "get guid", Log.DEBUG_MODE);
		AppModule proxy = (AppModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getGuid();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_sessionId()
	{
		Log.d(TAG, "get sessionId", Log.DEBUG_MODE);
		AppModule proxy = (AppModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getSessionId();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Boolean getter_accessibilityEnabled()
	{
		Log.d(TAG, "get accessibilityEnabled", Log.DEBUG_MODE);
		AppModule proxy = (AppModule) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getAccessibilityEnabled();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public String getter_description()
	{
		Log.d(TAG, "get description", Log.DEBUG_MODE);
		AppModule proxy = (AppModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getDescription();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_name()
	{
		Log.d(TAG, "get name", Log.DEBUG_MODE);
		AppModule proxy = (AppModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getName();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_copyright()
	{
		Log.d(TAG, "get copyright", Log.DEBUG_MODE);
		AppModule proxy = (AppModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getCopyright();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_deployType()
	{
		Log.d(TAG, "get deployType", Log.DEBUG_MODE);
		AppModule proxy = (AppModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getDeployType();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Boolean getter_analytics()
	{
		Log.d(TAG, "get analytics", Log.DEBUG_MODE);
		AppModule proxy = (AppModule) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getAnalytics();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public String getter_url()
	{
		Log.d(TAG, "get url", Log.DEBUG_MODE);
		AppModule proxy = (AppModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getUrl();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_version()
	{
		Log.d(TAG, "get version", Log.DEBUG_MODE);
		AppModule proxy = (AppModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getVersion();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public String getter_publisher()
	{
		Log.d(TAG, "get publisher", Log.DEBUG_MODE);
		AppModule proxy = (AppModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getPublisher();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getDeployType = 2,
		Id_getAccessibilityEnabled = 3,
		Id_getCopyright = 4,
		Id_getID = 5,
		Id_fireSystemEvent = 6,
		Id_getDescription = 7,
		Id_getPublisher = 8,
		Id_getSessionId = 9,
		Id_getGUID = 10,
		Id_appURLToPath = 11,
		Id_getGuid = 12,
		Id_getAnalytics = 13,
		Id_getVersion = 14,
		Id_getUrl = 15,
		Id_getName = 16,
		Id_getURL = 17,
		Id_getId = 18
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
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 5: c=s.charAt(4);
                if (c=='D') { X="getID";id=Id_getID; }
                else if (c=='d') { X="getId";id=Id_getId; }
                break L;
            case 6: c=s.charAt(4);
                if (c=='R') { X="getURL";id=Id_getURL; }
                else if (c=='r') { X="getUrl";id=Id_getUrl; }
                break L;
            case 7: c=s.charAt(4);
                if (c=='U') { X="getGUID";id=Id_getGUID; }
                else if (c=='a') { X="getName";id=Id_getName; }
                else if (c=='u') { X="getGuid";id=Id_getGuid; }
                break L;
            case 10: X="getVersion";id=Id_getVersion; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: switch (s.charAt(3)) {
                case 'A': X="getAnalytics";id=Id_getAnalytics; break L;
                case 'C': X="getCopyright";id=Id_getCopyright; break L;
                case 'P': X="getPublisher";id=Id_getPublisher; break L;
                case 'S': X="getSessionId";id=Id_getSessionId; break L;
                case 'U': X="appURLToPath";id=Id_appURLToPath; break L;
                } break L;
            case 13: X="getDeployType";id=Id_getDeployType; break L;
            case 14: X="getDescription";id=Id_getDescription; break L;
            case 15: X="fireSystemEvent";id=Id_fireSystemEvent; break L;
            case 23: X="getAccessibilityEnabled";id=Id_getAccessibilityEnabled; break L;
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
			case Id_getDeployType:
				arity = 0;
				name = "getDeployType";
				break;
			case Id_getAccessibilityEnabled:
				arity = 0;
				name = "getAccessibilityEnabled";
				break;
			case Id_getCopyright:
				arity = 0;
				name = "getCopyright";
				break;
			case Id_getID:
				arity = 0;
				name = "getID";
				break;
			case Id_fireSystemEvent:
				arity = 2;
				name = "fireSystemEvent";
				break;
			case Id_getDescription:
				arity = 0;
				name = "getDescription";
				break;
			case Id_getPublisher:
				arity = 0;
				name = "getPublisher";
				break;
			case Id_getSessionId:
				arity = 0;
				name = "getSessionId";
				break;
			case Id_getGUID:
				arity = 0;
				name = "getGUID";
				break;
			case Id_appURLToPath:
				arity = 1;
				name = "appURLToPath";
				break;
			case Id_getGuid:
				arity = 0;
				name = "getGuid";
				break;
			case Id_getAnalytics:
				arity = 0;
				name = "getAnalytics";
				break;
			case Id_getVersion:
				arity = 0;
				name = "getVersion";
				break;
			case Id_getUrl:
				arity = 0;
				name = "getUrl";
				break;
			case Id_getName:
				arity = 0;
				name = "getName";
				break;
			case Id_getURL:
				arity = 0;
				name = "getURL";
				break;
			case Id_getId:
				arity = 0;
				name = "getId";
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

		while (thisObj != null && !(thisObj instanceof AppModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		AppModulePrototype proxy = (AppModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getDeployType:
				return getDeployType(cx, thisObj, args);
				
			case Id_getAccessibilityEnabled:
				return getAccessibilityEnabled(cx, thisObj, args);
				
			case Id_getCopyright:
				return getCopyright(cx, thisObj, args);
				
			case Id_getID:
				return getID(cx, thisObj, args);
				
			case Id_fireSystemEvent:
				 fireSystemEvent(cx, thisObj, args);
				return Undefined.instance;
			case Id_getDescription:
				return getDescription(cx, thisObj, args);
				
			case Id_getPublisher:
				return getPublisher(cx, thisObj, args);
				
			case Id_getSessionId:
				return getSessionId(cx, thisObj, args);
				
			case Id_getGUID:
				return getGUID(cx, thisObj, args);
				
			case Id_appURLToPath:
				return appURLToPath(cx, thisObj, args);
				
			case Id_getGuid:
				return getGuid(cx, thisObj, args);
				
			case Id_getAnalytics:
				return getAnalytics(cx, thisObj, args);
				
			case Id_getVersion:
				return getVersion(cx, thisObj, args);
				
			case Id_getUrl:
				return getUrl(cx, thisObj, args);
				
			case Id_getName:
				return getName(cx, thisObj, args);
				
			case Id_getURL:
				return getURL(cx, thisObj, args);
				
			case Id_getId:
				return getId(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_id = 1
		,		
		Id_guid = 2
		,		
		Id_sessionId = 3
		,		
		Id_accessibilityEnabled = 4
		,		
		Id_description = 5
		,		
		Id_name = 6
		,		
		Id_copyright = 7
		,		
		Id_deployType = 8
		,		
		Id_analytics = 9
		,		
		Id_url = 10
		,		
		Id_version = 11
		,		
		Id_publisher = 12
		;

;

	// Child APIs
	private static final int

		Id_Android = 13
		,		
		Id_Properties = 14
		;

	public static final int MAX_INSTANCE_ID = 14;

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
            L: switch (s.length()) {
            case 2: if (s.charAt(0)=='i' && s.charAt(1)=='d') {id=Id_id; break L0;} break L;
            case 3: X="url";id=Id_url; break L;
            case 4: c=s.charAt(0);
                if (c=='g') { X="guid";id=Id_guid; }
                else if (c=='n') { X="name";id=Id_name; }
                break L;
            case 7: c=s.charAt(0);
                if (c=='A') { X="Android";id=Id_Android; }
                else if (c=='v') { X="version";id=Id_version; }
                break L;
            case 9: switch (s.charAt(0)) {
                case 'a': X="analytics";id=Id_analytics; break L;
                case 'c': X="copyright";id=Id_copyright; break L;
                case 'p': X="publisher";id=Id_publisher; break L;
                case 's': X="sessionId";id=Id_sessionId; break L;
                } break L;
            case 10: c=s.charAt(0);
                if (c=='P') { X="Properties";id=Id_Properties; }
                else if (c=='d') { X="deployType";id=Id_deployType; }
                break L;
            case 11: X="description";id=Id_description; break L;
            case 20: X="accessibilityEnabled";id=Id_accessibilityEnabled; break L;
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
			case Id_id:
				return "id"; 
			case Id_guid:
				return "guid"; 
			case Id_sessionId:
				return "sessionId"; 
			case Id_accessibilityEnabled:
				return "accessibilityEnabled"; 
			case Id_description:
				return "description"; 
			case Id_name:
				return "name"; 
			case Id_copyright:
				return "copyright"; 
			case Id_deployType:
				return "deployType"; 
			case Id_analytics:
				return "analytics"; 
			case Id_url:
				return "url"; 
			case Id_version:
				return "version"; 
			case Id_publisher:
				return "publisher"; 
			case Id_Android:
				return "Android";
			case Id_Properties:
				return "Properties";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		AppModulePrototype proxy = this;
		while (start != null && !(start instanceof AppModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AppModulePrototype) {
			proxy = (AppModulePrototype) start;
		}

		switch (id) {
			case Id_id:
				return proxy.getter_id();
			case Id_guid:
				return proxy.getter_guid();
			case Id_sessionId:
				return proxy.getter_sessionId();
			case Id_accessibilityEnabled:
				return proxy.getter_accessibilityEnabled();
			case Id_description:
				return proxy.getter_description();
			case Id_name:
				return proxy.getter_name();
			case Id_copyright:
				return proxy.getter_copyright();
			case Id_deployType:
				return proxy.getter_deployType();
			case Id_analytics:
				return proxy.getter_analytics();
			case Id_url:
				return proxy.getter_url();
			case Id_version:
				return proxy.getter_version();
			case Id_publisher:
				return proxy.getter_publisher();
			case Id_Android:
				if (proxy.API_Android == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Android = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.app.AndroidModule", ti.modules.titanium.app.AndroidModulePrototype.class); 
				}
				return proxy.API_Android;
			case Id_Properties:
				if (proxy.API_Properties == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Properties = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.app.properties.PropertiesModule", ti.modules.titanium.app.properties.PropertiesModulePrototype.class); 
				}
				return proxy.API_Properties;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		AppModulePrototype proxy = this;
		while (start != null && !(start instanceof AppModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof AppModulePrototype) {
			proxy = (AppModulePrototype) start;
		}

		switch (id) {
			case Id_id:
				proxy.setProperty("id", value);
				proxy.onPropertyChanged("id", value);
				break; 
			case Id_guid:
				proxy.setProperty("guid", value);
				proxy.onPropertyChanged("guid", value);
				break; 
			case Id_sessionId:
				proxy.setProperty("sessionId", value);
				proxy.onPropertyChanged("sessionId", value);
				break; 
			case Id_accessibilityEnabled:
				proxy.setProperty("accessibilityEnabled", value);
				proxy.onPropertyChanged("accessibilityEnabled", value);
				break; 
			case Id_description:
				proxy.setProperty("description", value);
				proxy.onPropertyChanged("description", value);
				break; 
			case Id_name:
				proxy.setProperty("name", value);
				proxy.onPropertyChanged("name", value);
				break; 
			case Id_copyright:
				proxy.setProperty("copyright", value);
				proxy.onPropertyChanged("copyright", value);
				break; 
			case Id_deployType:
				proxy.setProperty("deployType", value);
				proxy.onPropertyChanged("deployType", value);
				break; 
			case Id_analytics:
				proxy.setProperty("analytics", value);
				proxy.onPropertyChanged("analytics", value);
				break; 
			case Id_url:
				proxy.setProperty("url", value);
				proxy.onPropertyChanged("url", value);
				break; 
			case Id_version:
				proxy.setProperty("version", value);
				proxy.onPropertyChanged("version", value);
				break; 
			case Id_publisher:
				proxy.setProperty("publisher", value);
				proxy.onPropertyChanged("publisher", value);
				break; 
			case Id_Android:
				if (value instanceof Proxy) {
					proxy.API_Android = value;
				} else {
					defineProperty(original, "Android", value, 0);
				}
				break;
			case Id_Properties:
				if (value instanceof Proxy) {
					proxy.API_Properties = value;
				} else {
					defineProperty(original, "Properties", value, 0);
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
