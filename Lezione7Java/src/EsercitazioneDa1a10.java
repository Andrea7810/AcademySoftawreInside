
public class EsercitazioneDa1a10 {

	public static void main(String[] args) {

		int[] vett = { 4, 7, 6, 9, 13, 15 };

		int i = 0;
		int somma = 0;

		while (i < vett.length) {

			if (vett[i] % 3 == 0)
				somma += vett[i];

			i++;
		}

		System.out.println("La somma è " + somma);
	}

}
