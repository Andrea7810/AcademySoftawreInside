
public class EsercitazioneDa9a10 {

	public static void main(String[] args) {


		int[] vett = { 3, 5, 10, 15, 12, 2, 7 };

		int i = 0;
		int indiceMin = 0;
		int min = vett[0];

		while (i < vett.length) {

			if (vett[i] < min) {
				min = vett[i];
				indiceMin = i;
			}

			i++;
		}

		System.out.println("Il valore minimo nell'array è " + min + " e l'indice minimo è " + indiceMin);

		
		
		
	}

}
