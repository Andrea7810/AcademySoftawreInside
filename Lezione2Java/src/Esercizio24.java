import java.util.Random;

public class Esercizio24 {

	public static void main(String[] args) {

		int ris1 , ris2;
		
		Random generaDado = new Random();
		
		ris1 = generaDado.nextInt(1, 6);
		ris2 = generaDado.nextInt(1, 6);
		System.out.println("I numeri usciti sono " + ris1 + " e " + ris2);
		
		
		if (ris1 + ris2 == 7)
			System.out.println("HAI VINTO");
		else
			System.out.println("HAI PERSO");
		
		
		
	}

}
