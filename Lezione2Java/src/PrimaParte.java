import java.util.Scanner;

public class PrimaParte {

	public static void main(String[] args) {

		/*Tra i dati non primitivi:
		 *  -Scanner
		 *  -String (può contenere caratteri e anche numeri)
		 *  a differenza dello scanner non va importato da libreria 
		 */
		
		
		String laMiaStringa = "ciao a tutti";
		String laMiaStringa1 = " Rob";
		
		System.out.println(laMiaStringa + laMiaStringa1);
		
		char myChar1 = 'a';
		char myChar2 = 'b';
		char myChar3 = 'c';
		
		System.out.println(myChar1 + myChar2 + myChar3);
		//cosi il char stampa numeri associati alle lettere
		
		//sul system.out.println l'ln finale significa vai accapo
		
		System.out.print(myChar1);
		System.out.print(myChar2);
		System.out.print(myChar3);

		System.out.println("\n\n\n" + myChar1);
		
		// con \n si va accapo senza togliere ln al syso 
		
		System.out.println(myChar1 + "" + myChar2 + "" + myChar3);
		//altro modo per stampare char su unico rigo
		
		
		//ripetizione scanner
		Scanner tastieraMia = new Scanner (System.in);
		
		String WelcomeMessage = "WelcomeToJava";
		
		System.out.println(WelcomeMessage.length());
		
		
		tastieraMia.close();
		
		
		
	}

}
