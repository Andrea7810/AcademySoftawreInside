import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.println("Inserisci un numero:");
		int numUtente = key.nextInt();
		boolean isSequenzaOk = true;
		int cont = 0;

		while (numUtente != 0) {

			if (cont == 0) {

				if (numUtente % 2 != 0)
					isSequenzaOk = false;

			} else if (cont == 1) {

				if (numUtente % 2 == 0)
					isSequenzaOk = false;

			} else {

				if (numUtente % 5 != 0)
					isSequenzaOk = false;

			}

			System.out.println("Inserisci un numero:");
			numUtente = key.nextInt();

			cont++;
			
			if (cont > 2)
				cont = 0;
			
		}

		if (isSequenzaOk)
			System.out.println("OK");
		else
			System.out.println("NO");
		key.close();
	}

}
