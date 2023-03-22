package it.sowftareinside.cicliIndefiniti;

import java.util.Scanner;

public class Esericizio9 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci quanti numeri vuoi inserire:");
		
		int quanti = key.nextInt();
		int i = 0;
		int somma = 0;
		int contaNumeriDiv3 = 0;
		
		while (i < quanti) {
			
			System.out.println("Inserisci i numeri:");
			int numUtente = key.nextInt();
			if (numUtente % 3 == 0) {
				contaNumeriDiv3++;
				somma += numUtente;
				
			}
			
				
			
			
			i++;
		}
		
		
		
		System.out.println("La media è " + somma / contaNumeriDiv3);
		
		
		key.close();
		
		
		
		
		
	}

}
