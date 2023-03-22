package it.softwareInside.Esercizio2;

public class Leone extends Animale {

	
	public Leone () {
		
		this("Marrone", 15, 'F');
	}
	
	
	public Leone (String colore , int eta , char sesso) {
		
		super(colore, eta, sesso);
	}
	
	
	@Override
	public String toString () {
		
		return "Leone: " + super.toString();
	}
	
	
	
	
	
	
	@Override
	public void saluta () {
		System.out.println("Ruggito");
	}
	
	
	
}
