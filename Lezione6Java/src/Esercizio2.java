import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Inserisci un carattere:");
		char carUtente = key.next().charAt(0);
		int cont = 0;
		boolean isSeqOk = true;

		while (carUtente != 'q') {

			if (cont % 2 == 0) {
				if (carUtente != 'a' &&
						carUtente != 'e' &&
						carUtente != 'i' &&
						carUtente != 'o' &&
						carUtente != 'u')
					isSeqOk = false;
				
			} else {
				
				if (carUtente == 'a' ||
						carUtente == 'e' ||
						carUtente == 'i' ||
						carUtente == 'o' ||
						carUtente == 'u')
					isSeqOk = false;
			}
			

			System.out.println("Inserisci un carattere:");
			carUtente = key.next().charAt(0);
			cont++;
		}
		

		if (isSeqOk)
			System.out.println("OK");
		else
			System.out.println("NO");

		key.close();
	}
}
