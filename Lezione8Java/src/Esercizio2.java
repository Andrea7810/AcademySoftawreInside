import java.util.Scanner;

/*
 * PRENDI IN INPUT UN NUMERO DA TASTIERA.
 * VEDERE SE QUESTO NUMERO E' MAGGIORE DI 0. SE IL NUMERO RISULTA NEGATIVO 
 * O UGUALE A 0 IL PORGRAMMA CONTINUA A RICHIEDERLO FINO A 3 VOLTE SENNO SI FERMA.
 * DOPO QUESTA VERIFICA SE AD ESEMPIO N = 1 IL PROGRAMMA DISEGNA UN ASTERISCO
 * SE N = 2 DISEGNA 2 ASTERISCHI
 * SE N = 3 DISEGNA 3 ASTERISCHI E COSI VIA...
 * 
 */

public class Esercizio2 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		int numUtente;
		int contErrori = 0;

		do {

			System.out.println("Inserisci un numero maggiore di 0:");
			numUtente = key.nextInt();

			if (contErrori > 2) {
				System.out.println(" 3 Tentativi errati");
				break;

			}

			contErrori++;

		} while (numUtente <= 0);

		int i = 0;
		String parFinale = "";

		while (i < numUtente) {

			parFinale += "*";

			i++;
		}

		System.out.println(parFinale);

		key.close();
	}

}
