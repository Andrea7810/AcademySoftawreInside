import java.util.Scanner;

public class Esercizio7 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Inserisci un numero");
		int numUtente = key.nextInt();

		int cont = 0;
		boolean isSequenzaOk = true;

		while (numUtente != 0) {

			if (cont == 0) {
				if (numUtente % 3 != 0)
					isSequenzaOk = false;
			} else if (cont == 1) {
				if (numUtente % 5 != 0)
					isSequenzaOk = false;
			}

			System.out.println("Inserisci un numero:");
			numUtente = key.nextInt();
			cont++;
			
			if (cont > 1)
				cont = 0;
		}

		if (isSequenzaOk)
			System.out.println("OK");
		else
			System.out.println("NO");

		key.close();
	}

}
