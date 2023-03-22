
public class Automobile {

	
	private String marca , colore;
	private double costo;
	private int velocita;
	
	
	//costruttore dove si presettano nella classe
	
	public Automobile () {
		
		setMarca("Audi");
		setColore("rosso");
		setCosto(34000);
		setVelocita(100);
	}
	
	
	//altro costruttore dove i dati si inseriscono nel main 
	
	public Automobile (String marca, String colore, double costo , int velocita) {
		
		setColore(colore);
		setCosto(costo);
		setMarca(marca);
		setVelocita(velocita);
		
		
	}
	
	
	
	
	
    @Override	
	public String toString() {
    	
    	return "Marca: " + this.marca + "\nColore: " + this.colore + "\nCosto: " + this.costo + "\nVelocità: " + this.velocita;
    }
	
	
	
    
	//METODI GET
	
	public String getMarca () {
		
		return this.marca;
	}
	
	
	public String getColore () {
		
		return this.colore;
	}
	
	
	public double getCosto () {
		
		return this.costo;
	}
	
	
	public int getVelocita () {
		
		return this.velocita;
	}
	
	
	
	//METODI SET //se inseriamo private non si può cambiare il valore
	
	public void setMarca (String marca) {
		
		this.marca = marca;
	}
	
	
	public void setColore (String colore) {
		
		this.colore = colore;
	}
	
	
	public void setCosto (double costo) {
		
		if (costo > 0)
		    this.costo = costo;
		else 
			this.costo = - costo;
	}
	
	
	public void setVelocita (int velocita) {
		
		if (velocita <= 220)
			this.velocita = velocita;
		else
			this.velocita = 220;
			
	}
	
	
	
	public void frena () {
		
		this.velocita = velocita - 1;
		
	}
	
	
	
	public void accellera () {
		
		this.velocita = velocita + 2;
	}
	
	
}
