import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {

		Scanner key = new Scanner (System.in);
		
		System.out.println("Inserisci una parola:");
		String parUtente = key.next();
		
		int i = 0;
		int contaLetteraB = 0;
		
		
		while (i < parUtente.length()) {
			
			if( parUtente.charAt(i) == 'b' ) {
				
				contaLetteraB++;	
			}
			
			i++;
		}
		
		
		if (contaLetteraB >= 2)
			System.out.println("Ci sono almeno 2 o più lettere b");
		else
			System.out.println("No");
		
		key.close();
	}

}
