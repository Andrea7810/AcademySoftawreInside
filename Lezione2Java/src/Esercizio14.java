import java.util.Scanner;

public class Esercizio14 {

	public static void main(String[] args) {

		int num1;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci un numero:");
		
		num1 = key.nextInt();
		
		if (num1 % 2 == 0)
			System.out.println("Il numero è pari");
		else
			System.out.println("Il numero è dispari");
		
		
		key.close();
		
		//oppure si puo usare operatore ternario
//      String risposta = numero % 2 == 0 ? "pari" : "dispari";
		
	}

}
