import java.util.ArrayList;
import java.util.Scanner;

public class RipassoArrayList {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		ArrayList<Integer> myArr1 = new ArrayList<>();
		
		myArr1.add(10);
		myArr1.add(20);
		myArr1.add(2, 5);
		
		for (int interi : myArr1)
			System.out.println(interi);
		
		
		try {
			
			System.out.println("Inserisci un numero compreso tra 0 e " + (myArr1.size() - 1));
			
			myArr1.get(key.nextInt());
			
		} catch (Exception e) {

			System.out.println("\n");
		
			System.out.println(e);
			
			main(args);
		}
		
		
		
		System.out.println("##########");
		
		for (int numero : myArr1)
			System.out.println(numero);
		
		
		key.close();
		
	}

}
