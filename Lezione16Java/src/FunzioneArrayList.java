import java.util.ArrayList;

public class FunzioneArrayList {

	//senza attributi
	
	
	
	
	//metodi
	
	/* creare una funzione che prenda in ingresso un array list di interi e un numero e restituisce la somma
	 * di tutti gli elementi che sono multipli dell'elemtno inserito
	 */
	public int sommaMultipli (int numero , ArrayList<Integer> myArr) {
		
		int somma = 0;
		
		for (int i = 0; i < myArr.size(); i++) {
			
			if ( myArr.get(i) % numero == 0) {
				somma += myArr.get(i);
			}
		}
		return somma;
	}
	
	
	
	
	/*
	 * 
	 * creare una funzione che prenda in ingresso un arraylist di double e ritorna il prodotto in double di tutti 
	 * gli elementi del'arraylist
	 */
	public double prodottoDouble (ArrayList<Double> myArr) {
		
		double prodotto = 1;
		
		for (int i = 0; i < myArr.size(); i++) {
			prodotto *= myArr.get(i);
		}
		
		return prodotto;
	}
	
	
	
	
	/*
	 * prendere in input un arraylist di interi e ritornare true se tutti gli elementi pari
	 * senno torna false
	 * 
	 */
	public boolean areAllEven (ArrayList<Integer> myArr) {
		
		for (int i = 0; i < myArr.size(); i++) {
			if ( myArr.get(i) % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	
	
	
	
	/*
	 * dato in input un arrayList di double e un double compreso tra 0 e 1 
	 * creare una funzione che se il numero non è compreso nel range indicato
	 * il programma ritorna null
	 * altrimenti ritorna un arraylist dove elemento per elemento succede questo:
	 * 
	 *    [100 , 8 , 7.4 ]       |||||  0.5  --->  [50 , 4 , 3.6 ]
	 *    
	 *    moltiplica tutti gli elementi dell'arraylist per il double dato
	 *    
	 * 
	 */
	public ArrayList<Double> moltiplicaElementiPerNumero (double numero , ArrayList<Double> myArr) {
		
		ArrayList<Double> ris = new ArrayList<>();
		
		if ( numero > 1 || numero < 0)
			return null;
		
		for (int i = 0; i < myArr.size(); i++) {
			double num = myArr.get(i) * numero;
			ris.add(num);
		}
		
		return ris;
	}
	
	
	
	
	/*
	 * 
	 * creare una funzione che prenda in ingresso un arraylist di interi  e ritorna
	 * true se il vettore è formato da tutti elementi primi 
	 * 
	 *  es. 1 , 3 , 5, 7 --> true;
	 *  
	 *  primo se ha massimo  2 divisori
	 *  
	 *  può essere utile creare una funzione ausiliaria che prende in ingresso un numero
	 *  e ritorna true se è primo e false se non lo è.
	 */
	public boolean areAllPrime (ArrayList<Integer> myArr) {
		
		for (int i = 0; i < myArr.size(); i++) {
			
			if ( ! (isPrime(  myArr.get(i)   )) )
				return false;
		}
		
		return true;
	}
	
	
	public boolean isPrime (int numero) {
		
			
		for (int i = 2; i <= numero / 2; i++) {
				
			if (numero % i == 0)
			return false;	
		}
		
		return true;
	}
	
	
	
	
}
