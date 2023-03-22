
public class Esercizio7 {

	public static void main(String[] args) {

		String[] vett = { "ciao", "cane", "rossi", "bello", "bolla", "gatto" };

		int i = 0;

		while (i < vett.length) {

			if (i % 2 == 0)
				System.out.println(vett[i]);

			i++;
		}

	}

}
