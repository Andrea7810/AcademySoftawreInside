package it.softwareInside.Squadra;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {

		
		Team squadra1 = new Team ();
		
		Scanner key = new Scanner (System.in);
		
		String inputUtente;
		
		do {
			System.out.println("Cosa vuoi fare?");
			System.out.println("Premi i per inserire");
			System.out.println("Premi r per rimuovere");
			System.out.println("Premi s per vedere la squadra");
			System.out.println("Premi q per usire");

			inputUtente = key.nextLine();
			
			
			switch (inputUtente) {
			case "i":
				System.out.println("Aggiungi nome , ruolo e età:");
				if ( squadra1.aggiungiGiocatore(new Player(key.next(), key.next(), key.nextInt() ) ) ) {
					System.out.println("Ok aggiunto!");
				}
				break;
				
			case "r":
				System.out.println("Inserisci la posizione del giocatore che vuoi rimuovere:");
				int posizioneUtente = key.nextInt();
				System.out.println("Hai rimosso = " + squadra1.rimuoviGiocatore(posizioneUtente));
				break;
				
			case "s":
				System.out.println(squadra1);
				break;
				
			default:
				if (inputUtente.equals("q"))
					System.out.println("Programma terminato");
				else 
					System.out.println("Carattere non presente!");
				
				break;
			}
			
			
		} while ( ! (inputUtente.equals("q")));
		
		
		
		
		
		
		
		
		
		
		
		key.close();
	}

}
