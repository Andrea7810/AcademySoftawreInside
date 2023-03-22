import java.util.Scanner;

public class Esercizio20 {

	public static void main(String[] args) {

		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci un numero:");
		
		int num1 = key.nextInt();
		
		double ris = num1 % 2 == 0 ? num1 * 2 : num1 / 2.0;
		
		System.out.println("Il risultato è: " + ris);
		
		key.close();
		
	}

}
