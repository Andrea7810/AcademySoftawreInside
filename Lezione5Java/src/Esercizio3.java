import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		System.out.println("Inserisci la prima parola:");
		String parUtente1 = key.next();

		System.out.println("Inserisci la seconda parola:");
		String parUtente2 = key.next();

		String parComposta = "";

		int i = 0;

		if (parUtente1.length() == parUtente2.length()) {

			while (i < parUtente1.length()) {

				parComposta += parUtente1.charAt(i) + "" + parUtente2.charAt(i);
				;
				if (parComposta.length() >= parUtente1.length()) {
					break;
				}

				i++;
			}

		} else
			System.out.println("Non posso farlo");

		System.out.println(parComposta);

		key.close();

	}

}
