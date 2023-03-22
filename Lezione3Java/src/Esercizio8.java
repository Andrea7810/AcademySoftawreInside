import java.util.Scanner;

public class Esercizio8 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci un numero:");
	    
		int numUtente = key.nextInt();
		
		System.out.println("Inserisci l'esponente:");
		
		int espUtente = key.nextInt();
		
		int risPotenza = 1;
		
		while (espUtente >=1) {

			risPotenza *= numUtente;
			
			espUtente--;
		}

		
		System.out.println(risPotenza);
			
			
		key.close();
	}

}
