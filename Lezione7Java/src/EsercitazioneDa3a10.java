
public class EsercitazioneDa3a10 {

	public static void main(String[] args) {

		int[] vett = { 2, 6, 5, 4, 19, 14, 18, 24, 30 };

		int i = 0;
		int somma = 0;

		while (i < vett.length) {

			if (vett[i] % 2 == 0 && vett[i] % 3 == 0)
				somma += vett[i];

			i++;
		}

		System.out.println("La somma è " + somma);

	}

}
