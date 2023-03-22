
public class Esercizio9 {

	public static void main(String[] args) {

		int[] vett = { 1, 2, 8, 3, 15, 3 };

		boolean ciSonoUguali = false;

		int i = 0;
		while (i < vett.length) {
			
			int j = i + 1;
			
			while (j < vett.length) {
				
				if (vett[i] == vett[j]) {
					ciSonoUguali = true;
					break;
				}
				
				j++;
			}
			if (ciSonoUguali)
				break;
			
			i++;
		}

		if (ciSonoUguali) 
			System.out.println("si");
		 else 
			System.out.println("no");
		

	}

}
