import java.util.Scanner;

public class EsercizioMatrici4 {

	public static void main(String[] args) {

		int[][] matrice = { { 5, 7, 2 }, { 1, 3, 2 }, { 55, 66, 99 } };

		Scanner key = new Scanner(System.in);

		System.out.println("Inserisci un numero:");
		
		int numUtente = key.nextInt();
		boolean isOk = false;

		for (int i = 0; i < matrice.length; i++) {
			
			for (int j = 0; j < matrice[i].length; j++) {

				if (matrice[i][j] == numUtente) {
					isOk = true;
					break;
				}

			}
			if (isOk)
				break;
			
		}

		if (isOk)
			System.out.println("OK");
		else
			System.out.println("NO");

		
		key.close();
	}

}
