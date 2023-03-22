import java.util.Scanner;

public class AltroEserc {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		int numero1 , numero2;
		
		System.out.println("Inserisci i due numeri");
        numero1 = key.nextInt();
        numero2 = key.nextInt();
        
        if((numero1 % numero2) == 0)
        	System.out.println("OK");
        else
        	System.out.println("NO");
        		
		
		
		key.close();
		
	}

}
