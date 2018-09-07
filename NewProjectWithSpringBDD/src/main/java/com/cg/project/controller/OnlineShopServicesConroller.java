package com.cg.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OnlineShopServicesConroller {

	@RequestMapping(method=RequestMethod.GET, value= {"/sayHello"},produces="application/text")
	public ResponseEntity<String> getHelloMessage(){
		return new ResponseEntity<String>("Hello world from Restful web services",HttpStatus.OK);
	}
}
