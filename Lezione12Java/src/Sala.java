
public class Sala {

	
	private Televisore televisore;
	private Dimensioni dimensioni;
	
	
	public Sala (Televisore televisore , Dimensioni dimensioni) {
		
		setDimensioni(dimensioni);
		setTelevisore(televisore);
		
	}
	
	
	public Sala () {
		
		this(new Televisore (), new Dimensioni ());
	}
	
	
	@Override
	public String toString () {
		
		return "Televisore: " + this.televisore + " Dimensioni: " + this.dimensioni;
	}
	
	
	
	
	//metodi set
	
	
	public void setTelevisore (Televisore televisore) {
		
		this.televisore = televisore;
	}
	
	
	
	public void setDimensioni (Dimensioni dimensioni) {
		
		this.dimensioni = dimensioni;
	}
	
	
	
	
	//metodi get
	
	
	public Televisore getTelevisore () {
		
		return this.televisore;
	}
	
	
	public Dimensioni getDimensioni () {
		
		return this.dimensioni;
	}
	
	
	
	
}
