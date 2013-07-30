/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
var customProperties = {};

function lazyGet(object, binding, name, namespace, bindingGetter) {
	delete object[name];
	delete object.__proto__[name];

	// This allows overriding of the "binding" lookup
	// which is mostly used for 3rd party modules
	if (bindingGetter === undefined) {
		bindingGetter = kroll.binding;
	}

	// deal with "value" here so we don't accidentally re-invoke the getter
	var value = bindingGetter(binding)[name];
	object[name] = object.__proto__[name] = value;

	if (namespace && namespace in customProperties) {
		Object.defineProperties(value, customProperties[namespace]);
	}
	return value;
}
exports.lazyGet = lazyGet;

exports.defineProperties = function(namespace, properties) {
	if (!(namespace in customProperties)) {
		customProperties[namespace] = {};
	}

	kroll.extend(customProperties[namespace], properties);
}

function defineLazyGetter(namespace, name, getter) {
	if (!(namespace in customProperties)) {
		customProperties[namespace] = {};
	}

	var descriptor = {
		get: function() {
			var self = this;
			while (!self.hasOwnProperty(name) && self !== null) {
				self = Object.getPrototypeOf(this);
			}
			if (self === null) {
				throw new Error("Unable to find property on prototype chain.");
			}

			delete self[name];
			var value = self[name] = getter.call(self);
			return value;
		},
		configurable: true
	};

	customProperties[namespace][name] = descriptor;
}
exports.defineLazyGetter = defineLazyGetter;

exports.defineLazyBinding = function(object, binding) {
	Object.defineProperty(object, binding, {
		get: function() {
			return lazyGet(object, binding, binding);
		},
		configurable: true
	});
}

var appModules = exports.appModules = [];

function loadAppModules() {
	var assets = kroll.binding("assets");
	var appData = assets.readAsset("app.json");

	if (!appData) {
		return;
	}

	var app = JSON.parse(appData);
	if ("app_modules" in app) {
		var len = app.app_modules.length;
		for (var i = 0; i < len; ++i) {
			appModules[i] = app.app_modules[i].api_name;
		}
	}
}

function addInvocationAPI(module, moduleNamespace, namespace, api) {
	var apiInfo = { namespace: namespace, api: api };

	// Always push module APIs.
	if (namespace == moduleNamespace) {
		module.invocationAPIs.push(apiInfo);
		return;
	}

	var len = appModules.length;
	for (var i = 0; i < len; i++) {
		if (namespace.indexOf(appModules[i]) == 0) {
			module.invocationAPIs.push(apiInfo);
			break;
		}
	}
}
exports.addInvocationAPI = addInvocationAPI;

function bootstrapGlobals(global, Titanium) {
	// Below this is where generated global bindings go
	// ----

		global.decodeURIComponent = function() {
		return Titanium.Network.decodeURIComponent.apply(Titanium.Network, arguments);
	}
	global.encodeURIComponent = function() {
		return Titanium.Network.encodeURIComponent.apply(Titanium.Network, arguments);
	}
	global.String.formatTime = function() {
		return Titanium.stringFormatTime.apply(Titanium, arguments);
	}
	global.setInterval = function() {
		return Titanium.setInterval.apply(Titanium, arguments);
	}
	global.String.formatCurrency = function() {
		return Titanium.stringFormatCurrency.apply(Titanium, arguments);
	}
	global.clearTimeout = function() {
		return Titanium.clearTimeout.apply(Titanium, arguments);
	}
	global.clearInterval = function() {
		return Titanium.clearInterval.apply(Titanium, arguments);
	}
	global.String.format = function() {
		return Titanium.stringFormat.apply(Titanium, arguments);
	}
	global.alert = function() {
		return Titanium.alert.apply(Titanium, arguments);
	}
	global.String.formatDecimal = function() {
		return Titanium.stringFormatDecimal.apply(Titanium, arguments);
	}
	global.String.formatDate = function() {
		return Titanium.stringFormatDate.apply(Titanium, arguments);
	}
	global.L = function() {
		return Titanium.localize.apply(Titanium, arguments);
	}
	global.setTimeout = function() {
		return Titanium.setTimeout.apply(Titanium, arguments);
	}

}
exports.bootstrapGlobals = bootstrapGlobals;

exports.bootstrap = function(Titanium) {
	loadAppModules();
	var module = Titanium;

	bootstrapGlobals(global, Titanium);

	// Below this is where the generated code
	// from genBootstrap.py goes
	// ----

		addInvocationAPI(module, "Titanium", "Network.Socket", "createTCP");
	addInvocationAPI(module, "Titanium", "Network", "createHTTPClient");
	addInvocationAPI(module, "Titanium", "Android", "createTiActivityWindow");
	addInvocationAPI(module, "Titanium", "Android", "createPendingIntent");
	addInvocationAPI(module, "Titanium", "Android", "createRemoteViews");
	addInvocationAPI(module, "Titanium", "Android", "createNotification");
	addInvocationAPI(module, "Titanium", "Map", "createAnnotation");
	addInvocationAPI(module, "Titanium", "Map", "createView");
	addInvocationAPI(module, "Titanium", "Media", "createAudioPlayer");
	addInvocationAPI(module, "Titanium", "Media", "createCamera");
	addInvocationAPI(module, "Titanium", "Media", "createSound");
	addInvocationAPI(module, "Titanium", "Media", "createVideoPlayer");
	addInvocationAPI(module, "Titanium", "Database", "install");
	addInvocationAPI(module, "Titanium", "Filesystem", "openStream");
	addInvocationAPI(module, "Titanium", "Filesystem", "createTempFile");
	addInvocationAPI(module, "Titanium", "Filesystem", "createTempDirectory");
	addInvocationAPI(module, "Titanium", "Filesystem", "getFile");
	addInvocationAPI(module, "Titanium", "UI.Android", "createSearchView");
	addInvocationAPI(module, "Titanium", "UI.Android", "createProgressIndicator");
	addInvocationAPI(module, "Titanium", "UI", "createActivityIndicator");
	addInvocationAPI(module, "Titanium", "UI", "createActivityWindow");
	addInvocationAPI(module, "Titanium", "UI", "createAlertDialog");
	addInvocationAPI(module, "Titanium", "UI", "createAnimation");
	addInvocationAPI(module, "Titanium", "UI", "createButtonBar");
	addInvocationAPI(module, "Titanium", "UI", "createButton");
	addInvocationAPI(module, "Titanium", "UI", "createDatePicker");
	addInvocationAPI(module, "Titanium", "UI", "createEmailDialog");
	addInvocationAPI(module, "Titanium", "UI", "createImageView");
	addInvocationAPI(module, "Titanium", "UI", "createLabel");
	addInvocationAPI(module, "Titanium", "UI", "createNotification");
	addInvocationAPI(module, "Titanium", "UI", "createOptionDialog");
	addInvocationAPI(module, "Titanium", "UI", "createPickerColumn");
	addInvocationAPI(module, "Titanium", "UI", "createPicker");
	addInvocationAPI(module, "Titanium", "UI", "createPickerRow");
	addInvocationAPI(module, "Titanium", "UI", "createProgressBar");
	addInvocationAPI(module, "Titanium", "UI", "createScrollView");
	addInvocationAPI(module, "Titanium", "UI", "createScrollableView");
	addInvocationAPI(module, "Titanium", "UI", "createSearchBar");
	addInvocationAPI(module, "Titanium", "UI", "createSlider");
	addInvocationAPI(module, "Titanium", "UI", "createSwitch");
	addInvocationAPI(module, "Titanium", "UI", "createTabGroup");
	addInvocationAPI(module, "Titanium", "UI", "createTab");
	addInvocationAPI(module, "Titanium", "UI", "createTableView");
	addInvocationAPI(module, "Titanium", "UI", "createTableViewRow");
	addInvocationAPI(module, "Titanium", "UI", "createTableViewSection");
	addInvocationAPI(module, "Titanium", "UI", "createTextArea");
	addInvocationAPI(module, "Titanium", "UI", "createTextField");
	addInvocationAPI(module, "Titanium", "UI", "createView");
	addInvocationAPI(module, "Titanium", "UI", "createWebView");
	addInvocationAPI(module, "Titanium", "UI", "create2DMatrix");
	addInvocationAPI(module, "Titanium", "Titanium", "createBuffer");

	
}
