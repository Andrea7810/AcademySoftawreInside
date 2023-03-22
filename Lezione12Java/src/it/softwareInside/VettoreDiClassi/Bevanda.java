package it.softwareInside.VettoreDiClassi;

public class Bevanda {

	
	private double costo , capienza;
	private boolean isAlcoholic;
	private String nome;
	
	
	public Bevanda (String nome , double costo , double capienza , boolean isAlcoholic) {
		
		setCapienza(capienza);
		setCosto(costo);
		setNome(nome);
		isAlcoholic(isAlcoholic);
	}
	
	
	public Bevanda () {
		
		this("Pepsi", 1.25, 0.33, false);
	}
	
	
	@Override
	public String toString () {
		
		String ris;
		
		if (isAlcoholic)
			ris = "Si";
		else
			ris = "No";
		
		
		
		return "Nome: " + this.nome + " Costo: " + this.costo + " Capienza: " + this.capienza + " E' Alcolica? " + ris;
	}
	
	
	
	
	
	
	
	//metodi di set
	
	
	public void setNome (String nome) {
		
		this.nome = nome;
	}
	
	
	
	public void isAlcoholic (boolean isAlcoholic) {
		
		this.isAlcoholic = isAlcoholic;
	}
	
	
	
	public void setCosto (double costo) {
		
		if (costo <= 0)
			this.costo = 0.80;
		else
			this.costo = costo;
	}
	
	
	
	public void setCapienza (double capienza) {
		
		if (capienza == 0.33) 
			this.capienza = capienza;
		else if (capienza == 0.66)
			this.capienza = capienza;
		else
			this.capienza = 0.33;
		
		this.capienza = capienza;
	}
	
	
	
	//metodi di get
	
	
	public String getNome () {
		
		return this.nome;
	}
	
	
	
	public double getCosto () {
		
		return this.costo;
	}
	
	
	
	public double getCapienza () {
		
		return this.capienza;
	}
	
	
	public boolean isAlcoholic () {
		
		return this.isAlcoholic;
	}
	
	
}
