
public class EsercizioMatrice3 {

	public static void main(String[] args) {

		int[][] matrice = { { 8, 3 }, { 5, 2 } };

		int somma = 0;

		for (int i = 0; i < matrice.length; i++) {

			for (int j = 0; j < matrice[i].length; j++) {

				if (matrice[i][j] % 2 == 0)
					somma += matrice[i][j];

			}

		}

		System.out.println("La somma dei pari è " + somma);

	}

}
