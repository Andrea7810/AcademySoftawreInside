import java.util.Scanner;

public class Esercizo6diLezione5altraVersione {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		int numeroDiElementi;

		do {
			System.out.println("Inserisci numero maggiore di 0");
			numeroDiElementi = key.nextInt();
		} while (numeroDiElementi <= 0);

		// sono sicuro che numeroDiElementi è > 0

		boolean isAllPositiviPari = true;

		int i = 0;
		int elementoCorrente;

		while (i < numeroDiElementi) {

			System.out.println("Inserisci un numero:");
			elementoCorrente = key.nextInt();

			if (elementoCorrente < 0 || elementoCorrente % 2 != 0)
				isAllPositiviPari = false;
			i++;
		}

		if (isAllPositiviPari)
			System.out.println("Sono tutti positivi e pari.");
		else
			System.out.println("Non sono tutti positivi e pari.");

		key.close();
	}

}
