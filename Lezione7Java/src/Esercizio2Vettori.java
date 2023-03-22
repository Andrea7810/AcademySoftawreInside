import java.util.Scanner;

public class Esercizio2Vettori {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		int dimensioneVettore;

		do {
			System.out.println("Inserisci la dimensione:");
			dimensioneVettore = key.nextInt();
		} while (dimensioneVettore <= 0);

		System.out.println("Ok creo un vettore di " + dimensioneVettore);

		int[] vettInt = new int[dimensioneVettore];
		int i = 0;

		System.out.println("Inserisci " + dimensioneVettore + " numeri");

		while (i < vettInt.length) {

			vettInt[i] = key.nextInt();

			i++;
		}

		i = 0;

		while (i < vettInt.length) {

			System.out.print(vettInt[i] + " ");

			i++;
		}

		key.close();
	}

}
