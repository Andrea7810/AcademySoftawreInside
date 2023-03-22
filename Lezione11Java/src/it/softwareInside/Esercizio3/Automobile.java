package it.softwareInside.Esercizio3;

public class Automobile {

	
	private String marca;
	private double costo;
	private Carrozzeria carrozzeria;
	private Motore motore;
	
	
	public Automobile () {
		
		setMarca("Audi");
		setCosto(30500);
		setMotore(new Motore());
		setCarrozzeria(new Carrozzeria());
	}
	
	
	public Automobile (String marca, double costo , Motore motore, Carrozzeria carrozzeria) {
		
		setMotore(motore);
		setCarrozzeria(carrozzeria);
		setMarca(marca);
		setCosto(costo);
			
	}
	
	
	@Override
	public String toString () {
		
		return "Marca: " + this.marca + " Costo: " + this.costo + " Motore: " + this.motore + " Carrozzeria: " + this.carrozzeria;
	}
	
	
	
	
	
	
	//metodi set
	
	public void setMarca (String marca) {
		
		this.marca = marca;
		
	}
	
	
	public void setCosto (double costo) {
		
		this.costo = costo;
	}
	
	
	public void setCarrozzeria (Carrozzeria carrozzeria)  {
		
		this.carrozzeria = carrozzeria;
	}
	
	
	
	public void setMotore (Motore motore) {
		
		this.motore = motore;
	}
	
	
	
	
	
	//metodi get
	
	
	public String getMarca () {
		
		return this.marca;
	}
	
	
	public double getCosto () {
		
		return this.costo;
	}
	
	
	
	public Carrozzeria getCarrozzeria () {
		
		return this.carrozzeria;
	}
	
	
	
	public Motore getMotore () {
		
		return this.motore;
	}
	
}
