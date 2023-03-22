import java.util.Scanner;

public class EsercizioUltimo {

	public static void main(String[] args) {

		int numero1 , numero2 , numero3;
		double media;
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci 3 numeri:");
		numero1 = tastiera.nextInt();
		numero2 = tastiera.nextInt();
		numero3 = tastiera.nextInt();
		
		media = (numero1 + numero2 + numero3) / 3.0;
		
		System.out.println("La media aritmetica è " + media);
		
		tastiera.close();

		
	}

}
