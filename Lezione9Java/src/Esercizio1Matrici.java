import java.util.Random;
import java.util.Scanner;

/*
 * creare un programma che prenda in input 2 interi
 * 
 * verificando che tutti e 2 gli interi siano > 0
 * altrimenti richiedere tutte e 2 i numeri
 * 
 * il programma crea una matrice di stringhe di 2 righe e 3 colonne 
 * 
 * riempire la matrice di stringhe in modo randomico
 * scegliendo 3 differenti emoji 😀 😐🤫
 * 
 * se esce il simbolo 😡 perdi (dire che questo simbolo ha una probabilità di uscire del 30%
 * 
 * 
 */

public class Esercizio1Matrici {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		Random casuale = new Random();

		int numUtente1;
		int numUtente2;

		do {

			System.out.println("Inserisci 2 numeri maggiori di 0:");
			numUtente1 = key.nextInt();
			numUtente2 = key.nextInt();

		} while (numUtente1 <= 0 || numUtente2 <= 0);

		String[][] matrice = new String[numUtente1][numUtente2];

		for (int i = 0; i < matrice.length; i++) {

			for (int j = 0; j < matrice[i].length; j++) {

				int emojiScelta = casuale.nextInt(1 , 11);

				if (emojiScelta == 1) {
					System.out.print(matrice[i][j] = "😀 "); //percentuale 10% = 1
				} else if (emojiScelta >= 2 && emojiScelta <= 4) {
					System.out.print(matrice[i][j] = "😐 "); //percentuale 30% = 2 a 4
				} else if (emojiScelta >= 5 && emojiScelta <= 7) {
					System.out.print(matrice[i][j] = "🤫 "); //percentuale 30% = 5 a 7
				} else 
					System.out.print(matrice[i][j] = "😡 ");

			}
			System.out.println();
		}

		key.close();
	}

}
