import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Inserisci parola:");
		String parUtente = key.next();

		int i = 0;
		String parolaFinale = "";

		while (i < parUtente.length()) {

			if (parUtente.charAt(i) == 'a') {
				parolaFinale += '@';

			} else {
				parolaFinale += parUtente.charAt(i);
			}

			i++;
		}

		System.out.println(parolaFinale);

		key.close();
	}

}
