import java.util.Scanner;

public class StarterDvd {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		Dvd[] dvds = new Dvd[20];

		String genereUte;
		int costoUtente;
		

		System.out.println("I dvd disponibili oggi sono:\n");

		for (int i = 0; i < dvds.length; i++) {
			Dvd dvdTemporaneo = new Dvd();
			dvds[i] = dvdTemporaneo;
			System.out.println(dvds[i]);
		}
		
		

		do {
			System.out.println("\nInserisci genere disponibile tra Azione, Avventura, Fantascienza, Horror:");
			genereUte = key.next();

		} while (!(genereUte.equalsIgnoreCase("avventura") 
				|| genereUte.equalsIgnoreCase("azione")
				|| genereUte.equalsIgnoreCase("fantascienza") 
				|| genereUte.equalsIgnoreCase("horror")));
		
		
		

		do {
			System.out.println("\nInserisci costo massimo che vuoi trovare tra i dvd(costo minore 10):");
			costoUtente = key.nextInt();

		} while (costoUtente <= 10);
		
		

		
		System.out.println(
				"I dvd di genere " + genereUte + "con il prezzo uguale o inferiore a " + costoUtente + " sono:");
		

		for (int i = 0; i < dvds.length; i++) {

			if (dvds[i].getGenere().equalsIgnoreCase(genereUte) && dvds[i].getCosto() <= costoUtente)
				System.out.println(dvds[i]);

		}

		key.close();
	}

}
