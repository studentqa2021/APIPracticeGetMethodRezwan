package com.http.method.java;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestingGetMethodWithJava {
	Response response;
	public void getTest() {
		
			response = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
			
			System.out.println("Status code="+response.getStatusCode());//200
			Assert.assertEquals(response.getStatusCode(), 200);
			
			System.out.println("Data Format="+response.getContentType());//JSON
			Assert.assertEquals(response.getContentType(), "application/json");
			
			System.out.println("Response Time="+response.getTime());//time
			Assert.assertTrue(response.getTime()<2000);
			//System.out.println(response.asString());//print the whole data
			
			//response.prettyPrint();
			System.out.println("Is response null or not="+response.toString()!=null);
			Assert.assertTrue(response.toString()!=null);
	}
	
	public static void main(String[] args) {
		new TestingGetMethodWithJava().getTest();
	}
	
}
