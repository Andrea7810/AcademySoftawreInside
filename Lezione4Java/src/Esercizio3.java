import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci parola:");
		String parUtente = key.next();
		
		System.out.println();
		System.out.print("La metà della parola è: ");
		
		int i = 0;
		
		while (i < parUtente.length() / 2) {
			System.out.print(parUtente.charAt(i));
			i++;
		}
		
		
		
		
		
		
		
		
		
		key.close();
		
		
		
	}

}
