import java.util.Scanner;

public class Esercizio8 {

	public static void main(String[] args) {

		int num1 , num2 , num3 ;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci 3 numeri:");
		
		num1 = key.nextInt();
		num2 = key.nextInt();
		num3 = key.nextInt();
		
		if (num1 == num2 && num1 == num3 && num2 == num3)
			System.out.println("I 3 numeri sono uguali");
		else 
			System.out.println("Qualche numero risulta diverso");
		
		
		key.close();
		
		
		
	}

}
