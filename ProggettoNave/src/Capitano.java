
public class Capitano extends Persona {

	
	private int exp;
	
	
	public Capitano (String nome , int eta , int exp) {
		
		super(nome, eta);
		setExp(exp);
	}
	
	public Capitano () {
		
		this("Giorgio", 45, 10);
	}
	
	
	@Override
	public String toString () {
		
		return super.toString() + " Anni di Esperienza: " + this.exp;
	}
	
	
	
	
	//metodi di set
	
	public void setExp (int exp) {
		
		if (exp < 0 || exp > 50 )
			this.exp = 1;
		else
			this.exp = exp;
	}
	
	
	//metodi di get
	
	public int getExp () {
		
		return this.exp;
	}
	
	
}
