import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci un numero:");
		int numUtente = key.nextInt();
		
		int i = 1;
		int contDivisori = 0;
		
		while (i <= numUtente) {
			
			if (numUtente % i == 0) {
				contDivisori++;
			}
			
			
			i++;
		}
			
		if (contDivisori <= 2)	
			System.out.println("E' PRIMO");
		else 
			System.out.println("NON E' UN NUMERO PRIMO");
		
		
		
		
		
		
		
		
		
		key.close();
		
		
	}

}
