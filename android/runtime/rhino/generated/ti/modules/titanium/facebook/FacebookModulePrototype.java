/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.facebook;

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

import ti.modules.titanium.facebook.FacebookModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class FacebookModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = -1201982315017666834L;

	private static final String TAG = "FacebookModulePrototype";
	private static final String CLASS_TAG = "FacebookModule";
	private static FacebookModulePrototype facebookModulePrototype;

	// Lazy loaded child APIs
	private Object API_TiFacebookModuleLoginButton = null;

	public static FacebookModulePrototype getProxyPrototype()
	{
		return facebookModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		facebookModulePrototype = null;
	}

	public FacebookModulePrototype()
	{
		if (facebookModulePrototype == null && getClass().equals(FacebookModulePrototype.class)) {
			facebookModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("BUTTON_STYLE_WIDE", this, 1);


			putConst("BUTTON_STYLE_NORMAL", this, 0);

	}

	public Scriptable getPrototype()
	{
		if (this == facebookModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return facebookModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(FacebookModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object createLoginButton(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createLoginButton()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();
		org.appcelerator.kroll.KrollDict arg0;
		if (args.length <= 0) {
			arg0 = null;
		} else {
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}
		}

		ti.modules.titanium.facebook.TiFacebookModuleLoginButtonProxy javaResult = proxy.createLoginButton(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setAppid(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setAppid()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setAppid: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.setAppid(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void setForceDialogAuth(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setForceDialogAuth()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setForceDialogAuth: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(args[0], thisObj) ;

		proxy.setForceDialogAuth(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getLoggedIn(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getLoggedIn()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getLoggedIn();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAccessToken(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAccessToken()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getAccessToken();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getUid(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getUid()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getUid();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getAppid(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAppid()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getAppid();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void requestWithGraphPath(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "requestWithGraphPath()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();
		if (args.length < 4) {
			throw new IllegalArgumentException("requestWithGraphPath: Invalid number of arguments. Expected 4 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		org.appcelerator.kroll.KrollDict arg1;
		if (args[1] == null) {
			arg1 = null;
		} else {
		arg1 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[1], thisObj) );
		}
		java.lang.String arg2;
		arg2 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[2], thisObj) ;
		org.appcelerator.kroll.KrollFunction arg3;
		arg3 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[3], thisObj) ;

		proxy.requestWithGraphPath(arg0, arg1, arg2, arg3);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getExpirationDate(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getExpirationDate()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();

		java.util.Date javaResult = proxy.getExpirationDate();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void authorize(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "authorize()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();

		proxy.authorize();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void logout(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "logout()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();

		proxy.logout();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getPermissions(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPermissions()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();

		java.lang.String[] javaResult = proxy.getPermissions();

		Scriptable rhinoResult = (Scriptable) TypeConverter.javaStringArrayToJsArray(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getForceDialogAuth(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getForceDialogAuth()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.getForceDialogAuth();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setPermissions(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setPermissions()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setPermissions: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Scriptable) && args[0] != null) {
			String error = "Invalid value, expected type Scriptable, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		java.lang.String[] arg0;
		arg0 = (java.lang.String[]) TypeConverter.jsArrayToJavaStringArray((Scriptable) args[0], thisObj) ;

		proxy.setPermissions(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void request(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "request()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("request: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		org.appcelerator.kroll.KrollDict arg1;
		if (args[1] == null) {
			arg1 = null;
		} else {
		arg1 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[1], thisObj) );
		}
		org.appcelerator.kroll.KrollFunction arg2;
		arg2 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[2], thisObj) ;

		proxy.request(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void dialog(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "dialog()", Log.DEBUG_MODE);

		try {
		FacebookModule proxy = (FacebookModule) ((Proxy) thisObj).getProxy();
		if (args.length < 3) {
			throw new IllegalArgumentException("dialog: Invalid number of arguments. Expected 3 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;
		org.appcelerator.kroll.KrollDict arg1;
		if (args[1] == null) {
			arg1 = null;
		} else {
		arg1 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[1], thisObj) );
		}
		org.appcelerator.kroll.KrollFunction arg2;
		arg2 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[2], thisObj) ;

		proxy.dialog(arg0, arg1, arg2);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties
	public String getter_uid()
	{
		Log.d(TAG, "get uid", Log.DEBUG_MODE);
		FacebookModule proxy = (FacebookModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getUid();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Object getter_expirationDate()
	{
		Log.d(TAG, "get expirationDate", Log.DEBUG_MODE);
		FacebookModule proxy = (FacebookModule) getProxy();
		Scriptable thisObj = this;
		java.util.Date javaResult = proxy.getExpirationDate();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public String getter_accessToken()
	{
		Log.d(TAG, "get accessToken", Log.DEBUG_MODE);
		FacebookModule proxy = (FacebookModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getAccessToken();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public Boolean getter_forceDialogAuth()
	{
		Log.d(TAG, "get forceDialogAuth", Log.DEBUG_MODE);
		FacebookModule proxy = (FacebookModule) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getForceDialogAuth();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}
	public void setter_forceDialogAuth(Object value)
	{
		Log.d(TAG, "set forceDialogAuth", Log.DEBUG_MODE);
		FacebookModule proxy = (FacebookModule) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Boolean)) {
			String error = "Invalid value, expected type Boolean, got: " + value;
			Log.e(TAG, error);
		}
		boolean arg0;
		arg0 = (boolean) TypeConverter.jsObjectToJavaBoolean(value, thisObj) ;
		proxy.setForceDialogAuth(arg0);
		//proxy.setProperty("forceDialogAuth", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Scriptable getter_permissions()
	{
		Log.d(TAG, "get permissions", Log.DEBUG_MODE);
		FacebookModule proxy = (FacebookModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String[] javaResult = proxy.getPermissions();

		Scriptable rhinoResult = (Scriptable) TypeConverter.javaStringArrayToJsArray(javaResult, this);
		return rhinoResult;
	}
	public void setter_permissions(Object value)
	{
		Log.d(TAG, "set permissions", Log.DEBUG_MODE);
		FacebookModule proxy = (FacebookModule) getProxy();
		Scriptable thisObj = this;
		if (!(value instanceof Scriptable) && value != null) {
			String error = "Invalid value, expected type Scriptable, got: " + value;
			Log.e(TAG, error);
		}
		java.lang.String[] arg0;
		arg0 = (java.lang.String[]) TypeConverter.jsArrayToJavaStringArray((Scriptable) value, thisObj) ;
		proxy.setPermissions(arg0);
		//proxy.setProperty("permissions", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_appid()
	{
		Log.d(TAG, "get appid", Log.DEBUG_MODE);
		FacebookModule proxy = (FacebookModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getAppid();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}
	public void setter_appid(Object value)
	{
		Log.d(TAG, "set appid", Log.DEBUG_MODE);
		FacebookModule proxy = (FacebookModule) getProxy();
		Scriptable thisObj = this;
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(value, thisObj) ;
		proxy.setAppid(arg0);
		//proxy.setProperty("appid", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public Boolean getter_loggedIn()
	{
		Log.d(TAG, "get loggedIn", Log.DEBUG_MODE);
		FacebookModule proxy = (FacebookModule) getProxy();
		Scriptable thisObj = this;
		boolean javaResult = proxy.getLoggedIn();

		Boolean rhinoResult = (Boolean) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_createLoginButton = 2,
		Id_setAppid = 3,
		Id_setForceDialogAuth = 4,
		Id_getLoggedIn = 5,
		Id_getAccessToken = 6,
		Id_getUid = 7,
		Id_getAppid = 8,
		Id_requestWithGraphPath = 9,
		Id_getExpirationDate = 10,
		Id_authorize = 11,
		Id_logout = 12,
		Id_getPermissions = 13,
		Id_getForceDialogAuth = 14,
		Id_setPermissions = 15,
		Id_request = 16,
		Id_dialog = 17
;
		

	public static final int MAX_PROTOTYPE_ID = 17;

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
            case 6: c=s.charAt(0);
                if (c=='d') { X="dialog";id=Id_dialog; }
                else if (c=='g') { X="getUid";id=Id_getUid; }
                else if (c=='l') { X="logout";id=Id_logout; }
                break L;
            case 7: X="request";id=Id_request; break L;
            case 8: c=s.charAt(0);
                if (c=='g') { X="getAppid";id=Id_getAppid; }
                else if (c=='s') { X="setAppid";id=Id_setAppid; }
                break L;
            case 9: X="authorize";id=Id_authorize; break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='g') { X="getLoggedIn";id=Id_getLoggedIn; }
                break L;
            case 14: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(13);
                    if (c=='n') { X="getAccessToken";id=Id_getAccessToken; }
                    else if (c=='s') { X="getPermissions";id=Id_getPermissions; }
                }
                else if (c=='s') { X="setPermissions";id=Id_setPermissions; }
                break L;
            case 17: c=s.charAt(0);
                if (c=='c') { X="createLoginButton";id=Id_createLoginButton; }
                else if (c=='g') { X="getExpirationDate";id=Id_getExpirationDate; }
                break L;
            case 18: c=s.charAt(0);
                if (c=='g') { X="getForceDialogAuth";id=Id_getForceDialogAuth; }
                else if (c=='s') { X="setForceDialogAuth";id=Id_setForceDialogAuth; }
                break L;
            case 20: X="requestWithGraphPath";id=Id_requestWithGraphPath; break L;
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
			case Id_createLoginButton:
				arity = 1;
				name = "createLoginButton";
				break;
			case Id_setAppid:
				arity = 1;
				name = "setAppid";
				break;
			case Id_setForceDialogAuth:
				arity = 1;
				name = "setForceDialogAuth";
				break;
			case Id_getLoggedIn:
				arity = 0;
				name = "getLoggedIn";
				break;
			case Id_getAccessToken:
				arity = 0;
				name = "getAccessToken";
				break;
			case Id_getUid:
				arity = 0;
				name = "getUid";
				break;
			case Id_getAppid:
				arity = 0;
				name = "getAppid";
				break;
			case Id_requestWithGraphPath:
				arity = 4;
				name = "requestWithGraphPath";
				break;
			case Id_getExpirationDate:
				arity = 0;
				name = "getExpirationDate";
				break;
			case Id_authorize:
				arity = 0;
				name = "authorize";
				break;
			case Id_logout:
				arity = 0;
				name = "logout";
				break;
			case Id_getPermissions:
				arity = 0;
				name = "getPermissions";
				break;
			case Id_getForceDialogAuth:
				arity = 0;
				name = "getForceDialogAuth";
				break;
			case Id_setPermissions:
				arity = 1;
				name = "setPermissions";
				break;
			case Id_request:
				arity = 3;
				name = "request";
				break;
			case Id_dialog:
				arity = 3;
				name = "dialog";
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

		while (thisObj != null && !(thisObj instanceof FacebookModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		FacebookModulePrototype proxy = (FacebookModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_createLoginButton:
				return createLoginButton(cx, thisObj, args);
				
			case Id_setAppid:
				 setAppid(cx, thisObj, args);
				return Undefined.instance;
			case Id_setForceDialogAuth:
				 setForceDialogAuth(cx, thisObj, args);
				return Undefined.instance;
			case Id_getLoggedIn:
				return getLoggedIn(cx, thisObj, args);
				
			case Id_getAccessToken:
				return getAccessToken(cx, thisObj, args);
				
			case Id_getUid:
				return getUid(cx, thisObj, args);
				
			case Id_getAppid:
				return getAppid(cx, thisObj, args);
				
			case Id_requestWithGraphPath:
				 requestWithGraphPath(cx, thisObj, args);
				return Undefined.instance;
			case Id_getExpirationDate:
				return getExpirationDate(cx, thisObj, args);
				
			case Id_authorize:
				 authorize(cx, thisObj, args);
				return Undefined.instance;
			case Id_logout:
				 logout(cx, thisObj, args);
				return Undefined.instance;
			case Id_getPermissions:
				return getPermissions(cx, thisObj, args);
				
			case Id_getForceDialogAuth:
				return getForceDialogAuth(cx, thisObj, args);
				
			case Id_setPermissions:
				 setPermissions(cx, thisObj, args);
				return Undefined.instance;
			case Id_request:
				 request(cx, thisObj, args);
				return Undefined.instance;
			case Id_dialog:
				 dialog(cx, thisObj, args);
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

		Id_uid = 1
		,		
		Id_expirationDate = 2
		,		
		Id_accessToken = 3
		,		
		Id_forceDialogAuth = 4
		,		
		Id_permissions = 5
		,		
		Id_appid = 6
		,		
		Id_loggedIn = 7
		;

;

	// Child APIs
	private static final int

		Id_TiFacebookModuleLoginButton = 8
		;

	public static final int MAX_INSTANCE_ID = 8;

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
            case 3: X="uid";id=Id_uid; break L;
            case 5: X="appid";id=Id_appid; break L;
            case 8: X="loggedIn";id=Id_loggedIn; break L;
            case 11: c=s.charAt(0);
                if (c=='a') { X="accessToken";id=Id_accessToken; }
                else if (c=='p') { X="permissions";id=Id_permissions; }
                break L;
            case 14: X="expirationDate";id=Id_expirationDate; break L;
            case 15: X="forceDialogAuth";id=Id_forceDialogAuth; break L;
            case 27: X="TiFacebookModuleLoginButton";id=Id_TiFacebookModuleLoginButton; break L;
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
			case Id_uid:
				return "uid"; 
			case Id_expirationDate:
				return "expirationDate"; 
			case Id_accessToken:
				return "accessToken"; 
			case Id_forceDialogAuth:
				return "forceDialogAuth"; 
			case Id_permissions:
				return "permissions"; 
			case Id_appid:
				return "appid"; 
			case Id_loggedIn:
				return "loggedIn"; 
			case Id_TiFacebookModuleLoginButton:
				return "TiFacebookModuleLoginButton";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		FacebookModulePrototype proxy = this;
		while (start != null && !(start instanceof FacebookModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof FacebookModulePrototype) {
			proxy = (FacebookModulePrototype) start;
		}

		switch (id) {
			case Id_uid:
				return proxy.getter_uid();
			case Id_expirationDate:
				return proxy.getter_expirationDate();
			case Id_accessToken:
				return proxy.getter_accessToken();
			case Id_forceDialogAuth:
				return proxy.getter_forceDialogAuth();
			case Id_permissions:
				return proxy.getter_permissions();
			case Id_appid:
				return proxy.getter_appid();
			case Id_loggedIn:
				return proxy.getter_loggedIn();
			case Id_TiFacebookModuleLoginButton:
				if (proxy.API_TiFacebookModuleLoginButton == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_TiFacebookModuleLoginButton = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.facebook.TiFacebookModuleLoginButtonProxy", ti.modules.titanium.facebook.TiFacebookModuleLoginButtonProxyPrototype.class); 
				}
				return proxy.API_TiFacebookModuleLoginButton;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		FacebookModulePrototype proxy = this;
		while (start != null && !(start instanceof FacebookModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof FacebookModulePrototype) {
			proxy = (FacebookModulePrototype) start;
		}

		switch (id) {
			case Id_uid:
				proxy.setProperty("uid", value);
				proxy.onPropertyChanged("uid", value);
				break; 
			case Id_expirationDate:
				proxy.setProperty("expirationDate", value);
				proxy.onPropertyChanged("expirationDate", value);
				break; 
			case Id_accessToken:
				proxy.setProperty("accessToken", value);
				proxy.onPropertyChanged("accessToken", value);
				break; 
			case Id_forceDialogAuth:
				proxy.setter_forceDialogAuth(value);
				break; 
			case Id_permissions:
				proxy.setter_permissions(value);
				break; 
			case Id_appid:
				proxy.setter_appid(value);
				break; 
			case Id_loggedIn:
				proxy.setProperty("loggedIn", value);
				proxy.onPropertyChanged("loggedIn", value);
				break; 
			case Id_TiFacebookModuleLoginButton:
				if (value instanceof Proxy) {
					proxy.API_TiFacebookModuleLoginButton = value;
				} else {
					defineProperty(original, "TiFacebookModuleLoginButton", value, 0);
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
