package it.softwareInside.Esercizio2;

import java.util.Random;

public class Animale {

	
	private String colore;
	private int eta;
	private char sesso;
	
	
	
	public Animale (String colore, int eta , char sesso) {
		
		setColore(colore);
		setEta(eta);
		setSesso(sesso);
	}
	
	
	public Animale () {
		
		this("bianco", 10, 'M');
	}
	
	
	
	@Override
	public String toString () {
		
		return "Colore: " + this.colore + " Età: " + this.eta + " Sesso: " + this.sesso;
	}
	
	
	
	
	
	
	
	
	
	//metodi di set
	
	
	public void setColore (String colore) {
		
		this.colore = colore;
	}
	
	
	
	public void setEta (int eta) {
		
		Random random = new Random ();
		
		if (eta < 0 || eta > 50)
			this.eta = random.nextInt(1 , 50);
		else
			this.eta = eta;
	}
	
	
	
	public void setSesso (char sesso) {
		
		Random random = new Random ();
		
		switch (sesso) {
		case 'M':
			this.sesso = sesso;
			break;
			
		case 'F':
			this.sesso = sesso;
			break;
			
		default: this.sesso = random.nextBoolean() ? 'M' : 'F';
			break;
		}
		
		this.sesso = sesso;
	}
	
	
	
	
	
	//metodi di get
	
	
	public String getColore () {
		
		return this.colore;
	}
	
	
	
	public int getEta () {
		
		return this.eta;
	}
	
	
	
	
	public char getSesso () {
		
		return this.sesso;
	}
	
	
	//altri metodi
	
	
	public void saluta () {
		
		System.out.println("Ciao, sono un animale!");
	}
	
	
	
	
}
