import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una parola");
		
		String parola = key.next();
		
		String ParolaReverse = "";
		
		int i = parola.length() - 1;
		
		while (i >= 0) {
			
			ParolaReverse = ParolaReverse + parola.charAt(i);
			
			i--;
		}
		
		System.out.println(ParolaReverse);
		
		System.out.println("In maiuscolo è:" + ParolaReverse.toUpperCase());
			
			
		key.close();
		
		
		
	}

}
