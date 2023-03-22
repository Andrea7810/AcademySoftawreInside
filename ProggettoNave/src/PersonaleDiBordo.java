
public class PersonaleDiBordo extends Persona {

	
	
	private String mansione;
	
	
	public PersonaleDiBordo (String nome , int eta, String mansione) {
		
		super(nome, eta);
		setMansione(mansione);
		
	}
	
	public PersonaleDiBordo () {
		
		this("Luigi", 34 , "Addetto alla sicurezza");
	}
	
	
	@Override
	public String toString () {
		
		return super.toString() + " Mansione: " + this.mansione;
	}
	
	
	
	
	//metodi di set
	
	public void setMansione (String mansione) {
		
		this.mansione = mansione;
	}
	
	
	
	//metodi di get
	
	public String getMansione () {
		
		return this.mansione;
	}
	
	
	
}
