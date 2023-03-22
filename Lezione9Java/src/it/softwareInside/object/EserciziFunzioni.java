package it.softwareInside.object;

public class EserciziFunzioni {

	
	/*
	 * creare una funzione che prende in input numeri e ritorna la somma dei 2 numeri
	 * 
	 * 
	 */
	
     /*
      * 
      * public tipoRitorno nomeFunzione (PARAMETRI IN INPUT) {
      * return
      *  }
      */

	
	
	public int somma (int numero1 , int numero2) {
		
		return numero1 + numero2;
	}
	
	
	/*
	 * 
	 * creare una funzione che prende in input un numero ritorna il doppio del numero
	 * 
	 */
	
	
	public int doppio (int numero1) {
		
		return numero1 * 2;
	}
	
	
	
	/*
	 * costruire una funzione che prenda in ingress un numero
	 * ritorna true se il numero è pari sennò da false
	 * 
	 * 
	 * 
	 */
	
	public boolean even (int numero1) {
		
	boolean isPari = false;	
		if (numero1 % 2 == 0)
			isPari = true;
			
		return isPari;
	}
	
	
	
	public boolean even2 (int numero1) {
		
			return numero1 % 2 == 0;
		}
	
	
	/*
	 * creare una funzione che prenda in ingresso una stringa
	 * e ritorni il numero di lettere a che contiene la stringa
	 * 
	 * 
	 */
	
	public int contLettereA (String parola) {
		
		int cont = 0;
		
		for (int i = 0; i < parola.length(); i++) {
			if (parola.charAt(i) == 'a')
				cont++;
		}
		
		return cont;
	}
	
	
	/*
	 * creare una funzione che prende in ingresso un vettore di interi
	 * e restituisce il vettore di interi dove ogni elemento è moltiplicato per 2
	 * 
	 * 
	 */
	
	
	public int[] vettPerDue (int[] vett) {
		
		int[] vettRis = new int [vett.length];
		
		for (int i = 0; i < vett.length; i++) {
			
			vettRis[i] = vett[i] * 2;
		}
		
			return vettRis;
			
	}
	
	
	public void stampaVettore (int [] vett) {
		
		for (int i = 0; i < vett.length; i++) {
			System.out.println(vett[i] + " ");
		}
	}
	
	
	
}
