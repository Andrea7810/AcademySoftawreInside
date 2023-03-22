
public class Esercizio4Vettori {

	public static void main(String[] args) {

		int[] vett = { 10, 40, 60, 100 };

		int i = 0;
		int somma = 0;

		while (i < vett.length) {

			somma += vett[i];

			i++;
		}

		System.out.println("La somma è " + somma);

	}

}
