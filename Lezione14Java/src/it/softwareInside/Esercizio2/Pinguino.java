package it.softwareInside.Esercizio2;

public class Pinguino extends Animale {

	
	
	public Pinguino () {
	
		this("Bianco e nero", 5, 'M');
	}
	
	
	
	
	public Pinguino (String colore , int eta , char sesso) {
		
		super(colore, eta, sesso);
	}
	
	
	
	@Override
	public String toString () {
		
		return "Pinguino: " + super.toString();
	}
	
	
	
	
	@Override
	public void saluta () {
		System.out.println("Garrito");
	}
	
	
	
}
