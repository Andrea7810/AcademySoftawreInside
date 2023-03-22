import java.util.Scanner;

public class Esercizio12 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Inserisci un numero:");
		int numUtente = key.nextInt();

		int i = 1;
		int contatore = 0;

		while (i <= 100) {
			if (i % numUtente == 0) {
				System.out.print(i + " ");
				contatore++;
				
			}

			if (contatore == 5) {
				System.out.println();
				contatore = 0;
			}
			i++;

		}

		key.close();

	}

}
