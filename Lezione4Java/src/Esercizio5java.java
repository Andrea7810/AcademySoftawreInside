import java.util.Scanner;

public class Esercizio5java {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Inserisci una parola:");
		String parUtente = key.next();
		parUtente = parUtente.toLowerCase();

		System.out.println("Inserisci un carattere:");
		char carUtente = key.next().charAt(0);

		int i = 0;
		boolean trovato = false;

		while (i < parUtente.length()) {
			if (parUtente.charAt(i) == carUtente) {
				trovato = true;
				break;
			}

			i++;
		}

		if (trovato == true)
			System.out.println("yes");
		else
			System.out.println("no");

		key.close();

	}

}
