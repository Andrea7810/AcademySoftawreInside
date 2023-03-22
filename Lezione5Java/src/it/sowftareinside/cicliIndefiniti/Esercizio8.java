/*
 * Esercizio 2.3: Scrivere un programma PositivoNegativo che chiede all’utente di inserire una sequenza
di interi terminata quando l’utente immette il valore 0 e poi stampa "OK" se la sequenza contiene un
valore positivo seguito da uno negativo, altrimenti stampa il messaggio "NO". A vostra scelta, la stampa
del messaggio "OK" può interrompere o meno l’inserimento dei valori. Risolvere questo esercizio senza
usare array.
 * 
 * 
 * 
 * 
 */

package it.sowftareinside.cicliIndefiniti;

import java.util.Scanner;

public class Esercizio8 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Inserisci un numero:");

		int numUtente = key.nextInt();
		boolean isSequenzaOk = true;
		int cont = 0;

		while (numUtente != 0) {

			if (cont % 2 == 0) {

				if (numUtente < 0)
					isSequenzaOk = false;

			} else {

				if (numUtente > 0)
					isSequenzaOk = false;
			}

			System.out.println("Inserisci un numero:");
			numUtente = key.nextInt();

			cont++;
		}

		if (isSequenzaOk)
			System.out.println("OK");
		else
			System.out.println("NO");

		key.close();
	}

}
