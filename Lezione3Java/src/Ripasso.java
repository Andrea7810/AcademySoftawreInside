import java.util.Random;
import java.util.Scanner;

public class Ripasso {

	public static void main(String[] args) {

		int num1 = 1000;
		long num2 = num1;
		
		//byte short int long
		//in questo caso non abbiamo problemi dato che i long 
		//possono contenere int
		
		byte num3 = (byte) num1;
		
		System.out.println(num3);
		
		//CASTING
		
		double mySaldo = 9.99;
		
		int esempio = (int) mySaldo;
		//tipoDiDato nomeVariabile = (tipo di dato) nome altra variabile
		
		System.out.println(esempio);
		
		/* 
		 * DATI PRIMITIVI: INTERI
		 * 				   VIRGOLA MOBILE
		 *                 CHAR
		 *                 BOOLEAN
		 * 
		 * 
		 * 
		 * NON PRIMITIVI:  SCANNER
		 *                 STRING
		 *                 RANDOM
		 * 
		 * 
		 * esempi:
		 * 
		 */
		
		Random ciao = new Random();
		
		//NomeClasse nomeVariabile = new NomeClasse();
		
		Scanner pluto = new Scanner(System.in);
		
		
			
		
		
	}

}
