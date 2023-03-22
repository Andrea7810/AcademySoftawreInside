package it.softwareInside.app.controller;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	/*
	 * 
	 * craere una funzione con rotta /sommatoria
	 * 
	 * la funzione ritorna  un intero che rappresenta la sommatoria di 
	 * tutti  i numeri multipli di 3 compresi tra 1 e 100;
	 */
	@GetMapping("/sommatoria")
	public int sommatoriaMultipli3 () {
		
		int somma = 0;
		
		for ( int i = 0 ; i <= 100; i++) {
			if (i % 3 == 0)
				somma += i;
		}
		return somma;
	}
	
	
	
	@GetMapping("/somma")
	public int somma (@RequestParam(name = "numero1") int numero1,@RequestParam(name = "numero2") int numero2 ) {
		
		return numero1 + numero2;
	}
	
	
	
	/*
	 * creare un api che prenda in ingresso una stringa 
	 * e ritorna il numero di caratteri di quella stringa
	 */
	
	
	
	@GetMapping("/stringa")
	public int contaCaratteri (@RequestParam(name = "string") String parola) {
		
		return parola.length();
		
	}
	
	
	
	/*
	 * creare un api che prende in ingresso un int e si
	 * restituisce un array list di numeri casuali tra 1 e 6 che sono tanti quanto
	 * il numero inserito
	 */
	
	
	@GetMapping("/numeriPerArrayList")
	public ArrayList<Integer> quantiNumeriVuoi (@RequestParam (name = "numero") int numero) {
		
		Random casuale = new Random();
		ArrayList<Integer> myArr = new ArrayList<>();
		
		for (int i = 0; i < numero; i++) {
			myArr.add(casuale.nextInt(1 , 7));
		}
		
		return myArr;
	}
	
	
	
}
