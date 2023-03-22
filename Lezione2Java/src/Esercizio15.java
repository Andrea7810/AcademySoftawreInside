import java.util.Scanner;

public class Esercizio15 {

	public static void main(String[] args) {

		String parola1 , parola2;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci due parole:");
		
		parola1 = key.next();
		parola2 = key.next();
		
		System.out.println(parola1 + " " + parola2);
		
		key.close();
		
	}

}
