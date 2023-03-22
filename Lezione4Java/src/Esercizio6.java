import java.util.Scanner;

public class Esercizio6 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una parola:");
		String parUtente = key.next();
		
		int i = 0;
		int contVocali = 0;
		
		while (i < parUtente.length()) {
			
			if (parUtente.charAt(i) == 'a' || parUtente.charAt(i) == 'e' || parUtente.charAt(i) == 'i' || parUtente.charAt(i) == 'o' || parUtente.charAt(i) == 'u') {
				contVocali++;
			if (contVocali >= 2)
				break;
			}
			
			i++;
		}
		
		if (contVocali >= 2)
			System.out.println("SI");
		else System.out.println("NO");
		
		
		
		key.close();
		
	}

}
