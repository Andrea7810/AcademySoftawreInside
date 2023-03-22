
public class Esercizio8 {

	public static void main(String[] args) {

		int[] vett = { 3, 2, 6 };

		int i = 0;
		int prod = 1;

		while (i < vett.length) {

			prod *= vett[i];

			i++;
		}

		System.out.println("Il prodotto è " + prod);

	}

}
