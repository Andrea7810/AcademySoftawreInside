package it.softwareInside.garage;

import java.util.Scanner;

import it.softwareInside.veicoli.VeicoloAMotore;

public class GestioneGarage {

	public static void main(String[] args) {

		
		Garage garage1 = new Garage();
		
		
		Scanner key = new Scanner (System.in);
		
		char carUtente;
		
		do {
			System.out.println("GESTIONE GARAGE 1 :");
			System.out.println("Premi s per vedere i veicoli presenti nel garage.");
			System.out.println("Premi a per aggiungere un veicolo nel garage.");
			System.out.println("Premi r per rimuovere un veicolo dal garage.");
			System.out.println("Premi q per uscire.");
			
			carUtente = key.next().charAt(0);
			
			switch (carUtente) {
			case 's':
				System.out.println(garage1);
				break;
			case 'a':
				System.out.println("Hai aggiunto un veicolo alla posizione: " + garage1.aggiungiVeicolo(new VeicoloAMotore()));
				break;
			case 'r':
				System.out.println("A quale posizione del garage vuoi rimuovere il veicolo?");
				int posizioneUt = key.nextInt();
				System.out.println("Hai rimosso ---> " + garage1.rimuoviVeicolo(posizioneUt));
				break;

			default:
				carUtente = 'q';
				break;
			}
			
			
			
		} while (carUtente != 'q');
		
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
			
		System.out.println("Grazie per averci scelto!");
			
			
		key.close();
	}

}
