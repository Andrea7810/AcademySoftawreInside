import java.util.Scanner;

public class Esercizio9 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci parola");
		String parola = key.next();
		String parolaReverse = "";
		
		int i = parola.length() - 1;
		
		while (i >= 0) {
			
			parolaReverse += parola.charAt(i);
			
			
			i--;
		}
		System.out.println(parolaReverse);
		
		if (parolaReverse.equals(parola))
			System.out.println("ok");
		else
			System.out.println("no");
		
		
		
		
		key.close();
	}

}
