import java.util.Scanner;

public class Esercizio5Vettori {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Inserisci un numero:");
		int numUtente = key.nextInt();

		System.out.println("Ecco i multipli di " + numUtente + " presenti nel vettore:");
		int[] vett = { 6, 8, 10, 3, 12 };

		int i = 0;

		while (i < vett.length) {

			if (vett[i] % numUtente == 0) {
				System.out.println(vett[i]);
			}

			i++;
		}

		key.close();

	}

}
