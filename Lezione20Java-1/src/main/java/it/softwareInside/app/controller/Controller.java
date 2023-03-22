package it.softwareInside.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import it.softwareInside.app.models.Cane;

@org.springframework.stereotype.Controller
public class Controller {

	
	
	@GetMapping("/vedi-cane")
	public ModelAndView vediCane () {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("cane");
		
		RestTemplate restTemplate = new RestTemplate();
		
		
		Cane cane = restTemplate.getForObject("https://random.dog/woof.json", Cane.class);
		
		modelAndView.addObject("immagineCane", cane.getUrl() );
		
		
		return modelAndView;
	}
	
	
}
