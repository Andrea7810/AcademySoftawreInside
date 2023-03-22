import java.util.Scanner;

public class Esercizio9AltraVersione2 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci parola:");
		String parUtente = key.next();
		
		
		boolean isPalindroma = true;
		
		int i = 0 , j = parUtente.length() - 1;
		
		while ( i < parUtente.length() / 2) {
			
			if (parUtente.charAt(i) != parUtente.charAt(j)) {
				
				isPalindroma = false;
				break;
			}
			
			
			i++;
			j--;
			
		}
		
		if (isPalindroma == true)
			System.out.println("E' palindroma");
		else 
			System.out.println("Non è palindroma");
		
		
		
		
		
		
		
		key.close();
	}

}
