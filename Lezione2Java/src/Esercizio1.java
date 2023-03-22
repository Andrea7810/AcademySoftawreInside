import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {

		Scanner InputTastiera = new Scanner(System.in);
		
		System.out.println("Inserisci stringa");
		
		String parolaUtente = InputTastiera.next();
		
		System.out.println(parolaUtente.length());
		
		InputTastiera.close();		
		
		
	}

}
