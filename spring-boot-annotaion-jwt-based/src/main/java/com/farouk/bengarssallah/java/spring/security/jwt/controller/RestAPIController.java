package com.farouk.bengarssallah.java.spring.security.jwt.controller;



import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {


	
	@GetMapping({ "/" })
	public ResponseEntity<String> Weclome(@AuthenticationPrincipal Jwt jwt) {
		return new ResponseEntity<String>("Weclome " + jwt.getJwkSetUri(), HttpStatus.OK);
	}


	private String getPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	 

}