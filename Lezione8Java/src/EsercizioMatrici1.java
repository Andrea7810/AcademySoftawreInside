import java.util.Random;

public class EsercizioMatrici1 {

	public static void main(String[] args) {

		int [] vett = new int [8];
		
		Random casuale = new Random();
		
		for (int i = 0 ; i < vett.length ; i++) {
			
			vett[i] = casuale.nextInt(1 ,11);
			System.out.print(vett[i] + " ");
		}
		
		
	}

}
