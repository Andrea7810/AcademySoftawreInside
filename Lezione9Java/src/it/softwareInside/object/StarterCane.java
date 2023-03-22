package it.softwareInside.object;

public class StarterCane {

	public static void main(String[] args) {

		
		Cane cane1 = new Cane ();

		
		//quando devo crearmi tanti oggetti si usa l'array
		
		
	//	Cane [] vettCane = new Cane [10];
		
		
		cane1.abbaia();
		

		
		for (int i = 0; i < 5 ; i++) {
			
			cane1.abbaia();
		}
		
		
	}

}
