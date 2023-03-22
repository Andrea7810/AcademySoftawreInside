import java.util.Scanner;

public class Esercizio16 {

	public static void main(String[] args) {

		int num1 , num2 , num3;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci 3 numeri");
		
		num1 = key.nextInt();
		num2 = key.nextInt();
		num3 = key.nextInt();

		if (num1 != num2 && num2 != num3 && num1 != num3)
			System.out.println("I 3 numeri sono diversi");
		else 
			System.out.println("C'è qualche numero uguale");
		
		key.close();
	}

}
