import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		int i = 0;
		boolean IsA = true;

		while (i < 5) {

			System.out.println("Inserisci un carattere ");
			char carUtente = key.next().charAt(0);
			if (carUtente != 'a')
				IsA = false;

			i++;
		}

		if (IsA)
			System.out.println("OK");
		else
			System.out.println("NO");

		key.close();

	}

}
