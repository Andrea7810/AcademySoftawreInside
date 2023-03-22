package it.sowftareinside.cicliIndefiniti;

import java.util.Scanner;

public class Esercizio10 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		int numUtente;
		int i = 0;
		int j = 0;
		
		while (i < 5) {
			
			j = 0;

			System.out.println("Quanti numeri vuoi inserire?");
			int quanti = key.nextInt();
			
			while (j < quanti) {
				
				System.out.println("Inserisci il numero:");
				numUtente = key.nextInt();
				System.out.println("Il numero inserito è " + numUtente);
				
				j++;
			}
			
			
			i++;
		}
		
		
		key.close();
	}

}
