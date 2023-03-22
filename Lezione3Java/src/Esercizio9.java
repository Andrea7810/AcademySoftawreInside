import java.util.Scanner;

public class Esercizio9 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		int i = 1;
		
		System.out.println("Inserisci un numero:");
		int numUtente = key.nextInt();
		
		if (numUtente > 0) {
			while (i <= numUtente) {
				System.out.println(i);
				i++;
			}
			
		} else  {
			System.out.println("Non posso andare avanti");

		}
		
				
		
		key.close();
	}

}
