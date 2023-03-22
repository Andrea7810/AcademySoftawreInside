import java.util.Scanner;

public class Esercizio7 {

	public static void main(String[] args) {
		
		int vitt , sconf , par , punt ;
		
		Scanner inputUtente = new Scanner(System.in);
		
		
		System.out.println("Inserisci le vittorie:");
		
		vitt = inputUtente.nextInt();
		
		
		System.out.println("Inserisci le sconfitte:");
		
		sconf = inputUtente.nextInt();

		
		System.out.println("Inserisci i pareggi:");

		par = inputUtente.nextInt();
		
		
		punt = (vitt * 3) + (par * 1);
		
		
		System.out.println("Il punteggio è " + punt);
		
		
		inputUtente.close();
		
		
		
		
	}

}
