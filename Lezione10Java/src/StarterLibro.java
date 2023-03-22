import java.util.Scanner;

public class StarterLibro {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		Libro libro1 = new Libro();

		System.out.println("Vuoi creare un nuovo libro ? si o no");

		String ris = key.nextLine();

		if (ris.equals("si")) {

			System.out.println("Titolo:");
			libro1.setTitolo(key.nextLine());

			System.out.println("Autore:");
			libro1.setAutore(key.nextLine());

			System.out.println("Genere:");
			libro1.setGenere(key.nextLine());

			System.out.println("Numero di Pagine:");
			libro1.setNumPagine(key.nextInt());

			System.out.println("Prezzo:");
			libro1.setPrezzo(key.nextDouble());
			
		} else {
			System.out.println("Ok, alla prosssima!");
			System.exit(0);
		}

		System.out.println(libro1.toString());

		// System.out.println("Il primo libro è:");
		// System.out.println("Titolo = " + libro1.getTitolo() + "\nAutore = " +
		// libro1.getAutore() + "\nGenere = " + libro1.getGenere() + "\nNumero Pagine =
		// " + libro1.getNumPagine() + "\nPrezzo = " + libro1.getPrezzo() );

		System.out.println("\nCreo un secondo libro io:");

		Libro libro2 = new Libro();

		libro2.setTitolo("Fuori");
		libro2.setAutore("Luca Bianchi");
		libro2.setGenere("Azione");
		libro2.setNumPagine(345);
		libro2.setPrezzo(23.50);

		System.out.println(libro2.toString());
		
		// System.out.println("\nIl secondo libro è:");
		// System.out.println("Titolo = " + libro2.getTitolo() + "\nAutore = " +
		// libro2.getAutore() + "\nGenere = " + libro2.getGenere() + "\nNumero Pagine =
		// " + libro2.getNumPagine() + "\nPrezzo = " + libro2.getPrezzo() );

		System.out.println("\nIl prezzo più alto è del libro:");

		if (libro1.getPrezzo() > libro2.getPrezzo())
			System.out.println(libro1.getTitolo() + " " + libro1.getPrezzo());
		else
			System.out.println(libro2.getTitolo() + " " + libro2.getPrezzo());

		
		System.out.println("**********");
		
		
		
		key.close();
	}

}
