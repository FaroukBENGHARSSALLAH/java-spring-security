package com.farouk.bengarssallah.java.spring.security.keycloak.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> futures() {
		return new ResponseEntity<>("You have the access to the restricted resource", HttpStatus.OK);
	}
	
	
}
