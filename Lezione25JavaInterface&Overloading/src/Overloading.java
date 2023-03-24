
public class Overloading {

	//concetto di Overloading
	//Overloading è il sovraccarico dei metodi
	//diverso dall'overriding che è la sovrascrittura dei metodi.
	
	
	public int calcolaSomma  (int num1 , int num2 ) {
		
		return num1 + num2;
	}
	
	
	
	public int calcolaSomma (int num1 , int num2 , int num3) {
		
		return num1 + num2 + num3;
	}
	
	
	
	public int calcolaSomma (String nome) {
		
		return nome.length();
	}
	
	
	//l'overloading si verifica quando ci sono più metodi con stesso nome ma con parametri diversi
	
	//la signature di un metodo è il nome di un metodo e i parametri in ingresso.
	
	//il tipo di ritorno di un metodo non influisce sulla signature.
	
	
	public static void main(String[] args) {

		Overloading start = new Overloading();
		
		System.out.println( start.calcolaSomma(1, 3));      
		                                                         //sono 2 metodi diversi ma con nomi uguali, overloading
		System.out.println( start.calcolaSomma(2, 10, 3));   
		
		
		
	}

}
