import java.util.Random;

public class EsercizioMatrici2 {

	public static void main(String[] args) {

		int [][] matrice = new int [2][2];
		
		Random casuale = new Random();
		
		for (int i = 0; i < matrice.length ; i++) {
			
			for (int j = 0 ; j < matrice[i].length ; j++) {
				
				matrice[i][j] = casuale.nextInt(1, 11);
				System.out.print(matrice[i][j] + " ");
				
			}
			
		}
		
	}

}
