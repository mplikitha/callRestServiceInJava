package com.common.api.rest.service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.common.api.propertymanager.PropertyManager;
import com.common.api.rest.util.CallRestService;

public class CommonApiService {

	public void process() {
		String resp = callRestService();
		
	}

	private String callRestService() {
		String url=PropertyManager.get().getProperty("rest.endpoint.uri");
		
		String param=PropertyManager.get().getProperty("asr.service.param.name");
		
		
		List<NameValuePair>params=new ArrayList<NameValuePair>();
		NameValuePair nv1 = new BasicNameValuePair(param,"json");
		params.add(nv1);
		
		
		CallRestService object=new CallRestService();
		try {
			return object.callRestService(url, params);
		} catch (URISyntaxException | IOException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	
}
