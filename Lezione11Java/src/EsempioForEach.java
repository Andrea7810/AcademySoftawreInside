
public class EsempioForEach {

	public static void main(String[] args) {

		
		//esempio di for each
		
		int [] vettore1 = { 10, 20 ,30 };
		
		
		for (int numero : vettore1)
			System.out.println(numero);
		
		
		//stessa cosa scritta col for
		
		for (int i = 0; i < vettore1.length; i++) {
			System.out.println(vettore1[i]);
		}
		
		
		//altro esempio di for each
		
		
		boolean [] vettore2 = { true, false, false, true };
		
		
		for (boolean bool : vettore2) 
			System.out.println(bool);
		
		
		//altro esempio di for each
		
		
		String [] vettore3 = {"ciao", "miao" , "gatto"};
		
		for (String parola : vettore3) {
			
			if (parola.length() > 4)
			System.out.println(parola);
		}
		
		
	}

}
