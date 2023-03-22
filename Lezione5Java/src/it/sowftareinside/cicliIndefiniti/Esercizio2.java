package it.sowftareinside.cicliIndefiniti;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci dei numeri:");
		int numUtente = key.nextInt();
		
		int somma = 0;
		
		while (numUtente != 0) {

			if (numUtente % 2 == 0) {
				somma += numUtente;
			}
			numUtente = key.nextInt();
			
		}
		
		
		System.out.println("La somma è " + somma);
		
		
		key.close();
	}

}
