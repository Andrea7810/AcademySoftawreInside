import java.util.Scanner;

public class Esercizio8 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una parola:");
		String parUtente = key.next();
		
		char carattere1 = parUtente.charAt(0);
		char carattereFinale = parUtente.charAt(parUtente.length() - 1);
		
		
		if (parUtente.length() > 1) {
			
			if (carattere1 == carattereFinale)
			System.out.println("ok");
			else System.out.println("no");
		}
		
		
		
		
		key.close();
		
		
		
		
		
		
	}

}
