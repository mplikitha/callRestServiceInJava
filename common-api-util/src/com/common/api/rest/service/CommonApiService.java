package com.common.api.rest.service;

import java.io.IOException;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.http.NameValuePair;
import org.apache.http.client.fluent.Response;
import org.apache.http.message.BasicNameValuePair;

import com.common.api.application.domain.Objects;
import com.common.api.jdbc.DbRepository;

import com.common.api.propertymanager.PropertyManager;
import com.common.api.rest.util.CallRestService;

public class CommonApiService {
	
	public void process() {
		String resp = callRestService();
		System.out.println("Response:" + resp);
		Objects obj = unmarshalling(resp);
		databaseInsert(obj);
		System.out.println("Object: "+ obj);
	}

	private void databaseInsert(Objects obj) {
		DbRepository connection=DbRepository.getInstance();
		String query = null; //write insert query
		String [] arguments = null;// values
		connection.insert(query, arguments);
	}
	
	private Objects unmarshalling(String resp) {
		Objects obj = null;
		Unmarshaller jaxbUnMarshaller;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Objects.class);
			jaxbUnMarshaller = jaxbContext.createUnmarshaller();
			StringReader reader = new StringReader(resp);
			obj = (Objects) jaxbUnMarshaller.unmarshal(reader); 
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	private String callRestService() {
		String url=PropertyManager.get().getProperty("rest.endpoint.uri");
		
		String param=PropertyManager.get().getProperty("asr.service.param.name");
		
		
		List<NameValuePair>params=new ArrayList<NameValuePair>();
		NameValuePair nv1 = new BasicNameValuePair(param,"4556");
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
