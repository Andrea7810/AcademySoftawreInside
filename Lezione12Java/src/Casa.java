
public class Casa {

	
	private Cucina cucina;
	private Sala sala;
	
	
	public Casa (Cucina cucina , Sala sala) {
		
		setCucina(cucina);
		setSala(sala);
	}
	
	
	public Casa () {
		
		this(new Cucina () , new Sala ());
	}
	
	
	@Override
	public String toString () {
		
		return "CASA = CUCINA: " + this.cucina + " SALA: " + this.sala;
	}
	
	
	
	
	//metodi set
	
	
	public void setCucina (Cucina cucina) {
		
		this.cucina = cucina;
	}
	
	
	
	public void setSala (Sala sala) {
		
		this.sala = sala;
	}
	
	
	
	
	//Metodi get
	
	
	public Cucina getCucina () {
		
		return this.cucina;
	}
	
	
	
	public Sala getSala () {
		
		return this.sala;
	}
	
	
	
	
	public double calcoloAreaCasa () {
		
		
		double areaSala = sala.getDimensioni().calcolaArea();
		double areaCucina = cucina.getDimensioni().calcolaArea();
		
		double areaTot = areaSala + areaCucina;
		
		
		return areaTot;
	}
	
	
}
