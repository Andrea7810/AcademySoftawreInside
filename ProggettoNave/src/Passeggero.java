
public class Passeggero extends Persona {

	
	private String cartaDiImbarco;
	
	
	public Passeggero (String nome , int eta, String cartaDiImbarco) {
		
		super(nome, eta);
		setCartaDiImbarco(cartaDiImbarco);
		
	}
	
	
	public Passeggero () {
		
		this("Giulio" , 27, "A388");
	}
	
	
	@Override
	public String toString () {
		
		return super.toString() + " Carta di Imbarco: " + this.cartaDiImbarco;
	}
	
	
	
	
	//metodi di set
	
	public void setCartaDiImbarco (String cartaDiImbarco) {
		
		this.cartaDiImbarco = cartaDiImbarco;
	}
	
	
	//metodi di get
	
	public String getCartaDiImbarco () {
		
		return this.cartaDiImbarco;
	}
	
	
	
	
}
