package it.softwareInside.app.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import it.softwareInside.app.models.Gatti;

@Service
public class GattiService {

	
	public String  generaGatto () {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Gatti ris = restTemplate.getForObject("https://meowfacts.herokuapp.com/", Gatti.class);
		
		return ris.getData().get(0);
	}
	
	
	
	
	
	public ArrayList<String> generaGatti (int numero) {
				
		ArrayList<String> ris = new ArrayList<>();
		
		for (int i = 0; i < numero; i++) {
			
			ris.add(generaGatto());
		}
		
		return ris;
	}
	
	
	
	
	public Gatti lingua (String lingua , int numero) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Gatti gatto = restTemplate.getForObject("https://meowfacts.herokuapp.com/?lang=" + lingua + "&count=" + numero, Gatti.class);
		
		return gatto;
	}
	
	
	
}
