import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Inserisci una stringa");
		String parUtente = key.next();
		
		System.out.println("Inserisci un carattere");
		char carUtente = key.next().charAt(0);
		
		int i = 0;
		boolean Presente = false;

		while (i < parUtente.length()) {

			if (parUtente.charAt(i) == carUtente) {
				Presente = true;
				break;

			}

			i++;
		}

		if (Presente)
			System.out.println(carUtente + " è presente nella parola");
		else 
			System.out.println(carUtente + " non è presente nella parola");
		


		key.close();

	}

}
