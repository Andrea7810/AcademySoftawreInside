import java.util.Scanner;

public class EsericizoVocaliConDoWhile {

	public static void main(String[] args) {

//		Scanner key = new Scanner(System.in);

//		System.out.println("Inserisci carattere");
//		char carUtente = key.next().charAt(0);

//		while (carUtente == 'a' || carUtente == 'e' || carUtente == 'i' || carUtente == 'o' || carUtente == 'u') {

//			carUtente = key.next().charAt(0);

//		}

//		System.out.println("Hai inserito una consonante, programma chiuso");

//		key.close();

		
		
		Scanner key = new Scanner(System.in);

		System.out.println("Inserisci carattere");
		char carUtente;
		
		
		//nel do ci finisco almeno una volta
		//continuo a rimanere nel do se la condizione risulta vera
		//è un while all'incontrario
		
		do {
			carUtente = key.next().charAt(0);
		} while (carUtente == 'a' ||
				carUtente == 'e' || 
				carUtente == 'i' || 
				carUtente == 'o' || 
				carUtente == 'u');
		
		
		
		key.close();
	}

}
