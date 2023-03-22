import java.util.Scanner;

public class Esercizio14 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("##################");
		System.out.println("inserisci");
		String parola = key.next();

		int i = 0;
		int cont = 0;

		while (i < parola.length()) {

			char carattereCorrente = parola.charAt(i);

			if (carattereCorrente == 'a')
				cont++;

			i++;
		}

		System.out.println("TOTALE LETTERE A " + cont);

		key.close();

	}

}
