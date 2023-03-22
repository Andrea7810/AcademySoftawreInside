
public class EsercitazioneDa2a10 {

	public static void main(String[] args) {

		int[] vett = { 4, 5, 16, 15, 2, 3, 9 };

		int i = 0;
		int somma = 0;

		while (i < vett.length) {
			if (vett[i] % 3 != 0)
				somma += vett[i];

			i++;
		}

		System.out.println("La somma è " + somma);

	}

}
