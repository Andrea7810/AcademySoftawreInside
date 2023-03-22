
public class EsercitazioneDa8a10 {

	public static void main(String[] args) {

		int[] vett = { 3, 5, 10, 15, 12, 2, 7 };

		int i = 1;
		int indiceMax = 0;
		int max = vett[0];

		while (i < vett.length) {

			if (vett[i] > max) {
				max = vett[i];
				indiceMax = i;
			}

			i++;
		}

		System.out.println("Il valore massimo nell'array è " + max + " e l'indice massimo è " + indiceMax);

	}

}
