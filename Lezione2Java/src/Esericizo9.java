import java.util.Scanner;

public class Esericizo9 {

	public static void main(String[] args) {

		String par1 , par2 ;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci 2 parole:");
		
		par1 = key.next();
		par2 = key.next();
		
		if (par1.length()== par2.length())
			System.out.println("Le due parole hanno lo stesso numero di caratteri");
		else
			System.out.println("Hanno numeri di caratteri diversi");
		
		
		key.close();
		
	}

}
