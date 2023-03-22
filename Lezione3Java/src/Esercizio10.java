import java.util.Scanner;

public class Esercizio10 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci primo numero:");
		int num1 = key.nextInt();
		
		System.out.println("Inserisci secondo numero:");
		int num2 = key.nextInt();
		
		
		
		while (num1 <= num2) {
			
			System.out.print(num1 + " ");
			num1++;
		}
		
		
		key.close();
		
		
	}

}
