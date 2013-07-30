/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package org.appcelerator.kroll.runtime.rhino;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import org.appcelerator.kroll.common.Log;
import java.lang.reflect.Method;


public class KrollGeneratedBindings
{
	private static HashMap<String, GeneratedBinding> genBindings =
		new HashMap<String, GeneratedBinding>();

		private static HashSet<Class<? extends Proxy>> usedPrototypeClasses =
		new HashSet<Class<? extends Proxy>>();

	private static final String DISPOSE = "dispose";
	private static final String TAG = "KrollGeneratedBindings";

	private static class GeneratedBinding
	{
		public GeneratedBinding(Class<? extends Proxy> proxyClass, String apiName)
		{
			this.proxyClass = proxyClass;
			this.apiName = apiName;
		}

		Class<? extends Proxy> proxyClass;
		String apiName;
	}

	static
	{
		genBindings.put("ti.modules.titanium.media.CameraProxy",
			new GeneratedBinding(ti.modules.titanium.media.CameraProxyPrototype.class, "Camera"));
		genBindings.put("ti.modules.titanium.xml.DocumentTypeProxy",
			new GeneratedBinding(ti.modules.titanium.xml.DocumentTypeProxyPrototype.class, "DocumentType"));
		genBindings.put("ti.modules.titanium.media.VideoPlayerProxy",
			new GeneratedBinding(ti.modules.titanium.media.VideoPlayerProxyPrototype.class, "VideoPlayer"));
		genBindings.put("ti.modules.titanium.codec.CodecModule",
			new GeneratedBinding(ti.modules.titanium.codec.CodecModulePrototype.class, "Codec"));
		genBindings.put("org.appcelerator.titanium.view.TiAnimation",
			new GeneratedBinding(org.appcelerator.titanium.view.TiAnimationPrototype.class, "TiAnimation"));
		genBindings.put("ti.modules.titanium.filesystem.FilesystemModule",
			new GeneratedBinding(ti.modules.titanium.filesystem.FilesystemModulePrototype.class, "Filesystem"));
		genBindings.put("ti.modules.titanium.ui.AlertDialogProxy",
			new GeneratedBinding(ti.modules.titanium.ui.AlertDialogProxyPrototype.class, "AlertDialog"));
		genBindings.put("ti.modules.titanium.analytics.AnalyticsModule",
			new GeneratedBinding(ti.modules.titanium.analytics.AnalyticsModulePrototype.class, "Analytics"));
		genBindings.put("ti.modules.titanium.ui.TableViewRowProxy",
			new GeneratedBinding(ti.modules.titanium.ui.TableViewRowProxyPrototype.class, "TableViewRow"));
		genBindings.put("ti.modules.titanium.ui.AnimationProxy",
			new GeneratedBinding(ti.modules.titanium.ui.AnimationProxyPrototype.class, "Animation"));
		genBindings.put("ti.modules.titanium.android.RemoteViewsProxy",
			new GeneratedBinding(ti.modules.titanium.android.RemoteViewsProxyPrototype.class, "RemoteViews"));
		genBindings.put("ti.modules.titanium.android.calendar.AlertProxy",
			new GeneratedBinding(ti.modules.titanium.android.calendar.AlertProxyPrototype.class, "Alert"));
		genBindings.put("ti.modules.titanium.ui.ViewProxy",
			new GeneratedBinding(ti.modules.titanium.ui.ViewProxyPrototype.class, "View"));
		genBindings.put("ti.modules.titanium.xml.XPathNodeListProxy",
			new GeneratedBinding(ti.modules.titanium.xml.XPathNodeListProxyPrototype.class, "XPathNodeList"));
		genBindings.put("ti.modules.titanium.ui.TabGroupProxy",
			new GeneratedBinding(ti.modules.titanium.ui.TabGroupProxyPrototype.class, "TabGroup"));
		genBindings.put("ti.modules.titanium.network.HTTPClientProxy",
			new GeneratedBinding(ti.modules.titanium.network.HTTPClientProxyPrototype.class, "HTTPClient"));
		genBindings.put("ti.modules.titanium.ui.activityindicatorstyle.ActivityIndicatorStyleModule",
			new GeneratedBinding(ti.modules.titanium.ui.activityindicatorstyle.ActivityIndicatorStyleModulePrototype.class, "ActivityIndicatorStyle"));
		genBindings.put("ti.modules.titanium.stream.StreamModule",
			new GeneratedBinding(ti.modules.titanium.stream.StreamModulePrototype.class, "Stream"));
		genBindings.put("ti.modules.titanium.xml.NodeProxy",
			new GeneratedBinding(ti.modules.titanium.xml.NodeProxyPrototype.class, "Node"));
		genBindings.put("ti.modules.titanium.ui.TiDialogProxy",
			new GeneratedBinding(ti.modules.titanium.ui.TiDialogProxyPrototype.class, "TiDialog"));
		genBindings.put("ti.modules.titanium.media.SoundProxy",
			new GeneratedBinding(ti.modules.titanium.media.SoundProxyPrototype.class, "Sound"));
		genBindings.put("org.appcelerator.kroll.KrollModule",
			new GeneratedBinding(org.appcelerator.kroll.KrollModulePrototype.class, "KrollModule"));
		genBindings.put("ti.modules.titanium.ui.TableViewSectionProxy",
			new GeneratedBinding(ti.modules.titanium.ui.TableViewSectionProxyPrototype.class, "TableViewSection"));
		genBindings.put("org.appcelerator.titanium.proxy.ActivityProxy",
			new GeneratedBinding(org.appcelerator.titanium.proxy.ActivityProxyPrototype.class, "Activity"));
		genBindings.put("ti.modules.titanium.android.calendar.CalendarModule",
			new GeneratedBinding(ti.modules.titanium.android.calendar.CalendarModulePrototype.class, "Calendar"));
		genBindings.put("ti.modules.titanium.locale.LocaleModule",
			new GeneratedBinding(ti.modules.titanium.locale.LocaleModulePrototype.class, "Locale"));
		genBindings.put("ti.modules.titanium.geolocation.android.LocationProviderProxy",
			new GeneratedBinding(ti.modules.titanium.geolocation.android.LocationProviderProxyPrototype.class, "LocationProvider"));
		genBindings.put("ti.modules.titanium.platform.PlatformModule",
			new GeneratedBinding(ti.modules.titanium.platform.PlatformModulePrototype.class, "Platform"));
		genBindings.put("org.appcelerator.titanium.proxy.IntentProxy",
			new GeneratedBinding(org.appcelerator.titanium.proxy.IntentProxyPrototype.class, "Intent"));
		genBindings.put("ti.modules.titanium.network.socket.SocketModule",
			new GeneratedBinding(ti.modules.titanium.network.socket.SocketModulePrototype.class, "Socket"));
		genBindings.put("ti.modules.titanium.ui.NotificationProxy",
			new GeneratedBinding(ti.modules.titanium.ui.NotificationProxyPrototype.class, "Notification"));
		genBindings.put("ti.modules.titanium.database.TiDatabaseProxy",
			new GeneratedBinding(ti.modules.titanium.database.TiDatabaseProxyPrototype.class, "TiDatabase"));
		genBindings.put("ti.modules.titanium.xml.ProcessingInstructionProxy",
			new GeneratedBinding(ti.modules.titanium.xml.ProcessingInstructionProxyPrototype.class, "ProcessingInstruction"));
		genBindings.put("ti.modules.titanium.ui.ActivityWindowProxy",
			new GeneratedBinding(ti.modules.titanium.ui.ActivityWindowProxyPrototype.class, "ActivityWindow"));
		genBindings.put("org.appcelerator.titanium.proxy.TiWindowProxy",
			new GeneratedBinding(org.appcelerator.titanium.proxy.TiWindowProxyPrototype.class, "TiWindow"));
		genBindings.put("ti.modules.titanium.ui.TextFieldProxy",
			new GeneratedBinding(ti.modules.titanium.ui.TextFieldProxyPrototype.class, "TextField"));
		genBindings.put("ti.modules.titanium.xml.ElementProxy",
			new GeneratedBinding(ti.modules.titanium.xml.ElementProxyPrototype.class, "Element"));
		genBindings.put("ti.modules.titanium.ui.ScrollViewProxy",
			new GeneratedBinding(ti.modules.titanium.ui.ScrollViewProxyPrototype.class, "ScrollView"));
		genBindings.put("ti.modules.titanium.BufferProxy",
			new GeneratedBinding(ti.modules.titanium.BufferProxyPrototype.class, "Buffer"));
		genBindings.put("ti.modules.titanium.android.calendar.EventProxy",
			new GeneratedBinding(ti.modules.titanium.android.calendar.EventProxyPrototype.class, "Event"));
		genBindings.put("org.appcelerator.titanium.proxy.TiActivityWindowProxy",
			new GeneratedBinding(org.appcelerator.titanium.proxy.TiActivityWindowProxyPrototype.class, "TiActivityWindow"));
		genBindings.put("org.appcelerator.titanium.proxy.ActionBarProxy",
			new GeneratedBinding(org.appcelerator.titanium.proxy.ActionBarProxyPrototype.class, "ActionBar"));
		genBindings.put("ti.modules.titanium.ui.SwitchProxy",
			new GeneratedBinding(ti.modules.titanium.ui.SwitchProxyPrototype.class, "Switch"));
		genBindings.put("org.appcelerator.titanium.proxy.TiBaseWindowProxy",
			new GeneratedBinding(org.appcelerator.titanium.proxy.TiBaseWindowProxyPrototype.class, "TiBaseWindow"));
		genBindings.put("ti.modules.titanium.ui.DatePickerProxy",
			new GeneratedBinding(ti.modules.titanium.ui.DatePickerProxyPrototype.class, "DatePicker"));
		genBindings.put("ti.modules.titanium.ui._2DMatrixProxy",
			new GeneratedBinding(ti.modules.titanium.ui._2DMatrixProxyPrototype.class, "2DMatrix"));
		genBindings.put("ti.modules.titanium.media.CameraPreviewProxy",
			new GeneratedBinding(ti.modules.titanium.media.CameraPreviewProxyPrototype.class, "CameraPreview"));
		genBindings.put("ti.modules.titanium.ui.SearchViewProxy",
			new GeneratedBinding(ti.modules.titanium.ui.SearchViewProxyPrototype.class, "SearchView"));
		genBindings.put("ti.modules.titanium.xml.CDATASectionProxy",
			new GeneratedBinding(ti.modules.titanium.xml.CDATASectionProxyPrototype.class, "CDATASection"));
		genBindings.put("ti.modules.titanium.filesystem.FileProxy",
			new GeneratedBinding(ti.modules.titanium.filesystem.FileProxyPrototype.class, "File"));
		genBindings.put("ti.modules.titanium.database.DatabaseModule",
			new GeneratedBinding(ti.modules.titanium.database.DatabaseModulePrototype.class, "Database"));
		genBindings.put("ti.modules.titanium.xml.NotationProxy",
			new GeneratedBinding(ti.modules.titanium.xml.NotationProxyPrototype.class, "Notation"));
		genBindings.put("org.appcelerator.titanium.TiBlob",
			new GeneratedBinding(org.appcelerator.titanium.TiBlobPrototype.class, "TiBlob"));
		genBindings.put("ti.modules.titanium.xml.EntityProxy",
			new GeneratedBinding(ti.modules.titanium.xml.EntityProxyPrototype.class, "Entity"));
		genBindings.put("ti.modules.titanium.ui.WebViewProxy",
			new GeneratedBinding(ti.modules.titanium.ui.WebViewProxyPrototype.class, "WebView"));
		genBindings.put("ti.modules.titanium.app.AndroidModule",
			new GeneratedBinding(ti.modules.titanium.app.AndroidModulePrototype.class, "Android"));
		genBindings.put("ti.modules.titanium.android.EnvironmentModule",
			new GeneratedBinding(ti.modules.titanium.android.EnvironmentModulePrototype.class, "Environment"));
		genBindings.put("ti.modules.titanium.accelerometer.AccelerometerModule",
			new GeneratedBinding(ti.modules.titanium.accelerometer.AccelerometerModulePrototype.class, "Accelerometer"));
		genBindings.put("ti.modules.titanium.ui.PickerColumnProxy",
			new GeneratedBinding(ti.modules.titanium.ui.PickerColumnProxyPrototype.class, "PickerColumn"));
		genBindings.put("ti.modules.titanium.ui.TabContentViewProxy",
			new GeneratedBinding(ti.modules.titanium.ui.TabContentViewProxyPrototype.class, "TabContentView"));
		genBindings.put("org.appcelerator.titanium.proxy.MenuItemProxy",
			new GeneratedBinding(org.appcelerator.titanium.proxy.MenuItemProxyPrototype.class, "MenuItem"));
		genBindings.put("ti.modules.titanium.stream.FileStreamProxy",
			new GeneratedBinding(ti.modules.titanium.stream.FileStreamProxyPrototype.class, "FileStream"));
		genBindings.put("ti.modules.titanium.ui.LabelProxy",
			new GeneratedBinding(ti.modules.titanium.ui.LabelProxyPrototype.class, "Label"));
		genBindings.put("ti.modules.titanium.gesture.GestureModule",
			new GeneratedBinding(ti.modules.titanium.gesture.GestureModulePrototype.class, "Gesture"));
		genBindings.put("org.appcelerator.titanium.proxy.ServiceProxy",
			new GeneratedBinding(org.appcelerator.titanium.proxy.ServiceProxyPrototype.class, "Service"));
		genBindings.put("ti.modules.titanium.xml.CommentProxy",
			new GeneratedBinding(ti.modules.titanium.xml.CommentProxyPrototype.class, "Comment"));
		genBindings.put("ti.modules.titanium.ui.TabProxy",
			new GeneratedBinding(ti.modules.titanium.ui.TabProxyPrototype.class, "Tab"));
		genBindings.put("ti.modules.titanium.ui.SearchBarProxy",
			new GeneratedBinding(ti.modules.titanium.ui.SearchBarProxyPrototype.class, "SearchBar"));
		genBindings.put("ti.modules.titanium.ui.EmailDialogProxy",
			new GeneratedBinding(ti.modules.titanium.ui.EmailDialogProxyPrototype.class, "EmailDialog"));
		genBindings.put("org.appcelerator.titanium.proxy.InstrumentationProxy",
			new GeneratedBinding(org.appcelerator.titanium.proxy.InstrumentationProxyPrototype.class, "Instrumentation"));
		genBindings.put("ti.modules.titanium.ui.android.AndroidModule",
			new GeneratedBinding(ti.modules.titanium.ui.android.AndroidModulePrototype.class, "Android"));
		genBindings.put("org.appcelerator.titanium.proxy.MenuProxy",
			new GeneratedBinding(org.appcelerator.titanium.proxy.MenuProxyPrototype.class, "Menu"));
		genBindings.put("ti.modules.titanium.ui.UIModule",
			new GeneratedBinding(ti.modules.titanium.ui.UIModulePrototype.class, "UI"));
		genBindings.put("org.appcelerator.titanium.proxy.DecorViewProxy",
			new GeneratedBinding(org.appcelerator.titanium.proxy.DecorViewProxyPrototype.class, "DecorView"));
		genBindings.put("ti.modules.titanium.media.android.AndroidModule",
			new GeneratedBinding(ti.modules.titanium.media.android.AndroidModulePrototype.class, "Android"));
		genBindings.put("ti.modules.titanium.ui.ProgressBarProxy",
			new GeneratedBinding(ti.modules.titanium.ui.ProgressBarProxyPrototype.class, "ProgressBar"));
		genBindings.put("ti.modules.titanium.ui.ActivityIndicatorProxy",
			new GeneratedBinding(ti.modules.titanium.ui.ActivityIndicatorProxyPrototype.class, "ActivityIndicator"));
		genBindings.put("ti.modules.titanium.media.AudioPlayerProxy",
			new GeneratedBinding(ti.modules.titanium.media.AudioPlayerProxyPrototype.class, "AudioPlayer"));
		genBindings.put("ti.modules.titanium.ui.SliderProxy",
			new GeneratedBinding(ti.modules.titanium.ui.SliderProxyPrototype.class, "Slider"));
		genBindings.put("ti.modules.titanium.media.MediaModule",
			new GeneratedBinding(ti.modules.titanium.media.MediaModulePrototype.class, "Media"));
		genBindings.put("ti.modules.titanium.map.MapModule",
			new GeneratedBinding(ti.modules.titanium.map.MapModulePrototype.class, "Map"));
		genBindings.put("ti.modules.titanium.contacts.ContactsModule",
			new GeneratedBinding(ti.modules.titanium.contacts.ContactsModulePrototype.class, "Contacts"));
		genBindings.put("ti.modules.titanium.xml.AttrProxy",
			new GeneratedBinding(ti.modules.titanium.xml.AttrProxyPrototype.class, "Attr"));
		genBindings.put("ti.modules.titanium.network.NetworkModule",
			new GeneratedBinding(ti.modules.titanium.network.NetworkModulePrototype.class, "Network"));
		genBindings.put("ti.modules.titanium.ui.android.ProgressIndicatorProxy",
			new GeneratedBinding(ti.modules.titanium.ui.android.ProgressIndicatorProxyPrototype.class, "ProgressIndicator"));
		genBindings.put("ti.modules.titanium.ui.ScrollableViewProxy",
			new GeneratedBinding(ti.modules.titanium.ui.ScrollableViewProxyPrototype.class, "ScrollableView"));
		genBindings.put("ti.modules.titanium.android.calendar.CalendarProxy",
			new GeneratedBinding(ti.modules.titanium.android.calendar.CalendarProxyPrototype.class, "Calendar"));
		genBindings.put("ti.modules.titanium.xml.CharacterDataProxy",
			new GeneratedBinding(ti.modules.titanium.xml.CharacterDataProxyPrototype.class, "CharacterData"));
		genBindings.put("ti.modules.titanium.facebook.FacebookModule",
			new GeneratedBinding(ti.modules.titanium.facebook.FacebookModulePrototype.class, "Facebook"));
		genBindings.put("ti.modules.titanium.ui.OptionDialogProxy",
			new GeneratedBinding(ti.modules.titanium.ui.OptionDialogProxyPrototype.class, "OptionDialog"));
		genBindings.put("ti.modules.titanium.platform.DisplayCapsProxy",
			new GeneratedBinding(ti.modules.titanium.platform.DisplayCapsProxyPrototype.class, "DisplayCaps"));
		genBindings.put("ti.modules.titanium.app.AppModule",
			new GeneratedBinding(ti.modules.titanium.app.AppModulePrototype.class, "App"));
		genBindings.put("ti.modules.titanium.facebook.TiFacebookModuleLoginButtonProxy",
			new GeneratedBinding(ti.modules.titanium.facebook.TiFacebookModuleLoginButtonProxyPrototype.class, "TiFacebookModuleLoginButton"));
		genBindings.put("ti.modules.titanium.contacts.PersonProxy",
			new GeneratedBinding(ti.modules.titanium.contacts.PersonProxyPrototype.class, "Person"));
		genBindings.put("org.appcelerator.titanium.proxy.TiViewProxy",
			new GeneratedBinding(org.appcelerator.titanium.proxy.TiViewProxyPrototype.class, "TiView"));
		genBindings.put("ti.modules.titanium.geolocation.android.AndroidModule",
			new GeneratedBinding(ti.modules.titanium.geolocation.android.AndroidModulePrototype.class, "Android"));
		genBindings.put("org.appcelerator.kroll.KrollProxy",
			new GeneratedBinding(org.appcelerator.kroll.KrollProxyPrototype.class, "KrollProxy"));
		genBindings.put("ti.modules.titanium.map.ViewProxy",
			new GeneratedBinding(ti.modules.titanium.map.ViewProxyPrototype.class, "View"));
		genBindings.put("ti.modules.titanium.android.notificationmanager.NotificationProxy",
			new GeneratedBinding(ti.modules.titanium.android.notificationmanager.NotificationProxyPrototype.class, "Notification"));
		genBindings.put("ti.modules.titanium.ui.ButtonProxy",
			new GeneratedBinding(ti.modules.titanium.ui.ButtonProxyPrototype.class, "Button"));
		genBindings.put("org.appcelerator.titanium.view.Ti2DMatrix",
			new GeneratedBinding(org.appcelerator.titanium.view.Ti2DMatrixPrototype.class, "Ti2DMatrix"));
		genBindings.put("ti.modules.titanium.network.socket.TCPProxy",
			new GeneratedBinding(ti.modules.titanium.network.socket.TCPProxyPrototype.class, "TCP"));
		genBindings.put("ti.modules.titanium.app.properties.PropertiesModule",
			new GeneratedBinding(ti.modules.titanium.app.properties.PropertiesModulePrototype.class, "Properties"));
		genBindings.put("org.appcelerator.titanium.TiFileProxy",
			new GeneratedBinding(org.appcelerator.titanium.TiFileProxyPrototype.class, "TiFile"));
		genBindings.put("ti.modules.titanium.ui.TableViewProxy",
			new GeneratedBinding(ti.modules.titanium.ui.TableViewProxyPrototype.class, "TableView"));
		genBindings.put("ti.modules.titanium.android.AndroidModule",
			new GeneratedBinding(ti.modules.titanium.android.AndroidModulePrototype.class, "Android"));
		genBindings.put("ti.modules.titanium.utils.UtilsModule",
			new GeneratedBinding(ti.modules.titanium.utils.UtilsModulePrototype.class, "Utils"));
		genBindings.put("ti.modules.titanium.platform.AndroidModule",
			new GeneratedBinding(ti.modules.titanium.platform.AndroidModulePrototype.class, "Android"));
		genBindings.put("org.appcelerator.titanium.proxy.RProxy",
			new GeneratedBinding(org.appcelerator.titanium.proxy.RProxyPrototype.class, "R"));
		genBindings.put("ti.modules.titanium.geolocation.GeolocationModule",
			new GeneratedBinding(ti.modules.titanium.geolocation.GeolocationModulePrototype.class, "Geolocation"));
		genBindings.put("ti.modules.titanium.xml.NamedNodeMapProxy",
			new GeneratedBinding(ti.modules.titanium.xml.NamedNodeMapProxyPrototype.class, "NamedNodeMap"));
		genBindings.put("ti.modules.titanium.ui.TextAreaProxy",
			new GeneratedBinding(ti.modules.titanium.ui.TextAreaProxyPrototype.class, "TextArea"));
		genBindings.put("ti.modules.titanium.map.AnnotationProxy",
			new GeneratedBinding(ti.modules.titanium.map.AnnotationProxyPrototype.class, "Annotation"));
		genBindings.put("ti.modules.titanium.android.PendingIntentProxy",
			new GeneratedBinding(ti.modules.titanium.android.PendingIntentProxyPrototype.class, "PendingIntent"));
		genBindings.put("ti.modules.titanium.android.notificationmanager.NotificationManagerModule",
			new GeneratedBinding(ti.modules.titanium.android.notificationmanager.NotificationManagerModulePrototype.class, "NotificationManager"));
		genBindings.put("ti.modules.titanium.database.TiResultSetProxy",
			new GeneratedBinding(ti.modules.titanium.database.TiResultSetProxyPrototype.class, "TiResultSet"));
		genBindings.put("ti.modules.titanium.stream.BufferStreamProxy",
			new GeneratedBinding(ti.modules.titanium.stream.BufferStreamProxyPrototype.class, "BufferStream"));
		genBindings.put("ti.modules.titanium.ui.ImageViewProxy",
			new GeneratedBinding(ti.modules.titanium.ui.ImageViewProxyPrototype.class, "ImageView"));
		genBindings.put("ti.modules.titanium.ui.clipboard.ClipboardModule",
			new GeneratedBinding(ti.modules.titanium.ui.clipboard.ClipboardModulePrototype.class, "Clipboard"));
		genBindings.put("ti.modules.titanium.ui.PickerProxy",
			new GeneratedBinding(ti.modules.titanium.ui.PickerProxyPrototype.class, "Picker"));
		genBindings.put("ti.modules.titanium.ui.ButtonBarProxy",
			new GeneratedBinding(ti.modules.titanium.ui.ButtonBarProxyPrototype.class, "ButtonBar"));
		genBindings.put("ti.modules.titanium.android.calendar.ReminderProxy",
			new GeneratedBinding(ti.modules.titanium.android.calendar.ReminderProxyPrototype.class, "Reminder"));
		genBindings.put("ti.modules.titanium.stream.BlobStreamProxy",
			new GeneratedBinding(ti.modules.titanium.stream.BlobStreamProxyPrototype.class, "BlobStream"));
		genBindings.put("ti.modules.titanium.xml.TextProxy",
			new GeneratedBinding(ti.modules.titanium.xml.TextProxyPrototype.class, "Text"));
		genBindings.put("ti.modules.titanium.xml.DocumentProxy",
			new GeneratedBinding(ti.modules.titanium.xml.DocumentProxyPrototype.class, "Document"));
		genBindings.put("ti.modules.titanium.xml.EntityReferenceProxy",
			new GeneratedBinding(ti.modules.titanium.xml.EntityReferenceProxyPrototype.class, "EntityReference"));
		genBindings.put("ti.modules.titanium.xml.DocumentFragmentProxy",
			new GeneratedBinding(ti.modules.titanium.xml.DocumentFragmentProxyPrototype.class, "DocumentFragment"));
		genBindings.put("ti.modules.titanium.xml.NodeListProxy",
			new GeneratedBinding(ti.modules.titanium.xml.NodeListProxyPrototype.class, "NodeList"));
		genBindings.put("ti.modules.titanium.geolocation.android.LocationRuleProxy",
			new GeneratedBinding(ti.modules.titanium.geolocation.android.LocationRuleProxyPrototype.class, "LocationRule"));
		genBindings.put("ti.modules.titanium.TitaniumModule",
			new GeneratedBinding(ti.modules.titanium.TitaniumModulePrototype.class, "Titanium"));
		genBindings.put("ti.modules.titanium.xml.XMLModule",
			new GeneratedBinding(ti.modules.titanium.xml.XMLModulePrototype.class, "XML"));
		genBindings.put("ti.modules.titanium.ui.PickerRowProxy",
			new GeneratedBinding(ti.modules.titanium.ui.PickerRowProxyPrototype.class, "PickerRow"));
		genBindings.put("ti.modules.titanium.xml.DOMImplementationProxy",
			new GeneratedBinding(ti.modules.titanium.xml.DOMImplementationProxyPrototype.class, "DOMImplementation"));
	}

	public static Class<? extends Proxy> getBindingClass(String name)
	{
		GeneratedBinding b = genBindings.get(name);
		if (b != null) {
			return b.proxyClass;
		}
		return null;
	}

	public static String getBindingName(String name)
	{
		GeneratedBinding b = genBindings.get(name);
		if (b != null) {
			return b.apiName;
		}
		return null;
	}

	public static void dispose()
	{
		if (usedPrototypeClasses == null) {
			return;
		}
		for (Class<? extends Proxy> cls : usedPrototypeClasses) {
			if (cls == null) {
				continue;
			}
			try {
				Method disposeMethod = cls.getMethod(DISPOSE);
				disposeMethod.invoke(null);
			} catch(Exception e) {
				Log.e(TAG, e.getClass().getSimpleName() + " disposing " + cls.getSimpleName() + ": " + e.getMessage());
			}
		}
		usedPrototypeClasses.clear();
	}

	public static void registerUsedPrototypeClass(Class<? extends Proxy> cls)
	{
		usedPrototypeClasses.add(cls);
	}
}