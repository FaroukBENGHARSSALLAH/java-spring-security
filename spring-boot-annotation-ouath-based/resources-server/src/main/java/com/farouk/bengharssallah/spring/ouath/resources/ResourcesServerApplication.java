package com.farouk.bengharssallah.spring.ouath.resources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableResourceServer
@SpringBootApplication
public class ResourcesServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourcesServerApplication.class, args);
	}
}
