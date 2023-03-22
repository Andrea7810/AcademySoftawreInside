
public class EsercitazioneDa4a10 {

	public static void main(String[] args) {

		int[] vett = { 4, 7, 18, 21, 13, 6, 8 };

		int i = 0;
		int cont = 0;

		while (i < vett.length) {

			if (vett[i] % 2 == 0)
				cont++;

			i++;
		}

		System.out.println("I numeri pari sono " + cont);

	}

}
