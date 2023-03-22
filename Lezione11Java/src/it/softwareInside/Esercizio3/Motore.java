package it.softwareInside.Esercizio3;

public class Motore {

	
	private int numeroCavalli;
	private String alimentazione;
	
	
	
	public Motore () {
		
		setAlimentazione("benzina");
		setNumeroCavalli(130);
	}
	
	
	public Motore (int numeroCavalli , String alimentazione) {
		
		setAlimentazione(alimentazione);
		setNumeroCavalli(numeroCavalli);
	}
	
	
	@Override
	public String toString () {
		
		return "Alimentazione: " + this.alimentazione + " Numero di cavalli: " + this.numeroCavalli;
	}
	
	
	
	
	//metodi di set
	
	
	public void setNumeroCavalli (int numeroCavalli) {
		
		this.numeroCavalli = numeroCavalli;
	}
	
	
	public void setAlimentazione (String alimentazione) {
		
		this.alimentazione = alimentazione;
	}
	
	
	//metodi di get
	
	public int getNumeroCavalli () {
		
		return this.numeroCavalli;
	}
	
	
	public String getAlimentazione () {
		
		return this.alimentazione;
	}
	
	
}
