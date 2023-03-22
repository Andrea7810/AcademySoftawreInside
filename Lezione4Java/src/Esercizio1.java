import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una parola:");
		String ParolaUtente = key.next();
		
		int i = 0;
		
		while (i < ParolaUtente.length()) {
			if (i % 2 == 0) {
				System.out.println(ParolaUtente.charAt(i));

			}
			
			i++;
		}
			
			
		
		
		
		key.close();
		
		
		
		
	}

}
