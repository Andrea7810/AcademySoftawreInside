import java.util.Random;
import java.util.Scanner;

/*
 * 
 * dati in input 2 numeri che rappresentano le righe e le colonne 
 * di una matrice  verificando che siano maggiori di 0
 * 
 * costruire una matrice di boolean che mi rappresenta i posti liberi / occupati
 * di un cinema
 * 
 * con la classe random riempire tutta la matrice con valori casuali 
 * 
 * chiedete all'utente di inserire una posizione dove vuole sedersi
 * per la posizione mi serviranno due numeri (riga e colonna)
 * 
 * se il posto è libero il progamma vi assegna il posto andando ad occupare 
 * il valore che passa da true a false.
 * se il posto è occupato il programmma richiede due nuove coordinate 
 */



public class Esercizio2 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		Random casuale = new Random();
		int row;
		int col;
		
		
		do {
			System.out.println("Inserisci di quante righe devono essere i posti al cinema: ");
			row = key.nextInt();
			System.out.println("Inserisci di quante colonne devono essere i posti al cinema:");
			col = key.nextInt();
			
			if (row <= 0 || col <= 0)
				System.out.println("Hai inserito dei numeri negativi. Per favore reinserisci.");
			
		} while (row <= 0 || col <= 0);
		
		
		boolean [][] matrice = new boolean [row] [col];
		
		
		System.out.println("\nI posti del cinema generati casualmente sono:\n");
		
		for (int i = 0; i < matrice.length; i++) {

			for (int j = 0; j < matrice[i].length; j++) {
				
				matrice[i][j] = casuale.nextBoolean();
				System.out.print(matrice[i][j] + " ");
			}
			
			System.out.println();
		}
		
		int rowUtentePosizione;
		int colUtentePosizione;
		
		do {
			System.out.println("\nInserisci la riga e la colonna in cui vuoi sederti:");
			rowUtentePosizione = key.nextInt();
			colUtentePosizione = key.nextInt();
			if (rowUtentePosizione < 0 || colUtentePosizione < 0)
				System.out.println("Hai inserito dei numeri negativi. Per favore reinserisci.");
			if(rowUtentePosizione >= row || colUtentePosizione >= col)
				System.out.println("Hai inserito un posto non presente nel cinema. Per favore reinserisci.");
			if(matrice[rowUtentePosizione][colUtentePosizione] == false )
				System.out.println("Il posto selezionato è occupato. Reinserisci riga e colonna dove ti vuoi sedere.");
			
		} while (rowUtentePosizione < 0 ||
				colUtentePosizione < 0 ||
				rowUtentePosizione >= row ||
				colUtentePosizione >= col ||
				matrice[rowUtentePosizione][colUtentePosizione] == false );
		
		
		
		
		System.out.println("Ti è stato assegnato il posto alle coordinate " + rowUtentePosizione + " " + colUtentePosizione + " !!");
		
		System.out.println("\nI posti aggiornati sono:\n");
		
		matrice[rowUtentePosizione][colUtentePosizione] = false;
		
		for (int i = 0; i < matrice.length; i++) {
			
			for (int j = 0; j < matrice[i].length; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
				
					
		
		key.close();
	}

}
