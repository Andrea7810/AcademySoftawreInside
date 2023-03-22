package it.softwareInside.app.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.softwareInside.app.models.Papera;
import it.softwareInside.app.service.PaperaService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	
	@Autowired
	PaperaService paperaService;
	
	
	@GetMapping("/")
	public Papera parera () {
		
		return paperaService.papera();
	}
	
	
	
	@GetMapping("/genera-papere")
	public ArrayList<Papera> generaPapere (@RequestParam(name="n") int numero) {
		
		return paperaService.generaPapere(numero);
	}
	 
	
	
}
