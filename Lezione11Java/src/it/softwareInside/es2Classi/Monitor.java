package it.softwareInside.es2Classi;

public class Monitor {

	private String marca;
	private double pollici , costo;
	
	
	public Monitor () {
		
		setMarca("Samsung");
		setCosto(150);
		setPollici(16.5);
	}
	
	
	public Monitor (String marca , double costo , double pollici) {
		
		setMarca(marca);
		setCosto(costo);
		setPollici(pollici);
		
	}
	
	
	
	
	
	@Override
	public String toString () {
		
		return "Marca: " + this.marca + " Costo: " + this.costo + " Pollici: " + this.pollici ; 
				
	}
	
	
	
	
	//metodi set
	
	public void setMarca (String marca) {
		
		this.marca = marca;
	}
	
	
	public void setPollici (double pollici) {
		
		this.pollici = pollici;
	}
	
	
	public void setCosto (double costo) {
		
		this.costo = costo;
	}
	
	
	
	//metodi get
	
	
	public String getMarca () {
		
		return this.marca;
	}
	
	
	public double getPollici () {
		
		return this.pollici;
	}
	
	
	
	public double getCosto () {
		
		return this.costo;
	}
	
	
	
}
