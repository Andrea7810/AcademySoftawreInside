package it.sowftareinside.cicliIndefiniti;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Inserisci dei caratteri:");

		char carUtente = key.next().charAt(0);

		String parolaFinale = "";

		while (carUtente != 'q') {

			parolaFinale += carUtente;
			carUtente = key.next().charAt(0);

		}

		System.out.println("La parola finale è " + parolaFinale);

		key.close();
	}

}
