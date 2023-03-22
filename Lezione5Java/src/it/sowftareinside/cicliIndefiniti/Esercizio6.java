package it.sowftareinside.cicliIndefiniti;

import java.util.Scanner;

public class Esercizio6 {

	public static void main(String[] args) {

		Scanner key = new Scanner (System.in);
		
		System.out.println("Quanti numeri vuoi inserire");
		int quanto = key.nextInt();
		int i = 0;
		int numero = 0;
		boolean isPari = true;
		
		while (i < quanto) {
			
			System.out.println("Inserisci i numeri:");
			numero = key.nextInt();
			if (numero % 2 != 0) {
				isPari = false;
				
			}
			
		
			i++;
		}
		if (isPari == true)
			System.out.println("Sono tutti positivi e pari");
		else
			System.out.println("No");
		
		
		System.out.println("");
		key.close();
	}

}
