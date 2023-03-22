package it.softwareInside.object;

import java.util.Scanner;

public class StarterGatto {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		Gatto gatto1 = new Gatto();
		
		int numUtente;
		
		
		do {
			System.out.println("Inserisci quante volte deve miagolare il gatto");
			numUtente = key.nextInt();
			
		} while (numUtente <= 0);
		
		
		for (int i = 0; i < numUtente ; i++) {
			
			gatto1.miagola();
		}
		
		
		key.close();
	}

}
