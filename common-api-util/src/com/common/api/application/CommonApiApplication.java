package com.common.api.application;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;

import com.common.api.propertymanager.PropertyManager;
import com.common.api.rest.service.CommonApiService;

public class CommonApiApplication {

	public static void main(String[] args) throws ClientProtocolException, URISyntaxException, IOException {
		PropertyManager.get().loadProperties("resources/application.properties");
		CommonApiService service=new CommonApiService();
		service.process();
		
	}
}
