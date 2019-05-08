package com.qa.Test;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	
	
	public void GetMethod(String url) throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpclient=HttpClients.createDefault();
		HttpGet httpget=new HttpGet(url);
		CloseableHttpResponse httpRespnse=httpclient.execute(httpget);
		int statuscode=httpRespnse.getStatusLine().getStatusCode();
		System.out.println("Status code is -------->"+statuscode);
		
		
		String StringReponse=EntityUtils.toString(httpRespnse.getEntity(),"UTF-8");
		
		JSONObject jsonObject=new JSONObject(StringReponse);
		
		System.out.println("json Response is ----------->"+jsonObject);
		
		
		Header[] headerAarry=httpRespnse.getAllHeaders();
		HashMap<String, String> allheaders=new HashMap<String, String>();
		
		for(Header hader:headerAarry)
		{
			allheaders.put(hader.getName(), hader.getValue());
		}
		
		System.out.println("Header Array ---->"+allheaders);
				
		
	}
}