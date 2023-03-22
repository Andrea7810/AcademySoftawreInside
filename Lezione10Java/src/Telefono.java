
public class Telefono {

	private String marca , modello;
	private int costo;
	private boolean isDualSim;
	
	
	public Telefono () {
		
		setMarca("Samsung");
		setModello("A55");
		setCosto(costo);
		setIsDualSim(true);
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		
		return "Marca: " + this.marca + "\nModello: " + this.modello + "\nCosto: " + this.costo + "\nE' con doppia sim? " + this.isDualSim;
	}
	
	
	
	
	//MODELLI SET
	
	

	public void setMarca (String marca) {
		
		this.marca = marca;
	}
	
	
	public void setModello (String modello) {
		
		this.modello = modello;
	}
	
	
	public void setCosto (int costo) {
		
		if (costo > 0)
			this.costo = costo;
		else
			this.costo = - costo;
	}
	
	
	public void setIsDualSim (boolean isDualSim) {
		
		this.isDualSim = isDualSim;
	}
	
	
	
	
	
	
	
	
	
	
	//MODELLI GET
	
	public String getMarca () {
		
		return this.marca;
	}
	
	
	public String getModello () {
		
		return this.modello;
	}
	
	
	
	public int getCosto () {
		
		return this.costo;
	}
	
	
	
	public boolean getIsDualSim () {
		
		return this.isDualSim;
	}
	
	
	
	
}
