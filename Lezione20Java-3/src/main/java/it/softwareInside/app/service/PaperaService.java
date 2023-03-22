package it.softwareInside.app.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import it.softwareInside.app.models.Papera;

@Service
public class PaperaService {

	
	
	public Papera papera () {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Papera p = restTemplate.getForObject("https://random-d.uk/api/v2/random", Papera.class);
		
		return p;
	}
	
	
	
	
	public ArrayList<Papera> generaPapere (int numero) {
		
		ArrayList<Papera> myArr = new ArrayList<>();
		
		for (int i = 0; i < numero; i++) {
			
			myArr.add(papera());
		}
		
		return myArr;
	}
	
	
	
	
	
}
