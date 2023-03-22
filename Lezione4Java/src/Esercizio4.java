import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {

		Scanner key = new Scanner (System.in);
		
		System.out.println("Inserisci una stringa:");
		
		String parUtente = key.next();
		parUtente = parUtente.toLowerCase();
		
		int i = 0;
		int contaVocali = 0;
		
		while (i < parUtente.length()) {
			if (parUtente.charAt(i) == 'a' || parUtente.charAt(i) == 'e' || parUtente.charAt(i) == 'i' || parUtente.charAt(i) == 'o' || parUtente.charAt(i) == 'u') {
				contaVocali++;
			}
			
			i++;
		}
		
		if (contaVocali == parUtente.length())
			System.out.println("Tu essere uomo primitivo!");
		else
		System.out.println("Ok tu essere uomo che conosce lettera");

	
		key.close();
		
		
	}

}
