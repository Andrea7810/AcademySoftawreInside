import java.util.Scanner;

public class Eserczio2 {

	public static void main(String[] args) {

		
		int numero1 , numero2 , numero3, somma;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci 3 numeri");
		
		numero1 = tastiera.nextInt();
		numero2 = tastiera.nextInt();
		numero3 = tastiera.nextInt();
		
		somma = numero1 + numero2 + numero3;
		
		System.out.println("La somma è " + somma);
		
		tastiera.close();

		
	}

}
