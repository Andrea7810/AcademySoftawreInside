import java.util.Scanner;

public class Esercizio6 {

	public static void main(String[] args) {

		Scanner key = new Scanner (System.in);
		int quantita;
		
		do {
			System.out.println("Quanti numeri vuoi?");
			quantita = key.nextInt();
		} while (quantita < 0);
		
		int i = 0;
		int somma = 0;
		int numUtente;
		
		while (i < quantita) {
			
			System.out.println("Ok, inserisci il numero:");
			numUtente = key.nextInt();
			somma += numUtente;
			
			i++;
		}
		
		
		System.out.println("La somma è " + somma);
		
		key.close();
		
		
		
	}

}
