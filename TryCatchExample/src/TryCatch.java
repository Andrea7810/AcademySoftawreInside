import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		Scanner key = new Scanner (System.in);
		
		int somma = 0;
		int cont = 0;
		
		do {
			
			
			try {
				System.out.println("Inserisci un numero:");
				somma += key.nextInt();
				
			} catch (Exception e) {
				
				System.out.println("errore");
			}
			cont++;
			
		} while (cont < 3);
		
		System.out.println("La somma è " + somma);
		
		key.close();
	}

}
