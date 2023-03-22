package it.sowftareinside.cicliIndefiniti;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.println("Inserisci dei numeri:");
		int numUtente = key.nextInt();
		int sommatoria = 0;
		
		while (numUtente != 0) {
			sommatoria += numUtente;
			numUtente = key.nextInt();
			
		}
		
		
		System.out.println("La somma dei numeri da te inseriti " + sommatoria);
		
		
		key.close();
	}

}
