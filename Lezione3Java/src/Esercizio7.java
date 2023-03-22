import java.util.Scanner;

public class Esercizio7 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci un numero:");
		
		int numUtente = key.nextInt();
		
		int fattoriale = 1;
		
		
		while (numUtente > 1) {
			
			fattoriale *= numUtente;
			
			numUtente--;
			
		}
		
		System.out.println(fattoriale);
		
		key.close();
	}

}
