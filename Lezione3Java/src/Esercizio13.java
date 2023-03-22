import java.util.Scanner;

public class Esercizio13 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci un numero:");
		
		int numUtente = key.nextInt();
		
		int i = 1;
		int somma = 0;
		
		
		while (i <= numUtente) {
			somma += i;
			i++;
		}
			
		double media = somma / numUtente * 1.0;
		
		
		System.out.println(media);
		
		
		key.close();
		
		
		
	}

}
