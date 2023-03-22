package it.sowftareinside.cicliIndefiniti;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {

		Scanner key = new Scanner (System.in);
		
		System.out.println("Inserisci una parola:");
		String parUtente = key.next();
		parUtente.toLowerCase();
		
		while ( ! parUtente.equals("exit")) {
			
			System.out.println("Inserisci una parola");
			parUtente = key.next();
		}
			
			
		
		System.out.println("Hai inserito exit, programma chiuso");
		
		
		
		
		
		
		key.close();
	}

}
