package com.cg.project.stepDefinition;

import org.junit.Assert;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OnlineShopServicesStepDefinition {
	
	private TestRestTemplate restTemplate;
	private  ResponseEntity<String> responseEntity;
	@Before
	public void setUpTestEnv() {
		restTemplate = new TestRestTemplate();
	}

	@When("^User give call to '/sayHello' services$")
	public void user_give_call_to_sayHello_services() throws Throwable {
	  responseEntity = restTemplate.getForEntity("http://localhost:4514/sayHello", String.class);
	}

	@Then("^user should receive service status 'Ok' And response message 'Hello world from Restful web services'$")
	public void user_should_receive_service_status_Ok_And_response_message_Hello_world_from_Restful_web_services() throws Throwable {
	    Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	    Assert.assertEquals("Hello world from Restful web services", responseEntity.getBody());
	}

	@When("^user should provide submit valid product details$")
	public void user_should_provide_submit_valid_product_details() throws Throwable {
	  
	}

	@Then("^product details should successfully should add and same product details should return by services$")
	public void product_details_should_successfully_should_add_and_same_product_details_should_return_by_services() throws Throwable {
	 
	}


}
