package org.sji4j.gson.impl;

import org.sji4j.Json;
import org.sji4j.JsonConfig;
import org.sji4j.spi.JsonServiceProvider;

public class GsonServiceProvider implements JsonServiceProvider {

	@Override
	public Json getJson(JsonConfig config) {
		return new Sjf4jGSON();
	}

	@Override
	public String getJdkVersion() {
		return "1.8";
	}

	@Override
	public void initialize() {

	}

}
