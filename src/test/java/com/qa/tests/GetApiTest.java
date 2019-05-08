package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Test.RestClient;
import com.qa.base.TestBase;

public class GetApiTest extends TestBase {
	
	TestBase testbase;
	public String ApiUrl;
	public String ServiceUrl;
	public String url;
	@BeforeMethod
	public void SetUp()
	{
		testbase=new TestBase();
		 ApiUrl=pro.getProperty("Url");
		 ServiceUrl=pro.getProperty("ServiceUrl");
		 url=ApiUrl+ServiceUrl;
		 System.out.println(url);
		
	}
	
	@Test
	public void get() throws ClientProtocolException, IOException
	{
		RestClient restclinet=new RestClient();
		restclinet.GetMethod("https://reqres.in/api/users?page=2");
//		restclinet.GetMethod(url);
		System.out.println(url);
	}

}
