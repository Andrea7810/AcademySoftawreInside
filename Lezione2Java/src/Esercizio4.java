import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {

		Scanner inputTastiera = new Scanner(System.in);
		
		System.out.println("Inserisci parola");
		
		String tastiera = inputTastiera.next();
		
		System.out.println(tastiera.charAt(0));
		
		inputTastiera.close();
		
	}

}
