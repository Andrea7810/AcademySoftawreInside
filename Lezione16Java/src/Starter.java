import java.util.ArrayList;

public class Starter {

	public static void main(String[] args) {

		
		FunzioneArrayList funzioni1 = new FunzioneArrayList();
		
		ArrayList<Integer> myArr1 = new ArrayList<>();
		
		myArr1.add(10);
		myArr1.add(13);
		myArr1.add(20);
		myArr1.add(35);
		myArr1.add(19);

		
		System.out.println(	funzioni1.sommaMultipli(5, myArr1));
		
		System.out.println("@@@@@@@@@@@@@@@@@@");
		
		ArrayList<Double> myArr2 = new ArrayList<>();

		myArr2.add(2.0);
		myArr2.add(6.3);
		myArr2.add(3.5);
		
		
		
		System.out.println(funzioni1.prodottoDouble(myArr2));		
		
		System.out.println("@@@@@@@@@@@@@@");
		
		ArrayList<Integer> myArr3 = new ArrayList<>();
		
		myArr3.add(10);
		myArr3.add(12);
		myArr3.add(20);
		myArr3.add(37);
		
		System.out.println( funzioni1.areAllEven(myArr3));
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@");
		
		ArrayList<Double> myArr4 = new ArrayList<>();
		
		myArr4.add(4.5);
		myArr4.add(3.0);
		myArr4.add(100.5);
		myArr4.add(55.0);
		
		System.out.println( funzioni1.moltiplicaElementiPerNumero(0.50, myArr4));
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@\n");
		
		
		boolean a = funzioni1.isPrime(6);
		System.out.println(a);

		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		
		ArrayList<Integer> myArr5 = new ArrayList<>();
		
		myArr5.add(13);
		myArr5.add(5);
		myArr5.add(7);
		
		
		System.out.println(funzioni1.areAllPrime(myArr5));
		
		
		
	}

}
