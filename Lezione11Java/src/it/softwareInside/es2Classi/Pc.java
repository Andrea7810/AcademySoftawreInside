package it.softwareInside.es2Classi;

public class Pc {

	private double costo;
	private String marca;
	private Monitor monitor;
	
	
	public Pc () {
		
		setCosto(550.15);
		setMarca("Acer");
		setMonitor(new Monitor());
		
	}
	
	
	public Pc (String marca, double costo , Monitor monitor) {
		
		setCosto(costo);
		setMarca(marca);
		setMonitor(monitor);
	}
	
	
	
	
	@Override
	public String toString () {
		
		return "Marca: " + this.marca + " Costo: " + this.costo + " Monitor: " + this.monitor;
	}
	
	
	
	
	//metodi set
	
	
	public void setCosto (double costo) {
		
		this.costo = costo;
	}
	
	
	public void setMarca (String marca) {
		
		this.marca = marca;
	}
	
	
	
	public void setMonitor (Monitor monitor) {
		
		this.monitor = monitor;
	}
	
	
	
	
	//metodi get
	
	
	public double getCosto () {
		
		return this.costo;
	}
	
	
	
	public String getMarca () {
		
		return this.marca;
	}
	
	
	
	
	public Monitor getMonitor () {
		
		return this.monitor;
	}
	
}
