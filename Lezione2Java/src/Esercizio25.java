import java.util.Random;
import java.util.Scanner;

public class Esercizio25 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		Random genera = new Random();
		
		System.out.println("Scrivere un numero:");
		int numeroUtente = key.nextInt();
		
		int numeroCasuale = genera.nextInt(1, 10);
		System.out.println("Il numero generato è " + numeroCasuale);
		
		if (numeroUtente == numeroCasuale)
			System.out.println("HAI VINTO");
		else
			System.out.println("HAI PERSO");
		
		key.close();
		
		
	}

}
