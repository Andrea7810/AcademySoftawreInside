import java.util.Scanner;

public class Esercizio19 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una lettera:");

		char lettera = key.next().toLowerCase().charAt(0);
		
		if (lettera == 'a' || lettera == 'e' || lettera == 'i' || lettera == 'o' || lettera == 'u')
			System.out.println("E' un vocale");
			else {
				System.out.println("E' una consonante");
			}
		
		
		key.close();
		
	}

}
