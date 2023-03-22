
public class Matrici {

	public static void main(String[] args) {

		
		
		
		int [] [] matrice = new int [2] [4]; //matrice bidimensionale
		
		matrice[0][0] = 10;
		matrice[0][1] = 20;
		matrice[1][0] = 30;
		matrice[1][1] = 50;
		
	//	System.out.println(matrice.length);
		
	//	System.out.println(matrice[0].length);
	
		int [] []matrice2 = { {1 , 2 , 3} , {4 , 5} , {99} };
		
		
	//	System.out.println(matrice2[0].length);
	//	System.out.println(matrice2[1].length);
	//	System.out.println(matrice2[2].length);

		
		//per stampare tutti i valori all'interno della matrice si usa 
		//doppio ciclo
		
		for (int i = 0 ; i < matrice2.length ; i++) {
			
			for (int j = 0 ; j < matrice2[i].length ; j++) {
				
				System.out.print(matrice2[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
	}

}
