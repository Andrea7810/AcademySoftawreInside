
/*
 * Fare prodotto dei numeri che si trovano nella matrice
 * nella diagonale superiore e in quella inferiore
 * 
 * 
 */


public class EsercizioMatrici5 {

	public static void main(String[] args) {

		int [] [] matrice = { {5 , 2, 1 } , { 1 , 3 , 3 } , { 5 , 4 ,2 }};
		
		int prodotto = 1;
		int contScala = 1;
		int prodotto2 = 1;
		
		for (int i = 0; i < matrice.length ; i++) {
			
			for (int j = 0 ; j < matrice[i].length ; j++) {
				
				if (j == i) {
					prodotto *= matrice[i][j];
					
				}
				if (j == matrice[i].length - contScala) {
					prodotto2 *= matrice[i][j];
					
				}
					
			}
			contScala++;
		}
		
		System.out.println(prodotto);
		System.out.println(prodotto2);
		
	}

}
