import java.util.Scanner;

public class Esercizio4AltraVersione {

	public static void main(String[] args) {

		Scanner key = new Scanner (System.in);
		
		System.out.println("Inserisci stringa:");
		
		String parUtente = key.next();
		
		int i = 0;
		
		boolean sonoTutteVocali = true;
		
		while ( i < parUtente.length()) {
			
			char carattereCorrente = parUtente.charAt(i);
			
			if (carattereCorrente != 'u' && carattereCorrente != 'o' && carattereCorrente != 'i' && carattereCorrente != 'e' && carattereCorrente != 'a') {
				
				sonoTutteVocali = false;
				break;
			}
			
			i++;
		}
		
		if (sonoTutteVocali == true) // == true si poteva non mettere perchè sonotuttevocali era gia vera come condizione booleana
			System.out.println("Tu essere uomo primitivo");
		else 
			System.out.println("Tu essere uomo che conosce lettera");
		
		
		
		
		
		
		
		
		
		
		
		key.close();
		
		
		
		
	}

}
