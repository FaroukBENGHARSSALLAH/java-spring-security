package com.farouk.bengharssallah.spring.ouath.resources.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.farouk.bengharssallah.spring.ouath.resources.model.Future;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class RestAPIController {
	
	private List<Future> futures = new LinkedList<Future>();
	
	public  RestAPIController() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		futures = objectMapper.readValue(new ClassPathResource("files/futures.json").getFile()	,
				     new TypeReference<List<Future>>(){});
	}

	@RequestMapping(value = { "/futures" }, method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Future>> futures() {
		return new ResponseEntity<List<Future>>(futures, HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = { "/futures/{ticker}" }, method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Future> firstPage(@PathVariable String ticker) {
		return new ResponseEntity<Future>(futures.stream().filter(f -> f.getTicker()
				.equals(ticker)).findAny().get(), HttpStatus.OK);
	}
}
