import java.util.Random;

public class Dvd {

	private String titolo , genere;
	private double costo;
	private boolean isFamilyFriendly;
	
	
	
	public Dvd () {
		
		setTitolo(generaTitolo());
		setGenere(generaGenere());
		setCosto(generaCosto());
		setIsFamilyFriendly(generaIsFamilyFriendly());
		
		
	}
	
	public Dvd (String titolo,String genere, double costo, boolean isFamilyFriendly) {
		
		setTitolo(titolo);
		setCosto(costo);
		setGenere(genere);
		setIsFamilyFriendly(isFamilyFriendly);
		
		
	}
	

	
	
	
	
	
	@Override
	public String toString () {
		return "Titolo: " + this.titolo + "   Genere: " + this.genere + "   Costo: " + this.costo + "   Family friendly: " + this.isFamilyFriendly;
	}
	
	
	
	
	
	//METODI DI GET
	
	public String getTitolo () {
		return this.titolo;
	}
	
	
	public String getGenere () {
		return this.genere;
	}
	
	
	public double getCosto () {
		return this.costo;
	}
	
	
	public boolean IsFamilyFriendly () {
		return this.isFamilyFriendly;
	}
	
	
	
	
	//METODI DI SET
	
	
	public void setTitolo (String titolo) {
		this.titolo = titolo;
	}
	
	
	public void setGenere (String genere) {
		this.genere = genere;
	}
	
	
	public void setCosto (double costo) {
		this.costo = costo;
	}
	
	
	public void setIsFamilyFriendly (boolean isFamilyFriendly) {
		this.isFamilyFriendly = isFamilyFriendly;
	}
	
	
	
	
	
	
	
	public String generaTitolo () {
		
		Random casuale = new Random ();
		
		String [] vettore = { "Ritorno Al Futuro" , "Diabolik" , "Jurassic World" , "Fast and Furios" , "It"};
		String TitUscito = vettore[casuale.nextInt(0, vettore.length)];
		
		return TitUscito;
	}
	
	
	
	public String generaGenere () {
		
		Random casuale = new Random ();
		
		
		String [] vettore = { "Azione" , "Avventura" , "Fantascienza" , "Horror" };
		
		String genUscito = vettore[casuale.nextInt(0, vettore.length)];
			
		
		
		return genUscito;
	}
	
	
	
	public double generaCosto () {
		
		Random casuale = new Random ();
		
		double CostoUscito = casuale.nextDouble(10.00 , 70.00);
		return CostoUscito;
		
	}
	
	
	
	public boolean generaIsFamilyFriendly () {
		
		Random casuale = new Random ();
		
		boolean ris = casuale.nextBoolean();
		
		return ris;
		
	}
	
	
	
}
