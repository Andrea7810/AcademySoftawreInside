
public class Libro {

	
	private String titolo;
	private String autore;
	private String genere;
	private double prezzo;
	private int numPagine;
	
	
	@Override
	public String toString() {
		
		return "Titolo : " + this.titolo + "\nAutore: " + this.autore + "\nGenere: " + this.genere + "\nNumero di Pagine: " + this.numPagine + "\nPrezzo: " + this.prezzo;
	}
	
	
	
	
	//METODI DI GETTING
	
 	public String getTitolo () {
		
		return this.titolo;
	}
	
	
	public String getAutore () {
		
		return this.autore;
	}
	
	
	public String getGenere () {

		
		

		
		
		
		
		return this.genere;
	}

	
	public double getPrezzo () {
		
		return this.prezzo;
	}
	
	
	public int getNumPagine () {
		
		return this.numPagine;
	}
	
	
	
	
	
	
	
	//METODI DI SETTING
	
	
	public void setTitolo (String titolo) {
		
		 this.titolo = titolo;
	}
	
	
	public void setAutore (String autore) {
		
		this.autore = autore;
	}
	
	
	public void setGenere (String genere) {
		
		this.genere = genere;
	}
	
	
	public void setPrezzo (double prezzo) {
		
		if (prezzo > 10)
			this.prezzo = prezzo;
		else
			this.prezzo = 10;
	}
	
	
	public void setNumPagine (int numPagine) {
		
		if (numPagine > 0)
			this.numPagine = numPagine;
		else 
			this.numPagine = - numPagine;
	}
	
	
	
}