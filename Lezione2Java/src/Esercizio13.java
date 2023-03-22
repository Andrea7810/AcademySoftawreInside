import java.util.Scanner;

public class Esercizio13 {

	public static void main(String[] args) {

		int john , invalidita;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci numero di john:");
		
		john = key.nextInt();
		
		System.out.println("Inserisci percentuale invalidità (da 0 a 100):");
		
		invalidita = key.nextInt();
		
		if (invalidita > 70) 
			System.out.println("Ti spettano $" + john * invalidita * 12);
		else 
			System.out.println("Invalidita troppo bassa, hai un coso brutto e non ti spetta nemmeno la 104");
		
		key.close();
		
		
		
	}

}
