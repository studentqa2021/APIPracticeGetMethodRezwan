package com.http.method.cucumber;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDef {
	Response response;
	@Given("pass the URL")
	public void pass_the_url() {
		response = 	RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
	    
	}

	@Then("valid status code")
	public void valid_status_code() {
		System.out.println("Status code ="+response.getStatusCode());//200
		Assert.assertEquals(response.getStatusCode(), 200);
	    
	}

	@Then("validate response time")
	public void validate_response_time() {
		System.out.println("Response time ="+response.getTime());//checking the response time
		Assert.assertTrue(response.getTime()<2000);
	    
	}

	@Then("validate time should not be null")
	public void validate_time_should_not_be_null() {
		System.out.println("Is response null or not ="+(response.toString()!= null));
		Assert.assertTrue(response.toString()!= null);
	    
	}

	@Then("validate data format is Json or not")
	public void validate_data_format_is_json_or_not() {
		System.out.println("Content-type ="+response.contentType());//content-type is present or not
		Assert.assertEquals(response.contentType(), "application/json");
	    
	}
}
