package it.softwareInside.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import it.softwareInside.app.models.Fox;

@org.springframework.stereotype.Controller
public class Controller {

	
	@GetMapping("/")
	public ModelAndView getIndex () {
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		//call http
		RestTemplate restTemplate =  new RestTemplate();
		
		Fox foxRis = restTemplate.getForObject("https://randomfox.ca/floof/", Fox.class);
		
		
		modelAndView.addObject("immagineFox", foxRis.getImage());
		
		return modelAndView;
	}
	
	
	
	
	
	
	
	
}
