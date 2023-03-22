import java.util.Scanner;

public class EsercizioPariDispari {

	public static void main(String[] args) {

		/* capire se un numero è pari o dispari
		 * si usa il resto o modulo
		 * %
		 * 10 / 2 = 5 (divisione)
		 * 10 % 5 = 0 (modulo o resto)
		 */
		
		Scanner key = new Scanner(System.in);
		System.out.println("Inserisci");
		int numeroUtente = key.nextInt();
		
		if(numeroUtente % 2 == 0)
			System.out.println("numero pari");
		else
			System.out.println("numero dispari");
		
		key.close();
				
				
		
	}

}
