/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package ti.modules.titanium.contacts;

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

import ti.modules.titanium.contacts.PersonProxy;

import org.appcelerator.kroll.KrollProxyPrototype;


public class PersonProxyPrototype extends KrollProxyPrototype
{
	private static final long serialVersionUID = 2096527674233106447L;

	private static final String TAG = "PersonProxyPrototype";
	private static final String CLASS_TAG = "PersonProxy";
	private static PersonProxyPrototype personProxyPrototype;


	public static PersonProxyPrototype getProxyPrototype()
	{
		return personProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		personProxyPrototype = null;
	}

	public PersonProxyPrototype()
	{
		if (personProxyPrototype == null && getClass().equals(PersonProxyPrototype.class)) {
			personProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

	}

	public Scriptable getPrototype()
	{
		if (this == personProxyPrototype) {
			return KrollProxyPrototype.getProxyPrototype();
		}
		return personProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(PersonProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getFullName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getFullName()", Log.DEBUG_MODE);

		try {
		PersonProxy proxy = (PersonProxy) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.getFullName();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void setImage(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "setImage()", Log.DEBUG_MODE);

		try {
		PersonProxy proxy = (PersonProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("setImage: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.titanium.TiBlob arg0;
		arg0 = (org.appcelerator.titanium.TiBlob) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.setImage(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getImage(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getImage()", Log.DEBUG_MODE);

		try {
		PersonProxy proxy = (PersonProxy) ((Proxy) thisObj).getProxy();

		org.appcelerator.titanium.TiBlob javaResult = proxy.getImage();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
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
		PersonProxy proxy = (PersonProxy) ((Proxy) thisObj).getProxy();

		long javaResult = proxy.getId();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Number getter_id()
	{
		Log.d(TAG, "get id", Log.DEBUG_MODE);
		PersonProxy proxy = (PersonProxy) getProxy();
		Scriptable thisObj = this;
		long javaResult = proxy.getId();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}
	public Object getter_image()
	{
		Log.d(TAG, "get image", Log.DEBUG_MODE);
		PersonProxy proxy = (PersonProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.TiBlob javaResult = proxy.getImage();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
		return rhinoResult;
	}
	public void setter_image(Object value)
	{
		Log.d(TAG, "set image", Log.DEBUG_MODE);
		PersonProxy proxy = (PersonProxy) getProxy();
		Scriptable thisObj = this;
		org.appcelerator.titanium.TiBlob arg0;
		arg0 = (org.appcelerator.titanium.TiBlob) TypeConverter.jsObjectToJavaObject(value, thisObj) ;
		proxy.setImage(arg0);
		//proxy.setProperty("image", value); // Commenting out for parity with V8 (don't retain from a custom setter)
	}
	public String getter_fullName()
	{
		Log.d(TAG, "get fullName", Log.DEBUG_MODE);
		PersonProxy proxy = (PersonProxy) getProxy();
		Scriptable thisObj = this;
		java.lang.String javaResult = proxy.getFullName();

		String rhinoResult = (String) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getLastName = 2,
		Id_setLastName = 3,
		Id_getFirstName = 4,
		Id_setFirstName = 5,
		Id_getMiddleName = 6,
		Id_setMiddleName = 7,
		Id_getFirstPhonetic = 8,
		Id_setFirstPhonetic = 9,
		Id_getLastPhonetic = 10,
		Id_setLastPhonetic = 11,
		Id_getMiddlePhonetic = 12,
		Id_setMiddlePhonetic = 13,
		Id_getDepartment = 14,
		Id_setDepartment = 15,
		Id_getJobTitle = 16,
		Id_setJobTitle = 17,
		Id_getNickname = 18,
		Id_setNickname = 19,
		Id_getNote = 20,
		Id_setNote = 21,
		Id_getOrganization = 22,
		Id_setOrganization = 23,
		Id_getPrefix = 24,
		Id_setPrefix = 25,
		Id_getSuffix = 26,
		Id_setSuffix = 27,
		Id_getBirthday = 28,
		Id_setBirthday = 29,
		Id_getCreated = 30,
		Id_setCreated = 31,
		Id_getModified = 32,
		Id_setModified = 33,
		Id_getKind = 34,
		Id_setKind = 35,
		Id_getEmail = 36,
		Id_setEmail = 37,
		Id_getPhone = 38,
		Id_setPhone = 39,
		Id_getAddress = 40,
		Id_setAddress = 41,
		Id_getUrl = 42,
		Id_setUrl = 43,
		Id_getInstantMessage = 44,
		Id_setInstantMessage = 45,
		Id_getRelatedNames = 46,
		Id_setRelatedNames = 47,
		Id_getDate = 48,
		Id_setDate = 49,
		// Method IDs
		Id_getFullName = 50,
		Id_setImage = 51,
		Id_getImage = 52,
		Id_getId = 53
;
		

	public static final int MAX_PROTOTYPE_ID = 53;

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
            case 5: X="getId";id=Id_getId; break L;
            case 6: c=s.charAt(0);
                if (c=='g') { X="getUrl";id=Id_getUrl; }
                else if (c=='s') { X="setUrl";id=Id_setUrl; }
                break L;
            case 7: c=s.charAt(3);
                if (c=='D') {
                    c=s.charAt(0);
                    if (c=='g') { X="getDate";id=Id_getDate; }
                    else if (c=='s') { X="setDate";id=Id_setDate; }
                }
                else if (c=='K') {
                    c=s.charAt(0);
                    if (c=='g') { X="getKind";id=Id_getKind; }
                    else if (c=='s') { X="setKind";id=Id_setKind; }
                }
                else if (c=='N') {
                    c=s.charAt(0);
                    if (c=='g') { X="getNote";id=Id_getNote; }
                    else if (c=='s') { X="setNote";id=Id_setNote; }
                }
                break L;
            case 8: c=s.charAt(3);
                if (c=='E') {
                    c=s.charAt(0);
                    if (c=='g') { X="getEmail";id=Id_getEmail; }
                    else if (c=='s') { X="setEmail";id=Id_setEmail; }
                }
                else if (c=='I') {
                    c=s.charAt(0);
                    if (c=='g') { X="getImage";id=Id_getImage; }
                    else if (c=='s') { X="setImage";id=Id_setImage; }
                }
                else if (c=='P') {
                    c=s.charAt(0);
                    if (c=='g') { X="getPhone";id=Id_getPhone; }
                    else if (c=='s') { X="setPhone";id=Id_setPhone; }
                }
                break L;
            case 9: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(3);
                    if (c=='P') { X="getPrefix";id=Id_getPrefix; }
                    else if (c=='S') { X="getSuffix";id=Id_getSuffix; }
                }
                else if (c=='s') {
                    c=s.charAt(3);
                    if (c=='P') { X="setPrefix";id=Id_setPrefix; }
                    else if (c=='S') { X="setSuffix";id=Id_setSuffix; }
                }
                break L;
            case 10: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(9);
                    if (c=='d') { X="getCreated";id=Id_getCreated; }
                    else if (c=='s') { X="getAddress";id=Id_getAddress; }
                }
                else if (c=='s') {
                    c=s.charAt(9);
                    if (c=='d') { X="setCreated";id=Id_setCreated; }
                    else if (c=='s') { X="setAddress";id=Id_setAddress; }
                }
                break L;
            case 11: switch (s.charAt(3)) {
                case 'B': c=s.charAt(0);
                    if (c=='g') { X="getBirthday";id=Id_getBirthday; }
                    else if (c=='s') { X="setBirthday";id=Id_setBirthday; }
                    break L;
                case 'F': X="getFullName";id=Id_getFullName; break L;
                case 'J': c=s.charAt(0);
                    if (c=='g') { X="getJobTitle";id=Id_getJobTitle; }
                    else if (c=='s') { X="setJobTitle";id=Id_setJobTitle; }
                    break L;
                case 'L': c=s.charAt(0);
                    if (c=='g') { X="getLastName";id=Id_getLastName; }
                    else if (c=='s') { X="setLastName";id=Id_setLastName; }
                    break L;
                case 'M': c=s.charAt(0);
                    if (c=='g') { X="getModified";id=Id_getModified; }
                    else if (c=='s') { X="setModified";id=Id_setModified; }
                    break L;
                case 'N': c=s.charAt(0);
                    if (c=='g') { X="getNickname";id=Id_getNickname; }
                    else if (c=='s') { X="setNickname";id=Id_setNickname; }
                    break L;
                case 's': X="constructor";id=Id_constructor; break L;
                } break L;
            case 12: c=s.charAt(0);
                if (c=='g') { X="getFirstName";id=Id_getFirstName; }
                else if (c=='s') { X="setFirstName";id=Id_setFirstName; }
                break L;
            case 13: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(12);
                    if (c=='e') { X="getMiddleName";id=Id_getMiddleName; }
                    else if (c=='t') { X="getDepartment";id=Id_getDepartment; }
                }
                else if (c=='s') {
                    c=s.charAt(12);
                    if (c=='e') { X="setMiddleName";id=Id_setMiddleName; }
                    else if (c=='t') { X="setDepartment";id=Id_setDepartment; }
                }
                break L;
            case 15: c=s.charAt(3);
                if (c=='L') {
                    c=s.charAt(0);
                    if (c=='g') { X="getLastPhonetic";id=Id_getLastPhonetic; }
                    else if (c=='s') { X="setLastPhonetic";id=Id_setLastPhonetic; }
                }
                else if (c=='O') {
                    c=s.charAt(0);
                    if (c=='g') { X="getOrganization";id=Id_getOrganization; }
                    else if (c=='s') { X="setOrganization";id=Id_setOrganization; }
                }
                else if (c=='R') {
                    c=s.charAt(0);
                    if (c=='g') { X="getRelatedNames";id=Id_getRelatedNames; }
                    else if (c=='s') { X="setRelatedNames";id=Id_setRelatedNames; }
                }
                break L;
            case 16: c=s.charAt(0);
                if (c=='g') { X="getFirstPhonetic";id=Id_getFirstPhonetic; }
                else if (c=='s') { X="setFirstPhonetic";id=Id_setFirstPhonetic; }
                break L;
            case 17: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(16);
                    if (c=='c') { X="getMiddlePhonetic";id=Id_getMiddlePhonetic; }
                    else if (c=='e') { X="getInstantMessage";id=Id_getInstantMessage; }
                }
                else if (c=='s') {
                    c=s.charAt(16);
                    if (c=='c') { X="setMiddlePhonetic";id=Id_setMiddlePhonetic; }
                    else if (c=='e') { X="setInstantMessage";id=Id_setInstantMessage; }
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
			case Id_getLastName:
				arity = 0;
				name = "getLastName";
				break;
			case Id_setLastName:
				arity = 1;
				name = "setLastName";
				break;
			case Id_getFirstName:
				arity = 0;
				name = "getFirstName";
				break;
			case Id_setFirstName:
				arity = 1;
				name = "setFirstName";
				break;
			case Id_getMiddleName:
				arity = 0;
				name = "getMiddleName";
				break;
			case Id_setMiddleName:
				arity = 1;
				name = "setMiddleName";
				break;
			case Id_getFirstPhonetic:
				arity = 0;
				name = "getFirstPhonetic";
				break;
			case Id_setFirstPhonetic:
				arity = 1;
				name = "setFirstPhonetic";
				break;
			case Id_getLastPhonetic:
				arity = 0;
				name = "getLastPhonetic";
				break;
			case Id_setLastPhonetic:
				arity = 1;
				name = "setLastPhonetic";
				break;
			case Id_getMiddlePhonetic:
				arity = 0;
				name = "getMiddlePhonetic";
				break;
			case Id_setMiddlePhonetic:
				arity = 1;
				name = "setMiddlePhonetic";
				break;
			case Id_getDepartment:
				arity = 0;
				name = "getDepartment";
				break;
			case Id_setDepartment:
				arity = 1;
				name = "setDepartment";
				break;
			case Id_getJobTitle:
				arity = 0;
				name = "getJobTitle";
				break;
			case Id_setJobTitle:
				arity = 1;
				name = "setJobTitle";
				break;
			case Id_getNickname:
				arity = 0;
				name = "getNickname";
				break;
			case Id_setNickname:
				arity = 1;
				name = "setNickname";
				break;
			case Id_getNote:
				arity = 0;
				name = "getNote";
				break;
			case Id_setNote:
				arity = 1;
				name = "setNote";
				break;
			case Id_getOrganization:
				arity = 0;
				name = "getOrganization";
				break;
			case Id_setOrganization:
				arity = 1;
				name = "setOrganization";
				break;
			case Id_getPrefix:
				arity = 0;
				name = "getPrefix";
				break;
			case Id_setPrefix:
				arity = 1;
				name = "setPrefix";
				break;
			case Id_getSuffix:
				arity = 0;
				name = "getSuffix";
				break;
			case Id_setSuffix:
				arity = 1;
				name = "setSuffix";
				break;
			case Id_getBirthday:
				arity = 0;
				name = "getBirthday";
				break;
			case Id_setBirthday:
				arity = 1;
				name = "setBirthday";
				break;
			case Id_getCreated:
				arity = 0;
				name = "getCreated";
				break;
			case Id_setCreated:
				arity = 1;
				name = "setCreated";
				break;
			case Id_getModified:
				arity = 0;
				name = "getModified";
				break;
			case Id_setModified:
				arity = 1;
				name = "setModified";
				break;
			case Id_getKind:
				arity = 0;
				name = "getKind";
				break;
			case Id_setKind:
				arity = 1;
				name = "setKind";
				break;
			case Id_getEmail:
				arity = 0;
				name = "getEmail";
				break;
			case Id_setEmail:
				arity = 1;
				name = "setEmail";
				break;
			case Id_getPhone:
				arity = 0;
				name = "getPhone";
				break;
			case Id_setPhone:
				arity = 1;
				name = "setPhone";
				break;
			case Id_getAddress:
				arity = 0;
				name = "getAddress";
				break;
			case Id_setAddress:
				arity = 1;
				name = "setAddress";
				break;
			case Id_getUrl:
				arity = 0;
				name = "getUrl";
				break;
			case Id_setUrl:
				arity = 1;
				name = "setUrl";
				break;
			case Id_getInstantMessage:
				arity = 0;
				name = "getInstantMessage";
				break;
			case Id_setInstantMessage:
				arity = 1;
				name = "setInstantMessage";
				break;
			case Id_getRelatedNames:
				arity = 0;
				name = "getRelatedNames";
				break;
			case Id_setRelatedNames:
				arity = 1;
				name = "setRelatedNames";
				break;
			case Id_getDate:
				arity = 0;
				name = "getDate";
				break;
			case Id_setDate:
				arity = 1;
				name = "setDate";
				break;
			case Id_getFullName:
				arity = 0;
				name = "getFullName";
				break;
			case Id_setImage:
				arity = 1;
				name = "setImage";
				break;
			case Id_getImage:
				arity = 0;
				name = "getImage";
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

		while (thisObj != null && !(thisObj instanceof PersonProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		PersonProxyPrototype proxy = (PersonProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getLastName:
				return proxy.getProperty("lastName");
			case Id_setLastName:
				proxy.setProperty("lastName", args[0]);
				proxy.onPropertyChanged("lastName", args[0]);
				return Undefined.instance;
			case Id_getFirstName:
				return proxy.getProperty("firstName");
			case Id_setFirstName:
				proxy.setProperty("firstName", args[0]);
				proxy.onPropertyChanged("firstName", args[0]);
				return Undefined.instance;
			case Id_getMiddleName:
				return proxy.getProperty("middleName");
			case Id_setMiddleName:
				proxy.setProperty("middleName", args[0]);
				proxy.onPropertyChanged("middleName", args[0]);
				return Undefined.instance;
			case Id_getFirstPhonetic:
				return proxy.getProperty("firstPhonetic");
			case Id_setFirstPhonetic:
				proxy.setProperty("firstPhonetic", args[0]);
				proxy.onPropertyChanged("firstPhonetic", args[0]);
				return Undefined.instance;
			case Id_getLastPhonetic:
				return proxy.getProperty("lastPhonetic");
			case Id_setLastPhonetic:
				proxy.setProperty("lastPhonetic", args[0]);
				proxy.onPropertyChanged("lastPhonetic", args[0]);
				return Undefined.instance;
			case Id_getMiddlePhonetic:
				return proxy.getProperty("middlePhonetic");
			case Id_setMiddlePhonetic:
				proxy.setProperty("middlePhonetic", args[0]);
				proxy.onPropertyChanged("middlePhonetic", args[0]);
				return Undefined.instance;
			case Id_getDepartment:
				return proxy.getProperty("department");
			case Id_setDepartment:
				proxy.setProperty("department", args[0]);
				proxy.onPropertyChanged("department", args[0]);
				return Undefined.instance;
			case Id_getJobTitle:
				return proxy.getProperty("jobTitle");
			case Id_setJobTitle:
				proxy.setProperty("jobTitle", args[0]);
				proxy.onPropertyChanged("jobTitle", args[0]);
				return Undefined.instance;
			case Id_getNickname:
				return proxy.getProperty("nickname");
			case Id_setNickname:
				proxy.setProperty("nickname", args[0]);
				proxy.onPropertyChanged("nickname", args[0]);
				return Undefined.instance;
			case Id_getNote:
				return proxy.getProperty("note");
			case Id_setNote:
				proxy.setProperty("note", args[0]);
				proxy.onPropertyChanged("note", args[0]);
				return Undefined.instance;
			case Id_getOrganization:
				return proxy.getProperty("organization");
			case Id_setOrganization:
				proxy.setProperty("organization", args[0]);
				proxy.onPropertyChanged("organization", args[0]);
				return Undefined.instance;
			case Id_getPrefix:
				return proxy.getProperty("prefix");
			case Id_setPrefix:
				proxy.setProperty("prefix", args[0]);
				proxy.onPropertyChanged("prefix", args[0]);
				return Undefined.instance;
			case Id_getSuffix:
				return proxy.getProperty("suffix");
			case Id_setSuffix:
				proxy.setProperty("suffix", args[0]);
				proxy.onPropertyChanged("suffix", args[0]);
				return Undefined.instance;
			case Id_getBirthday:
				return proxy.getProperty("birthday");
			case Id_setBirthday:
				proxy.setProperty("birthday", args[0]);
				proxy.onPropertyChanged("birthday", args[0]);
				return Undefined.instance;
			case Id_getCreated:
				return proxy.getProperty("created");
			case Id_setCreated:
				proxy.setProperty("created", args[0]);
				proxy.onPropertyChanged("created", args[0]);
				return Undefined.instance;
			case Id_getModified:
				return proxy.getProperty("modified");
			case Id_setModified:
				proxy.setProperty("modified", args[0]);
				proxy.onPropertyChanged("modified", args[0]);
				return Undefined.instance;
			case Id_getKind:
				return proxy.getProperty("kind");
			case Id_setKind:
				proxy.setProperty("kind", args[0]);
				proxy.onPropertyChanged("kind", args[0]);
				return Undefined.instance;
			case Id_getEmail:
				return proxy.getProperty("email");
			case Id_setEmail:
				proxy.setProperty("email", args[0]);
				proxy.onPropertyChanged("email", args[0]);
				return Undefined.instance;
			case Id_getPhone:
				return proxy.getProperty("phone");
			case Id_setPhone:
				proxy.setProperty("phone", args[0]);
				proxy.onPropertyChanged("phone", args[0]);
				return Undefined.instance;
			case Id_getAddress:
				return proxy.getProperty("address");
			case Id_setAddress:
				proxy.setProperty("address", args[0]);
				proxy.onPropertyChanged("address", args[0]);
				return Undefined.instance;
			case Id_getUrl:
				return proxy.getProperty("url");
			case Id_setUrl:
				proxy.setProperty("url", args[0]);
				proxy.onPropertyChanged("url", args[0]);
				return Undefined.instance;
			case Id_getInstantMessage:
				return proxy.getProperty("instantMessage");
			case Id_setInstantMessage:
				proxy.setProperty("instantMessage", args[0]);
				proxy.onPropertyChanged("instantMessage", args[0]);
				return Undefined.instance;
			case Id_getRelatedNames:
				return proxy.getProperty("relatedNames");
			case Id_setRelatedNames:
				proxy.setProperty("relatedNames", args[0]);
				proxy.onPropertyChanged("relatedNames", args[0]);
				return Undefined.instance;
			case Id_getDate:
				return proxy.getProperty("date");
			case Id_setDate:
				proxy.setProperty("date", args[0]);
				proxy.onPropertyChanged("date", args[0]);
				return Undefined.instance;
			case Id_getFullName:
				return getFullName(cx, thisObj, args);
				
			case Id_setImage:
				 setImage(cx, thisObj, args);
				return Undefined.instance;
			case Id_getImage:
				return getImage(cx, thisObj, args);
				
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
		Id_image = 2
		,		
		Id_fullName = 3
		;

	// Property accessor IDs
	private static final int

		Id_lastName = 4
		,		
		Id_firstName = 5
		,		
		Id_middleName = 6
		,		
		Id_firstPhonetic = 7
		,		
		Id_lastPhonetic = 8
		,		
		Id_middlePhonetic = 9
		,		
		Id_department = 10
		,		
		Id_jobTitle = 11
		,		
		Id_nickname = 12
		,		
		Id_note = 13
		,		
		Id_organization = 14
		,		
		Id_prefix = 15
		,		
		Id_suffix = 16
		,		
		Id_birthday = 17
		,		
		Id_created = 18
		,		
		Id_modified = 19
		,		
		Id_kind = 20
		,		
		Id_email = 21
		,		
		Id_phone = 22
		,		
		Id_address = 23
		,		
		Id_url = 24
		,		
		Id_instantMessage = 25
		,		
		Id_relatedNames = 26
		,		
		Id_date = 27
		;

;

	public static final int MAX_INSTANCE_ID = 27;

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
                if (c=='d') { X="date";id=Id_date; }
                else if (c=='k') { X="kind";id=Id_kind; }
                else if (c=='n') { X="note";id=Id_note; }
                break L;
            case 5: c=s.charAt(0);
                if (c=='e') { X="email";id=Id_email; }
                else if (c=='i') { X="image";id=Id_image; }
                else if (c=='p') { X="phone";id=Id_phone; }
                break L;
            case 6: c=s.charAt(0);
                if (c=='p') { X="prefix";id=Id_prefix; }
                else if (c=='s') { X="suffix";id=Id_suffix; }
                break L;
            case 7: c=s.charAt(0);
                if (c=='a') { X="address";id=Id_address; }
                else if (c=='c') { X="created";id=Id_created; }
                break L;
            case 8: switch (s.charAt(0)) {
                case 'b': X="birthday";id=Id_birthday; break L;
                case 'f': X="fullName";id=Id_fullName; break L;
                case 'j': X="jobTitle";id=Id_jobTitle; break L;
                case 'l': X="lastName";id=Id_lastName; break L;
                case 'm': X="modified";id=Id_modified; break L;
                case 'n': X="nickname";id=Id_nickname; break L;
                } break L;
            case 9: X="firstName";id=Id_firstName; break L;
            case 10: c=s.charAt(0);
                if (c=='d') { X="department";id=Id_department; }
                else if (c=='m') { X="middleName";id=Id_middleName; }
                break L;
            case 12: c=s.charAt(0);
                if (c=='l') { X="lastPhonetic";id=Id_lastPhonetic; }
                else if (c=='o') { X="organization";id=Id_organization; }
                else if (c=='r') { X="relatedNames";id=Id_relatedNames; }
                break L;
            case 13: X="firstPhonetic";id=Id_firstPhonetic; break L;
            case 14: c=s.charAt(0);
                if (c=='i') { X="instantMessage";id=Id_instantMessage; }
                else if (c=='m') { X="middlePhonetic";id=Id_middlePhonetic; }
                break L;
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
			case Id_image:
				return "image"; 
			case Id_fullName:
				return "fullName"; 
			case Id_lastName:
				return "lastName";
			case Id_firstName:
				return "firstName";
			case Id_middleName:
				return "middleName";
			case Id_firstPhonetic:
				return "firstPhonetic";
			case Id_lastPhonetic:
				return "lastPhonetic";
			case Id_middlePhonetic:
				return "middlePhonetic";
			case Id_department:
				return "department";
			case Id_jobTitle:
				return "jobTitle";
			case Id_nickname:
				return "nickname";
			case Id_note:
				return "note";
			case Id_organization:
				return "organization";
			case Id_prefix:
				return "prefix";
			case Id_suffix:
				return "suffix";
			case Id_birthday:
				return "birthday";
			case Id_created:
				return "created";
			case Id_modified:
				return "modified";
			case Id_kind:
				return "kind";
			case Id_email:
				return "email";
			case Id_phone:
				return "phone";
			case Id_address:
				return "address";
			case Id_url:
				return "url";
			case Id_instantMessage:
				return "instantMessage";
			case Id_relatedNames:
				return "relatedNames";
			case Id_date:
				return "date";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		PersonProxyPrototype proxy = this;
		while (start != null && !(start instanceof PersonProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof PersonProxyPrototype) {
			proxy = (PersonProxyPrototype) start;
		}

		switch (id) {
			case Id_id:
				return proxy.getter_id();
			case Id_image:
				return proxy.getter_image();
			case Id_fullName:
				return proxy.getter_fullName();
			case Id_lastName:
				return proxy.getProperty("lastName");
			case Id_firstName:
				return proxy.getProperty("firstName");
			case Id_middleName:
				return proxy.getProperty("middleName");
			case Id_firstPhonetic:
				return proxy.getProperty("firstPhonetic");
			case Id_lastPhonetic:
				return proxy.getProperty("lastPhonetic");
			case Id_middlePhonetic:
				return proxy.getProperty("middlePhonetic");
			case Id_department:
				return proxy.getProperty("department");
			case Id_jobTitle:
				return proxy.getProperty("jobTitle");
			case Id_nickname:
				return proxy.getProperty("nickname");
			case Id_note:
				return proxy.getProperty("note");
			case Id_organization:
				return proxy.getProperty("organization");
			case Id_prefix:
				return proxy.getProperty("prefix");
			case Id_suffix:
				return proxy.getProperty("suffix");
			case Id_birthday:
				return proxy.getProperty("birthday");
			case Id_created:
				return proxy.getProperty("created");
			case Id_modified:
				return proxy.getProperty("modified");
			case Id_kind:
				return proxy.getProperty("kind");
			case Id_email:
				return proxy.getProperty("email");
			case Id_phone:
				return proxy.getProperty("phone");
			case Id_address:
				return proxy.getProperty("address");
			case Id_url:
				return proxy.getProperty("url");
			case Id_instantMessage:
				return proxy.getProperty("instantMessage");
			case Id_relatedNames:
				return proxy.getProperty("relatedNames");
			case Id_date:
				return proxy.getProperty("date");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		PersonProxyPrototype proxy = this;
		while (start != null && !(start instanceof PersonProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof PersonProxyPrototype) {
			proxy = (PersonProxyPrototype) start;
		}

		switch (id) {
			case Id_id:
				proxy.setProperty("id", value);
				proxy.onPropertyChanged("id", value);
				break; 
			case Id_image:
				proxy.setter_image(value);
				break; 
			case Id_fullName:
				proxy.setProperty("fullName", value);
				proxy.onPropertyChanged("fullName", value);
				break; 
			case Id_lastName:
				proxy.setProperty("lastName", value);
				proxy.onPropertyChanged("lastName", value);
				break;
			case Id_firstName:
				proxy.setProperty("firstName", value);
				proxy.onPropertyChanged("firstName", value);
				break;
			case Id_middleName:
				proxy.setProperty("middleName", value);
				proxy.onPropertyChanged("middleName", value);
				break;
			case Id_firstPhonetic:
				proxy.setProperty("firstPhonetic", value);
				proxy.onPropertyChanged("firstPhonetic", value);
				break;
			case Id_lastPhonetic:
				proxy.setProperty("lastPhonetic", value);
				proxy.onPropertyChanged("lastPhonetic", value);
				break;
			case Id_middlePhonetic:
				proxy.setProperty("middlePhonetic", value);
				proxy.onPropertyChanged("middlePhonetic", value);
				break;
			case Id_department:
				proxy.setProperty("department", value);
				proxy.onPropertyChanged("department", value);
				break;
			case Id_jobTitle:
				proxy.setProperty("jobTitle", value);
				proxy.onPropertyChanged("jobTitle", value);
				break;
			case Id_nickname:
				proxy.setProperty("nickname", value);
				proxy.onPropertyChanged("nickname", value);
				break;
			case Id_note:
				proxy.setProperty("note", value);
				proxy.onPropertyChanged("note", value);
				break;
			case Id_organization:
				proxy.setProperty("organization", value);
				proxy.onPropertyChanged("organization", value);
				break;
			case Id_prefix:
				proxy.setProperty("prefix", value);
				proxy.onPropertyChanged("prefix", value);
				break;
			case Id_suffix:
				proxy.setProperty("suffix", value);
				proxy.onPropertyChanged("suffix", value);
				break;
			case Id_birthday:
				proxy.setProperty("birthday", value);
				proxy.onPropertyChanged("birthday", value);
				break;
			case Id_created:
				proxy.setProperty("created", value);
				proxy.onPropertyChanged("created", value);
				break;
			case Id_modified:
				proxy.setProperty("modified", value);
				proxy.onPropertyChanged("modified", value);
				break;
			case Id_kind:
				proxy.setProperty("kind", value);
				proxy.onPropertyChanged("kind", value);
				break;
			case Id_email:
				proxy.setProperty("email", value);
				proxy.onPropertyChanged("email", value);
				break;
			case Id_phone:
				proxy.setProperty("phone", value);
				proxy.onPropertyChanged("phone", value);
				break;
			case Id_address:
				proxy.setProperty("address", value);
				proxy.onPropertyChanged("address", value);
				break;
			case Id_url:
				proxy.setProperty("url", value);
				proxy.onPropertyChanged("url", value);
				break;
			case Id_instantMessage:
				proxy.setProperty("instantMessage", value);
				proxy.onPropertyChanged("instantMessage", value);
				break;
			case Id_relatedNames:
				proxy.setProperty("relatedNames", value);
				proxy.onPropertyChanged("relatedNames", value);
				break;
			case Id_date:
				proxy.setProperty("date", value);
				proxy.onPropertyChanged("date", value);
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
