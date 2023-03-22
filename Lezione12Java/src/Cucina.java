
public class Cucina {

	private Dimensioni dimensioni;
	private Frigorifero frigorifero;
	
	
	public Cucina (Dimensioni dimensioni , Frigorifero frigorifero) {
		
		setDimensioni(dimensioni);
		setFrigorifero(frigorifero);
		
	}
	
	
	public Cucina () {
		
		this(new Dimensioni (), new Frigorifero ());
	}
	
	
	
	@Override
	public String toString () {
		
		return "Dimensioni: " + this.dimensioni + " Frigorifero: " + this.frigorifero;
	}
	
	
	
	//metodi set
	
	
	public void setDimensioni (Dimensioni dimensioni) {
		
		this.dimensioni = dimensioni;
		
	}
	
	
	
	public void setFrigorifero (Frigorifero frigorifero) {
		
		this.frigorifero = frigorifero;
	}
	
	
	
	
	//metodi get
	
	
	
	
	public Dimensioni getDimensioni () {
		
		return this.dimensioni;
	}
	
	
	
	public Frigorifero getFrigorifero () {
		
		return this.frigorifero;
	}
	
	
	
	
}
