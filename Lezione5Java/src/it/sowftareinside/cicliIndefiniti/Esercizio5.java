package it.sowftareinside.cicliIndefiniti;

import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci carattere");
		char carUtente = key.next().charAt(0);
		
		while (carUtente == 'a' || 
				carUtente == 'e' || 
				carUtente == 'i' ||
				carUtente == 'o' ||
				carUtente == 'u') {
			
			carUtente = key.next().charAt(0);
			
			
			
			
		}
		
		System.out.println("Hai inserito una consonante, programma chiuso");
		
		
		
		
		
		key.close();
	}

}
