package com.http.method.java;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMethodWithJava {
	
	public void getTest() {
		
		Response response = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		
		System.out.println("Status code ="+response.getStatusCode());//200
		Assert.assertEquals(response.getStatusCode(), 200);
		
		System.out.println("Response time ="+response.getTime());//checking the response time
		Assert.assertTrue(response.getTime()<2000);
		
		System.out.println("Content-type ="+response.contentType());//content-type is present or not
		Assert.assertEquals(response.contentType(), "application/json");
		
		System.out.println("Is response null or not ="+(response.toString()!= null));
		Assert.assertTrue(response.toString()!= null);
		
		response.prettyPrint();
		
	}

	public static void main(String[] args) {
		new GetMethodWithJava().getTest();
	}
}
