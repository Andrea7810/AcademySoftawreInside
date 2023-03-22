package it.softwareInside.app.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import it.softwareInside.app.models.Gatti;
import it.softwareInside.app.service.GattiService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	GattiService gattiService;
	
	@GetMapping("/una-informazione") 
	public String generaGatto () {
		
		return gattiService.generaGatto();
	}
	
	
	@GetMapping("/piu-informazioni")
	public ArrayList<String> generaGatti (@RequestParam (name="n") int numero) {
		
		return gattiService.generaGatti(numero);
	}
	
	
	
	@GetMapping("/cose-sui-gatti")
	public Gatti lingua (@RequestParam (name="lang") String lingua , @RequestParam (name="n") int numero) {
		
		return gattiService.lingua(lingua, numero);
	}
	
	
	
	
	
	
	
}
