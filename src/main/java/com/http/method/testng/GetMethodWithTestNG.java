package com.http.method.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMethodWithTestNG {
	Response response;
	@BeforeTest(groups = {"Setup"} )
	public void getSetup() {
	response = 	RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
	}
	
	@Test(priority = 0,groups = {"Smoke"})
	public void getStatusCode() {
		System.out.println("Status code ="+response.getStatusCode());//200
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	@Test(priority=2,groups = {"Smoke"})
	public void getResponseTime() {
		System.out.println("Response time ="+response.getTime());//checking the response time
		Assert.assertTrue(response.getTime()<2000);
	}
	@Test(priority=1,enabled=false)
	public void getContentType() {
		System.out.println("Content-type ="+response.contentType());//content-type is present or not
		Assert.assertEquals(response.contentType(), "application/json");
	}
	@Test(priority=3,groups = {"Sanity"} )
	public void getResponseNullOrNot() {
		System.out.println("Is response null or not ="+(response.toString()!= null));
		Assert.assertTrue(response.toString()!= null);
	}

	@Test(groups = {"Smoke"})
	public void getPretty() {
		response.prettyPrint();
	}
}
