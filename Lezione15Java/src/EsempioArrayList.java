import java.util.ArrayList;

public class EsempioArrayList {

	public static void main(String[] args) {

		
		/*
		 * l'array list è una struttura dati
		 * ovvero un modo per ornganizzare i dati
		 * 
		 * è molto simile a un vettore classico
		 * le posizioni vanno da 0 fino a n-1;
		 * 
		 * vantaggio : l'array list può assumere
		 * dimensioni diverse in momenti diversi;
		 * è flessibile
		 * 
		 * 
		 * l'array no.
		 * 
		 */
		
		
	//	String [] carrello1 = new String [10] ; //vettore
		
		
		ArrayList<String> carrello = new ArrayList<>(); //array list
		
		
		
		carrello.add("Item1");
		carrello.add("Item1");
		carrello.add("Item1");

		System.out.println(carrello);
		
		
		
		System.out.println("@@@@@@@@@@@");
		
		
		for (String parola : carrello)
			System.out.println(parola);
		
		
		
		System.out.println("#################");
		
		
		for (int i = 0; i < carrello.size(); i++) {
			System.out.println(carrello.get(i));
		}
		
		
		
		//per fare array list di interi
		
		ArrayList<Integer> myArr = new ArrayList<>();
		
		
		myArr.add(0);
		myArr.add(2);
		myArr.add(3);

		System.out.println(myArr);
		
		
		//array list di double
		
		ArrayList<Double> myArr2 = new ArrayList<>();
		
		ArrayList<Character> myArr3 = new ArrayList<>();

		ArrayList<Float> myArr4 = new ArrayList<>();

		
		
		
	}

}
