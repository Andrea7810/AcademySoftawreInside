import java.util.Scanner;

public class Esercizio15 {

	public static void main(String[] args) {

		Scanner key = new Scanner (System.in);
		System.out.println("Inserisci una parola:");
		
		String parolaUtente = key.next();
		
		int i = parolaUtente.length() - 1;
		
		
		while (i >= 0) {
			System.out.println(parolaUtente.charAt(i));
			i--;
		}
			
		
		
		
		
		
		
		
		key.close();
		
	}

}
