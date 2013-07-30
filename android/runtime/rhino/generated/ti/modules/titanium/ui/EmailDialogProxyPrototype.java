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

import ti.modules.titanium.ui.EmailDialogProxy;

import org.appcelerator.titanium.proxy.TiViewProxyPrototype;


public class EmailDialogProxyPrototype extends TiViewProxyPrototype
{
	private static final long serialVersionUID = -5916078816431741144L;

	private static final String TAG = "EmailDialogProxyPrototype";
	private static final String CLASS_TAG = "EmailDialogProxy";
	private static EmailDialogProxyPrototype emailDialogProxyPrototype;


	public static EmailDialogProxyPrototype getProxyPrototype()
	{
		return emailDialogProxyPrototype;
	}

	public static void dispose()
	{
		Log.d(TAG, "dispose()", Log.DEBUG_MODE);
		emailDialogProxyPrototype = null;
	}

	public EmailDialogProxyPrototype()
	{
		if (emailDialogProxyPrototype == null && getClass().equals(EmailDialogProxyPrototype.class)) {
			emailDialogProxyPrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}


			putConst("CANCELLED", this, 0);


			putConst("SENT", this, 2);


			putConst("SAVED", this, 1);


			putConst("FAILED", this, 3);

	}

	public Scriptable getPrototype()
	{
		if (this == emailDialogProxyPrototype) {
			return TiViewProxyPrototype.getProxyPrototype();
		}
		return emailDialogProxyPrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return TiViewProxyPrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(EmailDialogProxy.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object isSupported(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "isSupported()", Log.DEBUG_MODE);

		try {
		EmailDialogProxy proxy = (EmailDialogProxy) ((Proxy) thisObj).getProxy();

		boolean javaResult = proxy.isSupported();

		Boolean rhinoResult = (Boolean) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void open(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "open()", Log.DEBUG_MODE);

		try {
		EmailDialogProxy proxy = (EmailDialogProxy) ((Proxy) thisObj).getProxy();

		proxy.open();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void addAttachment(Context context, Scriptable thisObj, Object[] args)
	{
		Log.d(TAG, "addAttachment()", Log.DEBUG_MODE);

		try {
		EmailDialogProxy proxy = (EmailDialogProxy) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("addAttachment: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.Object arg0;
		arg0 = (java.lang.Object) TypeConverter.jsObjectToJavaObject(args[0], thisObj) ;

		proxy.addAttachment(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}


	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		Id_getBccRecipients = 2,
		Id_setBccRecipients = 3,
		Id_getCcRecipients = 4,
		Id_setCcRecipients = 5,
		Id_getHtml = 6,
		Id_setHtml = 7,
		Id_getMessageBody = 8,
		Id_setMessageBody = 9,
		Id_getSubject = 10,
		Id_setSubject = 11,
		Id_getToRecipients = 12,
		Id_setToRecipients = 13,
		// Method IDs
		Id_isSupported = 14,
		Id_open = 15,
		Id_addAttachment = 16
;
		

	public static final int MAX_PROTOTYPE_ID = 16;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 4: X="open";id=Id_open; break L;
            case 7: c=s.charAt(0);
                if (c=='g') { X="getHtml";id=Id_getHtml; }
                else if (c=='s') { X="setHtml";id=Id_setHtml; }
                break L;
            case 10: c=s.charAt(0);
                if (c=='g') { X="getSubject";id=Id_getSubject; }
                else if (c=='s') { X="setSubject";id=Id_setSubject; }
                break L;
            case 11: c=s.charAt(0);
                if (c=='c') { X="constructor";id=Id_constructor; }
                else if (c=='i') { X="isSupported";id=Id_isSupported; }
                break L;
            case 13: X="addAttachment";id=Id_addAttachment; break L;
            case 14: c=s.charAt(0);
                if (c=='g') { X="getMessageBody";id=Id_getMessageBody; }
                else if (c=='s') { X="setMessageBody";id=Id_setMessageBody; }
                break L;
            case 15: c=s.charAt(0);
                if (c=='g') {
                    c=s.charAt(3);
                    if (c=='C') { X="getCcRecipients";id=Id_getCcRecipients; }
                    else if (c=='T') { X="getToRecipients";id=Id_getToRecipients; }
                }
                else if (c=='s') {
                    c=s.charAt(3);
                    if (c=='C') { X="setCcRecipients";id=Id_setCcRecipients; }
                    else if (c=='T') { X="setToRecipients";id=Id_setToRecipients; }
                }
                break L;
            case 16: c=s.charAt(0);
                if (c=='g') { X="getBccRecipients";id=Id_getBccRecipients; }
                else if (c=='s') { X="setBccRecipients";id=Id_setBccRecipients; }
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
			case Id_getBccRecipients:
				arity = 0;
				name = "getBccRecipients";
				break;
			case Id_setBccRecipients:
				arity = 1;
				name = "setBccRecipients";
				break;
			case Id_getCcRecipients:
				arity = 0;
				name = "getCcRecipients";
				break;
			case Id_setCcRecipients:
				arity = 1;
				name = "setCcRecipients";
				break;
			case Id_getHtml:
				arity = 0;
				name = "getHtml";
				break;
			case Id_setHtml:
				arity = 1;
				name = "setHtml";
				break;
			case Id_getMessageBody:
				arity = 0;
				name = "getMessageBody";
				break;
			case Id_setMessageBody:
				arity = 1;
				name = "setMessageBody";
				break;
			case Id_getSubject:
				arity = 0;
				name = "getSubject";
				break;
			case Id_setSubject:
				arity = 1;
				name = "setSubject";
				break;
			case Id_getToRecipients:
				arity = 0;
				name = "getToRecipients";
				break;
			case Id_setToRecipients:
				arity = 1;
				name = "setToRecipients";
				break;
			case Id_isSupported:
				arity = 0;
				name = "isSupported";
				break;
			case Id_open:
				arity = 0;
				name = "open";
				break;
			case Id_addAttachment:
				arity = 1;
				name = "addAttachment";
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

		while (thisObj != null && !(thisObj instanceof EmailDialogProxyPrototype)) {
			thisObj = thisObj.getPrototype();
		}

		EmailDialogProxyPrototype proxy = (EmailDialogProxyPrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_getBccRecipients:
				return proxy.getProperty("bccRecipients");
			case Id_setBccRecipients:
				proxy.setProperty("bccRecipients", args[0]);
				proxy.onPropertyChanged("bccRecipients", args[0]);
				return Undefined.instance;
			case Id_getCcRecipients:
				return proxy.getProperty("ccRecipients");
			case Id_setCcRecipients:
				proxy.setProperty("ccRecipients", args[0]);
				proxy.onPropertyChanged("ccRecipients", args[0]);
				return Undefined.instance;
			case Id_getHtml:
				return proxy.getProperty("html");
			case Id_setHtml:
				proxy.setProperty("html", args[0]);
				proxy.onPropertyChanged("html", args[0]);
				return Undefined.instance;
			case Id_getMessageBody:
				return proxy.getProperty("messageBody");
			case Id_setMessageBody:
				proxy.setProperty("messageBody", args[0]);
				proxy.onPropertyChanged("messageBody", args[0]);
				return Undefined.instance;
			case Id_getSubject:
				return proxy.getProperty("subject");
			case Id_setSubject:
				proxy.setProperty("subject", args[0]);
				proxy.onPropertyChanged("subject", args[0]);
				return Undefined.instance;
			case Id_getToRecipients:
				return proxy.getProperty("toRecipients");
			case Id_setToRecipients:
				proxy.setProperty("toRecipients", args[0]);
				proxy.onPropertyChanged("toRecipients", args[0]);
				return Undefined.instance;
			case Id_isSupported:
				return isSupported(cx, thisObj, args);
				
			case Id_open:
				 open(cx, thisObj, args);
				return Undefined.instance;
			case Id_addAttachment:
				 addAttachment(cx, thisObj, args);
				return Undefined.instance;
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



// #string_id_map#

	// Instance IDs
	private static final int ISTART = 0;
;

	// Property accessor IDs
	private static final int

		Id_bccRecipients = 1
		,		
		Id_ccRecipients = 2
		,		
		Id_html = 3
		,		
		Id_messageBody = 4
		,		
		Id_subject = 5
		,		
		Id_toRecipients = 6
		;

;

	public static final int MAX_INSTANCE_ID = 6;

	@Override
	protected int getMaxInstanceId()
	{
		return MAX_INSTANCE_ID;
	}

	@Override
	protected int findInstanceIdInfo(String s)
	{
		int id = 0;
// #generated# Last update: 2013-01-31 18:21:24 PST
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 4: X="html";id=Id_html; break L;
            case 7: X="subject";id=Id_subject; break L;
            case 11: X="messageBody";id=Id_messageBody; break L;
            case 12: c=s.charAt(0);
                if (c=='c') { X="ccRecipients";id=Id_ccRecipients; }
                else if (c=='t') { X="toRecipients";id=Id_toRecipients; }
                break L;
            case 13: X="bccRecipients";id=Id_bccRecipients; break L;
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
			case Id_bccRecipients:
				return "bccRecipients";
			case Id_ccRecipients:
				return "ccRecipients";
			case Id_html:
				return "html";
			case Id_messageBody:
				return "messageBody";
			case Id_subject:
				return "subject";
			case Id_toRecipients:
				return "toRecipients";
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected Object getInstanceIdValue(int id, Scriptable start)
	{
		EmailDialogProxyPrototype proxy = this;
		while (start != null && !(start instanceof EmailDialogProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof EmailDialogProxyPrototype) {
			proxy = (EmailDialogProxyPrototype) start;
		}

		switch (id) {
			case Id_bccRecipients:
				return proxy.getProperty("bccRecipients");
			case Id_ccRecipients:
				return proxy.getProperty("ccRecipients");
			case Id_html:
				return proxy.getProperty("html");
			case Id_messageBody:
				return proxy.getProperty("messageBody");
			case Id_subject:
				return proxy.getProperty("subject");
			case Id_toRecipients:
				return proxy.getProperty("toRecipients");
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}

	@Override
	protected void setInstanceIdValue(int id, Scriptable start, Object value)
	{
		Scriptable original = start;
		EmailDialogProxyPrototype proxy = this;
		while (start != null && !(start instanceof EmailDialogProxyPrototype)) {
			start = start.getPrototype();
		}

		if (start instanceof EmailDialogProxyPrototype) {
			proxy = (EmailDialogProxyPrototype) start;
		}

		switch (id) {
			case Id_bccRecipients:
				proxy.setProperty("bccRecipients", value);
				proxy.onPropertyChanged("bccRecipients", value);
				break;
			case Id_ccRecipients:
				proxy.setProperty("ccRecipients", value);
				proxy.onPropertyChanged("ccRecipients", value);
				break;
			case Id_html:
				proxy.setProperty("html", value);
				proxy.onPropertyChanged("html", value);
				break;
			case Id_messageBody:
				proxy.setProperty("messageBody", value);
				proxy.onPropertyChanged("messageBody", value);
				break;
			case Id_subject:
				proxy.setProperty("subject", value);
				proxy.onPropertyChanged("subject", value);
				break;
			case Id_toRecipients:
				proxy.setProperty("toRecipients", value);
				proxy.onPropertyChanged("toRecipients", value);
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
