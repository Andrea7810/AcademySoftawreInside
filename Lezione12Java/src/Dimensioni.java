
public class Dimensioni {

	
	private double larghezza , lunghezza;
	
	
	public Dimensioni (double larghezza , double lunghezza) {
		
		setLarghezza(larghezza);
		setLunghezza(lunghezza);
		
	}
	
	
	public Dimensioni () {
		
		this(13.5 , 5.7);
	}
	
	
	@Override
	public String toString () {
		
		return "Lunghezza: " + this.lunghezza + " Larghezza: " + this.larghezza + " " + "AREA: " + calcolaArea();
	}
	
	
	
	
	//metodi set
	
	
	
	public void setLarghezza (double larghezza) {
		
		if(larghezza <= 0)
			this.larghezza = - larghezza;
		else
			this.larghezza = larghezza;
	}
	
	
	
	public void setLunghezza (double lunghezza) {
		
		if(lunghezza <= 0)
			this.lunghezza = - lunghezza;
		else
			this.lunghezza = lunghezza;
	}
	


	//metodi get
	
	
	
	public double getLarghezza () {
		
		return this.larghezza;
	}
	
	
	
	public double getLunghezza () {
		
		
		return this.lunghezza;
	}
	
	
	
	
	
	public double calcolaArea () {
		
		double area = lunghezza * larghezza;
		
		return area;
	}
	
	
	
	
	
	
}
