package com.http.method.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestingGetMethodWithTestng {
	Response response;
	@BeforeTest
	public void getSetup() {
		response = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
	}
	
	@Test
	public void getTest() {
		
	}

	
	@AfterTest
	public void teardown() {
		
	}
}
