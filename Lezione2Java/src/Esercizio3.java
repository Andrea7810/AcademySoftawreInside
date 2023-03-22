import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {

		Scanner inputTastiera = new Scanner(System.in);
		
		System.out.println("Inserisci una parola");
		String Tastiera = inputTastiera.next();
		
		if (Tastiera.length()>= 3)
			System.out.println(Tastiera.substring(1));
			
		
		inputTastiera.close();
		
		
		
	}

}
