package it.softwareInside.operatoreInstanceOf;

import java.util.ArrayList;

public class Starter {

	public static void main(String[] args) {

		ArrayList<Persona> personeABordo = new ArrayList<>();
		
		
		personeABordo.add( new Persona());
		personeABordo.add( new Capitano());
		personeABordo.add(new PersonaleDiBordo());
		personeABordo.add(new Passeggero());
		
		
		/* come faccio a capire se a una poszione è presente
		 * un object preciso
		 * 
		 * si usa instance of
		 * 
		 * object instanceof Classe
		 */
		
		
		System.out.println(personeABordo.get(1) instanceof Capitano);
		System.out.println(personeABordo.get(0) instanceof Capitano);

		
		//capire se in questo array c'è almeno un capitano
		
		
		for (Persona persona : personeABordo)
			if ( persona instanceof Capitano) {
				
				System.out.println("Ok c'è un capitano");
				System.out.println(persona);
			}
		
		
	}

}
