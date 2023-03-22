
public class Televisore {

	
	private String marca;
	private double costo , pollici;
	
	
	public Televisore (String marca , double costo, double pollici) {
		
		setCosto(costo);
		setMarca(marca);
		setPollici(pollici);
	}
	
	
	
	public Televisore () {
		
		this("LG" , 435 , 50.5);
	}
	
	
	
	
	
	@Override
	public String toString () {
		
		return "Marca: " + this.marca + " Costo: " + this.costo + " Pollici: " + this.pollici;

	}
	
	
	
	
	
	
	//metodi set
	
	public void setMarca (String marca) {
		
		this.marca = marca;
	}
	
	
	
	public void setCosto (double costo) {
		
		if (costo <= 0)
			this.costo = - costo;
		else
			this.costo = costo;
	}
	
	
	
	
	public void setPollici (double pollici) {
		
		if (pollici > 100)
			this.pollici = 50;
		else
			this.pollici = pollici;
	}
	
	
	
	
	//metodi get
	
	
	public String getMarca () {
		
		return this.marca;
	}
	
	
	
	
	public double getCosto () {
		
		return this.costo;
	}
	
	
	
	public double getPollici () {
		
		return this.pollici;
	}
	
	
	
}
