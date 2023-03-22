import java.util.Scanner;

public class Esercizio17 {

	public static void main(String[] args) {

		double prezzoInput , scontoInput; 
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci il prezzo:");
		
		prezzoInput = key.nextDouble();
		
		System.out.println("Inserisci lo sconto in percentuale:");
		
		scontoInput = key.nextDouble();
		
		if (scontoInput > 70) {
			System.out.println("Sconto troppo alto");
			System.exit(0); //termina il programma java
		}
		
		
		double nuovoPrezzo = prezzoInput - prezzoInput * (scontoInput / 100);
		
		
		
		System.out.println("Il prezzo scontato è " + nuovoPrezzo);
		
		key.close();
		
	}

}
