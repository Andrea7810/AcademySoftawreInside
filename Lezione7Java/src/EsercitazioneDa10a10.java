
public class EsercitazioneDa10a10 {

	public static void main(String[] args) {

		int[] vett = { 4, 3, 12, 5, 6, 7 };

		int i = 0;
		int somma = 0;
		int media = 0;
		int cont = 0;

		while (i < vett.length) {

			somma += vett[i];

			i++;
		}

		media = somma / vett.length;
		
		System.out.println("La media dei numeri è " + media);
		

		i = 0;

		while (i < vett.length) {

			if (vett[i] > media)
				cont++;

			i++;
		}

		System.out.println("I valori sopra la media nel vettore sono " + cont);
	}

}
