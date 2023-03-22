package it.softwareInside.Esercizio2;

public class Scimmia extends Animale {

	
	public Scimmia () {
		
		this("Nera", 8, 'M');
	}
	
	
	
	
	
	
	public Scimmia (String colore , int eta , char sesso) {
		
		super(colore, eta, sesso);
	}
	
	
	@Override
	public String toString () {
		
		return "Scimmia: " + super.toString();
	}
	
	
	
	
	
	
	
	@Override
	public void saluta () {
		System.out.println("uauaua");
	}
	
	
	
	
}
