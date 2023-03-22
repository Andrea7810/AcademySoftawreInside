package it.softwareInside.app.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Funzioni {

	
	@GetMapping("/media")
	public double mediaValori (@RequestParam(name = "n1") int num1 , @RequestParam(name = "n2") int num2 , @RequestParam(name = "n3") int num3 ) {
		
		int somma = 0;
		double media = 0;;
		
		try {
			
			somma = num1 + num2 + num3;
			media = somma / 3.0;
			
		} catch (Exception e) {
			
			return media;
		}

		return media;
	}
	
	
	
	
	@GetMapping("/array-list")
	public ArrayList<Integer> creaArrayList (@RequestParam (name = "n") int numero) {
		
		ArrayList<Integer> myArr = new ArrayList<>();
		
		try {
			
			for ( int i = 0; i <= numero ; i++) {
				
				if ( i % 2 == 0)
					myArr.add(i);
			}
			
		} catch (Exception e) {
			
			return myArr;
			
		}
		
		return myArr;
	}
	
	
	
	@GetMapping("/stringa-al-contrario")
	public String contrario (@RequestParam (name = "p") String parola) {
		
		String ris = "";
		
		try {
			
			for (int i = parola.length() - 1; i >= 0; i--) {
				
				ris += parola.charAt(i);
			}
			
			
		} catch (Exception e) {
			
			return ris;
		}
		
		return ris;
	}
	
	
	
	
	
	
	
	
	
	
}
