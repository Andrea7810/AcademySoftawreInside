package it.softwareInside.object;

public class StarterFunzioni {

	public static void main(String[] args) {

		EserciziFunzioni obj = new EserciziFunzioni();
		
		int ris = obj.somma(3, 5);
		
		System.out.println(ris);
		
		
		
		int ris2 = obj.doppio(2);
		
		System.out.println(ris2);
		
		
		boolean risultato = obj.even(9);
		System.out.println(risultato);
		
		
		int risultato3 = obj.contLettereA("pala");
		System.out.println(risultato3);
		
		
		
		int[] vettDiNumeri = { 10 , 2 ,5};
		int [] ris4 = obj.vettPerDue(vettDiNumeri);
		
		for (int i = 0; i < ris4.length; i++) {
			
			System.out.println(ris4[i] + " ");
		}
		
		
		obj.stampaVettore(vettDiNumeri);
		obj.stampaVettore(ris4);
	}
    
}
