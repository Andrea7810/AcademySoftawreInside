import java.util.Scanner;

public class EsercitazioneDa6a10 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		int[] vett = { 4, 6, 8, 1, 5, 4, 6, 7, 8, 13, 15, 13 };

		System.out.println("Inserisci un numero:");
		int numUtente = key.nextInt();

		int i = 0;
		int cont = 0;

		while (i < vett.length) {

			if (vett[i] == numUtente)
				cont++;

			i++;
			
		}

		System.out.println(numUtente + " nel vettore appare " + cont + " volte");

		key.close();
	}

}
