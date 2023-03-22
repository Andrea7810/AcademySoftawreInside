import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {
		
		int eta;

		Scanner inputTastiera = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome:");
		
		String Tastiera1 = inputTastiera.next();
		
		System.out.println("Inserisci la tua età:");
		
		eta = inputTastiera.nextInt();
		
		if (eta >= 18)
			System.out.println(Tastiera1 + " puoi prendere la patente!");
		else
			System.out.println(Tastiera1 + " non puoi prendere la patente!");
		
		inputTastiera.close();
		
		
	}

}
