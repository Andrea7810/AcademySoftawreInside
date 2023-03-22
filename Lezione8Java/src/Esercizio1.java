
public class Esercizio1 {

	public static void main(String[] args) {

		int[] vett = { 1, 4, 3, 5, 6, 3 };

		int j = 0;
		int i = 0;
		boolean ciSonoUguali = false;

		while (i < vett.length) {

			j = i + 1;
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
			System.out.println("OK");
		else
			System.out.println("NO");

	}

}
