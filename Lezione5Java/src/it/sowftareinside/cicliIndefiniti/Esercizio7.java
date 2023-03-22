package it.sowftareinside.cicliIndefiniti;

import java.util.Scanner;

public class Esercizio7 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Inserisci dei numeri divisibili per due o per tre:");

		int numUtente = key.nextInt();

		int somma = 0;

		
		while (numUtente % 2 == 0 && numUtente < 0
				||numUtente > 0 && numUtente % 3 == 0) {

			somma += numUtente;
			numUtente = key.nextInt();

		}

		System.out.println("La somma dei numeri è " + somma);

		key.close();
	}

}
