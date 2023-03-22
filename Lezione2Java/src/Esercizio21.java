import java.util.Random;

public class Esercizio21 {

	public static void main(String[] args) {

		// non primitivi --> String, Scanner, Random
		
	Random genera = new Random();
	
//	System.out.println(genera.nextInt(20)); 
	
	
	int limite = 50;
	int velox = 10 + genera.nextInt(60);
	
	System.out.println("Km/h " + velox);
	
	if (velox > limite)
		System.out.println("MULTA");
	else 
		System.out.println("SALVO");
	
	}

}
