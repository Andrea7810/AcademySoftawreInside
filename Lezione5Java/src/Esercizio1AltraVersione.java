import java.util.Scanner;

public class Esercizio1AltraVersione {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Inserisci numero:");
		int numUtente = key.nextInt();

		boolean isNumeroPrimo = true;
		int i = numUtente / 2;

		while (i > 1) {

			if (numUtente % i == 0) {
				isNumeroPrimo = false;
				break;
				
			}

			i--;
		}

		if (isNumeroPrimo == true)
			System.out.println("ok è primo");
		else
			System.out.println("no");

		key.close();
	}

}
