package com.cpb.pnp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {
	
	@GetMapping("/test")
	public String testEndpoint() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "https://localhost:8721/test";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(fooResourceUrl, String.class);
		return response.getBody();
	}

}
