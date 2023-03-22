
public class EsercitazioneDa5a10 {

	public static void main(String[] args) {

		int [] vett = { 5 , 6 , 19 , 4 , 2 , 17 , 21 , 15};
		
		int i = 0;
		int cont = 0;
		
		while (i < vett.length) {
			if (vett[i] % 2 != 0)
				cont++;
			
			
			i++;
		}
		
		System.out.println("I numeri dispari sono " + cont);
		
		
	}

}
