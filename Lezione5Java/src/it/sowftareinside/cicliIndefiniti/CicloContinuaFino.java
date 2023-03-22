package it.sowftareinside.cicliIndefiniti;

import java.util.Scanner;

public class CicloContinuaFino {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		
		int numUtente = key.nextInt();
		
		while (numUtente != 0) {
			
			System.out.println(numUtente + " E' errato reinserisci:");
			numUtente = key.nextInt();
			
		}
			
		
		System.out.println("Corretto!");
		
		
		
		
		
		key.close();
		
		
		
		
	}

}
