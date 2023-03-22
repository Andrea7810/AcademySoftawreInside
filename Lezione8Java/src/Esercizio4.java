import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		int lato;

		do {
			System.out.println("Inserisci un numero maggiore di 0:");
			lato = key.nextInt();

		} while (lato <= 0);

		for (int i = 0; i < lato; i++) {

			for (int j = 0; j < lato; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

		key.close();
	}

}
