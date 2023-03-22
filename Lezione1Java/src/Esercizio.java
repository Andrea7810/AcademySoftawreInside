import java.util.Scanner;

public class Esercizio {

	public static void main(String[] args) {

		int numero1 , numero2;
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci 2 numeri");
		
		numero1 = tastiera.nextInt();
		numero2 = tastiera.nextInt();
		
		if(numero1 > numero2)
			System.out.println(numero1 + " è più grande");
		else
			System.out.println(numero2 + " è più grande");
		
		tastiera.close();
		
		
		
	}

}
