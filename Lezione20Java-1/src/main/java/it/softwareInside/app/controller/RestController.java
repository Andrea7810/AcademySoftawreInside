package it.softwareInside.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import it.softwareInside.app.models.Cane;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	
	@GetMapping("/genera-cane")
	public Cane generaCane () {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Cane c = restTemplate.getForObject("https://random.dog/woof.json", Cane.class);
		
		
		return c;
	}
	
	
	
}
