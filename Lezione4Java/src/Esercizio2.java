import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una parola:");
		
		String parUtente = key.next();
		
		int i1 = 0;
		
		System.out.println("\n" + "Indici disponibili:");
		
		while (i1 < parUtente.length()) {
			System.out.print(i1 + "");
			i1++;
		}
		System.out.println();
		System.out.println(parUtente);
		
		
		System.out.println("\n" + "Inserisci un numero:");
		
		int numUtente = key.nextInt();
		
		
		int i = parUtente.length() - 1;
		
		if (numUtente < 0 || numUtente >= parUtente.length()) {
			System.out.println("INDICE FUORI PORTATA");
		}
		
		while (numUtente <= i) {
			
			System.out.print(parUtente.charAt(numUtente) + "");
			numUtente++;
		}
			
		key.close();
		
		
		
		
		
		
	}

}
