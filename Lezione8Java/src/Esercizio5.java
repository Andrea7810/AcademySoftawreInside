import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		int numUtente;

		do {
			System.out.println("Inserisci un numero maggiore di 0:");
			numUtente = key.nextInt();

		} while (numUtente <= 0);
		
		

		for (int i = 0; i < numUtente; i++) {

			for (int j = 0; j < numUtente; j++) {

				
				if (j == i)
					System.out.print("😃 ");
				else
				System.out.print("* ");

			}

			System.out.println();

		}

		key.close();
	}

}
