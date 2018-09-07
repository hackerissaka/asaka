package com.cg.pcm.stepDefinitions;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.cg.pcm.bean.Product;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ProductFeatureStepDefinition {

	private TestRestTemplate restTemplate;
	private ResponseEntity<String> responseEntityString;
	private ResponseEntity<Product> responseEntityProduct;
	private ResponseEntity<List> responseEntityProductList;
	
	
	@Before
	public void setUpTestEnv() {
		restTemplate=new TestRestTemplate();
	}
	@When("^User give call to '/sayHello' Service$")
	public void user_give_call_to_sayHello_Service() throws Throwable {
	  responseEntityString=restTemplate.getForEntity("http://localhost:8695/sayHello", String.class);
	}

	@Then("^user should receive service status 'OK' And response message 'Hello World From RestFulWebService'$")
	public void user_should_receive_service_status_OK_And_response_message_Hello_World_From_RestFulWebService() throws Throwable {
	    Assert.assertEquals(HttpStatus.OK,responseEntityString.getStatusCode());
	    Assert.assertEquals("Hello world", responseEntityString.getBody());
	}


	
	
	@When("^User give call to '/createProduct' service$")
	public void user_give_call_to_createProduct_service() throws Throwable {
		
		responseEntityProduct=restTemplate.getForEntity("http://localhost:8695/acceptProductDetails", Product.class);
		
	}

	
	@When("^user provides valid product details$")
	public void user_provides_valid_product_details() throws Throwable {
		 Product product=getProduct();
		   
		   MultiValueMap<String,Object> map =new LinkedMultiValueMap<String, Object>();

		   
		   map.add("date",product.getdate());
		   map.add("code", product.getCode());
		   map.add("name", product.getName());
		   map.add("model", product.getmodel());
		   map.add("price",product.getPrice());
		   map.add("d", product.getD());
		   HttpHeaders headers=new HttpHeaders();
		   headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		   HttpEntity<MultiValueMap<String,Object>> httpEntity=new HttpEntity<MultiValueMap<String, Object>>(map,headers);
		   
		   responseEntityProduct=restTemplate.postForEntity("http://localhost:8695/acceptProductDetails", httpEntity, Product.class);
			
	}

	@Then("^user should be able to add product details and same product details must be returned by service$")
	public void user_should_be_able_to_add_product_details_and_same_product_details_must_be_returned_by_service() throws Throwable {
		System.out.println("5");
		
		 Product expected=getProduct();
		 
		 System.out.println("original"+getProduct());
		 
		    Product actual=responseEntityProduct.getBody();
		    
		   System.out.println( responseEntityProduct.getBody());
		   
		    System.out.println("duplicate"+actual);
		    
		    Assert.assertEquals(expected, actual);
		    System.out.println("6");
	}

	@Then("^should receive service status 'OK'$")
	public void should_receive_service_status_OK() throws Throwable {
		 Assert.assertEquals(HttpStatus.OK,responseEntityProduct.getStatusCode());
	}
	
	private Product getProduct() throws ParseException {
		//w Product(d, code, name, model, price, date)
	
		return new Product("2","i02", "lalala", "Ingetiash", "18370.0", "23-09-1994");
	}
	@When("^user give call to 'getProductById' service$")
	public void user_give_call_to_getProductById_service() throws Throwable {
		responseEntityProduct=restTemplate.getForEntity("http://localhost:8695//getProductById/{code}", Product.class,"r45");
	}

	@When("^user provide valid project details$")
	public void user_provide_valid_project_details() throws Throwable {
	    
	}

	@Then("^product details must be returned by service$")
	public void product_details_must_be_returned_by_service() throws Throwable {
	    System.out.println(responseEntityProduct.getBody());
	}

	@Then("^user should receive service status 'OK'$")
	public void user_should_receive_service_status_OK() throws Throwable {
		
		 Assert.assertEquals(HttpStatus.OK,responseEntityProduct.getStatusCode());
		    
	}


@When("^user give call to 'getProductDetails' service$")
public void user_give_call_to_getProductDetails_service() throws Throwable {
	responseEntityProductList=restTemplate.getForEntity("http://localhost:8695//getAllProductDetails", List.class);
}

@Then("^all product details must be returned by service$")
public void all_product_details_must_be_returned_by_service() throws Throwable {
   System.out.println(responseEntityProductList.getBody());
}

@Then("^user receive service status 'OK'$")
public void user_receive_service_status_OK() throws Throwable {
	 Assert.assertEquals(HttpStatus.OK,responseEntityProductList.getStatusCode());
}

@When("^user give call to 'updateProduct' service$")
public void user_give_call_to_updateProduct_service() throws Throwable {
	responseEntityProduct=restTemplate.getForEntity("http://localhost:8695/updateProduct", Product.class);
}

@When("^user provide updated valid product details$")
public void user_provide_updated_valid_product_details() throws Throwable {
	Product product=getProduct();
	   
	   MultiValueMap<String,Object> map =new LinkedMultiValueMap<String, Object>();

	   
	   map.add("date",product.getdate());
	   map.add("code", product.getCode());
	   map.add("name", product.getName());
	   map.add("model", product.getmodel());
	   map.add("price",product.getPrice());
	   map.add("d", product.getD());
	   HttpHeaders headers=new HttpHeaders();
	   headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
	   HttpEntity<MultiValueMap<String,Object>> httpEntity=new HttpEntity<MultiValueMap<String, Object>>(map,headers);
	   
	   restTemplate.put("http://localhost:8695/updateProductDetails", httpEntity);
}

@Then("^all product details will be updated and same product must be returned by service$")
public void all_product_details_will_be_updated_and_same_product_must_be_returned_by_service() throws Throwable {
	 
	
}

}
