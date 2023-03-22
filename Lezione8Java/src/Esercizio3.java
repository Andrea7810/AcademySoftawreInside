import java.util.Scanner;

/*
 * DATO IN INPUT UN NUMERO CHE DEVE ESSERE MAGGIORE DI 0 SENNO
 * RICHIEDERLO.
 * DISEGNARE UNA PIRAMIDE DI BASE E LUNGHEZZA DEL NUM INSERITO.
 * AD ESEMPIO 3 =
 * 
 *    *
 *    * *
 *    * * *
 * 
 */

public class Esercizio3 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		int numUtente;

		do {

			System.out.println("Inserisci un numero maggiore di 0:");
			numUtente = key.nextInt();

		} while (numUtente <= 0);

		
		for (int i = 0 ; i < numUtente ; i++) {
			
			for (int j = 0; j < i + 1 ; j++) {
				
				System.out.print("*");
			}
			
				
			System.out.println();
		}

		

		key.close();
	}

}
