import java.util.Scanner;

public class Esercizio18 {

	public static void main(String[] args) {

		
		int velocita , limite;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci la velocità:");
		velocita = key.nextInt();
		
		System.out.println("Inserisci il limite");
		limite = key.nextInt();
		
		if (velocita > limite)
		System.out.println("Hai vinto una multa");
		
			key.close();
	}

}
