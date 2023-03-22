import java.util.Scanner;

public class Esercizio10 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci parola e indice:");
		String parola = key.next();
		int indice = key.nextInt();
		
		
		System.out.println(parola.charAt(indice));
		
		
		key.close();
		
		
	}

}
