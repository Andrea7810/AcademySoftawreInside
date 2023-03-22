import java.util.Scanner;

public class Esercizio7java {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una parola:");
		
		String parUtente = key.next();
		
		int i = 0;
		boolean vocaliVicine = false;
		
		while (i < parUtente.length() - 1) {
			
			char carattere = parUtente.charAt(i);
			char carattereDopo = parUtente.charAt(i+1);
			
			if (carattere == 'a' ||
				carattere == 'e' ||
				carattere == 'i' ||
				carattere == 'o' ||
				carattere == 'u'){
				if (carattereDopo == 'a' ||
					carattereDopo == 'e' ||
					carattereDopo == 'i' ||
					carattereDopo == 'o' ||
					carattereDopo == 'u')
					
				vocaliVicine = true;
				break;
			}
			
			i++;
		}
		
		if (vocaliVicine == true)
			System.out.println("si");
		else
			System.out.println("no");
		
		
		
		key.close();
		
		
		
	}

}
