package com.common.api.rest.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;

public class CallRestService {

	public String callRestService(String url, List<NameValuePair> params)
			throws URISyntaxException, ClientProtocolException, IOException {

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
		URI uri = new URIBuilder(request.getURI()).addParameters(params).build();
		request.setURI(uri);

		HttpResponse response = client.execute(request);
		if (response.getStatusLine().getStatusCode() != 200) {

		}
		System.err.println(request.getURI());
		StringBuffer output = new StringBuffer();
		try(BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())))) {
			System.out.println("Output  .... ");
			String respStr;
			while ((respStr = br.readLine()) != null) {
				output.append(respStr);
				System.out.println(output);

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return output.toString();

	}
}
