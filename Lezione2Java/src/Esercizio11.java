import java.util.Scanner;

public class Esercizio11 {

	public static void main(String[] args) {

		int num1 , num2 , num3;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci 3 numeri");
		
		num1 = key.nextInt();
		num2 = key.nextInt();
		num3 = key.nextInt();
		
		if (num1 % 5 == 0 && num2 % 5 == 0 && num3 % 5 == 0)
			System.out.println("Sono tutti multipli di 5");
		else 
			System.out.println("Non sono tutti e 3 multipli di 5");

		
		key.close();
		
		
		
		
	}

}
