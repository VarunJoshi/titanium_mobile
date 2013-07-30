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

import ti.modules.titanium.contacts.ContactsModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class ContactsModulePrototype extends KrollModulePrototype
{
	private static final long serialVersionUID = -788041510377118050L;

	private static final String TAG = "ContactsModulePrototype";
	private static final String CLASS_TAG = "ContactsModule";
	private static ContactsModulePrototype contactsModulePrototype;

	// Lazy loaded child APIs
	private Object API_Person = null;

	public static ContactsModulePrototype getProxyPrototype()
	{
		return contactsModulePrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		contactsModulePrototype = null;
	}

	public ContactsModulePrototype()
	{
		if (contactsModulePrototype == null && getClass().equals(ContactsModulePrototype.class)) {
			contactsModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;

			putConst("AUTHORIZATION_AUTHORIZED", this, 3);


			putConst("AUTHORIZATION_RESTRICTED", this, 1);


			putConst("AUTHORIZATION_UNKNOWN", this, 0);


			putConst("CONTACTS_KIND_PERSON", this, 1);


			putConst("CONTACTS_SORT_FIRST_NAME", this, 0);


			putConst("CONTACTS_SORT_LAST_NAME", this, 1);


			putConst("CONTACTS_KIND_ORGANIZATION", this, 0);


			putConst("AUTHORIZATION_DENIED", this, 2);

	}

	public Scriptable getPrototype()
	{
		if (this == contactsModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return contactsModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(ContactsModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object getAllPeople(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getAllPeople()", Log.DEBUG_MODE);

		try {
		ContactsModule proxy = (ContactsModule) ((Proxy) thisObj).getProxy();
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

		java.lang.Object[] javaResult = proxy.getAllPeople(arg0);

		Scriptable rhinoResult = (Scriptable) TypeConverter.javaObjectArrayToJsArray(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void save(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "save()", Log.DEBUG_MODE);

		try {
		ContactsModule proxy = (ContactsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("save: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		proxy.save(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getContactsAuthorization(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getContactsAuthorization()", Log.DEBUG_MODE);

		try {
		ContactsModule proxy = (ContactsModule) ((Proxy) thisObj).getProxy();

		int javaResult = proxy.getContactsAuthorization();

		Number rhinoResult = (Number) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public Object getPersonByID(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPersonByID()", Log.DEBUG_MODE);

		try {
		ContactsModule proxy = (ContactsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getPersonByID: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		long arg0;
		arg0 = (long) TypeConverter.jsObjectToJavaLong(args[0], thisObj) ;

		ti.modules.titanium.contacts.PersonProxy javaResult = proxy.getPersonByID(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void removePerson(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "removePerson()", Log.DEBUG_MODE);

		try {
		ContactsModule proxy = (ContactsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("removePerson: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		if (!(args[0] instanceof Proxy) && args[0] != null) {
			String error = "Invalid value, expected type Proxy, got: " + args[0];
			Log.e(TAG, error);
			throw new IllegalArgumentException(error);
		}
		ti.modules.titanium.contacts.PersonProxy arg0;
		arg0 = (ti.modules.titanium.contacts.PersonProxy) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.removePerson(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void showContacts(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "showContacts()", Log.DEBUG_MODE);

		try {
		ContactsModule proxy = (ContactsModule) ((Proxy) thisObj).getProxy();
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

		proxy.showContacts(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object createPerson(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "createPerson()", Log.DEBUG_MODE);

		try {
		ContactsModule proxy = (ContactsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("createPerson: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollDict arg0;
		if (args[0] == null) {
			arg0 = null;
		} else {
		arg0 = new KrollDict((HashMap)  TypeConverter.jsObjectToJavaObject(args[0], thisObj) );
		}

		ti.modules.titanium.contacts.PersonProxy javaResult = proxy.createPerson(arg0);

		Proxy rhinoResult = (Proxy) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void requestAuthorization(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "requestAuthorization()", Log.DEBUG_MODE);

		try {
		ContactsModule proxy = (ContactsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("requestAuthorization: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		org.appcelerator.kroll.KrollFunction arg0;
		arg0 = (org.appcelerator.kroll.KrollFunction) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.requestAuthorization(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object getPeopleWithName(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "getPeopleWithName()", Log.DEBUG_MODE);

		try {
		ContactsModule proxy = (ContactsModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("getPeopleWithName: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		java.lang.Object[] javaResult = proxy.getPeopleWithName(arg0);

		Scriptable rhinoResult = (Scriptable) TypeConverter.javaObjectArrayToJsArray(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties
	public Number getter_contactsAuthorization()
	{
		Log.d(TAG, "get contactsAuthorization", Log.DEBUG_MODE);
		ContactsModule proxy = (ContactsModule) getProxy();
		Scriptable thisObj = this;
		int javaResult = proxy.getContactsAuthorization();

		Number rhinoResult = (Number) javaResult;
		return rhinoResult;
	}

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_getAllPeople = 2,
		Id_save = 3,
		Id_getContactsAuthorization = 4,
		Id_getPersonByID = 5,
		Id_removePerson = 6,
		Id_showContacts = 7,
		Id_createPerson = 8,
		Id_requestAuthorization = 9,
		Id_getPeopleWithName = 10
;
		

	public static final int MAX_PROTOTYPE_ID = 10;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null;
            L: switch (s.length()) {
            case 4: X="save";id=Id_save; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 12: switch (s.charAt(0)) {
                case 'c': X="createPerson";id=Id_createPerson; break L;
                case 'g': X="getAllPeople";id=Id_getAllPeople; break L;
                case 'r': X="removePerson";id=Id_removePerson; break L;
                case 's': X="showContacts";id=Id_showContacts; break L;
                } break L;
            case 13: X="getPersonByID";id=Id_getPersonByID; break L;
            case 17: X="getPeopleWithName";id=Id_getPeopleWithName; break L;
            case 20: X="requestAuthorization";id=Id_requestAuthorization; break L;
            case 24: X="getContactsAuthorization";id=Id_getContactsAuthorization; break L;
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
			case Id_getAllPeople:
				arity = 1;
				name = "getAllPeople";
				break;
			case Id_save:
				arity = 1;
				name = "save";
				break;
			case Id_getContactsAuthorization:
				arity = 0;
				name = "getContactsAuthorization";
				break;
			case Id_getPersonByID:
				arity = 1;
				name = "getPersonByID";
				break;
			case Id_removePerson:
				arity = 1;
				name = "removePerson";
				break;
			case Id_showContacts:
				arity = 1;
				name = "showContacts";
				break;
			case Id_createPerson:
				arity = 1;
				name = "createPerson";
				break;
			case Id_requestAuthorization:
				arity = 1;
				name = "requestAuthorization";
				break;
			case Id_getPeopleWithName:
				arity = 1;
				name = "getPeopleWithName";
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

		while (thisObj != null && !(thisObj instanceof ContactsModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		ContactsModulePrototype proxy = (ContactsModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getAllPeople:
				return getAllPeople(cx, thisObj, args);
				
			case Id_save:
				 save(cx, thisObj, args);
				return Undefined.instance;
			case Id_getContactsAuthorization:
				return getContactsAuthorization(cx, thisObj, args);
				
			case Id_getPersonByID:
				return getPersonByID(cx, thisObj, args);
				
			case Id_removePerson:
				 removePerson(cx, thisObj, args);
				return Undefined.instance;
			case Id_showContacts:
				 showContacts(cx, thisObj, args);
				return Undefined.instance;
			case Id_createPerson:
				return createPerson(cx, thisObj, args);
				
			case Id_requestAuthorization:
				 requestAuthorization(cx, thisObj, args);
				return Undefined.instance;
			case Id_getPeopleWithName:
				return getPeopleWithName(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
	// Dynamic property IDs
	private static final int

		Id_contactsAuthorization = 1
		;

;

	// Child APIs
	private static final int

		Id_Person = 2
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
// #generated# Last update: 2013-01-31 18:21:23 PST
        L0: { id = 0; String X = null;
            int s_length = s.length();
            if (s_length==6) { X="Person";id=Id_Person; }
            else if (s_length==21) { X="contactsAuthorization";id=Id_contactsAuthorization; }
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
			case Id_contactsAuthorization:
				return "contactsAuthorization"; 
			case Id_Person:
				return "Person";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		ContactsModulePrototype proxy = this;
		while (start != null && !(start instanceof ContactsModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ContactsModulePrototype) {
			proxy = (ContactsModulePrototype) start;
		}

		switch (id) {
			case Id_contactsAuthorization:
				return proxy.getter_contactsAuthorization();
			case Id_Person:
				if (proxy.API_Person == null) {
					Context context = Context.getCurrentContext();
					Scriptable scope = RhinoRuntime.getGlobalScope();

					proxy.API_Person = KrollBindings.getProxyBinding(context, scope,
						"ti.modules.titanium.contacts.PersonProxy", ti.modules.titanium.contacts.PersonProxyPrototype.class); 
				}
				return proxy.API_Person;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		ContactsModulePrototype proxy = this;
		while (start != null && !(start instanceof ContactsModulePrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof ContactsModulePrototype) {
			proxy = (ContactsModulePrototype) start;
		}

		switch (id) {
			case Id_contactsAuthorization:
				proxy.setProperty("contactsAuthorization", value);
				proxy.onPropertyChanged("contactsAuthorization", value);
				break; 
			case Id_Person:
				if (value instanceof Proxy) {
					proxy.API_Person = value;
				} else {
					defineProperty(original, "Person", value, 0);
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
